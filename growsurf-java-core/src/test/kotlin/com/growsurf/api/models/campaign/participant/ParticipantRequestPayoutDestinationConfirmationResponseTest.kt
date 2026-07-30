// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantRequestPayoutDestinationConfirmationResponseTest {

    @Test
    fun create() {
        val participantRequestPayoutDestinationConfirmationResponse =
            ParticipantRequestPayoutDestinationConfirmationResponse.builder()
                .expiresAt(0L)
                .provider("PAYPAL")
                .providerDisplayName("providerDisplayName")
                .status(
                    ParticipantRequestPayoutDestinationConfirmationResponse.Status
                        .CONFIRMATION_REQUESTED
                )
                .build()

        assertThat(participantRequestPayoutDestinationConfirmationResponse.expiresAt()).contains(0L)
        assertThat(participantRequestPayoutDestinationConfirmationResponse.provider())
            .contains("PAYPAL")
        assertThat(participantRequestPayoutDestinationConfirmationResponse.providerDisplayName())
            .contains("providerDisplayName")
        assertThat(participantRequestPayoutDestinationConfirmationResponse.status())
            .contains(
                ParticipantRequestPayoutDestinationConfirmationResponse.Status
                    .CONFIRMATION_REQUESTED
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val participantRequestPayoutDestinationConfirmationResponse =
            ParticipantRequestPayoutDestinationConfirmationResponse.builder()
                .expiresAt(0L)
                .provider("PAYPAL")
                .providerDisplayName("providerDisplayName")
                .status(
                    ParticipantRequestPayoutDestinationConfirmationResponse.Status
                        .CONFIRMATION_REQUESTED
                )
                .build()

        val roundtrippedParticipantRequestPayoutDestinationConfirmationResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    participantRequestPayoutDestinationConfirmationResponse
                ),
                jacksonTypeRef<ParticipantRequestPayoutDestinationConfirmationResponse>(),
            )

        assertThat(roundtrippedParticipantRequestPayoutDestinationConfirmationResponse)
            .isEqualTo(participantRequestPayoutDestinationConfirmationResponse)
    }

    @Test
    fun decodesUnknownFutureProvider() {
        val response =
            jsonMapper()
                .readValue(
                    """{"provider":"TESTBANK"}""",
                    jacksonTypeRef<ParticipantRequestPayoutDestinationConfirmationResponse>(),
                )

        assertThat(response.provider()).contains("TESTBANK")
    }
}
