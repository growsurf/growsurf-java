// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

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

class Participant
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val email: JsonField<String>,
    private val monthlyRank: JsonField<Long>,
    private val monthlyReferralCount: JsonField<Long>,
    private val rank: JsonField<Long>,
    private val referralCount: JsonField<Long>,
    private val rewards: JsonField<List<ParticipantReward>>,
    private val shareUrl: JsonField<String>,
    private val allMatchingFraudsters: JsonField<List<AllMatchingFraudster>>,
    private val createdAt: JsonField<Long>,
    private val fingerprint: JsonField<String>,
    private val firstName: JsonField<String>,
    private val fraudReasonCode: JsonField<String>,
    private val fraudRiskLevel: JsonField<FraudRiskLevel>,
    private val impressionCount: JsonField<Long>,
    private val inviteCount: JsonField<Long>,
    private val ipAddress: JsonField<String>,
    private val isNew: JsonField<Boolean>,
    private val isWinner: JsonField<Boolean>,
    private val lastName: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val monthlyReferrals: JsonField<List<String>>,
    private val notes: JsonField<String>,
    private val paypalEmailAddress: JsonField<String>,
    private val prevMonthlyRank: JsonField<Long>,
    private val prevMonthlyReferralCount: JsonField<Long>,
    private val referrals: JsonField<List<String>>,
    private val referralSource: JsonField<ReferralSource>,
    private val referralStatus: JsonField<ReferralStatus>,
    private val referredBy: JsonField<String>,
    private val referrer: JsonField<Referrer>,
    private val shareCount: JsonField<ShareCount>,
    private val uniqueImpressionCount: JsonField<Long>,
    private val unreadCommissionsCount: JsonField<Long>,
    private val unreadPayoutsCount: JsonField<Long>,
    private val unsubscribed: JsonField<Boolean>,
    private val vanityKeys: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("monthlyRank")
        @ExcludeMissing
        monthlyRank: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("monthlyReferralCount")
        @ExcludeMissing
        monthlyReferralCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("rank") @ExcludeMissing rank: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("referralCount")
        @ExcludeMissing
        referralCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("rewards")
        @ExcludeMissing
        rewards: JsonField<List<ParticipantReward>> = JsonMissing.of(),
        @JsonProperty("shareUrl") @ExcludeMissing shareUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("allMatchingFraudsters")
        @ExcludeMissing
        allMatchingFraudsters: JsonField<List<AllMatchingFraudster>> = JsonMissing.of(),
        @JsonProperty("createdAt") @ExcludeMissing createdAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("fingerprint")
        @ExcludeMissing
        fingerprint: JsonField<String> = JsonMissing.of(),
        @JsonProperty("firstName") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fraudReasonCode")
        @ExcludeMissing
        fraudReasonCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fraudRiskLevel")
        @ExcludeMissing
        fraudRiskLevel: JsonField<FraudRiskLevel> = JsonMissing.of(),
        @JsonProperty("impressionCount")
        @ExcludeMissing
        impressionCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("inviteCount")
        @ExcludeMissing
        inviteCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("ipAddress") @ExcludeMissing ipAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("isNew") @ExcludeMissing isNew: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isWinner") @ExcludeMissing isWinner: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("lastName") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("monthlyReferrals")
        @ExcludeMissing
        monthlyReferrals: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("paypalEmailAddress")
        @ExcludeMissing
        paypalEmailAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prevMonthlyRank")
        @ExcludeMissing
        prevMonthlyRank: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("prevMonthlyReferralCount")
        @ExcludeMissing
        prevMonthlyReferralCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("referrals")
        @ExcludeMissing
        referrals: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("referralSource")
        @ExcludeMissing
        referralSource: JsonField<ReferralSource> = JsonMissing.of(),
        @JsonProperty("referralStatus")
        @ExcludeMissing
        referralStatus: JsonField<ReferralStatus> = JsonMissing.of(),
        @JsonProperty("referredBy")
        @ExcludeMissing
        referredBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("referrer") @ExcludeMissing referrer: JsonField<Referrer> = JsonMissing.of(),
        @JsonProperty("shareCount")
        @ExcludeMissing
        shareCount: JsonField<ShareCount> = JsonMissing.of(),
        @JsonProperty("uniqueImpressionCount")
        @ExcludeMissing
        uniqueImpressionCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("unreadCommissionsCount")
        @ExcludeMissing
        unreadCommissionsCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("unreadPayoutsCount")
        @ExcludeMissing
        unreadPayoutsCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("unsubscribed")
        @ExcludeMissing
        unsubscribed: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("vanityKeys")
        @ExcludeMissing
        vanityKeys: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        id,
        email,
        monthlyRank,
        monthlyReferralCount,
        rank,
        referralCount,
        rewards,
        shareUrl,
        allMatchingFraudsters,
        createdAt,
        fingerprint,
        firstName,
        fraudReasonCode,
        fraudRiskLevel,
        impressionCount,
        inviteCount,
        ipAddress,
        isNew,
        isWinner,
        lastName,
        metadata,
        monthlyReferrals,
        notes,
        paypalEmailAddress,
        prevMonthlyRank,
        prevMonthlyReferralCount,
        referrals,
        referralSource,
        referralStatus,
        referredBy,
        referrer,
        shareCount,
        uniqueImpressionCount,
        unreadCommissionsCount,
        unreadPayoutsCount,
        unsubscribed,
        vanityKeys,
        mutableMapOf(),
    )

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun email(): String = email.getRequired("email")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun monthlyRank(): Long = monthlyRank.getRequired("monthlyRank")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun monthlyReferralCount(): Long = monthlyReferralCount.getRequired("monthlyReferralCount")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rank(): Long = rank.getRequired("rank")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun referralCount(): Long = referralCount.getRequired("referralCount")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rewards(): List<ParticipantReward> = rewards.getRequired("rewards")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun shareUrl(): String = shareUrl.getRequired("shareUrl")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allMatchingFraudsters(): Optional<List<AllMatchingFraudster>> =
        allMatchingFraudsters.getOptional("allMatchingFraudsters")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<Long> = createdAt.getOptional("createdAt")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fingerprint(): Optional<String> = fingerprint.getOptional("fingerprint")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstName(): Optional<String> = firstName.getOptional("firstName")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fraudReasonCode(): Optional<String> = fraudReasonCode.getOptional("fraudReasonCode")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fraudRiskLevel(): Optional<FraudRiskLevel> = fraudRiskLevel.getOptional("fraudRiskLevel")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun impressionCount(): Optional<Long> = impressionCount.getOptional("impressionCount")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inviteCount(): Optional<Long> = inviteCount.getOptional("inviteCount")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ipAddress(): Optional<String> = ipAddress.getOptional("ipAddress")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isNew(): Optional<Boolean> = isNew.getOptional("isNew")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isWinner(): Optional<Boolean> = isWinner.getOptional("isWinner")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastName(): Optional<String> = lastName.getOptional("lastName")

    /**
     * Shallow custom metadata object.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun monthlyReferrals(): Optional<List<String>> =
        monthlyReferrals.getOptional("monthlyReferrals")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun notes(): Optional<String> = notes.getOptional("notes")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun paypalEmailAddress(): Optional<String> =
        paypalEmailAddress.getOptional("paypalEmailAddress")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prevMonthlyRank(): Optional<Long> = prevMonthlyRank.getOptional("prevMonthlyRank")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prevMonthlyReferralCount(): Optional<Long> =
        prevMonthlyReferralCount.getOptional("prevMonthlyReferralCount")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referrals(): Optional<List<String>> = referrals.getOptional("referrals")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referralSource(): Optional<ReferralSource> = referralSource.getOptional("referralSource")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referralStatus(): Optional<ReferralStatus> = referralStatus.getOptional("referralStatus")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referredBy(): Optional<String> = referredBy.getOptional("referredBy")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referrer(): Optional<Referrer> = referrer.getOptional("referrer")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun shareCount(): Optional<ShareCount> = shareCount.getOptional("shareCount")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uniqueImpressionCount(): Optional<Long> =
        uniqueImpressionCount.getOptional("uniqueImpressionCount")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun unreadCommissionsCount(): Optional<Long> =
        unreadCommissionsCount.getOptional("unreadCommissionsCount")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun unreadPayoutsCount(): Optional<Long> = unreadPayoutsCount.getOptional("unreadPayoutsCount")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun unsubscribed(): Optional<Boolean> = unsubscribed.getOptional("unsubscribed")

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vanityKeys(): Optional<List<String>> = vanityKeys.getOptional("vanityKeys")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [monthlyRank].
     *
     * Unlike [monthlyRank], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("monthlyRank") @ExcludeMissing fun _monthlyRank(): JsonField<Long> = monthlyRank

    /**
     * Returns the raw JSON value of [monthlyReferralCount].
     *
     * Unlike [monthlyReferralCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("monthlyReferralCount")
    @ExcludeMissing
    fun _monthlyReferralCount(): JsonField<Long> = monthlyReferralCount

    /**
     * Returns the raw JSON value of [rank].
     *
     * Unlike [rank], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rank") @ExcludeMissing fun _rank(): JsonField<Long> = rank

    /**
     * Returns the raw JSON value of [referralCount].
     *
     * Unlike [referralCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("referralCount")
    @ExcludeMissing
    fun _referralCount(): JsonField<Long> = referralCount

    /**
     * Returns the raw JSON value of [rewards].
     *
     * Unlike [rewards], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rewards")
    @ExcludeMissing
    fun _rewards(): JsonField<List<ParticipantReward>> = rewards

    /**
     * Returns the raw JSON value of [shareUrl].
     *
     * Unlike [shareUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shareUrl") @ExcludeMissing fun _shareUrl(): JsonField<String> = shareUrl

    /**
     * Returns the raw JSON value of [allMatchingFraudsters].
     *
     * Unlike [allMatchingFraudsters], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("allMatchingFraudsters")
    @ExcludeMissing
    fun _allMatchingFraudsters(): JsonField<List<AllMatchingFraudster>> = allMatchingFraudsters

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt") @ExcludeMissing fun _createdAt(): JsonField<Long> = createdAt

    /**
     * Returns the raw JSON value of [fingerprint].
     *
     * Unlike [fingerprint], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fingerprint") @ExcludeMissing fun _fingerprint(): JsonField<String> = fingerprint

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("firstName") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

    /**
     * Returns the raw JSON value of [fraudReasonCode].
     *
     * Unlike [fraudReasonCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fraudReasonCode")
    @ExcludeMissing
    fun _fraudReasonCode(): JsonField<String> = fraudReasonCode

    /**
     * Returns the raw JSON value of [fraudRiskLevel].
     *
     * Unlike [fraudRiskLevel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fraudRiskLevel")
    @ExcludeMissing
    fun _fraudRiskLevel(): JsonField<FraudRiskLevel> = fraudRiskLevel

    /**
     * Returns the raw JSON value of [impressionCount].
     *
     * Unlike [impressionCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("impressionCount")
    @ExcludeMissing
    fun _impressionCount(): JsonField<Long> = impressionCount

    /**
     * Returns the raw JSON value of [inviteCount].
     *
     * Unlike [inviteCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inviteCount") @ExcludeMissing fun _inviteCount(): JsonField<Long> = inviteCount

    /**
     * Returns the raw JSON value of [ipAddress].
     *
     * Unlike [ipAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ipAddress") @ExcludeMissing fun _ipAddress(): JsonField<String> = ipAddress

    /**
     * Returns the raw JSON value of [isNew].
     *
     * Unlike [isNew], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isNew") @ExcludeMissing fun _isNew(): JsonField<Boolean> = isNew

    /**
     * Returns the raw JSON value of [isWinner].
     *
     * Unlike [isWinner], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isWinner") @ExcludeMissing fun _isWinner(): JsonField<Boolean> = isWinner

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastName") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [monthlyReferrals].
     *
     * Unlike [monthlyReferrals], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("monthlyReferrals")
    @ExcludeMissing
    fun _monthlyReferrals(): JsonField<List<String>> = monthlyReferrals

    /**
     * Returns the raw JSON value of [notes].
     *
     * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

    /**
     * Returns the raw JSON value of [paypalEmailAddress].
     *
     * Unlike [paypalEmailAddress], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("paypalEmailAddress")
    @ExcludeMissing
    fun _paypalEmailAddress(): JsonField<String> = paypalEmailAddress

    /**
     * Returns the raw JSON value of [prevMonthlyRank].
     *
     * Unlike [prevMonthlyRank], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prevMonthlyRank")
    @ExcludeMissing
    fun _prevMonthlyRank(): JsonField<Long> = prevMonthlyRank

    /**
     * Returns the raw JSON value of [prevMonthlyReferralCount].
     *
     * Unlike [prevMonthlyReferralCount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("prevMonthlyReferralCount")
    @ExcludeMissing
    fun _prevMonthlyReferralCount(): JsonField<Long> = prevMonthlyReferralCount

    /**
     * Returns the raw JSON value of [referrals].
     *
     * Unlike [referrals], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("referrals") @ExcludeMissing fun _referrals(): JsonField<List<String>> = referrals

    /**
     * Returns the raw JSON value of [referralSource].
     *
     * Unlike [referralSource], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("referralSource")
    @ExcludeMissing
    fun _referralSource(): JsonField<ReferralSource> = referralSource

    /**
     * Returns the raw JSON value of [referralStatus].
     *
     * Unlike [referralStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("referralStatus")
    @ExcludeMissing
    fun _referralStatus(): JsonField<ReferralStatus> = referralStatus

    /**
     * Returns the raw JSON value of [referredBy].
     *
     * Unlike [referredBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("referredBy") @ExcludeMissing fun _referredBy(): JsonField<String> = referredBy

    /**
     * Returns the raw JSON value of [referrer].
     *
     * Unlike [referrer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("referrer") @ExcludeMissing fun _referrer(): JsonField<Referrer> = referrer

    /**
     * Returns the raw JSON value of [shareCount].
     *
     * Unlike [shareCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shareCount")
    @ExcludeMissing
    fun _shareCount(): JsonField<ShareCount> = shareCount

    /**
     * Returns the raw JSON value of [uniqueImpressionCount].
     *
     * Unlike [uniqueImpressionCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("uniqueImpressionCount")
    @ExcludeMissing
    fun _uniqueImpressionCount(): JsonField<Long> = uniqueImpressionCount

    /**
     * Returns the raw JSON value of [unreadCommissionsCount].
     *
     * Unlike [unreadCommissionsCount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("unreadCommissionsCount")
    @ExcludeMissing
    fun _unreadCommissionsCount(): JsonField<Long> = unreadCommissionsCount

    /**
     * Returns the raw JSON value of [unreadPayoutsCount].
     *
     * Unlike [unreadPayoutsCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("unreadPayoutsCount")
    @ExcludeMissing
    fun _unreadPayoutsCount(): JsonField<Long> = unreadPayoutsCount

    /**
     * Returns the raw JSON value of [unsubscribed].
     *
     * Unlike [unsubscribed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unsubscribed")
    @ExcludeMissing
    fun _unsubscribed(): JsonField<Boolean> = unsubscribed

    /**
     * Returns the raw JSON value of [vanityKeys].
     *
     * Unlike [vanityKeys], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vanityKeys")
    @ExcludeMissing
    fun _vanityKeys(): JsonField<List<String>> = vanityKeys

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
         * Returns a mutable builder for constructing an instance of [Participant].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .email()
         * .monthlyRank()
         * .monthlyReferralCount()
         * .rank()
         * .referralCount()
         * .rewards()
         * .shareUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Participant]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var email: JsonField<String>? = null
        private var monthlyRank: JsonField<Long>? = null
        private var monthlyReferralCount: JsonField<Long>? = null
        private var rank: JsonField<Long>? = null
        private var referralCount: JsonField<Long>? = null
        private var rewards: JsonField<MutableList<ParticipantReward>>? = null
        private var shareUrl: JsonField<String>? = null
        private var allMatchingFraudsters: JsonField<MutableList<AllMatchingFraudster>>? = null
        private var createdAt: JsonField<Long> = JsonMissing.of()
        private var fingerprint: JsonField<String> = JsonMissing.of()
        private var firstName: JsonField<String> = JsonMissing.of()
        private var fraudReasonCode: JsonField<String> = JsonMissing.of()
        private var fraudRiskLevel: JsonField<FraudRiskLevel> = JsonMissing.of()
        private var impressionCount: JsonField<Long> = JsonMissing.of()
        private var inviteCount: JsonField<Long> = JsonMissing.of()
        private var ipAddress: JsonField<String> = JsonMissing.of()
        private var isNew: JsonField<Boolean> = JsonMissing.of()
        private var isWinner: JsonField<Boolean> = JsonMissing.of()
        private var lastName: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var monthlyReferrals: JsonField<MutableList<String>>? = null
        private var notes: JsonField<String> = JsonMissing.of()
        private var paypalEmailAddress: JsonField<String> = JsonMissing.of()
        private var prevMonthlyRank: JsonField<Long> = JsonMissing.of()
        private var prevMonthlyReferralCount: JsonField<Long> = JsonMissing.of()
        private var referrals: JsonField<MutableList<String>>? = null
        private var referralSource: JsonField<ReferralSource> = JsonMissing.of()
        private var referralStatus: JsonField<ReferralStatus> = JsonMissing.of()
        private var referredBy: JsonField<String> = JsonMissing.of()
        private var referrer: JsonField<Referrer> = JsonMissing.of()
        private var shareCount: JsonField<ShareCount> = JsonMissing.of()
        private var uniqueImpressionCount: JsonField<Long> = JsonMissing.of()
        private var unreadCommissionsCount: JsonField<Long> = JsonMissing.of()
        private var unreadPayoutsCount: JsonField<Long> = JsonMissing.of()
        private var unsubscribed: JsonField<Boolean> = JsonMissing.of()
        private var vanityKeys: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(participant: Participant) = apply {
            id = participant.id
            email = participant.email
            monthlyRank = participant.monthlyRank
            monthlyReferralCount = participant.monthlyReferralCount
            rank = participant.rank
            referralCount = participant.referralCount
            rewards = participant.rewards.map { it.toMutableList() }
            shareUrl = participant.shareUrl
            allMatchingFraudsters = participant.allMatchingFraudsters.map { it.toMutableList() }
            createdAt = participant.createdAt
            fingerprint = participant.fingerprint
            firstName = participant.firstName
            fraudReasonCode = participant.fraudReasonCode
            fraudRiskLevel = participant.fraudRiskLevel
            impressionCount = participant.impressionCount
            inviteCount = participant.inviteCount
            ipAddress = participant.ipAddress
            isNew = participant.isNew
            isWinner = participant.isWinner
            lastName = participant.lastName
            metadata = participant.metadata
            monthlyReferrals = participant.monthlyReferrals.map { it.toMutableList() }
            notes = participant.notes
            paypalEmailAddress = participant.paypalEmailAddress
            prevMonthlyRank = participant.prevMonthlyRank
            prevMonthlyReferralCount = participant.prevMonthlyReferralCount
            referrals = participant.referrals.map { it.toMutableList() }
            referralSource = participant.referralSource
            referralStatus = participant.referralStatus
            referredBy = participant.referredBy
            referrer = participant.referrer
            shareCount = participant.shareCount
            uniqueImpressionCount = participant.uniqueImpressionCount
            unreadCommissionsCount = participant.unreadCommissionsCount
            unreadPayoutsCount = participant.unreadPayoutsCount
            unsubscribed = participant.unsubscribed
            vanityKeys = participant.vanityKeys.map { it.toMutableList() }
            additionalProperties = participant.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        fun monthlyRank(monthlyRank: Long) = monthlyRank(JsonField.of(monthlyRank))

        /**
         * Sets [Builder.monthlyRank] to an arbitrary JSON value.
         *
         * You should usually call [Builder.monthlyRank] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun monthlyRank(monthlyRank: JsonField<Long>) = apply { this.monthlyRank = monthlyRank }

        fun monthlyReferralCount(monthlyReferralCount: Long) =
            monthlyReferralCount(JsonField.of(monthlyReferralCount))

        /**
         * Sets [Builder.monthlyReferralCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.monthlyReferralCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun monthlyReferralCount(monthlyReferralCount: JsonField<Long>) = apply {
            this.monthlyReferralCount = monthlyReferralCount
        }

        fun rank(rank: Long) = rank(JsonField.of(rank))

        /**
         * Sets [Builder.rank] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rank] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rank(rank: JsonField<Long>) = apply { this.rank = rank }

        fun referralCount(referralCount: Long) = referralCount(JsonField.of(referralCount))

        /**
         * Sets [Builder.referralCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referralCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun referralCount(referralCount: JsonField<Long>) = apply {
            this.referralCount = referralCount
        }

        fun rewards(rewards: List<ParticipantReward>) = rewards(JsonField.of(rewards))

        /**
         * Sets [Builder.rewards] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rewards] with a well-typed `List<ParticipantReward>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun rewards(rewards: JsonField<List<ParticipantReward>>) = apply {
            this.rewards = rewards.map { it.toMutableList() }
        }

        /**
         * Adds a single [ParticipantReward] to [rewards].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReward(reward: ParticipantReward) = apply {
            rewards =
                (rewards ?: JsonField.of(mutableListOf())).also {
                    checkKnown("rewards", it).add(reward)
                }
        }

        fun shareUrl(shareUrl: String) = shareUrl(JsonField.of(shareUrl))

        /**
         * Sets [Builder.shareUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shareUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun shareUrl(shareUrl: JsonField<String>) = apply { this.shareUrl = shareUrl }

        fun allMatchingFraudsters(allMatchingFraudsters: List<AllMatchingFraudster>) =
            allMatchingFraudsters(JsonField.of(allMatchingFraudsters))

        /**
         * Sets [Builder.allMatchingFraudsters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allMatchingFraudsters] with a well-typed
         * `List<AllMatchingFraudster>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun allMatchingFraudsters(allMatchingFraudsters: JsonField<List<AllMatchingFraudster>>) =
            apply {
                this.allMatchingFraudsters = allMatchingFraudsters.map { it.toMutableList() }
            }

        /**
         * Adds a single [AllMatchingFraudster] to [allMatchingFraudsters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllMatchingFraudster(allMatchingFraudster: AllMatchingFraudster) = apply {
            allMatchingFraudsters =
                (allMatchingFraudsters ?: JsonField.of(mutableListOf())).also {
                    checkKnown("allMatchingFraudsters", it).add(allMatchingFraudster)
                }
        }

        fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

        fun fingerprint(fingerprint: String?) = fingerprint(JsonField.ofNullable(fingerprint))

        /** Alias for calling [Builder.fingerprint] with `fingerprint.orElse(null)`. */
        fun fingerprint(fingerprint: Optional<String>) = fingerprint(fingerprint.getOrNull())

        /**
         * Sets [Builder.fingerprint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fingerprint] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fingerprint(fingerprint: JsonField<String>) = apply { this.fingerprint = fingerprint }

        fun firstName(firstName: String?) = firstName(JsonField.ofNullable(firstName))

        /** Alias for calling [Builder.firstName] with `firstName.orElse(null)`. */
        fun firstName(firstName: Optional<String>) = firstName(firstName.getOrNull())

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        fun fraudReasonCode(fraudReasonCode: String) =
            fraudReasonCode(JsonField.of(fraudReasonCode))

        /**
         * Sets [Builder.fraudReasonCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fraudReasonCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fraudReasonCode(fraudReasonCode: JsonField<String>) = apply {
            this.fraudReasonCode = fraudReasonCode
        }

        fun fraudRiskLevel(fraudRiskLevel: FraudRiskLevel) =
            fraudRiskLevel(JsonField.of(fraudRiskLevel))

        /**
         * Sets [Builder.fraudRiskLevel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fraudRiskLevel] with a well-typed [FraudRiskLevel] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fraudRiskLevel(fraudRiskLevel: JsonField<FraudRiskLevel>) = apply {
            this.fraudRiskLevel = fraudRiskLevel
        }

        fun impressionCount(impressionCount: Long) = impressionCount(JsonField.of(impressionCount))

        /**
         * Sets [Builder.impressionCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.impressionCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun impressionCount(impressionCount: JsonField<Long>) = apply {
            this.impressionCount = impressionCount
        }

        fun inviteCount(inviteCount: Long) = inviteCount(JsonField.of(inviteCount))

        /**
         * Sets [Builder.inviteCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inviteCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inviteCount(inviteCount: JsonField<Long>) = apply { this.inviteCount = inviteCount }

        fun ipAddress(ipAddress: String?) = ipAddress(JsonField.ofNullable(ipAddress))

        /** Alias for calling [Builder.ipAddress] with `ipAddress.orElse(null)`. */
        fun ipAddress(ipAddress: Optional<String>) = ipAddress(ipAddress.getOrNull())

        /**
         * Sets [Builder.ipAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ipAddress] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ipAddress(ipAddress: JsonField<String>) = apply { this.ipAddress = ipAddress }

        fun isNew(isNew: Boolean) = isNew(JsonField.of(isNew))

        /**
         * Sets [Builder.isNew] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isNew] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun isNew(isNew: JsonField<Boolean>) = apply { this.isNew = isNew }

        fun isWinner(isWinner: Boolean) = isWinner(JsonField.of(isWinner))

        /**
         * Sets [Builder.isWinner] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isWinner] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isWinner(isWinner: JsonField<Boolean>) = apply { this.isWinner = isWinner }

        fun lastName(lastName: String?) = lastName(JsonField.ofNullable(lastName))

        /** Alias for calling [Builder.lastName] with `lastName.orElse(null)`. */
        fun lastName(lastName: Optional<String>) = lastName(lastName.getOrNull())

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        /** Shallow custom metadata object. */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun monthlyReferrals(monthlyReferrals: List<String>) =
            monthlyReferrals(JsonField.of(monthlyReferrals))

        /**
         * Sets [Builder.monthlyReferrals] to an arbitrary JSON value.
         *
         * You should usually call [Builder.monthlyReferrals] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun monthlyReferrals(monthlyReferrals: JsonField<List<String>>) = apply {
            this.monthlyReferrals = monthlyReferrals.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [monthlyReferrals].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMonthlyReferral(monthlyReferral: String) = apply {
            monthlyReferrals =
                (monthlyReferrals ?: JsonField.of(mutableListOf())).also {
                    checkKnown("monthlyReferrals", it).add(monthlyReferral)
                }
        }

        fun notes(notes: String?) = notes(JsonField.ofNullable(notes))

        /** Alias for calling [Builder.notes] with `notes.orElse(null)`. */
        fun notes(notes: Optional<String>) = notes(notes.getOrNull())

        /**
         * Sets [Builder.notes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notes] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun notes(notes: JsonField<String>) = apply { this.notes = notes }

        fun paypalEmailAddress(paypalEmailAddress: String) =
            paypalEmailAddress(JsonField.of(paypalEmailAddress))

        /**
         * Sets [Builder.paypalEmailAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paypalEmailAddress] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun paypalEmailAddress(paypalEmailAddress: JsonField<String>) = apply {
            this.paypalEmailAddress = paypalEmailAddress
        }

        fun prevMonthlyRank(prevMonthlyRank: Long) = prevMonthlyRank(JsonField.of(prevMonthlyRank))

        /**
         * Sets [Builder.prevMonthlyRank] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prevMonthlyRank] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun prevMonthlyRank(prevMonthlyRank: JsonField<Long>) = apply {
            this.prevMonthlyRank = prevMonthlyRank
        }

        fun prevMonthlyReferralCount(prevMonthlyReferralCount: Long) =
            prevMonthlyReferralCount(JsonField.of(prevMonthlyReferralCount))

        /**
         * Sets [Builder.prevMonthlyReferralCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prevMonthlyReferralCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun prevMonthlyReferralCount(prevMonthlyReferralCount: JsonField<Long>) = apply {
            this.prevMonthlyReferralCount = prevMonthlyReferralCount
        }

        fun referrals(referrals: List<String>) = referrals(JsonField.of(referrals))

        /**
         * Sets [Builder.referrals] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referrals] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referrals(referrals: JsonField<List<String>>) = apply {
            this.referrals = referrals.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [referrals].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReferral(referral: String) = apply {
            referrals =
                (referrals ?: JsonField.of(mutableListOf())).also {
                    checkKnown("referrals", it).add(referral)
                }
        }

        fun referralSource(referralSource: ReferralSource) =
            referralSource(JsonField.of(referralSource))

        /**
         * Sets [Builder.referralSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referralSource] with a well-typed [ReferralSource] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referralSource(referralSource: JsonField<ReferralSource>) = apply {
            this.referralSource = referralSource
        }

        fun referralStatus(referralStatus: ReferralStatus) =
            referralStatus(JsonField.of(referralStatus))

        /**
         * Sets [Builder.referralStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referralStatus] with a well-typed [ReferralStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referralStatus(referralStatus: JsonField<ReferralStatus>) = apply {
            this.referralStatus = referralStatus
        }

        fun referredBy(referredBy: String) = referredBy(JsonField.of(referredBy))

        /**
         * Sets [Builder.referredBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referredBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun referredBy(referredBy: JsonField<String>) = apply { this.referredBy = referredBy }

        fun referrer(referrer: Referrer?) = referrer(JsonField.ofNullable(referrer))

        /** Alias for calling [Builder.referrer] with `referrer.orElse(null)`. */
        fun referrer(referrer: Optional<Referrer>) = referrer(referrer.getOrNull())

        /**
         * Sets [Builder.referrer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referrer] with a well-typed [Referrer] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun referrer(referrer: JsonField<Referrer>) = apply { this.referrer = referrer }

        fun shareCount(shareCount: ShareCount) = shareCount(JsonField.of(shareCount))

        /**
         * Sets [Builder.shareCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shareCount] with a well-typed [ShareCount] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun shareCount(shareCount: JsonField<ShareCount>) = apply { this.shareCount = shareCount }

        fun uniqueImpressionCount(uniqueImpressionCount: Long) =
            uniqueImpressionCount(JsonField.of(uniqueImpressionCount))

        /**
         * Sets [Builder.uniqueImpressionCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uniqueImpressionCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun uniqueImpressionCount(uniqueImpressionCount: JsonField<Long>) = apply {
            this.uniqueImpressionCount = uniqueImpressionCount
        }

        fun unreadCommissionsCount(unreadCommissionsCount: Long) =
            unreadCommissionsCount(JsonField.of(unreadCommissionsCount))

        /**
         * Sets [Builder.unreadCommissionsCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unreadCommissionsCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun unreadCommissionsCount(unreadCommissionsCount: JsonField<Long>) = apply {
            this.unreadCommissionsCount = unreadCommissionsCount
        }

        fun unreadPayoutsCount(unreadPayoutsCount: Long) =
            unreadPayoutsCount(JsonField.of(unreadPayoutsCount))

        /**
         * Sets [Builder.unreadPayoutsCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unreadPayoutsCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun unreadPayoutsCount(unreadPayoutsCount: JsonField<Long>) = apply {
            this.unreadPayoutsCount = unreadPayoutsCount
        }

        fun unsubscribed(unsubscribed: Boolean) = unsubscribed(JsonField.of(unsubscribed))

        /**
         * Sets [Builder.unsubscribed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unsubscribed] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun unsubscribed(unsubscribed: JsonField<Boolean>) = apply {
            this.unsubscribed = unsubscribed
        }

        fun vanityKeys(vanityKeys: List<String>) = vanityKeys(JsonField.of(vanityKeys))

        /**
         * Sets [Builder.vanityKeys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vanityKeys] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun vanityKeys(vanityKeys: JsonField<List<String>>) = apply {
            this.vanityKeys = vanityKeys.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [vanityKeys].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addVanityKey(vanityKey: String) = apply {
            vanityKeys =
                (vanityKeys ?: JsonField.of(mutableListOf())).also {
                    checkKnown("vanityKeys", it).add(vanityKey)
                }
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
         * Returns an immutable instance of [Participant].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .email()
         * .monthlyRank()
         * .monthlyReferralCount()
         * .rank()
         * .referralCount()
         * .rewards()
         * .shareUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Participant =
            Participant(
                checkRequired("id", id),
                checkRequired("email", email),
                checkRequired("monthlyRank", monthlyRank),
                checkRequired("monthlyReferralCount", monthlyReferralCount),
                checkRequired("rank", rank),
                checkRequired("referralCount", referralCount),
                checkRequired("rewards", rewards).map { it.toImmutable() },
                checkRequired("shareUrl", shareUrl),
                (allMatchingFraudsters ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                fingerprint,
                firstName,
                fraudReasonCode,
                fraudRiskLevel,
                impressionCount,
                inviteCount,
                ipAddress,
                isNew,
                isWinner,
                lastName,
                metadata,
                (monthlyReferrals ?: JsonMissing.of()).map { it.toImmutable() },
                notes,
                paypalEmailAddress,
                prevMonthlyRank,
                prevMonthlyReferralCount,
                (referrals ?: JsonMissing.of()).map { it.toImmutable() },
                referralSource,
                referralStatus,
                referredBy,
                referrer,
                shareCount,
                uniqueImpressionCount,
                unreadCommissionsCount,
                unreadPayoutsCount,
                unsubscribed,
                (vanityKeys ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): Participant = apply {
        if (validated) {
            return@apply
        }

        id()
        email()
        monthlyRank()
        monthlyReferralCount()
        rank()
        referralCount()
        rewards().forEach { it.validate() }
        shareUrl()
        allMatchingFraudsters().ifPresent { it.forEach { it.validate() } }
        createdAt()
        fingerprint()
        firstName()
        fraudReasonCode()
        fraudRiskLevel().ifPresent { it.validate() }
        impressionCount()
        inviteCount()
        ipAddress()
        isNew()
        isWinner()
        lastName()
        metadata().ifPresent { it.validate() }
        monthlyReferrals()
        notes()
        paypalEmailAddress()
        prevMonthlyRank()
        prevMonthlyReferralCount()
        referrals()
        referralSource().ifPresent { it.validate() }
        referralStatus().ifPresent { it.validate() }
        referredBy()
        referrer().ifPresent { it.validate() }
        shareCount().ifPresent { it.validate() }
        uniqueImpressionCount()
        unreadCommissionsCount()
        unreadPayoutsCount()
        unsubscribed()
        vanityKeys()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (monthlyRank.asKnown().isPresent) 1 else 0) +
            (if (monthlyReferralCount.asKnown().isPresent) 1 else 0) +
            (if (rank.asKnown().isPresent) 1 else 0) +
            (if (referralCount.asKnown().isPresent) 1 else 0) +
            (rewards.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (shareUrl.asKnown().isPresent) 1 else 0) +
            (allMatchingFraudsters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (fingerprint.asKnown().isPresent) 1 else 0) +
            (if (firstName.asKnown().isPresent) 1 else 0) +
            (if (fraudReasonCode.asKnown().isPresent) 1 else 0) +
            (fraudRiskLevel.asKnown().getOrNull()?.validity() ?: 0) +
            (if (impressionCount.asKnown().isPresent) 1 else 0) +
            (if (inviteCount.asKnown().isPresent) 1 else 0) +
            (if (ipAddress.asKnown().isPresent) 1 else 0) +
            (if (isNew.asKnown().isPresent) 1 else 0) +
            (if (isWinner.asKnown().isPresent) 1 else 0) +
            (if (lastName.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (monthlyReferrals.asKnown().getOrNull()?.size ?: 0) +
            (if (notes.asKnown().isPresent) 1 else 0) +
            (if (paypalEmailAddress.asKnown().isPresent) 1 else 0) +
            (if (prevMonthlyRank.asKnown().isPresent) 1 else 0) +
            (if (prevMonthlyReferralCount.asKnown().isPresent) 1 else 0) +
            (referrals.asKnown().getOrNull()?.size ?: 0) +
            (referralSource.asKnown().getOrNull()?.validity() ?: 0) +
            (referralStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (if (referredBy.asKnown().isPresent) 1 else 0) +
            (referrer.asKnown().getOrNull()?.validity() ?: 0) +
            (shareCount.asKnown().getOrNull()?.validity() ?: 0) +
            (if (uniqueImpressionCount.asKnown().isPresent) 1 else 0) +
            (if (unreadCommissionsCount.asKnown().isPresent) 1 else 0) +
            (if (unreadPayoutsCount.asKnown().isPresent) 1 else 0) +
            (if (unsubscribed.asKnown().isPresent) 1 else 0) +
            (vanityKeys.asKnown().getOrNull()?.size ?: 0)

    class AllMatchingFraudster
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

            /** Returns a mutable builder for constructing an instance of [AllMatchingFraudster]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AllMatchingFraudster]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(allMatchingFraudster: AllMatchingFraudster) = apply {
                additionalProperties = allMatchingFraudster.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [AllMatchingFraudster].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AllMatchingFraudster =
                AllMatchingFraudster(additionalProperties.toImmutable())
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
        fun validate(): AllMatchingFraudster = apply {
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

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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

            return other is AllMatchingFraudster &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "AllMatchingFraudster{additionalProperties=$additionalProperties}"
    }

    /** Shallow custom metadata object. */
    class Metadata
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

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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
        fun validate(): Metadata = apply {
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

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    class Referrer
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<Long>,
        private val email: JsonField<String>,
        private val fingerprint: JsonField<String>,
        private val firstName: JsonField<String>,
        private val fraudReasonCode: JsonField<String>,
        private val fraudRiskLevel: JsonField<FraudRiskLevel>,
        private val impressionCount: JsonField<Long>,
        private val inviteCount: JsonField<Long>,
        private val ipAddress: JsonField<String>,
        private val isWinner: JsonField<Boolean>,
        private val lastName: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val monthlyRank: JsonField<Long>,
        private val monthlyReferralCount: JsonField<Long>,
        private val monthlyReferrals: JsonField<List<String>>,
        private val prevMonthlyRank: JsonField<Long>,
        private val prevMonthlyReferralCount: JsonField<Long>,
        private val rank: JsonField<Long>,
        private val referralCount: JsonField<Long>,
        private val referrals: JsonField<List<String>>,
        private val referralSource: JsonField<ReferralSource>,
        private val referralStatus: JsonField<ReferralStatus>,
        private val shareCount: JsonField<ShareCount>,
        private val shareUrl: JsonField<String>,
        private val uniqueImpressionCount: JsonField<Long>,
        private val unsubscribed: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fingerprint")
            @ExcludeMissing
            fingerprint: JsonField<String> = JsonMissing.of(),
            @JsonProperty("firstName")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fraudReasonCode")
            @ExcludeMissing
            fraudReasonCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fraudRiskLevel")
            @ExcludeMissing
            fraudRiskLevel: JsonField<FraudRiskLevel> = JsonMissing.of(),
            @JsonProperty("impressionCount")
            @ExcludeMissing
            impressionCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("inviteCount")
            @ExcludeMissing
            inviteCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("ipAddress")
            @ExcludeMissing
            ipAddress: JsonField<String> = JsonMissing.of(),
            @JsonProperty("isWinner")
            @ExcludeMissing
            isWinner: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("lastName")
            @ExcludeMissing
            lastName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("monthlyRank")
            @ExcludeMissing
            monthlyRank: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("monthlyReferralCount")
            @ExcludeMissing
            monthlyReferralCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("monthlyReferrals")
            @ExcludeMissing
            monthlyReferrals: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("prevMonthlyRank")
            @ExcludeMissing
            prevMonthlyRank: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("prevMonthlyReferralCount")
            @ExcludeMissing
            prevMonthlyReferralCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("rank") @ExcludeMissing rank: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("referralCount")
            @ExcludeMissing
            referralCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("referrals")
            @ExcludeMissing
            referrals: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("referralSource")
            @ExcludeMissing
            referralSource: JsonField<ReferralSource> = JsonMissing.of(),
            @JsonProperty("referralStatus")
            @ExcludeMissing
            referralStatus: JsonField<ReferralStatus> = JsonMissing.of(),
            @JsonProperty("shareCount")
            @ExcludeMissing
            shareCount: JsonField<ShareCount> = JsonMissing.of(),
            @JsonProperty("shareUrl")
            @ExcludeMissing
            shareUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("uniqueImpressionCount")
            @ExcludeMissing
            uniqueImpressionCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("unsubscribed")
            @ExcludeMissing
            unsubscribed: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            id,
            createdAt,
            email,
            fingerprint,
            firstName,
            fraudReasonCode,
            fraudRiskLevel,
            impressionCount,
            inviteCount,
            ipAddress,
            isWinner,
            lastName,
            metadata,
            monthlyRank,
            monthlyReferralCount,
            monthlyReferrals,
            prevMonthlyRank,
            prevMonthlyReferralCount,
            rank,
            referralCount,
            referrals,
            referralSource,
            referralStatus,
            shareCount,
            shareUrl,
            uniqueImpressionCount,
            unsubscribed,
            mutableMapOf(),
        )

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun createdAt(): Optional<Long> = createdAt.getOptional("createdAt")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun email(): Optional<String> = email.getOptional("email")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fingerprint(): Optional<String> = fingerprint.getOptional("fingerprint")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun firstName(): Optional<String> = firstName.getOptional("firstName")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fraudReasonCode(): Optional<String> = fraudReasonCode.getOptional("fraudReasonCode")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fraudRiskLevel(): Optional<FraudRiskLevel> =
            fraudRiskLevel.getOptional("fraudRiskLevel")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun impressionCount(): Optional<Long> = impressionCount.getOptional("impressionCount")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun inviteCount(): Optional<Long> = inviteCount.getOptional("inviteCount")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun ipAddress(): Optional<String> = ipAddress.getOptional("ipAddress")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun isWinner(): Optional<Boolean> = isWinner.getOptional("isWinner")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun lastName(): Optional<String> = lastName.getOptional("lastName")

        /**
         * Shallow custom metadata object.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun monthlyRank(): Optional<Long> = monthlyRank.getOptional("monthlyRank")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun monthlyReferralCount(): Optional<Long> =
            monthlyReferralCount.getOptional("monthlyReferralCount")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun monthlyReferrals(): Optional<List<String>> =
            monthlyReferrals.getOptional("monthlyReferrals")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun prevMonthlyRank(): Optional<Long> = prevMonthlyRank.getOptional("prevMonthlyRank")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun prevMonthlyReferralCount(): Optional<Long> =
            prevMonthlyReferralCount.getOptional("prevMonthlyReferralCount")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rank(): Optional<Long> = rank.getOptional("rank")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun referralCount(): Optional<Long> = referralCount.getOptional("referralCount")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun referrals(): Optional<List<String>> = referrals.getOptional("referrals")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun referralSource(): Optional<ReferralSource> =
            referralSource.getOptional("referralSource")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun referralStatus(): Optional<ReferralStatus> =
            referralStatus.getOptional("referralStatus")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun shareCount(): Optional<ShareCount> = shareCount.getOptional("shareCount")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun shareUrl(): Optional<String> = shareUrl.getOptional("shareUrl")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun uniqueImpressionCount(): Optional<Long> =
            uniqueImpressionCount.getOptional("uniqueImpressionCount")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun unsubscribed(): Optional<Boolean> = unsubscribed.getOptional("unsubscribed")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdAt") @ExcludeMissing fun _createdAt(): JsonField<Long> = createdAt

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [fingerprint].
         *
         * Unlike [fingerprint], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fingerprint")
        @ExcludeMissing
        fun _fingerprint(): JsonField<String> = fingerprint

        /**
         * Returns the raw JSON value of [firstName].
         *
         * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("firstName") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        /**
         * Returns the raw JSON value of [fraudReasonCode].
         *
         * Unlike [fraudReasonCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("fraudReasonCode")
        @ExcludeMissing
        fun _fraudReasonCode(): JsonField<String> = fraudReasonCode

        /**
         * Returns the raw JSON value of [fraudRiskLevel].
         *
         * Unlike [fraudRiskLevel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("fraudRiskLevel")
        @ExcludeMissing
        fun _fraudRiskLevel(): JsonField<FraudRiskLevel> = fraudRiskLevel

        /**
         * Returns the raw JSON value of [impressionCount].
         *
         * Unlike [impressionCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("impressionCount")
        @ExcludeMissing
        fun _impressionCount(): JsonField<Long> = impressionCount

        /**
         * Returns the raw JSON value of [inviteCount].
         *
         * Unlike [inviteCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("inviteCount")
        @ExcludeMissing
        fun _inviteCount(): JsonField<Long> = inviteCount

        /**
         * Returns the raw JSON value of [ipAddress].
         *
         * Unlike [ipAddress], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ipAddress") @ExcludeMissing fun _ipAddress(): JsonField<String> = ipAddress

        /**
         * Returns the raw JSON value of [isWinner].
         *
         * Unlike [isWinner], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("isWinner") @ExcludeMissing fun _isWinner(): JsonField<Boolean> = isWinner

        /**
         * Returns the raw JSON value of [lastName].
         *
         * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lastName") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [monthlyRank].
         *
         * Unlike [monthlyRank], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("monthlyRank")
        @ExcludeMissing
        fun _monthlyRank(): JsonField<Long> = monthlyRank

        /**
         * Returns the raw JSON value of [monthlyReferralCount].
         *
         * Unlike [monthlyReferralCount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("monthlyReferralCount")
        @ExcludeMissing
        fun _monthlyReferralCount(): JsonField<Long> = monthlyReferralCount

        /**
         * Returns the raw JSON value of [monthlyReferrals].
         *
         * Unlike [monthlyReferrals], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("monthlyReferrals")
        @ExcludeMissing
        fun _monthlyReferrals(): JsonField<List<String>> = monthlyReferrals

        /**
         * Returns the raw JSON value of [prevMonthlyRank].
         *
         * Unlike [prevMonthlyRank], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("prevMonthlyRank")
        @ExcludeMissing
        fun _prevMonthlyRank(): JsonField<Long> = prevMonthlyRank

        /**
         * Returns the raw JSON value of [prevMonthlyReferralCount].
         *
         * Unlike [prevMonthlyReferralCount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("prevMonthlyReferralCount")
        @ExcludeMissing
        fun _prevMonthlyReferralCount(): JsonField<Long> = prevMonthlyReferralCount

        /**
         * Returns the raw JSON value of [rank].
         *
         * Unlike [rank], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rank") @ExcludeMissing fun _rank(): JsonField<Long> = rank

        /**
         * Returns the raw JSON value of [referralCount].
         *
         * Unlike [referralCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("referralCount")
        @ExcludeMissing
        fun _referralCount(): JsonField<Long> = referralCount

        /**
         * Returns the raw JSON value of [referrals].
         *
         * Unlike [referrals], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("referrals")
        @ExcludeMissing
        fun _referrals(): JsonField<List<String>> = referrals

        /**
         * Returns the raw JSON value of [referralSource].
         *
         * Unlike [referralSource], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("referralSource")
        @ExcludeMissing
        fun _referralSource(): JsonField<ReferralSource> = referralSource

        /**
         * Returns the raw JSON value of [referralStatus].
         *
         * Unlike [referralStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("referralStatus")
        @ExcludeMissing
        fun _referralStatus(): JsonField<ReferralStatus> = referralStatus

        /**
         * Returns the raw JSON value of [shareCount].
         *
         * Unlike [shareCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("shareCount")
        @ExcludeMissing
        fun _shareCount(): JsonField<ShareCount> = shareCount

        /**
         * Returns the raw JSON value of [shareUrl].
         *
         * Unlike [shareUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("shareUrl") @ExcludeMissing fun _shareUrl(): JsonField<String> = shareUrl

        /**
         * Returns the raw JSON value of [uniqueImpressionCount].
         *
         * Unlike [uniqueImpressionCount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("uniqueImpressionCount")
        @ExcludeMissing
        fun _uniqueImpressionCount(): JsonField<Long> = uniqueImpressionCount

        /**
         * Returns the raw JSON value of [unsubscribed].
         *
         * Unlike [unsubscribed], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("unsubscribed")
        @ExcludeMissing
        fun _unsubscribed(): JsonField<Boolean> = unsubscribed

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

            /** Returns a mutable builder for constructing an instance of [Referrer]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Referrer]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<Long> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var fingerprint: JsonField<String> = JsonMissing.of()
            private var firstName: JsonField<String> = JsonMissing.of()
            private var fraudReasonCode: JsonField<String> = JsonMissing.of()
            private var fraudRiskLevel: JsonField<FraudRiskLevel> = JsonMissing.of()
            private var impressionCount: JsonField<Long> = JsonMissing.of()
            private var inviteCount: JsonField<Long> = JsonMissing.of()
            private var ipAddress: JsonField<String> = JsonMissing.of()
            private var isWinner: JsonField<Boolean> = JsonMissing.of()
            private var lastName: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var monthlyRank: JsonField<Long> = JsonMissing.of()
            private var monthlyReferralCount: JsonField<Long> = JsonMissing.of()
            private var monthlyReferrals: JsonField<MutableList<String>>? = null
            private var prevMonthlyRank: JsonField<Long> = JsonMissing.of()
            private var prevMonthlyReferralCount: JsonField<Long> = JsonMissing.of()
            private var rank: JsonField<Long> = JsonMissing.of()
            private var referralCount: JsonField<Long> = JsonMissing.of()
            private var referrals: JsonField<MutableList<String>>? = null
            private var referralSource: JsonField<ReferralSource> = JsonMissing.of()
            private var referralStatus: JsonField<ReferralStatus> = JsonMissing.of()
            private var shareCount: JsonField<ShareCount> = JsonMissing.of()
            private var shareUrl: JsonField<String> = JsonMissing.of()
            private var uniqueImpressionCount: JsonField<Long> = JsonMissing.of()
            private var unsubscribed: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(referrer: Referrer) = apply {
                id = referrer.id
                createdAt = referrer.createdAt
                email = referrer.email
                fingerprint = referrer.fingerprint
                firstName = referrer.firstName
                fraudReasonCode = referrer.fraudReasonCode
                fraudRiskLevel = referrer.fraudRiskLevel
                impressionCount = referrer.impressionCount
                inviteCount = referrer.inviteCount
                ipAddress = referrer.ipAddress
                isWinner = referrer.isWinner
                lastName = referrer.lastName
                metadata = referrer.metadata
                monthlyRank = referrer.monthlyRank
                monthlyReferralCount = referrer.monthlyReferralCount
                monthlyReferrals = referrer.monthlyReferrals.map { it.toMutableList() }
                prevMonthlyRank = referrer.prevMonthlyRank
                prevMonthlyReferralCount = referrer.prevMonthlyReferralCount
                rank = referrer.rank
                referralCount = referrer.referralCount
                referrals = referrer.referrals.map { it.toMutableList() }
                referralSource = referrer.referralSource
                referralStatus = referrer.referralStatus
                shareCount = referrer.shareCount
                shareUrl = referrer.shareUrl
                uniqueImpressionCount = referrer.uniqueImpressionCount
                unsubscribed = referrer.unsubscribed
                additionalProperties = referrer.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            fun fingerprint(fingerprint: String?) = fingerprint(JsonField.ofNullable(fingerprint))

            /** Alias for calling [Builder.fingerprint] with `fingerprint.orElse(null)`. */
            fun fingerprint(fingerprint: Optional<String>) = fingerprint(fingerprint.getOrNull())

            /**
             * Sets [Builder.fingerprint] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fingerprint] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fingerprint(fingerprint: JsonField<String>) = apply {
                this.fingerprint = fingerprint
            }

            fun firstName(firstName: String?) = firstName(JsonField.ofNullable(firstName))

            /** Alias for calling [Builder.firstName] with `firstName.orElse(null)`. */
            fun firstName(firstName: Optional<String>) = firstName(firstName.getOrNull())

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            fun fraudReasonCode(fraudReasonCode: String) =
                fraudReasonCode(JsonField.of(fraudReasonCode))

            /**
             * Sets [Builder.fraudReasonCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fraudReasonCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fraudReasonCode(fraudReasonCode: JsonField<String>) = apply {
                this.fraudReasonCode = fraudReasonCode
            }

            fun fraudRiskLevel(fraudRiskLevel: FraudRiskLevel) =
                fraudRiskLevel(JsonField.of(fraudRiskLevel))

            /**
             * Sets [Builder.fraudRiskLevel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fraudRiskLevel] with a well-typed [FraudRiskLevel]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun fraudRiskLevel(fraudRiskLevel: JsonField<FraudRiskLevel>) = apply {
                this.fraudRiskLevel = fraudRiskLevel
            }

            fun impressionCount(impressionCount: Long) =
                impressionCount(JsonField.of(impressionCount))

            /**
             * Sets [Builder.impressionCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.impressionCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun impressionCount(impressionCount: JsonField<Long>) = apply {
                this.impressionCount = impressionCount
            }

            fun inviteCount(inviteCount: Long) = inviteCount(JsonField.of(inviteCount))

            /**
             * Sets [Builder.inviteCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inviteCount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inviteCount(inviteCount: JsonField<Long>) = apply { this.inviteCount = inviteCount }

            fun ipAddress(ipAddress: String?) = ipAddress(JsonField.ofNullable(ipAddress))

            /** Alias for calling [Builder.ipAddress] with `ipAddress.orElse(null)`. */
            fun ipAddress(ipAddress: Optional<String>) = ipAddress(ipAddress.getOrNull())

            /**
             * Sets [Builder.ipAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ipAddress] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ipAddress(ipAddress: JsonField<String>) = apply { this.ipAddress = ipAddress }

            fun isWinner(isWinner: Boolean) = isWinner(JsonField.of(isWinner))

            /**
             * Sets [Builder.isWinner] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isWinner] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isWinner(isWinner: JsonField<Boolean>) = apply { this.isWinner = isWinner }

            fun lastName(lastName: String?) = lastName(JsonField.ofNullable(lastName))

            /** Alias for calling [Builder.lastName] with `lastName.orElse(null)`. */
            fun lastName(lastName: Optional<String>) = lastName(lastName.getOrNull())

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            /** Shallow custom metadata object. */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun monthlyRank(monthlyRank: Long) = monthlyRank(JsonField.of(monthlyRank))

            /**
             * Sets [Builder.monthlyRank] to an arbitrary JSON value.
             *
             * You should usually call [Builder.monthlyRank] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun monthlyRank(monthlyRank: JsonField<Long>) = apply { this.monthlyRank = monthlyRank }

            fun monthlyReferralCount(monthlyReferralCount: Long) =
                monthlyReferralCount(JsonField.of(monthlyReferralCount))

            /**
             * Sets [Builder.monthlyReferralCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.monthlyReferralCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun monthlyReferralCount(monthlyReferralCount: JsonField<Long>) = apply {
                this.monthlyReferralCount = monthlyReferralCount
            }

            fun monthlyReferrals(monthlyReferrals: List<String>) =
                monthlyReferrals(JsonField.of(monthlyReferrals))

            /**
             * Sets [Builder.monthlyReferrals] to an arbitrary JSON value.
             *
             * You should usually call [Builder.monthlyReferrals] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun monthlyReferrals(monthlyReferrals: JsonField<List<String>>) = apply {
                this.monthlyReferrals = monthlyReferrals.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [monthlyReferrals].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMonthlyReferral(monthlyReferral: String) = apply {
                monthlyReferrals =
                    (monthlyReferrals ?: JsonField.of(mutableListOf())).also {
                        checkKnown("monthlyReferrals", it).add(monthlyReferral)
                    }
            }

            fun prevMonthlyRank(prevMonthlyRank: Long) =
                prevMonthlyRank(JsonField.of(prevMonthlyRank))

            /**
             * Sets [Builder.prevMonthlyRank] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prevMonthlyRank] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun prevMonthlyRank(prevMonthlyRank: JsonField<Long>) = apply {
                this.prevMonthlyRank = prevMonthlyRank
            }

            fun prevMonthlyReferralCount(prevMonthlyReferralCount: Long) =
                prevMonthlyReferralCount(JsonField.of(prevMonthlyReferralCount))

            /**
             * Sets [Builder.prevMonthlyReferralCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prevMonthlyReferralCount] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun prevMonthlyReferralCount(prevMonthlyReferralCount: JsonField<Long>) = apply {
                this.prevMonthlyReferralCount = prevMonthlyReferralCount
            }

            fun rank(rank: Long) = rank(JsonField.of(rank))

            /**
             * Sets [Builder.rank] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rank] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun rank(rank: JsonField<Long>) = apply { this.rank = rank }

            fun referralCount(referralCount: Long) = referralCount(JsonField.of(referralCount))

            /**
             * Sets [Builder.referralCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referralCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun referralCount(referralCount: JsonField<Long>) = apply {
                this.referralCount = referralCount
            }

            fun referrals(referrals: List<String>) = referrals(JsonField.of(referrals))

            /**
             * Sets [Builder.referrals] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referrals] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun referrals(referrals: JsonField<List<String>>) = apply {
                this.referrals = referrals.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [referrals].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addReferral(referral: String) = apply {
                referrals =
                    (referrals ?: JsonField.of(mutableListOf())).also {
                        checkKnown("referrals", it).add(referral)
                    }
            }

            fun referralSource(referralSource: ReferralSource) =
                referralSource(JsonField.of(referralSource))

            /**
             * Sets [Builder.referralSource] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referralSource] with a well-typed [ReferralSource]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun referralSource(referralSource: JsonField<ReferralSource>) = apply {
                this.referralSource = referralSource
            }

            fun referralStatus(referralStatus: ReferralStatus) =
                referralStatus(JsonField.of(referralStatus))

            /**
             * Sets [Builder.referralStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referralStatus] with a well-typed [ReferralStatus]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun referralStatus(referralStatus: JsonField<ReferralStatus>) = apply {
                this.referralStatus = referralStatus
            }

            fun shareCount(shareCount: ShareCount) = shareCount(JsonField.of(shareCount))

            /**
             * Sets [Builder.shareCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shareCount] with a well-typed [ShareCount] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shareCount(shareCount: JsonField<ShareCount>) = apply {
                this.shareCount = shareCount
            }

            fun shareUrl(shareUrl: String) = shareUrl(JsonField.of(shareUrl))

            /**
             * Sets [Builder.shareUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shareUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shareUrl(shareUrl: JsonField<String>) = apply { this.shareUrl = shareUrl }

            fun uniqueImpressionCount(uniqueImpressionCount: Long) =
                uniqueImpressionCount(JsonField.of(uniqueImpressionCount))

            /**
             * Sets [Builder.uniqueImpressionCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uniqueImpressionCount] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun uniqueImpressionCount(uniqueImpressionCount: JsonField<Long>) = apply {
                this.uniqueImpressionCount = uniqueImpressionCount
            }

            fun unsubscribed(unsubscribed: Boolean) = unsubscribed(JsonField.of(unsubscribed))

            /**
             * Sets [Builder.unsubscribed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unsubscribed] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun unsubscribed(unsubscribed: JsonField<Boolean>) = apply {
                this.unsubscribed = unsubscribed
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
             * Returns an immutable instance of [Referrer].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Referrer =
                Referrer(
                    id,
                    createdAt,
                    email,
                    fingerprint,
                    firstName,
                    fraudReasonCode,
                    fraudRiskLevel,
                    impressionCount,
                    inviteCount,
                    ipAddress,
                    isWinner,
                    lastName,
                    metadata,
                    monthlyRank,
                    monthlyReferralCount,
                    (monthlyReferrals ?: JsonMissing.of()).map { it.toImmutable() },
                    prevMonthlyRank,
                    prevMonthlyReferralCount,
                    rank,
                    referralCount,
                    (referrals ?: JsonMissing.of()).map { it.toImmutable() },
                    referralSource,
                    referralStatus,
                    shareCount,
                    shareUrl,
                    uniqueImpressionCount,
                    unsubscribed,
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
        fun validate(): Referrer = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            email()
            fingerprint()
            firstName()
            fraudReasonCode()
            fraudRiskLevel().ifPresent { it.validate() }
            impressionCount()
            inviteCount()
            ipAddress()
            isWinner()
            lastName()
            metadata().ifPresent { it.validate() }
            monthlyRank()
            monthlyReferralCount()
            monthlyReferrals()
            prevMonthlyRank()
            prevMonthlyReferralCount()
            rank()
            referralCount()
            referrals()
            referralSource().ifPresent { it.validate() }
            referralStatus().ifPresent { it.validate() }
            shareCount().ifPresent { it.validate() }
            shareUrl()
            uniqueImpressionCount()
            unsubscribed()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (email.asKnown().isPresent) 1 else 0) +
                (if (fingerprint.asKnown().isPresent) 1 else 0) +
                (if (firstName.asKnown().isPresent) 1 else 0) +
                (if (fraudReasonCode.asKnown().isPresent) 1 else 0) +
                (fraudRiskLevel.asKnown().getOrNull()?.validity() ?: 0) +
                (if (impressionCount.asKnown().isPresent) 1 else 0) +
                (if (inviteCount.asKnown().isPresent) 1 else 0) +
                (if (ipAddress.asKnown().isPresent) 1 else 0) +
                (if (isWinner.asKnown().isPresent) 1 else 0) +
                (if (lastName.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (monthlyRank.asKnown().isPresent) 1 else 0) +
                (if (monthlyReferralCount.asKnown().isPresent) 1 else 0) +
                (monthlyReferrals.asKnown().getOrNull()?.size ?: 0) +
                (if (prevMonthlyRank.asKnown().isPresent) 1 else 0) +
                (if (prevMonthlyReferralCount.asKnown().isPresent) 1 else 0) +
                (if (rank.asKnown().isPresent) 1 else 0) +
                (if (referralCount.asKnown().isPresent) 1 else 0) +
                (referrals.asKnown().getOrNull()?.size ?: 0) +
                (referralSource.asKnown().getOrNull()?.validity() ?: 0) +
                (referralStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (shareCount.asKnown().getOrNull()?.validity() ?: 0) +
                (if (shareUrl.asKnown().isPresent) 1 else 0) +
                (if (uniqueImpressionCount.asKnown().isPresent) 1 else 0) +
                (if (unsubscribed.asKnown().isPresent) 1 else 0)

        /** Shallow custom metadata object. */
        class Metadata
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

                /** Returns a mutable builder for constructing an instance of [Metadata]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Metadata]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(metadata: Metadata) = apply {
                    additionalProperties = metadata.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Metadata].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws GrowsurfInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Metadata = apply {
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

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
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

                return other is Metadata && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        class ShareCount
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

                /** Returns a mutable builder for constructing an instance of [ShareCount]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ShareCount]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(shareCount: ShareCount) = apply {
                    additionalProperties = shareCount.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [ShareCount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ShareCount = ShareCount(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws GrowsurfInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): ShareCount = apply {
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

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
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

                return other is ShareCount && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "ShareCount{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Referrer &&
                id == other.id &&
                createdAt == other.createdAt &&
                email == other.email &&
                fingerprint == other.fingerprint &&
                firstName == other.firstName &&
                fraudReasonCode == other.fraudReasonCode &&
                fraudRiskLevel == other.fraudRiskLevel &&
                impressionCount == other.impressionCount &&
                inviteCount == other.inviteCount &&
                ipAddress == other.ipAddress &&
                isWinner == other.isWinner &&
                lastName == other.lastName &&
                metadata == other.metadata &&
                monthlyRank == other.monthlyRank &&
                monthlyReferralCount == other.monthlyReferralCount &&
                monthlyReferrals == other.monthlyReferrals &&
                prevMonthlyRank == other.prevMonthlyRank &&
                prevMonthlyReferralCount == other.prevMonthlyReferralCount &&
                rank == other.rank &&
                referralCount == other.referralCount &&
                referrals == other.referrals &&
                referralSource == other.referralSource &&
                referralStatus == other.referralStatus &&
                shareCount == other.shareCount &&
                shareUrl == other.shareUrl &&
                uniqueImpressionCount == other.uniqueImpressionCount &&
                unsubscribed == other.unsubscribed &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                email,
                fingerprint,
                firstName,
                fraudReasonCode,
                fraudRiskLevel,
                impressionCount,
                inviteCount,
                ipAddress,
                isWinner,
                lastName,
                metadata,
                monthlyRank,
                monthlyReferralCount,
                monthlyReferrals,
                prevMonthlyRank,
                prevMonthlyReferralCount,
                rank,
                referralCount,
                referrals,
                referralSource,
                referralStatus,
                shareCount,
                shareUrl,
                uniqueImpressionCount,
                unsubscribed,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Referrer{id=$id, createdAt=$createdAt, email=$email, fingerprint=$fingerprint, firstName=$firstName, fraudReasonCode=$fraudReasonCode, fraudRiskLevel=$fraudRiskLevel, impressionCount=$impressionCount, inviteCount=$inviteCount, ipAddress=$ipAddress, isWinner=$isWinner, lastName=$lastName, metadata=$metadata, monthlyRank=$monthlyRank, monthlyReferralCount=$monthlyReferralCount, monthlyReferrals=$monthlyReferrals, prevMonthlyRank=$prevMonthlyRank, prevMonthlyReferralCount=$prevMonthlyReferralCount, rank=$rank, referralCount=$referralCount, referrals=$referrals, referralSource=$referralSource, referralStatus=$referralStatus, shareCount=$shareCount, shareUrl=$shareUrl, uniqueImpressionCount=$uniqueImpressionCount, unsubscribed=$unsubscribed, additionalProperties=$additionalProperties}"
    }

    class ShareCount
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

            /** Returns a mutable builder for constructing an instance of [ShareCount]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ShareCount]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(shareCount: ShareCount) = apply {
                additionalProperties = shareCount.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ShareCount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ShareCount = ShareCount(additionalProperties.toImmutable())
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
        fun validate(): ShareCount = apply {
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

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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

            return other is ShareCount && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ShareCount{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Participant &&
            id == other.id &&
            email == other.email &&
            monthlyRank == other.monthlyRank &&
            monthlyReferralCount == other.monthlyReferralCount &&
            rank == other.rank &&
            referralCount == other.referralCount &&
            rewards == other.rewards &&
            shareUrl == other.shareUrl &&
            allMatchingFraudsters == other.allMatchingFraudsters &&
            createdAt == other.createdAt &&
            fingerprint == other.fingerprint &&
            firstName == other.firstName &&
            fraudReasonCode == other.fraudReasonCode &&
            fraudRiskLevel == other.fraudRiskLevel &&
            impressionCount == other.impressionCount &&
            inviteCount == other.inviteCount &&
            ipAddress == other.ipAddress &&
            isNew == other.isNew &&
            isWinner == other.isWinner &&
            lastName == other.lastName &&
            metadata == other.metadata &&
            monthlyReferrals == other.monthlyReferrals &&
            notes == other.notes &&
            paypalEmailAddress == other.paypalEmailAddress &&
            prevMonthlyRank == other.prevMonthlyRank &&
            prevMonthlyReferralCount == other.prevMonthlyReferralCount &&
            referrals == other.referrals &&
            referralSource == other.referralSource &&
            referralStatus == other.referralStatus &&
            referredBy == other.referredBy &&
            referrer == other.referrer &&
            shareCount == other.shareCount &&
            uniqueImpressionCount == other.uniqueImpressionCount &&
            unreadCommissionsCount == other.unreadCommissionsCount &&
            unreadPayoutsCount == other.unreadPayoutsCount &&
            unsubscribed == other.unsubscribed &&
            vanityKeys == other.vanityKeys &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            email,
            monthlyRank,
            monthlyReferralCount,
            rank,
            referralCount,
            rewards,
            shareUrl,
            allMatchingFraudsters,
            createdAt,
            fingerprint,
            firstName,
            fraudReasonCode,
            fraudRiskLevel,
            impressionCount,
            inviteCount,
            ipAddress,
            isNew,
            isWinner,
            lastName,
            metadata,
            monthlyReferrals,
            notes,
            paypalEmailAddress,
            prevMonthlyRank,
            prevMonthlyReferralCount,
            referrals,
            referralSource,
            referralStatus,
            referredBy,
            referrer,
            shareCount,
            uniqueImpressionCount,
            unreadCommissionsCount,
            unreadPayoutsCount,
            unsubscribed,
            vanityKeys,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Participant{id=$id, email=$email, monthlyRank=$monthlyRank, monthlyReferralCount=$monthlyReferralCount, rank=$rank, referralCount=$referralCount, rewards=$rewards, shareUrl=$shareUrl, allMatchingFraudsters=$allMatchingFraudsters, createdAt=$createdAt, fingerprint=$fingerprint, firstName=$firstName, fraudReasonCode=$fraudReasonCode, fraudRiskLevel=$fraudRiskLevel, impressionCount=$impressionCount, inviteCount=$inviteCount, ipAddress=$ipAddress, isNew=$isNew, isWinner=$isWinner, lastName=$lastName, metadata=$metadata, monthlyReferrals=$monthlyReferrals, notes=$notes, paypalEmailAddress=$paypalEmailAddress, prevMonthlyRank=$prevMonthlyRank, prevMonthlyReferralCount=$prevMonthlyReferralCount, referrals=$referrals, referralSource=$referralSource, referralStatus=$referralStatus, referredBy=$referredBy, referrer=$referrer, shareCount=$shareCount, uniqueImpressionCount=$uniqueImpressionCount, unreadCommissionsCount=$unreadCommissionsCount, unreadPayoutsCount=$unreadPayoutsCount, unsubscribed=$unsubscribed, vanityKeys=$vanityKeys, additionalProperties=$additionalProperties}"
}
