// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking.campaign

import com.growsurf.api.client.okhttp.GrowsurfOkHttpClient
import com.growsurf.api.core.JsonValue
import com.growsurf.api.models.campaign.design.DesignUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DesignServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val designService = client.campaign().design()

        val design = designService.retrieve("id")

        design.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val designService = client.campaign().design()

        val design =
            designService.update(
                "id",
                DesignUpdateParams.builder()
                    .putAdditionalBodyProperty(
                        "login",
                        JsonValue.from(
                            mapOf(
                                "heading" to "Sign in",
                                "buttonText" to "Send sign-in link",
                                "successHeading" to "Check your email",
                            )
                        ),
                    )
                    .putAdditionalBodyProperty(
                        "payoutDestinationConfirmation",
                        JsonValue.from(
                            mapOf("headline" to "Confirm your {{payoutProvider}} payout email")
                        ),
                    )
                    .build(),
            )

        design.validate()
    }
}
