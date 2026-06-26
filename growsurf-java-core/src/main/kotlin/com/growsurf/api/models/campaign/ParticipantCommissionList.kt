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

class ParticipantCommissionList
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val commissions: JsonField<List<Commission>>,
    private val limit: JsonField<Long>,
    private val nextId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("commissions")
        @ExcludeMissing
        commissions: JsonField<List<Commission>> = JsonMissing.of(),
        @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("nextId") @ExcludeMissing nextId: JsonField<String> = JsonMissing.of(),
    ) : this(commissions, limit, nextId, mutableMapOf())

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun commissions(): List<Commission> = commissions.getRequired("commissions")

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
     * Returns the raw JSON value of [commissions].
     *
     * Unlike [commissions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("commissions")
    @ExcludeMissing
    fun _commissions(): JsonField<List<Commission>> = commissions

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
         * Returns a mutable builder for constructing an instance of [ParticipantCommissionList].
         *
         * The following fields are required:
         * ```java
         * .commissions()
         * .limit()
         * .nextId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ParticipantCommissionList]. */
    class Builder internal constructor() {

        private var commissions: JsonField<MutableList<Commission>>? = null
        private var limit: JsonField<Long>? = null
        private var nextId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(participantCommissionList: ParticipantCommissionList) = apply {
            commissions = participantCommissionList.commissions.map { it.toMutableList() }
            limit = participantCommissionList.limit
            nextId = participantCommissionList.nextId
            additionalProperties = participantCommissionList.additionalProperties.toMutableMap()
        }

        fun commissions(commissions: List<Commission>) = commissions(JsonField.of(commissions))

        /**
         * Sets [Builder.commissions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commissions] with a well-typed `List<Commission>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun commissions(commissions: JsonField<List<Commission>>) = apply {
            this.commissions = commissions.map { it.toMutableList() }
        }

        /**
         * Adds a single [Commission] to [commissions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCommission(commission: Commission) = apply {
            commissions =
                (commissions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("commissions", it).add(commission)
                }
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
         * Returns an immutable instance of [ParticipantCommissionList].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .commissions()
         * .limit()
         * .nextId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ParticipantCommissionList =
            ParticipantCommissionList(
                checkRequired("commissions", commissions).map { it.toImmutable() },
                checkRequired("limit", limit),
                checkRequired("nextId", nextId),
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
    fun validate(): ParticipantCommissionList = apply {
        if (validated) {
            return@apply
        }

        commissions().forEach { it.validate() }
        limit()
        nextId()
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
        (commissions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (limit.asKnown().isPresent) 1 else 0) +
            (if (nextId.asKnown().isPresent) 1 else 0)

    class Commission
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val amount: JsonField<Long>,
        private val createdAt: JsonField<Long>,
        private val currencyIso: JsonField<String>,
        private val referredId: JsonField<String>,
        private val referrerId: JsonField<String>,
        private val saleAmount: JsonField<Long>,
        private val status: JsonField<Status>,
        private val amountInCampaignCurrency: JsonField<Long>,
        private val approvedAt: JsonField<Long>,
        private val campaignCurrencyIso: JsonField<String>,
        private val exchangeRate: JsonField<Double>,
        private val exchangeRateAt: JsonField<Long>,
        private val fxError: JsonField<String>,
        private val holdDuration: JsonField<Long>,
        private val paidAt: JsonField<Long>,
        private val payoutQueuedAt: JsonField<Long>,
        private val provider: JsonField<String>,
        private val reversedAt: JsonField<Long>,
        private val saleAmountInCampaignCurrency: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("currencyISO")
            @ExcludeMissing
            currencyIso: JsonField<String> = JsonMissing.of(),
            @JsonProperty("referredId")
            @ExcludeMissing
            referredId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("referrerId")
            @ExcludeMissing
            referrerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("saleAmount")
            @ExcludeMissing
            saleAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("amountInCampaignCurrency")
            @ExcludeMissing
            amountInCampaignCurrency: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("approvedAt")
            @ExcludeMissing
            approvedAt: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("campaignCurrencyISO")
            @ExcludeMissing
            campaignCurrencyIso: JsonField<String> = JsonMissing.of(),
            @JsonProperty("exchangeRate")
            @ExcludeMissing
            exchangeRate: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("exchangeRateAt")
            @ExcludeMissing
            exchangeRateAt: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("fxError") @ExcludeMissing fxError: JsonField<String> = JsonMissing.of(),
            @JsonProperty("holdDuration")
            @ExcludeMissing
            holdDuration: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("paidAt") @ExcludeMissing paidAt: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("payoutQueuedAt")
            @ExcludeMissing
            payoutQueuedAt: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("provider")
            @ExcludeMissing
            provider: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reversedAt")
            @ExcludeMissing
            reversedAt: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("saleAmountInCampaignCurrency")
            @ExcludeMissing
            saleAmountInCampaignCurrency: JsonField<Long> = JsonMissing.of(),
        ) : this(
            id,
            amount,
            createdAt,
            currencyIso,
            referredId,
            referrerId,
            saleAmount,
            status,
            amountInCampaignCurrency,
            approvedAt,
            campaignCurrencyIso,
            exchangeRate,
            exchangeRateAt,
            fxError,
            holdDuration,
            paidAt,
            payoutQueuedAt,
            provider,
            reversedAt,
            saleAmountInCampaignCurrency,
            mutableMapOf(),
        )

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun amount(): Optional<Long> = amount.getOptional("amount")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): Long = createdAt.getRequired("createdAt")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currencyIso(): String = currencyIso.getRequired("currencyISO")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun referredId(): String = referredId.getRequired("referredId")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun referrerId(): String = referrerId.getRequired("referrerId")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun saleAmount(): Optional<Long> = saleAmount.getOptional("saleAmount")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun amountInCampaignCurrency(): Optional<Long> =
            amountInCampaignCurrency.getOptional("amountInCampaignCurrency")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun approvedAt(): Optional<Long> = approvedAt.getOptional("approvedAt")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun campaignCurrencyIso(): Optional<String> =
            campaignCurrencyIso.getOptional("campaignCurrencyISO")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun exchangeRate(): Optional<Double> = exchangeRate.getOptional("exchangeRate")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun exchangeRateAt(): Optional<Long> = exchangeRateAt.getOptional("exchangeRateAt")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fxError(): Optional<String> = fxError.getOptional("fxError")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun holdDuration(): Optional<Long> = holdDuration.getOptional("holdDuration")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun paidAt(): Optional<Long> = paidAt.getOptional("paidAt")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun payoutQueuedAt(): Optional<Long> = payoutQueuedAt.getOptional("payoutQueuedAt")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun provider(): Optional<String> = provider.getOptional("provider")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun reversedAt(): Optional<Long> = reversedAt.getOptional("reversedAt")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun saleAmountInCampaignCurrency(): Optional<Long> =
            saleAmountInCampaignCurrency.getOptional("saleAmountInCampaignCurrency")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdAt") @ExcludeMissing fun _createdAt(): JsonField<Long> = createdAt

        /**
         * Returns the raw JSON value of [currencyIso].
         *
         * Unlike [currencyIso], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currencyISO")
        @ExcludeMissing
        fun _currencyIso(): JsonField<String> = currencyIso

        /**
         * Returns the raw JSON value of [referredId].
         *
         * Unlike [referredId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("referredId")
        @ExcludeMissing
        fun _referredId(): JsonField<String> = referredId

        /**
         * Returns the raw JSON value of [referrerId].
         *
         * Unlike [referrerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("referrerId")
        @ExcludeMissing
        fun _referrerId(): JsonField<String> = referrerId

        /**
         * Returns the raw JSON value of [saleAmount].
         *
         * Unlike [saleAmount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("saleAmount") @ExcludeMissing fun _saleAmount(): JsonField<Long> = saleAmount

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [amountInCampaignCurrency].
         *
         * Unlike [amountInCampaignCurrency], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("amountInCampaignCurrency")
        @ExcludeMissing
        fun _amountInCampaignCurrency(): JsonField<Long> = amountInCampaignCurrency

        /**
         * Returns the raw JSON value of [approvedAt].
         *
         * Unlike [approvedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("approvedAt") @ExcludeMissing fun _approvedAt(): JsonField<Long> = approvedAt

        /**
         * Returns the raw JSON value of [campaignCurrencyIso].
         *
         * Unlike [campaignCurrencyIso], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("campaignCurrencyISO")
        @ExcludeMissing
        fun _campaignCurrencyIso(): JsonField<String> = campaignCurrencyIso

        /**
         * Returns the raw JSON value of [exchangeRate].
         *
         * Unlike [exchangeRate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("exchangeRate")
        @ExcludeMissing
        fun _exchangeRate(): JsonField<Double> = exchangeRate

        /**
         * Returns the raw JSON value of [exchangeRateAt].
         *
         * Unlike [exchangeRateAt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("exchangeRateAt")
        @ExcludeMissing
        fun _exchangeRateAt(): JsonField<Long> = exchangeRateAt

        /**
         * Returns the raw JSON value of [fxError].
         *
         * Unlike [fxError], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fxError") @ExcludeMissing fun _fxError(): JsonField<String> = fxError

        /**
         * Returns the raw JSON value of [holdDuration].
         *
         * Unlike [holdDuration], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("holdDuration")
        @ExcludeMissing
        fun _holdDuration(): JsonField<Long> = holdDuration

        /**
         * Returns the raw JSON value of [paidAt].
         *
         * Unlike [paidAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("paidAt") @ExcludeMissing fun _paidAt(): JsonField<Long> = paidAt

        /**
         * Returns the raw JSON value of [payoutQueuedAt].
         *
         * Unlike [payoutQueuedAt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("payoutQueuedAt")
        @ExcludeMissing
        fun _payoutQueuedAt(): JsonField<Long> = payoutQueuedAt

        /**
         * Returns the raw JSON value of [provider].
         *
         * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

        /**
         * Returns the raw JSON value of [reversedAt].
         *
         * Unlike [reversedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reversedAt") @ExcludeMissing fun _reversedAt(): JsonField<Long> = reversedAt

        /**
         * Returns the raw JSON value of [saleAmountInCampaignCurrency].
         *
         * Unlike [saleAmountInCampaignCurrency], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("saleAmountInCampaignCurrency")
        @ExcludeMissing
        fun _saleAmountInCampaignCurrency(): JsonField<Long> = saleAmountInCampaignCurrency

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
             * Returns a mutable builder for constructing an instance of [Commission].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .amount()
             * .createdAt()
             * .currencyIso()
             * .referredId()
             * .referrerId()
             * .saleAmount()
             * .status()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Commission]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var createdAt: JsonField<Long>? = null
            private var currencyIso: JsonField<String>? = null
            private var referredId: JsonField<String>? = null
            private var referrerId: JsonField<String>? = null
            private var saleAmount: JsonField<Long>? = null
            private var status: JsonField<Status>? = null
            private var amountInCampaignCurrency: JsonField<Long> = JsonMissing.of()
            private var approvedAt: JsonField<Long> = JsonMissing.of()
            private var campaignCurrencyIso: JsonField<String> = JsonMissing.of()
            private var exchangeRate: JsonField<Double> = JsonMissing.of()
            private var exchangeRateAt: JsonField<Long> = JsonMissing.of()
            private var fxError: JsonField<String> = JsonMissing.of()
            private var holdDuration: JsonField<Long> = JsonMissing.of()
            private var paidAt: JsonField<Long> = JsonMissing.of()
            private var payoutQueuedAt: JsonField<Long> = JsonMissing.of()
            private var provider: JsonField<String> = JsonMissing.of()
            private var reversedAt: JsonField<Long> = JsonMissing.of()
            private var saleAmountInCampaignCurrency: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(commission: Commission) = apply {
                id = commission.id
                amount = commission.amount
                createdAt = commission.createdAt
                currencyIso = commission.currencyIso
                referredId = commission.referredId
                referrerId = commission.referrerId
                saleAmount = commission.saleAmount
                status = commission.status
                amountInCampaignCurrency = commission.amountInCampaignCurrency
                approvedAt = commission.approvedAt
                campaignCurrencyIso = commission.campaignCurrencyIso
                exchangeRate = commission.exchangeRate
                exchangeRateAt = commission.exchangeRateAt
                fxError = commission.fxError
                holdDuration = commission.holdDuration
                paidAt = commission.paidAt
                payoutQueuedAt = commission.payoutQueuedAt
                provider = commission.provider
                reversedAt = commission.reversedAt
                saleAmountInCampaignCurrency = commission.saleAmountInCampaignCurrency
                additionalProperties = commission.additionalProperties.toMutableMap()
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

            fun currencyIso(currencyIso: String) = currencyIso(JsonField.of(currencyIso))

            /**
             * Sets [Builder.currencyIso] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currencyIso] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currencyIso(currencyIso: JsonField<String>) = apply {
                this.currencyIso = currencyIso
            }

            fun referredId(referredId: String) = referredId(JsonField.of(referredId))

            /**
             * Sets [Builder.referredId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referredId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun referredId(referredId: JsonField<String>) = apply { this.referredId = referredId }

            fun referrerId(referrerId: String) = referrerId(JsonField.of(referrerId))

            /**
             * Sets [Builder.referrerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referrerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun referrerId(referrerId: JsonField<String>) = apply { this.referrerId = referrerId }

            fun saleAmount(saleAmount: Long?) = saleAmount(JsonField.ofNullable(saleAmount))

            /**
             * Alias for [Builder.saleAmount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun saleAmount(saleAmount: Long) = saleAmount(saleAmount as Long?)

            /** Alias for calling [Builder.saleAmount] with `saleAmount.orElse(null)`. */
            fun saleAmount(saleAmount: Optional<Long>) = saleAmount(saleAmount.getOrNull())

            /**
             * Sets [Builder.saleAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.saleAmount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun saleAmount(saleAmount: JsonField<Long>) = apply { this.saleAmount = saleAmount }

            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            fun amountInCampaignCurrency(amountInCampaignCurrency: Long?) =
                amountInCampaignCurrency(JsonField.ofNullable(amountInCampaignCurrency))

            /**
             * Alias for [Builder.amountInCampaignCurrency].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun amountInCampaignCurrency(amountInCampaignCurrency: Long) =
                amountInCampaignCurrency(amountInCampaignCurrency as Long?)

            /**
             * Alias for calling [Builder.amountInCampaignCurrency] with
             * `amountInCampaignCurrency.orElse(null)`.
             */
            fun amountInCampaignCurrency(amountInCampaignCurrency: Optional<Long>) =
                amountInCampaignCurrency(amountInCampaignCurrency.getOrNull())

            /**
             * Sets [Builder.amountInCampaignCurrency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountInCampaignCurrency] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun amountInCampaignCurrency(amountInCampaignCurrency: JsonField<Long>) = apply {
                this.amountInCampaignCurrency = amountInCampaignCurrency
            }

            fun approvedAt(approvedAt: Long) = approvedAt(JsonField.of(approvedAt))

            /**
             * Sets [Builder.approvedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.approvedAt] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun approvedAt(approvedAt: JsonField<Long>) = apply { this.approvedAt = approvedAt }

            fun campaignCurrencyIso(campaignCurrencyIso: String?) =
                campaignCurrencyIso(JsonField.ofNullable(campaignCurrencyIso))

            /**
             * Alias for calling [Builder.campaignCurrencyIso] with
             * `campaignCurrencyIso.orElse(null)`.
             */
            fun campaignCurrencyIso(campaignCurrencyIso: Optional<String>) =
                campaignCurrencyIso(campaignCurrencyIso.getOrNull())

            /**
             * Sets [Builder.campaignCurrencyIso] to an arbitrary JSON value.
             *
             * You should usually call [Builder.campaignCurrencyIso] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun campaignCurrencyIso(campaignCurrencyIso: JsonField<String>) = apply {
                this.campaignCurrencyIso = campaignCurrencyIso
            }

            fun exchangeRate(exchangeRate: Double?) =
                exchangeRate(JsonField.ofNullable(exchangeRate))

            /**
             * Alias for [Builder.exchangeRate].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun exchangeRate(exchangeRate: Double) = exchangeRate(exchangeRate as Double?)

            /** Alias for calling [Builder.exchangeRate] with `exchangeRate.orElse(null)`. */
            fun exchangeRate(exchangeRate: Optional<Double>) =
                exchangeRate(exchangeRate.getOrNull())

            /**
             * Sets [Builder.exchangeRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.exchangeRate] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun exchangeRate(exchangeRate: JsonField<Double>) = apply {
                this.exchangeRate = exchangeRate
            }

            fun exchangeRateAt(exchangeRateAt: Long) = exchangeRateAt(JsonField.of(exchangeRateAt))

            /**
             * Sets [Builder.exchangeRateAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.exchangeRateAt] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun exchangeRateAt(exchangeRateAt: JsonField<Long>) = apply {
                this.exchangeRateAt = exchangeRateAt
            }

            fun fxError(fxError: String?) = fxError(JsonField.ofNullable(fxError))

            /** Alias for calling [Builder.fxError] with `fxError.orElse(null)`. */
            fun fxError(fxError: Optional<String>) = fxError(fxError.getOrNull())

            /**
             * Sets [Builder.fxError] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fxError] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fxError(fxError: JsonField<String>) = apply { this.fxError = fxError }

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
             * You should usually call [Builder.holdDuration] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun holdDuration(holdDuration: JsonField<Long>) = apply {
                this.holdDuration = holdDuration
            }

            fun paidAt(paidAt: Long) = paidAt(JsonField.of(paidAt))

            /**
             * Sets [Builder.paidAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paidAt] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun paidAt(paidAt: JsonField<Long>) = apply { this.paidAt = paidAt }

            fun payoutQueuedAt(payoutQueuedAt: Long) = payoutQueuedAt(JsonField.of(payoutQueuedAt))

            /**
             * Sets [Builder.payoutQueuedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payoutQueuedAt] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payoutQueuedAt(payoutQueuedAt: JsonField<Long>) = apply {
                this.payoutQueuedAt = payoutQueuedAt
            }

            fun provider(provider: String?) = provider(JsonField.ofNullable(provider))

            /** Alias for calling [Builder.provider] with `provider.orElse(null)`. */
            fun provider(provider: Optional<String>) = provider(provider.getOrNull())

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<String>) = apply { this.provider = provider }

            fun reversedAt(reversedAt: Long) = reversedAt(JsonField.of(reversedAt))

            /**
             * Sets [Builder.reversedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reversedAt] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reversedAt(reversedAt: JsonField<Long>) = apply { this.reversedAt = reversedAt }

            fun saleAmountInCampaignCurrency(saleAmountInCampaignCurrency: Long?) =
                saleAmountInCampaignCurrency(JsonField.ofNullable(saleAmountInCampaignCurrency))

            /**
             * Alias for [Builder.saleAmountInCampaignCurrency].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun saleAmountInCampaignCurrency(saleAmountInCampaignCurrency: Long) =
                saleAmountInCampaignCurrency(saleAmountInCampaignCurrency as Long?)

            /**
             * Alias for calling [Builder.saleAmountInCampaignCurrency] with
             * `saleAmountInCampaignCurrency.orElse(null)`.
             */
            fun saleAmountInCampaignCurrency(saleAmountInCampaignCurrency: Optional<Long>) =
                saleAmountInCampaignCurrency(saleAmountInCampaignCurrency.getOrNull())

            /**
             * Sets [Builder.saleAmountInCampaignCurrency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.saleAmountInCampaignCurrency] with a well-typed
             * [Long] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun saleAmountInCampaignCurrency(saleAmountInCampaignCurrency: JsonField<Long>) =
                apply {
                    this.saleAmountInCampaignCurrency = saleAmountInCampaignCurrency
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
             * Returns an immutable instance of [Commission].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .amount()
             * .createdAt()
             * .currencyIso()
             * .referredId()
             * .referrerId()
             * .saleAmount()
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Commission =
                Commission(
                    checkRequired("id", id),
                    checkRequired("amount", amount),
                    checkRequired("createdAt", createdAt),
                    checkRequired("currencyIso", currencyIso),
                    checkRequired("referredId", referredId),
                    checkRequired("referrerId", referrerId),
                    checkRequired("saleAmount", saleAmount),
                    checkRequired("status", status),
                    amountInCampaignCurrency,
                    approvedAt,
                    campaignCurrencyIso,
                    exchangeRate,
                    exchangeRateAt,
                    fxError,
                    holdDuration,
                    paidAt,
                    payoutQueuedAt,
                    provider,
                    reversedAt,
                    saleAmountInCampaignCurrency,
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
        fun validate(): Commission = apply {
            if (validated) {
                return@apply
            }

            id()
            amount()
            createdAt()
            currencyIso()
            referredId()
            referrerId()
            saleAmount()
            status().validate()
            amountInCampaignCurrency()
            approvedAt()
            campaignCurrencyIso()
            exchangeRate()
            exchangeRateAt()
            fxError()
            holdDuration()
            paidAt()
            payoutQueuedAt()
            provider()
            reversedAt()
            saleAmountInCampaignCurrency()
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
                (if (amount.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (currencyIso.asKnown().isPresent) 1 else 0) +
                (if (referredId.asKnown().isPresent) 1 else 0) +
                (if (referrerId.asKnown().isPresent) 1 else 0) +
                (if (saleAmount.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (amountInCampaignCurrency.asKnown().isPresent) 1 else 0) +
                (if (approvedAt.asKnown().isPresent) 1 else 0) +
                (if (campaignCurrencyIso.asKnown().isPresent) 1 else 0) +
                (if (exchangeRate.asKnown().isPresent) 1 else 0) +
                (if (exchangeRateAt.asKnown().isPresent) 1 else 0) +
                (if (fxError.asKnown().isPresent) 1 else 0) +
                (if (holdDuration.asKnown().isPresent) 1 else 0) +
                (if (paidAt.asKnown().isPresent) 1 else 0) +
                (if (payoutQueuedAt.asKnown().isPresent) 1 else 0) +
                (if (provider.asKnown().isPresent) 1 else 0) +
                (if (reversedAt.asKnown().isPresent) 1 else 0) +
                (if (saleAmountInCampaignCurrency.asKnown().isPresent) 1 else 0)

        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val PENDING = of("PENDING")

                @JvmField val APPROVED = of("APPROVED")

                @JvmField val PAID = of("PAID")

                @JvmField val REVERSED = of("REVERSED")

                @JvmField val DELETED = of("DELETED")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                PENDING,
                APPROVED,
                PAID,
                REVERSED,
                DELETED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PENDING,
                APPROVED,
                PAID,
                REVERSED,
                DELETED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    PENDING -> Value.PENDING
                    APPROVED -> Value.APPROVED
                    PAID -> Value.PAID
                    REVERSED -> Value.REVERSED
                    DELETED -> Value.DELETED
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
                    PENDING -> Known.PENDING
                    APPROVED -> Known.APPROVED
                    PAID -> Known.PAID
                    REVERSED -> Known.REVERSED
                    DELETED -> Known.DELETED
                    else -> throw GrowsurfInvalidDataException("Unknown Status: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Commission &&
                id == other.id &&
                amount == other.amount &&
                createdAt == other.createdAt &&
                currencyIso == other.currencyIso &&
                referredId == other.referredId &&
                referrerId == other.referrerId &&
                saleAmount == other.saleAmount &&
                status == other.status &&
                amountInCampaignCurrency == other.amountInCampaignCurrency &&
                approvedAt == other.approvedAt &&
                campaignCurrencyIso == other.campaignCurrencyIso &&
                exchangeRate == other.exchangeRate &&
                exchangeRateAt == other.exchangeRateAt &&
                fxError == other.fxError &&
                holdDuration == other.holdDuration &&
                paidAt == other.paidAt &&
                payoutQueuedAt == other.payoutQueuedAt &&
                provider == other.provider &&
                reversedAt == other.reversedAt &&
                saleAmountInCampaignCurrency == other.saleAmountInCampaignCurrency &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                amount,
                createdAt,
                currencyIso,
                referredId,
                referrerId,
                saleAmount,
                status,
                amountInCampaignCurrency,
                approvedAt,
                campaignCurrencyIso,
                exchangeRate,
                exchangeRateAt,
                fxError,
                holdDuration,
                paidAt,
                payoutQueuedAt,
                provider,
                reversedAt,
                saleAmountInCampaignCurrency,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Commission{id=$id, amount=$amount, createdAt=$createdAt, currencyIso=$currencyIso, referredId=$referredId, referrerId=$referrerId, saleAmount=$saleAmount, status=$status, amountInCampaignCurrency=$amountInCampaignCurrency, approvedAt=$approvedAt, campaignCurrencyIso=$campaignCurrencyIso, exchangeRate=$exchangeRate, exchangeRateAt=$exchangeRateAt, fxError=$fxError, holdDuration=$holdDuration, paidAt=$paidAt, payoutQueuedAt=$payoutQueuedAt, provider=$provider, reversedAt=$reversedAt, saleAmountInCampaignCurrency=$saleAmountInCampaignCurrency, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParticipantCommissionList &&
            commissions == other.commissions &&
            limit == other.limit &&
            nextId == other.nextId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(commissions, limit, nextId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ParticipantCommissionList{commissions=$commissions, limit=$limit, nextId=$nextId, additionalProperties=$additionalProperties}"
}
