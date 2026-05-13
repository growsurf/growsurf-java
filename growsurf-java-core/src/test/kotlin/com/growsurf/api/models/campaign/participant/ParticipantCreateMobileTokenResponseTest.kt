// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantCreateMobileTokenResponseTest {

    @Test
    fun create() {
        val participantCreateMobileTokenResponse =
            ParticipantCreateMobileTokenResponse.builder()
                .expiresIn(0L)
                .participantToken("participantToken")
                .build()

        assertThat(participantCreateMobileTokenResponse.expiresIn()).isEqualTo(0L)
        assertThat(participantCreateMobileTokenResponse.participantToken())
            .isEqualTo("participantToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val participantCreateMobileTokenResponse =
            ParticipantCreateMobileTokenResponse.builder()
                .expiresIn(0L)
                .participantToken("participantToken")
                .build()

        val roundtrippedParticipantCreateMobileTokenResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(participantCreateMobileTokenResponse),
                jacksonTypeRef<ParticipantCreateMobileTokenResponse>(),
            )

        assertThat(roundtrippedParticipantCreateMobileTokenResponse)
            .isEqualTo(participantCreateMobileTokenResponse)
    }
}
