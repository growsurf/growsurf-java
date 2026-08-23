// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.errors

import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.checkRequired
import com.growsurf.api.core.http.Headers
import com.growsurf.api.core.jsonMapper
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ConflictException
private constructor(private val headers: Headers, private val body: JsonValue, cause: Throwable?) :
    GrowsurfServiceException(
        "409: ${if (body.isMissing()) "Unknown" else jsonMapper().writeValueAsString(body)}",
        cause,
    ) {

    override fun statusCode(): Int = 409

    override fun headers(): Headers = headers

    override fun body(): JsonValue = body

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [ConflictException]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConflictException]. */
    class Builder internal constructor() {

        private var headers: Headers? = null
        private var body: JsonValue? = null
        private var cause: Throwable? = null

        @JvmSynthetic
        internal fun from(conflictException: ConflictException) = apply {
            headers = conflictException.headers
            body = conflictException.body
            cause = conflictException.cause
        }

        fun headers(headers: Headers) = apply { this.headers = headers }

        fun body(body: JsonValue) = apply { this.body = body }

        fun cause(cause: Throwable?) = apply { this.cause = cause }

        /** Alias for calling [Builder.cause] with `cause.orElse(null)`. */
        fun cause(cause: Optional<Throwable>) = cause(cause.getOrNull())

        fun build(): ConflictException =
            ConflictException(checkRequired("headers", headers), checkRequired("body", body), cause)
    }
}
