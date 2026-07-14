// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.async.campaign

import com.google.errorprone.annotations.MustBeClosed
import com.growsurf.api.core.ClientOptions
import com.growsurf.api.core.RequestOptions
import com.growsurf.api.core.http.HttpResponseFor
import com.growsurf.api.models.campaign.options.CampaignOptions
import com.growsurf.api.models.campaign.options.OptionRetrieveParams
import com.growsurf.api.models.campaign.options.OptionUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Program Editor Options tab (`CampaignOptions`) configuration operations. */
interface OptionsServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OptionsServiceAsync

    /**
     * Retrieves a program's options — the same surface as the dashboard Program Editor's
     * **Options** tab. Includes reward/fraud approval, anti-fraud lists + toggles, referral
     * cookie/credit windows, reCAPTCHA, payout threshold + tax settings (affiliate only), and
     * notification-email settings. `fraud.recaptcha.secretKey` is never returned.
     */
    fun retrieve(id: String): CompletableFuture<CampaignOptions> =
        retrieve(id, OptionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: OptionRetrieveParams = OptionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignOptions> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: OptionRetrieveParams = OptionRetrieveParams.none(),
    ): CompletableFuture<CampaignOptions> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: OptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignOptions>

    /** @see retrieve */
    fun retrieve(params: OptionRetrieveParams): CompletableFuture<CampaignOptions> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<CampaignOptions> =
        retrieve(id, OptionRetrieveParams.none(), requestOptions)

    /**
     * Updates a program's options. Only the fields you send are changed. Some fields are
     * program-type specific (`requireManualRewardApproval`/`autoFulfillRewards` are referral-only;
     * `payoutThreshold`/`taxDocumentation` are affiliate-only, and affiliate programs require
     * `requireParticipantAuth: true`). `fraud.recaptcha.secretKey` is write-only.
     * `referralCreditWindowDays: null` means "never expires".
     */
    fun update(id: String, params: OptionUpdateParams): CompletableFuture<CampaignOptions> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: OptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignOptions> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(id: String): CompletableFuture<CampaignOptions> =
        update(id, OptionUpdateParams.none())

    /** @see update */
    fun update(params: OptionUpdateParams): CompletableFuture<CampaignOptions> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: OptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignOptions>

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<CampaignOptions> =
        update(id, OptionUpdateParams.none(), requestOptions)

    /**
     * A view of [OptionsServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OptionsServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/options`, but is otherwise the same
         * as [OptionsServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<CampaignOptions>> =
            retrieve(id, OptionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: OptionRetrieveParams = OptionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignOptions>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: OptionRetrieveParams = OptionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CampaignOptions>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: OptionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignOptions>>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: OptionRetrieveParams
        ): CompletableFuture<HttpResponseFor<CampaignOptions>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignOptions>> =
            retrieve(id, OptionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /campaign/{id}/options`, but is otherwise the same
         * as [OptionsServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: OptionUpdateParams,
        ): CompletableFuture<HttpResponseFor<CampaignOptions>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: OptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignOptions>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(id: String): CompletableFuture<HttpResponseFor<CampaignOptions>> =
            update(id, OptionUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: OptionUpdateParams
        ): CompletableFuture<HttpResponseFor<CampaignOptions>> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: OptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignOptions>>

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignOptions>> =
            update(id, OptionUpdateParams.none(), requestOptions)
    }
}
