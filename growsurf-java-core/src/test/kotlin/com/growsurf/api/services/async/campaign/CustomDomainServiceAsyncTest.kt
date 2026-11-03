// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.async.campaign

import com.growsurf.api.client.okhttp.GrowsurfOkHttpClientAsync
import com.growsurf.api.models.campaign.customdomain.CustomDomainSetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CustomDomainServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val customDomainServiceAsync = client.campaign().customDomain()

        val campaignCustomDomainFuture = customDomainServiceAsync.retrieve("id")

        val campaignCustomDomain = campaignCustomDomainFuture.get()

        campaignCustomDomain.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun set() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val customDomainServiceAsync = client.campaign().customDomain()

        val campaignCustomDomainFuture =
            customDomainServiceAsync.set(
                "id",
                CustomDomainSetParams.builder().domain("refer.piedpiper.com").build(),
            )

        val campaignCustomDomain = campaignCustomDomainFuture.get()

        campaignCustomDomain.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun verify() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val customDomainServiceAsync = client.campaign().customDomain()

        val campaignCustomDomainFuture = customDomainServiceAsync.verify("id")

        val campaignCustomDomain = campaignCustomDomainFuture.get()

        campaignCustomDomain.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = GrowsurfOkHttpClientAsync.builder().apiKey("My API Key").build()
        val customDomainServiceAsync = client.campaign().customDomain()

        val responseFuture = customDomainServiceAsync.delete("id")

        val response = responseFuture.get()

        response.validate()
    }
}
