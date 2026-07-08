// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.webhooks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookCreateParamsTest {

    @Test
    fun create() {
        WebhookCreateParams.builder()
            .id("id")
            .payloadUrl("https://piedpiper.com/growsurf/webhook")
            .addEvent(WebhookEvent.NEW_PARTICIPANT_ADDED)
            .addEvent(WebhookEvent.PARTICIPANT_REACHED_A_GOAL)
            .secret("whsec_middleout")
            .isEnabled(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            WebhookCreateParams.builder()
                .id("id")
                .payloadUrl("https://piedpiper.com/growsurf/webhook")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            WebhookCreateParams.builder()
                .id("id")
                .payloadUrl("https://piedpiper.com/growsurf/webhook")
                .addEvent(WebhookEvent.NEW_PARTICIPANT_ADDED)
                .secret("whsec_middleout")
                .isEnabled(true)
                .build()

        val body = params._body()

        assertThat(body.payloadUrl()).isEqualTo("https://piedpiper.com/growsurf/webhook")
        assertThat(body.events().get()).containsExactly(WebhookEvent.NEW_PARTICIPANT_ADDED)
        assertThat(body.secret()).contains("whsec_middleout")
        assertThat(body.isEnabled()).contains(true)
    }
}
