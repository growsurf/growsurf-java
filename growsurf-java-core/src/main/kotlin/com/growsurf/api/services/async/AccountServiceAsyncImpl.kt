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
import com.growsurf.api.core.prepareAsync
import com.growsurf.api.models.account.Account
import com.growsurf.api.models.account.AccountCreateParams
import com.growsurf.api.models.account.AccountRequestVerificationParams
import com.growsurf.api.models.account.AccountResendVerificationEmailParams
import com.growsurf.api.models.account.AccountRetrieveParams
import com.growsurf.api.models.account.AccountRotateApiKeyParams
import com.growsurf.api.models.account.AccountUpdateParams
import com.growsurf.api.models.account.CreateAccountResponse
import com.growsurf.api.models.account.RotateApiKeyResponse
import com.growsurf.api.models.account.VerificationEmailResponse
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
        // post /accounts
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Account> =
        // get /account
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: AccountUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Account> =
        // patch /account
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun rotateApiKey(
        params: AccountRotateApiKeyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RotateApiKeyResponse> =
        // post /account/api-key
        withRawResponse().rotateApiKey(params, requestOptions).thenApply { it.parse() }

    override fun requestVerification(
        params: AccountRequestVerificationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Account> =
        // post /account/verification-request
        withRawResponse().requestVerification(params, requestOptions).thenApply { it.parse() }

    override fun resendVerificationEmail(
        params: AccountResendVerificationEmailParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerificationEmailResponse> =
        // post /account/verification-email
        withRawResponse().resendVerificationEmail(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountServiceAsync.WithRawResponse =
            AccountServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CreateAccountResponse> =
            jsonHandler<CreateAccountResponse>(clientOptions.jsonMapper)

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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<Account> =
            jsonHandler<Account>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AccountRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Account>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<Account> = jsonHandler<Account>(clientOptions.jsonMapper)

        override fun update(
            params: AccountUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Account>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val rotateApiKeyHandler: Handler<RotateApiKeyResponse> =
            jsonHandler<RotateApiKeyResponse>(clientOptions.jsonMapper)

        override fun rotateApiKey(
            params: AccountRotateApiKeyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RotateApiKeyResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account", "api-key")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { rotateApiKeyHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val requestVerificationHandler: Handler<Account> =
            jsonHandler<Account>(clientOptions.jsonMapper)

        override fun requestVerification(
            params: AccountRequestVerificationParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Account>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account", "verification-request")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { requestVerificationHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val resendVerificationEmailHandler: Handler<VerificationEmailResponse> =
            jsonHandler<VerificationEmailResponse>(clientOptions.jsonMapper)

        override fun resendVerificationEmail(
            params: AccountResendVerificationEmailParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerificationEmailResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account", "verification-email")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { resendVerificationEmailHandler.handle(it) }
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
