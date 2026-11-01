// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.customdomain

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignCustomDomainTest {

    @Test
    fun create() {
        val campaignCustomDomain =
            CampaignCustomDomain.builder()
                .domain("https://refer.piedpiper.com")
                .isVerified(false)
                .verifiedAt(null)
                .dnsRecord(
                    CampaignCustomDomain.DnsRecord.builder()
                        .type(CampaignCustomDomain.DnsRecord.Type.CNAME)
                        .name("refer.piedpiper.com")
                        .value("grow.surf")
                        .build()
                )
                .createdAt(1761955200000L)
                .updatedAt(1761955200000L)
                .build()

        assertThat(campaignCustomDomain.domain()).contains("https://refer.piedpiper.com")
        assertThat(campaignCustomDomain.isVerified()).isEqualTo(false)
        assertThat(campaignCustomDomain.verifiedAt()).isEmpty
        assertThat(campaignCustomDomain.dnsRecord())
            .contains(
                CampaignCustomDomain.DnsRecord.builder()
                    .type(CampaignCustomDomain.DnsRecord.Type.CNAME)
                    .name("refer.piedpiper.com")
                    .value("grow.surf")
                    .build()
            )
        assertThat(campaignCustomDomain.createdAt()).contains(1761955200000L)
        assertThat(campaignCustomDomain.updatedAt()).contains(1761955200000L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val campaignCustomDomain =
            CampaignCustomDomain.builder()
                .domain("https://refer.piedpiper.com")
                .isVerified(true)
                .verifiedAt(1761955200000L)
                .dnsRecord(
                    CampaignCustomDomain.DnsRecord.builder()
                        .type(CampaignCustomDomain.DnsRecord.Type.CNAME)
                        .name("refer.piedpiper.com")
                        .value("grow.surf")
                        .build()
                )
                .createdAt(1761955200000L)
                .updatedAt(1761955200000L)
                .build()

        val roundtrippedCampaignCustomDomain =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(campaignCustomDomain),
                jacksonTypeRef<CampaignCustomDomain>(),
            )

        assertThat(roundtrippedCampaignCustomDomain).isEqualTo(campaignCustomDomain)
    }

    @Test
    fun deserializeWithoutDomain() {
        val campaignCustomDomain =
            jsonMapper()
                .readValue(
                    """{"domain":null,"isVerified":false,"verifiedAt":null,"dnsRecord":null,"createdAt":null,"updatedAt":null}""",
                    jacksonTypeRef<CampaignCustomDomain>(),
                )

        campaignCustomDomain.validate()
        assertThat(campaignCustomDomain.domain()).isEmpty
        assertThat(campaignCustomDomain.isVerified()).isEqualTo(false)
        assertThat(campaignCustomDomain.verifiedAt()).isEmpty
        assertThat(campaignCustomDomain.dnsRecord()).isEmpty
        assertThat(campaignCustomDomain.createdAt()).isEmpty
        assertThat(campaignCustomDomain.updatedAt()).isEmpty
    }
}
