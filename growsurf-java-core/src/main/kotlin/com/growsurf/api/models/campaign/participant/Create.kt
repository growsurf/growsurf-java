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
import com.growsurf.api.core.toImmutable
import com.growsurf.api.errors.GrowsurfInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Create
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val email: JsonField<String>,
    private val fingerprint: JsonField<String>,
    private val firstName: JsonField<String>,
    private val ipAddress: JsonField<String>,
    private val lastName: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val mobileInstanceId: JsonField<String>,
    private val referralStatus: JsonField<ReferralStatus>,
    private val referredBy: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fingerprint")
        @ExcludeMissing
        fingerprint: JsonField<String> = JsonMissing.of(),
        @JsonProperty("firstName") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ipAddress") @ExcludeMissing ipAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastName") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("mobileInstanceId")
        @ExcludeMissing
        mobileInstanceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("referralStatus")
        @ExcludeMissing
        referralStatus: JsonField<ReferralStatus> = JsonMissing.of(),
        @JsonProperty("referredBy") @ExcludeMissing referredBy: JsonField<String> = JsonMissing.of(),
    ) : this(
        email,
        fingerprint,
        firstName,
        ipAddress,
        lastName,
        metadata,
        mobileInstanceId,
        referralStatus,
        referredBy,
        mutableMapOf(),
    )

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun email(): String = email.getRequired("email")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fingerprint(): Optional<String> = fingerprint.getOptional("fingerprint")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstName(): Optional<String> = firstName.getOptional("firstName")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ipAddress(): Optional<String> = ipAddress.getOptional("ipAddress")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastName(): Optional<String> = lastName.getOptional("lastName")

    /**
     * Shallow custom metadata object.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

    /**
     * Optional app-install scoped identifier for native mobile anti-fraud. Recommended for mobile
     * participant creation and mobile participant token flows. The official mobile SDKs generate
     * this as a lowercase UUID.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mobileInstanceId(): Optional<String> = mobileInstanceId.getOptional("mobileInstanceId")

    /**
     * The referral credit status, only meaningful when `referredBy` resolves to a referrer. When
     * omitted, it is derived from the program's referral trigger (`CREDIT_AWARDED`,
     * `CREDIT_PENDING`, or `CREDIT_EXPIRED`); left unset when no referrer resolves.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referralStatus(): Optional<ReferralStatus> = referralStatus.getOptional("referralStatus")

    /**
     * Referrer participant ID or email address.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referredBy(): Optional<String> = referredBy.getOptional("referredBy")

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [fingerprint].
     *
     * Unlike [fingerprint], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fingerprint") @ExcludeMissing fun _fingerprint(): JsonField<String> = fingerprint

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("firstName") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

    /**
     * Returns the raw JSON value of [ipAddress].
     *
     * Unlike [ipAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ipAddress") @ExcludeMissing fun _ipAddress(): JsonField<String> = ipAddress

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastName") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [mobileInstanceId].
     *
     * Unlike [mobileInstanceId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("mobileInstanceId")
    @ExcludeMissing
    fun _mobileInstanceId(): JsonField<String> = mobileInstanceId

    /**
     * Returns the raw JSON value of [referralStatus].
     *
     * Unlike [referralStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("referralStatus")
    @ExcludeMissing
    fun _referralStatus(): JsonField<ReferralStatus> = referralStatus

    /**
     * Returns the raw JSON value of [referredBy].
     *
     * Unlike [referredBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("referredBy") @ExcludeMissing fun _referredBy(): JsonField<String> = referredBy

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
         * Returns a mutable builder for constructing an instance of [Create].
         *
         * The following fields are required:
         * ```java
         * .email()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Create]. */
    class Builder internal constructor() {

        private var email: JsonField<String>? = null
        private var fingerprint: JsonField<String> = JsonMissing.of()
        private var firstName: JsonField<String> = JsonMissing.of()
        private var ipAddress: JsonField<String> = JsonMissing.of()
        private var lastName: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var mobileInstanceId: JsonField<String> = JsonMissing.of()
        private var referralStatus: JsonField<ReferralStatus> = JsonMissing.of()
        private var referredBy: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(create: Create) = apply {
            email = create.email
            fingerprint = create.fingerprint
            firstName = create.firstName
            ipAddress = create.ipAddress
            lastName = create.lastName
            metadata = create.metadata
            mobileInstanceId = create.mobileInstanceId
            referralStatus = create.referralStatus
            referredBy = create.referredBy
            additionalProperties = create.additionalProperties.toMutableMap()
        }

        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        fun fingerprint(fingerprint: String) = fingerprint(JsonField.of(fingerprint))

        /**
         * Sets [Builder.fingerprint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fingerprint] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fingerprint(fingerprint: JsonField<String>) = apply { this.fingerprint = fingerprint }

        fun firstName(firstName: String) = firstName(JsonField.of(firstName))

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        fun ipAddress(ipAddress: String) = ipAddress(JsonField.of(ipAddress))

        /**
         * Sets [Builder.ipAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ipAddress] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ipAddress(ipAddress: JsonField<String>) = apply { this.ipAddress = ipAddress }

        fun lastName(lastName: String) = lastName(JsonField.of(lastName))

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        /** Shallow custom metadata object. */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /**
         * Optional app-install scoped identifier for native mobile anti-fraud. Recommended for
         * mobile participant creation and mobile participant token flows. The official mobile SDKs
         * generate this as a lowercase UUID.
         */
        fun mobileInstanceId(mobileInstanceId: String) =
            mobileInstanceId(JsonField.of(mobileInstanceId))

        /**
         * Sets [Builder.mobileInstanceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mobileInstanceId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mobileInstanceId(mobileInstanceId: JsonField<String>) = apply {
            this.mobileInstanceId = mobileInstanceId
        }

        /**
         * The referral credit status, only meaningful when `referredBy` resolves to a referrer.
         * When omitted, it is derived from the program's referral trigger (`CREDIT_AWARDED`,
         * `CREDIT_PENDING`, or `CREDIT_EXPIRED`); left unset when no referrer resolves.
         */
        fun referralStatus(referralStatus: ReferralStatus) =
            referralStatus(JsonField.of(referralStatus))

        /**
         * Sets [Builder.referralStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referralStatus] with a well-typed [ReferralStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referralStatus(referralStatus: JsonField<ReferralStatus>) = apply {
            this.referralStatus = referralStatus
        }

        /** Referrer participant ID or email address. */
        fun referredBy(referredBy: String) = referredBy(JsonField.of(referredBy))

        /**
         * Sets [Builder.referredBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referredBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun referredBy(referredBy: JsonField<String>) = apply { this.referredBy = referredBy }

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
         * Returns an immutable instance of [Create].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .email()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Create =
            Create(
                checkRequired("email", email),
                fingerprint,
                firstName,
                ipAddress,
                lastName,
                metadata,
                mobileInstanceId,
                referralStatus,
                referredBy,
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
    fun validate(): Create = apply {
        if (validated) {
            return@apply
        }

        email()
        fingerprint()
        firstName()
        ipAddress()
        lastName()
        metadata().ifPresent { it.validate() }
        mobileInstanceId()
        referralStatus().ifPresent { it.validate() }
        referredBy()
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
        (if (email.asKnown().isPresent) 1 else 0) +
            (if (fingerprint.asKnown().isPresent) 1 else 0) +
            (if (firstName.asKnown().isPresent) 1 else 0) +
            (if (ipAddress.asKnown().isPresent) 1 else 0) +
            (if (lastName.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (if (mobileInstanceId.asKnown().isPresent) 1 else 0) +
            (referralStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (if (referredBy.asKnown().isPresent) 1 else 0)

    /** Shallow custom metadata object. */
    class Metadata
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

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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
        fun validate(): Metadata = apply {
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

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    class ReferralStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val CREDIT_PENDING = of("CREDIT_PENDING")

            @JvmField val CREDIT_AWARDED = of("CREDIT_AWARDED")

            @JvmStatic fun of(value: String) = ReferralStatus(JsonField.of(value))
        }

        /** An enum containing [ReferralStatus]'s known values. */
        enum class Known {
            CREDIT_PENDING,
            CREDIT_AWARDED,
        }

        /**
         * An enum containing [ReferralStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ReferralStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CREDIT_PENDING,
            CREDIT_AWARDED,
            /**
             * An enum member indicating that [ReferralStatus] was instantiated with an unknown
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
                CREDIT_PENDING -> Value.CREDIT_PENDING
                CREDIT_AWARDED -> Value.CREDIT_AWARDED
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
                CREDIT_PENDING -> Known.CREDIT_PENDING
                CREDIT_AWARDED -> Known.CREDIT_AWARDED
                else -> throw GrowsurfInvalidDataException("Unknown ReferralStatus: $value")
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
        fun validate(): ReferralStatus = apply {
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

            return other is ReferralStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Create &&
            email == other.email &&
            fingerprint == other.fingerprint &&
            firstName == other.firstName &&
            ipAddress == other.ipAddress &&
            lastName == other.lastName &&
            metadata == other.metadata &&
            mobileInstanceId == other.mobileInstanceId &&
            referralStatus == other.referralStatus &&
            referredBy == other.referredBy &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            email,
            fingerprint,
            firstName,
            ipAddress,
            lastName,
            metadata,
            mobileInstanceId,
            referralStatus,
            referredBy,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Create{email=$email, fingerprint=$fingerprint, firstName=$firstName, ipAddress=$ipAddress, lastName=$lastName, metadata=$metadata, mobileInstanceId=$mobileInstanceId, referralStatus=$referralStatus, referredBy=$referredBy, additionalProperties=$additionalProperties}"
}
