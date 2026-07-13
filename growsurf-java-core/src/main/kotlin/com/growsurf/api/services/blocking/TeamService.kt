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

    fun retrieve(): Team = retrieve(TeamRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: TeamRetrieveParams = TeamRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Team

    fun update(params: TeamUpdateParams): Team = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TeamUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Team

    fun rotateApiKey(): RotateApiKeyResponse = rotateApiKey(TeamRotateApiKeyParams.none())

    /** @see rotateApiKey */
    fun rotateApiKey(
        params: TeamRotateApiKeyParams = TeamRotateApiKeyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RotateApiKeyResponse

    fun requestVerification(): Team = requestVerification(TeamRequestVerificationParams.none())

    /** @see requestVerification */
    fun requestVerification(
        params: TeamRequestVerificationParams = TeamRequestVerificationParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Team

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
