// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking.campaign

import com.growsurf.api.client.okhttp.GrowsurfOkHttpClient
import com.growsurf.api.core.JsonField
import com.growsurf.api.core.JsonValue
import com.growsurf.api.models.campaign.design.CampaignDesignResources
import com.growsurf.api.models.campaign.design.CampaignDesignResourcesIcon
import com.growsurf.api.models.campaign.design.CampaignDesignResourcesIconType
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
                        "participantAvatarStyle",
                        JsonValue.from("CHARACTERS"),
                    )
                    .resources(
                        CampaignDesignResources(
                            isPublicDisplayed = true,
                            title = JsonField.of("Resources"),
                            viewResourcesLinkText = JsonField.of("View resources"),
                            backLinkText = JsonField.of("Back"),
                            copyButtonText = JsonField.of("Copy"),
                            copiedText = JsonField.of("Copied"),
                            icon =
                                CampaignDesignResourcesIcon(
                                    type = CampaignDesignResourcesIconType.IMAGE,
                                    imageUrl =
                                        JsonField.of("https://example.com/resources-icon.png"),
                                ),
                        )
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

        design.validate()
    }
}
