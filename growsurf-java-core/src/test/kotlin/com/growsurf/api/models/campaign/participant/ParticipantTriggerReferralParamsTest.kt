// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantTriggerReferralParamsTest {

    @Test
    fun create() {
        ParticipantTriggerReferralParams.builder()
            .id("id")
            .participantIdOrEmail("participantIdOrEmail")
            .delayInDays(14L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ParticipantTriggerReferralParams.builder()
                .id("id")
                .participantIdOrEmail("participantIdOrEmail")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("participantIdOrEmail")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ParticipantTriggerReferralParams.builder()
                .id("id")
                .participantIdOrEmail("participantIdOrEmail")
                .delayInDays(14L)
                .build()

        val body = params._body()

        assertThat(body.delayInDays()).contains(14L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ParticipantTriggerReferralParams.builder()
                .id("id")
                .participantIdOrEmail("participantIdOrEmail")
                .build()

        params._body()
    }
}
