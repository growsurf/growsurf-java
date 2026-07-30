// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.growsurf.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignListAffiliateApplicationsParamsTest {

    @Test
    fun create() {
        CampaignListAffiliateApplicationsParams.builder()
            .id("id")
            .limit(1L)
            .offset(0L)
            .status(CampaignListAffiliateApplicationsParams.Status.PENDING)
            .build()
    }

    @Test
    fun pathParams() {
        val params = CampaignListAffiliateApplicationsParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CampaignListAffiliateApplicationsParams.builder()
                .id("id")
                .limit(1L)
                .offset(0L)
                .status(CampaignListAffiliateApplicationsParams.Status.PENDING)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("limit", "1")
                    .put("offset", "0")
                    .put("status", "PENDING")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CampaignListAffiliateApplicationsParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
