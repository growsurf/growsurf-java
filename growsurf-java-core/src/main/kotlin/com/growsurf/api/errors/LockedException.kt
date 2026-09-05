// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.errors

import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.checkRequired
import com.growsurf.api.core.http.Headers
import com.growsurf.api.core.jsonMapper
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class LockedException
private constructor(private val headers: Headers, private val body: JsonValue, cause: Throwable?) :
    GrowsurfServiceException(
        "423: ${if (body.isMissing()) "Unknown" else jsonMapper().writeValueAsString(body)}",
        cause,
    ) {

    override fun statusCode(): Int = 423

    override fun headers(): Headers = headers

    override fun body(): JsonValue = body

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [LockedException]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LockedException]. */
    class Builder internal constructor() {

        private var headers: Headers? = null
        private var body: JsonValue? = null
        private var cause: Throwable? = null

        @JvmSynthetic
        internal fun from(lockedException: LockedException) = apply {
            headers = lockedException.headers
            body = lockedException.body
            cause = lockedException.cause
        }

        fun headers(headers: Headers) = apply { this.headers = headers }

        fun body(body: JsonValue) = apply { this.body = body }

        fun cause(cause: Throwable?) = apply { this.cause = cause }

        /** Alias for calling [Builder.cause] with `cause.orElse(null)`. */
        fun cause(cause: Optional<Throwable>) = cause(cause.getOrNull())

        fun build(): LockedException =
            LockedException(checkRequired("headers", headers), checkRequired("body", body), cause)
    }
}
