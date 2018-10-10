package org.compiere.bo.tests

import org.compiere.model.I_C_BPartner
import org.compiere.model.I_C_ContactActivity
import org.compiere.orm.DefaultModelFactory
import org.compiere.orm.IModelFactory
import company.bigger.common.db.CConnection
import company.bigger.test.support.BaseTest
import company.bigger.util.DatabaseImpl
import company.bigger.util.DummyEventManager
import company.bigger.util.DummyService
import org.idempiere.common.db.Database
import org.idempiere.common.util.CLogger
import org.idempiere.common.util.DB
import org.idempiere.common.util.Env
import org.junit.Ignore
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class FactoryTests : BaseTest() {
    @Ignore
    fun getUsingDefaultModelFactoryFromRSSuperComplex() {
        DummyService.setup()
        DummyEventManager.setup()

        CLogger.getCLogger(FactoryTests::class.java)

        val db = Database()
        db.setDatabase(DatabaseImpl())
        DB.setDBTarget(CConnection.get())
        DB.isConnected()

        val ctx = Env.getCtx()
        val AD_CLIENT_ID = 11
        val AD_CLIENT_ID_s = AD_CLIENT_ID.toString()
        ctx.setProperty(Env.AD_CLIENT_ID, AD_CLIENT_ID_s)
        Env.setContext(ctx, Env.AD_CLIENT_ID, AD_CLIENT_ID_s)

        val tableName = I_C_BPartner.Table_Name
        val id = 118

        val sql = """select *, C_ContactActivity_ID as activity_C_ContactActivity_ID from adempiere.bpartner_v
            where c_contactactivity_id is not null
            order by 1, c_contactactivity_id asc"""

        println("SQL:$sql")
        val cnn = DB.getConnectionRO()
        val statement = cnn.prepareStatement(sql)
        val rs = statement.executeQuery()
        rs.next()

        val modelFactory: IModelFactory = DefaultModelFactory()
        val result = modelFactory.getPO(tableName, rs, null)
        val result2 = modelFactory.getPO(I_C_ContactActivity.Table_Name, rs, null, "activity_") as I_C_ContactActivity
        println(result)
        println(result2)
        assertNotNull(result)
        assertNotNull(result2)
        assertEquals(id, result._ID)
        assertEquals(123, result2.c_ContactActivity_ID)

        cnn.close()
    }

    @Test
    fun getUsingDefaultModelFactoryFromRSComplex() {
        DummyService.setup()
        DummyEventManager.setup()

        CLogger.getCLogger(FactoryTests::class.java)

        val db = Database()
        db.setDatabase(DatabaseImpl())
        DB.setDBTarget(CConnection.get())
        DB.isConnected()

        val ctx = Env.getCtx()
        val AD_CLIENT_ID = 11
        val AD_CLIENT_ID_s = AD_CLIENT_ID.toString()
        ctx.setProperty(Env.AD_CLIENT_ID, AD_CLIENT_ID_s)
        Env.setContext(ctx, Env.AD_CLIENT_ID, AD_CLIENT_ID_s)

        val tableName = I_C_BPartner.Table_Name
        val AD_ORG_ID = 0
        val id = 118

        val sql =
                ("SELECT * FROM adempiere.\"${tableName}\", adempiere.M_PriceList " +
                        "WHERE (\"${tableName}\".ad_client_id = ? OR \"${tableName}\".ad_client_id=0) " +
                        "AND (\"${tableName}\".ad_org_id = ? OR \"${tableName}\".ad_org_id=0) " +
                        "AND (\"${tableName}_ID\"=?) AND (M_PriceList.M_PriceList_ID = C_BPartner.M_PriceList_ID);"
                        ).toLowerCase()
        println("SQL:$sql")
        val cnn = DB.getConnectionRO()
        val statement = cnn.prepareStatement(sql)
        statement.setInt(1, AD_CLIENT_ID)
        statement.setInt(2, AD_ORG_ID)
        statement.setInt(3, id)
        val rs = statement.executeQuery()
        rs.next()

        val modelFactory: IModelFactory = DefaultModelFactory()
        val result = modelFactory.getPO(tableName, rs, null)
        val result2 = modelFactory.getPO("M_PriceList", rs, null)
        println(result)
        println(result2)
        assertNotNull(result)
        assertNotNull(result2)
        assertEquals(id, result._ID)
        assertEquals(101, result2._ID)

        cnn.close()
    }
}