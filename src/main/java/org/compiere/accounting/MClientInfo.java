/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.idempiere.org/license.html           *
 *****************************************************************************/
package org.compiere.accounting;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;

import org.compiere.orm.MClient;
import org.idempiere.common.util.CLogger;
import org.idempiere.common.util.DB;
import org.idempiere.common.util.Env;

/**
 *  Client Info Model
 *
 *  @author Jorg Janke
 *  @version $Id: MClientInfo.java,v 1.2 2006/07/30 00:58:37 jjanke Exp $
 */
public class MClientInfo extends org.compiere.orm.MClientInfo
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4861006368856890116L;


	/**
	 * 	Get optionally cached client
	 *	@param ctx context
	 *	@return client
	 */
	public static MClientInfo get (Properties ctx)
	{
		return get (ctx, Env.getAD_Client_ID(ctx), null);
	}	//	get

	/**	Logger						*/
	private static CLogger		s_log = CLogger.getCLogger (MClientInfo.class);

	


	/**	Account Schema				*/
	private MAcctSchema 		m_acctSchema = null;
	/** New Record					*/
	private boolean				m_createNew = false;

	/**
	 * 	Get primary Acct Schema
	 *	@return acct schema
	 */
	public MAcctSchema getMAcctSchema1()
	{
		if (m_acctSchema == null && getC_AcctSchema1_ID() != 0)
			m_acctSchema = new MAcctSchema (getCtx(), getC_AcctSchema1_ID(), null);
		return m_acctSchema;
	}	//	getMAcctSchema1

	/**
	 *	Get Default Accounting Currency
	 *	@return currency or 0
	 */
	public int getC_Currency_ID()
	{
		if (m_acctSchema == null)
			getMAcctSchema1();
		if (m_acctSchema != null)
			return m_acctSchema.getC_Currency_ID();
		return 0;
	}	//	getC_Currency_ID

	
	/**
	 * 	Overwrite Save
	 * 	@overwrite
	 *	@return true if saved
	 */
	public boolean save ()
	{
		if (getAD_Org_ID() != 0)
			setAD_Org_ID(0);
		if (m_createNew)
			return super.save ();
		return saveUpdate();
	}	//	save

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MClientInfo (Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

	public MClientInfo (MClient client, int AD_Tree_Org_ID, int AD_Tree_BPartner_ID,
						int AD_Tree_Project_ID, int AD_Tree_SalesRegion_ID, int AD_Tree_Product_ID,
						int AD_Tree_Campaign_ID, int AD_Tree_Activity_ID, String trxName) {
		super(client, AD_Tree_Org_ID, AD_Tree_BPartner_ID,
		AD_Tree_Project_ID, AD_Tree_SalesRegion_ID, AD_Tree_Product_ID,
		AD_Tree_Campaign_ID, AD_Tree_Activity_ID, trxName);
	}

	/**
	 * 	Get Client Info
	 * 	@param ctx context
	 * 	@param AD_Client_ID id
	 * 	@param trxName optional trx
	 * 	@return Client Info
	 */
	public static MClientInfo get (Properties ctx, int AD_Client_ID, String trxName)
	{
		Integer key = new Integer (AD_Client_ID);
		MClientInfo info = (MClientInfo)s_cache.get(key);
		if (info != null)
			return info;
		//
		String sql = "SELECT * FROM AD_ClientInfo WHERE AD_Client_ID=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			pstmt = DB.prepareStatement (sql, trxName);
			pstmt.setInt (1, AD_Client_ID);
			rs = pstmt.executeQuery ();
			if (rs.next ())
			{
				info = new MClientInfo(ctx, rs, null);
				if (trxName == null)
					s_cache.put (key, info);
			}
		}
		catch (SQLException ex)
		{
			s_log.log(Level.SEVERE, sql, ex);
		}
		finally
		{
			DB.close(rs, pstmt);
			rs = null;
			pstmt = null;
		}
		//
		return info;
	}	//	get


	/**
	 * 	Get Client Info
	 * 	@param ctx context
	 * 	@param AD_Client_ID id
	 * 	@return Client Info
	 */
	public static MClientInfo get (Properties ctx, int AD_Client_ID)
	{
		return get(ctx, AD_Client_ID, null);
	}	//	get

}	//	MClientInfo
