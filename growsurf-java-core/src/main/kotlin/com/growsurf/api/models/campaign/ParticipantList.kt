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
import com.growsurf.api.models.campaign.participant.Participant
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ParticipantList
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val limit: JsonField<Long>,
    private val nextId: JsonField<String>,
    private val participants: JsonField<List<Participant>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("nextId") @ExcludeMissing nextId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("participants")
        @ExcludeMissing
        participants: JsonField<List<Participant>> = JsonMissing.of(),
    ) : this(limit, nextId, participants, mutableMapOf())

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun limit(): Long = limit.getRequired("limit")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextId(): Optional<String> = nextId.getOptional("nextId")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun participants(): List<Participant> = participants.getRequired("participants")

    /**
     * Returns the raw JSON value of [limit].
     *
     * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Long> = limit

    /**
     * Returns the raw JSON value of [nextId].
     *
     * Unlike [nextId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nextId") @ExcludeMissing fun _nextId(): JsonField<String> = nextId

    /**
     * Returns the raw JSON value of [participants].
     *
     * Unlike [participants], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("participants")
    @ExcludeMissing
    fun _participants(): JsonField<List<Participant>> = participants

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
         * Returns a mutable builder for constructing an instance of [ParticipantList].
         *
         * The following fields are required:
         * ```java
         * .limit()
         * .nextId()
         * .participants()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ParticipantList]. */
    class Builder internal constructor() {

        private var limit: JsonField<Long>? = null
        private var nextId: JsonField<String>? = null
        private var participants: JsonField<MutableList<Participant>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(participantList: ParticipantList) = apply {
            limit = participantList.limit
            nextId = participantList.nextId
            participants = participantList.participants.map { it.toMutableList() }
            additionalProperties = participantList.additionalProperties.toMutableMap()
        }

        fun limit(limit: Long) = limit(JsonField.of(limit))

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

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

        fun participants(participants: List<Participant>) = participants(JsonField.of(participants))

        /**
         * Sets [Builder.participants] to an arbitrary JSON value.
         *
         * You should usually call [Builder.participants] with a well-typed `List<Participant>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun participants(participants: JsonField<List<Participant>>) = apply {
            this.participants = participants.map { it.toMutableList() }
        }

        /**
         * Adds a single [Participant] to [participants].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addParticipant(participant: Participant) = apply {
            participants =
                (participants ?: JsonField.of(mutableListOf())).also {
                    checkKnown("participants", it).add(participant)
                }
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
         * Returns an immutable instance of [ParticipantList].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .limit()
         * .nextId()
         * .participants()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ParticipantList =
            ParticipantList(
                checkRequired("limit", limit),
                checkRequired("nextId", nextId),
                checkRequired("participants", participants).map { it.toImmutable() },
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
    fun validate(): ParticipantList = apply {
        if (validated) {
            return@apply
        }

        limit()
        nextId()
        participants().forEach { it.validate() }
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
            (if (nextId.asKnown().isPresent) 1 else 0) +
            (participants.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParticipantList &&
            limit == other.limit &&
            nextId == other.nextId &&
            participants == other.participants &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(limit, nextId, participants, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ParticipantList{limit=$limit, nextId=$nextId, participants=$participants, additionalProperties=$additionalProperties}"
}
