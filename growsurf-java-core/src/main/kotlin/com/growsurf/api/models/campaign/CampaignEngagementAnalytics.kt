// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import java.util.Optional

/** Opt-in participant engagement for one exact activity period. */
data class CampaignEngagementAnalytics
@JsonCreator
constructor(
    @JsonProperty("coverageStartAt") private val coverageStartAt: Long?,
    @JsonProperty("metricContractVersion") private val metricContractVersion: Long,
    @JsonProperty("programType") private val programType: ProgramType,
    @JsonProperty("timezone") private val timezone: String,
    @JsonProperty("interval") private val interval: Interval,
    @JsonProperty("platform") private val platform: PlatformFilter,
    @JsonProperty("period") private val period: Period,
    @JsonProperty("state") private val state: AnalyticsAvailability,
    @JsonProperty("reason") private val reason: AnalyticsUnavailableReason?,
    @JsonProperty("totals") private val totals: Totals,
    @JsonProperty("previousPeriod") private val previousPeriod: PreviousPeriod,
    @JsonProperty("comparison") private val comparison: Comparison,
    @JsonProperty("series") private val series: List<SeriesPoint>,
    @JsonProperty("breakdowns") private val breakdowns: Breakdowns,
) {
    /** Empty until complete engagement capture coverage begins. */
    fun coverageStartAt(): Optional<Long> = Optional.ofNullable(coverageStartAt)

    fun metricContractVersion(): Long = metricContractVersion

    fun programType(): ProgramType = programType

    fun timezone(): String = timezone

    fun interval(): Interval = interval

    fun platform(): PlatformFilter = platform

    fun period(): Period = period

    fun state(): AnalyticsAvailability = state

    fun reason(): Optional<AnalyticsUnavailableReason> = Optional.ofNullable(reason)

    fun totals(): Totals = totals

    fun previousPeriod(): PreviousPeriod = previousPeriod

    fun comparison(): Comparison = comparison

    fun series(): List<SeriesPoint> = series

    fun breakdowns(): Breakdowns = breakdowns

    fun validate(): CampaignEngagementAnalytics = apply {
        platform.validate()
        period.validate()
        totals.validate()
        previousPeriod.validate()
        comparison.validate()
        series.forEach { it.validate() }
        breakdowns.validate()
    }

    enum class ProgramType(@get:JsonValue val value: String) {
        REFERRAL("REFERRAL"),
        AFFILIATE("AFFILIATE"),
    }

    enum class Interval(@get:JsonValue val value: String) {
        DAY("day"),
        WEEK("week"),
        MONTH("month"),
    }

    enum class Platform(@get:JsonValue val value: String) {
        ALL("ALL"),
        WEB("WEB"),
        IOS("IOS"),
        ANDROID("ANDROID"),
    }

    enum class BreakdownPlatform(@get:JsonValue val value: String) {
        WEB("WEB"),
        IOS("IOS"),
        ANDROID("ANDROID"),
    }

    enum class PortalSource(@get:JsonValue val value: String) {
        DEFAULT_LAUNCHER("DEFAULT_LAUNCHER"),
        SDK_OPEN("SDK_OPEN"),
        CSS_CLASS("CSS_CLASS"),
        HOSTED_PORTAL("HOSTED_PORTAL"),
        NATIVE_WINDOW("NATIVE_WINDOW"),
        UNKNOWN("UNKNOWN"),
    }

    data class Metric
    @JsonCreator
    constructor(
        @JsonProperty("state") private val state: AnalyticsAvailability,
        @JsonProperty("value") private val value: Double?,
        @JsonProperty("reason") private val reason: AnalyticsUnavailableReason?,
        @JsonProperty("delta") private val delta: Double?,
    ) {
        fun state(): AnalyticsAvailability = state

        /** Empty means unavailable, not measured zero. Check [state] and [reason]. */
        fun value(): Optional<Double> = Optional.ofNullable(value)

        fun reason(): Optional<AnalyticsUnavailableReason> = Optional.ofNullable(reason)

        fun delta(): Optional<Double> = Optional.ofNullable(delta)

        fun validate(): Metric = this
    }

    data class Totals
    @JsonCreator
    constructor(
        @JsonProperty("activeParticipants") private val activeParticipants: Metric,
        @JsonProperty("sharingParticipants") private val sharingParticipants: Metric,
        @JsonProperty("sharingRate") private val sharingRate: Metric,
        @JsonProperty("repeatActiveParticipants") private val repeatActiveParticipants: Metric,
        @JsonProperty("repeatSharingParticipants") private val repeatSharingParticipants: Metric,
        @JsonProperty("retainedActiveParticipants") private val retainedActiveParticipants: Metric,
        @JsonProperty("portalViews") private val portalViews: Metric,
        @JsonProperty("shareActions") private val shareActions: Metric,
    ) {
        fun activeParticipants(): Metric = activeParticipants

        fun sharingParticipants(): Metric = sharingParticipants

        fun sharingRate(): Metric = sharingRate

        fun repeatActiveParticipants(): Metric = repeatActiveParticipants

        fun repeatSharingParticipants(): Metric = repeatSharingParticipants

        fun retainedActiveParticipants(): Metric = retainedActiveParticipants

        fun portalViews(): Metric = portalViews

        fun shareActions(): Metric = shareActions

        fun validate(): Totals = apply {
            activeParticipants.validate()
            sharingParticipants.validate()
            sharingRate.validate()
            repeatActiveParticipants.validate()
            repeatSharingParticipants.validate()
            retainedActiveParticipants.validate()
            portalViews.validate()
            shareActions.validate()
        }
    }

    data class Period
    @JsonCreator
    constructor(
        @JsonProperty("from") private val from: Long,
        @JsonProperty("to") private val to: Long,
        @JsonProperty("effectiveFrom") private val effectiveFrom: Long?,
        @JsonProperty("previousFrom") private val previousFrom: Long,
        @JsonProperty("previousTo") private val previousTo: Long,
    ) {
        fun from(): Long = from

        fun to(): Long = to

        fun effectiveFrom(): Optional<Long> = Optional.ofNullable(effectiveFrom)

        fun previousFrom(): Long = previousFrom

        fun previousTo(): Long = previousTo

        fun validate(): Period = this
    }

    data class PlatformFilter
    @JsonCreator
    constructor(
        @JsonProperty("requested") private val requested: Platform,
        @JsonProperty("applied") private val applied: Platform,
        @JsonProperty("state") private val state: AnalyticsAvailability,
    ) {
        fun requested(): Platform = requested

        fun applied(): Platform = applied

        fun state(): AnalyticsAvailability = state

        fun validate(): PlatformFilter = this
    }

    data class PreviousPeriod
    @JsonCreator
    constructor(
        @JsonProperty("state") private val state: AnalyticsAvailability,
        @JsonProperty("reason") private val reason: AnalyticsUnavailableReason?,
        @JsonProperty("totals") private val totals: Totals?,
    ) {
        fun state(): AnalyticsAvailability = state

        fun reason(): Optional<AnalyticsUnavailableReason> = Optional.ofNullable(reason)

        fun totals(): Optional<Totals> = Optional.ofNullable(totals)

        fun validate(): PreviousPeriod = apply { totals?.validate() }
    }

    data class ComparisonMetrics
    @JsonCreator
    constructor(
        @JsonProperty("activeParticipants") private val activeParticipants: Metric?,
        @JsonProperty("sharingParticipants") private val sharingParticipants: Metric?,
        @JsonProperty("repeatActiveParticipants") private val repeatActiveParticipants: Metric?,
        @JsonProperty("repeatSharingParticipants") private val repeatSharingParticipants: Metric?,
        @JsonProperty("portalViews") private val portalViews: Metric?,
        @JsonProperty("shareActions") private val shareActions: Metric?,
    ) {
        fun activeParticipants(): Optional<Metric> = Optional.ofNullable(activeParticipants)

        fun sharingParticipants(): Optional<Metric> = Optional.ofNullable(sharingParticipants)

        fun repeatActiveParticipants(): Optional<Metric> =
            Optional.ofNullable(repeatActiveParticipants)

        fun repeatSharingParticipants(): Optional<Metric> =
            Optional.ofNullable(repeatSharingParticipants)

        fun portalViews(): Optional<Metric> = Optional.ofNullable(portalViews)

        fun shareActions(): Optional<Metric> = Optional.ofNullable(shareActions)

        fun validate(): ComparisonMetrics = apply {
            activeParticipants?.validate()
            sharingParticipants?.validate()
            repeatActiveParticipants?.validate()
            repeatSharingParticipants?.validate()
            portalViews?.validate()
            shareActions?.validate()
        }
    }

    data class Comparison
    @JsonCreator
    constructor(
        @JsonProperty("state") private val state: AnalyticsAvailability,
        @JsonProperty("reason") private val reason: AnalyticsUnavailableReason?,
        @JsonProperty("metrics") private val metrics: ComparisonMetrics?,
    ) {
        fun state(): AnalyticsAvailability = state

        fun reason(): Optional<AnalyticsUnavailableReason> = Optional.ofNullable(reason)

        fun metrics(): Optional<ComparisonMetrics> = Optional.ofNullable(metrics)

        fun validate(): Comparison = apply { metrics?.validate() }
    }

    data class SeriesPoint
    @JsonCreator
    constructor(
        @JsonProperty("from") private val from: Long,
        @JsonProperty("to") private val to: Long,
        @JsonProperty("activeParticipants") private val activeParticipants: Long,
        @JsonProperty("sharingParticipants") private val sharingParticipants: Long,
        @JsonProperty("portalViews") private val portalViews: Long,
        @JsonProperty("shareActions") private val shareActions: Long,
    ) {
        fun from(): Long = from

        fun to(): Long = to

        fun activeParticipants(): Long = activeParticipants

        fun sharingParticipants(): Long = sharingParticipants

        fun portalViews(): Long = portalViews

        fun shareActions(): Long = shareActions

        fun validate(): SeriesPoint = this
    }

    data class PlatformBreakdown
    @JsonCreator
    constructor(
        @JsonProperty("key") private val key: BreakdownPlatform,
        @JsonProperty("activeParticipants") private val activeParticipants: Long,
        @JsonProperty("sharingParticipants") private val sharingParticipants: Long,
        @JsonProperty("portalViews") private val portalViews: Long,
        @JsonProperty("shareActions") private val shareActions: Long,
    ) {
        fun key(): BreakdownPlatform = key

        fun activeParticipants(): Long = activeParticipants

        fun sharingParticipants(): Long = sharingParticipants

        fun portalViews(): Long = portalViews

        fun shareActions(): Long = shareActions

        fun validate(): PlatformBreakdown = this
    }

    data class PortalSourceBreakdown
    @JsonCreator
    constructor(
        @JsonProperty("key") private val key: PortalSource,
        @JsonProperty("activeParticipants") private val activeParticipants: Long,
        @JsonProperty("portalViews") private val portalViews: Long,
    ) {
        fun key(): PortalSource = key

        fun activeParticipants(): Long = activeParticipants

        fun portalViews(): Long = portalViews

        fun validate(): PortalSourceBreakdown = this
    }

    data class ShareChannelBreakdown
    @JsonCreator
    constructor(
        @JsonProperty("key") private val key: String,
        @JsonProperty("sharingParticipants") private val sharingParticipants: Long,
        @JsonProperty("shareActions") private val shareActions: Long,
    ) {
        fun key(): String = key

        fun sharingParticipants(): Long = sharingParticipants

        fun shareActions(): Long = shareActions

        fun validate(): ShareChannelBreakdown = this
    }

    data class FirstShareChannelBreakdown
    @JsonCreator
    constructor(
        @JsonProperty("key") private val key: String,
        @JsonProperty("sharingParticipants") private val sharingParticipants: Long,
    ) {
        fun key(): String = key

        fun sharingParticipants(): Long = sharingParticipants

        fun validate(): FirstShareChannelBreakdown = this
    }

    data class Breakdowns
    @JsonCreator
    constructor(
        @JsonProperty("platforms") private val platforms: List<PlatformBreakdown>,
        @JsonProperty("portalViewSources")
        private val portalViewSources: List<PortalSourceBreakdown>,
        @JsonProperty("shareChannels") private val shareChannels: List<ShareChannelBreakdown>,
        @JsonProperty("firstShareChannels")
        private val firstShareChannels: List<FirstShareChannelBreakdown>,
    ) {
        fun platforms(): List<PlatformBreakdown> = platforms

        fun portalViewSources(): List<PortalSourceBreakdown> = portalViewSources

        fun shareChannels(): List<ShareChannelBreakdown> = shareChannels

        fun firstShareChannels(): List<FirstShareChannelBreakdown> = firstShareChannels

        fun validate(): Breakdowns = apply {
            platforms.forEach { it.validate() }
            portalViewSources.forEach { it.validate() }
            shareChannels.forEach { it.validate() }
            firstShareChannels.forEach { it.validate() }
        }
    }
}
