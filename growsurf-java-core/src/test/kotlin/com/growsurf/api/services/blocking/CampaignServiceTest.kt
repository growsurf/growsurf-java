// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking

import com.growsurf.api.client.okhttp.GrowsurfOkHttpClient
import com.growsurf.api.models.campaign.CampaignListCommissionsParams
import com.growsurf.api.models.campaign.CampaignListLeaderboardParams
import com.growsurf.api.models.campaign.CampaignListParticipantsParams
import com.growsurf.api.models.campaign.CampaignListPayoutsParams
import com.growsurf.api.models.campaign.CampaignListReferralsParams
import com.growsurf.api.models.campaign.CampaignRetrieveAnalyticsParams
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
}
