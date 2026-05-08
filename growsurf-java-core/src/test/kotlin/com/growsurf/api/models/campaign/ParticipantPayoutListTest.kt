// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantPayoutListTest {

    @Test
    fun create() {
        val participantPayoutList =
            ParticipantPayoutList.builder()
                .limit(0L)
                .nextId("nextId")
                .addPayout(
                    ParticipantPayoutList.Payout.builder()
                        .id("id")
                        .amount(0L)
                        .addCommissionId("string")
                        .createdAt(0L)
                        .currencyIso("currencyISO")
                        .participantId("participantId")
                        .status(ParticipantPayoutList.Payout.Status.UPCOMING)
                        .amountInCampaignCurrency(0L)
                        .campaignCurrencyIso("campaignCurrencyISO")
                        .exchangeRate(0.0)
                        .exchangeRateAt(0L)
                        .failedAt(0L)
                        .fxError("fxError")
                        .issuedAt(0L)
                        .provider("provider")
                        .build()
                )
                .build()

        assertThat(participantPayoutList.limit()).isEqualTo(0L)
        assertThat(participantPayoutList.nextId()).contains("nextId")
        assertThat(participantPayoutList.payouts())
            .containsExactly(
                ParticipantPayoutList.Payout.builder()
                    .id("id")
                    .amount(0L)
                    .addCommissionId("string")
                    .createdAt(0L)
                    .currencyIso("currencyISO")
                    .participantId("participantId")
                    .status(ParticipantPayoutList.Payout.Status.UPCOMING)
                    .amountInCampaignCurrency(0L)
                    .campaignCurrencyIso("campaignCurrencyISO")
                    .exchangeRate(0.0)
                    .exchangeRateAt(0L)
                    .failedAt(0L)
                    .fxError("fxError")
                    .issuedAt(0L)
                    .provider("provider")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val participantPayoutList =
            ParticipantPayoutList.builder()
                .limit(0L)
                .nextId("nextId")
                .addPayout(
                    ParticipantPayoutList.Payout.builder()
                        .id("id")
                        .amount(0L)
                        .addCommissionId("string")
                        .createdAt(0L)
                        .currencyIso("currencyISO")
                        .participantId("participantId")
                        .status(ParticipantPayoutList.Payout.Status.UPCOMING)
                        .amountInCampaignCurrency(0L)
                        .campaignCurrencyIso("campaignCurrencyISO")
                        .exchangeRate(0.0)
                        .exchangeRateAt(0L)
                        .failedAt(0L)
                        .fxError("fxError")
                        .issuedAt(0L)
                        .provider("provider")
                        .build()
                )
                .build()

        val roundtrippedParticipantPayoutList =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(participantPayoutList),
                jacksonTypeRef<ParticipantPayoutList>(),
            )

        assertThat(roundtrippedParticipantPayoutList).isEqualTo(participantPayoutList)
    }
}
