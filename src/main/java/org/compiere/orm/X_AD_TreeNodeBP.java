
/** Generated Model - DO NOT CHANGE */
package org.compiere.orm;

import org.compiere.model.I_AD_TreeNodeBP;
import org.compiere.orm.MTable;
import org.idempiere.orm.I_Persistent;
import org.idempiere.orm.POInfo;


import java.sql.ResultSet;
import java.util.Properties;

/** Generated Model for AD_TreeNodeBP
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
public class X_AD_TreeNodeBP extends PO implements I_AD_TreeNodeBP, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20171031L;

    /** Standard Constructor */
    public X_AD_TreeNodeBP (Properties ctx, int AD_TreeNodeBP_ID, String trxName)
    {
      super (ctx, AD_TreeNodeBP_ID, trxName);
      /** if (AD_TreeNodeBP_ID == 0)
        {
			setAD_Tree_ID (0);
			setNode_ID (0);
        } */
    }

    /** Load Constructor */
    public X_AD_TreeNodeBP (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 7 - System - Client - Org 
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
      StringBuffer sb = new StringBuffer ("X_AD_TreeNodeBP[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_Tree getAD_Tree() throws RuntimeException
    {
		return (org.compiere.model.I_AD_Tree)MTable.get(getCtx(), org.compiere.model.I_AD_Tree.Table_Name)
			.getPO(getAD_Tree_ID(), get_TrxName());	}

	/** Set Tree.
		@param AD_Tree_ID 
		Identifies a Tree
	  */
	public void setAD_Tree_ID (int AD_Tree_ID)
	{
		if (AD_Tree_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_AD_Tree_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_AD_Tree_ID, Integer.valueOf(AD_Tree_ID));
	}

	/** Get Tree.
		@return Identifies a Tree
	  */
	public int getAD_Tree_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Tree_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set AD_TreeNodeBP_UU.
		@param AD_TreeNodeBP_UU AD_TreeNodeBP_UU	  */
	public void setAD_TreeNodeBP_UU (String AD_TreeNodeBP_UU)
	{
		set_Value (COLUMNNAME_AD_TreeNodeBP_UU, AD_TreeNodeBP_UU);
	}

	/** Get AD_TreeNodeBP_UU.
		@return AD_TreeNodeBP_UU	  */
	public String getAD_TreeNodeBP_UU () 
	{
		return (String)get_Value(COLUMNNAME_AD_TreeNodeBP_UU);
	}

	/** Set Node.
		@param Node_ID Node	  */
	public void setNode_ID (int Node_ID)
	{
		if (Node_ID < 0) 
			set_ValueNoCheck (COLUMNNAME_Node_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_Node_ID, Integer.valueOf(Node_ID));
	}

	/** Get Node.
		@return Node	  */
	public int getNode_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Node_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Parent.
		@param Parent_ID 
		Parent of Entity
	  */
	public void setParent_ID (int Parent_ID)
	{
		if (Parent_ID < 1) 
			set_Value (COLUMNNAME_Parent_ID, null);
		else 
			set_Value (COLUMNNAME_Parent_ID, Integer.valueOf(Parent_ID));
	}

	/** Get Parent.
		@return Parent of Entity
	  */
	public int getParent_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Parent_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Sequence.
		@param SeqNo 
		Method of ordering records; lowest number comes first
	  */
	public void setSeqNo (int SeqNo)
	{
		set_Value (COLUMNNAME_SeqNo, Integer.valueOf(SeqNo));
	}

	/** Get Sequence.
		@return Method of ordering records; lowest number comes first
	  */
	public int getSeqNo () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_SeqNo);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}