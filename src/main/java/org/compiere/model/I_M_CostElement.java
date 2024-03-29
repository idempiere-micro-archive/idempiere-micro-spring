package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_CostElement
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_CostElement {

  /** TableName=M_CostElement */
  public static final String Table_Name = "M_CostElement";

  /** AD_Table_ID=770 */
  public static final int Table_ID = 770;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Get Client. Client/Tenant for this installation. */
  public int getADClientID();

  /** Column name AD_Org_ID */
  public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  public void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  public int getAD_Org_ID();

  /** Column name CostElementType */
  public static final String COLUMNNAME_CostElementType = "CostElementType";

  /** Set Cost Element Type. Type of Cost Element */
  public void setCostElementType(String CostElementType);

  /** Get Cost Element Type. Type of Cost Element */
  public String getCostElementType();

  /** Column name CostingMethod */
  public static final String COLUMNNAME_CostingMethod = "CostingMethod";

  /** Set Costing Method. Indicates how Costs will be calculated */
  public void setCostingMethod(String CostingMethod);

  /** Get Costing Method. Indicates how Costs will be calculated */
  public String getCostingMethod();

  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  public int getCreatedBy();

  /** Column name Description */
  public static final String COLUMNNAME_Description = "Description";

  /** Set Description. Optional short description of the record */
  public void setDescription(String Description);

  /** Get Description. Optional short description of the record */
  public String getDescription();

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name IsCalculated */
  public static final String COLUMNNAME_IsCalculated = "IsCalculated";

  /** Set Calculated. The value is calculated by the system */
  public void setIsCalculated(boolean IsCalculated);

  /** Get Calculated. The value is calculated by the system */
  public boolean isCalculated();

  /** Column name M_CostElement_ID */
  public static final String COLUMNNAME_M_CostElement_ID = "M_CostElement_ID";

  /** Set Cost Element. Product Cost Element */
  public void setM_CostElement_ID(int M_CostElement_ID);

  /** Get Cost Element. Product Cost Element */
  public int getM_CostElement_ID();

  /** Column name M_CostElement_UU */
  public static final String COLUMNNAME_M_CostElement_UU = "M_CostElement_UU";

  /** Set M_CostElement_UU */
  public void setM_CostElement_UU(String M_CostElement_UU);

  /** Get M_CostElement_UU */
  public String getM_CostElement_UU();

  /** Set Name. Alphanumeric identifier of the entity */
  public void setName(String Name);

  /** Get Name. Alphanumeric identifier of the entity */
  public String getName();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}
