// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AffiliateInviteListResponseTest {

    @Test
    fun create() {
        val affiliateInviteListResponse =
            AffiliateInviteListResponse.builder()
                .addInvite(AffiliateInvite.builder().id("id").build())
                .limit(0L)
                .offset(0L)
                .total(0L)
                .build()

        assertThat(affiliateInviteListResponse.invites())
            .containsExactly(AffiliateInvite.builder().id("id").build())
        assertThat(affiliateInviteListResponse.limit()).contains(0L)
        assertThat(affiliateInviteListResponse.offset()).contains(0L)
        assertThat(affiliateInviteListResponse.total()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val affiliateInviteListResponse =
            AffiliateInviteListResponse.builder()
                .addInvite(AffiliateInvite.builder().id("id").build())
                .limit(0L)
                .offset(0L)
                .total(0L)
                .build()

        val roundtrippedAffiliateInviteListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(affiliateInviteListResponse),
                jacksonTypeRef<AffiliateInviteListResponse>(),
            )

        assertThat(roundtrippedAffiliateInviteListResponse).isEqualTo(affiliateInviteListResponse)
    }
}
