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

class ReferralFlowScreenshot
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val view: JsonField<String>,
    private val url: JsonField<String>,
    private val width: JsonField<Long>,
    private val height: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("view") @ExcludeMissing view: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        @JsonProperty("width") @ExcludeMissing width: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("height") @ExcludeMissing height: JsonField<Long> = JsonMissing.of(),
    ) : this(view, url, width, height, mutableMapOf())

    /**
     * The referral-flow view captured in this screenshot.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun view(): String = view.getRequired("view")

    /**
     * Image URL for the generated screenshot.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = url.getRequired("url")

    /**
     * Screenshot viewport width in CSS pixels.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun width(): Long = width.getRequired("width")

    /**
     * Screenshot viewport height in CSS pixels.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun height(): Long = height.getRequired("height")

    /** Returns the raw JSON value of [view]. */
    @JsonProperty("view") @ExcludeMissing fun _view(): JsonField<String> = view

    /** Returns the raw JSON value of [url]. */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    /** Returns the raw JSON value of [width]. */
    @JsonProperty("width") @ExcludeMissing fun _width(): JsonField<Long> = width

    /** Returns the raw JSON value of [height]. */
    @JsonProperty("height") @ExcludeMissing fun _height(): JsonField<Long> = height

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
         * Returns a mutable builder for constructing an instance of [ReferralFlowScreenshot].
         *
         * The following fields are required:
         * ```java
         * .view()
         * .url()
         * .width()
         * .height()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReferralFlowScreenshot]. */
    class Builder internal constructor() {

        private var view: JsonField<String>? = null
        private var url: JsonField<String>? = null
        private var width: JsonField<Long>? = null
        private var height: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(screenshot: ReferralFlowScreenshot) = apply {
            view = screenshot.view
            url = screenshot.url
            width = screenshot.width
            height = screenshot.height
            additionalProperties = screenshot.additionalProperties.toMutableMap()
        }

        /** The referral-flow view captured in this screenshot. */
        fun view(view: String) = view(JsonField.of(view))

        fun view(view: JsonField<String>) = apply { this.view = view }

        /** Image URL for the generated screenshot. */
        fun url(url: String) = url(JsonField.of(url))

        fun url(url: JsonField<String>) = apply { this.url = url }

        /** Screenshot viewport width in CSS pixels. */
        fun width(width: Long) = width(JsonField.of(width))

        fun width(width: JsonField<Long>) = apply { this.width = width }

        /** Screenshot viewport height in CSS pixels. */
        fun height(height: Long) = height(JsonField.of(height))

        fun height(height: JsonField<Long>) = apply { this.height = height }

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
         * Returns an immutable instance of [ReferralFlowScreenshot].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .view()
         * .url()
         * .width()
         * .height()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ReferralFlowScreenshot =
            ReferralFlowScreenshot(
                checkRequired("view", view),
                checkRequired("url", url),
                checkRequired("width", width),
                checkRequired("height", height),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     */
    fun validate(): ReferralFlowScreenshot = apply {
        if (validated) {
            return@apply
        }

        view()
        url()
        width()
        height()
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
        (if (view.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0) +
            (if (width.asKnown().isPresent) 1 else 0) +
            (if (height.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReferralFlowScreenshot &&
            view == other.view &&
            url == other.url &&
            width == other.width &&
            height == other.height &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(view, url, width, height, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ReferralFlowScreenshot{view=$view, url=$url, width=$width, height=$height, additionalProperties=$additionalProperties}"
}
