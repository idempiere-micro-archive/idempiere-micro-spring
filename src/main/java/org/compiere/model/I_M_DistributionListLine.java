package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_DistributionListLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_DistributionListLine {

  /** TableName=M_DistributionListLine */
  public static final String Table_Name = "M_DistributionListLine";

  /** AD_Table_ID=665 */
  public static final int Table_ID = 665;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

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

  /** Column name M_DistributionList_ID */
  public static final String COLUMNNAME_M_DistributionList_ID = "M_DistributionList_ID";

  /**
   * Set Distribution List. Distribution Lists allow to distribute products to a selected list of
   * partners
   */
  public void setM_DistributionList_ID(int M_DistributionList_ID);

  /**
   * Get Distribution List. Distribution Lists allow to distribute products to a selected list of
   * partners
   */
  public int getM_DistributionList_ID();

  public I_M_DistributionList getM_DistributionList() throws RuntimeException;

  /** Column name M_DistributionListLine_ID */
  public static final String COLUMNNAME_M_DistributionListLine_ID = "M_DistributionListLine_ID";

  /**
   * Set Distribution List Line. Distribution List Line with Business Partner and
   * Quantity/Percentage
   */
  public void setM_DistributionListLine_ID(int M_DistributionListLine_ID);

  /**
   * Get Distribution List Line. Distribution List Line with Business Partner and
   * Quantity/Percentage
   */
  public int getM_DistributionListLine_ID();

  /** Column name M_DistributionListLine_UU */
  public static final String COLUMNNAME_M_DistributionListLine_UU = "M_DistributionListLine_UU";

  /** Set M_DistributionListLine_UU */
  public void setM_DistributionListLine_UU(String M_DistributionListLine_UU);

  /** Get M_DistributionListLine_UU */
  public String getM_DistributionListLine_UU();

  /** Column name MinQty */
  public static final String COLUMNNAME_MinQty = "MinQty";

  /** Set Minimum Quantity. Minimum quantity for the business partner */
  public void setMinQty(BigDecimal MinQty);

  /** Get Minimum Quantity. Minimum quantity for the business partner */
  public BigDecimal getMinQty();

  /** Column name Ratio */
  public static final String COLUMNNAME_Ratio = "Ratio";

  /** Set Ratio. Relative Ratio for Distributions */
  public void setRatio(BigDecimal Ratio);

  /** Get Ratio. Relative Ratio for Distributions */
  public BigDecimal getRatio();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}
