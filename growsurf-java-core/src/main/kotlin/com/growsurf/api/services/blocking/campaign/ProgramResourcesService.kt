// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking.campaign

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

/** Program Resource management and secure FILE upload operations. */
interface ProgramResourcesService {
    fun withRawResponse(): WithRawResponse

    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProgramResourcesService

    fun list(id: String): ProgramResourceListResponse = list(id, RequestOptions.none())

    fun list(id: String, requestOptions: RequestOptions): ProgramResourceListResponse =
        list(ProgramResourceListParams.builder().id(id).build(), requestOptions)

    fun list(
        params: ProgramResourceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProgramResourceListResponse

    fun create(id: String, params: ProgramResourceCreateParams): ProgramResource =
        create(id, params, RequestOptions.none())

    fun create(
        id: String,
        params: ProgramResourceCreateParams,
        requestOptions: RequestOptions,
    ): ProgramResource = create(params.toBuilder().id(id).build(), requestOptions)

    fun create(
        params: ProgramResourceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProgramResource

    fun update(resourceId: String, params: ProgramResourceUpdateParams): ProgramResource =
        update(resourceId, params, RequestOptions.none())

    fun update(
        resourceId: String,
        params: ProgramResourceUpdateParams,
        requestOptions: RequestOptions,
    ): ProgramResource = update(params.toBuilder().resourceId(resourceId).build(), requestOptions)

    fun update(
        params: ProgramResourceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProgramResource

    fun delete(
        resourceId: String,
        params: ProgramResourceDeleteParams,
    ): DeleteProgramResourceResponse = delete(resourceId, params, RequestOptions.none())

    fun delete(
        resourceId: String,
        params: ProgramResourceDeleteParams,
        requestOptions: RequestOptions,
    ): DeleteProgramResourceResponse =
        delete(params.toBuilder().resourceId(resourceId).build(), requestOptions)

    fun delete(
        params: ProgramResourceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeleteProgramResourceResponse

    fun createUploadTicket(
        id: String,
        params: ProgramResourceUploadTicketParams,
    ): ProgramResourceUploadTicket = createUploadTicket(id, params, RequestOptions.none())

    fun createUploadTicket(
        id: String,
        params: ProgramResourceUploadTicketParams,
        requestOptions: RequestOptions,
    ): ProgramResourceUploadTicket =
        createUploadTicket(params.toBuilder().id(id).build(), requestOptions)

    fun createUploadTicket(
        params: ProgramResourceUploadTicketParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProgramResourceUploadTicket

    interface WithRawResponse {
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProgramResourcesService.WithRawResponse

        @MustBeClosed
        fun list(
            params: ProgramResourceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProgramResourceListResponse>

        @MustBeClosed
        fun create(
            params: ProgramResourceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProgramResource>

        @MustBeClosed
        fun update(
            params: ProgramResourceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProgramResource>

        @MustBeClosed
        fun delete(
            params: ProgramResourceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeleteProgramResourceResponse>

        @MustBeClosed
        fun createUploadTicket(
            params: ProgramResourceUploadTicketParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProgramResourceUploadTicket>
    }
}
