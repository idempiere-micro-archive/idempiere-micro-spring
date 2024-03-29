package org.compiere.product;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.I_M_Product_Category;
import org.compiere.orm.BasePONameValue;
import org.compiere.orm.MTable;
import org.idempiere.common.util.Env;
import org.idempiere.orm.I_Persistent;
import org.idempiere.orm.POInfo;

/**
 * Generated Model for M_Product_Category
 *
 * @author iDempiere (generated)
 * @version Release 5.1 - $Id$
 */
public class X_M_Product_Category extends BasePONameValue
    implements I_M_Product_Category, I_Persistent {

  /** */
  private static final long serialVersionUID = 20171031L;

  /** Standard Constructor */
  public X_M_Product_Category(Properties ctx, int M_Product_Category_ID, String trxName) {
    super(ctx, M_Product_Category_ID, trxName);
  }

  /** Load Constructor */
  public X_M_Product_Category(Properties ctx, ResultSet rs, String trxName) {
    super(ctx, rs, trxName);
  }

  /**
   * AccessLevel
   *
   * @return 3 - Client - Org
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
    StringBuffer sb = new StringBuffer("X_M_Product_Category[").append(getId()).append("]");
    return sb.toString();
  }

  public org.compiere.model.I_A_Asset_Group getA_Asset_Group() throws RuntimeException {
    return (org.compiere.model.I_A_Asset_Group)
        MTable.get(getCtx(), org.compiere.model.I_A_Asset_Group.Table_Name)
            .getPO(getA_Asset_Group_ID(), get_TrxName());
  }

  /**
   * Set Asset Group.
   *
   * @param A_Asset_Group_ID Group of Assets
   */
  public void setA_Asset_Group_ID(int A_Asset_Group_ID) {
    if (A_Asset_Group_ID < 1) set_Value(COLUMNNAME_A_Asset_Group_ID, null);
    else set_Value(COLUMNNAME_A_Asset_Group_ID, Integer.valueOf(A_Asset_Group_ID));
  }

  /**
   * Get Asset Group.
   *
   * @return Group of Assets
   */
  public int getA_Asset_Group_ID() {
    Integer ii = (Integer) get_Value(COLUMNNAME_A_Asset_Group_ID);
    if (ii == null) return 0;
    return ii;
  }

  public org.compiere.model.I_AD_PrintColor getAD_PrintColor() throws RuntimeException {
    return (org.compiere.model.I_AD_PrintColor)
        MTable.get(getCtx(), org.compiere.model.I_AD_PrintColor.Table_Name)
            .getPO(getAD_PrintColor_ID(), get_TrxName());
  }

  /**
   * Set Print Color.
   *
   * @param AD_PrintColor_ID Color used for printing and display
   */
  public void setAD_PrintColor_ID(int AD_PrintColor_ID) {
    if (AD_PrintColor_ID < 1) set_Value(COLUMNNAME_AD_PrintColor_ID, null);
    else set_Value(COLUMNNAME_AD_PrintColor_ID, Integer.valueOf(AD_PrintColor_ID));
  }

  /**
   * Get Print Color.
   *
   * @return Color used for printing and display
   */
  public int getAD_PrintColor_ID() {
    Integer ii = (Integer) get_Value(COLUMNNAME_AD_PrintColor_ID);
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

  /**
   * Set Default.
   *
   * @param IsDefault Default value
   */
  public void setIsDefault(boolean IsDefault) {
    set_Value(COLUMNNAME_IsDefault, Boolean.valueOf(IsDefault));
  }

  /**
   * Get Default.
   *
   * @return Default value
   */
  public boolean isDefault() {
    Object oo = get_Value(COLUMNNAME_IsDefault);
    if (oo != null) {
      if (oo instanceof Boolean) return ((Boolean) oo).booleanValue();
      return "Y".equals(oo);
    }
    return false;
  }

  /**
   * Set Self-Service.
   *
   * @param IsSelfService This is a Self-Service entry or this entry can be changed via Self-Service
   */
  public void setIsSelfService(boolean IsSelfService) {
    set_Value(COLUMNNAME_IsSelfService, Boolean.valueOf(IsSelfService));
  }

  /**
   * Get Self-Service.
   *
   * @return This is a Self-Service entry or this entry can be changed via Self-Service
   */
  public boolean isSelfService() {
    Object oo = get_Value(COLUMNNAME_IsSelfService);
    if (oo != null) {
      if (oo instanceof Boolean) return ((Boolean) oo).booleanValue();
      return "Y".equals(oo);
    }
    return false;
  }

  /** MMPolicy AD_Reference_ID=335 */
  public static final int MMPOLICY_AD_Reference_ID = 335;
  /** LiFo = L */
  public static final String MMPOLICY_LiFo = "L";
  /** FiFo = F */
  public static final String MMPOLICY_FiFo = "F";
  /**
   * Set Material Policy.
   *
   * @param MMPolicy Material Movement Policy
   */
  public void setMMPolicy(String MMPolicy) {

    set_Value(COLUMNNAME_MMPolicy, MMPolicy);
  }

  /**
   * Get Material Policy.
   *
   * @return Material Movement Policy
   */
  public String getMMPolicy() {
    return (String) get_Value(COLUMNNAME_MMPolicy);
  }

  /**
   * Set Product Category.
   *
   * @param M_Product_Category_ID Category of a Product
   */
  public void setM_Product_Category_ID(int M_Product_Category_ID) {
    if (M_Product_Category_ID < 1) set_ValueNoCheck(COLUMNNAME_M_Product_Category_ID, null);
    else set_ValueNoCheck(COLUMNNAME_M_Product_Category_ID, Integer.valueOf(M_Product_Category_ID));
  }

  /**
   * Get Product Category.
   *
   * @return Category of a Product
   */
  public int getM_Product_Category_ID() {
    Integer ii = (Integer) get_Value(COLUMNNAME_M_Product_Category_ID);
    if (ii == null) return 0;
    return ii;
  }

  public org.compiere.model.I_M_Product_Category getM_Product_Category_Parent()
      throws RuntimeException {
    return (org.compiere.model.I_M_Product_Category)
        MTable.get(getCtx(), org.compiere.model.I_M_Product_Category.Table_Name)
            .getPO(getM_Product_Category_Parent_ID(), get_TrxName());
  }

  /**
   * Set Parent Product Category.
   *
   * @param M_Product_Category_Parent_ID Parent Product Category
   */
  public void setM_Product_Category_Parent_ID(int M_Product_Category_Parent_ID) {
    if (M_Product_Category_Parent_ID < 1) set_Value(COLUMNNAME_M_Product_Category_Parent_ID, null);
    else
      set_Value(
          COLUMNNAME_M_Product_Category_Parent_ID, Integer.valueOf(M_Product_Category_Parent_ID));
  }

  /**
   * Get Parent Product Category.
   *
   * @return Parent Product Category
   */
  public int getM_Product_Category_Parent_ID() {
    Integer ii = (Integer) get_Value(COLUMNNAME_M_Product_Category_Parent_ID);
    if (ii == null) return 0;
    return ii;
  }

  /**
   * Set M_Product_Category_UU.
   *
   * @param M_Product_Category_UU M_Product_Category_UU
   */
  public void setM_Product_Category_UU(String M_Product_Category_UU) {
    set_Value(COLUMNNAME_M_Product_Category_UU, M_Product_Category_UU);
  }

  /**
   * Get M_Product_Category_UU.
   *
   * @return M_Product_Category_UU
   */
  public String getM_Product_Category_UU() {
    return (String) get_Value(COLUMNNAME_M_Product_Category_UU);
  }

  /**
   * Set Planned Margin %.
   *
   * @param PlannedMargin Project's planned margin as a percentage
   */
  public void setPlannedMargin(BigDecimal PlannedMargin) {
    set_Value(COLUMNNAME_PlannedMargin, PlannedMargin);
  }

  /**
   * Get Planned Margin %.
   *
   * @return Project's planned margin as a percentage
   */
  public BigDecimal getPlannedMargin() {
    BigDecimal bd = (BigDecimal) get_Value(COLUMNNAME_PlannedMargin);
    if (bd == null) return Env.ZERO;
    return bd;
  }
}
