// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.reward

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RewardApproveParamsTest {

    @Test
    fun create() {
        RewardApproveParams.builder().id("id").rewardId("rewardId").fulfill(true).build()
    }

    @Test
    fun pathParams() {
        val params = RewardApproveParams.builder().id("id").rewardId("rewardId").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("rewardId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RewardApproveParams.builder().id("id").rewardId("rewardId").fulfill(true).build()

        val body = params._body()

        assertThat(body.fulfill()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RewardApproveParams.builder().id("id").rewardId("rewardId").build()

        val body = params._body()
    }
}
