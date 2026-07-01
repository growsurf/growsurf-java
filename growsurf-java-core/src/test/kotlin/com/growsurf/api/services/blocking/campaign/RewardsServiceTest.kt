// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking.campaign

import com.growsurf.api.client.okhttp.GrowsurfOkHttpClient
import com.growsurf.api.models.campaign.rewards.RewardCreateParams
import com.growsurf.api.models.campaign.rewards.RewardDeleteParams
import com.growsurf.api.models.campaign.rewards.RewardUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RewardsServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val rewardsService = client.campaign().rewards()

        val reward =
            rewardsService.create(
                RewardCreateParams.builder()
                    .id("id")
                    .type(RewardCreateParams.Type.SINGLE_SIDED)
                    .build()
            )

        reward.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val rewardsService = client.campaign().rewards()

        val reward =
            rewardsService.update(
                RewardUpdateParams.builder().id("id").rewardId("rewardId").build()
            )

        reward.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val rewardsService = client.campaign().rewards()

        val response = rewardsService.list("id")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val rewardsService = client.campaign().rewards()

        val response =
            rewardsService.delete(
                RewardDeleteParams.builder().id("id").rewardId("rewardId").build()
            )

        response.validate()
    }
}
