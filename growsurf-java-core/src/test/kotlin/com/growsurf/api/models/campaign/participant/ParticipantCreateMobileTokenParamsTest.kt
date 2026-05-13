// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantCreateMobileTokenParamsTest {

    @Test
    fun create() {
        ParticipantCreateMobileTokenParams.builder()
            .id("id")
            .participantIdOrEmail("participantIdOrEmail")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ParticipantCreateMobileTokenParams.builder()
                .id("id")
                .participantIdOrEmail("participantIdOrEmail")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("participantIdOrEmail")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
