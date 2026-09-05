// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.options

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

enum class CampaignOptionsAffiliateApplicationMode(@get:JsonValueAnnotation val value: String) {
    OPEN_ENROLLMENT("OPEN_ENROLLMENT"),
    MANUAL_REVIEW("MANUAL_REVIEW"),
    AUTO_APPROVE("AUTO_APPROVE"),
}

enum class CampaignOptionsAffiliateReapplicationPolicy(@get:JsonValueAnnotation val value: String) {
    AFTER_COOLDOWN("AFTER_COOLDOWN"),
    DISABLED("DISABLED"),
}

enum class CampaignOptionsAttributionModel(@get:JsonValueAnnotation val value: String) {
    LAST_CLICK("LAST_CLICK"),
    FIRST_CLICK("FIRST_CLICK"),
}

enum class CampaignOptionsReferralCookieWindowDays(@get:JsonValueAnnotation val value: Long) {
    DAYS_1(1),
    DAYS_3(3),
    DAYS_7(7),
    DAYS_14(14),
    DAYS_30(30),
    DAYS_60(60),
    DAYS_90(90),
    DAYS_180(180),
    DAYS_365(365),
    DAYS_400(400),
}

enum class CampaignOptionsReferralCreditWindowDays(@get:JsonValueAnnotation val value: Long) {
    DAYS_1(1),
    DAYS_3(3),
    DAYS_7(7),
    DAYS_14(14),
    DAYS_30(30),
    DAYS_60(60),
    DAYS_90(90),
    DAYS_180(180),
    DAYS_365(365),
}

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class CampaignOptionsRecaptcha
@JsonCreator
constructor(
    @JsonProperty("isEnabled") private val isEnabled: Boolean? = null,
    @JsonProperty("siteKey") private val siteKey: String? = null,
    @JsonProperty("secretKey") private val secretKey: String? = null,
) {
    fun isEnabled(): Optional<Boolean> = Optional.ofNullable(isEnabled)

    fun siteKey(): Optional<String> = Optional.ofNullable(siteKey)

    /** Write-only. The API never returns this value. */
    fun secretKey(): Optional<String> = Optional.ofNullable(secretKey)
}

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class CampaignOptionsFraud
@JsonCreator
constructor(
    @JsonProperty("blockedEmails") private val blockedEmails: List<String>? = null,
    @JsonProperty("blockedIps") private val blockedIps: List<String>? = null,
    @JsonProperty("blockedCountries") private val blockedCountries: List<String>? = null,
    @JsonProperty("allowedEmails") private val allowedEmails: List<String>? = null,
    @JsonProperty("allowedIps") private val allowedIps: List<String>? = null,
    @JsonProperty("allowedCountries") private val allowedCountries: List<String>? = null,
    @JsonProperty("blockBurnerEmails") private val blockBurnerEmails: Boolean? = null,
    @JsonProperty("blockDataCenterIps") private val blockDataCenterIps: Boolean? = null,
    @JsonProperty("blockHighRiskReferrers") private val blockHighRiskReferrers: Boolean? = null,
    @JsonProperty("autoBlockHighRiskIps") private val autoBlockHighRiskIps: Boolean? = null,
    @JsonProperty("maxSignupsPerIp2Min") private val maxSignupsPerIp2Min: Long? = null,
    @JsonProperty("maxSignupsPerIp10Min") private val maxSignupsPerIp10Min: Long? = null,
    @JsonProperty("recaptcha") private val recaptcha: CampaignOptionsRecaptcha? = null,
) {
    fun blockedEmails(): Optional<List<String>> = Optional.ofNullable(blockedEmails)

    fun blockedIps(): Optional<List<String>> = Optional.ofNullable(blockedIps)

    fun blockedCountries(): Optional<List<String>> = Optional.ofNullable(blockedCountries)

    fun allowedEmails(): Optional<List<String>> = Optional.ofNullable(allowedEmails)

    fun allowedIps(): Optional<List<String>> = Optional.ofNullable(allowedIps)

    fun allowedCountries(): Optional<List<String>> = Optional.ofNullable(allowedCountries)

    fun blockBurnerEmails(): Optional<Boolean> = Optional.ofNullable(blockBurnerEmails)

    fun blockDataCenterIps(): Optional<Boolean> = Optional.ofNullable(blockDataCenterIps)

    fun blockHighRiskReferrers(): Optional<Boolean> = Optional.ofNullable(blockHighRiskReferrers)

    fun autoBlockHighRiskIps(): Optional<Boolean> = Optional.ofNullable(autoBlockHighRiskIps)

    fun maxSignupsPerIp2Min(): Optional<Long> = Optional.ofNullable(maxSignupsPerIp2Min)

    fun maxSignupsPerIp10Min(): Optional<Long> = Optional.ofNullable(maxSignupsPerIp10Min)

    fun recaptcha(): Optional<CampaignOptionsRecaptcha> = Optional.ofNullable(recaptcha)
}

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class CampaignOptionsTaxDocumentation
@JsonCreator
constructor(
    @JsonProperty("companyName") private val companyName: String? = null,
    @JsonProperty("vatNumber") private val vatNumber: String? = null,
    @JsonProperty("addressLine1") private val addressLine1: String? = null,
    @JsonProperty("addressLine2") private val addressLine2: String? = null,
    @JsonProperty("city") private val city: String? = null,
    @JsonProperty("state") private val state: String? = null,
    @JsonProperty("postalCode") private val postalCode: String? = null,
    @JsonProperty("country") private val country: String? = null,
    @JsonProperty("collectAffiliateVat") private val collectAffiliateVat: Boolean? = null,
) {
    fun companyName(): Optional<String> = Optional.ofNullable(companyName)

    fun vatNumber(): Optional<String> = Optional.ofNullable(vatNumber)

    fun addressLine1(): Optional<String> = Optional.ofNullable(addressLine1)

    fun addressLine2(): Optional<String> = Optional.ofNullable(addressLine2)

    fun city(): Optional<String> = Optional.ofNullable(city)

    fun state(): Optional<String> = Optional.ofNullable(state)

    fun postalCode(): Optional<String> = Optional.ofNullable(postalCode)

    fun country(): Optional<String> = Optional.ofNullable(country)

    fun collectAffiliateVat(): Optional<Boolean> = Optional.ofNullable(collectAffiliateVat)
}

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class CampaignOptionsNotificationEvents
@JsonCreator
constructor(
    @JsonProperty("PARTICIPANT_REACHED_A_GOAL")
    private val participantReachedAGoal: Boolean? = null,
    @JsonProperty("NEW_PARTICIPANT_ADDED_NON_REFERRED")
    private val newParticipantAddedNonReferred: Boolean? = null,
    @JsonProperty("NEW_PARTICIPANT_ADDED_REFERRED")
    private val newParticipantAddedReferred: Boolean? = null,
    @JsonProperty("CAMPAIGN_ENDED") private val campaignEnded: Boolean? = null,
    @JsonProperty("WEEKLY_PERFORMANCE_REPORT") private val weeklyPerformanceReport: Boolean? = null,
    @JsonProperty("MONTHLY_PERFORMANCE_REPORT")
    private val monthlyPerformanceReport: Boolean? = null,
    @JsonProperty("NEW_COMMISSION_ADDED") private val newCommissionAdded: Boolean? = null,
    @JsonProperty("COMMISSION_ADJUSTED") private val commissionAdjusted: Boolean? = null,
    @JsonProperty("NEW_PAYOUT_ISSUED") private val newPayoutIssued: Boolean? = null,
    @JsonProperty("AFFILIATE_BATCH_PAYOUT_COMPLETED")
    private val affiliateBatchPayoutCompleted: Boolean? = null,
    @JsonProperty("MONTHLY_PAYOUT_REMINDER") private val monthlyPayoutReminder: Boolean? = null,
    @JsonProperty("AFFILIATE_APPLICATIONS_PENDING_REVIEW")
    private val affiliateApplicationsPendingReview: Boolean? = null,
) {
    fun participantReachedAGoal(): Optional<Boolean> = Optional.ofNullable(participantReachedAGoal)

    fun newParticipantAddedNonReferred(): Optional<Boolean> =
        Optional.ofNullable(newParticipantAddedNonReferred)

    fun newParticipantAddedReferred(): Optional<Boolean> =
        Optional.ofNullable(newParticipantAddedReferred)

    fun campaignEnded(): Optional<Boolean> = Optional.ofNullable(campaignEnded)

    fun weeklyPerformanceReport(): Optional<Boolean> = Optional.ofNullable(weeklyPerformanceReport)

    fun monthlyPerformanceReport(): Optional<Boolean> =
        Optional.ofNullable(monthlyPerformanceReport)

    fun newCommissionAdded(): Optional<Boolean> = Optional.ofNullable(newCommissionAdded)

    fun commissionAdjusted(): Optional<Boolean> = Optional.ofNullable(commissionAdjusted)

    fun newPayoutIssued(): Optional<Boolean> = Optional.ofNullable(newPayoutIssued)

    fun affiliateBatchPayoutCompleted(): Optional<Boolean> =
        Optional.ofNullable(affiliateBatchPayoutCompleted)

    fun monthlyPayoutReminder(): Optional<Boolean> = Optional.ofNullable(monthlyPayoutReminder)

    fun affiliateApplicationsPendingReview(): Optional<Boolean> =
        Optional.ofNullable(affiliateApplicationsPendingReview)
}

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class CampaignOptionsNotificationEmails
@JsonCreator
constructor(
    @JsonProperty("recipients") private val recipients: List<String>? = null,
    @JsonProperty("events") private val events: CampaignOptionsNotificationEvents? = null,
) {
    fun recipients(): Optional<List<String>> = Optional.ofNullable(recipients)

    fun events(): Optional<CampaignOptionsNotificationEvents> = Optional.ofNullable(events)
}

/**
 * Program Editor **Options** tab configuration. Documented fields are typed. The contract remains
 * open to future options, which are available through [_additionalProperties].
 */
class CampaignOptions
@JsonCreator
private constructor(
    @com.fasterxml.jackson.annotation.JsonValue
    private val additionalProperties: Map<String, JsonValue>
) {

    fun affiliateApplicationMode(): Optional<CampaignOptionsAffiliateApplicationMode> =
        configField(additionalProperties, "affiliateApplicationMode")

    fun affiliateReapplicationPolicy(): Optional<CampaignOptionsAffiliateReapplicationPolicy> =
        configField(additionalProperties, "affiliateReapplicationPolicy")

    fun affiliateReapplicationCooldownDays(): Optional<Long> =
        configField(additionalProperties, "affiliateReapplicationCooldownDays")

    fun affiliateApplicationReviewEstimateBusinessDays(): Optional<Long> =
        configField(additionalProperties, "affiliateApplicationReviewEstimateBusinessDays")

    fun requireManualRewardApproval(): Optional<Boolean> =
        configField(additionalProperties, "requireManualRewardApproval")

    fun autoFulfillRewards(): Optional<Boolean> =
        configField(additionalProperties, "autoFulfillRewards")

    fun requireManualFraudApproval(): Optional<Boolean> =
        configField(additionalProperties, "requireManualFraudApproval")

    fun autoBlockFraud(): Optional<Boolean> = configField(additionalProperties, "autoBlockFraud")

    fun requireParticipantAuth(): Optional<Boolean> =
        configField(additionalProperties, "requireParticipantAuth")

    fun enforceGdprCompliance(): Optional<Boolean> =
        configField(additionalProperties, "enforceGdprCompliance")

    fun blockPaidAdsTraffic(): Optional<Boolean> =
        configField(additionalProperties, "blockPaidAdsTraffic")

    fun attributionModel(): Optional<CampaignOptionsAttributionModel> =
        configField(additionalProperties, "attributionModel")

    fun referralCookieWindowDays(): Optional<CampaignOptionsReferralCookieWindowDays> =
        configField(additionalProperties, "referralCookieWindowDays")

    fun referralCreditWindowDays(): Optional<CampaignOptionsReferralCreditWindowDays> =
        configField(additionalProperties, "referralCreditWindowDays")

    fun payoutThreshold(): Optional<Long> = configField(additionalProperties, "payoutThreshold")

    fun fraud(): Optional<CampaignOptionsFraud> = configField(additionalProperties, "fraud")

    fun taxDocumentation(): Optional<CampaignOptionsTaxDocumentation> =
        configField(additionalProperties, "taxDocumentation")

    fun notificationEmails(): Optional<CampaignOptionsNotificationEmails> =
        configField(additionalProperties, "notificationEmails")

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [CampaignOptions]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CampaignOptions]. */
    class Builder internal constructor() {

        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(options: CampaignOptions) = apply {
            additionalProperties = options.additionalProperties.toMutableMap()
        }

        fun affiliateApplicationMode(value: CampaignOptionsAffiliateApplicationMode) = apply {
            additionalProperties.putConfigField("affiliateApplicationMode", value)
        }

        fun affiliateReapplicationPolicy(value: CampaignOptionsAffiliateReapplicationPolicy) =
            apply {
                additionalProperties.putConfigField("affiliateReapplicationPolicy", value)
            }

        fun affiliateReapplicationCooldownDays(value: Long) = apply {
            additionalProperties.putConfigField("affiliateReapplicationCooldownDays", value)
        }

        fun affiliateApplicationReviewEstimateBusinessDays(value: Long?) = apply {
            additionalProperties.putConfigField(
                "affiliateApplicationReviewEstimateBusinessDays",
                value,
            )
        }

        fun requireManualRewardApproval(value: Boolean) = apply {
            additionalProperties.putConfigField("requireManualRewardApproval", value)
        }

        fun autoFulfillRewards(value: Boolean) = apply {
            additionalProperties.putConfigField("autoFulfillRewards", value)
        }

        fun requireManualFraudApproval(value: Boolean) = apply {
            additionalProperties.putConfigField("requireManualFraudApproval", value)
        }

        fun autoBlockFraud(value: Boolean) = apply {
            additionalProperties.putConfigField("autoBlockFraud", value)
        }

        fun requireParticipantAuth(value: Boolean) = apply {
            additionalProperties.putConfigField("requireParticipantAuth", value)
        }

        fun enforceGdprCompliance(value: Boolean) = apply {
            additionalProperties.putConfigField("enforceGdprCompliance", value)
        }

        fun blockPaidAdsTraffic(value: Boolean) = apply {
            additionalProperties.putConfigField("blockPaidAdsTraffic", value)
        }

        fun attributionModel(value: CampaignOptionsAttributionModel) = apply {
            additionalProperties.putConfigField("attributionModel", value)
        }

        fun referralCookieWindowDays(value: CampaignOptionsReferralCookieWindowDays) = apply {
            additionalProperties.putConfigField("referralCookieWindowDays", value)
        }

        fun referralCreditWindowDays(value: CampaignOptionsReferralCreditWindowDays?) = apply {
            additionalProperties.putConfigField("referralCreditWindowDays", value)
        }

        fun payoutThreshold(value: Long?) = apply {
            additionalProperties.putConfigField("payoutThreshold", value)
        }

        fun fraud(value: CampaignOptionsFraud) = apply {
            additionalProperties.putConfigField("fraud", value)
        }

        fun taxDocumentation(value: CampaignOptionsTaxDocumentation) = apply {
            additionalProperties.putConfigField("taxDocumentation", value)
        }

        fun notificationEmails(value: CampaignOptionsNotificationEmails) = apply {
            additionalProperties.putConfigField("notificationEmails", value)
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
         * Returns an immutable instance of [CampaignOptions].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CampaignOptions = CampaignOptions(additionalProperties.toImmutable())
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
    fun validate(): CampaignOptions = apply {
        if (validated) {
            return@apply
        }

        affiliateApplicationMode().orElse(null)
        affiliateReapplicationPolicy().orElse(null)
        affiliateReapplicationCooldownDays().orElse(null)
        affiliateApplicationReviewEstimateBusinessDays().orElse(null)
        requireManualRewardApproval().orElse(null)
        autoFulfillRewards().orElse(null)
        requireManualFraudApproval().orElse(null)
        autoBlockFraud().orElse(null)
        requireParticipantAuth().orElse(null)
        enforceGdprCompliance().orElse(null)
        blockPaidAdsTraffic().orElse(null)
        attributionModel().orElse(null)
        referralCookieWindowDays().orElse(null)
        referralCreditWindowDays().orElse(null)
        payoutThreshold().orElse(null)
        fraud().orElse(null)
        taxDocumentation().orElse(null)
        notificationEmails().orElse(null)
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

        return other is CampaignOptions && additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() = "CampaignOptions{additionalProperties=$additionalProperties}"
}
