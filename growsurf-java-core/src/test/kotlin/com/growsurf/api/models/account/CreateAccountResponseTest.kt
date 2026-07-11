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
                .apiKey(
                    "sk_api_0123456789abcdef0123456789abcdef_u9v4m2q8n6r5s1t7w3x0y9z8a6b4c2d0e1f3g5h7"
                )
                .verificationStatus(CreateAccountResponse.VerificationStatus.NOT_REQUESTED)
                .build()

        assertThat(createAccountResponse.email()).isEqualTo("richard@piedpiper.com")
        assertThat(createAccountResponse.apiKey())
            .isEqualTo(
                "sk_api_0123456789abcdef0123456789abcdef_u9v4m2q8n6r5s1t7w3x0y9z8a6b4c2d0e1f3g5h7"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createAccountResponse =
            CreateAccountResponse.builder()
                .id("8f3a1c2e9b7d4f60a1e2c3d4")
                .email("richard@piedpiper.com")
                .apiKey(
                    "sk_api_0123456789abcdef0123456789abcdef_u9v4m2q8n6r5s1t7w3x0y9z8a6b4c2d0e1f3g5h7"
                )
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
