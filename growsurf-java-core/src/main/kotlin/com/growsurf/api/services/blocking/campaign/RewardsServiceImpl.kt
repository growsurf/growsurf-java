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
import com.growsurf.api.models.campaign.rewards.CampaignRewardListResponse
import com.growsurf.api.models.campaign.rewards.DeleteRewardResponse
import com.growsurf.api.models.campaign.rewards.Reward
import com.growsurf.api.models.campaign.rewards.RewardCreateParams
import com.growsurf.api.models.campaign.rewards.RewardDeleteParams
import com.growsurf.api.models.campaign.rewards.RewardListParams
import com.growsurf.api.models.campaign.rewards.RewardUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RewardsServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RewardsService {

    private val withRawResponse: RewardsService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RewardsService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RewardsService =
        RewardsServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: RewardCreateParams, requestOptions: RequestOptions): Reward =
        // post /campaign/{id}/rewards
        withRawResponse().create(params, requestOptions).parse()

    override fun update(params: RewardUpdateParams, requestOptions: RequestOptions): Reward =
        // patch /campaign/{id}/rewards/{rewardId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: RewardListParams,
        requestOptions: RequestOptions,
    ): CampaignRewardListResponse =
        // get /campaign/{id}/rewards
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: RewardDeleteParams,
        requestOptions: RequestOptions,
    ): DeleteRewardResponse =
        // delete /campaign/{id}/rewards/{rewardId}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RewardsService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RewardsService.WithRawResponse =
            RewardsServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Reward> = jsonHandler<Reward>(clientOptions.jsonMapper)

        override fun create(
            params: RewardCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Reward> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaign", params._pathParam(0), "rewards")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<Reward> = jsonHandler<Reward>(clientOptions.jsonMapper)

        override fun update(
            params: RewardUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Reward> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("rewardId", params.rewardId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "campaign",
                        params._pathParam(0),
                        "rewards",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<CampaignRewardListResponse> =
            jsonHandler<CampaignRewardListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: RewardListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignRewardListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaign", params._pathParam(0), "rewards")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<DeleteRewardResponse> =
            jsonHandler<DeleteRewardResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: RewardDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeleteRewardResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("rewardId", params.rewardId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "campaign",
                        params._pathParam(0),
                        "rewards",
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
    }
}
