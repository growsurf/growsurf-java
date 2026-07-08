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
import com.growsurf.api.core.checkKnown
import com.growsurf.api.core.checkRequired
import com.growsurf.api.core.toImmutable
import com.growsurf.api.errors.GrowsurfInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ParticipantActivityLogsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val activityLogs: JsonField<List<ParticipantActivityLog>>,
    private val limit: JsonField<Long>,
    private val offset: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("activityLogs")
        @ExcludeMissing
        activityLogs: JsonField<List<ParticipantActivityLog>> = JsonMissing.of(),
        @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("offset") @ExcludeMissing offset: JsonField<Long> = JsonMissing.of(),
    ) : this(activityLogs, limit, offset, mutableMapOf())

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun activityLogs(): List<ParticipantActivityLog> = activityLogs.getRequired("activityLogs")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun limit(): Long = limit.getRequired("limit")

    /**
     * The offset for the next page, or null when there are no more logs.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun offset(): Optional<Long> = offset.getOptional("offset")

    /**
     * Returns the raw JSON value of [activityLogs].
     *
     * Unlike [activityLogs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("activityLogs")
    @ExcludeMissing
    fun _activityLogs(): JsonField<List<ParticipantActivityLog>> = activityLogs

    /**
     * Returns the raw JSON value of [limit].
     *
     * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Long> = limit

    /**
     * Returns the raw JSON value of [offset].
     *
     * Unlike [offset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<Long> = offset

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
         * [ParticipantActivityLogsResponse].
         *
         * The following fields are required:
         * ```java
         * .activityLogs()
         * .limit()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ParticipantActivityLogsResponse]. */
    class Builder internal constructor() {

        private var activityLogs: JsonField<MutableList<ParticipantActivityLog>>? = null
        private var limit: JsonField<Long>? = null
        private var offset: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(participantActivityLogsResponse: ParticipantActivityLogsResponse) =
            apply {
                activityLogs =
                    participantActivityLogsResponse.activityLogs.map { it.toMutableList() }
                limit = participantActivityLogsResponse.limit
                offset = participantActivityLogsResponse.offset
                additionalProperties =
                    participantActivityLogsResponse.additionalProperties.toMutableMap()
            }

        fun activityLogs(activityLogs: List<ParticipantActivityLog>) =
            activityLogs(JsonField.of(activityLogs))

        /**
         * Sets [Builder.activityLogs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activityLogs] with a well-typed
         * `List<ParticipantActivityLog>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun activityLogs(activityLogs: JsonField<List<ParticipantActivityLog>>) = apply {
            this.activityLogs = activityLogs.map { it.toMutableList() }
        }

        /**
         * Adds a single [ParticipantActivityLog] to [activityLogs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addActivityLog(activityLog: ParticipantActivityLog) = apply {
            activityLogs =
                (activityLogs ?: JsonField.of(mutableListOf())).also {
                    checkKnown("activityLogs", it).add(activityLog)
                }
        }

        fun limit(limit: Long) = limit(JsonField.of(limit))

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

        /** The offset for the next page, or null when there are no more logs. */
        fun offset(offset: Long?) = offset(JsonField.ofNullable(offset))

        /**
         * Alias for [Builder.offset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun offset(offset: Long) = offset(offset as Long?)

        /** Alias for calling [Builder.offset] with `offset.orElse(null)`. */
        fun offset(offset: Optional<Long>) = offset(offset.getOrNull())

        /**
         * Sets [Builder.offset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.offset] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

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
         * Returns an immutable instance of [ParticipantActivityLogsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .activityLogs()
         * .limit()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ParticipantActivityLogsResponse =
            ParticipantActivityLogsResponse(
                checkRequired("activityLogs", activityLogs).map { it.toImmutable() },
                checkRequired("limit", limit),
                offset,
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
    fun validate(): ParticipantActivityLogsResponse = apply {
        if (validated) {
            return@apply
        }

        activityLogs().forEach { it.validate() }
        limit()
        offset()
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
        (activityLogs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (limit.asKnown().isPresent) 1 else 0) +
            (if (offset.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParticipantActivityLogsResponse &&
            activityLogs == other.activityLogs &&
            limit == other.limit &&
            offset == other.offset &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(activityLogs, limit, offset, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ParticipantActivityLogsResponse{activityLogs=$activityLogs, limit=$limit, offset=$offset, additionalProperties=$additionalProperties}"
}
