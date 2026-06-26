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

class ParticipantPayoutList
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val limit: JsonField<Long>,
    private val nextId: JsonField<String>,
    private val payouts: JsonField<List<Payout>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("nextId") @ExcludeMissing nextId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payouts") @ExcludeMissing payouts: JsonField<List<Payout>> = JsonMissing.of(),
    ) : this(limit, nextId, payouts, mutableMapOf())

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
    fun payouts(): List<Payout> = payouts.getRequired("payouts")

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
     * Returns the raw JSON value of [payouts].
     *
     * Unlike [payouts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payouts") @ExcludeMissing fun _payouts(): JsonField<List<Payout>> = payouts

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
         * Returns a mutable builder for constructing an instance of [ParticipantPayoutList].
         *
         * The following fields are required:
         * ```java
         * .limit()
         * .nextId()
         * .payouts()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ParticipantPayoutList]. */
    class Builder internal constructor() {

        private var limit: JsonField<Long>? = null
        private var nextId: JsonField<String>? = null
        private var payouts: JsonField<MutableList<Payout>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(participantPayoutList: ParticipantPayoutList) = apply {
            limit = participantPayoutList.limit
            nextId = participantPayoutList.nextId
            payouts = participantPayoutList.payouts.map { it.toMutableList() }
            additionalProperties = participantPayoutList.additionalProperties.toMutableMap()
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

        fun payouts(payouts: List<Payout>) = payouts(JsonField.of(payouts))

        /**
         * Sets [Builder.payouts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payouts] with a well-typed `List<Payout>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun payouts(payouts: JsonField<List<Payout>>) = apply {
            this.payouts = payouts.map { it.toMutableList() }
        }

        /**
         * Adds a single [Payout] to [payouts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPayout(payout: Payout) = apply {
            payouts =
                (payouts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("payouts", it).add(payout)
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
         * Returns an immutable instance of [ParticipantPayoutList].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .limit()
         * .nextId()
         * .payouts()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ParticipantPayoutList =
            ParticipantPayoutList(
                checkRequired("limit", limit),
                checkRequired("nextId", nextId),
                checkRequired("payouts", payouts).map { it.toImmutable() },
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
    fun validate(): ParticipantPayoutList = apply {
        if (validated) {
            return@apply
        }

        limit()
        nextId()
        payouts().forEach { it.validate() }
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
            (payouts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Payout
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val amount: JsonField<Long>,
        private val commissionIds: JsonField<List<String>>,
        private val createdAt: JsonField<Long>,
        private val currencyIso: JsonField<String>,
        private val participantId: JsonField<String>,
        private val status: JsonField<Status>,
        private val amountInCampaignCurrency: JsonField<Long>,
        private val campaignCurrencyIso: JsonField<String>,
        private val exchangeRate: JsonField<Double>,
        private val exchangeRateAt: JsonField<Long>,
        private val failedAt: JsonField<Long>,
        private val fxError: JsonField<String>,
        private val issuedAt: JsonField<Long>,
        private val provider: JsonField<String>,
        private val queuedAt: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("commissionIds")
            @ExcludeMissing
            commissionIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("currencyISO")
            @ExcludeMissing
            currencyIso: JsonField<String> = JsonMissing.of(),
            @JsonProperty("participantId")
            @ExcludeMissing
            participantId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("amountInCampaignCurrency")
            @ExcludeMissing
            amountInCampaignCurrency: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("campaignCurrencyISO")
            @ExcludeMissing
            campaignCurrencyIso: JsonField<String> = JsonMissing.of(),
            @JsonProperty("exchangeRate")
            @ExcludeMissing
            exchangeRate: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("exchangeRateAt")
            @ExcludeMissing
            exchangeRateAt: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("failedAt") @ExcludeMissing failedAt: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("fxError") @ExcludeMissing fxError: JsonField<String> = JsonMissing.of(),
            @JsonProperty("issuedAt") @ExcludeMissing issuedAt: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("provider")
            @ExcludeMissing
            provider: JsonField<String> = JsonMissing.of(),
            @JsonProperty("queuedAt") @ExcludeMissing queuedAt: JsonField<Long> = JsonMissing.of(),
        ) : this(
            id,
            amount,
            commissionIds,
            createdAt,
            currencyIso,
            participantId,
            status,
            amountInCampaignCurrency,
            campaignCurrencyIso,
            exchangeRate,
            exchangeRateAt,
            failedAt,
            fxError,
            issuedAt,
            provider,
            queuedAt,
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
        fun amount(): Long = amount.getRequired("amount")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun commissionIds(): List<String> = commissionIds.getRequired("commissionIds")

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
        fun participantId(): String = participantId.getRequired("participantId")

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
        fun failedAt(): Optional<Long> = failedAt.getOptional("failedAt")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fxError(): Optional<String> = fxError.getOptional("fxError")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun issuedAt(): Optional<Long> = issuedAt.getOptional("issuedAt")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun provider(): Optional<String> = provider.getOptional("provider")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun queuedAt(): Optional<Long> = queuedAt.getOptional("queuedAt")

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
         * Returns the raw JSON value of [commissionIds].
         *
         * Unlike [commissionIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("commissionIds")
        @ExcludeMissing
        fun _commissionIds(): JsonField<List<String>> = commissionIds

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
         * Returns the raw JSON value of [participantId].
         *
         * Unlike [participantId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("participantId")
        @ExcludeMissing
        fun _participantId(): JsonField<String> = participantId

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
         * Returns the raw JSON value of [failedAt].
         *
         * Unlike [failedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("failedAt") @ExcludeMissing fun _failedAt(): JsonField<Long> = failedAt

        /**
         * Returns the raw JSON value of [fxError].
         *
         * Unlike [fxError], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fxError") @ExcludeMissing fun _fxError(): JsonField<String> = fxError

        /**
         * Returns the raw JSON value of [issuedAt].
         *
         * Unlike [issuedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("issuedAt") @ExcludeMissing fun _issuedAt(): JsonField<Long> = issuedAt

        /**
         * Returns the raw JSON value of [provider].
         *
         * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

        /**
         * Returns the raw JSON value of [queuedAt].
         *
         * Unlike [queuedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("queuedAt") @ExcludeMissing fun _queuedAt(): JsonField<Long> = queuedAt

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
             * Returns a mutable builder for constructing an instance of [Payout].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .amount()
             * .commissionIds()
             * .createdAt()
             * .currencyIso()
             * .participantId()
             * .status()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Payout]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var commissionIds: JsonField<MutableList<String>>? = null
            private var createdAt: JsonField<Long>? = null
            private var currencyIso: JsonField<String>? = null
            private var participantId: JsonField<String>? = null
            private var status: JsonField<Status>? = null
            private var amountInCampaignCurrency: JsonField<Long> = JsonMissing.of()
            private var campaignCurrencyIso: JsonField<String> = JsonMissing.of()
            private var exchangeRate: JsonField<Double> = JsonMissing.of()
            private var exchangeRateAt: JsonField<Long> = JsonMissing.of()
            private var failedAt: JsonField<Long> = JsonMissing.of()
            private var fxError: JsonField<String> = JsonMissing.of()
            private var issuedAt: JsonField<Long> = JsonMissing.of()
            private var provider: JsonField<String> = JsonMissing.of()
            private var queuedAt: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(payout: Payout) = apply {
                id = payout.id
                amount = payout.amount
                commissionIds = payout.commissionIds.map { it.toMutableList() }
                createdAt = payout.createdAt
                currencyIso = payout.currencyIso
                participantId = payout.participantId
                status = payout.status
                amountInCampaignCurrency = payout.amountInCampaignCurrency
                campaignCurrencyIso = payout.campaignCurrencyIso
                exchangeRate = payout.exchangeRate
                exchangeRateAt = payout.exchangeRateAt
                failedAt = payout.failedAt
                fxError = payout.fxError
                issuedAt = payout.issuedAt
                provider = payout.provider
                queuedAt = payout.queuedAt
                additionalProperties = payout.additionalProperties.toMutableMap()
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

            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            fun commissionIds(commissionIds: List<String>) =
                commissionIds(JsonField.of(commissionIds))

            /**
             * Sets [Builder.commissionIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commissionIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun commissionIds(commissionIds: JsonField<List<String>>) = apply {
                this.commissionIds = commissionIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [commissionIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCommissionId(commissionId: String) = apply {
                commissionIds =
                    (commissionIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("commissionIds", it).add(commissionId)
                    }
            }

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

            fun participantId(participantId: String) = participantId(JsonField.of(participantId))

            /**
             * Sets [Builder.participantId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.participantId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun participantId(participantId: JsonField<String>) = apply {
                this.participantId = participantId
            }

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

            fun failedAt(failedAt: Long) = failedAt(JsonField.of(failedAt))

            /**
             * Sets [Builder.failedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.failedAt] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun failedAt(failedAt: JsonField<Long>) = apply { this.failedAt = failedAt }

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

            fun issuedAt(issuedAt: Long) = issuedAt(JsonField.of(issuedAt))

            /**
             * Sets [Builder.issuedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.issuedAt] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun issuedAt(issuedAt: JsonField<Long>) = apply { this.issuedAt = issuedAt }

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

            fun queuedAt(queuedAt: Long?) = queuedAt(JsonField.ofNullable(queuedAt))

            /**
             * Alias for [Builder.queuedAt].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun queuedAt(queuedAt: Long) = queuedAt(queuedAt as Long?)

            /** Alias for calling [Builder.queuedAt] with `queuedAt.orElse(null)`. */
            fun queuedAt(queuedAt: Optional<Long>) = queuedAt(queuedAt.getOrNull())

            /**
             * Sets [Builder.queuedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.queuedAt] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun queuedAt(queuedAt: JsonField<Long>) = apply { this.queuedAt = queuedAt }

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
             * Returns an immutable instance of [Payout].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .amount()
             * .commissionIds()
             * .createdAt()
             * .currencyIso()
             * .participantId()
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Payout =
                Payout(
                    checkRequired("id", id),
                    checkRequired("amount", amount),
                    checkRequired("commissionIds", commissionIds).map { it.toImmutable() },
                    checkRequired("createdAt", createdAt),
                    checkRequired("currencyIso", currencyIso),
                    checkRequired("participantId", participantId),
                    checkRequired("status", status),
                    amountInCampaignCurrency,
                    campaignCurrencyIso,
                    exchangeRate,
                    exchangeRateAt,
                    failedAt,
                    fxError,
                    issuedAt,
                    provider,
                    queuedAt,
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
        fun validate(): Payout = apply {
            if (validated) {
                return@apply
            }

            id()
            amount()
            commissionIds()
            createdAt()
            currencyIso()
            participantId()
            status().validate()
            amountInCampaignCurrency()
            campaignCurrencyIso()
            exchangeRate()
            exchangeRateAt()
            failedAt()
            fxError()
            issuedAt()
            provider()
            queuedAt()
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
                (commissionIds.asKnown().getOrNull()?.size ?: 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (currencyIso.asKnown().isPresent) 1 else 0) +
                (if (participantId.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (amountInCampaignCurrency.asKnown().isPresent) 1 else 0) +
                (if (campaignCurrencyIso.asKnown().isPresent) 1 else 0) +
                (if (exchangeRate.asKnown().isPresent) 1 else 0) +
                (if (exchangeRateAt.asKnown().isPresent) 1 else 0) +
                (if (failedAt.asKnown().isPresent) 1 else 0) +
                (if (fxError.asKnown().isPresent) 1 else 0) +
                (if (issuedAt.asKnown().isPresent) 1 else 0) +
                (if (provider.asKnown().isPresent) 1 else 0) +
                (if (queuedAt.asKnown().isPresent) 1 else 0)

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

                @JvmField val UPCOMING = of("UPCOMING")

                @JvmField val QUEUED = of("QUEUED")

                @JvmField val ISSUED = of("ISSUED")

                @JvmField val FAILED = of("FAILED")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                UPCOMING,
                QUEUED,
                ISSUED,
                FAILED,
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
                UPCOMING,
                QUEUED,
                ISSUED,
                FAILED,
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
                    UPCOMING -> Value.UPCOMING
                    QUEUED -> Value.QUEUED
                    ISSUED -> Value.ISSUED
                    FAILED -> Value.FAILED
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
                    UPCOMING -> Known.UPCOMING
                    QUEUED -> Known.QUEUED
                    ISSUED -> Known.ISSUED
                    FAILED -> Known.FAILED
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

            return other is Payout &&
                id == other.id &&
                amount == other.amount &&
                commissionIds == other.commissionIds &&
                createdAt == other.createdAt &&
                currencyIso == other.currencyIso &&
                participantId == other.participantId &&
                status == other.status &&
                amountInCampaignCurrency == other.amountInCampaignCurrency &&
                campaignCurrencyIso == other.campaignCurrencyIso &&
                exchangeRate == other.exchangeRate &&
                exchangeRateAt == other.exchangeRateAt &&
                failedAt == other.failedAt &&
                fxError == other.fxError &&
                issuedAt == other.issuedAt &&
                provider == other.provider &&
                queuedAt == other.queuedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                amount,
                commissionIds,
                createdAt,
                currencyIso,
                participantId,
                status,
                amountInCampaignCurrency,
                campaignCurrencyIso,
                exchangeRate,
                exchangeRateAt,
                failedAt,
                fxError,
                issuedAt,
                provider,
                queuedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Payout{id=$id, amount=$amount, commissionIds=$commissionIds, createdAt=$createdAt, currencyIso=$currencyIso, participantId=$participantId, status=$status, amountInCampaignCurrency=$amountInCampaignCurrency, campaignCurrencyIso=$campaignCurrencyIso, exchangeRate=$exchangeRate, exchangeRateAt=$exchangeRateAt, failedAt=$failedAt, fxError=$fxError, issuedAt=$issuedAt, provider=$provider, queuedAt=$queuedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParticipantPayoutList &&
            limit == other.limit &&
            nextId == other.nextId &&
            payouts == other.payouts &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(limit, nextId, payouts, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ParticipantPayoutList{limit=$limit, nextId=$nextId, payouts=$payouts, additionalProperties=$additionalProperties}"
}
