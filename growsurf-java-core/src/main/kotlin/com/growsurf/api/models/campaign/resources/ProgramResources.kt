// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.resources

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import com.growsurf.api.core.Params
import com.growsurf.api.core.checkRequired
import com.growsurf.api.core.http.Headers
import com.growsurf.api.core.http.QueryParams
import java.util.Optional

enum class ProgramResourceType(@get:JsonValue val value: String) {
    FILE("FILE"),
    LINK("LINK"),
    TEXT("TEXT"),
}

enum class ProgramResourceModerationStatus(@get:JsonValue val value: String) {
    PENDING("PENDING"),
    APPROVED("APPROVED"),
    REJECTED("REJECTED"),
}

data class ProgramResourceFile
@JsonCreator
constructor(
    @JsonProperty("fileName") private val fileName: String,
    @JsonProperty("mimeType") private val mimeType: String,
    @JsonProperty("bytes") private val bytes: Long,
    @JsonProperty("format") private val format: String,
    @JsonProperty("moderationStatus") private val moderationStatus: ProgramResourceModerationStatus,
) {
    fun fileName(): String = fileName

    fun mimeType(): String = mimeType

    fun bytes(): Long = bytes

    fun format(): String = format

    fun moderationStatus(): ProgramResourceModerationStatus = moderationStatus

    fun validate(): ProgramResourceFile = this
}

data class ProgramResource
@JsonCreator
constructor(
    @JsonProperty("id") private val id: String,
    @JsonProperty("type") private val type: ProgramResourceType,
    @JsonProperty("title") private val title: String,
    @JsonProperty("description") private val description: String?,
    @JsonProperty("category") private val category: String?,
    @JsonProperty("url") private val url: String?,
    @JsonProperty("text") private val text: String?,
    @JsonProperty("file") private val file: ProgramResourceFile?,
    @JsonProperty("isPublished") private val isPublished: Boolean,
    @JsonProperty("position") private val position: Long,
    @JsonProperty("createdAt") private val createdAt: Long,
    @JsonProperty("updatedAt") private val updatedAt: Long,
) {
    fun id(): String = id

    fun type(): ProgramResourceType = type

    fun title(): String = title

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun category(): Optional<String> = Optional.ofNullable(category)

    fun url(): Optional<String> = Optional.ofNullable(url)

    fun text(): Optional<String> = Optional.ofNullable(text)

    fun file(): Optional<ProgramResourceFile> = Optional.ofNullable(file)

    fun isPublished(): Boolean = isPublished

    fun position(): Long = position

    /** The creation time as a Unix timestamp in milliseconds. */
    fun createdAt(): Long = createdAt

    /** The latest update time as a Unix timestamp in milliseconds. */
    fun updatedAt(): Long = updatedAt

    fun validate(): ProgramResource = apply { file?.validate() }
}

data class ProgramResourceListResponse
@JsonCreator
constructor(@JsonProperty("resources") private val resources: List<ProgramResource>) {
    fun resources(): List<ProgramResource> = resources

    fun validate(): ProgramResourceListResponse = apply { resources.forEach { it.validate() } }
}

data class DeleteProgramResourceResponse
@JsonCreator
constructor(
    @JsonProperty("id") private val id: String,
    @JsonProperty("success") private val success: Boolean,
) {
    fun id(): String = id

    fun success(): Boolean = success

    fun validate(): DeleteProgramResourceResponse = this
}

/** One opaque scalar field returned with a Program Resource upload ticket. */
class ProgramResourceUploadParameter private constructor(private val value: Any) {
    @JsonValue fun value(): Any = value

    override fun equals(other: Any?): Boolean =
        this === other || (other is ProgramResourceUploadParameter && value == other.value)

    override fun hashCode(): Int = value.hashCode()

    override fun toString(): String = value.toString()

    companion object {
        /** Creates a parameter from the only public scalar types allowed by the API contract. */
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        @JvmStatic
        fun of(value: Any): ProgramResourceUploadParameter {
            require(value is String || value is Number || value is Boolean) {
                "Program Resource upload parameters must be strings, numbers, or booleans."
            }
            return ProgramResourceUploadParameter(value)
        }
    }
}

data class ProgramResourceUploadTicket
@JsonCreator
constructor(
    @JsonProperty("ticket") private val ticket: String,
    @JsonProperty("expiresIn") private val expiresIn: Long,
    @JsonProperty("uploadUrl") private val uploadUrl: String,
    @JsonProperty("uploadParameters")
    private val uploadParameters: Map<String, ProgramResourceUploadParameter>,
) {
    fun ticket(): String = ticket

    fun expiresIn(): Long = expiresIn

    fun uploadUrl(): String = uploadUrl

    fun uploadParameters(): Map<String, ProgramResourceUploadParameter> = uploadParameters

    fun validate(): ProgramResourceUploadTicket = this
}

enum class ProgramResourceUploadResultResourceType(@get:JsonValue val value: String) {
    IMAGE("image"),
    RAW("raw"),
}

enum class ProgramResourceUploadResultType(@get:JsonValue val value: String) {
    AUTHENTICATED("authenticated")
}

/** The unmodified signed result returned after uploading with a GrowSurf ticket. */
data class ProgramResourceUploadResult
@JsonCreator
constructor(
    @param:JsonProperty("public_id") @get:JsonProperty("public_id") private val publicId: String,
    @param:JsonProperty("version") @get:JsonProperty("version") private val version: Long,
    @param:JsonProperty("signature") @get:JsonProperty("signature") private val signature: String,
    @param:JsonProperty("resource_type")
    @get:JsonProperty("resource_type")
    private val resourceType: ProgramResourceUploadResultResourceType,
    @param:JsonProperty("type")
    @get:JsonProperty("type")
    private val type: ProgramResourceUploadResultType,
    @param:JsonProperty("bytes") @get:JsonProperty("bytes") private val bytes: Long,
    @param:JsonProperty("secure_url") @get:JsonProperty("secure_url") private val secureUrl: String,
    @param:JsonProperty("asset_id")
    @get:JsonProperty("asset_id")
    private val assetId: String? = null,
    @param:JsonProperty("format") @get:JsonProperty("format") private val format: String? = null,
    @get:JsonIgnore private val additionalProperties: Map<String, Any?> = emptyMap(),
) {
    @JsonProperty("public_id") fun publicId(): String = publicId

    @JsonProperty("version") fun version(): Long = version

    @JsonProperty("signature") fun signature(): String = signature

    @JsonProperty("resource_type")
    fun resourceType(): ProgramResourceUploadResultResourceType = resourceType

    @JsonProperty("type") fun type(): ProgramResourceUploadResultType = type

    @JsonProperty("bytes") fun bytes(): Long = bytes

    @JsonProperty("secure_url") fun secureUrl(): String = secureUrl

    @JsonProperty("asset_id") fun assetId(): Optional<String> = Optional.ofNullable(assetId)

    @JsonProperty("format") fun format(): Optional<String> = Optional.ofNullable(format)

    @JsonAnyGetter fun _additionalProperties(): Map<String, Any?> = additionalProperties

    fun validate(): ProgramResourceUploadResult = this
}

abstract class ProgramResourceParams : Params {
    final override fun _headers(): Headers = Headers.builder().build()

    final override fun _queryParams(): QueryParams = QueryParams.builder().build()
}

/** Rejects Resource field combinations excluded by the public REST contract. */
private fun validateProgramResourceWrite(body: Map<String, Any?>, creating: Boolean) {
    require(creating || body.isNotEmpty()) { "Program Resource update requires at least one field" }

    val position = body["position"]
    require(!body.containsKey("position") || (position is Long && position in 0L..99L)) {
        "Program Resource position must be an integer from 0 through 99"
    }

    val hasUploadTicket = body.containsKey("uploadTicket")
    val hasUploadResult = body.containsKey("uploadResult")
    require(hasUploadTicket == hasUploadResult) {
        "uploadTicket and uploadResult must be supplied together"
    }

    val suppliedTypes = buildList {
        if (body.containsKey("url")) add(ProgramResourceType.LINK)
        if (body.containsKey("text")) add(ProgramResourceType.TEXT)
        if (hasUploadTicket) add(ProgramResourceType.FILE)
    }
    require(suppliedTypes.size <= 1) { "Send content fields for only one Program Resource type" }

    val type = body["type"] as? ProgramResourceType
    require(type == null || suppliedTypes.isEmpty() || suppliedTypes.single() == type) {
        "Content fields must match the selected Program Resource type"
    }
    require(creating || type == null || suppliedTypes.singleOrNull() == type) {
        "Changing a Program Resource type requires its replacement content"
    }
    require(!creating || suppliedTypes.singleOrNull() == type) {
        "Create requires content fields for the selected Program Resource type"
    }
}

class ProgramResourceListParams private constructor(private val id: String?) :
    ProgramResourceParams() {
    fun id(): Optional<String> = Optional.ofNullable(id)

    fun toBuilder(): Builder = Builder().id(id)

    internal fun _pathParam(index: Int): String = if (index == 0) id.orEmpty() else ""

    companion object {
        @JvmStatic fun none(): ProgramResourceListParams = Builder().build()

        @JvmStatic fun builder(): Builder = Builder()
    }

    class Builder internal constructor() {
        private var id: String? = null

        fun id(id: String?) = apply { this.id = id }

        fun build(): ProgramResourceListParams = ProgramResourceListParams(id)
    }
}

class ProgramResourceCreateParams
private constructor(private val id: String?, private val body: Map<String, Any?>) :
    ProgramResourceParams() {
    fun id(): Optional<String> = Optional.ofNullable(id)

    fun toBuilder(): Builder = Builder().id(id).body(body)

    internal fun _body(): Map<String, Any?> = body

    internal fun _pathParam(index: Int): String = if (index == 0) id.orEmpty() else ""

    companion object {
        @JvmStatic fun builder(): Builder = Builder()
    }

    class Builder internal constructor() {
        private var id: String? = null
        private val body = linkedMapOf<String, Any?>()

        fun id(id: String?) = apply { this.id = id }

        fun type(type: ProgramResourceType) = apply { body["type"] = type }

        fun title(title: String) = apply { body["title"] = title }

        fun description(description: String?) = apply { body["description"] = description }

        fun category(category: String?) = apply { body["category"] = category }

        fun isPublished(isPublished: Boolean) = apply { body["isPublished"] = isPublished }

        fun url(url: String) = apply { body["url"] = url }

        fun text(text: String) = apply { body["text"] = text }

        fun uploadTicket(uploadTicket: String) = apply { body["uploadTicket"] = uploadTicket }

        fun uploadResult(uploadResult: ProgramResourceUploadResult) = apply {
            body["uploadResult"] = uploadResult
        }

        /** Accepts the raw upload response map used by earlier SDK versions. */
        fun uploadResult(uploadResult: Map<String, Any?>) = apply {
            body["uploadResult"] = uploadResult
        }

        internal fun body(body: Map<String, Any?>) = apply {
            this.body.clear()
            this.body.putAll(body)
        }

        fun build(): ProgramResourceCreateParams {
            checkRequired("type", body["type"])
            checkRequired("title", body["title"])
            validateProgramResourceWrite(body, creating = true)
            return ProgramResourceCreateParams(id, body.toMap())
        }
    }
}

class ProgramResourceUpdateParams
private constructor(
    private val id: String,
    private val resourceId: String?,
    private val body: Map<String, Any?>,
) : ProgramResourceParams() {
    fun id(): String = id

    fun resourceId(): Optional<String> = Optional.ofNullable(resourceId)

    fun toBuilder(): Builder = Builder().id(id).resourceId(resourceId).body(body)

    internal fun _body(): Map<String, Any?> = body

    internal fun _pathParam(index: Int): String =
        when (index) {
            0 -> id
            1 -> resourceId.orEmpty()
            else -> ""
        }

    companion object {
        @JvmStatic fun builder(): Builder = Builder()
    }

    class Builder internal constructor() {
        private var id: String? = null
        private var resourceId: String? = null
        private val body = linkedMapOf<String, Any?>()

        fun id(id: String) = apply { this.id = id }

        fun resourceId(resourceId: String?) = apply { this.resourceId = resourceId }

        fun type(type: ProgramResourceType) = apply { body["type"] = type }

        fun title(title: String) = apply { body["title"] = title }

        fun description(description: String?) = apply { body["description"] = description }

        fun category(category: String?) = apply { body["category"] = category }

        fun isPublished(isPublished: Boolean) = apply { body["isPublished"] = isPublished }

        /** Sets a zero-based destination from 0 through 99 within the current Resource list. */
        fun position(position: Long) = apply { body["position"] = position }

        fun url(url: String) = apply { body["url"] = url }

        fun text(text: String) = apply { body["text"] = text }

        fun uploadTicket(uploadTicket: String) = apply { body["uploadTicket"] = uploadTicket }

        fun uploadResult(uploadResult: ProgramResourceUploadResult) = apply {
            body["uploadResult"] = uploadResult
        }

        /** Accepts the raw upload response map used by earlier SDK versions. */
        fun uploadResult(uploadResult: Map<String, Any?>) = apply {
            body["uploadResult"] = uploadResult
        }

        internal fun body(body: Map<String, Any?>) = apply {
            this.body.clear()
            this.body.putAll(body)
        }

        fun build(): ProgramResourceUpdateParams {
            validateProgramResourceWrite(body, creating = false)
            return ProgramResourceUpdateParams(checkRequired("id", id), resourceId, body.toMap())
        }
    }
}

class ProgramResourceDeleteParams
private constructor(private val id: String, private val resourceId: String?) :
    ProgramResourceParams() {
    fun id(): String = id

    fun resourceId(): Optional<String> = Optional.ofNullable(resourceId)

    fun toBuilder(): Builder = Builder().id(id).resourceId(resourceId)

    internal fun _pathParam(index: Int): String =
        when (index) {
            0 -> id
            1 -> resourceId.orEmpty()
            else -> ""
        }

    companion object {
        @JvmStatic fun builder(): Builder = Builder()
    }

    class Builder internal constructor() {
        private var id: String? = null
        private var resourceId: String? = null

        fun id(id: String) = apply { this.id = id }

        fun resourceId(resourceId: String?) = apply { this.resourceId = resourceId }

        fun build(): ProgramResourceDeleteParams =
            ProgramResourceDeleteParams(checkRequired("id", id), resourceId)
    }
}

class ProgramResourceUploadTicketParams
private constructor(private val id: String?, private val body: Map<String, Any?>) :
    ProgramResourceParams() {
    fun id(): Optional<String> = Optional.ofNullable(id)

    fun toBuilder(): Builder = Builder().id(id).body(body)

    internal fun _body(): Map<String, Any?> = body

    internal fun _pathParam(index: Int): String = if (index == 0) id.orEmpty() else ""

    companion object {
        @JvmStatic fun builder(): Builder = Builder()
    }

    class Builder internal constructor() {
        private var id: String? = null
        private val body = linkedMapOf<String, Any?>()

        fun id(id: String?) = apply { this.id = id }

        /** Sets the upload file name, which must contain 1 through 120 characters. */
        fun fileName(fileName: String) = apply { body["fileName"] = fileName }

        fun mimeType(mimeType: String) = apply { body["mimeType"] = mimeType }

        fun bytes(bytes: Long) = apply { body["bytes"] = bytes }

        internal fun body(body: Map<String, Any?>) = apply {
            this.body.clear()
            this.body.putAll(body)
        }

        fun build(): ProgramResourceUploadTicketParams {
            val fileName = checkRequired("fileName", body["fileName"] as? String)
            require(fileName.length in 1..120) {
                "Program Resource fileName must contain 1 through 120 characters"
            }
            checkRequired("mimeType", body["mimeType"])
            checkRequired("bytes", body["bytes"])
            return ProgramResourceUploadTicketParams(id, body.toMap())
        }
    }
}
