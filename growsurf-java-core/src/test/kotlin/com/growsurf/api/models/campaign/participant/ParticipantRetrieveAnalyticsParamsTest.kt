// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import com.growsurf.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantRetrieveAnalyticsParamsTest {

    @Test
    fun create() {
        ParticipantRetrieveAnalyticsParams.builder()
            .id("id")
            .participantIdOrEmail("participantIdOrEmail")
            .days(1L)
            .endDate(0L)
            .include(ParticipantRetrieveAnalyticsParams.Include.SERIES)
            .interval(ParticipantRetrieveAnalyticsParams.Interval.DAY)
            .startDate(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ParticipantRetrieveAnalyticsParams.builder()
                .id("id")
                .participantIdOrEmail("participantIdOrEmail")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("participantIdOrEmail")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ParticipantRetrieveAnalyticsParams.builder()
                .id("id")
                .participantIdOrEmail("participantIdOrEmail")
                .days(1L)
                .endDate(0L)
                .include(ParticipantRetrieveAnalyticsParams.Include.SERIES)
                .interval(ParticipantRetrieveAnalyticsParams.Interval.DAY)
                .startDate(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("days", "1")
                    .put("endDate", "0")
                    .put("include", "series")
                    .put("interval", "day")
                    .put("startDate", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ParticipantRetrieveAnalyticsParams.builder()
                .id("id")
                .participantIdOrEmail("participantIdOrEmail")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
