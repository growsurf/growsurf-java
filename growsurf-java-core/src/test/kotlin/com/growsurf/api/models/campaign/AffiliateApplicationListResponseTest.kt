// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AffiliateApplicationListResponseTest {

    @Test
    fun create() {
        val affiliateApplicationListResponse =
            AffiliateApplicationListResponse.builder()
                .addApplication(affiliateApplication())
                .limit(0L)
                .offset(0L)
                .total(0L)
                .build()

        assertThat(affiliateApplicationListResponse.applications())
            .containsExactly(affiliateApplication())
        assertThat(affiliateApplicationListResponse.limit()).contains(0L)
        assertThat(affiliateApplicationListResponse.offset()).contains(0L)
        assertThat(affiliateApplicationListResponse.total()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val affiliateApplicationListResponse =
            AffiliateApplicationListResponse.builder()
                .addApplication(affiliateApplication())
                .limit(0L)
                .offset(0L)
                .total(0L)
                .build()

        val roundtrippedAffiliateApplicationListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(affiliateApplicationListResponse),
                jacksonTypeRef<AffiliateApplicationListResponse>(),
            )

        assertThat(roundtrippedAffiliateApplicationListResponse)
            .isEqualTo(affiliateApplicationListResponse)
    }

    private fun affiliateApplication() =
        AffiliateApplication.builder()
            .answers(emptyList())
            .createdAt(1L)
            .decidedAt(null)
            .email(null)
            .firstName(null)
            .id("id")
            .lastName(null)
            .participantId(null)
            .reapplyAllowedAt(null)
            .rejectionReason(null)
            .reviewedAt(null)
            .riskLevel(null)
            .status(AffiliateApplication.Status.PENDING)
            .termsAcceptedAt(null)
            .build()
}
