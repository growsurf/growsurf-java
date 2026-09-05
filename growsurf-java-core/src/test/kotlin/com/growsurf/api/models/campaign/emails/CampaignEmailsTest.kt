package com.growsurf.api.models.campaign.emails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignEmailsTest {

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
