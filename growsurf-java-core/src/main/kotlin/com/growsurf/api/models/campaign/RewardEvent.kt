// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.fasterxml.jackson.annotation.JsonCreator
import com.growsurf.api.core.Enum
import com.growsurf.api.core.JsonField
import com.growsurf.api.errors.GrowsurfInvalidDataException

/** The referral event that earns a Campaign Reward. */
class RewardEvent @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val LEAD = of("LEAD")

        @JvmField val CONVERSION = of("CONVERSION")

        @JvmStatic fun of(value: String) = RewardEvent(JsonField.of(value))
    }

    enum class Known {
        LEAD,
        CONVERSION,
    }

    enum class Value {
        LEAD,
        CONVERSION,
        _UNKNOWN,
    }

    fun value(): Value =
        when (this) {
            LEAD -> Value.LEAD
            CONVERSION -> Value.CONVERSION
            else -> Value._UNKNOWN
        }

    fun known(): Known =
        when (this) {
            LEAD -> Known.LEAD
            CONVERSION -> Known.CONVERSION
            else -> throw GrowsurfInvalidDataException("Unknown RewardEvent: $value")
        }

    fun asString(): String =
        _value().asString().orElseThrow { GrowsurfInvalidDataException("Value is not a String") }

    private var validated: Boolean = false

    fun validate(): RewardEvent = apply {
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
        return other is RewardEvent && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
