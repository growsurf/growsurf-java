// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.async.campaign

import com.growsurf.api.core.ClientOptions
import com.growsurf.api.core.RequestOptions
import com.growsurf.api.core.http.HttpResponseFor
import com.growsurf.api.models.campaign.groups.DeleteRewardGroupResponse
import com.growsurf.api.models.campaign.groups.RewardGroup
import com.growsurf.api.models.campaign.groups.RewardGroupCreateParams
import com.growsurf.api.models.campaign.groups.RewardGroupDeleteParams
import com.growsurf.api.models.campaign.groups.RewardGroupListParams
import com.growsurf.api.models.campaign.groups.RewardGroupListResponse
import com.growsurf.api.models.campaign.groups.RewardGroupRetrieveParams
import com.growsurf.api.models.campaign.groups.RewardGroupUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Asynchronous group operations. Groups give some participants a different reward list. */
interface GroupsServiceAsync {
    fun withRawResponse(): WithRawResponse

    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupsServiceAsync

    /** Lists the program's groups in display order. Default is not listed. */
    fun list(id: String): CompletableFuture<RewardGroupListResponse> =
        list(id, RequestOptions.none())

    fun list(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RewardGroupListResponse> =
        list(RewardGroupListParams.builder().id(id).build(), requestOptions)

    fun list(
        params: RewardGroupListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RewardGroupListResponse>

    /** Creates a group with a copy of each active Default reward, except Leaderboard rewards. */
    fun create(id: String, params: RewardGroupCreateParams): CompletableFuture<RewardGroup> =
        create(id, params, RequestOptions.none())

    fun create(
        id: String,
        params: RewardGroupCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RewardGroup> = create(params.toBuilder().id(id).build(), requestOptions)

    fun create(
        params: RewardGroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RewardGroup>

    /** Retrieves one of the program's groups. */
    fun retrieve(
        groupId: String,
        params: RewardGroupRetrieveParams,
    ): CompletableFuture<RewardGroup> = retrieve(groupId, params, RequestOptions.none())

    fun retrieve(
        groupId: String,
        params: RewardGroupRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RewardGroup> =
        retrieve(params.toBuilder().groupId(groupId).build(), requestOptions)

    fun retrieve(
        params: RewardGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RewardGroup>

    /**
     * Renames, reorders, or changes the rules of a group. Sending `rules` replaces the whole list.
     */
    fun update(groupId: String, params: RewardGroupUpdateParams): CompletableFuture<RewardGroup> =
        update(groupId, params, RequestOptions.none())

    fun update(
        groupId: String,
        params: RewardGroupUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RewardGroup> =
        update(params.toBuilder().groupId(groupId).build(), requestOptions)

    fun update(
        params: RewardGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RewardGroup>

    /** Deletes a group. Its members move to Default, and its Campaign Rewards are removed. */
    fun delete(
        groupId: String,
        params: RewardGroupDeleteParams,
    ): CompletableFuture<DeleteRewardGroupResponse> = delete(groupId, params, RequestOptions.none())

    fun delete(
        groupId: String,
        params: RewardGroupDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DeleteRewardGroupResponse> =
        delete(params.toBuilder().groupId(groupId).build(), requestOptions)

    fun delete(
        params: RewardGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DeleteRewardGroupResponse>

    interface WithRawResponse {
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GroupsServiceAsync.WithRawResponse

        fun list(
            params: RewardGroupListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RewardGroupListResponse>>

        fun create(
            params: RewardGroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RewardGroup>>

        fun retrieve(
            params: RewardGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RewardGroup>>

        fun update(
            params: RewardGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RewardGroup>>

        fun delete(
            params: RewardGroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DeleteRewardGroupResponse>>
    }
}
