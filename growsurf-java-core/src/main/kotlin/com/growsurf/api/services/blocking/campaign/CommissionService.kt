// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking.campaign

import com.google.errorprone.annotations.MustBeClosed
import com.growsurf.api.core.ClientOptions
import com.growsurf.api.core.RequestOptions
import com.growsurf.api.core.http.HttpResponseFor
import com.growsurf.api.models.campaign.commission.CommissionApproveParams
import com.growsurf.api.models.campaign.commission.CommissionApproveResponse
import com.growsurf.api.models.campaign.commission.CommissionDeleteParams
import com.growsurf.api.models.campaign.commission.CommissionDeleteResponse
import java.util.function.Consumer

/** Affiliate transaction, commission, and payout operations. */
interface CommissionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommissionService

    /** Removes a pending participant commission. */
    fun delete(commissionId: String, params: CommissionDeleteParams): CommissionDeleteResponse =
        delete(commissionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        commissionId: String,
        params: CommissionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommissionDeleteResponse =
        delete(params.toBuilder().commissionId(commissionId).build(), requestOptions)

    /** @see delete */
    fun delete(params: CommissionDeleteParams): CommissionDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CommissionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommissionDeleteResponse

    /** Approves a pending participant commission so it can become eligible for payout. */
    fun approve(commissionId: String, params: CommissionApproveParams): CommissionApproveResponse =
        approve(commissionId, params, RequestOptions.none())

    /** @see approve */
    fun approve(
        commissionId: String,
        params: CommissionApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommissionApproveResponse =
        approve(params.toBuilder().commissionId(commissionId).build(), requestOptions)

    /** @see approve */
    fun approve(params: CommissionApproveParams): CommissionApproveResponse =
        approve(params, RequestOptions.none())

    /** @see approve */
    fun approve(
        params: CommissionApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommissionApproveResponse

    /** A view of [CommissionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CommissionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /campaign/{id}/commission/{commissionId}`, but is
         * otherwise the same as [CommissionService.delete].
         */
        @MustBeClosed
        fun delete(
            commissionId: String,
            params: CommissionDeleteParams,
        ): HttpResponseFor<CommissionDeleteResponse> =
            delete(commissionId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            commissionId: String,
            params: CommissionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommissionDeleteResponse> =
            delete(params.toBuilder().commissionId(commissionId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: CommissionDeleteParams): HttpResponseFor<CommissionDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CommissionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommissionDeleteResponse>

        /**
         * Returns a raw HTTP response for `post /campaign/{id}/commission/{commissionId}/approve`,
         * but is otherwise the same as [CommissionService.approve].
         */
        @MustBeClosed
        fun approve(
            commissionId: String,
            params: CommissionApproveParams,
        ): HttpResponseFor<CommissionApproveResponse> =
            approve(commissionId, params, RequestOptions.none())

        /** @see approve */
        @MustBeClosed
        fun approve(
            commissionId: String,
            params: CommissionApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommissionApproveResponse> =
            approve(params.toBuilder().commissionId(commissionId).build(), requestOptions)

        /** @see approve */
        @MustBeClosed
        fun approve(params: CommissionApproveParams): HttpResponseFor<CommissionApproveResponse> =
            approve(params, RequestOptions.none())

        /** @see approve */
        @MustBeClosed
        fun approve(
            params: CommissionApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommissionApproveResponse>
    }
}
