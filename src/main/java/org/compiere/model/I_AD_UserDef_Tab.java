package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_UserDef_Tab
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_UserDef_Tab {

  /** TableName=AD_UserDef_Tab */
  public static final String Table_Name = "AD_UserDef_Tab";

  /** AD_Table_ID=466 */
  public static final int Table_ID = 466;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Get Client. Client/Tenant for this installation. */
  public int getADClientID();

  /** Column name AD_Org_ID */
  public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  public void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  public int getAD_Org_ID();

  /** Column name AD_Tab_ID */
  public static final String COLUMNNAME_AD_Tab_ID = "AD_Tab_ID";

  /** Set Tab. Tab within a Window */
  public void setAD_Tab_ID(int AD_Tab_ID);

  /** Get Tab. Tab within a Window */
  public int getAD_Tab_ID();

  public I_AD_Tab getAD_Tab() throws RuntimeException;

  /** Column name AD_UserDef_Tab_ID */
  public static final String COLUMNNAME_AD_UserDef_Tab_ID = "AD_UserDef_Tab_ID";

  /** Set User defined Tab */
  public void setAD_UserDef_Tab_ID(int AD_UserDef_Tab_ID);

  /** Get User defined Tab */
  public int getAD_UserDef_Tab_ID();

  /** Column name AD_UserDef_Tab_UU */
  public static final String COLUMNNAME_AD_UserDef_Tab_UU = "AD_UserDef_Tab_UU";

  /** Set AD_UserDef_Tab_UU */
  public void setAD_UserDef_Tab_UU(String AD_UserDef_Tab_UU);

  /** Get AD_UserDef_Tab_UU */
  public String getAD_UserDef_Tab_UU();

  /** Column name AD_UserDef_Win_ID */
  public static final String COLUMNNAME_AD_UserDef_Win_ID = "AD_UserDef_Win_ID";

  /** Set User defined Window */
  public void setAD_UserDef_Win_ID(int AD_UserDef_Win_ID);

  /** Get User defined Window */
  public int getAD_UserDef_Win_ID();

  public I_AD_UserDef_Win getAD_UserDef_Win() throws RuntimeException;

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

  /** Column name Help */
  public static final String COLUMNNAME_Help = "Help";

  /** Set Comment/Help. Comment or Hint */
  public void setHelp(String Help);

  /** Get Comment/Help. Comment or Hint */
  public String getHelp();

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name IsMultiRowOnly */
  public static final String COLUMNNAME_IsMultiRowOnly = "IsMultiRowOnly";

  /** Set Multi Row Only. This applies to Multi-Row view only */
  public void setIsMultiRowOnly(boolean IsMultiRowOnly);

  /** Get Multi Row Only. This applies to Multi-Row view only */
  public boolean isMultiRowOnly();

  /** Column name IsReadOnly */
  public static final String COLUMNNAME_IsReadOnly = "IsReadOnly";

  /** Set Read Only. Field is read only */
  public void setIsReadOnly(boolean IsReadOnly);

  /** Get Read Only. Field is read only */
  public boolean isReadOnly();

  /** Column name IsSingleRow */
  public static final String COLUMNNAME_IsSingleRow = "IsSingleRow";

  /** Set Single Row Layout. Default for toggle between Single- and Multi-Row (Grid) Layout */
  public void setIsSingleRow(boolean IsSingleRow);

  /** Get Single Row Layout. Default for toggle between Single- and Multi-Row (Grid) Layout */
  public boolean isSingleRow();

  /** Set Name. Alphanumeric identifier of the entity */
  public void setName(String Name);

  /** Get Name. Alphanumeric identifier of the entity */
  public String getName();

  /** Column name ReadOnlyLogic */
  public static final String COLUMNNAME_ReadOnlyLogic = "ReadOnlyLogic";

  /**
   * Set Read Only Logic. Logic to determine if field is read only (applies only when field is
   * read-write)
   */
  public void setReadOnlyLogic(String ReadOnlyLogic);

  /**
   * Get Read Only Logic. Logic to determine if field is read only (applies only when field is
   * read-write)
   */
  public String getReadOnlyLogic();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}
