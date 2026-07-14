// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.async.campaign

import com.growsurf.api.core.ClientOptions
import com.growsurf.api.core.RequestOptions
import com.growsurf.api.core.http.HttpResponseFor
import com.growsurf.api.models.campaign.commission.CommissionApproveParams
import com.growsurf.api.models.campaign.commission.CommissionApproveResponse
import com.growsurf.api.models.campaign.commission.CommissionDeleteParams
import com.growsurf.api.models.campaign.commission.CommissionDeleteResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Affiliate transaction, commission, and payout operations. */
interface CommissionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommissionServiceAsync

    /** **Affiliate programs only.** Removes a pending participant commission. */
    fun delete(
        commissionId: String,
        params: CommissionDeleteParams,
    ): CompletableFuture<CommissionDeleteResponse> =
        delete(commissionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        commissionId: String,
        params: CommissionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommissionDeleteResponse> =
        delete(params.toBuilder().commissionId(commissionId).build(), requestOptions)

    /** @see delete */
    fun delete(params: CommissionDeleteParams): CompletableFuture<CommissionDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CommissionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommissionDeleteResponse>

    /**
     * **Affiliate programs only.** Approves a pending participant commission so it can become
     * eligible for payout.
     */
    fun approve(
        commissionId: String,
        params: CommissionApproveParams,
    ): CompletableFuture<CommissionApproveResponse> =
        approve(commissionId, params, RequestOptions.none())

    /** @see approve */
    fun approve(
        commissionId: String,
        params: CommissionApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommissionApproveResponse> =
        approve(params.toBuilder().commissionId(commissionId).build(), requestOptions)

    /** @see approve */
    fun approve(params: CommissionApproveParams): CompletableFuture<CommissionApproveResponse> =
        approve(params, RequestOptions.none())

    /** @see approve */
    fun approve(
        params: CommissionApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommissionApproveResponse>

    /**
     * A view of [CommissionServiceAsync] that provides access to raw HTTP responses for each
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
        ): CommissionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /campaign/{id}/commission/{commissionId}`, but is
         * otherwise the same as [CommissionServiceAsync.delete].
         */
        fun delete(
            commissionId: String,
            params: CommissionDeleteParams,
        ): CompletableFuture<HttpResponseFor<CommissionDeleteResponse>> =
            delete(commissionId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            commissionId: String,
            params: CommissionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommissionDeleteResponse>> =
            delete(params.toBuilder().commissionId(commissionId).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: CommissionDeleteParams
        ): CompletableFuture<HttpResponseFor<CommissionDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CommissionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommissionDeleteResponse>>

        /**
         * Returns a raw HTTP response for `post /campaign/{id}/commission/{commissionId}/approve`,
         * but is otherwise the same as [CommissionServiceAsync.approve].
         */
        fun approve(
            commissionId: String,
            params: CommissionApproveParams,
        ): CompletableFuture<HttpResponseFor<CommissionApproveResponse>> =
            approve(commissionId, params, RequestOptions.none())

        /** @see approve */
        fun approve(
            commissionId: String,
            params: CommissionApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommissionApproveResponse>> =
            approve(params.toBuilder().commissionId(commissionId).build(), requestOptions)

        /** @see approve */
        fun approve(
            params: CommissionApproveParams
        ): CompletableFuture<HttpResponseFor<CommissionApproveResponse>> =
            approve(params, RequestOptions.none())

        /** @see approve */
        fun approve(
            params: CommissionApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommissionApproveResponse>>
    }
}
