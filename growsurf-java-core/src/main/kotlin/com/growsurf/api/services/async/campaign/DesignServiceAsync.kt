// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.async.campaign

import com.google.errorprone.annotations.MustBeClosed
import com.growsurf.api.core.ClientOptions
import com.growsurf.api.core.RequestOptions
import com.growsurf.api.core.http.HttpResponseFor
import com.growsurf.api.models.campaign.design.CampaignDesign
import com.growsurf.api.models.campaign.design.DesignRetrieveParams
import com.growsurf.api.models.campaign.design.DesignUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Program Editor Design tab (`CampaignDesign`) configuration operations. */
interface DesignServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DesignServiceAsync

    /**
     * Retrieves a program's configured design fields: the dashboard Program Editor's **Design** tab
     * plus the payout-destination confirmation page copy configured from payout integration cards.
     * This includes the GrowSurf window layout, header, share channels and invites, signup form,
     * portal and landing pages, theme styling, and referral or affiliate summary and status
     * sections. The available fields depend on the program type. `payoutDestinationConfirmation` is
     * omitted when no confirmation fields are stored. Stored `null` fields are returned as `null`;
     * omitted and `null` fields use localized defaults.
     */
    fun retrieve(id: String): CompletableFuture<CampaignDesign> =
        retrieve(id, DesignRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DesignRetrieveParams = DesignRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignDesign> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DesignRetrieveParams = DesignRetrieveParams.none(),
    ): CompletableFuture<CampaignDesign> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DesignRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignDesign>

    /** @see retrieve */
    fun retrieve(params: DesignRetrieveParams): CompletableFuture<CampaignDesign> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<CampaignDesign> =
        retrieve(id, DesignRetrieveParams.none(), requestOptions)

    /**
     * Updates a program's design configuration, including the payout-destination confirmation page
     * copy configured from payout integration cards. Only the fields you send are changed; anything
     * you leave out is untouched (arrays such as `signup.fields` replace wholesale). Unknown
     * fields, fields not available for the program type, and invalid values return a `400`.
     * Landing-page custom code and JavaScript are not editable via the API.
     */
    fun update(id: String, params: DesignUpdateParams): CompletableFuture<CampaignDesign> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: DesignUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignDesign> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(id: String): CompletableFuture<CampaignDesign> =
        update(id, DesignUpdateParams.none())

    /** @see update */
    fun update(params: DesignUpdateParams): CompletableFuture<CampaignDesign> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DesignUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignDesign>

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<CampaignDesign> =
        update(id, DesignUpdateParams.none(), requestOptions)

    /**
     * A view of [DesignServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DesignServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/design`, but is otherwise the same as
         * [DesignServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<CampaignDesign>> =
            retrieve(id, DesignRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DesignRetrieveParams = DesignRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignDesign>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DesignRetrieveParams = DesignRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CampaignDesign>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DesignRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignDesign>>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DesignRetrieveParams
        ): CompletableFuture<HttpResponseFor<CampaignDesign>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignDesign>> =
            retrieve(id, DesignRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /campaign/{id}/design`, but is otherwise the same
         * as [DesignServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: DesignUpdateParams,
        ): CompletableFuture<HttpResponseFor<CampaignDesign>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: DesignUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignDesign>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(id: String): CompletableFuture<HttpResponseFor<CampaignDesign>> =
            update(id, DesignUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(params: DesignUpdateParams): CompletableFuture<HttpResponseFor<CampaignDesign>> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: DesignUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignDesign>>

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignDesign>> =
            update(id, DesignUpdateParams.none(), requestOptions)
    }
}
