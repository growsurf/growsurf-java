// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.account

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountCreateParamsTest {

    @Test
    fun create() {
        AccountCreateParams.builder()
            .email("richard@piedpiper.com")
            .firstName("Richard")
            .lastName("Hendricks")
            .company("Pied Piper")
            .build()
    }

    @Test
    fun body() {
        val params =
            AccountCreateParams.builder()
                .email("richard@piedpiper.com")
                .firstName("Richard")
                .build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("richard@piedpiper.com")
        assertThat(body.firstName()).contains("Richard")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AccountCreateParams.builder().email("richard@piedpiper.com").build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("richard@piedpiper.com")
    }
}
