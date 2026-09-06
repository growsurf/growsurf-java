// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.design

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.growsurf.api.core.ExcludeMissing
import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.toImmutable
import com.growsurf.api.errors.GrowsurfInvalidDataException
import com.growsurf.api.models.campaign.configField
import com.growsurf.api.models.campaign.putConfigField
import java.util.Objects
import java.util.Optional

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
            additionalProperties["resources"] = JsonValue.from(resources)
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
