// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.installation

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonAutoDetect
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.growsurf.api.core.ExcludeMissing
import com.growsurf.api.core.JsonField
import com.growsurf.api.core.JsonMissing
import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.Params
import com.growsurf.api.core.http.Headers
import com.growsurf.api.core.http.QueryParams
import com.growsurf.api.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Writable mobile SDK settings. The response-only `publicKey` is intentionally absent. */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class CampaignInstallationMobileUpdate
constructor(
    @JsonProperty("isEnabled") private val isEnabled: Boolean? = null,
    @JsonProperty("iosAttributionUrl")
    @ExcludeMissing
    private val iosAttributionUrl: JsonField<String> = JsonMissing.of(),
    @JsonProperty("iosAppStoreUrl")
    @ExcludeMissing
    private val iosAppStoreUrl: JsonField<String> = JsonMissing.of(),
    @JsonProperty("androidPackageName")
    @ExcludeMissing
    private val androidPackageName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("androidAppStoreUrl")
    @ExcludeMissing
    private val androidAppStoreUrl: JsonField<String> = JsonMissing.of(),
    @field:JsonAnySetter
    private val additionalProperties: MutableMap<String, JsonValue> = mutableMapOf(),
) {
    // Validate known values without conflating an omitted field with an explicit clear.
    init {
        iosAttributionUrl.getOptional("iosAttributionUrl")
        iosAppStoreUrl.getOptional("iosAppStoreUrl")
        androidPackageName.getOptional("androidPackageName")
        androidAppStoreUrl.getOptional("androidAppStoreUrl")
    }

    @JsonCreator
    constructor(
        @JsonProperty("isEnabled") isEnabled: Boolean? = null,
        @JsonProperty("iosAttributionUrl")
        @ExcludeMissing
        iosAttributionUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("iosAppStoreUrl")
        @ExcludeMissing
        iosAppStoreUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("androidPackageName")
        @ExcludeMissing
        androidPackageName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("androidAppStoreUrl")
        @ExcludeMissing
        androidAppStoreUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        isEnabled,
        iosAttributionUrl,
        iosAppStoreUrl,
        androidPackageName,
        androidAppStoreUrl,
        mutableMapOf(),
    )

    /** Returns additional fields supplied by the API. */
    @JsonAnyGetter
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties.toImmutable()
}

/**
 * Updates a program's Installation configuration (the dashboard Program Editor's Installation tab).
 * Only the fields you send are changed; anything you leave out is untouched. Documented fields have
 * typed setters. The contract remains open to future settings, which can use
 * [Builder.putAdditionalBodyProperty].
 */
class InstallationUpdateParams
private constructor(
    private val id: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /** The partial Installation configuration body properties to send with the request. */
    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): InstallationUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [InstallationUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstallationUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(installationUpdateParams: InstallationUpdateParams) = apply {
            id = installationUpdateParams.id
            additionalHeaders = installationUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = installationUpdateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                installationUpdateParams.additionalBodyProperties.toMutableMap()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        fun referralTrigger(value: CampaignInstallationReferralTrigger) = apply {
            additionalBodyProperties["referralTrigger"] = JsonValue.from(value)
        }

        fun signupEvent(value: CampaignInstallationSignupEvent) = apply {
            additionalBodyProperties["signupEvent"] = JsonValue.from(value)
        }

        fun shareUrl(value: String) = apply {
            additionalBodyProperties["shareUrl"] = JsonValue.from(value)
        }

        fun useGrowSurfHostedLinks(value: Boolean) = apply {
            additionalBodyProperties["useGrowSurfHostedLinks"] = JsonValue.from(value)
        }

        fun allowedUrls(value: List<String>) = apply {
            additionalBodyProperties["allowedUrls"] = JsonValue.from(value)
        }

        fun signup(value: CampaignInstallationSignup) = apply {
            additionalBodyProperties["signup"] = JsonValue.from(value)
        }

        fun mobile(value: CampaignInstallationMobileUpdate) = apply {
            additionalBodyProperties["mobile"] = JsonValue.from(value)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        /**
         * Returns an immutable instance of [InstallationUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InstallationUpdateParams =
            InstallationUpdateParams(
                id,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    fun _body(): Map<String, JsonValue> = additionalBodyProperties

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstallationUpdateParams &&
            id == other.id &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int =
        Objects.hash(id, additionalHeaders, additionalQueryParams, additionalBodyProperties)

    override fun toString() =
        "InstallationUpdateParams{id=$id, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
