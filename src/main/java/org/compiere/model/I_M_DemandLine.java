package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_DemandLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_DemandLine {

  /** TableName=M_DemandLine */
  public static final String Table_Name = "M_DemandLine";

  /** AD_Table_ID=719 */
  public static final int Table_ID = 719;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Get Client. Client/Tenant for this installation. */
  public int getADClientID();

  /** Column name AD_Org_ID */
  public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  public void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  public int getAD_Org_ID();

  /** Column name C_Period_ID */
  public static final String COLUMNNAME_C_Period_ID = "C_Period_ID";

  /** Set Period. Period of the Calendar */
  public void setC_Period_ID(int C_Period_ID);

  /** Get Period. Period of the Calendar */
  public int getC_Period_ID();

  public I_C_Period getC_Period() throws RuntimeException;

  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  public int getCreatedBy();

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name M_Demand_ID */
  public static final String COLUMNNAME_M_Demand_ID = "M_Demand_ID";

  /** Set Demand. Material Demand */
  public void setM_Demand_ID(int M_Demand_ID);

  /** Get Demand. Material Demand */
  public int getM_Demand_ID();

  public I_M_Demand getM_Demand() throws RuntimeException;

  /** Column name M_DemandLine_ID */
  public static final String COLUMNNAME_M_DemandLine_ID = "M_DemandLine_ID";

  /** Set Demand Line. Material Demand Line */
  public void setM_DemandLine_ID(int M_DemandLine_ID);

  /** Get Demand Line. Material Demand Line */
  public int getM_DemandLine_ID();

  /** Column name M_DemandLine_UU */
  public static final String COLUMNNAME_M_DemandLine_UU = "M_DemandLine_UU";

  /** Set M_DemandLine_UU */
  public void setM_DemandLine_UU(String M_DemandLine_UU);

  /** Get M_DemandLine_UU */
  public String getM_DemandLine_UU();

  /** Column name M_Product_ID */
  public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";

  /** Set Product. Product, Service, Item */
  public void setM_Product_ID(int M_Product_ID);

  /** Get Product. Product, Service, Item */
  public int getM_Product_ID();

  public I_M_Product getM_Product() throws RuntimeException;

  /** Column name Qty */
  public static final String COLUMNNAME_Qty = "Qty";

  /** Set Quantity. Quantity */
  public void setQty(BigDecimal Qty);

  /** Get Quantity. Quantity */
  public BigDecimal getQty();

  /** Column name QtyCalculated */
  public static final String COLUMNNAME_QtyCalculated = "QtyCalculated";

  /** Set Calculated Quantity. Calculated Quantity */
  public void setQtyCalculated(BigDecimal QtyCalculated);

  /** Get Calculated Quantity. Calculated Quantity */
  public BigDecimal getQtyCalculated();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}
