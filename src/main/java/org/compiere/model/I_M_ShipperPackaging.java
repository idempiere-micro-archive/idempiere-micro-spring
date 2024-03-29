package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_ShipperPackaging
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ShipperPackaging {

  /** TableName=M_ShipperPackaging */
  public static final String Table_Name = "M_ShipperPackaging";

  /** AD_Table_ID=200041 */
  public static final int Table_ID = 200041;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

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

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name IsDefault */
  public static final String COLUMNNAME_IsDefault = "IsDefault";

  /** Set Default. Default value */
  public void setIsDefault(boolean IsDefault);

  /** Get Default. Default value */
  public boolean isDefault();

  /** Column name M_Shipper_ID */
  public static final String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";

  /** Set Shipper. Method or manner of product delivery */
  public void setM_Shipper_ID(int M_Shipper_ID);

  /** Get Shipper. Method or manner of product delivery */
  public int getM_Shipper_ID();

  public I_M_Shipper getM_Shipper() throws RuntimeException;

  /** Column name M_ShipperPackagingCfg_ID */
  public static final String COLUMNNAME_M_ShipperPackagingCfg_ID = "M_ShipperPackagingCfg_ID";

  /** Set Shipper Packaging Configuration */
  public void setM_ShipperPackagingCfg_ID(int M_ShipperPackagingCfg_ID);

  /** Get Shipper Packaging Configuration */
  public int getM_ShipperPackagingCfg_ID();

  public I_M_ShipperPackagingCfg getM_ShipperPackagingCfg() throws RuntimeException;

  /** Column name M_ShipperPackaging_ID */
  public static final String COLUMNNAME_M_ShipperPackaging_ID = "M_ShipperPackaging_ID";

  /** Set Shipper Packaging */
  public void setM_ShipperPackaging_ID(int M_ShipperPackaging_ID);

  /** Get Shipper Packaging */
  public int getM_ShipperPackaging_ID();

  /** Column name M_ShipperPackaging_UU */
  public static final String COLUMNNAME_M_ShipperPackaging_UU = "M_ShipperPackaging_UU";

  /** Set M_ShipperPackaging_UU */
  public void setM_ShipperPackaging_UU(String M_ShipperPackaging_UU);

  /** Get M_ShipperPackaging_UU */
  public String getM_ShipperPackaging_UU();

  /** Set Name. Alphanumeric identifier of the entity */
  public void setName(String Name);

  /** Get Name. Alphanumeric identifier of the entity */
  public String getName();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();

  /** Column name Weight */
  public static final String COLUMNNAME_Weight = "Weight";

  /** Set Weight. Weight of a product */
  public void setWeight(BigDecimal Weight);

  /** Get Weight. Weight of a product */
  public BigDecimal getWeight();
}
