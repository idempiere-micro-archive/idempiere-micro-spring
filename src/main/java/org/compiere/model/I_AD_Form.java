package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Form
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Form {

  /** TableName=AD_Form */
  public static final String Table_Name = "AD_Form";

  /** AD_Table_ID=376 */
  public static final int Table_ID = 376;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AccessLevel */
  public static final String COLUMNNAME_AccessLevel = "AccessLevel";

  /** Set Data Access Level. Access Level required */
  public void setAccessLevel(String AccessLevel);

  /** Get Data Access Level. Access Level required */
  public String getAccessLevel();

  /** Get Client. Client/Tenant for this installation. */
  public int getADClientID();

  /** Column name AD_CtxHelp_ID */
  public static final String COLUMNNAME_AD_CtxHelp_ID = "AD_CtxHelp_ID";

  /** Set Context Help */
  public void setAD_CtxHelp_ID(int AD_CtxHelp_ID);

  /** Get Context Help */
  public int getAD_CtxHelp_ID();

  public I_AD_CtxHelp getAD_CtxHelp() throws RuntimeException;

  /** Column name AD_Form_ID */
  public static final String COLUMNNAME_AD_Form_ID = "AD_Form_ID";

  /** Set Special Form. Special Form */
  public void setAD_Form_ID(int AD_Form_ID);

  /** Get Special Form. Special Form */
  public int getAD_Form_ID();

  /** Column name AD_Form_UU */
  public static final String COLUMNNAME_AD_Form_UU = "AD_Form_UU";

  /** Set AD_Form_UU */
  public void setAD_Form_UU(String AD_Form_UU);

  /** Get AD_Form_UU */
  public String getAD_Form_UU();

  /** Column name AD_Org_ID */
  public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  public void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  public int getAD_Org_ID();

  /** Column name Classname */
  public static final String COLUMNNAME_Classname = "Classname";

  /** Set Classname. Java Classname */
  public void setClassname(String Classname);

  /** Get Classname. Java Classname */
  public String getClassname();

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

  /** Column name EntityType */
  public static final String COLUMNNAME_EntityType = "EntityType";

  /** Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  public void setEntityType(String EntityType);

  /** Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  public String getEntityType();

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

  /** Column name IsBetaFunctionality */
  public static final String COLUMNNAME_IsBetaFunctionality = "IsBetaFunctionality";

  /** Set Beta Functionality. This functionality is considered Beta */
  public void setIsBetaFunctionality(boolean IsBetaFunctionality);

  /** Get Beta Functionality. This functionality is considered Beta */
  public boolean isBetaFunctionality();

  /** Column name JSPURL */
  public static final String COLUMNNAME_JSPURL = "JSPURL";

  /** Set jsp URL. Web URL of the jsp function */
  public void setJSPURL(String JSPURL);

  /** Get jsp URL. Web URL of the jsp function */
  public String getJSPURL();

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
