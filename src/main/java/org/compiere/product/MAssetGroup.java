package org.compiere.product;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.SetGetModel;
import org.compiere.model.I_A_Asset_Group;
import org.compiere.orm.SetGetUtil;
import org.idempiere.common.util.CCache;
import org.idempiere.common.util.DB;

/**
 * Asset Group Model
 * @author Teo Sarca, SC ARHIPAC SERVICE SRL
 */
public class MAssetGroup extends X_A_Asset_Group
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -173157506404569463L;
	/** Cache: ID -> MAssetGroup */
	private static CCache<Integer, MAssetGroup> s_cache = new CCache<Integer, MAssetGroup>(I_A_Asset_Group.Table_Name, 10, 0);
	
	/**
	 * 	Default Constructor
	 *	@param ctx context
	 *	@param A_Asset_Group_ID
	 */
	public MAssetGroup (Properties ctx, int A_Asset_Group_ID, String trxName)
	{
		super (ctx,A_Asset_Group_ID, trxName);
	}	//	MAssetGroup
	
	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 */
	public MAssetGroup (Properties ctx, ResultSet rs, String trxName)
	{
		super (ctx, rs,  trxName);
	}	//	MAssetGroup
	
	/**
	 * Get Asset Group [CACHE]
	 * @param ctx context
	 * @param A_Asset_Group_ID	asset group id
	 * @return asset group or null
	 */
	public static MAssetGroup get(Properties ctx, int A_Asset_Group_ID)
	{
		if (A_Asset_Group_ID <= 0)
			return null;
		// Try cache
		MAssetGroup ag = s_cache.get(A_Asset_Group_ID);
		if (ag != null)
			return ag;
		// Load
		ag = new MAssetGroup(ctx, A_Asset_Group_ID, null);
		if (ag != null && ag.get_ID() != A_Asset_Group_ID)
			ag = null;
		else
			s_cache.put(A_Asset_Group_ID, ag);
		//
		return ag;
	}
	
	/**
	 * Get default asset group ID for given model.
	 * WARNING: trxName = null.
	 * @param m	reference model (used to get AD_Client_ID)
	 * @return default asset group ID or 0 if not found
	 */
	public static int getDefault_ID(SetGetModel m)
	{
		int AD_Client_ID = SetGetUtil.get_AttrValueAsInt(m, "AD_Client_ID");
		/* commented by @win
		int A_AssetType_ID = SetGetUtil.get_AttrValueAsInt(m, MAssetType.COLUMNNAME_A_Asset_Type_ID);
		*/
		final String sql = "SELECT "+ I_A_Asset_Group.COLUMNNAME_A_Asset_Group_ID
				+ " FROM "+ I_A_Asset_Group.Table_Name
				+ " WHERE AD_Client_ID=?"
			//	+ " AND NVL("+COLUMNNAME_A_Asset_Type_ID+",0) IN (0,?)" //commented by @win
				+ " ORDER BY "+ I_A_Asset_Group.COLUMNNAME_IsDefault+" DESC"
							+", "+ I_A_Asset_Group.COLUMNNAME_A_Asset_Group_ID+" ASC" // default first, older first
		;
		/* modify by @win
		int id = DB.getSQLValueEx(null, sql, AD_Client_ID, A_AssetType_ID);
		*/
		int id = DB.getSQLValueEx(null, sql, AD_Client_ID);
		// modify by @win
		
		return id;
	}
	
	/**
	 * Update Asset
	 * - updates asset M_AssetGroup_ID if is null
	 */
	public static void updateAsset(SetGetModel m, int A_Asset_Group_ID)
	{
		/* commented by @win
		int i = (Integer) m.get_AttrValue(MAsset.COLUMNNAME_A_Asset_Type_ID);
		MAssetType type = MAssetType.get(m.getCtx(), m.get_AttrValue(MAsset.COLUMNNAME_A_Asset_Type_ID));
		if (type == null)
			return;
		
		if (A_Asset_Group_ID > 0)
		{
			if (!type.isFixedAsset())
			{
				return;
			}
			MAssetGroup assetGrp = MAssetGroup.get(m.getCtx(), A_Asset_Group_ID);
			int A_Asset_Class_ID = assetGrp.getA_Asset_Class_ID();
			if (A_Asset_Class_ID > 0)
			{
				m.set_AttrValue(MAsset.COLUMNNAME_A_Asset_Class_ID, A_Asset_Class_ID);
			}
		}
		else
		{
			A_Asset_Group_ID = MAssetGroup.getDefault_ID(SetGetUtil.wrap(m));
			m.set_AttrValue(MAsset.COLUMNNAME_A_Asset_Group_ID, A_Asset_Group_ID);
		}
		*/ 
		if (A_Asset_Group_ID < 0) {
			A_Asset_Group_ID = MAssetGroup.getDefault_ID(SetGetUtil.wrap(m));
			m.set_AttrValue(MAsset.COLUMNNAME_A_Asset_Group_ID, A_Asset_Group_ID);
		}
		
		//end modify by @win
	}

	
	protected boolean beforeSave (boolean newRecord)
	{
		/* commented by @win
		MAssetType type = MAssetType.get(getCtx(), getA_Asset_Type_ID());
		if (type != null)
		{
			type.update(SetGetUtil.wrap(this), newRecord == true);
		}
		*/
		//end commented by @win
		
		return true;
	}
	
	
	protected boolean afterSave (boolean newRecord, boolean success)
	{
		if(!success)
		{
			return false;
		}
		//
		//
		return true;
	}
}	//	MAssetGroup
