// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.client.okhttp.GrowsurfOkHttpClient
import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.jsonMapper
import com.growsurf.api.models.campaign.Campaign
import com.growsurf.api.models.campaign.CommissionStructure
import com.growsurf.api.models.campaign.participant.FraudRiskLevel
import com.growsurf.api.models.campaign.participant.ParticipantRecordTransactionResponse
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
                        .referralDescription("referralDescription")
                        .referredRewardUpfront(true)
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
