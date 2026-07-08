// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.async

import com.growsurf.api.client.okhttp.GrowsurfOkHttpClientAsync
import com.growsurf.api.models.account.AccountCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AccountServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.account()

        val responseFuture =
            accountServiceAsync.create(
                AccountCreateParams.builder().email("richard@piedpiper.com").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.account()

        val accountFuture = accountServiceAsync.retrieve()

        val account = accountFuture.get()
        account.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.account()

        val accountFuture = accountServiceAsync.update()

        val account = accountFuture.get()
        account.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun rotateApiKey() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.account()

        val responseFuture = accountServiceAsync.rotateApiKey()

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun requestVerification() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.account()

        val accountFuture = accountServiceAsync.requestVerification()

        val account = accountFuture.get()
        account.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun resendVerificationEmail() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.account()

        val responseFuture = accountServiceAsync.resendVerificationEmail()

        val response = responseFuture.get()
        response.validate()
    }
}
