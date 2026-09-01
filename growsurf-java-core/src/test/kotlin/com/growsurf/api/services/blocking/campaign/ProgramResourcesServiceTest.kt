// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.services.blocking.campaign

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.client.okhttp.GrowsurfOkHttpClient
import com.growsurf.api.core.jsonMapper
import com.growsurf.api.models.campaign.resources.ProgramResource
import com.growsurf.api.models.campaign.resources.ProgramResourceCreateParams
import com.growsurf.api.models.campaign.resources.ProgramResourceType
import com.growsurf.api.models.campaign.resources.ProgramResourceUpdateParams
import com.growsurf.api.models.campaign.resources.ProgramResourceUploadParameter
import com.growsurf.api.models.campaign.resources.ProgramResourceUploadResult
import com.growsurf.api.models.campaign.resources.ProgramResourceUploadResultResourceType
import com.growsurf.api.models.campaign.resources.ProgramResourceUploadResultType
import com.growsurf.api.models.campaign.resources.ProgramResourceUploadTicket
import com.growsurf.api.models.campaign.resources.ProgramResourceUploadTicketParams
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

internal class ProgramResourcesServiceTest {
    @Test
    fun resourceIsAttached() {
        val client = GrowsurfOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client.campaign().resources()).isNotNull()
    }

    @Test
    fun createParamsPreserveResourceShape() {
        val params =
            ProgramResourceCreateParams.builder()
                .id("program-id")
                .type(ProgramResourceType.LINK)
                .title("Partner guide")
                .url("https://example.com/guide")
                .build()

        assertThat(params.id()).contains("program-id")
    }

    @Test
    fun resourceAndUploadTicketMatchThePublicContract() {
        val resource =
            ProgramResource(
                id = "resource-id",
                type = ProgramResourceType.LINK,
                title = "Partner guide",
                description = null,
                category = null,
                url = "https://example.com/guide",
                text = null,
                file = null,
                isPublished = true,
                position = 0,
                createdAt = 1_788_134_400_000,
                updatedAt = 1_788_134_460_000,
            )
        val ticket =
            ProgramResourceUploadTicket(
                ticket = "one-time-ticket-with-enough-entropy",
                expiresIn = 600,
                uploadUrl = "https://uploads.example.com/v1/upload",
                uploadParameters =
                    mapOf(
                        "signature" to ProgramResourceUploadParameter.of("signed"),
                        "timestamp" to ProgramResourceUploadParameter.of(1_788_134_400),
                        "overwrite" to ProgramResourceUploadParameter.of(false),
                    ),
            )
        val uploadResult =
            ProgramResourceUploadResult(
                publicId = "signed-resource-id",
                version = 1,
                signature = "signed-result",
                resourceType = ProgramResourceUploadResultResourceType.RAW,
                type = ProgramResourceUploadResultType.AUTHENTICATED,
                bytes = 42,
                secureUrl = "https://uploads.example.com/signed-resource-id",
                additionalProperties = mapOf("etag" to "provider-etag"),
            )

        assertThat(resource.createdAt()).isEqualTo(1_788_134_400_000)
        assertThat(resource.updatedAt()).isEqualTo(1_788_134_460_000)
        assertThat(ticket.uploadParameters().keys)
            .containsExactlyInAnyOrder("signature", "timestamp", "overwrite")
        assertThat(ProgramResourceUploadTicket::class.java.declaredMethods.map { it.name })
            .doesNotContain("cloudName")
        val mapper = jsonMapper()
        val uploadResultJson = mapper.readTree(mapper.writeValueAsString(uploadResult))
        assertThat(uploadResultJson.has("public_id"))
            .withFailMessage("Serialized upload result: %s", uploadResultJson)
            .isTrue()
        assertThat(uploadResultJson["public_id"].asText()).isEqualTo("signed-resource-id")
        assertThat(uploadResultJson["resource_type"].asText()).isEqualTo("raw")
        assertThat(uploadResultJson["type"].asText()).isEqualTo("authenticated")
        assertThat(uploadResultJson["secure_url"].asText())
            .isEqualTo("https://uploads.example.com/signed-resource-id")
        assertThat(uploadResultJson["etag"].asText()).isEqualTo("provider-etag")
        assertThat(uploadResultJson.has("additionalProperties")).isFalse()
        val deserialized =
            mapper.readValue(
                """
                {
                                    "ticket":"one-time-ticket-with-enough-entropy",
                                    "expiresIn":600,
                                    "uploadUrl":"https://uploads.example.com/v1/upload",
                                    "uploadParameters":{"signature":"signed","timestamp":1788134400,"overwrite":false}
                                }
                """
                    .trimIndent(),
                jacksonTypeRef<ProgramResourceUploadTicket>(),
            )
        assertThat(deserialized).isEqualTo(ticket)
        assertThatThrownBy { ProgramResourceUploadParameter.of(mapOf("nested" to "not allowed")) }
            .isInstanceOf(IllegalArgumentException::class.java)
    }

    @Test
    fun writeParamsRejectCrossTypeAndPartialUploadFields() {
        assertThatThrownBy {
                ProgramResourceCreateParams.builder()
                    .id("program-id")
                    .type(ProgramResourceType.LINK)
                    .title("Guide")
                    .url("https://example.com/guide")
                    .text("Guide")
                    .build()
            }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("only one Program Resource type")

        assertThatThrownBy {
                ProgramResourceUpdateParams.builder()
                    .id("program-id")
                    .resourceId("resource-id")
                    .uploadTicket("one-time-ticket")
                    .build()
            }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("must be supplied together")

        assertThatThrownBy {
                ProgramResourceUpdateParams.builder()
                    .id("program-id")
                    .resourceId("resource-id")
                    .build()
            }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("requires at least one field")

        assertThatThrownBy {
                ProgramResourceUpdateParams.builder()
                    .id("program-id")
                    .resourceId("resource-id")
                    .position(100)
                    .build()
            }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("position must be an integer from 0 through 99")

        assertThatThrownBy {
                ProgramResourceUploadTicketParams.builder()
                    .id("program-id")
                    .fileName("${"a".repeat(117)}.pdf")
                    .mimeType("application/pdf")
                    .bytes(42)
                    .build()
            }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("fileName must contain 1 through 120 characters")
    }
}
