// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.design

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonAutoDetect
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue as JsonValueAnnotation
import com.growsurf.api.core.ExcludeMissing
import com.growsurf.api.core.JsonField
import com.growsurf.api.core.JsonMissing
import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.toImmutable
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
    @field:JsonAnySetter
    private val additionalProperties: MutableMap<String, JsonValue> = mutableMapOf(),
) {
    @JsonCreator
    constructor(
        @JsonProperty("heading") heading: String? = null,
        @JsonProperty("description") description: String? = null,
        @JsonProperty("fieldLabel") fieldLabel: String? = null,
        @JsonProperty("fieldPlaceholder") fieldPlaceholder: String? = null,
        @JsonProperty("buttonText") buttonText: String? = null,
        @JsonProperty("successHeading") successHeading: String? = null,
        @JsonProperty("successBody") successBody: String? = null,
        @JsonProperty("resendPrompt") resendPrompt: String? = null,
        @JsonProperty("resend") resend: String? = null,
        @JsonProperty("resent") resent: String? = null,
        @JsonProperty("invalidEmail") invalidEmail: String? = null,
        @JsonProperty("cooldown") cooldown: String? = null,
        @JsonProperty("serverError") serverError: String? = null,
        @JsonProperty("invalidLink") invalidLink: String? = null,
    ) : this(
        heading,
        description,
        fieldLabel,
        fieldPlaceholder,
        buttonText,
        successHeading,
        successBody,
        resendPrompt,
        resend,
        resent,
        invalidEmail,
        cooldown,
        serverError,
        invalidLink,
        mutableMapOf(),
    )

    /** Returns additional fields supplied by the API. */
    @JsonAnyGetter
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties.toImmutable()

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
constructor(
    @JsonProperty("invalidEmail")
    @ExcludeMissing
    private val invalidEmail: JsonField<String> = JsonMissing.of(),
    @JsonProperty("emailMismatch")
    @ExcludeMissing
    private val emailMismatch: JsonField<String> = JsonMissing.of(),
    @JsonProperty("tokenExpired")
    @ExcludeMissing
    private val tokenExpired: JsonField<String> = JsonMissing.of(),
    @JsonProperty("tokenUsed")
    @ExcludeMissing
    private val tokenUsed: JsonField<String> = JsonMissing.of(),
    @JsonProperty("alreadyConfirmed")
    @ExcludeMissing
    private val alreadyConfirmed: JsonField<String> = JsonMissing.of(),
    @JsonProperty("generic")
    @ExcludeMissing
    private val generic: JsonField<String> = JsonMissing.of(),
    @field:JsonAnySetter
    private val additionalProperties: MutableMap<String, JsonValue> = mutableMapOf(),
) {
    // Validate known values without conflating an omitted field with an explicit clear.
    init {
        invalidEmail.getOptional("invalidEmail")
        emailMismatch.getOptional("emailMismatch")
        tokenExpired.getOptional("tokenExpired")
        tokenUsed.getOptional("tokenUsed")
        alreadyConfirmed.getOptional("alreadyConfirmed")
        generic.getOptional("generic")
    }

    @JsonCreator
    constructor(
        @JsonProperty("invalidEmail")
        @ExcludeMissing
        invalidEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("emailMismatch")
        @ExcludeMissing
        emailMismatch: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tokenExpired")
        @ExcludeMissing
        tokenExpired: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tokenUsed") @ExcludeMissing tokenUsed: JsonField<String> = JsonMissing.of(),
        @JsonProperty("alreadyConfirmed")
        @ExcludeMissing
        alreadyConfirmed: JsonField<String> = JsonMissing.of(),
        @JsonProperty("generic") @ExcludeMissing generic: JsonField<String> = JsonMissing.of(),
    ) : this(
        invalidEmail,
        emailMismatch,
        tokenExpired,
        tokenUsed,
        alreadyConfirmed,
        generic,
        mutableMapOf(),
    )

    /** Returns additional fields supplied by the API. */
    @JsonAnyGetter
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties.toImmutable()

    fun invalidEmail(): Optional<String> = invalidEmail.getOptional("invalidEmail")

    fun emailMismatch(): Optional<String> = emailMismatch.getOptional("emailMismatch")

    fun tokenExpired(): Optional<String> = tokenExpired.getOptional("tokenExpired")

    fun tokenUsed(): Optional<String> = tokenUsed.getOptional("tokenUsed")

    fun alreadyConfirmed(): Optional<String> = alreadyConfirmed.getOptional("alreadyConfirmed")

    fun generic(): Optional<String> = generic.getOptional("generic")
}

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class PayoutDestinationConfirmationDesign
constructor(
    @JsonProperty("headline")
    @ExcludeMissing
    private val headline: JsonField<String> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("emailLabel")
    @ExcludeMissing
    private val emailLabel: JsonField<String> = JsonMissing.of(),
    @JsonProperty("emailPlaceholder")
    @ExcludeMissing
    private val emailPlaceholder: JsonField<String> = JsonMissing.of(),
    @JsonProperty("emailAgainLabel")
    @ExcludeMissing
    private val emailAgainLabel: JsonField<String> = JsonMissing.of(),
    @JsonProperty("emailAgainPlaceholder")
    @ExcludeMissing
    private val emailAgainPlaceholder: JsonField<String> = JsonMissing.of(),
    @JsonProperty("legalNameLabel")
    @ExcludeMissing
    private val legalNameLabel: JsonField<String> = JsonMissing.of(),
    @JsonProperty("legalNamePlaceholder")
    @ExcludeMissing
    private val legalNamePlaceholder: JsonField<String> = JsonMissing.of(),
    @JsonProperty("legalTypeLabel")
    @ExcludeMissing
    private val legalTypeLabel: JsonField<String> = JsonMissing.of(),
    @JsonProperty("legalTypeIndividual")
    @ExcludeMissing
    private val legalTypeIndividual: JsonField<String> = JsonMissing.of(),
    @JsonProperty("legalTypeBusiness")
    @ExcludeMissing
    private val legalTypeBusiness: JsonField<String> = JsonMissing.of(),
    @JsonProperty("button")
    @ExcludeMissing
    private val button: JsonField<String> = JsonMissing.of(),
    @JsonProperty("success")
    @ExcludeMissing
    private val success: JsonField<String> = JsonMissing.of(),
    @JsonProperty("claimPending")
    @ExcludeMissing
    private val claimPending: JsonField<String> = JsonMissing.of(),
    @JsonProperty("errorMessages")
    private val errorMessages: PayoutDestinationConfirmationErrorMessages? = null,
    @field:JsonAnySetter
    private val additionalProperties: MutableMap<String, JsonValue> = mutableMapOf(),
) {
    // Validate known values without conflating an omitted field with an explicit clear.
    init {
        headline.getOptional("headline")
        description.getOptional("description")
        emailLabel.getOptional("emailLabel")
        emailPlaceholder.getOptional("emailPlaceholder")
        emailAgainLabel.getOptional("emailAgainLabel")
        emailAgainPlaceholder.getOptional("emailAgainPlaceholder")
        legalNameLabel.getOptional("legalNameLabel")
        legalNamePlaceholder.getOptional("legalNamePlaceholder")
        legalTypeLabel.getOptional("legalTypeLabel")
        legalTypeIndividual.getOptional("legalTypeIndividual")
        legalTypeBusiness.getOptional("legalTypeBusiness")
        button.getOptional("button")
        success.getOptional("success")
        claimPending.getOptional("claimPending")
    }

    @JsonCreator
    constructor(
        @JsonProperty("headline") @ExcludeMissing headline: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("emailLabel")
        @ExcludeMissing
        emailLabel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("emailPlaceholder")
        @ExcludeMissing
        emailPlaceholder: JsonField<String> = JsonMissing.of(),
        @JsonProperty("emailAgainLabel")
        @ExcludeMissing
        emailAgainLabel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("emailAgainPlaceholder")
        @ExcludeMissing
        emailAgainPlaceholder: JsonField<String> = JsonMissing.of(),
        @JsonProperty("legalNameLabel")
        @ExcludeMissing
        legalNameLabel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("legalNamePlaceholder")
        @ExcludeMissing
        legalNamePlaceholder: JsonField<String> = JsonMissing.of(),
        @JsonProperty("legalTypeLabel")
        @ExcludeMissing
        legalTypeLabel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("legalTypeIndividual")
        @ExcludeMissing
        legalTypeIndividual: JsonField<String> = JsonMissing.of(),
        @JsonProperty("legalTypeBusiness")
        @ExcludeMissing
        legalTypeBusiness: JsonField<String> = JsonMissing.of(),
        @JsonProperty("button") @ExcludeMissing button: JsonField<String> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<String> = JsonMissing.of(),
        @JsonProperty("claimPending")
        @ExcludeMissing
        claimPending: JsonField<String> = JsonMissing.of(),
        @JsonProperty("errorMessages")
        errorMessages: PayoutDestinationConfirmationErrorMessages? = null,
    ) : this(
        headline,
        description,
        emailLabel,
        emailPlaceholder,
        emailAgainLabel,
        emailAgainPlaceholder,
        legalNameLabel,
        legalNamePlaceholder,
        legalTypeLabel,
        legalTypeIndividual,
        legalTypeBusiness,
        button,
        success,
        claimPending,
        errorMessages,
        mutableMapOf(),
    )

    /** Returns additional fields supplied by the API. */
    @JsonAnyGetter
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties.toImmutable()

    fun headline(): Optional<String> = headline.getOptional("headline")

    fun description(): Optional<String> = description.getOptional("description")

    fun emailLabel(): Optional<String> = emailLabel.getOptional("emailLabel")

    fun emailPlaceholder(): Optional<String> = emailPlaceholder.getOptional("emailPlaceholder")

    fun emailAgainLabel(): Optional<String> = emailAgainLabel.getOptional("emailAgainLabel")

    fun emailAgainPlaceholder(): Optional<String> =
        emailAgainPlaceholder.getOptional("emailAgainPlaceholder")

    fun legalNameLabel(): Optional<String> = legalNameLabel.getOptional("legalNameLabel")

    fun legalNamePlaceholder(): Optional<String> =
        legalNamePlaceholder.getOptional("legalNamePlaceholder")

    fun legalTypeLabel(): Optional<String> = legalTypeLabel.getOptional("legalTypeLabel")

    fun legalTypeIndividual(): Optional<String> =
        legalTypeIndividual.getOptional("legalTypeIndividual")

    fun legalTypeBusiness(): Optional<String> = legalTypeBusiness.getOptional("legalTypeBusiness")

    fun button(): Optional<String> = button.getOptional("button")

    fun success(): Optional<String> = success.getOptional("success")

    fun claimPending(): Optional<String> = claimPending.getOptional("claimPending")

    fun errorMessages(): Optional<PayoutDestinationConfirmationErrorMessages> =
        Optional.ofNullable(errorMessages)
}

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class CampaignDesignReferredExperience
constructor(
    @JsonProperty("isOfferPopupEnabled") private val isOfferPopupEnabled: Boolean? = null,
    @JsonProperty("offerPopupTitle")
    @ExcludeMissing
    private val offerPopupTitle: JsonField<String> = JsonMissing.of(),
    @JsonProperty("offerPopupDescription")
    @ExcludeMissing
    private val offerPopupDescription: JsonField<String> = JsonMissing.of(),
    @JsonProperty("offerPopupButtonText")
    @ExcludeMissing
    private val offerPopupButtonText: JsonField<String> = JsonMissing.of(),
    @JsonProperty("offerPopupImageUrl")
    @ExcludeMissing
    private val offerPopupImageUrl: JsonField<String> = JsonMissing.of(),
    @JsonProperty("isOfferPopupReferrerImageShown")
    private val isOfferPopupReferrerImageShown: Boolean? = null,
    @JsonProperty("offerPopupPlacement")
    private val offerPopupPlacement: CampaignDesignOfferPopupPlacement? = null,
    @JsonProperty("offerPopupDelaySeconds")
    private val offerPopupDelaySeconds: CampaignDesignOfferPopupDelaySeconds? = null,
    @JsonProperty("offerPopupThankYouText")
    @ExcludeMissing
    private val offerPopupThankYouText: JsonField<String> = JsonMissing.of(),
    @JsonProperty("offerPopupThankYouButtonText")
    @ExcludeMissing
    private val offerPopupThankYouButtonText: JsonField<String> = JsonMissing.of(),
    @JsonProperty("isOfferPopupConfettiEnabled")
    private val isOfferPopupConfettiEnabled: Boolean? = null,
    @JsonProperty("isOfferPopupShownOnAllPages")
    private val isOfferPopupShownOnAllPages: Boolean? = null,
    @JsonProperty("offerPopupSecondaryLinkText")
    @ExcludeMissing
    private val offerPopupSecondaryLinkText: JsonField<String> = JsonMissing.of(),
    @JsonProperty("offerPopupSecondaryLinkUrl")
    @ExcludeMissing
    private val offerPopupSecondaryLinkUrl: JsonField<String> = JsonMissing.of(),
    @JsonProperty("isOfferPopupOverlayDimmed")
    private val isOfferPopupOverlayDimmed: Boolean? = null,
    @JsonProperty("offerPopupEmailPlaceholder")
    @ExcludeMissing
    private val offerPopupEmailPlaceholder: JsonField<String> = JsonMissing.of(),
    @JsonProperty("offerPopupPromoCodeCopyLabel")
    @ExcludeMissing
    private val offerPopupPromoCodeCopyLabel: JsonField<String> = JsonMissing.of(),
    @JsonProperty("offerPopupSubmitError")
    @ExcludeMissing
    private val offerPopupSubmitError: JsonField<String> = JsonMissing.of(),
    @JsonProperty("isBannerEnabled") private val isBannerEnabled: Boolean? = null,
    @JsonProperty("bannerText")
    @ExcludeMissing
    private val bannerText: JsonField<String> = JsonMissing.of(),
    @JsonProperty("bannerPlacement")
    private val bannerPlacement: CampaignDesignBannerPlacement? = null,
    @JsonProperty("isBannerClickableToSignupUrl")
    private val isBannerClickableToSignupUrl: Boolean? = null,
    @JsonProperty("isHeadingEnabled") private val isHeadingEnabled: Boolean? = null,
    @JsonProperty("headingText")
    @ExcludeMissing
    private val headingText: JsonField<String> = JsonMissing.of(),
    @JsonProperty("headingTarget") private val headingTarget: CampaignDesignHeadingTarget? = null,
    @JsonProperty("headingPlacement")
    private val headingPlacement: CampaignDesignHeadingPlacement? = null,
    @JsonProperty("isHeadingStyled") private val isHeadingStyled: Boolean? = null,
    @JsonProperty("isHeadingClickableToSignupUrl")
    private val isHeadingClickableToSignupUrl: Boolean? = null,
    @JsonProperty("pageTitleReplacement")
    @ExcludeMissing
    private val pageTitleReplacement: JsonField<String> = JsonMissing.of(),
    @JsonProperty("referrerNameFormat")
    private val referrerNameFormat: CampaignDesignReferrerNameFormat? = null,
    @JsonProperty("referrerNameFallback")
    @ExcludeMissing
    private val referrerNameFallback: JsonField<String> = JsonMissing.of(),
    @field:JsonAnySetter
    private val additionalProperties: MutableMap<String, JsonValue> = mutableMapOf(),
) {
    // Validate known values without conflating an omitted field with an explicit clear.
    init {
        offerPopupTitle.getOptional("offerPopupTitle")
        offerPopupDescription.getOptional("offerPopupDescription")
        offerPopupButtonText.getOptional("offerPopupButtonText")
        offerPopupImageUrl.getOptional("offerPopupImageUrl")
        offerPopupThankYouText.getOptional("offerPopupThankYouText")
        offerPopupThankYouButtonText.getOptional("offerPopupThankYouButtonText")
        offerPopupSecondaryLinkText.getOptional("offerPopupSecondaryLinkText")
        offerPopupSecondaryLinkUrl.getOptional("offerPopupSecondaryLinkUrl")
        offerPopupEmailPlaceholder.getOptional("offerPopupEmailPlaceholder")
        offerPopupPromoCodeCopyLabel.getOptional("offerPopupPromoCodeCopyLabel")
        offerPopupSubmitError.getOptional("offerPopupSubmitError")
        bannerText.getOptional("bannerText")
        headingText.getOptional("headingText")
        pageTitleReplacement.getOptional("pageTitleReplacement")
        referrerNameFallback.getOptional("referrerNameFallback")
    }

    @JsonCreator
    constructor(
        @JsonProperty("isOfferPopupEnabled") isOfferPopupEnabled: Boolean? = null,
        @JsonProperty("offerPopupTitle")
        @ExcludeMissing
        offerPopupTitle: JsonField<String> = JsonMissing.of(),
        @JsonProperty("offerPopupDescription")
        @ExcludeMissing
        offerPopupDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("offerPopupButtonText")
        @ExcludeMissing
        offerPopupButtonText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("offerPopupImageUrl")
        @ExcludeMissing
        offerPopupImageUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("isOfferPopupReferrerImageShown")
        isOfferPopupReferrerImageShown: Boolean? = null,
        @JsonProperty("offerPopupPlacement")
        offerPopupPlacement: CampaignDesignOfferPopupPlacement? = null,
        @JsonProperty("offerPopupDelaySeconds")
        offerPopupDelaySeconds: CampaignDesignOfferPopupDelaySeconds? = null,
        @JsonProperty("offerPopupThankYouText")
        @ExcludeMissing
        offerPopupThankYouText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("offerPopupThankYouButtonText")
        @ExcludeMissing
        offerPopupThankYouButtonText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("isOfferPopupConfettiEnabled") isOfferPopupConfettiEnabled: Boolean? = null,
        @JsonProperty("isOfferPopupShownOnAllPages") isOfferPopupShownOnAllPages: Boolean? = null,
        @JsonProperty("offerPopupSecondaryLinkText")
        @ExcludeMissing
        offerPopupSecondaryLinkText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("offerPopupSecondaryLinkUrl")
        @ExcludeMissing
        offerPopupSecondaryLinkUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("isOfferPopupOverlayDimmed") isOfferPopupOverlayDimmed: Boolean? = null,
        @JsonProperty("offerPopupEmailPlaceholder")
        @ExcludeMissing
        offerPopupEmailPlaceholder: JsonField<String> = JsonMissing.of(),
        @JsonProperty("offerPopupPromoCodeCopyLabel")
        @ExcludeMissing
        offerPopupPromoCodeCopyLabel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("offerPopupSubmitError")
        @ExcludeMissing
        offerPopupSubmitError: JsonField<String> = JsonMissing.of(),
        @JsonProperty("isBannerEnabled") isBannerEnabled: Boolean? = null,
        @JsonProperty("bannerText")
        @ExcludeMissing
        bannerText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bannerPlacement") bannerPlacement: CampaignDesignBannerPlacement? = null,
        @JsonProperty("isBannerClickableToSignupUrl") isBannerClickableToSignupUrl: Boolean? = null,
        @JsonProperty("isHeadingEnabled") isHeadingEnabled: Boolean? = null,
        @JsonProperty("headingText")
        @ExcludeMissing
        headingText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("headingTarget") headingTarget: CampaignDesignHeadingTarget? = null,
        @JsonProperty("headingPlacement") headingPlacement: CampaignDesignHeadingPlacement? = null,
        @JsonProperty("isHeadingStyled") isHeadingStyled: Boolean? = null,
        @JsonProperty("isHeadingClickableToSignupUrl")
        isHeadingClickableToSignupUrl: Boolean? = null,
        @JsonProperty("pageTitleReplacement")
        @ExcludeMissing
        pageTitleReplacement: JsonField<String> = JsonMissing.of(),
        @JsonProperty("referrerNameFormat")
        referrerNameFormat: CampaignDesignReferrerNameFormat? = null,
        @JsonProperty("referrerNameFallback")
        @ExcludeMissing
        referrerNameFallback: JsonField<String> = JsonMissing.of(),
    ) : this(
        isOfferPopupEnabled,
        offerPopupTitle,
        offerPopupDescription,
        offerPopupButtonText,
        offerPopupImageUrl,
        isOfferPopupReferrerImageShown,
        offerPopupPlacement,
        offerPopupDelaySeconds,
        offerPopupThankYouText,
        offerPopupThankYouButtonText,
        isOfferPopupConfettiEnabled,
        isOfferPopupShownOnAllPages,
        offerPopupSecondaryLinkText,
        offerPopupSecondaryLinkUrl,
        isOfferPopupOverlayDimmed,
        offerPopupEmailPlaceholder,
        offerPopupPromoCodeCopyLabel,
        offerPopupSubmitError,
        isBannerEnabled,
        bannerText,
        bannerPlacement,
        isBannerClickableToSignupUrl,
        isHeadingEnabled,
        headingText,
        headingTarget,
        headingPlacement,
        isHeadingStyled,
        isHeadingClickableToSignupUrl,
        pageTitleReplacement,
        referrerNameFormat,
        referrerNameFallback,
        mutableMapOf(),
    )

    /** Returns additional fields supplied by the API. */
    @JsonAnyGetter
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties.toImmutable()

    fun isOfferPopupEnabled(): Optional<Boolean> = Optional.ofNullable(isOfferPopupEnabled)

    fun offerPopupTitle(): Optional<String> = offerPopupTitle.getOptional("offerPopupTitle")

    fun offerPopupDescription(): Optional<String> =
        offerPopupDescription.getOptional("offerPopupDescription")

    fun offerPopupButtonText(): Optional<String> =
        offerPopupButtonText.getOptional("offerPopupButtonText")

    fun offerPopupImageUrl(): Optional<String> =
        offerPopupImageUrl.getOptional("offerPopupImageUrl")

    fun isOfferPopupReferrerImageShown(): Optional<Boolean> =
        Optional.ofNullable(isOfferPopupReferrerImageShown)

    fun offerPopupPlacement(): Optional<CampaignDesignOfferPopupPlacement> =
        Optional.ofNullable(offerPopupPlacement)

    fun offerPopupDelaySeconds(): Optional<CampaignDesignOfferPopupDelaySeconds> =
        Optional.ofNullable(offerPopupDelaySeconds)

    fun offerPopupThankYouText(): Optional<String> =
        offerPopupThankYouText.getOptional("offerPopupThankYouText")

    fun offerPopupThankYouButtonText(): Optional<String> =
        offerPopupThankYouButtonText.getOptional("offerPopupThankYouButtonText")

    fun isOfferPopupConfettiEnabled(): Optional<Boolean> =
        Optional.ofNullable(isOfferPopupConfettiEnabled)

    fun isOfferPopupShownOnAllPages(): Optional<Boolean> =
        Optional.ofNullable(isOfferPopupShownOnAllPages)

    fun offerPopupSecondaryLinkText(): Optional<String> =
        offerPopupSecondaryLinkText.getOptional("offerPopupSecondaryLinkText")

    fun offerPopupSecondaryLinkUrl(): Optional<String> =
        offerPopupSecondaryLinkUrl.getOptional("offerPopupSecondaryLinkUrl")

    fun isOfferPopupOverlayDimmed(): Optional<Boolean> =
        Optional.ofNullable(isOfferPopupOverlayDimmed)

    fun offerPopupEmailPlaceholder(): Optional<String> =
        offerPopupEmailPlaceholder.getOptional("offerPopupEmailPlaceholder")

    fun offerPopupPromoCodeCopyLabel(): Optional<String> =
        offerPopupPromoCodeCopyLabel.getOptional("offerPopupPromoCodeCopyLabel")

    fun offerPopupSubmitError(): Optional<String> =
        offerPopupSubmitError.getOptional("offerPopupSubmitError")

    fun isBannerEnabled(): Optional<Boolean> = Optional.ofNullable(isBannerEnabled)

    fun bannerText(): Optional<String> = bannerText.getOptional("bannerText")

    fun bannerPlacement(): Optional<CampaignDesignBannerPlacement> =
        Optional.ofNullable(bannerPlacement)

    fun isBannerClickableToSignupUrl(): Optional<Boolean> =
        Optional.ofNullable(isBannerClickableToSignupUrl)

    fun isHeadingEnabled(): Optional<Boolean> = Optional.ofNullable(isHeadingEnabled)

    fun headingText(): Optional<String> = headingText.getOptional("headingText")

    fun headingTarget(): Optional<CampaignDesignHeadingTarget> = Optional.ofNullable(headingTarget)

    fun headingPlacement(): Optional<CampaignDesignHeadingPlacement> =
        Optional.ofNullable(headingPlacement)

    fun isHeadingStyled(): Optional<Boolean> = Optional.ofNullable(isHeadingStyled)

    fun isHeadingClickableToSignupUrl(): Optional<Boolean> =
        Optional.ofNullable(isHeadingClickableToSignupUrl)

    fun pageTitleReplacement(): Optional<String> =
        pageTitleReplacement.getOptional("pageTitleReplacement")

    fun referrerNameFormat(): Optional<CampaignDesignReferrerNameFormat> =
        Optional.ofNullable(referrerNameFormat)

    fun referrerNameFallback(): Optional<String> =
        referrerNameFallback.getOptional("referrerNameFallback")
}

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class CampaignDesignReferredExperienceOfferPopupTheme
constructor(
    @JsonProperty("color") @ExcludeMissing private val color: JsonField<String> = JsonMissing.of(),
    @JsonProperty("backgroundColor")
    @ExcludeMissing
    private val backgroundColor: JsonField<String> = JsonMissing.of(),
    @field:JsonAnySetter
    private val additionalProperties: MutableMap<String, JsonValue> = mutableMapOf(),
) {
    // Validate known values without conflating an omitted field with an explicit clear.
    init {
        color.getOptional("color")
        backgroundColor.getOptional("backgroundColor")
    }

    @JsonCreator
    constructor(
        @JsonProperty("color") @ExcludeMissing color: JsonField<String> = JsonMissing.of(),
        @JsonProperty("backgroundColor")
        @ExcludeMissing
        backgroundColor: JsonField<String> = JsonMissing.of(),
    ) : this(color, backgroundColor, mutableMapOf())

    /** Returns additional fields supplied by the API. */
    @JsonAnyGetter
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties.toImmutable()

    fun color(): Optional<String> = color.getOptional("color")

    fun backgroundColor(): Optional<String> = backgroundColor.getOptional("backgroundColor")
}

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class CampaignDesignTheme
constructor(
    @JsonProperty("referredExperienceOfferPopup")
    private val referredExperienceOfferPopup: CampaignDesignReferredExperienceOfferPopupTheme? =
        null,
    @field:JsonAnySetter
    private val additionalProperties: MutableMap<String, JsonValue> = mutableMapOf(),
) {
    @JsonCreator
    constructor(
        @JsonProperty("referredExperienceOfferPopup")
        referredExperienceOfferPopup: CampaignDesignReferredExperienceOfferPopupTheme? = null
    ) : this(referredExperienceOfferPopup, mutableMapOf())

    /** Returns additional fields supplied by the API. */
    @JsonAnyGetter
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties.toImmutable()

    fun referredExperienceOfferPopup(): Optional<CampaignDesignReferredExperienceOfferPopupTheme> =
        Optional.ofNullable(referredExperienceOfferPopup)
}
