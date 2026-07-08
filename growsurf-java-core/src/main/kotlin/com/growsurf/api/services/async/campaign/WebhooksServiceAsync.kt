// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.async.campaign

import com.google.errorprone.annotations.MustBeClosed
import com.growsurf.api.core.ClientOptions
import com.growsurf.api.core.RequestOptions
import com.growsurf.api.core.http.HttpResponseFor
import com.growsurf.api.models.campaign.webhooks.DeleteWebhookResponse
import com.growsurf.api.models.campaign.webhooks.Webhook
import com.growsurf.api.models.campaign.webhooks.WebhookCreateParams
import com.growsurf.api.models.campaign.webhooks.WebhookDeleteParams
import com.growsurf.api.models.campaign.webhooks.WebhookListParams
import com.growsurf.api.models.campaign.webhooks.WebhookListResponse
import com.growsurf.api.models.campaign.webhooks.WebhookTestParams
import com.growsurf.api.models.campaign.webhooks.WebhookTestResponse
import com.growsurf.api.models.campaign.webhooks.WebhookUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Program webhook configuration (create, update, delete, and test webhooks). */
interface WebhooksServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhooksServiceAsync

    /** Adds a webhook to the program. */
    fun create(id: String, params: WebhookCreateParams): CompletableFuture<Webhook> =
        create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: WebhookCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Webhook> = create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: WebhookCreateParams): CompletableFuture<Webhook> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: WebhookCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Webhook>

    /** Updates a webhook by id. */
    fun update(webhookId: String, params: WebhookUpdateParams): CompletableFuture<Webhook> =
        update(webhookId, params, RequestOptions.none())

    /** @see update */
    fun update(
        webhookId: String,
        params: WebhookUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Webhook> =
        update(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see update */
    fun update(params: WebhookUpdateParams): CompletableFuture<Webhook> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: WebhookUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Webhook>

    /** Lists a program's webhooks (secrets are never returned). */
    fun list(id: String): CompletableFuture<WebhookListResponse> =
        list(id, WebhookListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: WebhookListParams = WebhookListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookListResponse> =
        list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: WebhookListParams = WebhookListParams.none(),
    ): CompletableFuture<WebhookListResponse> = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: WebhookListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookListResponse>

    /** @see list */
    fun list(params: WebhookListParams): CompletableFuture<WebhookListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): CompletableFuture<WebhookListResponse> =
        list(id, WebhookListParams.none(), requestOptions)

    /** Removes a webhook by id. */
    fun delete(
        webhookId: String,
        params: WebhookDeleteParams,
    ): CompletableFuture<DeleteWebhookResponse> = delete(webhookId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        webhookId: String,
        params: WebhookDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DeleteWebhookResponse> =
        delete(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see delete */
    fun delete(params: WebhookDeleteParams): CompletableFuture<DeleteWebhookResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: WebhookDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DeleteWebhookResponse>

    /** Sends a live test event to a webhook using its stored URL and secret. */
    fun test(webhookId: String, params: WebhookTestParams): CompletableFuture<WebhookTestResponse> =
        test(webhookId, params, RequestOptions.none())

    /** @see test */
    fun test(
        webhookId: String,
        params: WebhookTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookTestResponse> =
        test(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see test */
    fun test(params: WebhookTestParams): CompletableFuture<WebhookTestResponse> =
        test(params, RequestOptions.none())

    /** @see test */
    fun test(
        params: WebhookTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookTestResponse>

    /**
     * A view of [WebhooksServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebhooksServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /campaign/{id}/webhooks`, but is otherwise the same
         * as [WebhooksServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            id: String,
            params: WebhookCreateParams,
        ): CompletableFuture<HttpResponseFor<Webhook>> = create(id, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            id: String,
            params: WebhookCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Webhook>> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: WebhookCreateParams): CompletableFuture<HttpResponseFor<Webhook>> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: WebhookCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Webhook>>

        /**
         * Returns a raw HTTP response for `patch /campaign/{id}/webhooks/{webhookId}`, but is
         * otherwise the same as [WebhooksServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            webhookId: String,
            params: WebhookUpdateParams,
        ): CompletableFuture<HttpResponseFor<Webhook>> =
            update(webhookId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            webhookId: String,
            params: WebhookUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Webhook>> =
            update(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: WebhookUpdateParams): CompletableFuture<HttpResponseFor<Webhook>> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: WebhookUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Webhook>>

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/webhooks`, but is otherwise the same
         * as [WebhooksServiceAsync.list].
         */
        @MustBeClosed
        fun list(id: String): CompletableFuture<HttpResponseFor<WebhookListResponse>> =
            list(id, WebhookListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: WebhookListParams = WebhookListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookListResponse>> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: WebhookListParams = WebhookListParams.none(),
        ): CompletableFuture<HttpResponseFor<WebhookListResponse>> =
            list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: WebhookListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookListResponse>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: WebhookListParams
        ): CompletableFuture<HttpResponseFor<WebhookListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookListResponse>> =
            list(id, WebhookListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /campaign/{id}/webhooks/{webhookId}`, but is
         * otherwise the same as [WebhooksServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            webhookId: String,
            params: WebhookDeleteParams,
        ): CompletableFuture<HttpResponseFor<DeleteWebhookResponse>> =
            delete(webhookId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            webhookId: String,
            params: WebhookDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DeleteWebhookResponse>> =
            delete(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: WebhookDeleteParams
        ): CompletableFuture<HttpResponseFor<DeleteWebhookResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: WebhookDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DeleteWebhookResponse>>

        /**
         * Returns a raw HTTP response for `post /campaign/{id}/webhooks/{webhookId}/test`, but is
         * otherwise the same as [WebhooksServiceAsync.test].
         */
        @MustBeClosed
        fun test(
            webhookId: String,
            params: WebhookTestParams,
        ): CompletableFuture<HttpResponseFor<WebhookTestResponse>> =
            test(webhookId, params, RequestOptions.none())

        /** @see test */
        @MustBeClosed
        fun test(
            webhookId: String,
            params: WebhookTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookTestResponse>> =
            test(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see test */
        @MustBeClosed
        fun test(
            params: WebhookTestParams
        ): CompletableFuture<HttpResponseFor<WebhookTestResponse>> =
            test(params, RequestOptions.none())

        /** @see test */
        @MustBeClosed
        fun test(
            params: WebhookTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookTestResponse>>
    }
}
