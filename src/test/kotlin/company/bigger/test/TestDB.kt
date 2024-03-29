package company.bigger.test

import company.bigger.test.support.BaseTest
import company.bigger.common.db.CConnection
import org.junit.Test
import software.hsharp.api.icommon.ICConnection
import software.hsharp.db.postgresql.provider.PgDB
import java.util.Random
import kotlin.test.assertNotNull
import kotlin.test.assertNull

data class loginParams(
    override val dbHost: String = "localhost",
    override val dbPort: Int = 5432,
    override val dbName: String = "idempiere",
    override val dbUid: String = "adempiere",
    override val dbPwd: String = "adempiere",
    override val ssl: Boolean = false
) : ICConnection

class TestDB : BaseTest() {

    internal fun randomString(length: Int): String {
        fun ClosedRange<Char>.randomString(length: Int) =
            (1..length)
                .map { (Random().nextInt(endInclusive.toInt() - start.toInt()) + start.toInt()).toChar() }
                .joinToString("")
        return ('a'..'z').randomString(length)
    }

    @Test
    fun login() {
        val pg = PgDB()
        val cnn = pg.connect(CConnection.get(), true)
        assertNotNull(cnn)
    }
    @Test
    fun loginFail() {
        val pg = PgDB()
        val port = CConnection.get().dbPort
        val cnn = pg.connect(loginParams(dbPort = port, dbUid = randomString(5), dbPwd = randomString(5)))
        assertNull(cnn)
    }
}