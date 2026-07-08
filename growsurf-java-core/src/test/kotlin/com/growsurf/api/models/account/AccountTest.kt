// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.account

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountTest {

    @Test
    fun create() {
        val account =
            Account.builder()
                .id("8f3a1c2e9b7d4f60a1e2c3d4")
                .email("richard@piedpiper.com")
                .firstName("Richard")
                .lastName("Hendricks")
                .company("Pied Piper")
                .verificationStatus(Account.VerificationStatus.VERIFIED)
                .verificationRequestedAt(1719792000000L)
                .createdAt(1717200000000L)
                .build()

        assertThat(account.id()).isEqualTo("8f3a1c2e9b7d4f60a1e2c3d4")
        assertThat(account.email()).isEqualTo("richard@piedpiper.com")
        assertThat(account.verificationStatus()).isEqualTo(Account.VerificationStatus.VERIFIED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val account =
            Account.builder()
                .id("8f3a1c2e9b7d4f60a1e2c3d4")
                .email("richard@piedpiper.com")
                .firstName("Richard")
                .lastName("Hendricks")
                .company("Pied Piper")
                .verificationStatus(Account.VerificationStatus.VERIFIED)
                .createdAt(1717200000000L)
                .build()

        val roundtrippedAccount =
            jsonMapper.readValue(jsonMapper.writeValueAsString(account), jacksonTypeRef<Account>())

        assertThat(roundtrippedAccount).isEqualTo(account)
    }
}
