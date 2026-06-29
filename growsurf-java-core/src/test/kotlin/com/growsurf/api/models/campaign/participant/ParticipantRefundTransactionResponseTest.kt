// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantRefundTransactionResponseTest {

    @Test
    fun create() {
        val participantRefundTransactionResponse =
            ParticipantRefundTransactionResponse.builder()
                .adjusted(0L)
                .amendmentType(ParticipantRefundTransactionResponse.AmendmentType.REFUND)
                .deleted(0L)
                .matched(0L)
                .addMatchingCommissionId("string")
                .message("message")
                .reversed(0L)
                .success(true)
                .notFound(true)
                .build()

        assertThat(participantRefundTransactionResponse.adjusted()).isEqualTo(0L)
        assertThat(participantRefundTransactionResponse.amendmentType())
            .isEqualTo(ParticipantRefundTransactionResponse.AmendmentType.REFUND)
        assertThat(participantRefundTransactionResponse.deleted()).isEqualTo(0L)
        assertThat(participantRefundTransactionResponse.matched()).isEqualTo(0L)
        assertThat(participantRefundTransactionResponse.matchingCommissionIds())
            .containsExactly("string")
        assertThat(participantRefundTransactionResponse.message()).isEqualTo("message")
        assertThat(participantRefundTransactionResponse.reversed()).isEqualTo(0L)
        assertThat(participantRefundTransactionResponse.success()).isEqualTo(true)
        assertThat(participantRefundTransactionResponse.notFound()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val participantRefundTransactionResponse =
            ParticipantRefundTransactionResponse.builder()
                .adjusted(0L)
                .amendmentType(ParticipantRefundTransactionResponse.AmendmentType.REFUND)
                .deleted(0L)
                .matched(0L)
                .addMatchingCommissionId("string")
                .message("message")
                .reversed(0L)
                .success(true)
                .notFound(true)
                .build()

        val roundtrippedParticipantRefundTransactionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(participantRefundTransactionResponse),
                jacksonTypeRef<ParticipantRefundTransactionResponse>(),
            )

        assertThat(roundtrippedParticipantRefundTransactionResponse)
            .isEqualTo(participantRefundTransactionResponse)
    }
}
