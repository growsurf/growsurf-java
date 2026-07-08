// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookTest {

    @Test
    fun create() {
        val webhook =
            Webhook.builder()
                .id("primary")
                .payloadUrl("https://piedpiper.com/growsurf/webhook")
                .addEvent(WebhookEvent.NEW_PARTICIPANT_ADDED)
                .addEvent(WebhookEvent.PARTICIPANT_REACHED_A_GOAL)
                .isEnabled(true)
                .autoDisabledDueToFailures(false)
                .failureCount(0L)
                .lastFailureAt(null)
                .build()

        assertThat(webhook.id()).isEqualTo("primary")
        assertThat(webhook.payloadUrl()).contains("https://piedpiper.com/growsurf/webhook")
        assertThat(webhook.events())
            .containsExactly(
                WebhookEvent.NEW_PARTICIPANT_ADDED,
                WebhookEvent.PARTICIPANT_REACHED_A_GOAL,
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhook =
            Webhook.builder()
                .id("primary")
                .payloadUrl("https://piedpiper.com/growsurf/webhook")
                .addEvent(WebhookEvent.NEW_PARTICIPANT_ADDED)
                .addEvent(WebhookEvent.PARTICIPANT_REACHED_A_GOAL)
                .isEnabled(true)
                .autoDisabledDueToFailures(false)
                .failureCount(0L)
                .lastFailureAt(null)
                .build()

        val roundtrippedWebhook =
            jsonMapper.readValue(jsonMapper.writeValueAsString(webhook), jacksonTypeRef<Webhook>())

        assertThat(roundtrippedWebhook).isEqualTo(webhook)
    }
}
