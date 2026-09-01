// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.async.campaign

import com.growsurf.api.core.ClientOptions
import com.growsurf.api.core.Params
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
import com.growsurf.api.core.prepareAsync
import com.growsurf.api.models.campaign.resources.DeleteProgramResourceResponse
import com.growsurf.api.models.campaign.resources.ProgramResource
import com.growsurf.api.models.campaign.resources.ProgramResourceCreateParams
import com.growsurf.api.models.campaign.resources.ProgramResourceDeleteParams
import com.growsurf.api.models.campaign.resources.ProgramResourceListParams
import com.growsurf.api.models.campaign.resources.ProgramResourceListResponse
import com.growsurf.api.models.campaign.resources.ProgramResourceUpdateParams
import com.growsurf.api.models.campaign.resources.ProgramResourceUploadTicket
import com.growsurf.api.models.campaign.resources.ProgramResourceUploadTicketParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ProgramResourcesServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ProgramResourcesServiceAsync {
    private val withRawResponse: ProgramResourcesServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ProgramResourcesServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ProgramResourcesServiceAsync =
        ProgramResourcesServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: ProgramResourceListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProgramResourceListResponse> =
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun create(
        params: ProgramResourceCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProgramResource> =
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: ProgramResourceUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProgramResource> =
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ProgramResourceDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DeleteProgramResourceResponse> =
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun createUploadTicket(
        params: ProgramResourceUploadTicketParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProgramResourceUploadTicket> =
        withRawResponse().createUploadTicket(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProgramResourcesServiceAsync.WithRawResponse {
        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProgramResourcesServiceAsync.WithRawResponse =
            WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun list(
            params: ProgramResourceListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProgramResourceListResponse>> =
            execute(
                HttpMethod.GET,
                listOf("campaign", required("id", params.id().getOrNull()), "resources"),
                params,
                requestOptions,
                null,
                jsonHandler<ProgramResourceListResponse>(clientOptions.jsonMapper),
            )

        override fun create(
            params: ProgramResourceCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProgramResource>> =
            execute(
                HttpMethod.POST,
                listOf("campaign", required("id", params.id().getOrNull()), "resources"),
                params,
                requestOptions,
                params._body(),
                jsonHandler<ProgramResource>(clientOptions.jsonMapper),
            )

        override fun update(
            params: ProgramResourceUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProgramResource>> =
            execute(
                HttpMethod.PATCH,
                listOf(
                    "campaign",
                    params.id(),
                    "resources",
                    required("resourceId", params.resourceId().getOrNull()),
                ),
                params,
                requestOptions,
                params._body(),
                jsonHandler<ProgramResource>(clientOptions.jsonMapper),
            )

        override fun delete(
            params: ProgramResourceDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DeleteProgramResourceResponse>> =
            execute(
                HttpMethod.DELETE,
                listOf(
                    "campaign",
                    params.id(),
                    "resources",
                    required("resourceId", params.resourceId().getOrNull()),
                ),
                params,
                requestOptions,
                null,
                jsonHandler<DeleteProgramResourceResponse>(clientOptions.jsonMapper),
            )

        override fun createUploadTicket(
            params: ProgramResourceUploadTicketParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProgramResourceUploadTicket>> =
            execute(
                HttpMethod.POST,
                listOf(
                    "campaign",
                    required("id", params.id().getOrNull()),
                    "resource-upload-tickets",
                ),
                params,
                requestOptions,
                params._body(),
                jsonHandler<ProgramResourceUploadTicket>(clientOptions.jsonMapper),
            )

        private fun <T> execute(
            method: HttpMethod,
            pathSegments: List<String>,
            params: Params,
            requestOptions: RequestOptions,
            body: Any?,
            handler: Handler<T>,
        ): CompletableFuture<HttpResponseFor<T>> {
            val builder =
                HttpRequest.builder()
                    .method(method)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(*pathSegments.toTypedArray())
            if (body != null) {
                builder.body(json(clientOptions.jsonMapper, body))
            }
            val request = builder.build().prepareAsync(clientOptions, params)
            val options = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, options) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable { response.use { handler.handle(it) } }
                }
        }

        private fun required(name: String, value: String?): String = checkRequired(name, value)
    }
}
