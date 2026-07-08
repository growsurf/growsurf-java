// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.options

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.growsurf.api.core.ExcludeMissing
import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.toImmutable
import com.growsurf.api.errors.GrowsurfInvalidDataException
import java.util.Objects

/**
 * Program Editor **Options** tab configuration — the same surface as the dashboard. This is a
 * large, loosely-typed object modeled as free-form properties; the available fields depend on the
 * program type (reward/fraud approval, anti-fraud lists + toggles, referral cookie/credit windows,
 * reCAPTCHA, payout threshold + tax settings (affiliate only), and notification-email settings). To
 * see the full object with every field and its current value, retrieve the resource first, then
 * send back only the fields you want to change.
 */
class CampaignOptions
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

        /** Returns a mutable builder for constructing an instance of [CampaignOptions]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CampaignOptions]. */
    class Builder internal constructor() {

        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(options: CampaignOptions) = apply {
            additionalProperties = options.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [CampaignOptions].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CampaignOptions = CampaignOptions(additionalProperties.toImmutable())
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
    fun validate(): CampaignOptions = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
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

        return other is CampaignOptions && additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() = "CampaignOptions{additionalProperties=$additionalProperties}"
}
