// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking.campaign

import com.google.errorprone.annotations.MustBeClosed
import com.growsurf.api.core.ClientOptions
import com.growsurf.api.core.RequestOptions
import com.growsurf.api.core.http.HttpResponseFor
import com.growsurf.api.models.campaign.options.CampaignOptions
import com.growsurf.api.models.campaign.options.OptionRetrieveParams
import com.growsurf.api.models.campaign.options.OptionUpdateParams
import java.util.function.Consumer

/** Program Editor Options tab (`CampaignOptions`) configuration operations. */
interface OptionsService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OptionsService

    /** Retrieves a program's Options configuration. */
    fun retrieve(id: String): CampaignOptions = retrieve(id, OptionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: OptionRetrieveParams = OptionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignOptions = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: OptionRetrieveParams = OptionRetrieveParams.none(),
    ): CampaignOptions = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: OptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignOptions

    /** @see retrieve */
    fun retrieve(params: OptionRetrieveParams): CampaignOptions =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CampaignOptions =
        retrieve(id, OptionRetrieveParams.none(), requestOptions)

    /**
     * Updates a program's Options configuration. Only the fields you send are changed; anything you
     * leave out is untouched.
     */
    fun update(id: String, params: OptionUpdateParams): CampaignOptions =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: OptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignOptions = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(id: String): CampaignOptions = update(id, OptionUpdateParams.none())

    /** @see update */
    fun update(params: OptionUpdateParams): CampaignOptions = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: OptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignOptions

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CampaignOptions =
        update(id, OptionUpdateParams.none(), requestOptions)

    /** A view of [OptionsService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OptionsService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/options`, but is otherwise the same
         * as [OptionsService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<CampaignOptions> =
            retrieve(id, OptionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: OptionRetrieveParams = OptionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignOptions> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: OptionRetrieveParams = OptionRetrieveParams.none(),
        ): HttpResponseFor<CampaignOptions> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: OptionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignOptions>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: OptionRetrieveParams): HttpResponseFor<CampaignOptions> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<CampaignOptions> =
            retrieve(id, OptionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /campaign/{id}/options`, but is otherwise the same
         * as [OptionsService.update].
         */
        @MustBeClosed
        fun update(id: String, params: OptionUpdateParams): HttpResponseFor<CampaignOptions> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: OptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignOptions> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<CampaignOptions> =
            update(id, OptionUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(params: OptionUpdateParams): HttpResponseFor<CampaignOptions> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: OptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignOptions>

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<CampaignOptions> =
            update(id, OptionUpdateParams.none(), requestOptions)
    }
}
