package com.growsurf.api.models.campaign.options

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignOptionsTest {

    @Test
    fun typedFieldsRoundtripAndUpdateParamsUseContractNames() {
        val fraud = CampaignOptionsFraud(blockBurnerEmails = true, maxSignupsPerIp2Min = 5)
        val options =
            CampaignOptions.builder()
                .attributionModel(CampaignOptionsAttributionModel.FIRST_CLICK)
                .referralCookieWindowDays(CampaignOptionsReferralCookieWindowDays.DAYS_90)
                .fraud(fraud)
                .build()

        val mapper = jsonMapper()
        val roundtripped =
            mapper.readValue(mapper.writeValueAsString(options), jacksonTypeRef<CampaignOptions>())

        assertThat(roundtripped.attributionModel())
            .contains(CampaignOptionsAttributionModel.FIRST_CLICK)
        assertThat(roundtripped.fraud().get().blockBurnerEmails()).contains(true)

        val params =
            OptionUpdateParams.builder()
                .attributionModel(CampaignOptionsAttributionModel.FIRST_CLICK)
                .fraud(fraud)
                .build()
        assertThat(params._body()).containsKeys("attributionModel", "fraud")
    }

    @Test
    fun validationRejectsWrongTypesForDocumentedFields() {
        val options =
            CampaignOptions.builder()
                .putAdditionalProperty("attributionModel", JsonValue.from(123))
                .build()

        assertThat(options.isValid()).isFalse()
    }
}
