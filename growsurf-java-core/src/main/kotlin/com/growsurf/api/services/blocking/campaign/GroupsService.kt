// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking.campaign

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

/** Group operations. Groups give some participants a different reward list. */
interface GroupsService {
    fun withRawResponse(): WithRawResponse

    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupsService

    /** Lists the program's groups in display order. Default is not listed. */
    fun list(id: String): RewardGroupListResponse = list(id, RequestOptions.none())

    fun list(id: String, requestOptions: RequestOptions): RewardGroupListResponse =
        list(RewardGroupListParams.builder().id(id).build(), requestOptions)

    fun list(
        params: RewardGroupListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RewardGroupListResponse

    /**
     * Creates an empty group. Add Campaign Rewards with its `groupId` before adding
     * participants or rules. Omit `rules` or send an empty array; nonempty rules return `400`.
     * Group names must be unique, ignoring case. Duplicate names return `409`; "Default" returns `400`.
     */
    fun create(id: String, params: RewardGroupCreateParams): RewardGroup =
        create(id, params, RequestOptions.none())

    fun create(
        id: String,
        params: RewardGroupCreateParams,
        requestOptions: RequestOptions,
    ): RewardGroup = create(params.toBuilder().id(id).build(), requestOptions)

    fun create(
        params: RewardGroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RewardGroup

    /** Retrieves one of the program's groups. */
    fun retrieve(groupId: String, params: RewardGroupRetrieveParams): RewardGroup =
        retrieve(groupId, params, RequestOptions.none())

    fun retrieve(
        groupId: String,
        params: RewardGroupRetrieveParams,
        requestOptions: RequestOptions,
    ): RewardGroup = retrieve(params.toBuilder().groupId(groupId).build(), requestOptions)

    fun retrieve(
        params: RewardGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RewardGroup

    /**
     * Renames, reorders, or changes the rules of a group. Sending `rules` replaces the whole list.
     * Group names must be unique in the program, ignoring case. A name that another group uses
     * returns `409`, and "Default" returns `400`.
     */
    fun update(groupId: String, params: RewardGroupUpdateParams): RewardGroup =
        update(groupId, params, RequestOptions.none())

    fun update(
        groupId: String,
        params: RewardGroupUpdateParams,
        requestOptions: RequestOptions,
    ): RewardGroup = update(params.toBuilder().groupId(groupId).build(), requestOptions)

    fun update(
        params: RewardGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RewardGroup

    /** Deletes a group. Its members move to Default, and its Campaign Rewards are removed. */
    fun delete(groupId: String, params: RewardGroupDeleteParams): DeleteRewardGroupResponse =
        delete(groupId, params, RequestOptions.none())

    fun delete(
        groupId: String,
        params: RewardGroupDeleteParams,
        requestOptions: RequestOptions,
    ): DeleteRewardGroupResponse =
        delete(params.toBuilder().groupId(groupId).build(), requestOptions)

    fun delete(
        params: RewardGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeleteRewardGroupResponse

    interface WithRawResponse {
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupsService.WithRawResponse

        @MustBeClosed
        fun list(
            params: RewardGroupListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RewardGroupListResponse>

        @MustBeClosed
        fun create(
            params: RewardGroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RewardGroup>

        @MustBeClosed
        fun retrieve(
            params: RewardGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RewardGroup>

        @MustBeClosed
        fun update(
            params: RewardGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RewardGroup>

        @MustBeClosed
        fun delete(
            params: RewardGroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeleteRewardGroupResponse>
    }
}
