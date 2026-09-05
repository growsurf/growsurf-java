// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import java.util.Optional

/** Activation cohorts for eligible participants in a referral or affiliate program. */
data class CampaignActivationAnalyticsResponse
@JsonCreator
constructor(
    @JsonProperty("coverageStartAt") private val coverageStartAt: Long?,
    @JsonProperty("metricContractVersion") private val metricContractVersion: Long,
    @JsonProperty("programType") private val programType: ProgramType,
    @JsonProperty("timezone") private val timezone: String,
    @JsonProperty("cohortInterval") private val cohortInterval: CohortInterval,
    @JsonProperty("observationWindowDays") private val observationWindowDays: Long,
    @JsonProperty("portalViewedLabel") private val portalViewedLabel: PortalViewedLabel,
    @JsonProperty("portalViewedHelperText") private val portalViewedHelperText: String,
    @JsonProperty("aggregate") private val aggregate: CohortResult,
    @JsonProperty("cohorts") private val cohorts: List<CohortResult>,
) {
    /** Empty until complete activation capture coverage begins. */
    fun coverageStartAt(): Optional<Long> = Optional.ofNullable(coverageStartAt)

    fun metricContractVersion(): Long = metricContractVersion

    fun programType(): ProgramType = programType

    fun timezone(): String = timezone

    fun cohortInterval(): CohortInterval = cohortInterval

    fun observationWindowDays(): Long = observationWindowDays

    fun portalViewedLabel(): PortalViewedLabel = portalViewedLabel

    fun portalViewedHelperText(): String = portalViewedHelperText

    fun aggregate(): CohortResult = aggregate

    fun cohorts(): List<CohortResult> = cohorts

    fun validate(): CampaignActivationAnalyticsResponse = apply {
        aggregate.validate()
        cohorts.forEach { it.validate() }
    }

    enum class ProgramType(@get:JsonValue val value: String) {
        REFERRAL("REFERRAL"),
        AFFILIATE("AFFILIATE"),
    }

    enum class CohortInterval(@get:JsonValue val value: String) {
        DAY("day"),
        WEEK("week"),
        MONTH("month"),
    }

    enum class PortalViewedLabel(@get:JsonValue val value: String) {
        REFERRAL("Referral portal viewed"),
        AFFILIATE("Affiliate portal viewed"),
    }

    enum class StageKey(@get:JsonValue val value: String) {
        ELIGIBLE("ELIGIBLE"),
        PORTAL_VIEWED("PORTAL_VIEWED"),
        SHARE_ACTION("SHARE_ACTION"),
        UNIQUE_REFERRAL_VISIT("UNIQUE_REFERRAL_VISIT"),
        LEAD("LEAD"),
        CREDITED_REFERRAL("CREDITED_REFERRAL"),
    }

    enum class StalledSegmentKey(@get:JsonValue val value: String) {
        ELIGIBLE_NO_PORTAL_VIEW("ELIGIBLE_NO_PORTAL_VIEW"),
        PORTAL_VIEWED_NO_SHARE_ACTION("PORTAL_VIEWED_NO_SHARE_ACTION"),
        SHARED_NO_UNIQUE_REFERRAL_VISIT("SHARED_NO_UNIQUE_REFERRAL_VISIT"),
        UNIQUE_VISIT_NO_LEAD("UNIQUE_VISIT_NO_LEAD"),
        LEAD_NO_CREDITED_REFERRAL("LEAD_NO_CREDITED_REFERRAL"),
    }

    enum class StalledSegmentFromStage(@get:JsonValue val value: String) {
        ELIGIBLE("ELIGIBLE"),
        PORTAL_VIEWED("PORTAL_VIEWED"),
        SHARE_ACTION("SHARE_ACTION"),
        UNIQUE_REFERRAL_VISIT("UNIQUE_REFERRAL_VISIT"),
        LEAD("LEAD"),
    }

    enum class StalledSegmentToStage(@get:JsonValue val value: String) {
        PORTAL_VIEWED("PORTAL_VIEWED"),
        SHARE_ACTION("SHARE_ACTION"),
        UNIQUE_REFERRAL_VISIT("UNIQUE_REFERRAL_VISIT"),
        LEAD("LEAD"),
        CREDITED_REFERRAL("CREDITED_REFERRAL"),
    }

    enum class ImprovementAreaKey(@get:JsonValue val value: String) {
        PORTAL_ACCESS("PORTAL_ACCESS"),
        SHARING_EXPERIENCE("SHARING_EXPERIENCE"),
        SHARE_EFFECTIVENESS("SHARE_EFFECTIVENESS"),
        VISITOR_SIGNUP("VISITOR_SIGNUP"),
        ATTRIBUTION_AND_QUALIFICATION("ATTRIBUTION_AND_QUALIFICATION"),
    }

    enum class AnchorField(@get:JsonValue val value: String) {
        ENROLLED_AS_ADVOCATE_AT("enrolledAsAdvocateAt"),
        APPROVED_AS_AFFILIATE_AT("approvedAsAffiliateAt"),
    }

    data class Stage
    @JsonCreator
    constructor(
        @JsonProperty("key") private val key: StageKey,
        @JsonProperty("count") private val count: Long,
        @JsonProperty("conversionRateFromPrior") private val conversionRateFromPrior: Double?,
        @JsonProperty("conversionRateFromEligible") private val conversionRateFromEligible: Double?,
        @JsonProperty("dropOffCount") private val dropOffCount: Long?,
        @JsonProperty("dropOffRate") private val dropOffRate: Double?,
        @JsonProperty("medianTimeToStageMs") private val medianTimeToStageMs: Double?,
        @JsonProperty("stalledSegmentKey") private val stalledSegmentKey: StalledSegmentKey?,
    ) {
        fun key(): StageKey = key

        fun count(): Long = count

        fun conversionRateFromPrior(): Optional<Double> =
            Optional.ofNullable(conversionRateFromPrior)

        fun conversionRateFromEligible(): Optional<Double> =
            Optional.ofNullable(conversionRateFromEligible)

        fun dropOffCount(): Optional<Long> = Optional.ofNullable(dropOffCount)

        fun dropOffRate(): Optional<Double> = Optional.ofNullable(dropOffRate)

        fun medianTimeToStageMs(): Optional<Double> = Optional.ofNullable(medianTimeToStageMs)

        fun stalledSegmentKey(): Optional<StalledSegmentKey> =
            Optional.ofNullable(stalledSegmentKey)

        fun validate(): Stage = this
    }

    data class StageCounts
    @JsonCreator
    constructor(
        @JsonProperty("ELIGIBLE") private val eligible: Long,
        @JsonProperty("PORTAL_VIEWED") private val portalViewed: Long,
        @JsonProperty("SHARE_ACTION") private val shareAction: Long,
        @JsonProperty("UNIQUE_REFERRAL_VISIT") private val uniqueReferralVisit: Long,
        @JsonProperty("LEAD") private val lead: Long,
        @JsonProperty("CREDITED_REFERRAL") private val creditedReferral: Long,
    ) {
        fun eligible(): Long = eligible

        fun portalViewed(): Long = portalViewed

        fun shareAction(): Long = shareAction

        fun uniqueReferralVisit(): Long = uniqueReferralVisit

        fun lead(): Long = lead

        fun creditedReferral(): Long = creditedReferral

        fun validate(): StageCounts = this
    }

    data class StalledSegment
    @JsonCreator
    constructor(
        @JsonProperty("key") private val key: StalledSegmentKey,
        @JsonProperty("fromStage") private val fromStage: StalledSegmentFromStage,
        @JsonProperty("toStage") private val toStage: StalledSegmentToStage,
        @JsonProperty("count") private val count: Long,
    ) {
        fun key(): StalledSegmentKey = key

        fun fromStage(): StalledSegmentFromStage = fromStage

        fun toStage(): StalledSegmentToStage = toStage

        fun count(): Long = count

        fun validate(): StalledSegment = this
    }

    data class OutcomeCount
    @JsonCreator
    constructor(@JsonProperty("count") private val count: Long) {
        fun count(): Long = count

        fun validate(): OutcomeCount = this
    }

    data class Outcomes
    @JsonCreator
    constructor(
        @JsonProperty("FIRST_REWARD") private val firstReward: OutcomeCount?,
        @JsonProperty("FIRST_COMMISSION") private val firstCommission: OutcomeCount?,
        @JsonProperty("PAYOUT_SETUP_COMPLETED") private val payoutSetupCompleted: OutcomeCount?,
    ) {
        fun firstReward(): Optional<OutcomeCount> = Optional.ofNullable(firstReward)

        fun firstCommission(): Optional<OutcomeCount> = Optional.ofNullable(firstCommission)

        fun payoutSetupCompleted(): Optional<OutcomeCount> =
            Optional.ofNullable(payoutSetupCompleted)

        fun validate(): Outcomes = apply {
            firstReward?.validate()
            firstCommission?.validate()
            payoutSetupCompleted?.validate()
        }
    }

    data class LargestDrop
    @JsonCreator
    constructor(
        @JsonProperty("fromStage") private val fromStage: String,
        @JsonProperty("toStage") private val toStage: String,
        @JsonProperty("count") private val count: Long,
        @JsonProperty("rate") private val rate: Double,
        @JsonProperty("stalledSegmentKey") private val stalledSegmentKey: String,
        @JsonProperty("improvementAreaKey") private val improvementAreaKey: ImprovementAreaKey,
        @JsonProperty("improvementArea") private val improvementArea: String,
    ) {
        fun fromStage(): String = fromStage

        fun toStage(): String = toStage

        fun count(): Long = count

        fun rate(): Double = rate

        fun stalledSegmentKey(): String = stalledSegmentKey

        fun improvementAreaKey(): ImprovementAreaKey = improvementAreaKey

        fun improvementArea(): String = improvementArea

        fun validate(): LargestDrop = this
    }

    data class CohortBounds
    @JsonCreator
    constructor(
        @JsonProperty("from") private val from: Long,
        @JsonProperty("to") private val to: Long,
        @JsonProperty("effectiveFrom") private val effectiveFrom: Long?,
        @JsonProperty("maturedAt") private val maturedAt: Long,
        @JsonProperty("asOf") private val asOf: Long,
        @JsonProperty("anchorField") private val anchorField: AnchorField,
    ) {
        fun from(): Long = from

        fun to(): Long = to

        fun effectiveFrom(): Optional<Long> = Optional.ofNullable(effectiveFrom)

        fun maturedAt(): Long = maturedAt

        fun asOf(): Long = asOf

        fun anchorField(): AnchorField = anchorField

        fun validate(): CohortBounds = this
    }

    data class CohortResult
    @JsonCreator
    constructor(
        @JsonProperty("state") private val state: AnalyticsAvailability,
        @JsonProperty("reason") private val reason: AnalyticsUnavailableReason?,
        @JsonProperty("cohort") private val cohort: CohortBounds,
        @JsonProperty("strictStages") private val strictStages: List<Stage>?,
        @JsonProperty("rawStageCounts") private val rawStageCounts: StageCounts?,
        @JsonProperty("stalledSegments") private val stalledSegments: List<StalledSegment>?,
        @JsonProperty("outcomes") private val outcomes: Outcomes?,
        @JsonProperty("largestDrop") private val largestDrop: LargestDrop?,
    ) {
        fun state(): AnalyticsAvailability = state

        fun reason(): Optional<AnalyticsUnavailableReason> = Optional.ofNullable(reason)

        fun cohort(): CohortBounds = cohort

        /** Empty means this cohort is unavailable, not that zero participants reached a stage. */
        fun strictStages(): Optional<List<Stage>> = Optional.ofNullable(strictStages)

        fun rawStageCounts(): Optional<StageCounts> = Optional.ofNullable(rawStageCounts)

        fun stalledSegments(): Optional<List<StalledSegment>> = Optional.ofNullable(stalledSegments)

        fun outcomes(): Optional<Outcomes> = Optional.ofNullable(outcomes)

        fun largestDrop(): Optional<LargestDrop> = Optional.ofNullable(largestDrop)

        fun validate(): CohortResult = apply {
            cohort.validate()
            strictStages?.forEach { it.validate() }
            rawStageCounts?.validate()
            stalledSegments?.forEach { it.validate() }
            outcomes?.validate()
            largestDrop?.validate()
        }
    }
}
