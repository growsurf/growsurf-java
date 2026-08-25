// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.fasterxml.jackson.annotation.JsonCreator
import com.growsurf.api.core.Enum
import com.growsurf.api.core.JsonField
import com.growsurf.api.errors.GrowsurfInvalidDataException

/** The affiliate event that generated a commission. */
class CommissionEvent @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val LEAD = of("LEAD")

        @JvmField val SALE = of("SALE")

        @JvmStatic fun of(value: String) = CommissionEvent(JsonField.of(value))
    }

    enum class Known {
        LEAD,
        SALE,
    }

    enum class Value {
        LEAD,
        SALE,
        _UNKNOWN,
    }

    fun value(): Value =
        when (this) {
            LEAD -> Value.LEAD
            SALE -> Value.SALE
            else -> Value._UNKNOWN
        }

    fun known(): Known =
        when (this) {
            LEAD -> Known.LEAD
            SALE -> Known.SALE
            else -> throw GrowsurfInvalidDataException("Unknown CommissionEvent: $value")
        }

    fun asString(): String =
        _value().asString().orElseThrow { GrowsurfInvalidDataException("Value is not a String") }

    private var validated: Boolean = false

    fun validate(): CommissionEvent = apply {
        if (validated) return@apply
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
        if (this === other) return true
        return other is CommissionEvent && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
