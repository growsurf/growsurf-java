package com.growsurf.api.models.campaign.installation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignInstallationTest {

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
                        iosAttributionUrl = "https://piedpiper.app.link/referral",
                    )
                )
                .build()
        assertThat(params._body()).containsKeys("signupEvent", "shareUrl", "mobile")
        assertThat(params._body()["mobile"]?.asObject()?.get()?.keys)
            .containsExactlyInAnyOrder("isEnabled", "iosAttributionUrl")
    }
}
