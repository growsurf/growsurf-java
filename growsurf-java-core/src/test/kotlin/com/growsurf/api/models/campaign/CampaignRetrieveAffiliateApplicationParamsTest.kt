// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignRetrieveAffiliateApplicationParamsTest {

    @Test
    fun create() {
        CampaignRetrieveAffiliateApplicationParams.builder()
            .id("id")
            .applicationId("applicationId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CampaignRetrieveAffiliateApplicationParams.builder()
                .id("id")
                .applicationId("applicationId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("applicationId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
