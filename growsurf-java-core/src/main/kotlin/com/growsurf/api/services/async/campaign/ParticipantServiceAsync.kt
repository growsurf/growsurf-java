// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.async.campaign

import com.growsurf.api.core.ClientOptions
import com.growsurf.api.core.RequestOptions
import com.growsurf.api.core.http.HttpResponseFor
import com.growsurf.api.models.campaign.ParticipantCommissionList
import com.growsurf.api.models.campaign.ParticipantPayoutList
import com.growsurf.api.models.campaign.ReferralList
import com.growsurf.api.models.campaign.participant.Participant
import com.growsurf.api.models.campaign.participant.ParticipantAddParams
import com.growsurf.api.models.campaign.participant.ParticipantDeleteParams
import com.growsurf.api.models.campaign.participant.ParticipantDeleteResponse
import com.growsurf.api.models.campaign.participant.ParticipantListCommissionsParams
import com.growsurf.api.models.campaign.participant.ParticipantListPayoutsParams
import com.growsurf.api.models.campaign.participant.ParticipantListReferralsParams
import com.growsurf.api.models.campaign.participant.ParticipantListRewardsParams
import com.growsurf.api.models.campaign.participant.ParticipantListRewardsResponse
import com.growsurf.api.models.campaign.participant.ParticipantRecordTransactionParams
import com.growsurf.api.models.campaign.participant.ParticipantRecordTransactionResponse
import com.growsurf.api.models.campaign.participant.ParticipantRetrieveParams
import com.growsurf.api.models.campaign.participant.ParticipantSendInvitesParams
import com.growsurf.api.models.campaign.participant.ParticipantSendInvitesResponse
import com.growsurf.api.models.campaign.participant.ParticipantTriggerReferralParams
import com.growsurf.api.models.campaign.participant.ParticipantTriggerReferralResponse
import com.growsurf.api.models.campaign.participant.ParticipantUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ParticipantServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ParticipantServiceAsync

    /** Retrieves a single participant by GrowSurf participant ID or email address. */
    fun retrieve(
        participantIdOrEmail: String,
        params: ParticipantRetrieveParams,
    ): CompletableFuture<Participant> =
        retrieve(participantIdOrEmail, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        participantIdOrEmail: String,
        params: ParticipantRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Participant> =
        retrieve(
            params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(params: ParticipantRetrieveParams): CompletableFuture<Participant> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ParticipantRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Participant>

    /** Updates a participant by GrowSurf participant ID or email address. */
    fun update(
        participantIdOrEmail: String,
        params: ParticipantUpdateParams,
    ): CompletableFuture<Participant> = update(participantIdOrEmail, params, RequestOptions.none())

    /** @see update */
    fun update(
        participantIdOrEmail: String,
        params: ParticipantUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Participant> =
        update(
            params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
            requestOptions,
        )

    /** @see update */
    fun update(params: ParticipantUpdateParams): CompletableFuture<Participant> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ParticipantUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Participant>

    /** Removes a participant by GrowSurf participant ID or email address. */
    fun delete(
        participantIdOrEmail: String,
        params: ParticipantDeleteParams,
    ): CompletableFuture<ParticipantDeleteResponse> =
        delete(participantIdOrEmail, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        participantIdOrEmail: String,
        params: ParticipantDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantDeleteResponse> =
        delete(
            params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
            requestOptions,
        )

    /** @see delete */
    fun delete(params: ParticipantDeleteParams): CompletableFuture<ParticipantDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ParticipantDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantDeleteResponse>

    /**
     * Adds a new participant to the program. If the email already exists, the existing participant
     * is returned.
     */
    fun add(id: String, params: ParticipantAddParams): CompletableFuture<Participant> =
        add(id, params, RequestOptions.none())

    /** @see add */
    fun add(
        id: String,
        params: ParticipantAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Participant> = add(params.toBuilder().id(id).build(), requestOptions)

    /** @see add */
    fun add(params: ParticipantAddParams): CompletableFuture<Participant> =
        add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: ParticipantAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Participant>

    /** Retrieves a paged list of commissions earned by a participant. */
    fun listCommissions(
        participantIdOrEmail: String,
        params: ParticipantListCommissionsParams,
    ): CompletableFuture<ParticipantCommissionList> =
        listCommissions(participantIdOrEmail, params, RequestOptions.none())

    /** @see listCommissions */
    fun listCommissions(
        participantIdOrEmail: String,
        params: ParticipantListCommissionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantCommissionList> =
        listCommissions(
            params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
            requestOptions,
        )

    /** @see listCommissions */
    fun listCommissions(
        params: ParticipantListCommissionsParams
    ): CompletableFuture<ParticipantCommissionList> = listCommissions(params, RequestOptions.none())

    /** @see listCommissions */
    fun listCommissions(
        params: ParticipantListCommissionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantCommissionList>

    /** Retrieves a paged list of payouts that belong to a participant. */
    fun listPayouts(
        participantIdOrEmail: String,
        params: ParticipantListPayoutsParams,
    ): CompletableFuture<ParticipantPayoutList> =
        listPayouts(participantIdOrEmail, params, RequestOptions.none())

    /** @see listPayouts */
    fun listPayouts(
        participantIdOrEmail: String,
        params: ParticipantListPayoutsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantPayoutList> =
        listPayouts(
            params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
            requestOptions,
        )

    /** @see listPayouts */
    fun listPayouts(
        params: ParticipantListPayoutsParams
    ): CompletableFuture<ParticipantPayoutList> = listPayouts(params, RequestOptions.none())

    /** @see listPayouts */
    fun listPayouts(
        params: ParticipantListPayoutsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantPayoutList>

    /** Retrieves referrals and email invites made by a participant. */
    fun listReferrals(
        participantIdOrEmail: String,
        params: ParticipantListReferralsParams,
    ): CompletableFuture<ReferralList> =
        listReferrals(participantIdOrEmail, params, RequestOptions.none())

    /** @see listReferrals */
    fun listReferrals(
        participantIdOrEmail: String,
        params: ParticipantListReferralsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReferralList> =
        listReferrals(
            params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
            requestOptions,
        )

    /** @see listReferrals */
    fun listReferrals(params: ParticipantListReferralsParams): CompletableFuture<ReferralList> =
        listReferrals(params, RequestOptions.none())

    /** @see listReferrals */
    fun listReferrals(
        params: ParticipantListReferralsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReferralList>

    /** Retrieves a paged list of rewards earned by a participant. */
    fun listRewards(
        participantIdOrEmail: String,
        params: ParticipantListRewardsParams,
    ): CompletableFuture<ParticipantListRewardsResponse> =
        listRewards(participantIdOrEmail, params, RequestOptions.none())

    /** @see listRewards */
    fun listRewards(
        participantIdOrEmail: String,
        params: ParticipantListRewardsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantListRewardsResponse> =
        listRewards(
            params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
            requestOptions,
        )

    /** @see listRewards */
    fun listRewards(
        params: ParticipantListRewardsParams
    ): CompletableFuture<ParticipantListRewardsResponse> =
        listRewards(params, RequestOptions.none())

    /** @see listRewards */
    fun listRewards(
        params: ParticipantListRewardsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantListRewardsResponse>

    /**
     * Records a sale made by a referred customer and generates affiliate commissions for their
     * referrer when applicable.
     */
    fun recordTransaction(
        participantIdOrEmail: String,
        params: ParticipantRecordTransactionParams,
    ): CompletableFuture<ParticipantRecordTransactionResponse> =
        recordTransaction(participantIdOrEmail, params, RequestOptions.none())

    /** @see recordTransaction */
    fun recordTransaction(
        participantIdOrEmail: String,
        params: ParticipantRecordTransactionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantRecordTransactionResponse> =
        recordTransaction(
            params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
            requestOptions,
        )

    /** @see recordTransaction */
    fun recordTransaction(
        params: ParticipantRecordTransactionParams
    ): CompletableFuture<ParticipantRecordTransactionResponse> =
        recordTransaction(params, RequestOptions.none())

    /** @see recordTransaction */
    fun recordTransaction(
        params: ParticipantRecordTransactionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantRecordTransactionResponse>

    /** Sends email invites on behalf of a participant to a list of email addresses. */
    fun sendInvites(
        participantIdOrEmail: String,
        params: ParticipantSendInvitesParams,
    ): CompletableFuture<ParticipantSendInvitesResponse> =
        sendInvites(participantIdOrEmail, params, RequestOptions.none())

    /** @see sendInvites */
    fun sendInvites(
        participantIdOrEmail: String,
        params: ParticipantSendInvitesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantSendInvitesResponse> =
        sendInvites(
            params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
            requestOptions,
        )

    /** @see sendInvites */
    fun sendInvites(
        params: ParticipantSendInvitesParams
    ): CompletableFuture<ParticipantSendInvitesResponse> =
        sendInvites(params, RequestOptions.none())

    /** @see sendInvites */
    fun sendInvites(
        params: ParticipantSendInvitesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantSendInvitesResponse>

    /**
     * Triggers referral credit for an existing referred participant by GrowSurf participant ID or
     * email address.
     */
    fun triggerReferral(
        participantIdOrEmail: String,
        params: ParticipantTriggerReferralParams,
    ): CompletableFuture<ParticipantTriggerReferralResponse> =
        triggerReferral(participantIdOrEmail, params, RequestOptions.none())

    /** @see triggerReferral */
    fun triggerReferral(
        participantIdOrEmail: String,
        params: ParticipantTriggerReferralParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantTriggerReferralResponse> =
        triggerReferral(
            params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
            requestOptions,
        )

    /** @see triggerReferral */
    fun triggerReferral(
        params: ParticipantTriggerReferralParams
    ): CompletableFuture<ParticipantTriggerReferralResponse> =
        triggerReferral(params, RequestOptions.none())

    /** @see triggerReferral */
    fun triggerReferral(
        params: ParticipantTriggerReferralParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantTriggerReferralResponse>

    /**
     * A view of [ParticipantServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ParticipantServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/participant/{participantIdOrEmail}`,
         * but is otherwise the same as [ParticipantServiceAsync.retrieve].
         */
        fun retrieve(
            participantIdOrEmail: String,
            params: ParticipantRetrieveParams,
        ): CompletableFuture<HttpResponseFor<Participant>> =
            retrieve(participantIdOrEmail, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            participantIdOrEmail: String,
            params: ParticipantRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Participant>> =
            retrieve(
                params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            params: ParticipantRetrieveParams
        ): CompletableFuture<HttpResponseFor<Participant>> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ParticipantRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Participant>>

        /**
         * Returns a raw HTTP response for `post /campaign/{id}/participant/{participantIdOrEmail}`,
         * but is otherwise the same as [ParticipantServiceAsync.update].
         */
        fun update(
            participantIdOrEmail: String,
            params: ParticipantUpdateParams,
        ): CompletableFuture<HttpResponseFor<Participant>> =
            update(participantIdOrEmail, params, RequestOptions.none())

        /** @see update */
        fun update(
            participantIdOrEmail: String,
            params: ParticipantUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Participant>> =
            update(
                params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
                requestOptions,
            )

        /** @see update */
        fun update(
            params: ParticipantUpdateParams
        ): CompletableFuture<HttpResponseFor<Participant>> = update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ParticipantUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Participant>>

        /**
         * Returns a raw HTTP response for `delete
         * /campaign/{id}/participant/{participantIdOrEmail}`, but is otherwise the same as
         * [ParticipantServiceAsync.delete].
         */
        fun delete(
            participantIdOrEmail: String,
            params: ParticipantDeleteParams,
        ): CompletableFuture<HttpResponseFor<ParticipantDeleteResponse>> =
            delete(participantIdOrEmail, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            participantIdOrEmail: String,
            params: ParticipantDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantDeleteResponse>> =
            delete(
                params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
                requestOptions,
            )

        /** @see delete */
        fun delete(
            params: ParticipantDeleteParams
        ): CompletableFuture<HttpResponseFor<ParticipantDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ParticipantDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantDeleteResponse>>

        /**
         * Returns a raw HTTP response for `post /campaign/{id}/participant`, but is otherwise the
         * same as [ParticipantServiceAsync.add].
         */
        fun add(
            id: String,
            params: ParticipantAddParams,
        ): CompletableFuture<HttpResponseFor<Participant>> = add(id, params, RequestOptions.none())

        /** @see add */
        fun add(
            id: String,
            params: ParticipantAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Participant>> =
            add(params.toBuilder().id(id).build(), requestOptions)

        /** @see add */
        fun add(params: ParticipantAddParams): CompletableFuture<HttpResponseFor<Participant>> =
            add(params, RequestOptions.none())

        /** @see add */
        fun add(
            params: ParticipantAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Participant>>

        /**
         * Returns a raw HTTP response for `get
         * /campaign/{id}/participant/{participantIdOrEmail}/commissions`, but is otherwise the same
         * as [ParticipantServiceAsync.listCommissions].
         */
        fun listCommissions(
            participantIdOrEmail: String,
            params: ParticipantListCommissionsParams,
        ): CompletableFuture<HttpResponseFor<ParticipantCommissionList>> =
            listCommissions(participantIdOrEmail, params, RequestOptions.none())

        /** @see listCommissions */
        fun listCommissions(
            participantIdOrEmail: String,
            params: ParticipantListCommissionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantCommissionList>> =
            listCommissions(
                params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
                requestOptions,
            )

        /** @see listCommissions */
        fun listCommissions(
            params: ParticipantListCommissionsParams
        ): CompletableFuture<HttpResponseFor<ParticipantCommissionList>> =
            listCommissions(params, RequestOptions.none())

        /** @see listCommissions */
        fun listCommissions(
            params: ParticipantListCommissionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantCommissionList>>

        /**
         * Returns a raw HTTP response for `get
         * /campaign/{id}/participant/{participantIdOrEmail}/payouts`, but is otherwise the same as
         * [ParticipantServiceAsync.listPayouts].
         */
        fun listPayouts(
            participantIdOrEmail: String,
            params: ParticipantListPayoutsParams,
        ): CompletableFuture<HttpResponseFor<ParticipantPayoutList>> =
            listPayouts(participantIdOrEmail, params, RequestOptions.none())

        /** @see listPayouts */
        fun listPayouts(
            participantIdOrEmail: String,
            params: ParticipantListPayoutsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantPayoutList>> =
            listPayouts(
                params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
                requestOptions,
            )

        /** @see listPayouts */
        fun listPayouts(
            params: ParticipantListPayoutsParams
        ): CompletableFuture<HttpResponseFor<ParticipantPayoutList>> =
            listPayouts(params, RequestOptions.none())

        /** @see listPayouts */
        fun listPayouts(
            params: ParticipantListPayoutsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantPayoutList>>

        /**
         * Returns a raw HTTP response for `get
         * /campaign/{id}/participant/{participantIdOrEmail}/referrals`, but is otherwise the same
         * as [ParticipantServiceAsync.listReferrals].
         */
        fun listReferrals(
            participantIdOrEmail: String,
            params: ParticipantListReferralsParams,
        ): CompletableFuture<HttpResponseFor<ReferralList>> =
            listReferrals(participantIdOrEmail, params, RequestOptions.none())

        /** @see listReferrals */
        fun listReferrals(
            participantIdOrEmail: String,
            params: ParticipantListReferralsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReferralList>> =
            listReferrals(
                params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
                requestOptions,
            )

        /** @see listReferrals */
        fun listReferrals(
            params: ParticipantListReferralsParams
        ): CompletableFuture<HttpResponseFor<ReferralList>> =
            listReferrals(params, RequestOptions.none())

        /** @see listReferrals */
        fun listReferrals(
            params: ParticipantListReferralsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReferralList>>

        /**
         * Returns a raw HTTP response for `get
         * /campaign/{id}/participant/{participantIdOrEmail}/rewards`, but is otherwise the same as
         * [ParticipantServiceAsync.listRewards].
         */
        fun listRewards(
            participantIdOrEmail: String,
            params: ParticipantListRewardsParams,
        ): CompletableFuture<HttpResponseFor<ParticipantListRewardsResponse>> =
            listRewards(participantIdOrEmail, params, RequestOptions.none())

        /** @see listRewards */
        fun listRewards(
            participantIdOrEmail: String,
            params: ParticipantListRewardsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantListRewardsResponse>> =
            listRewards(
                params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
                requestOptions,
            )

        /** @see listRewards */
        fun listRewards(
            params: ParticipantListRewardsParams
        ): CompletableFuture<HttpResponseFor<ParticipantListRewardsResponse>> =
            listRewards(params, RequestOptions.none())

        /** @see listRewards */
        fun listRewards(
            params: ParticipantListRewardsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantListRewardsResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /campaign/{id}/participant/{participantIdOrEmail}/transaction`, but is otherwise the same
         * as [ParticipantServiceAsync.recordTransaction].
         */
        fun recordTransaction(
            participantIdOrEmail: String,
            params: ParticipantRecordTransactionParams,
        ): CompletableFuture<HttpResponseFor<ParticipantRecordTransactionResponse>> =
            recordTransaction(participantIdOrEmail, params, RequestOptions.none())

        /** @see recordTransaction */
        fun recordTransaction(
            participantIdOrEmail: String,
            params: ParticipantRecordTransactionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantRecordTransactionResponse>> =
            recordTransaction(
                params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
                requestOptions,
            )

        /** @see recordTransaction */
        fun recordTransaction(
            params: ParticipantRecordTransactionParams
        ): CompletableFuture<HttpResponseFor<ParticipantRecordTransactionResponse>> =
            recordTransaction(params, RequestOptions.none())

        /** @see recordTransaction */
        fun recordTransaction(
            params: ParticipantRecordTransactionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantRecordTransactionResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /campaign/{id}/participant/{participantIdOrEmail}/invites`, but is otherwise the same as
         * [ParticipantServiceAsync.sendInvites].
         */
        fun sendInvites(
            participantIdOrEmail: String,
            params: ParticipantSendInvitesParams,
        ): CompletableFuture<HttpResponseFor<ParticipantSendInvitesResponse>> =
            sendInvites(participantIdOrEmail, params, RequestOptions.none())

        /** @see sendInvites */
        fun sendInvites(
            participantIdOrEmail: String,
            params: ParticipantSendInvitesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantSendInvitesResponse>> =
            sendInvites(
                params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
                requestOptions,
            )

        /** @see sendInvites */
        fun sendInvites(
            params: ParticipantSendInvitesParams
        ): CompletableFuture<HttpResponseFor<ParticipantSendInvitesResponse>> =
            sendInvites(params, RequestOptions.none())

        /** @see sendInvites */
        fun sendInvites(
            params: ParticipantSendInvitesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantSendInvitesResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /campaign/{id}/participant/{participantIdOrEmail}/ref`, but is otherwise the same as
         * [ParticipantServiceAsync.triggerReferral].
         */
        fun triggerReferral(
            participantIdOrEmail: String,
            params: ParticipantTriggerReferralParams,
        ): CompletableFuture<HttpResponseFor<ParticipantTriggerReferralResponse>> =
            triggerReferral(participantIdOrEmail, params, RequestOptions.none())

        /** @see triggerReferral */
        fun triggerReferral(
            participantIdOrEmail: String,
            params: ParticipantTriggerReferralParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantTriggerReferralResponse>> =
            triggerReferral(
                params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
                requestOptions,
            )

        /** @see triggerReferral */
        fun triggerReferral(
            params: ParticipantTriggerReferralParams
        ): CompletableFuture<HttpResponseFor<ParticipantTriggerReferralResponse>> =
            triggerReferral(params, RequestOptions.none())

        /** @see triggerReferral */
        fun triggerReferral(
            params: ParticipantTriggerReferralParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantTriggerReferralResponse>>
    }
}
