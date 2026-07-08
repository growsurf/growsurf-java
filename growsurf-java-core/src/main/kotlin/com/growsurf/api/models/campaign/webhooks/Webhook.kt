// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.webhooks

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

class Webhook
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val autoDisabledDueToFailures: JsonField<Boolean>,
    private val events: JsonField<List<WebhookEvent>>,
    private val failureCount: JsonField<Long>,
    private val id: JsonField<String>,
    private val isEnabled: JsonField<Boolean>,
    private val lastFailureAt: JsonField<Long>,
    private val payloadUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("autoDisabledDueToFailures")
        @ExcludeMissing
        autoDisabledDueToFailures: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("events")
        @ExcludeMissing
        events: JsonField<List<WebhookEvent>> = JsonMissing.of(),
        @JsonProperty("failureCount")
        @ExcludeMissing
        failureCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("isEnabled") @ExcludeMissing isEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("lastFailureAt")
        @ExcludeMissing
        lastFailureAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("payloadUrl")
        @ExcludeMissing
        payloadUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        autoDisabledDueToFailures,
        events,
        failureCount,
        id,
        isEnabled,
        lastFailureAt,
        payloadUrl,
        mutableMapOf(),
    )

    /**
     * Read-only. Whether GrowSurf auto-disabled this webhook after repeated delivery failures.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun autoDisabledDueToFailures(): Boolean =
        autoDisabledDueToFailures.getRequired("autoDisabledDueToFailures")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun events(): List<WebhookEvent> = events.getRequired("events")

    /**
     * Read-only. Consecutive delivery failures.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun failureCount(): Long = failureCount.getRequired("failureCount")

    /**
     * The webhook id (`primary` for the program's primary webhook).
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isEnabled(): Boolean = isEnabled.getRequired("isEnabled")

    /**
     * Read-only. When the last delivery failure occurred, as a Unix timestamp in milliseconds.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastFailureAt(): Optional<Long> = lastFailureAt.getOptional("lastFailureAt")

    /**
     * The URL that receives webhook deliveries.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun payloadUrl(): Optional<String> = payloadUrl.getOptional("payloadUrl")

    /**
     * Returns the raw JSON value of [autoDisabledDueToFailures].
     *
     * Unlike [autoDisabledDueToFailures], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("autoDisabledDueToFailures")
    @ExcludeMissing
    fun _autoDisabledDueToFailures(): JsonField<Boolean> = autoDisabledDueToFailures

    /**
     * Returns the raw JSON value of [events].
     *
     * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("events")
    @ExcludeMissing
    fun _events(): JsonField<List<WebhookEvent>> = events

    /**
     * Returns the raw JSON value of [failureCount].
     *
     * Unlike [failureCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failureCount")
    @ExcludeMissing
    fun _failureCount(): JsonField<Long> = failureCount

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [isEnabled].
     *
     * Unlike [isEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isEnabled") @ExcludeMissing fun _isEnabled(): JsonField<Boolean> = isEnabled

    /**
     * Returns the raw JSON value of [lastFailureAt].
     *
     * Unlike [lastFailureAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastFailureAt")
    @ExcludeMissing
    fun _lastFailureAt(): JsonField<Long> = lastFailureAt

    /**
     * Returns the raw JSON value of [payloadUrl].
     *
     * Unlike [payloadUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payloadUrl") @ExcludeMissing fun _payloadUrl(): JsonField<String> = payloadUrl

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
         * Returns a mutable builder for constructing an instance of [Webhook].
         *
         * The following fields are required:
         * ```java
         * .autoDisabledDueToFailures()
         * .events()
         * .failureCount()
         * .id()
         * .isEnabled()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Webhook]. */
    class Builder internal constructor() {

        private var autoDisabledDueToFailures: JsonField<Boolean>? = null
        private var events: JsonField<MutableList<WebhookEvent>>? = null
        private var failureCount: JsonField<Long>? = null
        private var id: JsonField<String>? = null
        private var isEnabled: JsonField<Boolean>? = null
        private var lastFailureAt: JsonField<Long> = JsonMissing.of()
        private var payloadUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(webhook: Webhook) = apply {
            autoDisabledDueToFailures = webhook.autoDisabledDueToFailures
            events = webhook.events.map { it.toMutableList() }
            failureCount = webhook.failureCount
            id = webhook.id
            isEnabled = webhook.isEnabled
            lastFailureAt = webhook.lastFailureAt
            payloadUrl = webhook.payloadUrl
            additionalProperties = webhook.additionalProperties.toMutableMap()
        }

        /**
         * Read-only. Whether GrowSurf auto-disabled this webhook after repeated delivery failures.
         */
        fun autoDisabledDueToFailures(autoDisabledDueToFailures: Boolean) =
            autoDisabledDueToFailures(JsonField.of(autoDisabledDueToFailures))

        /**
         * Sets [Builder.autoDisabledDueToFailures] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoDisabledDueToFailures] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun autoDisabledDueToFailures(autoDisabledDueToFailures: JsonField<Boolean>) = apply {
            this.autoDisabledDueToFailures = autoDisabledDueToFailures
        }

        fun events(events: List<WebhookEvent>) = events(JsonField.of(events))

        /**
         * Sets [Builder.events] to an arbitrary JSON value.
         *
         * You should usually call [Builder.events] with a well-typed `List<WebhookEvent>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun events(events: JsonField<List<WebhookEvent>>) = apply {
            this.events = events.map { it.toMutableList() }
        }

        /**
         * Adds a single [WebhookEvent] to [events].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEvent(event: WebhookEvent) = apply {
            events =
                (events ?: JsonField.of(mutableListOf())).also {
                    checkKnown("events", it).add(event)
                }
        }

        /** Read-only. Consecutive delivery failures. */
        fun failureCount(failureCount: Long) = failureCount(JsonField.of(failureCount))

        /**
         * Sets [Builder.failureCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failureCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun failureCount(failureCount: JsonField<Long>) = apply {
            this.failureCount = failureCount
        }

        /** The webhook id (`primary` for the program's primary webhook). */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun isEnabled(isEnabled: Boolean) = isEnabled(JsonField.of(isEnabled))

        /**
         * Sets [Builder.isEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isEnabled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isEnabled(isEnabled: JsonField<Boolean>) = apply { this.isEnabled = isEnabled }

        /**
         * Read-only. When the last delivery failure occurred, as a Unix timestamp in milliseconds.
         */
        fun lastFailureAt(lastFailureAt: Long?) = lastFailureAt(JsonField.ofNullable(lastFailureAt))

        /**
         * Alias for [Builder.lastFailureAt].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun lastFailureAt(lastFailureAt: Long) = lastFailureAt(lastFailureAt as Long?)

        /** Alias for calling [Builder.lastFailureAt] with `lastFailureAt.orElse(null)`. */
        fun lastFailureAt(lastFailureAt: Optional<Long>) = lastFailureAt(lastFailureAt.getOrNull())

        /**
         * Sets [Builder.lastFailureAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastFailureAt] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lastFailureAt(lastFailureAt: JsonField<Long>) = apply {
            this.lastFailureAt = lastFailureAt
        }

        /** The URL that receives webhook deliveries. */
        fun payloadUrl(payloadUrl: String?) = payloadUrl(JsonField.ofNullable(payloadUrl))

        /** Alias for calling [Builder.payloadUrl] with `payloadUrl.orElse(null)`. */
        fun payloadUrl(payloadUrl: Optional<String>) = payloadUrl(payloadUrl.getOrNull())

        /**
         * Sets [Builder.payloadUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payloadUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun payloadUrl(payloadUrl: JsonField<String>) = apply { this.payloadUrl = payloadUrl }

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
         * Returns an immutable instance of [Webhook].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .autoDisabledDueToFailures()
         * .events()
         * .failureCount()
         * .id()
         * .isEnabled()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Webhook =
            Webhook(
                checkRequired("autoDisabledDueToFailures", autoDisabledDueToFailures),
                checkRequired("events", events).map { it.toImmutable() },
                checkRequired("failureCount", failureCount),
                checkRequired("id", id),
                checkRequired("isEnabled", isEnabled),
                lastFailureAt,
                payloadUrl,
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
    fun validate(): Webhook = apply {
        if (validated) {
            return@apply
        }

        autoDisabledDueToFailures()
        events().forEach { it.validate() }
        failureCount()
        id()
        isEnabled()
        lastFailureAt()
        payloadUrl()
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
        (if (autoDisabledDueToFailures.asKnown().isPresent) 1 else 0) +
            (events.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (failureCount.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (isEnabled.asKnown().isPresent) 1 else 0) +
            (if (lastFailureAt.asKnown().isPresent) 1 else 0) +
            (if (payloadUrl.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Webhook &&
            autoDisabledDueToFailures == other.autoDisabledDueToFailures &&
            events == other.events &&
            failureCount == other.failureCount &&
            id == other.id &&
            isEnabled == other.isEnabled &&
            lastFailureAt == other.lastFailureAt &&
            payloadUrl == other.payloadUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            autoDisabledDueToFailures,
            events,
            failureCount,
            id,
            isEnabled,
            lastFailureAt,
            payloadUrl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Webhook{autoDisabledDueToFailures=$autoDisabledDueToFailures, events=$events, failureCount=$failureCount, id=$id, isEnabled=$isEnabled, lastFailureAt=$lastFailureAt, payloadUrl=$payloadUrl, additionalProperties=$additionalProperties}"
}
