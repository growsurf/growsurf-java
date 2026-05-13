// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking.campaign

import com.google.errorprone.annotations.MustBeClosed
import com.growsurf.api.core.ClientOptions
import com.growsurf.api.core.RequestOptions
import com.growsurf.api.core.http.HttpResponseFor
import com.growsurf.api.models.campaign.ParticipantCommissionList
import com.growsurf.api.models.campaign.ParticipantPayoutList
import com.growsurf.api.models.campaign.ReferralList
import com.growsurf.api.models.campaign.participant.Participant
import com.growsurf.api.models.campaign.participant.ParticipantAddParams
import com.growsurf.api.models.campaign.participant.ParticipantCreateMobileTokenParams
import com.growsurf.api.models.campaign.participant.ParticipantCreateMobileTokenResponse
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
import java.util.function.Consumer

interface ParticipantService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ParticipantService

    /** Retrieves a single participant by GrowSurf participant ID or email address. */
    fun retrieve(participantIdOrEmail: String, params: ParticipantRetrieveParams): Participant =
        retrieve(participantIdOrEmail, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        participantIdOrEmail: String,
        params: ParticipantRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Participant =
        retrieve(
            params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(params: ParticipantRetrieveParams): Participant =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ParticipantRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Participant

    /** Updates a participant by GrowSurf participant ID or email address. */
    fun update(participantIdOrEmail: String, params: ParticipantUpdateParams): Participant =
        update(participantIdOrEmail, params, RequestOptions.none())

    /** @see update */
    fun update(
        participantIdOrEmail: String,
        params: ParticipantUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Participant =
        update(
            params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
            requestOptions,
        )

    /** @see update */
    fun update(params: ParticipantUpdateParams): Participant = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ParticipantUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Participant

    /** Removes a participant by GrowSurf participant ID or email address. */
    fun delete(
        participantIdOrEmail: String,
        params: ParticipantDeleteParams,
    ): ParticipantDeleteResponse = delete(participantIdOrEmail, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        participantIdOrEmail: String,
        params: ParticipantDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipantDeleteResponse =
        delete(
            params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
            requestOptions,
        )

    /** @see delete */
    fun delete(params: ParticipantDeleteParams): ParticipantDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ParticipantDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipantDeleteResponse

    /**
     * Adds a new participant to the program. If the email already exists, the existing participant
     * is returned.
     */
    fun add(id: String, params: ParticipantAddParams): Participant =
        add(id, params, RequestOptions.none())

    /** @see add */
    fun add(
        id: String,
        params: ParticipantAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Participant = add(params.toBuilder().id(id).build(), requestOptions)

    /** @see add */
    fun add(params: ParticipantAddParams): Participant = add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: ParticipantAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Participant

    /**
     * Creates a participant-scoped token for GrowSurf mobile SDK participant endpoints. The program
     * must have mobile SDK access enabled.
     */
    fun createMobileToken(
        participantIdOrEmail: String,
        params: ParticipantCreateMobileTokenParams,
    ): ParticipantCreateMobileTokenResponse =
        createMobileToken(participantIdOrEmail, params, RequestOptions.none())

    /** @see createMobileToken */
    fun createMobileToken(
        participantIdOrEmail: String,
        params: ParticipantCreateMobileTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipantCreateMobileTokenResponse =
        createMobileToken(
            params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
            requestOptions,
        )

    /** @see createMobileToken */
    fun createMobileToken(
        params: ParticipantCreateMobileTokenParams
    ): ParticipantCreateMobileTokenResponse = createMobileToken(params, RequestOptions.none())

    /** @see createMobileToken */
    fun createMobileToken(
        params: ParticipantCreateMobileTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipantCreateMobileTokenResponse

    /** Retrieves a paged list of commissions earned by a participant. */
    fun listCommissions(
        participantIdOrEmail: String,
        params: ParticipantListCommissionsParams,
    ): ParticipantCommissionList =
        listCommissions(participantIdOrEmail, params, RequestOptions.none())

    /** @see listCommissions */
    fun listCommissions(
        participantIdOrEmail: String,
        params: ParticipantListCommissionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipantCommissionList =
        listCommissions(
            params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
            requestOptions,
        )

    /** @see listCommissions */
    fun listCommissions(params: ParticipantListCommissionsParams): ParticipantCommissionList =
        listCommissions(params, RequestOptions.none())

    /** @see listCommissions */
    fun listCommissions(
        params: ParticipantListCommissionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipantCommissionList

    /** Retrieves a paged list of payouts that belong to a participant. */
    fun listPayouts(
        participantIdOrEmail: String,
        params: ParticipantListPayoutsParams,
    ): ParticipantPayoutList = listPayouts(participantIdOrEmail, params, RequestOptions.none())

    /** @see listPayouts */
    fun listPayouts(
        participantIdOrEmail: String,
        params: ParticipantListPayoutsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipantPayoutList =
        listPayouts(
            params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
            requestOptions,
        )

    /** @see listPayouts */
    fun listPayouts(params: ParticipantListPayoutsParams): ParticipantPayoutList =
        listPayouts(params, RequestOptions.none())

    /** @see listPayouts */
    fun listPayouts(
        params: ParticipantListPayoutsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipantPayoutList

    /** Retrieves referrals and email invites made by a participant. */
    fun listReferrals(
        participantIdOrEmail: String,
        params: ParticipantListReferralsParams,
    ): ReferralList = listReferrals(participantIdOrEmail, params, RequestOptions.none())

    /** @see listReferrals */
    fun listReferrals(
        participantIdOrEmail: String,
        params: ParticipantListReferralsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReferralList =
        listReferrals(
            params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
            requestOptions,
        )

    /** @see listReferrals */
    fun listReferrals(params: ParticipantListReferralsParams): ReferralList =
        listReferrals(params, RequestOptions.none())

    /** @see listReferrals */
    fun listReferrals(
        params: ParticipantListReferralsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReferralList

    /** Retrieves a paged list of rewards earned by a participant. */
    fun listRewards(
        participantIdOrEmail: String,
        params: ParticipantListRewardsParams,
    ): ParticipantListRewardsResponse =
        listRewards(participantIdOrEmail, params, RequestOptions.none())

    /** @see listRewards */
    fun listRewards(
        participantIdOrEmail: String,
        params: ParticipantListRewardsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipantListRewardsResponse =
        listRewards(
            params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
            requestOptions,
        )

    /** @see listRewards */
    fun listRewards(params: ParticipantListRewardsParams): ParticipantListRewardsResponse =
        listRewards(params, RequestOptions.none())

    /** @see listRewards */
    fun listRewards(
        params: ParticipantListRewardsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipantListRewardsResponse

    /**
     * Records a sale made by a referred customer and generates affiliate commissions for their
     * referrer when applicable.
     */
    fun recordTransaction(
        participantIdOrEmail: String,
        params: ParticipantRecordTransactionParams,
    ): ParticipantRecordTransactionResponse =
        recordTransaction(participantIdOrEmail, params, RequestOptions.none())

    /** @see recordTransaction */
    fun recordTransaction(
        participantIdOrEmail: String,
        params: ParticipantRecordTransactionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipantRecordTransactionResponse =
        recordTransaction(
            params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
            requestOptions,
        )

    /** @see recordTransaction */
    fun recordTransaction(
        params: ParticipantRecordTransactionParams
    ): ParticipantRecordTransactionResponse = recordTransaction(params, RequestOptions.none())

    /** @see recordTransaction */
    fun recordTransaction(
        params: ParticipantRecordTransactionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipantRecordTransactionResponse

    /** Sends email invites on behalf of a participant to a list of email addresses. */
    fun sendInvites(
        participantIdOrEmail: String,
        params: ParticipantSendInvitesParams,
    ): ParticipantSendInvitesResponse =
        sendInvites(participantIdOrEmail, params, RequestOptions.none())

    /** @see sendInvites */
    fun sendInvites(
        participantIdOrEmail: String,
        params: ParticipantSendInvitesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipantSendInvitesResponse =
        sendInvites(
            params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
            requestOptions,
        )

    /** @see sendInvites */
    fun sendInvites(params: ParticipantSendInvitesParams): ParticipantSendInvitesResponse =
        sendInvites(params, RequestOptions.none())

    /** @see sendInvites */
    fun sendInvites(
        params: ParticipantSendInvitesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipantSendInvitesResponse

    /**
     * Triggers referral credit for an existing referred participant by GrowSurf participant ID or
     * email address.
     */
    fun triggerReferral(
        participantIdOrEmail: String,
        params: ParticipantTriggerReferralParams,
    ): ParticipantTriggerReferralResponse =
        triggerReferral(participantIdOrEmail, params, RequestOptions.none())

    /** @see triggerReferral */
    fun triggerReferral(
        participantIdOrEmail: String,
        params: ParticipantTriggerReferralParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipantTriggerReferralResponse =
        triggerReferral(
            params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
            requestOptions,
        )

    /** @see triggerReferral */
    fun triggerReferral(
        params: ParticipantTriggerReferralParams
    ): ParticipantTriggerReferralResponse = triggerReferral(params, RequestOptions.none())

    /** @see triggerReferral */
    fun triggerReferral(
        params: ParticipantTriggerReferralParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipantTriggerReferralResponse

    /**
     * A view of [ParticipantService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ParticipantService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/participant/{participantIdOrEmail}`,
         * but is otherwise the same as [ParticipantService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            participantIdOrEmail: String,
            params: ParticipantRetrieveParams,
        ): HttpResponseFor<Participant> =
            retrieve(participantIdOrEmail, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            participantIdOrEmail: String,
            params: ParticipantRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Participant> =
            retrieve(
                params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ParticipantRetrieveParams): HttpResponseFor<Participant> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ParticipantRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Participant>

        /**
         * Returns a raw HTTP response for `post /campaign/{id}/participant/{participantIdOrEmail}`,
         * but is otherwise the same as [ParticipantService.update].
         */
        @MustBeClosed
        fun update(
            participantIdOrEmail: String,
            params: ParticipantUpdateParams,
        ): HttpResponseFor<Participant> =
            update(participantIdOrEmail, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            participantIdOrEmail: String,
            params: ParticipantUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Participant> =
            update(
                params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
                requestOptions,
            )

        /** @see update */
        @MustBeClosed
        fun update(params: ParticipantUpdateParams): HttpResponseFor<Participant> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ParticipantUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Participant>

        /**
         * Returns a raw HTTP response for `delete
         * /campaign/{id}/participant/{participantIdOrEmail}`, but is otherwise the same as
         * [ParticipantService.delete].
         */
        @MustBeClosed
        fun delete(
            participantIdOrEmail: String,
            params: ParticipantDeleteParams,
        ): HttpResponseFor<ParticipantDeleteResponse> =
            delete(participantIdOrEmail, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            participantIdOrEmail: String,
            params: ParticipantDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipantDeleteResponse> =
            delete(
                params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
                requestOptions,
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: ParticipantDeleteParams): HttpResponseFor<ParticipantDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ParticipantDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipantDeleteResponse>

        /**
         * Returns a raw HTTP response for `post /campaign/{id}/participant`, but is otherwise the
         * same as [ParticipantService.add].
         */
        @MustBeClosed
        fun add(id: String, params: ParticipantAddParams): HttpResponseFor<Participant> =
            add(id, params, RequestOptions.none())

        /** @see add */
        @MustBeClosed
        fun add(
            id: String,
            params: ParticipantAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Participant> = add(params.toBuilder().id(id).build(), requestOptions)

        /** @see add */
        @MustBeClosed
        fun add(params: ParticipantAddParams): HttpResponseFor<Participant> =
            add(params, RequestOptions.none())

        /** @see add */
        @MustBeClosed
        fun add(
            params: ParticipantAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Participant>

        /**
         * Returns a raw HTTP response for `post
         * /campaign/{id}/participant/{participantIdOrEmail}/mobile-token`, but is otherwise the
         * same as [ParticipantService.createMobileToken].
         */
        @MustBeClosed
        fun createMobileToken(
            participantIdOrEmail: String,
            params: ParticipantCreateMobileTokenParams,
        ): HttpResponseFor<ParticipantCreateMobileTokenResponse> =
            createMobileToken(participantIdOrEmail, params, RequestOptions.none())

        /** @see createMobileToken */
        @MustBeClosed
        fun createMobileToken(
            participantIdOrEmail: String,
            params: ParticipantCreateMobileTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipantCreateMobileTokenResponse> =
            createMobileToken(
                params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
                requestOptions,
            )

        /** @see createMobileToken */
        @MustBeClosed
        fun createMobileToken(
            params: ParticipantCreateMobileTokenParams
        ): HttpResponseFor<ParticipantCreateMobileTokenResponse> =
            createMobileToken(params, RequestOptions.none())

        /** @see createMobileToken */
        @MustBeClosed
        fun createMobileToken(
            params: ParticipantCreateMobileTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipantCreateMobileTokenResponse>

        /**
         * Returns a raw HTTP response for `get
         * /campaign/{id}/participant/{participantIdOrEmail}/commissions`, but is otherwise the same
         * as [ParticipantService.listCommissions].
         */
        @MustBeClosed
        fun listCommissions(
            participantIdOrEmail: String,
            params: ParticipantListCommissionsParams,
        ): HttpResponseFor<ParticipantCommissionList> =
            listCommissions(participantIdOrEmail, params, RequestOptions.none())

        /** @see listCommissions */
        @MustBeClosed
        fun listCommissions(
            participantIdOrEmail: String,
            params: ParticipantListCommissionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipantCommissionList> =
            listCommissions(
                params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
                requestOptions,
            )

        /** @see listCommissions */
        @MustBeClosed
        fun listCommissions(
            params: ParticipantListCommissionsParams
        ): HttpResponseFor<ParticipantCommissionList> =
            listCommissions(params, RequestOptions.none())

        /** @see listCommissions */
        @MustBeClosed
        fun listCommissions(
            params: ParticipantListCommissionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipantCommissionList>

        /**
         * Returns a raw HTTP response for `get
         * /campaign/{id}/participant/{participantIdOrEmail}/payouts`, but is otherwise the same as
         * [ParticipantService.listPayouts].
         */
        @MustBeClosed
        fun listPayouts(
            participantIdOrEmail: String,
            params: ParticipantListPayoutsParams,
        ): HttpResponseFor<ParticipantPayoutList> =
            listPayouts(participantIdOrEmail, params, RequestOptions.none())

        /** @see listPayouts */
        @MustBeClosed
        fun listPayouts(
            participantIdOrEmail: String,
            params: ParticipantListPayoutsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipantPayoutList> =
            listPayouts(
                params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
                requestOptions,
            )

        /** @see listPayouts */
        @MustBeClosed
        fun listPayouts(
            params: ParticipantListPayoutsParams
        ): HttpResponseFor<ParticipantPayoutList> = listPayouts(params, RequestOptions.none())

        /** @see listPayouts */
        @MustBeClosed
        fun listPayouts(
            params: ParticipantListPayoutsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipantPayoutList>

        /**
         * Returns a raw HTTP response for `get
         * /campaign/{id}/participant/{participantIdOrEmail}/referrals`, but is otherwise the same
         * as [ParticipantService.listReferrals].
         */
        @MustBeClosed
        fun listReferrals(
            participantIdOrEmail: String,
            params: ParticipantListReferralsParams,
        ): HttpResponseFor<ReferralList> =
            listReferrals(participantIdOrEmail, params, RequestOptions.none())

        /** @see listReferrals */
        @MustBeClosed
        fun listReferrals(
            participantIdOrEmail: String,
            params: ParticipantListReferralsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReferralList> =
            listReferrals(
                params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
                requestOptions,
            )

        /** @see listReferrals */
        @MustBeClosed
        fun listReferrals(params: ParticipantListReferralsParams): HttpResponseFor<ReferralList> =
            listReferrals(params, RequestOptions.none())

        /** @see listReferrals */
        @MustBeClosed
        fun listReferrals(
            params: ParticipantListReferralsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReferralList>

        /**
         * Returns a raw HTTP response for `get
         * /campaign/{id}/participant/{participantIdOrEmail}/rewards`, but is otherwise the same as
         * [ParticipantService.listRewards].
         */
        @MustBeClosed
        fun listRewards(
            participantIdOrEmail: String,
            params: ParticipantListRewardsParams,
        ): HttpResponseFor<ParticipantListRewardsResponse> =
            listRewards(participantIdOrEmail, params, RequestOptions.none())

        /** @see listRewards */
        @MustBeClosed
        fun listRewards(
            participantIdOrEmail: String,
            params: ParticipantListRewardsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipantListRewardsResponse> =
            listRewards(
                params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
                requestOptions,
            )

        /** @see listRewards */
        @MustBeClosed
        fun listRewards(
            params: ParticipantListRewardsParams
        ): HttpResponseFor<ParticipantListRewardsResponse> =
            listRewards(params, RequestOptions.none())

        /** @see listRewards */
        @MustBeClosed
        fun listRewards(
            params: ParticipantListRewardsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipantListRewardsResponse>

        /**
         * Returns a raw HTTP response for `post
         * /campaign/{id}/participant/{participantIdOrEmail}/transaction`, but is otherwise the same
         * as [ParticipantService.recordTransaction].
         */
        @MustBeClosed
        fun recordTransaction(
            participantIdOrEmail: String,
            params: ParticipantRecordTransactionParams,
        ): HttpResponseFor<ParticipantRecordTransactionResponse> =
            recordTransaction(participantIdOrEmail, params, RequestOptions.none())

        /** @see recordTransaction */
        @MustBeClosed
        fun recordTransaction(
            participantIdOrEmail: String,
            params: ParticipantRecordTransactionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipantRecordTransactionResponse> =
            recordTransaction(
                params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
                requestOptions,
            )

        /** @see recordTransaction */
        @MustBeClosed
        fun recordTransaction(
            params: ParticipantRecordTransactionParams
        ): HttpResponseFor<ParticipantRecordTransactionResponse> =
            recordTransaction(params, RequestOptions.none())

        /** @see recordTransaction */
        @MustBeClosed
        fun recordTransaction(
            params: ParticipantRecordTransactionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipantRecordTransactionResponse>

        /**
         * Returns a raw HTTP response for `post
         * /campaign/{id}/participant/{participantIdOrEmail}/invites`, but is otherwise the same as
         * [ParticipantService.sendInvites].
         */
        @MustBeClosed
        fun sendInvites(
            participantIdOrEmail: String,
            params: ParticipantSendInvitesParams,
        ): HttpResponseFor<ParticipantSendInvitesResponse> =
            sendInvites(participantIdOrEmail, params, RequestOptions.none())

        /** @see sendInvites */
        @MustBeClosed
        fun sendInvites(
            participantIdOrEmail: String,
            params: ParticipantSendInvitesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipantSendInvitesResponse> =
            sendInvites(
                params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
                requestOptions,
            )

        /** @see sendInvites */
        @MustBeClosed
        fun sendInvites(
            params: ParticipantSendInvitesParams
        ): HttpResponseFor<ParticipantSendInvitesResponse> =
            sendInvites(params, RequestOptions.none())

        /** @see sendInvites */
        @MustBeClosed
        fun sendInvites(
            params: ParticipantSendInvitesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipantSendInvitesResponse>

        /**
         * Returns a raw HTTP response for `post
         * /campaign/{id}/participant/{participantIdOrEmail}/ref`, but is otherwise the same as
         * [ParticipantService.triggerReferral].
         */
        @MustBeClosed
        fun triggerReferral(
            participantIdOrEmail: String,
            params: ParticipantTriggerReferralParams,
        ): HttpResponseFor<ParticipantTriggerReferralResponse> =
            triggerReferral(participantIdOrEmail, params, RequestOptions.none())

        /** @see triggerReferral */
        @MustBeClosed
        fun triggerReferral(
            participantIdOrEmail: String,
            params: ParticipantTriggerReferralParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipantTriggerReferralResponse> =
            triggerReferral(
                params.toBuilder().participantIdOrEmail(participantIdOrEmail).build(),
                requestOptions,
            )

        /** @see triggerReferral */
        @MustBeClosed
        fun triggerReferral(
            params: ParticipantTriggerReferralParams
        ): HttpResponseFor<ParticipantTriggerReferralResponse> =
            triggerReferral(params, RequestOptions.none())

        /** @see triggerReferral */
        @MustBeClosed
        fun triggerReferral(
            params: ParticipantTriggerReferralParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipantTriggerReferralResponse>
    }
}
