package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/** Generated Interface for AD_ImportTemplateAccess
 *  @author iDempiere (generated) 
 *  @version Release 5.1
 */
public interface I_AD_ImportTemplateAccess 
{

    /** TableName=AD_ImportTemplateAccess */
    public static final String Table_Name = "AD_ImportTemplateAccess";

    /** AD_Table_ID=200154 */
    public static final int Table_ID = 200154;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 7 - System - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    
    

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_ImportTemplateAccess_ID */
    public static final String COLUMNNAME_AD_ImportTemplateAccess_ID = "AD_ImportTemplateAccess_ID";

	/** Set Import Template Access	  */
	public void setAD_ImportTemplateAccess_ID (int AD_ImportTemplateAccess_ID);

	/** Get Import Template Access	  */
	public int getAD_ImportTemplateAccess_ID();

    /** Column name AD_ImportTemplateAccess_UU */
    public static final String COLUMNNAME_AD_ImportTemplateAccess_UU = "AD_ImportTemplateAccess_UU";

	/** Set AD_ImportTemplateAccess_UU	  */
	public void setAD_ImportTemplateAccess_UU (String AD_ImportTemplateAccess_UU);

	/** Get AD_ImportTemplateAccess_UU	  */
	public String getAD_ImportTemplateAccess_UU();

    /** Column name AD_ImportTemplate_ID */
    public static final String COLUMNNAME_AD_ImportTemplate_ID = "AD_ImportTemplate_ID";

	/** Set Import Template	  */
	public void setAD_ImportTemplate_ID (int AD_ImportTemplate_ID);

	/** Get Import Template	  */
	public int getAD_ImportTemplate_ID();

	public I_AD_ImportTemplate getAD_ImportTemplate() throws RuntimeException;

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

    /** Column name AD_Role_ID */
    public static final String COLUMNNAME_AD_Role_ID = "AD_Role_ID";

	/** Set Role.
	  * Responsibility Role
	  */
	public void setAD_Role_ID (int AD_Role_ID);

	/** Get Role.
	  * Responsibility Role
	  */
	public int getAD_Role_ID();

	public I_AD_Role getAD_Role() throws RuntimeException;

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

    /** Column name IsAllowInsert */
    public static final String COLUMNNAME_IsAllowInsert = "IsAllowInsert";

	/** Set Allow Insert	  */
	public void setIsAllowInsert (boolean IsAllowInsert);

	/** Get Allow Insert	  */
	public boolean isAllowInsert();

    /** Column name IsAllowMerge */
    public static final String COLUMNNAME_IsAllowMerge = "IsAllowMerge";

	/** Set Allow Merge	  */
	public void setIsAllowMerge (boolean IsAllowMerge);

	/** Get Allow Merge	  */
	public boolean isAllowMerge();

    /** Column name IsAllowUpdate */
    public static final String COLUMNNAME_IsAllowUpdate = "IsAllowUpdate";

	/** Set Allow Update	  */
	public void setIsAllowUpdate (boolean IsAllowUpdate);

	/** Get Allow Update	  */
	public boolean isAllowUpdate();

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