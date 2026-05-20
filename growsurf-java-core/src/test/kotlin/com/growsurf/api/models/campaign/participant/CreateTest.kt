// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateTest {

    @Test
    fun create() {
        val create =
            Create.builder()
                .email("dev@stainless.com")
                .fingerprint("fingerprint")
                .firstName("firstName")
                .ipAddress("ipAddress")
                .lastName("lastName")
                .metadata(
                    Create.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .mobileInstanceId("mobileInstanceId")
                .referralStatus(Create.ReferralStatus.CREDIT_PENDING)
                .referredBy("referredBy")
                .build()

        assertThat(create.email()).isEqualTo("dev@stainless.com")
        assertThat(create.fingerprint()).contains("fingerprint")
        assertThat(create.firstName()).contains("firstName")
        assertThat(create.ipAddress()).contains("ipAddress")
        assertThat(create.lastName()).contains("lastName")
        assertThat(create.metadata())
            .contains(
                Create.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(create.mobileInstanceId()).contains("mobileInstanceId")
        assertThat(create.referralStatus()).contains(Create.ReferralStatus.CREDIT_PENDING)
        assertThat(create.referredBy()).contains("referredBy")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val create =
            Create.builder()
                .email("dev@stainless.com")
                .fingerprint("fingerprint")
                .firstName("firstName")
                .ipAddress("ipAddress")
                .lastName("lastName")
                .metadata(
                    Create.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .mobileInstanceId("mobileInstanceId")
                .referralStatus(Create.ReferralStatus.CREDIT_PENDING)
                .referredBy("referredBy")
                .build()

        val roundtrippedCreate =
            jsonMapper.readValue(jsonMapper.writeValueAsString(create), jacksonTypeRef<Create>())

        assertThat(roundtrippedCreate).isEqualTo(create)
    }
}
