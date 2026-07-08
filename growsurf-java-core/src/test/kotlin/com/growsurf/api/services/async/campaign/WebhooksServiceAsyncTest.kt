// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.async.campaign

import com.growsurf.api.client.okhttp.GrowsurfOkHttpClientAsync
import com.growsurf.api.models.campaign.webhooks.WebhookCreateParams
import com.growsurf.api.models.campaign.webhooks.WebhookDeleteParams
import com.growsurf.api.models.campaign.webhooks.WebhookTestParams
import com.growsurf.api.models.campaign.webhooks.WebhookUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WebhooksServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webhooksServiceAsync = client.campaign().webhooks()

        val webhookFuture =
            webhooksServiceAsync.create(
                WebhookCreateParams.builder()
                    .id("id")
                    .payloadUrl("https://piedpiper.com/growsurf/webhook")
                    .build()
            )

        val webhook = webhookFuture.get()
        webhook.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webhooksServiceAsync = client.campaign().webhooks()

        val webhookFuture =
            webhooksServiceAsync.update(
                WebhookUpdateParams.builder().id("id").webhookId("webhookId").build()
            )

        val webhook = webhookFuture.get()
        webhook.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webhooksServiceAsync = client.campaign().webhooks()

        val responseFuture = webhooksServiceAsync.list("id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webhooksServiceAsync = client.campaign().webhooks()

        val responseFuture =
            webhooksServiceAsync.delete(
                WebhookDeleteParams.builder().id("id").webhookId("webhookId").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun test() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webhooksServiceAsync = client.campaign().webhooks()

        val responseFuture =
            webhooksServiceAsync.test(
                WebhookTestParams.builder().id("id").webhookId("webhookId").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
