// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.team

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** The team bound to the API key or OAuth connection. */
class Team
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val name: JsonField<String>,
    private val verificationRequestedAt: JsonField<Long>,
    private val verificationStatus: JsonField<VerificationStatus>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("verificationRequestedAt")
        @ExcludeMissing
        verificationRequestedAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("verificationStatus")
        @ExcludeMissing
        verificationStatus: JsonField<VerificationStatus> = JsonMissing.of(),
    ) : this(name, verificationRequestedAt, verificationStatus, mutableMapOf())

    /** The team's display name. */
    fun name(): String = name.getRequired("name")

    /** When team verification was last requested, as a Unix timestamp in milliseconds. */
    fun verificationRequestedAt(): Optional<Long> =
        verificationRequestedAt.getOptional("verificationRequestedAt")

    /**
     * GrowSurf team verification state. `VERIFIED` is required before a program can send
     * participant emails.
     */
    fun verificationStatus(): VerificationStatus =
        verificationStatus.getRequired("verificationStatus")

    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    @JsonProperty("verificationRequestedAt")
    @ExcludeMissing
    fun _verificationRequestedAt(): JsonField<Long> = verificationRequestedAt

    @JsonProperty("verificationStatus")
    @ExcludeMissing
    fun _verificationStatus(): JsonField<VerificationStatus> = verificationStatus

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
        @JvmStatic fun builder() = Builder()
    }

    class Builder internal constructor() {
        private var name: JsonField<String>? = null
        private var verificationRequestedAt: JsonField<Long>? = null
        private var verificationStatus: JsonField<VerificationStatus>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(team: Team) = apply {
            name = team.name
            verificationRequestedAt = team.verificationRequestedAt
            verificationStatus = team.verificationStatus
            additionalProperties = team.additionalProperties.toMutableMap()
        }

        fun name(name: String) = name(JsonField.of(name))

        fun name(name: JsonField<String>) = apply { this.name = name }

        fun verificationRequestedAt(verificationRequestedAt: Long?) =
            verificationRequestedAt(JsonField.ofNullable(verificationRequestedAt))

        fun verificationRequestedAt(verificationRequestedAt: Long) =
            verificationRequestedAt(verificationRequestedAt as Long?)

        fun verificationRequestedAt(verificationRequestedAt: Optional<Long>) =
            verificationRequestedAt(verificationRequestedAt.getOrNull())

        fun verificationRequestedAt(verificationRequestedAt: JsonField<Long>) = apply {
            this.verificationRequestedAt = verificationRequestedAt
        }

        fun verificationStatus(verificationStatus: VerificationStatus) =
            verificationStatus(JsonField.of(verificationStatus))

        fun verificationStatus(verificationStatus: JsonField<VerificationStatus>) = apply {
            this.verificationStatus = verificationStatus
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

        fun build(): Team =
            Team(
                checkRequired("name", name),
                checkRequired("verificationRequestedAt", verificationRequestedAt),
                checkRequired("verificationStatus", verificationStatus),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Team = apply {
        if (validated) return@apply
        name()
        verificationRequestedAt()
        verificationStatus().validate()
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
        (if (name.asKnown().isPresent) 1 else 0) +
            (if (verificationRequestedAt.asKnown().isPresent) 1 else 0) +
            (verificationStatus.asKnown().getOrNull()?.validity() ?: 0)

    class VerificationStatus
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {
            @JvmField val NOT_REQUESTED = of("NOT_REQUESTED")
            @JvmField val REQUESTED = of("REQUESTED")
            @JvmField val VERIFIED = of("VERIFIED")

            @JvmStatic fun of(value: String) = VerificationStatus(JsonField.of(value))
        }

        enum class Known {
            NOT_REQUESTED,
            REQUESTED,
            VERIFIED,
        }

        enum class Value {
            NOT_REQUESTED,
            REQUESTED,
            VERIFIED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                NOT_REQUESTED -> Value.NOT_REQUESTED
                REQUESTED -> Value.REQUESTED
                VERIFIED -> Value.VERIFIED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                NOT_REQUESTED -> Known.NOT_REQUESTED
                REQUESTED -> Known.REQUESTED
                VERIFIED -> Known.VERIFIED
                else -> throw GrowsurfInvalidDataException("Unknown VerificationStatus: $value")
            }

        fun asString(): String =
            _value().asString().orElseThrow {
                GrowsurfInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): VerificationStatus = apply {
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

        override fun equals(other: Any?): Boolean =
            this === other || (other is VerificationStatus && value == other.value)

        override fun hashCode(): Int = value.hashCode()

        override fun toString(): String = value.toString()
    }

    override fun equals(other: Any?): Boolean =
        this === other ||
            (other is Team &&
                name == other.name &&
                verificationRequestedAt == other.verificationRequestedAt &&
                verificationStatus == other.verificationStatus &&
                additionalProperties == other.additionalProperties)

    private val hashCode: Int by lazy {
        Objects.hash(name, verificationRequestedAt, verificationStatus, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Team{name=$name, verificationRequestedAt=$verificationRequestedAt, verificationStatus=$verificationStatus, additionalProperties=$additionalProperties}"
}
