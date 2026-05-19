// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.growsurf.api.core.JsonValue
import com.growsurf.api.models.campaign.participant.Create
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignCreateMobileParticipantTokenParamsTest {

    @Test
    fun create() {
        CampaignCreateMobileParticipantTokenParams.builder()
            .id("id")
            .create(
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
                    .referralStatus(Create.ReferralStatus.CREDIT_PENDING)
                    .referredBy("referredBy")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CampaignCreateMobileParticipantTokenParams.builder()
                .id("id")
                .create(Create.builder().email("dev@stainless.com").build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CampaignCreateMobileParticipantTokenParams.builder()
                .id("id")
                .create(
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
                        .referralStatus(Create.ReferralStatus.CREDIT_PENDING)
                        .referredBy("referredBy")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
                    .referralStatus(Create.ReferralStatus.CREDIT_PENDING)
                    .referredBy("referredBy")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CampaignCreateMobileParticipantTokenParams.builder()
                .id("id")
                .create(Create.builder().email("dev@stainless.com").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(Create.builder().email("dev@stainless.com").build())
    }
}
