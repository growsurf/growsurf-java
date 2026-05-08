// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantDeleteResponseTest {

    @Test
    fun create() {
        val participantDeleteResponse = ParticipantDeleteResponse.builder().success(true).build()

        assertThat(participantDeleteResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val participantDeleteResponse = ParticipantDeleteResponse.builder().success(true).build()

        val roundtrippedParticipantDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(participantDeleteResponse),
                jacksonTypeRef<ParticipantDeleteResponse>(),
            )

        assertThat(roundtrippedParticipantDeleteResponse).isEqualTo(participantDeleteResponse)
    }
}
