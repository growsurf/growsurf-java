// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.rewards

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.growsurf.api.core.Enum
import com.growsurf.api.core.ExcludeMissing
import com.growsurf.api.core.JsonField
import com.growsurf.api.core.JsonMissing
import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.Params
import com.growsurf.api.core.checkRequired
import com.growsurf.api.core.http.Headers
import com.growsurf.api.core.http.QueryParams
import com.growsurf.api.core.toImmutable
import com.growsurf.api.errors.GrowsurfInvalidDataException
import com.growsurf.api.models.campaign.CommissionStructure
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Creates a new program reward (`CampaignReward`) with a server-generated ID. The reward type must
 * be compatible with the program type (affiliate programs support only `AFFILIATE` rewards;
 * referral programs support all other types). Enabling an active reward of a type automatically
 * enables that reward type on the program.
 */
class RewardCreateParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * The reward type. Immutable after creation.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = body.type()

    /**
     * The reward title (internal label).
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun title(): Optional<String> = body.title()

    /**
     * The reward description shown to the referrer.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * The reward description shown to the referred friend (double-sided rewards).
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referralDescription(): Optional<String> = body.referralDescription()

    /**
     * An image URL for the reward.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun imageUrl(): Optional<String> = body.imageUrl()

    /**
     * Whether the reward is active (awardable).
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isActive(): Optional<Boolean> = body.isActive()

    /**
     * Whether the reward is visible.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isVisible(): Optional<Boolean> = body.isVisible()

    /**
     * Whether the reward can be earned an unlimited number of times.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isUnlimited(): Optional<Boolean> = body.isUnlimited()

    /**
     * For double-sided rewards, deliver the referred friend's reward upfront as a discount.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referredRewardUpfront(): Optional<Boolean> = body.referredRewardUpfront()

    /**
     * The number of times a participant can earn the reward (overridden by `isUnlimited`).
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun limit(): Optional<Long> = body.limit()

    /**
     * The number of referrals required to earn the reward.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conversionsRequired(): Optional<Long> = body.conversionsRequired()

    /**
     * The maximum number of winners (LEADERBOARD rewards).
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numberOfWinners(): Optional<Long> = body.numberOfWinners()

    /**
     * The display order of the reward.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun order(): Optional<Long> = body.order()

    /**
     * The window over which `limit` applies.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun limitDuration(): Optional<LimitDuration> = body.limitDuration()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextMilestonePrefix(): Optional<String> = body.nextMilestonePrefix()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextMilestoneSuffix(): Optional<String> = body.nextMilestoneSuffix()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun couponCode(): Optional<String> = body.couponCode()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referralCouponCode(): Optional<String> = body.referralCouponCode()

    /**
     * Custom key/value metadata (single-level; values are stored as strings).
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * The affiliate commission structure (AFFILIATE rewards only).
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commissionStructure(): Optional<CommissionStructure> = body.commissionStructure()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<Type> = body._type()

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _title(): JsonField<String> = body._title()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [referralDescription].
     *
     * Unlike [referralDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _referralDescription(): JsonField<String> = body._referralDescription()

    /**
     * Returns the raw JSON value of [imageUrl].
     *
     * Unlike [imageUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _imageUrl(): JsonField<String> = body._imageUrl()

    /**
     * Returns the raw JSON value of [isActive].
     *
     * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _isActive(): JsonField<Boolean> = body._isActive()

    /**
     * Returns the raw JSON value of [isVisible].
     *
     * Unlike [isVisible], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _isVisible(): JsonField<Boolean> = body._isVisible()

    /**
     * Returns the raw JSON value of [isUnlimited].
     *
     * Unlike [isUnlimited], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _isUnlimited(): JsonField<Boolean> = body._isUnlimited()

    /**
     * Returns the raw JSON value of [referredRewardUpfront].
     *
     * Unlike [referredRewardUpfront], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _referredRewardUpfront(): JsonField<Boolean> = body._referredRewardUpfront()

    /**
     * Returns the raw JSON value of [limit].
     *
     * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _limit(): JsonField<Long> = body._limit()

    /**
     * Returns the raw JSON value of [conversionsRequired].
     *
     * Unlike [conversionsRequired], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _conversionsRequired(): JsonField<Long> = body._conversionsRequired()

    /**
     * Returns the raw JSON value of [numberOfWinners].
     *
     * Unlike [numberOfWinners], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _numberOfWinners(): JsonField<Long> = body._numberOfWinners()

    /**
     * Returns the raw JSON value of [order].
     *
     * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _order(): JsonField<Long> = body._order()

    /**
     * Returns the raw JSON value of [limitDuration].
     *
     * Unlike [limitDuration], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _limitDuration(): JsonField<LimitDuration> = body._limitDuration()

    /**
     * Returns the raw JSON value of [nextMilestonePrefix].
     *
     * Unlike [nextMilestonePrefix], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _nextMilestonePrefix(): JsonField<String> = body._nextMilestonePrefix()

    /**
     * Returns the raw JSON value of [nextMilestoneSuffix].
     *
     * Unlike [nextMilestoneSuffix], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _nextMilestoneSuffix(): JsonField<String> = body._nextMilestoneSuffix()

    /**
     * Returns the raw JSON value of [couponCode].
     *
     * Unlike [couponCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _couponCode(): JsonField<String> = body._couponCode()

    /**
     * Returns the raw JSON value of [referralCouponCode].
     *
     * Unlike [referralCouponCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _referralCouponCode(): JsonField<String> = body._referralCouponCode()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [commissionStructure].
     *
     * Unlike [commissionStructure], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _commissionStructure(): JsonField<CommissionStructure> = body._commissionStructure()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RewardCreateParams].
         *
         * The following fields are required:
         * ```java
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RewardCreateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(rewardCreateParams: RewardCreateParams) = apply {
            id = rewardCreateParams.id
            body = rewardCreateParams.body.toBuilder()
            additionalHeaders = rewardCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = rewardCreateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [type]
         * - [title]
         * - [description]
         * - [referralDescription]
         * - [imageUrl]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The reward type. Immutable after creation. */
        fun type(type: Type) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { body.type(type) }

        /** The reward title (internal label). */
        fun title(title: String) = apply { body.title(title) }

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { body.title(title) }

        /** The reward description shown to the referrer. */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** The reward description shown to the referred friend (double-sided rewards). */
        fun referralDescription(referralDescription: String?) = apply {
            body.referralDescription(referralDescription)
        }

        /**
         * Alias for calling [Builder.referralDescription] with `referralDescription.orElse(null)`.
         */
        fun referralDescription(referralDescription: Optional<String>) =
            referralDescription(referralDescription.getOrNull())

        /**
         * Sets [Builder.referralDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referralDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referralDescription(referralDescription: JsonField<String>) = apply {
            body.referralDescription(referralDescription)
        }

        /** An image URL for the reward. */
        fun imageUrl(imageUrl: String?) = apply { body.imageUrl(imageUrl) }

        /** Alias for calling [Builder.imageUrl] with `imageUrl.orElse(null)`. */
        fun imageUrl(imageUrl: Optional<String>) = imageUrl(imageUrl.getOrNull())

        /**
         * Sets [Builder.imageUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.imageUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun imageUrl(imageUrl: JsonField<String>) = apply { body.imageUrl(imageUrl) }

        /** Whether the reward is active (awardable). */
        fun isActive(isActive: Boolean) = apply { body.isActive(isActive) }

        /**
         * Sets [Builder.isActive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isActive(isActive: JsonField<Boolean>) = apply { body.isActive(isActive) }

        /** Whether the reward is visible. */
        fun isVisible(isVisible: Boolean) = apply { body.isVisible(isVisible) }

        /**
         * Sets [Builder.isVisible] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isVisible] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isVisible(isVisible: JsonField<Boolean>) = apply { body.isVisible(isVisible) }

        /** Whether the reward can be earned an unlimited number of times. */
        fun isUnlimited(isUnlimited: Boolean) = apply { body.isUnlimited(isUnlimited) }

        /**
         * Sets [Builder.isUnlimited] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isUnlimited] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isUnlimited(isUnlimited: JsonField<Boolean>) = apply { body.isUnlimited(isUnlimited) }

        /** For double-sided rewards, deliver the referred friend's reward upfront as a discount. */
        fun referredRewardUpfront(referredRewardUpfront: Boolean) = apply {
            body.referredRewardUpfront(referredRewardUpfront)
        }

        /**
         * Sets [Builder.referredRewardUpfront] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referredRewardUpfront] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referredRewardUpfront(referredRewardUpfront: JsonField<Boolean>) = apply {
            body.referredRewardUpfront(referredRewardUpfront)
        }

        /** The number of times a participant can earn the reward (overridden by `isUnlimited`). */
        fun limit(limit: Long) = apply { body.limit(limit) }

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Long>) = apply { body.limit(limit) }

        /** The number of referrals required to earn the reward. */
        fun conversionsRequired(conversionsRequired: Long) = apply {
            body.conversionsRequired(conversionsRequired)
        }

        /**
         * Sets [Builder.conversionsRequired] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conversionsRequired] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun conversionsRequired(conversionsRequired: JsonField<Long>) = apply {
            body.conversionsRequired(conversionsRequired)
        }

        /** The maximum number of winners (LEADERBOARD rewards). */
        fun numberOfWinners(numberOfWinners: Long) = apply { body.numberOfWinners(numberOfWinners) }

        /**
         * Sets [Builder.numberOfWinners] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numberOfWinners] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numberOfWinners(numberOfWinners: JsonField<Long>) = apply {
            body.numberOfWinners(numberOfWinners)
        }

        /** The display order of the reward. */
        fun order(order: Long) = apply { body.order(order) }

        /**
         * Sets [Builder.order] to an arbitrary JSON value.
         *
         * You should usually call [Builder.order] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun order(order: JsonField<Long>) = apply { body.order(order) }

        /** The window over which `limit` applies. */
        fun limitDuration(limitDuration: LimitDuration) = apply {
            body.limitDuration(limitDuration)
        }

        /**
         * Sets [Builder.limitDuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limitDuration] with a well-typed [LimitDuration] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun limitDuration(limitDuration: JsonField<LimitDuration>) = apply {
            body.limitDuration(limitDuration)
        }

        fun nextMilestonePrefix(nextMilestonePrefix: String?) = apply {
            body.nextMilestonePrefix(nextMilestonePrefix)
        }

        /**
         * Alias for calling [Builder.nextMilestonePrefix] with `nextMilestonePrefix.orElse(null)`.
         */
        fun nextMilestonePrefix(nextMilestonePrefix: Optional<String>) =
            nextMilestonePrefix(nextMilestonePrefix.getOrNull())

        /**
         * Sets [Builder.nextMilestonePrefix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextMilestonePrefix] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun nextMilestonePrefix(nextMilestonePrefix: JsonField<String>) = apply {
            body.nextMilestonePrefix(nextMilestonePrefix)
        }

        fun nextMilestoneSuffix(nextMilestoneSuffix: String?) = apply {
            body.nextMilestoneSuffix(nextMilestoneSuffix)
        }

        /**
         * Alias for calling [Builder.nextMilestoneSuffix] with `nextMilestoneSuffix.orElse(null)`.
         */
        fun nextMilestoneSuffix(nextMilestoneSuffix: Optional<String>) =
            nextMilestoneSuffix(nextMilestoneSuffix.getOrNull())

        /**
         * Sets [Builder.nextMilestoneSuffix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextMilestoneSuffix] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun nextMilestoneSuffix(nextMilestoneSuffix: JsonField<String>) = apply {
            body.nextMilestoneSuffix(nextMilestoneSuffix)
        }

        fun couponCode(couponCode: String?) = apply { body.couponCode(couponCode) }

        /** Alias for calling [Builder.couponCode] with `couponCode.orElse(null)`. */
        fun couponCode(couponCode: Optional<String>) = couponCode(couponCode.getOrNull())

        /**
         * Sets [Builder.couponCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.couponCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun couponCode(couponCode: JsonField<String>) = apply { body.couponCode(couponCode) }

        fun referralCouponCode(referralCouponCode: String?) = apply {
            body.referralCouponCode(referralCouponCode)
        }

        /**
         * Alias for calling [Builder.referralCouponCode] with `referralCouponCode.orElse(null)`.
         */
        fun referralCouponCode(referralCouponCode: Optional<String>) =
            referralCouponCode(referralCouponCode.getOrNull())

        /**
         * Sets [Builder.referralCouponCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referralCouponCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referralCouponCode(referralCouponCode: JsonField<String>) = apply {
            body.referralCouponCode(referralCouponCode)
        }

        /** Custom key/value metadata (single-level; values are stored as strings). */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /** The affiliate commission structure (AFFILIATE rewards only). */
        fun commissionStructure(commissionStructure: CommissionStructure) = apply {
            body.commissionStructure(commissionStructure)
        }

        /**
         * Sets [Builder.commissionStructure] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commissionStructure] with a well-typed
         * [CommissionStructure] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun commissionStructure(commissionStructure: JsonField<CommissionStructure>) = apply {
            body.commissionStructure(commissionStructure)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [RewardCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RewardCreateParams =
            RewardCreateParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Request body for creating a program reward. `type` is required and must be compatible with
     * the program type.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val type: JsonField<Type>,
        private val title: JsonField<String>,
        private val description: JsonField<String>,
        private val referralDescription: JsonField<String>,
        private val imageUrl: JsonField<String>,
        private val isActive: JsonField<Boolean>,
        private val isVisible: JsonField<Boolean>,
        private val isUnlimited: JsonField<Boolean>,
        private val referredRewardUpfront: JsonField<Boolean>,
        private val limit: JsonField<Long>,
        private val conversionsRequired: JsonField<Long>,
        private val numberOfWinners: JsonField<Long>,
        private val order: JsonField<Long>,
        private val limitDuration: JsonField<LimitDuration>,
        private val nextMilestonePrefix: JsonField<String>,
        private val nextMilestoneSuffix: JsonField<String>,
        private val couponCode: JsonField<String>,
        private val referralCouponCode: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val commissionStructure: JsonField<CommissionStructure>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("referralDescription")
            @ExcludeMissing
            referralDescription: JsonField<String> = JsonMissing.of(),
            @JsonProperty("imageUrl")
            @ExcludeMissing
            imageUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("isActive")
            @ExcludeMissing
            isActive: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("isVisible")
            @ExcludeMissing
            isVisible: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("isUnlimited")
            @ExcludeMissing
            isUnlimited: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("referredRewardUpfront")
            @ExcludeMissing
            referredRewardUpfront: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("conversionsRequired")
            @ExcludeMissing
            conversionsRequired: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("numberOfWinners")
            @ExcludeMissing
            numberOfWinners: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("order") @ExcludeMissing order: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("limitDuration")
            @ExcludeMissing
            limitDuration: JsonField<LimitDuration> = JsonMissing.of(),
            @JsonProperty("nextMilestonePrefix")
            @ExcludeMissing
            nextMilestonePrefix: JsonField<String> = JsonMissing.of(),
            @JsonProperty("nextMilestoneSuffix")
            @ExcludeMissing
            nextMilestoneSuffix: JsonField<String> = JsonMissing.of(),
            @JsonProperty("couponCode")
            @ExcludeMissing
            couponCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("referralCouponCode")
            @ExcludeMissing
            referralCouponCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("commissionStructure")
            @ExcludeMissing
            commissionStructure: JsonField<CommissionStructure> = JsonMissing.of(),
        ) : this(
            type,
            title,
            description,
            referralDescription,
            imageUrl,
            isActive,
            isVisible,
            isUnlimited,
            referredRewardUpfront,
            limit,
            conversionsRequired,
            numberOfWinners,
            order,
            limitDuration,
            nextMilestonePrefix,
            nextMilestoneSuffix,
            couponCode,
            referralCouponCode,
            metadata,
            commissionStructure,
            mutableMapOf(),
        )

        /**
         * The reward type. Immutable after creation.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * The reward title (internal label).
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun title(): Optional<String> = title.getOptional("title")

        /**
         * The reward description shown to the referrer.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * The reward description shown to the referred friend (double-sided rewards).
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun referralDescription(): Optional<String> =
            referralDescription.getOptional("referralDescription")

        /**
         * An image URL for the reward.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun imageUrl(): Optional<String> = imageUrl.getOptional("imageUrl")

        /**
         * Whether the reward is active (awardable).
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun isActive(): Optional<Boolean> = isActive.getOptional("isActive")

        /**
         * Whether the reward is visible.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun isVisible(): Optional<Boolean> = isVisible.getOptional("isVisible")

        /**
         * Whether the reward can be earned an unlimited number of times.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun isUnlimited(): Optional<Boolean> = isUnlimited.getOptional("isUnlimited")

        /**
         * For double-sided rewards, deliver the referred friend's reward upfront as a discount.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun referredRewardUpfront(): Optional<Boolean> =
            referredRewardUpfront.getOptional("referredRewardUpfront")

        /**
         * The number of times a participant can earn the reward (overridden by `isUnlimited`).
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun limit(): Optional<Long> = limit.getOptional("limit")

        /**
         * The number of referrals required to earn the reward.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun conversionsRequired(): Optional<Long> =
            conversionsRequired.getOptional("conversionsRequired")

        /**
         * The maximum number of winners (LEADERBOARD rewards).
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun numberOfWinners(): Optional<Long> = numberOfWinners.getOptional("numberOfWinners")

        /**
         * The display order of the reward.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun order(): Optional<Long> = order.getOptional("order")

        /**
         * The window over which `limit` applies.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun limitDuration(): Optional<LimitDuration> = limitDuration.getOptional("limitDuration")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun nextMilestonePrefix(): Optional<String> =
            nextMilestonePrefix.getOptional("nextMilestonePrefix")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun nextMilestoneSuffix(): Optional<String> =
            nextMilestoneSuffix.getOptional("nextMilestoneSuffix")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun couponCode(): Optional<String> = couponCode.getOptional("couponCode")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun referralCouponCode(): Optional<String> =
            referralCouponCode.getOptional("referralCouponCode")

        /**
         * Custom key/value metadata (single-level; values are stored as strings).
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * The affiliate commission structure (AFFILIATE rewards only).
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun commissionStructure(): Optional<CommissionStructure> =
            commissionStructure.getOptional("commissionStructure")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [referralDescription].
         *
         * Unlike [referralDescription], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("referralDescription")
        @ExcludeMissing
        fun _referralDescription(): JsonField<String> = referralDescription

        /**
         * Returns the raw JSON value of [imageUrl].
         *
         * Unlike [imageUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("imageUrl") @ExcludeMissing fun _imageUrl(): JsonField<String> = imageUrl

        /**
         * Returns the raw JSON value of [isActive].
         *
         * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("isActive") @ExcludeMissing fun _isActive(): JsonField<Boolean> = isActive

        /**
         * Returns the raw JSON value of [isVisible].
         *
         * Unlike [isVisible], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("isVisible") @ExcludeMissing fun _isVisible(): JsonField<Boolean> = isVisible

        /**
         * Returns the raw JSON value of [isUnlimited].
         *
         * Unlike [isUnlimited], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("isUnlimited")
        @ExcludeMissing
        fun _isUnlimited(): JsonField<Boolean> = isUnlimited

        /**
         * Returns the raw JSON value of [referredRewardUpfront].
         *
         * Unlike [referredRewardUpfront], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("referredRewardUpfront")
        @ExcludeMissing
        fun _referredRewardUpfront(): JsonField<Boolean> = referredRewardUpfront

        /**
         * Returns the raw JSON value of [limit].
         *
         * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Long> = limit

        /**
         * Returns the raw JSON value of [conversionsRequired].
         *
         * Unlike [conversionsRequired], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("conversionsRequired")
        @ExcludeMissing
        fun _conversionsRequired(): JsonField<Long> = conversionsRequired

        /**
         * Returns the raw JSON value of [numberOfWinners].
         *
         * Unlike [numberOfWinners], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("numberOfWinners")
        @ExcludeMissing
        fun _numberOfWinners(): JsonField<Long> = numberOfWinners

        /**
         * Returns the raw JSON value of [order].
         *
         * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("order") @ExcludeMissing fun _order(): JsonField<Long> = order

        /**
         * Returns the raw JSON value of [limitDuration].
         *
         * Unlike [limitDuration], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("limitDuration")
        @ExcludeMissing
        fun _limitDuration(): JsonField<LimitDuration> = limitDuration

        /**
         * Returns the raw JSON value of [nextMilestonePrefix].
         *
         * Unlike [nextMilestonePrefix], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("nextMilestonePrefix")
        @ExcludeMissing
        fun _nextMilestonePrefix(): JsonField<String> = nextMilestonePrefix

        /**
         * Returns the raw JSON value of [nextMilestoneSuffix].
         *
         * Unlike [nextMilestoneSuffix], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("nextMilestoneSuffix")
        @ExcludeMissing
        fun _nextMilestoneSuffix(): JsonField<String> = nextMilestoneSuffix

        /**
         * Returns the raw JSON value of [couponCode].
         *
         * Unlike [couponCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("couponCode")
        @ExcludeMissing
        fun _couponCode(): JsonField<String> = couponCode

        /**
         * Returns the raw JSON value of [referralCouponCode].
         *
         * Unlike [referralCouponCode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("referralCouponCode")
        @ExcludeMissing
        fun _referralCouponCode(): JsonField<String> = referralCouponCode

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [commissionStructure].
         *
         * Unlike [commissionStructure], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("commissionStructure")
        @ExcludeMissing
        fun _commissionStructure(): JsonField<CommissionStructure> = commissionStructure

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var type: JsonField<Type>? = null
            private var title: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var referralDescription: JsonField<String> = JsonMissing.of()
            private var imageUrl: JsonField<String> = JsonMissing.of()
            private var isActive: JsonField<Boolean> = JsonMissing.of()
            private var isVisible: JsonField<Boolean> = JsonMissing.of()
            private var isUnlimited: JsonField<Boolean> = JsonMissing.of()
            private var referredRewardUpfront: JsonField<Boolean> = JsonMissing.of()
            private var limit: JsonField<Long> = JsonMissing.of()
            private var conversionsRequired: JsonField<Long> = JsonMissing.of()
            private var numberOfWinners: JsonField<Long> = JsonMissing.of()
            private var order: JsonField<Long> = JsonMissing.of()
            private var limitDuration: JsonField<LimitDuration> = JsonMissing.of()
            private var nextMilestonePrefix: JsonField<String> = JsonMissing.of()
            private var nextMilestoneSuffix: JsonField<String> = JsonMissing.of()
            private var couponCode: JsonField<String> = JsonMissing.of()
            private var referralCouponCode: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var commissionStructure: JsonField<CommissionStructure> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                type = body.type
                title = body.title
                description = body.description
                referralDescription = body.referralDescription
                imageUrl = body.imageUrl
                isActive = body.isActive
                isVisible = body.isVisible
                isUnlimited = body.isUnlimited
                referredRewardUpfront = body.referredRewardUpfront
                limit = body.limit
                conversionsRequired = body.conversionsRequired
                numberOfWinners = body.numberOfWinners
                order = body.order
                limitDuration = body.limitDuration
                nextMilestonePrefix = body.nextMilestonePrefix
                nextMilestoneSuffix = body.nextMilestoneSuffix
                couponCode = body.couponCode
                referralCouponCode = body.referralCouponCode
                metadata = body.metadata
                commissionStructure = body.commissionStructure
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The reward type. Immutable after creation. */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** The reward title (internal label). */
            fun title(title: String) = title(JsonField.of(title))

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

            /** The reward description shown to the referrer. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** The reward description shown to the referred friend (double-sided rewards). */
            fun referralDescription(referralDescription: String?) =
                referralDescription(JsonField.ofNullable(referralDescription))

            /**
             * Alias for calling [Builder.referralDescription] with
             * `referralDescription.orElse(null)`.
             */
            fun referralDescription(referralDescription: Optional<String>) =
                referralDescription(referralDescription.getOrNull())

            /**
             * Sets [Builder.referralDescription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referralDescription] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun referralDescription(referralDescription: JsonField<String>) = apply {
                this.referralDescription = referralDescription
            }

            /** An image URL for the reward. */
            fun imageUrl(imageUrl: String?) = imageUrl(JsonField.ofNullable(imageUrl))

            /** Alias for calling [Builder.imageUrl] with `imageUrl.orElse(null)`. */
            fun imageUrl(imageUrl: Optional<String>) = imageUrl(imageUrl.getOrNull())

            /**
             * Sets [Builder.imageUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.imageUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun imageUrl(imageUrl: JsonField<String>) = apply { this.imageUrl = imageUrl }

            /** Whether the reward is active (awardable). */
            fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

            /**
             * Sets [Builder.isActive] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

            /** Whether the reward is visible. */
            fun isVisible(isVisible: Boolean) = isVisible(JsonField.of(isVisible))

            /**
             * Sets [Builder.isVisible] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isVisible] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isVisible(isVisible: JsonField<Boolean>) = apply { this.isVisible = isVisible }

            /** Whether the reward can be earned an unlimited number of times. */
            fun isUnlimited(isUnlimited: Boolean) = isUnlimited(JsonField.of(isUnlimited))

            /**
             * Sets [Builder.isUnlimited] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isUnlimited] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isUnlimited(isUnlimited: JsonField<Boolean>) = apply {
                this.isUnlimited = isUnlimited
            }

            /**
             * For double-sided rewards, deliver the referred friend's reward upfront as a discount.
             */
            fun referredRewardUpfront(referredRewardUpfront: Boolean) =
                referredRewardUpfront(JsonField.of(referredRewardUpfront))

            /**
             * Sets [Builder.referredRewardUpfront] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referredRewardUpfront] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun referredRewardUpfront(referredRewardUpfront: JsonField<Boolean>) = apply {
                this.referredRewardUpfront = referredRewardUpfront
            }

            /**
             * The number of times a participant can earn the reward (overridden by `isUnlimited`).
             */
            fun limit(limit: Long) = limit(JsonField.of(limit))

            /**
             * Sets [Builder.limit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

            /** The number of referrals required to earn the reward. */
            fun conversionsRequired(conversionsRequired: Long) =
                conversionsRequired(JsonField.of(conversionsRequired))

            /**
             * Sets [Builder.conversionsRequired] to an arbitrary JSON value.
             *
             * You should usually call [Builder.conversionsRequired] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun conversionsRequired(conversionsRequired: JsonField<Long>) = apply {
                this.conversionsRequired = conversionsRequired
            }

            /** The maximum number of winners (LEADERBOARD rewards). */
            fun numberOfWinners(numberOfWinners: Long) =
                numberOfWinners(JsonField.of(numberOfWinners))

            /**
             * Sets [Builder.numberOfWinners] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numberOfWinners] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numberOfWinners(numberOfWinners: JsonField<Long>) = apply {
                this.numberOfWinners = numberOfWinners
            }

            /** The display order of the reward. */
            fun order(order: Long) = order(JsonField.of(order))

            /**
             * Sets [Builder.order] to an arbitrary JSON value.
             *
             * You should usually call [Builder.order] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun order(order: JsonField<Long>) = apply { this.order = order }

            /** The window over which `limit` applies. */
            fun limitDuration(limitDuration: LimitDuration) =
                limitDuration(JsonField.of(limitDuration))

            /**
             * Sets [Builder.limitDuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limitDuration] with a well-typed [LimitDuration]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun limitDuration(limitDuration: JsonField<LimitDuration>) = apply {
                this.limitDuration = limitDuration
            }

            fun nextMilestonePrefix(nextMilestonePrefix: String?) =
                nextMilestonePrefix(JsonField.ofNullable(nextMilestonePrefix))

            /**
             * Alias for calling [Builder.nextMilestonePrefix] with
             * `nextMilestonePrefix.orElse(null)`.
             */
            fun nextMilestonePrefix(nextMilestonePrefix: Optional<String>) =
                nextMilestonePrefix(nextMilestonePrefix.getOrNull())

            /**
             * Sets [Builder.nextMilestonePrefix] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nextMilestonePrefix] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun nextMilestonePrefix(nextMilestonePrefix: JsonField<String>) = apply {
                this.nextMilestonePrefix = nextMilestonePrefix
            }

            fun nextMilestoneSuffix(nextMilestoneSuffix: String?) =
                nextMilestoneSuffix(JsonField.ofNullable(nextMilestoneSuffix))

            /**
             * Alias for calling [Builder.nextMilestoneSuffix] with
             * `nextMilestoneSuffix.orElse(null)`.
             */
            fun nextMilestoneSuffix(nextMilestoneSuffix: Optional<String>) =
                nextMilestoneSuffix(nextMilestoneSuffix.getOrNull())

            /**
             * Sets [Builder.nextMilestoneSuffix] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nextMilestoneSuffix] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun nextMilestoneSuffix(nextMilestoneSuffix: JsonField<String>) = apply {
                this.nextMilestoneSuffix = nextMilestoneSuffix
            }

            fun couponCode(couponCode: String?) = couponCode(JsonField.ofNullable(couponCode))

            /** Alias for calling [Builder.couponCode] with `couponCode.orElse(null)`. */
            fun couponCode(couponCode: Optional<String>) = couponCode(couponCode.getOrNull())

            /**
             * Sets [Builder.couponCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.couponCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun couponCode(couponCode: JsonField<String>) = apply { this.couponCode = couponCode }

            fun referralCouponCode(referralCouponCode: String?) =
                referralCouponCode(JsonField.ofNullable(referralCouponCode))

            /**
             * Alias for calling [Builder.referralCouponCode] with
             * `referralCouponCode.orElse(null)`.
             */
            fun referralCouponCode(referralCouponCode: Optional<String>) =
                referralCouponCode(referralCouponCode.getOrNull())

            /**
             * Sets [Builder.referralCouponCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referralCouponCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun referralCouponCode(referralCouponCode: JsonField<String>) = apply {
                this.referralCouponCode = referralCouponCode
            }

            /** Custom key/value metadata (single-level; values are stored as strings). */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** The affiliate commission structure (AFFILIATE rewards only). */
            fun commissionStructure(commissionStructure: CommissionStructure) =
                commissionStructure(JsonField.of(commissionStructure))

            /**
             * Sets [Builder.commissionStructure] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commissionStructure] with a well-typed
             * [CommissionStructure] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun commissionStructure(commissionStructure: JsonField<CommissionStructure>) = apply {
                this.commissionStructure = commissionStructure
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("type", type),
                    title,
                    description,
                    referralDescription,
                    imageUrl,
                    isActive,
                    isVisible,
                    isUnlimited,
                    referredRewardUpfront,
                    limit,
                    conversionsRequired,
                    numberOfWinners,
                    order,
                    limitDuration,
                    nextMilestonePrefix,
                    nextMilestoneSuffix,
                    couponCode,
                    referralCouponCode,
                    metadata,
                    commissionStructure,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws GrowsurfInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            type().validate()
            title()
            description()
            referralDescription()
            imageUrl()
            isActive()
            isVisible()
            isUnlimited()
            referredRewardUpfront()
            limit()
            conversionsRequired()
            numberOfWinners()
            order()
            limitDuration().ifPresent { it.validate() }
            nextMilestonePrefix()
            nextMilestoneSuffix()
            couponCode()
            referralCouponCode()
            metadata().ifPresent { it.validate() }
            commissionStructure().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: GrowsurfInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (title.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (referralDescription.asKnown().isPresent) 1 else 0) +
                (if (imageUrl.asKnown().isPresent) 1 else 0) +
                (if (isActive.asKnown().isPresent) 1 else 0) +
                (if (isVisible.asKnown().isPresent) 1 else 0) +
                (if (isUnlimited.asKnown().isPresent) 1 else 0) +
                (if (referredRewardUpfront.asKnown().isPresent) 1 else 0) +
                (if (limit.asKnown().isPresent) 1 else 0) +
                (if (conversionsRequired.asKnown().isPresent) 1 else 0) +
                (if (numberOfWinners.asKnown().isPresent) 1 else 0) +
                (if (order.asKnown().isPresent) 1 else 0) +
                (limitDuration.asKnown().getOrNull()?.validity() ?: 0) +
                (if (nextMilestonePrefix.asKnown().isPresent) 1 else 0) +
                (if (nextMilestoneSuffix.asKnown().isPresent) 1 else 0) +
                (if (couponCode.asKnown().isPresent) 1 else 0) +
                (if (referralCouponCode.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (commissionStructure.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                type == other.type &&
                title == other.title &&
                description == other.description &&
                referralDescription == other.referralDescription &&
                imageUrl == other.imageUrl &&
                isActive == other.isActive &&
                isVisible == other.isVisible &&
                isUnlimited == other.isUnlimited &&
                referredRewardUpfront == other.referredRewardUpfront &&
                limit == other.limit &&
                conversionsRequired == other.conversionsRequired &&
                numberOfWinners == other.numberOfWinners &&
                order == other.order &&
                limitDuration == other.limitDuration &&
                nextMilestonePrefix == other.nextMilestonePrefix &&
                nextMilestoneSuffix == other.nextMilestoneSuffix &&
                couponCode == other.couponCode &&
                referralCouponCode == other.referralCouponCode &&
                metadata == other.metadata &&
                commissionStructure == other.commissionStructure &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                type,
                title,
                description,
                referralDescription,
                imageUrl,
                isActive,
                isVisible,
                isUnlimited,
                referredRewardUpfront,
                limit,
                conversionsRequired,
                numberOfWinners,
                order,
                limitDuration,
                nextMilestonePrefix,
                nextMilestoneSuffix,
                couponCode,
                referralCouponCode,
                metadata,
                commissionStructure,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{type=$type, title=$title, description=$description, referralDescription=$referralDescription, imageUrl=$imageUrl, isActive=$isActive, isVisible=$isVisible, isUnlimited=$isUnlimited, referredRewardUpfront=$referredRewardUpfront, limit=$limit, conversionsRequired=$conversionsRequired, numberOfWinners=$numberOfWinners, order=$order, limitDuration=$limitDuration, nextMilestonePrefix=$nextMilestonePrefix, nextMilestoneSuffix=$nextMilestoneSuffix, couponCode=$couponCode, referralCouponCode=$referralCouponCode, metadata=$metadata, commissionStructure=$commissionStructure, additionalProperties=$additionalProperties}"
    }

    /** The reward type. Immutable after creation. */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val SINGLE_SIDED = of("SINGLE_SIDED")

            @JvmField val DOUBLE_SIDED = of("DOUBLE_SIDED")

            @JvmField val MILESTONE = of("MILESTONE")

            @JvmField val LEADERBOARD = of("LEADERBOARD")

            @JvmField val AFFILIATE = of("AFFILIATE")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            SINGLE_SIDED,
            DOUBLE_SIDED,
            MILESTONE,
            LEADERBOARD,
            AFFILIATE,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SINGLE_SIDED,
            DOUBLE_SIDED,
            MILESTONE,
            LEADERBOARD,
            AFFILIATE,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                SINGLE_SIDED -> Value.SINGLE_SIDED
                DOUBLE_SIDED -> Value.DOUBLE_SIDED
                MILESTONE -> Value.MILESTONE
                LEADERBOARD -> Value.LEADERBOARD
                AFFILIATE -> Value.AFFILIATE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws GrowsurfInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                SINGLE_SIDED -> Known.SINGLE_SIDED
                DOUBLE_SIDED -> Known.DOUBLE_SIDED
                MILESTONE -> Known.MILESTONE
                LEADERBOARD -> Known.LEADERBOARD
                AFFILIATE -> Known.AFFILIATE
                else -> throw GrowsurfInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws GrowsurfInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                GrowsurfInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws GrowsurfInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Type = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: GrowsurfInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The window over which `limit` applies. */
    class LimitDuration @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val IN_TOTAL = of("IN_TOTAL")

            @JvmField val PER_MONTH = of("PER_MONTH")

            @JvmField val PER_YEAR = of("PER_YEAR")

            @JvmStatic fun of(value: String) = LimitDuration(JsonField.of(value))
        }

        /** An enum containing [LimitDuration]'s known values. */
        enum class Known {
            IN_TOTAL,
            PER_MONTH,
            PER_YEAR,
        }

        /**
         * An enum containing [LimitDuration]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [LimitDuration] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            IN_TOTAL,
            PER_MONTH,
            PER_YEAR,
            /**
             * An enum member indicating that [LimitDuration] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                IN_TOTAL -> Value.IN_TOTAL
                PER_MONTH -> Value.PER_MONTH
                PER_YEAR -> Value.PER_YEAR
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws GrowsurfInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                IN_TOTAL -> Known.IN_TOTAL
                PER_MONTH -> Known.PER_MONTH
                PER_YEAR -> Known.PER_YEAR
                else -> throw GrowsurfInvalidDataException("Unknown LimitDuration: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws GrowsurfInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                GrowsurfInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws GrowsurfInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): LimitDuration = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: GrowsurfInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LimitDuration && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Custom key/value metadata (single-level; values are stored as strings). */
    class Metadata
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws GrowsurfInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: GrowsurfInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RewardCreateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RewardCreateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
