// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import com.growsurf.api.models.campaign.CommissionStructure
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantListRewardsResponseTest {

    @Test
    fun create() {
        val participantListRewardsResponse =
            ParticipantListRewardsResponse.builder()
                .limit(0L)
                .nextId("nextId")
                .addReward(
                    ParticipantReward.builder()
                        .id("id")
                        .rewardId("rewardId")
                        .status(ParticipantReward.Status.PENDING)
                        .approved(true)
                        .approvedAt(0L)
                        .commissionStructure(
                            CommissionStructure.builder()
                                .amount(0L)
                                .approvalRequired(true)
                                .duration("duration")
                                .durationInMonths(0L)
                                .event("event")
                                .hasIntro(true)
                                .hasMaxAmount(true)
                                .holdDuration(0L)
                                .introAmount(0L)
                                .introAmountIso("introAmountISO")
                                .introDuration("introDuration")
                                .introDurationInMonths(0L)
                                .introPercent(0.0)
                                .introType("introType")
                                .maxAmount(0L)
                                .maxAmountIso("maxAmountISO")
                                .minPaidReferrals(0L)
                                .percent(0.0)
                                .type(CommissionStructure.Type.PERCENT)
                                .build()
                        )
                        .fulfilledAt(0L)
                        .isAvailable(true)
                        .isFulfilled(true)
                        .isReferrer(true)
                        .referredId("referredId")
                        .referrerId("referrerId")
                        .unread(true)
                        .build()
                )
                .build()

        assertThat(participantListRewardsResponse.limit()).isEqualTo(0L)
        assertThat(participantListRewardsResponse.nextId()).contains("nextId")
        assertThat(participantListRewardsResponse.rewards())
            .containsExactly(
                ParticipantReward.builder()
                    .id("id")
                    .rewardId("rewardId")
                    .status(ParticipantReward.Status.PENDING)
                    .approved(true)
                    .approvedAt(0L)
                    .commissionStructure(
                        CommissionStructure.builder()
                            .amount(0L)
                            .approvalRequired(true)
                            .duration("duration")
                            .durationInMonths(0L)
                            .event("event")
                            .hasIntro(true)
                            .hasMaxAmount(true)
                            .holdDuration(0L)
                            .introAmount(0L)
                            .introAmountIso("introAmountISO")
                            .introDuration("introDuration")
                            .introDurationInMonths(0L)
                            .introPercent(0.0)
                            .introType("introType")
                            .maxAmount(0L)
                            .maxAmountIso("maxAmountISO")
                            .minPaidReferrals(0L)
                            .percent(0.0)
                            .type(CommissionStructure.Type.PERCENT)
                            .build()
                    )
                    .fulfilledAt(0L)
                    .isAvailable(true)
                    .isFulfilled(true)
                    .isReferrer(true)
                    .referredId("referredId")
                    .referrerId("referrerId")
                    .unread(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val participantListRewardsResponse =
            ParticipantListRewardsResponse.builder()
                .limit(0L)
                .nextId("nextId")
                .addReward(
                    ParticipantReward.builder()
                        .id("id")
                        .rewardId("rewardId")
                        .status(ParticipantReward.Status.PENDING)
                        .approved(true)
                        .approvedAt(0L)
                        .commissionStructure(
                            CommissionStructure.builder()
                                .amount(0L)
                                .approvalRequired(true)
                                .duration("duration")
                                .durationInMonths(0L)
                                .event("event")
                                .hasIntro(true)
                                .hasMaxAmount(true)
                                .holdDuration(0L)
                                .introAmount(0L)
                                .introAmountIso("introAmountISO")
                                .introDuration("introDuration")
                                .introDurationInMonths(0L)
                                .introPercent(0.0)
                                .introType("introType")
                                .maxAmount(0L)
                                .maxAmountIso("maxAmountISO")
                                .minPaidReferrals(0L)
                                .percent(0.0)
                                .type(CommissionStructure.Type.PERCENT)
                                .build()
                        )
                        .fulfilledAt(0L)
                        .isAvailable(true)
                        .isFulfilled(true)
                        .isReferrer(true)
                        .referredId("referredId")
                        .referrerId("referrerId")
                        .unread(true)
                        .build()
                )
                .build()

        val roundtrippedParticipantListRewardsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(participantListRewardsResponse),
                jacksonTypeRef<ParticipantListRewardsResponse>(),
            )

        assertThat(roundtrippedParticipantListRewardsResponse)
            .isEqualTo(participantListRewardsResponse)
    }
}
