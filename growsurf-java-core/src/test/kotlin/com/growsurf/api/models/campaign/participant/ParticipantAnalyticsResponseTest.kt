// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.jsonMapper
import com.growsurf.api.models.campaign.CampaignRetrieveAnalyticsResponse
import com.growsurf.api.models.campaign.EmailAnalytics
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantAnalyticsResponseTest {

    @Test
    fun emailAnalytics() {
        val email =
            EmailAnalytics(
                sent = 1L,
                delivered = 1L,
                opened = 0L,
                clicked = 0L,
                bounced = 0L,
                spamComplaints = 0L,
                deliveryRate = 1.0,
                openRate = 0.0,
                clickRate = 0.0,
                bounceRate = 0.0,
                byType = emptyList(),
                coverageStartDate = null,
                isPartial = false,
            )
        val response =
            ParticipantAnalyticsResponse.builder()
                .analytics(ParticipantAnalyticsResponse.Analytics.builder().build())
                .ranks(ParticipantAnalyticsResponse.Ranks.builder().build())
                .shareCount(ParticipantAnalyticsResponse.ShareCount.builder().build())
                .email(email)
                .build()

        assertThat(response.email()).contains(email)
    }

    @Test
    fun create() {
        val participantAnalyticsResponse =
            ParticipantAnalyticsResponse.builder()
                .analytics(
                    ParticipantAnalyticsResponse.Analytics.builder()
                        .referrals(12L)
                        .monthlyReferrals(3L)
                        .leads(2L)
                        .expiredReferrals(1L)
                        .impressions(340L)
                        .uniqueImpressions(210L)
                        .invitesSent(8L)
                        .rewardStatus(
                            CampaignRetrieveAnalyticsResponse.StatusCounts.RewardStatus.builder()
                                .unapproved(1L)
                                .unfulfilled(3L)
                                .completed(1L)
                                .build()
                        )
                        .currencyIso("USD")
                        .build()
                )
                .ranks(
                    ParticipantAnalyticsResponse.Ranks.builder()
                        .rank(5L)
                        .monthlyRank(2L)
                        .prevMonthlyRank(4L)
                        .build()
                )
                .shareCount(
                    ParticipantAnalyticsResponse.ShareCount.builder()
                        .putAdditionalProperty("email", JsonValue.from(3))
                        .putAdditionalProperty("facebook", JsonValue.from(5))
                        .build()
                )
                .endDate(1706745600000L)
                .addSeries(
                    ParticipantAnalyticsResponse.Series.builder()
                        .periodStart(1704067200000L)
                        .participants(1L)
                        .referrals(2L)
                        .uniqueCommissionReferrals(4L)
                        .build()
                )
                .startDate(1704067200000L)
                .build()

        assertThat(participantAnalyticsResponse.analytics().referrals()).contains(12L)
        assertThat(participantAnalyticsResponse.analytics().rewardStatus().get().unapproved())
            .contains(1L)
        assertThat(participantAnalyticsResponse.ranks().rank()).contains(5L)
        assertThat(participantAnalyticsResponse.endDate()).contains(1706745600000L)
        assertThat(participantAnalyticsResponse.series().getOrNull())
            .containsExactly(
                ParticipantAnalyticsResponse.Series.builder()
                    .periodStart(1704067200000L)
                    .participants(1L)
                    .referrals(2L)
                    .uniqueCommissionReferrals(4L)
                    .build()
            )
        assertThat(participantAnalyticsResponse.startDate()).contains(1704067200000L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val participantAnalyticsResponse =
            ParticipantAnalyticsResponse.builder()
                .analytics(
                    ParticipantAnalyticsResponse.Analytics.builder()
                        .referrals(12L)
                        .currencyIso("USD")
                        .build()
                )
                .ranks(ParticipantAnalyticsResponse.Ranks.builder().rank(5L).build())
                .shareCount(
                    ParticipantAnalyticsResponse.ShareCount.builder()
                        .putAdditionalProperty("email", JsonValue.from(3))
                        .build()
                )
                .endDate(1706745600000L)
                .addSeries(
                    ParticipantAnalyticsResponse.Series.builder()
                        .periodStart(1704067200000L)
                        .participants(1L)
                        .referrals(2L)
                        .uniqueCommissionReferrals(4L)
                        .build()
                )
                .startDate(1704067200000L)
                .build()

        val roundtrippedParticipantAnalyticsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(participantAnalyticsResponse),
                jacksonTypeRef<ParticipantAnalyticsResponse>(),
            )

        assertThat(roundtrippedParticipantAnalyticsResponse).isEqualTo(participantAnalyticsResponse)
    }
}
