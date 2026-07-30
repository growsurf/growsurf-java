// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantRequestPayoutDestinationConfirmationParamsTest {

    @Test
    fun create() {
        ParticipantRequestPayoutDestinationConfirmationParams.builder()
            .id("id")
            .participantIdOrEmail("participantIdOrEmail")
            .provider(ParticipantRequestPayoutDestinationConfirmationParams.Provider.PAYPAL)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ParticipantRequestPayoutDestinationConfirmationParams.builder()
                .id("id")
                .participantIdOrEmail("participantIdOrEmail")
                .provider(ParticipantRequestPayoutDestinationConfirmationParams.Provider.PAYPAL)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("participantIdOrEmail")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ParticipantRequestPayoutDestinationConfirmationParams.builder()
                .id("id")
                .participantIdOrEmail("participantIdOrEmail")
                .provider(ParticipantRequestPayoutDestinationConfirmationParams.Provider.PAYPAL)
                .build()

        val body = params._body()

        assertThat(body.provider())
            .isEqualTo(ParticipantRequestPayoutDestinationConfirmationParams.Provider.PAYPAL)
    }
}
