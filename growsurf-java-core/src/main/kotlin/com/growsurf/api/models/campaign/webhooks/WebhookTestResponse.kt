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
import com.growsurf.api.core.checkRequired
import com.growsurf.api.core.toImmutable
import com.growsurf.api.errors.GrowsurfInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class WebhookTestResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val payload: JsonField<Payload>,
    private val response: JsonField<Response>,
    private val success: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("payload") @ExcludeMissing payload: JsonField<Payload> = JsonMissing.of(),
        @JsonProperty("response") @ExcludeMissing response: JsonField<Response> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
    ) : this(payload, response, success, mutableMapOf())

    /**
     * The mock event payload that was sent.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun payload(): Optional<Payload> = payload.getOptional("payload")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun response(): Optional<Response> = response.getOptional("response")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun success(): Boolean = success.getRequired("success")

    /**
     * Returns the raw JSON value of [payload].
     *
     * Unlike [payload], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payload") @ExcludeMissing fun _payload(): JsonField<Payload> = payload

    /**
     * Returns the raw JSON value of [response].
     *
     * Unlike [response], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("response") @ExcludeMissing fun _response(): JsonField<Response> = response

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
         * Returns a mutable builder for constructing an instance of [WebhookTestResponse].
         *
         * The following fields are required:
         * ```java
         * .success()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WebhookTestResponse]. */
    class Builder internal constructor() {

        private var payload: JsonField<Payload> = JsonMissing.of()
        private var response: JsonField<Response> = JsonMissing.of()
        private var success: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(webhookTestResponse: WebhookTestResponse) = apply {
            payload = webhookTestResponse.payload
            response = webhookTestResponse.response
            success = webhookTestResponse.success
            additionalProperties = webhookTestResponse.additionalProperties.toMutableMap()
        }

        /** The mock event payload that was sent. */
        fun payload(payload: Payload) = payload(JsonField.of(payload))

        /**
         * Sets [Builder.payload] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payload] with a well-typed [Payload] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun payload(payload: JsonField<Payload>) = apply { this.payload = payload }

        fun response(response: Response) = response(JsonField.of(response))

        /**
         * Sets [Builder.response] to an arbitrary JSON value.
         *
         * You should usually call [Builder.response] with a well-typed [Response] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun response(response: JsonField<Response>) = apply { this.response = response }

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
         * Returns an immutable instance of [WebhookTestResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .success()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WebhookTestResponse =
            WebhookTestResponse(
                payload,
                response,
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
    fun validate(): WebhookTestResponse = apply {
        if (validated) {
            return@apply
        }

        payload().ifPresent { it.validate() }
        response().ifPresent { it.validate() }
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
        (payload.asKnown().getOrNull()?.validity() ?: 0) +
            (response.asKnown().getOrNull()?.validity() ?: 0) +
            (if (success.asKnown().isPresent) 1 else 0)

    /** The mock event payload that was sent. */
    class Payload
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Payload]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Payload]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(payload: Payload) = apply {
                additionalProperties = payload.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Payload].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Payload = Payload(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Payload = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Payload && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Payload{additionalProperties=$additionalProperties}"
    }

    class Response
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val msg: JsonField<String>,
        private val statusCode: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("msg") @ExcludeMissing msg: JsonField<String> = JsonMissing.of(),
            @JsonProperty("statusCode")
            @ExcludeMissing
            statusCode: JsonField<Long> = JsonMissing.of(),
        ) : this(msg, statusCode, mutableMapOf())

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun msg(): Optional<String> = msg.getOptional("msg")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun statusCode(): Optional<Long> = statusCode.getOptional("statusCode")

        /**
         * Returns the raw JSON value of [msg].
         *
         * Unlike [msg], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("msg") @ExcludeMissing fun _msg(): JsonField<String> = msg

        /**
         * Returns the raw JSON value of [statusCode].
         *
         * Unlike [statusCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("statusCode") @ExcludeMissing fun _statusCode(): JsonField<Long> = statusCode

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

            /** Returns a mutable builder for constructing an instance of [Response]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Response]. */
        class Builder internal constructor() {

            private var msg: JsonField<String> = JsonMissing.of()
            private var statusCode: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(response: Response) = apply {
                msg = response.msg
                statusCode = response.statusCode
                additionalProperties = response.additionalProperties.toMutableMap()
            }

            fun msg(msg: String) = msg(JsonField.of(msg))

            /**
             * Sets [Builder.msg] to an arbitrary JSON value.
             *
             * You should usually call [Builder.msg] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun msg(msg: JsonField<String>) = apply { this.msg = msg }

            fun statusCode(statusCode: Long) = statusCode(JsonField.of(statusCode))

            /**
             * Sets [Builder.statusCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusCode] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun statusCode(statusCode: JsonField<Long>) = apply { this.statusCode = statusCode }

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
             * Returns an immutable instance of [Response].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Response =
                Response(msg, statusCode, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Response = apply {
            if (validated) {
                return@apply
            }

            msg()
            statusCode()
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
            (if (msg.asKnown().isPresent) 1 else 0) +
                (if (statusCode.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Response &&
                msg == other.msg &&
                statusCode == other.statusCode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(msg, statusCode, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Response{msg=$msg, statusCode=$statusCode, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookTestResponse &&
            payload == other.payload &&
            response == other.response &&
            success == other.success &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(payload, response, success, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WebhookTestResponse{payload=$payload, response=$response, success=$success, additionalProperties=$additionalProperties}"
}
