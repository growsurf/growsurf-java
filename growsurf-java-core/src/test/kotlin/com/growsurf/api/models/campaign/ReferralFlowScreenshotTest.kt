// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReferralFlowScreenshotTest {

    @Test
    fun create() {
        val referralFlowScreenshot =
            ReferralFlowScreenshot.builder()
                .contentType("image/jpeg")
                .expiresAt(OffsetDateTime.parse("2026-07-09T00:15:00.000Z"))
                .height(800L)
                .label("Referrer window")
                .url(
                    "https://screenshots.growsurf.com/previews/richard-referrer.jpg?expires=1751932500"
                )
                .view(ReferralFlowScreenshot.View.REFERRER)
                .width(1280L)
                .build()

        assertThat(referralFlowScreenshot.contentType()).contains("image/jpeg")
        assertThat(referralFlowScreenshot.expiresAt())
            .contains(OffsetDateTime.parse("2026-07-09T00:15:00.000Z"))
        assertThat(referralFlowScreenshot.height()).contains(800L)
        assertThat(referralFlowScreenshot.label()).contains("Referrer window")
        assertThat(referralFlowScreenshot.url())
            .contains(
                "https://screenshots.growsurf.com/previews/richard-referrer.jpg?expires=1751932500"
            )
        assertThat(referralFlowScreenshot.view()).contains(ReferralFlowScreenshot.View.REFERRER)
        assertThat(referralFlowScreenshot.width()).contains(1280L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val referralFlowScreenshot =
            ReferralFlowScreenshot.builder()
                .contentType("image/jpeg")
                .expiresAt(OffsetDateTime.parse("2026-07-09T00:15:00.000Z"))
                .height(800L)
                .label("Referrer window")
                .url(
                    "https://screenshots.growsurf.com/previews/richard-referrer.jpg?expires=1751932500"
                )
                .view(ReferralFlowScreenshot.View.REFERRER)
                .width(1280L)
                .build()

        val roundtrippedReferralFlowScreenshot =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(referralFlowScreenshot),
                jacksonTypeRef<ReferralFlowScreenshot>(),
            )

        assertThat(roundtrippedReferralFlowScreenshot).isEqualTo(referralFlowScreenshot)
    }
}
