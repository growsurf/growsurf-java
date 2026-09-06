package com.growsurf.api.models.campaign.emails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.JsonNull
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignEmailsTest {

    @Test
    fun nestedEmailSettingsPreserveClearsAndAdditionalFields() {
        val mapper = jsonMapper()
        val params =
            EmailUpdateParams.builder()
                .settings(
                    CampaignEmailSettingsUpdate(
                        contact = CampaignEmailContactSettings(addressLine2 = JsonNull.of()),
                        design = CampaignEmailDesignSettings(header = JsonNull.of()),
                    )
                )
                .build()
        assertThat(mapper.readTree(mapper.writeValueAsString(params._body())))
            .isEqualTo(
                mapper.readTree(
                    """{"settings":{"contact":{"addressLine2":null},"design":{"header":null}}}"""
                )
            )

        val json =
            """{"settings":{"sender":{"fromName":"Pied Piper","futureSender":1},"contact":{"country":null,"futureContact":true},"design":{"footer":null,"futureDesign":[]},"futureSettings":{}}}"""
        val emails = mapper.readValue(json, CampaignEmails::class.java)
        assertThat(emails.settings().get().sender().get().fromName()).contains("Pied Piper")
        assertThat(mapper.readTree(mapper.writeValueAsString(emails.settings().get().copy())))
            .isEqualTo(mapper.readTree(json).get("settings"))
    }

    @Test
    fun typedFieldsRoundtripAndUpdateParamsUseContractNames() {
        val template =
            CampaignEmailTemplate(
                subject = "Welcome",
                body = "<p>Hello {{firstName}}</p>",
                isEnabled = true,
            )
        val emails = CampaignEmails.builder().welcomeNonReferred(template).build()

        val mapper = jsonMapper()
        val roundtripped =
            mapper.readValue(mapper.writeValueAsString(emails), jacksonTypeRef<CampaignEmails>())

        assertThat(roundtripped.welcomeNonReferred().get().subject()).contains("Welcome")

        val params =
            EmailUpdateParams.builder()
                .welcomeNonReferred(template)
                .settings(
                    CampaignEmailSettingsUpdate(
                        sender =
                            CampaignEmailSenderSettingsUpdate(
                                fromName = "Pied Piper",
                                replyToEmail = "rewards@piedpiper.com",
                            )
                    )
                )
                .build()
        assertThat(params._body()).containsKeys("welcomeNonReferred", "settings")
        val sender = params._body()["settings"]?.asObject()?.get()?.get("sender")?.asObject()?.get()
        assertThat(sender?.keys).containsExactlyInAnyOrder("fromName", "replyToEmail")
    }
}
