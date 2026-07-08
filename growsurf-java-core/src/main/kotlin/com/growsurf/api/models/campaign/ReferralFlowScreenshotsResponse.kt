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
import com.growsurf.api.core.checkRequired
import com.growsurf.api.errors.GrowsurfInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class ReferralFlowScreenshotsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val referrer: JsonField<ReferralFlowScreenshot>,
    private val referredFriend: JsonField<ReferralFlowScreenshot>,
    private val generatedAt: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("referrer")
        @ExcludeMissing
        referrer: JsonField<ReferralFlowScreenshot> = JsonMissing.of(),
        @JsonProperty("referredFriend")
        @ExcludeMissing
        referredFriend: JsonField<ReferralFlowScreenshot> = JsonMissing.of(),
        @JsonProperty("generatedAt") @ExcludeMissing generatedAt: JsonField<Long> = JsonMissing.of(),
    ) : this(referrer, referredFriend, generatedAt, mutableMapOf())

    /**
     * Screenshot of the referral flow as a signed-in referrer sees it.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun referrer(): ReferralFlowScreenshot = referrer.getRequired("referrer")

    /**
     * Screenshot of the referral flow as the referred friend sees it.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun referredFriend(): ReferralFlowScreenshot = referredFriend.getRequired("referredFriend")

    /**
     * When the screenshots were generated, as a Unix timestamp in milliseconds.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun generatedAt(): Long = generatedAt.getRequired("generatedAt")

    /** Returns the raw JSON value of [referrer]. */
    @JsonProperty("referrer")
    @ExcludeMissing
    fun _referrer(): JsonField<ReferralFlowScreenshot> = referrer

    /** Returns the raw JSON value of [referredFriend]. */
    @JsonProperty("referredFriend")
    @ExcludeMissing
    fun _referredFriend(): JsonField<ReferralFlowScreenshot> = referredFriend

    /** Returns the raw JSON value of [generatedAt]. */
    @JsonProperty("generatedAt") @ExcludeMissing fun _generatedAt(): JsonField<Long> = generatedAt

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
         *
         * The following fields are required:
         * ```java
         * .referrer()
         * .referredFriend()
         * .generatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReferralFlowScreenshotsResponse]. */
    class Builder internal constructor() {

        private var referrer: JsonField<ReferralFlowScreenshot>? = null
        private var referredFriend: JsonField<ReferralFlowScreenshot>? = null
        private var generatedAt: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(response: ReferralFlowScreenshotsResponse) = apply {
            referrer = response.referrer
            referredFriend = response.referredFriend
            generatedAt = response.generatedAt
            additionalProperties = response.additionalProperties.toMutableMap()
        }

        /** Screenshot of the referral flow as a signed-in referrer sees it. */
        fun referrer(referrer: ReferralFlowScreenshot) = referrer(JsonField.of(referrer))

        fun referrer(referrer: JsonField<ReferralFlowScreenshot>) = apply {
            this.referrer = referrer
        }

        /** Screenshot of the referral flow as the referred friend sees it. */
        fun referredFriend(referredFriend: ReferralFlowScreenshot) =
            referredFriend(JsonField.of(referredFriend))

        fun referredFriend(referredFriend: JsonField<ReferralFlowScreenshot>) = apply {
            this.referredFriend = referredFriend
        }

        /** When the screenshots were generated, as a Unix timestamp in milliseconds. */
        fun generatedAt(generatedAt: Long) = generatedAt(JsonField.of(generatedAt))

        fun generatedAt(generatedAt: JsonField<Long>) = apply { this.generatedAt = generatedAt }

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
         *
         * The following fields are required:
         * ```java
         * .referrer()
         * .referredFriend()
         * .generatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ReferralFlowScreenshotsResponse =
            ReferralFlowScreenshotsResponse(
                checkRequired("referrer", referrer),
                checkRequired("referredFriend", referredFriend),
                checkRequired("generatedAt", generatedAt),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     */
    fun validate(): ReferralFlowScreenshotsResponse = apply {
        if (validated) {
            return@apply
        }

        referrer().validate()
        referredFriend().validate()
        generatedAt()
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
        (referrer.asKnown().getOrNull()?.validity() ?: 0) +
            (referredFriend.asKnown().getOrNull()?.validity() ?: 0) +
            (if (generatedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReferralFlowScreenshotsResponse &&
            referrer == other.referrer &&
            referredFriend == other.referredFriend &&
            generatedAt == other.generatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(referrer, referredFriend, generatedAt, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ReferralFlowScreenshotsResponse{referrer=$referrer, referredFriend=$referredFriend, generatedAt=$generatedAt, additionalProperties=$additionalProperties}"
}
