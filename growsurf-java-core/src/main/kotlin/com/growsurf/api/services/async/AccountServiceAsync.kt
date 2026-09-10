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
     * Creates a new GrowSurf account. This is the only endpoint that does not require an API key. Before
     * calling it, an authorized account owner must review and approve GrowSurf's [Terms of
     * Service](https://growsurf.com/terms) and [Privacy Policy](https://growsurf.com/privacy). The account
     * starts a 14-day Business trial without a credit card. The response includes an API key for the new
     * account, shown once in the response. The key is a secret: store it in a secret manager and do not
     * put it in logs, screenshots, URLs, model context, analytics, or generated output. A lost key cannot
     * be recovered through this API, so do not create an account here unless you can store the key
     * somewhere that outlives the current conversation. If you cannot, ask the account owner to connect
     * GrowSurf's hosted MCP server at `https://mcp.growsurf.com` instead, which keeps the credential with
     * your tool rather than in chat. The key is locked until the team owner's email address is verified:
     * authenticated program and resource endpoints return a `403` with error code
     * `EMAIL_NOT_VERIFIED_ERROR` until then (resend the email via `POST /team/owner/verification-email`,
     * then retry). Verification unlocks this same key - keep it and retry rather than requesting a
     * replacement. A welcome email is sent to the address with the verification link and a set-password
     * link for dashboard access. Accounts whose email is never verified are deleted automatically after 7
     * days. Separately, for security, the API key is replaced the first time the account owner signs in to
     * the GrowSurf dashboard; email verification does not trigger that, and the previous key then returns
     * a `403` with error code `NOT_AUTHORIZED_ERROR`. Some actions (such as emailing participants)
     * additionally require GrowSurf to verify the team first. Calling this endpoint accepts those policies
     * on the account holder's behalf.
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
