
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/** Generated Interface for AD_LdapAccess
 *  @author iDempiere (generated) 
 *  @version Release 5.1
 */
public interface I_AD_LdapAccess 
{

    /** TableName=AD_LdapAccess */
    public static final String Table_Name = "AD_LdapAccess";

    /** AD_Table_ID=904 */
    public static final int Table_ID = 904;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 7 - System - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    
    

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_LdapAccess_ID */
    public static final String COLUMNNAME_AD_LdapAccess_ID = "AD_LdapAccess_ID";

	/** Set Ldap Access.
	  * Ldap Access Log
	  */
	public void setAD_LdapAccess_ID (int AD_LdapAccess_ID);

	/** Get Ldap Access.
	  * Ldap Access Log
	  */
	public int getAD_LdapAccess_ID();

    /** Column name AD_LdapAccess_UU */
    public static final String COLUMNNAME_AD_LdapAccess_UU = "AD_LdapAccess_UU";

	/** Set AD_LdapAccess_UU	  */
	public void setAD_LdapAccess_UU (String AD_LdapAccess_UU);

	/** Get AD_LdapAccess_UU	  */
	public String getAD_LdapAccess_UU();

    /** Column name AD_LdapProcessor_ID */
    public static final String COLUMNNAME_AD_LdapProcessor_ID = "AD_LdapProcessor_ID";

	/** Set Ldap Processor.
	  * LDAP Server to authenticate and authorize external systems based on iDempiere
	  */
	public void setAD_LdapProcessor_ID (int AD_LdapProcessor_ID);

	/** Get Ldap Processor.
	  * LDAP Server to authenticate and authorize external systems based on iDempiere
	  */
	public int getAD_LdapProcessor_ID();

	public I_AD_LdapProcessor getAD_LdapProcessor() throws RuntimeException;

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

    /** Column name AD_User_ID */
    public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";

	/** Set User/Contact.
	  * User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID);

	/** Get User/Contact.
	  * User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID();

	public I_AD_User getAD_User() throws RuntimeException;

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

    /** Column name IsError */
    public static final String COLUMNNAME_IsError = "IsError";

	/** Set Error.
	  * An Error occurred in the execution
	  */
	public void setIsError (boolean IsError);

	/** Get Error.
	  * An Error occurred in the execution
	  */
	public boolean isError();

    /** Column name R_InterestArea_ID */
    public static final String COLUMNNAME_R_InterestArea_ID = "R_InterestArea_ID";

	/** Set Interest Area.
	  * Interest Area or Topic
	  */
	public void setR_InterestArea_ID (int R_InterestArea_ID);

	/** Get Interest Area.
	  * Interest Area or Topic
	  */
	public int getR_InterestArea_ID();

	public I_R_InterestArea getR_InterestArea() throws RuntimeException;

    /** Column name Summary */
    public static final String COLUMNNAME_Summary = "Summary";

	/** Set Summary.
	  * Textual summary of this request
	  */
	public void setSummary (String Summary);

	/** Get Summary.
	  * Textual summary of this request
	  */
	public String getSummary();

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
