// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.async.campaign

import com.growsurf.api.client.okhttp.GrowsurfOkHttpClientAsync
import com.growsurf.api.models.campaign.reward.RewardApproveParams
import com.growsurf.api.models.campaign.reward.RewardDeleteParams
import com.growsurf.api.models.campaign.reward.RewardFulfillParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RewardServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val rewardServiceAsync = client.campaign().reward()

        val rewardFuture =
            rewardServiceAsync.delete(
                RewardDeleteParams.builder().id("id").rewardId("rewardId").build()
            )

        val reward = rewardFuture.get()
        reward.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun approve() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val rewardServiceAsync = client.campaign().reward()

        val responseFuture =
            rewardServiceAsync.approve(
                RewardApproveParams.builder().id("id").rewardId("rewardId").fulfill(true).build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun fulfill() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val rewardServiceAsync = client.campaign().reward()

        val responseFuture =
            rewardServiceAsync.fulfill(
                RewardFulfillParams.builder().id("id").rewardId("rewardId").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
