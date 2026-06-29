// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.growsurf.api.core.Enum
import com.growsurf.api.core.ExcludeMissing
import com.growsurf.api.core.JsonField
import com.growsurf.api.core.JsonMissing
import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.Params
import com.growsurf.api.core.checkRequired
import com.growsurf.api.core.http.Headers
import com.growsurf.api.core.http.QueryParams
import com.growsurf.api.errors.GrowsurfInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Records an amendment (refund, partial refund, refund cancellation, or chargeback) against a
 * previously recorded transaction and reverses or adjusts the referrer's commission. The inverse of
 * Record Affiliate Transaction.
 */
class ParticipantRefundTransactionParams
private constructor(
    private val id: String,
    private val participantIdOrEmail: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String = id

    fun participantIdOrEmail(): Optional<String> = Optional.ofNullable(participantIdOrEmail)

    /**
     * REFUND covers full refunds, partial refunds, and refund cancellations; CHARGEBACK is always a
     * full reversal.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amendmentType(): Optional<AmendmentType> = body.amendmentType()

    /**
     * Original sale gross (minor units). Optional — the value stored when the transaction was
     * recorded is used when available; only needed for partial refunds of older records.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amount(): Optional<Long> = body.amount()

    /**
     * Cumulative amount refunded so far, in the currency's minor unit. Omit for a full refund. For
     * a partial refund send the running total, not the per-refund delta.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amountRefunded(): Optional<Long> = body.amountRefunded()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun chargeId(): Optional<String> = body.chargeId()

    /**
     * 3-letter ISO currency. Optional — resolved from the original commission when available.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currency(): Optional<String> = body.currency()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalId(): Optional<String> = body.externalId()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invoiceId(): Optional<String> = body.invoiceId()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun orderId(): Optional<String> = body.orderId()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun paymentId(): Optional<String> = body.paymentId()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun paymentIntentId(): Optional<String> = body.paymentIntentId()

    /**
     * The per-refund delta (minor units). Optional bookkeeping field.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun refundAmount(): Optional<Long> = body.refundAmount()

    /**
     * Stable per-refund identifier. Recommended for partial refunds so repeated calls stay
     * idempotent.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun refundId(): Optional<String> = body.refundId()

    /**
     * Refund status. Send "canceled" with a lowered amountRefunded to restore a previously reduced
     * commission.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun refundStatus(): Optional<String> = body.refundStatus()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transactionId(): Optional<String> = body.transactionId()

    /**
     * Returns the raw JSON value of [amendmentType].
     *
     * Unlike [amendmentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amendmentType(): JsonField<AmendmentType> = body._amendmentType()

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amount(): JsonField<Long> = body._amount()

    /**
     * Returns the raw JSON value of [amountRefunded].
     *
     * Unlike [amountRefunded], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amountRefunded(): JsonField<Long> = body._amountRefunded()

    /**
     * Returns the raw JSON value of [chargeId].
     *
     * Unlike [chargeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _chargeId(): JsonField<String> = body._chargeId()

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currency(): JsonField<String> = body._currency()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _externalId(): JsonField<String> = body._externalId()

    /**
     * Returns the raw JSON value of [invoiceId].
     *
     * Unlike [invoiceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _invoiceId(): JsonField<String> = body._invoiceId()

    /**
     * Returns the raw JSON value of [orderId].
     *
     * Unlike [orderId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _orderId(): JsonField<String> = body._orderId()

    /**
     * Returns the raw JSON value of [paymentId].
     *
     * Unlike [paymentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _paymentId(): JsonField<String> = body._paymentId()

    /**
     * Returns the raw JSON value of [paymentIntentId].
     *
     * Unlike [paymentIntentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _paymentIntentId(): JsonField<String> = body._paymentIntentId()

    /**
     * Returns the raw JSON value of [refundAmount].
     *
     * Unlike [refundAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _refundAmount(): JsonField<Long> = body._refundAmount()

    /**
     * Returns the raw JSON value of [refundId].
     *
     * Unlike [refundId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _refundId(): JsonField<String> = body._refundId()

    /**
     * Returns the raw JSON value of [refundStatus].
     *
     * Unlike [refundStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _refundStatus(): JsonField<String> = body._refundStatus()

    /**
     * Returns the raw JSON value of [transactionId].
     *
     * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _transactionId(): JsonField<String> = body._transactionId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ParticipantRefundTransactionParams].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ParticipantRefundTransactionParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var participantIdOrEmail: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(participantRefundTransactionParams: ParticipantRefundTransactionParams) =
            apply {
                id = participantRefundTransactionParams.id
                participantIdOrEmail = participantRefundTransactionParams.participantIdOrEmail
                body = participantRefundTransactionParams.body.toBuilder()
                additionalHeaders = participantRefundTransactionParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    participantRefundTransactionParams.additionalQueryParams.toBuilder()
            }

        fun id(id: String) = apply { this.id = id }

        fun participantIdOrEmail(participantIdOrEmail: String?) = apply {
            this.participantIdOrEmail = participantIdOrEmail
        }

        /**
         * Alias for calling [Builder.participantIdOrEmail] with
         * `participantIdOrEmail.orElse(null)`.
         */
        fun participantIdOrEmail(participantIdOrEmail: Optional<String>) =
            participantIdOrEmail(participantIdOrEmail.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [amendmentType]
         * - [amount]
         * - [amountRefunded]
         * - [chargeId]
         * - [currency]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * REFUND covers full refunds, partial refunds, and refund cancellations; CHARGEBACK is
         * always a full reversal.
         */
        fun amendmentType(amendmentType: AmendmentType) = apply {
            body.amendmentType(amendmentType)
        }

        /**
         * Sets [Builder.amendmentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amendmentType] with a well-typed [AmendmentType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun amendmentType(amendmentType: JsonField<AmendmentType>) = apply {
            body.amendmentType(amendmentType)
        }

        /**
         * Original sale gross (minor units). Optional — the value stored when the transaction was
         * recorded is used when available; only needed for partial refunds of older records.
         */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /**
         * Cumulative amount refunded so far, in the currency's minor unit. Omit for a full refund.
         * For a partial refund send the running total, not the per-refund delta.
         */
        fun amountRefunded(amountRefunded: Long) = apply { body.amountRefunded(amountRefunded) }

        /**
         * Sets [Builder.amountRefunded] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountRefunded] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun amountRefunded(amountRefunded: JsonField<Long>) = apply {
            body.amountRefunded(amountRefunded)
        }

        fun chargeId(chargeId: String) = apply { body.chargeId(chargeId) }

        /**
         * Sets [Builder.chargeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chargeId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun chargeId(chargeId: JsonField<String>) = apply { body.chargeId(chargeId) }

        /**
         * 3-letter ISO currency. Optional — resolved from the original commission when available.
         */
        fun currency(currency: String) = apply { body.currency(currency) }

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { body.currency(currency) }

        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        fun externalId(externalId: String) = apply { body.externalId(externalId) }

        /**
         * Sets [Builder.externalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun externalId(externalId: JsonField<String>) = apply { body.externalId(externalId) }

        fun invoiceId(invoiceId: String) = apply { body.invoiceId(invoiceId) }

        /**
         * Sets [Builder.invoiceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun invoiceId(invoiceId: JsonField<String>) = apply { body.invoiceId(invoiceId) }

        fun orderId(orderId: String) = apply { body.orderId(orderId) }

        /**
         * Sets [Builder.orderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orderId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun orderId(orderId: JsonField<String>) = apply { body.orderId(orderId) }

        fun paymentId(paymentId: String) = apply { body.paymentId(paymentId) }

        /**
         * Sets [Builder.paymentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun paymentId(paymentId: JsonField<String>) = apply { body.paymentId(paymentId) }

        fun paymentIntentId(paymentIntentId: String) = apply {
            body.paymentIntentId(paymentIntentId)
        }

        /**
         * Sets [Builder.paymentIntentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentIntentId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun paymentIntentId(paymentIntentId: JsonField<String>) = apply {
            body.paymentIntentId(paymentIntentId)
        }

        /** The per-refund delta (minor units). Optional bookkeeping field. */
        fun refundAmount(refundAmount: Long) = apply { body.refundAmount(refundAmount) }

        /**
         * Sets [Builder.refundAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refundAmount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun refundAmount(refundAmount: JsonField<Long>) = apply { body.refundAmount(refundAmount) }

        /**
         * Stable per-refund identifier. Recommended for partial refunds so repeated calls stay
         * idempotent.
         */
        fun refundId(refundId: String) = apply { body.refundId(refundId) }

        /**
         * Sets [Builder.refundId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refundId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun refundId(refundId: JsonField<String>) = apply { body.refundId(refundId) }

        /**
         * Refund status. Send "canceled" with a lowered amountRefunded to restore a previously
         * reduced commission.
         */
        fun refundStatus(refundStatus: String) = apply { body.refundStatus(refundStatus) }

        /**
         * Sets [Builder.refundStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refundStatus] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun refundStatus(refundStatus: JsonField<String>) = apply {
            body.refundStatus(refundStatus)
        }

        fun transactionId(transactionId: String) = apply { body.transactionId(transactionId) }

        /**
         * Sets [Builder.transactionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun transactionId(transactionId: JsonField<String>) = apply {
            body.transactionId(transactionId)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ParticipantRefundTransactionParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ParticipantRefundTransactionParams =
            ParticipantRefundTransactionParams(
                checkRequired("id", id),
                participantIdOrEmail,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id
            1 -> participantIdOrEmail ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amendmentType: JsonField<AmendmentType>,
        private val amount: JsonField<Long>,
        private val amountRefunded: JsonField<Long>,
        private val chargeId: JsonField<String>,
        private val currency: JsonField<String>,
        private val description: JsonField<String>,
        private val externalId: JsonField<String>,
        private val invoiceId: JsonField<String>,
        private val orderId: JsonField<String>,
        private val paymentId: JsonField<String>,
        private val paymentIntentId: JsonField<String>,
        private val refundAmount: JsonField<Long>,
        private val refundId: JsonField<String>,
        private val refundStatus: JsonField<String>,
        private val transactionId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amendmentType")
            @ExcludeMissing
            amendmentType: JsonField<AmendmentType> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("amountRefunded")
            @ExcludeMissing
            amountRefunded: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("chargeId")
            @ExcludeMissing
            chargeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("externalId")
            @ExcludeMissing
            externalId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("invoiceId")
            @ExcludeMissing
            invoiceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("orderId") @ExcludeMissing orderId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("paymentId")
            @ExcludeMissing
            paymentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("paymentIntentId")
            @ExcludeMissing
            paymentIntentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("refundAmount")
            @ExcludeMissing
            refundAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("refundId")
            @ExcludeMissing
            refundId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("refundStatus")
            @ExcludeMissing
            refundStatus: JsonField<String> = JsonMissing.of(),
            @JsonProperty("transactionId")
            @ExcludeMissing
            transactionId: JsonField<String> = JsonMissing.of(),
        ) : this(
            amendmentType,
            amount,
            amountRefunded,
            chargeId,
            currency,
            description,
            externalId,
            invoiceId,
            orderId,
            paymentId,
            paymentIntentId,
            refundAmount,
            refundId,
            refundStatus,
            transactionId,
            mutableMapOf(),
        )

        /**
         * REFUND covers full refunds, partial refunds, and refund cancellations; CHARGEBACK is
         * always a full reversal.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun amendmentType(): Optional<AmendmentType> = amendmentType.getOptional("amendmentType")

        /**
         * Original sale gross (minor units). Optional — the value stored when the transaction was
         * recorded is used when available; only needed for partial refunds of older records.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun amount(): Optional<Long> = amount.getOptional("amount")

        /**
         * Cumulative amount refunded so far, in the currency's minor unit. Omit for a full refund.
         * For a partial refund send the running total, not the per-refund delta.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun amountRefunded(): Optional<Long> = amountRefunded.getOptional("amountRefunded")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun chargeId(): Optional<String> = chargeId.getOptional("chargeId")

        /**
         * 3-letter ISO currency. Optional — resolved from the original commission when available.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun currency(): Optional<String> = currency.getOptional("currency")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun externalId(): Optional<String> = externalId.getOptional("externalId")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun invoiceId(): Optional<String> = invoiceId.getOptional("invoiceId")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun orderId(): Optional<String> = orderId.getOptional("orderId")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun paymentId(): Optional<String> = paymentId.getOptional("paymentId")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun paymentIntentId(): Optional<String> = paymentIntentId.getOptional("paymentIntentId")

        /**
         * The per-refund delta (minor units). Optional bookkeeping field.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun refundAmount(): Optional<Long> = refundAmount.getOptional("refundAmount")

        /**
         * Stable per-refund identifier. Recommended for partial refunds so repeated calls stay
         * idempotent.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun refundId(): Optional<String> = refundId.getOptional("refundId")

        /**
         * Refund status. Send "canceled" with a lowered amountRefunded to restore a previously
         * reduced commission.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun refundStatus(): Optional<String> = refundStatus.getOptional("refundStatus")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun transactionId(): Optional<String> = transactionId.getOptional("transactionId")

        /**
         * Returns the raw JSON value of [amendmentType].
         *
         * Unlike [amendmentType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("amendmentType")
        @ExcludeMissing
        fun _amendmentType(): JsonField<AmendmentType> = amendmentType

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [amountRefunded].
         *
         * Unlike [amountRefunded], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("amountRefunded")
        @ExcludeMissing
        fun _amountRefunded(): JsonField<Long> = amountRefunded

        /**
         * Returns the raw JSON value of [chargeId].
         *
         * Unlike [chargeId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("chargeId") @ExcludeMissing fun _chargeId(): JsonField<String> = chargeId

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [externalId].
         *
         * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("externalId")
        @ExcludeMissing
        fun _externalId(): JsonField<String> = externalId

        /**
         * Returns the raw JSON value of [invoiceId].
         *
         * Unlike [invoiceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("invoiceId") @ExcludeMissing fun _invoiceId(): JsonField<String> = invoiceId

        /**
         * Returns the raw JSON value of [orderId].
         *
         * Unlike [orderId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("orderId") @ExcludeMissing fun _orderId(): JsonField<String> = orderId

        /**
         * Returns the raw JSON value of [paymentId].
         *
         * Unlike [paymentId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("paymentId") @ExcludeMissing fun _paymentId(): JsonField<String> = paymentId

        /**
         * Returns the raw JSON value of [paymentIntentId].
         *
         * Unlike [paymentIntentId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("paymentIntentId")
        @ExcludeMissing
        fun _paymentIntentId(): JsonField<String> = paymentIntentId

        /**
         * Returns the raw JSON value of [refundAmount].
         *
         * Unlike [refundAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("refundAmount")
        @ExcludeMissing
        fun _refundAmount(): JsonField<Long> = refundAmount

        /**
         * Returns the raw JSON value of [refundId].
         *
         * Unlike [refundId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("refundId") @ExcludeMissing fun _refundId(): JsonField<String> = refundId

        /**
         * Returns the raw JSON value of [refundStatus].
         *
         * Unlike [refundStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("refundStatus")
        @ExcludeMissing
        fun _refundStatus(): JsonField<String> = refundStatus

        /**
         * Returns the raw JSON value of [transactionId].
         *
         * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transactionId")
        @ExcludeMissing
        fun _transactionId(): JsonField<String> = transactionId

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var amendmentType: JsonField<AmendmentType> = JsonMissing.of()
            private var amount: JsonField<Long> = JsonMissing.of()
            private var amountRefunded: JsonField<Long> = JsonMissing.of()
            private var chargeId: JsonField<String> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var externalId: JsonField<String> = JsonMissing.of()
            private var invoiceId: JsonField<String> = JsonMissing.of()
            private var orderId: JsonField<String> = JsonMissing.of()
            private var paymentId: JsonField<String> = JsonMissing.of()
            private var paymentIntentId: JsonField<String> = JsonMissing.of()
            private var refundAmount: JsonField<Long> = JsonMissing.of()
            private var refundId: JsonField<String> = JsonMissing.of()
            private var refundStatus: JsonField<String> = JsonMissing.of()
            private var transactionId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                amendmentType = body.amendmentType
                amount = body.amount
                amountRefunded = body.amountRefunded
                chargeId = body.chargeId
                currency = body.currency
                description = body.description
                externalId = body.externalId
                invoiceId = body.invoiceId
                orderId = body.orderId
                paymentId = body.paymentId
                paymentIntentId = body.paymentIntentId
                refundAmount = body.refundAmount
                refundId = body.refundId
                refundStatus = body.refundStatus
                transactionId = body.transactionId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * REFUND covers full refunds, partial refunds, and refund cancellations; CHARGEBACK is
             * always a full reversal.
             */
            fun amendmentType(amendmentType: AmendmentType) =
                amendmentType(JsonField.of(amendmentType))

            /**
             * Sets [Builder.amendmentType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amendmentType] with a well-typed [AmendmentType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun amendmentType(amendmentType: JsonField<AmendmentType>) = apply {
                this.amendmentType = amendmentType
            }

            /**
             * Original sale gross (minor units). Optional — the value stored when the transaction
             * was recorded is used when available; only needed for partial refunds of older
             * records.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /**
             * Cumulative amount refunded so far, in the currency's minor unit. Omit for a full
             * refund. For a partial refund send the running total, not the per-refund delta.
             */
            fun amountRefunded(amountRefunded: Long) = amountRefunded(JsonField.of(amountRefunded))

            /**
             * Sets [Builder.amountRefunded] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountRefunded] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amountRefunded(amountRefunded: JsonField<Long>) = apply {
                this.amountRefunded = amountRefunded
            }

            fun chargeId(chargeId: String) = chargeId(JsonField.of(chargeId))

            /**
             * Sets [Builder.chargeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chargeId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chargeId(chargeId: JsonField<String>) = apply { this.chargeId = chargeId }

            /**
             * 3-letter ISO currency. Optional — resolved from the original commission when
             * available.
             */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun description(description: String) = description(JsonField.of(description))

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

            fun externalId(externalId: String) = externalId(JsonField.of(externalId))

            /**
             * Sets [Builder.externalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

            fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

            /**
             * Sets [Builder.invoiceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoiceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

            fun orderId(orderId: String) = orderId(JsonField.of(orderId))

            /**
             * Sets [Builder.orderId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.orderId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun orderId(orderId: JsonField<String>) = apply { this.orderId = orderId }

            fun paymentId(paymentId: String) = paymentId(JsonField.of(paymentId))

            /**
             * Sets [Builder.paymentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

            fun paymentIntentId(paymentIntentId: String) =
                paymentIntentId(JsonField.of(paymentIntentId))

            /**
             * Sets [Builder.paymentIntentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentIntentId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paymentIntentId(paymentIntentId: JsonField<String>) = apply {
                this.paymentIntentId = paymentIntentId
            }

            /** The per-refund delta (minor units). Optional bookkeeping field. */
            fun refundAmount(refundAmount: Long) = refundAmount(JsonField.of(refundAmount))

            /**
             * Sets [Builder.refundAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refundAmount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun refundAmount(refundAmount: JsonField<Long>) = apply {
                this.refundAmount = refundAmount
            }

            /**
             * Stable per-refund identifier. Recommended for partial refunds so repeated calls stay
             * idempotent.
             */
            fun refundId(refundId: String) = refundId(JsonField.of(refundId))

            /**
             * Sets [Builder.refundId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refundId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun refundId(refundId: JsonField<String>) = apply { this.refundId = refundId }

            /**
             * Refund status. Send "canceled" with a lowered amountRefunded to restore a previously
             * reduced commission.
             */
            fun refundStatus(refundStatus: String) = refundStatus(JsonField.of(refundStatus))

            /**
             * Sets [Builder.refundStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refundStatus] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun refundStatus(refundStatus: JsonField<String>) = apply {
                this.refundStatus = refundStatus
            }

            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /**
             * Sets [Builder.transactionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transactionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    amendmentType,
                    amount,
                    amountRefunded,
                    chargeId,
                    currency,
                    description,
                    externalId,
                    invoiceId,
                    orderId,
                    paymentId,
                    paymentIntentId,
                    refundAmount,
                    refundId,
                    refundStatus,
                    transactionId,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            amendmentType().ifPresent { it.validate() }
            amount()
            amountRefunded()
            chargeId()
            currency()
            description()
            externalId()
            invoiceId()
            orderId()
            paymentId()
            paymentIntentId()
            refundAmount()
            refundId()
            refundStatus()
            transactionId()
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
            (amendmentType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (amount.asKnown().isPresent) 1 else 0) +
                (if (amountRefunded.asKnown().isPresent) 1 else 0) +
                (if (chargeId.asKnown().isPresent) 1 else 0) +
                (if (currency.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (externalId.asKnown().isPresent) 1 else 0) +
                (if (invoiceId.asKnown().isPresent) 1 else 0) +
                (if (orderId.asKnown().isPresent) 1 else 0) +
                (if (paymentId.asKnown().isPresent) 1 else 0) +
                (if (paymentIntentId.asKnown().isPresent) 1 else 0) +
                (if (refundAmount.asKnown().isPresent) 1 else 0) +
                (if (refundId.asKnown().isPresent) 1 else 0) +
                (if (refundStatus.asKnown().isPresent) 1 else 0) +
                (if (transactionId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                amendmentType == other.amendmentType &&
                amount == other.amount &&
                amountRefunded == other.amountRefunded &&
                chargeId == other.chargeId &&
                currency == other.currency &&
                description == other.description &&
                externalId == other.externalId &&
                invoiceId == other.invoiceId &&
                orderId == other.orderId &&
                paymentId == other.paymentId &&
                paymentIntentId == other.paymentIntentId &&
                refundAmount == other.refundAmount &&
                refundId == other.refundId &&
                refundStatus == other.refundStatus &&
                transactionId == other.transactionId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                amendmentType,
                amount,
                amountRefunded,
                chargeId,
                currency,
                description,
                externalId,
                invoiceId,
                orderId,
                paymentId,
                paymentIntentId,
                refundAmount,
                refundId,
                refundStatus,
                transactionId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{amendmentType=$amendmentType, amount=$amount, amountRefunded=$amountRefunded, chargeId=$chargeId, currency=$currency, description=$description, externalId=$externalId, invoiceId=$invoiceId, orderId=$orderId, paymentId=$paymentId, paymentIntentId=$paymentIntentId, refundAmount=$refundAmount, refundId=$refundId, refundStatus=$refundStatus, transactionId=$transactionId, additionalProperties=$additionalProperties}"
    }

    /**
     * REFUND covers full refunds, partial refunds, and refund cancellations; CHARGEBACK is always a
     * full reversal.
     */
    class AmendmentType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val REFUND = of("REFUND")

            @JvmField val CHARGEBACK = of("CHARGEBACK")

            @JvmStatic fun of(value: String) = AmendmentType(JsonField.of(value))
        }

        /** An enum containing [AmendmentType]'s known values. */
        enum class Known {
            REFUND,
            CHARGEBACK,
        }

        /**
         * An enum containing [AmendmentType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AmendmentType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            REFUND,
            CHARGEBACK,
            /**
             * An enum member indicating that [AmendmentType] was instantiated with an unknown
             * value.
             */
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
                REFUND -> Value.REFUND
                CHARGEBACK -> Value.CHARGEBACK
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
                REFUND -> Known.REFUND
                CHARGEBACK -> Known.CHARGEBACK
                else -> throw GrowsurfInvalidDataException("Unknown AmendmentType: $value")
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
        fun validate(): AmendmentType = apply {
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

            return other is AmendmentType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParticipantRefundTransactionParams &&
            id == other.id &&
            participantIdOrEmail == other.participantIdOrEmail &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, participantIdOrEmail, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ParticipantRefundTransactionParams{id=$id, participantIdOrEmail=$participantIdOrEmail, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
