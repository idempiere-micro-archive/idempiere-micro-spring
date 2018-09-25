
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/** Generated Interface for A_Depreciation_Method
 *  @author iDempiere (generated) 
 *  @version Release 5.1
 */
public interface I_A_Depreciation_Method 
{

    /** TableName=A_Depreciation_Method */
    public static final String Table_Name = "A_Depreciation_Method";

    /** AD_Table_ID=53124 */
    public static final int Table_ID = 53124;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 7 - System - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    
    

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name A_Depreciation_Method_ID */
    public static final String COLUMNNAME_A_Depreciation_Method_ID = "A_Depreciation_Method_ID";

	/** Set Depreciation Method	  */
	public void setA_Depreciation_Method_ID (int A_Depreciation_Method_ID);

	/** Get Depreciation Method	  */
	public int getA_Depreciation_Method_ID();

    /** Column name A_Depreciation_Method_UU */
    public static final String COLUMNNAME_A_Depreciation_Method_UU = "A_Depreciation_Method_UU";

	/** Set A_Depreciation_Method_UU	  */
	public void setA_Depreciation_Method_UU (String A_Depreciation_Method_UU);

	/** Get A_Depreciation_Method_UU	  */
	public String getA_Depreciation_Method_UU();

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

    /** Column name DepreciationType */
    public static final String COLUMNNAME_DepreciationType = "DepreciationType";

	/** Set DepreciationType	  */
	public void setDepreciationType (String DepreciationType);

	/** Get DepreciationType	  */
	public String getDepreciationType();

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

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

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

    /** Column name Processed */
    public static final String COLUMNNAME_Processed = "Processed";

	/** Set Processed.
	  * The document has been processed
	  */
	public void setProcessed (boolean Processed);

	/** Get Processed.
	  * The document has been processed
	  */
	public boolean isProcessed();

    /** Column name Text */
    public static final String COLUMNNAME_Text = "Text";

	/** Set Description	  */
	public void setText (String Text);

	/** Get Description	  */
	public String getText();

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
