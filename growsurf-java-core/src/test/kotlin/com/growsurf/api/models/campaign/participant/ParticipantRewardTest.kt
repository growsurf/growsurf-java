// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import com.growsurf.api.models.campaign.CommissionStructure
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantRewardTest {

    @Test
    fun create() {
        val participantReward =
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

        assertThat(participantReward.id()).isEqualTo("id")
        assertThat(participantReward.rewardId()).isEqualTo("rewardId")
        assertThat(participantReward.status()).isEqualTo(ParticipantReward.Status.PENDING)
        assertThat(participantReward.approved()).contains(true)
        assertThat(participantReward.approvedAt()).contains(0L)
        assertThat(participantReward.commissionStructure())
            .contains(
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
        assertThat(participantReward.fulfilledAt()).contains(0L)
        assertThat(participantReward.isAvailable()).contains(true)
        assertThat(participantReward.isFulfilled()).contains(true)
        assertThat(participantReward.isReferrer()).contains(true)
        assertThat(participantReward.referredId()).contains("referredId")
        assertThat(participantReward.referrerId()).contains("referrerId")
        assertThat(participantReward.unread()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val participantReward =
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

        val roundtrippedParticipantReward =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(participantReward),
                jacksonTypeRef<ParticipantReward>(),
            )

        assertThat(roundtrippedParticipantReward).isEqualTo(participantReward)
    }
}
