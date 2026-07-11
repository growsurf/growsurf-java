// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.async.campaign

import com.growsurf.api.core.ClientOptions
import com.growsurf.api.core.RequestOptions
import com.growsurf.api.core.http.HttpResponseFor
import com.growsurf.api.models.campaign.reward.RewardApproveParams
import com.growsurf.api.models.campaign.reward.RewardApproveResponse
import com.growsurf.api.models.campaign.reward.RewardDeleteParams
import com.growsurf.api.models.campaign.reward.RewardDeleteResponse
import com.growsurf.api.models.campaign.reward.RewardFulfillParams
import com.growsurf.api.models.campaign.reward.RewardFulfillResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Participant reward retrieval and manual reward operations. */
interface RewardServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RewardServiceAsync

    /** Removes a manually approved participant reward that has not already been approved. */
    fun delete(
        rewardId: String,
        params: RewardDeleteParams,
    ): CompletableFuture<RewardDeleteResponse> = delete(rewardId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        rewardId: String,
        params: RewardDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RewardDeleteResponse> =
        delete(params.toBuilder().rewardId(rewardId).build(), requestOptions)

    /** @see delete */
    fun delete(params: RewardDeleteParams): CompletableFuture<RewardDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RewardDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RewardDeleteResponse>

    /**
     * Approves a manually approved reward earned by a participant. Requires `reward:write`. Passing
     * `fulfill=true` also requires `reward:fulfill`.
     */
    fun approve(
        rewardId: String,
        params: RewardApproveParams,
    ): CompletableFuture<RewardApproveResponse> = approve(rewardId, params, RequestOptions.none())

    /** @see approve */
    fun approve(
        rewardId: String,
        params: RewardApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RewardApproveResponse> =
        approve(params.toBuilder().rewardId(rewardId).build(), requestOptions)

    /** @see approve */
    fun approve(params: RewardApproveParams): CompletableFuture<RewardApproveResponse> =
        approve(params, RequestOptions.none())

    /** @see approve */
    fun approve(
        params: RewardApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RewardApproveResponse>

    /** Marks an approved participant reward as fulfilled. Requires `reward:fulfill`. */
    fun fulfill(
        rewardId: String,
        params: RewardFulfillParams,
    ): CompletableFuture<RewardFulfillResponse> = fulfill(rewardId, params, RequestOptions.none())

    /** @see fulfill */
    fun fulfill(
        rewardId: String,
        params: RewardFulfillParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RewardFulfillResponse> =
        fulfill(params.toBuilder().rewardId(rewardId).build(), requestOptions)

    /** @see fulfill */
    fun fulfill(params: RewardFulfillParams): CompletableFuture<RewardFulfillResponse> =
        fulfill(params, RequestOptions.none())

    /** @see fulfill */
    fun fulfill(
        params: RewardFulfillParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RewardFulfillResponse>

    /**
     * A view of [RewardServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RewardServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /campaign/{id}/reward/{rewardId}`, but is
         * otherwise the same as [RewardServiceAsync.delete].
         */
        fun delete(
            rewardId: String,
            params: RewardDeleteParams,
        ): CompletableFuture<HttpResponseFor<RewardDeleteResponse>> =
            delete(rewardId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            rewardId: String,
            params: RewardDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RewardDeleteResponse>> =
            delete(params.toBuilder().rewardId(rewardId).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: RewardDeleteParams
        ): CompletableFuture<HttpResponseFor<RewardDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: RewardDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RewardDeleteResponse>>

        /**
         * Returns a raw HTTP response for `post /campaign/{id}/reward/{rewardId}/approve`, but is
         * otherwise the same as [RewardServiceAsync.approve].
         */
        fun approve(
            rewardId: String,
            params: RewardApproveParams,
        ): CompletableFuture<HttpResponseFor<RewardApproveResponse>> =
            approve(rewardId, params, RequestOptions.none())

        /** @see approve */
        fun approve(
            rewardId: String,
            params: RewardApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RewardApproveResponse>> =
            approve(params.toBuilder().rewardId(rewardId).build(), requestOptions)

        /** @see approve */
        fun approve(
            params: RewardApproveParams
        ): CompletableFuture<HttpResponseFor<RewardApproveResponse>> =
            approve(params, RequestOptions.none())

        /** @see approve */
        fun approve(
            params: RewardApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RewardApproveResponse>>

        /**
         * Returns a raw HTTP response for `post /campaign/{id}/reward/{rewardId}/fulfill`, but is
         * otherwise the same as [RewardServiceAsync.fulfill].
         */
        fun fulfill(
            rewardId: String,
            params: RewardFulfillParams,
        ): CompletableFuture<HttpResponseFor<RewardFulfillResponse>> =
            fulfill(rewardId, params, RequestOptions.none())

        /** @see fulfill */
        fun fulfill(
            rewardId: String,
            params: RewardFulfillParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RewardFulfillResponse>> =
            fulfill(params.toBuilder().rewardId(rewardId).build(), requestOptions)

        /** @see fulfill */
        fun fulfill(
            params: RewardFulfillParams
        ): CompletableFuture<HttpResponseFor<RewardFulfillResponse>> =
            fulfill(params, RequestOptions.none())

        /** @see fulfill */
        fun fulfill(
            params: RewardFulfillParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RewardFulfillResponse>>
    }
}
