// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking.campaign

import com.google.errorprone.annotations.MustBeClosed
import com.growsurf.api.core.ClientOptions
import com.growsurf.api.core.RequestOptions
import com.growsurf.api.core.http.HttpResponseFor
import com.growsurf.api.models.campaign.customdomain.CampaignCustomDomain
import com.growsurf.api.models.campaign.customdomain.CustomDomainDeleteParams
import com.growsurf.api.models.campaign.customdomain.CustomDomainRetrieveParams
import com.growsurf.api.models.campaign.customdomain.CustomDomainSetParams
import com.growsurf.api.models.campaign.customdomain.CustomDomainVerifyParams
import com.growsurf.api.models.campaign.customdomain.DeleteCampaignCustomDomainResponse
import java.util.function.Consumer

/** Program custom domain (`CampaignCustomDomain`) operations. */
interface CustomDomainService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomDomainService

    /**
     * Retrieves the custom domain that serves a program's landing pages, and whether its DNS is
     * verified. When no custom domain is set, `domain` is `null`. This call does not check DNS; use
     * [verify] for a live check.
     */
    fun retrieve(id: String): CampaignCustomDomain = retrieve(id, CustomDomainRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CustomDomainRetrieveParams = CustomDomainRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignCustomDomain = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CustomDomainRetrieveParams = CustomDomainRetrieveParams.none(),
    ): CampaignCustomDomain = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CustomDomainRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignCustomDomain

    /** @see retrieve */
    fun retrieve(params: CustomDomainRetrieveParams): CampaignCustomDomain =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CampaignCustomDomain =
        retrieve(id, CustomDomainRetrieveParams.none(), requestOptions)

    /**
     * Sets the custom domain for a program's landing pages, or replaces the current one. Send a
     * hostname such as `refer.piedpiper.com`; `https://` is added if you leave it out. Paths,
     * ports, queries and `http://` return a `400`.
     *
     * Replacing a domain removes the old one right away, and its pages stop loading there. Sending
     * the current domain again changes nothing. A domain used by another program returns a `409`.
     *
     * A new domain starts unverified. Point a `CNAME` record from the hostname to the
     * `dnsRecord.value` in the response, then call [verify].
     */
    fun set(id: String, params: CustomDomainSetParams): CampaignCustomDomain =
        set(id, params, RequestOptions.none())

    /** @see set */
    fun set(
        id: String,
        params: CustomDomainSetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignCustomDomain = set(params.toBuilder().id(id).build(), requestOptions)

    /** @see set */
    fun set(params: CustomDomainSetParams): CampaignCustomDomain =
        set(params, RequestOptions.none())

    /** @see set */
    fun set(
        params: CustomDomainSetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignCustomDomain

    /**
     * Checks the custom domain's DNS now and returns the result in `isVerified`. The first time the
     * check passes, GrowSurf sets up the domain's SSL certificate; pages can take a few minutes to
     * load over `https://` after that. If the record is wrong or has not propagated yet,
     * `isVerified` stays `false`; call again later. More than one `CNAME` record on the hostname
     * returns a `400`. Returns a `404` when no custom domain is set. A domain that is already
     * verified is returned as is, without a new check.
     */
    fun verify(id: String): CampaignCustomDomain = verify(id, CustomDomainVerifyParams.none())

    /** @see verify */
    fun verify(
        id: String,
        params: CustomDomainVerifyParams = CustomDomainVerifyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignCustomDomain = verify(params.toBuilder().id(id).build(), requestOptions)

    /** @see verify */
    fun verify(
        id: String,
        params: CustomDomainVerifyParams = CustomDomainVerifyParams.none(),
    ): CampaignCustomDomain = verify(id, params, RequestOptions.none())

    /** @see verify */
    fun verify(
        params: CustomDomainVerifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignCustomDomain

    /** @see verify */
    fun verify(params: CustomDomainVerifyParams): CampaignCustomDomain =
        verify(params, RequestOptions.none())

    /** @see verify */
    fun verify(id: String, requestOptions: RequestOptions): CampaignCustomDomain =
        verify(id, CustomDomainVerifyParams.none(), requestOptions)

    /**
     * Removes a program's custom domain. Its landing pages go back to their GrowSurf URL. Returns a
     * `404` when no custom domain is set.
     */
    fun delete(id: String): DeleteCampaignCustomDomainResponse =
        delete(id, CustomDomainDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: CustomDomainDeleteParams = CustomDomainDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeleteCampaignCustomDomainResponse =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: CustomDomainDeleteParams = CustomDomainDeleteParams.none(),
    ): DeleteCampaignCustomDomainResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CustomDomainDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeleteCampaignCustomDomainResponse

    /** @see delete */
    fun delete(params: CustomDomainDeleteParams): DeleteCampaignCustomDomainResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): DeleteCampaignCustomDomainResponse =
        delete(id, CustomDomainDeleteParams.none(), requestOptions)

    /**
     * A view of [CustomDomainService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomDomainService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/custom-domain`, but is otherwise the
         * same as [CustomDomainService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<CampaignCustomDomain> =
            retrieve(id, CustomDomainRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CustomDomainRetrieveParams = CustomDomainRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignCustomDomain> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CustomDomainRetrieveParams = CustomDomainRetrieveParams.none(),
        ): HttpResponseFor<CampaignCustomDomain> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CustomDomainRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignCustomDomain>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CustomDomainRetrieveParams): HttpResponseFor<CampaignCustomDomain> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignCustomDomain> =
            retrieve(id, CustomDomainRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /campaign/{id}/custom-domain`, but is otherwise the
         * same as [CustomDomainService.set].
         */
        @MustBeClosed
        fun set(id: String, params: CustomDomainSetParams): HttpResponseFor<CampaignCustomDomain> =
            set(id, params, RequestOptions.none())

        /** @see set */
        @MustBeClosed
        fun set(
            id: String,
            params: CustomDomainSetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignCustomDomain> =
            set(params.toBuilder().id(id).build(), requestOptions)

        /** @see set */
        @MustBeClosed
        fun set(params: CustomDomainSetParams): HttpResponseFor<CampaignCustomDomain> =
            set(params, RequestOptions.none())

        /** @see set */
        @MustBeClosed
        fun set(
            params: CustomDomainSetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignCustomDomain>

        /**
         * Returns a raw HTTP response for `post /campaign/{id}/custom-domain/verify`, but is
         * otherwise the same as [CustomDomainService.verify].
         */
        @MustBeClosed
        fun verify(id: String): HttpResponseFor<CampaignCustomDomain> =
            verify(id, CustomDomainVerifyParams.none())

        /** @see verify */
        @MustBeClosed
        fun verify(
            id: String,
            params: CustomDomainVerifyParams = CustomDomainVerifyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignCustomDomain> =
            verify(params.toBuilder().id(id).build(), requestOptions)

        /** @see verify */
        @MustBeClosed
        fun verify(
            id: String,
            params: CustomDomainVerifyParams = CustomDomainVerifyParams.none(),
        ): HttpResponseFor<CampaignCustomDomain> = verify(id, params, RequestOptions.none())

        /** @see verify */
        @MustBeClosed
        fun verify(
            params: CustomDomainVerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignCustomDomain>

        /** @see verify */
        @MustBeClosed
        fun verify(params: CustomDomainVerifyParams): HttpResponseFor<CampaignCustomDomain> =
            verify(params, RequestOptions.none())

        /** @see verify */
        @MustBeClosed
        fun verify(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignCustomDomain> =
            verify(id, CustomDomainVerifyParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /campaign/{id}/custom-domain`, but is otherwise
         * the same as [CustomDomainService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<DeleteCampaignCustomDomainResponse> =
            delete(id, CustomDomainDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: CustomDomainDeleteParams = CustomDomainDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeleteCampaignCustomDomainResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: CustomDomainDeleteParams = CustomDomainDeleteParams.none(),
        ): HttpResponseFor<DeleteCampaignCustomDomainResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CustomDomainDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeleteCampaignCustomDomainResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CustomDomainDeleteParams
        ): HttpResponseFor<DeleteCampaignCustomDomainResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeleteCampaignCustomDomainResponse> =
            delete(id, CustomDomainDeleteParams.none(), requestOptions)
    }
}
