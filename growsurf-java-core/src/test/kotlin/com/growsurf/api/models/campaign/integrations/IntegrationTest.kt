// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.integrations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationTest {

    @Test
    fun create() {
        val integration =
            Integration.builder()
                .id("stripe")
                .name("Stripe")
                .connectUrl(
                    "https://app.growsurf.com/editor/aq2ln3/options/integrations?integration=stripe"
                )
                .connected(true)
                .enabled(true)
                .autoDisabled(false)
                .build()

        assertThat(integration.id()).isEqualTo("stripe")
        assertThat(integration.name()).isEqualTo("Stripe")
        assertThat(integration.connectUrl())
            .isEqualTo(
                "https://app.growsurf.com/editor/aq2ln3/options/integrations?integration=stripe"
            )
        assertThat(integration.connected()).isTrue()
        assertThat(integration.enabled()).isTrue()
        assertThat(integration.autoDisabled()).isFalse()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val integration =
            Integration.builder()
                .id("stripe")
                .name("Stripe")
                .connectUrl(
                    "https://app.growsurf.com/editor/aq2ln3/options/integrations?integration=stripe"
                )
                .connected(true)
                .enabled(true)
                .autoDisabled(false)
                .build()

        val roundtrippedIntegration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integration),
                jacksonTypeRef<Integration>(),
            )

        assertThat(roundtrippedIntegration).isEqualTo(integration)
    }
}
