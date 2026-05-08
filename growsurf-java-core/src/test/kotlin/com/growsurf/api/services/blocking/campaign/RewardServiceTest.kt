// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking.campaign

import com.growsurf.api.client.okhttp.GrowsurfOkHttpClient
import com.growsurf.api.models.campaign.reward.RewardApproveParams
import com.growsurf.api.models.campaign.reward.RewardDeleteParams
import com.growsurf.api.models.campaign.reward.RewardFulfillParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RewardServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val rewardService = client.campaign().reward()

        val reward =
            rewardService.delete(RewardDeleteParams.builder().id("id").rewardId("rewardId").build())

        reward.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun approve() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val rewardService = client.campaign().reward()

        val response =
            rewardService.approve(
                RewardApproveParams.builder().id("id").rewardId("rewardId").fulfill(true).build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun fulfill() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val rewardService = client.campaign().reward()

        val response =
            rewardService.fulfill(
                RewardFulfillParams.builder().id("id").rewardId("rewardId").build()
            )

        response.validate()
    }
}
