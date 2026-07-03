// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.async.campaign

import com.growsurf.api.client.okhttp.GrowsurfOkHttpClientAsync
import com.growsurf.api.core.JsonValue
import com.growsurf.api.models.campaign.options.OptionUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OptionsServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val optionsServiceAsync = client.campaign().options()

        val optionsFuture = optionsServiceAsync.retrieve("id")

        val options = optionsFuture.get()
        options.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val optionsServiceAsync = client.campaign().options()

        val optionsFuture =
            optionsServiceAsync.update(
                "id",
                OptionUpdateParams.builder()
                    .putAdditionalBodyProperty("foo", JsonValue.from("bar"))
                    .build(),
            )

        val options = optionsFuture.get()
        options.validate()
    }
}
