// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AffiliateInviteTest {

    @Test
    fun create() {
        val affiliateInvite =
            AffiliateInvite.builder()
                .acceptedAt(0L)
                .createdAt(0L)
                .email("email")
                .expiresAt(0L)
                .firstName("firstName")
                .id("id")
                .lastName("lastName")
                .lastSentAt(0L)
                .revokedAt(0L)
                .status(AffiliateInvite.Status.PENDING)
                .build()

        assertThat(affiliateInvite.acceptedAt()).contains(0L)
        assertThat(affiliateInvite.createdAt()).contains(0L)
        assertThat(affiliateInvite.email()).contains("email")
        assertThat(affiliateInvite.expiresAt()).contains(0L)
        assertThat(affiliateInvite.firstName()).contains("firstName")
        assertThat(affiliateInvite.id()).contains("id")
        assertThat(affiliateInvite.lastName()).contains("lastName")
        assertThat(affiliateInvite.lastSentAt()).contains(0L)
        assertThat(affiliateInvite.revokedAt()).contains(0L)
        assertThat(affiliateInvite.status()).contains(AffiliateInvite.Status.PENDING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val affiliateInvite =
            AffiliateInvite.builder()
                .acceptedAt(0L)
                .createdAt(0L)
                .email("email")
                .expiresAt(0L)
                .firstName("firstName")
                .id("id")
                .lastName("lastName")
                .lastSentAt(0L)
                .revokedAt(0L)
                .status(AffiliateInvite.Status.PENDING)
                .build()

        val roundtrippedAffiliateInvite =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(affiliateInvite),
                jacksonTypeRef<AffiliateInvite>(),
            )

        assertThat(roundtrippedAffiliateInvite).isEqualTo(affiliateInvite)
    }

    @Test
    fun nullableRuntimeFieldsRoundtrip() {
        val jsonMapper = jsonMapper()
        val affiliateInvite =
            AffiliateInvite.builder()
                .acceptedAt(null)
                .firstName(null)
                .lastName(null)
                .revokedAt(null)
                .build()

        val json = jsonMapper.writeValueAsString(affiliateInvite)
        val roundtrippedAffiliateInvite =
            jsonMapper.readValue(json, jacksonTypeRef<AffiliateInvite>())

        assertThat(json).contains("\"acceptedAt\":null")
        assertThat(roundtrippedAffiliateInvite).isEqualTo(affiliateInvite)
    }
}
