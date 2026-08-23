// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignRetrieveAnalyticsResponseTest {

    @Test
    fun emailAnalytics() {
        val email =
            EmailAnalytics(
                sent = 2L,
                delivered = 1L,
                opened = 1L,
                clicked = 0L,
                bounced = 1L,
                spamComplaints = 0L,
                deliveryRate = 0.5,
                openRate = 1.0,
                clickRate = 0.0,
                bounceRate = 0.5,
                byType = emptyList(),
                coverageStartDate = null,
                isPartial = false,
            )
        val response =
            CampaignRetrieveAnalyticsResponse.builder()
                .analytics(CampaignRetrieveAnalyticsResponse.Analytics.builder().build())
                .endDate(2L)
                .startDate(1L)
                .email(email)
                .addSeries(
                    CampaignRetrieveAnalyticsResponse.Series.builder()
                        .email(EmailAnalyticsCounts(1L, 1L, 0L, 0L, 0L, 0L))
                        .build()
                )
                .build()

        assertThat(response.email()).contains(email)
        assertThat(response.series().get().single().email().get().sent).isEqualTo(1L)
    }

    @Test
    fun create() {
        val campaignRetrieveAnalyticsResponse =
            CampaignRetrieveAnalyticsResponse.builder()
                .analytics(
                    CampaignRetrieveAnalyticsResponse.Analytics.builder()
                        .androidNativeShares(0L)
                        .blueskyShares(0L)
                        .copyRefLinkShares(0L)
                        .emailShares(0L)
                        .facebookShares(0L)
                        .impressions(0L)
                        .invites(0L)
                        .iosNativeShares(0L)
                        .linkedInShares(0L)
                        .messengerShares(0L)
                        .participants(0L)
                        .pinterestShares(0L)
                        .qrcodeShares(0L)
                        .redditShares(0L)
                        .referralCreditExpireds(0L)
                        .referralCreditPendings(0L)
                        .referrals(0L)
                        .smsShares(0L)
                        .telegramShares(0L)
                        .threadsShares(0L)
                        .totalCommissionCount(0L)
                        .totalCommissions(0L)
                        .totalRevenue(0L)
                        .tumblrShares(0L)
                        .twitterShares(0L)
                        .uniqueCommissionReferrals(0L)
                        .uniqueImpressions(0L)
                        .wechatShares(0L)
                        .whatsAppShares(0L)
                        .build()
                )
                .endDate(0L)
                .previousPeriod(
                    CampaignRetrieveAnalyticsResponse.PreviousPeriod.builder()
                        .analytics(
                            CampaignRetrieveAnalyticsResponse.Analytics.builder()
                                .participants(0L)
                                .referrals(0L)
                                .build()
                        )
                        .endDate(1706745600000L)
                        .startDate(1704067200000L)
                        .build()
                )
                .rates(
                    CampaignRetrieveAnalyticsResponse.Rates.builder()
                        .participationRate(0.25)
                        .referralConversionRate(0.15)
                        .sharesPerParticipant(0.5)
                        .build()
                )
                .startDate(0L)
                .statusCounts(
                    CampaignRetrieveAnalyticsResponse.StatusCounts.builder()
                        .affiliateStatus(
                            CampaignRetrieveAnalyticsResponse.StatusCounts.AffiliateStatus.builder()
                                .putAdditionalProperty("APPROVED", JsonValue.from(42))
                                .putAdditionalProperty("PENDING_APPROVAL", JsonValue.from(5))
                                .build()
                        )
                        .commissionStatus(
                            CampaignRetrieveAnalyticsResponse.StatusCounts.CommissionStatus
                                .builder()
                                .approved(
                                    CampaignRetrieveAnalyticsResponse.StatusCounts.CommissionStatus
                                        .CommissionStatusMetric
                                        .builder()
                                        .count(3L)
                                        .totalAmount(7500L)
                                        .totalRevenue(30000L)
                                        .build()
                                )
                                .paid(
                                    CampaignRetrieveAnalyticsResponse.StatusCounts.CommissionStatus
                                        .CommissionStatusMetric
                                        .builder()
                                        .count(0L)
                                        .totalAmount(0L)
                                        .totalRevenue(0L)
                                        .build()
                                )
                                .pending(
                                    CampaignRetrieveAnalyticsResponse.StatusCounts.CommissionStatus
                                        .CommissionStatusMetric
                                        .builder()
                                        .count(1L)
                                        .totalAmount(2500L)
                                        .totalRevenue(10000L)
                                        .build()
                                )
                                .reversed(
                                    CampaignRetrieveAnalyticsResponse.StatusCounts.CommissionStatus
                                        .CommissionStatusMetric
                                        .builder()
                                        .count(0L)
                                        .totalAmount(0L)
                                        .totalRevenue(0L)
                                        .build()
                                )
                                .build()
                        )
                        .currencyIso("USD")
                        .payoutStatus(
                            CampaignRetrieveAnalyticsResponse.StatusCounts.PayoutStatus.builder()
                                .failed(
                                    CampaignRetrieveAnalyticsResponse.StatusCounts.PayoutStatus
                                        .PayoutStatusMetric
                                        .builder()
                                        .count(0L)
                                        .totalAmount(0L)
                                        .build()
                                )
                                .issued(
                                    CampaignRetrieveAnalyticsResponse.StatusCounts.PayoutStatus
                                        .PayoutStatusMetric
                                        .builder()
                                        .count(5L)
                                        .totalAmount(5000L)
                                        .build()
                                )
                                .queued(
                                    CampaignRetrieveAnalyticsResponse.StatusCounts.PayoutStatus
                                        .PayoutStatusMetric
                                        .builder()
                                        .count(0L)
                                        .totalAmount(0L)
                                        .build()
                                )
                                .reversed(
                                    CampaignRetrieveAnalyticsResponse.StatusCounts.PayoutStatus
                                        .PayoutStatusMetric
                                        .builder()
                                        .count(0L)
                                        .totalAmount(0L)
                                        .build()
                                )
                                .upcoming(
                                    CampaignRetrieveAnalyticsResponse.StatusCounts.PayoutStatus
                                        .PayoutStatusMetric
                                        .builder()
                                        .count(0L)
                                        .totalAmount(0L)
                                        .build()
                                )
                                .build()
                        )
                        .rewardStatus(
                            CampaignRetrieveAnalyticsResponse.StatusCounts.RewardStatus.builder()
                                .unapproved(12L)
                                .unfulfilled(300L)
                                .completed(40L)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(campaignRetrieveAnalyticsResponse.analytics())
            .isEqualTo(
                CampaignRetrieveAnalyticsResponse.Analytics.builder()
                    .androidNativeShares(0L)
                    .blueskyShares(0L)
                    .copyRefLinkShares(0L)
                    .emailShares(0L)
                    .facebookShares(0L)
                    .impressions(0L)
                    .invites(0L)
                    .iosNativeShares(0L)
                    .linkedInShares(0L)
                    .messengerShares(0L)
                    .participants(0L)
                    .pinterestShares(0L)
                    .qrcodeShares(0L)
                    .redditShares(0L)
                    .referralCreditExpireds(0L)
                    .referralCreditPendings(0L)
                    .referrals(0L)
                    .smsShares(0L)
                    .telegramShares(0L)
                    .threadsShares(0L)
                    .totalCommissionCount(0L)
                    .totalCommissions(0L)
                    .totalRevenue(0L)
                    .tumblrShares(0L)
                    .twitterShares(0L)
                    .uniqueCommissionReferrals(0L)
                    .uniqueImpressions(0L)
                    .wechatShares(0L)
                    .whatsAppShares(0L)
                    .build()
            )
        assertThat(campaignRetrieveAnalyticsResponse.endDate()).isEqualTo(0L)
        assertThat(campaignRetrieveAnalyticsResponse.previousPeriod()).isPresent()
        assertThat(campaignRetrieveAnalyticsResponse.rates()).isPresent()
        assertThat(campaignRetrieveAnalyticsResponse.startDate()).isEqualTo(0L)
        assertThat(campaignRetrieveAnalyticsResponse.statusCounts()).isPresent()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val campaignRetrieveAnalyticsResponse =
            CampaignRetrieveAnalyticsResponse.builder()
                .analytics(
                    CampaignRetrieveAnalyticsResponse.Analytics.builder()
                        .androidNativeShares(0L)
                        .blueskyShares(0L)
                        .copyRefLinkShares(0L)
                        .emailShares(0L)
                        .facebookShares(0L)
                        .impressions(0L)
                        .invites(0L)
                        .iosNativeShares(0L)
                        .linkedInShares(0L)
                        .messengerShares(0L)
                        .participants(0L)
                        .pinterestShares(0L)
                        .qrcodeShares(0L)
                        .redditShares(0L)
                        .referralCreditExpireds(0L)
                        .referralCreditPendings(0L)
                        .referrals(0L)
                        .smsShares(0L)
                        .telegramShares(0L)
                        .threadsShares(0L)
                        .totalCommissionCount(0L)
                        .totalCommissions(0L)
                        .totalRevenue(0L)
                        .tumblrShares(0L)
                        .twitterShares(0L)
                        .uniqueCommissionReferrals(0L)
                        .uniqueImpressions(0L)
                        .wechatShares(0L)
                        .whatsAppShares(0L)
                        .build()
                )
                .endDate(0L)
                .previousPeriod(
                    CampaignRetrieveAnalyticsResponse.PreviousPeriod.builder()
                        .analytics(
                            CampaignRetrieveAnalyticsResponse.Analytics.builder()
                                .participants(0L)
                                .referrals(0L)
                                .build()
                        )
                        .endDate(1706745600000L)
                        .startDate(1704067200000L)
                        .build()
                )
                .rates(
                    CampaignRetrieveAnalyticsResponse.Rates.builder()
                        .participationRate(0.25)
                        .referralConversionRate(0.15)
                        .sharesPerParticipant(0.5)
                        .build()
                )
                .startDate(0L)
                .statusCounts(
                    CampaignRetrieveAnalyticsResponse.StatusCounts.builder()
                        .affiliateStatus(
                            CampaignRetrieveAnalyticsResponse.StatusCounts.AffiliateStatus.builder()
                                .putAdditionalProperty("APPROVED", JsonValue.from(42))
                                .build()
                        )
                        .commissionStatus(
                            CampaignRetrieveAnalyticsResponse.StatusCounts.CommissionStatus
                                .builder()
                                .approved(
                                    CampaignRetrieveAnalyticsResponse.StatusCounts.CommissionStatus
                                        .CommissionStatusMetric
                                        .builder()
                                        .count(3L)
                                        .totalAmount(7500L)
                                        .totalRevenue(30000L)
                                        .build()
                                )
                                .build()
                        )
                        .currencyIso("USD")
                        .payoutStatus(
                            CampaignRetrieveAnalyticsResponse.StatusCounts.PayoutStatus.builder()
                                .issued(
                                    CampaignRetrieveAnalyticsResponse.StatusCounts.PayoutStatus
                                        .PayoutStatusMetric
                                        .builder()
                                        .count(5L)
                                        .totalAmount(5000L)
                                        .build()
                                )
                                .build()
                        )
                        .rewardStatus(
                            CampaignRetrieveAnalyticsResponse.StatusCounts.RewardStatus.builder()
                                .unapproved(12L)
                                .unfulfilled(300L)
                                .completed(40L)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedCampaignRetrieveAnalyticsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(campaignRetrieveAnalyticsResponse),
                jacksonTypeRef<CampaignRetrieveAnalyticsResponse>(),
            )

        assertThat(roundtrippedCampaignRetrieveAnalyticsResponse)
            .isEqualTo(campaignRetrieveAnalyticsResponse)
    }
}
