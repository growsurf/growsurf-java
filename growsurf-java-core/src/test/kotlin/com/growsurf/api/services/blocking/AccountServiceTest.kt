// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking

import com.growsurf.api.client.okhttp.GrowsurfOkHttpClient
import com.growsurf.api.models.account.AccountCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AccountServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val accountService = client.account()

        val response =
            accountService.create(
                AccountCreateParams.builder().email("richard@piedpiper.com").build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val accountService = client.account()

        val account = accountService.retrieve()

        account.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val accountService = client.account()

        val account = accountService.update()

        account.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun rotateApiKey() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val accountService = client.account()

        val response = accountService.rotateApiKey()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun requestVerification() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val accountService = client.account()

        val account = accountService.requestVerification()

        account.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun resendVerificationEmail() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val accountService = client.account()

        val response = accountService.resendVerificationEmail()

        response.validate()
    }
}
