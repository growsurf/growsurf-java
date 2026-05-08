// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantTriggerReferralResponseTest {

    @Test
    fun create() {
        val participantTriggerReferralResponse =
            ParticipantTriggerReferralResponse.builder().success(true).message("message").build()

        assertThat(participantTriggerReferralResponse.success()).isEqualTo(true)
        assertThat(participantTriggerReferralResponse.message()).contains("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val participantTriggerReferralResponse =
            ParticipantTriggerReferralResponse.builder().success(true).message("message").build()

        val roundtrippedParticipantTriggerReferralResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(participantTriggerReferralResponse),
                jacksonTypeRef<ParticipantTriggerReferralResponse>(),
            )

        assertThat(roundtrippedParticipantTriggerReferralResponse)
            .isEqualTo(participantTriggerReferralResponse)
    }
}
