package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;
import org.idempiere.icommon.model.IPO;

/**
 * Generated Interface for C_InvoiceTax
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_InvoiceTax extends IPO {

  /** TableName=C_InvoiceTax */
  public static final String Table_Name = "C_InvoiceTax";

  /** AD_Table_ID=334 */
  public static final int Table_ID = 334;

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

  /** Column name C_Invoice_ID */
  public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";

  /** Set Invoice. Invoice Identifier */
  public void setC_Invoice_ID(int C_Invoice_ID);

  /** Get Invoice. Invoice Identifier */
  public int getC_Invoice_ID();

  public I_C_Invoice getC_Invoice() throws RuntimeException;

  /** Column name C_InvoiceTax_UU */
  public static final String COLUMNNAME_C_InvoiceTax_UU = "C_InvoiceTax_UU";

  /** Set C_InvoiceTax_UU */
  public void setC_InvoiceTax_UU(String C_InvoiceTax_UU);

  /** Get C_InvoiceTax_UU */
  public String getC_InvoiceTax_UU();

  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  public int getCreatedBy();

  /** Column name C_Tax_ID */
  public static final String COLUMNNAME_C_Tax_ID = "C_Tax_ID";

  /** Set Tax. Tax identifier */
  public void setC_Tax_ID(int C_Tax_ID);

  /** Get Tax. Tax identifier */
  public int getC_Tax_ID();

  public I_C_Tax getC_Tax() throws RuntimeException;

  /** Column name C_TaxProvider_ID */
  public static final String COLUMNNAME_C_TaxProvider_ID = "C_TaxProvider_ID";

  /** Set Tax Provider */
  public void setC_TaxProvider_ID(int C_TaxProvider_ID);

  /** Get Tax Provider */
  public int getC_TaxProvider_ID();

  public I_C_TaxProvider getC_TaxProvider() throws RuntimeException;

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name IsTaxIncluded */
  public static final String COLUMNNAME_IsTaxIncluded = "IsTaxIncluded";

  /** Set Price includes Tax. Tax is included in the price */
  public void setIsTaxIncluded(boolean IsTaxIncluded);

  /** Get Price includes Tax. Tax is included in the price */
  public boolean isTaxIncluded();

  /** Column name Processed */
  public static final String COLUMNNAME_Processed = "Processed";

  /** Set Processed. The document has been processed */
  public void setProcessed(boolean Processed);

  /** Get Processed. The document has been processed */
  public boolean isProcessed();

  /** Column name TaxAmt */
  public static final String COLUMNNAME_TaxAmt = "TaxAmt";

  /** Set Tax Amount. Tax Amount for a document */
  public void setTaxAmt(BigDecimal TaxAmt);

  /** Get Tax Amount. Tax Amount for a document */
  public BigDecimal getTaxAmt();

  /** Column name TaxBaseAmt */
  public static final String COLUMNNAME_TaxBaseAmt = "TaxBaseAmt";

  /** Set Tax base Amount. Base for calculating the tax amount */
  public void setTaxBaseAmt(BigDecimal TaxBaseAmt);

  /** Get Tax base Amount. Base for calculating the tax amount */
  public BigDecimal getTaxBaseAmt();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();

  I_C_Tax getTax();

  void deleteEx(boolean b, String trxName);
}
