// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.fasterxml.jackson.annotation.JsonCreator
import com.growsurf.api.core.Enum
import com.growsurf.api.core.JsonField
import com.growsurf.api.core.Params
import com.growsurf.api.core.http.Headers
import com.growsurf.api.core.http.QueryParams
import com.growsurf.api.errors.GrowsurfInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieves analytics for a program. */
class CampaignRetrieveAnalyticsParams
private constructor(
    private val id: String?,
    private val days: Long?,
    private val endDate: Long?,
    private val include: String?,
    private val interval: Interval?,
    private val startDate: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /** Last number of days to retrieve analytics for. Defaults to 365. Maximum 1825. */
    fun days(): Optional<Long> = Optional.ofNullable(days)

    /**
     * End date of the analytics timeframe as a Unix timestamp in milliseconds. Required if `days`
     * is not set.
     */
    fun endDate(): Optional<Long> = Optional.ofNullable(endDate)

    /**
     * Comma-separated list of optional enrichments (opt-in to keep the default response lean):
     * `previousPeriod` adds totals for the equal-length window immediately before the requested one;
     * `statusCounts` adds reward (and, for affiliate programs, affiliate/commission/payout) status
     * breakdowns; `rates` adds derived referral rates.
     */
    fun include(): Optional<String> = Optional.ofNullable(include)

    /**
     * When set to `day`, `week`, or `month`, the response also includes a `series` array with
     * per-period totals. Defaults to `total` (no series).
     */
    fun interval(): Optional<Interval> = Optional.ofNullable(interval)

    /**
     * Start date of the analytics timeframe as a Unix timestamp in milliseconds. Required if `days`
     * is not set.
     */
    fun startDate(): Optional<Long> = Optional.ofNullable(startDate)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CampaignRetrieveAnalyticsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [CampaignRetrieveAnalyticsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CampaignRetrieveAnalyticsParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var days: Long? = null
        private var endDate: Long? = null
        private var include: String? = null
        private var interval: Interval? = null
        private var startDate: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(campaignRetrieveAnalyticsParams: CampaignRetrieveAnalyticsParams) =
            apply {
                id = campaignRetrieveAnalyticsParams.id
                days = campaignRetrieveAnalyticsParams.days
                endDate = campaignRetrieveAnalyticsParams.endDate
                include = campaignRetrieveAnalyticsParams.include
                interval = campaignRetrieveAnalyticsParams.interval
                startDate = campaignRetrieveAnalyticsParams.startDate
                additionalHeaders = campaignRetrieveAnalyticsParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    campaignRetrieveAnalyticsParams.additionalQueryParams.toBuilder()
            }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /** Last number of days to retrieve analytics for. Defaults to 365. Maximum 1825. */
        fun days(days: Long?) = apply { this.days = days }

        /**
         * Alias for [Builder.days].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun days(days: Long) = days(days as Long?)

        /** Alias for calling [Builder.days] with `days.orElse(null)`. */
        fun days(days: Optional<Long>) = days(days.getOrNull())

        /**
         * End date of the analytics timeframe as a Unix timestamp in milliseconds. Required if
         * `days` is not set.
         */
        fun endDate(endDate: Long?) = apply { this.endDate = endDate }

        /**
         * Alias for [Builder.endDate].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun endDate(endDate: Long) = endDate(endDate as Long?)

        /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
        fun endDate(endDate: Optional<Long>) = endDate(endDate.getOrNull())

        /**
         * Comma-separated list of optional enrichments (opt-in to keep the default response lean):
         * `previousPeriod` adds totals for the equal-length window immediately before the requested
         * one; `statusCounts` adds reward (and, for affiliate programs, affiliate/commission/payout)
         * status breakdowns; `rates` adds derived referral rates.
         */
        fun include(include: String?) = apply { this.include = include }

        /** Alias for calling [Builder.include] with `include.orElse(null)`. */
        fun include(include: Optional<String>) = include(include.getOrNull())

        /**
         * When set to `day`, `week`, or `month`, the response also includes a `series` array with
         * per-period totals. Defaults to `total` (no series).
         */
        fun interval(interval: Interval?) = apply { this.interval = interval }

        /** Alias for calling [Builder.interval] with `interval.orElse(null)`. */
        fun interval(interval: Optional<Interval>) = interval(interval.getOrNull())

        /**
         * Start date of the analytics timeframe as a Unix timestamp in milliseconds. Required if
         * `days` is not set.
         */
        fun startDate(startDate: Long?) = apply { this.startDate = startDate }

        /**
         * Alias for [Builder.startDate].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun startDate(startDate: Long) = startDate(startDate as Long?)

        /** Alias for calling [Builder.startDate] with `startDate.orElse(null)`. */
        fun startDate(startDate: Optional<Long>) = startDate(startDate.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [CampaignRetrieveAnalyticsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CampaignRetrieveAnalyticsParams =
            CampaignRetrieveAnalyticsParams(
                id,
                days,
                endDate,
                include,
                interval,
                startDate,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                days?.let { put("days", it.toString()) }
                endDate?.let { put("endDate", it.toString()) }
                include?.let { put("include", it) }
                interval?.let { put("interval", it.toString()) }
                startDate?.let { put("startDate", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * When set to `day`, `week`, or `month`, the response also includes a `series` array with
     * per-period totals. Defaults to `total` (no series).
     */
    class Interval @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't match
         * any known member, and you want to know that value. For example, if the SDK is on an older
         * version than the API, then the API may respond with new members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val DAY = of("day")

            @JvmField val WEEK = of("week")

            @JvmField val MONTH = of("month")

            @JvmField val TOTAL = of("total")

            @JvmStatic fun of(value: String) = Interval(JsonField.of(value))
        }

        /** An enum containing [Interval]'s known values. */
        enum class Known {
            DAY,
            WEEK,
            MONTH,
            TOTAL,
        }

        /**
         * An enum containing [Interval]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Interval] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DAY,
            WEEK,
            MONTH,
            TOTAL,
            /** An enum member indicating that [Interval] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                DAY -> Value.DAY
                WEEK -> Value.WEEK
                MONTH -> Value.MONTH
                TOTAL -> Value.TOTAL
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws GrowsurfInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                DAY -> Known.DAY
                WEEK -> Known.WEEK
                MONTH -> Known.MONTH
                TOTAL -> Known.TOTAL
                else -> throw GrowsurfInvalidDataException("Unknown Interval: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws GrowsurfInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { GrowsurfInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Interval = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: GrowsurfInvalidDataException) {
                false
            }

        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Interval && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CampaignRetrieveAnalyticsParams &&
            id == other.id &&
            days == other.days &&
            endDate == other.endDate &&
            include == other.include &&
            interval == other.interval &&
            startDate == other.startDate &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            days,
            endDate,
            include,
            interval,
            startDate,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CampaignRetrieveAnalyticsParams{id=$id, days=$days, endDate=$endDate, include=$include, interval=$interval, startDate=$startDate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
