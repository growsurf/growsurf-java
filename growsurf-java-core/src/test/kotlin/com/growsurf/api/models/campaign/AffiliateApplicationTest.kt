// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

internal class AffiliateApplicationTest {

    @Test
    fun create() {
        val affiliateApplication =
            AffiliateApplication.builder()
                .addAnswer(
                    AffiliateApplicationAnswer.builder()
                        .fieldId("fieldId")
                        .label("label")
                        .type(AffiliateApplicationAnswer.Type.URL)
                        .value(JsonValue.from("value"))
                        .build()
                )
                .createdAt(0L)
                .decidedAt(0L)
                .email("email")
                .firstName("firstName")
                .id("id")
                .lastName("lastName")
                .participantId("participantId")
                .reapplyAllowedAt(0L)
                .rejectionReason("rejectionReason")
                .reviewedAt(0L)
                .riskLevel(AffiliateApplication.RiskLevel.LOW)
                .status(AffiliateApplication.Status.PENDING)
                .termsAcceptedAt(0L)
                .build()

        assertThat(affiliateApplication.answers())
            .isEqualTo(
                listOf(
                    AffiliateApplicationAnswer.builder()
                        .fieldId("fieldId")
                        .label("label")
                        .type(AffiliateApplicationAnswer.Type.URL)
                        .value(JsonValue.from("value"))
                        .build()
                )
            )
        assertThat(affiliateApplication.createdAt()).isEqualTo(0L)
        assertThat(affiliateApplication.decidedAt()).contains(0L)
        assertThat(affiliateApplication.email()).contains("email")
        assertThat(affiliateApplication.firstName()).contains("firstName")
        assertThat(affiliateApplication.id()).isEqualTo("id")
        assertThat(affiliateApplication.lastName()).contains("lastName")
        assertThat(affiliateApplication.participantId()).contains("participantId")
        assertThat(affiliateApplication.reapplyAllowedAt()).contains(0L)
        assertThat(affiliateApplication.rejectionReason()).contains("rejectionReason")
        assertThat(affiliateApplication.reviewedAt()).contains(0L)
        assertThat(affiliateApplication.riskLevel()).contains(AffiliateApplication.RiskLevel.LOW)
        assertThat(affiliateApplication.status()).isEqualTo(AffiliateApplication.Status.PENDING)
        assertThat(affiliateApplication.termsAcceptedAt()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val affiliateApplication =
            AffiliateApplication.builder()
                .addAnswer(
                    AffiliateApplicationAnswer.builder()
                        .fieldId("fieldId")
                        .label("label")
                        .type(AffiliateApplicationAnswer.Type.URL)
                        .value(JsonValue.from("value"))
                        .build()
                )
                .createdAt(0L)
                .decidedAt(0L)
                .email("email")
                .firstName("firstName")
                .id("id")
                .lastName("lastName")
                .participantId("participantId")
                .reapplyAllowedAt(0L)
                .rejectionReason("rejectionReason")
                .reviewedAt(0L)
                .riskLevel(AffiliateApplication.RiskLevel.LOW)
                .status(AffiliateApplication.Status.PENDING)
                .termsAcceptedAt(0L)
                .build()

        val roundtrippedAffiliateApplication =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(affiliateApplication),
                jacksonTypeRef<AffiliateApplication>(),
            )

        assertThat(roundtrippedAffiliateApplication).isEqualTo(affiliateApplication)
    }

    @Test
    fun nullableRuntimeFieldsRoundtrip() {
        val jsonMapper = jsonMapper()
        val affiliateApplication =
            AffiliateApplication.builder()
                .answers(emptyList())
                .createdAt(1L)
                .decidedAt(null)
                .email(null)
                .firstName(null)
                .id("application-id")
                .lastName(null)
                .participantId(null)
                .reapplyAllowedAt(null)
                .rejectionReason(null)
                .reviewedAt(null)
                .riskLevel(null)
                .status(AffiliateApplication.Status.PENDING)
                .termsAcceptedAt(null)
                .build()

        val json = jsonMapper.writeValueAsString(affiliateApplication)
        val roundtrippedAffiliateApplication =
            jsonMapper.readValue(json, jacksonTypeRef<AffiliateApplication>())

        assertThat(json).contains("\"email\":null")
        assertThat(roundtrippedAffiliateApplication).isEqualTo(affiliateApplication)
    }

    @Test
    fun missingRequiredResponseFieldThrows() {
        assertThatThrownBy { AffiliateApplication.builder().build() }
            .isInstanceOf(IllegalStateException::class.java)
    }

    @Test
    fun removedStructuredFieldsAreNotExposed() {
        val removedMethods =
            setOf(
                "audience",
                "country",
                "experience",
                "promotionChannels",
                "socialUrls",
                "websiteUrl",
            )

        assertThat(AffiliateApplication::class.java.methods.map { it.name })
            .doesNotContainAnyElementsOf(removedMethods)
    }
}
