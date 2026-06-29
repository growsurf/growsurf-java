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
import com.growsurf.api.core.checkKnown
import com.growsurf.api.core.checkRequired
import com.growsurf.api.core.toImmutable
import com.growsurf.api.errors.GrowsurfInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ParticipantRefundTransactionResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val adjusted: JsonField<Long>,
    private val amendmentType: JsonField<AmendmentType>,
    private val deleted: JsonField<Long>,
    private val matched: JsonField<Long>,
    private val matchingCommissionIds: JsonField<List<String>>,
    private val message: JsonField<String>,
    private val reversed: JsonField<Long>,
    private val success: JsonField<Boolean>,
    private val notFound: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("adjusted") @ExcludeMissing adjusted: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("amendmentType")
        @ExcludeMissing
        amendmentType: JsonField<AmendmentType> = JsonMissing.of(),
        @JsonProperty("deleted") @ExcludeMissing deleted: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("matched") @ExcludeMissing matched: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("matchingCommissionIds")
        @ExcludeMissing
        matchingCommissionIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reversed") @ExcludeMissing reversed: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("notFound") @ExcludeMissing notFound: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        adjusted,
        amendmentType,
        deleted,
        matched,
        matchingCommissionIds,
        message,
        reversed,
        success,
        notFound,
        mutableMapOf(),
    )

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun adjusted(): Long = adjusted.getRequired("adjusted")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amendmentType(): AmendmentType = amendmentType.getRequired("amendmentType")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun deleted(): Long = deleted.getRequired("deleted")

    /**
     * Number of commissions found for the provided identifiers.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun matched(): Long = matched.getRequired("matched")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun matchingCommissionIds(): List<String> =
        matchingCommissionIds.getRequired("matchingCommissionIds")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun message(): String = message.getRequired("message")

    /**
     * Number of commissions reversed (set to zero amount).
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reversed(): Long = reversed.getRequired("reversed")

    /**
     * true when the amendment was processed (including the tax-only case for already-paid
     * commissions); false when no matching transaction was found.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun success(): Boolean = success.getRequired("success")

    /**
     * Present and true when no commission matched the provided identifiers.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun notFound(): Optional<Boolean> = notFound.getOptional("notFound")

    /**
     * Returns the raw JSON value of [adjusted].
     *
     * Unlike [adjusted], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("adjusted") @ExcludeMissing fun _adjusted(): JsonField<Long> = adjusted

    /**
     * Returns the raw JSON value of [amendmentType].
     *
     * Unlike [amendmentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amendmentType")
    @ExcludeMissing
    fun _amendmentType(): JsonField<AmendmentType> = amendmentType

    /**
     * Returns the raw JSON value of [deleted].
     *
     * Unlike [deleted], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deleted") @ExcludeMissing fun _deleted(): JsonField<Long> = deleted

    /**
     * Returns the raw JSON value of [matched].
     *
     * Unlike [matched], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("matched") @ExcludeMissing fun _matched(): JsonField<Long> = matched

    /**
     * Returns the raw JSON value of [matchingCommissionIds].
     *
     * Unlike [matchingCommissionIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("matchingCommissionIds")
    @ExcludeMissing
    fun _matchingCommissionIds(): JsonField<List<String>> = matchingCommissionIds

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [reversed].
     *
     * Unlike [reversed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reversed") @ExcludeMissing fun _reversed(): JsonField<Long> = reversed

    /**
     * Returns the raw JSON value of [success].
     *
     * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

    /**
     * Returns the raw JSON value of [notFound].
     *
     * Unlike [notFound], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("notFound") @ExcludeMissing fun _notFound(): JsonField<Boolean> = notFound

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
         * Returns a mutable builder for constructing an instance of
         * [ParticipantRefundTransactionResponse].
         *
         * The following fields are required:
         * ```java
         * .adjusted()
         * .amendmentType()
         * .deleted()
         * .matched()
         * .matchingCommissionIds()
         * .message()
         * .reversed()
         * .success()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ParticipantRefundTransactionResponse]. */
    class Builder internal constructor() {

        private var adjusted: JsonField<Long>? = null
        private var amendmentType: JsonField<AmendmentType>? = null
        private var deleted: JsonField<Long>? = null
        private var matched: JsonField<Long>? = null
        private var matchingCommissionIds: JsonField<MutableList<String>>? = null
        private var message: JsonField<String>? = null
        private var reversed: JsonField<Long>? = null
        private var success: JsonField<Boolean>? = null
        private var notFound: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            participantRefundTransactionResponse: ParticipantRefundTransactionResponse
        ) = apply {
            adjusted = participantRefundTransactionResponse.adjusted
            amendmentType = participantRefundTransactionResponse.amendmentType
            deleted = participantRefundTransactionResponse.deleted
            matched = participantRefundTransactionResponse.matched
            matchingCommissionIds =
                participantRefundTransactionResponse.matchingCommissionIds.map {
                    it.toMutableList()
                }
            message = participantRefundTransactionResponse.message
            reversed = participantRefundTransactionResponse.reversed
            success = participantRefundTransactionResponse.success
            notFound = participantRefundTransactionResponse.notFound
            additionalProperties =
                participantRefundTransactionResponse.additionalProperties.toMutableMap()
        }

        fun adjusted(adjusted: Long) = adjusted(JsonField.of(adjusted))

        /**
         * Sets [Builder.adjusted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.adjusted] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun adjusted(adjusted: JsonField<Long>) = apply { this.adjusted = adjusted }

        fun amendmentType(amendmentType: AmendmentType) = amendmentType(JsonField.of(amendmentType))

        /**
         * Sets [Builder.amendmentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amendmentType] with a well-typed [AmendmentType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun amendmentType(amendmentType: JsonField<AmendmentType>) = apply {
            this.amendmentType = amendmentType
        }

        fun deleted(deleted: Long) = deleted(JsonField.of(deleted))

        /**
         * Sets [Builder.deleted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deleted] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun deleted(deleted: JsonField<Long>) = apply { this.deleted = deleted }

        /** Number of commissions found for the provided identifiers. */
        fun matched(matched: Long) = matched(JsonField.of(matched))

        /**
         * Sets [Builder.matched] to an arbitrary JSON value.
         *
         * You should usually call [Builder.matched] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun matched(matched: JsonField<Long>) = apply { this.matched = matched }

        fun matchingCommissionIds(matchingCommissionIds: List<String>) =
            matchingCommissionIds(JsonField.of(matchingCommissionIds))

        /**
         * Sets [Builder.matchingCommissionIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.matchingCommissionIds] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun matchingCommissionIds(matchingCommissionIds: JsonField<List<String>>) = apply {
            this.matchingCommissionIds = matchingCommissionIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [matchingCommissionIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMatchingCommissionId(matchingCommissionId: String) = apply {
            matchingCommissionIds =
                (matchingCommissionIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("matchingCommissionIds", it).add(matchingCommissionId)
                }
        }

        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        /** Number of commissions reversed (set to zero amount). */
        fun reversed(reversed: Long) = reversed(JsonField.of(reversed))

        /**
         * Sets [Builder.reversed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reversed] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reversed(reversed: JsonField<Long>) = apply { this.reversed = reversed }

        /**
         * true when the amendment was processed (including the tax-only case for already-paid
         * commissions); false when no matching transaction was found.
         */
        fun success(success: Boolean) = success(JsonField.of(success))

        /**
         * Sets [Builder.success] to an arbitrary JSON value.
         *
         * You should usually call [Builder.success] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun success(success: JsonField<Boolean>) = apply { this.success = success }

        /** Present and true when no commission matched the provided identifiers. */
        fun notFound(notFound: Boolean) = notFound(JsonField.of(notFound))

        /**
         * Sets [Builder.notFound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notFound] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun notFound(notFound: JsonField<Boolean>) = apply { this.notFound = notFound }

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
         * Returns an immutable instance of [ParticipantRefundTransactionResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .adjusted()
         * .amendmentType()
         * .deleted()
         * .matched()
         * .matchingCommissionIds()
         * .message()
         * .reversed()
         * .success()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ParticipantRefundTransactionResponse =
            ParticipantRefundTransactionResponse(
                checkRequired("adjusted", adjusted),
                checkRequired("amendmentType", amendmentType),
                checkRequired("deleted", deleted),
                checkRequired("matched", matched),
                checkRequired("matchingCommissionIds", matchingCommissionIds).map {
                    it.toImmutable()
                },
                checkRequired("message", message),
                checkRequired("reversed", reversed),
                checkRequired("success", success),
                notFound,
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
    fun validate(): ParticipantRefundTransactionResponse = apply {
        if (validated) {
            return@apply
        }

        adjusted()
        amendmentType().validate()
        deleted()
        matched()
        matchingCommissionIds()
        message()
        reversed()
        success()
        notFound()
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
        (if (adjusted.asKnown().isPresent) 1 else 0) +
            (amendmentType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (deleted.asKnown().isPresent) 1 else 0) +
            (if (matched.asKnown().isPresent) 1 else 0) +
            (matchingCommissionIds.asKnown().getOrNull()?.size ?: 0) +
            (if (message.asKnown().isPresent) 1 else 0) +
            (if (reversed.asKnown().isPresent) 1 else 0) +
            (if (success.asKnown().isPresent) 1 else 0) +
            (if (notFound.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParticipantRefundTransactionResponse &&
            adjusted == other.adjusted &&
            amendmentType == other.amendmentType &&
            deleted == other.deleted &&
            matched == other.matched &&
            matchingCommissionIds == other.matchingCommissionIds &&
            message == other.message &&
            reversed == other.reversed &&
            success == other.success &&
            notFound == other.notFound &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            adjusted,
            amendmentType,
            deleted,
            matched,
            matchingCommissionIds,
            message,
            reversed,
            success,
            notFound,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ParticipantRefundTransactionResponse{adjusted=$adjusted, amendmentType=$amendmentType, deleted=$deleted, matched=$matched, matchingCommissionIds=$matchingCommissionIds, message=$message, reversed=$reversed, success=$success, notFound=$notFound, additionalProperties=$additionalProperties}"

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
}
