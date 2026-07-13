// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.client

import com.growsurf.api.core.ClientOptions
import com.growsurf.api.core.getPackageVersion
import com.growsurf.api.services.blocking.AccountService
import com.growsurf.api.services.blocking.AccountServiceImpl
import com.growsurf.api.services.blocking.CampaignService
import com.growsurf.api.services.blocking.CampaignServiceImpl
import com.growsurf.api.services.blocking.TeamService
import com.growsurf.api.services.blocking.TeamServiceImpl
import java.util.function.Consumer

class GrowsurfClientImpl(private val clientOptions: ClientOptions) : GrowsurfClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: GrowsurfClientAsync by lazy { GrowsurfClientAsyncImpl(clientOptions) }

    private val withRawResponse: GrowsurfClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val account: AccountService by lazy { AccountServiceImpl(clientOptionsWithUserAgent) }

    private val team: TeamService by lazy { TeamServiceImpl(clientOptionsWithUserAgent) }

    private val campaign: CampaignService by lazy {
        CampaignServiceImpl(clientOptionsWithUserAgent)
    }

    override fun async(): GrowsurfClientAsync = async

    override fun withRawResponse(): GrowsurfClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GrowsurfClient =
        GrowsurfClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun account(): AccountService = account

    override fun team(): TeamService = team

    override fun campaign(): CampaignService = campaign

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GrowsurfClient.WithRawResponse {

        private val account: AccountService.WithRawResponse by lazy {
            AccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val team: TeamService.WithRawResponse by lazy {
            TeamServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val campaign: CampaignService.WithRawResponse by lazy {
            CampaignServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GrowsurfClient.WithRawResponse =
            GrowsurfClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun account(): AccountService.WithRawResponse = account

        override fun team(): TeamService.WithRawResponse = team

        override fun campaign(): CampaignService.WithRawResponse = campaign
    }
}
