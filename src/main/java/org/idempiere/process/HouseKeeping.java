/**********************************************************************
* This file is part of Adempiere ERP Bazaar                           *
* http://www.adempiere.org                                            *
*                                                                     *
* Copyright (C) Diego Ruiz                                            *
* Copyright (C) Contributors                                          *
*                                                                     *
* This program is free software; you can redistribute it and/or       *
* modify it under the terms of the GNU General Public License         *
* as published by the Free Software Foundation; either version 2      *
* of the License, or (at your option) any later version.              *
*                                                                     *
* This program is distributed in the hope that it will be useful,     *
* but WITHOUT ANY WARRANTY; without even the implied warranty of      *
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the        *
* GNU General Public License for more details.                        *
*                                                                     *
* You should have received a copy of the GNU General Public License   *
* along with this program; if not, write to the Free Software         *
* Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,          *
* MA 02110-1301, USA.                                                 *
*                                                                     *
* Contributors:                                                       *
* - Diego Ruiz   (d_ruiz@users.sourceforge.net)                       *
*                                                                     * 
* Sponsors:                                                           *
* - GlobalQSS (http://www.globalqss.com)                              *
**********************************************************************/

package org.idempiere.process;

import java.io.File;
import java.io.FileWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;

import org.compiere.model.IProcessInfoParameter;
import org.compiere.orm.GenericPO;
import org.compiere.orm.MTable;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.Msg;
import org.idempiere.common.util.AdempiereSystemError;
import org.idempiere.common.util.DB;

/**
 *	House Keeping
 *	
 *  @author Diego Ruiz - globalqss
 */
public class HouseKeeping extends SvrProcess{
	
	private int		p_AD_HouseKeeping_ID = 0;
	
	protected void prepare() {
		IProcessInfoParameter[] parameter = getParameter();
		for (int i = 0; i < parameter.length; i++)
		{
			String name = parameter[i].getParameterName();
			if (parameter[i].getParameter() == null);
			else if (name.equals("AD_HouseKeeping_ID"))
				p_AD_HouseKeeping_ID = parameter[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
		if (p_AD_HouseKeeping_ID == 0)
			p_AD_HouseKeeping_ID = getRecord_ID();		
	}  //prepare

	protected String doIt() throws Exception {
		
		X_AD_HouseKeeping houseKeeping = new X_AD_HouseKeeping(getCtx(), p_AD_HouseKeeping_ID,get_TrxName());
		int tableID = houseKeeping.getAD_Table_ID();
		MTable table = new MTable(getCtx(), tableID, get_TrxName());
		String tableName = table.getTableName();	
		String whereClause = houseKeeping.getWhereClause();	
		int noins = 0;
		int noexp = 0;
		int nodel = 0;

		if (houseKeeping.isSaveInHistoric()){
			StringBuilder sql = new StringBuilder("INSERT INTO hst_").append(tableName).append(" SELECT * FROM ").append(tableName);
			if (whereClause != null && whereClause.length() > 0)				
				sql.append(" WHERE ").append(whereClause);
			noins = DB.executeUpdate(sql.toString(), get_TrxName());
			if (noins == -1)
				throw new AdempiereSystemError("Cannot insert into hst_"+tableName);
			addLog("@Inserted@ " + noins);
		} //saveInHistoric

		Date date = new Date();
		if (houseKeeping.isExportXMLBackup()){
			String pathFile = houseKeeping.getBackupFolder();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
			String dateString = dateFormat.format(date);
			FileWriter file = new FileWriter(pathFile+File.separator+tableName+dateString+".xml");
			StringBuilder sql = new StringBuilder("SELECT * FROM ").append(tableName);
			if (whereClause != null && whereClause.length() > 0)				
				sql.append(" WHERE ").append(whereClause);
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			StringBuffer linexml = null;
			try
			{
				pstmt = DB.prepareStatement(sql.toString(), get_TrxName());
				rs = pstmt.executeQuery();
				while (rs.next()) {
					GenericPO po = new GenericPO(tableName, getCtx(), rs, get_TrxName());
					linexml = po.get_xmlString(linexml);
					noexp++;
				}
				if(linexml != null)
					file.write(linexml.toString());
				file.close();
			}
			catch (Exception e)
			{
				throw e; 
			}
			finally
			{
				DB.close(rs, pstmt);
				pstmt = null;
				rs=null;
			}
			addLog("@Exported@ " + noexp);
		}//XmlExport
		
		StringBuilder sql = new StringBuilder("DELETE FROM ").append(tableName);
		if (whereClause != null && whereClause.length() > 0)				
			sql.append(" WHERE ").append(whereClause);
		nodel = DB.executeUpdate(sql.toString(), get_TrxName());
		if (nodel == -1)
			throw new AdempiereSystemError("Cannot delete from " + tableName);
		Timestamp time = new Timestamp(date.getTime());
		houseKeeping.setLastRun(time);
		houseKeeping.setLastDeleted(nodel);
		houseKeeping.saveEx();
		addLog("@Deleted@ " + nodel);
		StringBuilder msg = new StringBuilder().append(Msg.getElement(getCtx(), tableName + "_ID")).append(" #").append(nodel);
		return msg.toString();
	}//doIt
}
