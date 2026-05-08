// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import com.growsurf.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantUpdateParamsTest {

    @Test
    fun create() {
        ParticipantUpdateParams.builder()
            .id("id")
            .participantIdOrEmail("participantIdOrEmail")
            .email("dev@stainless.com")
            .firstName("Gavin")
            .lastName("Belson")
            .metadata(
                ParticipantUpdateParams.Metadata.builder()
                    .putAdditionalProperty("company", JsonValue.from("bar"))
                    .build()
            )
            .referralStatus(ParticipantUpdateParams.ReferralStatus.CREDIT_PENDING)
            .referredBy("referredBy")
            .unsubscribed(false)
            .addVanityKey("_1k--w2KifJ1")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ParticipantUpdateParams.builder()
                .id("id")
                .participantIdOrEmail("participantIdOrEmail")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("participantIdOrEmail")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ParticipantUpdateParams.builder()
                .id("id")
                .participantIdOrEmail("participantIdOrEmail")
                .email("dev@stainless.com")
                .firstName("Gavin")
                .lastName("Belson")
                .metadata(
                    ParticipantUpdateParams.Metadata.builder()
                        .putAdditionalProperty("company", JsonValue.from("bar"))
                        .build()
                )
                .referralStatus(ParticipantUpdateParams.ReferralStatus.CREDIT_PENDING)
                .referredBy("referredBy")
                .unsubscribed(false)
                .addVanityKey("_1k--w2KifJ1")
                .build()

        val body = params._body()

        assertThat(body.email()).contains("dev@stainless.com")
        assertThat(body.firstName()).contains("Gavin")
        assertThat(body.lastName()).contains("Belson")
        assertThat(body.metadata())
            .contains(
                ParticipantUpdateParams.Metadata.builder()
                    .putAdditionalProperty("company", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.referralStatus())
            .contains(ParticipantUpdateParams.ReferralStatus.CREDIT_PENDING)
        assertThat(body.referredBy()).contains("referredBy")
        assertThat(body.unsubscribed()).contains(false)
        assertThat(body.vanityKeys().getOrNull()).containsExactly("_1k--w2KifJ1")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ParticipantUpdateParams.builder()
                .id("id")
                .participantIdOrEmail("participantIdOrEmail")
                .build()

        val body = params._body()
    }
}
