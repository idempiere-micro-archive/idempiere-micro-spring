package org.idempiere.process;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.I_R_RequestProcessor;
import org.compiere.orm.BasePOName;
import org.compiere.orm.MTable;
import org.idempiere.orm.I_Persistent;
import org.idempiere.orm.POInfo;

public class X_R_RequestProcessor extends BasePOName implements I_R_RequestProcessor, I_Persistent {

  /** */
  private static final long serialVersionUID = 20171031L;

  /** Standard Constructor */
  public X_R_RequestProcessor(Properties ctx, int R_RequestProcessor_ID, String trxName) {
    super(ctx, R_RequestProcessor_ID, trxName);
  }

  /** Load Constructor */
  public X_R_RequestProcessor(Properties ctx, ResultSet rs, String trxName) {
    super(ctx, rs, trxName);
  }

  /**
   * AccessLevel
   *
   * @return 2 - Client
   */
  protected int getAccessLevel() {
    return accessLevel.intValue();
  }

  /** Load Meta Data */
  protected POInfo initPO(Properties ctx) {
    POInfo poi = POInfo.getPOInfo(ctx, Table_ID, get_TrxName());
    return poi;
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("X_R_RequestProcessor[").append(getId()).append("]");
    return sb.toString();
  }

  public org.compiere.model.I_AD_Schedule getAD_Schedule() throws RuntimeException {
    return (org.compiere.model.I_AD_Schedule)
        MTable.get(getCtx(), org.compiere.model.I_AD_Schedule.Table_Name)
            .getPO(getAD_Schedule_ID(), get_TrxName());
  }

  /**
   * Set Schedule.
   *
   * @param AD_Schedule_ID Schedule
   */
  public void setAD_Schedule_ID(int AD_Schedule_ID) {
    if (AD_Schedule_ID < 1) set_Value(COLUMNNAME_AD_Schedule_ID, null);
    else set_Value(COLUMNNAME_AD_Schedule_ID, Integer.valueOf(AD_Schedule_ID));
  }

  /**
   * Get Schedule.
   *
   * @return Schedule
   */
  public int getAD_Schedule_ID() {
    Integer ii = (Integer) get_Value(COLUMNNAME_AD_Schedule_ID);
    if (ii == null) return 0;
    return ii;
  }

  /**
   * Set Date last run.
   *
   * @param DateLastRun Date the process was last run.
   */
  public void setDateLastRun(Timestamp DateLastRun) {
    set_Value(COLUMNNAME_DateLastRun, DateLastRun);
  }

  /**
   * Get Date last run.
   *
   * @return Date the process was last run.
   */
  public Timestamp getDateLastRun() {
    return (Timestamp) get_Value(COLUMNNAME_DateLastRun);
  }

  /**
   * Set Date next run.
   *
   * @param DateNextRun Date the process will run next
   */
  public void setDateNextRun(Timestamp DateNextRun) {
    set_Value(COLUMNNAME_DateNextRun, DateNextRun);
  }

  /**
   * Get Date next run.
   *
   * @return Date the process will run next
   */
  public Timestamp getDateNextRun() {
    return (Timestamp) get_Value(COLUMNNAME_DateNextRun);
  }

  /**
   * Set Description.
   *
   * @param Description Optional short description of the record
   */
  public void setDescription(String Description) {
    set_Value(COLUMNNAME_Description, Description);
  }

  /**
   * Get Description.
   *
   * @return Optional short description of the record
   */
  public String getDescription() {
    return (String) get_Value(COLUMNNAME_Description);
  }

  /**
   * Set Inactivity Alert Days.
   *
   * @param InactivityAlertDays Send Alert when there is no activity after days (0= no alert)
   */
  public void setInactivityAlertDays(int InactivityAlertDays) {
    set_Value(COLUMNNAME_InactivityAlertDays, Integer.valueOf(InactivityAlertDays));
  }

  /**
   * Get Inactivity Alert Days.
   *
   * @return Send Alert when there is no activity after days (0= no alert)
   */
  public int getInactivityAlertDays() {
    Integer ii = (Integer) get_Value(COLUMNNAME_InactivityAlertDays);
    if (ii == null) return 0;
    return ii;
  }

  /**
   * Set Days to keep Log.
   *
   * @param KeepLogDays Number of days to keep the log entries
   */
  public void setKeepLogDays(int KeepLogDays) {
    set_Value(COLUMNNAME_KeepLogDays, Integer.valueOf(KeepLogDays));
  }

  /**
   * Get Days to keep Log.
   *
   * @return Number of days to keep the log entries
   */
  public int getKeepLogDays() {
    Integer ii = (Integer) get_Value(COLUMNNAME_KeepLogDays);
    if (ii == null) return 0;
    return ii;
  }

  /**
   * Set Alert after Days Due.
   *
   * @param OverdueAlertDays Send email alert after number of days due (0=no alerts)
   */
  public void setOverdueAlertDays(int OverdueAlertDays) {
    set_Value(COLUMNNAME_OverdueAlertDays, Integer.valueOf(OverdueAlertDays));
  }

  /**
   * Get Alert after Days Due.
   *
   * @return Send email alert after number of days due (0=no alerts)
   */
  public int getOverdueAlertDays() {
    Integer ii = (Integer) get_Value(COLUMNNAME_OverdueAlertDays);
    if (ii == null) return 0;
    return ii;
  }

  /**
   * Set Escalate after Days Due.
   *
   * @param OverdueAssignDays Escalation to superior after number of due days (0 = no)
   */
  public void setOverdueAssignDays(int OverdueAssignDays) {
    set_Value(COLUMNNAME_OverdueAssignDays, Integer.valueOf(OverdueAssignDays));
  }

  /**
   * Get Escalate after Days Due.
   *
   * @return Escalation to superior after number of due days (0 = no)
   */
  public int getOverdueAssignDays() {
    Integer ii = (Integer) get_Value(COLUMNNAME_OverdueAssignDays);
    if (ii == null) return 0;
    return ii;
  }

  /**
   * Set Process Now.
   *
   * @param Processing Process Now
   */
  public void setProcessing(boolean Processing) {
    set_Value(COLUMNNAME_Processing, Boolean.valueOf(Processing));
  }

  /**
   * Get Process Now.
   *
   * @return Process Now
   */
  public boolean isProcessing() {
    Object oo = get_Value(COLUMNNAME_Processing);
    if (oo != null) {
      if (oo instanceof Boolean) return ((Boolean) oo).booleanValue();
      return "Y".equals(oo);
    }
    return false;
  }

  /**
   * Set Reminder Days.
   *
   * @param RemindDays Days between sending Reminder Emails for a due or inactive Document
   */
  public void setRemindDays(int RemindDays) {
    set_Value(COLUMNNAME_RemindDays, Integer.valueOf(RemindDays));
  }

  /**
   * Get Reminder Days.
   *
   * @return Days between sending Reminder Emails for a due or inactive Document
   */
  public int getRemindDays() {
    Integer ii = (Integer) get_Value(COLUMNNAME_RemindDays);
    if (ii == null) return 0;
    return ii;
  }

  /**
   * Set Request Processor.
   *
   * @param R_RequestProcessor_ID Processor for Requests
   */
  public void setR_RequestProcessor_ID(int R_RequestProcessor_ID) {
    if (R_RequestProcessor_ID < 1) set_ValueNoCheck(COLUMNNAME_R_RequestProcessor_ID, null);
    else set_ValueNoCheck(COLUMNNAME_R_RequestProcessor_ID, Integer.valueOf(R_RequestProcessor_ID));
  }

  /**
   * Get Request Processor.
   *
   * @return Processor for Requests
   */
  public int getR_RequestProcessor_ID() {
    Integer ii = (Integer) get_Value(COLUMNNAME_R_RequestProcessor_ID);
    if (ii == null) return 0;
    return ii;
  }

  /**
   * Set R_RequestProcessor_UU.
   *
   * @param R_RequestProcessor_UU R_RequestProcessor_UU
   */
  public void setR_RequestProcessor_UU(String R_RequestProcessor_UU) {
    set_Value(COLUMNNAME_R_RequestProcessor_UU, R_RequestProcessor_UU);
  }

  /**
   * Get R_RequestProcessor_UU.
   *
   * @return R_RequestProcessor_UU
   */
  public String getR_RequestProcessor_UU() {
    return (String) get_Value(COLUMNNAME_R_RequestProcessor_UU);
  }

  public org.compiere.model.I_R_RequestType getR_RequestType() throws RuntimeException {
    return (org.compiere.model.I_R_RequestType)
        MTable.get(getCtx(), org.compiere.model.I_R_RequestType.Table_Name)
            .getPO(getR_RequestType_ID(), get_TrxName());
  }

  /**
   * Set Request Type.
   *
   * @param R_RequestType_ID Type of request (e.g. Inquiry, Complaint, ..)
   */
  public void setR_RequestType_ID(int R_RequestType_ID) {
    if (R_RequestType_ID < 1) set_Value(COLUMNNAME_R_RequestType_ID, null);
    else set_Value(COLUMNNAME_R_RequestType_ID, Integer.valueOf(R_RequestType_ID));
  }

  /**
   * Get Request Type.
   *
   * @return Type of request (e.g. Inquiry, Complaint, ..)
   */
  public int getR_RequestType_ID() {
    Integer ii = (Integer) get_Value(COLUMNNAME_R_RequestType_ID);
    if (ii == null) return 0;
    return ii;
  }

  public org.compiere.model.I_AD_User getSupervisor() throws RuntimeException {
    return (org.compiere.model.I_AD_User)
        MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_Name)
            .getPO(getSupervisor_ID(), get_TrxName());
  }

  /**
   * Set Supervisor.
   *
   * @param Supervisor_ID Supervisor for this user/organization - used for escalation and approval
   */
  public void setSupervisor_ID(int Supervisor_ID) {
    if (Supervisor_ID < 1) set_Value(COLUMNNAME_Supervisor_ID, null);
    else set_Value(COLUMNNAME_Supervisor_ID, Integer.valueOf(Supervisor_ID));
  }

  /**
   * Get Supervisor.
   *
   * @return Supervisor for this user/organization - used for escalation and approval
   */
  public int getSupervisor_ID() {
    Integer ii = (Integer) get_Value(COLUMNNAME_Supervisor_ID);
    if (ii == null) return 0;
    return ii;
  }
}
