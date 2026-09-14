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

class PendingAnalyticsErasure
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val status: JsonField<String>,
    private val operationId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("operationId")
        @ExcludeMissing
        operationId: JsonField<String> = JsonMissing.of(),
    ) : this(status, operationId, mutableMapOf())

    /**
     * Analytics erasure has been accepted but is not confirmed complete.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): String = status.getRequired("status")

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /** Opaque reference for support inquiries about this analytics erasure. */
    fun operationId(): String = operationId.getRequired("operationId")

    @JsonProperty("operationId") @ExcludeMissing fun _operationId(): JsonField<String> = operationId

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
         * Returns a mutable builder for constructing an instance of [PendingAnalyticsErasure].
         *
         * The following fields are required:
         * ```java
         * .status()
         * .operationId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PendingAnalyticsErasure]. */
    class Builder internal constructor() {

        private var status: JsonField<String>? = null
        private var operationId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pendingAnalyticsErasure: PendingAnalyticsErasure) = apply {
            status = pendingAnalyticsErasure.status
            operationId = pendingAnalyticsErasure.operationId
            additionalProperties = pendingAnalyticsErasure.additionalProperties.toMutableMap()
        }

        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        fun operationId(operationId: String) = operationId(JsonField.of(operationId))

        fun operationId(operationId: JsonField<String>) = apply { this.operationId = operationId }

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
         * Returns an immutable instance of [PendingAnalyticsErasure].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .status()
         * .operationId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PendingAnalyticsErasure =
            PendingAnalyticsErasure(
                checkRequired("status", status),
                checkRequired("operationId", operationId),
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
    fun validate(): PendingAnalyticsErasure = apply {
        if (validated) {
            return@apply
        }

        status()
        operationId()
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
        (if (status.asKnown().isPresent) 1 else 0) + (if (operationId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PendingAnalyticsErasure &&
            status == other.status &&
            operationId == other.operationId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(status, operationId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PendingAnalyticsErasure{status=$status, operationId=$operationId, additionalProperties=$additionalProperties}"
}
