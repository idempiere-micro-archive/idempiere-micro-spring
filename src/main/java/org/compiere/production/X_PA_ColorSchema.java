package org.compiere.production;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.I_PA_ColorSchema;
import org.compiere.orm.BasePOName;
import org.compiere.orm.MTable;
import org.idempiere.orm.I_Persistent;
import org.idempiere.orm.POInfo;

/**
 * Generated Model for PA_ColorSchema
 *
 * @author iDempiere (generated)
 * @version Release 5.1 - $Id$
 */
public class X_PA_ColorSchema extends BasePOName implements I_PA_ColorSchema, I_Persistent {

  /** */
  private static final long serialVersionUID = 20171031L;

  /** Standard Constructor */
  public X_PA_ColorSchema(Properties ctx, int PA_ColorSchema_ID, String trxName) {
    super(ctx, PA_ColorSchema_ID, trxName);
    /**
     * if (PA_ColorSchema_ID == 0) { setAD_PrintColor1_ID (0); setAD_PrintColor2_ID (0);
     * setEntityType (null); // @SQL=select get_sysconfig('DEFAULT_ENTITYTYPE','U',0,0) from dual
     * setMark1Percent (0); setMark2Percent (0); setName (null); setPA_ColorSchema_ID (0); }
     */
  }

  /** Load Constructor */
  public X_PA_ColorSchema(Properties ctx, ResultSet rs, String trxName) {
    super(ctx, rs, trxName);
  }

  /**
   * AccessLevel
   *
   * @return 6 - System - Client
   */
  protected int getAccessLevel() {
    return accessLevel.intValue();
  }

  /** Load Meta Data */
  protected POInfo initPO(Properties ctx) {
    POInfo poi = POInfo.getPOInfo(ctx, Table_ID, get_TrxName());
    return poi;
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("X_PA_ColorSchema[").append(getId()).append("]");
    return sb.toString();
  }

  public org.compiere.model.I_AD_PrintColor getAD_PrintColor1() throws RuntimeException {
    return (org.compiere.model.I_AD_PrintColor)
        MTable.get(getCtx(), org.compiere.model.I_AD_PrintColor.Table_Name)
            .getPO(getAD_PrintColor1_ID(), get_TrxName());
  }

  /**
   * Set Color 1.
   *
   * @param AD_PrintColor1_ID First color used
   */
  public void setAD_PrintColor1_ID(int AD_PrintColor1_ID) {
    if (AD_PrintColor1_ID < 1) set_Value(COLUMNNAME_AD_PrintColor1_ID, null);
    else set_Value(COLUMNNAME_AD_PrintColor1_ID, Integer.valueOf(AD_PrintColor1_ID));
  }

  /**
   * Get Color 1.
   *
   * @return First color used
   */
  public int getAD_PrintColor1_ID() {
    Integer ii = (Integer) get_Value(COLUMNNAME_AD_PrintColor1_ID);
    if (ii == null) return 0;
    return ii;
  }

  public org.compiere.model.I_AD_PrintColor getAD_PrintColor2() throws RuntimeException {
    return (org.compiere.model.I_AD_PrintColor)
        MTable.get(getCtx(), org.compiere.model.I_AD_PrintColor.Table_Name)
            .getPO(getAD_PrintColor2_ID(), get_TrxName());
  }

  /**
   * Set Color 2.
   *
   * @param AD_PrintColor2_ID Second color used
   */
  public void setAD_PrintColor2_ID(int AD_PrintColor2_ID) {
    if (AD_PrintColor2_ID < 1) set_Value(COLUMNNAME_AD_PrintColor2_ID, null);
    else set_Value(COLUMNNAME_AD_PrintColor2_ID, Integer.valueOf(AD_PrintColor2_ID));
  }

  /**
   * Get Color 2.
   *
   * @return Second color used
   */
  public int getAD_PrintColor2_ID() {
    Integer ii = (Integer) get_Value(COLUMNNAME_AD_PrintColor2_ID);
    if (ii == null) return 0;
    return ii;
  }

  public org.compiere.model.I_AD_PrintColor getAD_PrintColor3() throws RuntimeException {
    return (org.compiere.model.I_AD_PrintColor)
        MTable.get(getCtx(), org.compiere.model.I_AD_PrintColor.Table_Name)
            .getPO(getAD_PrintColor3_ID(), get_TrxName());
  }

  /**
   * Set Color 3.
   *
   * @param AD_PrintColor3_ID Third color used
   */
  public void setAD_PrintColor3_ID(int AD_PrintColor3_ID) {
    if (AD_PrintColor3_ID < 1) set_Value(COLUMNNAME_AD_PrintColor3_ID, null);
    else set_Value(COLUMNNAME_AD_PrintColor3_ID, Integer.valueOf(AD_PrintColor3_ID));
  }

  /**
   * Get Color 3.
   *
   * @return Third color used
   */
  public int getAD_PrintColor3_ID() {
    Integer ii = (Integer) get_Value(COLUMNNAME_AD_PrintColor3_ID);
    if (ii == null) return 0;
    return ii;
  }

  public org.compiere.model.I_AD_PrintColor getAD_PrintColor4() throws RuntimeException {
    return (org.compiere.model.I_AD_PrintColor)
        MTable.get(getCtx(), org.compiere.model.I_AD_PrintColor.Table_Name)
            .getPO(getAD_PrintColor4_ID(), get_TrxName());
  }

  /**
   * Set Color 4.
   *
   * @param AD_PrintColor4_ID Forth color used
   */
  public void setAD_PrintColor4_ID(int AD_PrintColor4_ID) {
    if (AD_PrintColor4_ID < 1) set_Value(COLUMNNAME_AD_PrintColor4_ID, null);
    else set_Value(COLUMNNAME_AD_PrintColor4_ID, Integer.valueOf(AD_PrintColor4_ID));
  }

  /**
   * Get Color 4.
   *
   * @return Forth color used
   */
  public int getAD_PrintColor4_ID() {
    Integer ii = (Integer) get_Value(COLUMNNAME_AD_PrintColor4_ID);
    if (ii == null) return 0;
    return ii;
  }

  /**
   * Set Description.
   *
   * @param Description Optional short description of the record
   */
  public void setDescription(String Description) {
    set_Value(COLUMNNAME_Description, Description);
  }

  /**
   * Get Description.
   *
   * @return Optional short description of the record
   */
  public String getDescription() {
    return (String) get_Value(COLUMNNAME_Description);
  }

  /** EntityType AD_Reference_ID=389 */
  public static final int ENTITYTYPE_AD_Reference_ID = 389;
  /**
   * Set Entity Type.
   *
   * @param EntityType Dictionary Entity Type; Determines ownership and synchronization
   */
  public void setEntityType(String EntityType) {

    set_Value(COLUMNNAME_EntityType, EntityType);
  }

  /**
   * Get Entity Type.
   *
   * @return Dictionary Entity Type; Determines ownership and synchronization
   */
  public String getEntityType() {
    return (String) get_Value(COLUMNNAME_EntityType);
  }

  /**
   * Set Mark 1 Percent.
   *
   * @param Mark1Percent Percentage up to this color is used
   */
  public void setMark1Percent(int Mark1Percent) {
    set_Value(COLUMNNAME_Mark1Percent, Integer.valueOf(Mark1Percent));
  }

  /**
   * Get Mark 1 Percent.
   *
   * @return Percentage up to this color is used
   */
  public int getMark1Percent() {
    Integer ii = (Integer) get_Value(COLUMNNAME_Mark1Percent);
    if (ii == null) return 0;
    return ii;
  }

  /**
   * Set Mark 2 Percent.
   *
   * @param Mark2Percent Percentage up to this color is used
   */
  public void setMark2Percent(int Mark2Percent) {
    set_Value(COLUMNNAME_Mark2Percent, Integer.valueOf(Mark2Percent));
  }

  /**
   * Get Mark 2 Percent.
   *
   * @return Percentage up to this color is used
   */
  public int getMark2Percent() {
    Integer ii = (Integer) get_Value(COLUMNNAME_Mark2Percent);
    if (ii == null) return 0;
    return ii;
  }

  /**
   * Set Mark 3 Percent.
   *
   * @param Mark3Percent Percentage up to this color is used
   */
  public void setMark3Percent(int Mark3Percent) {
    set_Value(COLUMNNAME_Mark3Percent, Integer.valueOf(Mark3Percent));
  }

  /**
   * Get Mark 3 Percent.
   *
   * @return Percentage up to this color is used
   */
  public int getMark3Percent() {
    Integer ii = (Integer) get_Value(COLUMNNAME_Mark3Percent);
    if (ii == null) return 0;
    return ii;
  }

  /**
   * Set Mark 4 Percent.
   *
   * @param Mark4Percent Percentage up to this color is used
   */
  public void setMark4Percent(int Mark4Percent) {
    set_Value(COLUMNNAME_Mark4Percent, Integer.valueOf(Mark4Percent));
  }

  /**
   * Get Mark 4 Percent.
   *
   * @return Percentage up to this color is used
   */
  public int getMark4Percent() {
    Integer ii = (Integer) get_Value(COLUMNNAME_Mark4Percent);
    if (ii == null) return 0;
    return ii;
  }

  /**
   * Set Color Schema.
   *
   * @param PA_ColorSchema_ID Performance Color Schema
   */
  public void setPA_ColorSchema_ID(int PA_ColorSchema_ID) {
    if (PA_ColorSchema_ID < 1) set_ValueNoCheck(COLUMNNAME_PA_ColorSchema_ID, null);
    else set_ValueNoCheck(COLUMNNAME_PA_ColorSchema_ID, Integer.valueOf(PA_ColorSchema_ID));
  }

  /**
   * Get Color Schema.
   *
   * @return Performance Color Schema
   */
  public int getPA_ColorSchema_ID() {
    Integer ii = (Integer) get_Value(COLUMNNAME_PA_ColorSchema_ID);
    if (ii == null) return 0;
    return ii;
  }

  /**
   * Set PA_ColorSchema_UU.
   *
   * @param PA_ColorSchema_UU PA_ColorSchema_UU
   */
  public void setPA_ColorSchema_UU(String PA_ColorSchema_UU) {
    set_Value(COLUMNNAME_PA_ColorSchema_UU, PA_ColorSchema_UU);
  }

  /**
   * Get PA_ColorSchema_UU.
   *
   * @return PA_ColorSchema_UU
   */
  public String getPA_ColorSchema_UU() {
    return (String) get_Value(COLUMNNAME_PA_ColorSchema_UU);
  }
}
