// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking.campaign

import com.growsurf.api.core.ClientOptions
import com.growsurf.api.core.RequestOptions
import com.growsurf.api.core.checkRequired
import com.growsurf.api.core.handlers.errorBodyHandler
import com.growsurf.api.core.handlers.errorHandler
import com.growsurf.api.core.handlers.jsonHandler
import com.growsurf.api.core.http.HttpMethod
import com.growsurf.api.core.http.HttpRequest
import com.growsurf.api.core.http.HttpResponse
import com.growsurf.api.core.http.HttpResponse.Handler
import com.growsurf.api.core.http.HttpResponseFor
import com.growsurf.api.core.http.json
import com.growsurf.api.core.http.parseable
import com.growsurf.api.core.prepare
import com.growsurf.api.models.campaign.webhooks.DeleteWebhookResponse
import com.growsurf.api.models.campaign.webhooks.Webhook
import com.growsurf.api.models.campaign.webhooks.WebhookCreateParams
import com.growsurf.api.models.campaign.webhooks.WebhookDeleteParams
import com.growsurf.api.models.campaign.webhooks.WebhookListParams
import com.growsurf.api.models.campaign.webhooks.WebhookListResponse
import com.growsurf.api.models.campaign.webhooks.WebhookTestParams
import com.growsurf.api.models.campaign.webhooks.WebhookTestResponse
import com.growsurf.api.models.campaign.webhooks.WebhookUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class WebhooksServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WebhooksService {

    private val withRawResponse: WebhooksService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WebhooksService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhooksService =
        WebhooksServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: WebhookCreateParams, requestOptions: RequestOptions): Webhook =
        // post /campaign/{id}/webhooks
        withRawResponse().create(params, requestOptions).parse()

    override fun update(params: WebhookUpdateParams, requestOptions: RequestOptions): Webhook =
        // patch /campaign/{id}/webhooks/{webhookId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: WebhookListParams,
        requestOptions: RequestOptions,
    ): WebhookListResponse =
        // get /campaign/{id}/webhooks
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: WebhookDeleteParams,
        requestOptions: RequestOptions,
    ): DeleteWebhookResponse =
        // delete /campaign/{id}/webhooks/{webhookId}
        withRawResponse().delete(params, requestOptions).parse()

    override fun test(
        params: WebhookTestParams,
        requestOptions: RequestOptions,
    ): WebhookTestResponse =
        // post /campaign/{id}/webhooks/{webhookId}/test
        withRawResponse().test(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebhooksService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebhooksService.WithRawResponse =
            WebhooksServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Webhook> = jsonHandler<Webhook>(clientOptions.jsonMapper)

        override fun create(
            params: WebhookCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Webhook> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaign", params._pathParam(0), "webhooks")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<Webhook> = jsonHandler<Webhook>(clientOptions.jsonMapper)

        override fun update(
            params: WebhookUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Webhook> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("webhookId", params.webhookId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "campaign",
                        params._pathParam(0),
                        "webhooks",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<WebhookListResponse> =
            jsonHandler<WebhookListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: WebhookListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaign", params._pathParam(0), "webhooks")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<DeleteWebhookResponse> =
            jsonHandler<DeleteWebhookResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: WebhookDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeleteWebhookResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("webhookId", params.webhookId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "campaign",
                        params._pathParam(0),
                        "webhooks",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val testHandler: Handler<WebhookTestResponse> =
            jsonHandler<WebhookTestResponse>(clientOptions.jsonMapper)

        override fun test(
            params: WebhookTestParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookTestResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("webhookId", params.webhookId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "campaign",
                        params._pathParam(0),
                        "webhooks",
                        params._pathParam(1),
                        "test",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { testHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
