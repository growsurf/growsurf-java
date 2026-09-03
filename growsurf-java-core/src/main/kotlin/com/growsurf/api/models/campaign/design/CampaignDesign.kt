// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.design

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue as JsonValueAnnotation
import com.growsurf.api.core.ExcludeMissing
import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.toImmutable
import com.growsurf.api.errors.GrowsurfInvalidDataException
import java.util.Objects
import java.util.Optional

/** How the participant Resources destination icon is rendered. */
enum class CampaignDesignResourcesIconType(@get:JsonValueAnnotation val value: String) {
    DEFAULT("DEFAULT"),
    IMAGE("IMAGE"),
    NONE("NONE"),
}

/** Icon configuration for the participant Resources destination. */
data class CampaignDesignResourcesIcon
@JsonCreator
constructor(
    @JsonProperty("type") private val type: CampaignDesignResourcesIconType? = null,
    @JsonProperty("imageUrl") private val imageUrl: String? = null,
) {
    fun type(): Optional<CampaignDesignResourcesIconType> = Optional.ofNullable(type)

    /** LIST-mode icon image URL when [type] is `IMAGE`. Maximum 500 characters. */
    fun imageUrl(): Optional<String> = Optional.ofNullable(imageUrl)

    internal fun toMap(): Map<String, Any?> =
        linkedMapOf<String, Any?>().apply {
            type?.let { put("type", it.value) }
            imageUrl?.let { put("imageUrl", it) }
        }
}

/**
 * Participant presentation settings for Resources. Resource items and their order use the Program
 * Resources service.
 */
data class CampaignDesignResources
@JsonCreator
constructor(
    @JsonProperty("isPublicDisplayed") private val isPublicDisplayed: Boolean? = null,
    @JsonProperty("title") private val title: String? = null,
    @JsonProperty("viewResourcesLinkText") private val viewResourcesLinkText: String? = null,
    @JsonProperty("backLinkText") private val backLinkText: String? = null,
    @JsonProperty("copyButtonText") private val copyButtonText: String? = null,
    @JsonProperty("copiedText") private val copiedText: String? = null,
    @JsonProperty("emptyState") private val emptyState: String? = null,
    @JsonProperty("icon") private val icon: CampaignDesignResourcesIcon? = null,
) {
    /** Enables the destination. It stays hidden until one valid resource is published. */
    fun isPublicDisplayed(): Optional<Boolean> = Optional.ofNullable(isPublicDisplayed)

    /** Participant-visible section title. Maximum 100 characters. */
    fun title(): Optional<String> = Optional.ofNullable(title)

    /** LIST-mode row text. Maximum 100 characters. */
    fun viewResourcesLinkText(): Optional<String> = Optional.ofNullable(viewResourcesLinkText)

    /** LIST-mode detail Back text. Maximum 100 characters. */
    fun backLinkText(): Optional<String> = Optional.ofNullable(backLinkText)

    /** TEXT resource copy action. Maximum 100 characters. */
    fun copyButtonText(): Optional<String> = Optional.ofNullable(copyButtonText)

    /** TEXT resource copy confirmation. Maximum 100 characters. */
    fun copiedText(): Optional<String> = Optional.ofNullable(copiedText)

    /** Shown in place of the list when no resources are published. Maximum 500 characters. */
    fun emptyState(): Optional<String> = Optional.ofNullable(emptyState)

    fun icon(): Optional<CampaignDesignResourcesIcon> = Optional.ofNullable(icon)

    internal fun toMap(): Map<String, Any?> =
        linkedMapOf<String, Any?>().apply {
            isPublicDisplayed?.let { put("isPublicDisplayed", it) }
            title?.let { put("title", it) }
            viewResourcesLinkText?.let { put("viewResourcesLinkText", it) }
            backLinkText?.let { put("backLinkText", it) }
            copyButtonText?.let { put("copyButtonText", it) }
            copiedText?.let { put("copiedText", it) }
            emptyState?.let { put("emptyState", it) }
            icon?.let { put("icon", it.toMap()) }
        }
}

/**
 * A program's design configuration. It includes the dashboard Program Editor's **Design** tab and
 * the payout-destination confirmation page copy configured from payout integration cards. The exact
 * fields available depend on the program type (for example, `referralSummary` is referral-only,
 * while `affiliateSummary`, `commissions`, and `payouts` are affiliate-only). `participantSettings`
 * is available to both program types; its manual payout and Wise fields are affiliate-only.
 * `referredExperience` includes the Claim Offer Popup for both program types, with its colors under
 * `theme.referredExperienceOfferPopup`. `GET` returns the fields configured for the program;
 * `payoutDestinationConfirmation` is omitted when no confirmation fields are stored. Stored `null`
 * fields are returned as `null`; omitted and `null` fields use localized defaults. `PATCH` back
 * only the sections or fields you want to change (arrays such as `signup.fields` replace
 * wholesale). `participantAvatarStyle` accepts `CHARACTERS`, `INITIALS`, `ANIMALS`, or `GRADIENT`;
 * new programs use `CHARACTERS`, while missing or unknown stored values return `INITIALS`. This is
 * a large, loosely-typed object modeled as free-form properties. [resources] is typed because it is
 * shared by every program type; other current and future sections remain open.
 */
class CampaignDesign
@JsonCreator
private constructor(
    @com.fasterxml.jackson.annotation.JsonValue
    private val additionalProperties: Map<String, JsonValue>
) {

    /** Participant presentation settings for Resources, when configured. */
    fun resources(): Optional<CampaignDesignResources> =
        Optional.ofNullable(
            additionalProperties["resources"]?.convert(CampaignDesignResources::class.java)
        )

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [CampaignDesign]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CampaignDesign]. */
    class Builder internal constructor() {

        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(design: CampaignDesign) = apply {
            additionalProperties = design.additionalProperties.toMutableMap()
        }

        /** Sets the complete participant Resources presentation settings. */
        fun resources(resources: CampaignDesignResources) = apply {
            additionalProperties["resources"] = JsonValue.from(resources.toMap())
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
         * Returns an immutable instance of [CampaignDesign].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CampaignDesign = CampaignDesign(additionalProperties.toImmutable())
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
    fun validate(): CampaignDesign = apply {
        if (validated) {
            return@apply
        }

        resources().orElse(null)
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

        return other is CampaignDesign && additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() = "CampaignDesign{additionalProperties=$additionalProperties}"
}
