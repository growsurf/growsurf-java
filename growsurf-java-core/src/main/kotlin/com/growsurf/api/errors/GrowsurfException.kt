package com.growsurf.api.errors

open class GrowsurfException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
