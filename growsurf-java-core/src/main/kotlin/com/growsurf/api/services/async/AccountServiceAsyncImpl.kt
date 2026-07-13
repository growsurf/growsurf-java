// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.async

import com.growsurf.api.core.ClientOptions
import com.growsurf.api.core.RequestOptions
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
import com.growsurf.api.models.account.AccountCreateParams
import com.growsurf.api.models.account.CreateAccountResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class AccountServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountServiceAsync {
    private val withRawResponse: AccountServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AccountServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountServiceAsync =
        AccountServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: AccountCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreateAccountResponse> =
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountServiceAsync.WithRawResponse {
        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))
        private val createHandler: Handler<CreateAccountResponse> =
            jsonHandler<CreateAccountResponse>(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountServiceAsync.WithRawResponse =
            WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun create(
            params: AccountCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreateAccountResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("accounts")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
                    .toBuilder()
                    .removeHeaders("Authorization")
                    .build()
            val resolvedOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return clientOptions.httpClient.executeAsync(request, resolvedOptions).thenApply {
                response ->
                errorHandler.handle(response).parseable {
                    response
                        .use { createHandler.handle(it) }
                        .also { if (resolvedOptions.responseValidation!!) it.validate() }
                }
            }
        }
    }
}
