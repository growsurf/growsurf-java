// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.jsonMapper
import com.growsurf.api.errors.GrowsurfInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class ParticipantRecordTransactionResponseTest {

    @Test
    fun ofUnionMember0() {
        val unionMember0 =
            ParticipantRecordTransactionResponse.UnionMember0.builder()
                .firstSale(true)
                .message("message")
                .build()

        val participantRecordTransactionResponse =
            ParticipantRecordTransactionResponse.ofUnionMember0(unionMember0)

        assertThat(participantRecordTransactionResponse.unionMember0()).contains(unionMember0)
        assertThat(participantRecordTransactionResponse.unionMember1()).isEmpty
    }

    @Test
    fun ofUnionMember0Roundtrip() {
        val jsonMapper = jsonMapper()
        val participantRecordTransactionResponse =
            ParticipantRecordTransactionResponse.ofUnionMember0(
                ParticipantRecordTransactionResponse.UnionMember0.builder()
                    .firstSale(true)
                    .message("message")
                    .build()
            )

        val roundtrippedParticipantRecordTransactionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(participantRecordTransactionResponse),
                jacksonTypeRef<ParticipantRecordTransactionResponse>(),
            )

        assertThat(roundtrippedParticipantRecordTransactionResponse)
            .isEqualTo(participantRecordTransactionResponse)
    }

    @Test
    fun ofUnionMember1() {
        val unionMember1 =
            ParticipantRecordTransactionResponse.UnionMember1.builder()
                .commissionsCreated(0L)
                .addDuplicateField("string")
                .addMatchingCommissionId("string")
                .message("message")
                .build()

        val participantRecordTransactionResponse =
            ParticipantRecordTransactionResponse.ofUnionMember1(unionMember1)

        assertThat(participantRecordTransactionResponse.unionMember0()).isEmpty
        assertThat(participantRecordTransactionResponse.unionMember1()).contains(unionMember1)
    }

    @Test
    fun ofUnionMember1Roundtrip() {
        val jsonMapper = jsonMapper()
        val participantRecordTransactionResponse =
            ParticipantRecordTransactionResponse.ofUnionMember1(
                ParticipantRecordTransactionResponse.UnionMember1.builder()
                    .commissionsCreated(0L)
                    .addDuplicateField("string")
                    .addMatchingCommissionId("string")
                    .message("message")
                    .build()
            )

        val roundtrippedParticipantRecordTransactionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(participantRecordTransactionResponse),
                jacksonTypeRef<ParticipantRecordTransactionResponse>(),
            )

        assertThat(roundtrippedParticipantRecordTransactionResponse)
            .isEqualTo(participantRecordTransactionResponse)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val participantRecordTransactionResponse =
            jsonMapper()
                .convertValue(
                    testCase.value,
                    jacksonTypeRef<ParticipantRecordTransactionResponse>(),
                )

        val e =
            assertThrows<GrowsurfInvalidDataException> {
                participantRecordTransactionResponse.validate()
            }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
