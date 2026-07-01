// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.rewards

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RewardListParamsTest {

    @Test
    fun create() {
        RewardListParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = RewardListParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
