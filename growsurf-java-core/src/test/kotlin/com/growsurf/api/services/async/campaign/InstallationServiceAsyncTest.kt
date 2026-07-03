// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.async.campaign

import com.growsurf.api.client.okhttp.GrowsurfOkHttpClientAsync
import com.growsurf.api.core.JsonValue
import com.growsurf.api.models.campaign.installation.InstallationUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InstallationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val installationServiceAsync = client.campaign().installation()

        val installationFuture = installationServiceAsync.retrieve("id")

        val installation = installationFuture.get()
        installation.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val installationServiceAsync = client.campaign().installation()

        val installationFuture =
            installationServiceAsync.update(
                "id",
                InstallationUpdateParams.builder()
                    .putAdditionalBodyProperty("foo", JsonValue.from("bar"))
                    .build(),
            )

        val installation = installationFuture.get()
        installation.validate()
    }
}
