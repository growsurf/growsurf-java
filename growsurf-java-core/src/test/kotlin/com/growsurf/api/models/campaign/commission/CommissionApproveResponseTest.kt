// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.commission

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommissionApproveResponseTest {

    @Test
    fun create() {
        val commissionApproveResponse = CommissionApproveResponse.builder().success(true).build()

        assertThat(commissionApproveResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val commissionApproveResponse = CommissionApproveResponse.builder().success(true).build()

        val roundtrippedCommissionApproveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(commissionApproveResponse),
                jacksonTypeRef<CommissionApproveResponse>(),
            )

        assertThat(roundtrippedCommissionApproveResponse).isEqualTo(commissionApproveResponse)
    }
}
