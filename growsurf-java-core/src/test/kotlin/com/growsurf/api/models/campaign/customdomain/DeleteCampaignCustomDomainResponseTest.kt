// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.customdomain

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeleteCampaignCustomDomainResponseTest {

    @Test
    fun create() {
        val deleteCampaignCustomDomainResponse =
            DeleteCampaignCustomDomainResponse.builder()
                .domain("https://refer.piedpiper.com")
                .success(true)
                .build()

        assertThat(deleteCampaignCustomDomainResponse.domain())
            .isEqualTo("https://refer.piedpiper.com")
        assertThat(deleteCampaignCustomDomainResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val deleteCampaignCustomDomainResponse =
            DeleteCampaignCustomDomainResponse.builder()
                .domain("https://refer.piedpiper.com")
                .success(true)
                .build()

        val roundtrippedDeleteCampaignCustomDomainResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(deleteCampaignCustomDomainResponse),
                jacksonTypeRef<DeleteCampaignCustomDomainResponse>(),
            )

        assertThat(roundtrippedDeleteCampaignCustomDomainResponse)
            .isEqualTo(deleteCampaignCustomDomainResponse)
    }
}
