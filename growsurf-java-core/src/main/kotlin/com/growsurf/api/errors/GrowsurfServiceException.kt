// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.errors

import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.http.Headers

abstract class GrowsurfServiceException
protected constructor(message: String, cause: Throwable? = null) :
    GrowsurfException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
