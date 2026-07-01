// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.rewards

import com.growsurf.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RewardUpdateParamsTest {

    @Test
    fun create() {
        RewardUpdateParams.builder()
            .id("id")
            .rewardId("rewardId")
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
            .limitDuration(RewardUpdateParams.LimitDuration.IN_TOTAL)
            .nextMilestonePrefix("nextMilestonePrefix")
            .nextMilestoneSuffix("nextMilestoneSuffix")
            .couponCode("couponCode")
            .referralCouponCode("referralCouponCode")
            .metadata(
                RewardUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = RewardUpdateParams.builder().id("id").rewardId("rewardId").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("rewardId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RewardUpdateParams.builder()
                .id("id")
                .rewardId("rewardId")
                .title("title")
                .isActive(false)
                .build()

        val body = params._body()

        assertThat(body.title()).contains("title")
        assertThat(body.isActive()).contains(false)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RewardUpdateParams.builder().id("id").rewardId("rewardId").build()

        val body = params._body()
    }
}
