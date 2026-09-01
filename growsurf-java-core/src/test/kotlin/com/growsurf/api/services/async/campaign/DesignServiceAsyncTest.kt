// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.async.campaign

import com.growsurf.api.client.okhttp.GrowsurfOkHttpClientAsync
import com.growsurf.api.core.JsonValue
import com.growsurf.api.models.campaign.design.DesignUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DesignServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val designServiceAsync = client.campaign().design()

        val designFuture = designServiceAsync.retrieve("id")

        val design = designFuture.get()
        design.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val designServiceAsync = client.campaign().design()

        val designFuture =
            designServiceAsync.update(
                "id",
                DesignUpdateParams.builder()
                    .putAdditionalBodyProperty(
                        "participantAvatarStyle",
                        JsonValue.from("CHARACTERS"),
                    )
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

        val design = designFuture.get()
        design.validate()
    }
}
