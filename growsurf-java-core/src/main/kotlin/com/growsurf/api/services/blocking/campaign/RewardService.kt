// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking.campaign

import com.google.errorprone.annotations.MustBeClosed
import com.growsurf.api.core.ClientOptions
import com.growsurf.api.core.RequestOptions
import com.growsurf.api.core.http.HttpResponseFor
import com.growsurf.api.models.campaign.reward.RewardApproveParams
import com.growsurf.api.models.campaign.reward.RewardApproveResponse
import com.growsurf.api.models.campaign.reward.RewardDeleteParams
import com.growsurf.api.models.campaign.reward.RewardDeleteResponse
import com.growsurf.api.models.campaign.reward.RewardFulfillParams
import com.growsurf.api.models.campaign.reward.RewardFulfillResponse
import java.util.function.Consumer

/** Participant reward retrieval and manual reward operations. */
interface RewardService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RewardService

    /** Removes a manually approved participant reward that has not already been approved. */
    fun delete(rewardId: String, params: RewardDeleteParams): RewardDeleteResponse =
        delete(rewardId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        rewardId: String,
        params: RewardDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RewardDeleteResponse = delete(params.toBuilder().rewardId(rewardId).build(), requestOptions)

    /** @see delete */
    fun delete(params: RewardDeleteParams): RewardDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RewardDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RewardDeleteResponse

    /** Approves a manually approved reward earned by a participant. */
    fun approve(rewardId: String, params: RewardApproveParams): RewardApproveResponse =
        approve(rewardId, params, RequestOptions.none())

    /** @see approve */
    fun approve(
        rewardId: String,
        params: RewardApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RewardApproveResponse =
        approve(params.toBuilder().rewardId(rewardId).build(), requestOptions)

    /** @see approve */
    fun approve(params: RewardApproveParams): RewardApproveResponse =
        approve(params, RequestOptions.none())

    /** @see approve */
    fun approve(
        params: RewardApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RewardApproveResponse

    /** Marks an approved participant reward as fulfilled. */
    fun fulfill(rewardId: String, params: RewardFulfillParams): RewardFulfillResponse =
        fulfill(rewardId, params, RequestOptions.none())

    /** @see fulfill */
    fun fulfill(
        rewardId: String,
        params: RewardFulfillParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RewardFulfillResponse =
        fulfill(params.toBuilder().rewardId(rewardId).build(), requestOptions)

    /** @see fulfill */
    fun fulfill(params: RewardFulfillParams): RewardFulfillResponse =
        fulfill(params, RequestOptions.none())

    /** @see fulfill */
    fun fulfill(
        params: RewardFulfillParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RewardFulfillResponse

    /** A view of [RewardService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RewardService.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /campaign/{id}/reward/{rewardId}`, but is
         * otherwise the same as [RewardService.delete].
         */
        @MustBeClosed
        fun delete(
            rewardId: String,
            params: RewardDeleteParams,
        ): HttpResponseFor<RewardDeleteResponse> = delete(rewardId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            rewardId: String,
            params: RewardDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RewardDeleteResponse> =
            delete(params.toBuilder().rewardId(rewardId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: RewardDeleteParams): HttpResponseFor<RewardDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: RewardDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RewardDeleteResponse>

        /**
         * Returns a raw HTTP response for `post /campaign/{id}/reward/{rewardId}/approve`, but is
         * otherwise the same as [RewardService.approve].
         */
        @MustBeClosed
        fun approve(
            rewardId: String,
            params: RewardApproveParams,
        ): HttpResponseFor<RewardApproveResponse> = approve(rewardId, params, RequestOptions.none())

        /** @see approve */
        @MustBeClosed
        fun approve(
            rewardId: String,
            params: RewardApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RewardApproveResponse> =
            approve(params.toBuilder().rewardId(rewardId).build(), requestOptions)

        /** @see approve */
        @MustBeClosed
        fun approve(params: RewardApproveParams): HttpResponseFor<RewardApproveResponse> =
            approve(params, RequestOptions.none())

        /** @see approve */
        @MustBeClosed
        fun approve(
            params: RewardApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RewardApproveResponse>

        /**
         * Returns a raw HTTP response for `post /campaign/{id}/reward/{rewardId}/fulfill`, but is
         * otherwise the same as [RewardService.fulfill].
         */
        @MustBeClosed
        fun fulfill(
            rewardId: String,
            params: RewardFulfillParams,
        ): HttpResponseFor<RewardFulfillResponse> = fulfill(rewardId, params, RequestOptions.none())

        /** @see fulfill */
        @MustBeClosed
        fun fulfill(
            rewardId: String,
            params: RewardFulfillParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RewardFulfillResponse> =
            fulfill(params.toBuilder().rewardId(rewardId).build(), requestOptions)

        /** @see fulfill */
        @MustBeClosed
        fun fulfill(params: RewardFulfillParams): HttpResponseFor<RewardFulfillResponse> =
            fulfill(params, RequestOptions.none())

        /** @see fulfill */
        @MustBeClosed
        fun fulfill(
            params: RewardFulfillParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RewardFulfillResponse>
    }
}
