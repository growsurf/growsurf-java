package com.growsurf.api.models.campaign

import com.fasterxml.jackson.core.type.TypeReference
import com.growsurf.api.core.JsonValue
import com.growsurf.api.errors.GrowsurfInvalidDataException
import java.util.Optional

/** Reads one documented field from a map-backed, forward-compatible config model. */
internal inline fun <reified T : Any> configField(
    properties: Map<String, JsonValue>,
    name: String,
): Optional<T> =
    try {
        Optional.ofNullable(properties[name]?.convert(object : TypeReference<T>() {}))
    } catch (e: IllegalArgumentException) {
        throw GrowsurfInvalidDataException("`$name` is invalid, received ${properties[name]}", e)
    }

/** Writes one documented field while preserving the wire name from the REST contract. */
internal fun MutableMap<String, JsonValue>.putConfigField(name: String, value: Any?) {
    this[name] = JsonValue.from(value)
}
