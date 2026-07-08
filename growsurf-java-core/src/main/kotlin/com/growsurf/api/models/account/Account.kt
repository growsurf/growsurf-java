// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.account

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A GrowSurf account: profile and GrowSurf-team verification state. */
class Account
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val company: JsonField<String>,
    private val createdAt: JsonField<Long>,
    private val email: JsonField<String>,
    private val firstName: JsonField<String>,
    private val id: JsonField<String>,
    private val lastName: JsonField<String>,
    private val verificationRequestedAt: JsonField<Long>,
    private val verificationStatus: JsonField<VerificationStatus>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("company") @ExcludeMissing company: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt") @ExcludeMissing createdAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("firstName") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastName") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("verificationRequestedAt")
        @ExcludeMissing
        verificationRequestedAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("verificationStatus")
        @ExcludeMissing
        verificationStatus: JsonField<VerificationStatus> = JsonMissing.of(),
    ) : this(
        company,
        createdAt,
        email,
        firstName,
        id,
        lastName,
        verificationRequestedAt,
        verificationStatus,
        mutableMapOf(),
    )

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun company(): Optional<String> = company.getOptional("company")

    /**
     * When the account was created, as a Unix timestamp in milliseconds.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<Long> = createdAt.getOptional("createdAt")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun email(): String = email.getRequired("email")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstName(): Optional<String> = firstName.getOptional("firstName")

    /**
     * The account's unique identifier.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastName(): Optional<String> = lastName.getOptional("lastName")

    /**
     * When team verification was last requested, as a Unix timestamp in milliseconds.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun verificationRequestedAt(): Optional<Long> =
        verificationRequestedAt.getOptional("verificationRequestedAt")

    /**
     * GrowSurf-team verification state. `VERIFIED` is required before a program can send participant
     * emails.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun verificationStatus(): VerificationStatus =
        verificationStatus.getRequired("verificationStatus")

    /**
     * Returns the raw JSON value of [company].
     *
     * Unlike [company], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("company") @ExcludeMissing fun _company(): JsonField<String> = company

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
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("firstName") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastName") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

    /**
     * Returns the raw JSON value of [verificationRequestedAt].
     *
     * Unlike [verificationRequestedAt], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("verificationRequestedAt")
    @ExcludeMissing
    fun _verificationRequestedAt(): JsonField<Long> = verificationRequestedAt

    /**
     * Returns the raw JSON value of [verificationStatus].
     *
     * Unlike [verificationStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("verificationStatus")
    @ExcludeMissing
    fun _verificationStatus(): JsonField<VerificationStatus> = verificationStatus

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
         * Returns a mutable builder for constructing an instance of [Account].
         *
         * The following fields are required:
         * ```java
         * .email()
         * .id()
         * .verificationStatus()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Account]. */
    class Builder internal constructor() {

        private var company: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<Long> = JsonMissing.of()
        private var email: JsonField<String>? = null
        private var firstName: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String>? = null
        private var lastName: JsonField<String> = JsonMissing.of()
        private var verificationRequestedAt: JsonField<Long> = JsonMissing.of()
        private var verificationStatus: JsonField<VerificationStatus>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(account: Account) = apply {
            company = account.company
            createdAt = account.createdAt
            email = account.email
            firstName = account.firstName
            id = account.id
            lastName = account.lastName
            verificationRequestedAt = account.verificationRequestedAt
            verificationStatus = account.verificationStatus
            additionalProperties = account.additionalProperties.toMutableMap()
        }

        fun company(company: String?) = company(JsonField.ofNullable(company))

        /** Alias for calling [Builder.company] with `company.orElse(null)`. */
        fun company(company: Optional<String>) = company(company.getOrNull())

        /**
         * Sets [Builder.company] to an arbitrary JSON value.
         *
         * You should usually call [Builder.company] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun company(company: JsonField<String>) = apply { this.company = company }

        /** When the account was created, as a Unix timestamp in milliseconds. */
        fun createdAt(createdAt: Long?) = createdAt(JsonField.ofNullable(createdAt))

        /**
         * Alias for [Builder.createdAt].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun createdAt(createdAt: Long) = createdAt(createdAt as Long?)

        /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
        fun createdAt(createdAt: Optional<Long>) = createdAt(createdAt.getOrNull())

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        fun firstName(firstName: String?) = firstName(JsonField.ofNullable(firstName))

        /** Alias for calling [Builder.firstName] with `firstName.orElse(null)`. */
        fun firstName(firstName: Optional<String>) = firstName(firstName.getOrNull())

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        /** The account's unique identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun lastName(lastName: String?) = lastName(JsonField.ofNullable(lastName))

        /** Alias for calling [Builder.lastName] with `lastName.orElse(null)`. */
        fun lastName(lastName: Optional<String>) = lastName(lastName.getOrNull())

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        /** When team verification was last requested, as a Unix timestamp in milliseconds. */
        fun verificationRequestedAt(verificationRequestedAt: Long?) =
            verificationRequestedAt(JsonField.ofNullable(verificationRequestedAt))

        /**
         * Alias for [Builder.verificationRequestedAt].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun verificationRequestedAt(verificationRequestedAt: Long) =
            verificationRequestedAt(verificationRequestedAt as Long?)

        /**
         * Alias for calling [Builder.verificationRequestedAt] with
         * `verificationRequestedAt.orElse(null)`.
         */
        fun verificationRequestedAt(verificationRequestedAt: Optional<Long>) =
            verificationRequestedAt(verificationRequestedAt.getOrNull())

        /**
         * Sets [Builder.verificationRequestedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verificationRequestedAt] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun verificationRequestedAt(verificationRequestedAt: JsonField<Long>) = apply {
            this.verificationRequestedAt = verificationRequestedAt
        }

        /**
         * GrowSurf-team verification state. `VERIFIED` is required before a program can send
         * participant emails.
         */
        fun verificationStatus(verificationStatus: VerificationStatus) =
            verificationStatus(JsonField.of(verificationStatus))

        /**
         * Sets [Builder.verificationStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verificationStatus] with a well-typed
         * [VerificationStatus] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun verificationStatus(verificationStatus: JsonField<VerificationStatus>) = apply {
            this.verificationStatus = verificationStatus
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
         * Returns an immutable instance of [Account].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .email()
         * .id()
         * .verificationStatus()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Account =
            Account(
                company,
                createdAt,
                checkRequired("email", email),
                firstName,
                checkRequired("id", id),
                lastName,
                verificationRequestedAt,
                checkRequired("verificationStatus", verificationStatus),
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
    fun validate(): Account = apply {
        if (validated) {
            return@apply
        }

        company()
        createdAt()
        email()
        firstName()
        id()
        lastName()
        verificationRequestedAt()
        verificationStatus().validate()
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
        (if (company.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (firstName.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (lastName.asKnown().isPresent) 1 else 0) +
            (if (verificationRequestedAt.asKnown().isPresent) 1 else 0) +
            (verificationStatus.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * GrowSurf-team verification state. `VERIFIED` is required before a program can send participant
     * emails.
     */
    class VerificationStatus @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't match
         * any known member, and you want to know that value. For example, if the SDK is on an older
         * version than the API, then the API may respond with new members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val NOT_REQUESTED = of("NOT_REQUESTED")

            @JvmField val REQUESTED = of("REQUESTED")

            @JvmField val VERIFIED = of("VERIFIED")

            @JvmStatic fun of(value: String) = VerificationStatus(JsonField.of(value))
        }

        /** An enum containing [VerificationStatus]'s known values. */
        enum class Known {
            NOT_REQUESTED,
            REQUESTED,
            VERIFIED,
        }

        /**
         * An enum containing [VerificationStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [VerificationStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NOT_REQUESTED,
            REQUESTED,
            VERIFIED,
            /**
             * An enum member indicating that [VerificationStatus] was instantiated with an unknown
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
                NOT_REQUESTED -> Value.NOT_REQUESTED
                REQUESTED -> Value.REQUESTED
                VERIFIED -> Value.VERIFIED
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
                NOT_REQUESTED -> Known.NOT_REQUESTED
                REQUESTED -> Known.REQUESTED
                VERIFIED -> Known.VERIFIED
                else -> throw GrowsurfInvalidDataException("Unknown VerificationStatus: $value")
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
            _value().asString().orElseThrow { GrowsurfInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): VerificationStatus = apply {
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is VerificationStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Account &&
            company == other.company &&
            createdAt == other.createdAt &&
            email == other.email &&
            firstName == other.firstName &&
            id == other.id &&
            lastName == other.lastName &&
            verificationRequestedAt == other.verificationRequestedAt &&
            verificationStatus == other.verificationStatus &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            company,
            createdAt,
            email,
            firstName,
            id,
            lastName,
            verificationRequestedAt,
            verificationStatus,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Account{company=$company, createdAt=$createdAt, email=$email, firstName=$firstName, id=$id, lastName=$lastName, verificationRequestedAt=$verificationRequestedAt, verificationStatus=$verificationStatus, additionalProperties=$additionalProperties}"
}
