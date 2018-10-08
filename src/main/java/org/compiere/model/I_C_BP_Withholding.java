package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/** Generated Interface for C_BP_Withholding
 *  @author iDempiere (generated) 
 *  @version Release 5.1
 */
public interface I_C_BP_Withholding 
{

    /** TableName=C_BP_Withholding */
    public static final String Table_Name = "C_BP_Withholding";

    /** AD_Table_ID=299 */
    public static final int Table_ID = 299;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    
    

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name C_BPartner_ID */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

	/** Set Business Partner .
	  * Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID);

	/** Get Business Partner .
	  * Identifies a Business Partner
	  */
	public int getC_BPartner_ID();

	public I_C_BPartner getC_BPartner() throws RuntimeException;

    /** Column name C_BP_Withholding_UU */
    public static final String COLUMNNAME_C_BP_Withholding_UU = "C_BP_Withholding_UU";

	/** Set C_BP_Withholding_UU	  */
	public void setC_BP_Withholding_UU (String C_BP_Withholding_UU);

	/** Get C_BP_Withholding_UU	  */
	public String getC_BP_Withholding_UU();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name C_Withholding_ID */
    public static final String COLUMNNAME_C_Withholding_ID = "C_Withholding_ID";

	/** Set Withholding.
	  * Withholding type defined
	  */
	public void setC_Withholding_ID (int C_Withholding_ID);

	/** Get Withholding.
	  * Withholding type defined
	  */
	public int getC_Withholding_ID();

	public I_C_Withholding getC_Withholding() throws RuntimeException;

    /** Column name ExemptReason */
    public static final String COLUMNNAME_ExemptReason = "ExemptReason";

	/** Set Exempt reason.
	  * Reason for not withholding
	  */
	public void setExemptReason (String ExemptReason);

	/** Get Exempt reason.
	  * Reason for not withholding
	  */
	public String getExemptReason();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name IsMandatoryWithholding */
    public static final String COLUMNNAME_IsMandatoryWithholding = "IsMandatoryWithholding";

	/** Set Mandatory Withholding.
	  * Monies must be withheld
	  */
	public void setIsMandatoryWithholding (boolean IsMandatoryWithholding);

	/** Get Mandatory Withholding.
	  * Monies must be withheld
	  */
	public boolean isMandatoryWithholding();

    /** Column name IsTemporaryExempt */
    public static final String COLUMNNAME_IsTemporaryExempt = "IsTemporaryExempt";

	/** Set Temporary exempt.
	  * Temporarily do not withhold taxes
	  */
	public void setIsTemporaryExempt (boolean IsTemporaryExempt);

	/** Get Temporary exempt.
	  * Temporarily do not withhold taxes
	  */
	public boolean isTemporaryExempt();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();
}