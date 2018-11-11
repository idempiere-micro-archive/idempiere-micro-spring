package org.compiere.lookups;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import org.compiere.query.MQuery;
import org.idempiere.common.util.CLogger;
import org.idempiere.common.util.DB;

/**
 * Info Class for Lookup SQL (ValueObject)
 *
 * @author Jorg Janke
 * @version $Id: MLookupInfo.java,v 1.3 2006/07/30 00:58:37 jjanke Exp $
 */
public class MLookupInfo implements Serializable, Cloneable {
  /**
   * Get first AD_Reference_ID of a matching Reference Name. Can have SQL LIKE placeholders. (This
   * is more a development tool than used for production)
   *
   * @param referenceName reference name
   * @return AD_Reference_ID
   */
  public static int getAD_Reference_ID(String referenceName) {
    int retValue = 0;
    String sql =
        "SELECT AD_Reference_ID,Name,ValidationType,IsActive "
            + "FROM AD_Reference WHERE Name LIKE ?";
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try {
      pstmt = DB.prepareStatement(sql, null);
      pstmt.setString(1, referenceName);
      rs = pstmt.executeQuery();
      //
      int i = 0;
      int id = 0;
      String refName = "";
      String validationType = "";
      boolean isActive = false;
      while (rs.next()) {
        id = rs.getInt(1);
        if (i == 0) retValue = id;
        refName = rs.getString(2);
        validationType = rs.getString(3);
        isActive = rs.getString(4).equals("Y");
        StringBuilder msgconf =
            new StringBuilder("AD_Reference Name=")
                .append(refName)
                .append(", ID=")
                .append(id)
                .append(", Type=")
                .append(validationType)
                .append(", Active=")
                .append(isActive);
        CLogger.get().config(msgconf.toString());
      }
    } catch (SQLException e) {
      CLogger.get().log(Level.SEVERE, sql, e);
    } finally {
      DB.close(rs, pstmt);
      rs = null;
      pstmt = null;
    }
    return retValue;
  } //  getAD_Reference_ID

  /**
   * Get first AD_Column_ID of matching ColumnName. Can have SQL LIKE placeholders. (This is more a
   * development tool than used for production)
   *
   * @param columnName column name
   * @return AD_Column_ID
   */
  public static int getAD_Column_ID(String columnName) {
    int retValue = 0;
    String sql =
        "SELECT c.AD_Column_ID,c.ColumnName,t.TableName "
            + "FROM AD_Column c, AD_Table t "
            + "WHERE c.ColumnName LIKE ? AND c.AD_Table_ID=t.AD_Table_ID";
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try {
      pstmt = DB.prepareStatement(sql, null);
      pstmt.setString(1, columnName);
      rs = pstmt.executeQuery();
      //
      int i = 0;
      int id = 0;
      String colName = "";
      String tabName = "";
      while (rs.next()) {
        id = rs.getInt(1);
        if (i == 0) retValue = id;
        colName = rs.getString(2);
        tabName = rs.getString(3);
        StringBuilder msgconf =
            new StringBuilder("Name=")
                .append(colName)
                .append(", ID=")
                .append(id)
                .append(", Table=")
                .append(tabName);
        CLogger.get().config(msgconf.toString());
      }
    } catch (SQLException e) {
      CLogger.get().log(Level.SEVERE, sql, e);
    } finally {
      DB.close(rs, pstmt);
      rs = null;
      pstmt = null;
    }
    return retValue;
  } //  getAD_Column_ID

  /**
   * ************************************************************************ Constructor. (called
   * from MLookupFactory)
   *
   * @param sqlQuery SQL query
   * @param tableName table name
   * @param keyColumn key column
   * @param zoomWindow zoom window
   * @param zoomWindowPO PO zoom window
   * @param zoomQuery zoom query
   */
  public MLookupInfo(
      String sqlQuery,
      String tableName,
      String keyColumn,
      int zoomWindow,
      int zoomWindowPO,
      MQuery zoomQuery) {
    if (sqlQuery == null) throw new IllegalArgumentException("SqlQuery is null");
    Query = sqlQuery;
    if (keyColumn == null) throw new IllegalArgumentException("KeyColumn is null");
    TableName = tableName;
    KeyColumn = keyColumn;
    ZoomWindow = zoomWindow;
    ZoomWindowPO = zoomWindowPO;
    ZoomQuery = zoomQuery;
  } //  MLookupInfo

  static final long serialVersionUID = -1869207615748248653L;

  /** SQL Query */
  public String Query = null;
  /** Table Name */
  public String TableName = "";
  /** Key Column */
  public String KeyColumn = "";
  /** Zoom Window */
  public int ZoomWindow;
  /** Zoom Window */
  public int ZoomWindowPO;
  /** Zoom Query */
  public MQuery ZoomQuery = null;

  /** Direct Access Query */
  public String QueryDirect = "";
  /** Parent Flag */
  public boolean IsParent = false;
  /** Key Flag */
  public boolean IsKey = false;
  /** Validation code */
  public String ValidationCode = "";
  /** Validation flag */
  public boolean IsValidated = true;

  /** Context */
  public Properties ctx = null;
  /** WindowNo */
  public int WindowNo;
  /** TabNo */
  public int tabNo;

  /** AD_Column_Info or AD_Process_Para */
  public int Column_ID;
  /** AD_Reference_ID */
  public int DisplayType;
  /** Real AD_Reference_ID */
  public int AD_Reference_Value_ID;
  /** CreadedBy?updatedBy */
  public boolean IsCreadedUpdatedBy = false;

  public String parsedValidationCode = "";

  public String DisplayColumn;

  public int InfoWindowId;

  /**
   * String representation
   *
   * @return info
   */
  public String toString() {
    StringBuilder sb =
        new StringBuilder("MLookupInfo[")
            .append(KeyColumn)
            .append("-Direct=")
            .append(QueryDirect)
            .append("]");
    return sb.toString();
  } //	toString

  /**
   * Clone
   *
   * @return deep copy
   */
  public MLookupInfo cloneIt() {
    try {
      MLookupInfo clone = (MLookupInfo) super.clone();
      return clone;
    } catch (Exception e) {
      CLogger.get().log(Level.SEVERE, "", e);
    }
    return null;
  } //	clone
} //  MLookupInfo
