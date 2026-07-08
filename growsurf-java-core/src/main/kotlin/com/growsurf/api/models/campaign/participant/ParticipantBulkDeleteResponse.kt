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
import com.growsurf.api.core.checkKnown
import com.growsurf.api.core.checkRequired
import com.growsurf.api.core.toImmutable
import com.growsurf.api.errors.GrowsurfInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ParticipantBulkDeleteResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val summary: JsonField<Summary>,
    private val results: JsonField<List<Result>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("summary") @ExcludeMissing summary: JsonField<Summary> = JsonMissing.of(),
        @JsonProperty("results") @ExcludeMissing results: JsonField<List<Result>> = JsonMissing.of(),
    ) : this(summary, results, mutableMapOf())

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun summary(): Summary = summary.getRequired("summary")

    /**
     * One entry per submitted identifier, in the same order as the request.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun results(): List<Result> = results.getRequired("results")

    /**
     * Returns the raw JSON value of [summary].
     *
     * Unlike [summary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("summary") @ExcludeMissing fun _summary(): JsonField<Summary> = summary

    /**
     * Returns the raw JSON value of [results].
     *
     * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("results") @ExcludeMissing fun _results(): JsonField<List<Result>> = results

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
         * [ParticipantBulkDeleteResponse].
         *
         * The following fields are required:
         * ```java
         * .summary()
         * .results()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ParticipantBulkDeleteResponse]. */
    class Builder internal constructor() {

        private var summary: JsonField<Summary>? = null
        private var results: JsonField<MutableList<Result>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(participantBulkDeleteResponse: ParticipantBulkDeleteResponse) = apply {
            summary = participantBulkDeleteResponse.summary
            results = participantBulkDeleteResponse.results.map { it.toMutableList() }
            additionalProperties = participantBulkDeleteResponse.additionalProperties.toMutableMap()
        }

        fun summary(summary: Summary) = summary(JsonField.of(summary))

        /**
         * Sets [Builder.summary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.summary] with a well-typed [Summary] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun summary(summary: JsonField<Summary>) = apply { this.summary = summary }

        /** One entry per submitted identifier, in the same order as the request. */
        fun results(results: List<Result>) = results(JsonField.of(results))

        /**
         * Sets [Builder.results] to an arbitrary JSON value.
         *
         * You should usually call [Builder.results] with a well-typed `List<Result>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun results(results: JsonField<List<Result>>) = apply {
            this.results = results.map { it.toMutableList() }
        }

        /**
         * Adds a single [Result] to [results].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResult(result: Result) = apply {
            results =
                (results ?: JsonField.of(mutableListOf())).also {
                    checkKnown("results", it).add(result)
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
         * Returns an immutable instance of [ParticipantBulkDeleteResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .summary()
         * .results()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ParticipantBulkDeleteResponse =
            ParticipantBulkDeleteResponse(
                checkRequired("summary", summary),
                checkRequired("results", results).map { it.toImmutable() },
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
    fun validate(): ParticipantBulkDeleteResponse = apply {
        if (validated) {
            return@apply
        }

        summary().validate()
        results().forEach { it.validate() }
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
        (summary.asKnown().getOrNull()?.validity() ?: 0) +
            (results.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Summary
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val total: JsonField<Long>,
        private val deletedCount: JsonField<Long>,
        private val notFoundCount: JsonField<Long>,
        private val duplicateCount: JsonField<Long>,
        private val errorCount: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("total") @ExcludeMissing total: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("deletedCount")
            @ExcludeMissing
            deletedCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("notFoundCount")
            @ExcludeMissing
            notFoundCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("duplicateCount")
            @ExcludeMissing
            duplicateCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("errorCount")
            @ExcludeMissing
            errorCount: JsonField<Long> = JsonMissing.of(),
        ) : this(total, deletedCount, notFoundCount, duplicateCount, errorCount, mutableMapOf())

        /**
         * Number of entries submitted in this request.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun total(): Long = total.getRequired("total")

        /**
         * Entries that resolved to a participant and were deleted.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun deletedCount(): Long = deletedCount.getRequired("deletedCount")

        /**
         * Entries that did not match any participant.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun notFoundCount(): Long = notFoundCount.getRequired("notFoundCount")

        /**
         * Entries that resolved to the same participant as an earlier entry.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun duplicateCount(): Long = duplicateCount.getRequired("duplicateCount")

        /**
         * Entries that failed to look up or delete.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun errorCount(): Long = errorCount.getRequired("errorCount")

        /**
         * Returns the raw JSON value of [total].
         *
         * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Long> = total

        /**
         * Returns the raw JSON value of [deletedCount].
         *
         * Unlike [deletedCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("deletedCount")
        @ExcludeMissing
        fun _deletedCount(): JsonField<Long> = deletedCount

        /**
         * Returns the raw JSON value of [notFoundCount].
         *
         * Unlike [notFoundCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("notFoundCount")
        @ExcludeMissing
        fun _notFoundCount(): JsonField<Long> = notFoundCount

        /**
         * Returns the raw JSON value of [duplicateCount].
         *
         * Unlike [duplicateCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("duplicateCount")
        @ExcludeMissing
        fun _duplicateCount(): JsonField<Long> = duplicateCount

        /**
         * Returns the raw JSON value of [errorCount].
         *
         * Unlike [errorCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("errorCount") @ExcludeMissing fun _errorCount(): JsonField<Long> = errorCount

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
             * Returns a mutable builder for constructing an instance of [Summary].
             *
             * The following fields are required:
             * ```java
             * .total()
             * .deletedCount()
             * .notFoundCount()
             * .duplicateCount()
             * .errorCount()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Summary]. */
        class Builder internal constructor() {

            private var total: JsonField<Long>? = null
            private var deletedCount: JsonField<Long>? = null
            private var notFoundCount: JsonField<Long>? = null
            private var duplicateCount: JsonField<Long>? = null
            private var errorCount: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(summary: Summary) = apply {
                total = summary.total
                deletedCount = summary.deletedCount
                notFoundCount = summary.notFoundCount
                duplicateCount = summary.duplicateCount
                errorCount = summary.errorCount
                additionalProperties = summary.additionalProperties.toMutableMap()
            }

            /** Number of entries submitted in this request. */
            fun total(total: Long) = total(JsonField.of(total))

            /**
             * Sets [Builder.total] to an arbitrary JSON value.
             *
             * You should usually call [Builder.total] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun total(total: JsonField<Long>) = apply { this.total = total }

            /** Entries that resolved to a participant and were deleted. */
            fun deletedCount(deletedCount: Long) = deletedCount(JsonField.of(deletedCount))

            /**
             * Sets [Builder.deletedCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deletedCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deletedCount(deletedCount: JsonField<Long>) = apply {
                this.deletedCount = deletedCount
            }

            /** Entries that did not match any participant. */
            fun notFoundCount(notFoundCount: Long) = notFoundCount(JsonField.of(notFoundCount))

            /**
             * Sets [Builder.notFoundCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notFoundCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notFoundCount(notFoundCount: JsonField<Long>) = apply {
                this.notFoundCount = notFoundCount
            }

            /** Entries that resolved to the same participant as an earlier entry. */
            fun duplicateCount(duplicateCount: Long) = duplicateCount(JsonField.of(duplicateCount))

            /**
             * Sets [Builder.duplicateCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.duplicateCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun duplicateCount(duplicateCount: JsonField<Long>) = apply {
                this.duplicateCount = duplicateCount
            }

            /** Entries that failed to look up or delete. */
            fun errorCount(errorCount: Long) = errorCount(JsonField.of(errorCount))

            /**
             * Sets [Builder.errorCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.errorCount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun errorCount(errorCount: JsonField<Long>) = apply { this.errorCount = errorCount }

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
             * Returns an immutable instance of [Summary].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .total()
             * .deletedCount()
             * .notFoundCount()
             * .duplicateCount()
             * .errorCount()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Summary =
                Summary(
                    checkRequired("total", total),
                    checkRequired("deletedCount", deletedCount),
                    checkRequired("notFoundCount", notFoundCount),
                    checkRequired("duplicateCount", duplicateCount),
                    checkRequired("errorCount", errorCount),
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
        fun validate(): Summary = apply {
            if (validated) {
                return@apply
            }

            total()
            deletedCount()
            notFoundCount()
            duplicateCount()
            errorCount()
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
            (if (total.asKnown().isPresent) 1 else 0) +
                (if (deletedCount.asKnown().isPresent) 1 else 0) +
                (if (notFoundCount.asKnown().isPresent) 1 else 0) +
                (if (duplicateCount.asKnown().isPresent) 1 else 0) +
                (if (errorCount.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Summary &&
                total == other.total &&
                deletedCount == other.deletedCount &&
                notFoundCount == other.notFoundCount &&
                duplicateCount == other.duplicateCount &&
                errorCount == other.errorCount &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                total,
                deletedCount,
                notFoundCount,
                duplicateCount,
                errorCount,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Summary{total=$total, deletedCount=$deletedCount, notFoundCount=$notFoundCount, duplicateCount=$duplicateCount, errorCount=$errorCount, additionalProperties=$additionalProperties}"
    }

    class Result
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val index: JsonField<Long>,
        private val identifier: JsonField<String>,
        private val status: JsonField<Status>,
        private val participantId: JsonField<String>,
        private val email: JsonField<String>,
        private val message: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("index") @ExcludeMissing index: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("identifier")
            @ExcludeMissing
            identifier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("participantId")
            @ExcludeMissing
            participantId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        ) : this(index, identifier, status, participantId, email, message, mutableMapOf())

        /**
         * Zero-based position of this entry in the submitted `participants` array.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun index(): Long = index.getRequired("index")

        /**
         * The submitted participant ID or email address, echoed back as received.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun identifier(): String = identifier.getRequired("identifier")

        /**
         * Per-row outcome. `DELETED` — the participant was resolved and removed. `NOT_FOUND` — no
         * participant matches the ID or email. `DUPLICATE` — the entry resolves to the same
         * participant as an earlier entry in the same request. `ERROR` — the lookup or deletion
         * failed for this row.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * The resolved GrowSurf participant ID. Present when the entry resolved to a participant.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun participantId(): Optional<String> = participantId.getOptional("participantId")

        /**
         * The resolved participant's email address. Present on `DELETED` rows.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun email(): Optional<String> = email.getOptional("email")

        /**
         * Human-readable detail for `NOT_FOUND`, `DUPLICATE`, and `ERROR` rows.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun message(): Optional<String> = message.getOptional("message")

        /**
         * Returns the raw JSON value of [index].
         *
         * Unlike [index], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("index") @ExcludeMissing fun _index(): JsonField<Long> = index

        /**
         * Returns the raw JSON value of [identifier].
         *
         * Unlike [identifier], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("identifier")
        @ExcludeMissing
        fun _identifier(): JsonField<String> = identifier

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [participantId].
         *
         * Unlike [participantId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("participantId")
        @ExcludeMissing
        fun _participantId(): JsonField<String> = participantId

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [message].
         *
         * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

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
             * Returns a mutable builder for constructing an instance of [Result].
             *
             * The following fields are required:
             * ```java
             * .index()
             * .identifier()
             * .status()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Result]. */
        class Builder internal constructor() {

            private var index: JsonField<Long>? = null
            private var identifier: JsonField<String>? = null
            private var status: JsonField<Status>? = null
            private var participantId: JsonField<String> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var message: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(result: Result) = apply {
                index = result.index
                identifier = result.identifier
                status = result.status
                participantId = result.participantId
                email = result.email
                message = result.message
                additionalProperties = result.additionalProperties.toMutableMap()
            }

            /** Zero-based position of this entry in the submitted `participants` array. */
            fun index(index: Long) = index(JsonField.of(index))

            /**
             * Sets [Builder.index] to an arbitrary JSON value.
             *
             * You should usually call [Builder.index] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun index(index: JsonField<Long>) = apply { this.index = index }

            /** The submitted participant ID or email address, echoed back as received. */
            fun identifier(identifier: String) = identifier(JsonField.of(identifier))

            /**
             * Sets [Builder.identifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.identifier] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun identifier(identifier: JsonField<String>) = apply { this.identifier = identifier }

            /**
             * Per-row outcome. `DELETED` — the participant was resolved and removed. `NOT_FOUND` —
             * no participant matches the ID or email. `DUPLICATE` — the entry resolves to the same
             * participant as an earlier entry in the same request. `ERROR` — the lookup or deletion
             * failed for this row.
             */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /**
             * The resolved GrowSurf participant ID. Present when the entry resolved to a
             * participant.
             */
            fun participantId(participantId: String) = participantId(JsonField.of(participantId))

            /**
             * Sets [Builder.participantId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.participantId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun participantId(participantId: JsonField<String>) = apply {
                this.participantId = participantId
            }

            /** The resolved participant's email address. Present on `DELETED` rows. */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** Human-readable detail for `NOT_FOUND`, `DUPLICATE`, and `ERROR` rows. */
            fun message(message: String) = message(JsonField.of(message))

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<String>) = apply { this.message = message }

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
             * Returns an immutable instance of [Result].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .index()
             * .identifier()
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Result =
                Result(
                    checkRequired("index", index),
                    checkRequired("identifier", identifier),
                    checkRequired("status", status),
                    participantId,
                    email,
                    message,
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
        fun validate(): Result = apply {
            if (validated) {
                return@apply
            }

            index()
            identifier()
            status().validate()
            participantId()
            email()
            message()
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
            (if (index.asKnown().isPresent) 1 else 0) +
                (if (identifier.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (participantId.asKnown().isPresent) 1 else 0) +
                (if (email.asKnown().isPresent) 1 else 0) +
                (if (message.asKnown().isPresent) 1 else 0)

        /**
         * Per-row outcome. `DELETED` — the participant was resolved and removed. `NOT_FOUND` — no
         * participant matches the ID or email. `DUPLICATE` — the entry resolves to the same
         * participant as an earlier entry in the same request. `ERROR` — the lookup or deletion
         * failed for this row.
         */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val DELETED = of("DELETED")

                @JvmField val NOT_FOUND = of("NOT_FOUND")

                @JvmField val DUPLICATE = of("DUPLICATE")

                @JvmField val ERROR = of("ERROR")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                DELETED,
                NOT_FOUND,
                DUPLICATE,
                ERROR,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DELETED,
                NOT_FOUND,
                DUPLICATE,
                ERROR,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    DELETED -> Value.DELETED
                    NOT_FOUND -> Value.NOT_FOUND
                    DUPLICATE -> Value.DUPLICATE
                    ERROR -> Value.ERROR
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws GrowsurfInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    DELETED -> Known.DELETED
                    NOT_FOUND -> Known.NOT_FOUND
                    DUPLICATE -> Known.DUPLICATE
                    ERROR -> Known.ERROR
                    else -> throw GrowsurfInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws GrowsurfInvalidDataException if any value type in this object doesn't match
             *   its expected type.
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

            return other is Result &&
                index == other.index &&
                identifier == other.identifier &&
                status == other.status &&
                participantId == other.participantId &&
                email == other.email &&
                message == other.message &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                index,
                identifier,
                status,
                participantId,
                email,
                message,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Result{index=$index, identifier=$identifier, status=$status, participantId=$participantId, email=$email, message=$message, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParticipantBulkDeleteResponse &&
            summary == other.summary &&
            results == other.results &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(summary, results, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ParticipantBulkDeleteResponse{summary=$summary, results=$results, additionalProperties=$additionalProperties}"
}
