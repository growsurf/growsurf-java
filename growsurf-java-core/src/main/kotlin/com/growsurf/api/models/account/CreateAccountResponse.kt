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
import kotlin.jvm.optionals.getOrNull

class CreateAccountResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val apiKey: JsonField<String>,
    private val email: JsonField<String>,
    private val id: JsonField<String>,
    private val verificationStatus: JsonField<VerificationStatus>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("apiKey") @ExcludeMissing apiKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("verificationStatus")
        @ExcludeMissing
        verificationStatus: JsonField<VerificationStatus> = JsonMissing.of(),
    ) : this(apiKey, email, id, verificationStatus, mutableMapOf())

    /**
     * An API key for the new account. Use it as the `Bearer` token on subsequent requests. Locked
     * (`403` `EMAIL_NOT_VERIFIED_ERROR`) until the account's email is verified, and rotated when
     * the account owner first signs in to the GrowSurf dashboard.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun apiKey(): String = apiKey.getRequired("apiKey")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun email(): String = email.getRequired("email")

    /**
     * The new account's unique identifier.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun verificationStatus(): VerificationStatus =
        verificationStatus.getRequired("verificationStatus")

    /**
     * Returns the raw JSON value of [apiKey].
     *
     * Unlike [apiKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("apiKey") @ExcludeMissing fun _apiKey(): JsonField<String> = apiKey

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
         * Returns a mutable builder for constructing an instance of [CreateAccountResponse].
         *
         * The following fields are required:
         * ```java
         * .apiKey()
         * .email()
         * .id()
         * .verificationStatus()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreateAccountResponse]. */
    class Builder internal constructor() {

        private var apiKey: JsonField<String>? = null
        private var email: JsonField<String>? = null
        private var id: JsonField<String>? = null
        private var verificationStatus: JsonField<VerificationStatus>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(createAccountResponse: CreateAccountResponse) = apply {
            apiKey = createAccountResponse.apiKey
            email = createAccountResponse.email
            id = createAccountResponse.id
            verificationStatus = createAccountResponse.verificationStatus
            additionalProperties = createAccountResponse.additionalProperties.toMutableMap()
        }

        /**
         * An API key for the new account. Use it as the `Bearer` token on subsequent requests.
         * Locked (`403` `EMAIL_NOT_VERIFIED_ERROR`) until the account's email is verified, and
         * rotated when the account owner first signs in to the GrowSurf dashboard.
         */
        fun apiKey(apiKey: String) = apiKey(JsonField.of(apiKey))

        /**
         * Sets [Builder.apiKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiKey] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun apiKey(apiKey: JsonField<String>) = apply { this.apiKey = apiKey }

        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** The new account's unique identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

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
         * Returns an immutable instance of [CreateAccountResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .apiKey()
         * .email()
         * .id()
         * .verificationStatus()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CreateAccountResponse =
            CreateAccountResponse(
                checkRequired("apiKey", apiKey),
                checkRequired("email", email),
                checkRequired("id", id),
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
    fun validate(): CreateAccountResponse = apply {
        if (validated) {
            return@apply
        }

        apiKey()
        email()
        id()
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
        (if (apiKey.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (verificationStatus.asKnown().getOrNull()?.validity() ?: 0)

    /** GrowSurf-team verification state. */
    class VerificationStatus
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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
            _value().asString().orElseThrow {
                GrowsurfInvalidDataException("Value is not a String")
            }

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

        return other is CreateAccountResponse &&
            apiKey == other.apiKey &&
            email == other.email &&
            id == other.id &&
            verificationStatus == other.verificationStatus &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(apiKey, email, id, verificationStatus, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreateAccountResponse{apiKey=$apiKey, email=$email, id=$id, verificationStatus=$verificationStatus, additionalProperties=$additionalProperties}"
}
