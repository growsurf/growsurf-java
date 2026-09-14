// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantDeleteResponseTest {

    // Public contract: accepted deletion must expose its pending erasure receipt, including in
    // builders.
    @Test
    fun pendingErasure() {
        val response =
            jsonMapper()
                .readValue(
                    """{"success":true,"analyticsErasure":{"status":"pending","operationId":"receipt"}}""",
                    jacksonTypeRef<ParticipantDeleteResponse>(),
                )
        assertThat(response.analyticsErasure().get().operationId()).isEqualTo("receipt")
        assertThat(response.toBuilder().build()).isEqualTo(response)
        assertThat(response.analyticsErasure().get().toBuilder().build())
            .isEqualTo(response.analyticsErasure().get())
        response.validate()
        val bulk =
            jsonMapper()
                .readValue(
                    """{"summary":{"total":0,"deletedCount":0,"duplicateCount":0,"errorCount":0,"notFoundCount":0},"results":[],"analyticsErasure":{"status":"pending","operationId":"receipt"}}""",
                    jacksonTypeRef<ParticipantBulkDeleteResponse>(),
                )
        assertThat(bulk.analyticsErasure().get()).isEqualTo(response.analyticsErasure().get())
        assertThat(bulk.toBuilder().build()).isEqualTo(bulk)
    }

    @Test
    fun create() {
        val participantDeleteResponse = ParticipantDeleteResponse.builder().success(true).build()

        assertThat(participantDeleteResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val participantDeleteResponse = ParticipantDeleteResponse.builder().success(true).build()

        val roundtrippedParticipantDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(participantDeleteResponse),
                jacksonTypeRef<ParticipantDeleteResponse>(),
            )

        assertThat(roundtrippedParticipantDeleteResponse).isEqualTo(participantDeleteResponse)
    }
}
