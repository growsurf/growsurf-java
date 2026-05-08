// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.commission

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommissionApproveParamsTest {

    @Test
    fun create() {
        CommissionApproveParams.builder().id("id").commissionId("commissionId").build()
    }

    @Test
    fun pathParams() {
        val params = CommissionApproveParams.builder().id("id").commissionId("commissionId").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("commissionId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
