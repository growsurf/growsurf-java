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
import com.growsurf.api.models.campaign.commission.CommissionApproveParams
import com.growsurf.api.models.campaign.commission.CommissionApproveResponse
import com.growsurf.api.models.campaign.commission.CommissionDeleteParams
import com.growsurf.api.models.campaign.commission.CommissionDeleteResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Affiliate transaction, commission, and payout operations. */
class CommissionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CommissionService {

    private val withRawResponse: CommissionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CommissionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommissionService =
        CommissionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun delete(
        params: CommissionDeleteParams,
        requestOptions: RequestOptions,
    ): CommissionDeleteResponse =
        // delete /campaign/{id}/commission/{commissionId}
        withRawResponse().delete(params, requestOptions).parse()

    override fun approve(
        params: CommissionApproveParams,
        requestOptions: RequestOptions,
    ): CommissionApproveResponse =
        // post /campaign/{id}/commission/{commissionId}/approve
        withRawResponse().approve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CommissionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CommissionService.WithRawResponse =
            CommissionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val deleteHandler: Handler<CommissionDeleteResponse> =
            jsonHandler<CommissionDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: CommissionDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommissionDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("commissionId", params.commissionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "campaign",
                        params._pathParam(0),
                        "commission",
                        params._pathParam(1),
                    )
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

        private val approveHandler: Handler<CommissionApproveResponse> =
            jsonHandler<CommissionApproveResponse>(clientOptions.jsonMapper)

        override fun approve(
            params: CommissionApproveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommissionApproveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("commissionId", params.commissionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "campaign",
                        params._pathParam(0),
                        "commission",
                        params._pathParam(1),
                        "approve",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { approveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
