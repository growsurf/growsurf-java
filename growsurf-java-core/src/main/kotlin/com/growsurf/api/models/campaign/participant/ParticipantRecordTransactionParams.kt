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
import com.growsurf.api.core.Params
import com.growsurf.api.core.checkKnown
import com.growsurf.api.core.checkRequired
import com.growsurf.api.core.http.Headers
import com.growsurf.api.core.http.QueryParams
import com.growsurf.api.core.toImmutable
import com.growsurf.api.errors.GrowsurfInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Records a sale made by a referred customer and generates affiliate commissions for their referrer
 * when applicable.
 */
class ParticipantRecordTransactionParams
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
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = body.currency()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun grossAmount(): Long = body.grossAmount()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amountCashNet(): Optional<Long> = body.amountCashNet()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amountPaid(): Optional<Long> = body.amountPaid()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun chargeId(): Optional<String> = body.chargeId()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerId(): Optional<String> = body.customerId()

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
    fun invoiceSubtotalExcludingTax(): Optional<Long> = body.invoiceSubtotalExcludingTax()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invoiceTotal(): Optional<Long> = body.invoiceTotal()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invoiceTotalExcludingTax(): Optional<Long> = body.invoiceTotalExcludingTax()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netAmount(): Optional<Long> = body.netAmount()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun orderId(): Optional<String> = body.orderId()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun paidAt(): Optional<Long> = body.paidAt()

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
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subscriptionId(): Optional<String> = body.subscriptionId()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun taxAmount(): Optional<Long> = body.taxAmount()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalTaxAmount(): Optional<Long> = body.totalTaxAmount()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalTaxAmounts(): Optional<List<TotalTaxAmount>> = body.totalTaxAmounts()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalTaxes(): Optional<List<TotalTax>> = body.totalTaxes()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transactionId(): Optional<String> = body.transactionId()

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currency(): JsonField<String> = body._currency()

    /**
     * Returns the raw JSON value of [grossAmount].
     *
     * Unlike [grossAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _grossAmount(): JsonField<Long> = body._grossAmount()

    /**
     * Returns the raw JSON value of [amountCashNet].
     *
     * Unlike [amountCashNet], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amountCashNet(): JsonField<Long> = body._amountCashNet()

    /**
     * Returns the raw JSON value of [amountPaid].
     *
     * Unlike [amountPaid], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amountPaid(): JsonField<Long> = body._amountPaid()

    /**
     * Returns the raw JSON value of [chargeId].
     *
     * Unlike [chargeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _chargeId(): JsonField<String> = body._chargeId()

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerId(): JsonField<String> = body._customerId()

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
     * Returns the raw JSON value of [invoiceSubtotalExcludingTax].
     *
     * Unlike [invoiceSubtotalExcludingTax], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _invoiceSubtotalExcludingTax(): JsonField<Long> = body._invoiceSubtotalExcludingTax()

    /**
     * Returns the raw JSON value of [invoiceTotal].
     *
     * Unlike [invoiceTotal], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _invoiceTotal(): JsonField<Long> = body._invoiceTotal()

    /**
     * Returns the raw JSON value of [invoiceTotalExcludingTax].
     *
     * Unlike [invoiceTotalExcludingTax], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _invoiceTotalExcludingTax(): JsonField<Long> = body._invoiceTotalExcludingTax()

    /**
     * Returns the raw JSON value of [netAmount].
     *
     * Unlike [netAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _netAmount(): JsonField<Long> = body._netAmount()

    /**
     * Returns the raw JSON value of [orderId].
     *
     * Unlike [orderId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _orderId(): JsonField<String> = body._orderId()

    /**
     * Returns the raw JSON value of [paidAt].
     *
     * Unlike [paidAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _paidAt(): JsonField<Long> = body._paidAt()

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
     * Returns the raw JSON value of [subscriptionId].
     *
     * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _subscriptionId(): JsonField<String> = body._subscriptionId()

    /**
     * Returns the raw JSON value of [taxAmount].
     *
     * Unlike [taxAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _taxAmount(): JsonField<Long> = body._taxAmount()

    /**
     * Returns the raw JSON value of [totalTaxAmount].
     *
     * Unlike [totalTaxAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _totalTaxAmount(): JsonField<Long> = body._totalTaxAmount()

    /**
     * Returns the raw JSON value of [totalTaxAmounts].
     *
     * Unlike [totalTaxAmounts], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _totalTaxAmounts(): JsonField<List<TotalTaxAmount>> = body._totalTaxAmounts()

    /**
     * Returns the raw JSON value of [totalTaxes].
     *
     * Unlike [totalTaxes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _totalTaxes(): JsonField<List<TotalTax>> = body._totalTaxes()

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
         * [ParticipantRecordTransactionParams].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .currency()
         * .grossAmount()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ParticipantRecordTransactionParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var participantIdOrEmail: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(participantRecordTransactionParams: ParticipantRecordTransactionParams) =
            apply {
                id = participantRecordTransactionParams.id
                participantIdOrEmail = participantRecordTransactionParams.participantIdOrEmail
                body = participantRecordTransactionParams.body.toBuilder()
                additionalHeaders = participantRecordTransactionParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    participantRecordTransactionParams.additionalQueryParams.toBuilder()
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
         * - [currency]
         * - [grossAmount]
         * - [amountCashNet]
         * - [amountPaid]
         * - [chargeId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun currency(currency: String) = apply { body.currency(currency) }

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { body.currency(currency) }

        fun grossAmount(grossAmount: Long) = apply { body.grossAmount(grossAmount) }

        /**
         * Sets [Builder.grossAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.grossAmount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun grossAmount(grossAmount: JsonField<Long>) = apply { body.grossAmount(grossAmount) }

        fun amountCashNet(amountCashNet: Long) = apply { body.amountCashNet(amountCashNet) }

        /**
         * Sets [Builder.amountCashNet] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountCashNet] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun amountCashNet(amountCashNet: JsonField<Long>) = apply {
            body.amountCashNet(amountCashNet)
        }

        fun amountPaid(amountPaid: Long) = apply { body.amountPaid(amountPaid) }

        /**
         * Sets [Builder.amountPaid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountPaid] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amountPaid(amountPaid: JsonField<Long>) = apply { body.amountPaid(amountPaid) }

        fun chargeId(chargeId: String) = apply { body.chargeId(chargeId) }

        /**
         * Sets [Builder.chargeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chargeId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun chargeId(chargeId: JsonField<String>) = apply { body.chargeId(chargeId) }

        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

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

        fun invoiceSubtotalExcludingTax(invoiceSubtotalExcludingTax: Long) = apply {
            body.invoiceSubtotalExcludingTax(invoiceSubtotalExcludingTax)
        }

        /**
         * Sets [Builder.invoiceSubtotalExcludingTax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceSubtotalExcludingTax] with a well-typed [Long]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun invoiceSubtotalExcludingTax(invoiceSubtotalExcludingTax: JsonField<Long>) = apply {
            body.invoiceSubtotalExcludingTax(invoiceSubtotalExcludingTax)
        }

        fun invoiceTotal(invoiceTotal: Long) = apply { body.invoiceTotal(invoiceTotal) }

        /**
         * Sets [Builder.invoiceTotal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceTotal] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun invoiceTotal(invoiceTotal: JsonField<Long>) = apply { body.invoiceTotal(invoiceTotal) }

        fun invoiceTotalExcludingTax(invoiceTotalExcludingTax: Long) = apply {
            body.invoiceTotalExcludingTax(invoiceTotalExcludingTax)
        }

        /**
         * Sets [Builder.invoiceTotalExcludingTax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceTotalExcludingTax] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun invoiceTotalExcludingTax(invoiceTotalExcludingTax: JsonField<Long>) = apply {
            body.invoiceTotalExcludingTax(invoiceTotalExcludingTax)
        }

        fun netAmount(netAmount: Long) = apply { body.netAmount(netAmount) }

        /**
         * Sets [Builder.netAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netAmount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun netAmount(netAmount: JsonField<Long>) = apply { body.netAmount(netAmount) }

        fun orderId(orderId: String) = apply { body.orderId(orderId) }

        /**
         * Sets [Builder.orderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orderId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun orderId(orderId: JsonField<String>) = apply { body.orderId(orderId) }

        fun paidAt(paidAt: Long) = apply { body.paidAt(paidAt) }

        /**
         * Sets [Builder.paidAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paidAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun paidAt(paidAt: JsonField<Long>) = apply { body.paidAt(paidAt) }

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

        fun subscriptionId(subscriptionId: String) = apply { body.subscriptionId(subscriptionId) }

        /**
         * Sets [Builder.subscriptionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriptionId(subscriptionId: JsonField<String>) = apply {
            body.subscriptionId(subscriptionId)
        }

        fun taxAmount(taxAmount: Long) = apply { body.taxAmount(taxAmount) }

        /**
         * Sets [Builder.taxAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxAmount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun taxAmount(taxAmount: JsonField<Long>) = apply { body.taxAmount(taxAmount) }

        fun totalTaxAmount(totalTaxAmount: Long) = apply { body.totalTaxAmount(totalTaxAmount) }

        /**
         * Sets [Builder.totalTaxAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalTaxAmount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalTaxAmount(totalTaxAmount: JsonField<Long>) = apply {
            body.totalTaxAmount(totalTaxAmount)
        }

        fun totalTaxAmounts(totalTaxAmounts: List<TotalTaxAmount>) = apply {
            body.totalTaxAmounts(totalTaxAmounts)
        }

        /**
         * Sets [Builder.totalTaxAmounts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalTaxAmounts] with a well-typed
         * `List<TotalTaxAmount>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun totalTaxAmounts(totalTaxAmounts: JsonField<List<TotalTaxAmount>>) = apply {
            body.totalTaxAmounts(totalTaxAmounts)
        }

        /**
         * Adds a single [TotalTaxAmount] to [totalTaxAmounts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTotalTaxAmount(totalTaxAmount: TotalTaxAmount) = apply {
            body.addTotalTaxAmount(totalTaxAmount)
        }

        fun totalTaxes(totalTaxes: List<TotalTax>) = apply { body.totalTaxes(totalTaxes) }

        /**
         * Sets [Builder.totalTaxes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalTaxes] with a well-typed `List<TotalTax>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun totalTaxes(totalTaxes: JsonField<List<TotalTax>>) = apply {
            body.totalTaxes(totalTaxes)
        }

        /**
         * Adds a single [TotalTax] to [totalTaxes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTotalTax(totalTax: TotalTax) = apply { body.addTotalTax(totalTax) }

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
         * Returns an immutable instance of [ParticipantRecordTransactionParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .currency()
         * .grossAmount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ParticipantRecordTransactionParams =
            ParticipantRecordTransactionParams(
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
        private val currency: JsonField<String>,
        private val grossAmount: JsonField<Long>,
        private val amountCashNet: JsonField<Long>,
        private val amountPaid: JsonField<Long>,
        private val chargeId: JsonField<String>,
        private val customerId: JsonField<String>,
        private val description: JsonField<String>,
        private val externalId: JsonField<String>,
        private val invoiceId: JsonField<String>,
        private val invoiceSubtotalExcludingTax: JsonField<Long>,
        private val invoiceTotal: JsonField<Long>,
        private val invoiceTotalExcludingTax: JsonField<Long>,
        private val netAmount: JsonField<Long>,
        private val orderId: JsonField<String>,
        private val paidAt: JsonField<Long>,
        private val paymentId: JsonField<String>,
        private val paymentIntentId: JsonField<String>,
        private val subscriptionId: JsonField<String>,
        private val taxAmount: JsonField<Long>,
        private val totalTaxAmount: JsonField<Long>,
        private val totalTaxAmounts: JsonField<List<TotalTaxAmount>>,
        private val totalTaxes: JsonField<List<TotalTax>>,
        private val transactionId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("grossAmount")
            @ExcludeMissing
            grossAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("amountCashNet")
            @ExcludeMissing
            amountCashNet: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("amountPaid")
            @ExcludeMissing
            amountPaid: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("chargeId")
            @ExcludeMissing
            chargeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customerId")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("externalId")
            @ExcludeMissing
            externalId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("invoiceId")
            @ExcludeMissing
            invoiceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("invoiceSubtotalExcludingTax")
            @ExcludeMissing
            invoiceSubtotalExcludingTax: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("invoiceTotal")
            @ExcludeMissing
            invoiceTotal: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("invoiceTotalExcludingTax")
            @ExcludeMissing
            invoiceTotalExcludingTax: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("netAmount")
            @ExcludeMissing
            netAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("orderId") @ExcludeMissing orderId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("paidAt") @ExcludeMissing paidAt: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("paymentId")
            @ExcludeMissing
            paymentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("paymentIntentId")
            @ExcludeMissing
            paymentIntentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("subscriptionId")
            @ExcludeMissing
            subscriptionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("taxAmount")
            @ExcludeMissing
            taxAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("totalTaxAmount")
            @ExcludeMissing
            totalTaxAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("totalTaxAmounts")
            @ExcludeMissing
            totalTaxAmounts: JsonField<List<TotalTaxAmount>> = JsonMissing.of(),
            @JsonProperty("totalTaxes")
            @ExcludeMissing
            totalTaxes: JsonField<List<TotalTax>> = JsonMissing.of(),
            @JsonProperty("transactionId")
            @ExcludeMissing
            transactionId: JsonField<String> = JsonMissing.of(),
        ) : this(
            currency,
            grossAmount,
            amountCashNet,
            amountPaid,
            chargeId,
            customerId,
            description,
            externalId,
            invoiceId,
            invoiceSubtotalExcludingTax,
            invoiceTotal,
            invoiceTotalExcludingTax,
            netAmount,
            orderId,
            paidAt,
            paymentId,
            paymentIntentId,
            subscriptionId,
            taxAmount,
            totalTaxAmount,
            totalTaxAmounts,
            totalTaxes,
            transactionId,
            mutableMapOf(),
        )

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun grossAmount(): Long = grossAmount.getRequired("grossAmount")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun amountCashNet(): Optional<Long> = amountCashNet.getOptional("amountCashNet")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun amountPaid(): Optional<Long> = amountPaid.getOptional("amountPaid")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun chargeId(): Optional<String> = chargeId.getOptional("chargeId")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customerId(): Optional<String> = customerId.getOptional("customerId")

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
        fun invoiceSubtotalExcludingTax(): Optional<Long> =
            invoiceSubtotalExcludingTax.getOptional("invoiceSubtotalExcludingTax")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun invoiceTotal(): Optional<Long> = invoiceTotal.getOptional("invoiceTotal")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun invoiceTotalExcludingTax(): Optional<Long> =
            invoiceTotalExcludingTax.getOptional("invoiceTotalExcludingTax")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun netAmount(): Optional<Long> = netAmount.getOptional("netAmount")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun orderId(): Optional<String> = orderId.getOptional("orderId")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun paidAt(): Optional<Long> = paidAt.getOptional("paidAt")

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
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun subscriptionId(): Optional<String> = subscriptionId.getOptional("subscriptionId")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun taxAmount(): Optional<Long> = taxAmount.getOptional("taxAmount")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun totalTaxAmount(): Optional<Long> = totalTaxAmount.getOptional("totalTaxAmount")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun totalTaxAmounts(): Optional<List<TotalTaxAmount>> =
            totalTaxAmounts.getOptional("totalTaxAmounts")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun totalTaxes(): Optional<List<TotalTax>> = totalTaxes.getOptional("totalTaxes")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun transactionId(): Optional<String> = transactionId.getOptional("transactionId")

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [grossAmount].
         *
         * Unlike [grossAmount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("grossAmount")
        @ExcludeMissing
        fun _grossAmount(): JsonField<Long> = grossAmount

        /**
         * Returns the raw JSON value of [amountCashNet].
         *
         * Unlike [amountCashNet], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("amountCashNet")
        @ExcludeMissing
        fun _amountCashNet(): JsonField<Long> = amountCashNet

        /**
         * Returns the raw JSON value of [amountPaid].
         *
         * Unlike [amountPaid], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amountPaid") @ExcludeMissing fun _amountPaid(): JsonField<Long> = amountPaid

        /**
         * Returns the raw JSON value of [chargeId].
         *
         * Unlike [chargeId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("chargeId") @ExcludeMissing fun _chargeId(): JsonField<String> = chargeId

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customerId")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

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
         * Returns the raw JSON value of [invoiceSubtotalExcludingTax].
         *
         * Unlike [invoiceSubtotalExcludingTax], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("invoiceSubtotalExcludingTax")
        @ExcludeMissing
        fun _invoiceSubtotalExcludingTax(): JsonField<Long> = invoiceSubtotalExcludingTax

        /**
         * Returns the raw JSON value of [invoiceTotal].
         *
         * Unlike [invoiceTotal], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("invoiceTotal")
        @ExcludeMissing
        fun _invoiceTotal(): JsonField<Long> = invoiceTotal

        /**
         * Returns the raw JSON value of [invoiceTotalExcludingTax].
         *
         * Unlike [invoiceTotalExcludingTax], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("invoiceTotalExcludingTax")
        @ExcludeMissing
        fun _invoiceTotalExcludingTax(): JsonField<Long> = invoiceTotalExcludingTax

        /**
         * Returns the raw JSON value of [netAmount].
         *
         * Unlike [netAmount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("netAmount") @ExcludeMissing fun _netAmount(): JsonField<Long> = netAmount

        /**
         * Returns the raw JSON value of [orderId].
         *
         * Unlike [orderId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("orderId") @ExcludeMissing fun _orderId(): JsonField<String> = orderId

        /**
         * Returns the raw JSON value of [paidAt].
         *
         * Unlike [paidAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("paidAt") @ExcludeMissing fun _paidAt(): JsonField<Long> = paidAt

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
         * Returns the raw JSON value of [subscriptionId].
         *
         * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subscriptionId")
        @ExcludeMissing
        fun _subscriptionId(): JsonField<String> = subscriptionId

        /**
         * Returns the raw JSON value of [taxAmount].
         *
         * Unlike [taxAmount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("taxAmount") @ExcludeMissing fun _taxAmount(): JsonField<Long> = taxAmount

        /**
         * Returns the raw JSON value of [totalTaxAmount].
         *
         * Unlike [totalTaxAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("totalTaxAmount")
        @ExcludeMissing
        fun _totalTaxAmount(): JsonField<Long> = totalTaxAmount

        /**
         * Returns the raw JSON value of [totalTaxAmounts].
         *
         * Unlike [totalTaxAmounts], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("totalTaxAmounts")
        @ExcludeMissing
        fun _totalTaxAmounts(): JsonField<List<TotalTaxAmount>> = totalTaxAmounts

        /**
         * Returns the raw JSON value of [totalTaxes].
         *
         * Unlike [totalTaxes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("totalTaxes")
        @ExcludeMissing
        fun _totalTaxes(): JsonField<List<TotalTax>> = totalTaxes

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

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .currency()
             * .grossAmount()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var currency: JsonField<String>? = null
            private var grossAmount: JsonField<Long>? = null
            private var amountCashNet: JsonField<Long> = JsonMissing.of()
            private var amountPaid: JsonField<Long> = JsonMissing.of()
            private var chargeId: JsonField<String> = JsonMissing.of()
            private var customerId: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var externalId: JsonField<String> = JsonMissing.of()
            private var invoiceId: JsonField<String> = JsonMissing.of()
            private var invoiceSubtotalExcludingTax: JsonField<Long> = JsonMissing.of()
            private var invoiceTotal: JsonField<Long> = JsonMissing.of()
            private var invoiceTotalExcludingTax: JsonField<Long> = JsonMissing.of()
            private var netAmount: JsonField<Long> = JsonMissing.of()
            private var orderId: JsonField<String> = JsonMissing.of()
            private var paidAt: JsonField<Long> = JsonMissing.of()
            private var paymentId: JsonField<String> = JsonMissing.of()
            private var paymentIntentId: JsonField<String> = JsonMissing.of()
            private var subscriptionId: JsonField<String> = JsonMissing.of()
            private var taxAmount: JsonField<Long> = JsonMissing.of()
            private var totalTaxAmount: JsonField<Long> = JsonMissing.of()
            private var totalTaxAmounts: JsonField<MutableList<TotalTaxAmount>>? = null
            private var totalTaxes: JsonField<MutableList<TotalTax>>? = null
            private var transactionId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                currency = body.currency
                grossAmount = body.grossAmount
                amountCashNet = body.amountCashNet
                amountPaid = body.amountPaid
                chargeId = body.chargeId
                customerId = body.customerId
                description = body.description
                externalId = body.externalId
                invoiceId = body.invoiceId
                invoiceSubtotalExcludingTax = body.invoiceSubtotalExcludingTax
                invoiceTotal = body.invoiceTotal
                invoiceTotalExcludingTax = body.invoiceTotalExcludingTax
                netAmount = body.netAmount
                orderId = body.orderId
                paidAt = body.paidAt
                paymentId = body.paymentId
                paymentIntentId = body.paymentIntentId
                subscriptionId = body.subscriptionId
                taxAmount = body.taxAmount
                totalTaxAmount = body.totalTaxAmount
                totalTaxAmounts = body.totalTaxAmounts.map { it.toMutableList() }
                totalTaxes = body.totalTaxes.map { it.toMutableList() }
                transactionId = body.transactionId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun grossAmount(grossAmount: Long) = grossAmount(JsonField.of(grossAmount))

            /**
             * Sets [Builder.grossAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.grossAmount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun grossAmount(grossAmount: JsonField<Long>) = apply { this.grossAmount = grossAmount }

            fun amountCashNet(amountCashNet: Long) = amountCashNet(JsonField.of(amountCashNet))

            /**
             * Sets [Builder.amountCashNet] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountCashNet] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amountCashNet(amountCashNet: JsonField<Long>) = apply {
                this.amountCashNet = amountCashNet
            }

            fun amountPaid(amountPaid: Long) = amountPaid(JsonField.of(amountPaid))

            /**
             * Sets [Builder.amountPaid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountPaid] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amountPaid(amountPaid: JsonField<Long>) = apply { this.amountPaid = amountPaid }

            fun chargeId(chargeId: String) = chargeId(JsonField.of(chargeId))

            /**
             * Sets [Builder.chargeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chargeId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chargeId(chargeId: JsonField<String>) = apply { this.chargeId = chargeId }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

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

            fun invoiceSubtotalExcludingTax(invoiceSubtotalExcludingTax: Long) =
                invoiceSubtotalExcludingTax(JsonField.of(invoiceSubtotalExcludingTax))

            /**
             * Sets [Builder.invoiceSubtotalExcludingTax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoiceSubtotalExcludingTax] with a well-typed
             * [Long] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun invoiceSubtotalExcludingTax(invoiceSubtotalExcludingTax: JsonField<Long>) = apply {
                this.invoiceSubtotalExcludingTax = invoiceSubtotalExcludingTax
            }

            fun invoiceTotal(invoiceTotal: Long) = invoiceTotal(JsonField.of(invoiceTotal))

            /**
             * Sets [Builder.invoiceTotal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoiceTotal] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun invoiceTotal(invoiceTotal: JsonField<Long>) = apply {
                this.invoiceTotal = invoiceTotal
            }

            fun invoiceTotalExcludingTax(invoiceTotalExcludingTax: Long) =
                invoiceTotalExcludingTax(JsonField.of(invoiceTotalExcludingTax))

            /**
             * Sets [Builder.invoiceTotalExcludingTax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoiceTotalExcludingTax] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun invoiceTotalExcludingTax(invoiceTotalExcludingTax: JsonField<Long>) = apply {
                this.invoiceTotalExcludingTax = invoiceTotalExcludingTax
            }

            fun netAmount(netAmount: Long) = netAmount(JsonField.of(netAmount))

            /**
             * Sets [Builder.netAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.netAmount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun netAmount(netAmount: JsonField<Long>) = apply { this.netAmount = netAmount }

            fun orderId(orderId: String) = orderId(JsonField.of(orderId))

            /**
             * Sets [Builder.orderId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.orderId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun orderId(orderId: JsonField<String>) = apply { this.orderId = orderId }

            fun paidAt(paidAt: Long) = paidAt(JsonField.of(paidAt))

            /**
             * Sets [Builder.paidAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paidAt] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun paidAt(paidAt: JsonField<Long>) = apply { this.paidAt = paidAt }

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

            fun subscriptionId(subscriptionId: String) =
                subscriptionId(JsonField.of(subscriptionId))

            /**
             * Sets [Builder.subscriptionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subscriptionId(subscriptionId: JsonField<String>) = apply {
                this.subscriptionId = subscriptionId
            }

            fun taxAmount(taxAmount: Long) = taxAmount(JsonField.of(taxAmount))

            /**
             * Sets [Builder.taxAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxAmount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taxAmount(taxAmount: JsonField<Long>) = apply { this.taxAmount = taxAmount }

            fun totalTaxAmount(totalTaxAmount: Long) = totalTaxAmount(JsonField.of(totalTaxAmount))

            /**
             * Sets [Builder.totalTaxAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalTaxAmount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalTaxAmount(totalTaxAmount: JsonField<Long>) = apply {
                this.totalTaxAmount = totalTaxAmount
            }

            fun totalTaxAmounts(totalTaxAmounts: List<TotalTaxAmount>) =
                totalTaxAmounts(JsonField.of(totalTaxAmounts))

            /**
             * Sets [Builder.totalTaxAmounts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalTaxAmounts] with a well-typed
             * `List<TotalTaxAmount>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun totalTaxAmounts(totalTaxAmounts: JsonField<List<TotalTaxAmount>>) = apply {
                this.totalTaxAmounts = totalTaxAmounts.map { it.toMutableList() }
            }

            /**
             * Adds a single [TotalTaxAmount] to [totalTaxAmounts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTotalTaxAmount(totalTaxAmount: TotalTaxAmount) = apply {
                totalTaxAmounts =
                    (totalTaxAmounts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("totalTaxAmounts", it).add(totalTaxAmount)
                    }
            }

            fun totalTaxes(totalTaxes: List<TotalTax>) = totalTaxes(JsonField.of(totalTaxes))

            /**
             * Sets [Builder.totalTaxes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalTaxes] with a well-typed `List<TotalTax>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalTaxes(totalTaxes: JsonField<List<TotalTax>>) = apply {
                this.totalTaxes = totalTaxes.map { it.toMutableList() }
            }

            /**
             * Adds a single [TotalTax] to [totalTaxes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTotalTax(totalTax: TotalTax) = apply {
                totalTaxes =
                    (totalTaxes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("totalTaxes", it).add(totalTax)
                    }
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
             *
             * The following fields are required:
             * ```java
             * .currency()
             * .grossAmount()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("currency", currency),
                    checkRequired("grossAmount", grossAmount),
                    amountCashNet,
                    amountPaid,
                    chargeId,
                    customerId,
                    description,
                    externalId,
                    invoiceId,
                    invoiceSubtotalExcludingTax,
                    invoiceTotal,
                    invoiceTotalExcludingTax,
                    netAmount,
                    orderId,
                    paidAt,
                    paymentId,
                    paymentIntentId,
                    subscriptionId,
                    taxAmount,
                    totalTaxAmount,
                    (totalTaxAmounts ?: JsonMissing.of()).map { it.toImmutable() },
                    (totalTaxes ?: JsonMissing.of()).map { it.toImmutable() },
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

            currency()
            grossAmount()
            amountCashNet()
            amountPaid()
            chargeId()
            customerId()
            description()
            externalId()
            invoiceId()
            invoiceSubtotalExcludingTax()
            invoiceTotal()
            invoiceTotalExcludingTax()
            netAmount()
            orderId()
            paidAt()
            paymentId()
            paymentIntentId()
            subscriptionId()
            taxAmount()
            totalTaxAmount()
            totalTaxAmounts().ifPresent { it.forEach { it.validate() } }
            totalTaxes().ifPresent { it.forEach { it.validate() } }
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
            (if (currency.asKnown().isPresent) 1 else 0) +
                (if (grossAmount.asKnown().isPresent) 1 else 0) +
                (if (amountCashNet.asKnown().isPresent) 1 else 0) +
                (if (amountPaid.asKnown().isPresent) 1 else 0) +
                (if (chargeId.asKnown().isPresent) 1 else 0) +
                (if (customerId.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (externalId.asKnown().isPresent) 1 else 0) +
                (if (invoiceId.asKnown().isPresent) 1 else 0) +
                (if (invoiceSubtotalExcludingTax.asKnown().isPresent) 1 else 0) +
                (if (invoiceTotal.asKnown().isPresent) 1 else 0) +
                (if (invoiceTotalExcludingTax.asKnown().isPresent) 1 else 0) +
                (if (netAmount.asKnown().isPresent) 1 else 0) +
                (if (orderId.asKnown().isPresent) 1 else 0) +
                (if (paidAt.asKnown().isPresent) 1 else 0) +
                (if (paymentId.asKnown().isPresent) 1 else 0) +
                (if (paymentIntentId.asKnown().isPresent) 1 else 0) +
                (if (subscriptionId.asKnown().isPresent) 1 else 0) +
                (if (taxAmount.asKnown().isPresent) 1 else 0) +
                (if (totalTaxAmount.asKnown().isPresent) 1 else 0) +
                (totalTaxAmounts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (totalTaxes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (transactionId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                currency == other.currency &&
                grossAmount == other.grossAmount &&
                amountCashNet == other.amountCashNet &&
                amountPaid == other.amountPaid &&
                chargeId == other.chargeId &&
                customerId == other.customerId &&
                description == other.description &&
                externalId == other.externalId &&
                invoiceId == other.invoiceId &&
                invoiceSubtotalExcludingTax == other.invoiceSubtotalExcludingTax &&
                invoiceTotal == other.invoiceTotal &&
                invoiceTotalExcludingTax == other.invoiceTotalExcludingTax &&
                netAmount == other.netAmount &&
                orderId == other.orderId &&
                paidAt == other.paidAt &&
                paymentId == other.paymentId &&
                paymentIntentId == other.paymentIntentId &&
                subscriptionId == other.subscriptionId &&
                taxAmount == other.taxAmount &&
                totalTaxAmount == other.totalTaxAmount &&
                totalTaxAmounts == other.totalTaxAmounts &&
                totalTaxes == other.totalTaxes &&
                transactionId == other.transactionId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                currency,
                grossAmount,
                amountCashNet,
                amountPaid,
                chargeId,
                customerId,
                description,
                externalId,
                invoiceId,
                invoiceSubtotalExcludingTax,
                invoiceTotal,
                invoiceTotalExcludingTax,
                netAmount,
                orderId,
                paidAt,
                paymentId,
                paymentIntentId,
                subscriptionId,
                taxAmount,
                totalTaxAmount,
                totalTaxAmounts,
                totalTaxes,
                transactionId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{currency=$currency, grossAmount=$grossAmount, amountCashNet=$amountCashNet, amountPaid=$amountPaid, chargeId=$chargeId, customerId=$customerId, description=$description, externalId=$externalId, invoiceId=$invoiceId, invoiceSubtotalExcludingTax=$invoiceSubtotalExcludingTax, invoiceTotal=$invoiceTotal, invoiceTotalExcludingTax=$invoiceTotalExcludingTax, netAmount=$netAmount, orderId=$orderId, paidAt=$paidAt, paymentId=$paymentId, paymentIntentId=$paymentIntentId, subscriptionId=$subscriptionId, taxAmount=$taxAmount, totalTaxAmount=$totalTaxAmount, totalTaxAmounts=$totalTaxAmounts, totalTaxes=$totalTaxes, transactionId=$transactionId, additionalProperties=$additionalProperties}"
    }

    class TotalTaxAmount
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

            /** Returns a mutable builder for constructing an instance of [TotalTaxAmount]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TotalTaxAmount]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(totalTaxAmount: TotalTaxAmount) = apply {
                additionalProperties = totalTaxAmount.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [TotalTaxAmount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): TotalTaxAmount = TotalTaxAmount(additionalProperties.toImmutable())
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
        fun validate(): TotalTaxAmount = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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

            return other is TotalTaxAmount && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "TotalTaxAmount{additionalProperties=$additionalProperties}"
    }

    class TotalTax
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

            /** Returns a mutable builder for constructing an instance of [TotalTax]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TotalTax]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(totalTax: TotalTax) = apply {
                additionalProperties = totalTax.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [TotalTax].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): TotalTax = TotalTax(additionalProperties.toImmutable())
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
        fun validate(): TotalTax = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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

            return other is TotalTax && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "TotalTax{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParticipantRecordTransactionParams &&
            id == other.id &&
            participantIdOrEmail == other.participantIdOrEmail &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, participantIdOrEmail, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ParticipantRecordTransactionParams{id=$id, participantIdOrEmail=$participantIdOrEmail, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
