package org.compiere.crm;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.logging.Level;
import org.compiere.model.I_C_BP_Group;
import org.idempiere.common.util.CCache;
import org.idempiere.common.util.CLogger;
import org.idempiere.common.util.DB;
import org.idempiere.common.util.Env;
import org.idempiere.common.util.Util;

/**
 * Business Partner Group Model
 *
 * @author Jorg Janke
 * @version $Id: MBPGroup.java,v 1.4 2006/09/23 15:54:22 jjanke Exp $
 */
public class MBPGroup extends X_C_BP_Group {
  /** */
  private static final long serialVersionUID = 8897399796117872715L;

  /**
   * Get MBPGroup from Cache
   *
   * @param ctx context
   * @param C_BP_Group_ID id
   * @return MBPGroup
   */
  public static MBPGroup get(Properties ctx, int C_BP_Group_ID) {
    Integer key = new Integer(C_BP_Group_ID);
    MBPGroup retValue = (MBPGroup) s_cache.get(key);
    if (retValue != null) return retValue;
    retValue = new MBPGroup(ctx, C_BP_Group_ID, null);
    if (retValue.getId() != 0) s_cache.put(key, retValue);
    return retValue;
  } //	get

  /**
   * @param ctx
   * @param C_BP_Group_ID
   * @param trxName
   * @return MBPGroup
   */
  public static MBPGroup get(Properties ctx, int C_BP_Group_ID, String trxName) {
    if (Util.isEmpty(trxName, true)) return get(ctx, C_BP_Group_ID);
    else return new MBPGroup(ctx, C_BP_Group_ID, trxName);
  }

  /**
   * Get Default MBPGroup
   *
   * @param ctx context
   * @return MBPGroup
   */
  public static MBPGroup getDefault(Properties ctx) {
    int AD_Client_ID = Env.getADClientID(ctx);
    Integer key = new Integer(AD_Client_ID);
    MBPGroup retValue = (MBPGroup) s_cacheDefault.get(key);
    if (retValue != null) return retValue;

    String sql =
        "SELECT * FROM C_BP_Group g "
            + "WHERE IsDefault='Y' AND AD_Client_ID=? "
            + "ORDER BY IsActive DESC";
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try {
      pstmt = DB.prepareStatement(sql, null);
      pstmt.setInt(1, AD_Client_ID);
      rs = pstmt.executeQuery();
      if (rs.next()) {
        retValue = new MBPGroup(ctx, rs, null);
        if (retValue.getId() != 0) s_cacheDefault.put(key, retValue);
      }
    } catch (Exception e) {
      s_log.log(Level.SEVERE, sql, e);
    } finally {
      DB.close(rs, pstmt);
      rs = null;
      pstmt = null;
    }
    if (retValue == null) s_log.warning("No Default BP Group for AD_Client_ID=" + AD_Client_ID);
    return retValue;
  } //	get

  /**
   * Get MBPGroup from Business Partner
   *
   * @param ctx context
   * @param C_BPartner_ID business partner id
   * @return MBPGroup
   */
  public static MBPGroup getOfBPartner(Properties ctx, int C_BPartner_ID) {
    MBPGroup retValue = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    String sql =
        "SELECT * FROM C_BP_Group g "
            + "WHERE EXISTS (SELECT * FROM C_BPartner p "
            + "WHERE p.C_BPartner_ID=? AND p.C_BP_Group_ID=g.C_BP_Group_ID)";
    try {
      pstmt = DB.prepareStatement(sql, null);
      pstmt.setInt(1, C_BPartner_ID);
      rs = pstmt.executeQuery();
      if (rs.next()) {
        retValue = new MBPGroup(ctx, rs, null);
        Integer key = new Integer(retValue.getC_BP_Group_ID());
        if (retValue.getId() != 0) s_cache.put(key, retValue);
      }
    } catch (Exception e) {
      s_log.log(Level.SEVERE, sql, e);
    } finally {
      DB.close(rs, pstmt);
      rs = null;
      pstmt = null;
    }

    return retValue;
  } //	getOfBPartner

  /** Cache */
  private static CCache<Integer, MBPGroup> s_cache =
      new CCache<Integer, MBPGroup>(I_C_BP_Group.Table_Name, 10);
  /** Default Cache */
  private static CCache<Integer, MBPGroup> s_cacheDefault =
      new CCache<Integer, MBPGroup>(
          I_C_BP_Group.Table_Name, MBPGroup.class.getName() + ".Default", 5);
  /** Logger */
  private static CLogger s_log = CLogger.getCLogger(MBPGroup.class);

  /**
   * Standard Constructor
   *
   * @param ctx context
   * @param C_BP_Group_ID id
   * @param trxName transaction
   */
  public MBPGroup(Properties ctx, int C_BP_Group_ID, String trxName) {
    super(ctx, C_BP_Group_ID, trxName);
    if (C_BP_Group_ID == 0) {
      //	setValue (null);
      //	setName (null);
      setIsConfidentialInfo(false); // N
      setIsDefault(false);
      setPriorityBase(X_C_BP_Group.PRIORITYBASE_Same);
    }
  } //	MBPGroup

  /**
   * Load Constructor
   *
   * @param ctx context
   * @param rs result set
   * @param trxName transaction
   */
  public MBPGroup(Properties ctx, ResultSet rs, String trxName) {
    super(ctx, rs, trxName);
  } //	MBPGroup

  /**
   * Get Credit Watch Percent
   *
   * @return 90 or defined percent
   */
  public BigDecimal getCreditWatchPercent() {
    BigDecimal bd = super.getCreditWatchPercent();
    if (bd != null) return bd;
    return new BigDecimal(90);
  } //	getCreditWatchPercent

  /**
   * Get Credit Watch Ratio
   *
   * @return 0.90 or defined percent
   */
  public BigDecimal getCreditWatchRatio() {
    BigDecimal bd = super.getCreditWatchPercent();
    if (bd.compareTo(Env.ZERO) != 0) return bd.divide(Env.ONEHUNDRED, 2, BigDecimal.ROUND_HALF_UP);
    return BigDecimal.valueOf(0.90);
  } //	getCreditWatchRatio

  @Override
  protected boolean beforeSave(boolean newRecord) {
    // TODO Auto-generated method stub
    return true;
  }

  /**
   * After Save
   *
   * @param newRecord new record
   * @param success success
   * @return success
   */
  protected boolean afterSave(boolean newRecord, boolean success) {
    return success;
  } //	afterSave
} //	MBPGroup
