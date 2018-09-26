
package org.eevolution.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.idempiere.common.util.KeyNamePair;

/** Generated Interface for HR_ListVersion
 *  @author iDempiere (generated) 
 *  @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_HR_ListVersion 
{

    /** TableName=HR_ListVersion */
    public static final String Table_Name = "HR_ListVersion";

    /** AD_Table_ID=53100 */
    public static final int Table_ID = 53100;

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

    /** Column name HR_ListBase_ID */
    public static final String COLUMNNAME_HR_ListBase_ID = "HR_ListBase_ID";

	/** Set Payroll List Base	  */
	public void setHR_ListBase_ID (int HR_ListBase_ID);

	/** Get Payroll List Base	  */
	public int getHR_ListBase_ID();

	public org.eevolution.model.I_HR_List getHR_ListBase() throws RuntimeException;

    /** Column name HR_List_ID */
    public static final String COLUMNNAME_HR_List_ID = "HR_List_ID";

	/** Set Payroll List	  */
	public void setHR_List_ID (int HR_List_ID);

	/** Get Payroll List	  */
	public int getHR_List_ID();

	public org.eevolution.model.I_HR_List getHR_List() throws RuntimeException;

    /** Column name HR_ListVersion_ID */
    public static final String COLUMNNAME_HR_ListVersion_ID = "HR_ListVersion_ID";

	/** Set Payroll List Version	  */
	public void setHR_ListVersion_ID (int HR_ListVersion_ID);

	/** Get Payroll List Version	  */
	public int getHR_ListVersion_ID();

    /** Column name HR_ListVersion_UU */
    public static final String COLUMNNAME_HR_ListVersion_UU = "HR_ListVersion_UU";

	/** Set HR_ListVersion_UU	  */
	public void setHR_ListVersion_UU (String HR_ListVersion_UU);

	/** Get HR_ListVersion_UU	  */
	public String getHR_ListVersion_UU();

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

    /** Column name ValidFrom */
    public static final String COLUMNNAME_ValidFrom = "ValidFrom";

	/** Set Valid from.
	  * Valid from including this date (first day)
	  */
	public void setValidFrom (Timestamp ValidFrom);

	/** Get Valid from.
	  * Valid from including this date (first day)
	  */
	public Timestamp getValidFrom();

    /** Column name ValidTo */
    public static final String COLUMNNAME_ValidTo = "ValidTo";

	/** Set Valid to.
	  * Valid to including this date (last day)
	  */
	public void setValidTo (Timestamp ValidTo);

	/** Get Valid to.
	  * Valid to including this date (last day)
	  */
	public Timestamp getValidTo();
}
