// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignRetrieveAnalyticsResponseTest {

    @Test
    fun create() {
        val campaignRetrieveAnalyticsResponse =
            CampaignRetrieveAnalyticsResponse.builder()
                .analytics(
                    CampaignRetrieveAnalyticsResponse.Analytics.builder()
                        .blueskyShares(0L)
                        .emailShares(0L)
                        .facebookShares(0L)
                        .impressions(0L)
                        .invites(0L)
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
                        .uniqueImpressions(0L)
                        .wechatShares(0L)
                        .whatsAppShares(0L)
                        .build()
                )
                .endDate(0L)
                .startDate(0L)
                .build()

        assertThat(campaignRetrieveAnalyticsResponse.analytics())
            .isEqualTo(
                CampaignRetrieveAnalyticsResponse.Analytics.builder()
                    .blueskyShares(0L)
                    .emailShares(0L)
                    .facebookShares(0L)
                    .impressions(0L)
                    .invites(0L)
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
                    .uniqueImpressions(0L)
                    .wechatShares(0L)
                    .whatsAppShares(0L)
                    .build()
            )
        assertThat(campaignRetrieveAnalyticsResponse.endDate()).isEqualTo(0L)
        assertThat(campaignRetrieveAnalyticsResponse.startDate()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val campaignRetrieveAnalyticsResponse =
            CampaignRetrieveAnalyticsResponse.builder()
                .analytics(
                    CampaignRetrieveAnalyticsResponse.Analytics.builder()
                        .blueskyShares(0L)
                        .emailShares(0L)
                        .facebookShares(0L)
                        .impressions(0L)
                        .invites(0L)
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
                        .uniqueImpressions(0L)
                        .wechatShares(0L)
                        .whatsAppShares(0L)
                        .build()
                )
                .endDate(0L)
                .startDate(0L)
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
