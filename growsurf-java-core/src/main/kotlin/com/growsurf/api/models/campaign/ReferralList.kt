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
import com.growsurf.api.core.checkKnown
import com.growsurf.api.core.checkRequired
import com.growsurf.api.core.toImmutable
import com.growsurf.api.errors.GrowsurfInvalidDataException
import com.growsurf.api.models.campaign.participant.ReferralStatus
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ReferralList
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val limit: JsonField<Long>,
    private val more: JsonField<Boolean>,
    private val referrals: JsonField<List<Referral>>,
    private val nextId: JsonField<String>,
    private val nextOffset: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("more") @ExcludeMissing more: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("referrals")
        @ExcludeMissing
        referrals: JsonField<List<Referral>> = JsonMissing.of(),
        @JsonProperty("nextId") @ExcludeMissing nextId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("nextOffset") @ExcludeMissing nextOffset: JsonField<Long> = JsonMissing.of(),
    ) : this(limit, more, referrals, nextId, nextOffset, mutableMapOf())

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun limit(): Long = limit.getRequired("limit")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun more(): Boolean = more.getRequired("more")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun referrals(): List<Referral> = referrals.getRequired("referrals")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextId(): Optional<String> = nextId.getOptional("nextId")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextOffset(): Optional<Long> = nextOffset.getOptional("nextOffset")

    /**
     * Returns the raw JSON value of [limit].
     *
     * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Long> = limit

    /**
     * Returns the raw JSON value of [more].
     *
     * Unlike [more], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("more") @ExcludeMissing fun _more(): JsonField<Boolean> = more

    /**
     * Returns the raw JSON value of [referrals].
     *
     * Unlike [referrals], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("referrals")
    @ExcludeMissing
    fun _referrals(): JsonField<List<Referral>> = referrals

    /**
     * Returns the raw JSON value of [nextId].
     *
     * Unlike [nextId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nextId") @ExcludeMissing fun _nextId(): JsonField<String> = nextId

    /**
     * Returns the raw JSON value of [nextOffset].
     *
     * Unlike [nextOffset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nextOffset") @ExcludeMissing fun _nextOffset(): JsonField<Long> = nextOffset

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
         * Returns a mutable builder for constructing an instance of [ReferralList].
         *
         * The following fields are required:
         * ```java
         * .limit()
         * .more()
         * .referrals()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReferralList]. */
    class Builder internal constructor() {

        private var limit: JsonField<Long>? = null
        private var more: JsonField<Boolean>? = null
        private var referrals: JsonField<MutableList<Referral>>? = null
        private var nextId: JsonField<String> = JsonMissing.of()
        private var nextOffset: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(referralList: ReferralList) = apply {
            limit = referralList.limit
            more = referralList.more
            referrals = referralList.referrals.map { it.toMutableList() }
            nextId = referralList.nextId
            nextOffset = referralList.nextOffset
            additionalProperties = referralList.additionalProperties.toMutableMap()
        }

        fun limit(limit: Long) = limit(JsonField.of(limit))

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

        fun more(more: Boolean) = more(JsonField.of(more))

        /**
         * Sets [Builder.more] to an arbitrary JSON value.
         *
         * You should usually call [Builder.more] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun more(more: JsonField<Boolean>) = apply { this.more = more }

        fun referrals(referrals: List<Referral>) = referrals(JsonField.of(referrals))

        /**
         * Sets [Builder.referrals] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referrals] with a well-typed `List<Referral>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referrals(referrals: JsonField<List<Referral>>) = apply {
            this.referrals = referrals.map { it.toMutableList() }
        }

        /**
         * Adds a single [Referral] to [referrals].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReferral(referral: Referral) = apply {
            referrals =
                (referrals ?: JsonField.of(mutableListOf())).also {
                    checkKnown("referrals", it).add(referral)
                }
        }

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

        fun nextOffset(nextOffset: Long?) = nextOffset(JsonField.ofNullable(nextOffset))

        /**
         * Alias for [Builder.nextOffset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun nextOffset(nextOffset: Long) = nextOffset(nextOffset as Long?)

        /** Alias for calling [Builder.nextOffset] with `nextOffset.orElse(null)`. */
        fun nextOffset(nextOffset: Optional<Long>) = nextOffset(nextOffset.getOrNull())

        /**
         * Sets [Builder.nextOffset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextOffset] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun nextOffset(nextOffset: JsonField<Long>) = apply { this.nextOffset = nextOffset }

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
         * Returns an immutable instance of [ReferralList].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .limit()
         * .more()
         * .referrals()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ReferralList =
            ReferralList(
                checkRequired("limit", limit),
                checkRequired("more", more),
                checkRequired("referrals", referrals).map { it.toImmutable() },
                nextId,
                nextOffset,
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
    fun validate(): ReferralList = apply {
        if (validated) {
            return@apply
        }

        limit()
        more()
        referrals().forEach { it.validate() }
        nextId()
        nextOffset()
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
            (if (more.asKnown().isPresent) 1 else 0) +
            (referrals.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (nextId.asKnown().isPresent) 1 else 0) +
            (if (nextOffset.asKnown().isPresent) 1 else 0)

    class Referral
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<Long>,
        private val email: JsonField<String>,
        private val referralStatus: JsonField<ReferralStatus>,
        private val referredBy: JsonField<String>,
        private val updatedAt: JsonField<Long>,
        private val firstName: JsonField<String>,
        private val lastName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("referralStatus")
            @ExcludeMissing
            referralStatus: JsonField<ReferralStatus> = JsonMissing.of(),
            @JsonProperty("referredBy")
            @ExcludeMissing
            referredBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("firstName")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lastName") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            createdAt,
            email,
            referralStatus,
            referredBy,
            updatedAt,
            firstName,
            lastName,
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
        fun createdAt(): Long = createdAt.getRequired("createdAt")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun email(): String = email.getRequired("email")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun referralStatus(): ReferralStatus = referralStatus.getRequired("referralStatus")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun referredBy(): String = referredBy.getRequired("referredBy")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): Long = updatedAt.getRequired("updatedAt")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun firstName(): Optional<String> = firstName.getOptional("firstName")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun lastName(): Optional<String> = lastName.getOptional("lastName")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdAt") @ExcludeMissing fun _createdAt(): JsonField<Long> = createdAt

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [referralStatus].
         *
         * Unlike [referralStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("referralStatus")
        @ExcludeMissing
        fun _referralStatus(): JsonField<ReferralStatus> = referralStatus

        /**
         * Returns the raw JSON value of [referredBy].
         *
         * Unlike [referredBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("referredBy")
        @ExcludeMissing
        fun _referredBy(): JsonField<String> = referredBy

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updatedAt") @ExcludeMissing fun _updatedAt(): JsonField<Long> = updatedAt

        /**
         * Returns the raw JSON value of [firstName].
         *
         * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("firstName") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        /**
         * Returns the raw JSON value of [lastName].
         *
         * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lastName") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

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
             * Returns a mutable builder for constructing an instance of [Referral].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .createdAt()
             * .email()
             * .referralStatus()
             * .referredBy()
             * .updatedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Referral]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var createdAt: JsonField<Long>? = null
            private var email: JsonField<String>? = null
            private var referralStatus: JsonField<ReferralStatus>? = null
            private var referredBy: JsonField<String>? = null
            private var updatedAt: JsonField<Long>? = null
            private var firstName: JsonField<String> = JsonMissing.of()
            private var lastName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(referral: Referral) = apply {
                id = referral.id
                createdAt = referral.createdAt
                email = referral.email
                referralStatus = referral.referralStatus
                referredBy = referral.referredBy
                updatedAt = referral.updatedAt
                firstName = referral.firstName
                lastName = referral.lastName
                additionalProperties = referral.additionalProperties.toMutableMap()
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

            fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            fun referralStatus(referralStatus: ReferralStatus) =
                referralStatus(JsonField.of(referralStatus))

            /**
             * Sets [Builder.referralStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referralStatus] with a well-typed [ReferralStatus]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun referralStatus(referralStatus: JsonField<ReferralStatus>) = apply {
                this.referralStatus = referralStatus
            }

            fun referredBy(referredBy: String) = referredBy(JsonField.of(referredBy))

            /**
             * Sets [Builder.referredBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referredBy] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun referredBy(referredBy: JsonField<String>) = apply { this.referredBy = referredBy }

            fun updatedAt(updatedAt: Long) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<Long>) = apply { this.updatedAt = updatedAt }

            fun firstName(firstName: String?) = firstName(JsonField.ofNullable(firstName))

            /** Alias for calling [Builder.firstName] with `firstName.orElse(null)`. */
            fun firstName(firstName: Optional<String>) = firstName(firstName.getOrNull())

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            fun lastName(lastName: String?) = lastName(JsonField.ofNullable(lastName))

            /** Alias for calling [Builder.lastName] with `lastName.orElse(null)`. */
            fun lastName(lastName: Optional<String>) = lastName(lastName.getOrNull())

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

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
             * Returns an immutable instance of [Referral].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .createdAt()
             * .email()
             * .referralStatus()
             * .referredBy()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Referral =
                Referral(
                    checkRequired("id", id),
                    checkRequired("createdAt", createdAt),
                    checkRequired("email", email),
                    checkRequired("referralStatus", referralStatus),
                    checkRequired("referredBy", referredBy),
                    checkRequired("updatedAt", updatedAt),
                    firstName,
                    lastName,
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
        fun validate(): Referral = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            email()
            referralStatus().validate()
            referredBy()
            updatedAt()
            firstName()
            lastName()
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
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (email.asKnown().isPresent) 1 else 0) +
                (referralStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (if (referredBy.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (firstName.asKnown().isPresent) 1 else 0) +
                (if (lastName.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Referral &&
                id == other.id &&
                createdAt == other.createdAt &&
                email == other.email &&
                referralStatus == other.referralStatus &&
                referredBy == other.referredBy &&
                updatedAt == other.updatedAt &&
                firstName == other.firstName &&
                lastName == other.lastName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                email,
                referralStatus,
                referredBy,
                updatedAt,
                firstName,
                lastName,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Referral{id=$id, createdAt=$createdAt, email=$email, referralStatus=$referralStatus, referredBy=$referredBy, updatedAt=$updatedAt, firstName=$firstName, lastName=$lastName, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReferralList &&
            limit == other.limit &&
            more == other.more &&
            referrals == other.referrals &&
            nextId == other.nextId &&
            nextOffset == other.nextOffset &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(limit, more, referrals, nextId, nextOffset, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ReferralList{limit=$limit, more=$more, referrals=$referrals, nextId=$nextId, nextOffset=$nextOffset, additionalProperties=$additionalProperties}"
}
