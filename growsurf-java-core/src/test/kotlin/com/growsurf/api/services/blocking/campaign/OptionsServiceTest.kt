// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking.campaign

import com.growsurf.api.client.okhttp.GrowsurfOkHttpClient
import com.growsurf.api.core.JsonValue
import com.growsurf.api.models.campaign.options.OptionUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OptionsServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val optionsService = client.campaign().options()

        val options = optionsService.retrieve("id")

        options.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val optionsService = client.campaign().options()

        val options =
            optionsService.update(
                "id",
                OptionUpdateParams.builder()
                    .putAdditionalBodyProperty("foo", JsonValue.from("bar"))
                    .build(),
            )

        options.validate()
    }
}
