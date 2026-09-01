// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.design

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignDesignTest {

    private val resources =
        CampaignDesignResources(
            isPublicDisplayed = true,
            title = "Resources",
            viewResourcesLinkText = "View resources",
            backLinkText = "Back",
            copyButtonText = "Copy",
            copiedText = "Copied",
            icon =
                CampaignDesignResourcesIcon(
                    type = CampaignDesignResourcesIconType.IMAGE,
                    imageUrl = "https://example.com/resources-icon.png",
                ),
        )

    @Test
    fun resourcesAreTypedWhileOtherDesignFieldsStayOpen() {
        val design =
            CampaignDesign.builder()
                .resources(resources)
                .putAdditionalProperty(
                    "futureDesignSection",
                    JsonValue.from(mapOf("enabled" to true)),
                )
                .build()

        assertThat(design.resources().get().title()).contains("Resources")
        assertThat(design.resources().get().icon().get().type())
            .contains(CampaignDesignResourcesIconType.IMAGE)
        assertThat(design._additionalProperties()).containsKey("futureDesignSection")
    }

    @Test
    fun roundtripPreservesTheCompleteResourcesModel() {
        val mapper = jsonMapper()
        val design = CampaignDesign.builder().resources(resources).build()

        val roundtripped =
            mapper.readValue(mapper.writeValueAsString(design), jacksonTypeRef<CampaignDesign>())

        assertThat(roundtripped.resources()).contains(resources)
        assertThat(roundtripped).isEqualTo(design)
    }

    @Test
    fun updateParamsSerializeResourcesAtThePublicFieldName() {
        val params = DesignUpdateParams.builder().resources(resources).build()

        assertThat(params._body()["resources"]?.asObject()).isPresent
        assertThat(params._body()["resources"]?.asObject()?.get()?.keys)
            .containsExactlyInAnyOrder(
                "isPublicDisplayed",
                "title",
                "viewResourcesLinkText",
                "backLinkText",
                "copyButtonText",
                "copiedText",
                "icon",
            )
    }
}
