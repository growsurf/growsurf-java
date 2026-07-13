// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.growsurf.api.core.ClientOptions
import com.growsurf.api.core.RequestOptions
import com.growsurf.api.core.http.HttpResponseFor
import com.growsurf.api.models.account.AccountCreateParams
import com.growsurf.api.models.account.CreateAccountResponse
import java.util.function.Consumer

/** Create a GrowSurf account and its initial API key. */
interface AccountService {
    fun withRawResponse(): WithRawResponse

    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountService

    /**
     * Creates a new GrowSurf account and returns an API key shown once in the response. The key is
     * locked until the team owner's email address is verified and rotates the first time the
     * account owner signs in to the GrowSurf dashboard. Accounts whose email is never verified are
     * deleted automatically after 7 days.
     */
    fun create(params: AccountCreateParams): CreateAccountResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreateAccountResponse

    interface WithRawResponse {
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountService.WithRawResponse

        @MustBeClosed
        fun create(params: AccountCreateParams): HttpResponseFor<CreateAccountResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreateAccountResponse>
    }
}
