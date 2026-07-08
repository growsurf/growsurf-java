// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantAnalyticsResponseTest {

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
                        .rewardsEarned(4L)
                        .pendingRewards(1L)
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
                        .build()
                )
                .startDate(1704067200000L)
                .build()

        assertThat(participantAnalyticsResponse.analytics().referrals()).contains(12L)
        assertThat(participantAnalyticsResponse.ranks().rank()).contains(5L)
        assertThat(participantAnalyticsResponse.endDate()).contains(1706745600000L)
        assertThat(participantAnalyticsResponse.series().getOrNull())
            .containsExactly(
                ParticipantAnalyticsResponse.Series.builder()
                    .periodStart(1704067200000L)
                    .participants(1L)
                    .referrals(2L)
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
