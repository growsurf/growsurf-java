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
import com.growsurf.api.core.checkRequired
import com.growsurf.api.errors.GrowsurfInvalidDataException
import com.growsurf.api.models.campaign.CommissionStructure
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ParticipantReward
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val rewardId: JsonField<String>,
    private val status: JsonField<Status>,
    private val approved: JsonField<Boolean>,
    private val approvedAt: JsonField<Long>,
    private val commissionStructure: JsonField<CommissionStructure>,
    private val fulfilledAt: JsonField<Long>,
    private val isAvailable: JsonField<Boolean>,
    private val isFulfilled: JsonField<Boolean>,
    private val isReferrer: JsonField<Boolean>,
    private val referredId: JsonField<String>,
    private val referrerId: JsonField<String>,
    private val unread: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rewardId") @ExcludeMissing rewardId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("approved") @ExcludeMissing approved: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("approvedAt") @ExcludeMissing approvedAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("commissionStructure")
        @ExcludeMissing
        commissionStructure: JsonField<CommissionStructure> = JsonMissing.of(),
        @JsonProperty("fulfilledAt")
        @ExcludeMissing
        fulfilledAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("isAvailable")
        @ExcludeMissing
        isAvailable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isFulfilled")
        @ExcludeMissing
        isFulfilled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isReferrer")
        @ExcludeMissing
        isReferrer: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("referredId")
        @ExcludeMissing
        referredId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("referrerId")
        @ExcludeMissing
        referrerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unread") @ExcludeMissing unread: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        id,
        rewardId,
        status,
        approved,
        approvedAt,
        commissionStructure,
        fulfilledAt,
        isAvailable,
        isFulfilled,
        isReferrer,
        referredId,
        referrerId,
        unread,
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
    fun rewardId(): String = rewardId.getRequired("rewardId")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun approved(): Optional<Boolean> = approved.getOptional("approved")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun approvedAt(): Optional<Long> = approvedAt.getOptional("approvedAt")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commissionStructure(): Optional<CommissionStructure> =
        commissionStructure.getOptional("commissionStructure")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fulfilledAt(): Optional<Long> = fulfilledAt.getOptional("fulfilledAt")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isAvailable(): Optional<Boolean> = isAvailable.getOptional("isAvailable")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isFulfilled(): Optional<Boolean> = isFulfilled.getOptional("isFulfilled")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isReferrer(): Optional<Boolean> = isReferrer.getOptional("isReferrer")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referredId(): Optional<String> = referredId.getOptional("referredId")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referrerId(): Optional<String> = referrerId.getOptional("referrerId")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun unread(): Optional<Boolean> = unread.getOptional("unread")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [rewardId].
     *
     * Unlike [rewardId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rewardId") @ExcludeMissing fun _rewardId(): JsonField<String> = rewardId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [approved].
     *
     * Unlike [approved], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("approved") @ExcludeMissing fun _approved(): JsonField<Boolean> = approved

    /**
     * Returns the raw JSON value of [approvedAt].
     *
     * Unlike [approvedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("approvedAt") @ExcludeMissing fun _approvedAt(): JsonField<Long> = approvedAt

    /**
     * Returns the raw JSON value of [commissionStructure].
     *
     * Unlike [commissionStructure], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("commissionStructure")
    @ExcludeMissing
    fun _commissionStructure(): JsonField<CommissionStructure> = commissionStructure

    /**
     * Returns the raw JSON value of [fulfilledAt].
     *
     * Unlike [fulfilledAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fulfilledAt") @ExcludeMissing fun _fulfilledAt(): JsonField<Long> = fulfilledAt

    /**
     * Returns the raw JSON value of [isAvailable].
     *
     * Unlike [isAvailable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isAvailable")
    @ExcludeMissing
    fun _isAvailable(): JsonField<Boolean> = isAvailable

    /**
     * Returns the raw JSON value of [isFulfilled].
     *
     * Unlike [isFulfilled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isFulfilled")
    @ExcludeMissing
    fun _isFulfilled(): JsonField<Boolean> = isFulfilled

    /**
     * Returns the raw JSON value of [isReferrer].
     *
     * Unlike [isReferrer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isReferrer") @ExcludeMissing fun _isReferrer(): JsonField<Boolean> = isReferrer

    /**
     * Returns the raw JSON value of [referredId].
     *
     * Unlike [referredId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("referredId") @ExcludeMissing fun _referredId(): JsonField<String> = referredId

    /**
     * Returns the raw JSON value of [referrerId].
     *
     * Unlike [referrerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("referrerId") @ExcludeMissing fun _referrerId(): JsonField<String> = referrerId

    /**
     * Returns the raw JSON value of [unread].
     *
     * Unlike [unread], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unread") @ExcludeMissing fun _unread(): JsonField<Boolean> = unread

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
         * Returns a mutable builder for constructing an instance of [ParticipantReward].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .rewardId()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ParticipantReward]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var rewardId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var approved: JsonField<Boolean> = JsonMissing.of()
        private var approvedAt: JsonField<Long> = JsonMissing.of()
        private var commissionStructure: JsonField<CommissionStructure> = JsonMissing.of()
        private var fulfilledAt: JsonField<Long> = JsonMissing.of()
        private var isAvailable: JsonField<Boolean> = JsonMissing.of()
        private var isFulfilled: JsonField<Boolean> = JsonMissing.of()
        private var isReferrer: JsonField<Boolean> = JsonMissing.of()
        private var referredId: JsonField<String> = JsonMissing.of()
        private var referrerId: JsonField<String> = JsonMissing.of()
        private var unread: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(participantReward: ParticipantReward) = apply {
            id = participantReward.id
            rewardId = participantReward.rewardId
            status = participantReward.status
            approved = participantReward.approved
            approvedAt = participantReward.approvedAt
            commissionStructure = participantReward.commissionStructure
            fulfilledAt = participantReward.fulfilledAt
            isAvailable = participantReward.isAvailable
            isFulfilled = participantReward.isFulfilled
            isReferrer = participantReward.isReferrer
            referredId = participantReward.referredId
            referrerId = participantReward.referrerId
            unread = participantReward.unread
            additionalProperties = participantReward.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun rewardId(rewardId: String) = rewardId(JsonField.of(rewardId))

        /**
         * Sets [Builder.rewardId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rewardId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rewardId(rewardId: JsonField<String>) = apply { this.rewardId = rewardId }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun approved(approved: Boolean) = approved(JsonField.of(approved))

        /**
         * Sets [Builder.approved] to an arbitrary JSON value.
         *
         * You should usually call [Builder.approved] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun approved(approved: JsonField<Boolean>) = apply { this.approved = approved }

        fun approvedAt(approvedAt: Long) = approvedAt(JsonField.of(approvedAt))

        /**
         * Sets [Builder.approvedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.approvedAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun approvedAt(approvedAt: JsonField<Long>) = apply { this.approvedAt = approvedAt }

        fun commissionStructure(commissionStructure: CommissionStructure?) =
            commissionStructure(JsonField.ofNullable(commissionStructure))

        /**
         * Alias for calling [Builder.commissionStructure] with `commissionStructure.orElse(null)`.
         */
        fun commissionStructure(commissionStructure: Optional<CommissionStructure>) =
            commissionStructure(commissionStructure.getOrNull())

        /**
         * Sets [Builder.commissionStructure] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commissionStructure] with a well-typed
         * [CommissionStructure] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun commissionStructure(commissionStructure: JsonField<CommissionStructure>) = apply {
            this.commissionStructure = commissionStructure
        }

        fun fulfilledAt(fulfilledAt: Long) = fulfilledAt(JsonField.of(fulfilledAt))

        /**
         * Sets [Builder.fulfilledAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fulfilledAt] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fulfilledAt(fulfilledAt: JsonField<Long>) = apply { this.fulfilledAt = fulfilledAt }

        fun isAvailable(isAvailable: Boolean) = isAvailable(JsonField.of(isAvailable))

        /**
         * Sets [Builder.isAvailable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isAvailable] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isAvailable(isAvailable: JsonField<Boolean>) = apply { this.isAvailable = isAvailable }

        fun isFulfilled(isFulfilled: Boolean) = isFulfilled(JsonField.of(isFulfilled))

        /**
         * Sets [Builder.isFulfilled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isFulfilled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isFulfilled(isFulfilled: JsonField<Boolean>) = apply { this.isFulfilled = isFulfilled }

        fun isReferrer(isReferrer: Boolean) = isReferrer(JsonField.of(isReferrer))

        /**
         * Sets [Builder.isReferrer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isReferrer] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isReferrer(isReferrer: JsonField<Boolean>) = apply { this.isReferrer = isReferrer }

        fun referredId(referredId: String) = referredId(JsonField.of(referredId))

        /**
         * Sets [Builder.referredId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referredId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun referredId(referredId: JsonField<String>) = apply { this.referredId = referredId }

        fun referrerId(referrerId: String) = referrerId(JsonField.of(referrerId))

        /**
         * Sets [Builder.referrerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referrerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun referrerId(referrerId: JsonField<String>) = apply { this.referrerId = referrerId }

        fun unread(unread: Boolean) = unread(JsonField.of(unread))

        /**
         * Sets [Builder.unread] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unread] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun unread(unread: JsonField<Boolean>) = apply { this.unread = unread }

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
         * Returns an immutable instance of [ParticipantReward].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .rewardId()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ParticipantReward =
            ParticipantReward(
                checkRequired("id", id),
                checkRequired("rewardId", rewardId),
                checkRequired("status", status),
                approved,
                approvedAt,
                commissionStructure,
                fulfilledAt,
                isAvailable,
                isFulfilled,
                isReferrer,
                referredId,
                referrerId,
                unread,
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
    fun validate(): ParticipantReward = apply {
        if (validated) {
            return@apply
        }

        id()
        rewardId()
        status().validate()
        approved()
        approvedAt()
        commissionStructure().ifPresent { it.validate() }
        fulfilledAt()
        isAvailable()
        isFulfilled()
        isReferrer()
        referredId()
        referrerId()
        unread()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (rewardId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (approved.asKnown().isPresent) 1 else 0) +
            (if (approvedAt.asKnown().isPresent) 1 else 0) +
            (commissionStructure.asKnown().getOrNull()?.validity() ?: 0) +
            (if (fulfilledAt.asKnown().isPresent) 1 else 0) +
            (if (isAvailable.asKnown().isPresent) 1 else 0) +
            (if (isFulfilled.asKnown().isPresent) 1 else 0) +
            (if (isReferrer.asKnown().isPresent) 1 else 0) +
            (if (referredId.asKnown().isPresent) 1 else 0) +
            (if (referrerId.asKnown().isPresent) 1 else 0) +
            (if (unread.asKnown().isPresent) 1 else 0)

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PENDING = of("PENDING")

            @JvmField val FULFILLED = of("FULFILLED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            FULFILLED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            FULFILLED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                PENDING -> Value.PENDING
                FULFILLED -> Value.FULFILLED
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
                PENDING -> Known.PENDING
                FULFILLED -> Known.FULFILLED
                else -> throw GrowsurfInvalidDataException("Unknown Status: $value")
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

        return other is ParticipantReward &&
            id == other.id &&
            rewardId == other.rewardId &&
            status == other.status &&
            approved == other.approved &&
            approvedAt == other.approvedAt &&
            commissionStructure == other.commissionStructure &&
            fulfilledAt == other.fulfilledAt &&
            isAvailable == other.isAvailable &&
            isFulfilled == other.isFulfilled &&
            isReferrer == other.isReferrer &&
            referredId == other.referredId &&
            referrerId == other.referrerId &&
            unread == other.unread &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            rewardId,
            status,
            approved,
            approvedAt,
            commissionStructure,
            fulfilledAt,
            isAvailable,
            isFulfilled,
            isReferrer,
            referredId,
            referrerId,
            unread,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ParticipantReward{id=$id, rewardId=$rewardId, status=$status, approved=$approved, approvedAt=$approvedAt, commissionStructure=$commissionStructure, fulfilledAt=$fulfilledAt, isAvailable=$isAvailable, isFulfilled=$isFulfilled, isReferrer=$isReferrer, referredId=$referredId, referrerId=$referrerId, unread=$unread, additionalProperties=$additionalProperties}"
}
