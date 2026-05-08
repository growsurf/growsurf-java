// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class ParticipantListRewardsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val limit: JsonField<Long>,
    private val nextId: JsonField<String>,
    private val rewards: JsonField<List<ParticipantReward>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("nextId") @ExcludeMissing nextId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rewards")
        @ExcludeMissing
        rewards: JsonField<List<ParticipantReward>> = JsonMissing.of(),
    ) : this(limit, nextId, rewards, mutableMapOf())

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun limit(): Long = limit.getRequired("limit")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextId(): Optional<String> = nextId.getOptional("nextId")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rewards(): List<ParticipantReward> = rewards.getRequired("rewards")

    /**
     * Returns the raw JSON value of [limit].
     *
     * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Long> = limit

    /**
     * Returns the raw JSON value of [nextId].
     *
     * Unlike [nextId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nextId") @ExcludeMissing fun _nextId(): JsonField<String> = nextId

    /**
     * Returns the raw JSON value of [rewards].
     *
     * Unlike [rewards], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rewards")
    @ExcludeMissing
    fun _rewards(): JsonField<List<ParticipantReward>> = rewards

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
         * Returns a mutable builder for constructing an instance of
         * [ParticipantListRewardsResponse].
         *
         * The following fields are required:
         * ```java
         * .limit()
         * .nextId()
         * .rewards()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ParticipantListRewardsResponse]. */
    class Builder internal constructor() {

        private var limit: JsonField<Long>? = null
        private var nextId: JsonField<String>? = null
        private var rewards: JsonField<MutableList<ParticipantReward>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(participantListRewardsResponse: ParticipantListRewardsResponse) = apply {
            limit = participantListRewardsResponse.limit
            nextId = participantListRewardsResponse.nextId
            rewards = participantListRewardsResponse.rewards.map { it.toMutableList() }
            additionalProperties =
                participantListRewardsResponse.additionalProperties.toMutableMap()
        }

        fun limit(limit: Long) = limit(JsonField.of(limit))

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

        fun nextId(nextId: String?) = nextId(JsonField.ofNullable(nextId))

        /** Alias for calling [Builder.nextId] with `nextId.orElse(null)`. */
        fun nextId(nextId: Optional<String>) = nextId(nextId.getOrNull())

        /**
         * Sets [Builder.nextId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun nextId(nextId: JsonField<String>) = apply { this.nextId = nextId }

        fun rewards(rewards: List<ParticipantReward>) = rewards(JsonField.of(rewards))

        /**
         * Sets [Builder.rewards] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rewards] with a well-typed `List<ParticipantReward>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun rewards(rewards: JsonField<List<ParticipantReward>>) = apply {
            this.rewards = rewards.map { it.toMutableList() }
        }

        /**
         * Adds a single [ParticipantReward] to [rewards].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReward(reward: ParticipantReward) = apply {
            rewards =
                (rewards ?: JsonField.of(mutableListOf())).also {
                    checkKnown("rewards", it).add(reward)
                }
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
         * Returns an immutable instance of [ParticipantListRewardsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .limit()
         * .nextId()
         * .rewards()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ParticipantListRewardsResponse =
            ParticipantListRewardsResponse(
                checkRequired("limit", limit),
                checkRequired("nextId", nextId),
                checkRequired("rewards", rewards).map { it.toImmutable() },
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
    fun validate(): ParticipantListRewardsResponse = apply {
        if (validated) {
            return@apply
        }

        limit()
        nextId()
        rewards().forEach { it.validate() }
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
        (if (limit.asKnown().isPresent) 1 else 0) +
            (if (nextId.asKnown().isPresent) 1 else 0) +
            (rewards.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParticipantListRewardsResponse &&
            limit == other.limit &&
            nextId == other.nextId &&
            rewards == other.rewards &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(limit, nextId, rewards, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ParticipantListRewardsResponse{limit=$limit, nextId=$nextId, rewards=$rewards, additionalProperties=$additionalProperties}"
}
