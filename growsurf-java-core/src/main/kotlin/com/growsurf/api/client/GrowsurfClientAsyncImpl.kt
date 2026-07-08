// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.client

import com.growsurf.api.core.ClientOptions
import com.growsurf.api.core.getPackageVersion
import com.growsurf.api.services.async.AccountServiceAsync
import com.growsurf.api.services.async.AccountServiceAsyncImpl
import com.growsurf.api.services.async.CampaignServiceAsync
import com.growsurf.api.services.async.CampaignServiceAsyncImpl
import java.util.function.Consumer

class GrowsurfClientAsyncImpl(private val clientOptions: ClientOptions) : GrowsurfClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: GrowsurfClient by lazy { GrowsurfClientImpl(clientOptions) }

    private val withRawResponse: GrowsurfClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val account: AccountServiceAsync by lazy {
        AccountServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val campaign: CampaignServiceAsync by lazy {
        CampaignServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): GrowsurfClient = sync

    override fun withRawResponse(): GrowsurfClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GrowsurfClientAsync =
        GrowsurfClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun account(): AccountServiceAsync = account

    override fun campaign(): CampaignServiceAsync = campaign

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GrowsurfClientAsync.WithRawResponse {

        private val account: AccountServiceAsync.WithRawResponse by lazy {
            AccountServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val campaign: CampaignServiceAsync.WithRawResponse by lazy {
            CampaignServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GrowsurfClientAsync.WithRawResponse =
            GrowsurfClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun account(): AccountServiceAsync.WithRawResponse = account

        override fun campaign(): CampaignServiceAsync.WithRawResponse = campaign
    }
}
