// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.customdomain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomDomainSetParamsTest {

    @Test
    fun create() {
        CustomDomainSetParams.builder().id("id").domain("refer.piedpiper.com").build()
    }

    @Test
    fun pathParams() {
        val params = CustomDomainSetParams.builder().id("id").domain("refer.piedpiper.com").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params = CustomDomainSetParams.builder().id("id").domain("refer.piedpiper.com").build()

        val body = params._body()

        assertThat(body.domain()).isEqualTo("refer.piedpiper.com")
    }
}
