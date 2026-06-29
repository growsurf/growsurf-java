// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantRefundTransactionParamsTest {

    @Test
    fun create() {
        ParticipantRefundTransactionParams.builder()
            .id("id")
            .participantIdOrEmail("participantIdOrEmail")
            .amendmentType(ParticipantRefundTransactionParams.AmendmentType.REFUND)
            .amount(1L)
            .amountRefunded(9900L)
            .chargeId("chargeId")
            .currency("xxx")
            .description("Customer refunded the Pro subscription")
            .externalId("externalId")
            .invoiceId("invoice_54")
            .orderId("orderId")
            .paymentId("paymentId")
            .paymentIntentId("paymentIntentId")
            .refundAmount(0L)
            .refundId("refundId")
            .refundStatus("refundStatus")
            .transactionId("transactionId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ParticipantRefundTransactionParams.builder()
                .id("id")
                .participantIdOrEmail("participantIdOrEmail")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("participantIdOrEmail")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ParticipantRefundTransactionParams.builder()
                .id("id")
                .participantIdOrEmail("participantIdOrEmail")
                .amendmentType(ParticipantRefundTransactionParams.AmendmentType.REFUND)
                .amount(1L)
                .amountRefunded(9900L)
                .chargeId("chargeId")
                .currency("xxx")
                .description("Customer refunded the Pro subscription")
                .externalId("externalId")
                .invoiceId("invoice_54")
                .orderId("orderId")
                .paymentId("paymentId")
                .paymentIntentId("paymentIntentId")
                .refundAmount(0L)
                .refundId("refundId")
                .refundStatus("refundStatus")
                .transactionId("transactionId")
                .build()

        val body = params._body()

        assertThat(body.amendmentType())
            .contains(ParticipantRefundTransactionParams.AmendmentType.REFUND)
        assertThat(body.amount()).contains(1L)
        assertThat(body.amountRefunded()).contains(9900L)
        assertThat(body.chargeId()).contains("chargeId")
        assertThat(body.currency()).contains("xxx")
        assertThat(body.description()).contains("Customer refunded the Pro subscription")
        assertThat(body.externalId()).contains("externalId")
        assertThat(body.invoiceId()).contains("invoice_54")
        assertThat(body.orderId()).contains("orderId")
        assertThat(body.paymentId()).contains("paymentId")
        assertThat(body.paymentIntentId()).contains("paymentIntentId")
        assertThat(body.refundAmount()).contains(0L)
        assertThat(body.refundId()).contains("refundId")
        assertThat(body.refundStatus()).contains("refundStatus")
        assertThat(body.transactionId()).contains("transactionId")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ParticipantRefundTransactionParams.builder()
                .id("id")
                .participantIdOrEmail("participantIdOrEmail")
                .build()

        params._body()
    }
}
