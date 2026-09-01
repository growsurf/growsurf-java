// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import com.growsurf.api.models.campaign.AnalyticsAvailability
import com.growsurf.api.models.campaign.AnalyticsUnavailableReason
import java.util.Optional

/** Opt-in covered enrollment and first-milestone analytics for one participant. */
data class ParticipantActivationAnalytics
@JsonCreator
constructor(
    @JsonProperty("coverageStartAt") private val coverageStartAt: Long?,
    @JsonProperty("metricContractVersion") private val metricContractVersion: Long,
    @JsonProperty("programType") private val programType: ProgramType,
    @JsonProperty("state") private val state: AnalyticsAvailability,
    @JsonProperty("reason") private val reason: AnalyticsUnavailableReason?,
    @JsonProperty("cohort") private val cohort: Cohort,
    @JsonProperty("enrolledAsAdvocateAt") private val enrolledAsAdvocateAt: Long?,
    @JsonProperty("milestones") private val milestones: Milestones,
) {
    fun coverageStartAt(): Optional<Long> = Optional.ofNullable(coverageStartAt)

    fun metricContractVersion(): Long = metricContractVersion

    fun programType(): ProgramType = programType

    fun state(): AnalyticsAvailability = state

    fun reason(): Optional<AnalyticsUnavailableReason> = Optional.ofNullable(reason)

    fun cohort(): Cohort = cohort

    /** Empty can mean unavailable history. It does not mean advocate enrollment never occurred. */
    fun enrolledAsAdvocateAt(): Optional<Long> = Optional.ofNullable(enrolledAsAdvocateAt)

    fun milestones(): Milestones = milestones

    fun validate(): ParticipantActivationAnalytics = apply {
        cohort.validate()
        milestones.validate()
    }

    enum class ProgramType(@get:JsonValue val value: String) {
        REFERRAL("REFERRAL"),
        AFFILIATE("AFFILIATE"),
    }

    enum class AnchorField(@get:JsonValue val value: String) {
        ENROLLED_AS_ADVOCATE_AT("enrolledAsAdvocateAt"),
        APPROVED_AS_AFFILIATE_AT("approvedAsAffiliateAt"),
    }

    enum class ShareChannel(@get:JsonValue val value: String) {
        EMAIL("email"),
        FACEBOOK("facebook"),
        TWITTER("twitter"),
        LINKEDIN("linkedin"),
        PINTEREST("pinterest"),
        THREADS("threads"),
        BLUESKY("bluesky"),
        SMS("sms"),
        MESSENGER("messenger"),
        WHATSAPP("whatsapp"),
        WECHAT("wechat"),
        TELEGRAM("telegram"),
        REDDIT("reddit"),
        TUMBLR("tumblr"),
        QRCODE("qrcode"),
        COPY_REF_LINK("copyRefLink"),
        IOS_NATIVE_SHARE("iosNativeShare"),
        ANDROID_NATIVE_SHARE("androidNativeShare"),
    }

    data class Cohort
    @JsonCreator
    constructor(
        @JsonProperty("anchorField") private val anchorField: AnchorField,
        @JsonProperty("anchorAt") private val anchorAt: Long?,
    ) {
        fun anchorField(): AnchorField = anchorField

        /** Empty means the cohort anchor is outside known coverage or unavailable. */
        fun anchorAt(): Optional<Long> = Optional.ofNullable(anchorAt)

        fun validate(): Cohort = this
    }

    data class Milestones
    @JsonCreator
    constructor(
        @JsonProperty("firstPortalViewedAt") private val firstPortalViewedAt: Long?,
        @JsonProperty("firstReferralLinkCopiedAt") private val firstReferralLinkCopiedAt: Long?,
        @JsonProperty("firstShareAt") private val firstShareAt: Long?,
        @JsonProperty("firstShareChannel") private val firstShareChannel: ShareChannel?,
        @JsonProperty("firstUniqueClickAt") private val firstUniqueClickAt: Long?,
        @JsonProperty("firstLeadAt") private val firstLeadAt: Long?,
        @JsonProperty("firstReferralAt") private val firstReferralAt: Long?,
        @JsonProperty("firstRewardAt") private val firstRewardAt: Long?,
        @JsonProperty("firstCommissionAt") private val firstCommissionAt: Long?,
        @JsonProperty("payoutSetupCompletedAt") private val payoutSetupCompletedAt: Long?,
    ) {
        /** Empty means no value is known inside coverage. It does not mean this never happened. */
        fun firstPortalViewedAt(): Optional<Long> = Optional.ofNullable(firstPortalViewedAt)

        fun firstReferralLinkCopiedAt(): Optional<Long> =
            Optional.ofNullable(firstReferralLinkCopiedAt)

        fun firstShareAt(): Optional<Long> = Optional.ofNullable(firstShareAt)

        fun firstShareChannel(): Optional<ShareChannel> = Optional.ofNullable(firstShareChannel)

        fun firstUniqueClickAt(): Optional<Long> = Optional.ofNullable(firstUniqueClickAt)

        fun firstLeadAt(): Optional<Long> = Optional.ofNullable(firstLeadAt)

        fun firstReferralAt(): Optional<Long> = Optional.ofNullable(firstReferralAt)

        fun firstRewardAt(): Optional<Long> = Optional.ofNullable(firstRewardAt)

        fun firstCommissionAt(): Optional<Long> = Optional.ofNullable(firstCommissionAt)

        fun payoutSetupCompletedAt(): Optional<Long> = Optional.ofNullable(payoutSetupCompletedAt)

        fun validate(): Milestones = this
    }
}
