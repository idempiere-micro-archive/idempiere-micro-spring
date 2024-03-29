package org.compiere.accounting;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.invoicing.MInvoice;
import org.idempiere.common.util.DB;
import org.idempiere.common.util.Env;

/**
 * Payment Selection Line Model
 *
 * @author Jorg Janke
 * @version $Id: MPaySelectionLine.java,v 1.3 2006/07/30 00:51:03 jjanke Exp $
 */
public class MPaySelectionLine extends X_C_PaySelectionLine {
  /** */
  private static final long serialVersionUID = -1880961891234637133L;

  /**
   * Standard Constructor
   *
   * @param ctx context
   * @param C_PaySelectionLine_ID id
   * @param trxName transaction
   */
  public MPaySelectionLine(Properties ctx, int C_PaySelectionLine_ID, String trxName) {
    super(ctx, C_PaySelectionLine_ID, trxName);
    if (C_PaySelectionLine_ID == 0) {
      //	setC_PaySelection_ID (0);
      //	setPaymentRule (null);	// S
      //	setLine (0);	// @SQL=SELECT NVL(MAX(Line),0)+10 AS DefaultValue FROM C_PaySelectionLine
      // WHERE C_PaySelection_ID=@C_PaySelection_ID@
      //	setC_Invoice_ID (0);
      setIsSOTrx(false);
      setOpenAmt(Env.ZERO);
      setPayAmt(Env.ZERO);
      setDiscountAmt(Env.ZERO);
      setWriteOffAmt(Env.ZERO);
      setDifferenceAmt(Env.ZERO);
      setIsManual(false);
    }
  } //	MPaySelectionLine

  /**
   * Load Constructor
   *
   * @param ctx context
   * @param rs result set
   * @param trxName transaction
   */
  public MPaySelectionLine(Properties ctx, ResultSet rs, String trxName) {
    super(ctx, rs, trxName);
  } //	MPaySelectionLine

  /**
   * Parent Constructor
   *
   * @param ps parent
   * @param Line line
   * @param PaymentRule payment rule
   */
  public MPaySelectionLine(MPaySelection ps, int Line, String PaymentRule) {
    this(ps.getCtx(), 0, ps.get_TrxName());
    setClientOrg(ps);
    setC_PaySelection_ID(ps.getC_PaySelection_ID());
    setLine(Line);
    setPaymentRule(PaymentRule);
  } //	MPaySelectionLine

  /** Invoice */
  private MInvoice m_invoice = null;

  /**
   * Set Invoice Info
   *
   * @param C_Invoice_ID invoice
   * @param isSOTrx sales trx
   * @param PayAmt payment
   * @param OpenAmt open
   * @param DiscountAmt discount
   */
  public void xsetInvoice(
      int C_Invoice_ID,
      boolean isSOTrx,
      BigDecimal OpenAmt,
      BigDecimal PayAmt,
      BigDecimal DiscountAmt) {
    setInvoice(C_Invoice_ID, isSOTrx, OpenAmt, PayAmt, DiscountAmt, Env.ZERO);
  } //	setInvoive

  /**
   * Set Invoice Info
   *
   * @param C_Invoice_ID invoice
   * @param isSOTrx sales trx
   * @param PayAmt payment
   * @param OpenAmt open
   * @param DiscountAmt discount
   * @param WriteOffAmt writeoff
   */
  public void setInvoice(
      int C_Invoice_ID,
      boolean isSOTrx,
      BigDecimal OpenAmt,
      BigDecimal PayAmt,
      BigDecimal DiscountAmt,
      BigDecimal WriteOffAmt) {
    setC_Invoice_ID(C_Invoice_ID);
    setIsSOTrx(isSOTrx);
    setOpenAmt(OpenAmt);
    setPayAmt(PayAmt);
    setDiscountAmt(DiscountAmt);
    setWriteOffAmt(WriteOffAmt);
    setDifferenceAmt(OpenAmt.subtract(PayAmt).subtract(DiscountAmt).subtract(WriteOffAmt));
  } //	setInvoice

  /**
   * Get Invoice
   *
   * @return invoice
   */
  public MInvoice getInvoice() {
    if (m_invoice == null) m_invoice = new MInvoice(getCtx(), getC_Invoice_ID(), get_TrxName());
    return m_invoice;
  } //	getInvoice

  /**
   * Before Save
   *
   * @param newRecord new
   * @return true
   */
  protected boolean beforeSave(boolean newRecord) {
    setDifferenceAmt(
        getOpenAmt().subtract(getPayAmt()).subtract(getDiscountAmt()).subtract(getWriteOffAmt()));
    return true;
  } //	beforeSave

  /**
   * After Save
   *
   * @param newRecord new
   * @param success success
   * @return success
   */
  protected boolean afterSave(boolean newRecord, boolean success) {
    if (!success) return success;
    setHeader();
    return success;
  } //	afterSave

  /**
   * After Delete
   *
   * @param success success
   * @return sucess
   */
  protected boolean afterDelete(boolean success) {
    if (!success) return success;
    setHeader();
    return success;
  } //	afterDelete

  /** Recalculate Header Sum */
  private void setHeader() {
    //	Update Header
    String sql =
        "UPDATE C_PaySelection ps "
            + "SET TotalAmt = (SELECT COALESCE(SUM(psl.PayAmt),0) "
            + "FROM C_PaySelectionLine psl "
            + "WHERE ps.C_PaySelection_ID=psl.C_PaySelection_ID AND psl.IsActive='Y') "
            + "WHERE C_PaySelection_ID="
            + getC_PaySelection_ID();
    DB.executeUpdate(sql, get_TrxName());
  } //	setHeader

  /**
   * String Representation
   *
   * @return info
   */
  public String toString() {
    StringBuilder sb = new StringBuilder("MPaySelectionLine[");
    sb.append(getId())
        .append(",C_Invoice_ID=")
        .append(getC_Invoice_ID())
        .append(",PayAmt=")
        .append(getPayAmt())
        .append(",DifferenceAmt=")
        .append(getDifferenceAmt())
        .append("]");
    return sb.toString();
  } //	toString
} //	MPaySelectionLine
