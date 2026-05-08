// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.fasterxml.jackson.annotation.JsonCreator
import com.growsurf.api.core.Enum
import com.growsurf.api.core.JsonField
import com.growsurf.api.core.Params
import com.growsurf.api.core.http.Headers
import com.growsurf.api.core.http.QueryParams
import com.growsurf.api.errors.GrowsurfInvalidDataException
import com.growsurf.api.models.campaign.participant.ReferralStatus
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieves a list of all referrals and email invites made by participants in a program. */
class CampaignListReferralsParams
private constructor(
    private val id: String?,
    private val desc: Boolean?,
    private val email: String?,
    private val firstName: String?,
    private val lastName: String?,
    private val limit: Long?,
    private val nextId: String?,
    private val offset: Long?,
    private val referralStatus: ReferralStatus?,
    private val sortBy: SortBy?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /** Return results in descending order when true. */
    fun desc(): Optional<Boolean> = Optional.ofNullable(desc)

    /** URL-encoded email value to filter referral results. */
    fun email(): Optional<String> = Optional.ofNullable(email)

    /** First name value to filter results. */
    fun firstName(): Optional<String> = Optional.ofNullable(firstName)

    /** Last name value to filter results. */
    fun lastName(): Optional<String> = Optional.ofNullable(lastName)

    /** Number of results to return. Maximum 100. */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** ID to start the next paged result set with. */
    fun nextId(): Optional<String> = Optional.ofNullable(nextId)

    /** Offset number used to skip through a result set. */
    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    fun referralStatus(): Optional<ReferralStatus> = Optional.ofNullable(referralStatus)

    /** Field used to sort referral results. */
    fun sortBy(): Optional<SortBy> = Optional.ofNullable(sortBy)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CampaignListReferralsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [CampaignListReferralsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CampaignListReferralsParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var desc: Boolean? = null
        private var email: String? = null
        private var firstName: String? = null
        private var lastName: String? = null
        private var limit: Long? = null
        private var nextId: String? = null
        private var offset: Long? = null
        private var referralStatus: ReferralStatus? = null
        private var sortBy: SortBy? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(campaignListReferralsParams: CampaignListReferralsParams) = apply {
            id = campaignListReferralsParams.id
            desc = campaignListReferralsParams.desc
            email = campaignListReferralsParams.email
            firstName = campaignListReferralsParams.firstName
            lastName = campaignListReferralsParams.lastName
            limit = campaignListReferralsParams.limit
            nextId = campaignListReferralsParams.nextId
            offset = campaignListReferralsParams.offset
            referralStatus = campaignListReferralsParams.referralStatus
            sortBy = campaignListReferralsParams.sortBy
            additionalHeaders = campaignListReferralsParams.additionalHeaders.toBuilder()
            additionalQueryParams = campaignListReferralsParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /** Return results in descending order when true. */
        fun desc(desc: Boolean?) = apply { this.desc = desc }

        /**
         * Alias for [Builder.desc].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun desc(desc: Boolean) = desc(desc as Boolean?)

        /** Alias for calling [Builder.desc] with `desc.orElse(null)`. */
        fun desc(desc: Optional<Boolean>) = desc(desc.getOrNull())

        /** URL-encoded email value to filter referral results. */
        fun email(email: String?) = apply { this.email = email }

        /** Alias for calling [Builder.email] with `email.orElse(null)`. */
        fun email(email: Optional<String>) = email(email.getOrNull())

        /** First name value to filter results. */
        fun firstName(firstName: String?) = apply { this.firstName = firstName }

        /** Alias for calling [Builder.firstName] with `firstName.orElse(null)`. */
        fun firstName(firstName: Optional<String>) = firstName(firstName.getOrNull())

        /** Last name value to filter results. */
        fun lastName(lastName: String?) = apply { this.lastName = lastName }

        /** Alias for calling [Builder.lastName] with `lastName.orElse(null)`. */
        fun lastName(lastName: Optional<String>) = lastName(lastName.getOrNull())

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

        /** Offset number used to skip through a result set. */
        fun offset(offset: Long?) = apply { this.offset = offset }

        /**
         * Alias for [Builder.offset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun offset(offset: Long) = offset(offset as Long?)

        /** Alias for calling [Builder.offset] with `offset.orElse(null)`. */
        fun offset(offset: Optional<Long>) = offset(offset.getOrNull())

        fun referralStatus(referralStatus: ReferralStatus?) = apply {
            this.referralStatus = referralStatus
        }

        /** Alias for calling [Builder.referralStatus] with `referralStatus.orElse(null)`. */
        fun referralStatus(referralStatus: Optional<ReferralStatus>) =
            referralStatus(referralStatus.getOrNull())

        /** Field used to sort referral results. */
        fun sortBy(sortBy: SortBy?) = apply { this.sortBy = sortBy }

        /** Alias for calling [Builder.sortBy] with `sortBy.orElse(null)`. */
        fun sortBy(sortBy: Optional<SortBy>) = sortBy(sortBy.getOrNull())

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
         * Returns an immutable instance of [CampaignListReferralsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CampaignListReferralsParams =
            CampaignListReferralsParams(
                id,
                desc,
                email,
                firstName,
                lastName,
                limit,
                nextId,
                offset,
                referralStatus,
                sortBy,
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
                desc?.let { put("desc", it.toString()) }
                email?.let { put("email", it) }
                firstName?.let { put("firstName", it) }
                lastName?.let { put("lastName", it) }
                limit?.let { put("limit", it.toString()) }
                nextId?.let { put("nextId", it) }
                offset?.let { put("offset", it.toString()) }
                referralStatus?.let { put("referralStatus", it.toString()) }
                sortBy?.let { put("sortBy", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Field used to sort referral results. */
    class SortBy @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val UPDATED_AT = of("updatedAt")

            @JvmField val CREATED_AT = of("createdAt")

            @JvmField val EMAIL = of("email")

            @JvmField val FIRST_NAME = of("firstName")

            @JvmField val LAST_NAME = of("lastName")

            @JvmField val REFERRAL_STATUS = of("referralStatus")

            @JvmField val REFERRAL_TRIGGERED_AT = of("referralTriggeredAt")

            @JvmStatic fun of(value: String) = SortBy(JsonField.of(value))
        }

        /** An enum containing [SortBy]'s known values. */
        enum class Known {
            UPDATED_AT,
            CREATED_AT,
            EMAIL,
            FIRST_NAME,
            LAST_NAME,
            REFERRAL_STATUS,
            REFERRAL_TRIGGERED_AT,
        }

        /**
         * An enum containing [SortBy]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SortBy] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            UPDATED_AT,
            CREATED_AT,
            EMAIL,
            FIRST_NAME,
            LAST_NAME,
            REFERRAL_STATUS,
            REFERRAL_TRIGGERED_AT,
            /** An enum member indicating that [SortBy] was instantiated with an unknown value. */
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
                UPDATED_AT -> Value.UPDATED_AT
                CREATED_AT -> Value.CREATED_AT
                EMAIL -> Value.EMAIL
                FIRST_NAME -> Value.FIRST_NAME
                LAST_NAME -> Value.LAST_NAME
                REFERRAL_STATUS -> Value.REFERRAL_STATUS
                REFERRAL_TRIGGERED_AT -> Value.REFERRAL_TRIGGERED_AT
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
                UPDATED_AT -> Known.UPDATED_AT
                CREATED_AT -> Known.CREATED_AT
                EMAIL -> Known.EMAIL
                FIRST_NAME -> Known.FIRST_NAME
                LAST_NAME -> Known.LAST_NAME
                REFERRAL_STATUS -> Known.REFERRAL_STATUS
                REFERRAL_TRIGGERED_AT -> Known.REFERRAL_TRIGGERED_AT
                else -> throw GrowsurfInvalidDataException("Unknown SortBy: $value")
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
        fun validate(): SortBy = apply {
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

            return other is SortBy && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CampaignListReferralsParams &&
            id == other.id &&
            desc == other.desc &&
            email == other.email &&
            firstName == other.firstName &&
            lastName == other.lastName &&
            limit == other.limit &&
            nextId == other.nextId &&
            offset == other.offset &&
            referralStatus == other.referralStatus &&
            sortBy == other.sortBy &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            desc,
            email,
            firstName,
            lastName,
            limit,
            nextId,
            offset,
            referralStatus,
            sortBy,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CampaignListReferralsParams{id=$id, desc=$desc, email=$email, firstName=$firstName, lastName=$lastName, limit=$limit, nextId=$nextId, offset=$offset, referralStatus=$referralStatus, sortBy=$sortBy, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
