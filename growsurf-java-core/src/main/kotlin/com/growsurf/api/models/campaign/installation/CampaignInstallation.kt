// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.installation

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAutoDetect
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue as JsonValueAnnotation
import com.growsurf.api.core.ExcludeMissing
import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.toImmutable
import com.growsurf.api.errors.GrowsurfInvalidDataException
import com.growsurf.api.models.campaign.configField
import com.growsurf.api.models.campaign.putConfigField
import java.util.Objects
import java.util.Optional

enum class CampaignInstallationReferralTrigger(@get:JsonValueAnnotation val value: String) {
    CUSTOM("CUSTOM"),
    ON_SIGNUP("ON_SIGNUP"),
}

enum class CampaignInstallationSignupEvent(@get:JsonValueAnnotation val value: String) {
    FORM_DETECTION("FORM_DETECTION"),
    PROGRAMMATIC("PROGRAMMATIC"),
}

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class CampaignInstallationSignup
@JsonCreator
constructor(
    @JsonProperty("isCustomForm") private val isCustomForm: Boolean? = null,
    @JsonProperty("url") private val url: String? = null,
    @JsonProperty("redirectAfterSignup") private val redirectAfterSignup: Boolean? = null,
    @JsonProperty("redirectUrl") private val redirectUrl: String? = null,
    @JsonProperty("trackInputFields") private val trackInputFields: Boolean? = null,
) {
    fun isCustomForm(): Optional<Boolean> = Optional.ofNullable(isCustomForm)

    fun url(): Optional<String> = Optional.ofNullable(url)

    fun redirectAfterSignup(): Optional<Boolean> = Optional.ofNullable(redirectAfterSignup)

    fun redirectUrl(): Optional<String> = Optional.ofNullable(redirectUrl)

    fun trackInputFields(): Optional<Boolean> = Optional.ofNullable(trackInputFields)
}

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class CampaignInstallationMobile
@JsonCreator
constructor(
    @JsonProperty("isEnabled") private val isEnabled: Boolean? = null,
    @JsonProperty("publicKey") private val publicKey: String? = null,
    @JsonProperty("iosAttributionUrl") private val iosAttributionUrl: String? = null,
    @JsonProperty("iosAppStoreUrl") private val iosAppStoreUrl: String? = null,
    @JsonProperty("androidPackageName") private val androidPackageName: String? = null,
    @JsonProperty("androidAppStoreUrl") private val androidAppStoreUrl: String? = null,
) {
    fun isEnabled(): Optional<Boolean> = Optional.ofNullable(isEnabled)

    /** Read-only publishable key returned by the API. */
    fun publicKey(): Optional<String> = Optional.ofNullable(publicKey)

    fun iosAttributionUrl(): Optional<String> = Optional.ofNullable(iosAttributionUrl)

    fun iosAppStoreUrl(): Optional<String> = Optional.ofNullable(iosAppStoreUrl)

    fun androidPackageName(): Optional<String> = Optional.ofNullable(androidPackageName)

    fun androidAppStoreUrl(): Optional<String> = Optional.ofNullable(androidAppStoreUrl)
}

/**
 * Program Editor **Installation** tab configuration. Documented fields are typed. The contract
 * remains open to future installation settings, available through [_additionalProperties].
 */
class CampaignInstallation
@JsonCreator
private constructor(
    @com.fasterxml.jackson.annotation.JsonValue
    private val additionalProperties: Map<String, JsonValue>
) {

    fun referralTrigger(): Optional<CampaignInstallationReferralTrigger> =
        configField(additionalProperties, "referralTrigger")

    fun signupEvent(): Optional<CampaignInstallationSignupEvent> =
        configField(additionalProperties, "signupEvent")

    fun shareUrl(): Optional<String> = configField(additionalProperties, "shareUrl")

    fun useGrowSurfHostedLinks(): Optional<Boolean> =
        configField(additionalProperties, "useGrowSurfHostedLinks")

    fun allowedUrls(): Optional<List<String>> = configField(additionalProperties, "allowedUrls")

    fun signup(): Optional<CampaignInstallationSignup> = configField(additionalProperties, "signup")

    fun mobile(): Optional<CampaignInstallationMobile> = configField(additionalProperties, "mobile")

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [CampaignInstallation]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CampaignInstallation]. */
    class Builder internal constructor() {

        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(installation: CampaignInstallation) = apply {
            additionalProperties = installation.additionalProperties.toMutableMap()
        }

        fun referralTrigger(value: CampaignInstallationReferralTrigger) = apply {
            additionalProperties.putConfigField("referralTrigger", value)
        }

        fun signupEvent(value: CampaignInstallationSignupEvent) = apply {
            additionalProperties.putConfigField("signupEvent", value)
        }

        fun shareUrl(value: String) = apply {
            additionalProperties.putConfigField("shareUrl", value)
        }

        fun useGrowSurfHostedLinks(value: Boolean) = apply {
            additionalProperties.putConfigField("useGrowSurfHostedLinks", value)
        }

        fun allowedUrls(value: List<String>) = apply {
            additionalProperties.putConfigField("allowedUrls", value)
        }

        fun signup(value: CampaignInstallationSignup) = apply {
            additionalProperties.putConfigField("signup", value)
        }

        fun mobile(value: CampaignInstallationMobile) = apply {
            additionalProperties.putConfigField("mobile", value)
        }

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

        /**
         * Returns an immutable instance of [CampaignInstallation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CampaignInstallation = CampaignInstallation(additionalProperties.toImmutable())
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws GrowsurfInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): CampaignInstallation = apply {
        if (validated) {
            return@apply
        }

        referralTrigger().orElse(null)
        signupEvent().orElse(null)
        shareUrl().orElse(null)
        useGrowSurfHostedLinks().orElse(null)
        allowedUrls().orElse(null)
        signup().orElse(null)
        mobile().orElse(null)
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: GrowsurfInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CampaignInstallation && additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() = "CampaignInstallation{additionalProperties=$additionalProperties}"
}
