// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.rewards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeleteRewardResponseTest {

    @Test
    fun create() {
        val deleteRewardResponse = DeleteRewardResponse.builder().id("id").success(true).build()

        assertThat(deleteRewardResponse.id()).isEqualTo("id")
        assertThat(deleteRewardResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val deleteRewardResponse = DeleteRewardResponse.builder().id("id").success(true).build()

        val roundtrippedDeleteRewardResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(deleteRewardResponse),
                jacksonTypeRef<DeleteRewardResponse>(),
            )

        assertThat(roundtrippedDeleteRewardResponse).isEqualTo(deleteRewardResponse)
    }
}
