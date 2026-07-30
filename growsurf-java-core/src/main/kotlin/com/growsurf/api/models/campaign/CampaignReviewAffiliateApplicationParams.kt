// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

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
import com.growsurf.api.core.checkRequired
import com.growsurf.api.core.http.Headers
import com.growsurf.api.core.http.QueryParams
import com.growsurf.api.errors.GrowsurfInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Decides a pending application. Set `status` to `APPROVED` to enroll the applicant (this creates
 * the participant, or upgrades an existing participant with the same email), or to `DENIED` with an
 * optional `rejectionReason`. A denied applicant may reapply after the program's reapplication
 * cooldown; send an earlier `reapplyAllowedAt` (without `status`) to shorten that wait for one
 * applicant. Provide exactly one of `status` or `reapplyAllowedAt`. Denial-only fields are only
 * valid with `status` set to `DENIED`. Approval is idempotent: repeating it returns the same
 * participant.
 */
class CampaignReviewAffiliateApplicationParams
private constructor(
    private val id: String?,
    private val applicationId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    fun applicationId(): String = applicationId

    /**
     * When denying, let the applicant reapply right away instead of waiting out the program's
     * reapplication cooldown. Only valid when `status` is `DENIED`.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowImmediateReapply(): Optional<Boolean> = body.allowImmediateReapply()

    /**
     * For an already-denied application, move the reapplication window to this earlier time, in
     * Unix milliseconds. Send without `status`.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reapplyAllowedAt(): Optional<Long> = body.reapplyAllowedAt()

    /**
     * Short reason recorded with a denial. Only valid when `status` is `DENIED`. Maximum 255
     * characters.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rejectionReason(): Optional<String> = body.rejectionReason()

    /**
     * Private note recorded with a denial. Only valid when `status` is `DENIED`; never shown to the
     * applicant. Maximum 500 characters.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reviewNote(): Optional<String> = body.reviewNote()

    /**
     * The decision. `APPROVED` enrolls the applicant as an affiliate; `DENIED` closes the
     * application.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = body.status()

    /**
     * Returns the raw JSON value of [allowImmediateReapply].
     *
     * Unlike [allowImmediateReapply], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _allowImmediateReapply(): JsonField<Boolean> = body._allowImmediateReapply()

    /**
     * Returns the raw JSON value of [reapplyAllowedAt].
     *
     * Unlike [reapplyAllowedAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _reapplyAllowedAt(): JsonField<Long> = body._reapplyAllowedAt()

    /**
     * Returns the raw JSON value of [rejectionReason].
     *
     * Unlike [rejectionReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rejectionReason(): JsonField<String> = body._rejectionReason()

    /**
     * Returns the raw JSON value of [reviewNote].
     *
     * Unlike [reviewNote], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _reviewNote(): JsonField<String> = body._reviewNote()

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _status(): JsonField<Status> = body._status()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CampaignReviewAffiliateApplicationParams].
         *
         * The following fields are required:
         * ```java
         * .applicationId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CampaignReviewAffiliateApplicationParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var applicationId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            campaignReviewAffiliateApplicationParams: CampaignReviewAffiliateApplicationParams
        ) = apply {
            id = campaignReviewAffiliateApplicationParams.id
            applicationId = campaignReviewAffiliateApplicationParams.applicationId
            body = campaignReviewAffiliateApplicationParams.body.toBuilder()
            additionalHeaders =
                campaignReviewAffiliateApplicationParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                campaignReviewAffiliateApplicationParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        fun applicationId(applicationId: String) = apply { this.applicationId = applicationId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [allowImmediateReapply]
         * - [reapplyAllowedAt]
         * - [rejectionReason]
         * - [reviewNote]
         * - [status]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * When denying, let the applicant reapply right away instead of waiting out the program's
         * reapplication cooldown. Only valid when `status` is `DENIED`.
         */
        fun allowImmediateReapply(allowImmediateReapply: Boolean) = apply {
            body.allowImmediateReapply(allowImmediateReapply)
        }

        /**
         * Sets [Builder.allowImmediateReapply] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowImmediateReapply] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allowImmediateReapply(allowImmediateReapply: JsonField<Boolean>) = apply {
            body.allowImmediateReapply(allowImmediateReapply)
        }

        /**
         * For an already-denied application, move the reapplication window to this earlier time, in
         * Unix milliseconds. Send without `status`.
         */
        fun reapplyAllowedAt(reapplyAllowedAt: Long) = apply {
            body.reapplyAllowedAt(reapplyAllowedAt)
        }

        /**
         * Sets [Builder.reapplyAllowedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reapplyAllowedAt] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reapplyAllowedAt(reapplyAllowedAt: JsonField<Long>) = apply {
            body.reapplyAllowedAt(reapplyAllowedAt)
        }

        /**
         * Short reason recorded with a denial. Only valid when `status` is `DENIED`. Maximum 255
         * characters.
         */
        fun rejectionReason(rejectionReason: String) = apply {
            body.rejectionReason(rejectionReason)
        }

        /**
         * Sets [Builder.rejectionReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rejectionReason] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rejectionReason(rejectionReason: JsonField<String>) = apply {
            body.rejectionReason(rejectionReason)
        }

        /**
         * Private note recorded with a denial. Only valid when `status` is `DENIED`; never shown to
         * the applicant. Maximum 500 characters.
         */
        fun reviewNote(reviewNote: String) = apply { body.reviewNote(reviewNote) }

        /**
         * Sets [Builder.reviewNote] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reviewNote] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reviewNote(reviewNote: JsonField<String>) = apply { body.reviewNote(reviewNote) }

        /**
         * The decision. `APPROVED` enrolls the applicant as an affiliate; `DENIED` closes the
         * application.
         */
        fun status(status: Status) = apply { body.status(status) }

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { body.status(status) }

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
         * Returns an immutable instance of [CampaignReviewAffiliateApplicationParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .applicationId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CampaignReviewAffiliateApplicationParams =
            CampaignReviewAffiliateApplicationParams(
                id,
                checkRequired("applicationId", applicationId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            1 -> applicationId
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val allowImmediateReapply: JsonField<Boolean>,
        private val reapplyAllowedAt: JsonField<Long>,
        private val rejectionReason: JsonField<String>,
        private val reviewNote: JsonField<String>,
        private val status: JsonField<Status>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("allowImmediateReapply")
            @ExcludeMissing
            allowImmediateReapply: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("reapplyAllowedAt")
            @ExcludeMissing
            reapplyAllowedAt: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("rejectionReason")
            @ExcludeMissing
            rejectionReason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reviewNote")
            @ExcludeMissing
            reviewNote: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        ) : this(
            allowImmediateReapply,
            reapplyAllowedAt,
            rejectionReason,
            reviewNote,
            status,
            mutableMapOf(),
        )

        /**
         * When denying, let the applicant reapply right away instead of waiting out the program's
         * reapplication cooldown. Only valid when `status` is `DENIED`.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun allowImmediateReapply(): Optional<Boolean> =
            allowImmediateReapply.getOptional("allowImmediateReapply")

        /**
         * For an already-denied application, move the reapplication window to this earlier time, in
         * Unix milliseconds. Send without `status`.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun reapplyAllowedAt(): Optional<Long> = reapplyAllowedAt.getOptional("reapplyAllowedAt")

        /**
         * Short reason recorded with a denial. Only valid when `status` is `DENIED`. Maximum 255
         * characters.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rejectionReason(): Optional<String> = rejectionReason.getOptional("rejectionReason")

        /**
         * Private note recorded with a denial. Only valid when `status` is `DENIED`; never shown to
         * the applicant. Maximum 500 characters.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun reviewNote(): Optional<String> = reviewNote.getOptional("reviewNote")

        /**
         * The decision. `APPROVED` enrolls the applicant as an affiliate; `DENIED` closes the
         * application.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * Returns the raw JSON value of [allowImmediateReapply].
         *
         * Unlike [allowImmediateReapply], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allowImmediateReapply")
        @ExcludeMissing
        fun _allowImmediateReapply(): JsonField<Boolean> = allowImmediateReapply

        /**
         * Returns the raw JSON value of [reapplyAllowedAt].
         *
         * Unlike [reapplyAllowedAt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("reapplyAllowedAt")
        @ExcludeMissing
        fun _reapplyAllowedAt(): JsonField<Long> = reapplyAllowedAt

        /**
         * Returns the raw JSON value of [rejectionReason].
         *
         * Unlike [rejectionReason], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rejectionReason")
        @ExcludeMissing
        fun _rejectionReason(): JsonField<String> = rejectionReason

        /**
         * Returns the raw JSON value of [reviewNote].
         *
         * Unlike [reviewNote], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reviewNote")
        @ExcludeMissing
        fun _reviewNote(): JsonField<String> = reviewNote

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

            private var allowImmediateReapply: JsonField<Boolean> = JsonMissing.of()
            private var reapplyAllowedAt: JsonField<Long> = JsonMissing.of()
            private var rejectionReason: JsonField<String> = JsonMissing.of()
            private var reviewNote: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                allowImmediateReapply = body.allowImmediateReapply
                reapplyAllowedAt = body.reapplyAllowedAt
                rejectionReason = body.rejectionReason
                reviewNote = body.reviewNote
                status = body.status
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * When denying, let the applicant reapply right away instead of waiting out the
             * program's reapplication cooldown. Only valid when `status` is `DENIED`.
             */
            fun allowImmediateReapply(allowImmediateReapply: Boolean) =
                allowImmediateReapply(JsonField.of(allowImmediateReapply))

            /**
             * Sets [Builder.allowImmediateReapply] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowImmediateReapply] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun allowImmediateReapply(allowImmediateReapply: JsonField<Boolean>) = apply {
                this.allowImmediateReapply = allowImmediateReapply
            }

            /**
             * For an already-denied application, move the reapplication window to this earlier
             * time, in Unix milliseconds. Send without `status`.
             */
            fun reapplyAllowedAt(reapplyAllowedAt: Long) =
                reapplyAllowedAt(JsonField.of(reapplyAllowedAt))

            /**
             * Sets [Builder.reapplyAllowedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reapplyAllowedAt] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reapplyAllowedAt(reapplyAllowedAt: JsonField<Long>) = apply {
                this.reapplyAllowedAt = reapplyAllowedAt
            }

            /**
             * Short reason recorded with a denial. Only valid when `status` is `DENIED`. Maximum
             * 255 characters.
             */
            fun rejectionReason(rejectionReason: String) =
                rejectionReason(JsonField.of(rejectionReason))

            /**
             * Sets [Builder.rejectionReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rejectionReason] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rejectionReason(rejectionReason: JsonField<String>) = apply {
                this.rejectionReason = rejectionReason
            }

            /**
             * Private note recorded with a denial. Only valid when `status` is `DENIED`; never
             * shown to the applicant. Maximum 500 characters.
             */
            fun reviewNote(reviewNote: String) = reviewNote(JsonField.of(reviewNote))

            /**
             * Sets [Builder.reviewNote] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reviewNote] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reviewNote(reviewNote: JsonField<String>) = apply { this.reviewNote = reviewNote }

            /**
             * The decision. `APPROVED` enrolls the applicant as an affiliate; `DENIED` closes the
             * application.
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
                    allowImmediateReapply,
                    reapplyAllowedAt,
                    rejectionReason,
                    reviewNote,
                    status,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            allowImmediateReapply()
            reapplyAllowedAt()
            rejectionReason()
            reviewNote()
            status().ifPresent { it.validate() }
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
            (if (allowImmediateReapply.asKnown().isPresent) 1 else 0) +
                (if (reapplyAllowedAt.asKnown().isPresent) 1 else 0) +
                (if (rejectionReason.asKnown().isPresent) 1 else 0) +
                (if (reviewNote.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                allowImmediateReapply == other.allowImmediateReapply &&
                reapplyAllowedAt == other.reapplyAllowedAt &&
                rejectionReason == other.rejectionReason &&
                reviewNote == other.reviewNote &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                allowImmediateReapply,
                reapplyAllowedAt,
                rejectionReason,
                reviewNote,
                status,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{allowImmediateReapply=$allowImmediateReapply, reapplyAllowedAt=$reapplyAllowedAt, rejectionReason=$rejectionReason, reviewNote=$reviewNote, status=$status, additionalProperties=$additionalProperties}"
    }

    /**
     * The decision. `APPROVED` enrolls the applicant as an affiliate; `DENIED` closes the
     * application.
     */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val APPROVED = of("APPROVED")

            @JvmField val DENIED = of("DENIED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            APPROVED,
            DENIED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            APPROVED,
            DENIED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                APPROVED -> Value.APPROVED
                DENIED -> Value.DENIED
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
                APPROVED -> Known.APPROVED
                DENIED -> Known.DENIED
                else -> throw GrowsurfInvalidDataException("Unknown Status: $value")
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

        return other is CampaignReviewAffiliateApplicationParams &&
            id == other.id &&
            applicationId == other.applicationId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, applicationId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CampaignReviewAffiliateApplicationParams{id=$id, applicationId=$applicationId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
