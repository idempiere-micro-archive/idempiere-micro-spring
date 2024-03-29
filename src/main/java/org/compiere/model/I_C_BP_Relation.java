package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_BP_Relation
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_BP_Relation {

  /** TableName=C_BP_Relation */
  public static final String Table_Name = "C_BP_Relation";

  /** AD_Table_ID=678 */
  public static final int Table_ID = 678;

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

  /** Column name C_BPartner_ID */
  public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

  /** Set Business Partner . Identifies a Business Partner */
  public void setC_BPartner_ID(int C_BPartner_ID);

  /** Get Business Partner . Identifies a Business Partner */
  public int getC_BPartner_ID();

  public I_C_BPartner getC_BPartner() throws RuntimeException;

  /** Column name C_BPartner_Location_ID */
  public static final String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";

  /** Set Partner Location. Identifies the (ship to) address for this Business Partner */
  public void setC_BPartner_Location_ID(int C_BPartner_Location_ID);

  /** Get Partner Location. Identifies the (ship to) address for this Business Partner */
  public int getC_BPartner_Location_ID();

  public I_C_BPartner_Location getC_BPartner_Location() throws RuntimeException;

  /** Column name C_BPartnerRelation_ID */
  public static final String COLUMNNAME_C_BPartnerRelation_ID = "C_BPartnerRelation_ID";

  /** Set Related Partner. Related Business Partner */
  public void setC_BPartnerRelation_ID(int C_BPartnerRelation_ID);

  /** Get Related Partner. Related Business Partner */
  public int getC_BPartnerRelation_ID();

  public I_C_BPartner getC_BPartnerRelation() throws RuntimeException;

  /** Column name C_BPartnerRelation_Location_ID */
  public static final String COLUMNNAME_C_BPartnerRelation_Location_ID =
      "C_BPartnerRelation_Location_ID";

  /** Set Related Partner Location. Location of the related Business Partner */
  public void setC_BPartnerRelation_Location_ID(int C_BPartnerRelation_Location_ID);

  /** Get Related Partner Location. Location of the related Business Partner */
  public int getC_BPartnerRelation_Location_ID();

  public I_C_BPartner_Location getC_BPartnerRelation_Location() throws RuntimeException;

  /** Column name C_BP_Relation_ID */
  public static final String COLUMNNAME_C_BP_Relation_ID = "C_BP_Relation_ID";

  /** Set Partner Relation. Business Partner Relation */
  public void setC_BP_Relation_ID(int C_BP_Relation_ID);

  /** Get Partner Relation. Business Partner Relation */
  public int getC_BP_Relation_ID();

  /** Column name C_BP_Relation_UU */
  public static final String COLUMNNAME_C_BP_Relation_UU = "C_BP_Relation_UU";

  /** Set C_BP_Relation_UU */
  public void setC_BP_Relation_UU(String C_BP_Relation_UU);

  /** Get C_BP_Relation_UU */
  public String getC_BP_Relation_UU();

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

  /** Column name IsBillTo */
  public static final String COLUMNNAME_IsBillTo = "IsBillTo";

  /** Set Invoice Address. Business Partner Invoice/Bill Address */
  public void setIsBillTo(boolean IsBillTo);

  /** Get Invoice Address. Business Partner Invoice/Bill Address */
  public boolean isBillTo();

  /** Column name IsPayFrom */
  public static final String COLUMNNAME_IsPayFrom = "IsPayFrom";

  /**
   * Set Pay-From Address. Business Partner pays from that address and we'll send dunning letters
   * there
   */
  public void setIsPayFrom(boolean IsPayFrom);

  /**
   * Get Pay-From Address. Business Partner pays from that address and we'll send dunning letters
   * there
   */
  public boolean isPayFrom();

  /** Column name IsRemitTo */
  public static final String COLUMNNAME_IsRemitTo = "IsRemitTo";

  /** Set Remit-To Address. Business Partner payment address */
  public void setIsRemitTo(boolean IsRemitTo);

  /** Get Remit-To Address. Business Partner payment address */
  public boolean isRemitTo();

  /** Column name IsShipTo */
  public static final String COLUMNNAME_IsShipTo = "IsShipTo";

  /** Set Ship Address. Business Partner Shipment Address */
  public void setIsShipTo(boolean IsShipTo);

  /** Get Ship Address. Business Partner Shipment Address */
  public boolean isShipTo();

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
