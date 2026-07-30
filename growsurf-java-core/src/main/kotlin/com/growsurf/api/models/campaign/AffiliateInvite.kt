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

class AffiliateInvite
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val acceptedAt: JsonField<Long>,
    private val createdAt: JsonField<Long>,
    private val email: JsonField<String>,
    private val expiresAt: JsonField<Long>,
    private val firstName: JsonField<String>,
    private val id: JsonField<String>,
    private val lastName: JsonField<String>,
    private val lastSentAt: JsonField<Long>,
    private val revokedAt: JsonField<Long>,
    private val status: JsonField<Status>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("acceptedAt") @ExcludeMissing acceptedAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("createdAt") @ExcludeMissing createdAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expiresAt") @ExcludeMissing expiresAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("firstName") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastName") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastSentAt") @ExcludeMissing lastSentAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("revokedAt") @ExcludeMissing revokedAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
    ) : this(
        acceptedAt,
        createdAt,
        email,
        expiresAt,
        firstName,
        id,
        lastName,
        lastSentAt,
        revokedAt,
        status,
        mutableMapOf(),
    )

    /**
     * When the invite was accepted, in Unix milliseconds. `null` until accepted.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun acceptedAt(): Optional<Long> = acceptedAt.getOptional("acceptedAt")

    /**
     * When the invite was created, in Unix milliseconds.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<Long> = createdAt.getOptional("createdAt")

    /**
     * Invitee email address.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): Optional<String> = email.getOptional("email")

    /**
     * When the emailed accept link stops working, in Unix milliseconds.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiresAt(): Optional<Long> = expiresAt.getOptional("expiresAt")

    /**
     * Invitee first name, when provided.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstName(): Optional<String> = firstName.getOptional("firstName")

    /**
     * Invite ID.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Invitee last name, when provided.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastName(): Optional<String> = lastName.getOptional("lastName")

    /**
     * When the invite email was last sent, in Unix milliseconds.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastSentAt(): Optional<Long> = lastSentAt.getOptional("lastSentAt")

    /**
     * When the invite was revoked, in Unix milliseconds. `null` unless revoked.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun revokedAt(): Optional<Long> = revokedAt.getOptional("revokedAt")

    /**
     * The invite's lifecycle state. Accepting a pending invite enrolls the invitee as an approved
     * affiliate.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * Returns the raw JSON value of [acceptedAt].
     *
     * Unlike [acceptedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("acceptedAt") @ExcludeMissing fun _acceptedAt(): JsonField<Long> = acceptedAt

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
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiresAt") @ExcludeMissing fun _expiresAt(): JsonField<Long> = expiresAt

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
     * Returns the raw JSON value of [lastSentAt].
     *
     * Unlike [lastSentAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastSentAt") @ExcludeMissing fun _lastSentAt(): JsonField<Long> = lastSentAt

    /**
     * Returns the raw JSON value of [revokedAt].
     *
     * Unlike [revokedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("revokedAt") @ExcludeMissing fun _revokedAt(): JsonField<Long> = revokedAt

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

        /** Returns a mutable builder for constructing an instance of [AffiliateInvite]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AffiliateInvite]. */
    class Builder internal constructor() {

        private var acceptedAt: JsonField<Long> = JsonMissing.of()
        private var createdAt: JsonField<Long> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var expiresAt: JsonField<Long> = JsonMissing.of()
        private var firstName: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var lastName: JsonField<String> = JsonMissing.of()
        private var lastSentAt: JsonField<Long> = JsonMissing.of()
        private var revokedAt: JsonField<Long> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(affiliateInvite: AffiliateInvite) = apply {
            acceptedAt = affiliateInvite.acceptedAt
            createdAt = affiliateInvite.createdAt
            email = affiliateInvite.email
            expiresAt = affiliateInvite.expiresAt
            firstName = affiliateInvite.firstName
            id = affiliateInvite.id
            lastName = affiliateInvite.lastName
            lastSentAt = affiliateInvite.lastSentAt
            revokedAt = affiliateInvite.revokedAt
            status = affiliateInvite.status
            additionalProperties = affiliateInvite.additionalProperties.toMutableMap()
        }

        /** When the invite was accepted, in Unix milliseconds. `null` until accepted. */
        fun acceptedAt(acceptedAt: Long?) = acceptedAt(JsonField.ofNullable(acceptedAt))

        /**
         * Alias for [Builder.acceptedAt].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun acceptedAt(acceptedAt: Long) = acceptedAt(acceptedAt as Long?)

        /** Alias for calling [Builder.acceptedAt] with `acceptedAt.orElse(null)`. */
        fun acceptedAt(acceptedAt: Optional<Long>) = acceptedAt(acceptedAt.getOrNull())

        /**
         * Sets [Builder.acceptedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acceptedAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun acceptedAt(acceptedAt: JsonField<Long>) = apply { this.acceptedAt = acceptedAt }

        /** When the invite was created, in Unix milliseconds. */
        fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

        /** Invitee email address. */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** When the emailed accept link stops working, in Unix milliseconds. */
        fun expiresAt(expiresAt: Long) = expiresAt(JsonField.of(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun expiresAt(expiresAt: JsonField<Long>) = apply { this.expiresAt = expiresAt }

        /** Invitee first name, when provided. */
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

        /** Invite ID. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Invitee last name, when provided. */
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

        /** When the invite email was last sent, in Unix milliseconds. */
        fun lastSentAt(lastSentAt: Long) = lastSentAt(JsonField.of(lastSentAt))

        /**
         * Sets [Builder.lastSentAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastSentAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastSentAt(lastSentAt: JsonField<Long>) = apply { this.lastSentAt = lastSentAt }

        /** When the invite was revoked, in Unix milliseconds. `null` unless revoked. */
        fun revokedAt(revokedAt: Long?) = revokedAt(JsonField.ofNullable(revokedAt))

        /**
         * Alias for [Builder.revokedAt].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun revokedAt(revokedAt: Long) = revokedAt(revokedAt as Long?)

        /** Alias for calling [Builder.revokedAt] with `revokedAt.orElse(null)`. */
        fun revokedAt(revokedAt: Optional<Long>) = revokedAt(revokedAt.getOrNull())

        /**
         * Sets [Builder.revokedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.revokedAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun revokedAt(revokedAt: JsonField<Long>) = apply { this.revokedAt = revokedAt }

        /**
         * The invite's lifecycle state. Accepting a pending invite enrolls the invitee as an
         * approved affiliate.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

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
         * Returns an immutable instance of [AffiliateInvite].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AffiliateInvite =
            AffiliateInvite(
                acceptedAt,
                createdAt,
                email,
                expiresAt,
                firstName,
                id,
                lastName,
                lastSentAt,
                revokedAt,
                status,
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
    fun validate(): AffiliateInvite = apply {
        if (validated) {
            return@apply
        }

        acceptedAt()
        createdAt()
        email()
        expiresAt()
        firstName()
        id()
        lastName()
        lastSentAt()
        revokedAt()
        status().ifPresent { it.validate() }
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
        (if (acceptedAt.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (if (firstName.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (lastName.asKnown().isPresent) 1 else 0) +
            (if (lastSentAt.asKnown().isPresent) 1 else 0) +
            (if (revokedAt.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * The invite's lifecycle state. Accepting a pending invite enrolls the invitee as an approved
     * affiliate.
     */
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

            @JvmField val ACCEPTED = of("ACCEPTED")

            @JvmField val EXPIRED = of("EXPIRED")

            @JvmField val REVOKED = of("REVOKED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            ACCEPTED,
            EXPIRED,
            REVOKED,
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
            ACCEPTED,
            EXPIRED,
            REVOKED,
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
                ACCEPTED -> Value.ACCEPTED
                EXPIRED -> Value.EXPIRED
                REVOKED -> Value.REVOKED
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
                ACCEPTED -> Known.ACCEPTED
                EXPIRED -> Known.EXPIRED
                REVOKED -> Known.REVOKED
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

        return other is AffiliateInvite &&
            acceptedAt == other.acceptedAt &&
            createdAt == other.createdAt &&
            email == other.email &&
            expiresAt == other.expiresAt &&
            firstName == other.firstName &&
            id == other.id &&
            lastName == other.lastName &&
            lastSentAt == other.lastSentAt &&
            revokedAt == other.revokedAt &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            acceptedAt,
            createdAt,
            email,
            expiresAt,
            firstName,
            id,
            lastName,
            lastSentAt,
            revokedAt,
            status,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AffiliateInvite{acceptedAt=$acceptedAt, createdAt=$createdAt, email=$email, expiresAt=$expiresAt, firstName=$firstName, id=$id, lastName=$lastName, lastSentAt=$lastSentAt, revokedAt=$revokedAt, status=$status, additionalProperties=$additionalProperties}"
}
