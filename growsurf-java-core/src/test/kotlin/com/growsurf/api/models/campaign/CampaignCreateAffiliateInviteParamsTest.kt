// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignCreateAffiliateInviteParamsTest {

    @Test
    fun create() {
        CampaignCreateAffiliateInviteParams.builder()
            .id("id")
            .email("email")
            .firstName("firstName")
            .lastName("lastName")
            .build()
    }

    @Test
    fun pathParams() {
        val params = CampaignCreateAffiliateInviteParams.builder().id("id").email("email").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CampaignCreateAffiliateInviteParams.builder()
                .id("id")
                .email("email")
                .firstName("firstName")
                .lastName("lastName")
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CampaignCreateAffiliateInviteParams.Body.builder()
                    .email("email")
                    .firstName("firstName")
                    .lastName("lastName")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CampaignCreateAffiliateInviteParams.builder().id("id").email("email").build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(CampaignCreateAffiliateInviteParams.Body.builder().email("email").build())
    }
}
