// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import com.growsurf.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantListReferralsParamsTest {

    @Test
    fun create() {
        ParticipantListReferralsParams.builder()
            .id("id")
            .participantIdOrEmail("participantIdOrEmail")
            .desc(true)
            .email("email")
            .firstName("firstName")
            .lastName("lastName")
            .limit(1L)
            .nextId("nextId")
            .offset(0L)
            .referralStatus(ReferralStatus.CREDIT_PENDING)
            .sortBy(ParticipantListReferralsParams.SortBy.UPDATED_AT)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ParticipantListReferralsParams.builder()
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
            ParticipantListReferralsParams.builder()
                .id("id")
                .participantIdOrEmail("participantIdOrEmail")
                .desc(true)
                .email("email")
                .firstName("firstName")
                .lastName("lastName")
                .limit(1L)
                .nextId("nextId")
                .offset(0L)
                .referralStatus(ReferralStatus.CREDIT_PENDING)
                .sortBy(ParticipantListReferralsParams.SortBy.UPDATED_AT)
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
        val params =
            ParticipantListReferralsParams.builder()
                .id("id")
                .participantIdOrEmail("participantIdOrEmail")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
