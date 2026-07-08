// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.growsurf.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignRetrieveAnalyticsParamsTest {

    @Test
    fun create() {
        CampaignRetrieveAnalyticsParams.builder()
            .id("id")
            .days(1L)
            .endDate(0L)
            .include("previousPeriod,statusCounts,rates")
            .interval(CampaignRetrieveAnalyticsParams.Interval.DAY)
            .startDate(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = CampaignRetrieveAnalyticsParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CampaignRetrieveAnalyticsParams.builder()
                .id("id")
                .days(1L)
                .endDate(0L)
                .include("previousPeriod,statusCounts,rates")
                .interval(CampaignRetrieveAnalyticsParams.Interval.DAY)
                .startDate(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("days", "1")
                    .put("endDate", "0")
                    .put("include", "previousPeriod,statusCounts,rates")
                    .put("interval", "day")
                    .put("startDate", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CampaignRetrieveAnalyticsParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
