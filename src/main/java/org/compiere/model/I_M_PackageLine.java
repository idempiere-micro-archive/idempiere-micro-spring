package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_PackageLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_PackageLine {

  /** TableName=M_PackageLine */
  public static final String Table_Name = "M_PackageLine";

  /** AD_Table_ID=663 */
  public static final int Table_ID = 663;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

  /** Get Client. Client/Tenant for this installation. */
  public int getADClientID();

  /** Column name AD_Org_ID */
  public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  public void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  public int getAD_Org_ID();

  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  public int getCreatedBy();

  /** Column name Description */
  public static final String COLUMNNAME_Description = "Description";

  /** Set Description. Optional short description of the record */
  public void setDescription(String Description);

  /** Get Description. Optional short description of the record */
  public String getDescription();

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name M_InOutLine_ID */
  public static final String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";

  /** Set Shipment/Receipt Line. Line on Shipment or Receipt document */
  public void setM_InOutLine_ID(int M_InOutLine_ID);

  /** Get Shipment/Receipt Line. Line on Shipment or Receipt document */
  public int getM_InOutLine_ID();

  public I_M_InOutLine getM_InOutLine() throws RuntimeException;

  /** Column name M_Package_ID */
  public static final String COLUMNNAME_M_Package_ID = "M_Package_ID";

  /** Set Package. Shipment Package */
  public void setM_Package_ID(int M_Package_ID);

  /** Get Package. Shipment Package */
  public int getM_Package_ID();

  public I_M_Package getM_Package() throws RuntimeException;

  /** Column name M_PackageLine_ID */
  public static final String COLUMNNAME_M_PackageLine_ID = "M_PackageLine_ID";

  /** Set Package Line. The detail content of the Package */
  public void setM_PackageLine_ID(int M_PackageLine_ID);

  /** Get Package Line. The detail content of the Package */
  public int getM_PackageLine_ID();

  /** Column name M_PackageLine_UU */
  public static final String COLUMNNAME_M_PackageLine_UU = "M_PackageLine_UU";

  /** Set M_PackageLine_UU */
  public void setM_PackageLine_UU(String M_PackageLine_UU);

  /** Get M_PackageLine_UU */
  public String getM_PackageLine_UU();

  /** Column name M_PackageMPS_ID */
  public static final String COLUMNNAME_M_PackageMPS_ID = "M_PackageMPS_ID";

  /** Set Package MPS */
  public void setM_PackageMPS_ID(int M_PackageMPS_ID);

  /** Get Package MPS */
  public int getM_PackageMPS_ID();

  public I_M_PackageMPS getM_PackageMPS() throws RuntimeException;

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

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}
