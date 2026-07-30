// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.async

import com.growsurf.api.core.ClientOptions
import com.growsurf.api.core.RequestOptions
import com.growsurf.api.core.http.HttpResponseFor
import com.growsurf.api.models.campaign.AffiliateApplication
import com.growsurf.api.models.campaign.AffiliateApplicationListResponse
import com.growsurf.api.models.campaign.AffiliateInvite
import com.growsurf.api.models.campaign.AffiliateInviteListResponse
import com.growsurf.api.models.campaign.Campaign
import com.growsurf.api.models.campaign.CampaignCloneParams
import com.growsurf.api.models.campaign.CampaignCreateAffiliateInviteParams
import com.growsurf.api.models.campaign.CampaignCreateMobileParticipantTokenParams
import com.growsurf.api.models.campaign.CampaignCreateMobileParticipantTokenResponse
import com.growsurf.api.models.campaign.CampaignCreateParams
import com.growsurf.api.models.campaign.CampaignListAffiliateApplicationsParams
import com.growsurf.api.models.campaign.CampaignListAffiliateInvitesParams
import com.growsurf.api.models.campaign.CampaignListCommissionsParams
import com.growsurf.api.models.campaign.CampaignListLeaderboardParams
import com.growsurf.api.models.campaign.CampaignListParams
import com.growsurf.api.models.campaign.CampaignListParticipantsParams
import com.growsurf.api.models.campaign.CampaignListPayoutsParams
import com.growsurf.api.models.campaign.CampaignListReferralsParams
import com.growsurf.api.models.campaign.CampaignListResponse
import com.growsurf.api.models.campaign.CampaignResendAffiliateInviteParams
import com.growsurf.api.models.campaign.CampaignRetrieveAffiliateApplicationParams
import com.growsurf.api.models.campaign.CampaignRetrieveAnalyticsParams
import com.growsurf.api.models.campaign.CampaignRetrieveAnalyticsResponse
import com.growsurf.api.models.campaign.CampaignRetrieveParams
import com.growsurf.api.models.campaign.CampaignReviewAffiliateApplicationParams
import com.growsurf.api.models.campaign.CampaignRevokeAffiliateInviteParams
import com.growsurf.api.models.campaign.CampaignUpdateParams
import com.growsurf.api.models.campaign.ParticipantCommissionList
import com.growsurf.api.models.campaign.ParticipantList
import com.growsurf.api.models.campaign.ParticipantPayoutList
import com.growsurf.api.models.campaign.ReferralList
import com.growsurf.api.services.async.campaign.CommissionServiceAsync
import com.growsurf.api.services.async.campaign.DesignServiceAsync
import com.growsurf.api.services.async.campaign.EmailsServiceAsync
import com.growsurf.api.services.async.campaign.InstallationServiceAsync
import com.growsurf.api.services.async.campaign.OptionsServiceAsync
import com.growsurf.api.services.async.campaign.ParticipantServiceAsync
import com.growsurf.api.services.async.campaign.RewardServiceAsync
import com.growsurf.api.services.async.campaign.RewardsServiceAsync
import com.growsurf.api.services.async.campaign.WebhooksServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CampaignServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CampaignServiceAsync

    fun participant(): ParticipantServiceAsync

    /** Participant reward retrieval and manual reward operations. */
    fun reward(): RewardServiceAsync

    /** Affiliate transaction, commission, and payout operations. */
    fun commission(): CommissionServiceAsync

    /** Campaign reward (`CampaignReward`) configuration operations. */
    fun rewards(): RewardsServiceAsync

    /** Program Editor Design tab (`CampaignDesign`) configuration operations. */
    fun design(): DesignServiceAsync

    /** Program Editor Emails tab (`CampaignEmails`) configuration operations. */
    fun emails(): EmailsServiceAsync

    /** Program Editor Options tab (`CampaignOptions`) configuration operations. */
    fun options(): OptionsServiceAsync

    /** Program Editor Installation tab (`CampaignInstallation`) configuration operations. */
    fun installation(): InstallationServiceAsync

    /** Program webhook configuration (create, update, delete, and test webhooks). */
    fun webhooks(): WebhooksServiceAsync

    /**
     * Creates a new program, plus any optional campaign rewards. The new program is created in
     * `DRAFT` status and owned by the API key's bound team.
     */
    fun create(params: CampaignCreateParams): CompletableFuture<Campaign> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CampaignCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Campaign>

    /**
     * Updates a program's identity and lifecycle. Only the fields you send are changed. `type`,
     * `urlId`, and `currencyISO` are immutable. Editor-tab configuration (design, emails, options,
     * installation) is edited via the dedicated config sub-resources, not here. The program cannot
     * be deleted via this endpoint.
     */
    fun update(id: String): CompletableFuture<Campaign> = update(id, CampaignUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: CampaignUpdateParams = CampaignUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Campaign> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: CampaignUpdateParams = CampaignUpdateParams.none(),
    ): CompletableFuture<Campaign> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CampaignUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Campaign>

    /** @see update */
    fun update(params: CampaignUpdateParams): CompletableFuture<Campaign> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<Campaign> =
        update(id, CampaignUpdateParams.none(), requestOptions)

    /**
     * Clones an existing program into a new `DRAFT` program. Integrations and credentials are not
     * copied; active rewards are cloned.
     */
    fun clone(id: String): CompletableFuture<Campaign> = clone(id, CampaignCloneParams.none())

    /** @see clone */
    fun clone(
        id: String,
        params: CampaignCloneParams = CampaignCloneParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Campaign> = clone(params.toBuilder().id(id).build(), requestOptions)

    /** @see clone */
    fun clone(
        id: String,
        params: CampaignCloneParams = CampaignCloneParams.none(),
    ): CompletableFuture<Campaign> = clone(id, params, RequestOptions.none())

    /** @see clone */
    fun clone(
        params: CampaignCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Campaign>

    /** @see clone */
    fun clone(params: CampaignCloneParams): CompletableFuture<Campaign> =
        clone(params, RequestOptions.none())

    /** @see clone */
    fun clone(id: String, requestOptions: RequestOptions): CompletableFuture<Campaign> =
        clone(id, CampaignCloneParams.none(), requestOptions)

    /** Retrieves a program for the given program ID. */
    fun retrieve(id: String): CompletableFuture<Campaign> =
        retrieve(id, CampaignRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CampaignRetrieveParams = CampaignRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Campaign> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CampaignRetrieveParams = CampaignRetrieveParams.none(),
    ): CompletableFuture<Campaign> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CampaignRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Campaign>

    /** @see retrieve */
    fun retrieve(params: CampaignRetrieveParams): CompletableFuture<Campaign> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Campaign> =
        retrieve(id, CampaignRetrieveParams.none(), requestOptions)

    /** Retrieves a list of your programs. Deleted programs are not returned. */
    fun list(): CompletableFuture<CampaignListResponse> = list(CampaignListParams.none())

    /** @see list */
    fun list(
        params: CampaignListParams = CampaignListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignListResponse>

    /** @see list */
    fun list(
        params: CampaignListParams = CampaignListParams.none()
    ): CompletableFuture<CampaignListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CampaignListResponse> =
        list(CampaignListParams.none(), requestOptions)

    /**
     * Creates or returns a participant using the same input behavior as Add Participant, then
     * returns a participant-scoped token for GrowSurf mobile SDK participant endpoints. Use this
     * endpoint from your backend after your mobile app authenticates a signed-in user. The program
     * must have mobile SDK access enabled.
     */
    fun createMobileParticipantToken(
        id: String,
        params: CampaignCreateMobileParticipantTokenParams,
    ): CompletableFuture<CampaignCreateMobileParticipantTokenResponse> =
        createMobileParticipantToken(id, params, RequestOptions.none())

    /** @see createMobileParticipantToken */
    fun createMobileParticipantToken(
        id: String,
        params: CampaignCreateMobileParticipantTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignCreateMobileParticipantTokenResponse> =
        createMobileParticipantToken(params.toBuilder().id(id).build(), requestOptions)

    /** @see createMobileParticipantToken */
    fun createMobileParticipantToken(
        params: CampaignCreateMobileParticipantTokenParams
    ): CompletableFuture<CampaignCreateMobileParticipantTokenResponse> =
        createMobileParticipantToken(params, RequestOptions.none())

    /** @see createMobileParticipantToken */
    fun createMobileParticipantToken(
        params: CampaignCreateMobileParticipantTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignCreateMobileParticipantTokenResponse>

    /**
     * **Affiliate programs only.** Retrieves a paged list of all participant commissions in an
     * affiliate program.
     */
    fun listCommissions(id: String): CompletableFuture<ParticipantCommissionList> =
        listCommissions(id, CampaignListCommissionsParams.none())

    /** @see listCommissions */
    fun listCommissions(
        id: String,
        params: CampaignListCommissionsParams = CampaignListCommissionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantCommissionList> =
        listCommissions(params.toBuilder().id(id).build(), requestOptions)

    /** @see listCommissions */
    fun listCommissions(
        id: String,
        params: CampaignListCommissionsParams = CampaignListCommissionsParams.none(),
    ): CompletableFuture<ParticipantCommissionList> =
        listCommissions(id, params, RequestOptions.none())

    /** @see listCommissions */
    fun listCommissions(
        params: CampaignListCommissionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantCommissionList>

    /** @see listCommissions */
    fun listCommissions(
        params: CampaignListCommissionsParams
    ): CompletableFuture<ParticipantCommissionList> = listCommissions(params, RequestOptions.none())

    /** @see listCommissions */
    fun listCommissions(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ParticipantCommissionList> =
        listCommissions(id, CampaignListCommissionsParams.none(), requestOptions)

    /** Retrieves participants in leaderboard order for the specified leaderboard type. */
    fun listLeaderboard(id: String): CompletableFuture<ParticipantList> =
        listLeaderboard(id, CampaignListLeaderboardParams.none())

    /** @see listLeaderboard */
    fun listLeaderboard(
        id: String,
        params: CampaignListLeaderboardParams = CampaignListLeaderboardParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantList> =
        listLeaderboard(params.toBuilder().id(id).build(), requestOptions)

    /** @see listLeaderboard */
    fun listLeaderboard(
        id: String,
        params: CampaignListLeaderboardParams = CampaignListLeaderboardParams.none(),
    ): CompletableFuture<ParticipantList> = listLeaderboard(id, params, RequestOptions.none())

    /** @see listLeaderboard */
    fun listLeaderboard(
        params: CampaignListLeaderboardParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantList>

    /** @see listLeaderboard */
    fun listLeaderboard(params: CampaignListLeaderboardParams): CompletableFuture<ParticipantList> =
        listLeaderboard(params, RequestOptions.none())

    /** @see listLeaderboard */
    fun listLeaderboard(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ParticipantList> =
        listLeaderboard(id, CampaignListLeaderboardParams.none(), requestOptions)

    /** Retrieves a paged list of participants in a program. */
    fun listParticipants(id: String): CompletableFuture<ParticipantList> =
        listParticipants(id, CampaignListParticipantsParams.none())

    /** @see listParticipants */
    fun listParticipants(
        id: String,
        params: CampaignListParticipantsParams = CampaignListParticipantsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantList> =
        listParticipants(params.toBuilder().id(id).build(), requestOptions)

    /** @see listParticipants */
    fun listParticipants(
        id: String,
        params: CampaignListParticipantsParams = CampaignListParticipantsParams.none(),
    ): CompletableFuture<ParticipantList> = listParticipants(id, params, RequestOptions.none())

    /** @see listParticipants */
    fun listParticipants(
        params: CampaignListParticipantsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantList>

    /** @see listParticipants */
    fun listParticipants(
        params: CampaignListParticipantsParams
    ): CompletableFuture<ParticipantList> = listParticipants(params, RequestOptions.none())

    /** @see listParticipants */
    fun listParticipants(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ParticipantList> =
        listParticipants(id, CampaignListParticipantsParams.none(), requestOptions)

    /**
     * **Affiliate programs only.** Retrieves a paged list of all participant payouts in an
     * affiliate program.
     */
    fun listPayouts(id: String): CompletableFuture<ParticipantPayoutList> =
        listPayouts(id, CampaignListPayoutsParams.none())

    /** @see listPayouts */
    fun listPayouts(
        id: String,
        params: CampaignListPayoutsParams = CampaignListPayoutsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantPayoutList> =
        listPayouts(params.toBuilder().id(id).build(), requestOptions)

    /** @see listPayouts */
    fun listPayouts(
        id: String,
        params: CampaignListPayoutsParams = CampaignListPayoutsParams.none(),
    ): CompletableFuture<ParticipantPayoutList> = listPayouts(id, params, RequestOptions.none())

    /** @see listPayouts */
    fun listPayouts(
        params: CampaignListPayoutsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantPayoutList>

    /** @see listPayouts */
    fun listPayouts(params: CampaignListPayoutsParams): CompletableFuture<ParticipantPayoutList> =
        listPayouts(params, RequestOptions.none())

    /** @see listPayouts */
    fun listPayouts(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ParticipantPayoutList> =
        listPayouts(id, CampaignListPayoutsParams.none(), requestOptions)

    /** Retrieves a list of all referrals and email invites made by participants in a program. */
    fun listReferrals(id: String): CompletableFuture<ReferralList> =
        listReferrals(id, CampaignListReferralsParams.none())

    /** @see listReferrals */
    fun listReferrals(
        id: String,
        params: CampaignListReferralsParams = CampaignListReferralsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReferralList> =
        listReferrals(params.toBuilder().id(id).build(), requestOptions)

    /** @see listReferrals */
    fun listReferrals(
        id: String,
        params: CampaignListReferralsParams = CampaignListReferralsParams.none(),
    ): CompletableFuture<ReferralList> = listReferrals(id, params, RequestOptions.none())

    /** @see listReferrals */
    fun listReferrals(
        params: CampaignListReferralsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReferralList>

    /** @see listReferrals */
    fun listReferrals(params: CampaignListReferralsParams): CompletableFuture<ReferralList> =
        listReferrals(params, RequestOptions.none())

    /** @see listReferrals */
    fun listReferrals(id: String, requestOptions: RequestOptions): CompletableFuture<ReferralList> =
        listReferrals(id, CampaignListReferralsParams.none(), requestOptions)

    /**
     * Retrieves analytics for a program. Pass `interval` to also get a time-series (`series`)
     * alongside the totals, and `include` to add previous-period totals, status breakdowns, derived
     * rates, or email performance. Add `email` to `include` for `sent` (accepted for delivery),
     * `delivered`, `opened`, `clicked`, `bounced`, and `spamComplaints` metrics plus per-email-type
     * breakdowns. Email rates are ratios from `0` to `1`, and `isPartial` identifies windows that
     * begin before complete coverage.
     */
    fun retrieveAnalytics(id: String): CompletableFuture<CampaignRetrieveAnalyticsResponse> =
        retrieveAnalytics(id, CampaignRetrieveAnalyticsParams.none())

    /** @see retrieveAnalytics */
    fun retrieveAnalytics(
        id: String,
        params: CampaignRetrieveAnalyticsParams = CampaignRetrieveAnalyticsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignRetrieveAnalyticsResponse> =
        retrieveAnalytics(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveAnalytics */
    fun retrieveAnalytics(
        id: String,
        params: CampaignRetrieveAnalyticsParams = CampaignRetrieveAnalyticsParams.none(),
    ): CompletableFuture<CampaignRetrieveAnalyticsResponse> =
        retrieveAnalytics(id, params, RequestOptions.none())

    /** @see retrieveAnalytics */
    fun retrieveAnalytics(
        params: CampaignRetrieveAnalyticsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignRetrieveAnalyticsResponse>

    /** @see retrieveAnalytics */
    fun retrieveAnalytics(
        params: CampaignRetrieveAnalyticsParams
    ): CompletableFuture<CampaignRetrieveAnalyticsResponse> =
        retrieveAnalytics(params, RequestOptions.none())

    /** @see retrieveAnalytics */
    fun retrieveAnalytics(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignRetrieveAnalyticsResponse> =
        retrieveAnalytics(id, CampaignRetrieveAnalyticsParams.none(), requestOptions)

    /**
     * Lists an affiliate program's applications, newest first. Applications exist on programs that
     * review public signups (an `affiliateApplicationMode` of `MANUAL_REVIEW` or `AUTO_APPROVE`). A
     * pending applicant is not a participant until their application is approved.
     */
    fun listAffiliateApplications(id: String): CompletableFuture<AffiliateApplicationListResponse> =
        listAffiliateApplications(id, CampaignListAffiliateApplicationsParams.none())

    /** @see listAffiliateApplications */
    fun listAffiliateApplications(
        id: String,
        params: CampaignListAffiliateApplicationsParams =
            CampaignListAffiliateApplicationsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AffiliateApplicationListResponse> =
        listAffiliateApplications(params.toBuilder().id(id).build(), requestOptions)

    /** @see listAffiliateApplications */
    fun listAffiliateApplications(
        id: String,
        params: CampaignListAffiliateApplicationsParams =
            CampaignListAffiliateApplicationsParams.none(),
    ): CompletableFuture<AffiliateApplicationListResponse> =
        listAffiliateApplications(id, params, RequestOptions.none())

    /** @see listAffiliateApplications */
    fun listAffiliateApplications(
        params: CampaignListAffiliateApplicationsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AffiliateApplicationListResponse>

    /** @see listAffiliateApplications */
    fun listAffiliateApplications(
        params: CampaignListAffiliateApplicationsParams
    ): CompletableFuture<AffiliateApplicationListResponse> =
        listAffiliateApplications(params, RequestOptions.none())

    /** @see listAffiliateApplications */
    fun listAffiliateApplications(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AffiliateApplicationListResponse> =
        listAffiliateApplications(
            id,
            CampaignListAffiliateApplicationsParams.none(),
            requestOptions,
        )

    /** Returns one affiliate application, including its submitted form answers. */
    fun retrieveAffiliateApplication(
        id: String,
        params: CampaignRetrieveAffiliateApplicationParams,
    ): CompletableFuture<AffiliateApplication> =
        retrieveAffiliateApplication(id, params, RequestOptions.none())

    /** @see retrieveAffiliateApplication */
    fun retrieveAffiliateApplication(
        id: String,
        params: CampaignRetrieveAffiliateApplicationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AffiliateApplication> =
        retrieveAffiliateApplication(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveAffiliateApplication */
    fun retrieveAffiliateApplication(
        params: CampaignRetrieveAffiliateApplicationParams
    ): CompletableFuture<AffiliateApplication> =
        retrieveAffiliateApplication(params, RequestOptions.none())

    /** @see retrieveAffiliateApplication */
    fun retrieveAffiliateApplication(
        params: CampaignRetrieveAffiliateApplicationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AffiliateApplication>

    /**
     * Decides a pending application. Set `status` to `APPROVED` to enroll the applicant (this
     * creates the participant, or upgrades an existing participant with the same email), or to
     * `DENIED` with an optional `rejectionReason`. A denied applicant may reapply after the
     * program's reapplication cooldown; send an earlier `reapplyAllowedAt` (without `status`) to
     * shorten that wait for one applicant. Provide exactly one of `status` or `reapplyAllowedAt`.
     * Denial-only fields are only valid with `status` set to `DENIED`. Approval is idempotent:
     * repeating it returns the same participant.
     */
    fun reviewAffiliateApplication(
        id: String,
        params: CampaignReviewAffiliateApplicationParams,
    ): CompletableFuture<AffiliateApplication> =
        reviewAffiliateApplication(id, params, RequestOptions.none())

    /** @see reviewAffiliateApplication */
    fun reviewAffiliateApplication(
        id: String,
        params: CampaignReviewAffiliateApplicationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AffiliateApplication> =
        reviewAffiliateApplication(params.toBuilder().id(id).build(), requestOptions)

    /** @see reviewAffiliateApplication */
    fun reviewAffiliateApplication(
        params: CampaignReviewAffiliateApplicationParams
    ): CompletableFuture<AffiliateApplication> =
        reviewAffiliateApplication(params, RequestOptions.none())

    /** @see reviewAffiliateApplication */
    fun reviewAffiliateApplication(
        params: CampaignReviewAffiliateApplicationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AffiliateApplication>

    /** Lists an affiliate program's enrollment invites, newest first. */
    fun listAffiliateInvites(id: String): CompletableFuture<AffiliateInviteListResponse> =
        listAffiliateInvites(id, CampaignListAffiliateInvitesParams.none())

    /** @see listAffiliateInvites */
    fun listAffiliateInvites(
        id: String,
        params: CampaignListAffiliateInvitesParams = CampaignListAffiliateInvitesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AffiliateInviteListResponse> =
        listAffiliateInvites(params.toBuilder().id(id).build(), requestOptions)

    /** @see listAffiliateInvites */
    fun listAffiliateInvites(
        id: String,
        params: CampaignListAffiliateInvitesParams = CampaignListAffiliateInvitesParams.none(),
    ): CompletableFuture<AffiliateInviteListResponse> =
        listAffiliateInvites(id, params, RequestOptions.none())

    /** @see listAffiliateInvites */
    fun listAffiliateInvites(
        params: CampaignListAffiliateInvitesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AffiliateInviteListResponse>

    /** @see listAffiliateInvites */
    fun listAffiliateInvites(
        params: CampaignListAffiliateInvitesParams
    ): CompletableFuture<AffiliateInviteListResponse> =
        listAffiliateInvites(params, RequestOptions.none())

    /** @see listAffiliateInvites */
    fun listAffiliateInvites(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AffiliateInviteListResponse> =
        listAffiliateInvites(id, CampaignListAffiliateInvitesParams.none(), requestOptions)

    /**
     * Invites someone to join the affiliate program. GrowSurf emails them a single-use accept link;
     * accepting it enrolls them as an approved affiliate without going through the public
     * application. One active invite can exist per email address.
     */
    fun createAffiliateInvite(
        id: String,
        params: CampaignCreateAffiliateInviteParams,
    ): CompletableFuture<AffiliateInvite> = createAffiliateInvite(id, params, RequestOptions.none())

    /** @see createAffiliateInvite */
    fun createAffiliateInvite(
        id: String,
        params: CampaignCreateAffiliateInviteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AffiliateInvite> =
        createAffiliateInvite(params.toBuilder().id(id).build(), requestOptions)

    /** @see createAffiliateInvite */
    fun createAffiliateInvite(
        params: CampaignCreateAffiliateInviteParams
    ): CompletableFuture<AffiliateInvite> = createAffiliateInvite(params, RequestOptions.none())

    /** @see createAffiliateInvite */
    fun createAffiliateInvite(
        params: CampaignCreateAffiliateInviteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AffiliateInvite>

    /** Revokes a pending invite. Its emailed accept link stops working immediately. */
    fun revokeAffiliateInvite(
        id: String,
        params: CampaignRevokeAffiliateInviteParams,
    ): CompletableFuture<AffiliateInvite> = revokeAffiliateInvite(id, params, RequestOptions.none())

    /** @see revokeAffiliateInvite */
    fun revokeAffiliateInvite(
        id: String,
        params: CampaignRevokeAffiliateInviteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AffiliateInvite> =
        revokeAffiliateInvite(params.toBuilder().id(id).build(), requestOptions)

    /** @see revokeAffiliateInvite */
    fun revokeAffiliateInvite(
        params: CampaignRevokeAffiliateInviteParams
    ): CompletableFuture<AffiliateInvite> = revokeAffiliateInvite(params, RequestOptions.none())

    /** @see revokeAffiliateInvite */
    fun revokeAffiliateInvite(
        params: CampaignRevokeAffiliateInviteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AffiliateInvite>

    /**
     * Re-sends a pending invite with a fresh accept link (the previous link stops working). Resends
     * are rate limited per invite; retry after a few minutes if a resend was just sent.
     */
    fun resendAffiliateInvite(
        id: String,
        params: CampaignResendAffiliateInviteParams,
    ): CompletableFuture<AffiliateInvite> = resendAffiliateInvite(id, params, RequestOptions.none())

    /** @see resendAffiliateInvite */
    fun resendAffiliateInvite(
        id: String,
        params: CampaignResendAffiliateInviteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AffiliateInvite> =
        resendAffiliateInvite(params.toBuilder().id(id).build(), requestOptions)

    /** @see resendAffiliateInvite */
    fun resendAffiliateInvite(
        params: CampaignResendAffiliateInviteParams
    ): CompletableFuture<AffiliateInvite> = resendAffiliateInvite(params, RequestOptions.none())

    /** @see resendAffiliateInvite */
    fun resendAffiliateInvite(
        params: CampaignResendAffiliateInviteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AffiliateInvite>

    /**
     * A view of [CampaignServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CampaignServiceAsync.WithRawResponse

        fun participant(): ParticipantServiceAsync.WithRawResponse

        /** Participant reward retrieval and manual reward operations. */
        fun reward(): RewardServiceAsync.WithRawResponse

        /** Affiliate transaction, commission, and payout operations. */
        fun commission(): CommissionServiceAsync.WithRawResponse

        /** Campaign reward (`CampaignReward`) configuration operations. */
        fun rewards(): RewardsServiceAsync.WithRawResponse

        /** Program Editor Design tab (`CampaignDesign`) configuration operations. */
        fun design(): DesignServiceAsync.WithRawResponse

        /** Program Editor Emails tab (`CampaignEmails`) configuration operations. */
        fun emails(): EmailsServiceAsync.WithRawResponse

        /** Program Editor Options tab (`CampaignOptions`) configuration operations. */
        fun options(): OptionsServiceAsync.WithRawResponse

        /** Program Editor Installation tab (`CampaignInstallation`) configuration operations. */
        fun installation(): InstallationServiceAsync.WithRawResponse

        /** Program webhook configuration (create, update, delete, and test webhooks). */
        fun webhooks(): WebhooksServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /campaigns`, but is otherwise the same as
         * [CampaignServiceAsync.create].
         */
        fun create(params: CampaignCreateParams): CompletableFuture<HttpResponseFor<Campaign>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CampaignCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Campaign>>

        /**
         * Returns a raw HTTP response for `patch /campaign/{id}`, but is otherwise the same as
         * [CampaignServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<Campaign>> =
            update(id, CampaignUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: CampaignUpdateParams = CampaignUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Campaign>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: CampaignUpdateParams = CampaignUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Campaign>> = update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CampaignUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Campaign>>

        /** @see update */
        fun update(params: CampaignUpdateParams): CompletableFuture<HttpResponseFor<Campaign>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Campaign>> =
            update(id, CampaignUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /campaign/{id}/clone`, but is otherwise the same as
         * [CampaignServiceAsync.clone].
         */
        fun clone(id: String): CompletableFuture<HttpResponseFor<Campaign>> =
            clone(id, CampaignCloneParams.none())

        /** @see clone */
        fun clone(
            id: String,
            params: CampaignCloneParams = CampaignCloneParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Campaign>> =
            clone(params.toBuilder().id(id).build(), requestOptions)

        /** @see clone */
        fun clone(
            id: String,
            params: CampaignCloneParams = CampaignCloneParams.none(),
        ): CompletableFuture<HttpResponseFor<Campaign>> = clone(id, params, RequestOptions.none())

        /** @see clone */
        fun clone(
            params: CampaignCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Campaign>>

        /** @see clone */
        fun clone(params: CampaignCloneParams): CompletableFuture<HttpResponseFor<Campaign>> =
            clone(params, RequestOptions.none())

        /** @see clone */
        fun clone(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Campaign>> =
            clone(id, CampaignCloneParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /campaign/{id}`, but is otherwise the same as
         * [CampaignServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<Campaign>> =
            retrieve(id, CampaignRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CampaignRetrieveParams = CampaignRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Campaign>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CampaignRetrieveParams = CampaignRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Campaign>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CampaignRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Campaign>>

        /** @see retrieve */
        fun retrieve(params: CampaignRetrieveParams): CompletableFuture<HttpResponseFor<Campaign>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Campaign>> =
            retrieve(id, CampaignRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /campaigns`, but is otherwise the same as
         * [CampaignServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CampaignListResponse>> =
            list(CampaignListParams.none())

        /** @see list */
        fun list(
            params: CampaignListParams = CampaignListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignListResponse>>

        /** @see list */
        fun list(
            params: CampaignListParams = CampaignListParams.none()
        ): CompletableFuture<HttpResponseFor<CampaignListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CampaignListResponse>> =
            list(CampaignListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /campaign/{id}/mobile-participant-token`, but is
         * otherwise the same as [CampaignServiceAsync.createMobileParticipantToken].
         */
        fun createMobileParticipantToken(
            id: String,
            params: CampaignCreateMobileParticipantTokenParams,
        ): CompletableFuture<HttpResponseFor<CampaignCreateMobileParticipantTokenResponse>> =
            createMobileParticipantToken(id, params, RequestOptions.none())

        /** @see createMobileParticipantToken */
        fun createMobileParticipantToken(
            id: String,
            params: CampaignCreateMobileParticipantTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignCreateMobileParticipantTokenResponse>> =
            createMobileParticipantToken(params.toBuilder().id(id).build(), requestOptions)

        /** @see createMobileParticipantToken */
        fun createMobileParticipantToken(
            params: CampaignCreateMobileParticipantTokenParams
        ): CompletableFuture<HttpResponseFor<CampaignCreateMobileParticipantTokenResponse>> =
            createMobileParticipantToken(params, RequestOptions.none())

        /** @see createMobileParticipantToken */
        fun createMobileParticipantToken(
            params: CampaignCreateMobileParticipantTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignCreateMobileParticipantTokenResponse>>

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/commissions`, but is otherwise the
         * same as [CampaignServiceAsync.listCommissions].
         */
        fun listCommissions(
            id: String
        ): CompletableFuture<HttpResponseFor<ParticipantCommissionList>> =
            listCommissions(id, CampaignListCommissionsParams.none())

        /** @see listCommissions */
        fun listCommissions(
            id: String,
            params: CampaignListCommissionsParams = CampaignListCommissionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantCommissionList>> =
            listCommissions(params.toBuilder().id(id).build(), requestOptions)

        /** @see listCommissions */
        fun listCommissions(
            id: String,
            params: CampaignListCommissionsParams = CampaignListCommissionsParams.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantCommissionList>> =
            listCommissions(id, params, RequestOptions.none())

        /** @see listCommissions */
        fun listCommissions(
            params: CampaignListCommissionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantCommissionList>>

        /** @see listCommissions */
        fun listCommissions(
            params: CampaignListCommissionsParams
        ): CompletableFuture<HttpResponseFor<ParticipantCommissionList>> =
            listCommissions(params, RequestOptions.none())

        /** @see listCommissions */
        fun listCommissions(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ParticipantCommissionList>> =
            listCommissions(id, CampaignListCommissionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/leaderboard`, but is otherwise the
         * same as [CampaignServiceAsync.listLeaderboard].
         */
        fun listLeaderboard(id: String): CompletableFuture<HttpResponseFor<ParticipantList>> =
            listLeaderboard(id, CampaignListLeaderboardParams.none())

        /** @see listLeaderboard */
        fun listLeaderboard(
            id: String,
            params: CampaignListLeaderboardParams = CampaignListLeaderboardParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantList>> =
            listLeaderboard(params.toBuilder().id(id).build(), requestOptions)

        /** @see listLeaderboard */
        fun listLeaderboard(
            id: String,
            params: CampaignListLeaderboardParams = CampaignListLeaderboardParams.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantList>> =
            listLeaderboard(id, params, RequestOptions.none())

        /** @see listLeaderboard */
        fun listLeaderboard(
            params: CampaignListLeaderboardParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantList>>

        /** @see listLeaderboard */
        fun listLeaderboard(
            params: CampaignListLeaderboardParams
        ): CompletableFuture<HttpResponseFor<ParticipantList>> =
            listLeaderboard(params, RequestOptions.none())

        /** @see listLeaderboard */
        fun listLeaderboard(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ParticipantList>> =
            listLeaderboard(id, CampaignListLeaderboardParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/participants`, but is otherwise the
         * same as [CampaignServiceAsync.listParticipants].
         */
        fun listParticipants(id: String): CompletableFuture<HttpResponseFor<ParticipantList>> =
            listParticipants(id, CampaignListParticipantsParams.none())

        /** @see listParticipants */
        fun listParticipants(
            id: String,
            params: CampaignListParticipantsParams = CampaignListParticipantsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantList>> =
            listParticipants(params.toBuilder().id(id).build(), requestOptions)

        /** @see listParticipants */
        fun listParticipants(
            id: String,
            params: CampaignListParticipantsParams = CampaignListParticipantsParams.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantList>> =
            listParticipants(id, params, RequestOptions.none())

        /** @see listParticipants */
        fun listParticipants(
            params: CampaignListParticipantsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantList>>

        /** @see listParticipants */
        fun listParticipants(
            params: CampaignListParticipantsParams
        ): CompletableFuture<HttpResponseFor<ParticipantList>> =
            listParticipants(params, RequestOptions.none())

        /** @see listParticipants */
        fun listParticipants(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ParticipantList>> =
            listParticipants(id, CampaignListParticipantsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/payouts`, but is otherwise the same
         * as [CampaignServiceAsync.listPayouts].
         */
        fun listPayouts(id: String): CompletableFuture<HttpResponseFor<ParticipantPayoutList>> =
            listPayouts(id, CampaignListPayoutsParams.none())

        /** @see listPayouts */
        fun listPayouts(
            id: String,
            params: CampaignListPayoutsParams = CampaignListPayoutsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantPayoutList>> =
            listPayouts(params.toBuilder().id(id).build(), requestOptions)

        /** @see listPayouts */
        fun listPayouts(
            id: String,
            params: CampaignListPayoutsParams = CampaignListPayoutsParams.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantPayoutList>> =
            listPayouts(id, params, RequestOptions.none())

        /** @see listPayouts */
        fun listPayouts(
            params: CampaignListPayoutsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantPayoutList>>

        /** @see listPayouts */
        fun listPayouts(
            params: CampaignListPayoutsParams
        ): CompletableFuture<HttpResponseFor<ParticipantPayoutList>> =
            listPayouts(params, RequestOptions.none())

        /** @see listPayouts */
        fun listPayouts(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ParticipantPayoutList>> =
            listPayouts(id, CampaignListPayoutsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/referrals`, but is otherwise the same
         * as [CampaignServiceAsync.listReferrals].
         */
        fun listReferrals(id: String): CompletableFuture<HttpResponseFor<ReferralList>> =
            listReferrals(id, CampaignListReferralsParams.none())

        /** @see listReferrals */
        fun listReferrals(
            id: String,
            params: CampaignListReferralsParams = CampaignListReferralsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReferralList>> =
            listReferrals(params.toBuilder().id(id).build(), requestOptions)

        /** @see listReferrals */
        fun listReferrals(
            id: String,
            params: CampaignListReferralsParams = CampaignListReferralsParams.none(),
        ): CompletableFuture<HttpResponseFor<ReferralList>> =
            listReferrals(id, params, RequestOptions.none())

        /** @see listReferrals */
        fun listReferrals(
            params: CampaignListReferralsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReferralList>>

        /** @see listReferrals */
        fun listReferrals(
            params: CampaignListReferralsParams
        ): CompletableFuture<HttpResponseFor<ReferralList>> =
            listReferrals(params, RequestOptions.none())

        /** @see listReferrals */
        fun listReferrals(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReferralList>> =
            listReferrals(id, CampaignListReferralsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/analytics`, but is otherwise the same
         * as [CampaignServiceAsync.retrieveAnalytics].
         */
        fun retrieveAnalytics(
            id: String
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveAnalyticsResponse>> =
            retrieveAnalytics(id, CampaignRetrieveAnalyticsParams.none())

        /** @see retrieveAnalytics */
        fun retrieveAnalytics(
            id: String,
            params: CampaignRetrieveAnalyticsParams = CampaignRetrieveAnalyticsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveAnalyticsResponse>> =
            retrieveAnalytics(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveAnalytics */
        fun retrieveAnalytics(
            id: String,
            params: CampaignRetrieveAnalyticsParams = CampaignRetrieveAnalyticsParams.none(),
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveAnalyticsResponse>> =
            retrieveAnalytics(id, params, RequestOptions.none())

        /** @see retrieveAnalytics */
        fun retrieveAnalytics(
            params: CampaignRetrieveAnalyticsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveAnalyticsResponse>>

        /** @see retrieveAnalytics */
        fun retrieveAnalytics(
            params: CampaignRetrieveAnalyticsParams
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveAnalyticsResponse>> =
            retrieveAnalytics(params, RequestOptions.none())

        /** @see retrieveAnalytics */
        fun retrieveAnalytics(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveAnalyticsResponse>> =
            retrieveAnalytics(id, CampaignRetrieveAnalyticsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/affiliate-applications`, but is
         * otherwise the same as [CampaignServiceAsync.listAffiliateApplications].
         */
        fun listAffiliateApplications(
            id: String
        ): CompletableFuture<HttpResponseFor<AffiliateApplicationListResponse>> =
            listAffiliateApplications(id, CampaignListAffiliateApplicationsParams.none())

        /** @see listAffiliateApplications */
        fun listAffiliateApplications(
            id: String,
            params: CampaignListAffiliateApplicationsParams =
                CampaignListAffiliateApplicationsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AffiliateApplicationListResponse>> =
            listAffiliateApplications(params.toBuilder().id(id).build(), requestOptions)

        /** @see listAffiliateApplications */
        fun listAffiliateApplications(
            id: String,
            params: CampaignListAffiliateApplicationsParams =
                CampaignListAffiliateApplicationsParams.none(),
        ): CompletableFuture<HttpResponseFor<AffiliateApplicationListResponse>> =
            listAffiliateApplications(id, params, RequestOptions.none())

        /** @see listAffiliateApplications */
        fun listAffiliateApplications(
            params: CampaignListAffiliateApplicationsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AffiliateApplicationListResponse>>

        /** @see listAffiliateApplications */
        fun listAffiliateApplications(
            params: CampaignListAffiliateApplicationsParams
        ): CompletableFuture<HttpResponseFor<AffiliateApplicationListResponse>> =
            listAffiliateApplications(params, RequestOptions.none())

        /** @see listAffiliateApplications */
        fun listAffiliateApplications(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AffiliateApplicationListResponse>> =
            listAffiliateApplications(
                id,
                CampaignListAffiliateApplicationsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /campaign/{id}/affiliate-applications/{applicationId}`, but is otherwise the same as
         * [CampaignServiceAsync.retrieveAffiliateApplication].
         */
        fun retrieveAffiliateApplication(
            id: String,
            params: CampaignRetrieveAffiliateApplicationParams,
        ): CompletableFuture<HttpResponseFor<AffiliateApplication>> =
            retrieveAffiliateApplication(id, params, RequestOptions.none())

        /** @see retrieveAffiliateApplication */
        fun retrieveAffiliateApplication(
            id: String,
            params: CampaignRetrieveAffiliateApplicationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AffiliateApplication>> =
            retrieveAffiliateApplication(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveAffiliateApplication */
        fun retrieveAffiliateApplication(
            params: CampaignRetrieveAffiliateApplicationParams
        ): CompletableFuture<HttpResponseFor<AffiliateApplication>> =
            retrieveAffiliateApplication(params, RequestOptions.none())

        /** @see retrieveAffiliateApplication */
        fun retrieveAffiliateApplication(
            params: CampaignRetrieveAffiliateApplicationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AffiliateApplication>>

        /**
         * Returns a raw HTTP response for `patch
         * /campaign/{id}/affiliate-applications/{applicationId}`, but is otherwise the same as
         * [CampaignServiceAsync.reviewAffiliateApplication].
         */
        fun reviewAffiliateApplication(
            id: String,
            params: CampaignReviewAffiliateApplicationParams,
        ): CompletableFuture<HttpResponseFor<AffiliateApplication>> =
            reviewAffiliateApplication(id, params, RequestOptions.none())

        /** @see reviewAffiliateApplication */
        fun reviewAffiliateApplication(
            id: String,
            params: CampaignReviewAffiliateApplicationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AffiliateApplication>> =
            reviewAffiliateApplication(params.toBuilder().id(id).build(), requestOptions)

        /** @see reviewAffiliateApplication */
        fun reviewAffiliateApplication(
            params: CampaignReviewAffiliateApplicationParams
        ): CompletableFuture<HttpResponseFor<AffiliateApplication>> =
            reviewAffiliateApplication(params, RequestOptions.none())

        /** @see reviewAffiliateApplication */
        fun reviewAffiliateApplication(
            params: CampaignReviewAffiliateApplicationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AffiliateApplication>>

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/affiliate-invites`, but is otherwise
         * the same as [CampaignServiceAsync.listAffiliateInvites].
         */
        fun listAffiliateInvites(
            id: String
        ): CompletableFuture<HttpResponseFor<AffiliateInviteListResponse>> =
            listAffiliateInvites(id, CampaignListAffiliateInvitesParams.none())

        /** @see listAffiliateInvites */
        fun listAffiliateInvites(
            id: String,
            params: CampaignListAffiliateInvitesParams = CampaignListAffiliateInvitesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AffiliateInviteListResponse>> =
            listAffiliateInvites(params.toBuilder().id(id).build(), requestOptions)

        /** @see listAffiliateInvites */
        fun listAffiliateInvites(
            id: String,
            params: CampaignListAffiliateInvitesParams = CampaignListAffiliateInvitesParams.none(),
        ): CompletableFuture<HttpResponseFor<AffiliateInviteListResponse>> =
            listAffiliateInvites(id, params, RequestOptions.none())

        /** @see listAffiliateInvites */
        fun listAffiliateInvites(
            params: CampaignListAffiliateInvitesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AffiliateInviteListResponse>>

        /** @see listAffiliateInvites */
        fun listAffiliateInvites(
            params: CampaignListAffiliateInvitesParams
        ): CompletableFuture<HttpResponseFor<AffiliateInviteListResponse>> =
            listAffiliateInvites(params, RequestOptions.none())

        /** @see listAffiliateInvites */
        fun listAffiliateInvites(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AffiliateInviteListResponse>> =
            listAffiliateInvites(id, CampaignListAffiliateInvitesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /campaign/{id}/affiliate-invites`, but is otherwise
         * the same as [CampaignServiceAsync.createAffiliateInvite].
         */
        fun createAffiliateInvite(
            id: String,
            params: CampaignCreateAffiliateInviteParams,
        ): CompletableFuture<HttpResponseFor<AffiliateInvite>> =
            createAffiliateInvite(id, params, RequestOptions.none())

        /** @see createAffiliateInvite */
        fun createAffiliateInvite(
            id: String,
            params: CampaignCreateAffiliateInviteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AffiliateInvite>> =
            createAffiliateInvite(params.toBuilder().id(id).build(), requestOptions)

        /** @see createAffiliateInvite */
        fun createAffiliateInvite(
            params: CampaignCreateAffiliateInviteParams
        ): CompletableFuture<HttpResponseFor<AffiliateInvite>> =
            createAffiliateInvite(params, RequestOptions.none())

        /** @see createAffiliateInvite */
        fun createAffiliateInvite(
            params: CampaignCreateAffiliateInviteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AffiliateInvite>>

        /**
         * Returns a raw HTTP response for `delete /campaign/{id}/affiliate-invites/{inviteId}`, but
         * is otherwise the same as [CampaignServiceAsync.revokeAffiliateInvite].
         */
        fun revokeAffiliateInvite(
            id: String,
            params: CampaignRevokeAffiliateInviteParams,
        ): CompletableFuture<HttpResponseFor<AffiliateInvite>> =
            revokeAffiliateInvite(id, params, RequestOptions.none())

        /** @see revokeAffiliateInvite */
        fun revokeAffiliateInvite(
            id: String,
            params: CampaignRevokeAffiliateInviteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AffiliateInvite>> =
            revokeAffiliateInvite(params.toBuilder().id(id).build(), requestOptions)

        /** @see revokeAffiliateInvite */
        fun revokeAffiliateInvite(
            params: CampaignRevokeAffiliateInviteParams
        ): CompletableFuture<HttpResponseFor<AffiliateInvite>> =
            revokeAffiliateInvite(params, RequestOptions.none())

        /** @see revokeAffiliateInvite */
        fun revokeAffiliateInvite(
            params: CampaignRevokeAffiliateInviteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AffiliateInvite>>

        /**
         * Returns a raw HTTP response for `post
         * /campaign/{id}/affiliate-invites/{inviteId}/resend`, but is otherwise the same as
         * [CampaignServiceAsync.resendAffiliateInvite].
         */
        fun resendAffiliateInvite(
            id: String,
            params: CampaignResendAffiliateInviteParams,
        ): CompletableFuture<HttpResponseFor<AffiliateInvite>> =
            resendAffiliateInvite(id, params, RequestOptions.none())

        /** @see resendAffiliateInvite */
        fun resendAffiliateInvite(
            id: String,
            params: CampaignResendAffiliateInviteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AffiliateInvite>> =
            resendAffiliateInvite(params.toBuilder().id(id).build(), requestOptions)

        /** @see resendAffiliateInvite */
        fun resendAffiliateInvite(
            params: CampaignResendAffiliateInviteParams
        ): CompletableFuture<HttpResponseFor<AffiliateInvite>> =
            resendAffiliateInvite(params, RequestOptions.none())

        /** @see resendAffiliateInvite */
        fun resendAffiliateInvite(
            params: CampaignResendAffiliateInviteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AffiliateInvite>>
    }
}
