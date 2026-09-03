// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.growsurf.api.core.jsonMapper
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
            .goal(CampaignCreateParams.Goal.CUSTOMERS)
            .addReward(
                CampaignCreateParams.Reward.builder()
                    .type(CampaignCreateParams.Reward.Type.SINGLE_SIDED)
                    .title("title")
                    .event(RewardEvent.LEAD)
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
                .goal(CampaignCreateParams.Goal.B2B_SAAS_SELF_SERVICE)
                .addReward(
                    CampaignCreateParams.Reward.builder()
                        .type(CampaignCreateParams.Reward.Type.SINGLE_SIDED)
                        .title("title")
                        .event(RewardEvent.CONVERSION)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.type()).isEqualTo(CampaignCreateParams.Type.REFERRAL)
        assertThat(body.name()).contains("name")
        assertThat(body.companyName()).contains("companyName")
        assertThat(body.goal()).contains(CampaignCreateParams.Goal.B2B_SAAS_SELF_SERVICE)
        assertThat(body.rewards().getOrNull())
            .containsExactly(
                CampaignCreateParams.Reward.builder()
                    .type(CampaignCreateParams.Reward.Type.SINGLE_SIDED)
                    .title("title")
                    .event(RewardEvent.CONVERSION)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CampaignCreateParams.builder().type(CampaignCreateParams.Type.REFERRAL).build()

        val body = params._body()

        assertThat(body.type()).isEqualTo(CampaignCreateParams.Type.REFERRAL)
    }

    @Test
    fun rewardEventSerializesInCampaignCreateBody() {
        val reward =
            CampaignCreateParams.Reward.builder()
                .type(CampaignCreateParams.Reward.Type.MILESTONE)
                .event(RewardEvent.LEAD)
                .build()
        val params =
            CampaignCreateParams.builder()
                .type(CampaignCreateParams.Type.REFERRAL)
                .addReward(reward)
                .build()

        val json = jsonMapper().writeValueAsString(params._body())

        assertThat(reward.event()).contains(RewardEvent.LEAD)
        assertThat(reward._event().asKnown()).contains(RewardEvent.LEAD)
        assertThat(reward.toBuilder().build()).isEqualTo(reward)
        assertThat(json).contains("\"rewards\":[").contains("\"event\":\"LEAD\"")
    }
}
