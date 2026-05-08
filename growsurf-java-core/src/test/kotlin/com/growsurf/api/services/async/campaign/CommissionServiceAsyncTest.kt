// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.async.campaign

import com.growsurf.api.client.okhttp.GrowsurfOkHttpClientAsync
import com.growsurf.api.models.campaign.commission.CommissionApproveParams
import com.growsurf.api.models.campaign.commission.CommissionDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CommissionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val commissionServiceAsync = client.campaign().commission()

        val commissionFuture =
            commissionServiceAsync.delete(
                CommissionDeleteParams.builder().id("id").commissionId("commissionId").build()
            )

        val commission = commissionFuture.get()
        commission.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun approve() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val commissionServiceAsync = client.campaign().commission()

        val responseFuture =
            commissionServiceAsync.approve(
                CommissionApproveParams.builder().id("id").commissionId("commissionId").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
