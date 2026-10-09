// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.fasterxml.jackson.annotation.JsonCreator
import com.growsurf.api.core.Enum
import com.growsurf.api.core.JsonField
import com.growsurf.api.errors.GrowsurfInvalidDataException

/**
 * A language a program can run in. Participants see the portal and receive program emails in their
 * language.
 */
class Language @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val EN = of("en")

        @JvmField val ES = of("es")

        @JvmField val FR = of("fr")

        @JvmField val DE = of("de")

        @JvmField val IT = of("it")

        @JvmField val PT_BR = of("pt-BR")

        @JvmField val NL = of("nl")

        @JvmField val PL = of("pl")

        @JvmField val SV = of("sv")

        @JvmField val TR = of("tr")

        @JvmField val JA = of("ja")

        @JvmField val KO = of("ko")

        @JvmField val ZH_CN = of("zh-CN")

        @JvmField val ID = of("id")

        @JvmStatic fun of(value: String) = Language(JsonField.of(value))
    }

    enum class Known {
        EN,
        ES,
        FR,
        DE,
        IT,
        PT_BR,
        NL,
        PL,
        SV,
        TR,
        JA,
        KO,
        ZH_CN,
        ID,
    }

    enum class Value {
        EN,
        ES,
        FR,
        DE,
        IT,
        PT_BR,
        NL,
        PL,
        SV,
        TR,
        JA,
        KO,
        ZH_CN,
        ID,
        _UNKNOWN,
    }

    fun value(): Value =
        when (this) {
            EN -> Value.EN
            ES -> Value.ES
            FR -> Value.FR
            DE -> Value.DE
            IT -> Value.IT
            PT_BR -> Value.PT_BR
            NL -> Value.NL
            PL -> Value.PL
            SV -> Value.SV
            TR -> Value.TR
            JA -> Value.JA
            KO -> Value.KO
            ZH_CN -> Value.ZH_CN
            ID -> Value.ID
            else -> Value._UNKNOWN
        }

    fun known(): Known =
        when (this) {
            EN -> Known.EN
            ES -> Known.ES
            FR -> Known.FR
            DE -> Known.DE
            IT -> Known.IT
            PT_BR -> Known.PT_BR
            NL -> Known.NL
            PL -> Known.PL
            SV -> Known.SV
            TR -> Known.TR
            JA -> Known.JA
            KO -> Known.KO
            ZH_CN -> Known.ZH_CN
            ID -> Known.ID
            else -> throw GrowsurfInvalidDataException("Unknown Language: $value")
        }

    fun asString(): String =
        _value().asString().orElseThrow { GrowsurfInvalidDataException("Value is not a String") }

    private var validated: Boolean = false

    fun validate(): Language = apply {
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
        return other is Language && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
