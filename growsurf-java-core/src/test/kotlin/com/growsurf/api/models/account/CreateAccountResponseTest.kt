// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.account

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateAccountResponseTest {

    @Test
    fun create() {
        val createAccountResponse =
            CreateAccountResponse.builder()
                .id("8f3a1c2e9b7d4f60a1e2c3d4")
                .email("richard@piedpiper.com")
                .apiKey("9a8b7c6d5e4f3a2b1c0d9e8f")
                .verificationStatus(CreateAccountResponse.VerificationStatus.NOT_REQUESTED)
                .build()

        assertThat(createAccountResponse.email()).isEqualTo("richard@piedpiper.com")
        assertThat(createAccountResponse.apiKey()).isEqualTo("9a8b7c6d5e4f3a2b1c0d9e8f")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createAccountResponse =
            CreateAccountResponse.builder()
                .id("8f3a1c2e9b7d4f60a1e2c3d4")
                .email("richard@piedpiper.com")
                .apiKey("9a8b7c6d5e4f3a2b1c0d9e8f")
                .verificationStatus(CreateAccountResponse.VerificationStatus.NOT_REQUESTED)
                .build()

        val roundtrippedCreateAccountResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createAccountResponse),
                jacksonTypeRef<CreateAccountResponse>(),
            )

        assertThat(roundtrippedCreateAccountResponse).isEqualTo(createAccountResponse)
    }
}
