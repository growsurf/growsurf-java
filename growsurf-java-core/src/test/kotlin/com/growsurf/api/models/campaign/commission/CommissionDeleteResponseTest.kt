// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.commission

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommissionDeleteResponseTest {

    @Test
    fun create() {
        val commissionDeleteResponse = CommissionDeleteResponse.builder().success(true).build()

        assertThat(commissionDeleteResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val commissionDeleteResponse = CommissionDeleteResponse.builder().success(true).build()

        val roundtrippedCommissionDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(commissionDeleteResponse),
                jacksonTypeRef<CommissionDeleteResponse>(),
            )

        assertThat(roundtrippedCommissionDeleteResponse).isEqualTo(commissionDeleteResponse)
    }
}
