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
import com.growsurf.api.core.checkRequired
import com.growsurf.api.core.http.Headers
import com.growsurf.api.core.http.QueryParams
import com.growsurf.api.errors.GrowsurfInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Sends an email to a participant. */
class ParticipantEmailParams
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
     * HTML body for a free-form email. You can personalize it with dynamic text, inserting
     * `{{...}}` tokens like `{{firstName}}` or `{{shareUrl}}`. See
     * [Guide to using dynamic text in GrowSurf emails](https://support.growsurf.com/article/213-guide-to-using-dynamic-text-in-growsurf-emails).
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun body(): Optional<String> = body.body()

    /**
     * The program email template to trigger (template mode). Valid template types differ by program
     * type: referral programs and affiliate programs each expose their own set. Send the camelCase
     * key. The template's `isEnabled` setting only controls automatic sends. Referral programs:
     * welcomeNonReferred, referralLinkViewedFirstTime, referralLinkUsed, referredSignup,
     * welcomeReferred, goalAchieved, campaignEndedWinners, campaignEndedNonWinners,
     * progressUpdateMonthly. Affiliate programs: welcomeNonReferred, referralLinkViewedFirstTime,
     * referredSignup, commissionGenerated, commissionAdjusted, payoutPending, payoutSentSuccess,
     * progressUpdateMonthly.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun emailType(): Optional<String> = body.emailType()

    /**
     * Optional preheader text for a free-form email.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun preheader(): Optional<String> = body.preheader()

    /**
     * Subject line for a free-form email. Supports dynamic text (`{{...}}` tokens), the same as the
     * body.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subject(): Optional<String> = body.subject()

    /**
     * Returns the raw JSON value of [emailType].
     *
     * Unlike [emailType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _emailType(): JsonField<String> = body._emailType()

    /**
     * Returns the raw JSON value of [preheader].
     *
     * Unlike [preheader], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _preheader(): JsonField<String> = body._preheader()

    /**
     * Returns the raw JSON value of [subject].
     *
     * Unlike [subject], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _subject(): JsonField<String> = body._subject()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ParticipantEmailParams].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ParticipantEmailParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var participantIdOrEmail: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(participantEmailParams: ParticipantEmailParams) = apply {
            id = participantEmailParams.id
            participantIdOrEmail = participantEmailParams.participantIdOrEmail
            body = participantEmailParams.body.toBuilder()
            additionalHeaders = participantEmailParams.additionalHeaders.toBuilder()
            additionalQueryParams = participantEmailParams.additionalQueryParams.toBuilder()
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
         * - [emailType]
         * - [subject]
         * - [body]
         * - [preheader]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * HTML body for a free-form email. You can personalize it with dynamic text, inserting
         * `{{...}}` tokens like `{{firstName}}` or `{{shareUrl}}`. See
         * [Guide to using dynamic text in GrowSurf emails](https://support.growsurf.com/article/213-guide-to-using-dynamic-text-in-growsurf-emails).
         */
        fun body(body: String) = apply { this.body.body(body) }

        /**
         * Sets [Builder.body] to an arbitrary JSON value.
         *
         * You should usually call [Builder.body] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun body(body: JsonField<String>) = apply { this.body.body(body) }

        /**
         * The program email template to trigger (template mode). Valid template types differ by
         * program type: referral programs and affiliate programs each expose their own set. Send
         * the camelCase key. The template's `isEnabled` setting only controls automatic sends.
         * Referral programs: welcomeNonReferred, referralLinkViewedFirstTime, referralLinkUsed,
         * referredSignup, welcomeReferred, goalAchieved, campaignEndedWinners,
         * campaignEndedNonWinners, progressUpdateMonthly. Affiliate programs: welcomeNonReferred,
         * referralLinkViewedFirstTime, referredSignup, commissionGenerated, commissionAdjusted,
         * payoutPending, payoutSentSuccess, progressUpdateMonthly.
         */
        fun emailType(emailType: String) = apply { body.emailType(emailType) }

        /**
         * Sets [Builder.emailType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun emailType(emailType: JsonField<String>) = apply { body.emailType(emailType) }

        /** Optional preheader text for a free-form email. */
        fun preheader(preheader: String) = apply { body.preheader(preheader) }

        /**
         * Sets [Builder.preheader] to an arbitrary JSON value.
         *
         * You should usually call [Builder.preheader] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun preheader(preheader: JsonField<String>) = apply { body.preheader(preheader) }

        /**
         * Subject line for a free-form email. Supports dynamic text (`{{...}}` tokens), the same as
         * the body.
         */
        fun subject(subject: String) = apply { body.subject(subject) }

        /**
         * Sets [Builder.subject] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subject] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun subject(subject: JsonField<String>) = apply { body.subject(subject) }

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
         * Returns an immutable instance of [ParticipantEmailParams].
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
        fun build(): ParticipantEmailParams =
            ParticipantEmailParams(
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

    /**
     * Provide EITHER `emailType` (template mode) OR `subject` + `body` (free-form mode), not both.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val body: JsonField<String>,
        private val emailType: JsonField<String>,
        private val preheader: JsonField<String>,
        private val subject: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("body") @ExcludeMissing body: JsonField<String> = JsonMissing.of(),
            @JsonProperty("emailType")
            @ExcludeMissing
            emailType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("preheader")
            @ExcludeMissing
            preheader: JsonField<String> = JsonMissing.of(),
            @JsonProperty("subject") @ExcludeMissing subject: JsonField<String> = JsonMissing.of(),
        ) : this(body, emailType, preheader, subject, mutableMapOf())

        /**
         * HTML body for a free-form email. You can personalize it with dynamic text, inserting
         * `{{...}}` tokens like `{{firstName}}` or `{{shareUrl}}`. See
         * [Guide to using dynamic text in GrowSurf emails](https://support.growsurf.com/article/213-guide-to-using-dynamic-text-in-growsurf-emails).
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun body(): Optional<String> = body.getOptional("body")

        /**
         * The program email template to trigger (template mode). Valid template types differ by
         * program type: referral programs and affiliate programs each expose their own set. Send
         * the camelCase key. The template's `isEnabled` setting only controls automatic sends.
         * Referral programs: welcomeNonReferred, referralLinkViewedFirstTime, referralLinkUsed,
         * referredSignup, welcomeReferred, goalAchieved, campaignEndedWinners,
         * campaignEndedNonWinners, progressUpdateMonthly. Affiliate programs: welcomeNonReferred,
         * referralLinkViewedFirstTime, referredSignup, commissionGenerated, commissionAdjusted,
         * payoutPending, payoutSentSuccess, progressUpdateMonthly.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun emailType(): Optional<String> = emailType.getOptional("emailType")

        /**
         * Optional preheader text for a free-form email.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun preheader(): Optional<String> = preheader.getOptional("preheader")

        /**
         * Subject line for a free-form email. Supports dynamic text (`{{...}}` tokens), the same as
         * the body.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun subject(): Optional<String> = subject.getOptional("subject")

        /**
         * Returns the raw JSON value of [body].
         *
         * Unlike [body], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("body") @ExcludeMissing fun _body(): JsonField<String> = body

        /**
         * Returns the raw JSON value of [emailType].
         *
         * Unlike [emailType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("emailType") @ExcludeMissing fun _emailType(): JsonField<String> = emailType

        /**
         * Returns the raw JSON value of [preheader].
         *
         * Unlike [preheader], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("preheader") @ExcludeMissing fun _preheader(): JsonField<String> = preheader

        /**
         * Returns the raw JSON value of [subject].
         *
         * Unlike [subject], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("subject") @ExcludeMissing fun _subject(): JsonField<String> = subject

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

            private var body: JsonField<String> = JsonMissing.of()
            private var emailType: JsonField<String> = JsonMissing.of()
            private var preheader: JsonField<String> = JsonMissing.of()
            private var subject: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                this.body = body.body
                emailType = body.emailType
                preheader = body.preheader
                subject = body.subject
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * HTML body for a free-form email. You can personalize it with dynamic text, inserting
             * `{{...}}` tokens like `{{firstName}}` or `{{shareUrl}}`. See
             * [Guide to using dynamic text in GrowSurf emails](https://support.growsurf.com/article/213-guide-to-using-dynamic-text-in-growsurf-emails).
             */
            fun body(body: String) = body(JsonField.of(body))

            /**
             * Sets [Builder.body] to an arbitrary JSON value.
             *
             * You should usually call [Builder.body] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun body(body: JsonField<String>) = apply { this.body = body }

            /**
             * The program email template to trigger (template mode). Valid template types differ by
             * program type: referral programs and affiliate programs each expose their own set.
             * Send the camelCase key. The template's `isEnabled` setting only controls automatic
             * sends. Referral programs: welcomeNonReferred, referralLinkViewedFirstTime,
             * referralLinkUsed, referredSignup, welcomeReferred, goalAchieved,
             * campaignEndedWinners, campaignEndedNonWinners, progressUpdateMonthly. Affiliate
             * programs: welcomeNonReferred, referralLinkViewedFirstTime, referredSignup,
             * commissionGenerated, commissionAdjusted, payoutPending, payoutSentSuccess,
             * progressUpdateMonthly.
             */
            fun emailType(emailType: String) = emailType(JsonField.of(emailType))

            /**
             * Sets [Builder.emailType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.emailType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun emailType(emailType: JsonField<String>) = apply { this.emailType = emailType }

            /** Optional preheader text for a free-form email. */
            fun preheader(preheader: String) = preheader(JsonField.of(preheader))

            /**
             * Sets [Builder.preheader] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preheader] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun preheader(preheader: JsonField<String>) = apply { this.preheader = preheader }

            /**
             * Subject line for a free-form email. Supports dynamic text (`{{...}}` tokens), the
             * same as the body.
             */
            fun subject(subject: String) = subject(JsonField.of(subject))

            /**
             * Sets [Builder.subject] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subject] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subject(subject: JsonField<String>) = apply { this.subject = subject }

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
                Body(body, emailType, preheader, subject, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            body()
            emailType()
            preheader()
            subject()
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
            (if (body.asKnown().isPresent) 1 else 0) +
                (if (emailType.asKnown().isPresent) 1 else 0) +
                (if (preheader.asKnown().isPresent) 1 else 0) +
                (if (subject.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                body == other.body &&
                emailType == other.emailType &&
                preheader == other.preheader &&
                subject == other.subject &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(body, emailType, preheader, subject, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{body=$body, emailType=$emailType, preheader=$preheader, subject=$subject, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParticipantEmailParams &&
            id == other.id &&
            participantIdOrEmail == other.participantIdOrEmail &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, participantIdOrEmail, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ParticipantEmailParams{id=$id, participantIdOrEmail=$participantIdOrEmail, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
