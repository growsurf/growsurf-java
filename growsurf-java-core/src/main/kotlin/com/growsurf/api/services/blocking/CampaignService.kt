// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import com.growsurf.api.services.blocking.campaign.CommissionService
import com.growsurf.api.services.blocking.campaign.DesignService
import com.growsurf.api.services.blocking.campaign.EmailsService
import com.growsurf.api.services.blocking.campaign.InstallationService
import com.growsurf.api.services.blocking.campaign.OptionsService
import com.growsurf.api.services.blocking.campaign.ParticipantService
import com.growsurf.api.services.blocking.campaign.RewardService
import com.growsurf.api.services.blocking.campaign.RewardsService
import com.growsurf.api.services.blocking.campaign.WebhooksService
import java.util.function.Consumer

interface CampaignService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CampaignService

    fun participant(): ParticipantService

    /** Participant reward retrieval and manual reward operations. */
    fun reward(): RewardService

    /** Affiliate transaction, commission, and payout operations. */
    fun commission(): CommissionService

    /** Campaign reward (`CampaignReward`) configuration operations. */
    fun rewards(): RewardsService

    /** Program Editor Design tab (`CampaignDesign`) configuration operations. */
    fun design(): DesignService

    /** Program Editor Emails tab (`CampaignEmails`) configuration operations. */
    fun emails(): EmailsService

    /** Program Editor Options tab (`CampaignOptions`) configuration operations. */
    fun options(): OptionsService

    /** Program Editor Installation tab (`CampaignInstallation`) configuration operations. */
    fun installation(): InstallationService

    /** Program webhook configuration (create, update, delete, and test webhooks). */
    fun webhooks(): WebhooksService

    /**
     * Creates a new program, plus any optional campaign rewards. The new program is created in
     * `DRAFT` status and owned by the API key's bound team.
     */
    fun create(params: CampaignCreateParams): Campaign = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CampaignCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Campaign

    /**
     * Updates a program's identity and lifecycle. Only the fields you send are changed. `type`,
     * `urlId`, and `currencyISO` are immutable. Editor-tab configuration (design, emails, options,
     * installation) is edited via the dedicated config sub-resources, not here. The program cannot
     * be deleted via this endpoint.
     */
    fun update(id: String): Campaign = update(id, CampaignUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: CampaignUpdateParams = CampaignUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Campaign = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(id: String, params: CampaignUpdateParams = CampaignUpdateParams.none()): Campaign =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CampaignUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Campaign

    /** @see update */
    fun update(params: CampaignUpdateParams): Campaign = update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): Campaign =
        update(id, CampaignUpdateParams.none(), requestOptions)

    /**
     * Clones an existing program into a new `DRAFT` program. Integrations and credentials are not
     * copied; active rewards are cloned.
     */
    fun clone(id: String): Campaign = clone(id, CampaignCloneParams.none())

    /** @see clone */
    fun clone(
        id: String,
        params: CampaignCloneParams = CampaignCloneParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Campaign = clone(params.toBuilder().id(id).build(), requestOptions)

    /** @see clone */
    fun clone(id: String, params: CampaignCloneParams = CampaignCloneParams.none()): Campaign =
        clone(id, params, RequestOptions.none())

    /** @see clone */
    fun clone(
        params: CampaignCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Campaign

    /** @see clone */
    fun clone(params: CampaignCloneParams): Campaign = clone(params, RequestOptions.none())

    /** @see clone */
    fun clone(id: String, requestOptions: RequestOptions): Campaign =
        clone(id, CampaignCloneParams.none(), requestOptions)

    /** Retrieves a program for the given program ID. */
    fun retrieve(id: String): Campaign = retrieve(id, CampaignRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CampaignRetrieveParams = CampaignRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Campaign = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CampaignRetrieveParams = CampaignRetrieveParams.none(),
    ): Campaign = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CampaignRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Campaign

    /** @see retrieve */
    fun retrieve(params: CampaignRetrieveParams): Campaign = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): Campaign =
        retrieve(id, CampaignRetrieveParams.none(), requestOptions)

    /** Retrieves a list of your programs. Deleted programs are not returned. */
    fun list(): CampaignListResponse = list(CampaignListParams.none())

    /** @see list */
    fun list(
        params: CampaignListParams = CampaignListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignListResponse

    /** @see list */
    fun list(params: CampaignListParams = CampaignListParams.none()): CampaignListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CampaignListResponse =
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
    ): CampaignCreateMobileParticipantTokenResponse =
        createMobileParticipantToken(id, params, RequestOptions.none())

    /** @see createMobileParticipantToken */
    fun createMobileParticipantToken(
        id: String,
        params: CampaignCreateMobileParticipantTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignCreateMobileParticipantTokenResponse =
        createMobileParticipantToken(params.toBuilder().id(id).build(), requestOptions)

    /** @see createMobileParticipantToken */
    fun createMobileParticipantToken(
        params: CampaignCreateMobileParticipantTokenParams
    ): CampaignCreateMobileParticipantTokenResponse =
        createMobileParticipantToken(params, RequestOptions.none())

    /** @see createMobileParticipantToken */
    fun createMobileParticipantToken(
        params: CampaignCreateMobileParticipantTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignCreateMobileParticipantTokenResponse

    /**
     * **Affiliate programs only.** Retrieves a paged list of all participant commissions in an
     * affiliate program.
     */
    fun listCommissions(id: String): ParticipantCommissionList =
        listCommissions(id, CampaignListCommissionsParams.none())

    /** @see listCommissions */
    fun listCommissions(
        id: String,
        params: CampaignListCommissionsParams = CampaignListCommissionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipantCommissionList =
        listCommissions(params.toBuilder().id(id).build(), requestOptions)

    /** @see listCommissions */
    fun listCommissions(
        id: String,
        params: CampaignListCommissionsParams = CampaignListCommissionsParams.none(),
    ): ParticipantCommissionList = listCommissions(id, params, RequestOptions.none())

    /** @see listCommissions */
    fun listCommissions(
        params: CampaignListCommissionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipantCommissionList

    /** @see listCommissions */
    fun listCommissions(params: CampaignListCommissionsParams): ParticipantCommissionList =
        listCommissions(params, RequestOptions.none())

    /** @see listCommissions */
    fun listCommissions(id: String, requestOptions: RequestOptions): ParticipantCommissionList =
        listCommissions(id, CampaignListCommissionsParams.none(), requestOptions)

    /** Retrieves participants in leaderboard order for the specified leaderboard type. */
    fun listLeaderboard(id: String): ParticipantList =
        listLeaderboard(id, CampaignListLeaderboardParams.none())

    /** @see listLeaderboard */
    fun listLeaderboard(
        id: String,
        params: CampaignListLeaderboardParams = CampaignListLeaderboardParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipantList = listLeaderboard(params.toBuilder().id(id).build(), requestOptions)

    /** @see listLeaderboard */
    fun listLeaderboard(
        id: String,
        params: CampaignListLeaderboardParams = CampaignListLeaderboardParams.none(),
    ): ParticipantList = listLeaderboard(id, params, RequestOptions.none())

    /** @see listLeaderboard */
    fun listLeaderboard(
        params: CampaignListLeaderboardParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipantList

    /** @see listLeaderboard */
    fun listLeaderboard(params: CampaignListLeaderboardParams): ParticipantList =
        listLeaderboard(params, RequestOptions.none())

    /** @see listLeaderboard */
    fun listLeaderboard(id: String, requestOptions: RequestOptions): ParticipantList =
        listLeaderboard(id, CampaignListLeaderboardParams.none(), requestOptions)

    /** Retrieves a paged list of participants in a program. */
    fun listParticipants(id: String): ParticipantList =
        listParticipants(id, CampaignListParticipantsParams.none())

    /** @see listParticipants */
    fun listParticipants(
        id: String,
        params: CampaignListParticipantsParams = CampaignListParticipantsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipantList = listParticipants(params.toBuilder().id(id).build(), requestOptions)

    /** @see listParticipants */
    fun listParticipants(
        id: String,
        params: CampaignListParticipantsParams = CampaignListParticipantsParams.none(),
    ): ParticipantList = listParticipants(id, params, RequestOptions.none())

    /** @see listParticipants */
    fun listParticipants(
        params: CampaignListParticipantsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipantList

    /** @see listParticipants */
    fun listParticipants(params: CampaignListParticipantsParams): ParticipantList =
        listParticipants(params, RequestOptions.none())

    /** @see listParticipants */
    fun listParticipants(id: String, requestOptions: RequestOptions): ParticipantList =
        listParticipants(id, CampaignListParticipantsParams.none(), requestOptions)

    /**
     * **Affiliate programs only.** Retrieves a paged list of all participant payouts in an
     * affiliate program.
     */
    fun listPayouts(id: String): ParticipantPayoutList =
        listPayouts(id, CampaignListPayoutsParams.none())

    /** @see listPayouts */
    fun listPayouts(
        id: String,
        params: CampaignListPayoutsParams = CampaignListPayoutsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipantPayoutList = listPayouts(params.toBuilder().id(id).build(), requestOptions)

    /** @see listPayouts */
    fun listPayouts(
        id: String,
        params: CampaignListPayoutsParams = CampaignListPayoutsParams.none(),
    ): ParticipantPayoutList = listPayouts(id, params, RequestOptions.none())

    /** @see listPayouts */
    fun listPayouts(
        params: CampaignListPayoutsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipantPayoutList

    /** @see listPayouts */
    fun listPayouts(params: CampaignListPayoutsParams): ParticipantPayoutList =
        listPayouts(params, RequestOptions.none())

    /** @see listPayouts */
    fun listPayouts(id: String, requestOptions: RequestOptions): ParticipantPayoutList =
        listPayouts(id, CampaignListPayoutsParams.none(), requestOptions)

    /** Retrieves a list of all referrals and email invites made by participants in a program. */
    fun listReferrals(id: String): ReferralList =
        listReferrals(id, CampaignListReferralsParams.none())

    /** @see listReferrals */
    fun listReferrals(
        id: String,
        params: CampaignListReferralsParams = CampaignListReferralsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReferralList = listReferrals(params.toBuilder().id(id).build(), requestOptions)

    /** @see listReferrals */
    fun listReferrals(
        id: String,
        params: CampaignListReferralsParams = CampaignListReferralsParams.none(),
    ): ReferralList = listReferrals(id, params, RequestOptions.none())

    /** @see listReferrals */
    fun listReferrals(
        params: CampaignListReferralsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReferralList

    /** @see listReferrals */
    fun listReferrals(params: CampaignListReferralsParams): ReferralList =
        listReferrals(params, RequestOptions.none())

    /** @see listReferrals */
    fun listReferrals(id: String, requestOptions: RequestOptions): ReferralList =
        listReferrals(id, CampaignListReferralsParams.none(), requestOptions)

    /**
     * Retrieves analytics for a program. Pass `interval` to also get a time-series (`series`)
     * alongside the totals, and `include` to add previous-period totals, status breakdowns, derived
     * rates, or email performance. Add `email` to `include` for `sent` (accepted for delivery),
     * `delivered`, `opened`, `clicked`, `bounced`, and `spamComplaints` metrics plus per-email-type
     * breakdowns. Email rates are ratios from `0` to `1`, and `isPartial` identifies windows that
     * begin before complete coverage.
     */
    fun retrieveAnalytics(id: String): CampaignRetrieveAnalyticsResponse =
        retrieveAnalytics(id, CampaignRetrieveAnalyticsParams.none())

    /** @see retrieveAnalytics */
    fun retrieveAnalytics(
        id: String,
        params: CampaignRetrieveAnalyticsParams = CampaignRetrieveAnalyticsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignRetrieveAnalyticsResponse =
        retrieveAnalytics(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveAnalytics */
    fun retrieveAnalytics(
        id: String,
        params: CampaignRetrieveAnalyticsParams = CampaignRetrieveAnalyticsParams.none(),
    ): CampaignRetrieveAnalyticsResponse = retrieveAnalytics(id, params, RequestOptions.none())

    /** @see retrieveAnalytics */
    fun retrieveAnalytics(
        params: CampaignRetrieveAnalyticsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignRetrieveAnalyticsResponse

    /** @see retrieveAnalytics */
    fun retrieveAnalytics(
        params: CampaignRetrieveAnalyticsParams
    ): CampaignRetrieveAnalyticsResponse = retrieveAnalytics(params, RequestOptions.none())

    /** @see retrieveAnalytics */
    fun retrieveAnalytics(
        id: String,
        requestOptions: RequestOptions,
    ): CampaignRetrieveAnalyticsResponse =
        retrieveAnalytics(id, CampaignRetrieveAnalyticsParams.none(), requestOptions)

    /**
     * Lists an affiliate program's applications, newest first. Applications exist on programs that
     * review public signups (an `affiliateApplicationMode` of `MANUAL_REVIEW` or `AUTO_APPROVE`). A
     * pending applicant is not a participant until their application is approved.
     */
    fun listAffiliateApplications(id: String): AffiliateApplicationListResponse =
        listAffiliateApplications(id, CampaignListAffiliateApplicationsParams.none())

    /** @see listAffiliateApplications */
    fun listAffiliateApplications(
        id: String,
        params: CampaignListAffiliateApplicationsParams =
            CampaignListAffiliateApplicationsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AffiliateApplicationListResponse =
        listAffiliateApplications(params.toBuilder().id(id).build(), requestOptions)

    /** @see listAffiliateApplications */
    fun listAffiliateApplications(
        id: String,
        params: CampaignListAffiliateApplicationsParams =
            CampaignListAffiliateApplicationsParams.none(),
    ): AffiliateApplicationListResponse =
        listAffiliateApplications(id, params, RequestOptions.none())

    /** @see listAffiliateApplications */
    fun listAffiliateApplications(
        params: CampaignListAffiliateApplicationsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AffiliateApplicationListResponse

    /** @see listAffiliateApplications */
    fun listAffiliateApplications(
        params: CampaignListAffiliateApplicationsParams
    ): AffiliateApplicationListResponse = listAffiliateApplications(params, RequestOptions.none())

    /** @see listAffiliateApplications */
    fun listAffiliateApplications(
        id: String,
        requestOptions: RequestOptions,
    ): AffiliateApplicationListResponse =
        listAffiliateApplications(
            id,
            CampaignListAffiliateApplicationsParams.none(),
            requestOptions,
        )

    /** Returns one affiliate application, including its submitted form answers. */
    fun retrieveAffiliateApplication(
        id: String,
        params: CampaignRetrieveAffiliateApplicationParams,
    ): AffiliateApplication = retrieveAffiliateApplication(id, params, RequestOptions.none())

    /** @see retrieveAffiliateApplication */
    fun retrieveAffiliateApplication(
        id: String,
        params: CampaignRetrieveAffiliateApplicationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AffiliateApplication =
        retrieveAffiliateApplication(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveAffiliateApplication */
    fun retrieveAffiliateApplication(
        params: CampaignRetrieveAffiliateApplicationParams
    ): AffiliateApplication = retrieveAffiliateApplication(params, RequestOptions.none())

    /** @see retrieveAffiliateApplication */
    fun retrieveAffiliateApplication(
        params: CampaignRetrieveAffiliateApplicationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AffiliateApplication

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
    ): AffiliateApplication = reviewAffiliateApplication(id, params, RequestOptions.none())

    /** @see reviewAffiliateApplication */
    fun reviewAffiliateApplication(
        id: String,
        params: CampaignReviewAffiliateApplicationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AffiliateApplication =
        reviewAffiliateApplication(params.toBuilder().id(id).build(), requestOptions)

    /** @see reviewAffiliateApplication */
    fun reviewAffiliateApplication(
        params: CampaignReviewAffiliateApplicationParams
    ): AffiliateApplication = reviewAffiliateApplication(params, RequestOptions.none())

    /** @see reviewAffiliateApplication */
    fun reviewAffiliateApplication(
        params: CampaignReviewAffiliateApplicationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AffiliateApplication

    /** Lists an affiliate program's enrollment invites, newest first. */
    fun listAffiliateInvites(id: String): AffiliateInviteListResponse =
        listAffiliateInvites(id, CampaignListAffiliateInvitesParams.none())

    /** @see listAffiliateInvites */
    fun listAffiliateInvites(
        id: String,
        params: CampaignListAffiliateInvitesParams = CampaignListAffiliateInvitesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AffiliateInviteListResponse =
        listAffiliateInvites(params.toBuilder().id(id).build(), requestOptions)

    /** @see listAffiliateInvites */
    fun listAffiliateInvites(
        id: String,
        params: CampaignListAffiliateInvitesParams = CampaignListAffiliateInvitesParams.none(),
    ): AffiliateInviteListResponse = listAffiliateInvites(id, params, RequestOptions.none())

    /** @see listAffiliateInvites */
    fun listAffiliateInvites(
        params: CampaignListAffiliateInvitesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AffiliateInviteListResponse

    /** @see listAffiliateInvites */
    fun listAffiliateInvites(
        params: CampaignListAffiliateInvitesParams
    ): AffiliateInviteListResponse = listAffiliateInvites(params, RequestOptions.none())

    /** @see listAffiliateInvites */
    fun listAffiliateInvites(
        id: String,
        requestOptions: RequestOptions,
    ): AffiliateInviteListResponse =
        listAffiliateInvites(id, CampaignListAffiliateInvitesParams.none(), requestOptions)

    /**
     * Invites someone to join the affiliate program. GrowSurf emails them a single-use accept link;
     * accepting it enrolls them as an approved affiliate without going through the public
     * application. One active invite can exist per email address.
     */
    fun createAffiliateInvite(
        id: String,
        params: CampaignCreateAffiliateInviteParams,
    ): AffiliateInvite = createAffiliateInvite(id, params, RequestOptions.none())

    /** @see createAffiliateInvite */
    fun createAffiliateInvite(
        id: String,
        params: CampaignCreateAffiliateInviteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AffiliateInvite = createAffiliateInvite(params.toBuilder().id(id).build(), requestOptions)

    /** @see createAffiliateInvite */
    fun createAffiliateInvite(params: CampaignCreateAffiliateInviteParams): AffiliateInvite =
        createAffiliateInvite(params, RequestOptions.none())

    /** @see createAffiliateInvite */
    fun createAffiliateInvite(
        params: CampaignCreateAffiliateInviteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AffiliateInvite

    /** Revokes a pending invite. Its emailed accept link stops working immediately. */
    fun revokeAffiliateInvite(
        id: String,
        params: CampaignRevokeAffiliateInviteParams,
    ): AffiliateInvite = revokeAffiliateInvite(id, params, RequestOptions.none())

    /** @see revokeAffiliateInvite */
    fun revokeAffiliateInvite(
        id: String,
        params: CampaignRevokeAffiliateInviteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AffiliateInvite = revokeAffiliateInvite(params.toBuilder().id(id).build(), requestOptions)

    /** @see revokeAffiliateInvite */
    fun revokeAffiliateInvite(params: CampaignRevokeAffiliateInviteParams): AffiliateInvite =
        revokeAffiliateInvite(params, RequestOptions.none())

    /** @see revokeAffiliateInvite */
    fun revokeAffiliateInvite(
        params: CampaignRevokeAffiliateInviteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AffiliateInvite

    /**
     * Re-sends a pending invite with a fresh accept link (the previous link stops working). Resends
     * are rate limited per invite; retry after a few minutes if a resend was just sent.
     */
    fun resendAffiliateInvite(
        id: String,
        params: CampaignResendAffiliateInviteParams,
    ): AffiliateInvite = resendAffiliateInvite(id, params, RequestOptions.none())

    /** @see resendAffiliateInvite */
    fun resendAffiliateInvite(
        id: String,
        params: CampaignResendAffiliateInviteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AffiliateInvite = resendAffiliateInvite(params.toBuilder().id(id).build(), requestOptions)

    /** @see resendAffiliateInvite */
    fun resendAffiliateInvite(params: CampaignResendAffiliateInviteParams): AffiliateInvite =
        resendAffiliateInvite(params, RequestOptions.none())

    /** @see resendAffiliateInvite */
    fun resendAffiliateInvite(
        params: CampaignResendAffiliateInviteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AffiliateInvite

    /** A view of [CampaignService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CampaignService.WithRawResponse

        fun participant(): ParticipantService.WithRawResponse

        /** Participant reward retrieval and manual reward operations. */
        fun reward(): RewardService.WithRawResponse

        /** Affiliate transaction, commission, and payout operations. */
        fun commission(): CommissionService.WithRawResponse

        /** Campaign reward (`CampaignReward`) configuration operations. */
        fun rewards(): RewardsService.WithRawResponse

        /** Program Editor Design tab (`CampaignDesign`) configuration operations. */
        fun design(): DesignService.WithRawResponse

        /** Program Editor Emails tab (`CampaignEmails`) configuration operations. */
        fun emails(): EmailsService.WithRawResponse

        /** Program Editor Options tab (`CampaignOptions`) configuration operations. */
        fun options(): OptionsService.WithRawResponse

        /** Program Editor Installation tab (`CampaignInstallation`) configuration operations. */
        fun installation(): InstallationService.WithRawResponse

        /** Program webhook configuration (create, update, delete, and test webhooks). */
        fun webhooks(): WebhooksService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /campaigns`, but is otherwise the same as
         * [CampaignService.create].
         */
        @MustBeClosed
        fun create(params: CampaignCreateParams): HttpResponseFor<Campaign> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CampaignCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Campaign>

        /**
         * Returns a raw HTTP response for `patch /campaign/{id}`, but is otherwise the same as
         * [CampaignService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<Campaign> = update(id, CampaignUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: CampaignUpdateParams = CampaignUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Campaign> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: CampaignUpdateParams = CampaignUpdateParams.none(),
        ): HttpResponseFor<Campaign> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CampaignUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Campaign>

        /** @see update */
        @MustBeClosed
        fun update(params: CampaignUpdateParams): HttpResponseFor<Campaign> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<Campaign> =
            update(id, CampaignUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /campaign/{id}/clone`, but is otherwise the same as
         * [CampaignService.clone].
         */
        @MustBeClosed
        fun clone(id: String): HttpResponseFor<Campaign> = clone(id, CampaignCloneParams.none())

        /** @see clone */
        @MustBeClosed
        fun clone(
            id: String,
            params: CampaignCloneParams = CampaignCloneParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Campaign> = clone(params.toBuilder().id(id).build(), requestOptions)

        /** @see clone */
        @MustBeClosed
        fun clone(
            id: String,
            params: CampaignCloneParams = CampaignCloneParams.none(),
        ): HttpResponseFor<Campaign> = clone(id, params, RequestOptions.none())

        /** @see clone */
        @MustBeClosed
        fun clone(
            params: CampaignCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Campaign>

        /** @see clone */
        @MustBeClosed
        fun clone(params: CampaignCloneParams): HttpResponseFor<Campaign> =
            clone(params, RequestOptions.none())

        /** @see clone */
        @MustBeClosed
        fun clone(id: String, requestOptions: RequestOptions): HttpResponseFor<Campaign> =
            clone(id, CampaignCloneParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /campaign/{id}`, but is otherwise the same as
         * [CampaignService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<Campaign> =
            retrieve(id, CampaignRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CampaignRetrieveParams = CampaignRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Campaign> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CampaignRetrieveParams = CampaignRetrieveParams.none(),
        ): HttpResponseFor<Campaign> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CampaignRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Campaign>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CampaignRetrieveParams): HttpResponseFor<Campaign> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<Campaign> =
            retrieve(id, CampaignRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /campaigns`, but is otherwise the same as
         * [CampaignService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CampaignListResponse> = list(CampaignListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CampaignListParams = CampaignListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CampaignListParams = CampaignListParams.none()
        ): HttpResponseFor<CampaignListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CampaignListResponse> =
            list(CampaignListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /campaign/{id}/mobile-participant-token`, but is
         * otherwise the same as [CampaignService.createMobileParticipantToken].
         */
        @MustBeClosed
        fun createMobileParticipantToken(
            id: String,
            params: CampaignCreateMobileParticipantTokenParams,
        ): HttpResponseFor<CampaignCreateMobileParticipantTokenResponse> =
            createMobileParticipantToken(id, params, RequestOptions.none())

        /** @see createMobileParticipantToken */
        @MustBeClosed
        fun createMobileParticipantToken(
            id: String,
            params: CampaignCreateMobileParticipantTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignCreateMobileParticipantTokenResponse> =
            createMobileParticipantToken(params.toBuilder().id(id).build(), requestOptions)

        /** @see createMobileParticipantToken */
        @MustBeClosed
        fun createMobileParticipantToken(
            params: CampaignCreateMobileParticipantTokenParams
        ): HttpResponseFor<CampaignCreateMobileParticipantTokenResponse> =
            createMobileParticipantToken(params, RequestOptions.none())

        /** @see createMobileParticipantToken */
        @MustBeClosed
        fun createMobileParticipantToken(
            params: CampaignCreateMobileParticipantTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignCreateMobileParticipantTokenResponse>

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/commissions`, but is otherwise the
         * same as [CampaignService.listCommissions].
         */
        @MustBeClosed
        fun listCommissions(id: String): HttpResponseFor<ParticipantCommissionList> =
            listCommissions(id, CampaignListCommissionsParams.none())

        /** @see listCommissions */
        @MustBeClosed
        fun listCommissions(
            id: String,
            params: CampaignListCommissionsParams = CampaignListCommissionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipantCommissionList> =
            listCommissions(params.toBuilder().id(id).build(), requestOptions)

        /** @see listCommissions */
        @MustBeClosed
        fun listCommissions(
            id: String,
            params: CampaignListCommissionsParams = CampaignListCommissionsParams.none(),
        ): HttpResponseFor<ParticipantCommissionList> =
            listCommissions(id, params, RequestOptions.none())

        /** @see listCommissions */
        @MustBeClosed
        fun listCommissions(
            params: CampaignListCommissionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipantCommissionList>

        /** @see listCommissions */
        @MustBeClosed
        fun listCommissions(
            params: CampaignListCommissionsParams
        ): HttpResponseFor<ParticipantCommissionList> =
            listCommissions(params, RequestOptions.none())

        /** @see listCommissions */
        @MustBeClosed
        fun listCommissions(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ParticipantCommissionList> =
            listCommissions(id, CampaignListCommissionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/leaderboard`, but is otherwise the
         * same as [CampaignService.listLeaderboard].
         */
        @MustBeClosed
        fun listLeaderboard(id: String): HttpResponseFor<ParticipantList> =
            listLeaderboard(id, CampaignListLeaderboardParams.none())

        /** @see listLeaderboard */
        @MustBeClosed
        fun listLeaderboard(
            id: String,
            params: CampaignListLeaderboardParams = CampaignListLeaderboardParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipantList> =
            listLeaderboard(params.toBuilder().id(id).build(), requestOptions)

        /** @see listLeaderboard */
        @MustBeClosed
        fun listLeaderboard(
            id: String,
            params: CampaignListLeaderboardParams = CampaignListLeaderboardParams.none(),
        ): HttpResponseFor<ParticipantList> = listLeaderboard(id, params, RequestOptions.none())

        /** @see listLeaderboard */
        @MustBeClosed
        fun listLeaderboard(
            params: CampaignListLeaderboardParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipantList>

        /** @see listLeaderboard */
        @MustBeClosed
        fun listLeaderboard(
            params: CampaignListLeaderboardParams
        ): HttpResponseFor<ParticipantList> = listLeaderboard(params, RequestOptions.none())

        /** @see listLeaderboard */
        @MustBeClosed
        fun listLeaderboard(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ParticipantList> =
            listLeaderboard(id, CampaignListLeaderboardParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/participants`, but is otherwise the
         * same as [CampaignService.listParticipants].
         */
        @MustBeClosed
        fun listParticipants(id: String): HttpResponseFor<ParticipantList> =
            listParticipants(id, CampaignListParticipantsParams.none())

        /** @see listParticipants */
        @MustBeClosed
        fun listParticipants(
            id: String,
            params: CampaignListParticipantsParams = CampaignListParticipantsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipantList> =
            listParticipants(params.toBuilder().id(id).build(), requestOptions)

        /** @see listParticipants */
        @MustBeClosed
        fun listParticipants(
            id: String,
            params: CampaignListParticipantsParams = CampaignListParticipantsParams.none(),
        ): HttpResponseFor<ParticipantList> = listParticipants(id, params, RequestOptions.none())

        /** @see listParticipants */
        @MustBeClosed
        fun listParticipants(
            params: CampaignListParticipantsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipantList>

        /** @see listParticipants */
        @MustBeClosed
        fun listParticipants(
            params: CampaignListParticipantsParams
        ): HttpResponseFor<ParticipantList> = listParticipants(params, RequestOptions.none())

        /** @see listParticipants */
        @MustBeClosed
        fun listParticipants(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ParticipantList> =
            listParticipants(id, CampaignListParticipantsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/payouts`, but is otherwise the same
         * as [CampaignService.listPayouts].
         */
        @MustBeClosed
        fun listPayouts(id: String): HttpResponseFor<ParticipantPayoutList> =
            listPayouts(id, CampaignListPayoutsParams.none())

        /** @see listPayouts */
        @MustBeClosed
        fun listPayouts(
            id: String,
            params: CampaignListPayoutsParams = CampaignListPayoutsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipantPayoutList> =
            listPayouts(params.toBuilder().id(id).build(), requestOptions)

        /** @see listPayouts */
        @MustBeClosed
        fun listPayouts(
            id: String,
            params: CampaignListPayoutsParams = CampaignListPayoutsParams.none(),
        ): HttpResponseFor<ParticipantPayoutList> = listPayouts(id, params, RequestOptions.none())

        /** @see listPayouts */
        @MustBeClosed
        fun listPayouts(
            params: CampaignListPayoutsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipantPayoutList>

        /** @see listPayouts */
        @MustBeClosed
        fun listPayouts(params: CampaignListPayoutsParams): HttpResponseFor<ParticipantPayoutList> =
            listPayouts(params, RequestOptions.none())

        /** @see listPayouts */
        @MustBeClosed
        fun listPayouts(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ParticipantPayoutList> =
            listPayouts(id, CampaignListPayoutsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/referrals`, but is otherwise the same
         * as [CampaignService.listReferrals].
         */
        @MustBeClosed
        fun listReferrals(id: String): HttpResponseFor<ReferralList> =
            listReferrals(id, CampaignListReferralsParams.none())

        /** @see listReferrals */
        @MustBeClosed
        fun listReferrals(
            id: String,
            params: CampaignListReferralsParams = CampaignListReferralsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReferralList> =
            listReferrals(params.toBuilder().id(id).build(), requestOptions)

        /** @see listReferrals */
        @MustBeClosed
        fun listReferrals(
            id: String,
            params: CampaignListReferralsParams = CampaignListReferralsParams.none(),
        ): HttpResponseFor<ReferralList> = listReferrals(id, params, RequestOptions.none())

        /** @see listReferrals */
        @MustBeClosed
        fun listReferrals(
            params: CampaignListReferralsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReferralList>

        /** @see listReferrals */
        @MustBeClosed
        fun listReferrals(params: CampaignListReferralsParams): HttpResponseFor<ReferralList> =
            listReferrals(params, RequestOptions.none())

        /** @see listReferrals */
        @MustBeClosed
        fun listReferrals(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReferralList> =
            listReferrals(id, CampaignListReferralsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/analytics`, but is otherwise the same
         * as [CampaignService.retrieveAnalytics].
         */
        @MustBeClosed
        fun retrieveAnalytics(id: String): HttpResponseFor<CampaignRetrieveAnalyticsResponse> =
            retrieveAnalytics(id, CampaignRetrieveAnalyticsParams.none())

        /** @see retrieveAnalytics */
        @MustBeClosed
        fun retrieveAnalytics(
            id: String,
            params: CampaignRetrieveAnalyticsParams = CampaignRetrieveAnalyticsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignRetrieveAnalyticsResponse> =
            retrieveAnalytics(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveAnalytics */
        @MustBeClosed
        fun retrieveAnalytics(
            id: String,
            params: CampaignRetrieveAnalyticsParams = CampaignRetrieveAnalyticsParams.none(),
        ): HttpResponseFor<CampaignRetrieveAnalyticsResponse> =
            retrieveAnalytics(id, params, RequestOptions.none())

        /** @see retrieveAnalytics */
        @MustBeClosed
        fun retrieveAnalytics(
            params: CampaignRetrieveAnalyticsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignRetrieveAnalyticsResponse>

        /** @see retrieveAnalytics */
        @MustBeClosed
        fun retrieveAnalytics(
            params: CampaignRetrieveAnalyticsParams
        ): HttpResponseFor<CampaignRetrieveAnalyticsResponse> =
            retrieveAnalytics(params, RequestOptions.none())

        /** @see retrieveAnalytics */
        @MustBeClosed
        fun retrieveAnalytics(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignRetrieveAnalyticsResponse> =
            retrieveAnalytics(id, CampaignRetrieveAnalyticsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/affiliate-applications`, but is
         * otherwise the same as [CampaignService.listAffiliateApplications].
         */
        @MustBeClosed
        fun listAffiliateApplications(
            id: String
        ): HttpResponseFor<AffiliateApplicationListResponse> =
            listAffiliateApplications(id, CampaignListAffiliateApplicationsParams.none())

        /** @see listAffiliateApplications */
        @MustBeClosed
        fun listAffiliateApplications(
            id: String,
            params: CampaignListAffiliateApplicationsParams =
                CampaignListAffiliateApplicationsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AffiliateApplicationListResponse> =
            listAffiliateApplications(params.toBuilder().id(id).build(), requestOptions)

        /** @see listAffiliateApplications */
        @MustBeClosed
        fun listAffiliateApplications(
            id: String,
            params: CampaignListAffiliateApplicationsParams =
                CampaignListAffiliateApplicationsParams.none(),
        ): HttpResponseFor<AffiliateApplicationListResponse> =
            listAffiliateApplications(id, params, RequestOptions.none())

        /** @see listAffiliateApplications */
        @MustBeClosed
        fun listAffiliateApplications(
            params: CampaignListAffiliateApplicationsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AffiliateApplicationListResponse>

        /** @see listAffiliateApplications */
        @MustBeClosed
        fun listAffiliateApplications(
            params: CampaignListAffiliateApplicationsParams
        ): HttpResponseFor<AffiliateApplicationListResponse> =
            listAffiliateApplications(params, RequestOptions.none())

        /** @see listAffiliateApplications */
        @MustBeClosed
        fun listAffiliateApplications(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AffiliateApplicationListResponse> =
            listAffiliateApplications(
                id,
                CampaignListAffiliateApplicationsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /campaign/{id}/affiliate-applications/{applicationId}`, but is otherwise the same as
         * [CampaignService.retrieveAffiliateApplication].
         */
        @MustBeClosed
        fun retrieveAffiliateApplication(
            id: String,
            params: CampaignRetrieveAffiliateApplicationParams,
        ): HttpResponseFor<AffiliateApplication> =
            retrieveAffiliateApplication(id, params, RequestOptions.none())

        /** @see retrieveAffiliateApplication */
        @MustBeClosed
        fun retrieveAffiliateApplication(
            id: String,
            params: CampaignRetrieveAffiliateApplicationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AffiliateApplication> =
            retrieveAffiliateApplication(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveAffiliateApplication */
        @MustBeClosed
        fun retrieveAffiliateApplication(
            params: CampaignRetrieveAffiliateApplicationParams
        ): HttpResponseFor<AffiliateApplication> =
            retrieveAffiliateApplication(params, RequestOptions.none())

        /** @see retrieveAffiliateApplication */
        @MustBeClosed
        fun retrieveAffiliateApplication(
            params: CampaignRetrieveAffiliateApplicationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AffiliateApplication>

        /**
         * Returns a raw HTTP response for `patch
         * /campaign/{id}/affiliate-applications/{applicationId}`, but is otherwise the same as
         * [CampaignService.reviewAffiliateApplication].
         */
        @MustBeClosed
        fun reviewAffiliateApplication(
            id: String,
            params: CampaignReviewAffiliateApplicationParams,
        ): HttpResponseFor<AffiliateApplication> =
            reviewAffiliateApplication(id, params, RequestOptions.none())

        /** @see reviewAffiliateApplication */
        @MustBeClosed
        fun reviewAffiliateApplication(
            id: String,
            params: CampaignReviewAffiliateApplicationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AffiliateApplication> =
            reviewAffiliateApplication(params.toBuilder().id(id).build(), requestOptions)

        /** @see reviewAffiliateApplication */
        @MustBeClosed
        fun reviewAffiliateApplication(
            params: CampaignReviewAffiliateApplicationParams
        ): HttpResponseFor<AffiliateApplication> =
            reviewAffiliateApplication(params, RequestOptions.none())

        /** @see reviewAffiliateApplication */
        @MustBeClosed
        fun reviewAffiliateApplication(
            params: CampaignReviewAffiliateApplicationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AffiliateApplication>

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/affiliate-invites`, but is otherwise
         * the same as [CampaignService.listAffiliateInvites].
         */
        @MustBeClosed
        fun listAffiliateInvites(id: String): HttpResponseFor<AffiliateInviteListResponse> =
            listAffiliateInvites(id, CampaignListAffiliateInvitesParams.none())

        /** @see listAffiliateInvites */
        @MustBeClosed
        fun listAffiliateInvites(
            id: String,
            params: CampaignListAffiliateInvitesParams = CampaignListAffiliateInvitesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AffiliateInviteListResponse> =
            listAffiliateInvites(params.toBuilder().id(id).build(), requestOptions)

        /** @see listAffiliateInvites */
        @MustBeClosed
        fun listAffiliateInvites(
            id: String,
            params: CampaignListAffiliateInvitesParams = CampaignListAffiliateInvitesParams.none(),
        ): HttpResponseFor<AffiliateInviteListResponse> =
            listAffiliateInvites(id, params, RequestOptions.none())

        /** @see listAffiliateInvites */
        @MustBeClosed
        fun listAffiliateInvites(
            params: CampaignListAffiliateInvitesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AffiliateInviteListResponse>

        /** @see listAffiliateInvites */
        @MustBeClosed
        fun listAffiliateInvites(
            params: CampaignListAffiliateInvitesParams
        ): HttpResponseFor<AffiliateInviteListResponse> =
            listAffiliateInvites(params, RequestOptions.none())

        /** @see listAffiliateInvites */
        @MustBeClosed
        fun listAffiliateInvites(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AffiliateInviteListResponse> =
            listAffiliateInvites(id, CampaignListAffiliateInvitesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /campaign/{id}/affiliate-invites`, but is otherwise
         * the same as [CampaignService.createAffiliateInvite].
         */
        @MustBeClosed
        fun createAffiliateInvite(
            id: String,
            params: CampaignCreateAffiliateInviteParams,
        ): HttpResponseFor<AffiliateInvite> =
            createAffiliateInvite(id, params, RequestOptions.none())

        /** @see createAffiliateInvite */
        @MustBeClosed
        fun createAffiliateInvite(
            id: String,
            params: CampaignCreateAffiliateInviteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AffiliateInvite> =
            createAffiliateInvite(params.toBuilder().id(id).build(), requestOptions)

        /** @see createAffiliateInvite */
        @MustBeClosed
        fun createAffiliateInvite(
            params: CampaignCreateAffiliateInviteParams
        ): HttpResponseFor<AffiliateInvite> = createAffiliateInvite(params, RequestOptions.none())

        /** @see createAffiliateInvite */
        @MustBeClosed
        fun createAffiliateInvite(
            params: CampaignCreateAffiliateInviteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AffiliateInvite>

        /**
         * Returns a raw HTTP response for `delete /campaign/{id}/affiliate-invites/{inviteId}`, but
         * is otherwise the same as [CampaignService.revokeAffiliateInvite].
         */
        @MustBeClosed
        fun revokeAffiliateInvite(
            id: String,
            params: CampaignRevokeAffiliateInviteParams,
        ): HttpResponseFor<AffiliateInvite> =
            revokeAffiliateInvite(id, params, RequestOptions.none())

        /** @see revokeAffiliateInvite */
        @MustBeClosed
        fun revokeAffiliateInvite(
            id: String,
            params: CampaignRevokeAffiliateInviteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AffiliateInvite> =
            revokeAffiliateInvite(params.toBuilder().id(id).build(), requestOptions)

        /** @see revokeAffiliateInvite */
        @MustBeClosed
        fun revokeAffiliateInvite(
            params: CampaignRevokeAffiliateInviteParams
        ): HttpResponseFor<AffiliateInvite> = revokeAffiliateInvite(params, RequestOptions.none())

        /** @see revokeAffiliateInvite */
        @MustBeClosed
        fun revokeAffiliateInvite(
            params: CampaignRevokeAffiliateInviteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AffiliateInvite>

        /**
         * Returns a raw HTTP response for `post
         * /campaign/{id}/affiliate-invites/{inviteId}/resend`, but is otherwise the same as
         * [CampaignService.resendAffiliateInvite].
         */
        @MustBeClosed
        fun resendAffiliateInvite(
            id: String,
            params: CampaignResendAffiliateInviteParams,
        ): HttpResponseFor<AffiliateInvite> =
            resendAffiliateInvite(id, params, RequestOptions.none())

        /** @see resendAffiliateInvite */
        @MustBeClosed
        fun resendAffiliateInvite(
            id: String,
            params: CampaignResendAffiliateInviteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AffiliateInvite> =
            resendAffiliateInvite(params.toBuilder().id(id).build(), requestOptions)

        /** @see resendAffiliateInvite */
        @MustBeClosed
        fun resendAffiliateInvite(
            params: CampaignResendAffiliateInviteParams
        ): HttpResponseFor<AffiliateInvite> = resendAffiliateInvite(params, RequestOptions.none())

        /** @see resendAffiliateInvite */
        @MustBeClosed
        fun resendAffiliateInvite(
            params: CampaignResendAffiliateInviteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AffiliateInvite>
    }
}
