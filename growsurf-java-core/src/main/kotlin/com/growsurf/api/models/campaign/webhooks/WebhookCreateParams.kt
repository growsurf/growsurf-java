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
import com.growsurf.api.core.Params
import com.growsurf.api.core.checkKnown
import com.growsurf.api.core.checkRequired
import com.growsurf.api.core.http.Headers
import com.growsurf.api.core.http.QueryParams
import com.growsurf.api.core.toImmutable
import com.growsurf.api.errors.GrowsurfInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Adds a webhook to the program. */
class WebhookCreateParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * The URL that receives webhook deliveries.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun payloadUrl(): String = body.payloadUrl()

    /**
     * The events this webhook is subscribed to. When omitted, the webhook is subscribed to no
     * events.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun events(): Optional<List<WebhookEvent>> = body.events()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isEnabled(): Optional<Boolean> = body.isEnabled()

    /**
     * Write-only. Used to sign deliveries (the `GrowSurf-Signature` HMAC header). Never returned.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secret(): Optional<String> = body.secret()

    /**
     * Returns the raw JSON value of [payloadUrl].
     *
     * Unlike [payloadUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _payloadUrl(): JsonField<String> = body._payloadUrl()

    /**
     * Returns the raw JSON value of [events].
     *
     * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _events(): JsonField<List<WebhookEvent>> = body._events()

    /**
     * Returns the raw JSON value of [isEnabled].
     *
     * Unlike [isEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _isEnabled(): JsonField<Boolean> = body._isEnabled()

    /**
     * Returns the raw JSON value of [secret].
     *
     * Unlike [secret], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _secret(): JsonField<String> = body._secret()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WebhookCreateParams].
         *
         * The following fields are required:
         * ```java
         * .payloadUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WebhookCreateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(webhookCreateParams: WebhookCreateParams) = apply {
            id = webhookCreateParams.id
            body = webhookCreateParams.body.toBuilder()
            additionalHeaders = webhookCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = webhookCreateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [payloadUrl]
         * - [events]
         * - [isEnabled]
         * - [secret]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The URL that receives webhook deliveries. */
        fun payloadUrl(payloadUrl: String) = apply { body.payloadUrl(payloadUrl) }

        /**
         * Sets [Builder.payloadUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payloadUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun payloadUrl(payloadUrl: JsonField<String>) = apply { body.payloadUrl(payloadUrl) }

        /**
         * The events this webhook is subscribed to. When omitted, the webhook is subscribed to no
         * events.
         */
        fun events(events: List<WebhookEvent>) = apply { body.events(events) }

        /**
         * Sets [Builder.events] to an arbitrary JSON value.
         *
         * You should usually call [Builder.events] with a well-typed `List<WebhookEvent>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun events(events: JsonField<List<WebhookEvent>>) = apply { body.events(events) }

        /**
         * Adds a single [WebhookEvent] to [events].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEvent(event: WebhookEvent) = apply { body.addEvent(event) }

        fun isEnabled(isEnabled: Boolean) = apply { body.isEnabled(isEnabled) }

        /**
         * Sets [Builder.isEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isEnabled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isEnabled(isEnabled: JsonField<Boolean>) = apply { body.isEnabled(isEnabled) }

        /**
         * Write-only. Used to sign deliveries (the `GrowSurf-Signature` HMAC header). Never
         * returned.
         */
        fun secret(secret: String) = apply { body.secret(secret) }

        /**
         * Sets [Builder.secret] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secret] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun secret(secret: JsonField<String>) = apply { body.secret(secret) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [WebhookCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .payloadUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WebhookCreateParams =
            WebhookCreateParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val payloadUrl: JsonField<String>,
        private val events: JsonField<List<WebhookEvent>>,
        private val isEnabled: JsonField<Boolean>,
        private val secret: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("payloadUrl")
            @ExcludeMissing
            payloadUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("events")
            @ExcludeMissing
            events: JsonField<List<WebhookEvent>> = JsonMissing.of(),
            @JsonProperty("isEnabled")
            @ExcludeMissing
            isEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("secret") @ExcludeMissing secret: JsonField<String> = JsonMissing.of(),
        ) : this(payloadUrl, events, isEnabled, secret, mutableMapOf())

        /**
         * The URL that receives webhook deliveries.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun payloadUrl(): String = payloadUrl.getRequired("payloadUrl")

        /**
         * The events this webhook is subscribed to. When omitted, the webhook is subscribed to no
         * events.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun events(): Optional<List<WebhookEvent>> = events.getOptional("events")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isEnabled(): Optional<Boolean> = isEnabled.getOptional("isEnabled")

        /**
         * Write-only. Used to sign deliveries (the `GrowSurf-Signature` HMAC header). Never
         * returned.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun secret(): Optional<String> = secret.getOptional("secret")

        /**
         * Returns the raw JSON value of [payloadUrl].
         *
         * Unlike [payloadUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payloadUrl")
        @ExcludeMissing
        fun _payloadUrl(): JsonField<String> = payloadUrl

        /**
         * Returns the raw JSON value of [events].
         *
         * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("events")
        @ExcludeMissing
        fun _events(): JsonField<List<WebhookEvent>> = events

        /**
         * Returns the raw JSON value of [isEnabled].
         *
         * Unlike [isEnabled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("isEnabled") @ExcludeMissing fun _isEnabled(): JsonField<Boolean> = isEnabled

        /**
         * Returns the raw JSON value of [secret].
         *
         * Unlike [secret], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("secret") @ExcludeMissing fun _secret(): JsonField<String> = secret

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .payloadUrl()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var payloadUrl: JsonField<String>? = null
            private var events: JsonField<MutableList<WebhookEvent>>? = null
            private var isEnabled: JsonField<Boolean> = JsonMissing.of()
            private var secret: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                payloadUrl = body.payloadUrl
                events = body.events.map { it.toMutableList() }
                isEnabled = body.isEnabled
                secret = body.secret
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The URL that receives webhook deliveries. */
            fun payloadUrl(payloadUrl: String) = payloadUrl(JsonField.of(payloadUrl))

            /**
             * Sets [Builder.payloadUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payloadUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payloadUrl(payloadUrl: JsonField<String>) = apply { this.payloadUrl = payloadUrl }

            /**
             * The events this webhook is subscribed to. When omitted, the webhook is subscribed to
             * no events.
             */
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

            fun isEnabled(isEnabled: Boolean) = isEnabled(JsonField.of(isEnabled))

            /**
             * Sets [Builder.isEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isEnabled(isEnabled: JsonField<Boolean>) = apply { this.isEnabled = isEnabled }

            /**
             * Write-only. Used to sign deliveries (the `GrowSurf-Signature` HMAC header). Never
             * returned.
             */
            fun secret(secret: String) = secret(JsonField.of(secret))

            /**
             * Sets [Builder.secret] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secret] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun secret(secret: JsonField<String>) = apply { this.secret = secret }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .payloadUrl()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("payloadUrl", payloadUrl),
                    (events ?: JsonMissing.of()).map { it.toImmutable() },
                    isEnabled,
                    secret,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            payloadUrl()
            events().ifPresent { it.forEach { it.validate() } }
            isEnabled()
            secret()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: GrowsurfInvalidDataException) {
                false
            }

        @JvmSynthetic
        internal fun validity(): Int =
            (if (payloadUrl.asKnown().isPresent) 1 else 0) +
                (events.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (isEnabled.asKnown().isPresent) 1 else 0) +
                (if (secret.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                payloadUrl == other.payloadUrl &&
                events == other.events &&
                isEnabled == other.isEnabled &&
                secret == other.secret &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(payloadUrl, events, isEnabled, secret, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{payloadUrl=$payloadUrl, events=$events, isEnabled=$isEnabled, secret=$secret, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookCreateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "WebhookCreateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
