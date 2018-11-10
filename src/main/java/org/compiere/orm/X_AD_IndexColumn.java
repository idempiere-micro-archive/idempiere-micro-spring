package org.compiere.orm;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.I_AD_IndexColumn;
import org.idempiere.orm.I_Persistent;
import org.idempiere.orm.POInfo;

/**
 * Generated Model for AD_IndexColumn
 *
 * @author iDempiere (generated)
 * @version Release 5.1 - $Id$
 */
public class X_AD_IndexColumn extends PO implements I_AD_IndexColumn, I_Persistent {

  /** */
  private static final long serialVersionUID = 20171031L;

  /** Standard Constructor */
  public X_AD_IndexColumn(Properties ctx, int AD_IndexColumn_ID, String trxName) {
    super(ctx, AD_IndexColumn_ID, trxName);
    /**
     * if (AD_IndexColumn_ID == 0) { setAD_IndexColumn_ID (0); setAD_TableIndex_ID (0);
     * setEntityType (null); // @SQL=select get_sysconfig('DEFAULT_ENTITYTYPE','U',0,0) from dual }
     */
  }

  /** Load Constructor */
  public X_AD_IndexColumn(Properties ctx, ResultSet rs, String trxName) {
    super(ctx, rs, trxName);
  }

  /**
   * AccessLevel
   *
   * @return 4 - System
   */
  protected int getAccessLevel() {
    return accessLevel.intValue();
  }

  /** Load Meta Data */
  protected POInfo initPO(Properties ctx) {
    POInfo poi = POInfo.getPOInfo(ctx, Table_ID, get_TrxName());
    return poi;
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("X_AD_IndexColumn[").append(getId()).append("]");
    return sb.toString();
  }

  public org.compiere.model.I_AD_Column getAD_Column() throws RuntimeException {
    return (org.compiere.model.I_AD_Column)
        MTable.get(getCtx(), org.compiere.model.I_AD_Column.Table_Name)
            .getPO(getAD_Column_ID(), get_TrxName());
  }

  /**
   * Set Column.
   *
   * @param AD_Column_ID Column in the table
   */
  public void setAD_Column_ID(int AD_Column_ID) {
    if (AD_Column_ID < 1) set_ValueNoCheck(COLUMNNAME_AD_Column_ID, null);
    else set_ValueNoCheck(COLUMNNAME_AD_Column_ID, Integer.valueOf(AD_Column_ID));
  }

  /**
   * Get Column.
   *
   * @return Column in the table
   */
  public int getAD_Column_ID() {
    Integer ii = (Integer) get_Value(COLUMNNAME_AD_Column_ID);
    if (ii == null) return 0;
    return ii;
  }

  /**
   * Set Table Index Column.
   *
   * @param AD_IndexColumn_ID Table Index Column
   */
  public void setAD_IndexColumn_ID(int AD_IndexColumn_ID) {
    if (AD_IndexColumn_ID < 1) set_ValueNoCheck(COLUMNNAME_AD_IndexColumn_ID, null);
    else set_ValueNoCheck(COLUMNNAME_AD_IndexColumn_ID, Integer.valueOf(AD_IndexColumn_ID));
  }

  /**
   * Get Table Index Column.
   *
   * @return Table Index Column
   */
  public int getAD_IndexColumn_ID() {
    Integer ii = (Integer) get_Value(COLUMNNAME_AD_IndexColumn_ID);
    if (ii == null) return 0;
    return ii;
  }

  /**
   * Set AD_IndexColumn_UU.
   *
   * @param AD_IndexColumn_UU AD_IndexColumn_UU
   */
  public void setAD_IndexColumn_UU(String AD_IndexColumn_UU) {
    set_Value(COLUMNNAME_AD_IndexColumn_UU, AD_IndexColumn_UU);
  }

  /**
   * Get AD_IndexColumn_UU.
   *
   * @return AD_IndexColumn_UU
   */
  public String getAD_IndexColumn_UU() {
    return (String) get_Value(COLUMNNAME_AD_IndexColumn_UU);
  }

  public org.compiere.model.I_AD_TableIndex getAD_TableIndex() throws RuntimeException {
    return (org.compiere.model.I_AD_TableIndex)
        MTable.get(getCtx(), org.compiere.model.I_AD_TableIndex.Table_Name)
            .getPO(getAD_TableIndex_ID(), get_TrxName());
  }

  /**
   * Set Table Index.
   *
   * @param AD_TableIndex_ID Table Index
   */
  public void setAD_TableIndex_ID(int AD_TableIndex_ID) {
    if (AD_TableIndex_ID < 1) set_ValueNoCheck(COLUMNNAME_AD_TableIndex_ID, null);
    else set_ValueNoCheck(COLUMNNAME_AD_TableIndex_ID, Integer.valueOf(AD_TableIndex_ID));
  }

  /**
   * Get Table Index.
   *
   * @return Table Index
   */
  public int getAD_TableIndex_ID() {
    Integer ii = (Integer) get_Value(COLUMNNAME_AD_TableIndex_ID);
    if (ii == null) return 0;
    return ii;
  }

  /**
   * Set Column SQL.
   *
   * @param ColumnSQL Virtual Column (r/o)
   */
  public void setColumnSQL(String ColumnSQL) {
    set_Value(COLUMNNAME_ColumnSQL, ColumnSQL);
  }

  /**
   * Get Column SQL.
   *
   * @return Virtual Column (r/o)
   */
  public String getColumnSQL() {
    return (String) get_Value(COLUMNNAME_ColumnSQL);
  }

  /** EntityType AD_Reference_ID=389 */
  public static final int ENTITYTYPE_AD_Reference_ID = 389;
  /**
   * Set Entity Type.
   *
   * @param EntityType Dictionary Entity Type; Determines ownership and synchronization
   */
  public void setEntityType(String EntityType) {

    set_Value(COLUMNNAME_EntityType, EntityType);
  }

  /**
   * Get Entity Type.
   *
   * @return Dictionary Entity Type; Determines ownership and synchronization
   */
  public String getEntityType() {
    return (String) get_Value(COLUMNNAME_EntityType);
  }

  /**
   * Set Sequence.
   *
   * @param SeqNo Method of ordering records; lowest number comes first
   */
  public void setSeqNo(int SeqNo) {
    set_Value(COLUMNNAME_SeqNo, Integer.valueOf(SeqNo));
  }

  /**
   * Get Sequence.
   *
   * @return Method of ordering records; lowest number comes first
   */
  public int getSeqNo() {
    Integer ii = (Integer) get_Value(COLUMNNAME_SeqNo);
    if (ii == null) return 0;
    return ii;
  }
}
