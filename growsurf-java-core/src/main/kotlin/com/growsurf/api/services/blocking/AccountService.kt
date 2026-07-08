// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.growsurf.api.core.ClientOptions
import com.growsurf.api.core.RequestOptions
import com.growsurf.api.core.http.HttpResponseFor
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
import java.util.function.Consumer

/** Your GrowSurf account — profile and GrowSurf-team verification state. */
interface AccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountService

    /**
     * Creates a new GrowSurf account. This is the only endpoint that does not require an API key.
     * The response includes an API key for the new account, but the key is locked until the
     * account's email address is verified: authenticated endpoints outside the `Accounts` group
     * return a `403` with error code `EMAIL_NOT_VERIFIED_ERROR` until then (resend the email via
     * `POST /account/verification-email`, then retry). A welcome email is sent to the address with
     * the verification link and a set-password link for dashboard access. Accounts whose email is
     * never verified are deleted automatically after 7 days. For security, the API key is rotated
     * the first time the account owner signs in to the GrowSurf dashboard. Some actions (such as
     * emailing participants) additionally require the GrowSurf team to verify the account first. By
     * creating an account you agree, on behalf of the account holder, to GrowSurf's
     * [Terms of Service](https://growsurf.com/terms) and
     * [Privacy Policy](https://growsurf.com/privacy).
     */
    fun create(params: AccountCreateParams): CreateAccountResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreateAccountResponse

    /** Retrieves your GrowSurf account — profile and GrowSurf-team verification state. */
    fun retrieve(): Account = retrieve(AccountRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: AccountRetrieveParams = AccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account

    /** @see retrieve */
    fun retrieve(params: AccountRetrieveParams = AccountRetrieveParams.none()): Account =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): Account =
        retrieve(AccountRetrieveParams.none(), requestOptions)

    /**
     * Updates your own account profile (`firstName`, `lastName`, `company`). Any property not
     * listed in the request is rejected with a `400` — in particular, the account `email` cannot be
     * changed via the API, and billing/subscription is not editable here.
     */
    fun update(): Account = update(AccountUpdateParams.none())

    /** @see update */
    fun update(
        params: AccountUpdateParams = AccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account

    /** @see update */
    fun update(params: AccountUpdateParams = AccountUpdateParams.none()): Account =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(requestOptions: RequestOptions): Account =
        update(AccountUpdateParams.none(), requestOptions)

    /**
     * Generates a new API key and immediately revokes the old one. The key used to make this
     * request stops working as soon as the response is returned — update every integration that
     * used the old key with the new one. The account owner is notified by email whenever the key is
     * rotated.
     */
    fun rotateApiKey(): RotateApiKeyResponse = rotateApiKey(AccountRotateApiKeyParams.none())

    /** @see rotateApiKey */
    fun rotateApiKey(
        params: AccountRotateApiKeyParams = AccountRotateApiKeyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RotateApiKeyResponse

    /** @see rotateApiKey */
    fun rotateApiKey(
        params: AccountRotateApiKeyParams = AccountRotateApiKeyParams.none()
    ): RotateApiKeyResponse = rotateApiKey(params, RequestOptions.none())

    /** @see rotateApiKey */
    fun rotateApiKey(requestOptions: RequestOptions): RotateApiKeyResponse =
        rotateApiKey(AccountRotateApiKeyParams.none(), requestOptions)

    /**
     * Requests GrowSurf-team verification of your account (required before a program can email its
     * participants). Idempotent — calling it again while a request is pending does not create a
     * duplicate.
     */
    fun requestVerification(): Account =
        requestVerification(AccountRequestVerificationParams.none())

    /** @see requestVerification */
    fun requestVerification(
        params: AccountRequestVerificationParams = AccountRequestVerificationParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account

    /** @see requestVerification */
    fun requestVerification(
        params: AccountRequestVerificationParams = AccountRequestVerificationParams.none()
    ): Account = requestVerification(params, RequestOptions.none())

    /** @see requestVerification */
    fun requestVerification(requestOptions: RequestOptions): Account =
        requestVerification(AccountRequestVerificationParams.none(), requestOptions)

    /**
     * Resends the email-verification email to the account's email address. A `200` with `status:
     * SENT` is only returned when an email was actually dispatched. Returns a `400` if the email is
     * already verified, or a `429` if a verification email was sent too recently — wait a moment,
     * then retry.
     */
    fun resendVerificationEmail(): VerificationEmailResponse =
        resendVerificationEmail(AccountResendVerificationEmailParams.none())

    /** @see resendVerificationEmail */
    fun resendVerificationEmail(
        params: AccountResendVerificationEmailParams = AccountResendVerificationEmailParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationEmailResponse

    /** @see resendVerificationEmail */
    fun resendVerificationEmail(
        params: AccountResendVerificationEmailParams = AccountResendVerificationEmailParams.none()
    ): VerificationEmailResponse = resendVerificationEmail(params, RequestOptions.none())

    /** @see resendVerificationEmail */
    fun resendVerificationEmail(requestOptions: RequestOptions): VerificationEmailResponse =
        resendVerificationEmail(AccountResendVerificationEmailParams.none(), requestOptions)

    /** A view of [AccountService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /accounts`, but is otherwise the same as
         * [AccountService.create].
         */
        @MustBeClosed
        fun create(params: AccountCreateParams): HttpResponseFor<CreateAccountResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreateAccountResponse>

        /**
         * Returns a raw HTTP response for `get /account`, but is otherwise the same as
         * [AccountService.retrieve].
         */
        @MustBeClosed
        fun retrieve(): HttpResponseFor<Account> = retrieve(AccountRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AccountRetrieveParams = AccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AccountRetrieveParams = AccountRetrieveParams.none()
        ): HttpResponseFor<Account> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): HttpResponseFor<Account> =
            retrieve(AccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /account`, but is otherwise the same as
         * [AccountService.update].
         */
        @MustBeClosed fun update(): HttpResponseFor<Account> = update(AccountUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AccountUpdateParams = AccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account>

        /** @see update */
        @MustBeClosed
        fun update(
            params: AccountUpdateParams = AccountUpdateParams.none()
        ): HttpResponseFor<Account> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(requestOptions: RequestOptions): HttpResponseFor<Account> =
            update(AccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /account/api-key`, but is otherwise the same as
         * [AccountService.rotateApiKey].
         */
        @MustBeClosed
        fun rotateApiKey(): HttpResponseFor<RotateApiKeyResponse> =
            rotateApiKey(AccountRotateApiKeyParams.none())

        /** @see rotateApiKey */
        @MustBeClosed
        fun rotateApiKey(
            params: AccountRotateApiKeyParams = AccountRotateApiKeyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RotateApiKeyResponse>

        /** @see rotateApiKey */
        @MustBeClosed
        fun rotateApiKey(
            params: AccountRotateApiKeyParams = AccountRotateApiKeyParams.none()
        ): HttpResponseFor<RotateApiKeyResponse> = rotateApiKey(params, RequestOptions.none())

        /** @see rotateApiKey */
        @MustBeClosed
        fun rotateApiKey(requestOptions: RequestOptions): HttpResponseFor<RotateApiKeyResponse> =
            rotateApiKey(AccountRotateApiKeyParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /account/verification-request`, but is otherwise
         * the same as [AccountService.requestVerification].
         */
        @MustBeClosed
        fun requestVerification(): HttpResponseFor<Account> =
            requestVerification(AccountRequestVerificationParams.none())

        /** @see requestVerification */
        @MustBeClosed
        fun requestVerification(
            params: AccountRequestVerificationParams = AccountRequestVerificationParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account>

        /** @see requestVerification */
        @MustBeClosed
        fun requestVerification(
            params: AccountRequestVerificationParams = AccountRequestVerificationParams.none()
        ): HttpResponseFor<Account> = requestVerification(params, RequestOptions.none())

        /** @see requestVerification */
        @MustBeClosed
        fun requestVerification(requestOptions: RequestOptions): HttpResponseFor<Account> =
            requestVerification(AccountRequestVerificationParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /account/verification-email`, but is otherwise the
         * same as [AccountService.resendVerificationEmail].
         */
        @MustBeClosed
        fun resendVerificationEmail(): HttpResponseFor<VerificationEmailResponse> =
            resendVerificationEmail(AccountResendVerificationEmailParams.none())

        /** @see resendVerificationEmail */
        @MustBeClosed
        fun resendVerificationEmail(
            params: AccountResendVerificationEmailParams =
                AccountResendVerificationEmailParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationEmailResponse>

        /** @see resendVerificationEmail */
        @MustBeClosed
        fun resendVerificationEmail(
            params: AccountResendVerificationEmailParams =
                AccountResendVerificationEmailParams.none()
        ): HttpResponseFor<VerificationEmailResponse> =
            resendVerificationEmail(params, RequestOptions.none())

        /** @see resendVerificationEmail */
        @MustBeClosed
        fun resendVerificationEmail(
            requestOptions: RequestOptions
        ): HttpResponseFor<VerificationEmailResponse> =
            resendVerificationEmail(AccountResendVerificationEmailParams.none(), requestOptions)
    }
}
