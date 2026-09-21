// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.growsurf.api.core.ExcludeMissing
import com.growsurf.api.core.JsonField
import com.growsurf.api.core.JsonMissing
import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.checkKnown
import com.growsurf.api.core.toImmutable
import com.growsurf.api.errors.GrowsurfInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Two preview images of the referral flow with expiring URLs. The images render GrowSurf's own
 * preview, not the program's installed website, so they do not prove an installation.
 */
class ReferralFlowScreenshotsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val expiresAt: JsonField<OffsetDateTime>,
    private val generatedAt: JsonField<OffsetDateTime>,
    private val screenshots: JsonField<List<ReferralFlowScreenshot>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("expiresAt")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("generatedAt")
        @ExcludeMissing
        generatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("screenshots")
        @ExcludeMissing
        screenshots: JsonField<List<ReferralFlowScreenshot>> = JsonMissing.of(),
    ) : this(expiresAt, generatedAt, screenshots, mutableMapOf())

    /**
     * ISO 8601 time after which every `url` in `screenshots` stops working.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiresAt(): Optional<OffsetDateTime> = expiresAt.getOptional("expiresAt")

    /**
     * ISO 8601 time the images were rendered.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun generatedAt(): Optional<OffsetDateTime> = generatedAt.getOptional("generatedAt")

    /**
     * One entry per view, in referrer then referred-friend order.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun screenshots(): Optional<List<ReferralFlowScreenshot>> =
        screenshots.getOptional("screenshots")

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiresAt")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [generatedAt].
     *
     * Unlike [generatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("generatedAt")
    @ExcludeMissing
    fun _generatedAt(): JsonField<OffsetDateTime> = generatedAt

    /**
     * Returns the raw JSON value of [screenshots].
     *
     * Unlike [screenshots], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("screenshots")
    @ExcludeMissing
    fun _screenshots(): JsonField<List<ReferralFlowScreenshot>> = screenshots

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
         * [ReferralFlowScreenshotsResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReferralFlowScreenshotsResponse]. */
    class Builder internal constructor() {

        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var generatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var screenshots: JsonField<MutableList<ReferralFlowScreenshot>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(referralFlowScreenshotsResponse: ReferralFlowScreenshotsResponse) =
            apply {
                expiresAt = referralFlowScreenshotsResponse.expiresAt
                generatedAt = referralFlowScreenshotsResponse.generatedAt
                screenshots = referralFlowScreenshotsResponse.screenshots.map { it.toMutableList() }
                additionalProperties =
                    referralFlowScreenshotsResponse.additionalProperties.toMutableMap()
            }

        /** ISO 8601 time after which every `url` in `screenshots` stops working. */
        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /** ISO 8601 time the images were rendered. */
        fun generatedAt(generatedAt: OffsetDateTime) = generatedAt(JsonField.of(generatedAt))

        /**
         * Sets [Builder.generatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.generatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun generatedAt(generatedAt: JsonField<OffsetDateTime>) = apply {
            this.generatedAt = generatedAt
        }

        /** One entry per view, in referrer then referred-friend order. */
        fun screenshots(screenshots: List<ReferralFlowScreenshot>) =
            screenshots(JsonField.of(screenshots))

        /**
         * Sets [Builder.screenshots] to an arbitrary JSON value.
         *
         * You should usually call [Builder.screenshots] with a well-typed
         * `List<ReferralFlowScreenshot>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun screenshots(screenshots: JsonField<List<ReferralFlowScreenshot>>) = apply {
            this.screenshots = screenshots.map { it.toMutableList() }
        }

        /**
         * Adds a single [ReferralFlowScreenshot] to [screenshots].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addScreenshot(screenshot: ReferralFlowScreenshot) = apply {
            screenshots =
                (screenshots ?: JsonField.of(mutableListOf())).also {
                    checkKnown("screenshots", it).add(screenshot)
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
         * Returns an immutable instance of [ReferralFlowScreenshotsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ReferralFlowScreenshotsResponse =
            ReferralFlowScreenshotsResponse(
                expiresAt,
                generatedAt,
                (screenshots ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): ReferralFlowScreenshotsResponse = apply {
        if (validated) {
            return@apply
        }

        expiresAt()
        generatedAt()
        screenshots().ifPresent { it.forEach { it.validate() } }
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
        (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (if (generatedAt.asKnown().isPresent) 1 else 0) +
            (screenshots.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReferralFlowScreenshotsResponse &&
            expiresAt == other.expiresAt &&
            generatedAt == other.generatedAt &&
            screenshots == other.screenshots &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(expiresAt, generatedAt, screenshots, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ReferralFlowScreenshotsResponse{expiresAt=$expiresAt, generatedAt=$generatedAt, screenshots=$screenshots, additionalProperties=$additionalProperties}"
}
