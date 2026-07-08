// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantBulkDeleteParamsTest {

    @Test
    fun create() {
        ParticipantBulkDeleteParams.builder()
            .id("id")
            .addParticipant("gavin@hooli.com")
            .addParticipant("f8g9nl")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ParticipantBulkDeleteParams.builder()
                .id("id")
                .addParticipant("gavin@hooli.com")
                .addParticipant("f8g9nl")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ParticipantBulkDeleteParams.builder()
                .id("id")
                .addParticipant("gavin@hooli.com")
                .addParticipant("f8g9nl")
                .build()

        val body = params._body()

        assertThat(body.participants()).containsExactly("gavin@hooli.com", "f8g9nl")
    }
}
