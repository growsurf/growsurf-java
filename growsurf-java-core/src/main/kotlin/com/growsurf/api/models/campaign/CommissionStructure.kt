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

class CommissionStructure
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val amount: JsonField<Long>,
    private val amountIso: JsonField<String>,
    private val approvalRequired: JsonField<Boolean>,
    private val duration: JsonField<String>,
    private val durationInMonths: JsonField<Long>,
    private val event: JsonField<String>,
    private val hasIntro: JsonField<Boolean>,
    private val hasMaxAmount: JsonField<Boolean>,
    private val holdDuration: JsonField<Long>,
    private val introAmount: JsonField<Long>,
    private val introAmountIso: JsonField<String>,
    private val introDuration: JsonField<String>,
    private val introDurationInMonths: JsonField<Long>,
    private val introPercent: JsonField<Double>,
    private val introType: JsonField<String>,
    private val maxAmount: JsonField<Long>,
    private val maxAmountIso: JsonField<String>,
    private val minPaidReferrals: JsonField<Long>,
    private val percent: JsonField<Double>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("amountISO")
        @ExcludeMissing
        amountIso: JsonField<String> = JsonMissing.of(),
        @JsonProperty("approvalRequired")
        @ExcludeMissing
        approvalRequired: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("duration") @ExcludeMissing duration: JsonField<String> = JsonMissing.of(),
        @JsonProperty("durationInMonths")
        @ExcludeMissing
        durationInMonths: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("event") @ExcludeMissing event: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hasIntro") @ExcludeMissing hasIntro: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("hasMaxAmount")
        @ExcludeMissing
        hasMaxAmount: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("holdDuration")
        @ExcludeMissing
        holdDuration: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("introAmount")
        @ExcludeMissing
        introAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("introAmountISO")
        @ExcludeMissing
        introAmountIso: JsonField<String> = JsonMissing.of(),
        @JsonProperty("introDuration")
        @ExcludeMissing
        introDuration: JsonField<String> = JsonMissing.of(),
        @JsonProperty("introDurationInMonths")
        @ExcludeMissing
        introDurationInMonths: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("introPercent")
        @ExcludeMissing
        introPercent: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("introType") @ExcludeMissing introType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("maxAmount") @ExcludeMissing maxAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("maxAmountISO")
        @ExcludeMissing
        maxAmountIso: JsonField<String> = JsonMissing.of(),
        @JsonProperty("minPaidReferrals")
        @ExcludeMissing
        minPaidReferrals: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("percent") @ExcludeMissing percent: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        amount,
        amountIso,
        approvalRequired,
        duration,
        durationInMonths,
        event,
        hasIntro,
        hasMaxAmount,
        holdDuration,
        introAmount,
        introAmountIso,
        introDuration,
        introDurationInMonths,
        introPercent,
        introType,
        maxAmount,
        maxAmountIso,
        minPaidReferrals,
        percent,
        type,
        mutableMapOf(),
    )

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amount(): Optional<Long> = amount.getOptional("amount")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amountIso(): Optional<String> = amountIso.getOptional("amountISO")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun approvalRequired(): Optional<Boolean> = approvalRequired.getOptional("approvalRequired")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun duration(): Optional<String> = duration.getOptional("duration")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun durationInMonths(): Optional<Long> = durationInMonths.getOptional("durationInMonths")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun event(): Optional<String> = event.getOptional("event")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hasIntro(): Optional<Boolean> = hasIntro.getOptional("hasIntro")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hasMaxAmount(): Optional<Boolean> = hasMaxAmount.getOptional("hasMaxAmount")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun holdDuration(): Optional<Long> = holdDuration.getOptional("holdDuration")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun introAmount(): Optional<Long> = introAmount.getOptional("introAmount")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun introAmountIso(): Optional<String> = introAmountIso.getOptional("introAmountISO")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun introDuration(): Optional<String> = introDuration.getOptional("introDuration")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun introDurationInMonths(): Optional<Long> =
        introDurationInMonths.getOptional("introDurationInMonths")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun introPercent(): Optional<Double> = introPercent.getOptional("introPercent")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun introType(): Optional<String> = introType.getOptional("introType")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxAmount(): Optional<Long> = maxAmount.getOptional("maxAmount")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxAmountIso(): Optional<String> = maxAmountIso.getOptional("maxAmountISO")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minPaidReferrals(): Optional<Long> = minPaidReferrals.getOptional("minPaidReferrals")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun percent(): Optional<Double> = percent.getOptional("percent")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = type.getOptional("type")

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * Returns the raw JSON value of [amountIso].
     *
     * Unlike [amountIso], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amountISO") @ExcludeMissing fun _amountIso(): JsonField<String> = amountIso

    /**
     * Returns the raw JSON value of [approvalRequired].
     *
     * Unlike [approvalRequired], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("approvalRequired")
    @ExcludeMissing
    fun _approvalRequired(): JsonField<Boolean> = approvalRequired

    /**
     * Returns the raw JSON value of [duration].
     *
     * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<String> = duration

    /**
     * Returns the raw JSON value of [durationInMonths].
     *
     * Unlike [durationInMonths], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("durationInMonths")
    @ExcludeMissing
    fun _durationInMonths(): JsonField<Long> = durationInMonths

    /**
     * Returns the raw JSON value of [event].
     *
     * Unlike [event], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event") @ExcludeMissing fun _event(): JsonField<String> = event

    /**
     * Returns the raw JSON value of [hasIntro].
     *
     * Unlike [hasIntro], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hasIntro") @ExcludeMissing fun _hasIntro(): JsonField<Boolean> = hasIntro

    /**
     * Returns the raw JSON value of [hasMaxAmount].
     *
     * Unlike [hasMaxAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hasMaxAmount")
    @ExcludeMissing
    fun _hasMaxAmount(): JsonField<Boolean> = hasMaxAmount

    /**
     * Returns the raw JSON value of [holdDuration].
     *
     * Unlike [holdDuration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("holdDuration")
    @ExcludeMissing
    fun _holdDuration(): JsonField<Long> = holdDuration

    /**
     * Returns the raw JSON value of [introAmount].
     *
     * Unlike [introAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("introAmount") @ExcludeMissing fun _introAmount(): JsonField<Long> = introAmount

    /**
     * Returns the raw JSON value of [introAmountIso].
     *
     * Unlike [introAmountIso], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("introAmountISO")
    @ExcludeMissing
    fun _introAmountIso(): JsonField<String> = introAmountIso

    /**
     * Returns the raw JSON value of [introDuration].
     *
     * Unlike [introDuration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("introDuration")
    @ExcludeMissing
    fun _introDuration(): JsonField<String> = introDuration

    /**
     * Returns the raw JSON value of [introDurationInMonths].
     *
     * Unlike [introDurationInMonths], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("introDurationInMonths")
    @ExcludeMissing
    fun _introDurationInMonths(): JsonField<Long> = introDurationInMonths

    /**
     * Returns the raw JSON value of [introPercent].
     *
     * Unlike [introPercent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("introPercent")
    @ExcludeMissing
    fun _introPercent(): JsonField<Double> = introPercent

    /**
     * Returns the raw JSON value of [introType].
     *
     * Unlike [introType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("introType") @ExcludeMissing fun _introType(): JsonField<String> = introType

    /**
     * Returns the raw JSON value of [maxAmount].
     *
     * Unlike [maxAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxAmount") @ExcludeMissing fun _maxAmount(): JsonField<Long> = maxAmount

    /**
     * Returns the raw JSON value of [maxAmountIso].
     *
     * Unlike [maxAmountIso], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxAmountISO")
    @ExcludeMissing
    fun _maxAmountIso(): JsonField<String> = maxAmountIso

    /**
     * Returns the raw JSON value of [minPaidReferrals].
     *
     * Unlike [minPaidReferrals], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("minPaidReferrals")
    @ExcludeMissing
    fun _minPaidReferrals(): JsonField<Long> = minPaidReferrals

    /**
     * Returns the raw JSON value of [percent].
     *
     * Unlike [percent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("percent") @ExcludeMissing fun _percent(): JsonField<Double> = percent

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

        /** Returns a mutable builder for constructing an instance of [CommissionStructure]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CommissionStructure]. */
    class Builder internal constructor() {

        private var amount: JsonField<Long> = JsonMissing.of()
        private var amountIso: JsonField<String> = JsonMissing.of()
        private var approvalRequired: JsonField<Boolean> = JsonMissing.of()
        private var duration: JsonField<String> = JsonMissing.of()
        private var durationInMonths: JsonField<Long> = JsonMissing.of()
        private var event: JsonField<String> = JsonMissing.of()
        private var hasIntro: JsonField<Boolean> = JsonMissing.of()
        private var hasMaxAmount: JsonField<Boolean> = JsonMissing.of()
        private var holdDuration: JsonField<Long> = JsonMissing.of()
        private var introAmount: JsonField<Long> = JsonMissing.of()
        private var introAmountIso: JsonField<String> = JsonMissing.of()
        private var introDuration: JsonField<String> = JsonMissing.of()
        private var introDurationInMonths: JsonField<Long> = JsonMissing.of()
        private var introPercent: JsonField<Double> = JsonMissing.of()
        private var introType: JsonField<String> = JsonMissing.of()
        private var maxAmount: JsonField<Long> = JsonMissing.of()
        private var maxAmountIso: JsonField<String> = JsonMissing.of()
        private var minPaidReferrals: JsonField<Long> = JsonMissing.of()
        private var percent: JsonField<Double> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(commissionStructure: CommissionStructure) = apply {
            amount = commissionStructure.amount
            amountIso = commissionStructure.amountIso
            approvalRequired = commissionStructure.approvalRequired
            duration = commissionStructure.duration
            durationInMonths = commissionStructure.durationInMonths
            event = commissionStructure.event
            hasIntro = commissionStructure.hasIntro
            hasMaxAmount = commissionStructure.hasMaxAmount
            holdDuration = commissionStructure.holdDuration
            introAmount = commissionStructure.introAmount
            introAmountIso = commissionStructure.introAmountIso
            introDuration = commissionStructure.introDuration
            introDurationInMonths = commissionStructure.introDurationInMonths
            introPercent = commissionStructure.introPercent
            introType = commissionStructure.introType
            maxAmount = commissionStructure.maxAmount
            maxAmountIso = commissionStructure.maxAmountIso
            minPaidReferrals = commissionStructure.minPaidReferrals
            percent = commissionStructure.percent
            type = commissionStructure.type
            additionalProperties = commissionStructure.additionalProperties.toMutableMap()
        }

        fun amount(amount: Long?) = amount(JsonField.ofNullable(amount))

        /**
         * Alias for [Builder.amount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun amount(amount: Long) = amount(amount as Long?)

        /** Alias for calling [Builder.amount] with `amount.orElse(null)`. */
        fun amount(amount: Optional<Long>) = amount(amount.getOrNull())

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        fun amountIso(amountIso: String?) = amountIso(JsonField.ofNullable(amountIso))

        /** Alias for calling [Builder.amountIso] with `amountIso.orElse(null)`. */
        fun amountIso(amountIso: Optional<String>) = amountIso(amountIso.getOrNull())

        /**
         * Sets [Builder.amountIso] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountIso] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amountIso(amountIso: JsonField<String>) = apply { this.amountIso = amountIso }

        fun approvalRequired(approvalRequired: Boolean?) =
            approvalRequired(JsonField.ofNullable(approvalRequired))

        /**
         * Alias for [Builder.approvalRequired].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun approvalRequired(approvalRequired: Boolean) =
            approvalRequired(approvalRequired as Boolean?)

        /** Alias for calling [Builder.approvalRequired] with `approvalRequired.orElse(null)`. */
        fun approvalRequired(approvalRequired: Optional<Boolean>) =
            approvalRequired(approvalRequired.getOrNull())

        /**
         * Sets [Builder.approvalRequired] to an arbitrary JSON value.
         *
         * You should usually call [Builder.approvalRequired] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun approvalRequired(approvalRequired: JsonField<Boolean>) = apply {
            this.approvalRequired = approvalRequired
        }

        fun duration(duration: String?) = duration(JsonField.ofNullable(duration))

        /** Alias for calling [Builder.duration] with `duration.orElse(null)`. */
        fun duration(duration: Optional<String>) = duration(duration.getOrNull())

        /**
         * Sets [Builder.duration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.duration] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun duration(duration: JsonField<String>) = apply { this.duration = duration }

        fun durationInMonths(durationInMonths: Long?) =
            durationInMonths(JsonField.ofNullable(durationInMonths))

        /**
         * Alias for [Builder.durationInMonths].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun durationInMonths(durationInMonths: Long) = durationInMonths(durationInMonths as Long?)

        /** Alias for calling [Builder.durationInMonths] with `durationInMonths.orElse(null)`. */
        fun durationInMonths(durationInMonths: Optional<Long>) =
            durationInMonths(durationInMonths.getOrNull())

        /**
         * Sets [Builder.durationInMonths] to an arbitrary JSON value.
         *
         * You should usually call [Builder.durationInMonths] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun durationInMonths(durationInMonths: JsonField<Long>) = apply {
            this.durationInMonths = durationInMonths
        }

        fun event(event: String?) = event(JsonField.ofNullable(event))

        /** Alias for calling [Builder.event] with `event.orElse(null)`. */
        fun event(event: Optional<String>) = event(event.getOrNull())

        /**
         * Sets [Builder.event] to an arbitrary JSON value.
         *
         * You should usually call [Builder.event] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun event(event: JsonField<String>) = apply { this.event = event }

        fun hasIntro(hasIntro: Boolean?) = hasIntro(JsonField.ofNullable(hasIntro))

        /**
         * Alias for [Builder.hasIntro].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun hasIntro(hasIntro: Boolean) = hasIntro(hasIntro as Boolean?)

        /** Alias for calling [Builder.hasIntro] with `hasIntro.orElse(null)`. */
        fun hasIntro(hasIntro: Optional<Boolean>) = hasIntro(hasIntro.getOrNull())

        /**
         * Sets [Builder.hasIntro] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasIntro] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hasIntro(hasIntro: JsonField<Boolean>) = apply { this.hasIntro = hasIntro }

        fun hasMaxAmount(hasMaxAmount: Boolean?) = hasMaxAmount(JsonField.ofNullable(hasMaxAmount))

        /**
         * Alias for [Builder.hasMaxAmount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun hasMaxAmount(hasMaxAmount: Boolean) = hasMaxAmount(hasMaxAmount as Boolean?)

        /** Alias for calling [Builder.hasMaxAmount] with `hasMaxAmount.orElse(null)`. */
        fun hasMaxAmount(hasMaxAmount: Optional<Boolean>) = hasMaxAmount(hasMaxAmount.getOrNull())

        /**
         * Sets [Builder.hasMaxAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasMaxAmount] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hasMaxAmount(hasMaxAmount: JsonField<Boolean>) = apply {
            this.hasMaxAmount = hasMaxAmount
        }

        fun holdDuration(holdDuration: Long?) = holdDuration(JsonField.ofNullable(holdDuration))

        /**
         * Alias for [Builder.holdDuration].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun holdDuration(holdDuration: Long) = holdDuration(holdDuration as Long?)

        /** Alias for calling [Builder.holdDuration] with `holdDuration.orElse(null)`. */
        fun holdDuration(holdDuration: Optional<Long>) = holdDuration(holdDuration.getOrNull())

        /**
         * Sets [Builder.holdDuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.holdDuration] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun holdDuration(holdDuration: JsonField<Long>) = apply { this.holdDuration = holdDuration }

        fun introAmount(introAmount: Long?) = introAmount(JsonField.ofNullable(introAmount))

        /**
         * Alias for [Builder.introAmount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun introAmount(introAmount: Long) = introAmount(introAmount as Long?)

        /** Alias for calling [Builder.introAmount] with `introAmount.orElse(null)`. */
        fun introAmount(introAmount: Optional<Long>) = introAmount(introAmount.getOrNull())

        /**
         * Sets [Builder.introAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.introAmount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun introAmount(introAmount: JsonField<Long>) = apply { this.introAmount = introAmount }

        fun introAmountIso(introAmountIso: String?) =
            introAmountIso(JsonField.ofNullable(introAmountIso))

        /** Alias for calling [Builder.introAmountIso] with `introAmountIso.orElse(null)`. */
        fun introAmountIso(introAmountIso: Optional<String>) =
            introAmountIso(introAmountIso.getOrNull())

        /**
         * Sets [Builder.introAmountIso] to an arbitrary JSON value.
         *
         * You should usually call [Builder.introAmountIso] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun introAmountIso(introAmountIso: JsonField<String>) = apply {
            this.introAmountIso = introAmountIso
        }

        fun introDuration(introDuration: String?) =
            introDuration(JsonField.ofNullable(introDuration))

        /** Alias for calling [Builder.introDuration] with `introDuration.orElse(null)`. */
        fun introDuration(introDuration: Optional<String>) =
            introDuration(introDuration.getOrNull())

        /**
         * Sets [Builder.introDuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.introDuration] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun introDuration(introDuration: JsonField<String>) = apply {
            this.introDuration = introDuration
        }

        fun introDurationInMonths(introDurationInMonths: Long?) =
            introDurationInMonths(JsonField.ofNullable(introDurationInMonths))

        /**
         * Alias for [Builder.introDurationInMonths].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun introDurationInMonths(introDurationInMonths: Long) =
            introDurationInMonths(introDurationInMonths as Long?)

        /**
         * Alias for calling [Builder.introDurationInMonths] with
         * `introDurationInMonths.orElse(null)`.
         */
        fun introDurationInMonths(introDurationInMonths: Optional<Long>) =
            introDurationInMonths(introDurationInMonths.getOrNull())

        /**
         * Sets [Builder.introDurationInMonths] to an arbitrary JSON value.
         *
         * You should usually call [Builder.introDurationInMonths] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun introDurationInMonths(introDurationInMonths: JsonField<Long>) = apply {
            this.introDurationInMonths = introDurationInMonths
        }

        fun introPercent(introPercent: Double?) = introPercent(JsonField.ofNullable(introPercent))

        /**
         * Alias for [Builder.introPercent].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun introPercent(introPercent: Double) = introPercent(introPercent as Double?)

        /** Alias for calling [Builder.introPercent] with `introPercent.orElse(null)`. */
        fun introPercent(introPercent: Optional<Double>) = introPercent(introPercent.getOrNull())

        /**
         * Sets [Builder.introPercent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.introPercent] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun introPercent(introPercent: JsonField<Double>) = apply {
            this.introPercent = introPercent
        }

        fun introType(introType: String?) = introType(JsonField.ofNullable(introType))

        /** Alias for calling [Builder.introType] with `introType.orElse(null)`. */
        fun introType(introType: Optional<String>) = introType(introType.getOrNull())

        /**
         * Sets [Builder.introType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.introType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun introType(introType: JsonField<String>) = apply { this.introType = introType }

        fun maxAmount(maxAmount: Long?) = maxAmount(JsonField.ofNullable(maxAmount))

        /**
         * Alias for [Builder.maxAmount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxAmount(maxAmount: Long) = maxAmount(maxAmount as Long?)

        /** Alias for calling [Builder.maxAmount] with `maxAmount.orElse(null)`. */
        fun maxAmount(maxAmount: Optional<Long>) = maxAmount(maxAmount.getOrNull())

        /**
         * Sets [Builder.maxAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxAmount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxAmount(maxAmount: JsonField<Long>) = apply { this.maxAmount = maxAmount }

        fun maxAmountIso(maxAmountIso: String?) = maxAmountIso(JsonField.ofNullable(maxAmountIso))

        /** Alias for calling [Builder.maxAmountIso] with `maxAmountIso.orElse(null)`. */
        fun maxAmountIso(maxAmountIso: Optional<String>) = maxAmountIso(maxAmountIso.getOrNull())

        /**
         * Sets [Builder.maxAmountIso] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxAmountIso] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxAmountIso(maxAmountIso: JsonField<String>) = apply {
            this.maxAmountIso = maxAmountIso
        }

        fun minPaidReferrals(minPaidReferrals: Long?) =
            minPaidReferrals(JsonField.ofNullable(minPaidReferrals))

        /**
         * Alias for [Builder.minPaidReferrals].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun minPaidReferrals(minPaidReferrals: Long) = minPaidReferrals(minPaidReferrals as Long?)

        /** Alias for calling [Builder.minPaidReferrals] with `minPaidReferrals.orElse(null)`. */
        fun minPaidReferrals(minPaidReferrals: Optional<Long>) =
            minPaidReferrals(minPaidReferrals.getOrNull())

        /**
         * Sets [Builder.minPaidReferrals] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minPaidReferrals] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun minPaidReferrals(minPaidReferrals: JsonField<Long>) = apply {
            this.minPaidReferrals = minPaidReferrals
        }

        fun percent(percent: Double?) = percent(JsonField.ofNullable(percent))

        /**
         * Alias for [Builder.percent].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun percent(percent: Double) = percent(percent as Double?)

        /** Alias for calling [Builder.percent] with `percent.orElse(null)`. */
        fun percent(percent: Optional<Double>) = percent(percent.getOrNull())

        /**
         * Sets [Builder.percent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.percent] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun percent(percent: JsonField<Double>) = apply { this.percent = percent }

        fun type(type: Type?) = type(JsonField.ofNullable(type))

        /** Alias for calling [Builder.type] with `type.orElse(null)`. */
        fun type(type: Optional<Type>) = type(type.getOrNull())

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
         * Returns an immutable instance of [CommissionStructure].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CommissionStructure =
            CommissionStructure(
                amount,
                amountIso,
                approvalRequired,
                duration,
                durationInMonths,
                event,
                hasIntro,
                hasMaxAmount,
                holdDuration,
                introAmount,
                introAmountIso,
                introDuration,
                introDurationInMonths,
                introPercent,
                introType,
                maxAmount,
                maxAmountIso,
                minPaidReferrals,
                percent,
                type,
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
    fun validate(): CommissionStructure = apply {
        if (validated) {
            return@apply
        }

        amount()
        amountIso()
        approvalRequired()
        duration()
        durationInMonths()
        event()
        hasIntro()
        hasMaxAmount()
        holdDuration()
        introAmount()
        introAmountIso()
        introDuration()
        introDurationInMonths()
        introPercent()
        introType()
        maxAmount()
        maxAmountIso()
        minPaidReferrals()
        percent()
        type().ifPresent { it.validate() }
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
        (if (amount.asKnown().isPresent) 1 else 0) +
            (if (amountIso.asKnown().isPresent) 1 else 0) +
            (if (approvalRequired.asKnown().isPresent) 1 else 0) +
            (if (duration.asKnown().isPresent) 1 else 0) +
            (if (durationInMonths.asKnown().isPresent) 1 else 0) +
            (if (event.asKnown().isPresent) 1 else 0) +
            (if (hasIntro.asKnown().isPresent) 1 else 0) +
            (if (hasMaxAmount.asKnown().isPresent) 1 else 0) +
            (if (holdDuration.asKnown().isPresent) 1 else 0) +
            (if (introAmount.asKnown().isPresent) 1 else 0) +
            (if (introAmountIso.asKnown().isPresent) 1 else 0) +
            (if (introDuration.asKnown().isPresent) 1 else 0) +
            (if (introDurationInMonths.asKnown().isPresent) 1 else 0) +
            (if (introPercent.asKnown().isPresent) 1 else 0) +
            (if (introType.asKnown().isPresent) 1 else 0) +
            (if (maxAmount.asKnown().isPresent) 1 else 0) +
            (if (maxAmountIso.asKnown().isPresent) 1 else 0) +
            (if (minPaidReferrals.asKnown().isPresent) 1 else 0) +
            (if (percent.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

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

            @JvmField val PERCENT = of("PERCENT")

            @JvmField val FIXED = of("FIXED")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            PERCENT,
            FIXED,
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
            PERCENT,
            FIXED,
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
                PERCENT -> Value.PERCENT
                FIXED -> Value.FIXED
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
                PERCENT -> Known.PERCENT
                FIXED -> Known.FIXED
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

        return other is CommissionStructure &&
            amount == other.amount &&
            amountIso == other.amountIso &&
            approvalRequired == other.approvalRequired &&
            duration == other.duration &&
            durationInMonths == other.durationInMonths &&
            event == other.event &&
            hasIntro == other.hasIntro &&
            hasMaxAmount == other.hasMaxAmount &&
            holdDuration == other.holdDuration &&
            introAmount == other.introAmount &&
            introAmountIso == other.introAmountIso &&
            introDuration == other.introDuration &&
            introDurationInMonths == other.introDurationInMonths &&
            introPercent == other.introPercent &&
            introType == other.introType &&
            maxAmount == other.maxAmount &&
            maxAmountIso == other.maxAmountIso &&
            minPaidReferrals == other.minPaidReferrals &&
            percent == other.percent &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            amount,
            amountIso,
            approvalRequired,
            duration,
            durationInMonths,
            event,
            hasIntro,
            hasMaxAmount,
            holdDuration,
            introAmount,
            introAmountIso,
            introDuration,
            introDurationInMonths,
            introPercent,
            introType,
            maxAmount,
            maxAmountIso,
            minPaidReferrals,
            percent,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CommissionStructure{amount=$amount, amountIso=$amountIso, approvalRequired=$approvalRequired, duration=$duration, durationInMonths=$durationInMonths, event=$event, hasIntro=$hasIntro, hasMaxAmount=$hasMaxAmount, holdDuration=$holdDuration, introAmount=$introAmount, introAmountIso=$introAmountIso, introDuration=$introDuration, introDurationInMonths=$introDurationInMonths, introPercent=$introPercent, introType=$introType, maxAmount=$maxAmount, maxAmountIso=$maxAmountIso, minPaidReferrals=$minPaidReferrals, percent=$percent, type=$type, additionalProperties=$additionalProperties}"
}
