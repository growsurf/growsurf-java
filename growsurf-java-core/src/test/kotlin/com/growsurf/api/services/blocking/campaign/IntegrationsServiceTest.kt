// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking.campaign

import com.growsurf.api.client.okhttp.GrowsurfOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class IntegrationsServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val integrationsService = client.campaign().integrations()

        val response = integrationsService.list("id")

        response.validate()
    }
}
