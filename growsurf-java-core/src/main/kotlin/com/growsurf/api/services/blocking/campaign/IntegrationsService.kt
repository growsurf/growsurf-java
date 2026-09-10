// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking.campaign

import com.google.errorprone.annotations.MustBeClosed
import com.growsurf.api.core.ClientOptions
import com.growsurf.api.core.RequestOptions
import com.growsurf.api.core.http.HttpResponseFor
import com.growsurf.api.models.campaign.integrations.IntegrationListParams
import com.growsurf.api.models.campaign.integrations.IntegrationListResponse
import java.util.function.Consumer

/** Integration status operations (connecting an integration is done in the dashboard). */
interface IntegrationsService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IntegrationsService

    /**
     * Lists every integration this program can connect, each with its current state. Integrations
     * that do not apply to the program type are omitted (for example, Wise on a referral program).
     * Read-only: connecting an integration is an OAuth or credential handshake completed in the
     * GrowSurf dashboard, so it cannot be done over the API. `connected` means credentials are
     * stored, `enabled` means the integration is switched on and working, and `autoDisabled` means
     * GrowSurf switched it off after repeated delivery failures — its credentials are still stored,
     * but it delivers nothing until it is reconnected in the dashboard.
     */
    fun list(id: String): IntegrationListResponse = list(id, IntegrationListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: IntegrationListParams = IntegrationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegrationListResponse = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: IntegrationListParams = IntegrationListParams.none(),
    ): IntegrationListResponse = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: IntegrationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegrationListResponse

    /** @see list */
    fun list(params: IntegrationListParams): IntegrationListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): IntegrationListResponse =
        list(id, IntegrationListParams.none(), requestOptions)

    /**
     * A view of [IntegrationsService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IntegrationsService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/integrations`, but is otherwise the
         * same as [IntegrationsService.list].
         */
        @MustBeClosed
        fun list(id: String): HttpResponseFor<IntegrationListResponse> =
            list(id, IntegrationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: IntegrationListParams = IntegrationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegrationListResponse> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: IntegrationListParams = IntegrationListParams.none(),
        ): HttpResponseFor<IntegrationListResponse> = list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: IntegrationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegrationListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: IntegrationListParams): HttpResponseFor<IntegrationListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntegrationListResponse> =
            list(id, IntegrationListParams.none(), requestOptions)
    }
}
