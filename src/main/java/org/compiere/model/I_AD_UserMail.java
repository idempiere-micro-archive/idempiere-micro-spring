package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_UserMail
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_UserMail {

  /** TableName=AD_UserMail */
  public static final String Table_Name = "AD_UserMail";

  /** AD_Table_ID=782 */
  public static final int Table_ID = 782;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Get Client. Client/Tenant for this installation. */
  public int getADClientID();

  /** Column name AD_Org_ID */
  public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  public void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  public int getAD_Org_ID();

  /** Column name AD_User_ID */
  public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";

  /** Set User/Contact. User within the system - Internal or Business Partner Contact */
  public void setAD_User_ID(int AD_User_ID);

  /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  public int getAD_User_ID();

  public I_AD_User getAD_User() throws RuntimeException;

  /** Column name AD_UserMail_ID */
  public static final String COLUMNNAME_AD_UserMail_ID = "AD_UserMail_ID";

  /** Set User Mail. Mail sent to the user */
  public void setAD_UserMail_ID(int AD_UserMail_ID);

  /** Get User Mail. Mail sent to the user */
  public int getAD_UserMail_ID();

  /** Column name AD_UserMail_UU */
  public static final String COLUMNNAME_AD_UserMail_UU = "AD_UserMail_UU";

  /** Set AD_UserMail_UU */
  public void setAD_UserMail_UU(String AD_UserMail_UU);

  /** Get AD_UserMail_UU */
  public String getAD_UserMail_UU();

  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  public int getCreatedBy();

  /** Column name DeliveryConfirmation */
  public static final String COLUMNNAME_DeliveryConfirmation = "DeliveryConfirmation";

  /** Set Delivery Confirmation. EMail Delivery confirmation */
  public void setDeliveryConfirmation(String DeliveryConfirmation);

  /** Get Delivery Confirmation. EMail Delivery confirmation */
  public String getDeliveryConfirmation();

  /** Column name EMailFrom */
  public static final String COLUMNNAME_EMailFrom = "EMailFrom";

  /** Set EMail sent from */
  public void setEMailFrom(String EMailFrom);

  /** Get EMail sent from */
  public String getEMailFrom();

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name IsDelivered */
  public static final String COLUMNNAME_IsDelivered = "IsDelivered";

  /** Set Delivered */
  public void setIsDelivered(String IsDelivered);

  /** Get Delivered */
  public String getIsDelivered();

  /** Column name MailText */
  public static final String COLUMNNAME_MailText = "MailText";

  /** Set Mail Text. Text used for Mail message */
  public void setMailText(String MailText);

  /** Get Mail Text. Text used for Mail message */
  public String getMailText();

  /** Column name MessageID */
  public static final String COLUMNNAME_MessageID = "MessageID";

  /** Set Message ID. EMail Message ID */
  public void setMessageID(String MessageID);

  /** Get Message ID. EMail Message ID */
  public String getMessageID();

  /** Column name RecipientBcc */
  public static final String COLUMNNAME_RecipientBcc = "RecipientBcc";

  /** Set Bcc */
  public void setRecipientBcc(String RecipientBcc);

  /** Get Bcc */
  public String getRecipientBcc();

  /** Column name RecipientCc */
  public static final String COLUMNNAME_RecipientCc = "RecipientCc";

  /** Set Cc */
  public void setRecipientCc(String RecipientCc);

  /** Get Cc */
  public String getRecipientCc();

  /** Column name RecipientTo */
  public static final String COLUMNNAME_RecipientTo = "RecipientTo";

  /** Set To */
  public void setRecipientTo(String RecipientTo);

  /** Get To */
  public String getRecipientTo();

  /** Column name R_MailText_ID */
  public static final String COLUMNNAME_R_MailText_ID = "R_MailText_ID";

  /** Set Mail Template. Text templates for mailings */
  public void setR_MailText_ID(int R_MailText_ID);

  /** Get Mail Template. Text templates for mailings */
  public int getR_MailText_ID();

  public I_R_MailText getR_MailText() throws RuntimeException;

  /** Column name Subject */
  public static final String COLUMNNAME_Subject = "Subject";

  /** Set Subject. Email Message Subject */
  public void setSubject(String Subject);

  /** Get Subject. Email Message Subject */
  public String getSubject();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();

  /** Column name W_MailMsg_ID */
  public static final String COLUMNNAME_W_MailMsg_ID = "W_MailMsg_ID";

  /** Set Mail Message. Web Store Mail Message Template */
  public void setW_MailMsg_ID(int W_MailMsg_ID);

  /** Get Mail Message. Web Store Mail Message Template */
  public int getW_MailMsg_ID();

  public I_W_MailMsg getW_MailMsg() throws RuntimeException;
}
