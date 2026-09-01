package com.growsurf.api.services.blocking

import com.github.tomakehurst.wiremock.client.WireMock.aResponse
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.growsurf.api.client.okhttp.GrowsurfOkHttpClient
import com.growsurf.api.models.campaign.AnalyticsAvailability
import com.growsurf.api.models.campaign.AnalyticsUnavailableReason
import com.growsurf.api.models.campaign.CampaignRetrieveActivationAnalyticsParams
import com.growsurf.api.models.campaign.CampaignRetrieveAnalyticsParams
import com.growsurf.api.models.campaign.participant.ParticipantActivationAnalytics
import com.growsurf.api.models.campaign.participant.ParticipantRetrieveAnalyticsParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ParticipantActivationEngagementAnalyticsContractTest {

    @Test
    fun legacyAndOptInContractsPreserveUnknownValues(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            GrowsurfOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()

        stubJson("/campaign/program_123/analytics", legacyAnalyticsJson)
        stubJson(
            "/campaign/program_123/analytics?include=engagement&platform=WEB&timezone=America%2FLos_Angeles",
            engagementAnalyticsJson,
        )
        stubJson(
            "/campaign/program_123/analytics/activation?cohortFrom=1754006400000&cohortTo=1756684800000&cohortInterval=week&observationWindowDays=30&timezone=America%2FLos_Angeles",
            activationAnalyticsJson,
        )
        stubJson(
            "/campaign/program_123/participant/participant_123/analytics?include=activation%2Cseries",
            participantAnalyticsJson,
        )
        stubJson(
            "/campaign/program_123/participant/participant_covered/analytics?include=activation",
            coveredParticipantAnalyticsJson,
        )

        client.campaign().retrieveAnalytics("program_123")
        val engagement =
            client
                .campaign()
                .retrieveAnalytics(
                    "program_123",
                    CampaignRetrieveAnalyticsParams.builder()
                        .include("engagement")
                        .platform(CampaignRetrieveAnalyticsParams.Platform.WEB)
                        .timezone("America/Los_Angeles")
                        .build(),
                )
                .engagement()
                .get()
        val activation =
            client
                .campaign()
                .retrieveActivationAnalytics(
                    "program_123",
                    CampaignRetrieveActivationAnalyticsParams.builder()
                        .cohortFrom(1_754_006_400_000L)
                        .cohortTo(1_756_684_800_000L)
                        .cohortInterval(
                            CampaignRetrieveActivationAnalyticsParams.CohortInterval.WEEK
                        )
                        .observationWindowDays(
                            CampaignRetrieveActivationAnalyticsParams.ObservationWindowDays.THIRTY
                        )
                        .timezone("America/Los_Angeles")
                        .build(),
                )
        val participant =
            client
                .campaign()
                .participant()
                .retrieveAnalytics(
                    "participant_123",
                    ParticipantRetrieveAnalyticsParams.builder()
                        .id("program_123")
                        .include("activation,series")
                        .build(),
                )
        val coveredParticipant =
            client
                .campaign()
                .participant()
                .retrieveAnalytics(
                    "participant_covered",
                    ParticipantRetrieveAnalyticsParams.builder()
                        .id("program_123")
                        .include("activation")
                        .build(),
                )

        assertThat(engagement.coverageStartAt()).isEmpty()
        assertThat(engagement.state()).isEqualTo(AnalyticsAvailability.UNAVAILABLE)
        assertThat(engagement.totals().portalViews().value()).isEmpty()
        assertThat(activation.aggregate().strictStages()).isEmpty()
        assertThat(participant.activation().get().state()).isEqualTo(AnalyticsAvailability.PARTIAL)
        assertThat(participant.activation().get().reason())
            .contains(AnalyticsUnavailableReason.PRE_COVERAGE)
        assertThat(participant.activation().get().milestones().firstPortalViewedAt()).isEmpty()
        assertThat(participant.series().get().single().portalViews()).isEmpty()
        assertThat(coveredParticipant.activation().get().milestones().firstPortalViewedAt())
            .contains(1_767_398_400_000L)
        assertThat(coveredParticipant.activation().get().milestones().firstShareChannel())
            .contains(ParticipantActivationAnalytics.ShareChannel.COPY_REF_LINK)

        verify(getRequestedFor(urlEqualTo("/campaign/program_123/analytics")))
        verify(
            getRequestedFor(
                urlEqualTo(
                    "/campaign/program_123/analytics?include=engagement&platform=WEB&timezone=America%2FLos_Angeles"
                )
            )
        )
        verify(
            getRequestedFor(
                urlEqualTo(
                    "/campaign/program_123/analytics/activation?cohortFrom=1754006400000&cohortTo=1756684800000&cohortInterval=week&observationWindowDays=30&timezone=America%2FLos_Angeles"
                )
            )
        )
        verify(
            getRequestedFor(
                urlEqualTo(
                    "/campaign/program_123/participant/participant_123/analytics?include=activation%2Cseries"
                )
            )
        )
    }

    private fun stubJson(url: String, body: String) {
        stubFor(
            get(urlEqualTo(url))
                .willReturn(
                    aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody(body)
                )
        )
    }

    private val legacyAnalyticsJson =
        """
        {"analytics":{},"startDate":1754006400000,"endDate":1756684800000}
        """
            .trimIndent()

    private val engagementAnalyticsJson =
        """
        {
          "analytics": {},
          "startDate": 1754006400000,
          "endDate": 1756684800000,
          "engagement": {
            "coverageStartAt": null,
            "metricContractVersion": 1,
            "programType": "REFERRAL",
            "timezone": "UTC",
            "interval": "day",
            "platform": {"requested":"WEB","applied":"WEB","state":"UNAVAILABLE"},
            "period": {
              "from": 1754006400000,
              "to": 1756684800000,
              "effectiveFrom": null,
              "previousFrom": 1751328000000,
              "previousTo": 1754006400000
            },
            "state": "UNAVAILABLE",
            "reason": "COVERAGE_UNAVAILABLE",
            "totals": {
              "activeParticipants": {"state":"UNAVAILABLE","value":null,"reason":"COVERAGE_UNAVAILABLE"},
              "sharingParticipants": {"state":"UNAVAILABLE","value":null,"reason":"COVERAGE_UNAVAILABLE"},
              "sharingRate": {"state":"UNAVAILABLE","value":null,"reason":"COVERAGE_UNAVAILABLE"},
              "repeatActiveParticipants": {"state":"UNAVAILABLE","value":null,"reason":"COVERAGE_UNAVAILABLE"},
              "repeatSharingParticipants": {"state":"UNAVAILABLE","value":null,"reason":"COVERAGE_UNAVAILABLE"},
              "retainedActiveParticipants": {"state":"UNAVAILABLE","value":null,"reason":"COVERAGE_UNAVAILABLE"},
              "portalViews": {"state":"UNAVAILABLE","value":null,"reason":"COVERAGE_UNAVAILABLE"},
              "shareActions": {"state":"UNAVAILABLE","value":null,"reason":"COVERAGE_UNAVAILABLE"}
            },
            "previousPeriod": {"state":"UNAVAILABLE","reason":"COVERAGE_UNAVAILABLE","totals":null},
            "comparison": {"state":"UNAVAILABLE","reason":"COVERAGE_UNAVAILABLE","metrics":null},
            "series": [],
            "breakdowns": {"platforms":[],"portalViewSources":[],"shareChannels":[],"firstShareChannels":[]}
          }
        }
        """
            .trimIndent()

    private val activationAnalyticsJson =
        """
        {
          "coverageStartAt": null,
          "metricContractVersion": 1,
          "programType": "AFFILIATE",
          "timezone": "UTC",
          "cohortInterval": "week",
          "observationWindowDays": 30,
          "portalViewedLabel": "Affiliate portal viewed",
          "portalViewedHelperText": "Signed-in participant view.",
          "aggregate": {
            "state": "UNAVAILABLE",
            "reason": "COVERAGE_UNAVAILABLE",
            "cohort": {
              "from": 1754006400000,
              "to": 1756684800000,
              "effectiveFrom": null,
              "maturedAt": 1759276800000,
              "asOf": 1756684800000,
              "anchorField": "approvedAsAffiliateAt"
            },
            "strictStages": null,
            "rawStageCounts": null,
            "stalledSegments": null,
            "outcomes": null,
            "largestDrop": null
          },
          "cohorts": []
        }
        """
            .trimIndent()

    private val participantAnalyticsJson =
        """
        {
          "analytics": {},
          "ranks": {},
          "shareCount": {},
          "activation": {
            "coverageStartAt": 1767225600000,
            "metricContractVersion": 1,
            "programType": "REFERRAL",
            "state": "PARTIAL",
            "reason": "PRE_COVERAGE",
            "cohort": {"anchorField":"enrolledAsAdvocateAt","anchorAt":null},
            "enrolledAsAdvocateAt": null,
            "milestones": {
              "firstPortalViewedAt": null,
              "firstReferralLinkCopiedAt": null,
              "firstShareAt": null,
              "firstShareChannel": null,
              "firstUniqueClickAt": null,
              "firstLeadAt": null,
              "firstReferralAt": null,
              "firstRewardAt": null,
              "firstCommissionAt": null,
              "payoutSetupCompletedAt": null
            }
          },
          "series": [{"periodStart":1767398400000,"portalViews":null,"shareActions":null}]
        }
        """
            .trimIndent()

    private val coveredParticipantAnalyticsJson =
        """
        {
          "analytics": {},
          "ranks": {},
          "shareCount": {},
          "activation": {
            "coverageStartAt": 1767225600000,
            "metricContractVersion": 1,
            "programType": "REFERRAL",
            "state": "AVAILABLE",
            "reason": null,
            "cohort": {"anchorField":"enrolledAsAdvocateAt","anchorAt":1767312000000},
            "enrolledAsAdvocateAt": 1767312000000,
            "milestones": {
              "firstPortalViewedAt": 1767398400000,
              "firstReferralLinkCopiedAt": 1767484800000,
              "firstShareAt": 1767484800000,
              "firstShareChannel": "copyRefLink",
              "firstUniqueClickAt": 1767571200000,
              "firstLeadAt": 1767657600000,
              "firstReferralAt": 1767744000000,
              "firstRewardAt": 1767830400000,
              "firstCommissionAt": null,
              "payoutSetupCompletedAt": null
            }
          }
        }
        """
            .trimIndent()
}
