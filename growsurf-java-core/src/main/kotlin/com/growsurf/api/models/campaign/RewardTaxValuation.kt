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
import com.growsurf.api.errors.GrowsurfInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Tax valuation settings for a reward. Only relevant when the program collects tax documentation.
 */
class RewardTaxValuation
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val fairMarketValueUsd: JsonField<Double>,
    private val isTaxReportable: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("fairMarketValueUSD")
        @ExcludeMissing
        fairMarketValueUsd: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("isTaxReportable")
        @ExcludeMissing
        isTaxReportable: JsonField<Boolean> = JsonMissing.of(),
    ) : this(fairMarketValueUsd, isTaxReportable, mutableMapOf())

    /**
     * Manual fair-market value in USD (major units) used as the fallback when the reward value
     * cannot be resolved automatically. `null` = no manual value.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fairMarketValueUsd(): Optional<Double> =
        fairMarketValueUsd.getOptional("fairMarketValueUSD")

    /**
     * Whether the reward's value counts toward 1099 thresholds/totals. `null` = use the smart
     * default for the reward's source.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isTaxReportable(): Optional<Boolean> = isTaxReportable.getOptional("isTaxReportable")

    /**
     * Returns the raw JSON value of [fairMarketValueUsd].
     *
     * Unlike [fairMarketValueUsd], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("fairMarketValueUSD")
    @ExcludeMissing
    fun _fairMarketValueUsd(): JsonField<Double> = fairMarketValueUsd

    /**
     * Returns the raw JSON value of [isTaxReportable].
     *
     * Unlike [isTaxReportable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isTaxReportable")
    @ExcludeMissing
    fun _isTaxReportable(): JsonField<Boolean> = isTaxReportable

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

        /** Returns a mutable builder for constructing an instance of [RewardTaxValuation]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RewardTaxValuation]. */
    class Builder internal constructor() {

        private var fairMarketValueUsd: JsonField<Double> = JsonMissing.of()
        private var isTaxReportable: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(rewardTaxValuation: RewardTaxValuation) = apply {
            fairMarketValueUsd = rewardTaxValuation.fairMarketValueUsd
            isTaxReportable = rewardTaxValuation.isTaxReportable
            additionalProperties = rewardTaxValuation.additionalProperties.toMutableMap()
        }

        /**
         * Manual fair-market value in USD (major units) used as the fallback when the reward value
         * cannot be resolved automatically. `null` = no manual value.
         */
        fun fairMarketValueUsd(fairMarketValueUsd: Double?) =
            fairMarketValueUsd(JsonField.ofNullable(fairMarketValueUsd))

        /**
         * Alias for [Builder.fairMarketValueUsd].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun fairMarketValueUsd(fairMarketValueUsd: Double) =
            fairMarketValueUsd(fairMarketValueUsd as Double?)

        /**
         * Alias for calling [Builder.fairMarketValueUsd] with `fairMarketValueUsd.orElse(null)`.
         */
        fun fairMarketValueUsd(fairMarketValueUsd: Optional<Double>) =
            fairMarketValueUsd(fairMarketValueUsd.getOrNull())

        /**
         * Sets [Builder.fairMarketValueUsd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fairMarketValueUsd] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fairMarketValueUsd(fairMarketValueUsd: JsonField<Double>) = apply {
            this.fairMarketValueUsd = fairMarketValueUsd
        }

        /**
         * Whether the reward's value counts toward 1099 thresholds/totals. `null` = use the smart
         * default for the reward's source.
         */
        fun isTaxReportable(isTaxReportable: Boolean?) =
            isTaxReportable(JsonField.ofNullable(isTaxReportable))

        /**
         * Alias for [Builder.isTaxReportable].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isTaxReportable(isTaxReportable: Boolean) = isTaxReportable(isTaxReportable as Boolean?)

        /** Alias for calling [Builder.isTaxReportable] with `isTaxReportable.orElse(null)`. */
        fun isTaxReportable(isTaxReportable: Optional<Boolean>) =
            isTaxReportable(isTaxReportable.getOrNull())

        /**
         * Sets [Builder.isTaxReportable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isTaxReportable] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isTaxReportable(isTaxReportable: JsonField<Boolean>) = apply {
            this.isTaxReportable = isTaxReportable
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
         * Returns an immutable instance of [RewardTaxValuation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RewardTaxValuation =
            RewardTaxValuation(
                fairMarketValueUsd,
                isTaxReportable,
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
    fun validate(): RewardTaxValuation = apply {
        if (validated) {
            return@apply
        }

        fairMarketValueUsd()
        isTaxReportable()
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
        (if (fairMarketValueUsd.asKnown().isPresent) 1 else 0) +
            (if (isTaxReportable.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RewardTaxValuation &&
            fairMarketValueUsd == other.fairMarketValueUsd &&
            isTaxReportable == other.isTaxReportable &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(fairMarketValueUsd, isTaxReportable, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RewardTaxValuation{fairMarketValueUsd=$fairMarketValueUsd, isTaxReportable=$isTaxReportable, additionalProperties=$additionalProperties}"
}
