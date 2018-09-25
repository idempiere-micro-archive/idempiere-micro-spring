
package org.eevolution.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.idempiere.common.util.KeyNamePair;

/** Generated Interface for PP_Order_NodeNext
 *  @author iDempiere (generated) 
 *  @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_PP_Order_NodeNext 
{

    /** TableName=PP_Order_NodeNext */
    public static final String Table_Name = "PP_Order_NodeNext";

    /** AD_Table_ID=53023 */
    public static final int Table_ID = 53023;

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

    /** Column name AD_WF_Next_ID */
    public static final String COLUMNNAME_AD_WF_Next_ID = "AD_WF_Next_ID";

	/** Set Next Node.
	  * Next Node in workflow
	  */
	public void setAD_WF_Next_ID (int AD_WF_Next_ID);

	/** Get Next Node.
	  * Next Node in workflow
	  */
	public int getAD_WF_Next_ID();

	public org.compiere.model.I_AD_WF_Node getAD_WF_Next() throws RuntimeException;

    /** Column name AD_WF_Node_ID */
    public static final String COLUMNNAME_AD_WF_Node_ID = "AD_WF_Node_ID";

	/** Set Node.
	  * Workflow Node (activity), step or process
	  */
	public void setAD_WF_Node_ID (int AD_WF_Node_ID);

	/** Get Node.
	  * Workflow Node (activity), step or process
	  */
	public int getAD_WF_Node_ID();

	public org.compiere.model.I_AD_WF_Node getAD_WF_Node() throws RuntimeException;

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

    /** Column name EntityType */
    public static final String COLUMNNAME_EntityType = "EntityType";

	/** Set Entity Type.
	  * Dictionary Entity Type;
 Determines ownership and synchronization
	  */
	public void setEntityType (String EntityType);

	/** Get Entity Type.
	  * Dictionary Entity Type;
 Determines ownership and synchronization
	  */
	public String getEntityType();

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

    /** Column name IsStdUserWorkflow */
    public static final String COLUMNNAME_IsStdUserWorkflow = "IsStdUserWorkflow";

	/** Set Std User Workflow.
	  * Standard Manual User Approval Workflow
	  */
	public void setIsStdUserWorkflow (boolean IsStdUserWorkflow);

	/** Get Std User Workflow.
	  * Standard Manual User Approval Workflow
	  */
	public boolean isStdUserWorkflow();

    /** Column name PP_Order_ID */
    public static final String COLUMNNAME_PP_Order_ID = "PP_Order_ID";

	/** Set Manufacturing Order.
	  * Manufacturing Order
	  */
	public void setPP_Order_ID (int PP_Order_ID);

	/** Get Manufacturing Order.
	  * Manufacturing Order
	  */
	public int getPP_Order_ID();

	public org.eevolution.model.I_PP_Order getPP_Order() throws RuntimeException;

    /** Column name PP_Order_Next_ID */
    public static final String COLUMNNAME_PP_Order_Next_ID = "PP_Order_Next_ID";

	/** Set Manufacturing Order Activity Next	  */
	public void setPP_Order_Next_ID (int PP_Order_Next_ID);

	/** Get Manufacturing Order Activity Next	  */
	public int getPP_Order_Next_ID();

	public org.eevolution.model.I_PP_Order_Node getPP_Order_Next() throws RuntimeException;

    /** Column name PP_Order_Node_ID */
    public static final String COLUMNNAME_PP_Order_Node_ID = "PP_Order_Node_ID";

	/** Set Manufacturing Order Activity.
	  * Workflow Node (activity), step or process
	  */
	public void setPP_Order_Node_ID (int PP_Order_Node_ID);

	/** Get Manufacturing Order Activity.
	  * Workflow Node (activity), step or process
	  */
	public int getPP_Order_Node_ID();

	public org.eevolution.model.I_PP_Order_Node getPP_Order_Node() throws RuntimeException;

    /** Column name PP_Order_NodeNext_ID */
    public static final String COLUMNNAME_PP_Order_NodeNext_ID = "PP_Order_NodeNext_ID";

	/** Set Manufacturing Order Activity Next	  */
	public void setPP_Order_NodeNext_ID (int PP_Order_NodeNext_ID);

	/** Get Manufacturing Order Activity Next	  */
	public int getPP_Order_NodeNext_ID();

    /** Column name PP_Order_NodeNext_UU */
    public static final String COLUMNNAME_PP_Order_NodeNext_UU = "PP_Order_NodeNext_UU";

	/** Set PP_Order_NodeNext_UU	  */
	public void setPP_Order_NodeNext_UU (String PP_Order_NodeNext_UU);

	/** Get PP_Order_NodeNext_UU	  */
	public String getPP_Order_NodeNext_UU();

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

    /** Column name TransitionCode */
    public static final String COLUMNNAME_TransitionCode = "TransitionCode";

	/** Set Transition Code.
	  * Code resulting in TRUE of FALSE
	  */
	public void setTransitionCode (String TransitionCode);

	/** Get Transition Code.
	  * Code resulting in TRUE of FALSE
	  */
	public String getTransitionCode();

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
