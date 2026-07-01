// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.rewards

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
import kotlin.jvm.optionals.getOrNull

/** The list of a program's configured rewards. */
class CampaignRewardListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val rewards: JsonField<List<Reward>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("rewards") @ExcludeMissing rewards: JsonField<List<Reward>> = JsonMissing.of()
    ) : this(rewards, mutableMapOf())

    /**
     * The program's active, visible, and enabled rewards.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rewards(): List<Reward> = rewards.getRequired("rewards")

    /**
     * Returns the raw JSON value of [rewards].
     *
     * Unlike [rewards], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rewards") @ExcludeMissing fun _rewards(): JsonField<List<Reward>> = rewards

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
         * Returns a mutable builder for constructing an instance of [CampaignRewardListResponse].
         *
         * The following fields are required:
         * ```java
         * .rewards()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CampaignRewardListResponse]. */
    class Builder internal constructor() {

        private var rewards: JsonField<MutableList<Reward>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(campaignRewardListResponse: CampaignRewardListResponse) = apply {
            rewards = campaignRewardListResponse.rewards.map { it.toMutableList() }
            additionalProperties = campaignRewardListResponse.additionalProperties.toMutableMap()
        }

        /** The program's active, visible, and enabled rewards. */
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
         * Returns an immutable instance of [CampaignRewardListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .rewards()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CampaignRewardListResponse =
            CampaignRewardListResponse(
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
    fun validate(): CampaignRewardListResponse = apply {
        if (validated) {
            return@apply
        }

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
        (rewards.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CampaignRewardListResponse &&
            rewards == other.rewards &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(rewards, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CampaignRewardListResponse{rewards=$rewards, additionalProperties=$additionalProperties}"
}
