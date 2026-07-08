// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.async.campaign

import com.google.errorprone.annotations.MustBeClosed
import com.growsurf.api.core.ClientOptions
import com.growsurf.api.core.RequestOptions
import com.growsurf.api.core.http.HttpResponseFor
import com.growsurf.api.models.campaign.emails.CampaignEmails
import com.growsurf.api.models.campaign.emails.EmailRetrieveParams
import com.growsurf.api.models.campaign.emails.EmailUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Program Editor Emails tab (`CampaignEmails`) configuration operations. */
interface EmailsServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailsServiceAsync

    /** Retrieves a program's Emails configuration. */
    fun retrieve(id: String): CompletableFuture<CampaignEmails> =
        retrieve(id, EmailRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EmailRetrieveParams = EmailRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignEmails> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EmailRetrieveParams = EmailRetrieveParams.none(),
    ): CompletableFuture<CampaignEmails> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EmailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignEmails>

    /** @see retrieve */
    fun retrieve(params: EmailRetrieveParams): CompletableFuture<CampaignEmails> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<CampaignEmails> =
        retrieve(id, EmailRetrieveParams.none(), requestOptions)

    /**
     * Updates a program's Emails configuration. Only the fields you send are changed; anything you
     * leave out is untouched.
     */
    fun update(id: String, params: EmailUpdateParams): CompletableFuture<CampaignEmails> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: EmailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignEmails> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(id: String): CompletableFuture<CampaignEmails> = update(id, EmailUpdateParams.none())

    /** @see update */
    fun update(params: EmailUpdateParams): CompletableFuture<CampaignEmails> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EmailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignEmails>

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<CampaignEmails> =
        update(id, EmailUpdateParams.none(), requestOptions)

    /**
     * A view of [EmailsServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailsServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/emails`, but is otherwise the same as
         * [EmailsServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<CampaignEmails>> =
            retrieve(id, EmailRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EmailRetrieveParams = EmailRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignEmails>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EmailRetrieveParams = EmailRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CampaignEmails>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EmailRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignEmails>>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EmailRetrieveParams
        ): CompletableFuture<HttpResponseFor<CampaignEmails>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignEmails>> =
            retrieve(id, EmailRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /campaign/{id}/emails`, but is otherwise the same
         * as [EmailsServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: EmailUpdateParams,
        ): CompletableFuture<HttpResponseFor<CampaignEmails>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: EmailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignEmails>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(id: String): CompletableFuture<HttpResponseFor<CampaignEmails>> =
            update(id, EmailUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(params: EmailUpdateParams): CompletableFuture<HttpResponseFor<CampaignEmails>> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: EmailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignEmails>>

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignEmails>> =
            update(id, EmailUpdateParams.none(), requestOptions)
    }
}
