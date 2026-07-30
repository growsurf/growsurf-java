// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking

import com.growsurf.api.client.okhttp.GrowsurfOkHttpClient
import com.growsurf.api.core.JsonValue
import com.growsurf.api.models.campaign.CampaignCreateAffiliateInviteParams
import com.growsurf.api.models.campaign.CampaignCreateMobileParticipantTokenParams
import com.growsurf.api.models.campaign.CampaignCreateParams
import com.growsurf.api.models.campaign.CampaignListAffiliateApplicationsParams
import com.growsurf.api.models.campaign.CampaignListAffiliateInvitesParams
import com.growsurf.api.models.campaign.CampaignListCommissionsParams
import com.growsurf.api.models.campaign.CampaignListLeaderboardParams
import com.growsurf.api.models.campaign.CampaignListParticipantsParams
import com.growsurf.api.models.campaign.CampaignListPayoutsParams
import com.growsurf.api.models.campaign.CampaignListReferralsParams
import com.growsurf.api.models.campaign.CampaignResendAffiliateInviteParams
import com.growsurf.api.models.campaign.CampaignRetrieveAffiliateApplicationParams
import com.growsurf.api.models.campaign.CampaignRetrieveAnalyticsParams
import com.growsurf.api.models.campaign.CampaignReviewAffiliateApplicationParams
import com.growsurf.api.models.campaign.CampaignRevokeAffiliateInviteParams
import com.growsurf.api.models.campaign.participant.Create
import com.growsurf.api.models.campaign.participant.ReferralStatus
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CampaignServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.campaign()

        val campaign = campaignService.retrieve("id")

        campaign.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.campaign()

        val campaigns = campaignService.list()

        campaigns.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.campaign()

        val campaign =
            campaignService.create(
                CampaignCreateParams.builder().type(CampaignCreateParams.Type.REFERRAL).build()
            )

        campaign.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.campaign()

        val campaign = campaignService.update("id")

        campaign.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun clone() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.campaign()

        val campaign = campaignService.clone("id")

        campaign.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createMobileParticipantToken() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.campaign()

        val response =
            campaignService.createMobileParticipantToken(
                CampaignCreateMobileParticipantTokenParams.builder()
                    .id("id")
                    .create(
                        Create.builder()
                            .email("dev@stainless.com")
                            .fingerprint("fingerprint")
                            .firstName("firstName")
                            .ipAddress("ipAddress")
                            .lastName("lastName")
                            .metadata(
                                Create.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .mobileInstanceId("mobileInstanceId")
                            .referralStatus(Create.ReferralStatus.CREDIT_PENDING)
                            .referredBy("referredBy")
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listCommissions() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.campaign()

        val participantCommissionList =
            campaignService.listCommissions(
                CampaignListCommissionsParams.builder()
                    .id("id")
                    .limit(1L)
                    .nextId("nextId")
                    .status(CampaignListCommissionsParams.Status.PENDING)
                    .build()
            )

        participantCommissionList.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listLeaderboard() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.campaign()

        val participantList =
            campaignService.listLeaderboard(
                CampaignListLeaderboardParams.builder()
                    .id("id")
                    .isMonthly(true)
                    .leaderboardType(CampaignListLeaderboardParams.LeaderboardType.ALL_TIME)
                    .limit(1L)
                    .nextId("nextId")
                    .build()
            )

        participantList.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listParticipants() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.campaign()

        val participantList =
            campaignService.listParticipants(
                CampaignListParticipantsParams.builder().id("id").limit(1L).nextId("nextId").build()
            )

        participantList.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listPayouts() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.campaign()

        val participantPayoutList =
            campaignService.listPayouts(
                CampaignListPayoutsParams.builder()
                    .id("id")
                    .limit(1L)
                    .nextId("nextId")
                    .status(CampaignListPayoutsParams.Status.UPCOMING)
                    .build()
            )

        participantPayoutList.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listReferrals() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.campaign()

        val referralList =
            campaignService.listReferrals(
                CampaignListReferralsParams.builder()
                    .id("id")
                    .desc(true)
                    .email("email")
                    .firstName("firstName")
                    .lastName("lastName")
                    .limit(1L)
                    .nextId("nextId")
                    .offset(0L)
                    .referralStatus(ReferralStatus.CREDIT_PENDING)
                    .sortBy(CampaignListReferralsParams.SortBy.UPDATED_AT)
                    .build()
            )

        referralList.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveAnalytics() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.campaign()

        val response =
            campaignService.retrieveAnalytics(
                CampaignRetrieveAnalyticsParams.builder()
                    .id("id")
                    .days(1L)
                    .endDate(0L)
                    .startDate(0L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listAffiliateApplications() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.campaign()

        val response =
            campaignService.listAffiliateApplications(
                CampaignListAffiliateApplicationsParams.builder()
                    .id("id")
                    .limit(1L)
                    .offset(0L)
                    .status(CampaignListAffiliateApplicationsParams.Status.PENDING)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveAffiliateApplication() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.campaign()

        val response =
            campaignService.retrieveAffiliateApplication(
                CampaignRetrieveAffiliateApplicationParams.builder()
                    .id("id")
                    .applicationId("applicationId")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun reviewAffiliateApplication() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.campaign()

        val response =
            campaignService.reviewAffiliateApplication(
                CampaignReviewAffiliateApplicationParams.builder()
                    .id("id")
                    .applicationId("applicationId")
                    .allowImmediateReapply(true)
                    .reapplyAllowedAt(0L)
                    .rejectionReason("rejectionReason")
                    .reviewNote("reviewNote")
                    .status(CampaignReviewAffiliateApplicationParams.Status.APPROVED)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listAffiliateInvites() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.campaign()

        val response =
            campaignService.listAffiliateInvites(
                CampaignListAffiliateInvitesParams.builder()
                    .id("id")
                    .limit(1L)
                    .offset(0L)
                    .status(CampaignListAffiliateInvitesParams.Status.PENDING)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createAffiliateInvite() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.campaign()

        val response =
            campaignService.createAffiliateInvite(
                CampaignCreateAffiliateInviteParams.builder()
                    .id("id")
                    .email("dev@stainless.com")
                    .firstName("firstName")
                    .lastName("lastName")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun revokeAffiliateInvite() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.campaign()

        val response =
            campaignService.revokeAffiliateInvite(
                CampaignRevokeAffiliateInviteParams.builder().id("id").inviteId("inviteId").build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun resendAffiliateInvite() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.campaign()

        val response =
            campaignService.resendAffiliateInvite(
                CampaignResendAffiliateInviteParams.builder().id("id").inviteId("inviteId").build()
            )

        response.validate()
    }
}
