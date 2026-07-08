// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommissionStructureTest {

    @Test
    fun create() {
        val commissionStructure =
            CommissionStructure.builder()
                .amount(0L)
                .amountIso("amountISO")
                .approvalRequired(true)
                .duration("duration")
                .durationInMonths(0L)
                .event("event")
                .hasIntro(true)
                .hasMaxAmount(true)
                .holdDuration(0L)
                .introAmount(0L)
                .introAmountIso("introAmountISO")
                .introDuration("introDuration")
                .introDurationInMonths(0L)
                .introPercent(0.0)
                .introType("introType")
                .maxAmount(0L)
                .maxAmountIso("maxAmountISO")
                .minPaidReferrals(0L)
                .percent(0.0)
                .type(CommissionStructure.Type.PERCENT)
                .build()

        assertThat(commissionStructure.amount()).contains(0L)
        assertThat(commissionStructure.amountIso()).contains("amountISO")
        assertThat(commissionStructure.approvalRequired()).contains(true)
        assertThat(commissionStructure.duration()).contains("duration")
        assertThat(commissionStructure.durationInMonths()).contains(0L)
        assertThat(commissionStructure.event()).contains("event")
        assertThat(commissionStructure.hasIntro()).contains(true)
        assertThat(commissionStructure.hasMaxAmount()).contains(true)
        assertThat(commissionStructure.holdDuration()).contains(0L)
        assertThat(commissionStructure.introAmount()).contains(0L)
        assertThat(commissionStructure.introAmountIso()).contains("introAmountISO")
        assertThat(commissionStructure.introDuration()).contains("introDuration")
        assertThat(commissionStructure.introDurationInMonths()).contains(0L)
        assertThat(commissionStructure.introPercent()).contains(0.0)
        assertThat(commissionStructure.introType()).contains("introType")
        assertThat(commissionStructure.maxAmount()).contains(0L)
        assertThat(commissionStructure.maxAmountIso()).contains("maxAmountISO")
        assertThat(commissionStructure.minPaidReferrals()).contains(0L)
        assertThat(commissionStructure.percent()).contains(0.0)
        assertThat(commissionStructure.type()).contains(CommissionStructure.Type.PERCENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val commissionStructure =
            CommissionStructure.builder()
                .amount(0L)
                .amountIso("amountISO")
                .approvalRequired(true)
                .duration("duration")
                .durationInMonths(0L)
                .event("event")
                .hasIntro(true)
                .hasMaxAmount(true)
                .holdDuration(0L)
                .introAmount(0L)
                .introAmountIso("introAmountISO")
                .introDuration("introDuration")
                .introDurationInMonths(0L)
                .introPercent(0.0)
                .introType("introType")
                .maxAmount(0L)
                .maxAmountIso("maxAmountISO")
                .minPaidReferrals(0L)
                .percent(0.0)
                .type(CommissionStructure.Type.PERCENT)
                .build()

        val roundtrippedCommissionStructure =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(commissionStructure),
                jacksonTypeRef<CommissionStructure>(),
            )

        assertThat(roundtrippedCommissionStructure).isEqualTo(commissionStructure)
    }
}
