
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/** Generated Interface for AD_InfoProcess
 *  @author iDempiere (generated) 
 *  @version Release 5.1
 */
public interface I_AD_InfoProcess 
{

    /** TableName=AD_InfoProcess */
    public static final String Table_Name = "AD_InfoProcess";

    /** AD_Table_ID=200129 */
    public static final int Table_ID = 200129;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 4 - System 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    
    

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_InfoColumn_ID */
    public static final String COLUMNNAME_AD_InfoColumn_ID = "AD_InfoColumn_ID";

	/** Set Info Column.
	  * Info Window Column
	  */
	public void setAD_InfoColumn_ID (int AD_InfoColumn_ID);

	/** Get Info Column.
	  * Info Window Column
	  */
	public int getAD_InfoColumn_ID();

	public I_AD_InfoColumn getAD_InfoColumn() throws RuntimeException;

    /** Column name AD_InfoProcess_ID */
    public static final String COLUMNNAME_AD_InfoProcess_ID = "AD_InfoProcess_ID";

	/** Set Info Process	  */
	public void setAD_InfoProcess_ID (int AD_InfoProcess_ID);

	/** Get Info Process	  */
	public int getAD_InfoProcess_ID();

    /** Column name AD_InfoProcess_UU */
    public static final String COLUMNNAME_AD_InfoProcess_UU = "AD_InfoProcess_UU";

	/** Set AD_InfoProcess_UU	  */
	public void setAD_InfoProcess_UU (String AD_InfoProcess_UU);

	/** Get AD_InfoProcess_UU	  */
	public String getAD_InfoProcess_UU();

    /** Column name AD_InfoWindow_ID */
    public static final String COLUMNNAME_AD_InfoWindow_ID = "AD_InfoWindow_ID";

	/** Set Info Window.
	  * Info and search/select Window
	  */
	public void setAD_InfoWindow_ID (int AD_InfoWindow_ID);

	/** Get Info Window.
	  * Info and search/select Window
	  */
	public int getAD_InfoWindow_ID();

	public I_AD_InfoWindow getAD_InfoWindow() throws RuntimeException;

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

    /** Column name AD_Process_ID */
    public static final String COLUMNNAME_AD_Process_ID = "AD_Process_ID";

	/** Set Process.
	  * Process or Report
	  */
	public void setAD_Process_ID (int AD_Process_ID);

	/** Get Process.
	  * Process or Report
	  */
	public int getAD_Process_ID();

	public I_AD_Process getAD_Process() throws RuntimeException;

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

    /** Column name DisplayLogic */
    public static final String COLUMNNAME_DisplayLogic = "DisplayLogic";

	/** Set Display Logic.
	  * If the Field is displayed, the result determines if the field is actually displayed
	  */
	public void setDisplayLogic (String DisplayLogic);

	/** Get Display Logic.
	  * If the Field is displayed, the result determines if the field is actually displayed
	  */
	public String getDisplayLogic();

    /** Column name ImageURL */
    public static final String COLUMNNAME_ImageURL = "ImageURL";

	/** Set Image URL.
	  * URL of  image
	  */
	public void setImageURL (String ImageURL);

	/** Get Image URL.
	  * URL of  image
	  */
	public String getImageURL();

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

    /** Column name LayoutType */
    public static final String COLUMNNAME_LayoutType = "LayoutType";

	/** Set LayoutType.
	  * Layout type of info process
	  */
	public void setLayoutType (String LayoutType);

	/** Get LayoutType.
	  * Layout type of info process
	  */
	public String getLayoutType();

    /** Column name SeqNo */
    public static final String COLUMNNAME_SeqNo = "SeqNo";

	/** Set Sequence.
	  * Method of ordering records;
 lowest number comes first
	  */
	public void setSeqNo (int SeqNo);

	/** Get Sequence.
	  * Method of ordering records;
 lowest number comes first
	  */
	public int getSeqNo();

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
