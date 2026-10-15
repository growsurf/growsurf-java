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

        @JvmField val DA = of("da")

        @JvmField val NB = of("nb")

        @JvmField val NN = of("nn")

        @JvmField val FI = of("fi")

        @JvmField val IS = of("is")

        @JvmField val CS = of("cs")

        @JvmField val SK = of("sk")

        @JvmField val HU = of("hu")

        @JvmField val RO = of("ro")

        @JvmField val HR = of("hr")

        @JvmField val SL = of("sl")

        @JvmField val ET = of("et")

        @JvmField val LV = of("lv")

        @JvmField val LT = of("lt")

        @JvmField val EL = of("el")

        @JvmField val BG = of("bg")

        @JvmField val UK = of("uk")

        @JvmField val RU = of("ru")

        @JvmField val PT_PT = of("pt-PT")

        @JvmField val CA = of("ca")

        @JvmField val VI = of("vi")

        @JvmField val MS = of("ms")

        @JvmField val FIL = of("fil")

        @JvmField val AF = of("af")

        @JvmField val SW = of("sw")

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
        DA,
        NB,
        NN,
        FI,
        IS,
        CS,
        SK,
        HU,
        RO,
        HR,
        SL,
        ET,
        LV,
        LT,
        EL,
        BG,
        UK,
        RU,
        PT_PT,
        CA,
        VI,
        MS,
        FIL,
        AF,
        SW,
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
        DA,
        NB,
        NN,
        FI,
        IS,
        CS,
        SK,
        HU,
        RO,
        HR,
        SL,
        ET,
        LV,
        LT,
        EL,
        BG,
        UK,
        RU,
        PT_PT,
        CA,
        VI,
        MS,
        FIL,
        AF,
        SW,
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
            DA -> Value.DA
            NB -> Value.NB
            NN -> Value.NN
            FI -> Value.FI
            IS -> Value.IS
            CS -> Value.CS
            SK -> Value.SK
            HU -> Value.HU
            RO -> Value.RO
            HR -> Value.HR
            SL -> Value.SL
            ET -> Value.ET
            LV -> Value.LV
            LT -> Value.LT
            EL -> Value.EL
            BG -> Value.BG
            UK -> Value.UK
            RU -> Value.RU
            PT_PT -> Value.PT_PT
            CA -> Value.CA
            VI -> Value.VI
            MS -> Value.MS
            FIL -> Value.FIL
            AF -> Value.AF
            SW -> Value.SW
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
            DA -> Known.DA
            NB -> Known.NB
            NN -> Known.NN
            FI -> Known.FI
            IS -> Known.IS
            CS -> Known.CS
            SK -> Known.SK
            HU -> Known.HU
            RO -> Known.RO
            HR -> Known.HR
            SL -> Known.SL
            ET -> Known.ET
            LV -> Known.LV
            LT -> Known.LT
            EL -> Known.EL
            BG -> Known.BG
            UK -> Known.UK
            RU -> Known.RU
            PT_PT -> Known.PT_PT
            CA -> Known.CA
            VI -> Known.VI
            MS -> Known.MS
            FIL -> Known.FIL
            AF -> Known.AF
            SW -> Known.SW
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
