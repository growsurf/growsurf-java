// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantSendInvitesParamsTest {

    @Test
    fun create() {
        ParticipantSendInvitesParams.builder()
            .id("id")
            .participantIdOrEmail("participantIdOrEmail")
            .addEmailAddress("erlich@aviato.com")
            .messageText("{{referrerFirstName}} invited you with {{referrerShareUrl}}.")
            .subjectText("Join me on Pied Piper")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ParticipantSendInvitesParams.builder()
                .id("id")
                .participantIdOrEmail("participantIdOrEmail")
                .addEmailAddress("erlich@aviato.com")
                .messageText("{{referrerFirstName}} invited you with {{referrerShareUrl}}.")
                .subjectText("Join me on Pied Piper")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("participantIdOrEmail")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ParticipantSendInvitesParams.builder()
                .id("id")
                .participantIdOrEmail("participantIdOrEmail")
                .addEmailAddress("erlich@aviato.com")
                .messageText("{{referrerFirstName}} invited you with {{referrerShareUrl}}.")
                .subjectText("Join me on Pied Piper")
                .build()

        val body = params._body()

        assertThat(body.emailAddresses()).containsExactly("erlich@aviato.com")
        assertThat(body.messageText())
            .isEqualTo("{{referrerFirstName}} invited you with {{referrerShareUrl}}.")
        assertThat(body.subjectText()).isEqualTo("Join me on Pied Piper")
    }
}
