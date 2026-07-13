// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.async

import com.github.tomakehurst.wiremock.client.WireMock.aResponse
import com.github.tomakehurst.wiremock.client.WireMock.absent
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.growsurf.api.client.okhttp.GrowsurfOkHttpClientAsync
import com.growsurf.api.models.account.AccountCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class AccountServiceAsyncTest {

    @Test
    fun createSupportsKeylessClientsAndNeverSendsAuthorization(wmRuntimeInfo: WireMockRuntimeInfo) {
        stubFor(
            post(urlEqualTo("/accounts"))
                .willReturn(
                    aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody(
                            """{"email":"richard@piedpiper.com","apiKey":"new_key","verificationStatus":"NOT_REQUESTED"}"""
                        )
                )
        )
        val params = AccountCreateParams.builder().email("richard@piedpiper.com").build()

        val keylessClient =
            GrowsurfOkHttpClientAsync.builder().baseUrl(wmRuntimeInfo.httpBaseUrl).build()
        keylessClient.account().create(params).get()
        val configuredClient =
            GrowsurfOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        configuredClient.account().create(params).get()

        verify(2, postRequestedFor(urlEqualTo("/accounts")).withHeader("Authorization", absent()))
    }

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
}
