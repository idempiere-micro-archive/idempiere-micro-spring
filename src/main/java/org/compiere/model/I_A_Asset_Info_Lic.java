package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_Asset_Info_Lic
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Asset_Info_Lic {

  /** TableName=A_Asset_Info_Lic */
  public static final String Table_Name = "A_Asset_Info_Lic";

  /** AD_Table_ID=53134 */
  public static final int Table_ID = 53134;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name A_Asset_ID */
  public static final String COLUMNNAME_A_Asset_ID = "A_Asset_ID";

  /** Set Asset. Asset used internally or by customers */
  public void setA_Asset_ID(int A_Asset_ID);

  /** Get Asset. Asset used internally or by customers */
  public int getA_Asset_ID();

  public I_A_Asset getA_Asset() throws RuntimeException;

  /** Column name A_Asset_Info_Lic_ID */
  public static final String COLUMNNAME_A_Asset_Info_Lic_ID = "A_Asset_Info_Lic_ID";

  /** Set A_Asset_Info_Lic_ID */
  public void setA_Asset_Info_Lic_ID(int A_Asset_Info_Lic_ID);

  /** Get A_Asset_Info_Lic_ID */
  public int getA_Asset_Info_Lic_ID();

  /** Column name A_Asset_Info_Lic_UU */
  public static final String COLUMNNAME_A_Asset_Info_Lic_UU = "A_Asset_Info_Lic_UU";

  /** Set A_Asset_Info_Lic_UU */
  public void setA_Asset_Info_Lic_UU(String A_Asset_Info_Lic_UU);

  /** Get A_Asset_Info_Lic_UU */
  public String getA_Asset_Info_Lic_UU();

  /** Get Client. Client/Tenant for this installation. */
  public int getADClientID();

  /** Column name AD_Org_ID */
  public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  public void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  public int getAD_Org_ID();

  /** Column name A_Issuing_Agency */
  public static final String COLUMNNAME_A_Issuing_Agency = "A_Issuing_Agency";

  /** Set Issuing Agency */
  public void setA_Issuing_Agency(String A_Issuing_Agency);

  /** Get Issuing Agency */
  public String getA_Issuing_Agency();

  /** Column name A_License_Fee */
  public static final String COLUMNNAME_A_License_Fee = "A_License_Fee";

  /** Set Asset License Fee */
  public void setA_License_Fee(BigDecimal A_License_Fee);

  /** Get Asset License Fee */
  public BigDecimal getA_License_Fee();

  /** Column name A_License_No */
  public static final String COLUMNNAME_A_License_No = "A_License_No";

  /** Set Asset License No */
  public void setA_License_No(String A_License_No);

  /** Get Asset License No */
  public String getA_License_No();

  /** Column name A_Renewal_Date */
  public static final String COLUMNNAME_A_Renewal_Date = "A_Renewal_Date";

  /** Set Asset Renewal Date */
  public void setA_Renewal_Date(Timestamp A_Renewal_Date);

  /** Get Asset Renewal Date */
  public Timestamp getA_Renewal_Date();

  /** Column name A_State */
  public static final String COLUMNNAME_A_State = "A_State";

  /** Set Account State. State of the Credit Card or Account holder */
  public void setA_State(String A_State);

  /** Get Account State. State of the Credit Card or Account holder */
  public String getA_State();

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

  /** Column name Processed */
  public static final String COLUMNNAME_Processed = "Processed";

  /** Set Processed. The document has been processed */
  public void setProcessed(boolean Processed);

  /** Get Processed. The document has been processed */
  public boolean isProcessed();

  /** Column name Text */
  public static final String COLUMNNAME_Text = "Text";

  /** Set Description */
  public void setText(String Text);

  /** Get Description */
  public String getText();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}
