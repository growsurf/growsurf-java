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

class ParticipantSendInvitesResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val invitesSent: JsonField<Long>,
    private val messageType: JsonField<String>,
    private val success: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("invitesSent")
        @ExcludeMissing
        invitesSent: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("messageType")
        @ExcludeMissing
        messageType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
    ) : this(invitesSent, messageType, success, mutableMapOf())

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun invitesSent(): Long = invitesSent.getRequired("invitesSent")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messageType(): String = messageType.getRequired("messageType")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun success(): Boolean = success.getRequired("success")

    /**
     * Returns the raw JSON value of [invitesSent].
     *
     * Unlike [invitesSent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invitesSent") @ExcludeMissing fun _invitesSent(): JsonField<Long> = invitesSent

    /**
     * Returns the raw JSON value of [messageType].
     *
     * Unlike [messageType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("messageType") @ExcludeMissing fun _messageType(): JsonField<String> = messageType

    /**
     * Returns the raw JSON value of [success].
     *
     * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

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
         * [ParticipantSendInvitesResponse].
         *
         * The following fields are required:
         * ```java
         * .invitesSent()
         * .messageType()
         * .success()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ParticipantSendInvitesResponse]. */
    class Builder internal constructor() {

        private var invitesSent: JsonField<Long>? = null
        private var messageType: JsonField<String>? = null
        private var success: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(participantSendInvitesResponse: ParticipantSendInvitesResponse) = apply {
            invitesSent = participantSendInvitesResponse.invitesSent
            messageType = participantSendInvitesResponse.messageType
            success = participantSendInvitesResponse.success
            additionalProperties =
                participantSendInvitesResponse.additionalProperties.toMutableMap()
        }

        fun invitesSent(invitesSent: Long) = invitesSent(JsonField.of(invitesSent))

        /**
         * Sets [Builder.invitesSent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invitesSent] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun invitesSent(invitesSent: JsonField<Long>) = apply { this.invitesSent = invitesSent }

        fun messageType(messageType: String) = messageType(JsonField.of(messageType))

        /**
         * Sets [Builder.messageType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun messageType(messageType: JsonField<String>) = apply { this.messageType = messageType }

        fun success(success: Boolean) = success(JsonField.of(success))

        /**
         * Sets [Builder.success] to an arbitrary JSON value.
         *
         * You should usually call [Builder.success] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun success(success: JsonField<Boolean>) = apply { this.success = success }

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
         * Returns an immutable instance of [ParticipantSendInvitesResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .invitesSent()
         * .messageType()
         * .success()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ParticipantSendInvitesResponse =
            ParticipantSendInvitesResponse(
                checkRequired("invitesSent", invitesSent),
                checkRequired("messageType", messageType),
                checkRequired("success", success),
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
    fun validate(): ParticipantSendInvitesResponse = apply {
        if (validated) {
            return@apply
        }

        invitesSent()
        messageType()
        success()
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
        (if (invitesSent.asKnown().isPresent) 1 else 0) +
            (if (messageType.asKnown().isPresent) 1 else 0) +
            (if (success.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParticipantSendInvitesResponse &&
            invitesSent == other.invitesSent &&
            messageType == other.messageType &&
            success == other.success &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(invitesSent, messageType, success, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ParticipantSendInvitesResponse{invitesSent=$invitesSent, messageType=$messageType, success=$success, additionalProperties=$additionalProperties}"
}
