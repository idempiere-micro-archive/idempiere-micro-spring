package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_AcctProcessorLog
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_AcctProcessorLog {

  /** TableName=C_AcctProcessorLog */
  public static final String Table_Name = "C_AcctProcessorLog";

  /** AD_Table_ID=694 */
  public static final int Table_ID = 694;

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

  /** Column name BinaryData */
  public static final String COLUMNNAME_BinaryData = "BinaryData";

  /** Set Binary Data. Binary Data */
  public void setBinaryData(byte[] BinaryData);

  /** Get Binary Data. Binary Data */
  public byte[] getBinaryData();

  /** Column name C_AcctProcessor_ID */
  public static final String COLUMNNAME_C_AcctProcessor_ID = "C_AcctProcessor_ID";

  /** Set Accounting Processor. Accounting Processor/Server Parameters */
  public void setC_AcctProcessor_ID(int C_AcctProcessor_ID);

  /** Get Accounting Processor. Accounting Processor/Server Parameters */
  public int getC_AcctProcessor_ID();

  public I_C_AcctProcessor getC_AcctProcessor() throws RuntimeException;

  /** Column name C_AcctProcessorLog_ID */
  public static final String COLUMNNAME_C_AcctProcessorLog_ID = "C_AcctProcessorLog_ID";

  /** Set Accounting Processor Log. Result of the execution of the Accounting Processor */
  public void setC_AcctProcessorLog_ID(int C_AcctProcessorLog_ID);

  /** Get Accounting Processor Log. Result of the execution of the Accounting Processor */
  public int getC_AcctProcessorLog_ID();

  /** Column name C_AcctProcessorLog_UU */
  public static final String COLUMNNAME_C_AcctProcessorLog_UU = "C_AcctProcessorLog_UU";

  /** Set C_AcctProcessorLog_UU */
  public void setC_AcctProcessorLog_UU(String C_AcctProcessorLog_UU);

  /** Get C_AcctProcessorLog_UU */
  public String getC_AcctProcessorLog_UU();

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

  /** Column name IsError */
  public static final String COLUMNNAME_IsError = "IsError";

  /** Set Error. An Error occurred in the execution */
  public void setIsError(boolean IsError);

  /** Get Error. An Error occurred in the execution */
  public boolean isError();

  /** Column name Reference */
  public static final String COLUMNNAME_Reference = "Reference";

  /** Set Reference. Reference for this record */
  public void setReference(String Reference);

  /** Get Reference. Reference for this record */
  public String getReference();

  /** Column name Summary */
  public static final String COLUMNNAME_Summary = "Summary";

  /** Set Summary. Textual summary of this request */
  public void setSummary(String Summary);

  /** Get Summary. Textual summary of this request */
  public String getSummary();

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
