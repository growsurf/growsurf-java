// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantBulkDeleteResponseTest {

    @Test
    fun create() {
        val participantBulkDeleteResponse =
            ParticipantBulkDeleteResponse.builder()
                .summary(
                    ParticipantBulkDeleteResponse.Summary.builder()
                        .total(3L)
                        .deletedCount(2L)
                        .notFoundCount(1L)
                        .duplicateCount(0L)
                        .errorCount(0L)
                        .build()
                )
                .addResult(
                    ParticipantBulkDeleteResponse.Result.builder()
                        .index(0L)
                        .identifier("gavin@hooli.com")
                        .status(ParticipantBulkDeleteResponse.Result.Status.DELETED)
                        .participantId("f8g9nl")
                        .email("gavin@hooli.com")
                        .message("message")
                        .build()
                )
                .build()

        assertThat(participantBulkDeleteResponse.summary())
            .isEqualTo(
                ParticipantBulkDeleteResponse.Summary.builder()
                    .total(3L)
                    .deletedCount(2L)
                    .notFoundCount(1L)
                    .duplicateCount(0L)
                    .errorCount(0L)
                    .build()
            )
        assertThat(participantBulkDeleteResponse.results())
            .containsExactly(
                ParticipantBulkDeleteResponse.Result.builder()
                    .index(0L)
                    .identifier("gavin@hooli.com")
                    .status(ParticipantBulkDeleteResponse.Result.Status.DELETED)
                    .participantId("f8g9nl")
                    .email("gavin@hooli.com")
                    .message("message")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val participantBulkDeleteResponse =
            ParticipantBulkDeleteResponse.builder()
                .summary(
                    ParticipantBulkDeleteResponse.Summary.builder()
                        .total(3L)
                        .deletedCount(2L)
                        .notFoundCount(1L)
                        .duplicateCount(0L)
                        .errorCount(0L)
                        .build()
                )
                .addResult(
                    ParticipantBulkDeleteResponse.Result.builder()
                        .index(0L)
                        .identifier("gavin@hooli.com")
                        .status(ParticipantBulkDeleteResponse.Result.Status.DELETED)
                        .participantId("f8g9nl")
                        .email("gavin@hooli.com")
                        .message("message")
                        .build()
                )
                .build()

        val roundtrippedParticipantBulkDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(participantBulkDeleteResponse),
                jacksonTypeRef<ParticipantBulkDeleteResponse>(),
            )

        assertThat(roundtrippedParticipantBulkDeleteResponse)
            .isEqualTo(participantBulkDeleteResponse)
    }
}
