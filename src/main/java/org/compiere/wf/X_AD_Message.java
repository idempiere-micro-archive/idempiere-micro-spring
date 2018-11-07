package org.compiere.wf;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.I_AD_Message;
import org.compiere.orm.PO;
import org.idempiere.orm.I_Persistent;
import org.idempiere.common.util.KeyNamePair;
import org.idempiere.orm.POInfo;


/** Generated Model for AD_Message
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
public class X_AD_Message extends PO implements I_AD_Message, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20171031L;

    /** Standard Constructor */
    public X_AD_Message (Properties ctx, int AD_Message_ID, String trxName)
    {
      super (ctx, AD_Message_ID, trxName);
      /** if (AD_Message_ID == 0)
        {
			setAD_Message_ID (0);
			setEntityType (null);
// @SQL=select get_sysconfig('DEFAULT_ENTITYTYPE','U',0,0) from dual
			setMsgText (null);
			setMsgType (null);
// I
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_AD_Message (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 4 - System 
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
      StringBuffer sb = new StringBuffer ("X_AD_Message[")
        .append(getId()).append("]");
      return sb.toString();
    }

	/** Set Message.
		@param AD_Message_ID 
		System Message
	  */
	public void setAD_Message_ID (int AD_Message_ID)
	{
		if (AD_Message_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_AD_Message_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_AD_Message_ID, Integer.valueOf(AD_Message_ID));
	}

	/** Get Message.
		@return System Message
	  */
	public int getAD_Message_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Message_ID);
		if (ii == null)
			 return 0;
		return ii;
	}

	/** Set AD_Message_UU.
		@param AD_Message_UU AD_Message_UU	  */
	public void setAD_Message_UU (String AD_Message_UU)
	{
		set_Value (COLUMNNAME_AD_Message_UU, AD_Message_UU);
	}

	/** Get AD_Message_UU.
		@return AD_Message_UU	  */
	public String getAD_Message_UU () 
	{
		return (String)get_Value(COLUMNNAME_AD_Message_UU);
	}

	/** EntityType AD_Reference_ID=389 */
	public static final int ENTITYTYPE_AD_Reference_ID=389;
	/** Set Entity Type.
		@param EntityType 
		Dictionary Entity Type; Determines ownership and synchronization
	  */
	public void setEntityType (String EntityType)
	{

		set_Value (COLUMNNAME_EntityType, EntityType);
	}

	/** Get Entity Type.
		@return Dictionary Entity Type; Determines ownership and synchronization
	  */
	public String getEntityType () 
	{
		return (String)get_Value(COLUMNNAME_EntityType);
	}

	/** Set Message Text.
		@param MsgText 
		Textual Informational, Menu or Error Message
	  */
	public void setMsgText (String MsgText)
	{
		set_Value (COLUMNNAME_MsgText, MsgText);
	}

	/** Get Message Text.
		@return Textual Informational, Menu or Error Message
	  */
	public String getMsgText () 
	{
		return (String)get_Value(COLUMNNAME_MsgText);
	}

	/** Set Message Tip.
		@param MsgTip 
		Additional tip or help for this message
	  */
	public void setMsgTip (String MsgTip)
	{
		set_Value (COLUMNNAME_MsgTip, MsgTip);
	}

	/** Get Message Tip.
		@return Additional tip or help for this message
	  */
	public String getMsgTip () 
	{
		return (String)get_Value(COLUMNNAME_MsgTip);
	}

	/** MsgType AD_Reference_ID=103 */
	public static final int MSGTYPE_AD_Reference_ID=103;
	/** Error = E */
	public static final String MSGTYPE_Error = "E";
	/** Information = I */
	public static final String MSGTYPE_Information = "I";
	/** Menu = M */
	public static final String MSGTYPE_Menu = "M";
	/** Set Message Type.
		@param MsgType 
		Type of message (Informational, Menu or Error)
	  */
	public void setMsgType (String MsgType)
	{

		set_Value (COLUMNNAME_MsgType, MsgType);
	}

	/** Get Message Type.
		@return Type of message (Informational, Menu or Error)
	  */
	public String getMsgType () 
	{
		return (String)get_Value(COLUMNNAME_MsgType);
	}

	/** Set Search Key.
		@param Value 
		Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue () 
	{
		return (String)get_Value(COLUMNNAME_Value);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(getId(), getValue());
    }
}