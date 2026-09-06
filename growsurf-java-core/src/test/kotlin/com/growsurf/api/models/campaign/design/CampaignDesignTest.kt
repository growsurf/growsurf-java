// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.design

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.JsonField
import com.growsurf.api.core.JsonNull
import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignDesignTest {

    @Test
    fun nestedDesignPreservesClearsAndAdditionalFields() {
        val mapper = jsonMapper()
        val params =
            DesignUpdateParams.builder()
                .resources(
                    CampaignDesignResources(
                        icon = CampaignDesignResourcesIcon(imageUrl = JsonNull.of())
                    )
                )
                .build()
        assertThat(mapper.readTree(mapper.writeValueAsString(params._body())))
            .isEqualTo(mapper.readTree("""{"resources":{"icon":{"imageUrl":null}}}"""))

        val json =
            """{"resources":{"title":"Resources","icon":{"type":"IMAGE","imageUrl":null,"futureIcon":true},"futureResources":{"value":null}}}"""
        val design = mapper.readValue(json, CampaignDesign::class.java)
        assertThat(design.resources().get().title()).contains("Resources")
        assertThat(mapper.readTree(mapper.writeValueAsString(design.resources().get().copy())))
            .isEqualTo(mapper.readTree(json).get("resources"))
    }

    private val resources =
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
                    imageUrl = JsonField.of("https://example.com/resources-icon.png"),
                ),
        )

    @Test
    fun documentedDesignFieldsAreTypedWhileOpenSectionsStayForwardCompatible() {
        val design =
            CampaignDesign.builder()
                .participantAvatarStyle(CampaignDesignParticipantAvatarStyle.CHARACTERS)
                .login(ParticipantLoginDesign(heading = "Sign in", buttonText = "Send link"))
                .referredExperience(
                    CampaignDesignReferredExperience(
                        offerPopupPlacement = CampaignDesignOfferPopupPlacement.BOTTOM,
                        offerPopupDelaySeconds = CampaignDesignOfferPopupDelaySeconds.SECONDS_5,
                        bannerPlacement = CampaignDesignBannerPlacement.TOP,
                    )
                )
                .resources(resources)
                .putAdditionalProperty(
                    "futureDesignSection",
                    JsonValue.from(mapOf("enabled" to true)),
                )
                .build()

        assertThat(design.resources().get().title()).contains("Resources")
        assertThat(design.participantAvatarStyle())
            .contains(CampaignDesignParticipantAvatarStyle.CHARACTERS)
        assertThat(design.login().get().heading()).contains("Sign in")
        assertThat(design.referredExperience().get().offerPopupPlacement())
            .contains(CampaignDesignOfferPopupPlacement.BOTTOM)
        assertThat(design.referredExperience().get().offerPopupDelaySeconds())
            .contains(CampaignDesignOfferPopupDelaySeconds.SECONDS_5)
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
        val params =
            DesignUpdateParams.builder()
                .participantAvatarStyle(CampaignDesignParticipantAvatarStyle.CHARACTERS)
                .login(ParticipantLoginDesign(heading = "Sign in"))
                .resources(resources)
                .build()

        assertThat(params._body()).containsKeys("participantAvatarStyle", "login", "resources")
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
