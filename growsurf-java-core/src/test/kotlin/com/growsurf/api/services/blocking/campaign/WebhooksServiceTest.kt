// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking.campaign

import com.growsurf.api.client.okhttp.GrowsurfOkHttpClient
import com.growsurf.api.models.campaign.webhooks.WebhookCreateParams
import com.growsurf.api.models.campaign.webhooks.WebhookDeleteParams
import com.growsurf.api.models.campaign.webhooks.WebhookTestParams
import com.growsurf.api.models.campaign.webhooks.WebhookUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WebhooksServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val webhooksService = client.campaign().webhooks()

        val webhook =
            webhooksService.create(
                WebhookCreateParams.builder()
                    .id("id")
                    .payloadUrl("https://piedpiper.com/growsurf/webhook")
                    .build()
            )

        webhook.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val webhooksService = client.campaign().webhooks()

        val webhook =
            webhooksService.update(
                WebhookUpdateParams.builder().id("id").webhookId("webhookId").build()
            )

        webhook.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val webhooksService = client.campaign().webhooks()

        val response = webhooksService.list("id")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val webhooksService = client.campaign().webhooks()

        val response =
            webhooksService.delete(
                WebhookDeleteParams.builder().id("id").webhookId("webhookId").build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun test() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val webhooksService = client.campaign().webhooks()

        val response =
            webhooksService.test(WebhookTestParams.builder().id("id").webhookId("webhookId").build())

        response.validate()
    }
}
