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

    /**
     * Creates a new GrowSurf account. This is the only endpoint that does not require an API key.
     * The response includes an API key for the new account, shown once in the response. The key is
     * locked until the team owner's email address is verified: authenticated program and resource
     * endpoints return a `403` with error code `EMAIL_NOT_VERIFIED_ERROR` until then (resend the
     * email via `POST /team/owner/verification-email`, then retry). A welcome email is sent to the
     * address with the verification link and a set-password link for dashboard access. Accounts
     * whose email is never verified are deleted automatically after 7 days. For security, the API
     * key is rotated the first time the account owner signs in to the GrowSurf dashboard. Some
     * actions (such as emailing participants) additionally require GrowSurf to verify the team
     * first. By creating an account you agree, on behalf of the account holder, to GrowSurf's
     * [Terms of Service](https://growsurf.com/terms) and
     * [Privacy Policy](https://growsurf.com/privacy).
     */
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
