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
import com.growsurf.api.core.checkKnown
import com.growsurf.api.core.checkRequired
import com.growsurf.api.core.toImmutable
import com.growsurf.api.errors.GrowsurfInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AffiliateApplication
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val answers: JsonField<List<AffiliateApplicationAnswer>>,
    private val createdAt: JsonField<Long>,
    private val decidedAt: JsonField<Long>,
    private val email: JsonField<String>,
    private val firstName: JsonField<String>,
    private val id: JsonField<String>,
    private val lastName: JsonField<String>,
    private val participantId: JsonField<String>,
    private val reapplyAllowedAt: JsonField<Long>,
    private val rejectionReason: JsonField<String>,
    private val reviewedAt: JsonField<Long>,
    private val riskLevel: JsonField<RiskLevel>,
    private val status: JsonField<Status>,
    private val termsAcceptedAt: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("answers")
        @ExcludeMissing
        answers: JsonField<List<AffiliateApplicationAnswer>> = JsonMissing.of(),
        @JsonProperty("createdAt") @ExcludeMissing createdAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("decidedAt") @ExcludeMissing decidedAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("firstName") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastName") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("participantId")
        @ExcludeMissing
        participantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reapplyAllowedAt")
        @ExcludeMissing
        reapplyAllowedAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("rejectionReason")
        @ExcludeMissing
        rejectionReason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reviewedAt") @ExcludeMissing reviewedAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("riskLevel")
        @ExcludeMissing
        riskLevel: JsonField<RiskLevel> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("termsAcceptedAt")
        @ExcludeMissing
        termsAcceptedAt: JsonField<Long> = JsonMissing.of(),
    ) : this(
        answers,
        createdAt,
        decidedAt,
        email,
        firstName,
        id,
        lastName,
        participantId,
        reapplyAllowedAt,
        rejectionReason,
        reviewedAt,
        riskLevel,
        status,
        termsAcceptedAt,
        mutableMapOf(),
    )

    /**
     * The applicant's answers to the saved application form.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun answers(): List<AffiliateApplicationAnswer> = answers.getRequired("answers")

    /**
     * When the application was submitted, in Unix milliseconds.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Long = createdAt.getRequired("createdAt")

    /**
     * When the decision was made, in Unix milliseconds. `null` while pending.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun decidedAt(): Optional<Long> = decidedAt.getOptional("decidedAt")

    /**
     * Required applicant email address, or `null` after applicant data is removed under the
     * Program's retention policy.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): Optional<String> = email.getOptional("email")

    /**
     * Required applicant first name, or `null` after applicant data is removed under the Program's
     * retention policy.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstName(): Optional<String> = firstName.getOptional("firstName")

    /**
     * Application ID.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Required applicant last name, or `null` after applicant data is removed under the Program's
     * retention policy.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastName(): Optional<String> = lastName.getOptional("lastName")

    /**
     * ID of the participant created or upgraded by approval. `null` until the application is
     * approved.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun participantId(): Optional<String> = participantId.getOptional("participantId")

    /**
     * When a denied applicant may apply again, in Unix milliseconds. `null` when not applicable.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reapplyAllowedAt(): Optional<Long> = reapplyAllowedAt.getOptional("reapplyAllowedAt")

    /**
     * The structured reason recorded when the application was denied. `null` until then.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rejectionReason(): Optional<String> = rejectionReason.getOptional("rejectionReason")

    /**
     * When the application was reviewed, in Unix milliseconds. `null` while pending.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reviewedAt(): Optional<Long> = reviewedAt.getOptional("reviewedAt")

    /**
     * GrowSurf risk assessment. Applications that are not `LOW` risk are held for manual review;
     * `null` means no assessment was recorded.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun riskLevel(): Optional<RiskLevel> = riskLevel.getOptional("riskLevel")

    /**
     * Where the application is in review. Only `PENDING` applications can be decided.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * When the applicant accepted the Program Terms, in Unix milliseconds, or `null` when
     * acceptance was not required.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun termsAcceptedAt(): Optional<Long> = termsAcceptedAt.getOptional("termsAcceptedAt")

    /**
     * Returns the raw JSON value of [answers].
     *
     * Unlike [answers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("answers")
    @ExcludeMissing
    fun _answers(): JsonField<List<AffiliateApplicationAnswer>> = answers

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt") @ExcludeMissing fun _createdAt(): JsonField<Long> = createdAt

    /**
     * Returns the raw JSON value of [decidedAt].
     *
     * Unlike [decidedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("decidedAt") @ExcludeMissing fun _decidedAt(): JsonField<Long> = decidedAt

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
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastName") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

    /**
     * Returns the raw JSON value of [participantId].
     *
     * Unlike [participantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("participantId")
    @ExcludeMissing
    fun _participantId(): JsonField<String> = participantId

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
     * Unlike [rejectionReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rejectionReason")
    @ExcludeMissing
    fun _rejectionReason(): JsonField<String> = rejectionReason

    /**
     * Returns the raw JSON value of [reviewedAt].
     *
     * Unlike [reviewedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reviewedAt") @ExcludeMissing fun _reviewedAt(): JsonField<Long> = reviewedAt

    /**
     * Returns the raw JSON value of [riskLevel].
     *
     * Unlike [riskLevel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("riskLevel") @ExcludeMissing fun _riskLevel(): JsonField<RiskLevel> = riskLevel

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [termsAcceptedAt].
     *
     * Unlike [termsAcceptedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("termsAcceptedAt")
    @ExcludeMissing
    fun _termsAcceptedAt(): JsonField<Long> = termsAcceptedAt

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

        /** Returns a mutable builder for constructing an instance of [AffiliateApplication]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AffiliateApplication]. */
    class Builder internal constructor() {

        private var answers: JsonField<MutableList<AffiliateApplicationAnswer>>? = null
        private var createdAt: JsonField<Long>? = null
        private var decidedAt: JsonField<Long>? = null
        private var email: JsonField<String>? = null
        private var firstName: JsonField<String>? = null
        private var id: JsonField<String>? = null
        private var lastName: JsonField<String>? = null
        private var participantId: JsonField<String>? = null
        private var reapplyAllowedAt: JsonField<Long>? = null
        private var rejectionReason: JsonField<String>? = null
        private var reviewedAt: JsonField<Long>? = null
        private var riskLevel: JsonField<RiskLevel>? = null
        private var status: JsonField<Status>? = null
        private var termsAcceptedAt: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(affiliateApplication: AffiliateApplication) = apply {
            answers = affiliateApplication.answers.map { it.toMutableList() }
            createdAt = affiliateApplication.createdAt
            decidedAt = affiliateApplication.decidedAt
            email = affiliateApplication.email
            firstName = affiliateApplication.firstName
            id = affiliateApplication.id
            lastName = affiliateApplication.lastName
            participantId = affiliateApplication.participantId
            reapplyAllowedAt = affiliateApplication.reapplyAllowedAt
            rejectionReason = affiliateApplication.rejectionReason
            reviewedAt = affiliateApplication.reviewedAt
            riskLevel = affiliateApplication.riskLevel
            status = affiliateApplication.status
            termsAcceptedAt = affiliateApplication.termsAcceptedAt
            additionalProperties = affiliateApplication.additionalProperties.toMutableMap()
        }

        /** The applicant's answers to the saved application form. */
        fun answers(answers: List<AffiliateApplicationAnswer>) = answers(JsonField.of(answers))

        /**
         * Sets [Builder.answers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.answers] with a well-typed
         * `List<AffiliateApplicationAnswer>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun answers(answers: JsonField<List<AffiliateApplicationAnswer>>) = apply {
            this.answers = answers.map { it.toMutableList() }
        }

        /**
         * Adds a single [AffiliateApplicationAnswer] to [answers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAnswer(answer: AffiliateApplicationAnswer) = apply {
            answers =
                (answers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("answers", it).add(answer)
                }
        }

        /** When the application was submitted, in Unix milliseconds. */
        fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

        /** When the decision was made, in Unix milliseconds. `null` while pending. */
        fun decidedAt(decidedAt: Long?) = decidedAt(JsonField.ofNullable(decidedAt))

        /**
         * Alias for [Builder.decidedAt].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun decidedAt(decidedAt: Long) = decidedAt(decidedAt as Long?)

        /** Alias for calling [Builder.decidedAt] with `decidedAt.orElse(null)`. */
        fun decidedAt(decidedAt: Optional<Long>) = decidedAt(decidedAt.getOrNull())

        /**
         * Sets [Builder.decidedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.decidedAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun decidedAt(decidedAt: JsonField<Long>) = apply { this.decidedAt = decidedAt }

        /**
         * Required applicant email address, or `null` after applicant data is removed under the
         * Program's retention policy.
         */
        fun email(email: String?) = email(JsonField.ofNullable(email))

        /** Alias for calling [Builder.email] with `email.orElse(null)`. */
        fun email(email: Optional<String>) = email(email.getOrNull())

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /**
         * Required applicant first name, or `null` after applicant data is removed under the
         * Program's retention policy.
         */
        fun firstName(firstName: String?) = firstName(JsonField.ofNullable(firstName))

        /** Alias for calling [Builder.firstName] with `firstName.orElse(null)`. */
        fun firstName(firstName: Optional<String>) = firstName(firstName.getOrNull())

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        /** Application ID. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Required applicant last name, or `null` after applicant data is removed under the
         * Program's retention policy.
         */
        fun lastName(lastName: String?) = lastName(JsonField.ofNullable(lastName))

        /** Alias for calling [Builder.lastName] with `lastName.orElse(null)`. */
        fun lastName(lastName: Optional<String>) = lastName(lastName.getOrNull())

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        /**
         * ID of the participant created or upgraded by approval. `null` until the application is
         * approved.
         */
        fun participantId(participantId: String?) =
            participantId(JsonField.ofNullable(participantId))

        /** Alias for calling [Builder.participantId] with `participantId.orElse(null)`. */
        fun participantId(participantId: Optional<String>) =
            participantId(participantId.getOrNull())

        /**
         * Sets [Builder.participantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.participantId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun participantId(participantId: JsonField<String>) = apply {
            this.participantId = participantId
        }

        /**
         * When a denied applicant may apply again, in Unix milliseconds. `null` when not
         * applicable.
         */
        fun reapplyAllowedAt(reapplyAllowedAt: Long?) =
            reapplyAllowedAt(JsonField.ofNullable(reapplyAllowedAt))

        /**
         * Alias for [Builder.reapplyAllowedAt].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun reapplyAllowedAt(reapplyAllowedAt: Long) = reapplyAllowedAt(reapplyAllowedAt as Long?)

        /** Alias for calling [Builder.reapplyAllowedAt] with `reapplyAllowedAt.orElse(null)`. */
        fun reapplyAllowedAt(reapplyAllowedAt: Optional<Long>) =
            reapplyAllowedAt(reapplyAllowedAt.getOrNull())

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

        /** The structured reason recorded when the application was denied. `null` until then. */
        fun rejectionReason(rejectionReason: String?) =
            rejectionReason(JsonField.ofNullable(rejectionReason))

        /** Alias for calling [Builder.rejectionReason] with `rejectionReason.orElse(null)`. */
        fun rejectionReason(rejectionReason: Optional<String>) =
            rejectionReason(rejectionReason.getOrNull())

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

        /** When the application was reviewed, in Unix milliseconds. `null` while pending. */
        fun reviewedAt(reviewedAt: Long?) = reviewedAt(JsonField.ofNullable(reviewedAt))

        /**
         * Alias for [Builder.reviewedAt].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun reviewedAt(reviewedAt: Long) = reviewedAt(reviewedAt as Long?)

        /** Alias for calling [Builder.reviewedAt] with `reviewedAt.orElse(null)`. */
        fun reviewedAt(reviewedAt: Optional<Long>) = reviewedAt(reviewedAt.getOrNull())

        /**
         * Sets [Builder.reviewedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reviewedAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reviewedAt(reviewedAt: JsonField<Long>) = apply { this.reviewedAt = reviewedAt }

        /**
         * GrowSurf risk assessment. Applications that are not `LOW` risk are held for manual
         * review; `null` means no assessment was recorded.
         */
        fun riskLevel(riskLevel: RiskLevel?) = riskLevel(JsonField.ofNullable(riskLevel))

        /** Alias for calling [Builder.riskLevel] with `riskLevel.orElse(null)`. */
        fun riskLevel(riskLevel: Optional<RiskLevel>) = riskLevel(riskLevel.getOrNull())

        /**
         * Sets [Builder.riskLevel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.riskLevel] with a well-typed [RiskLevel] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun riskLevel(riskLevel: JsonField<RiskLevel>) = apply { this.riskLevel = riskLevel }

        /** Where the application is in review. Only `PENDING` applications can be decided. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * When the applicant accepted the Program Terms, in Unix milliseconds, or `null` when
         * acceptance was not required.
         */
        fun termsAcceptedAt(termsAcceptedAt: Long?) =
            termsAcceptedAt(JsonField.ofNullable(termsAcceptedAt))

        /**
         * Alias for [Builder.termsAcceptedAt].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun termsAcceptedAt(termsAcceptedAt: Long) = termsAcceptedAt(termsAcceptedAt as Long?)

        /** Alias for calling [Builder.termsAcceptedAt] with `termsAcceptedAt.orElse(null)`. */
        fun termsAcceptedAt(termsAcceptedAt: Optional<Long>) =
            termsAcceptedAt(termsAcceptedAt.getOrNull())

        /**
         * Sets [Builder.termsAcceptedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.termsAcceptedAt] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun termsAcceptedAt(termsAcceptedAt: JsonField<Long>) = apply {
            this.termsAcceptedAt = termsAcceptedAt
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
         * Returns an immutable instance of [AffiliateApplication].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AffiliateApplication =
            AffiliateApplication(
                checkRequired("answers", answers).map { it.toImmutable() },
                checkRequired("createdAt", createdAt),
                checkRequired("decidedAt", decidedAt),
                checkRequired("email", email),
                checkRequired("firstName", firstName),
                checkRequired("id", id),
                checkRequired("lastName", lastName),
                checkRequired("participantId", participantId),
                checkRequired("reapplyAllowedAt", reapplyAllowedAt),
                checkRequired("rejectionReason", rejectionReason),
                checkRequired("reviewedAt", reviewedAt),
                checkRequired("riskLevel", riskLevel),
                checkRequired("status", status),
                checkRequired("termsAcceptedAt", termsAcceptedAt),
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
    fun validate(): AffiliateApplication = apply {
        if (validated) {
            return@apply
        }

        answers().forEach { it.validate() }
        createdAt()
        decidedAt()
        email()
        firstName()
        id()
        lastName()
        participantId()
        reapplyAllowedAt()
        rejectionReason()
        reviewedAt()
        riskLevel().ifPresent { it.validate() }
        status().validate()
        termsAcceptedAt()
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
        (answers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (decidedAt.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (firstName.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (lastName.asKnown().isPresent) 1 else 0) +
            (if (participantId.asKnown().isPresent) 1 else 0) +
            (if (reapplyAllowedAt.asKnown().isPresent) 1 else 0) +
            (if (rejectionReason.asKnown().isPresent) 1 else 0) +
            (if (reviewedAt.asKnown().isPresent) 1 else 0) +
            (riskLevel.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (termsAcceptedAt.asKnown().isPresent) 1 else 0)

    /**
     * GrowSurf risk assessment. Applications that are not `LOW` risk are held for manual review;
     * `null` means no assessment was recorded.
     */
    class RiskLevel @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val LOW = of("LOW")

            @JvmField val MEDIUM = of("MEDIUM")

            @JvmField val HIGH = of("HIGH")

            @JvmStatic fun of(value: String) = RiskLevel(JsonField.of(value))
        }

        /** An enum containing [RiskLevel]'s known values. */
        enum class Known {
            LOW,
            MEDIUM,
            HIGH,
        }

        /**
         * An enum containing [RiskLevel]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RiskLevel] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LOW,
            MEDIUM,
            HIGH,
            /**
             * An enum member indicating that [RiskLevel] was instantiated with an unknown value.
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
                LOW -> Value.LOW
                MEDIUM -> Value.MEDIUM
                HIGH -> Value.HIGH
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
                LOW -> Known.LOW
                MEDIUM -> Known.MEDIUM
                HIGH -> Known.HIGH
                else -> throw GrowsurfInvalidDataException("Unknown RiskLevel: $value")
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
        fun validate(): RiskLevel = apply {
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

            return other is RiskLevel && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Where the application is in review. Only `PENDING` applications can be decided. */
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

            @JvmField val PENDING = of("PENDING")

            @JvmField val APPROVED = of("APPROVED")

            @JvmField val DENIED = of("DENIED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
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
            PENDING,
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
                PENDING -> Value.PENDING
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
                PENDING -> Known.PENDING
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

        return other is AffiliateApplication &&
            answers == other.answers &&
            createdAt == other.createdAt &&
            decidedAt == other.decidedAt &&
            email == other.email &&
            firstName == other.firstName &&
            id == other.id &&
            lastName == other.lastName &&
            participantId == other.participantId &&
            reapplyAllowedAt == other.reapplyAllowedAt &&
            rejectionReason == other.rejectionReason &&
            reviewedAt == other.reviewedAt &&
            riskLevel == other.riskLevel &&
            status == other.status &&
            termsAcceptedAt == other.termsAcceptedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            answers,
            createdAt,
            decidedAt,
            email,
            firstName,
            id,
            lastName,
            participantId,
            reapplyAllowedAt,
            rejectionReason,
            reviewedAt,
            riskLevel,
            status,
            termsAcceptedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AffiliateApplication{answers=$answers, createdAt=$createdAt, decidedAt=$decidedAt, email=$email, firstName=$firstName, id=$id, lastName=$lastName, participantId=$participantId, reapplyAllowedAt=$reapplyAllowedAt, rejectionReason=$rejectionReason, reviewedAt=$reviewedAt, riskLevel=$riskLevel, status=$status, termsAcceptedAt=$termsAcceptedAt, additionalProperties=$additionalProperties}"
}
