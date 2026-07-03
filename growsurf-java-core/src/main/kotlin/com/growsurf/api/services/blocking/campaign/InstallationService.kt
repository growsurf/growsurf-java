// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking.campaign

import com.google.errorprone.annotations.MustBeClosed
import com.growsurf.api.core.ClientOptions
import com.growsurf.api.core.RequestOptions
import com.growsurf.api.core.http.HttpResponseFor
import com.growsurf.api.models.campaign.installation.CampaignInstallation
import com.growsurf.api.models.campaign.installation.InstallationRetrieveParams
import com.growsurf.api.models.campaign.installation.InstallationUpdateParams
import java.util.function.Consumer

/** Program Editor Installation tab (`CampaignInstallation`) configuration operations. */
interface InstallationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstallationService

    /** Retrieves a program's Installation configuration. */
    fun retrieve(id: String): CampaignInstallation = retrieve(id, InstallationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: InstallationRetrieveParams = InstallationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignInstallation = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: InstallationRetrieveParams = InstallationRetrieveParams.none(),
    ): CampaignInstallation = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InstallationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignInstallation

    /** @see retrieve */
    fun retrieve(params: InstallationRetrieveParams): CampaignInstallation =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CampaignInstallation =
        retrieve(id, InstallationRetrieveParams.none(), requestOptions)

    /**
     * Updates a program's Installation configuration. Only the fields you send are changed (a
     * surgical merge); omitted fields are left untouched.
     */
    fun update(id: String, params: InstallationUpdateParams): CampaignInstallation =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: InstallationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignInstallation = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(id: String): CampaignInstallation = update(id, InstallationUpdateParams.none())

    /** @see update */
    fun update(params: InstallationUpdateParams): CampaignInstallation =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: InstallationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignInstallation

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CampaignInstallation =
        update(id, InstallationUpdateParams.none(), requestOptions)

    /**
     * A view of [InstallationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InstallationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/installation`, but is otherwise the
         * same as [InstallationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<CampaignInstallation> =
            retrieve(id, InstallationRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: InstallationRetrieveParams = InstallationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignInstallation> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: InstallationRetrieveParams = InstallationRetrieveParams.none(),
        ): HttpResponseFor<CampaignInstallation> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: InstallationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignInstallation>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: InstallationRetrieveParams): HttpResponseFor<CampaignInstallation> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignInstallation> =
            retrieve(id, InstallationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /campaign/{id}/installation`, but is otherwise the
         * same as [InstallationService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: InstallationUpdateParams,
        ): HttpResponseFor<CampaignInstallation> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: InstallationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignInstallation> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<CampaignInstallation> =
            update(id, InstallationUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(params: InstallationUpdateParams): HttpResponseFor<CampaignInstallation> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: InstallationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignInstallation>

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignInstallation> =
            update(id, InstallationUpdateParams.none(), requestOptions)
    }
}
