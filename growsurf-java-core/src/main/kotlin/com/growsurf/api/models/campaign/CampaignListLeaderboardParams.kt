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

/** Retrieves participants in leaderboard order for the specified leaderboard type. */
class CampaignListLeaderboardParams
private constructor(
    private val id: String?,
    private val isMonthly: Boolean?,
    private val leaderboardType: LeaderboardType?,
    private val limit: Long?,
    private val nextId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /** Deprecated. Use `leaderboardType=CURRENT_MONTH` instead. */
    fun isMonthly(): Optional<Boolean> = Optional.ofNullable(isMonthly)

    /** Leaderboard ordering mode. */
    fun leaderboardType(): Optional<LeaderboardType> = Optional.ofNullable(leaderboardType)

    /** Number of results to return. Maximum 100. */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** ID to start the next paged result set with. */
    fun nextId(): Optional<String> = Optional.ofNullable(nextId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CampaignListLeaderboardParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [CampaignListLeaderboardParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CampaignListLeaderboardParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var isMonthly: Boolean? = null
        private var leaderboardType: LeaderboardType? = null
        private var limit: Long? = null
        private var nextId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(campaignListLeaderboardParams: CampaignListLeaderboardParams) = apply {
            id = campaignListLeaderboardParams.id
            isMonthly = campaignListLeaderboardParams.isMonthly
            leaderboardType = campaignListLeaderboardParams.leaderboardType
            limit = campaignListLeaderboardParams.limit
            nextId = campaignListLeaderboardParams.nextId
            additionalHeaders = campaignListLeaderboardParams.additionalHeaders.toBuilder()
            additionalQueryParams = campaignListLeaderboardParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /** Deprecated. Use `leaderboardType=CURRENT_MONTH` instead. */
        fun isMonthly(isMonthly: Boolean?) = apply { this.isMonthly = isMonthly }

        /**
         * Alias for [Builder.isMonthly].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isMonthly(isMonthly: Boolean) = isMonthly(isMonthly as Boolean?)

        /** Alias for calling [Builder.isMonthly] with `isMonthly.orElse(null)`. */
        fun isMonthly(isMonthly: Optional<Boolean>) = isMonthly(isMonthly.getOrNull())

        /** Leaderboard ordering mode. */
        fun leaderboardType(leaderboardType: LeaderboardType?) = apply {
            this.leaderboardType = leaderboardType
        }

        /** Alias for calling [Builder.leaderboardType] with `leaderboardType.orElse(null)`. */
        fun leaderboardType(leaderboardType: Optional<LeaderboardType>) =
            leaderboardType(leaderboardType.getOrNull())

        /** Number of results to return. Maximum 100. */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** ID to start the next paged result set with. */
        fun nextId(nextId: String?) = apply { this.nextId = nextId }

        /** Alias for calling [Builder.nextId] with `nextId.orElse(null)`. */
        fun nextId(nextId: Optional<String>) = nextId(nextId.getOrNull())

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
         * Returns an immutable instance of [CampaignListLeaderboardParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CampaignListLeaderboardParams =
            CampaignListLeaderboardParams(
                id,
                isMonthly,
                leaderboardType,
                limit,
                nextId,
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
                isMonthly?.let { put("isMonthly", it.toString()) }
                leaderboardType?.let { put("leaderboardType", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                nextId?.let { put("nextId", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Leaderboard ordering mode. */
    class LeaderboardType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ALL_TIME = of("ALL_TIME")

            @JvmField val CURRENT_MONTH = of("CURRENT_MONTH")

            @JvmField val PREV_MONTH = of("PREV_MONTH")

            @JvmField val TOTAL_IMPRESSION_COUNT = of("TOTAL_IMPRESSION_COUNT")

            @JvmField val UNIQUE_IMPRESSION_COUNT = of("UNIQUE_IMPRESSION_COUNT")

            @JvmField val BY_COMMISSIONS = of("BY_COMMISSIONS")

            @JvmField val BY_REVENUE = of("BY_REVENUE")

            @JvmField val BY_REFERRALS = of("BY_REFERRALS")

            @JvmField val BY_LEADS = of("BY_LEADS")

            @JvmStatic fun of(value: String) = LeaderboardType(JsonField.of(value))
        }

        /** An enum containing [LeaderboardType]'s known values. */
        enum class Known {
            ALL_TIME,
            CURRENT_MONTH,
            PREV_MONTH,
            TOTAL_IMPRESSION_COUNT,
            UNIQUE_IMPRESSION_COUNT,
            BY_COMMISSIONS,
            BY_REVENUE,
            BY_REFERRALS,
            BY_LEADS,
        }

        /**
         * An enum containing [LeaderboardType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [LeaderboardType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ALL_TIME,
            CURRENT_MONTH,
            PREV_MONTH,
            TOTAL_IMPRESSION_COUNT,
            UNIQUE_IMPRESSION_COUNT,
            BY_COMMISSIONS,
            BY_REVENUE,
            BY_REFERRALS,
            BY_LEADS,
            /**
             * An enum member indicating that [LeaderboardType] was instantiated with an unknown
             * value.
             */
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
                ALL_TIME -> Value.ALL_TIME
                CURRENT_MONTH -> Value.CURRENT_MONTH
                PREV_MONTH -> Value.PREV_MONTH
                TOTAL_IMPRESSION_COUNT -> Value.TOTAL_IMPRESSION_COUNT
                UNIQUE_IMPRESSION_COUNT -> Value.UNIQUE_IMPRESSION_COUNT
                BY_COMMISSIONS -> Value.BY_COMMISSIONS
                BY_REVENUE -> Value.BY_REVENUE
                BY_REFERRALS -> Value.BY_REFERRALS
                BY_LEADS -> Value.BY_LEADS
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
                ALL_TIME -> Known.ALL_TIME
                CURRENT_MONTH -> Known.CURRENT_MONTH
                PREV_MONTH -> Known.PREV_MONTH
                TOTAL_IMPRESSION_COUNT -> Known.TOTAL_IMPRESSION_COUNT
                UNIQUE_IMPRESSION_COUNT -> Known.UNIQUE_IMPRESSION_COUNT
                BY_COMMISSIONS -> Known.BY_COMMISSIONS
                BY_REVENUE -> Known.BY_REVENUE
                BY_REFERRALS -> Known.BY_REFERRALS
                BY_LEADS -> Known.BY_LEADS
                else -> throw GrowsurfInvalidDataException("Unknown LeaderboardType: $value")
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
            _value().asString().orElseThrow {
                GrowsurfInvalidDataException("Value is not a String")
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
        fun validate(): LeaderboardType = apply {
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

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LeaderboardType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CampaignListLeaderboardParams &&
            id == other.id &&
            isMonthly == other.isMonthly &&
            leaderboardType == other.leaderboardType &&
            limit == other.limit &&
            nextId == other.nextId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            isMonthly,
            leaderboardType,
            limit,
            nextId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CampaignListLeaderboardParams{id=$id, isMonthly=$isMonthly, leaderboardType=$leaderboardType, limit=$limit, nextId=$nextId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
