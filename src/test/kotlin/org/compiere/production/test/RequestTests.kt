package org.compiere.production.test

import company.bigger.test.support.BaseComponentTest
import org.compiere.model.I_R_Request
import org.compiere.orm.DefaultModelFactory
import org.compiere.orm.IModelFactory
import org.compiere.production.MRequest
import org.compiere.production.MRequestType
import org.compiere.production.MStatus
import org.compiere.production.MStatusCategory
import org.idempiere.common.util.Env
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class RequestTests : BaseComponentTest() {
    companion object {
        const val SUMMARY = "summary"
    }

    @Test
    fun `creating a new request should work`() {
        val ctx = Env.getCtx()
        val requestStatusCategory = MStatusCategory(ctx, 0, null)
        requestStatusCategory.name = "Default"
        requestStatusCategory.save()

        val requestStatus = MStatus(ctx, 0, null)
        requestStatus.name = "Default"
        requestStatus.value = "Default"
        requestStatus.setIsDefault(true)
        requestStatus.r_StatusCategory_ID = requestStatusCategory._ID
        requestStatus.save()

        val requestType = MRequestType(ctx, 0, null)
        requestType.name = "General Request"
        requestType.setIsDefault(true)
        requestType.r_StatusCategory_ID = requestStatusCategory._ID
        requestType.save()

        val request = MRequest(ctx, 1000001, requestType._ID, SUMMARY, true, null)
        request.setR_Status_ID()
        request.save()
        val req: I_R_Request = getById(request._ID, I_R_Request.Table_Name)

        assertEquals(SUMMARY, req.summary)
    }
}