// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking

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
import com.growsurf.api.models.campaign.ReferralFlowScreenshotsResponse
import com.growsurf.api.models.campaign.ReferralList
import com.growsurf.api.services.blocking.campaign.CommissionService
import com.growsurf.api.services.blocking.campaign.CommissionServiceImpl
import com.growsurf.api.services.blocking.campaign.DesignService
import com.growsurf.api.services.blocking.campaign.DesignServiceImpl
import com.growsurf.api.services.blocking.campaign.EmailsService
import com.growsurf.api.services.blocking.campaign.EmailsServiceImpl
import com.growsurf.api.services.blocking.campaign.InstallationService
import com.growsurf.api.services.blocking.campaign.InstallationServiceImpl
import com.growsurf.api.services.blocking.campaign.OptionsService
import com.growsurf.api.services.blocking.campaign.OptionsServiceImpl
import com.growsurf.api.services.blocking.campaign.ParticipantService
import com.growsurf.api.services.blocking.campaign.ParticipantServiceImpl
import com.growsurf.api.services.blocking.campaign.RewardService
import com.growsurf.api.services.blocking.campaign.RewardServiceImpl
import com.growsurf.api.services.blocking.campaign.RewardsService
import com.growsurf.api.services.blocking.campaign.RewardsServiceImpl
import com.growsurf.api.services.blocking.campaign.WebhooksService
import com.growsurf.api.services.blocking.campaign.WebhooksServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CampaignServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CampaignService {

    private val withRawResponse: CampaignService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val participant: ParticipantService by lazy { ParticipantServiceImpl(clientOptions) }

    private val reward: RewardService by lazy { RewardServiceImpl(clientOptions) }

    private val commission: CommissionService by lazy { CommissionServiceImpl(clientOptions) }

    private val rewards: RewardsService by lazy { RewardsServiceImpl(clientOptions) }

    private val design: DesignService by lazy { DesignServiceImpl(clientOptions) }

    private val emails: EmailsService by lazy { EmailsServiceImpl(clientOptions) }

    private val options: OptionsService by lazy { OptionsServiceImpl(clientOptions) }

    private val installation: InstallationService by lazy { InstallationServiceImpl(clientOptions) }

    private val webhooks: WebhooksService by lazy { WebhooksServiceImpl(clientOptions) }

    override fun withRawResponse(): CampaignService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CampaignService =
        CampaignServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun participant(): ParticipantService = participant

    /** Participant reward retrieval and manual reward operations. */
    override fun reward(): RewardService = reward

    /** Affiliate transaction, commission, and payout operations. */
    override fun commission(): CommissionService = commission

    /** Campaign reward (`CampaignReward`) configuration operations. */
    override fun rewards(): RewardsService = rewards

    /** Program Editor Design tab (`CampaignDesign`) configuration operations. */
    override fun design(): DesignService = design

    /** Program Editor Emails tab (`CampaignEmails`) configuration operations. */
    override fun emails(): EmailsService = emails

    /** Program Editor Options tab (`CampaignOptions`) configuration operations. */
    override fun options(): OptionsService = options

    /** Program Editor Installation tab (`CampaignInstallation`) configuration operations. */
    override fun installation(): InstallationService = installation

    /** Program webhook configuration (create, update, delete, and test webhooks). */
    override fun webhooks(): WebhooksService = webhooks

    override fun create(params: CampaignCreateParams, requestOptions: RequestOptions): Campaign =
        // post /campaigns
        withRawResponse().create(params, requestOptions).parse()

    override fun update(params: CampaignUpdateParams, requestOptions: RequestOptions): Campaign =
        // patch /campaign/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun clone(params: CampaignCloneParams, requestOptions: RequestOptions): Campaign =
        // post /campaign/{id}/clone
        withRawResponse().clone(params, requestOptions).parse()

    override fun retrieve(
        params: CampaignRetrieveParams,
        requestOptions: RequestOptions,
    ): Campaign =
        // get /campaign/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: CampaignListParams,
        requestOptions: RequestOptions,
    ): CampaignListResponse =
        // get /campaigns
        withRawResponse().list(params, requestOptions).parse()

    override fun getReferralFlowScreenshots(
        params: CampaignGetReferralFlowScreenshotsParams,
        requestOptions: RequestOptions,
    ): ReferralFlowScreenshotsResponse =
        // get /campaign/{id}/referral-flow-screenshots
        withRawResponse().getReferralFlowScreenshots(params, requestOptions).parse()

    override fun createMobileParticipantToken(
        params: CampaignCreateMobileParticipantTokenParams,
        requestOptions: RequestOptions,
    ): CampaignCreateMobileParticipantTokenResponse =
        // post /campaign/{id}/mobile-participant-token
        withRawResponse().createMobileParticipantToken(params, requestOptions).parse()

    override fun listCommissions(
        params: CampaignListCommissionsParams,
        requestOptions: RequestOptions,
    ): ParticipantCommissionList =
        // get /campaign/{id}/commissions
        withRawResponse().listCommissions(params, requestOptions).parse()

    override fun listLeaderboard(
        params: CampaignListLeaderboardParams,
        requestOptions: RequestOptions,
    ): ParticipantList =
        // get /campaign/{id}/leaderboard
        withRawResponse().listLeaderboard(params, requestOptions).parse()

    override fun listParticipants(
        params: CampaignListParticipantsParams,
        requestOptions: RequestOptions,
    ): ParticipantList =
        // get /campaign/{id}/participants
        withRawResponse().listParticipants(params, requestOptions).parse()

    override fun listPayouts(
        params: CampaignListPayoutsParams,
        requestOptions: RequestOptions,
    ): ParticipantPayoutList =
        // get /campaign/{id}/payouts
        withRawResponse().listPayouts(params, requestOptions).parse()

    override fun listReferrals(
        params: CampaignListReferralsParams,
        requestOptions: RequestOptions,
    ): ReferralList =
        // get /campaign/{id}/referrals
        withRawResponse().listReferrals(params, requestOptions).parse()

    override fun retrieveAnalytics(
        params: CampaignRetrieveAnalyticsParams,
        requestOptions: RequestOptions,
    ): CampaignRetrieveAnalyticsResponse =
        // get /campaign/{id}/analytics
        withRawResponse().retrieveAnalytics(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CampaignService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val participant: ParticipantService.WithRawResponse by lazy {
            ParticipantServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val reward: RewardService.WithRawResponse by lazy {
            RewardServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val commission: CommissionService.WithRawResponse by lazy {
            CommissionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val rewards: RewardsService.WithRawResponse by lazy {
            RewardsServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val design: DesignService.WithRawResponse by lazy {
            DesignServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val emails: EmailsService.WithRawResponse by lazy {
            EmailsServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val options: OptionsService.WithRawResponse by lazy {
            OptionsServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val installation: InstallationService.WithRawResponse by lazy {
            InstallationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhooks: WebhooksService.WithRawResponse by lazy {
            WebhooksServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CampaignService.WithRawResponse =
            CampaignServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun participant(): ParticipantService.WithRawResponse = participant

        /** Participant reward retrieval and manual reward operations. */
        override fun reward(): RewardService.WithRawResponse = reward

        /** Affiliate transaction, commission, and payout operations. */
        override fun commission(): CommissionService.WithRawResponse = commission

        /** Campaign reward (`CampaignReward`) configuration operations. */
        override fun rewards(): RewardsService.WithRawResponse = rewards

        /** Program Editor Design tab (`CampaignDesign`) configuration operations. */
        override fun design(): DesignService.WithRawResponse = design

        /** Program Editor Emails tab (`CampaignEmails`) configuration operations. */
        override fun emails(): EmailsService.WithRawResponse = emails

        /** Program Editor Options tab (`CampaignOptions`) configuration operations. */
        override fun options(): OptionsService.WithRawResponse = options

        /** Program Editor Installation tab (`CampaignInstallation`) configuration operations. */
        override fun installation(): InstallationService.WithRawResponse = installation

        /** Program webhook configuration (create, update, delete, and test webhooks). */
        override fun webhooks(): WebhooksService.WithRawResponse = webhooks

        private val createHandler: Handler<Campaign> =
            jsonHandler<Campaign>(clientOptions.jsonMapper)

        override fun create(
            params: CampaignCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Campaign> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaigns")
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

        private val updateHandler: Handler<Campaign> =
            jsonHandler<Campaign>(clientOptions.jsonMapper)

        override fun update(
            params: CampaignUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Campaign> {
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

        private val cloneHandler: Handler<Campaign> =
            jsonHandler<Campaign>(clientOptions.jsonMapper)

        override fun clone(
            params: CampaignCloneParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Campaign> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cloneHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<Campaign> =
            jsonHandler<Campaign>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CampaignRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Campaign> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaign", params._pathParam(0))
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

        private val listHandler: Handler<CampaignListResponse> =
            jsonHandler<CampaignListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CampaignListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaigns")
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

        private val getReferralFlowScreenshotsHandler: Handler<ReferralFlowScreenshotsResponse> =
            jsonHandler<ReferralFlowScreenshotsResponse>(clientOptions.jsonMapper)

        override fun getReferralFlowScreenshots(
            params: CampaignGetReferralFlowScreenshotsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReferralFlowScreenshotsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaign", params._pathParam(0), "referral-flow-screenshots")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getReferralFlowScreenshotsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<CampaignCreateMobileParticipantTokenResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createMobileParticipantTokenHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listCommissionsHandler: Handler<ParticipantCommissionList> =
            jsonHandler<ParticipantCommissionList>(clientOptions.jsonMapper)

        override fun listCommissions(
            params: CampaignListCommissionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ParticipantCommissionList> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaign", params._pathParam(0), "commissions")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listCommissionsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listLeaderboardHandler: Handler<ParticipantList> =
            jsonHandler<ParticipantList>(clientOptions.jsonMapper)

        override fun listLeaderboard(
            params: CampaignListLeaderboardParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ParticipantList> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaign", params._pathParam(0), "leaderboard")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listLeaderboardHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listParticipantsHandler: Handler<ParticipantList> =
            jsonHandler<ParticipantList>(clientOptions.jsonMapper)

        override fun listParticipants(
            params: CampaignListParticipantsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ParticipantList> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaign", params._pathParam(0), "participants")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listParticipantsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listPayoutsHandler: Handler<ParticipantPayoutList> =
            jsonHandler<ParticipantPayoutList>(clientOptions.jsonMapper)

        override fun listPayouts(
            params: CampaignListPayoutsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ParticipantPayoutList> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaign", params._pathParam(0), "payouts")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listPayoutsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listReferralsHandler: Handler<ReferralList> =
            jsonHandler<ReferralList>(clientOptions.jsonMapper)

        override fun listReferrals(
            params: CampaignListReferralsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReferralList> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaign", params._pathParam(0), "referrals")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listReferralsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveAnalyticsHandler: Handler<CampaignRetrieveAnalyticsResponse> =
            jsonHandler<CampaignRetrieveAnalyticsResponse>(clientOptions.jsonMapper)

        override fun retrieveAnalytics(
            params: CampaignRetrieveAnalyticsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignRetrieveAnalyticsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaign", params._pathParam(0), "analytics")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
