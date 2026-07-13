// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking

import com.github.tomakehurst.wiremock.client.WireMock.aResponse
import com.github.tomakehurst.wiremock.client.WireMock.equalToJson
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.patch
import com.github.tomakehurst.wiremock.client.WireMock.patchRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.growsurf.api.client.okhttp.GrowsurfOkHttpClient
import com.growsurf.api.models.account.CreateAccountResponse
import com.growsurf.api.models.team.Team
import com.growsurf.api.models.team.TeamUpdateParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class TeamContractTest {

    @Test
    fun finalTeamRequestPaths(wmRuntimeInfo: WireMockRuntimeInfo) {
        val teamJson =
            """{"name":"Pied Piper","verificationStatus":"VERIFIED","verificationRequestedAt":1719792000000}"""
        stubFor(get(urlEqualTo("/team")).willReturn(jsonResponse(teamJson)))
        stubFor(patch(urlEqualTo("/team")).willReturn(jsonResponse(teamJson)))
        stubFor(post(urlEqualTo("/team/verification-request")).willReturn(jsonResponse(teamJson)))
        stubFor(
            post(urlEqualTo("/team/owner/verification-email"))
                .willReturn(jsonResponse("""{"success":true,"status":"SENT"}"""))
        )
        stubFor(
            post(urlEqualTo("/api-key/rotate"))
                .willReturn(jsonResponse("""{"apiKey":"sk_api_replacement"}"""))
        )
        val client =
            GrowsurfOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()

        assertThat(client.team().retrieve().name()).isEqualTo("Pied Piper")
        client.team().update(TeamUpdateParams.builder().name("Pied Piper Labs").build())
        client.team().requestVerification()
        client.team().resendOwnerVerificationEmail()
        assertThat(client.team().rotateApiKey().apiKey()).isEqualTo("sk_api_replacement")

        verify(getRequestedFor(urlEqualTo("/team")))
        verify(
            patchRequestedFor(urlEqualTo("/team"))
                .withRequestBody(equalToJson("""{"name":"Pied Piper Labs"}"""))
        )
        verify(postRequestedFor(urlEqualTo("/team/verification-request")))
        verify(postRequestedFor(urlEqualTo("/team/owner/verification-email")))
        verify(postRequestedFor(urlEqualTo("/api-key/rotate")))
    }

    @Test
    fun safeTeamAndOnboardingModels() {
        assertThat(Team::class.java.methods.map { it.name }).doesNotContain("id", "email")
        assertThat(CreateAccountResponse.Builder::class.java.methods.map { it.name })
            .doesNotContain("id")
    }

    private fun jsonResponse(body: String) =
        aResponse().withStatus(200).withHeader("Content-Type", "application/json").withBody(body)
}
