package org.compiere.product;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;

import org.compiere.model.I_C_Currency;
import org.compiere.orm.PO;
import org.idempiere.orm.I_Persistent;
import org.idempiere.common.util.Env;
import org.idempiere.common.util.KeyNamePair;
import org.idempiere.orm.POInfo;


/** Generated Model for C_Currency
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
public class X_C_Currency extends PO implements I_C_Currency, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20171031L;

    /** Standard Constructor */
    public X_C_Currency (Properties ctx, int C_Currency_ID, String trxName)
    {
      super (ctx, C_Currency_ID, trxName);
      /** if (C_Currency_ID == 0)
        {
			setC_Currency_ID (0);
			setCostingPrecision (0);
// 4
			setDescription (null);
			setIsEMUMember (false);
// N
			setIsEuro (false);
// N
			setISO_Code (null);
			setRoundOffFactor (Env.ZERO);
// 1
			setStdPrecision (0);
// 2
        } */
    }

    /** Load Constructor */
    public X_C_Currency (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 6 - System - Client 
      */
    protected int get_AccessLevel()
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
      StringBuffer sb = new StringBuffer ("X_C_Currency[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Currency.
		@param C_Currency_ID 
		The Currency for this record
	  */
	public void setC_Currency_ID (int C_Currency_ID)
	{
		if (C_Currency_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_Currency_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
	}

	/** Get Currency.
		@return The Currency for this record
	  */
	public int getC_Currency_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set C_Currency_UU.
		@param C_Currency_UU C_Currency_UU	  */
	public void setC_Currency_UU (String C_Currency_UU)
	{
		set_Value (COLUMNNAME_C_Currency_UU, C_Currency_UU);
	}

	/** Get C_Currency_UU.
		@return C_Currency_UU	  */
	public String getC_Currency_UU () 
	{
		return (String)get_Value(COLUMNNAME_C_Currency_UU);
	}

	/** Set Costing Precision.
		@param CostingPrecision 
		Rounding used costing calculations
	  */
	public void setCostingPrecision (int CostingPrecision)
	{
		set_Value (COLUMNNAME_CostingPrecision, Integer.valueOf(CostingPrecision));
	}

	/** Get Costing Precision.
		@return Rounding used costing calculations
	  */
	public int getCostingPrecision () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CostingPrecision);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Symbol.
		@param CurSymbol 
		Symbol of the currency (opt used for printing only)
	  */
	public void setCurSymbol (String CurSymbol)
	{
		set_Value (COLUMNNAME_CurSymbol, CurSymbol);
	}

	/** Get Symbol.
		@return Symbol of the currency (opt used for printing only)
	  */
	public String getCurSymbol () 
	{
		return (String)get_Value(COLUMNNAME_CurSymbol);
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set EMU Entry Date.
		@param EMUEntryDate 
		Date when the currency joined / will join the EMU
	  */
	public void setEMUEntryDate (Timestamp EMUEntryDate)
	{
		set_Value (COLUMNNAME_EMUEntryDate, EMUEntryDate);
	}

	/** Get EMU Entry Date.
		@return Date when the currency joined / will join the EMU
	  */
	public Timestamp getEMUEntryDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_EMUEntryDate);
	}

	/** Set EMU Rate.
		@param EMURate 
		Official rate to the Euro
	  */
	public void setEMURate (BigDecimal EMURate)
	{
		set_Value (COLUMNNAME_EMURate, EMURate);
	}

	/** Get EMU Rate.
		@return Official rate to the Euro
	  */
	public BigDecimal getEMURate () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_EMURate);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set EMU Member.
		@param IsEMUMember 
		This currency is member if the European Monetary Union
	  */
	public void setIsEMUMember (boolean IsEMUMember)
	{
		set_Value (COLUMNNAME_IsEMUMember, Boolean.valueOf(IsEMUMember));
	}

	/** Get EMU Member.
		@return This currency is member if the European Monetary Union
	  */
	public boolean isEMUMember () 
	{
		Object oo = get_Value(COLUMNNAME_IsEMUMember);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set The Euro Currency.
		@param IsEuro 
		This currency is the Euro
	  */
	public void setIsEuro (boolean IsEuro)
	{
		set_Value (COLUMNNAME_IsEuro, Boolean.valueOf(IsEuro));
	}

	/** Get The Euro Currency.
		@return This currency is the Euro
	  */
	public boolean isEuro () 
	{
		Object oo = get_Value(COLUMNNAME_IsEuro);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set ISO Currency Code.
		@param ISO_Code 
		Three letter ISO 4217 Code of the Currency
	  */
	public void setISO_Code (String ISO_Code)
	{
		set_Value (COLUMNNAME_ISO_Code, ISO_Code);
	}

	/** Get ISO Currency Code.
		@return Three letter ISO 4217 Code of the Currency
	  */
	public String getISO_Code () 
	{
		return (String)get_Value(COLUMNNAME_ISO_Code);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), getISO_Code());
    }

	/** Set Round Off Factor.
		@param RoundOffFactor 
		Used to Round Off Payment Amount
	  */
	public void setRoundOffFactor (BigDecimal RoundOffFactor)
	{
		set_Value (COLUMNNAME_RoundOffFactor, RoundOffFactor);
	}

	/** Get Round Off Factor.
		@return Used to Round Off Payment Amount
	  */
	public BigDecimal getRoundOffFactor () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_RoundOffFactor);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Standard Precision.
		@param StdPrecision 
		Rule for rounding  calculated amounts
	  */
	public void setStdPrecision (int StdPrecision)
	{
		set_Value (COLUMNNAME_StdPrecision, Integer.valueOf(StdPrecision));
	}

	/** Get Standard Precision.
		@return Rule for rounding  calculated amounts
	  */
	public int getStdPrecision () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_StdPrecision);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}