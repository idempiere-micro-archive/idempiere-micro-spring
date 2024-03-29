package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for U_Web_Properties
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_U_Web_Properties {

  /** TableName=U_Web_Properties */
  public static final String Table_Name = "U_Web_Properties";

  /** AD_Table_ID=52001 */
  public static final int Table_ID = 52001;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Get Client. Client/Tenant for this installation. */
  public int getADClientID();

  /** Column name AD_Org_ID */
  public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  public void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  public int getAD_Org_ID();

  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  public int getCreatedBy();

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name U_Key */
  public static final String COLUMNNAME_U_Key = "U_Key";

  /** Set Key */
  public void setU_Key(String U_Key);

  /** Get Key */
  public String getU_Key();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();

  /** Column name U_Value */
  public static final String COLUMNNAME_U_Value = "U_Value";

  /** Set Value */
  public void setU_Value(String U_Value);

  /** Get Value */
  public String getU_Value();

  /** Column name U_Web_Properties_ID */
  public static final String COLUMNNAME_U_Web_Properties_ID = "U_Web_Properties_ID";

  /** Set Web Properties */
  public void setU_Web_Properties_ID(int U_Web_Properties_ID);

  /** Get Web Properties */
  public int getU_Web_Properties_ID();

  /** Column name U_Web_Properties_UU */
  public static final String COLUMNNAME_U_Web_Properties_UU = "U_Web_Properties_UU";

  /** Set U_Web_Properties_UU */
  public void setU_Web_Properties_UU(String U_Web_Properties_UU);

  /** Get U_Web_Properties_UU */
  public String getU_Web_Properties_UU();
}
