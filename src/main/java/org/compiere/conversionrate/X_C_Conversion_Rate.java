package org.compiere.conversionrate;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.I_C_Conversion_Rate;
import org.compiere.orm.MTable;
import org.compiere.orm.PO;
import org.idempiere.common.util.Env;
import org.idempiere.common.util.KeyNamePair;
import org.idempiere.orm.I_Persistent;
import org.idempiere.orm.POInfo;

/**
 * Generated Model for C_Conversion_Rate
 *
 * @author iDempiere (generated)
 * @version Release 5.1 - $Id$
 */
public class X_C_Conversion_Rate extends PO implements I_C_Conversion_Rate, I_Persistent {

  /** */
  private static final long serialVersionUID = 20171031L;

  /** Standard Constructor */
  public X_C_Conversion_Rate(Properties ctx, int C_Conversion_Rate_ID, String trxName) {
    super(ctx, C_Conversion_Rate_ID, trxName);
    /**
     * if (C_Conversion_Rate_ID == 0) { setC_Conversion_Rate_ID (0); setC_ConversionType_ID (0);
     * setC_Currency_ID (0); setC_Currency_ID_To (0); setDivideRate (Env.ZERO); setMultiplyRate
     * (Env.ZERO); setValidFrom (new Timestamp( System.currentTimeMillis() )); }
     */
  }

  /** Load Constructor */
  public X_C_Conversion_Rate(Properties ctx, ResultSet rs, String trxName) {
    super(ctx, rs, trxName);
  }

  /**
   * AccessLevel
   *
   * @return 6 - System - Client
   */
  protected int getAccessLevel() {
    return I_C_Conversion_Rate.accessLevel.intValue();
  }

  /** Load Meta Data */
  protected POInfo initPO(Properties ctx) {
    POInfo poi = POInfo.getPOInfo(ctx, I_C_Conversion_Rate.Table_ID, get_TrxName());
    return poi;
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("X_C_Conversion_Rate[").append(getId()).append("]");
    return sb.toString();
  }

  /**
   * Set Conversion Rate.
   *
   * @param C_Conversion_Rate_ID Rate used for converting currencies
   */
  public void setC_Conversion_Rate_ID(int C_Conversion_Rate_ID) {
    if (C_Conversion_Rate_ID < 1)
      set_ValueNoCheck(I_C_Conversion_Rate.COLUMNNAME_C_Conversion_Rate_ID, null);
    else
      set_ValueNoCheck(
          I_C_Conversion_Rate.COLUMNNAME_C_Conversion_Rate_ID,
          Integer.valueOf(C_Conversion_Rate_ID));
  }

  /**
   * Get Conversion Rate.
   *
   * @return Rate used for converting currencies
   */
  public int getC_Conversion_Rate_ID() {
    Integer ii = (Integer) get_Value(I_C_Conversion_Rate.COLUMNNAME_C_Conversion_Rate_ID);
    if (ii == null) return 0;
    return ii;
  }

  /**
   * Get Record ID/ColumnName
   *
   * @return ID/ColumnName pair
   */
  public KeyNamePair getKeyNamePair() {
    return new KeyNamePair(getId(), String.valueOf(getC_Conversion_Rate_ID()));
  }

  /**
   * Set C_Conversion_Rate_UU.
   *
   * @param C_Conversion_Rate_UU C_Conversion_Rate_UU
   */
  public void setC_Conversion_Rate_UU(String C_Conversion_Rate_UU) {
    set_Value(I_C_Conversion_Rate.COLUMNNAME_C_Conversion_Rate_UU, C_Conversion_Rate_UU);
  }

  /**
   * Get C_Conversion_Rate_UU.
   *
   * @return C_Conversion_Rate_UU
   */
  public String getC_Conversion_Rate_UU() {
    return (String) get_Value(I_C_Conversion_Rate.COLUMNNAME_C_Conversion_Rate_UU);
  }

  public org.compiere.model.I_C_ConversionType getC_ConversionType() throws RuntimeException {
    return (org.compiere.model.I_C_ConversionType)
        MTable.get(getCtx(), org.compiere.model.I_C_ConversionType.Table_Name)
            .getPO(getC_ConversionType_ID(), get_TrxName());
  }

  /**
   * Set Currency Type.
   *
   * @param C_ConversionType_ID Currency Conversion Rate Type
   */
  public void setC_ConversionType_ID(int C_ConversionType_ID) {
    if (C_ConversionType_ID < 1)
      set_Value(I_C_Conversion_Rate.COLUMNNAME_C_ConversionType_ID, null);
    else
      set_Value(
          I_C_Conversion_Rate.COLUMNNAME_C_ConversionType_ID, Integer.valueOf(C_ConversionType_ID));
  }

  /**
   * Get Currency Type.
   *
   * @return Currency Conversion Rate Type
   */
  public int getC_ConversionType_ID() {
    Integer ii = (Integer) get_Value(I_C_Conversion_Rate.COLUMNNAME_C_ConversionType_ID);
    if (ii == null) return 0;
    return ii;
  }

  public org.compiere.model.I_C_Currency getC_Currency() throws RuntimeException {
    return (org.compiere.model.I_C_Currency)
        MTable.get(getCtx(), org.compiere.model.I_C_Currency.Table_Name)
            .getPO(getC_Currency_ID(), get_TrxName());
  }

  /**
   * Set Currency.
   *
   * @param C_Currency_ID The Currency for this record
   */
  public void setC_Currency_ID(int C_Currency_ID) {
    if (C_Currency_ID < 1) set_Value(I_C_Conversion_Rate.COLUMNNAME_C_Currency_ID, null);
    else set_Value(I_C_Conversion_Rate.COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
  }

  /**
   * Get Currency.
   *
   * @return The Currency for this record
   */
  public int getC_Currency_ID() {
    Integer ii = (Integer) get_Value(I_C_Conversion_Rate.COLUMNNAME_C_Currency_ID);
    if (ii == null) return 0;
    return ii;
  }

  public org.compiere.model.I_C_Currency getC_Currency_To() throws RuntimeException {
    return (org.compiere.model.I_C_Currency)
        MTable.get(getCtx(), org.compiere.model.I_C_Currency.Table_Name)
            .getPO(getC_Currency_ID_To(), get_TrxName());
  }

  /**
   * Set Currency To.
   *
   * @param C_Currency_ID_To Target currency
   */
  public void setC_Currency_ID_To(int C_Currency_ID_To) {
    set_Value(I_C_Conversion_Rate.COLUMNNAME_C_Currency_ID_To, Integer.valueOf(C_Currency_ID_To));
  }

  /**
   * Get Currency To.
   *
   * @return Target currency
   */
  public int getC_Currency_ID_To() {
    Integer ii = (Integer) get_Value(I_C_Conversion_Rate.COLUMNNAME_C_Currency_ID_To);
    if (ii == null) return 0;
    return ii;
  }

  /**
   * Set Divide Rate.
   *
   * @param DivideRate To convert Source number to Target number, the Source is divided
   */
  public void setDivideRate(BigDecimal DivideRate) {
    set_Value(I_C_Conversion_Rate.COLUMNNAME_DivideRate, DivideRate);
  }

  /**
   * Get Divide Rate.
   *
   * @return To convert Source number to Target number, the Source is divided
   */
  public BigDecimal getDivideRate() {
    BigDecimal bd = (BigDecimal) get_Value(I_C_Conversion_Rate.COLUMNNAME_DivideRate);
    if (bd == null) return Env.ZERO;
    return bd;
  }

  /**
   * Set Multiply Rate.
   *
   * @param MultiplyRate Rate to multiple the source by to calculate the target.
   */
  public void setMultiplyRate(BigDecimal MultiplyRate) {
    set_Value(I_C_Conversion_Rate.COLUMNNAME_MultiplyRate, MultiplyRate);
  }

  /**
   * Get Multiply Rate.
   *
   * @return Rate to multiple the source by to calculate the target.
   */
  public BigDecimal getMultiplyRate() {
    BigDecimal bd = (BigDecimal) get_Value(I_C_Conversion_Rate.COLUMNNAME_MultiplyRate);
    if (bd == null) return Env.ZERO;
    return bd;
  }

  /**
   * Set Valid from.
   *
   * @param ValidFrom Valid from including this date (first day)
   */
  public void setValidFrom(Timestamp ValidFrom) {
    set_Value(I_C_Conversion_Rate.COLUMNNAME_ValidFrom, ValidFrom);
  }

  /**
   * Get Valid from.
   *
   * @return Valid from including this date (first day)
   */
  public Timestamp getValidFrom() {
    return (Timestamp) get_Value(I_C_Conversion_Rate.COLUMNNAME_ValidFrom);
  }

  /**
   * Set Valid to.
   *
   * @param ValidTo Valid to including this date (last day)
   */
  public void setValidTo(Timestamp ValidTo) {
    set_Value(I_C_Conversion_Rate.COLUMNNAME_ValidTo, ValidTo);
  }

  /**
   * Get Valid to.
   *
   * @return Valid to including this date (last day)
   */
  public Timestamp getValidTo() {
    return (Timestamp) get_Value(I_C_Conversion_Rate.COLUMNNAME_ValidTo);
  }
}
