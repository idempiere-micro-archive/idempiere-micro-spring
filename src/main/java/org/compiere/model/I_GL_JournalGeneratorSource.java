package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for GL_JournalGeneratorSource
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_GL_JournalGeneratorSource {

  /** TableName=GL_JournalGeneratorSource */
  public static final String Table_Name = "GL_JournalGeneratorSource";

  /** AD_Table_ID=200023 */
  public static final int Table_ID = 200023;

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

  /** Column name AmtMultiplier */
  public static final String COLUMNNAME_AmtMultiplier = "AmtMultiplier";

  /** Set Multiplier Amount. Multiplier Amount for generating commissions */
  public void setAmtMultiplier(BigDecimal AmtMultiplier);

  /** Get Multiplier Amount. Multiplier Amount for generating commissions */
  public BigDecimal getAmtMultiplier();

  /** Column name C_ElementValue_ID */
  public static final String COLUMNNAME_C_ElementValue_ID = "C_ElementValue_ID";

  /** Set Account Element. Account Element */
  public void setC_ElementValue_ID(int C_ElementValue_ID);

  /** Get Account Element. Account Element */
  public int getC_ElementValue_ID();

  public I_C_ElementValue getC_ElementValue() throws RuntimeException;

  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  public int getCreatedBy();

  /** Column name GL_Category_ID */
  public static final String COLUMNNAME_GL_Category_ID = "GL_Category_ID";

  /** Set GL Category. General Ledger Category */
  public void setGL_Category_ID(int GL_Category_ID);

  /** Get GL Category. General Ledger Category */
  public int getGL_Category_ID();

  public I_GL_Category getGL_Category() throws RuntimeException;

  /** Column name GL_JournalGeneratorLine_ID */
  public static final String COLUMNNAME_GL_JournalGeneratorLine_ID = "GL_JournalGeneratorLine_ID";

  /** Set Generator Line */
  public void setGL_JournalGeneratorLine_ID(int GL_JournalGeneratorLine_ID);

  /** Get Generator Line */
  public int getGL_JournalGeneratorLine_ID();

  public I_GL_JournalGeneratorLine getGL_JournalGeneratorLine() throws RuntimeException;

  /** Column name GL_JournalGeneratorSource_ID */
  public static final String COLUMNNAME_GL_JournalGeneratorSource_ID =
      "GL_JournalGeneratorSource_ID";

  /** Set Generator Source */
  public void setGL_JournalGeneratorSource_ID(int GL_JournalGeneratorSource_ID);

  /** Get Generator Source */
  public int getGL_JournalGeneratorSource_ID();

  /** Column name GL_JournalGeneratorSource_UU */
  public static final String COLUMNNAME_GL_JournalGeneratorSource_UU =
      "GL_JournalGeneratorSource_UU";

  /** Set GL_JournalGeneratorSource_UU */
  public void setGL_JournalGeneratorSource_UU(String GL_JournalGeneratorSource_UU);

  /** Get GL_JournalGeneratorSource_UU */
  public String getGL_JournalGeneratorSource_UU();

  /** Column name Help */
  public static final String COLUMNNAME_Help = "Help";

  /** Set Comment/Help. Comment or Hint */
  public void setHelp(String Help);

  /** Get Comment/Help. Comment or Hint */
  public String getHelp();

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name RoundFactor */
  public static final String COLUMNNAME_RoundFactor = "RoundFactor";

  /** Set Round Factor */
  public void setRoundFactor(int RoundFactor);

  /** Get Round Factor */
  public int getRoundFactor();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}
