// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.jsonMapper
import com.growsurf.api.errors.GrowsurfInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

internal class AffiliateApplicationAnswerTest {

    @Test
    fun create() {
        val affiliateApplicationAnswer =
            AffiliateApplicationAnswer.builder()
                .fieldId("fieldId")
                .label("label")
                .type(AffiliateApplicationAnswer.Type.URL)
                .value("value")
                .build()

        assertThat(affiliateApplicationAnswer.fieldId()).isEqualTo("fieldId")
        assertThat(affiliateApplicationAnswer.label()).isEqualTo("label")
        assertThat(affiliateApplicationAnswer.type()).isEqualTo(AffiliateApplicationAnswer.Type.URL)
        assertThat(affiliateApplicationAnswer._value()).isEqualTo(JsonValue.from("value"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val affiliateApplicationAnswer =
            AffiliateApplicationAnswer.builder()
                .fieldId("fieldId")
                .label("label")
                .type(AffiliateApplicationAnswer.Type.CHECKBOX)
                .value(true)
                .build()

        val roundtrippedAffiliateApplicationAnswer =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(affiliateApplicationAnswer),
                jacksonTypeRef<AffiliateApplicationAnswer>(),
            )

        assertThat(roundtrippedAffiliateApplicationAnswer).isEqualTo(affiliateApplicationAnswer)
    }

    @Test
    fun supportsEverySavedFormScalarFieldType() {
        assertThat(
                listOf(
                        AffiliateApplicationAnswer.Type.TEXT,
                        AffiliateApplicationAnswer.Type.TEXTAREA,
                        AffiliateApplicationAnswer.Type.URL,
                        AffiliateApplicationAnswer.Type.COUNTRY,
                        AffiliateApplicationAnswer.Type.NUMBER,
                        AffiliateApplicationAnswer.Type.DROPDOWN,
                        AffiliateApplicationAnswer.Type.RADIO,
                        AffiliateApplicationAnswer.Type.CHECKBOX,
                    )
                    .map { it.asString() }
            )
            .containsExactly(
                "text",
                "textarea",
                "url",
                "country",
                "number",
                "dropdown",
                "radio",
                "checkbox",
            )
    }

    @Test
    fun acceptsOnlyScalarAnswerValues() {
        listOf(
                JsonValue.from("value"),
                JsonValue.from(42),
                JsonValue.from(4.25),
                JsonValue.from(true),
            )
            .forEach { value ->
                assertThat(
                        AffiliateApplicationAnswer.builder()
                            .fieldId("fieldId")
                            .label("label")
                            .type(AffiliateApplicationAnswer.Type.TEXT)
                            .value(value)
                            .build()
                            .validate()
                            ._value()
                    )
                    .isEqualTo(value)
            }

        listOf(
                JsonValue.from(null),
                JsonValue.from(listOf("value")),
                JsonValue.from(mapOf("value" to true)),
            )
            .forEach { value ->
                assertThatThrownBy {
                        AffiliateApplicationAnswer.builder()
                            .fieldId("fieldId")
                            .label("label")
                            .type(AffiliateApplicationAnswer.Type.TEXT)
                            .value(value)
                            .build()
                            .validate()
                    }
                    .isInstanceOf(GrowsurfInvalidDataException::class.java)
            }
    }

    @Test
    fun missingRequiredResponseFieldThrows() {
        assertThatThrownBy { AffiliateApplicationAnswer.builder().build() }
            .isInstanceOf(IllegalStateException::class.java)
    }
}
