// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantSendInvitesResponseTest {

    @Test
    fun create() {
        val participantSendInvitesResponse =
            ParticipantSendInvitesResponse.builder()
                .invitesSent(0L)
                .messageType("messageType")
                .success(true)
                .build()

        assertThat(participantSendInvitesResponse.invitesSent()).isEqualTo(0L)
        assertThat(participantSendInvitesResponse.messageType()).isEqualTo("messageType")
        assertThat(participantSendInvitesResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val participantSendInvitesResponse =
            ParticipantSendInvitesResponse.builder()
                .invitesSent(0L)
                .messageType("messageType")
                .success(true)
                .build()

        val roundtrippedParticipantSendInvitesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(participantSendInvitesResponse),
                jacksonTypeRef<ParticipantSendInvitesResponse>(),
            )

        assertThat(roundtrippedParticipantSendInvitesResponse)
            .isEqualTo(participantSendInvitesResponse)
    }
}
