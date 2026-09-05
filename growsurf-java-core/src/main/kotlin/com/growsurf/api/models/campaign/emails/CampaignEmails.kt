// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.emails

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAutoDetect
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.growsurf.api.core.ExcludeMissing
import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.toImmutable
import com.growsurf.api.errors.GrowsurfInvalidDataException
import com.growsurf.api.models.campaign.configField
import com.growsurf.api.models.campaign.putConfigField
import java.util.Objects
import java.util.Optional

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class CampaignEmailTemplate
@JsonCreator
constructor(
    @JsonProperty("subject") private val subject: String? = null,
    @JsonProperty("preheader") private val preheader: String? = null,
    @JsonProperty("body") private val body: String? = null,
    @JsonProperty("isEnabled") private val isEnabled: Boolean? = null,
) {
    fun subject(): Optional<String> = Optional.ofNullable(subject)

    fun preheader(): Optional<String> = Optional.ofNullable(preheader)

    fun body(): Optional<String> = Optional.ofNullable(body)

    fun isEnabled(): Optional<Boolean> = Optional.ofNullable(isEnabled)
}

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class CampaignInviteEmailTemplate
@JsonCreator
constructor(
    @JsonProperty("subject") private val subject: String? = null,
    @JsonProperty("preheader") private val preheader: String? = null,
    @JsonProperty("body") private val body: String? = null,
    @JsonProperty("isEnabled") private val isEnabled: Boolean? = null,
    @JsonProperty("useCompanyReplyTo") private val useCompanyReplyTo: Boolean? = null,
) {
    fun subject(): Optional<String> = Optional.ofNullable(subject)

    fun preheader(): Optional<String> = Optional.ofNullable(preheader)

    fun body(): Optional<String> = Optional.ofNullable(body)

    fun isEnabled(): Optional<Boolean> = Optional.ofNullable(isEnabled)

    fun useCompanyReplyTo(): Optional<Boolean> = Optional.ofNullable(useCompanyReplyTo)
}

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class CampaignEmailSenderSettings
@JsonCreator
constructor(
    @JsonProperty("fromName") private val fromName: String? = null,
    @JsonProperty("replyToEmail") private val replyToEmail: String? = null,
    @JsonProperty("fromEmail") private val fromEmail: String? = null,
) {
    fun fromName(): Optional<String> = Optional.ofNullable(fromName)

    fun replyToEmail(): Optional<String> = Optional.ofNullable(replyToEmail)

    /** Read-only sender address returned by the API. */
    fun fromEmail(): Optional<String> = Optional.ofNullable(fromEmail)
}

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class CampaignEmailContactSettings
@JsonCreator
constructor(
    @JsonProperty("companyName") private val companyName: String? = null,
    @JsonProperty("addressLine1") private val addressLine1: String? = null,
    @JsonProperty("addressLine2") private val addressLine2: String? = null,
    @JsonProperty("city") private val city: String? = null,
    @JsonProperty("state") private val state: String? = null,
    @JsonProperty("postalCode") private val postalCode: String? = null,
    @JsonProperty("country") private val country: String? = null,
) {
    fun companyName(): Optional<String> = Optional.ofNullable(companyName)

    fun addressLine1(): Optional<String> = Optional.ofNullable(addressLine1)

    fun addressLine2(): Optional<String> = Optional.ofNullable(addressLine2)

    fun city(): Optional<String> = Optional.ofNullable(city)

    fun state(): Optional<String> = Optional.ofNullable(state)

    fun postalCode(): Optional<String> = Optional.ofNullable(postalCode)

    fun country(): Optional<String> = Optional.ofNullable(country)
}

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class CampaignEmailDesignSettings
@JsonCreator
constructor(
    @JsonProperty("header") private val header: String? = null,
    @JsonProperty("footer") private val footer: String? = null,
    @JsonProperty("unsubscribePromotional") private val unsubscribePromotional: String? = null,
    @JsonProperty("unsubscribeInvite") private val unsubscribeInvite: String? = null,
    @JsonProperty("unsubscribeAffiliateInvite")
    private val unsubscribeAffiliateInvite: String? = null,
    @JsonProperty("unsubscribeTransactional") private val unsubscribeTransactional: String? = null,
) {
    fun header(): Optional<String> = Optional.ofNullable(header)

    fun footer(): Optional<String> = Optional.ofNullable(footer)

    fun unsubscribePromotional(): Optional<String> = Optional.ofNullable(unsubscribePromotional)

    fun unsubscribeInvite(): Optional<String> = Optional.ofNullable(unsubscribeInvite)

    fun unsubscribeAffiliateInvite(): Optional<String> =
        Optional.ofNullable(unsubscribeAffiliateInvite)

    fun unsubscribeTransactional(): Optional<String> = Optional.ofNullable(unsubscribeTransactional)
}

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class CampaignEmailSettings
@JsonCreator
constructor(
    @JsonProperty("sender") private val sender: CampaignEmailSenderSettings? = null,
    @JsonProperty("contact") private val contact: CampaignEmailContactSettings? = null,
    @JsonProperty("design") private val design: CampaignEmailDesignSettings? = null,
) {
    fun sender(): Optional<CampaignEmailSenderSettings> = Optional.ofNullable(sender)

    fun contact(): Optional<CampaignEmailContactSettings> = Optional.ofNullable(contact)

    fun design(): Optional<CampaignEmailDesignSettings> = Optional.ofNullable(design)
}

/**
 * Program Editor **Emails** tab configuration. Documented templates and settings are typed. The
 * contract remains open to future templates, available through [_additionalProperties].
 */
class CampaignEmails
@JsonCreator
private constructor(
    @com.fasterxml.jackson.annotation.JsonValue
    private val additionalProperties: Map<String, JsonValue>
) {

    fun welcomeNonReferred(): Optional<CampaignEmailTemplate> = field("welcomeNonReferred")

    fun welcomeReferred(): Optional<CampaignEmailTemplate> = field("welcomeReferred")

    fun offerClaimed(): Optional<CampaignEmailTemplate> = field("offerClaimed")

    fun referralLinkViewedFirstTime(): Optional<CampaignEmailTemplate> =
        field("referralLinkViewedFirstTime")

    fun referralLinkUsed(): Optional<CampaignEmailTemplate> = field("referralLinkUsed")

    fun referredSignup(): Optional<CampaignEmailTemplate> = field("referredSignup")

    fun goalAchieved(): Optional<CampaignEmailTemplate> = field("goalAchieved")

    fun campaignEndedWinners(): Optional<CampaignEmailTemplate> = field("campaignEndedWinners")

    fun campaignEndedNonWinners(): Optional<CampaignEmailTemplate> =
        field("campaignEndedNonWinners")

    fun progressUpdateMonthly(): Optional<CampaignEmailTemplate> = field("progressUpdateMonthly")

    fun commissionGenerated(): Optional<CampaignEmailTemplate> = field("commissionGenerated")

    fun commissionAdjusted(): Optional<CampaignEmailTemplate> = field("commissionAdjusted")

    fun payoutPending(): Optional<CampaignEmailTemplate> = field("payoutPending")

    fun payoutSentSuccess(): Optional<CampaignEmailTemplate> = field("payoutSentSuccess")

    fun invite(): Optional<CampaignInviteEmailTemplate> =
        configField(additionalProperties, "invite")

    fun loginLink(): Optional<CampaignEmailTemplate> = field("loginLink")

    fun payoutDestinationConfirmation(): Optional<CampaignEmailTemplate> =
        field("payoutDestinationConfirmation")

    fun payoutDestinationChanged(): Optional<CampaignEmailTemplate> =
        field("payoutDestinationChanged")

    fun taxInfoMissing(): Optional<CampaignEmailTemplate> = field("taxInfoMissing")

    fun taxInfoReceived(): Optional<CampaignEmailTemplate> = field("taxInfoReceived")

    fun taxInfoApproved(): Optional<CampaignEmailTemplate> = field("taxInfoApproved")

    fun taxInfoRejected(): Optional<CampaignEmailTemplate> = field("taxInfoRejected")

    fun affiliateApplicationReceived(): Optional<CampaignEmailTemplate> =
        field("affiliateApplicationReceived")

    fun affiliateApplicationApproved(): Optional<CampaignEmailTemplate> =
        field("affiliateApplicationApproved")

    fun affiliateApplicationDenied(): Optional<CampaignEmailTemplate> =
        field("affiliateApplicationDenied")

    fun inviteAffiliate(): Optional<CampaignEmailTemplate> = field("inviteAffiliate")

    fun affiliateApplicationStatusLink(): Optional<CampaignEmailTemplate> =
        field("affiliateApplicationStatusLink")

    fun affiliateApplicationEmailCorrection(): Optional<CampaignEmailTemplate> =
        field("affiliateApplicationEmailCorrection")

    fun affiliateEmailChangeVerification(): Optional<CampaignEmailTemplate> =
        field("affiliateEmailChangeVerification")

    fun settings(): Optional<CampaignEmailSettings> = configField(additionalProperties, "settings")

    private fun field(name: String): Optional<CampaignEmailTemplate> =
        configField(additionalProperties, name)

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [CampaignEmails]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CampaignEmails]. */
    class Builder internal constructor() {

        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emails: CampaignEmails) = apply {
            additionalProperties = emails.additionalProperties.toMutableMap()
        }

        fun welcomeNonReferred(value: CampaignEmailTemplate) = template("welcomeNonReferred", value)

        fun welcomeReferred(value: CampaignEmailTemplate) = template("welcomeReferred", value)

        fun offerClaimed(value: CampaignEmailTemplate) = template("offerClaimed", value)

        fun referralLinkViewedFirstTime(value: CampaignEmailTemplate) =
            template("referralLinkViewedFirstTime", value)

        fun referralLinkUsed(value: CampaignEmailTemplate) = template("referralLinkUsed", value)

        fun referredSignup(value: CampaignEmailTemplate) = template("referredSignup", value)

        fun goalAchieved(value: CampaignEmailTemplate) = template("goalAchieved", value)

        fun campaignEndedWinners(value: CampaignEmailTemplate) =
            template("campaignEndedWinners", value)

        fun campaignEndedNonWinners(value: CampaignEmailTemplate) =
            template("campaignEndedNonWinners", value)

        fun progressUpdateMonthly(value: CampaignEmailTemplate) =
            template("progressUpdateMonthly", value)

        fun commissionGenerated(value: CampaignEmailTemplate) =
            template("commissionGenerated", value)

        fun commissionAdjusted(value: CampaignEmailTemplate) = template("commissionAdjusted", value)

        fun payoutPending(value: CampaignEmailTemplate) = template("payoutPending", value)

        fun payoutSentSuccess(value: CampaignEmailTemplate) = template("payoutSentSuccess", value)

        fun invite(value: CampaignInviteEmailTemplate) = apply {
            additionalProperties.putConfigField("invite", value)
        }

        fun loginLink(value: CampaignEmailTemplate) = template("loginLink", value)

        fun payoutDestinationConfirmation(value: CampaignEmailTemplate) =
            template("payoutDestinationConfirmation", value)

        fun payoutDestinationChanged(value: CampaignEmailTemplate) =
            template("payoutDestinationChanged", value)

        fun taxInfoMissing(value: CampaignEmailTemplate) = template("taxInfoMissing", value)

        fun taxInfoReceived(value: CampaignEmailTemplate) = template("taxInfoReceived", value)

        fun taxInfoApproved(value: CampaignEmailTemplate) = template("taxInfoApproved", value)

        fun taxInfoRejected(value: CampaignEmailTemplate) = template("taxInfoRejected", value)

        fun affiliateApplicationReceived(value: CampaignEmailTemplate) =
            template("affiliateApplicationReceived", value)

        fun affiliateApplicationApproved(value: CampaignEmailTemplate) =
            template("affiliateApplicationApproved", value)

        fun affiliateApplicationDenied(value: CampaignEmailTemplate) =
            template("affiliateApplicationDenied", value)

        fun inviteAffiliate(value: CampaignEmailTemplate) = template("inviteAffiliate", value)

        fun affiliateApplicationStatusLink(value: CampaignEmailTemplate) =
            template("affiliateApplicationStatusLink", value)

        fun affiliateApplicationEmailCorrection(value: CampaignEmailTemplate) =
            template("affiliateApplicationEmailCorrection", value)

        fun affiliateEmailChangeVerification(value: CampaignEmailTemplate) =
            template("affiliateEmailChangeVerification", value)

        fun settings(value: CampaignEmailSettings) = apply {
            additionalProperties.putConfigField("settings", value)
        }

        private fun template(name: String, value: CampaignEmailTemplate) = apply {
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
         * Returns an immutable instance of [CampaignEmails].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CampaignEmails = CampaignEmails(additionalProperties.toImmutable())
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
    fun validate(): CampaignEmails = apply {
        if (validated) {
            return@apply
        }

        welcomeNonReferred().orElse(null)
        welcomeReferred().orElse(null)
        offerClaimed().orElse(null)
        referralLinkViewedFirstTime().orElse(null)
        referralLinkUsed().orElse(null)
        referredSignup().orElse(null)
        goalAchieved().orElse(null)
        campaignEndedWinners().orElse(null)
        campaignEndedNonWinners().orElse(null)
        progressUpdateMonthly().orElse(null)
        commissionGenerated().orElse(null)
        commissionAdjusted().orElse(null)
        payoutPending().orElse(null)
        payoutSentSuccess().orElse(null)
        invite().orElse(null)
        loginLink().orElse(null)
        payoutDestinationConfirmation().orElse(null)
        payoutDestinationChanged().orElse(null)
        taxInfoMissing().orElse(null)
        taxInfoReceived().orElse(null)
        taxInfoApproved().orElse(null)
        taxInfoRejected().orElse(null)
        affiliateApplicationReceived().orElse(null)
        affiliateApplicationApproved().orElse(null)
        affiliateApplicationDenied().orElse(null)
        inviteAffiliate().orElse(null)
        affiliateApplicationStatusLink().orElse(null)
        affiliateApplicationEmailCorrection().orElse(null)
        affiliateEmailChangeVerification().orElse(null)
        settings().orElse(null)
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

        return other is CampaignEmails && additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() = "CampaignEmails{additionalProperties=$additionalProperties}"
}
