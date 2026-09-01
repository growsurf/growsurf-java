// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.async.campaign

import com.growsurf.api.core.ClientOptions
import com.growsurf.api.core.RequestOptions
import com.growsurf.api.core.http.HttpResponseFor
import com.growsurf.api.models.campaign.resources.DeleteProgramResourceResponse
import com.growsurf.api.models.campaign.resources.ProgramResource
import com.growsurf.api.models.campaign.resources.ProgramResourceCreateParams
import com.growsurf.api.models.campaign.resources.ProgramResourceDeleteParams
import com.growsurf.api.models.campaign.resources.ProgramResourceListParams
import com.growsurf.api.models.campaign.resources.ProgramResourceListResponse
import com.growsurf.api.models.campaign.resources.ProgramResourceUpdateParams
import com.growsurf.api.models.campaign.resources.ProgramResourceUploadTicket
import com.growsurf.api.models.campaign.resources.ProgramResourceUploadTicketParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Asynchronous Program Resource management and secure FILE upload operations. */
interface ProgramResourcesServiceAsync {
    fun withRawResponse(): WithRawResponse

    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProgramResourcesServiceAsync

    fun list(id: String): CompletableFuture<ProgramResourceListResponse> =
        list(ProgramResourceListParams.builder().id(id).build())

    fun list(
        params: ProgramResourceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProgramResourceListResponse>

    fun create(
        id: String,
        params: ProgramResourceCreateParams,
    ): CompletableFuture<ProgramResource> = create(params.toBuilder().id(id).build())

    fun create(
        params: ProgramResourceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProgramResource>

    fun update(
        resourceId: String,
        params: ProgramResourceUpdateParams,
    ): CompletableFuture<ProgramResource> =
        update(params.toBuilder().resourceId(resourceId).build())

    fun update(
        params: ProgramResourceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProgramResource>

    fun delete(
        resourceId: String,
        params: ProgramResourceDeleteParams,
    ): CompletableFuture<DeleteProgramResourceResponse> =
        delete(params.toBuilder().resourceId(resourceId).build())

    fun delete(
        params: ProgramResourceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DeleteProgramResourceResponse>

    fun createUploadTicket(
        id: String,
        params: ProgramResourceUploadTicketParams,
    ): CompletableFuture<ProgramResourceUploadTicket> =
        createUploadTicket(params.toBuilder().id(id).build())

    fun createUploadTicket(
        params: ProgramResourceUploadTicketParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProgramResourceUploadTicket>

    interface WithRawResponse {
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProgramResourcesServiceAsync.WithRawResponse

        fun list(
            params: ProgramResourceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProgramResourceListResponse>>

        fun create(
            params: ProgramResourceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProgramResource>>

        fun update(
            params: ProgramResourceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProgramResource>>

        fun delete(
            params: ProgramResourceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DeleteProgramResourceResponse>>

        fun createUploadTicket(
            params: ProgramResourceUploadTicketParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProgramResourceUploadTicket>>
    }
}
