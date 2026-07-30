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
    private val taxCharacter: JsonField<TaxCharacter>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("fairMarketValueUSD")
        @ExcludeMissing
        fairMarketValueUsd: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("taxCharacter")
        @ExcludeMissing
        taxCharacter: JsonField<TaxCharacter> = JsonMissing.of(),
    ) : this(fairMarketValueUsd, taxCharacter, mutableMapOf())

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
     * The reason the recipient earns this reward. `null` inherits the program's confirmed tax
     * treatment for configurable non-commission rewards. Commission rewards always use
     * `NONEMPLOYEE_SERVICES`.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun taxCharacter(): Optional<TaxCharacter> = taxCharacter.getOptional("taxCharacter")

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
     * Returns the raw JSON value of [taxCharacter].
     *
     * Unlike [taxCharacter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("taxCharacter")
    @ExcludeMissing
    fun _taxCharacter(): JsonField<TaxCharacter> = taxCharacter

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
        private var taxCharacter: JsonField<TaxCharacter> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(rewardTaxValuation: RewardTaxValuation) = apply {
            fairMarketValueUsd = rewardTaxValuation.fairMarketValueUsd
            taxCharacter = rewardTaxValuation.taxCharacter
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
         * The reason the recipient earns this reward. `null` inherits the program's confirmed tax
         * treatment for configurable non-commission rewards. Commission rewards always use
         * `NONEMPLOYEE_SERVICES`.
         */
        fun taxCharacter(taxCharacter: TaxCharacter?) =
            taxCharacter(JsonField.ofNullable(taxCharacter))

        /** Alias for calling [Builder.taxCharacter] with `taxCharacter.orElse(null)`. */
        fun taxCharacter(taxCharacter: Optional<TaxCharacter>) =
            taxCharacter(taxCharacter.getOrNull())

        /**
         * Sets [Builder.taxCharacter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxCharacter] with a well-typed [TaxCharacter] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun taxCharacter(taxCharacter: JsonField<TaxCharacter>) = apply {
            this.taxCharacter = taxCharacter
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
                taxCharacter,
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
        taxCharacter().ifPresent { it.validate() }
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
            (taxCharacter.asKnown().getOrNull()?.validity() ?: 0)

    /** The U.S. federal tax character of a reward. */
    class TaxCharacter @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /** Returns this class instance's raw value. */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val NONEMPLOYEE_SERVICES = of("NONEMPLOYEE_SERVICES")

            @JvmField val PRIZE_OR_AWARD = of("PRIZE_OR_AWARD")

            @JvmField val PURCHASE_REBATE = of("PURCHASE_REBATE")

            @JvmField val OTHER_INCOME = of("OTHER_INCOME")

            @JvmField val REVIEW_REQUIRED = of("REVIEW_REQUIRED")

            @JvmStatic fun of(value: String) = TaxCharacter(JsonField.of(value))
        }

        /** An enum containing [TaxCharacter]'s known values. */
        enum class Known {
            NONEMPLOYEE_SERVICES,
            PRIZE_OR_AWARD,
            PURCHASE_REBATE,
            OTHER_INCOME,
            REVIEW_REQUIRED,
        }

        /** An enum containing known values and an [_UNKNOWN] member. */
        enum class Value {
            NONEMPLOYEE_SERVICES,
            PRIZE_OR_AWARD,
            PURCHASE_REBATE,
            OTHER_INCOME,
            REVIEW_REQUIRED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                NONEMPLOYEE_SERVICES -> Value.NONEMPLOYEE_SERVICES
                PRIZE_OR_AWARD -> Value.PRIZE_OR_AWARD
                PURCHASE_REBATE -> Value.PURCHASE_REBATE
                OTHER_INCOME -> Value.OTHER_INCOME
                REVIEW_REQUIRED -> Value.REVIEW_REQUIRED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                NONEMPLOYEE_SERVICES -> Known.NONEMPLOYEE_SERVICES
                PRIZE_OR_AWARD -> Known.PRIZE_OR_AWARD
                PURCHASE_REBATE -> Known.PURCHASE_REBATE
                OTHER_INCOME -> Known.OTHER_INCOME
                REVIEW_REQUIRED -> Known.REVIEW_REQUIRED
                else -> throw GrowsurfInvalidDataException("Unknown TaxCharacter: $value")
            }

        fun asString(): String =
            _value().asString().orElseThrow {
                GrowsurfInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): TaxCharacter = apply {
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

        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean =
            this === other || (other is TaxCharacter && value == other.value)

        override fun hashCode(): Int = value.hashCode()

        override fun toString(): String = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RewardTaxValuation &&
            fairMarketValueUsd == other.fairMarketValueUsd &&
            taxCharacter == other.taxCharacter &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(fairMarketValueUsd, taxCharacter, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RewardTaxValuation{fairMarketValueUsd=$fairMarketValueUsd, taxCharacter=$taxCharacter, additionalProperties=$additionalProperties}"
}
