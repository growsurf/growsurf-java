// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.errors

import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.http.Headers
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

abstract class GrowsurfServiceException
protected constructor(message: String, cause: Throwable? = null) :
    GrowsurfException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue

    /** Support URL related to the error, when available. */
    fun supportUrl(): Optional<String> = bodyString("supportUrl")

    /** Rate-limit policy name for `429` errors, when available. */
    fun policyName(): Optional<String> = bodyString("policyName")

    /** Existing participant IDs related to the fraud match. */
    fun matchedParticipantIds(): Optional<List<String>> {
        val items =
            bodyField("matchedParticipantIds")?.asArray()?.getOrNull() ?: return Optional.empty()
        val ids = items.map { it.asString().getOrNull() ?: return Optional.empty() }
        return Optional.of(ids)
    }

    /** When the signup was blocked. */
    fun blockedAt(): Optional<String> = bodyString("blockedAt")

    private fun bodyField(name: String): JsonValue? = body().asObject().getOrNull()?.get(name)

    private fun bodyString(name: String): Optional<String> =
        bodyField(name)?.asString() ?: Optional.empty()
}
