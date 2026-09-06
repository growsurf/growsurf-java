package com.growsurf.api.models.campaign.installation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.JsonField
import com.growsurf.api.core.JsonNull
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignInstallationTest {

    @Test
    fun nullableUpdatesPreserveExplicitClearsAndOmitMissingFields() {
        val mapper = jsonMapper()
        val mobile = CampaignInstallationMobileUpdate(iosAttributionUrl = JsonNull.of())
        val params = InstallationUpdateParams.builder().mobile(mobile).build()

        assertThat(mapper.readTree(mapper.writeValueAsString(params._body())))
            .isEqualTo(mapper.readTree("""{"mobile":{"iosAttributionUrl":null}}"""))
        assertThat(
                mapper.readValue(
                    mapper.writeValueAsString(mobile),
                    CampaignInstallationMobileUpdate::class.java,
                )
            )
            .isEqualTo(mobile)
    }

    @Test
    fun nestedConfigPreservesAdditionalFieldsWithoutWeakeningKnownTypes() {
        val mapper = jsonMapper()
        val json =
            """{"mobile":{"isEnabled":true,"futureSetting":{"value":null},"additionalProperties":true}}"""
        val installation = mapper.readValue(json, CampaignInstallation::class.java)
        val mobile = installation.mobile().get()

        assertThat(mobile.isEnabled()).contains(true)
        assertThat(mapper.readTree(mapper.writeValueAsString(mobile.copy())))
            .isEqualTo(mapper.readTree(json).get("mobile"))
        org.assertj.core.api.Assertions.assertThatThrownBy {
                mapper
                    .readValue(
                        """{"mobile":{"isEnabled":"invalid","futureSetting":true}}""",
                        CampaignInstallation::class.java,
                    )
                    .mobile()
            }
            .isInstanceOf(com.growsurf.api.errors.GrowsurfInvalidDataException::class.java)
        org.assertj.core.api.Assertions.assertThatThrownBy {
                mapper
                    .readValue(
                        """{"mobile":{"iosAttributionUrl":123}}""",
                        CampaignInstallation::class.java,
                    )
                    .mobile()
            }
            .isInstanceOf(com.growsurf.api.errors.GrowsurfInvalidDataException::class.java)
    }

    @Test
    fun typedFieldsRoundtripAndUpdateParamsUseContractNames() {
        val mobile = CampaignInstallationMobile(isEnabled = true, publicKey = "gspk_test")
        val installation =
            CampaignInstallation.builder()
                .referralTrigger(CampaignInstallationReferralTrigger.CUSTOM)
                .signupEvent(CampaignInstallationSignupEvent.PROGRAMMATIC)
                .shareUrl("https://piedpiper.com")
                .mobile(mobile)
                .build()

        val mapper = jsonMapper()
        val roundtripped =
            mapper.readValue(
                mapper.writeValueAsString(installation),
                jacksonTypeRef<CampaignInstallation>(),
            )

        assertThat(roundtripped.signupEvent())
            .contains(CampaignInstallationSignupEvent.PROGRAMMATIC)
        assertThat(roundtripped.mobile().get().publicKey()).contains("gspk_test")

        val params =
            InstallationUpdateParams.builder()
                .signupEvent(CampaignInstallationSignupEvent.PROGRAMMATIC)
                .shareUrl("https://piedpiper.com")
                .mobile(
                    CampaignInstallationMobileUpdate(
                        isEnabled = true,
                        iosAttributionUrl = JsonField.of("https://piedpiper.app.link/referral"),
                    )
                )
                .build()
        assertThat(params._body()).containsKeys("signupEvent", "shareUrl", "mobile")
        assertThat(params._body()["mobile"]?.asObject()?.get()?.keys)
            .containsExactlyInAnyOrder("isEnabled", "iosAttributionUrl")
    }
}
