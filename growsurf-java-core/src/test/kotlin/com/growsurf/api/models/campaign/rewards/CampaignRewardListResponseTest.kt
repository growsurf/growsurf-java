// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.rewards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignRewardListResponseTest {

    @Test
    fun create() {
        val campaignRewardListResponse =
            CampaignRewardListResponse.builder()
                .addReward(
                    Reward.builder()
                        .id("id")
                        .isUnlimited(true)
                        .metadata(
                            Reward.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .type(Reward.Type.SINGLE_SIDED)
                        .build()
                )
                .build()

        assertThat(campaignRewardListResponse.rewards())
            .containsExactly(
                Reward.builder()
                    .id("id")
                    .isUnlimited(true)
                    .metadata(
                        Reward.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .type(Reward.Type.SINGLE_SIDED)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val campaignRewardListResponse =
            CampaignRewardListResponse.builder()
                .addReward(
                    Reward.builder()
                        .id("id")
                        .isUnlimited(true)
                        .metadata(
                            Reward.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .type(Reward.Type.SINGLE_SIDED)
                        .build()
                )
                .build()

        val roundtrippedCampaignRewardListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(campaignRewardListResponse),
                jacksonTypeRef<CampaignRewardListResponse>(),
            )

        assertThat(roundtrippedCampaignRewardListResponse).isEqualTo(campaignRewardListResponse)
    }
}
