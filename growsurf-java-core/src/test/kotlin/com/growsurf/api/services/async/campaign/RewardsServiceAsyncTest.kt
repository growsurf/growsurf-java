// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.async.campaign

import com.growsurf.api.client.okhttp.GrowsurfOkHttpClientAsync
import com.growsurf.api.models.campaign.rewards.RewardCreateParams
import com.growsurf.api.models.campaign.rewards.RewardDeleteParams
import com.growsurf.api.models.campaign.rewards.RewardUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RewardsServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val rewardsServiceAsync = client.campaign().rewards()

        val rewardFuture =
            rewardsServiceAsync.create(
                RewardCreateParams.builder()
                    .id("id")
                    .type(RewardCreateParams.Type.SINGLE_SIDED)
                    .build()
            )

        val reward = rewardFuture.get()
        reward.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val rewardsServiceAsync = client.campaign().rewards()

        val rewardFuture =
            rewardsServiceAsync.update(
                RewardUpdateParams.builder().id("id").campaignRewardId("campaignRewardId").build()
            )

        val reward = rewardFuture.get()
        reward.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val rewardsServiceAsync = client.campaign().rewards()

        val responseFuture = rewardsServiceAsync.list("id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val rewardsServiceAsync = client.campaign().rewards()

        val responseFuture =
            rewardsServiceAsync.delete(
                RewardDeleteParams.builder().id("id").campaignRewardId("campaignRewardId").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
