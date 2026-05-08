// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.reward

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RewardDeleteResponseTest {

    @Test
    fun create() {
        val rewardDeleteResponse = RewardDeleteResponse.builder().success(true).build()

        assertThat(rewardDeleteResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rewardDeleteResponse = RewardDeleteResponse.builder().success(true).build()

        val roundtrippedRewardDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rewardDeleteResponse),
                jacksonTypeRef<RewardDeleteResponse>(),
            )

        assertThat(roundtrippedRewardDeleteResponse).isEqualTo(rewardDeleteResponse)
    }
}
