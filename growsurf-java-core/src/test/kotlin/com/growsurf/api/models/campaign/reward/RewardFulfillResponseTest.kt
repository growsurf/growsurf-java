// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.reward

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RewardFulfillResponseTest {

    @Test
    fun create() {
        val rewardFulfillResponse = RewardFulfillResponse.builder().success(true).build()

        assertThat(rewardFulfillResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rewardFulfillResponse = RewardFulfillResponse.builder().success(true).build()

        val roundtrippedRewardFulfillResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rewardFulfillResponse),
                jacksonTypeRef<RewardFulfillResponse>(),
            )

        assertThat(roundtrippedRewardFulfillResponse).isEqualTo(rewardFulfillResponse)
    }
}
