package org.compiere.production;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.I_M_Locator;
import org.compiere.model.I_M_Production;
import org.compiere.orm.BasePOName;
import org.compiere.orm.MTable;
import org.idempiere.common.util.Env;
import org.idempiere.orm.I_Persistent;
import org.idempiere.orm.POInfo;

/**
 * Generated Model for M_Production
 *
 * @author iDempiere (generated)
 * @version Release 5.1 - $Id$
 */
public class X_M_Production extends BasePOName implements I_Persistent {

  /** */
  private static final long serialVersionUID = 20171031L;

  /** Standard Constructor */
  public X_M_Production(Properties ctx, int M_Production_ID, String trxName) {
    super(ctx, M_Production_ID, trxName);
  }

  /** Load Constructor */
  public X_M_Production(Properties ctx, ResultSet rs, String trxName) {
    super(ctx, rs, trxName);
  }

  /**
   * AccessLevel
   *
   * @return 1 - Org
   */
  protected int getAccessLevel() {
    return I_M_Production.accessLevel.intValue();
  }

  /** Load Meta Data */
  protected POInfo initPO(Properties ctx) {
    POInfo poi = POInfo.getPOInfo(ctx, I_M_Production.Table_ID, get_TrxName());
    return poi;
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("X_M_Production[").append(getId()).append("]");
    return sb.toString();
  }

  /**
   * Set Trx Organization.
   *
   * @param AD_OrgTrx_ID Performing or initiating organization
   */
  public void setAD_OrgTrx_ID(int AD_OrgTrx_ID) {
    if (AD_OrgTrx_ID < 1) set_Value(I_M_Production.COLUMNNAME_AD_OrgTrx_ID, null);
    else set_Value(I_M_Production.COLUMNNAME_AD_OrgTrx_ID, Integer.valueOf(AD_OrgTrx_ID));
  }

  /**
   * Get Trx Organization.
   *
   * @return Performing or initiating organization
   */
  public int getAD_OrgTrx_ID() {
    Integer ii = (Integer) get_Value(I_M_Production.COLUMNNAME_AD_OrgTrx_ID);
    if (ii == null) return 0;
    return ii;
  }

  public org.compiere.model.I_C_Activity getC_Activity() throws RuntimeException {
    return (org.compiere.model.I_C_Activity)
        MTable.get(getCtx(), org.compiere.model.I_C_Activity.Table_Name)
            .getPO(getC_Activity_ID(), get_TrxName());
  }

  /**
   * Set Activity.
   *
   * @param C_Activity_ID Business Activity
   */
  public void setC_Activity_ID(int C_Activity_ID) {
    if (C_Activity_ID < 1) set_Value(I_M_Production.COLUMNNAME_C_Activity_ID, null);
    else set_Value(I_M_Production.COLUMNNAME_C_Activity_ID, Integer.valueOf(C_Activity_ID));
  }

  /**
   * Get Activity.
   *
   * @return Business Activity
   */
  public int getC_Activity_ID() {
    Integer ii = (Integer) get_Value(I_M_Production.COLUMNNAME_C_Activity_ID);
    if (ii == null) return 0;
    return ii;
  }

  public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException {
    return (org.compiere.model.I_C_BPartner)
        MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_Name)
            .getPO(getC_BPartner_ID(), get_TrxName());
  }

  /**
   * Set Business Partner .
   *
   * @param C_BPartner_ID Identifies a Business Partner
   */
  public void setC_BPartner_ID(int C_BPartner_ID) {
    if (C_BPartner_ID < 1) set_ValueNoCheck(I_M_Production.COLUMNNAME_C_BPartner_ID, null);
    else set_ValueNoCheck(I_M_Production.COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
  }

  /**
   * Get Business Partner .
   *
   * @return Identifies a Business Partner
   */
  public int getC_BPartner_ID() {
    Integer ii = (Integer) get_Value(I_M_Production.COLUMNNAME_C_BPartner_ID);
    if (ii == null) return 0;
    return ii;
  }

  public org.compiere.model.I_C_Campaign getC_Campaign() throws RuntimeException {
    return (org.compiere.model.I_C_Campaign)
        MTable.get(getCtx(), org.compiere.model.I_C_Campaign.Table_Name)
            .getPO(getC_Campaign_ID(), get_TrxName());
  }

  /**
   * Set Campaign.
   *
   * @param C_Campaign_ID Marketing Campaign
   */
  public void setC_Campaign_ID(int C_Campaign_ID) {
    if (C_Campaign_ID < 1) set_Value(I_M_Production.COLUMNNAME_C_Campaign_ID, null);
    else set_Value(I_M_Production.COLUMNNAME_C_Campaign_ID, Integer.valueOf(C_Campaign_ID));
  }

  /**
   * Get Campaign.
   *
   * @return Marketing Campaign
   */
  public int getC_Campaign_ID() {
    Integer ii = (Integer) get_Value(I_M_Production.COLUMNNAME_C_Campaign_ID);
    if (ii == null) return 0;
    return ii;
  }

  public org.compiere.model.I_C_OrderLine getC_OrderLine() throws RuntimeException {
    return (org.compiere.model.I_C_OrderLine)
        MTable.get(getCtx(), org.compiere.model.I_C_OrderLine.Table_Name)
            .getPO(getC_OrderLine_ID(), get_TrxName());
  }

  /**
   * Set Sales Order Line.
   *
   * @param C_OrderLine_ID Sales Order Line
   */
  public void setC_OrderLine_ID(int C_OrderLine_ID) {
    if (C_OrderLine_ID < 1) set_Value(I_M_Production.COLUMNNAME_C_OrderLine_ID, null);
    else set_Value(I_M_Production.COLUMNNAME_C_OrderLine_ID, Integer.valueOf(C_OrderLine_ID));
  }

  /**
   * Get Sales Order Line.
   *
   * @return Sales Order Line
   */
  public int getC_OrderLine_ID() {
    Integer ii = (Integer) get_Value(I_M_Production.COLUMNNAME_C_OrderLine_ID);
    if (ii == null) return 0;
    return ii;
  }

  public org.compiere.model.I_C_Project getC_Project() throws RuntimeException {
    return (org.compiere.model.I_C_Project)
        MTable.get(getCtx(), org.compiere.model.I_C_Project.Table_Name)
            .getPO(getC_Project_ID(), get_TrxName());
  }

  /**
   * Set Project.
   *
   * @param C_Project_ID Financial Project
   */
  public void setC_Project_ID(int C_Project_ID) {
    if (C_Project_ID < 1) set_Value(I_M_Production.COLUMNNAME_C_Project_ID, null);
    else set_Value(I_M_Production.COLUMNNAME_C_Project_ID, Integer.valueOf(C_Project_ID));
  }

  /**
   * Get Project.
   *
   * @return Financial Project
   */
  public int getC_Project_ID() {
    Integer ii = (Integer) get_Value(I_M_Production.COLUMNNAME_C_Project_ID);
    if (ii == null) return 0;
    return ii;
  }

  public org.compiere.model.I_C_ProjectPhase getC_ProjectPhase() throws RuntimeException {
    return (org.compiere.model.I_C_ProjectPhase)
        MTable.get(getCtx(), org.compiere.model.I_C_ProjectPhase.Table_Name)
            .getPO(getC_ProjectPhase_ID(), get_TrxName());
  }

  /**
   * Set Project Phase.
   *
   * @param C_ProjectPhase_ID Phase of a Project
   */
  public void setC_ProjectPhase_ID(int C_ProjectPhase_ID) {
    if (C_ProjectPhase_ID < 1) set_ValueNoCheck(I_M_Production.COLUMNNAME_C_ProjectPhase_ID, null);
    else
      set_ValueNoCheck(
          I_M_Production.COLUMNNAME_C_ProjectPhase_ID, Integer.valueOf(C_ProjectPhase_ID));
  }

  /**
   * Get Project Phase.
   *
   * @return Phase of a Project
   */
  public int getC_ProjectPhase_ID() {
    Integer ii = (Integer) get_Value(I_M_Production.COLUMNNAME_C_ProjectPhase_ID);
    if (ii == null) return 0;
    return ii;
  }

  public org.compiere.model.I_C_ProjectTask getC_ProjectTask() throws RuntimeException {
    return (org.compiere.model.I_C_ProjectTask)
        MTable.get(getCtx(), org.compiere.model.I_C_ProjectTask.Table_Name)
            .getPO(getC_ProjectTask_ID(), get_TrxName());
  }

  /**
   * Set Project Task.
   *
   * @param C_ProjectTask_ID Actual Project Task in a Phase
   */
  public void setC_ProjectTask_ID(int C_ProjectTask_ID) {
    if (C_ProjectTask_ID < 1) set_ValueNoCheck(I_M_Production.COLUMNNAME_C_ProjectTask_ID, null);
    else
      set_ValueNoCheck(
          I_M_Production.COLUMNNAME_C_ProjectTask_ID, Integer.valueOf(C_ProjectTask_ID));
  }

  /**
   * Get Project Task.
   *
   * @return Actual Project Task in a Phase
   */
  public int getC_ProjectTask_ID() {
    Integer ii = (Integer) get_Value(I_M_Production.COLUMNNAME_C_ProjectTask_ID);
    if (ii == null) return 0;
    return ii;
  }

  /**
   * Set Create lines from.
   *
   * @param CreateFrom Process which will generate a new document lines based on an existing
   *     document
   */
  public void setCreateFrom(String CreateFrom) {
    set_Value(I_M_Production.COLUMNNAME_CreateFrom, CreateFrom);
  }

  /**
   * Get Create lines from.
   *
   * @return Process which will generate a new document lines based on an existing document
   */
  public String getCreateFrom() {
    return (String) get_Value(I_M_Production.COLUMNNAME_CreateFrom);
  }

  /**
   * Set Date Promised.
   *
   * @param DatePromised Date Order was promised
   */
  public void setDatePromised(Timestamp DatePromised) {
    set_Value(I_M_Production.COLUMNNAME_DatePromised, DatePromised);
  }

  /**
   * Get Date Promised.
   *
   * @return Date Order was promised
   */
  public Timestamp getDatePromised() {
    return (Timestamp) get_Value(I_M_Production.COLUMNNAME_DatePromised);
  }

  /**
   * Set Description.
   *
   * @param Description Optional short description of the record
   */
  public void setDescription(String Description) {
    set_Value(I_M_Production.COLUMNNAME_Description, Description);
  }

  /**
   * Get Description.
   *
   * @return Optional short description of the record
   */
  public String getDescription() {
    return (String) get_Value(I_M_Production.COLUMNNAME_Description);
  }

  /** DocAction AD_Reference_ID=135 */
  public static final int DOCACTION_AD_Reference_ID = 135;
  /** Complete = CO */
  public static final String DOCACTION_Complete = "CO";
  /** Approve = AP */
  public static final String DOCACTION_Approve = "AP";
  /** Reject = RJ */
  public static final String DOCACTION_Reject = "RJ";
  /** Post = PO */
  public static final String DOCACTION_Post = "PO";
  /** Void = VO */
  public static final String DOCACTION_Void = "VO";
  /** Close = CL */
  public static final String DOCACTION_Close = "CL";
  /** Reverse - Correct = RC */
  public static final String DOCACTION_Reverse_Correct = "RC";
  /** Reverse - Accrual = RA */
  public static final String DOCACTION_Reverse_Accrual = "RA";
  /** Invalidate = IN */
  public static final String DOCACTION_Invalidate = "IN";
  /** Re-activate = RE */
  public static final String DOCACTION_Re_Activate = "RE";
  /** <None> = -- */
  public static final String DOCACTION_None = "--";
  /** Prepare = PR */
  public static final String DOCACTION_Prepare = "PR";
  /** Unlock = XL */
  public static final String DOCACTION_Unlock = "XL";
  /** Wait Complete = WC */
  public static final String DOCACTION_WaitComplete = "WC";
  /**
   * Set Document Action.
   *
   * @param DocAction The targeted status of the document
   */
  public void setDocAction(String DocAction) {

    set_Value(I_M_Production.COLUMNNAME_DocAction, DocAction);
  }

  /**
   * Get Document Action.
   *
   * @return The targeted status of the document
   */
  public String getDocAction() {
    return (String) get_Value(I_M_Production.COLUMNNAME_DocAction);
  }

  /** DocStatus AD_Reference_ID=131 */
  public static final int DOCSTATUS_AD_Reference_ID = 131;
  /** Drafted = DR */
  public static final String DOCSTATUS_Drafted = "DR";
  /** Completed = CO */
  public static final String DOCSTATUS_Completed = "CO";
  /** Approved = AP */
  public static final String DOCSTATUS_Approved = "AP";
  /** Not Approved = NA */
  public static final String DOCSTATUS_NotApproved = "NA";
  /** Voided = VO */
  public static final String DOCSTATUS_Voided = "VO";
  /** Invalid = IN */
  public static final String DOCSTATUS_Invalid = "IN";
  /** Reversed = RE */
  public static final String DOCSTATUS_Reversed = "RE";
  /** Closed = CL */
  public static final String DOCSTATUS_Closed = "CL";
  /** Unknown = ?? */
  public static final String DOCSTATUS_Unknown = "??";
  /** In Progress = IP */
  public static final String DOCSTATUS_InProgress = "IP";
  /** Waiting Payment = WP */
  public static final String DOCSTATUS_WaitingPayment = "WP";
  /** Waiting Confirmation = WC */
  public static final String DOCSTATUS_WaitingConfirmation = "WC";
  /**
   * Set Document Status.
   *
   * @param DocStatus The current status of the document
   */
  public void setDocStatus(String DocStatus) {

    set_Value(I_M_Production.COLUMNNAME_DocStatus, DocStatus);
  }

  /**
   * Get Document Status.
   *
   * @return The current status of the document
   */
  public String getDocStatus() {
    return (String) get_Value(I_M_Production.COLUMNNAME_DocStatus);
  }

  /**
   * Set Document No.
   *
   * @param DocumentNo Document sequence number of the document
   */
  public void setDocumentNo(String DocumentNo) {
    set_ValueNoCheck(I_M_Production.COLUMNNAME_DocumentNo, DocumentNo);
  }

  /**
   * Get Document No.
   *
   * @return Document sequence number of the document
   */
  public String getDocumentNo() {
    return (String) get_Value(I_M_Production.COLUMNNAME_DocumentNo);
  }

  /**
   * Set Complete.
   *
   * @param IsComplete It is complete
   */
  public void setIsComplete(boolean IsComplete) {
    set_Value(I_M_Production.COLUMNNAME_IsComplete, Boolean.valueOf(IsComplete));
  }

  /**
   * Get Complete.
   *
   * @return It is complete
   */
  public boolean isComplete() {
    Object oo = get_Value(I_M_Production.COLUMNNAME_IsComplete);
    if (oo != null) {
      if (oo instanceof Boolean) return ((Boolean) oo).booleanValue();
      return "Y".equals(oo);
    }
    return false;
  }

  /** IsCreated AD_Reference_ID=319 */
  public static final int ISCREATED_AD_Reference_ID = 319;
  /** Yes = Y */
  public static final String ISCREATED_Yes = "Y";
  /** No = N */
  public static final String ISCREATED_No = "N";
  /**
   * Set Records created.
   *
   * @param IsCreated Records created
   */
  public void setIsCreated(String IsCreated) {

    set_Value(I_M_Production.COLUMNNAME_IsCreated, IsCreated);
  }

  /**
   * Get Records created.
   *
   * @return Records created
   */
  public String getIsCreated() {
    return (String) get_Value(I_M_Production.COLUMNNAME_IsCreated);
  }

  /**
   * Set Use Production Plan.
   *
   * @param IsUseProductionPlan Use Production Plan
   */
  public void setIsUseProductionPlan(boolean IsUseProductionPlan) {
    set_Value(I_M_Production.COLUMNNAME_IsUseProductionPlan, IsUseProductionPlan);
  }

  /**
   * Get Use Production Plan.
   *
   * @return Use Production Plan
   */
  public boolean isUseProductionPlan() {
    Object oo = get_Value(I_M_Production.COLUMNNAME_IsUseProductionPlan);
    if (oo != null) {
      if (oo instanceof Boolean) return (Boolean) oo;
      return "Y".equals(oo);
    }
    return false;
  }

  public I_M_Locator getM_Locator() throws RuntimeException {
    return (I_M_Locator)
        MTable.get(getCtx(), I_M_Locator.Table_Name).getPO(getM_Locator_ID(), get_TrxName());
  }

  /**
   * Set Locator.
   *
   * @param M_Locator_ID Warehouse Locator
   */
  public void setM_Locator_ID(int M_Locator_ID) {
    if (M_Locator_ID < 1) set_Value(I_M_Production.COLUMNNAME_M_Locator_ID, null);
    else set_Value(I_M_Production.COLUMNNAME_M_Locator_ID, Integer.valueOf(M_Locator_ID));
  }

  /**
   * Get Locator.
   *
   * @return Warehouse Locator
   */
  public int getM_Locator_ID() {
    Integer ii = (Integer) get_Value(I_M_Production.COLUMNNAME_M_Locator_ID);
    if (ii == null) return 0;
    return ii;
  }

  /**
   * Set Movement Date.
   *
   * @param MovementDate Date a product was moved in or out of inventory
   */
  public void setMovementDate(Timestamp MovementDate) {
    set_Value(I_M_Production.COLUMNNAME_MovementDate, MovementDate);
  }

  /**
   * Get Movement Date.
   *
   * @return Date a product was moved in or out of inventory
   */
  public Timestamp getMovementDate() {
    return (Timestamp) get_Value(I_M_Production.COLUMNNAME_MovementDate);
  }

  public org.compiere.model.I_M_Product getM_Product() throws RuntimeException {
    return (org.compiere.model.I_M_Product)
        MTable.get(getCtx(), org.compiere.model.I_M_Product.Table_Name)
            .getPO(getM_Product_ID(), get_TrxName());
  }

  /**
   * Set Product.
   *
   * @param M_Product_ID Product, Service, Item
   */
  public void setM_Product_ID(int M_Product_ID) {
    if (M_Product_ID < 1) set_Value(I_M_Production.COLUMNNAME_M_Product_ID, null);
    else set_Value(I_M_Production.COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
  }

  /**
   * Get Product.
   *
   * @return Product, Service, Item
   */
  public int getM_Product_ID() {
    Integer ii = (Integer) get_Value(I_M_Production.COLUMNNAME_M_Product_ID);
    if (ii == null) return 0;
    return ii;
  }

  /**
   * Set Production.
   *
   * @param M_Production_ID Plan for producing a product
   */
  public void setM_Production_ID(int M_Production_ID) {
    if (M_Production_ID < 1) set_ValueNoCheck(I_M_Production.COLUMNNAME_M_Production_ID, null);
    else
      set_ValueNoCheck(I_M_Production.COLUMNNAME_M_Production_ID, Integer.valueOf(M_Production_ID));
  }

  /**
   * Get Production.
   *
   * @return Plan for producing a product
   */
  public int getM_Production_ID() {
    Integer ii = (Integer) get_Value(I_M_Production.COLUMNNAME_M_Production_ID);
    if (ii == null) return 0;
    return ii;
  }

  /**
   * Set M_Production_UU.
   *
   * @param M_Production_UU M_Production_UU
   */
  public void setM_Production_UU(String M_Production_UU) {
    set_Value(I_M_Production.COLUMNNAME_M_Production_UU, M_Production_UU);
  }

  /**
   * Get M_Production_UU.
   *
   * @return M_Production_UU
   */
  public String getM_Production_UU() {
    return (String) get_Value(I_M_Production.COLUMNNAME_M_Production_UU);
  }

  /**
   * Set Posted.
   *
   * @param Posted Posting status
   */
  public void setPosted(boolean Posted) {
    set_Value(I_M_Production.COLUMNNAME_Posted, Boolean.valueOf(Posted));
  }

  /**
   * Get Posted.
   *
   * @return Posting status
   */
  public boolean isPosted() {
    Object oo = get_Value(I_M_Production.COLUMNNAME_Posted);
    if (oo != null) {
      if (oo instanceof Boolean) return ((Boolean) oo).booleanValue();
      return "Y".equals(oo);
    }
    return false;
  }

  /**
   * Set Processed.
   *
   * @param Processed The document has been processed
   */
  public void setProcessed(boolean Processed) {
    set_Value(I_M_Production.COLUMNNAME_Processed, Boolean.valueOf(Processed));
  }

  /**
   * Get Processed.
   *
   * @return The document has been processed
   */
  public boolean isProcessed() {
    Object oo = get_Value(I_M_Production.COLUMNNAME_Processed);
    if (oo != null) {
      if (oo instanceof Boolean) return ((Boolean) oo).booleanValue();
      return "Y".equals(oo);
    }
    return false;
  }

  /**
   * Set Processed On.
   *
   * @param ProcessedOn The date+time (expressed in decimal format) when the document has been
   *     processed
   */
  public void setProcessedOn(BigDecimal ProcessedOn) {
    set_Value(I_M_Production.COLUMNNAME_ProcessedOn, ProcessedOn);
  }

  /**
   * Get Processed On.
   *
   * @return The date+time (expressed in decimal format) when the document has been processed
   */
  public BigDecimal getProcessedOn() {
    BigDecimal bd = (BigDecimal) get_Value(I_M_Production.COLUMNNAME_ProcessedOn);
    if (bd == null) return Env.ZERO;
    return bd;
  }

  /**
   * Set Process Now.
   *
   * @param Processing Process Now
   */
  public void setProcessing(boolean Processing) {
    set_Value(I_M_Production.COLUMNNAME_Processing, Boolean.valueOf(Processing));
  }

  /**
   * Get Process Now.
   *
   * @return Process Now
   */
  public boolean isProcessing() {
    Object oo = get_Value(I_M_Production.COLUMNNAME_Processing);
    if (oo != null) {
      if (oo instanceof Boolean) return ((Boolean) oo).booleanValue();
      return "Y".equals(oo);
    }
    return false;
  }

  /**
   * Set Production Quantity.
   *
   * @param ProductionQty Quantity of products to produce
   */
  public void setProductionQty(BigDecimal ProductionQty) {
    set_Value(I_M_Production.COLUMNNAME_ProductionQty, ProductionQty);
  }

  /**
   * Get Production Quantity.
   *
   * @return Quantity of products to produce
   */
  public BigDecimal getProductionQty() {
    BigDecimal bd = (BigDecimal) get_Value(I_M_Production.COLUMNNAME_ProductionQty);
    if (bd == null) return Env.ZERO;
    return bd;
  }

  public org.compiere.model.I_M_Production getReversal() throws RuntimeException {
    return (org.compiere.model.I_M_Production)
        MTable.get(getCtx(), org.compiere.model.I_M_Production.Table_Name)
            .getPO(getReversal_ID(), get_TrxName());
  }

  /**
   * Set Reversal ID.
   *
   * @param Reversal_ID ID of document reversal
   */
  public void setReversal_ID(int Reversal_ID) {
    if (Reversal_ID < 1) set_Value(I_M_Production.COLUMNNAME_Reversal_ID, null);
    else set_Value(I_M_Production.COLUMNNAME_Reversal_ID, Integer.valueOf(Reversal_ID));
  }

  /**
   * Get Reversal ID.
   *
   * @return ID of document reversal
   */
  public int getReversal_ID() {
    Integer ii = (Integer) get_Value(I_M_Production.COLUMNNAME_Reversal_ID);
    if (ii == null) return 0;
    return ii;
  }

  public org.compiere.model.I_C_ElementValue getUser1() throws RuntimeException {
    return (org.compiere.model.I_C_ElementValue)
        MTable.get(getCtx(), org.compiere.model.I_C_ElementValue.Table_Name)
            .getPO(getUser1_ID(), get_TrxName());
  }

  /**
   * Set User Element List 1.
   *
   * @param User1_ID User defined list element #1
   */
  public void setUser1_ID(int User1_ID) {
    if (User1_ID < 1) set_Value(I_M_Production.COLUMNNAME_User1_ID, null);
    else set_Value(I_M_Production.COLUMNNAME_User1_ID, Integer.valueOf(User1_ID));
  }

  /**
   * Get User Element List 1.
   *
   * @return User defined list element #1
   */
  public int getUser1_ID() {
    Integer ii = (Integer) get_Value(I_M_Production.COLUMNNAME_User1_ID);
    if (ii == null) return 0;
    return ii;
  }

  public org.compiere.model.I_C_ElementValue getUser2() throws RuntimeException {
    return (org.compiere.model.I_C_ElementValue)
        MTable.get(getCtx(), org.compiere.model.I_C_ElementValue.Table_Name)
            .getPO(getUser2_ID(), get_TrxName());
  }

  /**
   * Set User Element List 2.
   *
   * @param User2_ID User defined list element #2
   */
  public void setUser2_ID(int User2_ID) {
    if (User2_ID < 1) set_Value(I_M_Production.COLUMNNAME_User2_ID, null);
    else set_Value(I_M_Production.COLUMNNAME_User2_ID, Integer.valueOf(User2_ID));
  }

  /**
   * Get User Element List 2.
   *
   * @return User defined list element #2
   */
  public int getUser2_ID() {
    Integer ii = (Integer) get_Value(I_M_Production.COLUMNNAME_User2_ID);
    if (ii == null) return 0;
    return ii;
  }
}
