// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.growsurf.api.core.ClientOptions
import com.growsurf.api.core.RequestOptions
import com.growsurf.api.core.http.HttpResponseFor
import com.growsurf.api.models.account.AccountCreateParams
import com.growsurf.api.models.account.CreateAccountResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Create a GrowSurf account and its initial API key. */
interface AccountServiceAsync {
    fun withRawResponse(): WithRawResponse

    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountServiceAsync

    fun create(params: AccountCreateParams): CompletableFuture<CreateAccountResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreateAccountResponse>

    interface WithRawResponse {
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountServiceAsync.WithRawResponse

        @MustBeClosed
        fun create(
            params: AccountCreateParams
        ): CompletableFuture<HttpResponseFor<CreateAccountResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreateAccountResponse>>
    }
}
