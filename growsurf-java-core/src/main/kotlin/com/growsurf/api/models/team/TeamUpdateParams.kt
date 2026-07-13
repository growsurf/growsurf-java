// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.team

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.growsurf.api.core.ExcludeMissing
import com.growsurf.api.core.JsonField
import com.growsurf.api.core.JsonMissing
import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.Params
import com.growsurf.api.core.checkRequired
import com.growsurf.api.core.http.Headers
import com.growsurf.api.core.http.QueryParams
import java.util.Collections
import java.util.Objects

/** Updates the bound team's display name. */
class TeamUpdateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The team's display name. */
    fun name(): String = body.name()

    fun _name(): JsonField<String> = body._name()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {
        @JvmStatic fun builder() = Builder()
    }

    class Builder internal constructor() {
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(teamUpdateParams: TeamUpdateParams) = apply {
            body = teamUpdateParams.body.toBuilder()
            additionalHeaders = teamUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = teamUpdateParams.additionalQueryParams.toBuilder()
        }

        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun name(name: String) = apply { body.name(name) }

        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun build(): TeamUpdateParams =
            TeamUpdateParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {
        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of()
        ) : this(name, mutableMapOf())

        /** The team's display name. */
        fun name(): String = name.getRequired("name")

        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {
            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {
            private var name: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                name = body.name
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun name(name: String) = name(JsonField.of(name))

            fun name(name: JsonField<String>) = apply { this.name = name }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Body =
                Body(checkRequired("name", name), additionalProperties.toMutableMap())
        }

        private var validated = false

        fun validate(): Body = apply {
            if (validated) return@apply
            name()
            validated = true
        }

        @JvmSynthetic internal fun validity(): Int = if (name.asKnown().isPresent) 1 else 0

        override fun equals(other: Any?): Boolean =
            this === other ||
                (other is Body &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties)

        private val hashCode: Int by lazy { Objects.hash(name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{name=$name, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean =
        this === other ||
            (other is TeamUpdateParams &&
                body == other.body &&
                additionalHeaders == other.additionalHeaders &&
                additionalQueryParams == other.additionalQueryParams)

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TeamUpdateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
