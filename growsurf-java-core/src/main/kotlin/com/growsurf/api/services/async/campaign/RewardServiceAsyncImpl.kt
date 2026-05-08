// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.async.campaign

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
import com.growsurf.api.core.prepareAsync
import com.growsurf.api.models.campaign.reward.RewardApproveParams
import com.growsurf.api.models.campaign.reward.RewardApproveResponse
import com.growsurf.api.models.campaign.reward.RewardDeleteParams
import com.growsurf.api.models.campaign.reward.RewardDeleteResponse
import com.growsurf.api.models.campaign.reward.RewardFulfillParams
import com.growsurf.api.models.campaign.reward.RewardFulfillResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Participant reward retrieval and manual reward operations. */
class RewardServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RewardServiceAsync {

    private val withRawResponse: RewardServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RewardServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RewardServiceAsync =
        RewardServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun delete(
        params: RewardDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RewardDeleteResponse> =
        // delete /campaign/{id}/reward/{rewardId}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun approve(
        params: RewardApproveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RewardApproveResponse> =
        // post /campaign/{id}/reward/{rewardId}/approve
        withRawResponse().approve(params, requestOptions).thenApply { it.parse() }

    override fun fulfill(
        params: RewardFulfillParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RewardFulfillResponse> =
        // post /campaign/{id}/reward/{rewardId}/fulfill
        withRawResponse().fulfill(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RewardServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RewardServiceAsync.WithRawResponse =
            RewardServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val deleteHandler: Handler<RewardDeleteResponse> =
            jsonHandler<RewardDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: RewardDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RewardDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("rewardId", params.rewardId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "campaign",
                        params._pathParam(0),
                        "reward",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val approveHandler: Handler<RewardApproveResponse> =
            jsonHandler<RewardApproveResponse>(clientOptions.jsonMapper)

        override fun approve(
            params: RewardApproveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RewardApproveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("rewardId", params.rewardId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "campaign",
                        params._pathParam(0),
                        "reward",
                        params._pathParam(1),
                        "approve",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { approveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val fulfillHandler: Handler<RewardFulfillResponse> =
            jsonHandler<RewardFulfillResponse>(clientOptions.jsonMapper)

        override fun fulfill(
            params: RewardFulfillParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RewardFulfillResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("rewardId", params.rewardId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "campaign",
                        params._pathParam(0),
                        "reward",
                        params._pathParam(1),
                        "fulfill",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { fulfillHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
