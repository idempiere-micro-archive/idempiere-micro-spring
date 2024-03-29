package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_TaxDeclaration
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_TaxDeclaration {

  /** TableName=C_TaxDeclaration */
  public static final String Table_Name = "C_TaxDeclaration";

  /** AD_Table_ID=818 */
  public static final int Table_ID = 818;

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

  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  public int getCreatedBy();

  /** Column name C_TaxDeclaration_ID */
  public static final String COLUMNNAME_C_TaxDeclaration_ID = "C_TaxDeclaration_ID";

  /** Set Tax Declaration. Define the declaration to the tax authorities */
  public void setC_TaxDeclaration_ID(int C_TaxDeclaration_ID);

  /** Get Tax Declaration. Define the declaration to the tax authorities */
  public int getC_TaxDeclaration_ID();

  /** Column name C_TaxDeclaration_UU */
  public static final String COLUMNNAME_C_TaxDeclaration_UU = "C_TaxDeclaration_UU";

  /** Set C_TaxDeclaration_UU */
  public void setC_TaxDeclaration_UU(String C_TaxDeclaration_UU);

  /** Get C_TaxDeclaration_UU */
  public String getC_TaxDeclaration_UU();

  /** Column name DateFrom */
  public static final String COLUMNNAME_DateFrom = "DateFrom";

  /** Set Date From. Starting date for a range */
  public void setDateFrom(Timestamp DateFrom);

  /** Get Date From. Starting date for a range */
  public Timestamp getDateFrom();

  /** Column name DateTo */
  public static final String COLUMNNAME_DateTo = "DateTo";

  /** Set Date To. End date of a date range */
  public void setDateTo(Timestamp DateTo);

  /** Get Date To. End date of a date range */
  public Timestamp getDateTo();

  /** Column name DateTrx */
  public static final String COLUMNNAME_DateTrx = "DateTrx";

  /** Set Transaction Date. Transaction Date */
  public void setDateTrx(Timestamp DateTrx);

  /** Get Transaction Date. Transaction Date */
  public Timestamp getDateTrx();

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

  /** Set Name. Alphanumeric identifier of the entity */
  public void setName(String Name);

  /** Get Name. Alphanumeric identifier of the entity */
  public String getName();

  /** Column name Processed */
  public static final String COLUMNNAME_Processed = "Processed";

  /** Set Processed. The document has been processed */
  public void setProcessed(boolean Processed);

  /** Get Processed. The document has been processed */
  public boolean isProcessed();

  /** Column name Processing */
  public static final String COLUMNNAME_Processing = "Processing";

  /** Set Process Now */
  public void setProcessing(boolean Processing);

  /** Get Process Now */
  public boolean isProcessing();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}
