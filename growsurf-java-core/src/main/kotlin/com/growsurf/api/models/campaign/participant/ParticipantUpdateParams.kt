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

/** Updates a participant by GrowSurf participant ID or email address. */
class ParticipantUpdateParams
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
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): Optional<String> = body.email()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstName(): Optional<String> = body.firstName()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastName(): Optional<String> = body.lastName()

    /**
     * Shallow custom metadata object.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * Freeform internal notes about the participant (internal only, never exposed to participants).
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun notes(): Optional<String> = body.notes()

    /**
     * The participant's PayPal email address, used for affiliate payouts.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun paypalEmail(): Optional<String> = body.paypalEmail()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referralStatus(): Optional<ReferralStatus> = body.referralStatus()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referredBy(): Optional<String> = body.referredBy()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun unsubscribed(): Optional<Boolean> = body.unsubscribed()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vanityKeys(): Optional<List<String>> = body.vanityKeys()

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _email(): JsonField<String> = body._email()

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _firstName(): JsonField<String> = body._firstName()

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _lastName(): JsonField<String> = body._lastName()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [notes].
     *
     * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _notes(): JsonField<String> = body._notes()

    /**
     * Returns the raw JSON value of [paypalEmail].
     *
     * Unlike [paypalEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _paypalEmail(): JsonField<String> = body._paypalEmail()

    /**
     * Returns the raw JSON value of [referralStatus].
     *
     * Unlike [referralStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _referralStatus(): JsonField<ReferralStatus> = body._referralStatus()

    /**
     * Returns the raw JSON value of [referredBy].
     *
     * Unlike [referredBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _referredBy(): JsonField<String> = body._referredBy()

    /**
     * Returns the raw JSON value of [unsubscribed].
     *
     * Unlike [unsubscribed], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _unsubscribed(): JsonField<Boolean> = body._unsubscribed()

    /**
     * Returns the raw JSON value of [vanityKeys].
     *
     * Unlike [vanityKeys], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _vanityKeys(): JsonField<List<String>> = body._vanityKeys()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ParticipantUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ParticipantUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var participantIdOrEmail: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(participantUpdateParams: ParticipantUpdateParams) = apply {
            id = participantUpdateParams.id
            participantIdOrEmail = participantUpdateParams.participantIdOrEmail
            body = participantUpdateParams.body.toBuilder()
            additionalHeaders = participantUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = participantUpdateParams.additionalQueryParams.toBuilder()
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
         * - [email]
         * - [firstName]
         * - [lastName]
         * - [metadata]
         * - [referralStatus]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun email(email: String) = apply { body.email(email) }

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { body.email(email) }

        fun firstName(firstName: String) = apply { body.firstName(firstName) }

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { body.firstName(firstName) }

        fun lastName(lastName: String) = apply { body.lastName(lastName) }

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { body.lastName(lastName) }

        /** Shallow custom metadata object. */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /**
         * Freeform internal notes about the participant (internal only, never exposed to
         * participants).
         */
        fun notes(notes: String) = apply { body.notes(notes) }

        /**
         * Sets [Builder.notes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notes] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun notes(notes: JsonField<String>) = apply { body.notes(notes) }

        /** The participant's PayPal email address, used for affiliate payouts. */
        fun paypalEmail(paypalEmail: String) = apply { body.paypalEmail(paypalEmail) }

        /**
         * Sets [Builder.paypalEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paypalEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun paypalEmail(paypalEmail: JsonField<String>) = apply { body.paypalEmail(paypalEmail) }

        fun referralStatus(referralStatus: ReferralStatus) = apply {
            body.referralStatus(referralStatus)
        }

        /**
         * Sets [Builder.referralStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referralStatus] with a well-typed [ReferralStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referralStatus(referralStatus: JsonField<ReferralStatus>) = apply {
            body.referralStatus(referralStatus)
        }

        fun referredBy(referredBy: String) = apply { body.referredBy(referredBy) }

        /**
         * Sets [Builder.referredBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referredBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun referredBy(referredBy: JsonField<String>) = apply { body.referredBy(referredBy) }

        fun unsubscribed(unsubscribed: Boolean) = apply { body.unsubscribed(unsubscribed) }

        /**
         * Sets [Builder.unsubscribed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unsubscribed] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun unsubscribed(unsubscribed: JsonField<Boolean>) = apply {
            body.unsubscribed(unsubscribed)
        }

        fun vanityKeys(vanityKeys: List<String>) = apply { body.vanityKeys(vanityKeys) }

        /**
         * Sets [Builder.vanityKeys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vanityKeys] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun vanityKeys(vanityKeys: JsonField<List<String>>) = apply { body.vanityKeys(vanityKeys) }

        /**
         * Adds a single [String] to [vanityKeys].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addVanityKey(vanityKey: String) = apply { body.addVanityKey(vanityKey) }

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
         * Returns an immutable instance of [ParticipantUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ParticipantUpdateParams =
            ParticipantUpdateParams(
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
        private val email: JsonField<String>,
        private val firstName: JsonField<String>,
        private val lastName: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val notes: JsonField<String>,
        private val paypalEmail: JsonField<String>,
        private val referralStatus: JsonField<ReferralStatus>,
        private val referredBy: JsonField<String>,
        private val unsubscribed: JsonField<Boolean>,
        private val vanityKeys: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("firstName")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lastName")
            @ExcludeMissing
            lastName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
            @JsonProperty("paypalEmail")
            @ExcludeMissing
            paypalEmail: JsonField<String> = JsonMissing.of(),
            @JsonProperty("referralStatus")
            @ExcludeMissing
            referralStatus: JsonField<ReferralStatus> = JsonMissing.of(),
            @JsonProperty("referredBy")
            @ExcludeMissing
            referredBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("unsubscribed")
            @ExcludeMissing
            unsubscribed: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("vanityKeys")
            @ExcludeMissing
            vanityKeys: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            email,
            firstName,
            lastName,
            metadata,
            notes,
            paypalEmail,
            referralStatus,
            referredBy,
            unsubscribed,
            vanityKeys,
            mutableMapOf(),
        )

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun email(): Optional<String> = email.getOptional("email")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun firstName(): Optional<String> = firstName.getOptional("firstName")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun lastName(): Optional<String> = lastName.getOptional("lastName")

        /**
         * Shallow custom metadata object.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * Freeform internal notes about the participant (internal only, never exposed to
         * participants).
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun notes(): Optional<String> = notes.getOptional("notes")

        /**
         * The participant's PayPal email address, used for affiliate payouts.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun paypalEmail(): Optional<String> = paypalEmail.getOptional("paypalEmail")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun referralStatus(): Optional<ReferralStatus> =
            referralStatus.getOptional("referralStatus")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun referredBy(): Optional<String> = referredBy.getOptional("referredBy")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun unsubscribed(): Optional<Boolean> = unsubscribed.getOptional("unsubscribed")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun vanityKeys(): Optional<List<String>> = vanityKeys.getOptional("vanityKeys")

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [firstName].
         *
         * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("firstName") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        /**
         * Returns the raw JSON value of [lastName].
         *
         * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lastName") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [notes].
         *
         * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

        /**
         * Returns the raw JSON value of [paypalEmail].
         *
         * Unlike [paypalEmail], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("paypalEmail")
        @ExcludeMissing
        fun _paypalEmail(): JsonField<String> = paypalEmail

        /**
         * Returns the raw JSON value of [referralStatus].
         *
         * Unlike [referralStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("referralStatus")
        @ExcludeMissing
        fun _referralStatus(): JsonField<ReferralStatus> = referralStatus

        /**
         * Returns the raw JSON value of [referredBy].
         *
         * Unlike [referredBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("referredBy")
        @ExcludeMissing
        fun _referredBy(): JsonField<String> = referredBy

        /**
         * Returns the raw JSON value of [unsubscribed].
         *
         * Unlike [unsubscribed], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("unsubscribed")
        @ExcludeMissing
        fun _unsubscribed(): JsonField<Boolean> = unsubscribed

        /**
         * Returns the raw JSON value of [vanityKeys].
         *
         * Unlike [vanityKeys], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vanityKeys")
        @ExcludeMissing
        fun _vanityKeys(): JsonField<List<String>> = vanityKeys

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var email: JsonField<String> = JsonMissing.of()
            private var firstName: JsonField<String> = JsonMissing.of()
            private var lastName: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var notes: JsonField<String> = JsonMissing.of()
            private var paypalEmail: JsonField<String> = JsonMissing.of()
            private var referralStatus: JsonField<ReferralStatus> = JsonMissing.of()
            private var referredBy: JsonField<String> = JsonMissing.of()
            private var unsubscribed: JsonField<Boolean> = JsonMissing.of()
            private var vanityKeys: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                email = body.email
                firstName = body.firstName
                lastName = body.lastName
                metadata = body.metadata
                notes = body.notes
                paypalEmail = body.paypalEmail
                referralStatus = body.referralStatus
                referredBy = body.referredBy
                unsubscribed = body.unsubscribed
                vanityKeys = body.vanityKeys.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            /** Shallow custom metadata object. */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /**
             * Freeform internal notes about the participant (internal only, never exposed to
             * participants).
             */
            fun notes(notes: String) = notes(JsonField.of(notes))

            /**
             * Sets [Builder.notes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun notes(notes: JsonField<String>) = apply { this.notes = notes }

            /** The participant's PayPal email address, used for affiliate payouts. */
            fun paypalEmail(paypalEmail: String) = paypalEmail(JsonField.of(paypalEmail))

            /**
             * Sets [Builder.paypalEmail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paypalEmail] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paypalEmail(paypalEmail: JsonField<String>) = apply {
                this.paypalEmail = paypalEmail
            }

            fun referralStatus(referralStatus: ReferralStatus) =
                referralStatus(JsonField.of(referralStatus))

            /**
             * Sets [Builder.referralStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referralStatus] with a well-typed [ReferralStatus]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun referralStatus(referralStatus: JsonField<ReferralStatus>) = apply {
                this.referralStatus = referralStatus
            }

            fun referredBy(referredBy: String) = referredBy(JsonField.of(referredBy))

            /**
             * Sets [Builder.referredBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referredBy] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun referredBy(referredBy: JsonField<String>) = apply { this.referredBy = referredBy }

            fun unsubscribed(unsubscribed: Boolean) = unsubscribed(JsonField.of(unsubscribed))

            /**
             * Sets [Builder.unsubscribed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unsubscribed] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun unsubscribed(unsubscribed: JsonField<Boolean>) = apply {
                this.unsubscribed = unsubscribed
            }

            fun vanityKeys(vanityKeys: List<String>) = vanityKeys(JsonField.of(vanityKeys))

            /**
             * Sets [Builder.vanityKeys] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vanityKeys] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vanityKeys(vanityKeys: JsonField<List<String>>) = apply {
                this.vanityKeys = vanityKeys.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [vanityKeys].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addVanityKey(vanityKey: String) = apply {
                vanityKeys =
                    (vanityKeys ?: JsonField.of(mutableListOf())).also {
                        checkKnown("vanityKeys", it).add(vanityKey)
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    email,
                    firstName,
                    lastName,
                    metadata,
                    notes,
                    paypalEmail,
                    referralStatus,
                    referredBy,
                    unsubscribed,
                    (vanityKeys ?: JsonMissing.of()).map { it.toImmutable() },
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

            email()
            firstName()
            lastName()
            metadata().ifPresent { it.validate() }
            notes()
            paypalEmail()
            referralStatus().ifPresent { it.validate() }
            referredBy()
            unsubscribed()
            vanityKeys()
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
            (if (email.asKnown().isPresent) 1 else 0) +
                (if (firstName.asKnown().isPresent) 1 else 0) +
                (if (lastName.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (notes.asKnown().isPresent) 1 else 0) +
                (if (paypalEmail.asKnown().isPresent) 1 else 0) +
                (referralStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (if (referredBy.asKnown().isPresent) 1 else 0) +
                (if (unsubscribed.asKnown().isPresent) 1 else 0) +
                (vanityKeys.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                email == other.email &&
                firstName == other.firstName &&
                lastName == other.lastName &&
                metadata == other.metadata &&
                notes == other.notes &&
                paypalEmail == other.paypalEmail &&
                referralStatus == other.referralStatus &&
                referredBy == other.referredBy &&
                unsubscribed == other.unsubscribed &&
                vanityKeys == other.vanityKeys &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                email,
                firstName,
                lastName,
                metadata,
                notes,
                paypalEmail,
                referralStatus,
                referredBy,
                unsubscribed,
                vanityKeys,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{email=$email, firstName=$firstName, lastName=$lastName, metadata=$metadata, notes=$notes, paypalEmail=$paypalEmail, referralStatus=$referralStatus, referredBy=$referredBy, unsubscribed=$unsubscribed, vanityKeys=$vanityKeys, additionalProperties=$additionalProperties}"
    }

    /** Shallow custom metadata object. */
    class Metadata
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

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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
        fun validate(): Metadata = apply {
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

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    class ReferralStatus @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CREDIT_PENDING = of("CREDIT_PENDING")

            @JvmField val CREDIT_AWARDED = of("CREDIT_AWARDED")

            @JvmField val CREDIT_EXPIRED = of("CREDIT_EXPIRED")

            @JvmStatic fun of(value: String) = ReferralStatus(JsonField.of(value))
        }

        /** An enum containing [ReferralStatus]'s known values. */
        enum class Known {
            CREDIT_PENDING,
            CREDIT_AWARDED,
            CREDIT_EXPIRED,
        }

        /**
         * An enum containing [ReferralStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ReferralStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CREDIT_PENDING,
            CREDIT_AWARDED,
            CREDIT_EXPIRED,
            /**
             * An enum member indicating that [ReferralStatus] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                CREDIT_PENDING -> Value.CREDIT_PENDING
                CREDIT_AWARDED -> Value.CREDIT_AWARDED
                CREDIT_EXPIRED -> Value.CREDIT_EXPIRED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws GrowsurfInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                CREDIT_PENDING -> Known.CREDIT_PENDING
                CREDIT_AWARDED -> Known.CREDIT_AWARDED
                CREDIT_EXPIRED -> Known.CREDIT_EXPIRED
                else -> throw GrowsurfInvalidDataException("Unknown ReferralStatus: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
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
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws GrowsurfInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ReferralStatus = apply {
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

            return other is ReferralStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParticipantUpdateParams &&
            id == other.id &&
            participantIdOrEmail == other.participantIdOrEmail &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, participantIdOrEmail, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ParticipantUpdateParams{id=$id, participantIdOrEmail=$participantIdOrEmail, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
