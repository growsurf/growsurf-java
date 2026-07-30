// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantGetPayoutDestinationResponseTest {

    @Test
    fun create() {
        val participantGetPayoutDestinationResponse =
            ParticipantGetPayoutDestinationResponse.builder()
                .activeProvider("PAYPAL")
                .addDestination(
                    ParticipantGetPayoutDestinationResponse.Destination.builder()
                        .claimEmail("claimEmail")
                        .confirmedAt(0L)
                        .legalEntityType(
                            ParticipantGetPayoutDestinationResponse.Destination.LegalEntityType
                                .INDIVIDUAL
                        )
                        .needsRepairReason("needsRepairReason")
                        .provider("PAYPAL")
                        .providerDisplayName("providerDisplayName")
                        .status("status")
                        .build()
                )
                .addEnabledProvider("PAYPAL")
                .build()

        assertThat(participantGetPayoutDestinationResponse.activeProvider()).contains("PAYPAL")
        assertThat(participantGetPayoutDestinationResponse.destinations().getOrNull())
            .containsExactly(
                ParticipantGetPayoutDestinationResponse.Destination.builder()
                    .claimEmail("claimEmail")
                    .confirmedAt(0L)
                    .legalEntityType(
                        ParticipantGetPayoutDestinationResponse.Destination.LegalEntityType
                            .INDIVIDUAL
                    )
                    .needsRepairReason("needsRepairReason")
                    .provider("PAYPAL")
                    .providerDisplayName("providerDisplayName")
                    .status("status")
                    .build()
            )
        assertThat(participantGetPayoutDestinationResponse.enabledProviders().getOrNull())
            .containsExactly("PAYPAL")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val participantGetPayoutDestinationResponse =
            ParticipantGetPayoutDestinationResponse.builder()
                .activeProvider("PAYPAL")
                .addDestination(
                    ParticipantGetPayoutDestinationResponse.Destination.builder()
                        .claimEmail("claimEmail")
                        .confirmedAt(0L)
                        .legalEntityType(
                            ParticipantGetPayoutDestinationResponse.Destination.LegalEntityType
                                .INDIVIDUAL
                        )
                        .needsRepairReason("needsRepairReason")
                        .provider("PAYPAL")
                        .providerDisplayName("providerDisplayName")
                        .status("status")
                        .build()
                )
                .addEnabledProvider("PAYPAL")
                .build()

        val roundtrippedParticipantGetPayoutDestinationResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(participantGetPayoutDestinationResponse),
                jacksonTypeRef<ParticipantGetPayoutDestinationResponse>(),
            )

        assertThat(roundtrippedParticipantGetPayoutDestinationResponse)
            .isEqualTo(participantGetPayoutDestinationResponse)
    }

    @Test
    fun decodesUnknownFutureProvider() {
        val response =
            jsonMapper()
                .readValue(
                    """{"activeProvider":"TESTBANK","enabledProviders":["TESTBANK"],"destinations":[{"provider":"TESTBANK"}]}""",
                    jacksonTypeRef<ParticipantGetPayoutDestinationResponse>(),
                )

        assertThat(response.activeProvider()).contains("TESTBANK")
        assertThat(response.enabledProviders().get()).containsExactly("TESTBANK")
        assertThat(response.destinations().get().single().provider()).contains("TESTBANK")
    }

    @Test
    fun treatsRedundantParticipantIdAsAnAdditionalProperty() {
        val response =
            jsonMapper()
                .readValue(
                    """{"participantId":"participant"}""",
                    jacksonTypeRef<ParticipantGetPayoutDestinationResponse>(),
                )

        assertThat(response._additionalProperties()).containsKey("participantId")
    }
}
