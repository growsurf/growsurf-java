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
import com.growsurf.api.core.checkRequired
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
    private val startDate: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("analytics")
        @ExcludeMissing
        analytics: JsonField<Analytics> = JsonMissing.of(),
        @JsonProperty("endDate") @ExcludeMissing endDate: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("startDate") @ExcludeMissing startDate: JsonField<Long> = JsonMissing.of(),
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
    @JsonProperty("analytics") @ExcludeMissing fun _analytics(): JsonField<Analytics> = analytics

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
        private var startDate: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(campaignRetrieveAnalyticsResponse: CampaignRetrieveAnalyticsResponse) =
            apply {
                analytics = campaignRetrieveAnalyticsResponse.analytics
                endDate = campaignRetrieveAnalyticsResponse.endDate
                startDate = campaignRetrieveAnalyticsResponse.startDate
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

        fun startDate(startDate: Long) = startDate(JsonField.of(startDate))

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
                checkRequired("startDate", startDate),
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

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (analytics.asKnown().getOrNull()?.validity() ?: 0) +
            (if (endDate.asKnown().isPresent) 1 else 0) +
            (if (startDate.asKnown().isPresent) 1 else 0)

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CampaignRetrieveAnalyticsResponse &&
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
        "CampaignRetrieveAnalyticsResponse{analytics=$analytics, endDate=$endDate, startDate=$startDate, additionalProperties=$additionalProperties}"
}
