// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.async

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
import com.growsurf.api.models.campaign.Campaign
import com.growsurf.api.models.campaign.CampaignCloneParams
import com.growsurf.api.models.campaign.CampaignCreateMobileParticipantTokenParams
import com.growsurf.api.models.campaign.CampaignCreateMobileParticipantTokenResponse
import com.growsurf.api.models.campaign.CampaignCreateParams
import com.growsurf.api.models.campaign.CampaignGetReferralFlowScreenshotsParams
import com.growsurf.api.models.campaign.CampaignListCommissionsParams
import com.growsurf.api.models.campaign.CampaignListLeaderboardParams
import com.growsurf.api.models.campaign.CampaignListParams
import com.growsurf.api.models.campaign.CampaignListParticipantsParams
import com.growsurf.api.models.campaign.CampaignListPayoutsParams
import com.growsurf.api.models.campaign.CampaignListReferralsParams
import com.growsurf.api.models.campaign.CampaignListResponse
import com.growsurf.api.models.campaign.CampaignRetrieveAnalyticsParams
import com.growsurf.api.models.campaign.CampaignRetrieveAnalyticsResponse
import com.growsurf.api.models.campaign.CampaignRetrieveParams
import com.growsurf.api.models.campaign.CampaignUpdateParams
import com.growsurf.api.models.campaign.ParticipantCommissionList
import com.growsurf.api.models.campaign.ParticipantList
import com.growsurf.api.models.campaign.ParticipantPayoutList
import com.growsurf.api.models.campaign.ReferralList
import com.growsurf.api.models.campaign.ReferralFlowScreenshotsResponse
import com.growsurf.api.services.async.campaign.CommissionServiceAsync
import com.growsurf.api.services.async.campaign.CommissionServiceAsyncImpl
import com.growsurf.api.services.async.campaign.DesignServiceAsync
import com.growsurf.api.services.async.campaign.DesignServiceAsyncImpl
import com.growsurf.api.services.async.campaign.EmailsServiceAsync
import com.growsurf.api.services.async.campaign.EmailsServiceAsyncImpl
import com.growsurf.api.services.async.campaign.InstallationServiceAsync
import com.growsurf.api.services.async.campaign.InstallationServiceAsyncImpl
import com.growsurf.api.services.async.campaign.OptionsServiceAsync
import com.growsurf.api.services.async.campaign.OptionsServiceAsyncImpl
import com.growsurf.api.services.async.campaign.ParticipantServiceAsync
import com.growsurf.api.services.async.campaign.ParticipantServiceAsyncImpl
import com.growsurf.api.services.async.campaign.RewardServiceAsync
import com.growsurf.api.services.async.campaign.RewardServiceAsyncImpl
import com.growsurf.api.services.async.campaign.RewardsServiceAsync
import com.growsurf.api.services.async.campaign.RewardsServiceAsyncImpl
import com.growsurf.api.services.async.campaign.WebhooksServiceAsync
import com.growsurf.api.services.async.campaign.WebhooksServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CampaignServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CampaignServiceAsync {

    private val withRawResponse: CampaignServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val participant: ParticipantServiceAsync by lazy {
        ParticipantServiceAsyncImpl(clientOptions)
    }

    private val reward: RewardServiceAsync by lazy { RewardServiceAsyncImpl(clientOptions) }

    private val commission: CommissionServiceAsync by lazy {
        CommissionServiceAsyncImpl(clientOptions)
    }

    private val rewards: RewardsServiceAsync by lazy { RewardsServiceAsyncImpl(clientOptions) }

    private val design: DesignServiceAsync by lazy { DesignServiceAsyncImpl(clientOptions) }

    private val emails: EmailsServiceAsync by lazy { EmailsServiceAsyncImpl(clientOptions) }

    private val options: OptionsServiceAsync by lazy { OptionsServiceAsyncImpl(clientOptions) }

    private val installation: InstallationServiceAsync by lazy {
        InstallationServiceAsyncImpl(clientOptions)
    }

    private val webhooks: WebhooksServiceAsync by lazy { WebhooksServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CampaignServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CampaignServiceAsync =
        CampaignServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun participant(): ParticipantServiceAsync = participant

    /** Participant reward retrieval and manual reward operations. */
    override fun reward(): RewardServiceAsync = reward

    /** Affiliate transaction, commission, and payout operations. */
    override fun commission(): CommissionServiceAsync = commission

    /** Campaign reward (`CampaignReward`) configuration operations. */
    override fun rewards(): RewardsServiceAsync = rewards

    /** Program Editor Design tab (`CampaignDesign`) configuration operations. */
    override fun design(): DesignServiceAsync = design

    /** Program Editor Emails tab (`CampaignEmails`) configuration operations. */
    override fun emails(): EmailsServiceAsync = emails

    /** Program Editor Options tab (`CampaignOptions`) configuration operations. */
    override fun options(): OptionsServiceAsync = options

    /** Program Editor Installation tab (`CampaignInstallation`) configuration operations. */
    override fun installation(): InstallationServiceAsync = installation

    /** Program webhook configuration (create, update, delete, and test webhooks). */
    override fun webhooks(): WebhooksServiceAsync = webhooks

    override fun create(
        params: CampaignCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Campaign> =
        // post /campaigns
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: CampaignUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Campaign> =
        // patch /campaign/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun clone(
        params: CampaignCloneParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Campaign> =
        // post /campaign/{id}/clone
        withRawResponse().clone(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: CampaignRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Campaign> =
        // get /campaign/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CampaignListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignListResponse> =
        // get /campaigns
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun getReferralFlowScreenshots(
        params: CampaignGetReferralFlowScreenshotsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReferralFlowScreenshotsResponse> =
        // get /campaign/{id}/referral-flow-screenshots
        withRawResponse().getReferralFlowScreenshots(params, requestOptions).thenApply {
            it.parse()
        }

    override fun createMobileParticipantToken(
        params: CampaignCreateMobileParticipantTokenParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignCreateMobileParticipantTokenResponse> =
        // post /campaign/{id}/mobile-participant-token
        withRawResponse().createMobileParticipantToken(params, requestOptions).thenApply {
            it.parse()
        }

    override fun listCommissions(
        params: CampaignListCommissionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ParticipantCommissionList> =
        // get /campaign/{id}/commissions
        withRawResponse().listCommissions(params, requestOptions).thenApply { it.parse() }

    override fun listLeaderboard(
        params: CampaignListLeaderboardParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ParticipantList> =
        // get /campaign/{id}/leaderboard
        withRawResponse().listLeaderboard(params, requestOptions).thenApply { it.parse() }

    override fun listParticipants(
        params: CampaignListParticipantsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ParticipantList> =
        // get /campaign/{id}/participants
        withRawResponse().listParticipants(params, requestOptions).thenApply { it.parse() }

    override fun listPayouts(
        params: CampaignListPayoutsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ParticipantPayoutList> =
        // get /campaign/{id}/payouts
        withRawResponse().listPayouts(params, requestOptions).thenApply { it.parse() }

    override fun listReferrals(
        params: CampaignListReferralsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReferralList> =
        // get /campaign/{id}/referrals
        withRawResponse().listReferrals(params, requestOptions).thenApply { it.parse() }

    override fun retrieveAnalytics(
        params: CampaignRetrieveAnalyticsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignRetrieveAnalyticsResponse> =
        // get /campaign/{id}/analytics
        withRawResponse().retrieveAnalytics(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CampaignServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val participant: ParticipantServiceAsync.WithRawResponse by lazy {
            ParticipantServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val reward: RewardServiceAsync.WithRawResponse by lazy {
            RewardServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val commission: CommissionServiceAsync.WithRawResponse by lazy {
            CommissionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val rewards: RewardsServiceAsync.WithRawResponse by lazy {
            RewardsServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val design: DesignServiceAsync.WithRawResponse by lazy {
            DesignServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val emails: EmailsServiceAsync.WithRawResponse by lazy {
            EmailsServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val options: OptionsServiceAsync.WithRawResponse by lazy {
            OptionsServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val installation: InstallationServiceAsync.WithRawResponse by lazy {
            InstallationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhooks: WebhooksServiceAsync.WithRawResponse by lazy {
            WebhooksServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CampaignServiceAsync.WithRawResponse =
            CampaignServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun participant(): ParticipantServiceAsync.WithRawResponse = participant

        /** Participant reward retrieval and manual reward operations. */
        override fun reward(): RewardServiceAsync.WithRawResponse = reward

        /** Affiliate transaction, commission, and payout operations. */
        override fun commission(): CommissionServiceAsync.WithRawResponse = commission

        /** Campaign reward (`CampaignReward`) configuration operations. */
        override fun rewards(): RewardsServiceAsync.WithRawResponse = rewards

        /** Program Editor Design tab (`CampaignDesign`) configuration operations. */
        override fun design(): DesignServiceAsync.WithRawResponse = design

        /** Program Editor Emails tab (`CampaignEmails`) configuration operations. */
        override fun emails(): EmailsServiceAsync.WithRawResponse = emails

        /** Program Editor Options tab (`CampaignOptions`) configuration operations. */
        override fun options(): OptionsServiceAsync.WithRawResponse = options

        /** Program Editor Installation tab (`CampaignInstallation`) configuration operations. */
        override fun installation(): InstallationServiceAsync.WithRawResponse = installation

        /** Program webhook configuration (create, update, delete, and test webhooks). */
        override fun webhooks(): WebhooksServiceAsync.WithRawResponse = webhooks

        private val createHandler: Handler<Campaign> =
            jsonHandler<Campaign>(clientOptions.jsonMapper)

        override fun create(
            params: CampaignCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Campaign>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaigns")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<Campaign> =
            jsonHandler<Campaign>(clientOptions.jsonMapper)

        override fun update(
            params: CampaignUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Campaign>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaign", params._pathParam(0))
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

        private val cloneHandler: Handler<Campaign> =
            jsonHandler<Campaign>(clientOptions.jsonMapper)

        override fun clone(
            params: CampaignCloneParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Campaign>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaign", params._pathParam(0), "clone")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { cloneHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<Campaign> =
            jsonHandler<Campaign>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CampaignRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Campaign>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaign", params._pathParam(0))
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

        private val listHandler: Handler<CampaignListResponse> =
            jsonHandler<CampaignListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CampaignListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaigns")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getReferralFlowScreenshotsHandler: Handler<ReferralFlowScreenshotsResponse> =
            jsonHandler<ReferralFlowScreenshotsResponse>(clientOptions.jsonMapper)

        override fun getReferralFlowScreenshots(
            params: CampaignGetReferralFlowScreenshotsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReferralFlowScreenshotsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaign", params._pathParam(0), "referral-flow-screenshots")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getReferralFlowScreenshotsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createMobileParticipantTokenHandler:
            Handler<CampaignCreateMobileParticipantTokenResponse> =
            jsonHandler<CampaignCreateMobileParticipantTokenResponse>(clientOptions.jsonMapper)

        override fun createMobileParticipantToken(
            params: CampaignCreateMobileParticipantTokenParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignCreateMobileParticipantTokenResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaign", params._pathParam(0), "mobile-participant-token")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createMobileParticipantTokenHandler.handle(it) }
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
            params: CampaignListCommissionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ParticipantCommissionList>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaign", params._pathParam(0), "commissions")
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

        private val listLeaderboardHandler: Handler<ParticipantList> =
            jsonHandler<ParticipantList>(clientOptions.jsonMapper)

        override fun listLeaderboard(
            params: CampaignListLeaderboardParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ParticipantList>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaign", params._pathParam(0), "leaderboard")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listLeaderboardHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listParticipantsHandler: Handler<ParticipantList> =
            jsonHandler<ParticipantList>(clientOptions.jsonMapper)

        override fun listParticipants(
            params: CampaignListParticipantsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ParticipantList>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaign", params._pathParam(0), "participants")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listParticipantsHandler.handle(it) }
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
            params: CampaignListPayoutsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ParticipantPayoutList>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaign", params._pathParam(0), "payouts")
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
            params: CampaignListReferralsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReferralList>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaign", params._pathParam(0), "referrals")
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

        private val retrieveAnalyticsHandler: Handler<CampaignRetrieveAnalyticsResponse> =
            jsonHandler<CampaignRetrieveAnalyticsResponse>(clientOptions.jsonMapper)

        override fun retrieveAnalytics(
            params: CampaignRetrieveAnalyticsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveAnalyticsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaign", params._pathParam(0), "analytics")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveAnalyticsHandler.handle(it) }
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
