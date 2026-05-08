// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import com.growsurf.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantRecordTransactionParamsTest {

    @Test
    fun create() {
        ParticipantRecordTransactionParams.builder()
            .id("id")
            .participantIdOrEmail("participantIdOrEmail")
            .currency("USD")
            .grossAmount(9900L)
            .amountCashNet(7900L)
            .amountPaid(0L)
            .chargeId("chargeId")
            .customerId("customerId")
            .description("Renewal for Pro subscription")
            .externalId("externalId")
            .invoiceId("invoice_54")
            .invoiceSubtotalExcludingTax(0L)
            .invoiceTotal(0L)
            .invoiceTotalExcludingTax(0L)
            .netAmount(0L)
            .orderId("orderId")
            .paidAt(1733702400000L)
            .paymentId("paymentId")
            .paymentIntentId("paymentIntentId")
            .subscriptionId("subscriptionId")
            .taxAmount(0L)
            .totalTaxAmount(0L)
            .addTotalTaxAmount(
                ParticipantRecordTransactionParams.TotalTaxAmount.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .addTotalTax(
                ParticipantRecordTransactionParams.TotalTax.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .transactionId("transactionId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ParticipantRecordTransactionParams.builder()
                .id("id")
                .participantIdOrEmail("participantIdOrEmail")
                .currency("USD")
                .grossAmount(9900L)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("participantIdOrEmail")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ParticipantRecordTransactionParams.builder()
                .id("id")
                .participantIdOrEmail("participantIdOrEmail")
                .currency("USD")
                .grossAmount(9900L)
                .amountCashNet(7900L)
                .amountPaid(0L)
                .chargeId("chargeId")
                .customerId("customerId")
                .description("Renewal for Pro subscription")
                .externalId("externalId")
                .invoiceId("invoice_54")
                .invoiceSubtotalExcludingTax(0L)
                .invoiceTotal(0L)
                .invoiceTotalExcludingTax(0L)
                .netAmount(0L)
                .orderId("orderId")
                .paidAt(1733702400000L)
                .paymentId("paymentId")
                .paymentIntentId("paymentIntentId")
                .subscriptionId("subscriptionId")
                .taxAmount(0L)
                .totalTaxAmount(0L)
                .addTotalTaxAmount(
                    ParticipantRecordTransactionParams.TotalTaxAmount.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addTotalTax(
                    ParticipantRecordTransactionParams.TotalTax.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .transactionId("transactionId")
                .build()

        val body = params._body()

        assertThat(body.currency()).isEqualTo("USD")
        assertThat(body.grossAmount()).isEqualTo(9900L)
        assertThat(body.amountCashNet()).contains(7900L)
        assertThat(body.amountPaid()).contains(0L)
        assertThat(body.chargeId()).contains("chargeId")
        assertThat(body.customerId()).contains("customerId")
        assertThat(body.description()).contains("Renewal for Pro subscription")
        assertThat(body.externalId()).contains("externalId")
        assertThat(body.invoiceId()).contains("invoice_54")
        assertThat(body.invoiceSubtotalExcludingTax()).contains(0L)
        assertThat(body.invoiceTotal()).contains(0L)
        assertThat(body.invoiceTotalExcludingTax()).contains(0L)
        assertThat(body.netAmount()).contains(0L)
        assertThat(body.orderId()).contains("orderId")
        assertThat(body.paidAt()).contains(1733702400000L)
        assertThat(body.paymentId()).contains("paymentId")
        assertThat(body.paymentIntentId()).contains("paymentIntentId")
        assertThat(body.subscriptionId()).contains("subscriptionId")
        assertThat(body.taxAmount()).contains(0L)
        assertThat(body.totalTaxAmount()).contains(0L)
        assertThat(body.totalTaxAmounts().getOrNull())
            .containsExactly(
                ParticipantRecordTransactionParams.TotalTaxAmount.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.totalTaxes().getOrNull())
            .containsExactly(
                ParticipantRecordTransactionParams.TotalTax.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.transactionId()).contains("transactionId")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ParticipantRecordTransactionParams.builder()
                .id("id")
                .participantIdOrEmail("participantIdOrEmail")
                .currency("USD")
                .grossAmount(9900L)
                .build()

        val body = params._body()

        assertThat(body.currency()).isEqualTo("USD")
        assertThat(body.grossAmount()).isEqualTo(9900L)
    }
}
