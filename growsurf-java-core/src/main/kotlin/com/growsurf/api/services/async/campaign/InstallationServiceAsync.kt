// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.async.campaign

import com.google.errorprone.annotations.MustBeClosed
import com.growsurf.api.core.ClientOptions
import com.growsurf.api.core.RequestOptions
import com.growsurf.api.core.http.HttpResponseFor
import com.growsurf.api.models.campaign.installation.CampaignInstallation
import com.growsurf.api.models.campaign.installation.InstallationRetrieveParams
import com.growsurf.api.models.campaign.installation.InstallationUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Program Editor Installation tab (`CampaignInstallation`) configuration operations. */
interface InstallationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstallationServiceAsync

    /** Retrieves a program's Installation configuration. */
    fun retrieve(id: String): CompletableFuture<CampaignInstallation> =
        retrieve(id, InstallationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: InstallationRetrieveParams = InstallationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignInstallation> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: InstallationRetrieveParams = InstallationRetrieveParams.none(),
    ): CompletableFuture<CampaignInstallation> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InstallationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignInstallation>

    /** @see retrieve */
    fun retrieve(params: InstallationRetrieveParams): CompletableFuture<CampaignInstallation> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignInstallation> =
        retrieve(id, InstallationRetrieveParams.none(), requestOptions)

    /**
     * Updates a program's Installation configuration. Only the fields you send are changed (a
     * surgical merge); omitted fields are left untouched.
     */
    fun update(
        id: String,
        params: InstallationUpdateParams,
    ): CompletableFuture<CampaignInstallation> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: InstallationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignInstallation> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(id: String): CompletableFuture<CampaignInstallation> =
        update(id, InstallationUpdateParams.none())

    /** @see update */
    fun update(params: InstallationUpdateParams): CompletableFuture<CampaignInstallation> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: InstallationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignInstallation>

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignInstallation> =
        update(id, InstallationUpdateParams.none(), requestOptions)

    /**
     * A view of [InstallationServiceAsync] that provides access to raw HTTP responses for each
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
        ): InstallationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/installation`, but is otherwise the
         * same as [InstallationServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<CampaignInstallation>> =
            retrieve(id, InstallationRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: InstallationRetrieveParams = InstallationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignInstallation>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: InstallationRetrieveParams = InstallationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CampaignInstallation>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: InstallationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignInstallation>>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: InstallationRetrieveParams
        ): CompletableFuture<HttpResponseFor<CampaignInstallation>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignInstallation>> =
            retrieve(id, InstallationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /campaign/{id}/installation`, but is otherwise the
         * same as [InstallationServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: InstallationUpdateParams,
        ): CompletableFuture<HttpResponseFor<CampaignInstallation>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: InstallationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignInstallation>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(id: String): CompletableFuture<HttpResponseFor<CampaignInstallation>> =
            update(id, InstallationUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: InstallationUpdateParams
        ): CompletableFuture<HttpResponseFor<CampaignInstallation>> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: InstallationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignInstallation>>

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignInstallation>> =
            update(id, InstallationUpdateParams.none(), requestOptions)
    }
}
