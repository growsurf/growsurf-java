// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking.campaign

import com.growsurf.api.client.okhttp.GrowsurfOkHttpClient
import com.growsurf.api.models.campaign.customdomain.CustomDomainSetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CustomDomainServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val customDomainService = client.campaign().customDomain()

        val campaignCustomDomain = customDomainService.retrieve("id")

        campaignCustomDomain.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun set() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val customDomainService = client.campaign().customDomain()

        val campaignCustomDomain =
            customDomainService.set(
                "id",
                CustomDomainSetParams.builder().domain("refer.piedpiper.com").build(),
            )

        campaignCustomDomain.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun verify() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val customDomainService = client.campaign().customDomain()

        val campaignCustomDomain = customDomainService.verify("id")

        campaignCustomDomain.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()
        val customDomainService = client.campaign().customDomain()

        val response = customDomainService.delete("id")

        response.validate()
    }
}
