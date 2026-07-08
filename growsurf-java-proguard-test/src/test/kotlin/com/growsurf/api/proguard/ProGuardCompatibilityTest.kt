// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.client.okhttp.GrowsurfOkHttpClient
import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.jsonMapper
import com.growsurf.api.models.campaign.Campaign
import com.growsurf.api.models.campaign.CommissionStructure
import com.growsurf.api.models.campaign.RewardTaxValuation
import com.growsurf.api.models.campaign.participant.FraudRiskLevel
import com.growsurf.api.models.campaign.participant.ParticipantBulkDeleteResponse
import com.growsurf.api.models.campaign.participant.ParticipantRecordTransactionResponse
import com.growsurf.api.models.campaign.participant.ParticipantRefundTransactionResponse
import com.growsurf.api.models.campaign.rewards.CampaignRewardListResponse
import com.growsurf.api.models.campaign.rewards.DeleteRewardResponse
import com.growsurf.api.models.campaign.rewards.Reward
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/growsurf-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.campaign()).isNotNull()
    }

    @Test
    fun rewardRoundtrip() {
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
                .commissionStructure(
                    CommissionStructure.builder()
                        .amount(0L)
                        .amountIso("amountISO")
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

    @Test
    fun campaignRewardListResponseRoundtrip() {
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
                        .commissionStructure(
                            CommissionStructure.builder()
                                .amount(0L)
                                .amountIso("amountISO")
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
                )
                .build()

        val roundtrippedCampaignRewardListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(campaignRewardListResponse),
                jacksonTypeRef<CampaignRewardListResponse>(),
            )

        assertThat(roundtrippedCampaignRewardListResponse).isEqualTo(campaignRewardListResponse)
    }

    @Test
    fun deleteRewardResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val deleteRewardResponse = DeleteRewardResponse.builder().id("id").success(true).build()

        val roundtrippedDeleteRewardResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(deleteRewardResponse),
                jacksonTypeRef<DeleteRewardResponse>(),
            )

        assertThat(roundtrippedDeleteRewardResponse).isEqualTo(deleteRewardResponse)
    }

    @Test
    fun campaignRoundtrip() {
        val jsonMapper = jsonMapper()
        val campaign =
            Campaign.builder()
                .id("id")
                .impressionCount(0L)
                .inviteCount(0L)
                .name("name")
                .participantCount(0L)
                .referralCount(0L)
                .addReward(
                    Campaign.Reward.builder()
                        .id("id")
                        .isUnlimited(true)
                        .metadata(
                            Campaign.Reward.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .type(Campaign.Reward.Type.SINGLE_SIDED)
                        .commissionStructure(
                            CommissionStructure.builder()
                                .amount(0L)
                                .amountIso("amountISO")
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
                        .conversionsRequired(0L)
                        .couponCode("couponCode")
                        .description("description")
                        .imageUrl("imageUrl")
                        .limit(0L)
                        .limitDuration(Campaign.Reward.LimitDuration.IN_TOTAL)
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
                )
                .status(Campaign.Status.DRAFT)
                .type(Campaign.Type.REFERRAL)
                .winnerCount(0L)
                .currencyIso("xxx")
                .build()

        val roundtrippedCampaign =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(campaign),
                jacksonTypeRef<Campaign>(),
            )

        assertThat(roundtrippedCampaign).isEqualTo(campaign)
    }

    @Test
    fun participantRecordTransactionResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val participantRecordTransactionResponse =
            ParticipantRecordTransactionResponse.ofUnionMember0(
                ParticipantRecordTransactionResponse.UnionMember0.builder()
                    .firstSale(true)
                    .message("message")
                    .build()
            )

        val roundtrippedParticipantRecordTransactionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(participantRecordTransactionResponse),
                jacksonTypeRef<ParticipantRecordTransactionResponse>(),
            )

        assertThat(roundtrippedParticipantRecordTransactionResponse)
            .isEqualTo(participantRecordTransactionResponse)
    }

    @Test
    fun participantRefundTransactionResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val participantRefundTransactionResponse =
            ParticipantRefundTransactionResponse.builder()
                .adjusted(0L)
                .amendmentType(ParticipantRefundTransactionResponse.AmendmentType.REFUND)
                .deleted(0L)
                .matched(0L)
                .addMatchingCommissionId("string")
                .message("message")
                .reversed(0L)
                .success(true)
                .notFound(true)
                .build()

        val roundtrippedParticipantRefundTransactionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(participantRefundTransactionResponse),
                jacksonTypeRef<ParticipantRefundTransactionResponse>(),
            )

        assertThat(roundtrippedParticipantRefundTransactionResponse)
            .isEqualTo(participantRefundTransactionResponse)
    }

    @Test
    fun participantBulkDeleteResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val participantBulkDeleteResponse =
            ParticipantBulkDeleteResponse.builder()
                .summary(
                    ParticipantBulkDeleteResponse.Summary.builder()
                        .total(3L)
                        .deletedCount(2L)
                        .notFoundCount(1L)
                        .duplicateCount(0L)
                        .errorCount(0L)
                        .build()
                )
                .addResult(
                    ParticipantBulkDeleteResponse.Result.builder()
                        .index(0L)
                        .identifier("gavin@hooli.com")
                        .status(ParticipantBulkDeleteResponse.Result.Status.DELETED)
                        .participantId("f8g9nl")
                        .email("gavin@hooli.com")
                        .message("message")
                        .build()
                )
                .build()

        val roundtrippedParticipantBulkDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(participantBulkDeleteResponse),
                jacksonTypeRef<ParticipantBulkDeleteResponse>(),
            )

        assertThat(roundtrippedParticipantBulkDeleteResponse)
            .isEqualTo(participantBulkDeleteResponse)
    }

    @Test
    fun fraudRiskLevelRoundtrip() {
        val jsonMapper = jsonMapper()
        val fraudRiskLevel = FraudRiskLevel.LOW

        val roundtrippedFraudRiskLevel =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fraudRiskLevel),
                jacksonTypeRef<FraudRiskLevel>(),
            )

        assertThat(roundtrippedFraudRiskLevel).isEqualTo(fraudRiskLevel)
    }
}
