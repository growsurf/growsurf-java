// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import com.growsurf.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantListPayoutsParamsTest {

    @Test
    fun create() {
        ParticipantListPayoutsParams.builder()
            .id("id")
            .participantIdOrEmail("participantIdOrEmail")
            .limit(1L)
            .nextId("nextId")
            .status(ParticipantListPayoutsParams.Status.UPCOMING)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ParticipantListPayoutsParams.builder()
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
            ParticipantListPayoutsParams.builder()
                .id("id")
                .participantIdOrEmail("participantIdOrEmail")
                .limit(1L)
                .nextId("nextId")
                .status(ParticipantListPayoutsParams.Status.UPCOMING)
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
        val params =
            ParticipantListPayoutsParams.builder()
                .id("id")
                .participantIdOrEmail("participantIdOrEmail")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
