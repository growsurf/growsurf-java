// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.groups

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import com.growsurf.api.core.Params
import com.growsurf.api.core.checkRequired
import com.growsurf.api.core.http.Headers
import com.growsurf.api.core.http.QueryParams
import java.util.Optional

/**
 * How a participant got into their group. `MANUAL` — a move (a `PARTICIPANT` rule, Update
 * participant, bulk move, or the dashboard), including a move to Default. `LINK` — the group's
 * signup link. `EMAIL` — an `EMAIL` rule. `DOMAIN` — a `DOMAIN` rule.
 */
enum class RewardGroupSource(@get:JsonValue val value: String) {
    MANUAL("MANUAL"),
    LINK("LINK"),
    EMAIL("EMAIL"),
    DOMAIN("DOMAIN"),
}

/**
 * `PARTICIPANT` — an existing participant ID; the participant moves in now. `EMAIL` — an exact
 * email address. `DOMAIN` — a company domain such as `hooli.com`, which also matches its
 * subdomains. Email and domain rules place new signups and affiliate approvals.
 */
enum class RewardGroupRuleType(@get:JsonValue val value: String) {
    PARTICIPANT("PARTICIPANT"),
    EMAIL("EMAIL"),
    DOMAIN("DOMAIN"),
}

/** A rule that places participants in a group. */
data class RewardGroupRule
@JsonCreator
constructor(
    @param:JsonProperty("type") @get:JsonProperty("type") private val type: RewardGroupRuleType,
    /** The participant ID, email address, or domain. 1 to 254 characters. */
    @param:JsonProperty("value") @get:JsonProperty("value") private val value: String,
) {
    @JsonProperty("type") fun type(): RewardGroupRuleType = type

    @JsonProperty("value") fun value(): String = value

    fun validate(): RewardGroupRule = this

    companion object {
        @JvmStatic
        fun of(type: RewardGroupRuleType, value: String): RewardGroupRule =
            RewardGroupRule(type, value)
    }
}

/**
 * A group of participants who earn their own rewards. Its rewards are the Campaign Rewards whose
 * `groupId` is this group's `id`.
 */
data class RewardGroup
@JsonCreator
constructor(
    @JsonProperty("id") private val id: String,
    @JsonProperty("name") private val name: String,
    @JsonProperty("order") private val order: Long,
    @JsonProperty("rules") private val rules: List<RewardGroupRule>,
    @JsonProperty("signupCode") private val signupCode: String,
    @JsonProperty("createdAt") private val createdAt: Long,
    @JsonProperty("updatedAt") private val updatedAt: Long,
) {
    /**
     * The group ID. Participants, Campaign Rewards, and participant rewards name it as `groupId`.
     */
    fun id(): String = id

    /** The group name (internal only, never shown to participants). */
    fun name(): String = name

    /** The group's position in the program's group list. */
    fun order(): Long = order

    /** The rules that place participants in this group. */
    fun rules(): List<RewardGroupRule> = rules

    /**
     * The code for this group's signup link. A participant who signs up through it joins this
     * group.
     */
    fun signupCode(): String = signupCode

    /** When the group was created, in Unix milliseconds. */
    fun createdAt(): Long = createdAt

    /** When the group was last changed, in Unix milliseconds. */
    fun updatedAt(): Long = updatedAt

    fun validate(): RewardGroup = apply { rules.forEach { it.validate() } }
}

data class RewardGroupListResponse
@JsonCreator
constructor(@JsonProperty("groups") private val groups: List<RewardGroup>) {
    /** The program's groups in display order. Default is not listed. */
    fun groups(): List<RewardGroup> = groups

    fun validate(): RewardGroupListResponse = apply { groups.forEach { it.validate() } }
}

data class DeleteRewardGroupResponse
@JsonCreator
constructor(
    @JsonProperty("id") private val id: String,
    @JsonProperty("movedToDefault") private val movedToDefault: Long,
    @JsonProperty("success") private val success: Boolean,
) {
    /** The deleted group ID. */
    fun id(): String = id

    /** The number of members moved to Default. */
    fun movedToDefault(): Long = movedToDefault

    /** Whether the group was deleted. */
    fun success(): Boolean = success

    fun validate(): DeleteRewardGroupResponse = this
}

abstract class RewardGroupParams : Params {
    final override fun _headers(): Headers = Headers.builder().build()

    final override fun _queryParams(): QueryParams = QueryParams.builder().build()
}

class RewardGroupListParams private constructor(private val id: String?) : RewardGroupParams() {
    fun id(): Optional<String> = Optional.ofNullable(id)

    fun toBuilder(): Builder = Builder().id(id)

    companion object {
        @JvmStatic fun none(): RewardGroupListParams = Builder().build()

        @JvmStatic fun builder(): Builder = Builder()
    }

    class Builder internal constructor() {
        private var id: String? = null

        fun id(id: String?) = apply { this.id = id }

        fun build(): RewardGroupListParams = RewardGroupListParams(id)
    }
}

class RewardGroupCreateParams
private constructor(private val id: String?, private val body: Map<String, Any?>) :
    RewardGroupParams() {
    fun id(): Optional<String> = Optional.ofNullable(id)

    fun toBuilder(): Builder = Builder().id(id).body(body)

    internal fun _body(): Map<String, Any?> = body

    companion object {
        @JvmStatic fun builder(): Builder = Builder()
    }

    class Builder internal constructor() {
        private var id: String? = null
        private val body = linkedMapOf<String, Any?>()

        fun id(id: String?) = apply { this.id = id }

        /** The group name (internal only, never shown to participants). 1 to 100 characters. */
        fun name(name: String) = apply { body["name"] = name }

        /**
         * The rules that place participants in this group. Each email and domain can be in one
         * group only. Up to 500.
         */
        fun rules(rules: List<RewardGroupRule>) = apply { body["rules"] = rules.toList() }

        internal fun body(body: Map<String, Any?>) = apply {
            this.body.clear()
            this.body.putAll(body)
        }

        fun build(): RewardGroupCreateParams {
            checkRequired("name", body["name"])
            return RewardGroupCreateParams(id, body.toMap())
        }
    }
}

class RewardGroupRetrieveParams
private constructor(private val id: String, private val groupId: String?) : RewardGroupParams() {
    fun id(): String = id

    fun groupId(): Optional<String> = Optional.ofNullable(groupId)

    fun toBuilder(): Builder = Builder().id(id).groupId(groupId)

    companion object {
        @JvmStatic fun builder(): Builder = Builder()
    }

    class Builder internal constructor() {
        private var id: String? = null
        private var groupId: String? = null

        fun id(id: String) = apply { this.id = id }

        fun groupId(groupId: String?) = apply { this.groupId = groupId }

        fun build(): RewardGroupRetrieveParams =
            RewardGroupRetrieveParams(checkRequired("id", id), groupId)
    }
}

class RewardGroupUpdateParams
private constructor(
    private val id: String,
    private val groupId: String?,
    private val body: Map<String, Any?>,
) : RewardGroupParams() {
    fun id(): String = id

    fun groupId(): Optional<String> = Optional.ofNullable(groupId)

    fun toBuilder(): Builder = Builder().id(id).groupId(groupId).body(body)

    internal fun _body(): Map<String, Any?> = body

    companion object {
        @JvmStatic fun builder(): Builder = Builder()
    }

    class Builder internal constructor() {
        private var id: String? = null
        private var groupId: String? = null
        private val body = linkedMapOf<String, Any?>()

        fun id(id: String) = apply { this.id = id }

        fun groupId(groupId: String?) = apply { this.groupId = groupId }

        /** The group name (internal only, never shown to participants). 1 to 100 characters. */
        fun name(name: String) = apply { body["name"] = name }

        /** The group's position in the program's group list. */
        fun order(order: Long) = apply { body["order"] = order }

        /** Replaces the group's whole rule list. Up to 500. */
        fun rules(rules: List<RewardGroupRule>) = apply { body["rules"] = rules.toList() }

        internal fun body(body: Map<String, Any?>) = apply {
            this.body.clear()
            this.body.putAll(body)
        }

        fun build(): RewardGroupUpdateParams =
            RewardGroupUpdateParams(checkRequired("id", id), groupId, body.toMap())
    }
}

class RewardGroupDeleteParams
private constructor(private val id: String, private val groupId: String?) : RewardGroupParams() {
    fun id(): String = id

    fun groupId(): Optional<String> = Optional.ofNullable(groupId)

    fun toBuilder(): Builder = Builder().id(id).groupId(groupId)

    companion object {
        @JvmStatic fun builder(): Builder = Builder()
    }

    class Builder internal constructor() {
        private var id: String? = null
        private var groupId: String? = null

        fun id(id: String) = apply { this.id = id }

        fun groupId(groupId: String?) = apply { this.groupId = groupId }

        fun build(): RewardGroupDeleteParams =
            RewardGroupDeleteParams(checkRequired("id", id), groupId)
    }
}
