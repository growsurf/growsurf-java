// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import com.growsurf.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantAddParamsTest {

    @Test
    fun create() {
        ParticipantAddParams.builder()
            .id("id")
            .email("gavin@hooli.com")
            .fingerprint("fingerprint")
            .firstName("Gavin")
            .ipAddress("203.0.113.10")
            .lastName("Belson")
            .metadata(
                ParticipantAddParams.Metadata.builder()
                    .putAdditionalProperty("companyName", JsonValue.from("bar"))
                    .putAdditionalProperty("industry", JsonValue.from("bar"))
                    .build()
            )
            .referralStatus(ParticipantAddParams.ReferralStatus.CREDIT_PENDING)
            .referredBy("richard-h8kp6l")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ParticipantAddParams.builder().id("id").email("gavin@hooli.com").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ParticipantAddParams.builder()
                .id("id")
                .email("gavin@hooli.com")
                .fingerprint("fingerprint")
                .firstName("Gavin")
                .ipAddress("203.0.113.10")
                .lastName("Belson")
                .metadata(
                    ParticipantAddParams.Metadata.builder()
                        .putAdditionalProperty("companyName", JsonValue.from("bar"))
                        .putAdditionalProperty("industry", JsonValue.from("bar"))
                        .build()
                )
                .referralStatus(ParticipantAddParams.ReferralStatus.CREDIT_PENDING)
                .referredBy("richard-h8kp6l")
                .build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("gavin@hooli.com")
        assertThat(body.fingerprint()).contains("fingerprint")
        assertThat(body.firstName()).contains("Gavin")
        assertThat(body.ipAddress()).contains("203.0.113.10")
        assertThat(body.lastName()).contains("Belson")
        assertThat(body.metadata())
            .contains(
                ParticipantAddParams.Metadata.builder()
                    .putAdditionalProperty("companyName", JsonValue.from("bar"))
                    .putAdditionalProperty("industry", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.referralStatus())
            .contains(ParticipantAddParams.ReferralStatus.CREDIT_PENDING)
        assertThat(body.referredBy()).contains("richard-h8kp6l")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ParticipantAddParams.builder().id("id").email("gavin@hooli.com").build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("gavin@hooli.com")
    }
}
