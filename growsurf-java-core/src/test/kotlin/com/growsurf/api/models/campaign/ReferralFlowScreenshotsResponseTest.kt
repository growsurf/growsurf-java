// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReferralFlowScreenshotsResponseTest {

    @Test
    fun create() {
        val referralFlowScreenshotsResponse =
            ReferralFlowScreenshotsResponse.builder()
                .expiresAt(OffsetDateTime.parse("2026-07-09T00:15:00.000Z"))
                .generatedAt(OffsetDateTime.parse("2026-07-09T00:00:00.000Z"))
                .addScreenshot(
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
                )
                .build()

        assertThat(referralFlowScreenshotsResponse.expiresAt())
            .contains(OffsetDateTime.parse("2026-07-09T00:15:00.000Z"))
        assertThat(referralFlowScreenshotsResponse.generatedAt())
            .contains(OffsetDateTime.parse("2026-07-09T00:00:00.000Z"))
        assertThat(referralFlowScreenshotsResponse.screenshots().getOrNull())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val referralFlowScreenshotsResponse =
            ReferralFlowScreenshotsResponse.builder()
                .expiresAt(OffsetDateTime.parse("2026-07-09T00:15:00.000Z"))
                .generatedAt(OffsetDateTime.parse("2026-07-09T00:00:00.000Z"))
                .addScreenshot(
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
                )
                .build()

        val roundtrippedReferralFlowScreenshotsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(referralFlowScreenshotsResponse),
                jacksonTypeRef<ReferralFlowScreenshotsResponse>(),
            )

        assertThat(roundtrippedReferralFlowScreenshotsResponse)
            .isEqualTo(referralFlowScreenshotsResponse)
    }
}
