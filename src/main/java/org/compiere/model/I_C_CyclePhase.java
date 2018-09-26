
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/** Generated Interface for C_CyclePhase
 *  @author iDempiere (generated) 
 *  @version Release 5.1
 */
public interface I_C_CyclePhase 
{

    /** TableName=C_CyclePhase */
    public static final String Table_Name = "C_CyclePhase";

    /** AD_Table_ID=433 */
    public static final int Table_ID = 433;

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

    /** Column name C_CyclePhase_UU */
    public static final String COLUMNNAME_C_CyclePhase_UU = "C_CyclePhase_UU";

	/** Set C_CyclePhase_UU	  */
	public void setC_CyclePhase_UU (String C_CyclePhase_UU);

	/** Get C_CyclePhase_UU	  */
	public String getC_CyclePhase_UU();

    /** Column name C_CycleStep_ID */
    public static final String COLUMNNAME_C_CycleStep_ID = "C_CycleStep_ID";

	/** Set Cycle Step.
	  * The step for this Cycle
	  */
	public void setC_CycleStep_ID (int C_CycleStep_ID);

	/** Get Cycle Step.
	  * The step for this Cycle
	  */
	public int getC_CycleStep_ID();

	public I_C_CycleStep getC_CycleStep() throws RuntimeException;

    /** Column name C_Phase_ID */
    public static final String COLUMNNAME_C_Phase_ID = "C_Phase_ID";

	/** Set Standard Phase.
	  * Standard Phase of the Project Type
	  */
	public void setC_Phase_ID (int C_Phase_ID);

	/** Get Standard Phase.
	  * Standard Phase of the Project Type
	  */
	public int getC_Phase_ID();

	public I_C_Phase getC_Phase() throws RuntimeException;

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
