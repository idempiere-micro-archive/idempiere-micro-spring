package org.idempiere.common.db;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import javax.sql.RowSet;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import org.idempiere.common.db.util.AutoCommitConnectionBroker;
import org.idempiere.common.exceptions.DBException;
import org.idempiere.common.util.CLogger;
import org.idempiere.common.util.CStatementVO;
import org.idempiere.common.util.DB;
import org.idempiere.common.util.Trx;

/**
 * Dynamic proxy for the CStatement interface
 *
 * @author Low Heng Sin
 */
public class StatementProxy implements InvocationHandler {

  protected Connection m_conn = null;

  private boolean close = false;

  /** Logger */
  protected transient CLogger log = CLogger.getCLogger(getClass());
  /** Used if local */
  protected transient Statement p_stmt = null;
  /** Value Object */
  protected CStatementVO p_vo = null;

  public StatementProxy(int resultSetType, int resultSetConcurrency, String trxName) {
    p_vo = new CStatementVO(resultSetType, resultSetConcurrency);
    p_vo.setTrxName(trxName);

    init();
  }

  public StatementProxy(CStatementVO vo) {
    p_vo = vo;
    init();
  }

  // for subclass
  protected StatementProxy() {}

  private SimpleDateFormat format =
      (SimpleDateFormat) DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);

  public Object invoke(Object obj, Method method, Object[] args) throws Throwable {
    String name = method.getName();
    // handle special case
    if (name.equals("executeQuery")
        || name.equals("executeUpdate")
        || name.equals("execute")
        || name.equals("addBatch")) {
      if (args != null && args.length > 0 && args[0] != null && args[0] instanceof String) {
        String sql = (String) args[0];
        p_vo.setSql(DB.getDatabase().convertStatement(sql));
        args[0] = p_vo.getSql();
      }
    } else if (name.equals("close") && (args == null || args.length == 0)) {
      close();
      return null;
    } else if (name.equals("getRowSet") && (args == null || args.length == 0)) {
      return getRowSet();
    } else if (name.equals("isClosed") && (args == null || args.length == 0)) {
      return close;
    } else if (name.equals("finalize") && (args == null || args.length == 0)) {
      if (p_stmt != null && !close) {
        this.close();
      }
      return null;
    } else if (name.equals("commit") && (args == null || args.length == 0)) {
      commit();
      return null;
    } else if (name.equals("getSql") && (args == null || args.length == 0)) {
      return getSql();
    }

    String logSql = null;
    String logOperation = null;
    if (log.isLoggable(Level.FINE) && getSql() != null) {
      if (name.equals("executeUpdate") || name.equals("execute")) {
        logSql = getSql().toUpperCase();
        if (logSql.startsWith("UPDATE ")) {
          logSql = logSql.substring("UPDATE ".length()).trim();
          logOperation = "Update";
        } else if (logSql.startsWith("INSERT INTO ")) {
          logSql = logSql.substring("INSERT INTO ".length()).trim();
          logOperation = "Insert";
        } else if (logSql.startsWith("DELETE FROM ")) {
          logSql = logSql.substring("DELETE FROM ".length()).trim();
          logOperation = "Delete";
        }
        if (logOperation != null) {
          int idxspace = logSql.indexOf(' ');
          if (idxspace > 0) logSql = logSql.substring(0, logSql.indexOf(' '));
          if (log.isLoggable(Level.FINE))
            log.fine(
                format.format(new Date(System.currentTimeMillis()))
                    + ","
                    + logOperation
                    + ","
                    + logSql
                    + ","
                    + (p_vo.getTrxName() != null ? p_vo.getTrxName() : "")
                    + " (begin)");
        }
      }
    }
    Method m = p_stmt.getClass().getMethod(name, method.getParameterTypes());
    try {
      return m.invoke(p_stmt, args);
    } catch (InvocationTargetException e) {
      throw DB.getSQLException(e);
    } finally {
      if (log.isLoggable(Level.FINE) && logSql != null && logOperation != null) {
        log.fine(
            format.format(new Date(System.currentTimeMillis()))
                + ","
                + logOperation
                + ","
                + logSql
                + ","
                + (p_vo.getTrxName() != null ? p_vo.getTrxName() : "")
                + " (end)");
      }
    }
  }

  /** Initialise the statement wrapper object */
  protected void init() {
    try {
      Connection conn = null;
      Trx trx = p_vo.getTrxName() == null ? null : Trx.get(p_vo.getTrxName(), false);
      if (trx != null) {
        conn = trx.getConnection();
      } else {
        m_conn = AutoCommitConnectionBroker.getConnection();
        conn = m_conn;
      }
      if (conn == null) throw new DBException("No Connection");
      p_stmt = conn.createStatement(p_vo.getResultSetType(), p_vo.getResultSetConcurrency());
    } catch (SQLException e) {
      log.log(Level.SEVERE, "CStatement", e);
      throw new DBException(e);
    }
  }

  /**
   * Close
   *
   * @throws SQLException
   * @see java.sql.Statement#close()
   */
  private void close() throws SQLException {
    if (close) return;

    try {
      DB.close(p_stmt);
    } finally {
      if (m_conn != null) {
        AutoCommitConnectionBroker.releaseConnection(m_conn);
      }
      m_conn = null;
      p_stmt = null;
      close = true;
    }
  } //	close

  /**
   * Execute Query
   *
   * @return ResultSet or RowSet
   * @throws SQLException
   * @see java.sql.PreparedStatement#executeQuery()
   */
  protected RowSet getRowSet() {
    log.finest("getRowSet");
    RowSet rowSet = null;
    ResultSet rs = null;
    try {
      rs = p_stmt.executeQuery(p_vo.getSql());
      CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();
      crs.populate(rs);
      rowSet = crs;
    } catch (Exception ex) {
      log.log(Level.SEVERE, p_vo.toString(), ex);
      throw new RuntimeException(ex);
    } finally {
      DB.close(rs);
      rs = null;
      DB.close(rowSet);
      rowSet = null;
    }
    return rowSet;
  } //	local_getRowSet

  /**
   * Commit (if local)
   *
   * @throws SQLException
   */
  private void commit() throws SQLException {
    if (m_conn != null && !m_conn.getAutoCommit()) {
      m_conn.commit();
    }
  } //	commit

  /**
   * Get Sql
   *
   * @return sql
   */
  public String getSql() {
    if (p_vo != null) return p_vo.getSql();
    return null;
  } //	getSql
}
