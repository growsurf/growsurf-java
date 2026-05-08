// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.growsurf.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignListPayoutsParamsTest {

    @Test
    fun create() {
        CampaignListPayoutsParams.builder()
            .id("id")
            .limit(1L)
            .nextId("nextId")
            .status(CampaignListPayoutsParams.Status.UPCOMING)
            .build()
    }

    @Test
    fun pathParams() {
        val params = CampaignListPayoutsParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CampaignListPayoutsParams.builder()
                .id("id")
                .limit(1L)
                .nextId("nextId")
                .status(CampaignListPayoutsParams.Status.UPCOMING)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("limit", "1")
                    .put("nextId", "nextId")
                    .put("status", "UPCOMING")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CampaignListPayoutsParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
