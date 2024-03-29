package org.eevolution.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for QM_Specification
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_QM_Specification {

  /** TableName=QM_Specification */
  public static final String Table_Name = "QM_Specification";

  /** AD_Table_ID=53040 */
  public static final int Table_ID = 53040;

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

  /** Column name AD_Workflow_ID */
  public static final String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";

  /** Set Workflow. Workflow or combination of tasks */
  public void setAD_Workflow_ID(int AD_Workflow_ID);

  /** Get Workflow. Workflow or combination of tasks */
  public int getAD_Workflow_ID();

  public org.compiere.model.I_AD_Workflow getAD_Workflow() throws RuntimeException;

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

  /** Column name M_AttributeSet_ID */
  public static final String COLUMNNAME_M_AttributeSet_ID = "M_AttributeSet_ID";

  /** Set Attribute Set. Product Attribute Set */
  public void setM_AttributeSet_ID(int M_AttributeSet_ID);

  /** Get Attribute Set. Product Attribute Set */
  public int getMAttributeSet_ID();

  public org.compiere.model.I_M_AttributeSet getMAttributeSet() throws RuntimeException;

  /** Column name M_Product_ID */
  public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";

  /** Set Product. Product, Service, Item */
  public void setM_Product_ID(int M_Product_ID);

  /** Get Product. Product, Service, Item */
  public int getM_Product_ID();

  public org.compiere.model.I_M_Product getM_Product() throws RuntimeException;

  /** Set Name. Alphanumeric identifier of the entity */
  public void setName(String Name);

  /** Get Name. Alphanumeric identifier of the entity */
  public String getName();

  /** Column name PP_Product_BOM_ID */
  public static final String COLUMNNAME_PP_Product_BOM_ID = "PP_Product_BOM_ID";

  /** Set BOM & Formula. BOM & Formula */
  public void setPP_Product_BOM_ID(int PP_Product_BOM_ID);

  /** Get BOM & Formula. BOM & Formula */
  public int getPP_Product_BOM_ID();

  public org.eevolution.model.I_PP_Product_BOM getPP_Product_BOM() throws RuntimeException;

  /** Column name QM_Specification_ID */
  public static final String COLUMNNAME_QM_Specification_ID = "QM_Specification_ID";

  /** Set Quality Specification */
  public void setQM_Specification_ID(int QM_Specification_ID);

  /** Get Quality Specification */
  public int getQM_Specification_ID();

  /** Column name QM_Specification_UU */
  public static final String COLUMNNAME_QM_Specification_UU = "QM_Specification_UU";

  /** Set QM_Specification_UU */
  public void setQM_Specification_UU(String QM_Specification_UU);

  /** Get QM_Specification_UU */
  public String getQM_Specification_UU();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();

  /** Column name ValidFrom */
  public static final String COLUMNNAME_ValidFrom = "ValidFrom";

  /** Set Valid from. Valid from including this date (first day) */
  public void setValidFrom(Timestamp ValidFrom);

  /** Get Valid from. Valid from including this date (first day) */
  public Timestamp getValidFrom();

  /** Column name ValidTo */
  public static final String COLUMNNAME_ValidTo = "ValidTo";

  /** Set Valid to. Valid to including this date (last day) */
  public void setValidTo(Timestamp ValidTo);

  /** Get Valid to. Valid to including this date (last day) */
  public Timestamp getValidTo();

  /** Column name Value */
  public static final String COLUMNNAME_Value = "Value";

  /** Set Search Key. Search key for the record in the format required - must be unique */
  public void setValue(String Value);

  /** Get Search Key. Search key for the record in the format required - must be unique */
  public String getValue();
}
