package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_Asset_Info_Tax
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Asset_Info_Tax {

  /** TableName=A_Asset_Info_Tax */
  public static final String Table_Name = "A_Asset_Info_Tax";

  /** AD_Table_ID=53131 */
  public static final int Table_ID = 53131;

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

  /** Column name A_Asset_Info_Tax_ID */
  public static final String COLUMNNAME_A_Asset_Info_Tax_ID = "A_Asset_Info_Tax_ID";

  /** Set Asset Info Tax */
  public void setA_Asset_Info_Tax_ID(int A_Asset_Info_Tax_ID);

  /** Get Asset Info Tax */
  public int getA_Asset_Info_Tax_ID();

  /** Column name A_Asset_Info_Tax_UU */
  public static final String COLUMNNAME_A_Asset_Info_Tax_UU = "A_Asset_Info_Tax_UU";

  /** Set A_Asset_Info_Tax_UU */
  public void setA_Asset_Info_Tax_UU(String A_Asset_Info_Tax_UU);

  /** Get A_Asset_Info_Tax_UU */
  public String getA_Asset_Info_Tax_UU();

  /** Get Client. Client/Tenant for this installation. */
  public int getADClientID();

  /** Column name AD_Org_ID */
  public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  public void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  public int getAD_Org_ID();

  /** Column name A_Finance_Meth */
  public static final String COLUMNNAME_A_Finance_Meth = "A_Finance_Meth";

  /** Set Asset Finance Method */
  public void setA_Finance_Meth(String A_Finance_Meth);

  /** Get Asset Finance Method */
  public String getA_Finance_Meth();

  /** Column name A_Investment_CR */
  public static final String COLUMNNAME_A_Investment_CR = "A_Investment_CR";

  /** Set Asset Investment CR */
  public void setA_Investment_CR(int A_Investment_CR);

  /** Get Asset Investment CR */
  public int getA_Investment_CR();

  /** Column name A_New_Used */
  public static final String COLUMNNAME_A_New_Used = "A_New_Used";

  /** Set Asset New Used */
  public void setA_New_Used(boolean A_New_Used);

  /** Get Asset New Used */
  public boolean isA_New_Used();

  /** Column name A_State */
  public static final String COLUMNNAME_A_State = "A_State";

  /** Set Account State. State of the Credit Card or Account holder */
  public void setA_State(String A_State);

  /** Get Account State. State of the Credit Card or Account holder */
  public String getA_State();

  /** Column name A_Tax_Entity */
  public static final String COLUMNNAME_A_Tax_Entity = "A_Tax_Entity";

  /** Set Asset Tax Entity */
  public void setA_Tax_Entity(String A_Tax_Entity);

  /** Get Asset Tax Entity */
  public String getA_Tax_Entity();

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

  /** Column name TextMsg */
  public static final String COLUMNNAME_TextMsg = "TextMsg";

  /** Set Text Message. Text Message */
  public void setTextMsg(String TextMsg);

  /** Get Text Message. Text Message */
  public String getTextMsg();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}
