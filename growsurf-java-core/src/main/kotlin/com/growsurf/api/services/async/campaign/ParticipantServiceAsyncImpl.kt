// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.async.campaign

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
import com.growsurf.api.core.prepareAsync
import com.growsurf.api.models.campaign.ParticipantCommissionList
import com.growsurf.api.models.campaign.ParticipantPayoutList
import com.growsurf.api.models.campaign.ReferralList
import com.growsurf.api.models.campaign.participant.Participant
import com.growsurf.api.models.campaign.participant.ParticipantAddParams
import com.growsurf.api.models.campaign.participant.ParticipantCreateMobileTokenParams
import com.growsurf.api.models.campaign.participant.ParticipantCreateMobileTokenResponse
import com.growsurf.api.models.campaign.participant.ParticipantDeleteParams
import com.growsurf.api.models.campaign.participant.ParticipantDeleteResponse
import com.growsurf.api.models.campaign.participant.ParticipantListCommissionsParams
import com.growsurf.api.models.campaign.participant.ParticipantListPayoutsParams
import com.growsurf.api.models.campaign.participant.ParticipantListReferralsParams
import com.growsurf.api.models.campaign.participant.ParticipantListRewardsParams
import com.growsurf.api.models.campaign.participant.ParticipantListRewardsResponse
import com.growsurf.api.models.campaign.participant.ParticipantRecordTransactionParams
import com.growsurf.api.models.campaign.participant.ParticipantRecordTransactionResponse
import com.growsurf.api.models.campaign.participant.ParticipantRetrieveParams
import com.growsurf.api.models.campaign.participant.ParticipantSendInvitesParams
import com.growsurf.api.models.campaign.participant.ParticipantSendInvitesResponse
import com.growsurf.api.models.campaign.participant.ParticipantTriggerReferralParams
import com.growsurf.api.models.campaign.participant.ParticipantTriggerReferralResponse
import com.growsurf.api.models.campaign.participant.ParticipantUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ParticipantServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ParticipantServiceAsync {

    private val withRawResponse: ParticipantServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ParticipantServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ParticipantServiceAsync =
        ParticipantServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: ParticipantRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Participant> =
        // get /campaign/{id}/participant/{participantIdOrEmail}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: ParticipantUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Participant> =
        // post /campaign/{id}/participant/{participantIdOrEmail}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ParticipantDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ParticipantDeleteResponse> =
        // delete /campaign/{id}/participant/{participantIdOrEmail}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun add(
        params: ParticipantAddParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Participant> =
        // post /campaign/{id}/participant
        withRawResponse().add(params, requestOptions).thenApply { it.parse() }

    override fun createMobileToken(
        params: ParticipantCreateMobileTokenParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ParticipantCreateMobileTokenResponse> =
        // post /campaign/{id}/participant/{participantIdOrEmail}/mobile-token
        withRawResponse().createMobileToken(params, requestOptions).thenApply { it.parse() }

    override fun listCommissions(
        params: ParticipantListCommissionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ParticipantCommissionList> =
        // get /campaign/{id}/participant/{participantIdOrEmail}/commissions
        withRawResponse().listCommissions(params, requestOptions).thenApply { it.parse() }

    override fun listPayouts(
        params: ParticipantListPayoutsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ParticipantPayoutList> =
        // get /campaign/{id}/participant/{participantIdOrEmail}/payouts
        withRawResponse().listPayouts(params, requestOptions).thenApply { it.parse() }

    override fun listReferrals(
        params: ParticipantListReferralsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReferralList> =
        // get /campaign/{id}/participant/{participantIdOrEmail}/referrals
        withRawResponse().listReferrals(params, requestOptions).thenApply { it.parse() }

    override fun listRewards(
        params: ParticipantListRewardsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ParticipantListRewardsResponse> =
        // get /campaign/{id}/participant/{participantIdOrEmail}/rewards
        withRawResponse().listRewards(params, requestOptions).thenApply { it.parse() }

    override fun recordTransaction(
        params: ParticipantRecordTransactionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ParticipantRecordTransactionResponse> =
        // post /campaign/{id}/participant/{participantIdOrEmail}/transaction
        withRawResponse().recordTransaction(params, requestOptions).thenApply { it.parse() }

    override fun sendInvites(
        params: ParticipantSendInvitesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ParticipantSendInvitesResponse> =
        // post /campaign/{id}/participant/{participantIdOrEmail}/invites
        withRawResponse().sendInvites(params, requestOptions).thenApply { it.parse() }

    override fun triggerReferral(
        params: ParticipantTriggerReferralParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ParticipantTriggerReferralResponse> =
        // post /campaign/{id}/participant/{participantIdOrEmail}/ref
        withRawResponse().triggerReferral(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ParticipantServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ParticipantServiceAsync.WithRawResponse =
            ParticipantServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<Participant> =
            jsonHandler<Participant>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ParticipantRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Participant>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("participantIdOrEmail", params.participantIdOrEmail().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "campaign",
                        params._pathParam(0),
                        "participant",
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<Participant> =
            jsonHandler<Participant>(clientOptions.jsonMapper)

        override fun update(
            params: ParticipantUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Participant>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("participantIdOrEmail", params.participantIdOrEmail().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "campaign",
                        params._pathParam(0),
                        "participant",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<ParticipantDeleteResponse> =
            jsonHandler<ParticipantDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ParticipantDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ParticipantDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("participantIdOrEmail", params.participantIdOrEmail().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "campaign",
                        params._pathParam(0),
                        "participant",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val addHandler: Handler<Participant> =
            jsonHandler<Participant>(clientOptions.jsonMapper)

        override fun add(
            params: ParticipantAddParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Participant>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaign", params._pathParam(0), "participant")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { addHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createMobileTokenHandler: Handler<ParticipantCreateMobileTokenResponse> =
            jsonHandler<ParticipantCreateMobileTokenResponse>(clientOptions.jsonMapper)

        override fun createMobileToken(
            params: ParticipantCreateMobileTokenParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ParticipantCreateMobileTokenResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("participantIdOrEmail", params.participantIdOrEmail().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "campaign",
                        params._pathParam(0),
                        "participant",
                        params._pathParam(1),
                        "mobile-token",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createMobileTokenHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listCommissionsHandler: Handler<ParticipantCommissionList> =
            jsonHandler<ParticipantCommissionList>(clientOptions.jsonMapper)

        override fun listCommissions(
            params: ParticipantListCommissionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ParticipantCommissionList>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("participantIdOrEmail", params.participantIdOrEmail().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "campaign",
                        params._pathParam(0),
                        "participant",
                        params._pathParam(1),
                        "commissions",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listCommissionsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listPayoutsHandler: Handler<ParticipantPayoutList> =
            jsonHandler<ParticipantPayoutList>(clientOptions.jsonMapper)

        override fun listPayouts(
            params: ParticipantListPayoutsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ParticipantPayoutList>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("participantIdOrEmail", params.participantIdOrEmail().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "campaign",
                        params._pathParam(0),
                        "participant",
                        params._pathParam(1),
                        "payouts",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listPayoutsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listReferralsHandler: Handler<ReferralList> =
            jsonHandler<ReferralList>(clientOptions.jsonMapper)

        override fun listReferrals(
            params: ParticipantListReferralsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReferralList>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("participantIdOrEmail", params.participantIdOrEmail().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "campaign",
                        params._pathParam(0),
                        "participant",
                        params._pathParam(1),
                        "referrals",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listReferralsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listRewardsHandler: Handler<ParticipantListRewardsResponse> =
            jsonHandler<ParticipantListRewardsResponse>(clientOptions.jsonMapper)

        override fun listRewards(
            params: ParticipantListRewardsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ParticipantListRewardsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("participantIdOrEmail", params.participantIdOrEmail().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "campaign",
                        params._pathParam(0),
                        "participant",
                        params._pathParam(1),
                        "rewards",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listRewardsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val recordTransactionHandler: Handler<ParticipantRecordTransactionResponse> =
            jsonHandler<ParticipantRecordTransactionResponse>(clientOptions.jsonMapper)

        override fun recordTransaction(
            params: ParticipantRecordTransactionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ParticipantRecordTransactionResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("participantIdOrEmail", params.participantIdOrEmail().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "campaign",
                        params._pathParam(0),
                        "participant",
                        params._pathParam(1),
                        "transaction",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { recordTransactionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val sendInvitesHandler: Handler<ParticipantSendInvitesResponse> =
            jsonHandler<ParticipantSendInvitesResponse>(clientOptions.jsonMapper)

        override fun sendInvites(
            params: ParticipantSendInvitesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ParticipantSendInvitesResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("participantIdOrEmail", params.participantIdOrEmail().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "campaign",
                        params._pathParam(0),
                        "participant",
                        params._pathParam(1),
                        "invites",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { sendInvitesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val triggerReferralHandler: Handler<ParticipantTriggerReferralResponse> =
            jsonHandler<ParticipantTriggerReferralResponse>(clientOptions.jsonMapper)

        override fun triggerReferral(
            params: ParticipantTriggerReferralParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ParticipantTriggerReferralResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("participantIdOrEmail", params.participantIdOrEmail().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "campaign",
                        params._pathParam(0),
                        "participant",
                        params._pathParam(1),
                        "ref",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { triggerReferralHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
