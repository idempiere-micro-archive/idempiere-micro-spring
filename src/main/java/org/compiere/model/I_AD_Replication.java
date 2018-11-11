package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Replication
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Replication {

  /** TableName=AD_Replication */
  public static final String Table_Name = "AD_Replication";

  /** AD_Table_ID=605 */
  public static final int Table_ID = 605;

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

  /** Column name AD_Replication_ID */
  public static final String COLUMNNAME_AD_Replication_ID = "AD_Replication_ID";

  /** Set Replication. Data Replication Target */
  public void setAD_Replication_ID(int AD_Replication_ID);

  /** Get Replication. Data Replication Target */
  public int getAD_Replication_ID();

  /** Column name AD_ReplicationStrategy_ID */
  public static final String COLUMNNAME_AD_ReplicationStrategy_ID = "AD_ReplicationStrategy_ID";

  /** Set Replication Strategy. Data Replication Strategy */
  public void setADReplicationStrategyID(int AD_ReplicationStrategy_ID);

  /** Get Replication Strategy. Data Replication Strategy */
  public int getADReplicationStrategyID();

  public I_AD_ReplicationStrategy getADReplicationStrategy() throws RuntimeException;

  /** Column name AD_Replication_UU */
  public static final String COLUMNNAME_AD_Replication_UU = "AD_Replication_UU";

  /** Set AD_Replication_UU */
  public void setAD_Replication_UU(String AD_Replication_UU);

  /** Get AD_Replication_UU */
  public String getAD_Replication_UU();

  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  public int getCreatedBy();

  /** Column name DateLastRun */
  public static final String COLUMNNAME_DateLastRun = "DateLastRun";

  /** Set Date last run. Date the process was last run. */
  public void setDateLastRun(Timestamp DateLastRun);

  /** Get Date last run. Date the process was last run. */
  public Timestamp getDateLastRun();

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

  /** Column name HostAddress */
  public static final String COLUMNNAME_HostAddress = "HostAddress";

  /** Set Host Address. Host Address URL or DNS */
  public void setHostAddress(String HostAddress);

  /** Get Host Address. Host Address URL or DNS */
  public String getHostAddress();

  /** Column name HostPort */
  public static final String COLUMNNAME_HostPort = "HostPort";

  /** Set Host port. Host Communication Port */
  public void setHostPort(int HostPort);

  /** Get Host port. Host Communication Port */
  public int getHostPort();

  /** Column name IDRangeEnd */
  public static final String COLUMNNAME_IDRangeEnd = "IDRangeEnd";

  /** Set ID Range End. End if the ID Range used */
  public void setIDRangeEnd(BigDecimal IDRangeEnd);

  /** Get ID Range End. End if the ID Range used */
  public BigDecimal getIDRangeEnd();

  /** Column name IDRangeStart */
  public static final String COLUMNNAME_IDRangeStart = "IDRangeStart";

  /** Set ID Range Start. Start of the ID Range used */
  public void setIDRangeStart(BigDecimal IDRangeStart);

  /** Get ID Range Start. Start of the ID Range used */
  public BigDecimal getIDRangeStart();

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name IsRMIoverHTTP */
  public static final String COLUMNNAME_IsRMIoverHTTP = "IsRMIoverHTTP";

  /** Set Tunnel via HTTP. Connect to Server via HTTP Tunnel */
  public void setIsRMIoverHTTP(boolean IsRMIoverHTTP);

  /** Get Tunnel via HTTP. Connect to Server via HTTP Tunnel */
  public boolean isRMIoverHTTP();

  /** Set Name. Alphanumeric identifier of the entity */
  public void setName(String Name);

  /** Get Name. Alphanumeric identifier of the entity */
  public String getName();

  /** Column name Prefix */
  public static final String COLUMNNAME_Prefix = "Prefix";

  /** Set Prefix. Prefix before the sequence number */
  public void setPrefix(String Prefix);

  /** Get Prefix. Prefix before the sequence number */
  public String getPrefix();

  /** Column name Processing */
  public static final String COLUMNNAME_Processing = "Processing";

  /** Set Process Now */
  public void setProcessing(boolean Processing);

  /** Get Process Now */
  public boolean isProcessing();

  /** Column name Remote_Client_ID */
  public static final String COLUMNNAME_Remote_Client_ID = "Remote_Client_ID";

  /** Set Remote Client. Remote Client to be used to replicate / synchronize data with. */
  public void setRemote_Client_ID(int Remote_Client_ID);

  /** Get Remote Client. Remote Client to be used to replicate / synchronize data with. */
  public int getRemote_Client_ID();

  /** Column name Remote_Org_ID */
  public static final String COLUMNNAME_Remote_Org_ID = "Remote_Org_ID";

  /**
   * Set Remote Organization. Remote Organization to be used to replicate / synchronize data with.
   */
  public void setRemote_Org_ID(int Remote_Org_ID);

  /**
   * Get Remote Organization. Remote Organization to be used to replicate / synchronize data with.
   */
  public int getRemote_Org_ID();

  /** Column name Suffix */
  public static final String COLUMNNAME_Suffix = "Suffix";

  /** Set Suffix. Suffix after the number */
  public void setSuffix(String Suffix);

  /** Get Suffix. Suffix after the number */
  public String getSuffix();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}
