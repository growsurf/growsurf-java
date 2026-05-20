// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.async.campaign

import com.growsurf.api.client.okhttp.GrowsurfOkHttpClientAsync
import com.growsurf.api.core.JsonValue
import com.growsurf.api.models.campaign.participant.Create
import com.growsurf.api.models.campaign.participant.ParticipantAddParams
import com.growsurf.api.models.campaign.participant.ParticipantDeleteParams
import com.growsurf.api.models.campaign.participant.ParticipantListCommissionsParams
import com.growsurf.api.models.campaign.participant.ParticipantListPayoutsParams
import com.growsurf.api.models.campaign.participant.ParticipantListReferralsParams
import com.growsurf.api.models.campaign.participant.ParticipantListRewardsParams
import com.growsurf.api.models.campaign.participant.ParticipantRecordTransactionParams
import com.growsurf.api.models.campaign.participant.ParticipantRetrieveParams
import com.growsurf.api.models.campaign.participant.ParticipantSendInvitesParams
import com.growsurf.api.models.campaign.participant.ParticipantTriggerReferralParams
import com.growsurf.api.models.campaign.participant.ParticipantUpdateParams
import com.growsurf.api.models.campaign.participant.ReferralStatus
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ParticipantServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val participantServiceAsync = client.campaign().participant()

        val participantFuture =
            participantServiceAsync.retrieve(
                ParticipantRetrieveParams.builder()
                    .id("id")
                    .participantIdOrEmail("participantIdOrEmail")
                    .build()
            )

        val participant = participantFuture.get()
        participant.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val participantServiceAsync = client.campaign().participant()

        val participantFuture =
            participantServiceAsync.update(
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

        val participant = participantFuture.get()
        participant.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val participantServiceAsync = client.campaign().participant()

        val participantFuture =
            participantServiceAsync.delete(
                ParticipantDeleteParams.builder()
                    .id("id")
                    .participantIdOrEmail("participantIdOrEmail")
                    .build()
            )

        val participant = participantFuture.get()
        participant.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun add() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val participantServiceAsync = client.campaign().participant()

        val participantFuture =
            participantServiceAsync.add(
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

        val participant = participantFuture.get()
        participant.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listCommissions() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val participantServiceAsync = client.campaign().participant()

        val participantCommissionListFuture =
            participantServiceAsync.listCommissions(
                ParticipantListCommissionsParams.builder()
                    .id("id")
                    .participantIdOrEmail("participantIdOrEmail")
                    .limit(1L)
                    .nextId("nextId")
                    .status(ParticipantListCommissionsParams.Status.PENDING)
                    .build()
            )

        val participantCommissionList = participantCommissionListFuture.get()
        participantCommissionList.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listPayouts() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val participantServiceAsync = client.campaign().participant()

        val participantPayoutListFuture =
            participantServiceAsync.listPayouts(
                ParticipantListPayoutsParams.builder()
                    .id("id")
                    .participantIdOrEmail("participantIdOrEmail")
                    .limit(1L)
                    .nextId("nextId")
                    .status(ParticipantListPayoutsParams.Status.UPCOMING)
                    .build()
            )

        val participantPayoutList = participantPayoutListFuture.get()
        participantPayoutList.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listReferrals() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val participantServiceAsync = client.campaign().participant()

        val referralListFuture =
            participantServiceAsync.listReferrals(
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

        val referralList = referralListFuture.get()
        referralList.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listRewards() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val participantServiceAsync = client.campaign().participant()

        val responseFuture =
            participantServiceAsync.listRewards(
                ParticipantListRewardsParams.builder()
                    .id("id")
                    .participantIdOrEmail("participantIdOrEmail")
                    .limit(1L)
                    .nextId("nextId")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun recordTransaction() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val participantServiceAsync = client.campaign().participant()

        val responseFuture =
            participantServiceAsync.recordTransaction(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun sendInvites() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val participantServiceAsync = client.campaign().participant()

        val responseFuture =
            participantServiceAsync.sendInvites(
                ParticipantSendInvitesParams.builder()
                    .id("id")
                    .participantIdOrEmail("participantIdOrEmail")
                    .addEmailAddress("erlich@aviato.com")
                    .messageText("{{referrerFirstName}} invited you with {{referrerShareUrl}}.")
                    .subjectText("Join me on Pied Piper")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun triggerReferral() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val participantServiceAsync = client.campaign().participant()

        val responseFuture =
            participantServiceAsync.triggerReferral(
                ParticipantTriggerReferralParams.builder()
                    .id("id")
                    .participantIdOrEmail("participantIdOrEmail")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
