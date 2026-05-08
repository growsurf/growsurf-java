// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.reward

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RewardFulfillParamsTest {

    @Test
    fun create() {
        RewardFulfillParams.builder().id("id").rewardId("rewardId").build()
    }

    @Test
    fun pathParams() {
        val params = RewardFulfillParams.builder().id("id").rewardId("rewardId").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("rewardId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
