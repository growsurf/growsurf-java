package com.growsurf.api.models.campaign.options

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.JsonNull
import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.jsonMapper
import com.growsurf.api.models.campaign.Language
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignOptionsTest {

    @Test
    fun languagesPreservePublishedJvmSignatures() {
        val type = CampaignOptionsLanguages::class.java
        val fields = mutableMapOf("showFlags" to JsonValue.from(true))
        val original =
            type
                .getConstructor(Language::class.java, List::class.java, Map::class.java)
                .newInstance(Language.EN, listOf(Language.ES), fields)
        val copied =
            type
                .getDeclaredMethod("copy", Language::class.java, List::class.java, Map::class.java)
                .invoke(original, Language.EN, listOf(Language.ES), fields)
                as CampaignOptionsLanguages
        val defaultCopied =
            type
                .getDeclaredMethod(
                    "copy\$default",
                    type,
                    Language::class.java,
                    List::class.java,
                    Map::class.java,
                    Int::class.javaPrimitiveType,
                    Any::class.java,
                )
                .invoke(null, original, null, null, null, 7, null) as CampaignOptionsLanguages

        assertThat(copied.additionalLanguages().get()).containsExactly(Language.ES)
        assertThat(defaultCopied._additionalProperties())
            .containsEntry("showFlags", JsonValue.from(true))
        assertThat(
                type
                    .getConstructor(Language::class.java, List::class.java)
                    .newInstance(Language.EN, listOf(Language.ES))
                    .baseLanguage()
            )
            .contains(Language.EN)
        assertThat(
                type
                    .getConstructor(
                        Language::class.java,
                        List::class.java,
                        Map::class.java,
                        Int::class.javaPrimitiveType,
                        Class.forName("kotlin.jvm.internal.DefaultConstructorMarker"),
                    )
                    .newInstance(null, null, null, 7, null)
                    ._additionalProperties()
            )
            .isEmpty()
    }

    @Test
    fun nestedOptionsPreserveClearsAndAdditionalFields() {
        val mapper = jsonMapper()
        val params =
            OptionUpdateParams.builder()
                .fraud(
                    CampaignOptionsFraud(
                        recaptcha = CampaignOptionsRecaptcha(secretKey = JsonNull.of())
                    )
                )
                .taxDocumentation(CampaignOptionsTaxDocumentation(vatNumber = JsonNull.of()))
                .build()
        assertThat(mapper.readTree(mapper.writeValueAsString(params._body())))
            .isEqualTo(
                mapper.readTree(
                    """{"fraud":{"recaptcha":{"secretKey":null}},"taxDocumentation":{"vatNumber":null}}"""
                )
            )

        val json =
            """{"fraud":{"blockBurnerEmails":true,"recaptcha":{"siteKey":null,"futureKey":true},"futureFraud":[]}}"""
        val options = mapper.readValue(json, CampaignOptions::class.java)
        assertThat(options.fraud().get().blockBurnerEmails()).contains(true)
        assertThat(mapper.readTree(mapper.writeValueAsString(options.fraud().get().copy())))
            .isEqualTo(mapper.readTree(json).get("fraud"))
    }

    @Test
    fun typedFieldsRoundtripAndUpdateParamsUseContractNames() {
        val fraud = CampaignOptionsFraud(blockBurnerEmails = true, maxSignupsPerIp2Min = 5)
        val options =
            CampaignOptions.builder()
                .attributionModel(CampaignOptionsAttributionModel.FIRST_CLICK)
                .referralCookieWindowDays(CampaignOptionsReferralCookieWindowDays.DAYS_90)
                .fraud(fraud)
                .build()

        val mapper = jsonMapper()
        val roundtripped =
            mapper.readValue(mapper.writeValueAsString(options), jacksonTypeRef<CampaignOptions>())

        assertThat(roundtripped.attributionModel())
            .contains(CampaignOptionsAttributionModel.FIRST_CLICK)
        assertThat(roundtripped.fraud().get().blockBurnerEmails()).contains(true)

        val params =
            OptionUpdateParams.builder()
                .attributionModel(CampaignOptionsAttributionModel.FIRST_CLICK)
                .fraud(fraud)
                .build()
        assertThat(params._body()).containsKeys("attributionModel", "fraud")
    }

    @Test
    fun languagesUseContractCodesInResponsesAndUpdates() {
        val mapper = jsonMapper()
        val options =
            mapper.readValue(
                """{"languages":{"baseLanguage":"en","additionalLanguages":["es","pt-BR","zh-CN"],"showFlags":false}}""",
                CampaignOptions::class.java,
            )

        assertThat(options.languages().get().baseLanguage()).contains(Language.EN)
        assertThat(options.languages().get().additionalLanguages().get())
            .containsExactly(Language.ES, Language.PT_BR, Language.ZH_CN)
        assertThat(options.languages().get().showFlags()).contains(false)
        assertThat(options.languages().get().copy().showFlags()).contains(false)
        assertThat(CampaignOptionsLanguages().showFlags()).isEmpty()
        assertThat(options.isValid()).isTrue()

        val params =
            OptionUpdateParams.builder()
                .languages(
                    CampaignOptionsLanguages(
                        baseLanguage = Language.EN,
                        additionalLanguages = listOf(Language.PT_BR),
                        showFlags = true,
                    )
                )
                .build()
        assertThat(mapper.readTree(mapper.writeValueAsString(params._body())))
            .isEqualTo(
                mapper.readTree(
                    """{"languages":{"baseLanguage":"en","additionalLanguages":["pt-BR"],"showFlags":true}}"""
                )
            )
    }

    @Test
    fun validationRejectsWrongTypesForDocumentedFields() {
        val options =
            CampaignOptions.builder()
                .putAdditionalProperty("attributionModel", JsonValue.from(123))
                .build()

        assertThat(options.isValid()).isFalse()
    }
}
