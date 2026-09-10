// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.async.campaign

import com.growsurf.api.client.okhttp.GrowsurfOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class IntegrationsServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val integrationsServiceAsync = client.campaign().integrations()

        val responseFuture = integrationsServiceAsync.list("id")

        val response = responseFuture.get()
        response.validate()
    }
}
