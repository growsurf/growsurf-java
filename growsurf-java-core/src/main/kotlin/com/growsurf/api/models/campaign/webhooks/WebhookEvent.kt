// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.webhooks

import com.fasterxml.jackson.annotation.JsonCreator
import com.growsurf.api.core.Enum
import com.growsurf.api.core.JsonField
import com.growsurf.api.errors.GrowsurfInvalidDataException

/** A webhook event name. */
class WebhookEvent @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val PARTICIPANT_REACHED_A_GOAL = of("PARTICIPANT_REACHED_A_GOAL")

        @JvmField val NEW_PARTICIPANT_ADDED = of("NEW_PARTICIPANT_ADDED")

        @JvmField val CAMPAIGN_ENDED = of("CAMPAIGN_ENDED")

        @JvmField val PARTICIPANT_FRAUD_STATUS_UPDATED = of("PARTICIPANT_FRAUD_STATUS_UPDATED")

        @JvmField val NEW_COMMISSION_ADDED = of("NEW_COMMISSION_ADDED")

        @JvmField val COMMISSION_ADJUSTED = of("COMMISSION_ADJUSTED")

        @JvmField val NEW_PAYOUT_ISSUED = of("NEW_PAYOUT_ISSUED")

        @JvmStatic fun of(value: String) = WebhookEvent(JsonField.of(value))
    }

    /** An enum containing [WebhookEvent]'s known values. */
    enum class Known {
        PARTICIPANT_REACHED_A_GOAL,
        NEW_PARTICIPANT_ADDED,
        CAMPAIGN_ENDED,
        PARTICIPANT_FRAUD_STATUS_UPDATED,
        NEW_COMMISSION_ADDED,
        COMMISSION_ADJUSTED,
        NEW_PAYOUT_ISSUED,
    }

    /**
     * An enum containing [WebhookEvent]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [WebhookEvent] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        PARTICIPANT_REACHED_A_GOAL,
        NEW_PARTICIPANT_ADDED,
        CAMPAIGN_ENDED,
        PARTICIPANT_FRAUD_STATUS_UPDATED,
        NEW_COMMISSION_ADDED,
        COMMISSION_ADJUSTED,
        NEW_PAYOUT_ISSUED,
        /** An enum member indicating that [WebhookEvent] was instantiated with an unknown value. */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            PARTICIPANT_REACHED_A_GOAL -> Value.PARTICIPANT_REACHED_A_GOAL
            NEW_PARTICIPANT_ADDED -> Value.NEW_PARTICIPANT_ADDED
            CAMPAIGN_ENDED -> Value.CAMPAIGN_ENDED
            PARTICIPANT_FRAUD_STATUS_UPDATED -> Value.PARTICIPANT_FRAUD_STATUS_UPDATED
            NEW_COMMISSION_ADDED -> Value.NEW_COMMISSION_ADDED
            COMMISSION_ADJUSTED -> Value.COMMISSION_ADJUSTED
            NEW_PAYOUT_ISSUED -> Value.NEW_PAYOUT_ISSUED
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws GrowsurfInvalidDataException if this class instance's value is a not a known member.
     */
    fun known(): Known =
        when (this) {
            PARTICIPANT_REACHED_A_GOAL -> Known.PARTICIPANT_REACHED_A_GOAL
            NEW_PARTICIPANT_ADDED -> Known.NEW_PARTICIPANT_ADDED
            CAMPAIGN_ENDED -> Known.CAMPAIGN_ENDED
            PARTICIPANT_FRAUD_STATUS_UPDATED -> Known.PARTICIPANT_FRAUD_STATUS_UPDATED
            NEW_COMMISSION_ADDED -> Known.NEW_COMMISSION_ADDED
            COMMISSION_ADJUSTED -> Known.COMMISSION_ADJUSTED
            NEW_PAYOUT_ISSUED -> Known.NEW_PAYOUT_ISSUED
            else -> throw GrowsurfInvalidDataException("Unknown WebhookEvent: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws GrowsurfInvalidDataException if this class instance's value does not have the expected
     *   primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow { GrowsurfInvalidDataException("Value is not a String") }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws GrowsurfInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): WebhookEvent = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookEvent && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
