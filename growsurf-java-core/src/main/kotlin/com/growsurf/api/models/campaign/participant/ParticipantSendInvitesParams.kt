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

/** Sends email invites on behalf of a participant to a list of email addresses. */
class ParticipantSendInvitesParams
private constructor(
    private val id: String,
    private val participantIdOrEmail: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String = id

    fun participantIdOrEmail(): Optional<String> = Optional.ofNullable(participantIdOrEmail)

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun emailAddresses(): List<String> = body.emailAddresses()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messageText(): String = body.messageText()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subjectText(): String = body.subjectText()

    /**
     * Returns the raw JSON value of [emailAddresses].
     *
     * Unlike [emailAddresses], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _emailAddresses(): JsonField<List<String>> = body._emailAddresses()

    /**
     * Returns the raw JSON value of [messageText].
     *
     * Unlike [messageText], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _messageText(): JsonField<String> = body._messageText()

    /**
     * Returns the raw JSON value of [subjectText].
     *
     * Unlike [subjectText], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _subjectText(): JsonField<String> = body._subjectText()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ParticipantSendInvitesParams].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .emailAddresses()
         * .messageText()
         * .subjectText()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ParticipantSendInvitesParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var participantIdOrEmail: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(participantSendInvitesParams: ParticipantSendInvitesParams) = apply {
            id = participantSendInvitesParams.id
            participantIdOrEmail = participantSendInvitesParams.participantIdOrEmail
            body = participantSendInvitesParams.body.toBuilder()
            additionalHeaders = participantSendInvitesParams.additionalHeaders.toBuilder()
            additionalQueryParams = participantSendInvitesParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String) = apply { this.id = id }

        fun participantIdOrEmail(participantIdOrEmail: String?) = apply {
            this.participantIdOrEmail = participantIdOrEmail
        }

        /**
         * Alias for calling [Builder.participantIdOrEmail] with
         * `participantIdOrEmail.orElse(null)`.
         */
        fun participantIdOrEmail(participantIdOrEmail: Optional<String>) =
            participantIdOrEmail(participantIdOrEmail.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [emailAddresses]
         * - [messageText]
         * - [subjectText]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun emailAddresses(emailAddresses: List<String>) = apply {
            body.emailAddresses(emailAddresses)
        }

        /**
         * Sets [Builder.emailAddresses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailAddresses] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun emailAddresses(emailAddresses: JsonField<List<String>>) = apply {
            body.emailAddresses(emailAddresses)
        }

        /**
         * Adds a single [String] to [emailAddresses].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEmailAddress(emailAddress: String) = apply { body.addEmailAddress(emailAddress) }

        fun messageText(messageText: String) = apply { body.messageText(messageText) }

        /**
         * Sets [Builder.messageText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageText] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun messageText(messageText: JsonField<String>) = apply { body.messageText(messageText) }

        fun subjectText(subjectText: String) = apply { body.subjectText(subjectText) }

        /**
         * Sets [Builder.subjectText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subjectText] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun subjectText(subjectText: JsonField<String>) = apply { body.subjectText(subjectText) }

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
         * Returns an immutable instance of [ParticipantSendInvitesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .emailAddresses()
         * .messageText()
         * .subjectText()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ParticipantSendInvitesParams =
            ParticipantSendInvitesParams(
                checkRequired("id", id),
                participantIdOrEmail,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id
            1 -> participantIdOrEmail ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val emailAddresses: JsonField<List<String>>,
        private val messageText: JsonField<String>,
        private val subjectText: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("emailAddresses")
            @ExcludeMissing
            emailAddresses: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("messageText")
            @ExcludeMissing
            messageText: JsonField<String> = JsonMissing.of(),
            @JsonProperty("subjectText")
            @ExcludeMissing
            subjectText: JsonField<String> = JsonMissing.of(),
        ) : this(emailAddresses, messageText, subjectText, mutableMapOf())

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun emailAddresses(): List<String> = emailAddresses.getRequired("emailAddresses")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun messageText(): String = messageText.getRequired("messageText")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subjectText(): String = subjectText.getRequired("subjectText")

        /**
         * Returns the raw JSON value of [emailAddresses].
         *
         * Unlike [emailAddresses], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("emailAddresses")
        @ExcludeMissing
        fun _emailAddresses(): JsonField<List<String>> = emailAddresses

        /**
         * Returns the raw JSON value of [messageText].
         *
         * Unlike [messageText], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("messageText")
        @ExcludeMissing
        fun _messageText(): JsonField<String> = messageText

        /**
         * Returns the raw JSON value of [subjectText].
         *
         * Unlike [subjectText], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("subjectText")
        @ExcludeMissing
        fun _subjectText(): JsonField<String> = subjectText

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
             * .emailAddresses()
             * .messageText()
             * .subjectText()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var emailAddresses: JsonField<MutableList<String>>? = null
            private var messageText: JsonField<String>? = null
            private var subjectText: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                emailAddresses = body.emailAddresses.map { it.toMutableList() }
                messageText = body.messageText
                subjectText = body.subjectText
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun emailAddresses(emailAddresses: List<String>) =
                emailAddresses(JsonField.of(emailAddresses))

            /**
             * Sets [Builder.emailAddresses] to an arbitrary JSON value.
             *
             * You should usually call [Builder.emailAddresses] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun emailAddresses(emailAddresses: JsonField<List<String>>) = apply {
                this.emailAddresses = emailAddresses.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [emailAddresses].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEmailAddress(emailAddress: String) = apply {
                emailAddresses =
                    (emailAddresses ?: JsonField.of(mutableListOf())).also {
                        checkKnown("emailAddresses", it).add(emailAddress)
                    }
            }

            fun messageText(messageText: String) = messageText(JsonField.of(messageText))

            /**
             * Sets [Builder.messageText] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messageText] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun messageText(messageText: JsonField<String>) = apply {
                this.messageText = messageText
            }

            fun subjectText(subjectText: String) = subjectText(JsonField.of(subjectText))

            /**
             * Sets [Builder.subjectText] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subjectText] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subjectText(subjectText: JsonField<String>) = apply {
                this.subjectText = subjectText
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .emailAddresses()
             * .messageText()
             * .subjectText()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("emailAddresses", emailAddresses).map { it.toImmutable() },
                    checkRequired("messageText", messageText),
                    checkRequired("subjectText", subjectText),
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            emailAddresses()
            messageText()
            subjectText()
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
            (emailAddresses.asKnown().getOrNull()?.size ?: 0) +
                (if (messageText.asKnown().isPresent) 1 else 0) +
                (if (subjectText.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                emailAddresses == other.emailAddresses &&
                messageText == other.messageText &&
                subjectText == other.subjectText &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(emailAddresses, messageText, subjectText, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{emailAddresses=$emailAddresses, messageText=$messageText, subjectText=$subjectText, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParticipantSendInvitesParams &&
            id == other.id &&
            participantIdOrEmail == other.participantIdOrEmail &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, participantIdOrEmail, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ParticipantSendInvitesParams{id=$id, participantIdOrEmail=$participantIdOrEmail, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
