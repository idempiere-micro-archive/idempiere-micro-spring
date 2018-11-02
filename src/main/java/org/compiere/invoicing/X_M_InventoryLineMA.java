package org.compiere.invoicing;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;

import org.compiere.model.I_M_AttributeSetInstance;
import org.compiere.model.I_M_InventoryLineMA;
import org.compiere.orm.MTable;
import org.compiere.orm.PO;
import org.idempiere.orm.I_Persistent;
import org.idempiere.common.util.Env;
import org.idempiere.common.util.KeyNamePair;
import org.idempiere.orm.POInfo;


/** Generated Model for M_InventoryLineMA
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
public class X_M_InventoryLineMA extends PO implements I_M_InventoryLineMA, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20171031L;

    /** Standard Constructor */
    public X_M_InventoryLineMA (Properties ctx, int M_InventoryLineMA_ID, String trxName)
    {
      super (ctx, M_InventoryLineMA_ID, trxName);
      /** if (M_InventoryLineMA_ID == 0)
        {
			setM_AttributeSetInstance_ID (0);
			setM_InventoryLine_ID (0);
			setMovementQty (Env.ZERO);
// 1
        } */
    }

    /** Load Constructor */
    public X_M_InventoryLineMA (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 1 - Org 
      */
    protected int getAccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_M_InventoryLineMA[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Date  Material Policy.
		@param DateMaterialPolicy 
		Time used for LIFO and FIFO Material Policy
	  */
	public void setDateMaterialPolicy (Timestamp DateMaterialPolicy)
	{
		set_ValueNoCheck (COLUMNNAME_DateMaterialPolicy, DateMaterialPolicy);
	}

	/** Get Date  Material Policy.
		@return Time used for LIFO and FIFO Material Policy
	  */
	public Timestamp getDateMaterialPolicy () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateMaterialPolicy);
	}

	/** Set Auto Generated.
		@param IsAutoGenerated Auto Generated	  */
	public void setIsAutoGenerated (boolean IsAutoGenerated)
	{
		set_ValueNoCheck (COLUMNNAME_IsAutoGenerated, Boolean.valueOf(IsAutoGenerated));
	}

	/** Get Auto Generated.
		@return Auto Generated	  */
	public boolean isAutoGenerated () 
	{
		Object oo = get_Value(COLUMNNAME_IsAutoGenerated);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	public I_M_AttributeSetInstance getM_AttributeSetInstance() throws RuntimeException
    {
		return (I_M_AttributeSetInstance)MTable.get(getCtx(), I_M_AttributeSetInstance.Table_Name)
			.getPO(getM_AttributeSetInstance_ID(), get_TrxName());	}

	/** Set Attribute Set Instance.
		@param M_AttributeSetInstance_ID 
		Product Attribute Set Instance
	  */
	public void setM_AttributeSetInstance_ID (int M_AttributeSetInstance_ID)
	{
		if (M_AttributeSetInstance_ID < 0) 
			set_ValueNoCheck (COLUMNNAME_M_AttributeSetInstance_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_M_AttributeSetInstance_ID, Integer.valueOf(M_AttributeSetInstance_ID));
	}

	/** Get Attribute Set Instance.
		@return Product Attribute Set Instance
	  */
	public int getM_AttributeSetInstance_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeSetInstance_ID);
		if (ii == null)
			 return 0;
		return ii;
	}

	public org.compiere.model.I_M_InventoryLine getM_InventoryLine() throws RuntimeException
    {
		return (org.compiere.model.I_M_InventoryLine)MTable.get(getCtx(), org.compiere.model.I_M_InventoryLine.Table_Name)
			.getPO(getM_InventoryLine_ID(), get_TrxName());	}

	/** Set Phys.Inventory Line.
		@param M_InventoryLine_ID 
		Unique line in an Inventory document
	  */
	public void setM_InventoryLine_ID (int M_InventoryLine_ID)
	{
		if (M_InventoryLine_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_M_InventoryLine_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_M_InventoryLine_ID, Integer.valueOf(M_InventoryLine_ID));
	}

	/** Get Phys.Inventory Line.
		@return Unique line in an Inventory document
	  */
	public int getM_InventoryLine_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_InventoryLine_ID);
		if (ii == null)
			 return 0;
		return ii;
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), String.valueOf(getM_InventoryLine_ID()));
    }

	/** Set M_InventoryLineMA_UU.
		@param M_InventoryLineMA_UU M_InventoryLineMA_UU	  */
	public void setM_InventoryLineMA_UU (String M_InventoryLineMA_UU)
	{
		set_Value (COLUMNNAME_M_InventoryLineMA_UU, M_InventoryLineMA_UU);
	}

	/** Get M_InventoryLineMA_UU.
		@return M_InventoryLineMA_UU	  */
	public String getM_InventoryLineMA_UU () 
	{
		return (String)get_Value(COLUMNNAME_M_InventoryLineMA_UU);
	}

	/** Set Movement Quantity.
		@param MovementQty 
		Quantity of a product moved.
	  */
	public void setMovementQty (BigDecimal MovementQty)
	{
		set_Value (COLUMNNAME_MovementQty, MovementQty);
	}

	/** Get Movement Quantity.
		@return Quantity of a product moved.
	  */
	public BigDecimal getMovementQty () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MovementQty);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}