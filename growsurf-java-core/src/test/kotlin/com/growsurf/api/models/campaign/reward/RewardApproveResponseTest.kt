// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.reward

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RewardApproveResponseTest {

    @Test
    fun create() {
        val rewardApproveResponse = RewardApproveResponse.builder().success(true).build()

        assertThat(rewardApproveResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rewardApproveResponse = RewardApproveResponse.builder().success(true).build()

        val roundtrippedRewardApproveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rewardApproveResponse),
                jacksonTypeRef<RewardApproveResponse>(),
            )

        assertThat(roundtrippedRewardApproveResponse).isEqualTo(rewardApproveResponse)
    }
}
