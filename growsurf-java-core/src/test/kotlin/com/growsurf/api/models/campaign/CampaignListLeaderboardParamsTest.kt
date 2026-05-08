// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.growsurf.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignListLeaderboardParamsTest {

    @Test
    fun create() {
        CampaignListLeaderboardParams.builder()
            .id("id")
            .isMonthly(true)
            .leaderboardType(CampaignListLeaderboardParams.LeaderboardType.ALL_TIME)
            .limit(1L)
            .nextId("nextId")
            .build()
    }

    @Test
    fun pathParams() {
        val params = CampaignListLeaderboardParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CampaignListLeaderboardParams.builder()
                .id("id")
                .isMonthly(true)
                .leaderboardType(CampaignListLeaderboardParams.LeaderboardType.ALL_TIME)
                .limit(1L)
                .nextId("nextId")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("isMonthly", "true")
                    .put("leaderboardType", "ALL_TIME")
                    .put("limit", "1")
                    .put("nextId", "nextId")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CampaignListLeaderboardParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
