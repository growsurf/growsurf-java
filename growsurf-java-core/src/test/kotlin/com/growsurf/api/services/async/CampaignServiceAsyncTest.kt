// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.async

import com.growsurf.api.client.okhttp.GrowsurfOkHttpClientAsync
import com.growsurf.api.core.JsonValue
import com.growsurf.api.models.campaign.CampaignCreateMobileParticipantTokenParams
import com.growsurf.api.models.campaign.CampaignCreateParams
import com.growsurf.api.models.campaign.CampaignListCommissionsParams
import com.growsurf.api.models.campaign.CampaignListLeaderboardParams
import com.growsurf.api.models.campaign.CampaignListParticipantsParams
import com.growsurf.api.models.campaign.CampaignListPayoutsParams
import com.growsurf.api.models.campaign.CampaignListReferralsParams
import com.growsurf.api.models.campaign.CampaignRetrieveAnalyticsParams
import com.growsurf.api.models.campaign.participant.Create
import com.growsurf.api.models.campaign.participant.ReferralStatus
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CampaignServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val campaignServiceAsync = client.campaign()

        val campaignFuture = campaignServiceAsync.retrieve("id")

        val campaign = campaignFuture.get()
        campaign.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val campaignServiceAsync = client.campaign()

        val campaignsFuture = campaignServiceAsync.list()

        val campaigns = campaignsFuture.get()
        campaigns.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val campaignServiceAsync = client.campaign()

        val campaignFuture =
            campaignServiceAsync.create(
                CampaignCreateParams.builder().type(CampaignCreateParams.Type.REFERRAL).build()
            )

        val campaign = campaignFuture.get()
        campaign.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val campaignServiceAsync = client.campaign()

        val campaignFuture = campaignServiceAsync.update("id")

        val campaign = campaignFuture.get()
        campaign.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun clone() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val campaignServiceAsync = client.campaign()

        val campaignFuture = campaignServiceAsync.clone("id")

        val campaign = campaignFuture.get()
        campaign.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getReferralFlowScreenshots() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val campaignServiceAsync = client.campaign()

        val responseFuture = campaignServiceAsync.getReferralFlowScreenshots("id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createMobileParticipantToken() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val campaignServiceAsync = client.campaign()

        val responseFuture =
            campaignServiceAsync.createMobileParticipantToken(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listCommissions() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val campaignServiceAsync = client.campaign()

        val participantCommissionListFuture =
            campaignServiceAsync.listCommissions(
                CampaignListCommissionsParams.builder()
                    .id("id")
                    .limit(1L)
                    .nextId("nextId")
                    .status(CampaignListCommissionsParams.Status.PENDING)
                    .build()
            )

        val participantCommissionList = participantCommissionListFuture.get()
        participantCommissionList.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listLeaderboard() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val campaignServiceAsync = client.campaign()

        val participantListFuture =
            campaignServiceAsync.listLeaderboard(
                CampaignListLeaderboardParams.builder()
                    .id("id")
                    .isMonthly(true)
                    .leaderboardType(CampaignListLeaderboardParams.LeaderboardType.ALL_TIME)
                    .limit(1L)
                    .nextId("nextId")
                    .build()
            )

        val participantList = participantListFuture.get()
        participantList.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listParticipants() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val campaignServiceAsync = client.campaign()

        val participantListFuture =
            campaignServiceAsync.listParticipants(
                CampaignListParticipantsParams.builder().id("id").limit(1L).nextId("nextId").build()
            )

        val participantList = participantListFuture.get()
        participantList.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listPayouts() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val campaignServiceAsync = client.campaign()

        val participantPayoutListFuture =
            campaignServiceAsync.listPayouts(
                CampaignListPayoutsParams.builder()
                    .id("id")
                    .limit(1L)
                    .nextId("nextId")
                    .status(CampaignListPayoutsParams.Status.UPCOMING)
                    .build()
            )

        val participantPayoutList = participantPayoutListFuture.get()
        participantPayoutList.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listReferrals() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val campaignServiceAsync = client.campaign()

        val referralListFuture =
            campaignServiceAsync.listReferrals(
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

        val referralList = referralListFuture.get()
        referralList.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveAnalytics() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val campaignServiceAsync = client.campaign()

        val responseFuture =
            campaignServiceAsync.retrieveAnalytics(
                CampaignRetrieveAnalyticsParams.builder()
                    .id("id")
                    .days(1L)
                    .endDate(0L)
                    .startDate(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
