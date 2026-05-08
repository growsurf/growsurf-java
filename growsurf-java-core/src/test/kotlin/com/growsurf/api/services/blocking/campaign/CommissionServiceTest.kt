// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking.campaign

import com.growsurf.api.client.okhttp.GrowsurfOkHttpClient
import com.growsurf.api.models.campaign.commission.CommissionApproveParams
import com.growsurf.api.models.campaign.commission.CommissionDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CommissionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val commissionService = client.campaign().commission()

        val commission =
            commissionService.delete(
                CommissionDeleteParams.builder().id("id").commissionId("commissionId").build()
            )

        commission.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun approve() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val commissionService = client.campaign().commission()

        val response =
            commissionService.approve(
                CommissionApproveParams.builder().id("id").commissionId("commissionId").build()
            )

        response.validate()
    }
}
