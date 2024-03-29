package org.compiere.accounting;

import java.sql.ResultSet;
import java.util.List;
import java.util.Properties;
import org.compiere.model.I_C_PaySelectionLine;
import org.compiere.orm.Query;
import org.idempiere.common.util.DB;
import org.idempiere.common.util.Env;
import org.idempiere.orm.PO;

/**
 * AP Payment Selection
 *
 * @author Jorg Janke
 * @version $Id: MPaySelection.java,v 1.3 2006/07/30 00:51:03 jjanke Exp $
 */
public class MPaySelection extends X_C_PaySelection {

  /** */
  private static final long serialVersionUID = -6521282913549455131L;

  /**
   * Default Constructor
   *
   * @param ctx context
   * @param C_PaySelection_ID id
   * @param trxName transaction
   */
  public MPaySelection(Properties ctx, int C_PaySelection_ID, String trxName) {
    super(ctx, C_PaySelection_ID, trxName);
    if (C_PaySelection_ID == 0) {
      //	setC_BankAccount_ID (0);
      //	setName (null);	// @#Date@
      //	setPayDate (new Timestamp(System.currentTimeMillis()));	// @#Date@
      setTotalAmt(Env.ZERO);
      setIsApproved(false);
      setProcessed(false);
      setProcessing(false);
    }
  } //	MPaySelection

  /**
   * Load Constructor
   *
   * @param ctx context
   * @param rs result set
   * @param trxName transaction
   */
  public MPaySelection(Properties ctx, ResultSet rs, String trxName) {
    super(ctx, rs, trxName);
  } //	MPaySelection

  /** Lines */
  private MPaySelectionLine[] m_lines = null;
  /** Currency of Bank Account */
  private int m_C_Currency_ID = 0;

  /**
   * Get Lines
   *
   * @param requery requery
   * @return lines
   */
  public MPaySelectionLine[] getLines(boolean requery) {
    if (m_lines != null && !requery) {
      PO.set_TrxName(m_lines, get_TrxName());
      return m_lines;
    }
    // FR: [ 2214883 ] Remove SQL code and Replace for Query - red1
    final String whereClause = "C_PaySelection_ID=?";
    List<MPaySelectionLine> list =
        new Query(getCtx(), I_C_PaySelectionLine.Table_Name, whereClause, get_TrxName())
            .setParameters(getC_PaySelection_ID())
            .setOrderBy("Line")
            .list();
    //
    m_lines = new MPaySelectionLine[list.size()];
    list.toArray(m_lines);
    return m_lines;
  } //	getLines

  /**
   * Get Currency of Bank Account
   *
   * @return C_Currency_ID
   */
  public int getC_Currency_ID() {
    if (m_C_Currency_ID == 0) {
      String sql = "SELECT C_Currency_ID FROM C_BankAccount " + "WHERE C_BankAccount_ID=?";
      m_C_Currency_ID = DB.getSQLValue(null, sql, getC_BankAccount_ID());
    }
    return m_C_Currency_ID;
  } //	getC_Currency_ID

  /**
   * String Representation
   *
   * @return info
   */
  public String toString() {
    StringBuilder sb = new StringBuilder("MPaySelection[");
    sb.append(getId()).append(",").append(getName()).append("]");
    return sb.toString();
  } //	toString
} //	MPaySelection
