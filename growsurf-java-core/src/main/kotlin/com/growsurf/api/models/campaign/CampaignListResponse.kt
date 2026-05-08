// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

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

class CampaignListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val campaigns: JsonField<List<Campaign>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("campaigns")
        @ExcludeMissing
        campaigns: JsonField<List<Campaign>> = JsonMissing.of()
    ) : this(campaigns, mutableMapOf())

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun campaigns(): List<Campaign> = campaigns.getRequired("campaigns")

    /**
     * Returns the raw JSON value of [campaigns].
     *
     * Unlike [campaigns], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("campaigns")
    @ExcludeMissing
    fun _campaigns(): JsonField<List<Campaign>> = campaigns

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
         * Returns a mutable builder for constructing an instance of [CampaignListResponse].
         *
         * The following fields are required:
         * ```java
         * .campaigns()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CampaignListResponse]. */
    class Builder internal constructor() {

        private var campaigns: JsonField<MutableList<Campaign>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(campaignListResponse: CampaignListResponse) = apply {
            campaigns = campaignListResponse.campaigns.map { it.toMutableList() }
            additionalProperties = campaignListResponse.additionalProperties.toMutableMap()
        }

        fun campaigns(campaigns: List<Campaign>) = campaigns(JsonField.of(campaigns))

        /**
         * Sets [Builder.campaigns] to an arbitrary JSON value.
         *
         * You should usually call [Builder.campaigns] with a well-typed `List<Campaign>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun campaigns(campaigns: JsonField<List<Campaign>>) = apply {
            this.campaigns = campaigns.map { it.toMutableList() }
        }

        /**
         * Adds a single [Campaign] to [campaigns].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCampaign(campaign: Campaign) = apply {
            campaigns =
                (campaigns ?: JsonField.of(mutableListOf())).also {
                    checkKnown("campaigns", it).add(campaign)
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
         * Returns an immutable instance of [CampaignListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .campaigns()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CampaignListResponse =
            CampaignListResponse(
                checkRequired("campaigns", campaigns).map { it.toImmutable() },
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
    fun validate(): CampaignListResponse = apply {
        if (validated) {
            return@apply
        }

        campaigns().forEach { it.validate() }
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
        (campaigns.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CampaignListResponse &&
            campaigns == other.campaigns &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(campaigns, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CampaignListResponse{campaigns=$campaigns, additionalProperties=$additionalProperties}"
}
