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
import com.growsurf.api.core.checkRequired
import com.growsurf.api.errors.GrowsurfInvalidDataException
import java.util.Collections
import java.util.Objects

class AffiliateApplicationAnswer
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val fieldId: JsonField<String>,
    private val label: JsonField<String>,
    private val type: JsonField<Type>,
    private val value: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("fieldId") @ExcludeMissing fieldId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonValue = JsonMissing.of(),
    ) : this(fieldId, label, type, value, mutableMapOf())

    /**
     * Stable key of the saved application-form field this answer belongs to.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fieldId(): String = fieldId.getRequired("fieldId")

    /**
     * Customer-configured field label captured when the applicant submitted.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun label(): String = label.getRequired("label")

    /**
     * Saved field type that determined how the scalar answer was validated.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /** Applicant answer represented as one validated string, number, or boolean. */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonValue = value

    /**
     * Returns the raw JSON value of [fieldId].
     *
     * Unlike [fieldId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fieldId") @ExcludeMissing fun _fieldId(): JsonField<String> = fieldId

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * Returns a mutable builder for constructing an instance of [AffiliateApplicationAnswer].
         */
        @JvmStatic fun builder() = Builder()

        private fun isScalarValue(value: JsonValue): Boolean =
            value.accept(
                object : JsonValue.Visitor<Boolean> {
                    override fun visitBoolean(value: Boolean) = true

                    override fun visitNumber(value: Number) = true

                    override fun visitString(value: String) = true

                    override fun visitDefault() = false
                }
            )

        private fun requireScalarValue(value: JsonValue): JsonValue =
            value.also {
                if (!isScalarValue(it)) {
                    throw GrowsurfInvalidDataException(
                        "`value` must be a JSON string, number, or boolean"
                    )
                }
            }
    }

    /** A builder for [AffiliateApplicationAnswer]. */
    class Builder internal constructor() {

        private var fieldId: JsonField<String>? = null
        private var label: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var value: JsonValue? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(affiliateApplicationAnswer: AffiliateApplicationAnswer) = apply {
            fieldId = affiliateApplicationAnswer.fieldId
            label = affiliateApplicationAnswer.label
            type = affiliateApplicationAnswer.type
            value = affiliateApplicationAnswer.value
            additionalProperties = affiliateApplicationAnswer.additionalProperties.toMutableMap()
        }

        /** Stable key of the saved application-form field this answer belongs to. */
        fun fieldId(fieldId: String) = fieldId(JsonField.of(fieldId))

        /**
         * Sets [Builder.fieldId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fieldId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fieldId(fieldId: JsonField<String>) = apply { this.fieldId = fieldId }

        /** Customer-configured field label captured when the applicant submitted. */
        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        /** Saved field type that determined how the scalar answer was validated. */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** Applicant answer represented as one validated string, number, or boolean. */
        fun value(value: String) = value(JsonValue.from(value))

        /** Applicant answer represented as one validated string, number, or boolean. */
        fun value(value: Number) = value(JsonValue.from(value))

        /** Applicant answer represented as one validated string, number, or boolean. */
        fun value(value: Boolean) = value(JsonValue.from(value))

        /** Applicant answer represented as one validated string, number, or boolean. */
        fun value(value: JsonValue) = apply { this.value = requireScalarValue(value) }

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
         * Returns an immutable instance of [AffiliateApplicationAnswer].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AffiliateApplicationAnswer =
            AffiliateApplicationAnswer(
                checkRequired("fieldId", fieldId),
                checkRequired("label", label),
                checkRequired("type", type),
                requireScalarValue(checkRequired("value", value)),
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
    fun validate(): AffiliateApplicationAnswer = apply {
        if (validated) {
            return@apply
        }

        fieldId()
        label()
        type().validate()
        requireScalarValue(value)
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
        (if (fieldId.asKnown().isPresent) 1 else 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (if (isScalarValue(value)) 1 else 0)

    /** Saved field type that determined how the scalar answer was validated. */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val TEXT = of("text")

            @JvmField val TEXTAREA = of("textarea")

            @JvmField val URL = of("url")

            @JvmField val COUNTRY = of("country")

            @JvmField val NUMBER = of("number")

            @JvmField val DROPDOWN = of("dropdown")

            @JvmField val RADIO = of("radio")

            @JvmField val CHECKBOX = of("checkbox")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            TEXT,
            TEXTAREA,
            URL,
            COUNTRY,
            NUMBER,
            DROPDOWN,
            RADIO,
            CHECKBOX,
        }

        /** An enum containing [Type]'s known values, as well as an [_UNKNOWN] member. */
        enum class Value {
            TEXT,
            TEXTAREA,
            URL,
            COUNTRY,
            NUMBER,
            DROPDOWN,
            RADIO,
            CHECKBOX,
            _UNKNOWN,
        }

        /** Returns the known enum value, or [Value._UNKNOWN] for an unknown value. */
        fun value(): Value =
            when (this) {
                TEXT -> Value.TEXT
                TEXTAREA -> Value.TEXTAREA
                URL -> Value.URL
                COUNTRY -> Value.COUNTRY
                NUMBER -> Value.NUMBER
                DROPDOWN -> Value.DROPDOWN
                RADIO -> Value.RADIO
                CHECKBOX -> Value.CHECKBOX
                else -> Value._UNKNOWN
            }

        /**
         * Returns the known enum value.
         *
         * @throws GrowsurfInvalidDataException if this class instance has an unknown value.
         */
        fun known(): Known =
            when (this) {
                TEXT -> Known.TEXT
                TEXTAREA -> Known.TEXTAREA
                URL -> Known.URL
                COUNTRY -> Known.COUNTRY
                NUMBER -> Known.NUMBER
                DROPDOWN -> Known.DROPDOWN
                RADIO -> Known.RADIO
                CHECKBOX -> Known.CHECKBOX
                else -> throw GrowsurfInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * @throws GrowsurfInvalidDataException if the value is not a string.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                GrowsurfInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Type = apply {
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

        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AffiliateApplicationAnswer &&
            fieldId == other.fieldId &&
            label == other.label &&
            type == other.type &&
            value == other.value &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(fieldId, label, type, value, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AffiliateApplicationAnswer{fieldId=$fieldId, label=$label, type=$type, value=$value, additionalProperties=$additionalProperties}"
}
