package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for PA_SLA_Measure
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_PA_SLA_Measure {

  /** TableName=PA_SLA_Measure */
  public static final String Table_Name = "PA_SLA_Measure";

  /** AD_Table_ID=743 */
  public static final int Table_ID = 743;

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

  /** Column name AD_Table_ID */
  public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";

  /** Set Table. Database Table information */
  public void setAD_Table_ID(int AD_Table_ID);

  /** Get Table. Database Table information */
  public int getAD_Table_ID();

  public I_AD_Table getAD_Table() throws RuntimeException;

  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  public int getCreatedBy();

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

  /** Column name MeasureActual */
  public static final String COLUMNNAME_MeasureActual = "MeasureActual";

  /** Set Measure Actual. Actual value that has been measured. */
  public void setMeasureActual(BigDecimal MeasureActual);

  /** Get Measure Actual. Actual value that has been measured. */
  public BigDecimal getMeasureActual();

  /** Column name PA_SLA_Goal_ID */
  public static final String COLUMNNAME_PA_SLA_Goal_ID = "PA_SLA_Goal_ID";

  /** Set SLA Goal. Service Level Agreement Goal */
  public void setPA_SLA_Goal_ID(int PA_SLA_Goal_ID);

  /** Get SLA Goal. Service Level Agreement Goal */
  public int getPA_SLA_Goal_ID();

  public I_PA_SLA_Goal getPA_SLA_Goal() throws RuntimeException;

  /** Column name PA_SLA_Measure_ID */
  public static final String COLUMNNAME_PA_SLA_Measure_ID = "PA_SLA_Measure_ID";

  /** Set SLA Measure. Service Level Agreement Measure */
  public void setPA_SLA_Measure_ID(int PA_SLA_Measure_ID);

  /** Get SLA Measure. Service Level Agreement Measure */
  public int getPA_SLA_Measure_ID();

  /** Column name PA_SLA_Measure_UU */
  public static final String COLUMNNAME_PA_SLA_Measure_UU = "PA_SLA_Measure_UU";

  /** Set PA_SLA_Measure_UU */
  public void setPA_SLA_Measure_UU(String PA_SLA_Measure_UU);

  /** Get PA_SLA_Measure_UU */
  public String getPA_SLA_Measure_UU();

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

  /** Column name Record_ID */
  public static final String COLUMNNAME_Record_ID = "Record_ID";

  /** Set Record ID. Direct internal record ID */
  public void setRecord_ID(int Record_ID);

  /** Get Record ID. Direct internal record ID */
  public int getRecord_ID();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}
