// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.async

import com.growsurf.api.core.ClientOptions
import com.growsurf.api.core.RequestOptions
import com.growsurf.api.core.http.HttpResponseFor
import com.growsurf.api.models.campaign.Campaign
import com.growsurf.api.models.campaign.CampaignListCommissionsParams
import com.growsurf.api.models.campaign.CampaignListLeaderboardParams
import com.growsurf.api.models.campaign.CampaignListParams
import com.growsurf.api.models.campaign.CampaignListParticipantsParams
import com.growsurf.api.models.campaign.CampaignListPayoutsParams
import com.growsurf.api.models.campaign.CampaignListReferralsParams
import com.growsurf.api.models.campaign.CampaignListResponse
import com.growsurf.api.models.campaign.CampaignRetrieveAnalyticsParams
import com.growsurf.api.models.campaign.CampaignRetrieveAnalyticsResponse
import com.growsurf.api.models.campaign.CampaignRetrieveParams
import com.growsurf.api.models.campaign.ParticipantCommissionList
import com.growsurf.api.models.campaign.ParticipantList
import com.growsurf.api.models.campaign.ParticipantPayoutList
import com.growsurf.api.models.campaign.ReferralList
import com.growsurf.api.services.async.campaign.CommissionServiceAsync
import com.growsurf.api.services.async.campaign.ParticipantServiceAsync
import com.growsurf.api.services.async.campaign.RewardServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CampaignServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CampaignServiceAsync

    fun participant(): ParticipantServiceAsync

    /** Participant reward retrieval and manual reward operations. */
    fun reward(): RewardServiceAsync

    /** Affiliate transaction, commission, and payout operations. */
    fun commission(): CommissionServiceAsync

    /** Retrieves a program for the given program ID. */
    fun retrieve(id: String): CompletableFuture<Campaign> =
        retrieve(id, CampaignRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CampaignRetrieveParams = CampaignRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Campaign> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CampaignRetrieveParams = CampaignRetrieveParams.none(),
    ): CompletableFuture<Campaign> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CampaignRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Campaign>

    /** @see retrieve */
    fun retrieve(params: CampaignRetrieveParams): CompletableFuture<Campaign> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Campaign> =
        retrieve(id, CampaignRetrieveParams.none(), requestOptions)

    /** Retrieves a list of your programs. Deleted programs are not returned. */
    fun list(): CompletableFuture<CampaignListResponse> = list(CampaignListParams.none())

    /** @see list */
    fun list(
        params: CampaignListParams = CampaignListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignListResponse>

    /** @see list */
    fun list(
        params: CampaignListParams = CampaignListParams.none()
    ): CompletableFuture<CampaignListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CampaignListResponse> =
        list(CampaignListParams.none(), requestOptions)

    /** Retrieves a paged list of all participant commissions in an affiliate program. */
    fun listCommissions(id: String): CompletableFuture<ParticipantCommissionList> =
        listCommissions(id, CampaignListCommissionsParams.none())

    /** @see listCommissions */
    fun listCommissions(
        id: String,
        params: CampaignListCommissionsParams = CampaignListCommissionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantCommissionList> =
        listCommissions(params.toBuilder().id(id).build(), requestOptions)

    /** @see listCommissions */
    fun listCommissions(
        id: String,
        params: CampaignListCommissionsParams = CampaignListCommissionsParams.none(),
    ): CompletableFuture<ParticipantCommissionList> =
        listCommissions(id, params, RequestOptions.none())

    /** @see listCommissions */
    fun listCommissions(
        params: CampaignListCommissionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantCommissionList>

    /** @see listCommissions */
    fun listCommissions(
        params: CampaignListCommissionsParams
    ): CompletableFuture<ParticipantCommissionList> = listCommissions(params, RequestOptions.none())

    /** @see listCommissions */
    fun listCommissions(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ParticipantCommissionList> =
        listCommissions(id, CampaignListCommissionsParams.none(), requestOptions)

    /** Retrieves participants in leaderboard order for the specified leaderboard type. */
    fun listLeaderboard(id: String): CompletableFuture<ParticipantList> =
        listLeaderboard(id, CampaignListLeaderboardParams.none())

    /** @see listLeaderboard */
    fun listLeaderboard(
        id: String,
        params: CampaignListLeaderboardParams = CampaignListLeaderboardParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantList> =
        listLeaderboard(params.toBuilder().id(id).build(), requestOptions)

    /** @see listLeaderboard */
    fun listLeaderboard(
        id: String,
        params: CampaignListLeaderboardParams = CampaignListLeaderboardParams.none(),
    ): CompletableFuture<ParticipantList> = listLeaderboard(id, params, RequestOptions.none())

    /** @see listLeaderboard */
    fun listLeaderboard(
        params: CampaignListLeaderboardParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantList>

    /** @see listLeaderboard */
    fun listLeaderboard(params: CampaignListLeaderboardParams): CompletableFuture<ParticipantList> =
        listLeaderboard(params, RequestOptions.none())

    /** @see listLeaderboard */
    fun listLeaderboard(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ParticipantList> =
        listLeaderboard(id, CampaignListLeaderboardParams.none(), requestOptions)

    /** Retrieves a paged list of participants in a program. */
    fun listParticipants(id: String): CompletableFuture<ParticipantList> =
        listParticipants(id, CampaignListParticipantsParams.none())

    /** @see listParticipants */
    fun listParticipants(
        id: String,
        params: CampaignListParticipantsParams = CampaignListParticipantsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantList> =
        listParticipants(params.toBuilder().id(id).build(), requestOptions)

    /** @see listParticipants */
    fun listParticipants(
        id: String,
        params: CampaignListParticipantsParams = CampaignListParticipantsParams.none(),
    ): CompletableFuture<ParticipantList> = listParticipants(id, params, RequestOptions.none())

    /** @see listParticipants */
    fun listParticipants(
        params: CampaignListParticipantsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantList>

    /** @see listParticipants */
    fun listParticipants(
        params: CampaignListParticipantsParams
    ): CompletableFuture<ParticipantList> = listParticipants(params, RequestOptions.none())

    /** @see listParticipants */
    fun listParticipants(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ParticipantList> =
        listParticipants(id, CampaignListParticipantsParams.none(), requestOptions)

    /** Retrieves a paged list of all participant payouts in an affiliate program. */
    fun listPayouts(id: String): CompletableFuture<ParticipantPayoutList> =
        listPayouts(id, CampaignListPayoutsParams.none())

    /** @see listPayouts */
    fun listPayouts(
        id: String,
        params: CampaignListPayoutsParams = CampaignListPayoutsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantPayoutList> =
        listPayouts(params.toBuilder().id(id).build(), requestOptions)

    /** @see listPayouts */
    fun listPayouts(
        id: String,
        params: CampaignListPayoutsParams = CampaignListPayoutsParams.none(),
    ): CompletableFuture<ParticipantPayoutList> = listPayouts(id, params, RequestOptions.none())

    /** @see listPayouts */
    fun listPayouts(
        params: CampaignListPayoutsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantPayoutList>

    /** @see listPayouts */
    fun listPayouts(params: CampaignListPayoutsParams): CompletableFuture<ParticipantPayoutList> =
        listPayouts(params, RequestOptions.none())

    /** @see listPayouts */
    fun listPayouts(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ParticipantPayoutList> =
        listPayouts(id, CampaignListPayoutsParams.none(), requestOptions)

    /** Retrieves a list of all referrals and email invites made by participants in a program. */
    fun listReferrals(id: String): CompletableFuture<ReferralList> =
        listReferrals(id, CampaignListReferralsParams.none())

    /** @see listReferrals */
    fun listReferrals(
        id: String,
        params: CampaignListReferralsParams = CampaignListReferralsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReferralList> =
        listReferrals(params.toBuilder().id(id).build(), requestOptions)

    /** @see listReferrals */
    fun listReferrals(
        id: String,
        params: CampaignListReferralsParams = CampaignListReferralsParams.none(),
    ): CompletableFuture<ReferralList> = listReferrals(id, params, RequestOptions.none())

    /** @see listReferrals */
    fun listReferrals(
        params: CampaignListReferralsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReferralList>

    /** @see listReferrals */
    fun listReferrals(params: CampaignListReferralsParams): CompletableFuture<ReferralList> =
        listReferrals(params, RequestOptions.none())

    /** @see listReferrals */
    fun listReferrals(id: String, requestOptions: RequestOptions): CompletableFuture<ReferralList> =
        listReferrals(id, CampaignListReferralsParams.none(), requestOptions)

    /** Retrieves analytics for a program. */
    fun retrieveAnalytics(id: String): CompletableFuture<CampaignRetrieveAnalyticsResponse> =
        retrieveAnalytics(id, CampaignRetrieveAnalyticsParams.none())

    /** @see retrieveAnalytics */
    fun retrieveAnalytics(
        id: String,
        params: CampaignRetrieveAnalyticsParams = CampaignRetrieveAnalyticsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignRetrieveAnalyticsResponse> =
        retrieveAnalytics(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveAnalytics */
    fun retrieveAnalytics(
        id: String,
        params: CampaignRetrieveAnalyticsParams = CampaignRetrieveAnalyticsParams.none(),
    ): CompletableFuture<CampaignRetrieveAnalyticsResponse> =
        retrieveAnalytics(id, params, RequestOptions.none())

    /** @see retrieveAnalytics */
    fun retrieveAnalytics(
        params: CampaignRetrieveAnalyticsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignRetrieveAnalyticsResponse>

    /** @see retrieveAnalytics */
    fun retrieveAnalytics(
        params: CampaignRetrieveAnalyticsParams
    ): CompletableFuture<CampaignRetrieveAnalyticsResponse> =
        retrieveAnalytics(params, RequestOptions.none())

    /** @see retrieveAnalytics */
    fun retrieveAnalytics(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignRetrieveAnalyticsResponse> =
        retrieveAnalytics(id, CampaignRetrieveAnalyticsParams.none(), requestOptions)

    /**
     * A view of [CampaignServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CampaignServiceAsync.WithRawResponse

        fun participant(): ParticipantServiceAsync.WithRawResponse

        /** Participant reward retrieval and manual reward operations. */
        fun reward(): RewardServiceAsync.WithRawResponse

        /** Affiliate transaction, commission, and payout operations. */
        fun commission(): CommissionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /campaign/{id}`, but is otherwise the same as
         * [CampaignServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<Campaign>> =
            retrieve(id, CampaignRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CampaignRetrieveParams = CampaignRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Campaign>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CampaignRetrieveParams = CampaignRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Campaign>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CampaignRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Campaign>>

        /** @see retrieve */
        fun retrieve(params: CampaignRetrieveParams): CompletableFuture<HttpResponseFor<Campaign>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Campaign>> =
            retrieve(id, CampaignRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /campaigns`, but is otherwise the same as
         * [CampaignServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CampaignListResponse>> =
            list(CampaignListParams.none())

        /** @see list */
        fun list(
            params: CampaignListParams = CampaignListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignListResponse>>

        /** @see list */
        fun list(
            params: CampaignListParams = CampaignListParams.none()
        ): CompletableFuture<HttpResponseFor<CampaignListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CampaignListResponse>> =
            list(CampaignListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/commissions`, but is otherwise the
         * same as [CampaignServiceAsync.listCommissions].
         */
        fun listCommissions(
            id: String
        ): CompletableFuture<HttpResponseFor<ParticipantCommissionList>> =
            listCommissions(id, CampaignListCommissionsParams.none())

        /** @see listCommissions */
        fun listCommissions(
            id: String,
            params: CampaignListCommissionsParams = CampaignListCommissionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantCommissionList>> =
            listCommissions(params.toBuilder().id(id).build(), requestOptions)

        /** @see listCommissions */
        fun listCommissions(
            id: String,
            params: CampaignListCommissionsParams = CampaignListCommissionsParams.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantCommissionList>> =
            listCommissions(id, params, RequestOptions.none())

        /** @see listCommissions */
        fun listCommissions(
            params: CampaignListCommissionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantCommissionList>>

        /** @see listCommissions */
        fun listCommissions(
            params: CampaignListCommissionsParams
        ): CompletableFuture<HttpResponseFor<ParticipantCommissionList>> =
            listCommissions(params, RequestOptions.none())

        /** @see listCommissions */
        fun listCommissions(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ParticipantCommissionList>> =
            listCommissions(id, CampaignListCommissionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/leaderboard`, but is otherwise the
         * same as [CampaignServiceAsync.listLeaderboard].
         */
        fun listLeaderboard(id: String): CompletableFuture<HttpResponseFor<ParticipantList>> =
            listLeaderboard(id, CampaignListLeaderboardParams.none())

        /** @see listLeaderboard */
        fun listLeaderboard(
            id: String,
            params: CampaignListLeaderboardParams = CampaignListLeaderboardParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantList>> =
            listLeaderboard(params.toBuilder().id(id).build(), requestOptions)

        /** @see listLeaderboard */
        fun listLeaderboard(
            id: String,
            params: CampaignListLeaderboardParams = CampaignListLeaderboardParams.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantList>> =
            listLeaderboard(id, params, RequestOptions.none())

        /** @see listLeaderboard */
        fun listLeaderboard(
            params: CampaignListLeaderboardParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantList>>

        /** @see listLeaderboard */
        fun listLeaderboard(
            params: CampaignListLeaderboardParams
        ): CompletableFuture<HttpResponseFor<ParticipantList>> =
            listLeaderboard(params, RequestOptions.none())

        /** @see listLeaderboard */
        fun listLeaderboard(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ParticipantList>> =
            listLeaderboard(id, CampaignListLeaderboardParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/participants`, but is otherwise the
         * same as [CampaignServiceAsync.listParticipants].
         */
        fun listParticipants(id: String): CompletableFuture<HttpResponseFor<ParticipantList>> =
            listParticipants(id, CampaignListParticipantsParams.none())

        /** @see listParticipants */
        fun listParticipants(
            id: String,
            params: CampaignListParticipantsParams = CampaignListParticipantsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantList>> =
            listParticipants(params.toBuilder().id(id).build(), requestOptions)

        /** @see listParticipants */
        fun listParticipants(
            id: String,
            params: CampaignListParticipantsParams = CampaignListParticipantsParams.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantList>> =
            listParticipants(id, params, RequestOptions.none())

        /** @see listParticipants */
        fun listParticipants(
            params: CampaignListParticipantsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantList>>

        /** @see listParticipants */
        fun listParticipants(
            params: CampaignListParticipantsParams
        ): CompletableFuture<HttpResponseFor<ParticipantList>> =
            listParticipants(params, RequestOptions.none())

        /** @see listParticipants */
        fun listParticipants(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ParticipantList>> =
            listParticipants(id, CampaignListParticipantsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/payouts`, but is otherwise the same
         * as [CampaignServiceAsync.listPayouts].
         */
        fun listPayouts(id: String): CompletableFuture<HttpResponseFor<ParticipantPayoutList>> =
            listPayouts(id, CampaignListPayoutsParams.none())

        /** @see listPayouts */
        fun listPayouts(
            id: String,
            params: CampaignListPayoutsParams = CampaignListPayoutsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantPayoutList>> =
            listPayouts(params.toBuilder().id(id).build(), requestOptions)

        /** @see listPayouts */
        fun listPayouts(
            id: String,
            params: CampaignListPayoutsParams = CampaignListPayoutsParams.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantPayoutList>> =
            listPayouts(id, params, RequestOptions.none())

        /** @see listPayouts */
        fun listPayouts(
            params: CampaignListPayoutsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantPayoutList>>

        /** @see listPayouts */
        fun listPayouts(
            params: CampaignListPayoutsParams
        ): CompletableFuture<HttpResponseFor<ParticipantPayoutList>> =
            listPayouts(params, RequestOptions.none())

        /** @see listPayouts */
        fun listPayouts(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ParticipantPayoutList>> =
            listPayouts(id, CampaignListPayoutsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/referrals`, but is otherwise the same
         * as [CampaignServiceAsync.listReferrals].
         */
        fun listReferrals(id: String): CompletableFuture<HttpResponseFor<ReferralList>> =
            listReferrals(id, CampaignListReferralsParams.none())

        /** @see listReferrals */
        fun listReferrals(
            id: String,
            params: CampaignListReferralsParams = CampaignListReferralsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReferralList>> =
            listReferrals(params.toBuilder().id(id).build(), requestOptions)

        /** @see listReferrals */
        fun listReferrals(
            id: String,
            params: CampaignListReferralsParams = CampaignListReferralsParams.none(),
        ): CompletableFuture<HttpResponseFor<ReferralList>> =
            listReferrals(id, params, RequestOptions.none())

        /** @see listReferrals */
        fun listReferrals(
            params: CampaignListReferralsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReferralList>>

        /** @see listReferrals */
        fun listReferrals(
            params: CampaignListReferralsParams
        ): CompletableFuture<HttpResponseFor<ReferralList>> =
            listReferrals(params, RequestOptions.none())

        /** @see listReferrals */
        fun listReferrals(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReferralList>> =
            listReferrals(id, CampaignListReferralsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/analytics`, but is otherwise the same
         * as [CampaignServiceAsync.retrieveAnalytics].
         */
        fun retrieveAnalytics(
            id: String
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveAnalyticsResponse>> =
            retrieveAnalytics(id, CampaignRetrieveAnalyticsParams.none())

        /** @see retrieveAnalytics */
        fun retrieveAnalytics(
            id: String,
            params: CampaignRetrieveAnalyticsParams = CampaignRetrieveAnalyticsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveAnalyticsResponse>> =
            retrieveAnalytics(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveAnalytics */
        fun retrieveAnalytics(
            id: String,
            params: CampaignRetrieveAnalyticsParams = CampaignRetrieveAnalyticsParams.none(),
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveAnalyticsResponse>> =
            retrieveAnalytics(id, params, RequestOptions.none())

        /** @see retrieveAnalytics */
        fun retrieveAnalytics(
            params: CampaignRetrieveAnalyticsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveAnalyticsResponse>>

        /** @see retrieveAnalytics */
        fun retrieveAnalytics(
            params: CampaignRetrieveAnalyticsParams
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveAnalyticsResponse>> =
            retrieveAnalytics(params, RequestOptions.none())

        /** @see retrieveAnalytics */
        fun retrieveAnalytics(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveAnalyticsResponse>> =
            retrieveAnalytics(id, CampaignRetrieveAnalyticsParams.none(), requestOptions)
    }
}
