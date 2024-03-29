package org.compiere.orm;

import static org.compiere.util.SystemIDs.ENTITYTYPE_ADEMPIERE;
import static org.compiere.util.SystemIDs.ENTITYTYPE_DICTIONARY;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.I_AD_EntityType;
import org.idempiere.common.util.CCache;
import org.idempiere.common.util.CLogger;

/**
 * Enitity Type Model
 *
 * @author Jorg Janke
 * @version $Id: MEntityType.java,v 1.2 2006/07/30 00:51:02 jjanke Exp $
 * @author Teo Sarca
 *     <li>BF [ 2827777 ] MEntityType.isSystemMaintained not working well
 *         https://sourceforge.net/tracker/?func=detail&aid=2827777&group_id=176962&atid=879332
 *     <li>FR [ 2827786 ] Introduce MEntityType.get(Properties ctx, String entityType)
 *         https://sourceforge.net/tracker/?func=detail&aid=2827786&group_id=176962&atid=879335
 *     <li>BF [ 2861194 ] EntityType is not using normal PO framework for getting IDs
 *         https://sourceforge.net/tracker/?func=detail&aid=2861194&group_id=176962&atid=879332
 */
public class MEntityType extends X_AD_EntityType {
  /** */
  private static final long serialVersionUID = -8449015496292546851L;

  /**
   * Get EntityType object by name
   *
   * @param ctx
   * @param entityType
   * @return
   */
  public static MEntityType get(Properties ctx, String entityType) {
    MEntityType retValue = (MEntityType) s_cache.get(entityType);
    if (retValue != null) return retValue;
    retValue =
        new Query(ctx, I_AD_EntityType.Table_Name, "EntityType=?", null)
            .setParameters(entityType)
            .firstOnly();
    if (retValue != null) s_cache.put(entityType, retValue);
    return retValue;
  }

  /** Cached EntityTypes */
  private static CCache<String, MEntityType> s_cache =
      new CCache<String, MEntityType>(I_AD_EntityType.Table_Name, 20);
  /** Logger */
  @SuppressWarnings("unused")
  private static CLogger s_log = CLogger.getCLogger(MEntityType.class);

  /**
   * ************************************************************************ Standard Constructor
   *
   * @param ctx context
   * @param AD_EntityType_ID id
   * @param trxName transaction
   */
  public MEntityType(Properties ctx, int AD_EntityType_ID, String trxName) {
    super(ctx, AD_EntityType_ID, trxName);
  } //	MEntityType

  /**
   * Load Constructor
   *
   * @param ctx context
   * @param rs result set
   * @param trxName transaction
   */
  public MEntityType(Properties ctx, ResultSet rs, String trxName) {
    super(ctx, rs, trxName);
  } //	MEntityType

  /** First Not System Entity ID 10=D, 20=C, 100=U, 110=CUST, 200=A, 210=EXT, 220=XX etc */
  private static final int s_maxAD_EntityType_ID = 1000000;

  /**
   * Is System Maintained. Any Entity Type with ID < 1000000.
   *
   * @return true if D/C/U/CUST/A/EXT/XX (ID < 1000000)
   */
  public boolean isSystemMaintained() {
    int id = getAD_EntityType_ID();
    return id < s_maxAD_EntityType_ID;
  } //	isSystemMaintained

  /**
   * Before Save
   *
   * @param newRecord new
   * @return true if it can be saved
   */
  protected boolean beforeSave(boolean newRecord) {
    if (!newRecord) {
      int id = getAD_EntityType_ID();
      boolean systemMaintained =
          (id == ENTITYTYPE_DICTIONARY || id == ENTITYTYPE_ADEMPIERE); // 	C/D
      if (systemMaintained) {
        log.saveError("Error", "You cannot modify a System maintained entity");
        return false;
      }
      systemMaintained = is_ValueChanged("EntityType");
      if (systemMaintained) {
        log.saveError("Error", "You cannot modify EntityType");
        return false;
      }
      systemMaintained =
          isSystemMaintained()
              && (is_ValueChanged("Name")
                  || is_ValueChanged("Description")
                  || is_ValueChanged("Help")
                  || is_ValueChanged("IsActive"));
      if (systemMaintained) {
        log.saveError("Error", "You cannot modify Name,Description,Help");
        return false;
      }
    } else //	new
    {
      /*
      setEntityType(getEntityType().toUpperCase());	//	upper case
      if (getEntityType().trim().length() < 4)
      {
      	log.saveError("FillMandatory", Msg.getElement(getCtx(), "EntityType")
      		+ " - 4 Characters");
      	return false;
      }
      boolean ok = true;
      char[] cc = getEntityType().toCharArray();
      for (int i = 0; i < cc.length; i++)
      {
      	char c = cc[i];
      	if (Character.isDigit(c) || (c >= 'A' && c <= 'Z'))
      		continue;
      	//
      	log.saveError("FillMandatory", Msg.getElement(getCtx(), "EntityType")
      		+ " - Must be ASCII Letter or Digit");
      	return false;
      }
      */
      // setAD_EntityType_ID();
    } //	new
    return true;
  } //	beforeSave

  /**
   * Before Delete
   *
   * @return true if it can be deleted
   */
  protected boolean beforeDelete() {
    if (isSystemMaintained()) //	all pre-defined
    {
      log.saveError("Error", "You cannot delete a System maintained entity");
      return false;
    }
    return true;
  } //	beforeDelete
} //	MEntityType
