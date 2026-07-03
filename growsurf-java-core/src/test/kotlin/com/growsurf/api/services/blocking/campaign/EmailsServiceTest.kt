// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking.campaign

import com.growsurf.api.client.okhttp.GrowsurfOkHttpClient
import com.growsurf.api.core.JsonValue
import com.growsurf.api.models.campaign.emails.EmailUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EmailsServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val emailsService = client.campaign().emails()

        val emails = emailsService.retrieve("id")

        emails.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val emailsService = client.campaign().emails()

        val emails =
            emailsService.update(
                "id",
                EmailUpdateParams.builder()
                    .putAdditionalBodyProperty("foo", JsonValue.from("bar"))
                    .build(),
            )

        emails.validate()
    }
}
