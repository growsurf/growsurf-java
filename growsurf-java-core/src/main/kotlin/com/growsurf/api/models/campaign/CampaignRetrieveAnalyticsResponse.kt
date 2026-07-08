// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.growsurf.api.core.ExcludeMissing
import com.growsurf.api.core.JsonField
import com.growsurf.api.core.JsonMissing
import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.checkKnown
import com.growsurf.api.core.checkRequired
import com.growsurf.api.core.toImmutable
import com.growsurf.api.errors.GrowsurfInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CampaignRetrieveAnalyticsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val analytics: JsonField<Analytics>,
    private val endDate: JsonField<Long>,
    private val previousPeriod: JsonField<PreviousPeriod>,
    private val rates: JsonField<Rates>,
    private val series: JsonField<List<Series>>,
    private val startDate: JsonField<Long>,
    private val statusCounts: JsonField<StatusCounts>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("analytics")
        @ExcludeMissing
        analytics: JsonField<Analytics> = JsonMissing.of(),
        @JsonProperty("endDate") @ExcludeMissing endDate: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("previousPeriod")
        @ExcludeMissing
        previousPeriod: JsonField<PreviousPeriod> = JsonMissing.of(),
        @JsonProperty("rates") @ExcludeMissing rates: JsonField<Rates> = JsonMissing.of(),
        @JsonProperty("series")
        @ExcludeMissing
        series: JsonField<List<Series>> = JsonMissing.of(),
        @JsonProperty("startDate") @ExcludeMissing startDate: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("statusCounts")
        @ExcludeMissing
        statusCounts: JsonField<StatusCounts> = JsonMissing.of(),
    ) : this(
        analytics,
        endDate,
        previousPeriod,
        rates,
        series,
        startDate,
        statusCounts,
        mutableMapOf(),
    )

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun analytics(): Analytics = analytics.getRequired("analytics")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endDate(): Long = endDate.getRequired("endDate")

    /**
     * Present only when `include` contains `previousPeriod`.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun previousPeriod(): Optional<PreviousPeriod> = previousPeriod.getOptional("previousPeriod")

    /**
     * Present only when `include` contains `rates`.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rates(): Optional<Rates> = rates.getOptional("rates")

    /**
     * Present only when `interval` is `day`, `week`, or `month`. Per-period totals, ascending.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun series(): Optional<List<Series>> = series.getOptional("series")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startDate(): Long = startDate.getRequired("startDate")

    /**
     * Present only when `include` contains `statusCounts`.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusCounts(): Optional<StatusCounts> = statusCounts.getOptional("statusCounts")

    /**
     * Returns the raw JSON value of [analytics].
     *
     * Unlike [analytics], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("analytics") @ExcludeMissing fun _analytics(): JsonField<Analytics> = analytics

    /**
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endDate") @ExcludeMissing fun _endDate(): JsonField<Long> = endDate

    /**
     * Returns the raw JSON value of [previousPeriod].
     *
     * Unlike [previousPeriod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("previousPeriod")
    @ExcludeMissing
    fun _previousPeriod(): JsonField<PreviousPeriod> = previousPeriod

    /**
     * Returns the raw JSON value of [rates].
     *
     * Unlike [rates], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rates") @ExcludeMissing fun _rates(): JsonField<Rates> = rates

    /**
     * Returns the raw JSON value of [series].
     *
     * Unlike [series], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("series") @ExcludeMissing fun _series(): JsonField<List<Series>> = series

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startDate") @ExcludeMissing fun _startDate(): JsonField<Long> = startDate

    /**
     * Returns the raw JSON value of [statusCounts].
     *
     * Unlike [statusCounts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("statusCounts")
    @ExcludeMissing
    fun _statusCounts(): JsonField<StatusCounts> = statusCounts

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CampaignRetrieveAnalyticsResponse].
         *
         * The following fields are required:
         * ```java
         * .analytics()
         * .endDate()
         * .startDate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CampaignRetrieveAnalyticsResponse]. */
    class Builder internal constructor() {

        private var analytics: JsonField<Analytics>? = null
        private var endDate: JsonField<Long>? = null
        private var previousPeriod: JsonField<PreviousPeriod> = JsonMissing.of()
        private var rates: JsonField<Rates> = JsonMissing.of()
        private var series: JsonField<MutableList<Series>>? = null
        private var startDate: JsonField<Long>? = null
        private var statusCounts: JsonField<StatusCounts> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(campaignRetrieveAnalyticsResponse: CampaignRetrieveAnalyticsResponse) =
            apply {
                analytics = campaignRetrieveAnalyticsResponse.analytics
                endDate = campaignRetrieveAnalyticsResponse.endDate
                previousPeriod = campaignRetrieveAnalyticsResponse.previousPeriod
                rates = campaignRetrieveAnalyticsResponse.rates
                series = campaignRetrieveAnalyticsResponse.series.map { it.toMutableList() }
                startDate = campaignRetrieveAnalyticsResponse.startDate
                statusCounts = campaignRetrieveAnalyticsResponse.statusCounts
                additionalProperties =
                    campaignRetrieveAnalyticsResponse.additionalProperties.toMutableMap()
            }

        fun analytics(analytics: Analytics) = analytics(JsonField.of(analytics))

        /**
         * Sets [Builder.analytics] to an arbitrary JSON value.
         *
         * You should usually call [Builder.analytics] with a well-typed [Analytics] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun analytics(analytics: JsonField<Analytics>) = apply { this.analytics = analytics }

        fun endDate(endDate: Long) = endDate(JsonField.of(endDate))

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun endDate(endDate: JsonField<Long>) = apply { this.endDate = endDate }

        /** Present only when `include` contains `previousPeriod`. */
        fun previousPeriod(previousPeriod: PreviousPeriod) =
            previousPeriod(JsonField.of(previousPeriod))

        /**
         * Sets [Builder.previousPeriod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previousPeriod] with a well-typed [PreviousPeriod] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun previousPeriod(previousPeriod: JsonField<PreviousPeriod>) = apply {
            this.previousPeriod = previousPeriod
        }

        /** Present only when `include` contains `rates`. */
        fun rates(rates: Rates) = rates(JsonField.of(rates))

        /**
         * Sets [Builder.rates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rates] with a well-typed [Rates] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rates(rates: JsonField<Rates>) = apply { this.rates = rates }

        /**
         * Present only when `interval` is `day`, `week`, or `month`. Per-period totals, ascending.
         */
        fun series(series: List<Series>) = series(JsonField.of(series))

        /**
         * Sets [Builder.series] to an arbitrary JSON value.
         *
         * You should usually call [Builder.series] with a well-typed `List<Series>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun series(series: JsonField<List<Series>>) = apply {
            this.series = series.map { it.toMutableList() }
        }

        /**
         * Adds a single [Series] to [series].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSeries(series: Series) = apply {
            this.series =
                (this.series ?: JsonField.of(mutableListOf())).also {
                    checkKnown("series", it).add(series)
                }
        }

        fun startDate(startDate: Long) = startDate(JsonField.of(startDate))

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun startDate(startDate: JsonField<Long>) = apply { this.startDate = startDate }

        /** Present only when `include` contains `statusCounts`. */
        fun statusCounts(statusCounts: StatusCounts) = statusCounts(JsonField.of(statusCounts))

        /**
         * Sets [Builder.statusCounts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusCounts] with a well-typed [StatusCounts] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statusCounts(statusCounts: JsonField<StatusCounts>) = apply {
            this.statusCounts = statusCounts
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
         * Returns an immutable instance of [CampaignRetrieveAnalyticsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .analytics()
         * .endDate()
         * .startDate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CampaignRetrieveAnalyticsResponse =
            CampaignRetrieveAnalyticsResponse(
                checkRequired("analytics", analytics),
                checkRequired("endDate", endDate),
                previousPeriod,
                rates,
                (series ?: JsonMissing.of()).map { it.toImmutable() },
                checkRequired("startDate", startDate),
                statusCounts,
                additionalProperties.toMutableMap(),
            )
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
    fun validate(): CampaignRetrieveAnalyticsResponse = apply {
        if (validated) {
            return@apply
        }

        analytics().validate()
        endDate()
        previousPeriod().ifPresent { it.validate() }
        rates().ifPresent { it.validate() }
        series().ifPresent { it.forEach { it.validate() } }
        startDate()
        statusCounts().ifPresent { it.validate() }
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
        (analytics.asKnown().getOrNull()?.validity() ?: 0) +
            (if (endDate.asKnown().isPresent) 1 else 0) +
            (previousPeriod.asKnown().getOrNull()?.validity() ?: 0) +
            (rates.asKnown().getOrNull()?.validity() ?: 0) +
            (series.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (startDate.asKnown().isPresent) 1 else 0) +
            (statusCounts.asKnown().getOrNull()?.validity() ?: 0)

    class Analytics
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val androidNativeShares: JsonField<Long>,
        private val blueskyShares: JsonField<Long>,
        private val copyRefLinkShares: JsonField<Long>,
        private val emailShares: JsonField<Long>,
        private val facebookShares: JsonField<Long>,
        private val impressions: JsonField<Long>,
        private val invites: JsonField<Long>,
        private val iosNativeShares: JsonField<Long>,
        private val linkedInShares: JsonField<Long>,
        private val messengerShares: JsonField<Long>,
        private val participants: JsonField<Long>,
        private val pinterestShares: JsonField<Long>,
        private val qrcodeShares: JsonField<Long>,
        private val redditShares: JsonField<Long>,
        private val referralCreditExpireds: JsonField<Long>,
        private val referralCreditPendings: JsonField<Long>,
        private val referrals: JsonField<Long>,
        private val smsShares: JsonField<Long>,
        private val telegramShares: JsonField<Long>,
        private val threadsShares: JsonField<Long>,
        private val totalCommissionCount: JsonField<Long>,
        private val totalCommissions: JsonField<Long>,
        private val totalRevenue: JsonField<Long>,
        private val tumblrShares: JsonField<Long>,
        private val twitterShares: JsonField<Long>,
        private val uniqueImpressions: JsonField<Long>,
        private val wechatShares: JsonField<Long>,
        private val whatsAppShares: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("androidNativeShares")
            @ExcludeMissing
            androidNativeShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("blueskyShares")
            @ExcludeMissing
            blueskyShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("copyRefLinkShares")
            @ExcludeMissing
            copyRefLinkShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("emailShares")
            @ExcludeMissing
            emailShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("facebookShares")
            @ExcludeMissing
            facebookShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("impressions")
            @ExcludeMissing
            impressions: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("invites") @ExcludeMissing invites: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("iosNativeShares")
            @ExcludeMissing
            iosNativeShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("linkedInShares")
            @ExcludeMissing
            linkedInShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("messengerShares")
            @ExcludeMissing
            messengerShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("participants")
            @ExcludeMissing
            participants: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("pinterestShares")
            @ExcludeMissing
            pinterestShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("qrcodeShares")
            @ExcludeMissing
            qrcodeShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("redditShares")
            @ExcludeMissing
            redditShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("referralCreditExpireds")
            @ExcludeMissing
            referralCreditExpireds: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("referralCreditPendings")
            @ExcludeMissing
            referralCreditPendings: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("referrals")
            @ExcludeMissing
            referrals: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("smsShares")
            @ExcludeMissing
            smsShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("telegramShares")
            @ExcludeMissing
            telegramShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("threadsShares")
            @ExcludeMissing
            threadsShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("totalCommissionCount")
            @ExcludeMissing
            totalCommissionCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("totalCommissions")
            @ExcludeMissing
            totalCommissions: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("totalRevenue")
            @ExcludeMissing
            totalRevenue: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("tumblrShares")
            @ExcludeMissing
            tumblrShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("twitterShares")
            @ExcludeMissing
            twitterShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("uniqueImpressions")
            @ExcludeMissing
            uniqueImpressions: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("wechatShares")
            @ExcludeMissing
            wechatShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("whatsAppShares")
            @ExcludeMissing
            whatsAppShares: JsonField<Long> = JsonMissing.of(),
        ) : this(
            androidNativeShares,
            blueskyShares,
            copyRefLinkShares,
            emailShares,
            facebookShares,
            impressions,
            invites,
            iosNativeShares,
            linkedInShares,
            messengerShares,
            participants,
            pinterestShares,
            qrcodeShares,
            redditShares,
            referralCreditExpireds,
            referralCreditPendings,
            referrals,
            smsShares,
            telegramShares,
            threadsShares,
            totalCommissionCount,
            totalCommissions,
            totalRevenue,
            tumblrShares,
            twitterShares,
            uniqueImpressions,
            wechatShares,
            whatsAppShares,
            mutableMapOf(),
        )

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun androidNativeShares(): Optional<Long> =
            androidNativeShares.getOptional("androidNativeShares")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun blueskyShares(): Optional<Long> = blueskyShares.getOptional("blueskyShares")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun copyRefLinkShares(): Optional<Long> = copyRefLinkShares.getOptional("copyRefLinkShares")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun emailShares(): Optional<Long> = emailShares.getOptional("emailShares")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun facebookShares(): Optional<Long> = facebookShares.getOptional("facebookShares")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun impressions(): Optional<Long> = impressions.getOptional("impressions")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun invites(): Optional<Long> = invites.getOptional("invites")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun iosNativeShares(): Optional<Long> = iosNativeShares.getOptional("iosNativeShares")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun linkedInShares(): Optional<Long> = linkedInShares.getOptional("linkedInShares")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun messengerShares(): Optional<Long> = messengerShares.getOptional("messengerShares")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun participants(): Optional<Long> = participants.getOptional("participants")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pinterestShares(): Optional<Long> = pinterestShares.getOptional("pinterestShares")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun qrcodeShares(): Optional<Long> = qrcodeShares.getOptional("qrcodeShares")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun redditShares(): Optional<Long> = redditShares.getOptional("redditShares")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun referralCreditExpireds(): Optional<Long> =
            referralCreditExpireds.getOptional("referralCreditExpireds")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun referralCreditPendings(): Optional<Long> =
            referralCreditPendings.getOptional("referralCreditPendings")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun referrals(): Optional<Long> = referrals.getOptional("referrals")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun smsShares(): Optional<Long> = smsShares.getOptional("smsShares")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun telegramShares(): Optional<Long> = telegramShares.getOptional("telegramShares")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun threadsShares(): Optional<Long> = threadsShares.getOptional("threadsShares")

        /**
         * Affiliate programs only. Number of commission records.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun totalCommissionCount(): Optional<Long> =
            totalCommissionCount.getOptional("totalCommissionCount")

        /**
         * Affiliate programs only. Commissions in the smallest unit of the program currency.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun totalCommissions(): Optional<Long> = totalCommissions.getOptional("totalCommissions")

        /**
         * Affiliate programs only. Revenue in the smallest unit of the program currency.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun totalRevenue(): Optional<Long> = totalRevenue.getOptional("totalRevenue")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tumblrShares(): Optional<Long> = tumblrShares.getOptional("tumblrShares")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun twitterShares(): Optional<Long> = twitterShares.getOptional("twitterShares")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun uniqueImpressions(): Optional<Long> = uniqueImpressions.getOptional("uniqueImpressions")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun wechatShares(): Optional<Long> = wechatShares.getOptional("wechatShares")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun whatsAppShares(): Optional<Long> = whatsAppShares.getOptional("whatsAppShares")

        /**
         * Returns the raw JSON value of [androidNativeShares].
         *
         * Unlike [androidNativeShares], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("androidNativeShares")
        @ExcludeMissing
        fun _androidNativeShares(): JsonField<Long> = androidNativeShares

        /**
         * Returns the raw JSON value of [blueskyShares].
         *
         * Unlike [blueskyShares], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("blueskyShares")
        @ExcludeMissing
        fun _blueskyShares(): JsonField<Long> = blueskyShares

        /**
         * Returns the raw JSON value of [copyRefLinkShares].
         *
         * Unlike [copyRefLinkShares], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("copyRefLinkShares")
        @ExcludeMissing
        fun _copyRefLinkShares(): JsonField<Long> = copyRefLinkShares

        /**
         * Returns the raw JSON value of [emailShares].
         *
         * Unlike [emailShares], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("emailShares")
        @ExcludeMissing
        fun _emailShares(): JsonField<Long> = emailShares

        /**
         * Returns the raw JSON value of [facebookShares].
         *
         * Unlike [facebookShares], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("facebookShares")
        @ExcludeMissing
        fun _facebookShares(): JsonField<Long> = facebookShares

        /**
         * Returns the raw JSON value of [impressions].
         *
         * Unlike [impressions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("impressions")
        @ExcludeMissing
        fun _impressions(): JsonField<Long> = impressions

        /**
         * Returns the raw JSON value of [invites].
         *
         * Unlike [invites], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("invites") @ExcludeMissing fun _invites(): JsonField<Long> = invites

        /**
         * Returns the raw JSON value of [iosNativeShares].
         *
         * Unlike [iosNativeShares], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("iosNativeShares")
        @ExcludeMissing
        fun _iosNativeShares(): JsonField<Long> = iosNativeShares

        /**
         * Returns the raw JSON value of [linkedInShares].
         *
         * Unlike [linkedInShares], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("linkedInShares")
        @ExcludeMissing
        fun _linkedInShares(): JsonField<Long> = linkedInShares

        /**
         * Returns the raw JSON value of [messengerShares].
         *
         * Unlike [messengerShares], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("messengerShares")
        @ExcludeMissing
        fun _messengerShares(): JsonField<Long> = messengerShares

        /**
         * Returns the raw JSON value of [participants].
         *
         * Unlike [participants], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("participants")
        @ExcludeMissing
        fun _participants(): JsonField<Long> = participants

        /**
         * Returns the raw JSON value of [pinterestShares].
         *
         * Unlike [pinterestShares], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pinterestShares")
        @ExcludeMissing
        fun _pinterestShares(): JsonField<Long> = pinterestShares

        /**
         * Returns the raw JSON value of [qrcodeShares].
         *
         * Unlike [qrcodeShares], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("qrcodeShares")
        @ExcludeMissing
        fun _qrcodeShares(): JsonField<Long> = qrcodeShares

        /**
         * Returns the raw JSON value of [redditShares].
         *
         * Unlike [redditShares], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("redditShares")
        @ExcludeMissing
        fun _redditShares(): JsonField<Long> = redditShares

        /**
         * Returns the raw JSON value of [referralCreditExpireds].
         *
         * Unlike [referralCreditExpireds], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("referralCreditExpireds")
        @ExcludeMissing
        fun _referralCreditExpireds(): JsonField<Long> = referralCreditExpireds

        /**
         * Returns the raw JSON value of [referralCreditPendings].
         *
         * Unlike [referralCreditPendings], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("referralCreditPendings")
        @ExcludeMissing
        fun _referralCreditPendings(): JsonField<Long> = referralCreditPendings

        /**
         * Returns the raw JSON value of [referrals].
         *
         * Unlike [referrals], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("referrals") @ExcludeMissing fun _referrals(): JsonField<Long> = referrals

        /**
         * Returns the raw JSON value of [smsShares].
         *
         * Unlike [smsShares], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("smsShares") @ExcludeMissing fun _smsShares(): JsonField<Long> = smsShares

        /**
         * Returns the raw JSON value of [telegramShares].
         *
         * Unlike [telegramShares], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("telegramShares")
        @ExcludeMissing
        fun _telegramShares(): JsonField<Long> = telegramShares

        /**
         * Returns the raw JSON value of [threadsShares].
         *
         * Unlike [threadsShares], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("threadsShares")
        @ExcludeMissing
        fun _threadsShares(): JsonField<Long> = threadsShares

        /**
         * Returns the raw JSON value of [totalCommissionCount].
         *
         * Unlike [totalCommissionCount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("totalCommissionCount")
        @ExcludeMissing
        fun _totalCommissionCount(): JsonField<Long> = totalCommissionCount

        /**
         * Returns the raw JSON value of [totalCommissions].
         *
         * Unlike [totalCommissions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("totalCommissions")
        @ExcludeMissing
        fun _totalCommissions(): JsonField<Long> = totalCommissions

        /**
         * Returns the raw JSON value of [totalRevenue].
         *
         * Unlike [totalRevenue], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("totalRevenue")
        @ExcludeMissing
        fun _totalRevenue(): JsonField<Long> = totalRevenue

        /**
         * Returns the raw JSON value of [tumblrShares].
         *
         * Unlike [tumblrShares], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tumblrShares")
        @ExcludeMissing
        fun _tumblrShares(): JsonField<Long> = tumblrShares

        /**
         * Returns the raw JSON value of [twitterShares].
         *
         * Unlike [twitterShares], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("twitterShares")
        @ExcludeMissing
        fun _twitterShares(): JsonField<Long> = twitterShares

        /**
         * Returns the raw JSON value of [uniqueImpressions].
         *
         * Unlike [uniqueImpressions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("uniqueImpressions")
        @ExcludeMissing
        fun _uniqueImpressions(): JsonField<Long> = uniqueImpressions

        /**
         * Returns the raw JSON value of [wechatShares].
         *
         * Unlike [wechatShares], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("wechatShares")
        @ExcludeMissing
        fun _wechatShares(): JsonField<Long> = wechatShares

        /**
         * Returns the raw JSON value of [whatsAppShares].
         *
         * Unlike [whatsAppShares], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("whatsAppShares")
        @ExcludeMissing
        fun _whatsAppShares(): JsonField<Long> = whatsAppShares

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Analytics]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Analytics]. */
        class Builder internal constructor() {

            private var androidNativeShares: JsonField<Long> = JsonMissing.of()
            private var blueskyShares: JsonField<Long> = JsonMissing.of()
            private var copyRefLinkShares: JsonField<Long> = JsonMissing.of()
            private var emailShares: JsonField<Long> = JsonMissing.of()
            private var facebookShares: JsonField<Long> = JsonMissing.of()
            private var impressions: JsonField<Long> = JsonMissing.of()
            private var invites: JsonField<Long> = JsonMissing.of()
            private var iosNativeShares: JsonField<Long> = JsonMissing.of()
            private var linkedInShares: JsonField<Long> = JsonMissing.of()
            private var messengerShares: JsonField<Long> = JsonMissing.of()
            private var participants: JsonField<Long> = JsonMissing.of()
            private var pinterestShares: JsonField<Long> = JsonMissing.of()
            private var qrcodeShares: JsonField<Long> = JsonMissing.of()
            private var redditShares: JsonField<Long> = JsonMissing.of()
            private var referralCreditExpireds: JsonField<Long> = JsonMissing.of()
            private var referralCreditPendings: JsonField<Long> = JsonMissing.of()
            private var referrals: JsonField<Long> = JsonMissing.of()
            private var smsShares: JsonField<Long> = JsonMissing.of()
            private var telegramShares: JsonField<Long> = JsonMissing.of()
            private var threadsShares: JsonField<Long> = JsonMissing.of()
            private var totalCommissionCount: JsonField<Long> = JsonMissing.of()
            private var totalCommissions: JsonField<Long> = JsonMissing.of()
            private var totalRevenue: JsonField<Long> = JsonMissing.of()
            private var tumblrShares: JsonField<Long> = JsonMissing.of()
            private var twitterShares: JsonField<Long> = JsonMissing.of()
            private var uniqueImpressions: JsonField<Long> = JsonMissing.of()
            private var wechatShares: JsonField<Long> = JsonMissing.of()
            private var whatsAppShares: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(analytics: Analytics) = apply {
                androidNativeShares = analytics.androidNativeShares
                blueskyShares = analytics.blueskyShares
                copyRefLinkShares = analytics.copyRefLinkShares
                emailShares = analytics.emailShares
                facebookShares = analytics.facebookShares
                impressions = analytics.impressions
                invites = analytics.invites
                iosNativeShares = analytics.iosNativeShares
                linkedInShares = analytics.linkedInShares
                messengerShares = analytics.messengerShares
                participants = analytics.participants
                pinterestShares = analytics.pinterestShares
                qrcodeShares = analytics.qrcodeShares
                redditShares = analytics.redditShares
                referralCreditExpireds = analytics.referralCreditExpireds
                referralCreditPendings = analytics.referralCreditPendings
                referrals = analytics.referrals
                smsShares = analytics.smsShares
                telegramShares = analytics.telegramShares
                threadsShares = analytics.threadsShares
                totalCommissionCount = analytics.totalCommissionCount
                totalCommissions = analytics.totalCommissions
                totalRevenue = analytics.totalRevenue
                tumblrShares = analytics.tumblrShares
                twitterShares = analytics.twitterShares
                uniqueImpressions = analytics.uniqueImpressions
                wechatShares = analytics.wechatShares
                whatsAppShares = analytics.whatsAppShares
                additionalProperties = analytics.additionalProperties.toMutableMap()
            }

            fun androidNativeShares(androidNativeShares: Long) =
                androidNativeShares(JsonField.of(androidNativeShares))

            /**
             * Sets [Builder.androidNativeShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.androidNativeShares] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun androidNativeShares(androidNativeShares: JsonField<Long>) = apply {
                this.androidNativeShares = androidNativeShares
            }

            fun blueskyShares(blueskyShares: Long) = blueskyShares(JsonField.of(blueskyShares))

            /**
             * Sets [Builder.blueskyShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.blueskyShares] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun blueskyShares(blueskyShares: JsonField<Long>) = apply {
                this.blueskyShares = blueskyShares
            }

            fun copyRefLinkShares(copyRefLinkShares: Long) =
                copyRefLinkShares(JsonField.of(copyRefLinkShares))

            /**
             * Sets [Builder.copyRefLinkShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.copyRefLinkShares] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun copyRefLinkShares(copyRefLinkShares: JsonField<Long>) = apply {
                this.copyRefLinkShares = copyRefLinkShares
            }

            fun emailShares(emailShares: Long) = emailShares(JsonField.of(emailShares))

            /**
             * Sets [Builder.emailShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.emailShares] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun emailShares(emailShares: JsonField<Long>) = apply { this.emailShares = emailShares }

            fun facebookShares(facebookShares: Long) = facebookShares(JsonField.of(facebookShares))

            /**
             * Sets [Builder.facebookShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.facebookShares] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun facebookShares(facebookShares: JsonField<Long>) = apply {
                this.facebookShares = facebookShares
            }

            fun impressions(impressions: Long) = impressions(JsonField.of(impressions))

            /**
             * Sets [Builder.impressions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.impressions] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun impressions(impressions: JsonField<Long>) = apply { this.impressions = impressions }

            fun invites(invites: Long) = invites(JsonField.of(invites))

            /**
             * Sets [Builder.invites] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invites] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun invites(invites: JsonField<Long>) = apply { this.invites = invites }

            fun iosNativeShares(iosNativeShares: Long) =
                iosNativeShares(JsonField.of(iosNativeShares))

            /**
             * Sets [Builder.iosNativeShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.iosNativeShares] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun iosNativeShares(iosNativeShares: JsonField<Long>) = apply {
                this.iosNativeShares = iosNativeShares
            }

            fun linkedInShares(linkedInShares: Long) = linkedInShares(JsonField.of(linkedInShares))

            /**
             * Sets [Builder.linkedInShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.linkedInShares] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun linkedInShares(linkedInShares: JsonField<Long>) = apply {
                this.linkedInShares = linkedInShares
            }

            fun messengerShares(messengerShares: Long) =
                messengerShares(JsonField.of(messengerShares))

            /**
             * Sets [Builder.messengerShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messengerShares] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun messengerShares(messengerShares: JsonField<Long>) = apply {
                this.messengerShares = messengerShares
            }

            fun participants(participants: Long) = participants(JsonField.of(participants))

            /**
             * Sets [Builder.participants] to an arbitrary JSON value.
             *
             * You should usually call [Builder.participants] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun participants(participants: JsonField<Long>) = apply {
                this.participants = participants
            }

            fun pinterestShares(pinterestShares: Long) =
                pinterestShares(JsonField.of(pinterestShares))

            /**
             * Sets [Builder.pinterestShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pinterestShares] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pinterestShares(pinterestShares: JsonField<Long>) = apply {
                this.pinterestShares = pinterestShares
            }

            fun qrcodeShares(qrcodeShares: Long) = qrcodeShares(JsonField.of(qrcodeShares))

            /**
             * Sets [Builder.qrcodeShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.qrcodeShares] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun qrcodeShares(qrcodeShares: JsonField<Long>) = apply {
                this.qrcodeShares = qrcodeShares
            }

            fun redditShares(redditShares: Long) = redditShares(JsonField.of(redditShares))

            /**
             * Sets [Builder.redditShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.redditShares] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun redditShares(redditShares: JsonField<Long>) = apply {
                this.redditShares = redditShares
            }

            fun referralCreditExpireds(referralCreditExpireds: Long) =
                referralCreditExpireds(JsonField.of(referralCreditExpireds))

            /**
             * Sets [Builder.referralCreditExpireds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referralCreditExpireds] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun referralCreditExpireds(referralCreditExpireds: JsonField<Long>) = apply {
                this.referralCreditExpireds = referralCreditExpireds
            }

            fun referralCreditPendings(referralCreditPendings: Long) =
                referralCreditPendings(JsonField.of(referralCreditPendings))

            /**
             * Sets [Builder.referralCreditPendings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referralCreditPendings] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun referralCreditPendings(referralCreditPendings: JsonField<Long>) = apply {
                this.referralCreditPendings = referralCreditPendings
            }

            fun referrals(referrals: Long) = referrals(JsonField.of(referrals))

            /**
             * Sets [Builder.referrals] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referrals] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun referrals(referrals: JsonField<Long>) = apply { this.referrals = referrals }

            fun smsShares(smsShares: Long) = smsShares(JsonField.of(smsShares))

            /**
             * Sets [Builder.smsShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.smsShares] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun smsShares(smsShares: JsonField<Long>) = apply { this.smsShares = smsShares }

            fun telegramShares(telegramShares: Long) = telegramShares(JsonField.of(telegramShares))

            /**
             * Sets [Builder.telegramShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.telegramShares] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun telegramShares(telegramShares: JsonField<Long>) = apply {
                this.telegramShares = telegramShares
            }

            fun threadsShares(threadsShares: Long) = threadsShares(JsonField.of(threadsShares))

            /**
             * Sets [Builder.threadsShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.threadsShares] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun threadsShares(threadsShares: JsonField<Long>) = apply {
                this.threadsShares = threadsShares
            }

            /** Affiliate programs only. Number of commission records. */
            fun totalCommissionCount(totalCommissionCount: Long) =
                totalCommissionCount(JsonField.of(totalCommissionCount))

            /**
             * Sets [Builder.totalCommissionCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalCommissionCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalCommissionCount(totalCommissionCount: JsonField<Long>) = apply {
                this.totalCommissionCount = totalCommissionCount
            }

            /**
             * Affiliate programs only. Commissions in the smallest unit of the program currency.
             */
            fun totalCommissions(totalCommissions: Long) =
                totalCommissions(JsonField.of(totalCommissions))

            /**
             * Sets [Builder.totalCommissions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalCommissions] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalCommissions(totalCommissions: JsonField<Long>) = apply {
                this.totalCommissions = totalCommissions
            }

            /** Affiliate programs only. Revenue in the smallest unit of the program currency. */
            fun totalRevenue(totalRevenue: Long) = totalRevenue(JsonField.of(totalRevenue))

            /**
             * Sets [Builder.totalRevenue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalRevenue] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalRevenue(totalRevenue: JsonField<Long>) = apply {
                this.totalRevenue = totalRevenue
            }

            fun tumblrShares(tumblrShares: Long) = tumblrShares(JsonField.of(tumblrShares))

            /**
             * Sets [Builder.tumblrShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tumblrShares] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tumblrShares(tumblrShares: JsonField<Long>) = apply {
                this.tumblrShares = tumblrShares
            }

            fun twitterShares(twitterShares: Long) = twitterShares(JsonField.of(twitterShares))

            /**
             * Sets [Builder.twitterShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.twitterShares] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun twitterShares(twitterShares: JsonField<Long>) = apply {
                this.twitterShares = twitterShares
            }

            fun uniqueImpressions(uniqueImpressions: Long) =
                uniqueImpressions(JsonField.of(uniqueImpressions))

            /**
             * Sets [Builder.uniqueImpressions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uniqueImpressions] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun uniqueImpressions(uniqueImpressions: JsonField<Long>) = apply {
                this.uniqueImpressions = uniqueImpressions
            }

            fun wechatShares(wechatShares: Long) = wechatShares(JsonField.of(wechatShares))

            /**
             * Sets [Builder.wechatShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.wechatShares] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun wechatShares(wechatShares: JsonField<Long>) = apply {
                this.wechatShares = wechatShares
            }

            fun whatsAppShares(whatsAppShares: Long) = whatsAppShares(JsonField.of(whatsAppShares))

            /**
             * Sets [Builder.whatsAppShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.whatsAppShares] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun whatsAppShares(whatsAppShares: JsonField<Long>) = apply {
                this.whatsAppShares = whatsAppShares
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
             * Returns an immutable instance of [Analytics].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Analytics =
                Analytics(
                    androidNativeShares,
                    blueskyShares,
                    copyRefLinkShares,
                    emailShares,
                    facebookShares,
                    impressions,
                    invites,
                    iosNativeShares,
                    linkedInShares,
                    messengerShares,
                    participants,
                    pinterestShares,
                    qrcodeShares,
                    redditShares,
                    referralCreditExpireds,
                    referralCreditPendings,
                    referrals,
                    smsShares,
                    telegramShares,
                    threadsShares,
                    totalCommissionCount,
                    totalCommissions,
                    totalRevenue,
                    tumblrShares,
                    twitterShares,
                    uniqueImpressions,
                    wechatShares,
                    whatsAppShares,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws GrowsurfInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Analytics = apply {
            if (validated) {
                return@apply
            }

            androidNativeShares()
            blueskyShares()
            copyRefLinkShares()
            emailShares()
            facebookShares()
            impressions()
            invites()
            iosNativeShares()
            linkedInShares()
            messengerShares()
            participants()
            pinterestShares()
            qrcodeShares()
            redditShares()
            referralCreditExpireds()
            referralCreditPendings()
            referrals()
            smsShares()
            telegramShares()
            threadsShares()
            totalCommissionCount()
            totalCommissions()
            totalRevenue()
            tumblrShares()
            twitterShares()
            uniqueImpressions()
            wechatShares()
            whatsAppShares()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (androidNativeShares.asKnown().isPresent) 1 else 0) +
                (if (blueskyShares.asKnown().isPresent) 1 else 0) +
                (if (copyRefLinkShares.asKnown().isPresent) 1 else 0) +
                (if (emailShares.asKnown().isPresent) 1 else 0) +
                (if (facebookShares.asKnown().isPresent) 1 else 0) +
                (if (impressions.asKnown().isPresent) 1 else 0) +
                (if (invites.asKnown().isPresent) 1 else 0) +
                (if (iosNativeShares.asKnown().isPresent) 1 else 0) +
                (if (linkedInShares.asKnown().isPresent) 1 else 0) +
                (if (messengerShares.asKnown().isPresent) 1 else 0) +
                (if (participants.asKnown().isPresent) 1 else 0) +
                (if (pinterestShares.asKnown().isPresent) 1 else 0) +
                (if (qrcodeShares.asKnown().isPresent) 1 else 0) +
                (if (redditShares.asKnown().isPresent) 1 else 0) +
                (if (referralCreditExpireds.asKnown().isPresent) 1 else 0) +
                (if (referralCreditPendings.asKnown().isPresent) 1 else 0) +
                (if (referrals.asKnown().isPresent) 1 else 0) +
                (if (smsShares.asKnown().isPresent) 1 else 0) +
                (if (telegramShares.asKnown().isPresent) 1 else 0) +
                (if (threadsShares.asKnown().isPresent) 1 else 0) +
                (if (totalCommissionCount.asKnown().isPresent) 1 else 0) +
                (if (totalCommissions.asKnown().isPresent) 1 else 0) +
                (if (totalRevenue.asKnown().isPresent) 1 else 0) +
                (if (tumblrShares.asKnown().isPresent) 1 else 0) +
                (if (twitterShares.asKnown().isPresent) 1 else 0) +
                (if (uniqueImpressions.asKnown().isPresent) 1 else 0) +
                (if (wechatShares.asKnown().isPresent) 1 else 0) +
                (if (whatsAppShares.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Analytics &&
                androidNativeShares == other.androidNativeShares &&
                blueskyShares == other.blueskyShares &&
                copyRefLinkShares == other.copyRefLinkShares &&
                emailShares == other.emailShares &&
                facebookShares == other.facebookShares &&
                impressions == other.impressions &&
                invites == other.invites &&
                iosNativeShares == other.iosNativeShares &&
                linkedInShares == other.linkedInShares &&
                messengerShares == other.messengerShares &&
                participants == other.participants &&
                pinterestShares == other.pinterestShares &&
                qrcodeShares == other.qrcodeShares &&
                redditShares == other.redditShares &&
                referralCreditExpireds == other.referralCreditExpireds &&
                referralCreditPendings == other.referralCreditPendings &&
                referrals == other.referrals &&
                smsShares == other.smsShares &&
                telegramShares == other.telegramShares &&
                threadsShares == other.threadsShares &&
                totalCommissionCount == other.totalCommissionCount &&
                totalCommissions == other.totalCommissions &&
                totalRevenue == other.totalRevenue &&
                tumblrShares == other.tumblrShares &&
                twitterShares == other.twitterShares &&
                uniqueImpressions == other.uniqueImpressions &&
                wechatShares == other.wechatShares &&
                whatsAppShares == other.whatsAppShares &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                androidNativeShares,
                blueskyShares,
                copyRefLinkShares,
                emailShares,
                facebookShares,
                impressions,
                invites,
                iosNativeShares,
                linkedInShares,
                messengerShares,
                participants,
                pinterestShares,
                qrcodeShares,
                redditShares,
                referralCreditExpireds,
                referralCreditPendings,
                referrals,
                smsShares,
                telegramShares,
                threadsShares,
                totalCommissionCount,
                totalCommissions,
                totalRevenue,
                tumblrShares,
                twitterShares,
                uniqueImpressions,
                wechatShares,
                whatsAppShares,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Analytics{androidNativeShares=$androidNativeShares, blueskyShares=$blueskyShares, copyRefLinkShares=$copyRefLinkShares, emailShares=$emailShares, facebookShares=$facebookShares, impressions=$impressions, invites=$invites, iosNativeShares=$iosNativeShares, linkedInShares=$linkedInShares, messengerShares=$messengerShares, participants=$participants, pinterestShares=$pinterestShares, qrcodeShares=$qrcodeShares, redditShares=$redditShares, referralCreditExpireds=$referralCreditExpireds, referralCreditPendings=$referralCreditPendings, referrals=$referrals, smsShares=$smsShares, telegramShares=$telegramShares, threadsShares=$threadsShares, totalCommissionCount=$totalCommissionCount, totalCommissions=$totalCommissions, totalRevenue=$totalRevenue, tumblrShares=$tumblrShares, twitterShares=$twitterShares, uniqueImpressions=$uniqueImpressions, wechatShares=$wechatShares, whatsAppShares=$whatsAppShares, additionalProperties=$additionalProperties}"
    }

    class Series
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val androidNativeShares: JsonField<Long>,
        private val blueskyShares: JsonField<Long>,
        private val copyRefLinkShares: JsonField<Long>,
        private val emailShares: JsonField<Long>,
        private val facebookShares: JsonField<Long>,
        private val impressions: JsonField<Long>,
        private val invites: JsonField<Long>,
        private val iosNativeShares: JsonField<Long>,
        private val linkedInShares: JsonField<Long>,
        private val messengerShares: JsonField<Long>,
        private val participants: JsonField<Long>,
        private val periodStart: JsonField<Long>,
        private val pinterestShares: JsonField<Long>,
        private val qrcodeShares: JsonField<Long>,
        private val redditShares: JsonField<Long>,
        private val referralCreditExpireds: JsonField<Long>,
        private val referralCreditPendings: JsonField<Long>,
        private val referrals: JsonField<Long>,
        private val smsShares: JsonField<Long>,
        private val telegramShares: JsonField<Long>,
        private val threadsShares: JsonField<Long>,
        private val totalCommissionCount: JsonField<Long>,
        private val totalCommissions: JsonField<Long>,
        private val totalRevenue: JsonField<Long>,
        private val tumblrShares: JsonField<Long>,
        private val twitterShares: JsonField<Long>,
        private val uniqueImpressions: JsonField<Long>,
        private val wechatShares: JsonField<Long>,
        private val whatsAppShares: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("androidNativeShares")
            @ExcludeMissing
            androidNativeShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("blueskyShares")
            @ExcludeMissing
            blueskyShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("copyRefLinkShares")
            @ExcludeMissing
            copyRefLinkShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("emailShares")
            @ExcludeMissing
            emailShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("facebookShares")
            @ExcludeMissing
            facebookShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("impressions")
            @ExcludeMissing
            impressions: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("invites")
            @ExcludeMissing
            invites: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("iosNativeShares")
            @ExcludeMissing
            iosNativeShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("linkedInShares")
            @ExcludeMissing
            linkedInShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("messengerShares")
            @ExcludeMissing
            messengerShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("participants")
            @ExcludeMissing
            participants: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("periodStart")
            @ExcludeMissing
            periodStart: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("pinterestShares")
            @ExcludeMissing
            pinterestShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("qrcodeShares")
            @ExcludeMissing
            qrcodeShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("redditShares")
            @ExcludeMissing
            redditShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("referralCreditExpireds")
            @ExcludeMissing
            referralCreditExpireds: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("referralCreditPendings")
            @ExcludeMissing
            referralCreditPendings: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("referrals")
            @ExcludeMissing
            referrals: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("smsShares")
            @ExcludeMissing
            smsShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("telegramShares")
            @ExcludeMissing
            telegramShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("threadsShares")
            @ExcludeMissing
            threadsShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("totalCommissionCount")
            @ExcludeMissing
            totalCommissionCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("totalCommissions")
            @ExcludeMissing
            totalCommissions: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("totalRevenue")
            @ExcludeMissing
            totalRevenue: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("tumblrShares")
            @ExcludeMissing
            tumblrShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("twitterShares")
            @ExcludeMissing
            twitterShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("uniqueImpressions")
            @ExcludeMissing
            uniqueImpressions: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("wechatShares")
            @ExcludeMissing
            wechatShares: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("whatsAppShares")
            @ExcludeMissing
            whatsAppShares: JsonField<Long> = JsonMissing.of(),
        ) : this(
            androidNativeShares,
            blueskyShares,
            copyRefLinkShares,
            emailShares,
            facebookShares,
            impressions,
            invites,
            iosNativeShares,
            linkedInShares,
            messengerShares,
            participants,
            periodStart,
            pinterestShares,
            qrcodeShares,
            redditShares,
            referralCreditExpireds,
            referralCreditPendings,
            referrals,
            smsShares,
            telegramShares,
            threadsShares,
            totalCommissionCount,
            totalCommissions,
            totalRevenue,
            tumblrShares,
            twitterShares,
            uniqueImpressions,
            wechatShares,
            whatsAppShares,
            mutableMapOf(),
        )

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun androidNativeShares(): Optional<Long> = androidNativeShares.getOptional("androidNativeShares")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun blueskyShares(): Optional<Long> = blueskyShares.getOptional("blueskyShares")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun copyRefLinkShares(): Optional<Long> = copyRefLinkShares.getOptional("copyRefLinkShares")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun emailShares(): Optional<Long> = emailShares.getOptional("emailShares")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun facebookShares(): Optional<Long> = facebookShares.getOptional("facebookShares")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun impressions(): Optional<Long> = impressions.getOptional("impressions")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun invites(): Optional<Long> = invites.getOptional("invites")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun iosNativeShares(): Optional<Long> = iosNativeShares.getOptional("iosNativeShares")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun linkedInShares(): Optional<Long> = linkedInShares.getOptional("linkedInShares")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun messengerShares(): Optional<Long> = messengerShares.getOptional("messengerShares")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun participants(): Optional<Long> = participants.getOptional("participants")

        /**
         * Start of the period, as a Unix timestamp in milliseconds (UTC).
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun periodStart(): Optional<Long> = periodStart.getOptional("periodStart")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pinterestShares(): Optional<Long> = pinterestShares.getOptional("pinterestShares")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun qrcodeShares(): Optional<Long> = qrcodeShares.getOptional("qrcodeShares")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun redditShares(): Optional<Long> = redditShares.getOptional("redditShares")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun referralCreditExpireds(): Optional<Long> = referralCreditExpireds.getOptional("referralCreditExpireds")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun referralCreditPendings(): Optional<Long> = referralCreditPendings.getOptional("referralCreditPendings")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun referrals(): Optional<Long> = referrals.getOptional("referrals")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun smsShares(): Optional<Long> = smsShares.getOptional("smsShares")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun telegramShares(): Optional<Long> = telegramShares.getOptional("telegramShares")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun threadsShares(): Optional<Long> = threadsShares.getOptional("threadsShares")

        /**
         * Affiliate programs only. Number of commission records.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalCommissionCount(): Optional<Long> = totalCommissionCount.getOptional("totalCommissionCount")

        /**
         * Affiliate programs only. Commissions in the smallest unit of the program currency.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalCommissions(): Optional<Long> = totalCommissions.getOptional("totalCommissions")

        /**
         * Affiliate programs only. Revenue in the smallest unit of the program currency.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalRevenue(): Optional<Long> = totalRevenue.getOptional("totalRevenue")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tumblrShares(): Optional<Long> = tumblrShares.getOptional("tumblrShares")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun twitterShares(): Optional<Long> = twitterShares.getOptional("twitterShares")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun uniqueImpressions(): Optional<Long> = uniqueImpressions.getOptional("uniqueImpressions")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun wechatShares(): Optional<Long> = wechatShares.getOptional("wechatShares")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun whatsAppShares(): Optional<Long> = whatsAppShares.getOptional("whatsAppShares")

        /**
         * Returns the raw JSON value of [androidNativeShares].
         *
         * Unlike [androidNativeShares], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("androidNativeShares")
        @ExcludeMissing
        fun _androidNativeShares(): JsonField<Long> = androidNativeShares

        /**
         * Returns the raw JSON value of [blueskyShares].
         *
         * Unlike [blueskyShares], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("blueskyShares")
        @ExcludeMissing
        fun _blueskyShares(): JsonField<Long> = blueskyShares

        /**
         * Returns the raw JSON value of [copyRefLinkShares].
         *
         * Unlike [copyRefLinkShares], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("copyRefLinkShares")
        @ExcludeMissing
        fun _copyRefLinkShares(): JsonField<Long> = copyRefLinkShares

        /**
         * Returns the raw JSON value of [emailShares].
         *
         * Unlike [emailShares], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("emailShares")
        @ExcludeMissing
        fun _emailShares(): JsonField<Long> = emailShares

        /**
         * Returns the raw JSON value of [facebookShares].
         *
         * Unlike [facebookShares], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("facebookShares")
        @ExcludeMissing
        fun _facebookShares(): JsonField<Long> = facebookShares

        /**
         * Returns the raw JSON value of [impressions].
         *
         * Unlike [impressions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("impressions")
        @ExcludeMissing
        fun _impressions(): JsonField<Long> = impressions

        /**
         * Returns the raw JSON value of [invites].
         *
         * Unlike [invites], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("invites")
        @ExcludeMissing
        fun _invites(): JsonField<Long> = invites

        /**
         * Returns the raw JSON value of [iosNativeShares].
         *
         * Unlike [iosNativeShares], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("iosNativeShares")
        @ExcludeMissing
        fun _iosNativeShares(): JsonField<Long> = iosNativeShares

        /**
         * Returns the raw JSON value of [linkedInShares].
         *
         * Unlike [linkedInShares], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("linkedInShares")
        @ExcludeMissing
        fun _linkedInShares(): JsonField<Long> = linkedInShares

        /**
         * Returns the raw JSON value of [messengerShares].
         *
         * Unlike [messengerShares], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("messengerShares")
        @ExcludeMissing
        fun _messengerShares(): JsonField<Long> = messengerShares

        /**
         * Returns the raw JSON value of [participants].
         *
         * Unlike [participants], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("participants")
        @ExcludeMissing
        fun _participants(): JsonField<Long> = participants

        /**
         * Returns the raw JSON value of [periodStart].
         *
         * Unlike [periodStart], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("periodStart")
        @ExcludeMissing
        fun _periodStart(): JsonField<Long> = periodStart

        /**
         * Returns the raw JSON value of [pinterestShares].
         *
         * Unlike [pinterestShares], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pinterestShares")
        @ExcludeMissing
        fun _pinterestShares(): JsonField<Long> = pinterestShares

        /**
         * Returns the raw JSON value of [qrcodeShares].
         *
         * Unlike [qrcodeShares], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("qrcodeShares")
        @ExcludeMissing
        fun _qrcodeShares(): JsonField<Long> = qrcodeShares

        /**
         * Returns the raw JSON value of [redditShares].
         *
         * Unlike [redditShares], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("redditShares")
        @ExcludeMissing
        fun _redditShares(): JsonField<Long> = redditShares

        /**
         * Returns the raw JSON value of [referralCreditExpireds].
         *
         * Unlike [referralCreditExpireds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("referralCreditExpireds")
        @ExcludeMissing
        fun _referralCreditExpireds(): JsonField<Long> = referralCreditExpireds

        /**
         * Returns the raw JSON value of [referralCreditPendings].
         *
         * Unlike [referralCreditPendings], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("referralCreditPendings")
        @ExcludeMissing
        fun _referralCreditPendings(): JsonField<Long> = referralCreditPendings

        /**
         * Returns the raw JSON value of [referrals].
         *
         * Unlike [referrals], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("referrals")
        @ExcludeMissing
        fun _referrals(): JsonField<Long> = referrals

        /**
         * Returns the raw JSON value of [smsShares].
         *
         * Unlike [smsShares], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("smsShares")
        @ExcludeMissing
        fun _smsShares(): JsonField<Long> = smsShares

        /**
         * Returns the raw JSON value of [telegramShares].
         *
         * Unlike [telegramShares], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("telegramShares")
        @ExcludeMissing
        fun _telegramShares(): JsonField<Long> = telegramShares

        /**
         * Returns the raw JSON value of [threadsShares].
         *
         * Unlike [threadsShares], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("threadsShares")
        @ExcludeMissing
        fun _threadsShares(): JsonField<Long> = threadsShares

        /**
         * Returns the raw JSON value of [totalCommissionCount].
         *
         * Unlike [totalCommissionCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("totalCommissionCount")
        @ExcludeMissing
        fun _totalCommissionCount(): JsonField<Long> = totalCommissionCount

        /**
         * Returns the raw JSON value of [totalCommissions].
         *
         * Unlike [totalCommissions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("totalCommissions")
        @ExcludeMissing
        fun _totalCommissions(): JsonField<Long> = totalCommissions

        /**
         * Returns the raw JSON value of [totalRevenue].
         *
         * Unlike [totalRevenue], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("totalRevenue")
        @ExcludeMissing
        fun _totalRevenue(): JsonField<Long> = totalRevenue

        /**
         * Returns the raw JSON value of [tumblrShares].
         *
         * Unlike [tumblrShares], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tumblrShares")
        @ExcludeMissing
        fun _tumblrShares(): JsonField<Long> = tumblrShares

        /**
         * Returns the raw JSON value of [twitterShares].
         *
         * Unlike [twitterShares], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("twitterShares")
        @ExcludeMissing
        fun _twitterShares(): JsonField<Long> = twitterShares

        /**
         * Returns the raw JSON value of [uniqueImpressions].
         *
         * Unlike [uniqueImpressions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("uniqueImpressions")
        @ExcludeMissing
        fun _uniqueImpressions(): JsonField<Long> = uniqueImpressions

        /**
         * Returns the raw JSON value of [wechatShares].
         *
         * Unlike [wechatShares], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("wechatShares")
        @ExcludeMissing
        fun _wechatShares(): JsonField<Long> = wechatShares

        /**
         * Returns the raw JSON value of [whatsAppShares].
         *
         * Unlike [whatsAppShares], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("whatsAppShares")
        @ExcludeMissing
        fun _whatsAppShares(): JsonField<Long> = whatsAppShares

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Series]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Series]. */
        class Builder internal constructor() {

            private var androidNativeShares: JsonField<Long> = JsonMissing.of()
            private var blueskyShares: JsonField<Long> = JsonMissing.of()
            private var copyRefLinkShares: JsonField<Long> = JsonMissing.of()
            private var emailShares: JsonField<Long> = JsonMissing.of()
            private var facebookShares: JsonField<Long> = JsonMissing.of()
            private var impressions: JsonField<Long> = JsonMissing.of()
            private var invites: JsonField<Long> = JsonMissing.of()
            private var iosNativeShares: JsonField<Long> = JsonMissing.of()
            private var linkedInShares: JsonField<Long> = JsonMissing.of()
            private var messengerShares: JsonField<Long> = JsonMissing.of()
            private var participants: JsonField<Long> = JsonMissing.of()
            private var periodStart: JsonField<Long> = JsonMissing.of()
            private var pinterestShares: JsonField<Long> = JsonMissing.of()
            private var qrcodeShares: JsonField<Long> = JsonMissing.of()
            private var redditShares: JsonField<Long> = JsonMissing.of()
            private var referralCreditExpireds: JsonField<Long> = JsonMissing.of()
            private var referralCreditPendings: JsonField<Long> = JsonMissing.of()
            private var referrals: JsonField<Long> = JsonMissing.of()
            private var smsShares: JsonField<Long> = JsonMissing.of()
            private var telegramShares: JsonField<Long> = JsonMissing.of()
            private var threadsShares: JsonField<Long> = JsonMissing.of()
            private var totalCommissionCount: JsonField<Long> = JsonMissing.of()
            private var totalCommissions: JsonField<Long> = JsonMissing.of()
            private var totalRevenue: JsonField<Long> = JsonMissing.of()
            private var tumblrShares: JsonField<Long> = JsonMissing.of()
            private var twitterShares: JsonField<Long> = JsonMissing.of()
            private var uniqueImpressions: JsonField<Long> = JsonMissing.of()
            private var wechatShares: JsonField<Long> = JsonMissing.of()
            private var whatsAppShares: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(series: Series) = apply {
                androidNativeShares = series.androidNativeShares
                blueskyShares = series.blueskyShares
                copyRefLinkShares = series.copyRefLinkShares
                emailShares = series.emailShares
                facebookShares = series.facebookShares
                impressions = series.impressions
                invites = series.invites
                iosNativeShares = series.iosNativeShares
                linkedInShares = series.linkedInShares
                messengerShares = series.messengerShares
                participants = series.participants
                periodStart = series.periodStart
                pinterestShares = series.pinterestShares
                qrcodeShares = series.qrcodeShares
                redditShares = series.redditShares
                referralCreditExpireds = series.referralCreditExpireds
                referralCreditPendings = series.referralCreditPendings
                referrals = series.referrals
                smsShares = series.smsShares
                telegramShares = series.telegramShares
                threadsShares = series.threadsShares
                totalCommissionCount = series.totalCommissionCount
                totalCommissions = series.totalCommissions
                totalRevenue = series.totalRevenue
                tumblrShares = series.tumblrShares
                twitterShares = series.twitterShares
                uniqueImpressions = series.uniqueImpressions
                wechatShares = series.wechatShares
                whatsAppShares = series.whatsAppShares
                additionalProperties = series.additionalProperties.toMutableMap()
            }

            fun androidNativeShares(androidNativeShares: Long) = androidNativeShares(JsonField.of(androidNativeShares))

            /**
             * Sets [Builder.androidNativeShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.androidNativeShares] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun androidNativeShares(androidNativeShares: JsonField<Long>) = apply { this.androidNativeShares = androidNativeShares }

            fun blueskyShares(blueskyShares: Long) = blueskyShares(JsonField.of(blueskyShares))

            /**
             * Sets [Builder.blueskyShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.blueskyShares] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun blueskyShares(blueskyShares: JsonField<Long>) = apply { this.blueskyShares = blueskyShares }

            fun copyRefLinkShares(copyRefLinkShares: Long) = copyRefLinkShares(JsonField.of(copyRefLinkShares))

            /**
             * Sets [Builder.copyRefLinkShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.copyRefLinkShares] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun copyRefLinkShares(copyRefLinkShares: JsonField<Long>) = apply { this.copyRefLinkShares = copyRefLinkShares }

            fun emailShares(emailShares: Long) = emailShares(JsonField.of(emailShares))

            /**
             * Sets [Builder.emailShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.emailShares] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun emailShares(emailShares: JsonField<Long>) = apply { this.emailShares = emailShares }

            fun facebookShares(facebookShares: Long) = facebookShares(JsonField.of(facebookShares))

            /**
             * Sets [Builder.facebookShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.facebookShares] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun facebookShares(facebookShares: JsonField<Long>) = apply { this.facebookShares = facebookShares }

            fun impressions(impressions: Long) = impressions(JsonField.of(impressions))

            /**
             * Sets [Builder.impressions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.impressions] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun impressions(impressions: JsonField<Long>) = apply { this.impressions = impressions }

            fun invites(invites: Long) = invites(JsonField.of(invites))

            /**
             * Sets [Builder.invites] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invites] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun invites(invites: JsonField<Long>) = apply { this.invites = invites }

            fun iosNativeShares(iosNativeShares: Long) = iosNativeShares(JsonField.of(iosNativeShares))

            /**
             * Sets [Builder.iosNativeShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.iosNativeShares] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun iosNativeShares(iosNativeShares: JsonField<Long>) = apply { this.iosNativeShares = iosNativeShares }

            fun linkedInShares(linkedInShares: Long) = linkedInShares(JsonField.of(linkedInShares))

            /**
             * Sets [Builder.linkedInShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.linkedInShares] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun linkedInShares(linkedInShares: JsonField<Long>) = apply { this.linkedInShares = linkedInShares }

            fun messengerShares(messengerShares: Long) = messengerShares(JsonField.of(messengerShares))

            /**
             * Sets [Builder.messengerShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messengerShares] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun messengerShares(messengerShares: JsonField<Long>) = apply { this.messengerShares = messengerShares }

            fun participants(participants: Long) = participants(JsonField.of(participants))

            /**
             * Sets [Builder.participants] to an arbitrary JSON value.
             *
             * You should usually call [Builder.participants] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun participants(participants: JsonField<Long>) = apply { this.participants = participants }

            /** Start of the period, as a Unix timestamp in milliseconds (UTC). */
            fun periodStart(periodStart: Long) = periodStart(JsonField.of(periodStart))

            /**
             * Sets [Builder.periodStart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.periodStart] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun periodStart(periodStart: JsonField<Long>) = apply { this.periodStart = periodStart }

            fun pinterestShares(pinterestShares: Long) = pinterestShares(JsonField.of(pinterestShares))

            /**
             * Sets [Builder.pinterestShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pinterestShares] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun pinterestShares(pinterestShares: JsonField<Long>) = apply { this.pinterestShares = pinterestShares }

            fun qrcodeShares(qrcodeShares: Long) = qrcodeShares(JsonField.of(qrcodeShares))

            /**
             * Sets [Builder.qrcodeShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.qrcodeShares] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun qrcodeShares(qrcodeShares: JsonField<Long>) = apply { this.qrcodeShares = qrcodeShares }

            fun redditShares(redditShares: Long) = redditShares(JsonField.of(redditShares))

            /**
             * Sets [Builder.redditShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.redditShares] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun redditShares(redditShares: JsonField<Long>) = apply { this.redditShares = redditShares }

            fun referralCreditExpireds(referralCreditExpireds: Long) = referralCreditExpireds(JsonField.of(referralCreditExpireds))

            /**
             * Sets [Builder.referralCreditExpireds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referralCreditExpireds] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun referralCreditExpireds(referralCreditExpireds: JsonField<Long>) = apply { this.referralCreditExpireds = referralCreditExpireds }

            fun referralCreditPendings(referralCreditPendings: Long) = referralCreditPendings(JsonField.of(referralCreditPendings))

            /**
             * Sets [Builder.referralCreditPendings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referralCreditPendings] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun referralCreditPendings(referralCreditPendings: JsonField<Long>) = apply { this.referralCreditPendings = referralCreditPendings }

            fun referrals(referrals: Long) = referrals(JsonField.of(referrals))

            /**
             * Sets [Builder.referrals] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referrals] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun referrals(referrals: JsonField<Long>) = apply { this.referrals = referrals }

            fun smsShares(smsShares: Long) = smsShares(JsonField.of(smsShares))

            /**
             * Sets [Builder.smsShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.smsShares] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun smsShares(smsShares: JsonField<Long>) = apply { this.smsShares = smsShares }

            fun telegramShares(telegramShares: Long) = telegramShares(JsonField.of(telegramShares))

            /**
             * Sets [Builder.telegramShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.telegramShares] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun telegramShares(telegramShares: JsonField<Long>) = apply { this.telegramShares = telegramShares }

            fun threadsShares(threadsShares: Long) = threadsShares(JsonField.of(threadsShares))

            /**
             * Sets [Builder.threadsShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.threadsShares] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun threadsShares(threadsShares: JsonField<Long>) = apply { this.threadsShares = threadsShares }

            /** Affiliate programs only. Number of commission records. */
            fun totalCommissionCount(totalCommissionCount: Long) = totalCommissionCount(JsonField.of(totalCommissionCount))

            /**
             * Sets [Builder.totalCommissionCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalCommissionCount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun totalCommissionCount(totalCommissionCount: JsonField<Long>) = apply { this.totalCommissionCount = totalCommissionCount }

            /** Affiliate programs only. Commissions in the smallest unit of the program currency. */
            fun totalCommissions(totalCommissions: Long) = totalCommissions(JsonField.of(totalCommissions))

            /**
             * Sets [Builder.totalCommissions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalCommissions] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun totalCommissions(totalCommissions: JsonField<Long>) = apply { this.totalCommissions = totalCommissions }

            /** Affiliate programs only. Revenue in the smallest unit of the program currency. */
            fun totalRevenue(totalRevenue: Long) = totalRevenue(JsonField.of(totalRevenue))

            /**
             * Sets [Builder.totalRevenue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalRevenue] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun totalRevenue(totalRevenue: JsonField<Long>) = apply { this.totalRevenue = totalRevenue }

            fun tumblrShares(tumblrShares: Long) = tumblrShares(JsonField.of(tumblrShares))

            /**
             * Sets [Builder.tumblrShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tumblrShares] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tumblrShares(tumblrShares: JsonField<Long>) = apply { this.tumblrShares = tumblrShares }

            fun twitterShares(twitterShares: Long) = twitterShares(JsonField.of(twitterShares))

            /**
             * Sets [Builder.twitterShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.twitterShares] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun twitterShares(twitterShares: JsonField<Long>) = apply { this.twitterShares = twitterShares }

            fun uniqueImpressions(uniqueImpressions: Long) = uniqueImpressions(JsonField.of(uniqueImpressions))

            /**
             * Sets [Builder.uniqueImpressions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uniqueImpressions] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun uniqueImpressions(uniqueImpressions: JsonField<Long>) = apply { this.uniqueImpressions = uniqueImpressions }

            fun wechatShares(wechatShares: Long) = wechatShares(JsonField.of(wechatShares))

            /**
             * Sets [Builder.wechatShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.wechatShares] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun wechatShares(wechatShares: JsonField<Long>) = apply { this.wechatShares = wechatShares }

            fun whatsAppShares(whatsAppShares: Long) = whatsAppShares(JsonField.of(whatsAppShares))

            /**
             * Sets [Builder.whatsAppShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.whatsAppShares] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun whatsAppShares(whatsAppShares: JsonField<Long>) = apply { this.whatsAppShares = whatsAppShares }

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
             * Returns an immutable instance of [Series].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Series =
                Series(
                    androidNativeShares,
                    blueskyShares,
                    copyRefLinkShares,
                    emailShares,
                    facebookShares,
                    impressions,
                    invites,
                    iosNativeShares,
                    linkedInShares,
                    messengerShares,
                    participants,
                    periodStart,
                    pinterestShares,
                    qrcodeShares,
                    redditShares,
                    referralCreditExpireds,
                    referralCreditPendings,
                    referrals,
                    smsShares,
                    telegramShares,
                    threadsShares,
                    totalCommissionCount,
                    totalCommissions,
                    totalRevenue,
                    tumblrShares,
                    twitterShares,
                    uniqueImpressions,
                    wechatShares,
                    whatsAppShares,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Series = apply {
            if (validated) {
                return@apply
            }

            androidNativeShares()
            blueskyShares()
            copyRefLinkShares()
            emailShares()
            facebookShares()
            impressions()
            invites()
            iosNativeShares()
            linkedInShares()
            messengerShares()
            participants()
            periodStart()
            pinterestShares()
            qrcodeShares()
            redditShares()
            referralCreditExpireds()
            referralCreditPendings()
            referrals()
            smsShares()
            telegramShares()
            threadsShares()
            totalCommissionCount()
            totalCommissions()
            totalRevenue()
            tumblrShares()
            twitterShares()
            uniqueImpressions()
            wechatShares()
            whatsAppShares()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: GrowsurfInvalidDataException) {
                false
            }

        @JvmSynthetic
        internal fun validity(): Int =
            (if (androidNativeShares.asKnown().isPresent) 1 else 0) +
                (if (blueskyShares.asKnown().isPresent) 1 else 0) +
                (if (copyRefLinkShares.asKnown().isPresent) 1 else 0) +
                (if (emailShares.asKnown().isPresent) 1 else 0) +
                (if (facebookShares.asKnown().isPresent) 1 else 0) +
                (if (impressions.asKnown().isPresent) 1 else 0) +
                (if (invites.asKnown().isPresent) 1 else 0) +
                (if (iosNativeShares.asKnown().isPresent) 1 else 0) +
                (if (linkedInShares.asKnown().isPresent) 1 else 0) +
                (if (messengerShares.asKnown().isPresent) 1 else 0) +
                (if (participants.asKnown().isPresent) 1 else 0) +
                (if (periodStart.asKnown().isPresent) 1 else 0) +
                (if (pinterestShares.asKnown().isPresent) 1 else 0) +
                (if (qrcodeShares.asKnown().isPresent) 1 else 0) +
                (if (redditShares.asKnown().isPresent) 1 else 0) +
                (if (referralCreditExpireds.asKnown().isPresent) 1 else 0) +
                (if (referralCreditPendings.asKnown().isPresent) 1 else 0) +
                (if (referrals.asKnown().isPresent) 1 else 0) +
                (if (smsShares.asKnown().isPresent) 1 else 0) +
                (if (telegramShares.asKnown().isPresent) 1 else 0) +
                (if (threadsShares.asKnown().isPresent) 1 else 0) +
                (if (totalCommissionCount.asKnown().isPresent) 1 else 0) +
                (if (totalCommissions.asKnown().isPresent) 1 else 0) +
                (if (totalRevenue.asKnown().isPresent) 1 else 0) +
                (if (tumblrShares.asKnown().isPresent) 1 else 0) +
                (if (twitterShares.asKnown().isPresent) 1 else 0) +
                (if (uniqueImpressions.asKnown().isPresent) 1 else 0) +
                (if (wechatShares.asKnown().isPresent) 1 else 0) +
                (if (whatsAppShares.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Series &&
                androidNativeShares == other.androidNativeShares &&
                blueskyShares == other.blueskyShares &&
                copyRefLinkShares == other.copyRefLinkShares &&
                emailShares == other.emailShares &&
                facebookShares == other.facebookShares &&
                impressions == other.impressions &&
                invites == other.invites &&
                iosNativeShares == other.iosNativeShares &&
                linkedInShares == other.linkedInShares &&
                messengerShares == other.messengerShares &&
                participants == other.participants &&
                periodStart == other.periodStart &&
                pinterestShares == other.pinterestShares &&
                qrcodeShares == other.qrcodeShares &&
                redditShares == other.redditShares &&
                referralCreditExpireds == other.referralCreditExpireds &&
                referralCreditPendings == other.referralCreditPendings &&
                referrals == other.referrals &&
                smsShares == other.smsShares &&
                telegramShares == other.telegramShares &&
                threadsShares == other.threadsShares &&
                totalCommissionCount == other.totalCommissionCount &&
                totalCommissions == other.totalCommissions &&
                totalRevenue == other.totalRevenue &&
                tumblrShares == other.tumblrShares &&
                twitterShares == other.twitterShares &&
                uniqueImpressions == other.uniqueImpressions &&
                wechatShares == other.wechatShares &&
                whatsAppShares == other.whatsAppShares &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                androidNativeShares,
                blueskyShares,
                copyRefLinkShares,
                emailShares,
                facebookShares,
                impressions,
                invites,
                iosNativeShares,
                linkedInShares,
                messengerShares,
                participants,
                periodStart,
                pinterestShares,
                qrcodeShares,
                redditShares,
                referralCreditExpireds,
                referralCreditPendings,
                referrals,
                smsShares,
                telegramShares,
                threadsShares,
                totalCommissionCount,
                totalCommissions,
                totalRevenue,
                tumblrShares,
                twitterShares,
                uniqueImpressions,
                wechatShares,
                whatsAppShares,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Series{androidNativeShares=$androidNativeShares, blueskyShares=$blueskyShares, copyRefLinkShares=$copyRefLinkShares, emailShares=$emailShares, facebookShares=$facebookShares, impressions=$impressions, invites=$invites, iosNativeShares=$iosNativeShares, linkedInShares=$linkedInShares, messengerShares=$messengerShares, participants=$participants, periodStart=$periodStart, pinterestShares=$pinterestShares, qrcodeShares=$qrcodeShares, redditShares=$redditShares, referralCreditExpireds=$referralCreditExpireds, referralCreditPendings=$referralCreditPendings, referrals=$referrals, smsShares=$smsShares, telegramShares=$telegramShares, threadsShares=$threadsShares, totalCommissionCount=$totalCommissionCount, totalCommissions=$totalCommissions, totalRevenue=$totalRevenue, tumblrShares=$tumblrShares, twitterShares=$twitterShares, uniqueImpressions=$uniqueImpressions, wechatShares=$wechatShares, whatsAppShares=$whatsAppShares, additionalProperties=$additionalProperties}"
    }

    /** Totals for the equal-length window immediately preceding the requested one. */
    class PreviousPeriod
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val analytics: JsonField<Analytics>,
        private val endDate: JsonField<Long>,
        private val startDate: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("analytics")
            @ExcludeMissing
            analytics: JsonField<Analytics> = JsonMissing.of(),
            @JsonProperty("endDate") @ExcludeMissing endDate: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("startDate")
            @ExcludeMissing
            startDate: JsonField<Long> = JsonMissing.of(),
        ) : this(analytics, endDate, startDate, mutableMapOf())

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun analytics(): Analytics = analytics.getRequired("analytics")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun endDate(): Long = endDate.getRequired("endDate")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startDate(): Long = startDate.getRequired("startDate")

        /**
         * Returns the raw JSON value of [analytics].
         *
         * Unlike [analytics], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("analytics")
        @ExcludeMissing
        fun _analytics(): JsonField<Analytics> = analytics

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("endDate") @ExcludeMissing fun _endDate(): JsonField<Long> = endDate

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("startDate") @ExcludeMissing fun _startDate(): JsonField<Long> = startDate

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [PreviousPeriod].
             *
             * The following fields are required:
             * ```java
             * .analytics()
             * .endDate()
             * .startDate()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PreviousPeriod]. */
        class Builder internal constructor() {

            private var analytics: JsonField<Analytics>? = null
            private var endDate: JsonField<Long>? = null
            private var startDate: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(previousPeriod: PreviousPeriod) = apply {
                analytics = previousPeriod.analytics
                endDate = previousPeriod.endDate
                startDate = previousPeriod.startDate
                additionalProperties = previousPeriod.additionalProperties.toMutableMap()
            }

            fun analytics(analytics: Analytics) = analytics(JsonField.of(analytics))

            /**
             * Sets [Builder.analytics] to an arbitrary JSON value.
             *
             * You should usually call [Builder.analytics] with a well-typed [Analytics] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun analytics(analytics: JsonField<Analytics>) = apply { this.analytics = analytics }

            fun endDate(endDate: Long) = endDate(JsonField.of(endDate))

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun endDate(endDate: JsonField<Long>) = apply { this.endDate = endDate }

            fun startDate(startDate: Long) = startDate(JsonField.of(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun startDate(startDate: JsonField<Long>) = apply { this.startDate = startDate }

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
             * Returns an immutable instance of [PreviousPeriod].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .analytics()
             * .endDate()
             * .startDate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PreviousPeriod =
                PreviousPeriod(
                    checkRequired("analytics", analytics),
                    checkRequired("endDate", endDate),
                    checkRequired("startDate", startDate),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PreviousPeriod = apply {
            if (validated) {
                return@apply
            }

            analytics().validate()
            endDate()
            startDate()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: GrowsurfInvalidDataException) {
                false
            }

        @JvmSynthetic
        internal fun validity(): Int =
            (analytics.asKnown().getOrNull()?.validity() ?: 0) +
                (if (endDate.asKnown().isPresent) 1 else 0) +
                (if (startDate.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PreviousPeriod &&
                analytics == other.analytics &&
                endDate == other.endDate &&
                startDate == other.startDate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(analytics, endDate, startDate, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PreviousPeriod{analytics=$analytics, endDate=$endDate, startDate=$startDate, additionalProperties=$additionalProperties}"
    }

    /** Derived referral rates, each a ratio in the range 0–1 (0 when its denominator is 0). */
    class Rates
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val participationRate: JsonField<Double>,
        private val referralConversionRate: JsonField<Double>,
        private val sharesPerParticipant: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("participationRate")
            @ExcludeMissing
            participationRate: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("referralConversionRate")
            @ExcludeMissing
            referralConversionRate: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("sharesPerParticipant")
            @ExcludeMissing
            sharesPerParticipant: JsonField<Double> = JsonMissing.of(),
        ) : this(participationRate, referralConversionRate, sharesPerParticipant, mutableMapOf())

        /**
         * `participants` divided by `uniqueImpressions`.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun participationRate(): Optional<Double> = participationRate.getOptional("participationRate")

        /**
         * `referrals` divided by `uniqueImpressions`.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun referralConversionRate(): Optional<Double> =
            referralConversionRate.getOptional("referralConversionRate")

        /**
         * Total shares across all channels divided by `participants`.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sharesPerParticipant(): Optional<Double> =
            sharesPerParticipant.getOptional("sharesPerParticipant")

        /**
         * Returns the raw JSON value of [participationRate].
         *
         * Unlike [participationRate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("participationRate")
        @ExcludeMissing
        fun _participationRate(): JsonField<Double> = participationRate

        /**
         * Returns the raw JSON value of [referralConversionRate].
         *
         * Unlike [referralConversionRate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("referralConversionRate")
        @ExcludeMissing
        fun _referralConversionRate(): JsonField<Double> = referralConversionRate

        /**
         * Returns the raw JSON value of [sharesPerParticipant].
         *
         * Unlike [sharesPerParticipant], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("sharesPerParticipant")
        @ExcludeMissing
        fun _sharesPerParticipant(): JsonField<Double> = sharesPerParticipant

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Rates]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Rates]. */
        class Builder internal constructor() {

            private var participationRate: JsonField<Double> = JsonMissing.of()
            private var referralConversionRate: JsonField<Double> = JsonMissing.of()
            private var sharesPerParticipant: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(rates: Rates) = apply {
                participationRate = rates.participationRate
                referralConversionRate = rates.referralConversionRate
                sharesPerParticipant = rates.sharesPerParticipant
                additionalProperties = rates.additionalProperties.toMutableMap()
            }

            /** `participants` divided by `uniqueImpressions`. */
            fun participationRate(participationRate: Double) =
                participationRate(JsonField.of(participationRate))

            /**
             * Sets [Builder.participationRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.participationRate] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun participationRate(participationRate: JsonField<Double>) = apply {
                this.participationRate = participationRate
            }

            /** `referrals` divided by `uniqueImpressions`. */
            fun referralConversionRate(referralConversionRate: Double) =
                referralConversionRate(JsonField.of(referralConversionRate))

            /**
             * Sets [Builder.referralConversionRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referralConversionRate] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun referralConversionRate(referralConversionRate: JsonField<Double>) = apply {
                this.referralConversionRate = referralConversionRate
            }

            /** Total shares across all channels divided by `participants`. */
            fun sharesPerParticipant(sharesPerParticipant: Double) =
                sharesPerParticipant(JsonField.of(sharesPerParticipant))

            /**
             * Sets [Builder.sharesPerParticipant] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sharesPerParticipant] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun sharesPerParticipant(sharesPerParticipant: JsonField<Double>) = apply {
                this.sharesPerParticipant = sharesPerParticipant
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
             * Returns an immutable instance of [Rates].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Rates =
                Rates(
                    participationRate,
                    referralConversionRate,
                    sharesPerParticipant,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Rates = apply {
            if (validated) {
                return@apply
            }

            participationRate()
            referralConversionRate()
            sharesPerParticipant()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: GrowsurfInvalidDataException) {
                false
            }

        @JvmSynthetic
        internal fun validity(): Int =
            (if (participationRate.asKnown().isPresent) 1 else 0) +
                (if (referralConversionRate.asKnown().isPresent) 1 else 0) +
                (if (sharesPerParticipant.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Rates &&
                participationRate == other.participationRate &&
                referralConversionRate == other.referralConversionRate &&
                sharesPerParticipant == other.sharesPerParticipant &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                participationRate,
                referralConversionRate,
                sharesPerParticipant,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Rates{participationRate=$participationRate, referralConversionRate=$referralConversionRate, sharesPerParticipant=$sharesPerParticipant, additionalProperties=$additionalProperties}"
    }

    /**
     * Status-count breakdowns. `rewardStatus` is present for every program; `affiliateStatus`,
     * `commissionStatus`, and `payoutStatus` are present only for affiliate programs. Money amounts
     * are in minor units of `currencyISO`.
     */
    class StatusCounts
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val affiliateStatus: JsonField<AffiliateStatus>,
        private val commissionStatus: JsonField<CommissionStatus>,
        private val currencyIso: JsonField<String>,
        private val payoutStatus: JsonField<PayoutStatus>,
        private val rewardStatus: JsonField<RewardStatus>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("affiliateStatus")
            @ExcludeMissing
            affiliateStatus: JsonField<AffiliateStatus> = JsonMissing.of(),
            @JsonProperty("commissionStatus")
            @ExcludeMissing
            commissionStatus: JsonField<CommissionStatus> = JsonMissing.of(),
            @JsonProperty("currencyISO")
            @ExcludeMissing
            currencyIso: JsonField<String> = JsonMissing.of(),
            @JsonProperty("payoutStatus")
            @ExcludeMissing
            payoutStatus: JsonField<PayoutStatus> = JsonMissing.of(),
            @JsonProperty("rewardStatus")
            @ExcludeMissing
            rewardStatus: JsonField<RewardStatus> = JsonMissing.of(),
        ) : this(
            affiliateStatus,
            commissionStatus,
            currencyIso,
            payoutStatus,
            rewardStatus,
            mutableMapOf(),
        )

        /**
         * Affiliate only. Participant counts keyed by affiliate status.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun affiliateStatus(): Optional<AffiliateStatus> =
            affiliateStatus.getOptional("affiliateStatus")

        /**
         * Affiliate only. Commission counts and amounts by status.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun commissionStatus(): Optional<CommissionStatus> =
            commissionStatus.getOptional("commissionStatus")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currencyIso(): Optional<String> = currencyIso.getOptional("currencyISO")

        /**
         * Affiliate only. Payout counts and amounts by status.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun payoutStatus(): Optional<PayoutStatus> = payoutStatus.getOptional("payoutStatus")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rewardStatus(): Optional<RewardStatus> = rewardStatus.getOptional("rewardStatus")

        /**
         * Returns the raw JSON value of [affiliateStatus].
         *
         * Unlike [affiliateStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("affiliateStatus")
        @ExcludeMissing
        fun _affiliateStatus(): JsonField<AffiliateStatus> = affiliateStatus

        /**
         * Returns the raw JSON value of [commissionStatus].
         *
         * Unlike [commissionStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("commissionStatus")
        @ExcludeMissing
        fun _commissionStatus(): JsonField<CommissionStatus> = commissionStatus

        /**
         * Returns the raw JSON value of [currencyIso].
         *
         * Unlike [currencyIso], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currencyISO")
        @ExcludeMissing
        fun _currencyIso(): JsonField<String> = currencyIso

        /**
         * Returns the raw JSON value of [payoutStatus].
         *
         * Unlike [payoutStatus], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payoutStatus")
        @ExcludeMissing
        fun _payoutStatus(): JsonField<PayoutStatus> = payoutStatus

        /**
         * Returns the raw JSON value of [rewardStatus].
         *
         * Unlike [rewardStatus], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rewardStatus")
        @ExcludeMissing
        fun _rewardStatus(): JsonField<RewardStatus> = rewardStatus

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [StatusCounts]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [StatusCounts]. */
        class Builder internal constructor() {

            private var affiliateStatus: JsonField<AffiliateStatus> = JsonMissing.of()
            private var commissionStatus: JsonField<CommissionStatus> = JsonMissing.of()
            private var currencyIso: JsonField<String> = JsonMissing.of()
            private var payoutStatus: JsonField<PayoutStatus> = JsonMissing.of()
            private var rewardStatus: JsonField<RewardStatus> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(statusCounts: StatusCounts) = apply {
                affiliateStatus = statusCounts.affiliateStatus
                commissionStatus = statusCounts.commissionStatus
                currencyIso = statusCounts.currencyIso
                payoutStatus = statusCounts.payoutStatus
                rewardStatus = statusCounts.rewardStatus
                additionalProperties = statusCounts.additionalProperties.toMutableMap()
            }

            /** Affiliate only. Participant counts keyed by affiliate status. */
            fun affiliateStatus(affiliateStatus: AffiliateStatus) =
                affiliateStatus(JsonField.of(affiliateStatus))

            /**
             * Sets [Builder.affiliateStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.affiliateStatus] with a well-typed [AffiliateStatus]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun affiliateStatus(affiliateStatus: JsonField<AffiliateStatus>) = apply {
                this.affiliateStatus = affiliateStatus
            }

            /** Affiliate only. Commission counts and amounts by status. */
            fun commissionStatus(commissionStatus: CommissionStatus) =
                commissionStatus(JsonField.of(commissionStatus))

            /**
             * Sets [Builder.commissionStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commissionStatus] with a well-typed
             * [CommissionStatus] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun commissionStatus(commissionStatus: JsonField<CommissionStatus>) = apply {
                this.commissionStatus = commissionStatus
            }

            fun currencyIso(currencyIso: String) = currencyIso(JsonField.of(currencyIso))

            /**
             * Sets [Builder.currencyIso] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currencyIso] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currencyIso(currencyIso: JsonField<String>) = apply {
                this.currencyIso = currencyIso
            }

            /** Affiliate only. Payout counts and amounts by status. */
            fun payoutStatus(payoutStatus: PayoutStatus) = payoutStatus(JsonField.of(payoutStatus))

            /**
             * Sets [Builder.payoutStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payoutStatus] with a well-typed [PayoutStatus] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payoutStatus(payoutStatus: JsonField<PayoutStatus>) = apply {
                this.payoutStatus = payoutStatus
            }

            fun rewardStatus(rewardStatus: RewardStatus) = rewardStatus(JsonField.of(rewardStatus))

            /**
             * Sets [Builder.rewardStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rewardStatus] with a well-typed [RewardStatus] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rewardStatus(rewardStatus: JsonField<RewardStatus>) = apply {
                this.rewardStatus = rewardStatus
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
             * Returns an immutable instance of [StatusCounts].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): StatusCounts =
                StatusCounts(
                    affiliateStatus,
                    commissionStatus,
                    currencyIso,
                    payoutStatus,
                    rewardStatus,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): StatusCounts = apply {
            if (validated) {
                return@apply
            }

            affiliateStatus().ifPresent { it.validate() }
            commissionStatus().ifPresent { it.validate() }
            currencyIso()
            payoutStatus().ifPresent { it.validate() }
            rewardStatus().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: GrowsurfInvalidDataException) {
                false
            }

        @JvmSynthetic
        internal fun validity(): Int =
            (affiliateStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (commissionStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (if (currencyIso.asKnown().isPresent) 1 else 0) +
                (payoutStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (rewardStatus.asKnown().getOrNull()?.validity() ?: 0)

        /** Affiliate only. Participant counts keyed by affiliate status. */
        class AffiliateStatus
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [AffiliateStatus]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AffiliateStatus]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(affiliateStatus: AffiliateStatus) = apply {
                    additionalProperties = affiliateStatus.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [AffiliateStatus].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): AffiliateStatus = AffiliateStatus(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): AffiliateStatus = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: GrowsurfInvalidDataException) {
                    false
                }

            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AffiliateStatus && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "AffiliateStatus{additionalProperties=$additionalProperties}"
        }

        /** Affiliate only. Commission counts and amounts by status. */
        class CommissionStatus
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val approved: JsonField<CommissionStatusMetric>,
            private val paid: JsonField<CommissionStatusMetric>,
            private val pending: JsonField<CommissionStatusMetric>,
            private val reversed: JsonField<CommissionStatusMetric>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("approved")
                @ExcludeMissing
                approved: JsonField<CommissionStatusMetric> = JsonMissing.of(),
                @JsonProperty("paid")
                @ExcludeMissing
                paid: JsonField<CommissionStatusMetric> = JsonMissing.of(),
                @JsonProperty("pending")
                @ExcludeMissing
                pending: JsonField<CommissionStatusMetric> = JsonMissing.of(),
                @JsonProperty("reversed")
                @ExcludeMissing
                reversed: JsonField<CommissionStatusMetric> = JsonMissing.of(),
            ) : this(approved, paid, pending, reversed, mutableMapOf())

            /**
             * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun approved(): Optional<CommissionStatusMetric> = approved.getOptional("approved")

            /**
             * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun paid(): Optional<CommissionStatusMetric> = paid.getOptional("paid")

            /**
             * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun pending(): Optional<CommissionStatusMetric> = pending.getOptional("pending")

            /**
             * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun reversed(): Optional<CommissionStatusMetric> = reversed.getOptional("reversed")

            /**
             * Returns the raw JSON value of [approved].
             *
             * Unlike [approved], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("approved")
            @ExcludeMissing
            fun _approved(): JsonField<CommissionStatusMetric> = approved

            /**
             * Returns the raw JSON value of [paid].
             *
             * Unlike [paid], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("paid")
            @ExcludeMissing
            fun _paid(): JsonField<CommissionStatusMetric> = paid

            /**
             * Returns the raw JSON value of [pending].
             *
             * Unlike [pending], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("pending")
            @ExcludeMissing
            fun _pending(): JsonField<CommissionStatusMetric> = pending

            /**
             * Returns the raw JSON value of [reversed].
             *
             * Unlike [reversed], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reversed")
            @ExcludeMissing
            fun _reversed(): JsonField<CommissionStatusMetric> = reversed

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [CommissionStatus]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CommissionStatus]. */
            class Builder internal constructor() {

                private var approved: JsonField<CommissionStatusMetric> = JsonMissing.of()
                private var paid: JsonField<CommissionStatusMetric> = JsonMissing.of()
                private var pending: JsonField<CommissionStatusMetric> = JsonMissing.of()
                private var reversed: JsonField<CommissionStatusMetric> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(commissionStatus: CommissionStatus) = apply {
                    approved = commissionStatus.approved
                    paid = commissionStatus.paid
                    pending = commissionStatus.pending
                    reversed = commissionStatus.reversed
                    additionalProperties = commissionStatus.additionalProperties.toMutableMap()
                }

                fun approved(approved: CommissionStatusMetric) = approved(JsonField.of(approved))

                /**
                 * Sets [Builder.approved] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.approved] with a well-typed
                 * [CommissionStatusMetric] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun approved(approved: JsonField<CommissionStatusMetric>) = apply {
                    this.approved = approved
                }

                fun paid(paid: CommissionStatusMetric) = paid(JsonField.of(paid))

                /**
                 * Sets [Builder.paid] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paid] with a well-typed [CommissionStatusMetric]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun paid(paid: JsonField<CommissionStatusMetric>) = apply { this.paid = paid }

                fun pending(pending: CommissionStatusMetric) = pending(JsonField.of(pending))

                /**
                 * Sets [Builder.pending] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pending] with a well-typed
                 * [CommissionStatusMetric] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun pending(pending: JsonField<CommissionStatusMetric>) = apply {
                    this.pending = pending
                }

                fun reversed(reversed: CommissionStatusMetric) = reversed(JsonField.of(reversed))

                /**
                 * Sets [Builder.reversed] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reversed] with a well-typed
                 * [CommissionStatusMetric] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun reversed(reversed: JsonField<CommissionStatusMetric>) = apply {
                    this.reversed = reversed
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [CommissionStatus].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CommissionStatus =
                    CommissionStatus(
                        approved,
                        paid,
                        pending,
                        reversed,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CommissionStatus = apply {
                if (validated) {
                    return@apply
                }

                approved().ifPresent { it.validate() }
                paid().ifPresent { it.validate() }
                pending().ifPresent { it.validate() }
                reversed().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: GrowsurfInvalidDataException) {
                    false
                }

            @JvmSynthetic
            internal fun validity(): Int =
                (approved.asKnown().getOrNull()?.validity() ?: 0) +
                    (paid.asKnown().getOrNull()?.validity() ?: 0) +
                    (pending.asKnown().getOrNull()?.validity() ?: 0) +
                    (reversed.asKnown().getOrNull()?.validity() ?: 0)

            class CommissionStatusMetric
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val count: JsonField<Long>,
                private val totalAmount: JsonField<Long>,
                private val totalRevenue: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("count") @ExcludeMissing count: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("totalAmount")
                    @ExcludeMissing
                    totalAmount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("totalRevenue")
                    @ExcludeMissing
                    totalRevenue: JsonField<Long> = JsonMissing.of(),
                ) : this(count, totalAmount, totalRevenue, mutableMapOf())

                /**
                 * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun count(): Optional<Long> = count.getOptional("count")

                /**
                 * Total commission amount in minor currency units.
                 *
                 * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun totalAmount(): Optional<Long> = totalAmount.getOptional("totalAmount")

                /**
                 * Total attributed revenue in minor currency units.
                 *
                 * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun totalRevenue(): Optional<Long> = totalRevenue.getOptional("totalRevenue")

                /**
                 * Returns the raw JSON value of [count].
                 *
                 * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Long> = count

                /**
                 * Returns the raw JSON value of [totalAmount].
                 *
                 * Unlike [totalAmount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("totalAmount")
                @ExcludeMissing
                fun _totalAmount(): JsonField<Long> = totalAmount

                /**
                 * Returns the raw JSON value of [totalRevenue].
                 *
                 * Unlike [totalRevenue], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("totalRevenue")
                @ExcludeMissing
                fun _totalRevenue(): JsonField<Long> = totalRevenue

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [CommissionStatusMetric].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CommissionStatusMetric]. */
                class Builder internal constructor() {

                    private var count: JsonField<Long> = JsonMissing.of()
                    private var totalAmount: JsonField<Long> = JsonMissing.of()
                    private var totalRevenue: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(commissionStatusMetric: CommissionStatusMetric) = apply {
                        count = commissionStatusMetric.count
                        totalAmount = commissionStatusMetric.totalAmount
                        totalRevenue = commissionStatusMetric.totalRevenue
                        additionalProperties =
                            commissionStatusMetric.additionalProperties.toMutableMap()
                    }

                    fun count(count: Long) = count(JsonField.of(count))

                    /**
                     * Sets [Builder.count] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.count] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun count(count: JsonField<Long>) = apply { this.count = count }

                    /** Total commission amount in minor currency units. */
                    fun totalAmount(totalAmount: Long) = totalAmount(JsonField.of(totalAmount))

                    /**
                     * Sets [Builder.totalAmount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalAmount] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun totalAmount(totalAmount: JsonField<Long>) = apply {
                        this.totalAmount = totalAmount
                    }

                    /** Total attributed revenue in minor currency units. */
                    fun totalRevenue(totalRevenue: Long) = totalRevenue(JsonField.of(totalRevenue))

                    /**
                     * Sets [Builder.totalRevenue] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalRevenue] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun totalRevenue(totalRevenue: JsonField<Long>) = apply {
                        this.totalRevenue = totalRevenue
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [CommissionStatusMetric].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): CommissionStatusMetric =
                        CommissionStatusMetric(
                            count,
                            totalAmount,
                            totalRevenue,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): CommissionStatusMetric = apply {
                    if (validated) {
                        return@apply
                    }

                    count()
                    totalAmount()
                    totalRevenue()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: GrowsurfInvalidDataException) {
                        false
                    }

                @JvmSynthetic
                internal fun validity(): Int =
                    (if (count.asKnown().isPresent) 1 else 0) +
                        (if (totalAmount.asKnown().isPresent) 1 else 0) +
                        (if (totalRevenue.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CommissionStatusMetric &&
                        count == other.count &&
                        totalAmount == other.totalAmount &&
                        totalRevenue == other.totalRevenue &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(count, totalAmount, totalRevenue, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CommissionStatusMetric{count=$count, totalAmount=$totalAmount, totalRevenue=$totalRevenue, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CommissionStatus &&
                    approved == other.approved &&
                    paid == other.paid &&
                    pending == other.pending &&
                    reversed == other.reversed &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(approved, paid, pending, reversed, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CommissionStatus{approved=$approved, paid=$paid, pending=$pending, reversed=$reversed, additionalProperties=$additionalProperties}"
        }

        /** Affiliate only. Payout counts and amounts by status. */
        class PayoutStatus
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val failed: JsonField<PayoutStatusMetric>,
            private val issued: JsonField<PayoutStatusMetric>,
            private val queued: JsonField<PayoutStatusMetric>,
            private val upcoming: JsonField<PayoutStatusMetric>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("failed")
                @ExcludeMissing
                failed: JsonField<PayoutStatusMetric> = JsonMissing.of(),
                @JsonProperty("issued")
                @ExcludeMissing
                issued: JsonField<PayoutStatusMetric> = JsonMissing.of(),
                @JsonProperty("queued")
                @ExcludeMissing
                queued: JsonField<PayoutStatusMetric> = JsonMissing.of(),
                @JsonProperty("upcoming")
                @ExcludeMissing
                upcoming: JsonField<PayoutStatusMetric> = JsonMissing.of(),
            ) : this(failed, issued, queued, upcoming, mutableMapOf())

            /**
             * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun failed(): Optional<PayoutStatusMetric> = failed.getOptional("failed")

            /**
             * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun issued(): Optional<PayoutStatusMetric> = issued.getOptional("issued")

            /**
             * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun queued(): Optional<PayoutStatusMetric> = queued.getOptional("queued")

            /**
             * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun upcoming(): Optional<PayoutStatusMetric> = upcoming.getOptional("upcoming")

            /**
             * Returns the raw JSON value of [failed].
             *
             * Unlike [failed], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("failed")
            @ExcludeMissing
            fun _failed(): JsonField<PayoutStatusMetric> = failed

            /**
             * Returns the raw JSON value of [issued].
             *
             * Unlike [issued], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("issued")
            @ExcludeMissing
            fun _issued(): JsonField<PayoutStatusMetric> = issued

            /**
             * Returns the raw JSON value of [queued].
             *
             * Unlike [queued], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("queued")
            @ExcludeMissing
            fun _queued(): JsonField<PayoutStatusMetric> = queued

            /**
             * Returns the raw JSON value of [upcoming].
             *
             * Unlike [upcoming], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("upcoming")
            @ExcludeMissing
            fun _upcoming(): JsonField<PayoutStatusMetric> = upcoming

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [PayoutStatus]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PayoutStatus]. */
            class Builder internal constructor() {

                private var failed: JsonField<PayoutStatusMetric> = JsonMissing.of()
                private var issued: JsonField<PayoutStatusMetric> = JsonMissing.of()
                private var queued: JsonField<PayoutStatusMetric> = JsonMissing.of()
                private var upcoming: JsonField<PayoutStatusMetric> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(payoutStatus: PayoutStatus) = apply {
                    failed = payoutStatus.failed
                    issued = payoutStatus.issued
                    queued = payoutStatus.queued
                    upcoming = payoutStatus.upcoming
                    additionalProperties = payoutStatus.additionalProperties.toMutableMap()
                }

                fun failed(failed: PayoutStatusMetric) = failed(JsonField.of(failed))

                /**
                 * Sets [Builder.failed] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.failed] with a well-typed [PayoutStatusMetric]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun failed(failed: JsonField<PayoutStatusMetric>) = apply { this.failed = failed }

                fun issued(issued: PayoutStatusMetric) = issued(JsonField.of(issued))

                /**
                 * Sets [Builder.issued] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.issued] with a well-typed [PayoutStatusMetric]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun issued(issued: JsonField<PayoutStatusMetric>) = apply { this.issued = issued }

                fun queued(queued: PayoutStatusMetric) = queued(JsonField.of(queued))

                /**
                 * Sets [Builder.queued] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.queued] with a well-typed [PayoutStatusMetric]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun queued(queued: JsonField<PayoutStatusMetric>) = apply { this.queued = queued }

                fun upcoming(upcoming: PayoutStatusMetric) = upcoming(JsonField.of(upcoming))

                /**
                 * Sets [Builder.upcoming] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.upcoming] with a well-typed [PayoutStatusMetric]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun upcoming(upcoming: JsonField<PayoutStatusMetric>) = apply {
                    this.upcoming = upcoming
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [PayoutStatus].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PayoutStatus =
                    PayoutStatus(
                        failed,
                        issued,
                        queued,
                        upcoming,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PayoutStatus = apply {
                if (validated) {
                    return@apply
                }

                failed().ifPresent { it.validate() }
                issued().ifPresent { it.validate() }
                queued().ifPresent { it.validate() }
                upcoming().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: GrowsurfInvalidDataException) {
                    false
                }

            @JvmSynthetic
            internal fun validity(): Int =
                (failed.asKnown().getOrNull()?.validity() ?: 0) +
                    (issued.asKnown().getOrNull()?.validity() ?: 0) +
                    (queued.asKnown().getOrNull()?.validity() ?: 0) +
                    (upcoming.asKnown().getOrNull()?.validity() ?: 0)

            class PayoutStatusMetric
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val count: JsonField<Long>,
                private val totalAmount: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("count") @ExcludeMissing count: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("totalAmount")
                    @ExcludeMissing
                    totalAmount: JsonField<Long> = JsonMissing.of(),
                ) : this(count, totalAmount, mutableMapOf())

                /**
                 * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun count(): Optional<Long> = count.getOptional("count")

                /**
                 * Total payout amount in minor currency units.
                 *
                 * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun totalAmount(): Optional<Long> = totalAmount.getOptional("totalAmount")

                /**
                 * Returns the raw JSON value of [count].
                 *
                 * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Long> = count

                /**
                 * Returns the raw JSON value of [totalAmount].
                 *
                 * Unlike [totalAmount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("totalAmount")
                @ExcludeMissing
                fun _totalAmount(): JsonField<Long> = totalAmount

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [PayoutStatusMetric].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PayoutStatusMetric]. */
                class Builder internal constructor() {

                    private var count: JsonField<Long> = JsonMissing.of()
                    private var totalAmount: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(payoutStatusMetric: PayoutStatusMetric) = apply {
                        count = payoutStatusMetric.count
                        totalAmount = payoutStatusMetric.totalAmount
                        additionalProperties =
                            payoutStatusMetric.additionalProperties.toMutableMap()
                    }

                    fun count(count: Long) = count(JsonField.of(count))

                    /**
                     * Sets [Builder.count] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.count] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun count(count: JsonField<Long>) = apply { this.count = count }

                    /** Total payout amount in minor currency units. */
                    fun totalAmount(totalAmount: Long) = totalAmount(JsonField.of(totalAmount))

                    /**
                     * Sets [Builder.totalAmount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalAmount] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun totalAmount(totalAmount: JsonField<Long>) = apply {
                        this.totalAmount = totalAmount
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [PayoutStatusMetric].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): PayoutStatusMetric =
                        PayoutStatusMetric(count, totalAmount, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): PayoutStatusMetric = apply {
                    if (validated) {
                        return@apply
                    }

                    count()
                    totalAmount()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: GrowsurfInvalidDataException) {
                        false
                    }

                @JvmSynthetic
                internal fun validity(): Int =
                    (if (count.asKnown().isPresent) 1 else 0) +
                        (if (totalAmount.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PayoutStatusMetric &&
                        count == other.count &&
                        totalAmount == other.totalAmount &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(count, totalAmount, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PayoutStatusMetric{count=$count, totalAmount=$totalAmount, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PayoutStatus &&
                    failed == other.failed &&
                    issued == other.issued &&
                    queued == other.queued &&
                    upcoming == other.upcoming &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(failed, issued, queued, upcoming, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PayoutStatus{failed=$failed, issued=$issued, queued=$queued, upcoming=$upcoming, additionalProperties=$additionalProperties}"
        }

        /** Affiliate only. Reward counts by status. */
        class RewardStatus
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val approved: JsonField<Long>,
            private val pending: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("approved")
                @ExcludeMissing
                approved: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("pending")
                @ExcludeMissing
                pending: JsonField<Long> = JsonMissing.of(),
            ) : this(approved, pending, mutableMapOf())

            /**
             * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun approved(): Optional<Long> = approved.getOptional("approved")

            /**
             * Unapproved rewards awaiting fulfillment.
             *
             * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun pending(): Optional<Long> = pending.getOptional("pending")

            /**
             * Returns the raw JSON value of [approved].
             *
             * Unlike [approved], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("approved") @ExcludeMissing fun _approved(): JsonField<Long> = approved

            /**
             * Returns the raw JSON value of [pending].
             *
             * Unlike [pending], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("pending") @ExcludeMissing fun _pending(): JsonField<Long> = pending

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [RewardStatus]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RewardStatus]. */
            class Builder internal constructor() {

                private var approved: JsonField<Long> = JsonMissing.of()
                private var pending: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(rewardStatus: RewardStatus) = apply {
                    approved = rewardStatus.approved
                    pending = rewardStatus.pending
                    additionalProperties = rewardStatus.additionalProperties.toMutableMap()
                }

                fun approved(approved: Long) = approved(JsonField.of(approved))

                /**
                 * Sets [Builder.approved] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.approved] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun approved(approved: JsonField<Long>) = apply { this.approved = approved }

                /** Unapproved rewards awaiting fulfillment. */
                fun pending(pending: Long) = pending(JsonField.of(pending))

                /**
                 * Sets [Builder.pending] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pending] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun pending(pending: JsonField<Long>) = apply { this.pending = pending }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [RewardStatus].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): RewardStatus =
                    RewardStatus(approved, pending, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): RewardStatus = apply {
                if (validated) {
                    return@apply
                }

                approved()
                pending()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: GrowsurfInvalidDataException) {
                    false
                }

            @JvmSynthetic
            internal fun validity(): Int =
                (if (approved.asKnown().isPresent) 1 else 0) +
                    (if (pending.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RewardStatus &&
                    approved == other.approved &&
                    pending == other.pending &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(approved, pending, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RewardStatus{approved=$approved, pending=$pending, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is StatusCounts &&
                affiliateStatus == other.affiliateStatus &&
                commissionStatus == other.commissionStatus &&
                currencyIso == other.currencyIso &&
                payoutStatus == other.payoutStatus &&
                rewardStatus == other.rewardStatus &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                affiliateStatus,
                commissionStatus,
                currencyIso,
                payoutStatus,
                rewardStatus,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "StatusCounts{affiliateStatus=$affiliateStatus, commissionStatus=$commissionStatus, currencyIso=$currencyIso, payoutStatus=$payoutStatus, rewardStatus=$rewardStatus, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CampaignRetrieveAnalyticsResponse &&
            analytics == other.analytics &&
            endDate == other.endDate &&
            previousPeriod == other.previousPeriod &&
            rates == other.rates &&
            series == other.series &&
            startDate == other.startDate &&
            statusCounts == other.statusCounts &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            analytics,
            endDate,
            previousPeriod,
            rates,
            series,
            startDate,
            statusCounts,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CampaignRetrieveAnalyticsResponse{analytics=$analytics, endDate=$endDate, previousPeriod=$previousPeriod, rates=$rates, series=$series, startDate=$startDate, statusCounts=$statusCounts, additionalProperties=$additionalProperties}"
}
