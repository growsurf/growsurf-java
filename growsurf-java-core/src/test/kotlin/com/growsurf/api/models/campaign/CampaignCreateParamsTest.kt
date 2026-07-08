// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignCreateParamsTest {

    @Test
    fun create() {
        CampaignCreateParams.builder()
            .type(CampaignCreateParams.Type.REFERRAL)
            .name("name")
            .companyName("companyName")
            .companyLogoImageUrl("companyLogoImageUrl")
            .currencyIso("currencyISO")
            .addReward(
                CampaignCreateParams.Reward.builder()
                    .type(CampaignCreateParams.Reward.Type.SINGLE_SIDED)
                    .title("title")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            CampaignCreateParams.builder()
                .type(CampaignCreateParams.Type.REFERRAL)
                .name("name")
                .companyName("companyName")
                .addReward(
                    CampaignCreateParams.Reward.builder()
                        .type(CampaignCreateParams.Reward.Type.SINGLE_SIDED)
                        .title("title")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.type()).isEqualTo(CampaignCreateParams.Type.REFERRAL)
        assertThat(body.name()).contains("name")
        assertThat(body.companyName()).contains("companyName")
        assertThat(body.rewards().getOrNull())
            .containsExactly(
                CampaignCreateParams.Reward.builder()
                    .type(CampaignCreateParams.Reward.Type.SINGLE_SIDED)
                    .title("title")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CampaignCreateParams.builder().type(CampaignCreateParams.Type.REFERRAL).build()

        val body = params._body()

        assertThat(body.type()).isEqualTo(CampaignCreateParams.Type.REFERRAL)
    }
}
