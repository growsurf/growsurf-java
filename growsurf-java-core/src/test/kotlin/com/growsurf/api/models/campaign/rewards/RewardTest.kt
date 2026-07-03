// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.rewards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.jsonMapper
import com.growsurf.api.models.campaign.RewardTaxValuation
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RewardTest {

    @Test
    fun create() {
        val reward =
            Reward.builder()
                .id("id")
                .isUnlimited(true)
                .metadata(
                    Reward.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type(Reward.Type.SINGLE_SIDED)
                .conversionsRequired(0L)
                .couponCode("couponCode")
                .description("description")
                .imageUrl("imageUrl")
                .limit(0L)
                .limitDuration(Reward.LimitDuration.IN_TOTAL)
                .nextMilestonePrefix("nextMilestonePrefix")
                .nextMilestoneSuffix("nextMilestoneSuffix")
                .numberOfWinners(0L)
                .order(0L)
                .referralCouponCode("referralCouponCode")
                .referralDescription("referralDescription")
                .referredRewardUpfront(true)
                .referredValue(
                    RewardTaxValuation.builder()
                        .fairMarketValueUsd(0.0)
                        .isTaxReportable(true)
                        .build()
                )
                .value(
                    RewardTaxValuation.builder()
                        .fairMarketValueUsd(0.0)
                        .isTaxReportable(true)
                        .build()
                )
                .build()

        assertThat(reward.id()).isEqualTo("id")
        assertThat(reward.isUnlimited()).isEqualTo(true)
        assertThat(reward.metadata())
            .isEqualTo(
                Reward.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(reward.type()).isEqualTo(Reward.Type.SINGLE_SIDED)
        assertThat(reward.conversionsRequired()).contains(0L)
        assertThat(reward.couponCode()).contains("couponCode")
        assertThat(reward.description()).contains("description")
        assertThat(reward.imageUrl()).contains("imageUrl")
        assertThat(reward.limit()).contains(0L)
        assertThat(reward.limitDuration()).contains(Reward.LimitDuration.IN_TOTAL)
        assertThat(reward.nextMilestonePrefix()).contains("nextMilestonePrefix")
        assertThat(reward.nextMilestoneSuffix()).contains("nextMilestoneSuffix")
        assertThat(reward.numberOfWinners()).contains(0L)
        assertThat(reward.order()).contains(0L)
        assertThat(reward.referralCouponCode()).contains("referralCouponCode")
        assertThat(reward.referralDescription()).contains("referralDescription")
        assertThat(reward.referredRewardUpfront()).contains(true)
        assertThat(reward.referredValue())
            .contains(
                RewardTaxValuation.builder().fairMarketValueUsd(0.0).isTaxReportable(true).build()
            )
        assertThat(reward.value())
            .contains(
                RewardTaxValuation.builder().fairMarketValueUsd(0.0).isTaxReportable(true).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reward =
            Reward.builder()
                .id("id")
                .isUnlimited(true)
                .metadata(
                    Reward.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type(Reward.Type.SINGLE_SIDED)
                .conversionsRequired(0L)
                .couponCode("couponCode")
                .description("description")
                .imageUrl("imageUrl")
                .limit(0L)
                .limitDuration(Reward.LimitDuration.IN_TOTAL)
                .nextMilestonePrefix("nextMilestonePrefix")
                .nextMilestoneSuffix("nextMilestoneSuffix")
                .numberOfWinners(0L)
                .order(0L)
                .referralCouponCode("referralCouponCode")
                .referralDescription("referralDescription")
                .referredRewardUpfront(true)
                .referredValue(
                    RewardTaxValuation.builder()
                        .fairMarketValueUsd(0.0)
                        .isTaxReportable(true)
                        .build()
                )
                .value(
                    RewardTaxValuation.builder()
                        .fairMarketValueUsd(0.0)
                        .isTaxReportable(true)
                        .build()
                )
                .build()

        val roundtrippedReward =
            jsonMapper.readValue(jsonMapper.writeValueAsString(reward), jacksonTypeRef<Reward>())

        assertThat(roundtrippedReward).isEqualTo(reward)
    }
}
