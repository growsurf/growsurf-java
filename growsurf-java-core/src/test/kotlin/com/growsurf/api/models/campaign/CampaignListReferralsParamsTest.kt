// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.growsurf.api.core.http.QueryParams
import com.growsurf.api.models.campaign.participant.ReferralStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignListReferralsParamsTest {

    @Test
    fun create() {
        CampaignListReferralsParams.builder()
            .id("id")
            .desc(true)
            .email("email")
            .firstName("firstName")
            .lastName("lastName")
            .limit(1L)
            .nextId("nextId")
            .offset(0L)
            .referralStatus(ReferralStatus.CREDIT_PENDING)
            .sortBy(CampaignListReferralsParams.SortBy.UPDATED_AT)
            .build()
    }

    @Test
    fun pathParams() {
        val params = CampaignListReferralsParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CampaignListReferralsParams.builder()
                .id("id")
                .desc(true)
                .email("email")
                .firstName("firstName")
                .lastName("lastName")
                .limit(1L)
                .nextId("nextId")
                .offset(0L)
                .referralStatus(ReferralStatus.CREDIT_PENDING)
                .sortBy(CampaignListReferralsParams.SortBy.UPDATED_AT)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("desc", "true")
                    .put("email", "email")
                    .put("firstName", "firstName")
                    .put("lastName", "lastName")
                    .put("limit", "1")
                    .put("nextId", "nextId")
                    .put("offset", "0")
                    .put("referralStatus", "CREDIT_PENDING")
                    .put("sortBy", "updatedAt")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CampaignListReferralsParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
