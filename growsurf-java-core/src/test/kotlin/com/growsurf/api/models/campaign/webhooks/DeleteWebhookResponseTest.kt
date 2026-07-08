// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeleteWebhookResponseTest {

    @Test
    fun create() {
        val deleteWebhookResponse =
            DeleteWebhookResponse.builder().id("primary").success(true).build()

        assertThat(deleteWebhookResponse.id()).isEqualTo("primary")
        assertThat(deleteWebhookResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val deleteWebhookResponse =
            DeleteWebhookResponse.builder().id("primary").success(true).build()

        val roundtrippedDeleteWebhookResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(deleteWebhookResponse),
                jacksonTypeRef<DeleteWebhookResponse>(),
            )

        assertThat(roundtrippedDeleteWebhookResponse).isEqualTo(deleteWebhookResponse)
    }
}
