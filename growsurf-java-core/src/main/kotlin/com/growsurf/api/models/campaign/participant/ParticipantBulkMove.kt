// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import com.growsurf.api.core.JsonNull
import com.growsurf.api.core.Params
import com.growsurf.api.core.checkRequired
import com.growsurf.api.core.http.Headers
import com.growsurf.api.core.http.QueryParams
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Moves a list of participants to a group, or to Default with `groupId: null`. Up to `200` entries
 * per request.
 */
class ParticipantBulkMoveParams
private constructor(
    private val id: String?,
    private val participants: List<String>,
    private val groupId: String?,
) : Params {
    fun id(): Optional<String> = Optional.ofNullable(id)

    /** GrowSurf participant IDs and/or email addresses to move. Mixed entries are allowed. */
    fun participants(): List<String> = participants

    /** The group to move them to (`grp_…`), empty for Default. */
    fun groupId(): Optional<String> = Optional.ofNullable(groupId)

    fun toBuilder(): Builder = Builder().id(id).participants(participants).groupId(groupId)

    // The client JSON mapper drops null map values, so Default is sent as an explicit JSON null.
    internal fun _body(): Map<String, Any?> =
        linkedMapOf("participants" to participants, "groupId" to (groupId ?: JsonNull.of()))

    override fun _headers(): Headers = Headers.builder().build()

    override fun _queryParams(): QueryParams = QueryParams.builder().build()

    companion object {
        @JvmStatic fun builder(): Builder = Builder()
    }

    class Builder internal constructor() {
        private var id: String? = null
        private var participants: List<String>? = null
        private var groupId: String? = null
        private var groupIdSet = false

        fun id(id: String?) = apply { this.id = id }

        /** GrowSurf participant IDs and/or email addresses to move. 1 to 200 entries. */
        fun participants(participants: List<String>) = apply {
            this.participants = participants.toList()
        }

        /** The group to move them to (`grp_…`), or `null` for Default. Required. */
        fun groupId(groupId: String?) = apply {
            this.groupId = groupId
            groupIdSet = true
        }

        /** Alias for calling [Builder.groupId] with `groupId.orElse(null)`. */
        fun groupId(groupId: Optional<String>) = groupId(groupId.getOrNull())

        fun build(): ParticipantBulkMoveParams {
            check(groupIdSet) { "`groupId` is required; pass null to move to Default." }
            return ParticipantBulkMoveParams(
                id,
                checkRequired("participants", participants),
                groupId,
            )
        }
    }
}

data class ParticipantBulkMoveResponse
@JsonCreator
constructor(
    @JsonProperty("results") private val results: List<Result>,
    @JsonProperty("summary") private val summary: Summary,
) {
    /** One entry per submitted identifier, in the same order as the request. */
    fun results(): List<Result> = results

    fun summary(): Summary = summary

    fun validate(): ParticipantBulkMoveResponse = this

    /**
     * Per-row outcome. `MOVED` — the participant was resolved and is now in the target group.
     * `NOT_FOUND` — no participant matches the ID or email. `DUPLICATE` — the entry resolves to the
     * same participant as an earlier entry. `ERROR` — the lookup failed for this row.
     */
    enum class Status(@get:JsonValue val value: String) {
        MOVED("MOVED"),
        NOT_FOUND("NOT_FOUND"),
        DUPLICATE("DUPLICATE"),
        ERROR("ERROR"),
    }

    data class Result
    @JsonCreator
    constructor(
        @JsonProperty("index") private val index: Long,
        @JsonProperty("identifier") private val identifier: String,
        @JsonProperty("status") private val status: Status,
        @JsonProperty("participantId") private val participantId: String? = null,
        @JsonProperty("email") private val email: String? = null,
        @JsonProperty("message") private val message: String? = null,
    ) {
        /** Zero-based position of this entry in the submitted `participants` array. */
        fun index(): Long = index

        /** The submitted participant ID or email address, echoed back as received. */
        fun identifier(): String = identifier

        fun status(): Status = status

        /** The resolved GrowSurf participant ID, when the entry resolved to a participant. */
        fun participantId(): Optional<String> = Optional.ofNullable(participantId)

        /** The resolved participant's email address. Present on `MOVED` rows. */
        fun email(): Optional<String> = Optional.ofNullable(email)

        /** Human-readable detail for `NOT_FOUND`, `DUPLICATE`, and `ERROR` rows. */
        fun message(): Optional<String> = Optional.ofNullable(message)
    }

    data class Summary
    @JsonCreator
    constructor(
        @JsonProperty("total") private val total: Long,
        @JsonProperty("groupId") private val groupId: String?,
        @JsonProperty("movedCount") private val movedCount: Long,
        @JsonProperty("notFoundCount") private val notFoundCount: Long,
        @JsonProperty("duplicateCount") private val duplicateCount: Long,
        @JsonProperty("errorCount") private val errorCount: Long,
    ) {
        /** The number of submitted entries. */
        fun total(): Long = total

        /** The target group, empty for Default. */
        fun groupId(): Optional<String> = Optional.ofNullable(groupId)

        /** Entries that resolved to a participant and were moved. */
        fun movedCount(): Long = movedCount

        /** Entries that did not match any participant. */
        fun notFoundCount(): Long = notFoundCount

        /** Entries that resolved to the same participant as an earlier entry. */
        fun duplicateCount(): Long = duplicateCount

        /** Entries that failed to look up. */
        fun errorCount(): Long = errorCount
    }
}
