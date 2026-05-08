// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantCommissionListTest {

    @Test
    fun create() {
        val participantCommissionList =
            ParticipantCommissionList.builder()
                .addCommission(
                    ParticipantCommissionList.Commission.builder()
                        .id("id")
                        .amount(0L)
                        .createdAt(0L)
                        .currencyIso("currencyISO")
                        .referredId("referredId")
                        .referrerId("referrerId")
                        .saleAmount(0L)
                        .status(ParticipantCommissionList.Commission.Status.PENDING)
                        .amountInCampaignCurrency(0L)
                        .approvedAt(0L)
                        .campaignCurrencyIso("campaignCurrencyISO")
                        .exchangeRate(0.0)
                        .exchangeRateAt(0L)
                        .fxError("fxError")
                        .holdDuration(0L)
                        .paidAt(0L)
                        .payoutQueuedAt(0L)
                        .provider("provider")
                        .reversedAt(0L)
                        .saleAmountAmountInCampaignCurrency(0L)
                        .build()
                )
                .limit(0L)
                .nextId("nextId")
                .build()

        assertThat(participantCommissionList.commissions())
            .containsExactly(
                ParticipantCommissionList.Commission.builder()
                    .id("id")
                    .amount(0L)
                    .createdAt(0L)
                    .currencyIso("currencyISO")
                    .referredId("referredId")
                    .referrerId("referrerId")
                    .saleAmount(0L)
                    .status(ParticipantCommissionList.Commission.Status.PENDING)
                    .amountInCampaignCurrency(0L)
                    .approvedAt(0L)
                    .campaignCurrencyIso("campaignCurrencyISO")
                    .exchangeRate(0.0)
                    .exchangeRateAt(0L)
                    .fxError("fxError")
                    .holdDuration(0L)
                    .paidAt(0L)
                    .payoutQueuedAt(0L)
                    .provider("provider")
                    .reversedAt(0L)
                    .saleAmountAmountInCampaignCurrency(0L)
                    .build()
            )
        assertThat(participantCommissionList.limit()).isEqualTo(0L)
        assertThat(participantCommissionList.nextId()).contains("nextId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val participantCommissionList =
            ParticipantCommissionList.builder()
                .addCommission(
                    ParticipantCommissionList.Commission.builder()
                        .id("id")
                        .amount(0L)
                        .createdAt(0L)
                        .currencyIso("currencyISO")
                        .referredId("referredId")
                        .referrerId("referrerId")
                        .saleAmount(0L)
                        .status(ParticipantCommissionList.Commission.Status.PENDING)
                        .amountInCampaignCurrency(0L)
                        .approvedAt(0L)
                        .campaignCurrencyIso("campaignCurrencyISO")
                        .exchangeRate(0.0)
                        .exchangeRateAt(0L)
                        .fxError("fxError")
                        .holdDuration(0L)
                        .paidAt(0L)
                        .payoutQueuedAt(0L)
                        .provider("provider")
                        .reversedAt(0L)
                        .saleAmountAmountInCampaignCurrency(0L)
                        .build()
                )
                .limit(0L)
                .nextId("nextId")
                .build()

        val roundtrippedParticipantCommissionList =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(participantCommissionList),
                jacksonTypeRef<ParticipantCommissionList>(),
            )

        assertThat(roundtrippedParticipantCommissionList).isEqualTo(participantCommissionList)
    }
}
