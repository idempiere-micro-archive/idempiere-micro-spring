package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/** Generated Interface for K_IndexLog
 *  @author iDempiere (generated) 
 *  @version Release 5.1
 */
public interface I_K_IndexLog 
{

    /** TableName=K_IndexLog */
    public static final String Table_Name = "K_IndexLog";

    /** AD_Table_ID=899 */
    public static final int Table_ID = 899;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 6 - System - Client 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

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

    /** Column name IndexQuery */
    public static final String COLUMNNAME_IndexQuery = "IndexQuery";

	/** Set Index Query.
	  * Text Search Query 
	  */
	public void setIndexQuery (String IndexQuery);

	/** Get Index Query.
	  * Text Search Query 
	  */
	public String getIndexQuery();

    /** Column name IndexQueryResult */
    public static final String COLUMNNAME_IndexQueryResult = "IndexQueryResult";

	/** Set Query Result.
	  * Result of the text query
	  */
	public void setIndexQueryResult (int IndexQueryResult);

	/** Get Query Result.
	  * Result of the text query
	  */
	public int getIndexQueryResult();

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

    /** Column name K_IndexLog_ID */
    public static final String COLUMNNAME_K_IndexLog_ID = "K_IndexLog_ID";

	/** Set Index Log.
	  * Text search log
	  */
	public void setK_IndexLog_ID (int K_IndexLog_ID);

	/** Get Index Log.
	  * Text search log
	  */
	public int getK_IndexLog_ID();

    /** Column name K_IndexLog_UU */
    public static final String COLUMNNAME_K_IndexLog_UU = "K_IndexLog_UU";

	/** Set K_IndexLog_UU	  */
	public void setK_IndexLog_UU (String K_IndexLog_UU);

	/** Get K_IndexLog_UU	  */
	public String getK_IndexLog_UU();

    /** Column name QuerySource */
    public static final String COLUMNNAME_QuerySource = "QuerySource";

	/** Set Query Source.
	  * Source of the Query
	  */
	public void setQuerySource (String QuerySource);

	/** Get Query Source.
	  * Source of the Query
	  */
	public String getQuerySource();

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