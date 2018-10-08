package org.compiere.orm;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.logging.Level;

import org.idempiere.common.util.CLogger;
import org.idempiere.common.util.DB;

/**
 *	(Disk) Tree Node Model BPartner
 *	
 *  @author Jorg Janke
 *  @version $Id: MTree_NodeBP.java,v 1.3 2006/07/30 00:58:38 jjanke Exp $
 */
public class MTree_NodeBP extends X_AD_TreeNodeBP
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5103486471442008006L;

	/**
	 * 	Get Tree Node
	 *	@param tree tree
	 *	@param Node_ID node
	 *	@return node or null
	 */
	public static MTree_NodeBP get (MTree_Base tree, int Node_ID)
	{
		MTree_NodeBP retValue = null;
		String sql = "SELECT * FROM AD_TreeNodeBP WHERE AD_Tree_ID=? AND Node_ID=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			pstmt = DB.prepareStatement (sql, tree.get_TrxName());
			pstmt.setInt (1, tree.getAD_Tree_ID());
			pstmt.setInt (2, Node_ID);
			rs = pstmt.executeQuery ();
			if (rs.next ())
				retValue = new MTree_NodeBP (tree.getCtx(), rs, tree.get_TrxName());
		}
		catch (Exception e)
		{
			s_log.log(Level.SEVERE, "get", e);
		}
		finally
		{
			DB.close(rs, pstmt);
			rs = null;
			pstmt = null;
		}
		return retValue;
	}	//	get

	/**	Static Logger	*/
	private static CLogger	s_log	= CLogger.getCLogger (MTree_NodeBP.class);

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MTree_NodeBP(Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MTree_NodeBP

	/**
	 * 	Full Constructor
	 *	@param tree tree
	 *	@param Node_ID node
	 */
	public MTree_NodeBP (MTree_Base tree, int Node_ID)
	{
		super (tree.getCtx(), 0, tree.get_TrxName());
		setClientOrg(tree);
		setAD_Tree_ID (tree.getAD_Tree_ID());
		setNode_ID(Node_ID);
		//	Add to root
		setParent_ID(0);
		setSeqNo (0);
	}	//	MTree_NodeBP

}	//	MTree_NodeBP