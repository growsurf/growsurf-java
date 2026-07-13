// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking

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
import com.growsurf.api.models.team.RotateApiKeyResponse
import com.growsurf.api.models.team.Team
import com.growsurf.api.models.team.TeamRequestVerificationParams
import com.growsurf.api.models.team.TeamResendOwnerVerificationEmailParams
import com.growsurf.api.models.team.TeamRetrieveParams
import com.growsurf.api.models.team.TeamRotateApiKeyParams
import com.growsurf.api.models.team.TeamUpdateParams
import com.growsurf.api.models.team.VerificationEmailResponse
import java.util.function.Consumer

class TeamServiceImpl internal constructor(private val clientOptions: ClientOptions) : TeamService {
    private val withRawResponse: TeamService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TeamService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TeamService =
        TeamServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(params: TeamRetrieveParams, requestOptions: RequestOptions): Team =
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: TeamUpdateParams, requestOptions: RequestOptions): Team =
        withRawResponse().update(params, requestOptions).parse()

    override fun rotateApiKey(
        params: TeamRotateApiKeyParams,
        requestOptions: RequestOptions,
    ): RotateApiKeyResponse = withRawResponse().rotateApiKey(params, requestOptions).parse()

    override fun requestVerification(
        params: TeamRequestVerificationParams,
        requestOptions: RequestOptions,
    ): Team = withRawResponse().requestVerification(params, requestOptions).parse()

    override fun resendOwnerVerificationEmail(
        params: TeamResendOwnerVerificationEmailParams,
        requestOptions: RequestOptions,
    ): VerificationEmailResponse =
        withRawResponse().resendOwnerVerificationEmail(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TeamService.WithRawResponse {
        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))
        private val teamHandler: Handler<Team> = jsonHandler<Team>(clientOptions.jsonMapper)
        private val rotateHandler: Handler<RotateApiKeyResponse> =
            jsonHandler<RotateApiKeyResponse>(clientOptions.jsonMapper)
        private val verificationEmailHandler: Handler<VerificationEmailResponse> =
            jsonHandler<VerificationEmailResponse>(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TeamService.WithRawResponse =
            WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun retrieve(
            params: TeamRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Team> =
            execute(HttpMethod.GET, listOf("team"), params, requestOptions, teamHandler)

        override fun update(
            params: TeamUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Team> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("team")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            return parse(request, requestOptions, teamHandler)
        }

        override fun rotateApiKey(
            params: TeamRotateApiKeyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RotateApiKeyResponse> =
            execute(
                HttpMethod.POST,
                listOf("api-key", "rotate"),
                params,
                requestOptions,
                rotateHandler,
            )

        override fun requestVerification(
            params: TeamRequestVerificationParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Team> =
            execute(
                HttpMethod.POST,
                listOf("team", "verification-request"),
                params,
                requestOptions,
                teamHandler,
            )

        override fun resendOwnerVerificationEmail(
            params: TeamResendOwnerVerificationEmailParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerificationEmailResponse> =
            execute(
                HttpMethod.POST,
                listOf("team", "owner", "verification-email"),
                params,
                requestOptions,
                verificationEmailHandler,
            )

        private fun <P : com.growsurf.api.core.Params, T> execute(
            method: HttpMethod,
            path: List<String>,
            params: P,
            requestOptions: RequestOptions,
            handler: Handler<T>,
        ): HttpResponseFor<T> {
            val requestBuilder =
                HttpRequest.builder().method(method).baseUrl(clientOptions.baseUrl())
            path.forEach(requestBuilder::addPathSegment)
            return parse(
                requestBuilder.build().prepare(clientOptions, params),
                requestOptions,
                handler,
            )
        }

        private fun <T> parse(
            request: HttpRequest,
            requestOptions: RequestOptions,
            handler: Handler<T>,
        ): HttpResponseFor<T> {
            val resolvedOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, resolvedOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { handler.handle(it) }
                    .also { parsed ->
                        if (resolvedOptions.responseValidation!!) {
                            when (parsed) {
                                is Team -> parsed.validate()
                                is RotateApiKeyResponse -> parsed.validate()
                                is VerificationEmailResponse -> parsed.validate()
                            }
                        }
                    }
            }
        }
    }
}
