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
import com.growsurf.api.core.checkRequired
import com.growsurf.api.errors.GrowsurfInvalidDataException
import com.growsurf.api.models.campaign.participant.Participant
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class CampaignCreateMobileParticipantTokenResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val expiresIn: JsonField<Long>,
    private val isNew: JsonField<Boolean>,
    private val participant: JsonField<Participant>,
    private val participantToken: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("expiresIn") @ExcludeMissing expiresIn: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("isNew") @ExcludeMissing isNew: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("participant")
        @ExcludeMissing
        participant: JsonField<Participant> = JsonMissing.of(),
        @JsonProperty("participantToken")
        @ExcludeMissing
        participantToken: JsonField<String> = JsonMissing.of(),
    ) : this(expiresIn, isNew, participant, participantToken, mutableMapOf())

    /**
     * Token lifetime in seconds.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiresIn(): Long = expiresIn.getRequired("expiresIn")

    /**
     * Whether this request created a new participant. Returns false when the participant already
     * existed.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isNew(): Boolean = isNew.getRequired("isNew")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun participant(): Participant = participant.getRequired("participant")

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
     * Returns the raw JSON value of [isNew].
     *
     * Unlike [isNew], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isNew") @ExcludeMissing fun _isNew(): JsonField<Boolean> = isNew

    /**
     * Returns the raw JSON value of [participant].
     *
     * Unlike [participant], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("participant")
    @ExcludeMissing
    fun _participant(): JsonField<Participant> = participant

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
         * [CampaignCreateMobileParticipantTokenResponse].
         *
         * The following fields are required:
         * ```java
         * .expiresIn()
         * .isNew()
         * .participant()
         * .participantToken()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CampaignCreateMobileParticipantTokenResponse]. */
    class Builder internal constructor() {

        private var expiresIn: JsonField<Long>? = null
        private var isNew: JsonField<Boolean>? = null
        private var participant: JsonField<Participant>? = null
        private var participantToken: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            campaignCreateMobileParticipantTokenResponse:
                CampaignCreateMobileParticipantTokenResponse
        ) = apply {
            expiresIn = campaignCreateMobileParticipantTokenResponse.expiresIn
            isNew = campaignCreateMobileParticipantTokenResponse.isNew
            participant = campaignCreateMobileParticipantTokenResponse.participant
            participantToken = campaignCreateMobileParticipantTokenResponse.participantToken
            additionalProperties =
                campaignCreateMobileParticipantTokenResponse.additionalProperties.toMutableMap()
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

        /**
         * Whether this request created a new participant. Returns false when the participant
         * already existed.
         */
        fun isNew(isNew: Boolean) = isNew(JsonField.of(isNew))

        /**
         * Sets [Builder.isNew] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isNew] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun isNew(isNew: JsonField<Boolean>) = apply { this.isNew = isNew }

        fun participant(participant: Participant) = participant(JsonField.of(participant))

        /**
         * Sets [Builder.participant] to an arbitrary JSON value.
         *
         * You should usually call [Builder.participant] with a well-typed [Participant] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun participant(participant: JsonField<Participant>) = apply {
            this.participant = participant
        }

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
         * Returns an immutable instance of [CampaignCreateMobileParticipantTokenResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .expiresIn()
         * .isNew()
         * .participant()
         * .participantToken()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CampaignCreateMobileParticipantTokenResponse =
            CampaignCreateMobileParticipantTokenResponse(
                checkRequired("expiresIn", expiresIn),
                checkRequired("isNew", isNew),
                checkRequired("participant", participant),
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
    fun validate(): CampaignCreateMobileParticipantTokenResponse = apply {
        if (validated) {
            return@apply
        }

        expiresIn()
        isNew()
        participant().validate()
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
            (if (isNew.asKnown().isPresent) 1 else 0) +
            (participant.asKnown().getOrNull()?.validity() ?: 0) +
            (if (participantToken.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CampaignCreateMobileParticipantTokenResponse &&
            expiresIn == other.expiresIn &&
            isNew == other.isNew &&
            participant == other.participant &&
            participantToken == other.participantToken &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(expiresIn, isNew, participant, participantToken, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CampaignCreateMobileParticipantTokenResponse{expiresIn=$expiresIn, isNew=$isNew, participant=$participant, participantToken=$participantToken, additionalProperties=$additionalProperties}"
}
