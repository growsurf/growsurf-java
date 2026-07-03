// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.rewards

import com.growsurf.api.core.JsonValue
import com.growsurf.api.models.campaign.RewardTaxValuation
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RewardCreateParamsTest {

    @Test
    fun create() {
        RewardCreateParams.builder()
            .id("id")
            .type(RewardCreateParams.Type.SINGLE_SIDED)
            .title("title")
            .description("description")
            .referralDescription("referralDescription")
            .imageUrl("imageUrl")
            .isActive(true)
            .isVisible(true)
            .isUnlimited(true)
            .referredRewardUpfront(true)
            .limit(0L)
            .conversionsRequired(1L)
            .numberOfWinners(0L)
            .order(0L)
            .limitDuration(RewardCreateParams.LimitDuration.IN_TOTAL)
            .nextMilestonePrefix("nextMilestonePrefix")
            .nextMilestoneSuffix("nextMilestoneSuffix")
            .couponCode("couponCode")
            .referralCouponCode("referralCouponCode")
            .metadata(
                RewardCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .value(
                RewardTaxValuation.builder().fairMarketValueUsd(0.0).isTaxReportable(true).build()
            )
            .referredValue(
                RewardTaxValuation.builder().fairMarketValueUsd(0.0).isTaxReportable(true).build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RewardCreateParams.builder().id("id").type(RewardCreateParams.Type.SINGLE_SIDED).build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RewardCreateParams.builder()
                .id("id")
                .type(RewardCreateParams.Type.MILESTONE)
                .title("title")
                .conversionsRequired(3L)
                .build()

        val body = params._body()

        assertThat(body.type()).isEqualTo(RewardCreateParams.Type.MILESTONE)
        assertThat(body.title()).contains("title")
        assertThat(body.conversionsRequired()).contains(3L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RewardCreateParams.builder().id("id").type(RewardCreateParams.Type.SINGLE_SIDED).build()

        val body = params._body()

        assertThat(body.type()).isEqualTo(RewardCreateParams.Type.SINGLE_SIDED)
    }
}
