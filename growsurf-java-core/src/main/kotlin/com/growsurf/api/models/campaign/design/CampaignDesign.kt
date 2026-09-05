// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.design

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

enum class CampaignDesignParticipantAvatarStyle(@get:JsonValueAnnotation val value: String) {
    CHARACTERS("CHARACTERS"),
    INITIALS("INITIALS"),
    ANIMALS("ANIMALS"),
    GRADIENT("GRADIENT"),
}

enum class CampaignDesignOfferPopupPlacement(@get:JsonValueAnnotation val value: String) {
    CENTER("CENTER"),
    BOTTOM("BOTTOM"),
    BOTTOM_RIGHT("BOTTOM_RIGHT"),
    BOTTOM_LEFT("BOTTOM_LEFT"),
    TOP("TOP"),
}

enum class CampaignDesignOfferPopupDelaySeconds(@get:JsonValueAnnotation val value: Long) {
    SECONDS_0(0),
    SECONDS_3(3),
    SECONDS_5(5),
    SECONDS_10(10),
}

enum class CampaignDesignBannerPlacement(@get:JsonValueAnnotation val value: String) {
    TOP("TOP"),
    BOTTOM("BOTTOM"),
}

enum class CampaignDesignHeadingTarget(@get:JsonValueAnnotation val value: String) {
    H1("H1"),
    H2("H2"),
    H3("H3"),
    H4("H4"),
    H5("H5"),
}

enum class CampaignDesignHeadingPlacement(@get:JsonValueAnnotation val value: String) {
    PREPEND("PREPEND"),
    APPEND("APPEND"),
    REPLACE("REPLACE"),
}

enum class CampaignDesignReferrerNameFormat(@get:JsonValueAnnotation val value: String) {
    FIRST("FIRST"),
    FIRST_LAST_INITIAL("FIRST_LAST_INITIAL"),
    FIRST_LAST("FIRST_LAST"),
}

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class ParticipantLoginDesign
@JsonCreator
constructor(
    @JsonProperty("heading") private val heading: String? = null,
    @JsonProperty("description") private val description: String? = null,
    @JsonProperty("fieldLabel") private val fieldLabel: String? = null,
    @JsonProperty("fieldPlaceholder") private val fieldPlaceholder: String? = null,
    @JsonProperty("buttonText") private val buttonText: String? = null,
    @JsonProperty("successHeading") private val successHeading: String? = null,
    @JsonProperty("successBody") private val successBody: String? = null,
    @JsonProperty("resendPrompt") private val resendPrompt: String? = null,
    @JsonProperty("resend") private val resend: String? = null,
    @JsonProperty("resent") private val resent: String? = null,
    @JsonProperty("invalidEmail") private val invalidEmail: String? = null,
    @JsonProperty("cooldown") private val cooldown: String? = null,
    @JsonProperty("serverError") private val serverError: String? = null,
    @JsonProperty("invalidLink") private val invalidLink: String? = null,
) {
    fun heading(): Optional<String> = Optional.ofNullable(heading)

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun fieldLabel(): Optional<String> = Optional.ofNullable(fieldLabel)

    fun fieldPlaceholder(): Optional<String> = Optional.ofNullable(fieldPlaceholder)

    fun buttonText(): Optional<String> = Optional.ofNullable(buttonText)

    fun successHeading(): Optional<String> = Optional.ofNullable(successHeading)

    fun successBody(): Optional<String> = Optional.ofNullable(successBody)

    fun resendPrompt(): Optional<String> = Optional.ofNullable(resendPrompt)

    fun resend(): Optional<String> = Optional.ofNullable(resend)

    fun resent(): Optional<String> = Optional.ofNullable(resent)

    fun invalidEmail(): Optional<String> = Optional.ofNullable(invalidEmail)

    fun cooldown(): Optional<String> = Optional.ofNullable(cooldown)

    fun serverError(): Optional<String> = Optional.ofNullable(serverError)

    fun invalidLink(): Optional<String> = Optional.ofNullable(invalidLink)
}

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class PayoutDestinationConfirmationErrorMessages
@JsonCreator
constructor(
    @JsonProperty("invalidEmail") private val invalidEmail: String? = null,
    @JsonProperty("emailMismatch") private val emailMismatch: String? = null,
    @JsonProperty("tokenExpired") private val tokenExpired: String? = null,
    @JsonProperty("tokenUsed") private val tokenUsed: String? = null,
    @JsonProperty("alreadyConfirmed") private val alreadyConfirmed: String? = null,
    @JsonProperty("generic") private val generic: String? = null,
) {
    fun invalidEmail(): Optional<String> = Optional.ofNullable(invalidEmail)

    fun emailMismatch(): Optional<String> = Optional.ofNullable(emailMismatch)

    fun tokenExpired(): Optional<String> = Optional.ofNullable(tokenExpired)

    fun tokenUsed(): Optional<String> = Optional.ofNullable(tokenUsed)

    fun alreadyConfirmed(): Optional<String> = Optional.ofNullable(alreadyConfirmed)

    fun generic(): Optional<String> = Optional.ofNullable(generic)
}

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class PayoutDestinationConfirmationDesign
@JsonCreator
constructor(
    @JsonProperty("headline") private val headline: String? = null,
    @JsonProperty("description") private val description: String? = null,
    @JsonProperty("emailLabel") private val emailLabel: String? = null,
    @JsonProperty("emailPlaceholder") private val emailPlaceholder: String? = null,
    @JsonProperty("emailAgainLabel") private val emailAgainLabel: String? = null,
    @JsonProperty("emailAgainPlaceholder") private val emailAgainPlaceholder: String? = null,
    @JsonProperty("legalNameLabel") private val legalNameLabel: String? = null,
    @JsonProperty("legalNamePlaceholder") private val legalNamePlaceholder: String? = null,
    @JsonProperty("legalTypeLabel") private val legalTypeLabel: String? = null,
    @JsonProperty("legalTypeIndividual") private val legalTypeIndividual: String? = null,
    @JsonProperty("legalTypeBusiness") private val legalTypeBusiness: String? = null,
    @JsonProperty("button") private val button: String? = null,
    @JsonProperty("success") private val success: String? = null,
    @JsonProperty("claimPending") private val claimPending: String? = null,
    @JsonProperty("errorMessages")
    private val errorMessages: PayoutDestinationConfirmationErrorMessages? = null,
) {
    fun headline(): Optional<String> = Optional.ofNullable(headline)

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun emailLabel(): Optional<String> = Optional.ofNullable(emailLabel)

    fun emailPlaceholder(): Optional<String> = Optional.ofNullable(emailPlaceholder)

    fun emailAgainLabel(): Optional<String> = Optional.ofNullable(emailAgainLabel)

    fun emailAgainPlaceholder(): Optional<String> = Optional.ofNullable(emailAgainPlaceholder)

    fun legalNameLabel(): Optional<String> = Optional.ofNullable(legalNameLabel)

    fun legalNamePlaceholder(): Optional<String> = Optional.ofNullable(legalNamePlaceholder)

    fun legalTypeLabel(): Optional<String> = Optional.ofNullable(legalTypeLabel)

    fun legalTypeIndividual(): Optional<String> = Optional.ofNullable(legalTypeIndividual)

    fun legalTypeBusiness(): Optional<String> = Optional.ofNullable(legalTypeBusiness)

    fun button(): Optional<String> = Optional.ofNullable(button)

    fun success(): Optional<String> = Optional.ofNullable(success)

    fun claimPending(): Optional<String> = Optional.ofNullable(claimPending)

    fun errorMessages(): Optional<PayoutDestinationConfirmationErrorMessages> =
        Optional.ofNullable(errorMessages)
}

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class CampaignDesignReferredExperience
@JsonCreator
constructor(
    @JsonProperty("isOfferPopupEnabled") private val isOfferPopupEnabled: Boolean? = null,
    @JsonProperty("offerPopupTitle") private val offerPopupTitle: String? = null,
    @JsonProperty("offerPopupDescription") private val offerPopupDescription: String? = null,
    @JsonProperty("offerPopupButtonText") private val offerPopupButtonText: String? = null,
    @JsonProperty("offerPopupImageUrl") private val offerPopupImageUrl: String? = null,
    @JsonProperty("isOfferPopupReferrerImageShown")
    private val isOfferPopupReferrerImageShown: Boolean? = null,
    @JsonProperty("offerPopupPlacement")
    private val offerPopupPlacement: CampaignDesignOfferPopupPlacement? = null,
    @JsonProperty("offerPopupDelaySeconds")
    private val offerPopupDelaySeconds: CampaignDesignOfferPopupDelaySeconds? = null,
    @JsonProperty("offerPopupThankYouText") private val offerPopupThankYouText: String? = null,
    @JsonProperty("offerPopupThankYouButtonText")
    private val offerPopupThankYouButtonText: String? = null,
    @JsonProperty("isOfferPopupConfettiEnabled")
    private val isOfferPopupConfettiEnabled: Boolean? = null,
    @JsonProperty("isOfferPopupShownOnAllPages")
    private val isOfferPopupShownOnAllPages: Boolean? = null,
    @JsonProperty("offerPopupSecondaryLinkText")
    private val offerPopupSecondaryLinkText: String? = null,
    @JsonProperty("offerPopupSecondaryLinkUrl")
    private val offerPopupSecondaryLinkUrl: String? = null,
    @JsonProperty("isOfferPopupOverlayDimmed")
    private val isOfferPopupOverlayDimmed: Boolean? = null,
    @JsonProperty("offerPopupEmailPlaceholder")
    private val offerPopupEmailPlaceholder: String? = null,
    @JsonProperty("offerPopupPromoCodeCopyLabel")
    private val offerPopupPromoCodeCopyLabel: String? = null,
    @JsonProperty("offerPopupSubmitError") private val offerPopupSubmitError: String? = null,
    @JsonProperty("isBannerEnabled") private val isBannerEnabled: Boolean? = null,
    @JsonProperty("bannerText") private val bannerText: String? = null,
    @JsonProperty("bannerPlacement")
    private val bannerPlacement: CampaignDesignBannerPlacement? = null,
    @JsonProperty("isBannerClickableToSignupUrl")
    private val isBannerClickableToSignupUrl: Boolean? = null,
    @JsonProperty("isHeadingEnabled") private val isHeadingEnabled: Boolean? = null,
    @JsonProperty("headingText") private val headingText: String? = null,
    @JsonProperty("headingTarget") private val headingTarget: CampaignDesignHeadingTarget? = null,
    @JsonProperty("headingPlacement")
    private val headingPlacement: CampaignDesignHeadingPlacement? = null,
    @JsonProperty("isHeadingStyled") private val isHeadingStyled: Boolean? = null,
    @JsonProperty("isHeadingClickableToSignupUrl")
    private val isHeadingClickableToSignupUrl: Boolean? = null,
    @JsonProperty("pageTitleReplacement") private val pageTitleReplacement: String? = null,
    @JsonProperty("referrerNameFormat")
    private val referrerNameFormat: CampaignDesignReferrerNameFormat? = null,
    @JsonProperty("referrerNameFallback") private val referrerNameFallback: String? = null,
) {
    fun isOfferPopupEnabled(): Optional<Boolean> = Optional.ofNullable(isOfferPopupEnabled)

    fun offerPopupTitle(): Optional<String> = Optional.ofNullable(offerPopupTitle)

    fun offerPopupDescription(): Optional<String> = Optional.ofNullable(offerPopupDescription)

    fun offerPopupButtonText(): Optional<String> = Optional.ofNullable(offerPopupButtonText)

    fun offerPopupImageUrl(): Optional<String> = Optional.ofNullable(offerPopupImageUrl)

    fun isOfferPopupReferrerImageShown(): Optional<Boolean> =
        Optional.ofNullable(isOfferPopupReferrerImageShown)

    fun offerPopupPlacement(): Optional<CampaignDesignOfferPopupPlacement> =
        Optional.ofNullable(offerPopupPlacement)

    fun offerPopupDelaySeconds(): Optional<CampaignDesignOfferPopupDelaySeconds> =
        Optional.ofNullable(offerPopupDelaySeconds)

    fun offerPopupThankYouText(): Optional<String> = Optional.ofNullable(offerPopupThankYouText)

    fun offerPopupThankYouButtonText(): Optional<String> =
        Optional.ofNullable(offerPopupThankYouButtonText)

    fun isOfferPopupConfettiEnabled(): Optional<Boolean> =
        Optional.ofNullable(isOfferPopupConfettiEnabled)

    fun isOfferPopupShownOnAllPages(): Optional<Boolean> =
        Optional.ofNullable(isOfferPopupShownOnAllPages)

    fun offerPopupSecondaryLinkText(): Optional<String> =
        Optional.ofNullable(offerPopupSecondaryLinkText)

    fun offerPopupSecondaryLinkUrl(): Optional<String> =
        Optional.ofNullable(offerPopupSecondaryLinkUrl)

    fun isOfferPopupOverlayDimmed(): Optional<Boolean> =
        Optional.ofNullable(isOfferPopupOverlayDimmed)

    fun offerPopupEmailPlaceholder(): Optional<String> =
        Optional.ofNullable(offerPopupEmailPlaceholder)

    fun offerPopupPromoCodeCopyLabel(): Optional<String> =
        Optional.ofNullable(offerPopupPromoCodeCopyLabel)

    fun offerPopupSubmitError(): Optional<String> = Optional.ofNullable(offerPopupSubmitError)

    fun isBannerEnabled(): Optional<Boolean> = Optional.ofNullable(isBannerEnabled)

    fun bannerText(): Optional<String> = Optional.ofNullable(bannerText)

    fun bannerPlacement(): Optional<CampaignDesignBannerPlacement> =
        Optional.ofNullable(bannerPlacement)

    fun isBannerClickableToSignupUrl(): Optional<Boolean> =
        Optional.ofNullable(isBannerClickableToSignupUrl)

    fun isHeadingEnabled(): Optional<Boolean> = Optional.ofNullable(isHeadingEnabled)

    fun headingText(): Optional<String> = Optional.ofNullable(headingText)

    fun headingTarget(): Optional<CampaignDesignHeadingTarget> = Optional.ofNullable(headingTarget)

    fun headingPlacement(): Optional<CampaignDesignHeadingPlacement> =
        Optional.ofNullable(headingPlacement)

    fun isHeadingStyled(): Optional<Boolean> = Optional.ofNullable(isHeadingStyled)

    fun isHeadingClickableToSignupUrl(): Optional<Boolean> =
        Optional.ofNullable(isHeadingClickableToSignupUrl)

    fun pageTitleReplacement(): Optional<String> = Optional.ofNullable(pageTitleReplacement)

    fun referrerNameFormat(): Optional<CampaignDesignReferrerNameFormat> =
        Optional.ofNullable(referrerNameFormat)

    fun referrerNameFallback(): Optional<String> = Optional.ofNullable(referrerNameFallback)
}

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class CampaignDesignReferredExperienceOfferPopupTheme
@JsonCreator
constructor(
    @JsonProperty("color") private val color: String? = null,
    @JsonProperty("backgroundColor") private val backgroundColor: String? = null,
) {
    fun color(): Optional<String> = Optional.ofNullable(color)

    fun backgroundColor(): Optional<String> = Optional.ofNullable(backgroundColor)
}

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class CampaignDesignTheme
@JsonCreator
constructor(
    @JsonProperty("referredExperienceOfferPopup")
    private val referredExperienceOfferPopup: CampaignDesignReferredExperienceOfferPopupTheme? =
        null
) {
    fun referredExperienceOfferPopup(): Optional<CampaignDesignReferredExperienceOfferPopupTheme> =
        Optional.ofNullable(referredExperienceOfferPopup)
}

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
 * wholesale). Documented fields are typed where the REST contract defines their structure. Design
 * sections whose contract is intentionally open remain maps, as do future fields.
 */
class CampaignDesign
@JsonCreator
private constructor(
    @com.fasterxml.jackson.annotation.JsonValue
    private val additionalProperties: Map<String, JsonValue>
) {

    fun participantAvatarStyle(): Optional<CampaignDesignParticipantAvatarStyle> =
        configField(additionalProperties, "participantAvatarStyle")

    fun window(): Optional<Map<String, JsonValue>> = configField(additionalProperties, "window")

    fun header(): Optional<Map<String, JsonValue>> = configField(additionalProperties, "header")

    fun stats(): Optional<Map<String, JsonValue>> = configField(additionalProperties, "stats")

    fun share(): Optional<Map<String, JsonValue>> = configField(additionalProperties, "share")

    fun signup(): Optional<Map<String, JsonValue>> = configField(additionalProperties, "signup")

    fun login(): Optional<ParticipantLoginDesign> = configField(additionalProperties, "login")

    fun payoutDestinationConfirmation(): Optional<PayoutDestinationConfirmationDesign> =
        configField(additionalProperties, "payoutDestinationConfirmation")

    fun countryLabels(): Optional<Map<String, String?>> =
        configField(additionalProperties, "countryLabels")

    fun referralStatus(): Optional<Map<String, JsonValue>> =
        configField(additionalProperties, "referralStatus")

    fun leaderboard(): Optional<Map<String, JsonValue>> =
        configField(additionalProperties, "leaderboard")

    fun referredExperience(): Optional<CampaignDesignReferredExperience> =
        configField(additionalProperties, "referredExperience")

    fun referralSummary(): Optional<Map<String, JsonValue>> =
        configField(additionalProperties, "referralSummary")

    fun affiliateSummary(): Optional<Map<String, JsonValue>> =
        configField(additionalProperties, "affiliateSummary")

    fun commissions(): Optional<Map<String, JsonValue>> =
        configField(additionalProperties, "commissions")

    fun payouts(): Optional<Map<String, JsonValue>> = configField(additionalProperties, "payouts")

    fun rewards(): Optional<Map<String, JsonValue>> = configField(additionalProperties, "rewards")

    /** Participant presentation settings for Resources, when configured. */
    fun resources(): Optional<CampaignDesignResources> =
        Optional.ofNullable(
            additionalProperties["resources"]?.convert(CampaignDesignResources::class.java)
        )

    fun participantSettings(): Optional<Map<String, JsonValue>> =
        configField(additionalProperties, "participantSettings")

    fun landingPages(): Optional<Map<String, JsonValue>> =
        configField(additionalProperties, "landingPages")

    fun theme(): Optional<CampaignDesignTheme> = configField(additionalProperties, "theme")

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

        fun participantAvatarStyle(value: CampaignDesignParticipantAvatarStyle) = apply {
            additionalProperties.putConfigField("participantAvatarStyle", value)
        }

        fun window(value: Map<String, JsonValue>) = objectField("window", value)

        fun header(value: Map<String, JsonValue>) = objectField("header", value)

        fun stats(value: Map<String, JsonValue>) = objectField("stats", value)

        fun share(value: Map<String, JsonValue>) = objectField("share", value)

        fun signup(value: Map<String, JsonValue>) = objectField("signup", value)

        fun login(value: ParticipantLoginDesign) = apply {
            additionalProperties.putConfigField("login", value)
        }

        fun payoutDestinationConfirmation(value: PayoutDestinationConfirmationDesign) = apply {
            additionalProperties.putConfigField("payoutDestinationConfirmation", value)
        }

        fun countryLabels(value: Map<String, String?>) = apply {
            additionalProperties.putConfigField("countryLabels", value)
        }

        fun referralStatus(value: Map<String, JsonValue>) = objectField("referralStatus", value)

        fun leaderboard(value: Map<String, JsonValue>) = objectField("leaderboard", value)

        fun referredExperience(value: CampaignDesignReferredExperience) = apply {
            additionalProperties.putConfigField("referredExperience", value)
        }

        fun referralSummary(value: Map<String, JsonValue>) = objectField("referralSummary", value)

        fun affiliateSummary(value: Map<String, JsonValue>) = objectField("affiliateSummary", value)

        fun commissions(value: Map<String, JsonValue>) = objectField("commissions", value)

        fun payouts(value: Map<String, JsonValue>) = objectField("payouts", value)

        fun rewards(value: Map<String, JsonValue>) = objectField("rewards", value)

        /** Sets the complete participant Resources presentation settings. */
        fun resources(resources: CampaignDesignResources) = apply {
            additionalProperties["resources"] = JsonValue.from(resources.toMap())
        }

        fun participantSettings(value: Map<String, JsonValue>) =
            objectField("participantSettings", value)

        fun landingPages(value: Map<String, JsonValue>) = objectField("landingPages", value)

        fun theme(value: CampaignDesignTheme) = apply {
            additionalProperties.putConfigField("theme", value)
        }

        private fun objectField(name: String, value: Map<String, JsonValue>) = apply {
            additionalProperties.putConfigField(name, value)
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

        participantAvatarStyle().orElse(null)
        window().orElse(null)
        header().orElse(null)
        stats().orElse(null)
        share().orElse(null)
        signup().orElse(null)
        login().orElse(null)
        payoutDestinationConfirmation().orElse(null)
        countryLabels().orElse(null)
        referralStatus().orElse(null)
        leaderboard().orElse(null)
        referredExperience().orElse(null)
        referralSummary().orElse(null)
        affiliateSummary().orElse(null)
        commissions().orElse(null)
        payouts().orElse(null)
        rewards().orElse(null)
        resources().orElse(null)
        participantSettings().orElse(null)
        landingPages().orElse(null)
        theme().orElse(null)
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
