// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking.campaign

import com.growsurf.api.client.okhttp.GrowsurfOkHttpClient
import com.growsurf.api.core.JsonValue
import com.growsurf.api.models.campaign.participant.Create
import com.growsurf.api.models.campaign.participant.ParticipantAddParams
import com.growsurf.api.models.campaign.participant.ParticipantBulkDeleteParams
import com.growsurf.api.models.campaign.participant.ParticipantCancelDelayedReferralParams
import com.growsurf.api.models.campaign.participant.ParticipantDeleteParams
import com.growsurf.api.models.campaign.participant.ParticipantEmailParams
import com.growsurf.api.models.campaign.participant.ParticipantListActivityLogsParams
import com.growsurf.api.models.campaign.participant.ParticipantListCommissionsParams
import com.growsurf.api.models.campaign.participant.ParticipantListPayoutsParams
import com.growsurf.api.models.campaign.participant.ParticipantListReferralsParams
import com.growsurf.api.models.campaign.participant.ParticipantListRewardsParams
import com.growsurf.api.models.campaign.participant.ParticipantRecordTransactionParams
import com.growsurf.api.models.campaign.participant.ParticipantRefundTransactionParams
import com.growsurf.api.models.campaign.participant.ParticipantRetrieveAnalyticsParams
import com.growsurf.api.models.campaign.participant.ParticipantRetrieveParams
import com.growsurf.api.models.campaign.participant.ParticipantSendInvitesParams
import com.growsurf.api.models.campaign.participant.ParticipantTriggerReferralParams
import com.growsurf.api.models.campaign.participant.ParticipantUpdateParams
import com.growsurf.api.models.campaign.participant.ReferralStatus
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ParticipantServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val participantService = client.campaign().participant()

        val participant =
            participantService.retrieve(
                ParticipantRetrieveParams.builder()
                    .id("id")
                    .participantIdOrEmail("participantIdOrEmail")
                    .build()
            )

        participant.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val participantService = client.campaign().participant()

        val participant =
            participantService.update(
                ParticipantUpdateParams.builder()
                    .id("id")
                    .participantIdOrEmail("participantIdOrEmail")
                    .email("dev@stainless.com")
                    .firstName("Gavin")
                    .lastName("Belson")
                    .metadata(
                        ParticipantUpdateParams.Metadata.builder()
                            .putAdditionalProperty("company", JsonValue.from("bar"))
                            .build()
                    )
                    .referralStatus(ParticipantUpdateParams.ReferralStatus.CREDIT_PENDING)
                    .referredBy("referredBy")
                    .unsubscribed(false)
                    .addVanityKey("_1k--w2KifJ1")
                    .build()
            )

        participant.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val participantService = client.campaign().participant()

        val participant =
            participantService.delete(
                ParticipantDeleteParams.builder()
                    .id("id")
                    .participantIdOrEmail("participantIdOrEmail")
                    .build()
            )

        participant.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun bulkDelete() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val participantService = client.campaign().participant()

        val response =
            participantService.bulkDelete(
                ParticipantBulkDeleteParams.builder()
                    .id("id")
                    .addParticipant("gavin@hooli.com")
                    .addParticipant("f8g9nl")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun add() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val participantService = client.campaign().participant()

        val participant =
            participantService.add(
                ParticipantAddParams.builder()
                    .id("id")
                    .create(
                        Create.builder()
                            .email("dev@stainless.com")
                            .fingerprint("fingerprint")
                            .firstName("firstName")
                            .ipAddress("ipAddress")
                            .lastName("lastName")
                            .metadata(
                                Create.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .mobileInstanceId("mobileInstanceId")
                            .referralStatus(Create.ReferralStatus.CREDIT_PENDING)
                            .referredBy("referredBy")
                            .build()
                    )
                    .build()
            )

        participant.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listCommissions() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val participantService = client.campaign().participant()

        val participantCommissionList =
            participantService.listCommissions(
                ParticipantListCommissionsParams.builder()
                    .id("id")
                    .participantIdOrEmail("participantIdOrEmail")
                    .limit(1L)
                    .nextId("nextId")
                    .status(ParticipantListCommissionsParams.Status.PENDING)
                    .build()
            )

        participantCommissionList.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listPayouts() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val participantService = client.campaign().participant()

        val participantPayoutList =
            participantService.listPayouts(
                ParticipantListPayoutsParams.builder()
                    .id("id")
                    .participantIdOrEmail("participantIdOrEmail")
                    .limit(1L)
                    .nextId("nextId")
                    .status(ParticipantListPayoutsParams.Status.UPCOMING)
                    .build()
            )

        participantPayoutList.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listReferrals() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val participantService = client.campaign().participant()

        val referralList =
            participantService.listReferrals(
                ParticipantListReferralsParams.builder()
                    .id("id")
                    .participantIdOrEmail("participantIdOrEmail")
                    .desc(true)
                    .email("email")
                    .firstName("firstName")
                    .lastName("lastName")
                    .limit(1L)
                    .nextId("nextId")
                    .offset(0L)
                    .referralStatus(ReferralStatus.CREDIT_PENDING)
                    .sortBy(ParticipantListReferralsParams.SortBy.UPDATED_AT)
                    .build()
            )

        referralList.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listRewards() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val participantService = client.campaign().participant()

        val response =
            participantService.listRewards(
                ParticipantListRewardsParams.builder()
                    .id("id")
                    .participantIdOrEmail("participantIdOrEmail")
                    .limit(1L)
                    .nextId("nextId")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun recordTransaction() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val participantService = client.campaign().participant()

        val response =
            participantService.recordTransaction(
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
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun refundTransaction() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val participantService = client.campaign().participant()

        val response =
            participantService.refundTransaction(
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
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun sendInvites() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val participantService = client.campaign().participant()

        val response =
            participantService.sendInvites(
                ParticipantSendInvitesParams.builder()
                    .id("id")
                    .participantIdOrEmail("participantIdOrEmail")
                    .addEmailAddress("erlich@aviato.com")
                    .messageText("{{referrerFirstName}} invited you with {{referrerShareUrl}}.")
                    .subjectText("Join me on Pied Piper")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun triggerReferral() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val participantService = client.campaign().participant()

        val response =
            participantService.triggerReferral(
                ParticipantTriggerReferralParams.builder()
                    .id("id")
                    .participantIdOrEmail("participantIdOrEmail")
                    .delayInDays(14L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancelDelayedReferral() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val participantService = client.campaign().participant()

        val response =
            participantService.cancelDelayedReferral(
                ParticipantCancelDelayedReferralParams.builder()
                    .id("id")
                    .participantIdOrEmail("participantIdOrEmail")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun email() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val participantService = client.campaign().participant()

        val response =
            participantService.email(
                ParticipantEmailParams.builder()
                    .id("id")
                    .participantIdOrEmail("participantIdOrEmail")
                    .emailType("goalAchieved")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listActivityLogs() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val participantService = client.campaign().participant()

        val response =
            participantService.listActivityLogs(
                ParticipantListActivityLogsParams.builder()
                    .id("id")
                    .participantIdOrEmail("participantIdOrEmail")
                    .limit(20L)
                    .offset(0L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveAnalytics() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val participantService = client.campaign().participant()

        val response =
            participantService.retrieveAnalytics(
                ParticipantRetrieveAnalyticsParams.builder()
                    .id("id")
                    .participantIdOrEmail("participantIdOrEmail")
                    .build()
            )

        response.validate()
    }
}
