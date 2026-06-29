// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantCancelDelayedReferralResponseTest {

    @Test
    fun create() {
        val participantCancelDelayedReferralResponse =
            ParticipantCancelDelayedReferralResponse.builder()
                .success(true)
                .message("message")
                .build()

        assertThat(participantCancelDelayedReferralResponse.success()).isEqualTo(true)
        assertThat(participantCancelDelayedReferralResponse.message()).contains("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val participantCancelDelayedReferralResponse =
            ParticipantCancelDelayedReferralResponse.builder()
                .success(true)
                .message("message")
                .build()

        val roundtrippedParticipantCancelDelayedReferralResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(participantCancelDelayedReferralResponse),
                jacksonTypeRef<ParticipantCancelDelayedReferralResponse>(),
            )

        assertThat(roundtrippedParticipantCancelDelayedReferralResponse)
            .isEqualTo(participantCancelDelayedReferralResponse)
    }
}
