// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking.campaign

import com.google.errorprone.annotations.MustBeClosed
import com.growsurf.api.core.ClientOptions
import com.growsurf.api.core.RequestOptions
import com.growsurf.api.core.http.HttpResponseFor
import com.growsurf.api.models.campaign.design.CampaignDesign
import com.growsurf.api.models.campaign.design.DesignRetrieveParams
import com.growsurf.api.models.campaign.design.DesignUpdateParams
import java.util.function.Consumer

/** Program Editor Design tab (`CampaignDesign`) configuration operations. */
interface DesignService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DesignService

    /**
     * Retrieves a program's design configuration — the same surface as the dashboard Program
     * Editor's **Design** tab: the GrowSurf window layout, header, share channels + invite, signup
     * form, portal/landing pages, theme styling, and the referral/affiliate summary + status
     * sections. This is a large object whose available fields depend on the program type; the
     * response includes every field and its current value, which is the same shape you send back on
     * `PATCH`.
     */
    fun retrieve(id: String): CampaignDesign = retrieve(id, DesignRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DesignRetrieveParams = DesignRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignDesign = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DesignRetrieveParams = DesignRetrieveParams.none(),
    ): CampaignDesign = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DesignRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignDesign

    /** @see retrieve */
    fun retrieve(params: DesignRetrieveParams): CampaignDesign =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CampaignDesign =
        retrieve(id, DesignRetrieveParams.none(), requestOptions)

    /**
     * Updates a program's design configuration. Only the fields you send are changed; anything you
     * leave out is untouched (arrays such as `signup.fields` replace wholesale). Unknown fields,
     * fields not available for the program type, and invalid values return a `400`. Landing-page
     * custom code and JavaScript are not editable via the API.
     */
    fun update(id: String, params: DesignUpdateParams): CampaignDesign =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: DesignUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignDesign = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(id: String): CampaignDesign = update(id, DesignUpdateParams.none())

    /** @see update */
    fun update(params: DesignUpdateParams): CampaignDesign = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DesignUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignDesign

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CampaignDesign =
        update(id, DesignUpdateParams.none(), requestOptions)

    /** A view of [DesignService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DesignService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/design`, but is otherwise the same as
         * [DesignService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<CampaignDesign> =
            retrieve(id, DesignRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DesignRetrieveParams = DesignRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignDesign> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DesignRetrieveParams = DesignRetrieveParams.none(),
        ): HttpResponseFor<CampaignDesign> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DesignRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignDesign>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: DesignRetrieveParams): HttpResponseFor<CampaignDesign> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<CampaignDesign> =
            retrieve(id, DesignRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /campaign/{id}/design`, but is otherwise the same
         * as [DesignService.update].
         */
        @MustBeClosed
        fun update(id: String, params: DesignUpdateParams): HttpResponseFor<CampaignDesign> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: DesignUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignDesign> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<CampaignDesign> =
            update(id, DesignUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(params: DesignUpdateParams): HttpResponseFor<CampaignDesign> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: DesignUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignDesign>

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<CampaignDesign> =
            update(id, DesignUpdateParams.none(), requestOptions)
    }
}
