// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.growsurf.api.core.Enum
import com.growsurf.api.core.ExcludeMissing
import com.growsurf.api.core.JsonField
import com.growsurf.api.core.JsonMissing
import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.checkKnown
import com.growsurf.api.core.checkRequired
import com.growsurf.api.core.toImmutable
import com.growsurf.api.errors.GrowsurfInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Campaign
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val impressionCount: JsonField<Long>,
    private val inviteCount: JsonField<Long>,
    private val name: JsonField<String>,
    private val participantCount: JsonField<Long>,
    private val referralCount: JsonField<Long>,
    private val rewards: JsonField<List<Reward>>,
    private val status: JsonField<Status>,
    private val type: JsonField<Type>,
    private val winnerCount: JsonField<Long>,
    private val currencyIso: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("impressionCount")
        @ExcludeMissing
        impressionCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("inviteCount")
        @ExcludeMissing
        inviteCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("participantCount")
        @ExcludeMissing
        participantCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("referralCount")
        @ExcludeMissing
        referralCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("rewards")
        @ExcludeMissing
        rewards: JsonField<List<Reward>> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("winnerCount")
        @ExcludeMissing
        winnerCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("currencyISO")
        @ExcludeMissing
        currencyIso: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        impressionCount,
        inviteCount,
        name,
        participantCount,
        referralCount,
        rewards,
        status,
        type,
        winnerCount,
        currencyIso,
        mutableMapOf(),
    )

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun impressionCount(): Long = impressionCount.getRequired("impressionCount")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inviteCount(): Long = inviteCount.getRequired("inviteCount")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun participantCount(): Long = participantCount.getRequired("participantCount")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun referralCount(): Long = referralCount.getRequired("referralCount")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rewards(): List<Reward> = rewards.getRequired("rewards")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun winnerCount(): Long = winnerCount.getRequired("winnerCount")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currencyIso(): Optional<String> = currencyIso.getOptional("currencyISO")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [impressionCount].
     *
     * Unlike [impressionCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("impressionCount")
    @ExcludeMissing
    fun _impressionCount(): JsonField<Long> = impressionCount

    /**
     * Returns the raw JSON value of [inviteCount].
     *
     * Unlike [inviteCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inviteCount") @ExcludeMissing fun _inviteCount(): JsonField<Long> = inviteCount

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [participantCount].
     *
     * Unlike [participantCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("participantCount")
    @ExcludeMissing
    fun _participantCount(): JsonField<Long> = participantCount

    /**
     * Returns the raw JSON value of [referralCount].
     *
     * Unlike [referralCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("referralCount")
    @ExcludeMissing
    fun _referralCount(): JsonField<Long> = referralCount

    /**
     * Returns the raw JSON value of [rewards].
     *
     * Unlike [rewards], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rewards") @ExcludeMissing fun _rewards(): JsonField<List<Reward>> = rewards

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [winnerCount].
     *
     * Unlike [winnerCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("winnerCount") @ExcludeMissing fun _winnerCount(): JsonField<Long> = winnerCount

    /**
     * Returns the raw JSON value of [currencyIso].
     *
     * Unlike [currencyIso], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currencyISO") @ExcludeMissing fun _currencyIso(): JsonField<String> = currencyIso

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
         * Returns a mutable builder for constructing an instance of [Campaign].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .impressionCount()
         * .inviteCount()
         * .name()
         * .participantCount()
         * .referralCount()
         * .rewards()
         * .status()
         * .type()
         * .winnerCount()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Campaign]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var impressionCount: JsonField<Long>? = null
        private var inviteCount: JsonField<Long>? = null
        private var name: JsonField<String>? = null
        private var participantCount: JsonField<Long>? = null
        private var referralCount: JsonField<Long>? = null
        private var rewards: JsonField<MutableList<Reward>>? = null
        private var status: JsonField<Status>? = null
        private var type: JsonField<Type>? = null
        private var winnerCount: JsonField<Long>? = null
        private var currencyIso: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(campaign: Campaign) = apply {
            id = campaign.id
            impressionCount = campaign.impressionCount
            inviteCount = campaign.inviteCount
            name = campaign.name
            participantCount = campaign.participantCount
            referralCount = campaign.referralCount
            rewards = campaign.rewards.map { it.toMutableList() }
            status = campaign.status
            type = campaign.type
            winnerCount = campaign.winnerCount
            currencyIso = campaign.currencyIso
            additionalProperties = campaign.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun impressionCount(impressionCount: Long) = impressionCount(JsonField.of(impressionCount))

        /**
         * Sets [Builder.impressionCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.impressionCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun impressionCount(impressionCount: JsonField<Long>) = apply {
            this.impressionCount = impressionCount
        }

        fun inviteCount(inviteCount: Long) = inviteCount(JsonField.of(inviteCount))

        /**
         * Sets [Builder.inviteCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inviteCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inviteCount(inviteCount: JsonField<Long>) = apply { this.inviteCount = inviteCount }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun participantCount(participantCount: Long) =
            participantCount(JsonField.of(participantCount))

        /**
         * Sets [Builder.participantCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.participantCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun participantCount(participantCount: JsonField<Long>) = apply {
            this.participantCount = participantCount
        }

        fun referralCount(referralCount: Long) = referralCount(JsonField.of(referralCount))

        /**
         * Sets [Builder.referralCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referralCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun referralCount(referralCount: JsonField<Long>) = apply {
            this.referralCount = referralCount
        }

        fun rewards(rewards: List<Reward>) = rewards(JsonField.of(rewards))

        /**
         * Sets [Builder.rewards] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rewards] with a well-typed `List<Reward>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rewards(rewards: JsonField<List<Reward>>) = apply {
            this.rewards = rewards.map { it.toMutableList() }
        }

        /**
         * Adds a single [Reward] to [rewards].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReward(reward: Reward) = apply {
            rewards =
                (rewards ?: JsonField.of(mutableListOf())).also {
                    checkKnown("rewards", it).add(reward)
                }
        }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun winnerCount(winnerCount: Long) = winnerCount(JsonField.of(winnerCount))

        /**
         * Sets [Builder.winnerCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.winnerCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun winnerCount(winnerCount: JsonField<Long>) = apply { this.winnerCount = winnerCount }

        fun currencyIso(currencyIso: String) = currencyIso(JsonField.of(currencyIso))

        /**
         * Sets [Builder.currencyIso] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyIso] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currencyIso(currencyIso: JsonField<String>) = apply { this.currencyIso = currencyIso }

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
         * Returns an immutable instance of [Campaign].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .impressionCount()
         * .inviteCount()
         * .name()
         * .participantCount()
         * .referralCount()
         * .rewards()
         * .status()
         * .type()
         * .winnerCount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Campaign =
            Campaign(
                checkRequired("id", id),
                checkRequired("impressionCount", impressionCount),
                checkRequired("inviteCount", inviteCount),
                checkRequired("name", name),
                checkRequired("participantCount", participantCount),
                checkRequired("referralCount", referralCount),
                checkRequired("rewards", rewards).map { it.toImmutable() },
                checkRequired("status", status),
                checkRequired("type", type),
                checkRequired("winnerCount", winnerCount),
                currencyIso,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws GrowsurfInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): Campaign = apply {
        if (validated) {
            return@apply
        }

        id()
        impressionCount()
        inviteCount()
        name()
        participantCount()
        referralCount()
        rewards().forEach { it.validate() }
        status().validate()
        type().validate()
        winnerCount()
        currencyIso()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (impressionCount.asKnown().isPresent) 1 else 0) +
            (if (inviteCount.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (participantCount.asKnown().isPresent) 1 else 0) +
            (if (referralCount.asKnown().isPresent) 1 else 0) +
            (rewards.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (winnerCount.asKnown().isPresent) 1 else 0) +
            (if (currencyIso.asKnown().isPresent) 1 else 0)

    class Reward
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val isUnlimited: JsonField<Boolean>,
        private val metadata: JsonField<Metadata>,
        private val type: JsonField<Type>,
        private val commissionStructure: JsonField<CommissionStructure>,
        private val conversionsRequired: JsonField<Long>,
        private val couponCode: JsonField<String>,
        private val description: JsonField<String>,
        private val imageUrl: JsonField<String>,
        private val limit: JsonField<Long>,
        private val limitDuration: JsonField<LimitDuration>,
        private val nextMilestonePrefix: JsonField<String>,
        private val nextMilestoneSuffix: JsonField<String>,
        private val numberOfWinners: JsonField<Long>,
        private val order: JsonField<Long>,
        private val referralCouponCode: JsonField<String>,
        private val referralDescription: JsonField<String>,
        private val referredRewardUpfront: JsonField<Boolean>,
        private val referredValue: JsonField<RewardTaxValuation>,
        private val value: JsonField<RewardTaxValuation>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("isUnlimited")
            @ExcludeMissing
            isUnlimited: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("commissionStructure")
            @ExcludeMissing
            commissionStructure: JsonField<CommissionStructure> = JsonMissing.of(),
            @JsonProperty("conversionsRequired")
            @ExcludeMissing
            conversionsRequired: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("couponCode")
            @ExcludeMissing
            couponCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("imageUrl")
            @ExcludeMissing
            imageUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("limitDuration")
            @ExcludeMissing
            limitDuration: JsonField<LimitDuration> = JsonMissing.of(),
            @JsonProperty("nextMilestonePrefix")
            @ExcludeMissing
            nextMilestonePrefix: JsonField<String> = JsonMissing.of(),
            @JsonProperty("nextMilestoneSuffix")
            @ExcludeMissing
            nextMilestoneSuffix: JsonField<String> = JsonMissing.of(),
            @JsonProperty("numberOfWinners")
            @ExcludeMissing
            numberOfWinners: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("order") @ExcludeMissing order: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("referralCouponCode")
            @ExcludeMissing
            referralCouponCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("referralDescription")
            @ExcludeMissing
            referralDescription: JsonField<String> = JsonMissing.of(),
            @JsonProperty("referredRewardUpfront")
            @ExcludeMissing
            referredRewardUpfront: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("referredValue")
            @ExcludeMissing
            referredValue: JsonField<RewardTaxValuation> = JsonMissing.of(),
            @JsonProperty("value")
            @ExcludeMissing
            value: JsonField<RewardTaxValuation> = JsonMissing.of(),
        ) : this(
            id,
            isUnlimited,
            metadata,
            type,
            commissionStructure,
            conversionsRequired,
            couponCode,
            description,
            imageUrl,
            limit,
            limitDuration,
            nextMilestonePrefix,
            nextMilestoneSuffix,
            numberOfWinners,
            order,
            referralCouponCode,
            referralDescription,
            referredRewardUpfront,
            referredValue,
            value,
            mutableMapOf(),
        )

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun isUnlimited(): Boolean = isUnlimited.getRequired("isUnlimited")

        /**
         * Shallow custom metadata object.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun metadata(): Metadata = metadata.getRequired("metadata")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun commissionStructure(): Optional<CommissionStructure> =
            commissionStructure.getOptional("commissionStructure")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun conversionsRequired(): Optional<Long> =
            conversionsRequired.getOptional("conversionsRequired")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun couponCode(): Optional<String> = couponCode.getOptional("couponCode")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun imageUrl(): Optional<String> = imageUrl.getOptional("imageUrl")

        /**
         * `-1` represents an unlimited reward in REST responses.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun limit(): Optional<Long> = limit.getOptional("limit")

        /**
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
        fun numberOfWinners(): Optional<Long> = numberOfWinners.getOptional("numberOfWinners")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun order(): Optional<Long> = order.getOptional("order")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun referralCouponCode(): Optional<String> =
            referralCouponCode.getOptional("referralCouponCode")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun referralDescription(): Optional<String> =
            referralDescription.getOptional("referralDescription")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun referredRewardUpfront(): Optional<Boolean> =
            referredRewardUpfront.getOptional("referredRewardUpfront")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun referredValue(): Optional<RewardTaxValuation> =
            referredValue.getOptional("referredValue")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun value(): Optional<RewardTaxValuation> = value.getOptional("value")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [isUnlimited].
         *
         * Unlike [isUnlimited], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("isUnlimited")
        @ExcludeMissing
        fun _isUnlimited(): JsonField<Boolean> = isUnlimited

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [commissionStructure].
         *
         * Unlike [commissionStructure], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("commissionStructure")
        @ExcludeMissing
        fun _commissionStructure(): JsonField<CommissionStructure> = commissionStructure

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
         * Returns the raw JSON value of [couponCode].
         *
         * Unlike [couponCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("couponCode")
        @ExcludeMissing
        fun _couponCode(): JsonField<String> = couponCode

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [imageUrl].
         *
         * Unlike [imageUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("imageUrl") @ExcludeMissing fun _imageUrl(): JsonField<String> = imageUrl

        /**
         * Returns the raw JSON value of [limit].
         *
         * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Long> = limit

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
         * Returns the raw JSON value of [referralCouponCode].
         *
         * Unlike [referralCouponCode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("referralCouponCode")
        @ExcludeMissing
        fun _referralCouponCode(): JsonField<String> = referralCouponCode

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
         * Returns the raw JSON value of [referredRewardUpfront].
         *
         * Unlike [referredRewardUpfront], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("referredRewardUpfront")
        @ExcludeMissing
        fun _referredRewardUpfront(): JsonField<Boolean> = referredRewardUpfront

        /**
         * Returns the raw JSON value of [referredValue].
         *
         * Unlike [referredValue], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("referredValue")
        @ExcludeMissing
        fun _referredValue(): JsonField<RewardTaxValuation> = referredValue

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<RewardTaxValuation> = value

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
             * Returns a mutable builder for constructing an instance of [Reward].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .isUnlimited()
             * .metadata()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Reward]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var isUnlimited: JsonField<Boolean>? = null
            private var metadata: JsonField<Metadata>? = null
            private var type: JsonField<Type>? = null
            private var commissionStructure: JsonField<CommissionStructure> = JsonMissing.of()
            private var conversionsRequired: JsonField<Long> = JsonMissing.of()
            private var couponCode: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var imageUrl: JsonField<String> = JsonMissing.of()
            private var limit: JsonField<Long> = JsonMissing.of()
            private var limitDuration: JsonField<LimitDuration> = JsonMissing.of()
            private var nextMilestonePrefix: JsonField<String> = JsonMissing.of()
            private var nextMilestoneSuffix: JsonField<String> = JsonMissing.of()
            private var numberOfWinners: JsonField<Long> = JsonMissing.of()
            private var order: JsonField<Long> = JsonMissing.of()
            private var referralCouponCode: JsonField<String> = JsonMissing.of()
            private var referralDescription: JsonField<String> = JsonMissing.of()
            private var referredRewardUpfront: JsonField<Boolean> = JsonMissing.of()
            private var referredValue: JsonField<RewardTaxValuation> = JsonMissing.of()
            private var value: JsonField<RewardTaxValuation> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(reward: Reward) = apply {
                id = reward.id
                isUnlimited = reward.isUnlimited
                metadata = reward.metadata
                type = reward.type
                commissionStructure = reward.commissionStructure
                conversionsRequired = reward.conversionsRequired
                couponCode = reward.couponCode
                description = reward.description
                imageUrl = reward.imageUrl
                limit = reward.limit
                limitDuration = reward.limitDuration
                nextMilestonePrefix = reward.nextMilestonePrefix
                nextMilestoneSuffix = reward.nextMilestoneSuffix
                numberOfWinners = reward.numberOfWinners
                order = reward.order
                referralCouponCode = reward.referralCouponCode
                referralDescription = reward.referralDescription
                referredRewardUpfront = reward.referredRewardUpfront
                referredValue = reward.referredValue
                value = reward.value
                additionalProperties = reward.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

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

            /** Shallow custom metadata object. */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun commissionStructure(commissionStructure: CommissionStructure?) =
                commissionStructure(JsonField.ofNullable(commissionStructure))

            /**
             * Alias for calling [Builder.commissionStructure] with
             * `commissionStructure.orElse(null)`.
             */
            fun commissionStructure(commissionStructure: Optional<CommissionStructure>) =
                commissionStructure(commissionStructure.getOrNull())

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

            fun conversionsRequired(conversionsRequired: Long?) =
                conversionsRequired(JsonField.ofNullable(conversionsRequired))

            /**
             * Alias for [Builder.conversionsRequired].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun conversionsRequired(conversionsRequired: Long) =
                conversionsRequired(conversionsRequired as Long?)

            /**
             * Alias for calling [Builder.conversionsRequired] with
             * `conversionsRequired.orElse(null)`.
             */
            fun conversionsRequired(conversionsRequired: Optional<Long>) =
                conversionsRequired(conversionsRequired.getOrNull())

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

            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

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

            /** `-1` represents an unlimited reward in REST responses. */
            fun limit(limit: Long?) = limit(JsonField.ofNullable(limit))

            /**
             * Alias for [Builder.limit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun limit(limit: Long) = limit(limit as Long?)

            /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
            fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

            /**
             * Sets [Builder.limit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

            fun limitDuration(limitDuration: LimitDuration?) =
                limitDuration(JsonField.ofNullable(limitDuration))

            /** Alias for calling [Builder.limitDuration] with `limitDuration.orElse(null)`. */
            fun limitDuration(limitDuration: Optional<LimitDuration>) =
                limitDuration(limitDuration.getOrNull())

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

            fun numberOfWinners(numberOfWinners: Long?) =
                numberOfWinners(JsonField.ofNullable(numberOfWinners))

            /**
             * Alias for [Builder.numberOfWinners].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun numberOfWinners(numberOfWinners: Long) = numberOfWinners(numberOfWinners as Long?)

            /** Alias for calling [Builder.numberOfWinners] with `numberOfWinners.orElse(null)`. */
            fun numberOfWinners(numberOfWinners: Optional<Long>) =
                numberOfWinners(numberOfWinners.getOrNull())

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

            fun order(order: Long?) = order(JsonField.ofNullable(order))

            /**
             * Alias for [Builder.order].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun order(order: Long) = order(order as Long?)

            /** Alias for calling [Builder.order] with `order.orElse(null)`. */
            fun order(order: Optional<Long>) = order(order.getOrNull())

            /**
             * Sets [Builder.order] to an arbitrary JSON value.
             *
             * You should usually call [Builder.order] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun order(order: JsonField<Long>) = apply { this.order = order }

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

            fun referredValue(referredValue: RewardTaxValuation?) =
                referredValue(JsonField.ofNullable(referredValue))

            /** Alias for calling [Builder.referredValue] with `referredValue.orElse(null)`. */
            fun referredValue(referredValue: Optional<RewardTaxValuation>) =
                referredValue(referredValue.getOrNull())

            /**
             * Sets [Builder.referredValue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referredValue] with a well-typed
             * [RewardTaxValuation] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun referredValue(referredValue: JsonField<RewardTaxValuation>) = apply {
                this.referredValue = referredValue
            }

            fun value(value: RewardTaxValuation?) = value(JsonField.ofNullable(value))

            /** Alias for calling [Builder.value] with `value.orElse(null)`. */
            fun value(value: Optional<RewardTaxValuation>) = value(value.getOrNull())

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [RewardTaxValuation] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<RewardTaxValuation>) = apply { this.value = value }

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
             * Returns an immutable instance of [Reward].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .isUnlimited()
             * .metadata()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Reward =
                Reward(
                    checkRequired("id", id),
                    checkRequired("isUnlimited", isUnlimited),
                    checkRequired("metadata", metadata),
                    checkRequired("type", type),
                    commissionStructure,
                    conversionsRequired,
                    couponCode,
                    description,
                    imageUrl,
                    limit,
                    limitDuration,
                    nextMilestonePrefix,
                    nextMilestoneSuffix,
                    numberOfWinners,
                    order,
                    referralCouponCode,
                    referralDescription,
                    referredRewardUpfront,
                    referredValue,
                    value,
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
        fun validate(): Reward = apply {
            if (validated) {
                return@apply
            }

            id()
            isUnlimited()
            metadata().validate()
            type().validate()
            commissionStructure().ifPresent { it.validate() }
            conversionsRequired()
            couponCode()
            description()
            imageUrl()
            limit()
            limitDuration().ifPresent { it.validate() }
            nextMilestonePrefix()
            nextMilestoneSuffix()
            numberOfWinners()
            order()
            referralCouponCode()
            referralDescription()
            referredRewardUpfront()
            referredValue().ifPresent { it.validate() }
            value().ifPresent { it.validate() }
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (isUnlimited.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (commissionStructure.asKnown().getOrNull()?.validity() ?: 0) +
                (if (conversionsRequired.asKnown().isPresent) 1 else 0) +
                (if (couponCode.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (imageUrl.asKnown().isPresent) 1 else 0) +
                (if (limit.asKnown().isPresent) 1 else 0) +
                (limitDuration.asKnown().getOrNull()?.validity() ?: 0) +
                (if (nextMilestonePrefix.asKnown().isPresent) 1 else 0) +
                (if (nextMilestoneSuffix.asKnown().isPresent) 1 else 0) +
                (if (numberOfWinners.asKnown().isPresent) 1 else 0) +
                (if (order.asKnown().isPresent) 1 else 0) +
                (if (referralCouponCode.asKnown().isPresent) 1 else 0) +
                (if (referralDescription.asKnown().isPresent) 1 else 0) +
                (if (referredRewardUpfront.asKnown().isPresent) 1 else 0) +
                (referredValue.asKnown().getOrNull()?.validity() ?: 0) +
                (value.asKnown().getOrNull()?.validity() ?: 0)

        /** Shallow custom metadata object. */
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws GrowsurfInvalidDataException if any value type in this object doesn't match
             *   its expected type.
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

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
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
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws GrowsurfInvalidDataException if any value type in this object doesn't match
             *   its expected type.
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

        class LimitDuration @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val IN_TOTAL = of("IN_TOTAL")

                @JvmField val PER_MONTH = of("PER_MONTH")

                @JvmStatic fun of(value: String) = LimitDuration(JsonField.of(value))
            }

            /** An enum containing [LimitDuration]'s known values. */
            enum class Known {
                IN_TOTAL,
                PER_MONTH,
            }

            /**
             * An enum containing [LimitDuration]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [LimitDuration] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                IN_TOTAL,
                PER_MONTH,
                /**
                 * An enum member indicating that [LimitDuration] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    IN_TOTAL -> Value.IN_TOTAL
                    PER_MONTH -> Value.PER_MONTH
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws GrowsurfInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    IN_TOTAL -> Known.IN_TOTAL
                    PER_MONTH -> Known.PER_MONTH
                    else -> throw GrowsurfInvalidDataException("Unknown LimitDuration: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws GrowsurfInvalidDataException if any value type in this object doesn't match
             *   its expected type.
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Reward &&
                id == other.id &&
                isUnlimited == other.isUnlimited &&
                metadata == other.metadata &&
                type == other.type &&
                commissionStructure == other.commissionStructure &&
                conversionsRequired == other.conversionsRequired &&
                couponCode == other.couponCode &&
                description == other.description &&
                imageUrl == other.imageUrl &&
                limit == other.limit &&
                limitDuration == other.limitDuration &&
                nextMilestonePrefix == other.nextMilestonePrefix &&
                nextMilestoneSuffix == other.nextMilestoneSuffix &&
                numberOfWinners == other.numberOfWinners &&
                order == other.order &&
                referralCouponCode == other.referralCouponCode &&
                referralDescription == other.referralDescription &&
                referredRewardUpfront == other.referredRewardUpfront &&
                referredValue == other.referredValue &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                isUnlimited,
                metadata,
                type,
                commissionStructure,
                conversionsRequired,
                couponCode,
                description,
                imageUrl,
                limit,
                limitDuration,
                nextMilestonePrefix,
                nextMilestoneSuffix,
                numberOfWinners,
                order,
                referralCouponCode,
                referralDescription,
                referredRewardUpfront,
                referredValue,
                value,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Reward{id=$id, isUnlimited=$isUnlimited, metadata=$metadata, type=$type, commissionStructure=$commissionStructure, conversionsRequired=$conversionsRequired, couponCode=$couponCode, description=$description, imageUrl=$imageUrl, limit=$limit, limitDuration=$limitDuration, nextMilestonePrefix=$nextMilestonePrefix, nextMilestoneSuffix=$nextMilestoneSuffix, numberOfWinners=$numberOfWinners, order=$order, referralCouponCode=$referralCouponCode, referralDescription=$referralDescription, referredRewardUpfront=$referredRewardUpfront, referredValue=$referredValue, value=$value, additionalProperties=$additionalProperties}"
    }

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DRAFT = of("DRAFT")

            @JvmField val IN_PROGRESS = of("IN_PROGRESS")

            @JvmField val COMPLETE = of("COMPLETE")

            @JvmField val DELETED = of("DELETED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            DRAFT,
            IN_PROGRESS,
            COMPLETE,
            DELETED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DRAFT,
            IN_PROGRESS,
            COMPLETE,
            DELETED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                DRAFT -> Value.DRAFT
                IN_PROGRESS -> Value.IN_PROGRESS
                COMPLETE -> Value.COMPLETE
                DELETED -> Value.DELETED
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
                DRAFT -> Known.DRAFT
                IN_PROGRESS -> Known.IN_PROGRESS
                COMPLETE -> Known.COMPLETE
                DELETED -> Known.DELETED
                else -> throw GrowsurfInvalidDataException("Unknown Status: $value")
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
        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

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

            @JvmField val REFERRAL = of("REFERRAL")

            @JvmField val AFFILIATE = of("AFFILIATE")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            REFERRAL,
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
            REFERRAL,
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
                REFERRAL -> Value.REFERRAL
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
                REFERRAL -> Known.REFERRAL
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Campaign &&
            id == other.id &&
            impressionCount == other.impressionCount &&
            inviteCount == other.inviteCount &&
            name == other.name &&
            participantCount == other.participantCount &&
            referralCount == other.referralCount &&
            rewards == other.rewards &&
            status == other.status &&
            type == other.type &&
            winnerCount == other.winnerCount &&
            currencyIso == other.currencyIso &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            impressionCount,
            inviteCount,
            name,
            participantCount,
            referralCount,
            rewards,
            status,
            type,
            winnerCount,
            currencyIso,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Campaign{id=$id, impressionCount=$impressionCount, inviteCount=$inviteCount, name=$name, participantCount=$participantCount, referralCount=$referralCount, rewards=$rewards, status=$status, type=$type, winnerCount=$winnerCount, currencyIso=$currencyIso, additionalProperties=$additionalProperties}"
}
