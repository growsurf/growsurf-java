// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.growsurf.api.core.ClientOptions
import com.growsurf.api.core.RequestOptions
import com.growsurf.api.core.http.HttpResponseFor
import com.growsurf.api.models.team.RotateApiKeyResponse
import com.growsurf.api.models.team.Team
import com.growsurf.api.models.team.TeamRequestVerificationParams
import com.growsurf.api.models.team.TeamResendOwnerVerificationEmailParams
import com.growsurf.api.models.team.TeamRetrieveParams
import com.growsurf.api.models.team.TeamRotateApiKeyParams
import com.growsurf.api.models.team.TeamUpdateParams
import com.growsurf.api.models.team.VerificationEmailResponse
import java.util.function.Consumer

/** Operations for the team bound to the API key or OAuth connection. */
interface TeamService {
    fun withRawResponse(): WithRawResponse

    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TeamService

    /**
     * Retrieves the team bound to the API key or OAuth connection. `verificationStatus` is
     * `VERIFIED` once GrowSurf has verified the team, which is required before a program can send
     * participant emails.
     */
    fun retrieve(): Team = retrieve(TeamRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: TeamRetrieveParams = TeamRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Team

    /**
     * Updates the name of the team bound to the API key or OAuth connection. Any other property is
     * rejected with a `400`. Personal profiles, billing, and team ownership are not editable here.
     */
    fun update(params: TeamUpdateParams): Team = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TeamUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Team

    /**
     * Generates a new API key and makes the key used on this request stop working when rotation
     * succeeds. Send a unique, random `Idempotency-Key`. If the response is interrupted,
     * immediately retry with the original API key and the same `Idempotency-Key` to receive the
     * same new key. Update every integration that used the old key. The team owner is notified by
     * email whenever the key is rotated. GrowSurf SDKs generate the idempotency key automatically.
     * This endpoint accepts an API key with `api_key:rotate`. If this scope is unavailable, rotate
     * the key in the authenticated dashboard instead. This operation is available only through the
     * REST API or a GrowSurf API SDK, not through MCP.
     */
    fun rotateApiKey(): RotateApiKeyResponse = rotateApiKey(TeamRotateApiKeyParams.none())

    /** @see rotateApiKey */
    fun rotateApiKey(
        params: TeamRotateApiKeyParams = TeamRotateApiKeyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RotateApiKeyResponse

    /**
     * Requests GrowSurf to verify the bound team (required before a program can email its
     * participants). Idempotent — calling it again while a request is pending does not create a
     * duplicate. Returns the team with its updated `verificationStatus`.
     */
    fun requestVerification(): Team = requestVerification(TeamRequestVerificationParams.none())

    /** @see requestVerification */
    fun requestVerification(
        params: TeamRequestVerificationParams = TeamRequestVerificationParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Team

    /**
     * Resends the email-verification message to the bound team's owner. The response never reveals
     * the owner's email address. A `200` with `status: SENT` is returned only when an email was
     * actually dispatched. Returns `400` if the email is already verified, and `429` if a
     * verification email was sent too recently — wait a moment, then retry.
     */
    fun resendOwnerVerificationEmail(): VerificationEmailResponse =
        resendOwnerVerificationEmail(TeamResendOwnerVerificationEmailParams.none())

    /** @see resendOwnerVerificationEmail */
    fun resendOwnerVerificationEmail(
        params: TeamResendOwnerVerificationEmailParams =
            TeamResendOwnerVerificationEmailParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationEmailResponse

    interface WithRawResponse {
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TeamService.WithRawResponse

        @MustBeClosed fun retrieve(): HttpResponseFor<Team> = retrieve(TeamRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TeamRetrieveParams = TeamRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Team>

        @MustBeClosed
        fun update(params: TeamUpdateParams): HttpResponseFor<Team> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: TeamUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Team>

        @MustBeClosed
        fun rotateApiKey(): HttpResponseFor<RotateApiKeyResponse> =
            rotateApiKey(TeamRotateApiKeyParams.none())

        /** @see rotateApiKey */
        @MustBeClosed
        fun rotateApiKey(
            params: TeamRotateApiKeyParams = TeamRotateApiKeyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RotateApiKeyResponse>

        @MustBeClosed
        fun requestVerification(): HttpResponseFor<Team> =
            requestVerification(TeamRequestVerificationParams.none())

        /** @see requestVerification */
        @MustBeClosed
        fun requestVerification(
            params: TeamRequestVerificationParams = TeamRequestVerificationParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Team>

        @MustBeClosed
        fun resendOwnerVerificationEmail(): HttpResponseFor<VerificationEmailResponse> =
            resendOwnerVerificationEmail(TeamResendOwnerVerificationEmailParams.none())

        /** @see resendOwnerVerificationEmail */
        @MustBeClosed
        fun resendOwnerVerificationEmail(
            params: TeamResendOwnerVerificationEmailParams =
                TeamResendOwnerVerificationEmailParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationEmailResponse>
    }
}
