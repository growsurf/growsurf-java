// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.growsurf.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignUpdateParamsTest {

    @Test
    fun create() {
        CampaignUpdateParams.builder()
            .id("id")
            .name("name")
            .companyName("companyName")
            .companyLogoImageUrl("companyLogoImageUrl")
            .currencyIso("currencyISO")
            .goal("goal")
            .status(CampaignUpdateParams.Status.DRAFT)
            .design(
                CampaignUpdateParams.Design.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .emails(
                CampaignUpdateParams.Emails.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .options(
                CampaignUpdateParams.Options.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .notifications(
                CampaignUpdateParams.Notifications.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .installation(
                CampaignUpdateParams.Installation.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = CampaignUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CampaignUpdateParams.builder()
                .id("id")
                .name("name")
                .goal("goal")
                .status(CampaignUpdateParams.Status.IN_PROGRESS)
                .build()

        val body = params._body()

        assertThat(body.name()).contains("name")
        assertThat(body.goal()).contains("goal")
        assertThat(body.status()).contains(CampaignUpdateParams.Status.IN_PROGRESS)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CampaignUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
