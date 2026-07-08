// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantEmailResponseTest {

    @Test
    fun create() {
        val participantEmailResponse =
            ParticipantEmailResponse.builder()
                .status(ParticipantEmailResponse.Status.QUEUED)
                .success(true)
                .build()

        assertThat(participantEmailResponse.status())
            .isEqualTo(ParticipantEmailResponse.Status.QUEUED)
        assertThat(participantEmailResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val participantEmailResponse =
            ParticipantEmailResponse.builder()
                .status(ParticipantEmailResponse.Status.QUEUED)
                .success(true)
                .build()

        val roundtrippedParticipantEmailResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(participantEmailResponse),
                jacksonTypeRef<ParticipantEmailResponse>(),
            )

        assertThat(roundtrippedParticipantEmailResponse).isEqualTo(participantEmailResponse)
    }
}
