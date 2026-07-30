// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignReviewAffiliateApplicationParamsTest {

    @Test
    fun create() {
        CampaignReviewAffiliateApplicationParams.builder()
            .id("id")
            .applicationId("applicationId")
            .allowImmediateReapply(true)
            .reapplyAllowedAt(0L)
            .rejectionReason("rejectionReason")
            .reviewNote("reviewNote")
            .status(CampaignReviewAffiliateApplicationParams.Status.APPROVED)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CampaignReviewAffiliateApplicationParams.builder()
                .id("id")
                .applicationId("applicationId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("applicationId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CampaignReviewAffiliateApplicationParams.builder()
                .id("id")
                .applicationId("applicationId")
                .allowImmediateReapply(true)
                .reapplyAllowedAt(0L)
                .rejectionReason("rejectionReason")
                .reviewNote("reviewNote")
                .status(CampaignReviewAffiliateApplicationParams.Status.APPROVED)
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CampaignReviewAffiliateApplicationParams.Body.builder()
                    .allowImmediateReapply(true)
                    .reapplyAllowedAt(0L)
                    .rejectionReason("rejectionReason")
                    .reviewNote("reviewNote")
                    .status(CampaignReviewAffiliateApplicationParams.Status.APPROVED)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CampaignReviewAffiliateApplicationParams.builder()
                .id("id")
                .applicationId("applicationId")
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(CampaignReviewAffiliateApplicationParams.Body.builder().build())
    }
}
