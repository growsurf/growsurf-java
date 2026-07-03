// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignUpdateParamsTest {

    @Test
    fun create() {
        CampaignUpdateParams.builder()
            .id("id")
            .name("name")
            .companyName("companyName")
            .companyLogoImageUrl("companyLogoImageUrl")
            .status(CampaignUpdateParams.Status.DRAFT)
            .build()
    }

    @Test
    fun pathParams() {
        val params = CampaignUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CampaignUpdateParams.builder()
                .id("id")
                .name("name")
                .status(CampaignUpdateParams.Status.IN_PROGRESS)
                .build()

        val body = params._body()

        assertThat(body.name()).contains("name")
        assertThat(body.status()).contains(CampaignUpdateParams.Status.IN_PROGRESS)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CampaignUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
