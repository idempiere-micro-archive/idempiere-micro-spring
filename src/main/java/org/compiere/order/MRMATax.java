package org.compiere.order;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.logging.Level;
import org.compiere.model.I_C_Tax;
import org.compiere.model.I_M_RMALine;
import org.compiere.model.I_M_RMATax;
import org.compiere.tax.MTax;
import org.idempiere.common.util.CLogger;
import org.idempiere.common.util.DB;
import org.idempiere.common.util.Env;
import org.idempiere.icommon.model.IPO;

/** @author Elaine */
public class MRMATax extends X_M_RMATax implements I_M_RMATax {
  /** */
  private static final long serialVersionUID = -8702466449639865049L;

  /**
   * Get Tax Line for RMA Line
   *
   * @param line RMA line
   * @param precision currency precision
   * @param oldTax get old tax
   * @param trxName transaction
   * @return existing or new tax
   */
  public static MRMATax get(I_M_RMALine line, int precision, boolean oldTax, String trxName) {
    MRMATax retValue = null;
    if (line == null || line.getM_RMA_ID() == 0) {
      s_log.fine("No RMA");
      return null;
    }
    int C_Tax_ID = line.getC_Tax_ID();
    boolean isOldTax = oldTax && line.is_ValueChanged(MRMATax.COLUMNNAME_C_Tax_ID);
    if (isOldTax) {
      Object old = line.get_ValueOld(MRMATax.COLUMNNAME_C_Tax_ID);
      if (old == null) {
        s_log.fine("No Old Tax");
        return null;
      }
      C_Tax_ID = ((Integer) old).intValue();
    }
    if (C_Tax_ID == 0) {
      s_log.fine("No Tax");
      return null;
    }

    String sql = "SELECT * FROM M_RMATax WHERE M_RMA_ID=? AND C_Tax_ID=?";
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try {
      pstmt = DB.prepareStatement(sql, trxName);
      pstmt.setInt(1, line.getM_RMA_ID());
      pstmt.setInt(2, C_Tax_ID);
      rs = pstmt.executeQuery();
      if (rs.next()) retValue = new MRMATax(line.getCtx(), rs, trxName);
    } catch (Exception e) {
      s_log.log(Level.SEVERE, sql, e);
    } finally {
      DB.close(rs, pstmt);
      rs = null;
      pstmt = null;
    }
    if (retValue != null) {
      retValue.setPrecision(precision);
      retValue.set_TrxName(trxName);
      if (s_log.isLoggable(Level.FINE)) s_log.fine("(old=" + oldTax + ") " + retValue);
      return retValue;
    }
    // If the old tax was required and there is no MOrderTax for that
    // return null, and not create another MOrderTax - teo_sarca [ 1583825 ]
    else {
      if (isOldTax) return null;
    }

    //	Create New
    retValue = new MRMATax(line.getCtx(), 0, trxName);
    retValue.set_TrxName(trxName);
    retValue.setClientOrg(line);
    retValue.setM_RMA_ID(line.getM_RMA_ID());
    retValue.setC_Tax_ID(line.getC_Tax_ID());
    retValue.setPrecision(precision);
    retValue.setIsTaxIncluded(line.getParent().isTaxIncluded());
    if (s_log.isLoggable(Level.FINE)) s_log.fine("(new) " + retValue);
    return retValue;
  }

  /** Static Logger */
  private static CLogger s_log = CLogger.getCLogger(MRMATax.class);

  /**
   * ************************************************************************ Persistence
   * Constructor
   *
   * @param ctx context
   * @param ignored ignored
   * @param trxName transaction
   */
  public MRMATax(Properties ctx, int ignored, String trxName) {
    super(ctx, 0, trxName);
    if (ignored != 0) throw new IllegalArgumentException("Multi-Key");
    setTaxAmt(Env.ZERO);
    setTaxBaseAmt(Env.ZERO);
    setIsTaxIncluded(false);
  }

  /**
   * Load Constructor. Set Precision and TaxIncluded for tax calculations!
   *
   * @param ctx context
   * @param rs result set
   * @param trxName transaction
   */
  public MRMATax(Properties ctx, ResultSet rs, String trxName) {
    super(ctx, rs, trxName);
  }

  /** Tax */
  private MTax m_tax = null;
  /** Cached Precision */
  private Integer m_precision = null;

  /**
   * Get Precision
   *
   * @return Returns the precision or 2
   */
  private int getPrecision() {
    if (m_precision == null) return 2;
    return m_precision.intValue();
  } //	getPrecision

  /**
   * Set Precision
   *
   * @param precision The precision to set.
   */
  protected void setPrecision(int precision) {
    m_precision = new Integer(precision);
  } //	setPrecision

  /**
   * Get Tax
   *
   * @return tax
   */
  public I_C_Tax getTax() {
    if (m_tax == null) m_tax = MTax.get(getCtx(), getC_Tax_ID());
    return m_tax;
  } //	getTax

  /**
   * ************************************************************************ Calculate/Set Tax Amt
   * from Order Lines
   *
   * @return true if calculated
   */
  public boolean calculateTaxFromLines() {
    BigDecimal taxBaseAmt = Env.ZERO;
    BigDecimal taxAmt = Env.ZERO;
    //
    boolean documentLevel = getTax().isDocumentLevel();
    I_C_Tax tax = getTax();
    //
    String sql = "SELECT LineNetAmt FROM M_RMALine WHERE M_RMA_ID=? AND C_Tax_ID=?";
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try {
      pstmt = DB.prepareStatement(sql, get_TrxName());
      pstmt.setInt(1, getM_RMA_ID());
      pstmt.setInt(2, getC_Tax_ID());
      rs = pstmt.executeQuery();
      while (rs.next()) {
        BigDecimal baseAmt = rs.getBigDecimal(1);
        taxBaseAmt = taxBaseAmt.add(baseAmt);
        //
        if (!documentLevel) // calculate line tax
        taxAmt = taxAmt.add(tax.calculateTax(baseAmt, isTaxIncluded(), getPrecision()));
      }
    } catch (Exception e) {
      log.log(Level.SEVERE, get_TrxName(), e);
      taxBaseAmt = null;
    } finally {
      DB.close(rs, pstmt);
      rs = null;
      pstmt = null;
    }
    //
    if (taxBaseAmt == null) return false;

    //	Calculate Tax
    if (documentLevel) //	document level
    taxAmt = tax.calculateTax(taxBaseAmt, isTaxIncluded(), getPrecision());
    setTaxAmt(taxAmt);

    //	Set Base
    if (isTaxIncluded()) setTaxBaseAmt(taxBaseAmt.subtract(taxAmt));
    else setTaxBaseAmt(taxBaseAmt);
    if (log.isLoggable(Level.FINE)) log.fine(toString());
    return true;
  } //	calculateTaxFromLines

  /**
   * String Representation
   *
   * @return info
   */
  public String toString() {
    StringBuffer sb =
        new StringBuffer("MRMATax[")
            .append("M_RMA_ID=")
            .append(getM_RMA_ID())
            .append(", C_Tax_ID=")
            .append(getC_Tax_ID())
            .append(", Base=")
            .append(getTaxBaseAmt())
            .append(", Tax=")
            .append(getTaxAmt())
            .append("]");
    return sb.toString();
  } //	toString

  protected void setClientOrg(IPO po) {
    super.setClientOrg(po);
  }
}
