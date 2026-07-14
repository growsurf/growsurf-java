// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking.campaign

import com.google.errorprone.annotations.MustBeClosed
import com.growsurf.api.core.ClientOptions
import com.growsurf.api.core.RequestOptions
import com.growsurf.api.core.http.HttpResponseFor
import com.growsurf.api.models.campaign.emails.CampaignEmails
import com.growsurf.api.models.campaign.emails.EmailRetrieveParams
import com.growsurf.api.models.campaign.emails.EmailUpdateParams
import java.util.function.Consumer

/** Program Editor Emails tab (`CampaignEmails`) configuration operations. */
interface EmailsService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailsService

    /**
     * Retrieves a program's email configuration — the same surface as the dashboard Program
     * Editor's **Emails** tab. Returns each editable email template (`subject`, `preheader`,
     * `body`, `isEnabled`) plus the `settings` block (sender, contact, and design). The set of
     * email templates returned depends on the program type (referral vs affiliate).
     */
    fun retrieve(id: String): CampaignEmails = retrieve(id, EmailRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EmailRetrieveParams = EmailRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignEmails = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EmailRetrieveParams = EmailRetrieveParams.none(),
    ): CampaignEmails = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EmailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignEmails

    /** @see retrieve */
    fun retrieve(params: EmailRetrieveParams): CampaignEmails =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CampaignEmails =
        retrieve(id, EmailRetrieveParams.none(), requestOptions)

    /**
     * Updates a program's email configuration. Only the fields you send are changed; omitted fields
     * are left untouched. You may only write the email templates the dashboard exposes for the
     * program type — writing a template that is not available for the program type returns a `400`.
     * Some fields are read-only (`settings.sender.fromEmail`, whose custom value requires dashboard
     * domain verification).
     */
    fun update(id: String, params: EmailUpdateParams): CampaignEmails =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: EmailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignEmails = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(id: String): CampaignEmails = update(id, EmailUpdateParams.none())

    /** @see update */
    fun update(params: EmailUpdateParams): CampaignEmails = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EmailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignEmails

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CampaignEmails =
        update(id, EmailUpdateParams.none(), requestOptions)

    /** A view of [EmailsService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailsService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/emails`, but is otherwise the same as
         * [EmailsService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<CampaignEmails> =
            retrieve(id, EmailRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EmailRetrieveParams = EmailRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignEmails> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EmailRetrieveParams = EmailRetrieveParams.none(),
        ): HttpResponseFor<CampaignEmails> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EmailRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignEmails>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: EmailRetrieveParams): HttpResponseFor<CampaignEmails> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<CampaignEmails> =
            retrieve(id, EmailRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /campaign/{id}/emails`, but is otherwise the same
         * as [EmailsService.update].
         */
        @MustBeClosed
        fun update(id: String, params: EmailUpdateParams): HttpResponseFor<CampaignEmails> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: EmailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignEmails> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<CampaignEmails> =
            update(id, EmailUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(params: EmailUpdateParams): HttpResponseFor<CampaignEmails> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: EmailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignEmails>

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<CampaignEmails> =
            update(id, EmailUpdateParams.none(), requestOptions)
    }
}
