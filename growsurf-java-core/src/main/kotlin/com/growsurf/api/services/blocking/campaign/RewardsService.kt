// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking.campaign

import com.google.errorprone.annotations.MustBeClosed
import com.growsurf.api.core.ClientOptions
import com.growsurf.api.core.RequestOptions
import com.growsurf.api.core.http.HttpResponseFor
import com.growsurf.api.models.campaign.rewards.CampaignRewardListResponse
import com.growsurf.api.models.campaign.rewards.DeleteRewardResponse
import com.growsurf.api.models.campaign.rewards.Reward
import com.growsurf.api.models.campaign.rewards.RewardCreateParams
import com.growsurf.api.models.campaign.rewards.RewardDeleteParams
import com.growsurf.api.models.campaign.rewards.RewardListParams
import com.growsurf.api.models.campaign.rewards.RewardUpdateParams
import java.util.function.Consumer

/** Campaign reward (`CampaignReward`) configuration operations. */
interface RewardsService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RewardsService

    /**
     * Creates a new campaign reward (`CampaignReward`) with a server-generated ID. The reward type
     * must be compatible with the program type (affiliate programs support only `AFFILIATE`
     * rewards; referral programs support all other types). Enabling an active reward of a type
     * automatically enables that reward type on the program.
     */
    fun create(id: String, params: RewardCreateParams): Reward =
        create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: RewardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Reward = create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: RewardCreateParams): Reward = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RewardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Reward

    /**
     * Updates an existing campaign reward (`CampaignReward`). The reward `type` is immutable and
     * cannot be changed.
     */
    fun update(campaignRewardId: String, params: RewardUpdateParams): Reward =
        update(campaignRewardId, params, RequestOptions.none())

    /** @see update */
    fun update(
        campaignRewardId: String,
        params: RewardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Reward =
        update(params.toBuilder().campaignRewardId(campaignRewardId).build(), requestOptions)

    /** @see update */
    fun update(params: RewardUpdateParams): Reward = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RewardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Reward

    /**
     * Retrieves the list of a program's configured rewards (`CampaignReward`s). Returns the active,
     * visible, and enabled rewards — the same set embedded in the `rewards` array of the campaign
     * response.
     */
    fun list(id: String): CampaignRewardListResponse = list(id, RewardListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: RewardListParams = RewardListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignRewardListResponse = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: RewardListParams = RewardListParams.none(),
    ): CampaignRewardListResponse = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RewardListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignRewardListResponse

    /** @see list */
    fun list(params: RewardListParams): CampaignRewardListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): CampaignRewardListResponse =
        list(id, RewardListParams.none(), requestOptions)

    /**
     * Deletes a campaign reward (`CampaignReward`). The reward is deactivated, removed from the
     * program's reward set, and any connected upfront-discount coupons are cleaned up.
     */
    fun delete(campaignRewardId: String, params: RewardDeleteParams): DeleteRewardResponse =
        delete(campaignRewardId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        campaignRewardId: String,
        params: RewardDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeleteRewardResponse =
        delete(params.toBuilder().campaignRewardId(campaignRewardId).build(), requestOptions)

    /** @see delete */
    fun delete(params: RewardDeleteParams): DeleteRewardResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RewardDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeleteRewardResponse

    /** A view of [RewardsService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RewardsService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /campaign/{id}/reward-configs`, but is otherwise
         * the same as [RewardsService.create].
         */
        @MustBeClosed
        fun create(id: String, params: RewardCreateParams): HttpResponseFor<Reward> =
            create(id, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            id: String,
            params: RewardCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Reward> = create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: RewardCreateParams): HttpResponseFor<Reward> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RewardCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Reward>

        /**
         * Returns a raw HTTP response for `patch /campaign/{id}/reward-configs/{campaignRewardId}`,
         * but is otherwise the same as [RewardsService.update].
         */
        @MustBeClosed
        fun update(campaignRewardId: String, params: RewardUpdateParams): HttpResponseFor<Reward> =
            update(campaignRewardId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            campaignRewardId: String,
            params: RewardUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Reward> =
            update(params.toBuilder().campaignRewardId(campaignRewardId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: RewardUpdateParams): HttpResponseFor<Reward> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: RewardUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Reward>

        /**
         * Returns a raw HTTP response for `get /campaign/{id}/reward-configs`, but is otherwise the
         * same as [RewardsService.list].
         */
        @MustBeClosed
        fun list(id: String): HttpResponseFor<CampaignRewardListResponse> =
            list(id, RewardListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: RewardListParams = RewardListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignRewardListResponse> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: RewardListParams = RewardListParams.none(),
        ): HttpResponseFor<CampaignRewardListResponse> = list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RewardListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignRewardListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: RewardListParams): HttpResponseFor<CampaignRewardListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignRewardListResponse> =
            list(id, RewardListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /campaign/{id}/reward-configs/{campaignRewardId}`, but is otherwise the same as
         * [RewardsService.delete].
         */
        @MustBeClosed
        fun delete(
            campaignRewardId: String,
            params: RewardDeleteParams,
        ): HttpResponseFor<DeleteRewardResponse> =
            delete(campaignRewardId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            campaignRewardId: String,
            params: RewardDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeleteRewardResponse> =
            delete(params.toBuilder().campaignRewardId(campaignRewardId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: RewardDeleteParams): HttpResponseFor<DeleteRewardResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: RewardDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeleteRewardResponse>
    }
}
