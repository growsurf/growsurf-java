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
import com.growsurf.api.core.checkRequired
import com.growsurf.api.errors.GrowsurfInvalidDataException
import java.util.Collections
import java.util.Objects

class ParticipantCreateMobileTokenResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val expiresIn: JsonField<Long>,
    private val participantToken: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("expiresIn") @ExcludeMissing expiresIn: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("participantToken")
        @ExcludeMissing
        participantToken: JsonField<String> = JsonMissing.of(),
    ) : this(expiresIn, participantToken, mutableMapOf())

    /**
     * Token lifetime in seconds.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiresIn(): Long = expiresIn.getRequired("expiresIn")

    /**
     * Participant-scoped bearer token for GrowSurf mobile SDK participant endpoints.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun participantToken(): String = participantToken.getRequired("participantToken")

    /**
     * Returns the raw JSON value of [expiresIn].
     *
     * Unlike [expiresIn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiresIn") @ExcludeMissing fun _expiresIn(): JsonField<Long> = expiresIn

    /**
     * Returns the raw JSON value of [participantToken].
     *
     * Unlike [participantToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("participantToken")
    @ExcludeMissing
    fun _participantToken(): JsonField<String> = participantToken

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
         * [ParticipantCreateMobileTokenResponse].
         *
         * The following fields are required:
         * ```java
         * .expiresIn()
         * .participantToken()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ParticipantCreateMobileTokenResponse]. */
    class Builder internal constructor() {

        private var expiresIn: JsonField<Long>? = null
        private var participantToken: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            participantCreateMobileTokenResponse: ParticipantCreateMobileTokenResponse
        ) = apply {
            expiresIn = participantCreateMobileTokenResponse.expiresIn
            participantToken = participantCreateMobileTokenResponse.participantToken
            additionalProperties =
                participantCreateMobileTokenResponse.additionalProperties.toMutableMap()
        }

        /** Token lifetime in seconds. */
        fun expiresIn(expiresIn: Long) = expiresIn(JsonField.of(expiresIn))

        /**
         * Sets [Builder.expiresIn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresIn] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun expiresIn(expiresIn: JsonField<Long>) = apply { this.expiresIn = expiresIn }

        /** Participant-scoped bearer token for GrowSurf mobile SDK participant endpoints. */
        fun participantToken(participantToken: String) =
            participantToken(JsonField.of(participantToken))

        /**
         * Sets [Builder.participantToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.participantToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun participantToken(participantToken: JsonField<String>) = apply {
            this.participantToken = participantToken
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
         * Returns an immutable instance of [ParticipantCreateMobileTokenResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .expiresIn()
         * .participantToken()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ParticipantCreateMobileTokenResponse =
            ParticipantCreateMobileTokenResponse(
                checkRequired("expiresIn", expiresIn),
                checkRequired("participantToken", participantToken),
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
    fun validate(): ParticipantCreateMobileTokenResponse = apply {
        if (validated) {
            return@apply
        }

        expiresIn()
        participantToken()
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
        (if (expiresIn.asKnown().isPresent) 1 else 0) +
            (if (participantToken.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParticipantCreateMobileTokenResponse &&
            expiresIn == other.expiresIn &&
            participantToken == other.participantToken &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(expiresIn, participantToken, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ParticipantCreateMobileTokenResponse{expiresIn=$expiresIn, participantToken=$participantToken, additionalProperties=$additionalProperties}"
}
