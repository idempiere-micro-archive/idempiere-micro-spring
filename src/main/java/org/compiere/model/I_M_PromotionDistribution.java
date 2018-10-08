package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/** Generated Interface for M_PromotionDistribution
 *  @author iDempiere (generated) 
 *  @version Release 5.1
 */
public interface I_M_PromotionDistribution 
{

    /** TableName=M_PromotionDistribution */
    public static final String Table_Name = "M_PromotionDistribution";

    /** AD_Table_ID=53181 */
    public static final int Table_ID = 53181;

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

    /** Column name DistributionSorting */
    public static final String COLUMNNAME_DistributionSorting = "DistributionSorting";

	/** Set Distribution Sorting.
	  * Quantity distribution sorting by unit price
	  */
	public void setDistributionSorting (String DistributionSorting);

	/** Get Distribution Sorting.
	  * Quantity distribution sorting by unit price
	  */
	public String getDistributionSorting();

    /** Column name DistributionType */
    public static final String COLUMNNAME_DistributionType = "DistributionType";

	/** Set Distribution Type.
	  * Type of quantity distribution calculation using comparison qty and order qty as operand
	  */
	public void setDistributionType (String DistributionType);

	/** Get Distribution Type.
	  * Type of quantity distribution calculation using comparison qty and order qty as operand
	  */
	public String getDistributionType();

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

    /** Column name M_PromotionDistribution_ID */
    public static final String COLUMNNAME_M_PromotionDistribution_ID = "M_PromotionDistribution_ID";

	/** Set Promotion Distribution	  */
	public void setM_PromotionDistribution_ID (int M_PromotionDistribution_ID);

	/** Get Promotion Distribution	  */
	public int getM_PromotionDistribution_ID();

    /** Column name M_PromotionDistribution_UU */
    public static final String COLUMNNAME_M_PromotionDistribution_UU = "M_PromotionDistribution_UU";

	/** Set M_PromotionDistribution_UU	  */
	public void setM_PromotionDistribution_UU (String M_PromotionDistribution_UU);

	/** Get M_PromotionDistribution_UU	  */
	public String getM_PromotionDistribution_UU();

    /** Column name M_Promotion_ID */
    public static final String COLUMNNAME_M_Promotion_ID = "M_Promotion_ID";

	/** Set Promotion	  */
	public void setM_Promotion_ID (int M_Promotion_ID);

	/** Get Promotion	  */
	public int getM_Promotion_ID();

	public I_M_Promotion getM_Promotion() throws RuntimeException;

    /** Column name M_PromotionLine_ID */
    public static final String COLUMNNAME_M_PromotionLine_ID = "M_PromotionLine_ID";

	/** Set Promotion Line	  */
	public void setM_PromotionLine_ID (int M_PromotionLine_ID);

	/** Get Promotion Line	  */
	public int getM_PromotionLine_ID();

	public I_M_PromotionLine getM_PromotionLine() throws RuntimeException;

    /** Column name Operation */
    public static final String COLUMNNAME_Operation = "Operation";

	/** Set Operation.
	  * Compare Operation
	  */
	public void setOperation (String Operation);

	/** Get Operation.
	  * Compare Operation
	  */
	public String getOperation();

    /** Column name Qty */
    public static final String COLUMNNAME_Qty = "Qty";

	/** Set Quantity.
	  * Quantity
	  */
	public void setQty (BigDecimal Qty);

	/** Get Quantity.
	  * Quantity
	  */
	public BigDecimal getQty();

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