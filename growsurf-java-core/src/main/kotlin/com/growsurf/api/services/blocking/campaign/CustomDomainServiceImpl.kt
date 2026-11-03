// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking.campaign

import com.growsurf.api.core.ClientOptions
import com.growsurf.api.core.RequestOptions
import com.growsurf.api.core.checkRequired
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
import com.growsurf.api.models.campaign.customdomain.CampaignCustomDomain
import com.growsurf.api.models.campaign.customdomain.CustomDomainDeleteParams
import com.growsurf.api.models.campaign.customdomain.CustomDomainRetrieveParams
import com.growsurf.api.models.campaign.customdomain.CustomDomainSetParams
import com.growsurf.api.models.campaign.customdomain.CustomDomainVerifyParams
import com.growsurf.api.models.campaign.customdomain.DeleteCampaignCustomDomainResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CustomDomainServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CustomDomainService {

    private val withRawResponse: CustomDomainService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CustomDomainService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomDomainService =
        CustomDomainServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: CustomDomainRetrieveParams,
        requestOptions: RequestOptions,
    ): CampaignCustomDomain =
        // get /campaign/{id}/custom-domain
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun set(
        params: CustomDomainSetParams,
        requestOptions: RequestOptions,
    ): CampaignCustomDomain =
        // put /campaign/{id}/custom-domain
        withRawResponse().set(params, requestOptions).parse()

    override fun verify(
        params: CustomDomainVerifyParams,
        requestOptions: RequestOptions,
    ): CampaignCustomDomain =
        // post /campaign/{id}/custom-domain/verify
        withRawResponse().verify(params, requestOptions).parse()

    override fun delete(
        params: CustomDomainDeleteParams,
        requestOptions: RequestOptions,
    ): DeleteCampaignCustomDomainResponse =
        // delete /campaign/{id}/custom-domain
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomDomainService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomDomainService.WithRawResponse =
            CustomDomainServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<CampaignCustomDomain> =
            jsonHandler<CampaignCustomDomain>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CustomDomainRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignCustomDomain> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaign", params._pathParam(0), "custom-domain")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val setHandler: Handler<CampaignCustomDomain> =
            jsonHandler<CampaignCustomDomain>(clientOptions.jsonMapper)

        override fun set(
            params: CustomDomainSetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignCustomDomain> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaign", params._pathParam(0), "custom-domain")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { setHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val verifyHandler: Handler<CampaignCustomDomain> =
            jsonHandler<CampaignCustomDomain>(clientOptions.jsonMapper)

        override fun verify(
            params: CustomDomainVerifyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignCustomDomain> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaign", params._pathParam(0), "custom-domain", "verify")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { verifyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<DeleteCampaignCustomDomainResponse> =
            jsonHandler<DeleteCampaignCustomDomainResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: CustomDomainDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeleteCampaignCustomDomainResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaign", params._pathParam(0), "custom-domain")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
