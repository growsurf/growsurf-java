// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.BaseDeserializer
import com.growsurf.api.core.BaseSerializer
import com.growsurf.api.core.ExcludeMissing
import com.growsurf.api.core.JsonField
import com.growsurf.api.core.JsonMissing
import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.allMaxBy
import com.growsurf.api.core.checkKnown
import com.growsurf.api.core.checkRequired
import com.growsurf.api.core.getOrThrow
import com.growsurf.api.core.toImmutable
import com.growsurf.api.errors.GrowsurfInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@JsonDeserialize(using = ParticipantRecordTransactionResponse.Deserializer::class)
@JsonSerialize(using = ParticipantRecordTransactionResponse.Serializer::class)
class ParticipantRecordTransactionResponse
private constructor(
    private val unionMember0: UnionMember0? = null,
    private val unionMember1: UnionMember1? = null,
    private val _json: JsonValue? = null,
) {

    fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

    fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)

    fun isUnionMember0(): Boolean = unionMember0 != null

    fun isUnionMember1(): Boolean = unionMember1 != null

    fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

    fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```java
     * import com.growsurf.api.core.JsonValue;
     * import java.util.Optional;
     *
     * Optional<String> result = participantRecordTransactionResponse.accept(new ParticipantRecordTransactionResponse.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitUnionMember0(UnionMember0 unionMember0) {
     *         return Optional.of(unionMember0.toString());
     *     }
     *
     *     // ...
     *
     *     @Override
     *     public Optional<String> unknown(JsonValue json) {
     *         // Or inspect the `json`.
     *         return Optional.empty();
     *     }
     * });
     * ```
     *
     * @throws GrowsurfInvalidDataException if [Visitor.unknown] is not overridden in [visitor] and
     *   the current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
            unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
            else -> visitor.unknown(_json)
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
    fun validate(): ParticipantRecordTransactionResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitUnionMember0(unionMember0: UnionMember0) {
                    unionMember0.validate()
                }

                override fun visitUnionMember1(unionMember1: UnionMember1) {
                    unionMember1.validate()
                }
            }
        )
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
        accept(
            object : Visitor<Int> {
                override fun visitUnionMember0(unionMember0: UnionMember0) = unionMember0.validity()

                override fun visitUnionMember1(unionMember1: UnionMember1) = unionMember1.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParticipantRecordTransactionResponse &&
            unionMember0 == other.unionMember0 &&
            unionMember1 == other.unionMember1
    }

    override fun hashCode(): Int = Objects.hash(unionMember0, unionMember1)

    override fun toString(): String =
        when {
            unionMember0 != null ->
                "ParticipantRecordTransactionResponse{unionMember0=$unionMember0}"
            unionMember1 != null ->
                "ParticipantRecordTransactionResponse{unionMember1=$unionMember1}"
            _json != null -> "ParticipantRecordTransactionResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ParticipantRecordTransactionResponse")
        }

    companion object {

        @JvmStatic
        fun ofUnionMember0(unionMember0: UnionMember0) =
            ParticipantRecordTransactionResponse(unionMember0 = unionMember0)

        @JvmStatic
        fun ofUnionMember1(unionMember1: UnionMember1) =
            ParticipantRecordTransactionResponse(unionMember1 = unionMember1)
    }

    /**
     * An interface that defines how to map each variant of [ParticipantRecordTransactionResponse]
     * to a value of type [T].
     */
    interface Visitor<out T> {

        fun visitUnionMember0(unionMember0: UnionMember0): T

        fun visitUnionMember1(unionMember1: UnionMember1): T

        /**
         * Maps an unknown variant of [ParticipantRecordTransactionResponse] to a value of type [T].
         *
         * An instance of [ParticipantRecordTransactionResponse] can contain an unknown variant if
         * it was deserialized from data that doesn't match any known variant. For example, if the
         * SDK is on an older version than the API, then the API may respond with new variants that
         * the SDK is unaware of.
         *
         * @throws GrowsurfInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw GrowsurfInvalidDataException(
                "Unknown ParticipantRecordTransactionResponse: $json"
            )
        }
    }

    internal class Deserializer :
        BaseDeserializer<ParticipantRecordTransactionResponse>(
            ParticipantRecordTransactionResponse::class
        ) {

        override fun ObjectCodec.deserialize(node: JsonNode): ParticipantRecordTransactionResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                            ParticipantRecordTransactionResponse(unionMember0 = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                            ParticipantRecordTransactionResponse(unionMember1 = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> ParticipantRecordTransactionResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<ParticipantRecordTransactionResponse>(
            ParticipantRecordTransactionResponse::class
        ) {

        override fun serialize(
            value: ParticipantRecordTransactionResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ParticipantRecordTransactionResponse")
            }
        }
    }

    class UnionMember0
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val duplicate: JsonValue,
        private val firstSale: JsonField<Boolean>,
        private val message: JsonField<String>,
        private val success: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("duplicate") @ExcludeMissing duplicate: JsonValue = JsonMissing.of(),
            @JsonProperty("firstSale")
            @ExcludeMissing
            firstSale: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
            @JsonProperty("success") @ExcludeMissing success: JsonValue = JsonMissing.of(),
        ) : this(duplicate, firstSale, message, success, mutableMapOf())

        /**
         * Expected to always return the following:
         * ```java
         * JsonValue.from(false)
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("duplicate") @ExcludeMissing fun _duplicate(): JsonValue = duplicate

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun firstSale(): Boolean = firstSale.getRequired("firstSale")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun message(): String = message.getRequired("message")

        /**
         * Expected to always return the following:
         * ```java
         * JsonValue.from(true)
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("success") @ExcludeMissing fun _success(): JsonValue = success

        /**
         * Returns the raw JSON value of [firstSale].
         *
         * Unlike [firstSale], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("firstSale") @ExcludeMissing fun _firstSale(): JsonField<Boolean> = firstSale

        /**
         * Returns the raw JSON value of [message].
         *
         * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

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
             * Returns a mutable builder for constructing an instance of [UnionMember0].
             *
             * The following fields are required:
             * ```java
             * .firstSale()
             * .message()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UnionMember0]. */
        class Builder internal constructor() {

            private var duplicate: JsonValue = JsonValue.from(false)
            private var firstSale: JsonField<Boolean>? = null
            private var message: JsonField<String>? = null
            private var success: JsonValue = JsonValue.from(true)
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(unionMember0: UnionMember0) = apply {
                duplicate = unionMember0.duplicate
                firstSale = unionMember0.firstSale
                message = unionMember0.message
                success = unionMember0.success
                additionalProperties = unionMember0.additionalProperties.toMutableMap()
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```java
             * JsonValue.from(false)
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun duplicate(duplicate: JsonValue) = apply { this.duplicate = duplicate }

            fun firstSale(firstSale: Boolean) = firstSale(JsonField.of(firstSale))

            /**
             * Sets [Builder.firstSale] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstSale] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstSale(firstSale: JsonField<Boolean>) = apply { this.firstSale = firstSale }

            fun message(message: String) = message(JsonField.of(message))

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<String>) = apply { this.message = message }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```java
             * JsonValue.from(true)
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun success(success: JsonValue) = apply { this.success = success }

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
             * Returns an immutable instance of [UnionMember0].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .firstSale()
             * .message()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UnionMember0 =
                UnionMember0(
                    duplicate,
                    checkRequired("firstSale", firstSale),
                    checkRequired("message", message),
                    success,
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
        fun validate(): UnionMember0 = apply {
            if (validated) {
                return@apply
            }

            _duplicate().let {
                if (it != JsonValue.from(false)) {
                    throw GrowsurfInvalidDataException("'duplicate' is invalid, received $it")
                }
            }
            firstSale()
            message()
            _success().let {
                if (it != JsonValue.from(true)) {
                    throw GrowsurfInvalidDataException("'success' is invalid, received $it")
                }
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
            duplicate.let { if (it == JsonValue.from(false)) 1 else 0 } +
                (if (firstSale.asKnown().isPresent) 1 else 0) +
                (if (message.asKnown().isPresent) 1 else 0) +
                success.let { if (it == JsonValue.from(true)) 1 else 0 }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UnionMember0 &&
                duplicate == other.duplicate &&
                firstSale == other.firstSale &&
                message == other.message &&
                success == other.success &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(duplicate, firstSale, message, success, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnionMember0{duplicate=$duplicate, firstSale=$firstSale, message=$message, success=$success, additionalProperties=$additionalProperties}"
    }

    class UnionMember1
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val commissionsCreated: JsonField<Long>,
        private val duplicate: JsonValue,
        private val duplicateFields: JsonField<List<String>>,
        private val matchingCommissionIds: JsonField<List<String>>,
        private val message: JsonField<String>,
        private val success: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("commissionsCreated")
            @ExcludeMissing
            commissionsCreated: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("duplicate") @ExcludeMissing duplicate: JsonValue = JsonMissing.of(),
            @JsonProperty("duplicateFields")
            @ExcludeMissing
            duplicateFields: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("matchingCommissionIds")
            @ExcludeMissing
            matchingCommissionIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
            @JsonProperty("success") @ExcludeMissing success: JsonValue = JsonMissing.of(),
        ) : this(
            commissionsCreated,
            duplicate,
            duplicateFields,
            matchingCommissionIds,
            message,
            success,
            mutableMapOf(),
        )

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun commissionsCreated(): Long = commissionsCreated.getRequired("commissionsCreated")

        /**
         * Expected to always return the following:
         * ```java
         * JsonValue.from(true)
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("duplicate") @ExcludeMissing fun _duplicate(): JsonValue = duplicate

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun duplicateFields(): List<String> = duplicateFields.getRequired("duplicateFields")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun matchingCommissionIds(): List<String> =
            matchingCommissionIds.getRequired("matchingCommissionIds")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun message(): String = message.getRequired("message")

        /**
         * Expected to always return the following:
         * ```java
         * JsonValue.from(false)
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("success") @ExcludeMissing fun _success(): JsonValue = success

        /**
         * Returns the raw JSON value of [commissionsCreated].
         *
         * Unlike [commissionsCreated], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("commissionsCreated")
        @ExcludeMissing
        fun _commissionsCreated(): JsonField<Long> = commissionsCreated

        /**
         * Returns the raw JSON value of [duplicateFields].
         *
         * Unlike [duplicateFields], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("duplicateFields")
        @ExcludeMissing
        fun _duplicateFields(): JsonField<List<String>> = duplicateFields

        /**
         * Returns the raw JSON value of [matchingCommissionIds].
         *
         * Unlike [matchingCommissionIds], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("matchingCommissionIds")
        @ExcludeMissing
        fun _matchingCommissionIds(): JsonField<List<String>> = matchingCommissionIds

        /**
         * Returns the raw JSON value of [message].
         *
         * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

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
             * Returns a mutable builder for constructing an instance of [UnionMember1].
             *
             * The following fields are required:
             * ```java
             * .commissionsCreated()
             * .duplicateFields()
             * .matchingCommissionIds()
             * .message()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UnionMember1]. */
        class Builder internal constructor() {

            private var commissionsCreated: JsonField<Long>? = null
            private var duplicate: JsonValue = JsonValue.from(true)
            private var duplicateFields: JsonField<MutableList<String>>? = null
            private var matchingCommissionIds: JsonField<MutableList<String>>? = null
            private var message: JsonField<String>? = null
            private var success: JsonValue = JsonValue.from(false)
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(unionMember1: UnionMember1) = apply {
                commissionsCreated = unionMember1.commissionsCreated
                duplicate = unionMember1.duplicate
                duplicateFields = unionMember1.duplicateFields.map { it.toMutableList() }
                matchingCommissionIds =
                    unionMember1.matchingCommissionIds.map { it.toMutableList() }
                message = unionMember1.message
                success = unionMember1.success
                additionalProperties = unionMember1.additionalProperties.toMutableMap()
            }

            fun commissionsCreated(commissionsCreated: Long) =
                commissionsCreated(JsonField.of(commissionsCreated))

            /**
             * Sets [Builder.commissionsCreated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commissionsCreated] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commissionsCreated(commissionsCreated: JsonField<Long>) = apply {
                this.commissionsCreated = commissionsCreated
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```java
             * JsonValue.from(true)
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun duplicate(duplicate: JsonValue) = apply { this.duplicate = duplicate }

            fun duplicateFields(duplicateFields: List<String>) =
                duplicateFields(JsonField.of(duplicateFields))

            /**
             * Sets [Builder.duplicateFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.duplicateFields] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun duplicateFields(duplicateFields: JsonField<List<String>>) = apply {
                this.duplicateFields = duplicateFields.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [duplicateFields].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDuplicateField(duplicateField: String) = apply {
                duplicateFields =
                    (duplicateFields ?: JsonField.of(mutableListOf())).also {
                        checkKnown("duplicateFields", it).add(duplicateField)
                    }
            }

            fun matchingCommissionIds(matchingCommissionIds: List<String>) =
                matchingCommissionIds(JsonField.of(matchingCommissionIds))

            /**
             * Sets [Builder.matchingCommissionIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.matchingCommissionIds] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun matchingCommissionIds(matchingCommissionIds: JsonField<List<String>>) = apply {
                this.matchingCommissionIds = matchingCommissionIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [matchingCommissionIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMatchingCommissionId(matchingCommissionId: String) = apply {
                matchingCommissionIds =
                    (matchingCommissionIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("matchingCommissionIds", it).add(matchingCommissionId)
                    }
            }

            fun message(message: String) = message(JsonField.of(message))

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<String>) = apply { this.message = message }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```java
             * JsonValue.from(false)
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun success(success: JsonValue) = apply { this.success = success }

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
             * Returns an immutable instance of [UnionMember1].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .commissionsCreated()
             * .duplicateFields()
             * .matchingCommissionIds()
             * .message()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UnionMember1 =
                UnionMember1(
                    checkRequired("commissionsCreated", commissionsCreated),
                    duplicate,
                    checkRequired("duplicateFields", duplicateFields).map { it.toImmutable() },
                    checkRequired("matchingCommissionIds", matchingCommissionIds).map {
                        it.toImmutable()
                    },
                    checkRequired("message", message),
                    success,
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
        fun validate(): UnionMember1 = apply {
            if (validated) {
                return@apply
            }

            commissionsCreated()
            _duplicate().let {
                if (it != JsonValue.from(true)) {
                    throw GrowsurfInvalidDataException("'duplicate' is invalid, received $it")
                }
            }
            duplicateFields()
            matchingCommissionIds()
            message()
            _success().let {
                if (it != JsonValue.from(false)) {
                    throw GrowsurfInvalidDataException("'success' is invalid, received $it")
                }
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
            (if (commissionsCreated.asKnown().isPresent) 1 else 0) +
                duplicate.let { if (it == JsonValue.from(true)) 1 else 0 } +
                (duplicateFields.asKnown().getOrNull()?.size ?: 0) +
                (matchingCommissionIds.asKnown().getOrNull()?.size ?: 0) +
                (if (message.asKnown().isPresent) 1 else 0) +
                success.let { if (it == JsonValue.from(false)) 1 else 0 }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UnionMember1 &&
                commissionsCreated == other.commissionsCreated &&
                duplicate == other.duplicate &&
                duplicateFields == other.duplicateFields &&
                matchingCommissionIds == other.matchingCommissionIds &&
                message == other.message &&
                success == other.success &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                commissionsCreated,
                duplicate,
                duplicateFields,
                matchingCommissionIds,
                message,
                success,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnionMember1{commissionsCreated=$commissionsCreated, duplicate=$duplicate, duplicateFields=$duplicateFields, matchingCommissionIds=$matchingCommissionIds, message=$message, success=$success, additionalProperties=$additionalProperties}"
    }
}
