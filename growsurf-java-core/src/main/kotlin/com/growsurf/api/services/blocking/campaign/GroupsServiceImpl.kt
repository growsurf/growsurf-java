// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking.campaign

import com.growsurf.api.core.ClientOptions
import com.growsurf.api.core.Params
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
import com.growsurf.api.models.campaign.groups.DeleteRewardGroupResponse
import com.growsurf.api.models.campaign.groups.RewardGroup
import com.growsurf.api.models.campaign.groups.RewardGroupCreateParams
import com.growsurf.api.models.campaign.groups.RewardGroupDeleteParams
import com.growsurf.api.models.campaign.groups.RewardGroupListParams
import com.growsurf.api.models.campaign.groups.RewardGroupListResponse
import com.growsurf.api.models.campaign.groups.RewardGroupRetrieveParams
import com.growsurf.api.models.campaign.groups.RewardGroupUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class GroupsServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    GroupsService {
    private val withRawResponse: GroupsService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GroupsService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupsService =
        GroupsServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: RewardGroupListParams,
        requestOptions: RequestOptions,
    ): RewardGroupListResponse = withRawResponse().list(params, requestOptions).parse()

    override fun create(
        params: RewardGroupCreateParams,
        requestOptions: RequestOptions,
    ): RewardGroup = withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: RewardGroupRetrieveParams,
        requestOptions: RequestOptions,
    ): RewardGroup = withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: RewardGroupUpdateParams,
        requestOptions: RequestOptions,
    ): RewardGroup = withRawResponse().update(params, requestOptions).parse()

    override fun delete(
        params: RewardGroupDeleteParams,
        requestOptions: RequestOptions,
    ): DeleteRewardGroupResponse = withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GroupsService.WithRawResponse {
        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GroupsService.WithRawResponse =
            WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun list(
            params: RewardGroupListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RewardGroupListResponse> =
            execute(
                HttpMethod.GET,
                listOf("campaign", required("id", params.id().getOrNull()), "groups"),
                params,
                requestOptions,
                null,
                jsonHandler<RewardGroupListResponse>(clientOptions.jsonMapper),
            )

        override fun create(
            params: RewardGroupCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RewardGroup> =
            execute(
                HttpMethod.POST,
                listOf("campaign", required("id", params.id().getOrNull()), "groups"),
                params,
                requestOptions,
                params._body(),
                jsonHandler<RewardGroup>(clientOptions.jsonMapper),
            )

        override fun retrieve(
            params: RewardGroupRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RewardGroup> =
            execute(
                HttpMethod.GET,
                listOf(
                    "campaign",
                    params.id(),
                    "groups",
                    required("groupId", params.groupId().getOrNull()),
                ),
                params,
                requestOptions,
                null,
                jsonHandler<RewardGroup>(clientOptions.jsonMapper),
            )

        override fun update(
            params: RewardGroupUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RewardGroup> =
            execute(
                HttpMethod.PATCH,
                listOf(
                    "campaign",
                    params.id(),
                    "groups",
                    required("groupId", params.groupId().getOrNull()),
                ),
                params,
                requestOptions,
                params._body(),
                jsonHandler<RewardGroup>(clientOptions.jsonMapper),
            )

        override fun delete(
            params: RewardGroupDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeleteRewardGroupResponse> =
            execute(
                HttpMethod.DELETE,
                listOf(
                    "campaign",
                    params.id(),
                    "groups",
                    required("groupId", params.groupId().getOrNull()),
                ),
                params,
                requestOptions,
                null,
                jsonHandler<DeleteRewardGroupResponse>(clientOptions.jsonMapper),
            )

        private fun <T> execute(
            method: HttpMethod,
            pathSegments: List<String>,
            params: Params,
            requestOptions: RequestOptions,
            body: Any?,
            handler: Handler<T>,
        ): HttpResponseFor<T> {
            val builder =
                HttpRequest.builder()
                    .method(method)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(*pathSegments.toTypedArray())
            if (body != null) {
                builder.body(json(clientOptions.jsonMapper, body))
            }
            val request = builder.build().prepare(clientOptions, params)
            val options = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, options)
            return errorHandler.handle(response).parseable { response.use { handler.handle(it) } }
        }

        private fun required(name: String, value: String?): String = checkRequired(name, value)
    }
}
