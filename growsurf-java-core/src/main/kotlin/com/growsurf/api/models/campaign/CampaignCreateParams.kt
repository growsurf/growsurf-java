// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.growsurf.api.core.Enum
import com.growsurf.api.core.ExcludeMissing
import com.growsurf.api.core.JsonField
import com.growsurf.api.core.JsonMissing
import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.Params
import com.growsurf.api.core.checkKnown
import com.growsurf.api.core.checkRequired
import com.growsurf.api.core.http.Headers
import com.growsurf.api.core.http.QueryParams
import com.growsurf.api.core.toImmutable
import com.growsurf.api.errors.GrowsurfInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Creates a new program pre-populated with type-appropriate defaults, plus any optional inline
 * rewards. The new program is created in `DRAFT` status and owned by the API key's account.
 * Requires a verified account email and a paid plan (referral) or a payment source on file
 * (affiliate); subject to your plan's program limit.
 */
class CampaignCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The program type. Immutable after creation.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = body.type()

    /**
     * The program name. Defaults to "Untitled Program".
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyName(): Optional<String> = body.companyName()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyLogoImageUrl(): Optional<String> = body.companyLogoImageUrl()

    /**
     * ISO 4217 currency code. Defaults to USD. Chosen when the program is created and immutable
     * afterward — it cannot be changed on update.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currencyIso(): Optional<String> = body.currencyIso()

    /**
     * Optional inline rewards to create with the program.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rewards(): Optional<List<Reward>> = body.rewards()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<Type> = body._type()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [companyName].
     *
     * Unlike [companyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _companyName(): JsonField<String> = body._companyName()

    /**
     * Returns the raw JSON value of [companyLogoImageUrl].
     *
     * Unlike [companyLogoImageUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _companyLogoImageUrl(): JsonField<String> = body._companyLogoImageUrl()

    /**
     * Returns the raw JSON value of [currencyIso].
     *
     * Unlike [currencyIso], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currencyIso(): JsonField<String> = body._currencyIso()

    /**
     * Returns the raw JSON value of [rewards].
     *
     * Unlike [rewards], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rewards(): JsonField<List<Reward>> = body._rewards()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CampaignCreateParams].
         *
         * The following fields are required:
         * ```java
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CampaignCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(campaignCreateParams: CampaignCreateParams) = apply {
            body = campaignCreateParams.body.toBuilder()
            additionalHeaders = campaignCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = campaignCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [type]
         * - [name]
         * - [companyName]
         * - [companyLogoImageUrl]
         * - [currencyIso]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The program type. Immutable after creation. */
        fun type(type: Type) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { body.type(type) }

        /** The program name. Defaults to "Untitled Program". */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun companyName(companyName: String) = apply { body.companyName(companyName) }

        /**
         * Sets [Builder.companyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun companyName(companyName: JsonField<String>) = apply { body.companyName(companyName) }

        fun companyLogoImageUrl(companyLogoImageUrl: String) = apply {
            body.companyLogoImageUrl(companyLogoImageUrl)
        }

        /**
         * Sets [Builder.companyLogoImageUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyLogoImageUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun companyLogoImageUrl(companyLogoImageUrl: JsonField<String>) = apply {
            body.companyLogoImageUrl(companyLogoImageUrl)
        }

        /**
         * ISO 4217 currency code. Defaults to USD. Chosen when the program is created and immutable
         * afterward — it cannot be changed on update.
         */
        fun currencyIso(currencyIso: String) = apply { body.currencyIso(currencyIso) }

        /**
         * Sets [Builder.currencyIso] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyIso] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currencyIso(currencyIso: JsonField<String>) = apply { body.currencyIso(currencyIso) }

        /** Optional inline rewards to create with the program. */
        fun rewards(rewards: List<Reward>) = apply { body.rewards(rewards) }

        /**
         * Sets [Builder.rewards] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rewards] with a well-typed `List<Reward>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rewards(rewards: JsonField<List<Reward>>) = apply { body.rewards(rewards) }

        /**
         * Adds a single [Reward] to [rewards].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReward(reward: Reward) = apply { body.addReward(reward) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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
         * Returns an immutable instance of [CampaignCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CampaignCreateParams =
            CampaignCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Request body for creating a program. Only `type` is required; everything else is
     * server-defaulted.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val type: JsonField<Type>,
        private val name: JsonField<String>,
        private val companyName: JsonField<String>,
        private val companyLogoImageUrl: JsonField<String>,
        private val currencyIso: JsonField<String>,
        private val rewards: JsonField<List<Reward>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("companyName")
            @ExcludeMissing
            companyName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("companyLogoImageUrl")
            @ExcludeMissing
            companyLogoImageUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currencyISO")
            @ExcludeMissing
            currencyIso: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rewards")
            @ExcludeMissing
            rewards: JsonField<List<Reward>> = JsonMissing.of(),
        ) : this(type, name, companyName, companyLogoImageUrl, currencyIso, rewards, mutableMapOf())

        /**
         * The program type. Immutable after creation.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * The program name. Defaults to "Untitled Program".
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun companyName(): Optional<String> = companyName.getOptional("companyName")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun companyLogoImageUrl(): Optional<String> =
            companyLogoImageUrl.getOptional("companyLogoImageUrl")

        /**
         * ISO 4217 currency code. Defaults to USD. Chosen when the program is created and immutable
         * afterward — it cannot be changed on update.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun currencyIso(): Optional<String> = currencyIso.getOptional("currencyISO")

        /**
         * Optional inline rewards to create with the program.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rewards(): Optional<List<Reward>> = rewards.getOptional("rewards")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [companyName].
         *
         * Unlike [companyName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("companyName")
        @ExcludeMissing
        fun _companyName(): JsonField<String> = companyName

        /**
         * Returns the raw JSON value of [companyLogoImageUrl].
         *
         * Unlike [companyLogoImageUrl], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("companyLogoImageUrl")
        @ExcludeMissing
        fun _companyLogoImageUrl(): JsonField<String> = companyLogoImageUrl

        /**
         * Returns the raw JSON value of [currencyIso].
         *
         * Unlike [currencyIso], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currencyISO")
        @ExcludeMissing
        fun _currencyIso(): JsonField<String> = currencyIso

        /**
         * Returns the raw JSON value of [rewards].
         *
         * Unlike [rewards], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rewards") @ExcludeMissing fun _rewards(): JsonField<List<Reward>> = rewards

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var type: JsonField<Type>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var companyName: JsonField<String> = JsonMissing.of()
            private var companyLogoImageUrl: JsonField<String> = JsonMissing.of()
            private var currencyIso: JsonField<String> = JsonMissing.of()
            private var rewards: JsonField<MutableList<Reward>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                type = body.type
                name = body.name
                companyName = body.companyName
                companyLogoImageUrl = body.companyLogoImageUrl
                currencyIso = body.currencyIso
                rewards = body.rewards.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The program type. Immutable after creation. */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** The program name. Defaults to "Untitled Program". */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun companyName(companyName: String) = companyName(JsonField.of(companyName))

            /**
             * Sets [Builder.companyName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.companyName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun companyName(companyName: JsonField<String>) = apply {
                this.companyName = companyName
            }

            fun companyLogoImageUrl(companyLogoImageUrl: String) =
                companyLogoImageUrl(JsonField.of(companyLogoImageUrl))

            /**
             * Sets [Builder.companyLogoImageUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.companyLogoImageUrl] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun companyLogoImageUrl(companyLogoImageUrl: JsonField<String>) = apply {
                this.companyLogoImageUrl = companyLogoImageUrl
            }

            /**
             * ISO 4217 currency code. Defaults to USD. Chosen when the program is created and
             * immutable afterward — it cannot be changed on update.
             */
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

            /** Optional inline rewards to create with the program. */
            fun rewards(rewards: List<Reward>) = rewards(JsonField.of(rewards))

            /**
             * Sets [Builder.rewards] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rewards] with a well-typed `List<Reward>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rewards(rewards: JsonField<List<Reward>>) = apply {
                this.rewards = rewards.map { it.toMutableList() }
            }

            /**
             * Adds a single [Reward] to [rewards].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addReward(reward: Reward) = apply {
                rewards =
                    (rewards ?: JsonField.of(mutableListOf())).also {
                        checkKnown("rewards", it).add(reward)
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("type", type),
                    name,
                    companyName,
                    companyLogoImageUrl,
                    currencyIso,
                    (rewards ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            type().validate()
            name()
            companyName()
            companyLogoImageUrl()
            currencyIso()
            rewards().ifPresent { it.forEach { it.validate() } }
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
            (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (companyName.asKnown().isPresent) 1 else 0) +
                (if (companyLogoImageUrl.asKnown().isPresent) 1 else 0) +
                (if (currencyIso.asKnown().isPresent) 1 else 0) +
                (rewards.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                type == other.type &&
                name == other.name &&
                companyName == other.companyName &&
                companyLogoImageUrl == other.companyLogoImageUrl &&
                currencyIso == other.currencyIso &&
                rewards == other.rewards &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                type,
                name,
                companyName,
                companyLogoImageUrl,
                currencyIso,
                rewards,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{type=$type, name=$name, companyName=$companyName, companyLogoImageUrl=$companyLogoImageUrl, currencyIso=$currencyIso, rewards=$rewards, additionalProperties=$additionalProperties}"
    }

    /** The program type. Immutable after creation. */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val REFERRAL = of("REFERRAL")

            @JvmField val AFFILIATE = of("AFFILIATE")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            REFERRAL,
            AFFILIATE,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            REFERRAL,
            AFFILIATE,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                REFERRAL -> Value.REFERRAL
                AFFILIATE -> Value.AFFILIATE
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
                REFERRAL -> Known.REFERRAL
                AFFILIATE -> Known.AFFILIATE
                else -> throw GrowsurfInvalidDataException("Unknown Type: $value")
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
        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Request body for creating a campaign reward. `type` is required and must be compatible with
     * the program type.
     */
    class Reward
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val type: JsonField<Type>,
        private val title: JsonField<String>,
        private val description: JsonField<String>,
        private val referralDescription: JsonField<String>,
        private val imageUrl: JsonField<String>,
        private val isActive: JsonField<Boolean>,
        private val isVisible: JsonField<Boolean>,
        private val isUnlimited: JsonField<Boolean>,
        private val referredRewardUpfront: JsonField<Boolean>,
        private val limit: JsonField<Long>,
        private val conversionsRequired: JsonField<Long>,
        private val numberOfWinners: JsonField<Long>,
        private val order: JsonField<Long>,
        private val limitDuration: JsonField<LimitDuration>,
        private val nextMilestonePrefix: JsonField<String>,
        private val nextMilestoneSuffix: JsonField<String>,
        private val couponCode: JsonField<String>,
        private val referralCouponCode: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val commissionStructure: JsonField<CommissionStructure>,
        private val value: JsonField<RewardTaxValuation>,
        private val referredValue: JsonField<RewardTaxValuation>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("referralDescription")
            @ExcludeMissing
            referralDescription: JsonField<String> = JsonMissing.of(),
            @JsonProperty("imageUrl")
            @ExcludeMissing
            imageUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("isActive")
            @ExcludeMissing
            isActive: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("isVisible")
            @ExcludeMissing
            isVisible: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("isUnlimited")
            @ExcludeMissing
            isUnlimited: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("referredRewardUpfront")
            @ExcludeMissing
            referredRewardUpfront: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("conversionsRequired")
            @ExcludeMissing
            conversionsRequired: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("numberOfWinners")
            @ExcludeMissing
            numberOfWinners: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("order") @ExcludeMissing order: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("limitDuration")
            @ExcludeMissing
            limitDuration: JsonField<LimitDuration> = JsonMissing.of(),
            @JsonProperty("nextMilestonePrefix")
            @ExcludeMissing
            nextMilestonePrefix: JsonField<String> = JsonMissing.of(),
            @JsonProperty("nextMilestoneSuffix")
            @ExcludeMissing
            nextMilestoneSuffix: JsonField<String> = JsonMissing.of(),
            @JsonProperty("couponCode")
            @ExcludeMissing
            couponCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("referralCouponCode")
            @ExcludeMissing
            referralCouponCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("commissionStructure")
            @ExcludeMissing
            commissionStructure: JsonField<CommissionStructure> = JsonMissing.of(),
            @JsonProperty("value")
            @ExcludeMissing
            value: JsonField<RewardTaxValuation> = JsonMissing.of(),
            @JsonProperty("referredValue")
            @ExcludeMissing
            referredValue: JsonField<RewardTaxValuation> = JsonMissing.of(),
        ) : this(
            type,
            title,
            description,
            referralDescription,
            imageUrl,
            isActive,
            isVisible,
            isUnlimited,
            referredRewardUpfront,
            limit,
            conversionsRequired,
            numberOfWinners,
            order,
            limitDuration,
            nextMilestonePrefix,
            nextMilestoneSuffix,
            couponCode,
            referralCouponCode,
            metadata,
            commissionStructure,
            value,
            referredValue,
            mutableMapOf(),
        )

        /**
         * The reward type. Immutable after creation.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * The reward title (internal label).
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun title(): Optional<String> = title.getOptional("title")

        /**
         * The reward description shown to the referrer.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * The reward description shown to the referred friend (double-sided rewards).
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun referralDescription(): Optional<String> =
            referralDescription.getOptional("referralDescription")

        /**
         * An image URL for the reward.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun imageUrl(): Optional<String> = imageUrl.getOptional("imageUrl")

        /**
         * Whether the reward is active (awardable).
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun isActive(): Optional<Boolean> = isActive.getOptional("isActive")

        /**
         * Whether the reward is visible.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun isVisible(): Optional<Boolean> = isVisible.getOptional("isVisible")

        /**
         * Whether the reward can be earned an unlimited number of times.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun isUnlimited(): Optional<Boolean> = isUnlimited.getOptional("isUnlimited")

        /**
         * For double-sided rewards, deliver the referred friend's reward upfront as a discount.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun referredRewardUpfront(): Optional<Boolean> =
            referredRewardUpfront.getOptional("referredRewardUpfront")

        /**
         * The number of times a participant can earn the reward (overridden by `isUnlimited`).
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun limit(): Optional<Long> = limit.getOptional("limit")

        /**
         * The number of referrals required to earn the reward.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun conversionsRequired(): Optional<Long> =
            conversionsRequired.getOptional("conversionsRequired")

        /**
         * The maximum number of winners (LEADERBOARD rewards).
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun numberOfWinners(): Optional<Long> = numberOfWinners.getOptional("numberOfWinners")

        /**
         * The display order of the reward.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun order(): Optional<Long> = order.getOptional("order")

        /**
         * The window over which `limit` applies.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun limitDuration(): Optional<LimitDuration> = limitDuration.getOptional("limitDuration")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun nextMilestonePrefix(): Optional<String> =
            nextMilestonePrefix.getOptional("nextMilestonePrefix")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun nextMilestoneSuffix(): Optional<String> =
            nextMilestoneSuffix.getOptional("nextMilestoneSuffix")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun couponCode(): Optional<String> = couponCode.getOptional("couponCode")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun referralCouponCode(): Optional<String> =
            referralCouponCode.getOptional("referralCouponCode")

        /**
         * Custom key/value metadata (single-level; values are stored as strings).
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * The affiliate commission structure (AFFILIATE rewards only).
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun commissionStructure(): Optional<CommissionStructure> =
            commissionStructure.getOptional("commissionStructure")

        /**
         * Tax valuation for the reward (the referrer's side of a double-sided reward). Used by tax
         * documentation / 1099 reporting.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun value(): Optional<RewardTaxValuation> = value.getOptional("value")

        /**
         * Tax valuation for the referred friend's side of a double-sided reward. Defaults to not
         * tax-reportable (a purchase rebate).
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun referredValue(): Optional<RewardTaxValuation> =
            referredValue.getOptional("referredValue")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [referralDescription].
         *
         * Unlike [referralDescription], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("referralDescription")
        @ExcludeMissing
        fun _referralDescription(): JsonField<String> = referralDescription

        /**
         * Returns the raw JSON value of [imageUrl].
         *
         * Unlike [imageUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("imageUrl") @ExcludeMissing fun _imageUrl(): JsonField<String> = imageUrl

        /**
         * Returns the raw JSON value of [isActive].
         *
         * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("isActive") @ExcludeMissing fun _isActive(): JsonField<Boolean> = isActive

        /**
         * Returns the raw JSON value of [isVisible].
         *
         * Unlike [isVisible], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("isVisible") @ExcludeMissing fun _isVisible(): JsonField<Boolean> = isVisible

        /**
         * Returns the raw JSON value of [isUnlimited].
         *
         * Unlike [isUnlimited], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("isUnlimited")
        @ExcludeMissing
        fun _isUnlimited(): JsonField<Boolean> = isUnlimited

        /**
         * Returns the raw JSON value of [referredRewardUpfront].
         *
         * Unlike [referredRewardUpfront], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("referredRewardUpfront")
        @ExcludeMissing
        fun _referredRewardUpfront(): JsonField<Boolean> = referredRewardUpfront

        /**
         * Returns the raw JSON value of [limit].
         *
         * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Long> = limit

        /**
         * Returns the raw JSON value of [conversionsRequired].
         *
         * Unlike [conversionsRequired], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("conversionsRequired")
        @ExcludeMissing
        fun _conversionsRequired(): JsonField<Long> = conversionsRequired

        /**
         * Returns the raw JSON value of [numberOfWinners].
         *
         * Unlike [numberOfWinners], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("numberOfWinners")
        @ExcludeMissing
        fun _numberOfWinners(): JsonField<Long> = numberOfWinners

        /**
         * Returns the raw JSON value of [order].
         *
         * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("order") @ExcludeMissing fun _order(): JsonField<Long> = order

        /**
         * Returns the raw JSON value of [limitDuration].
         *
         * Unlike [limitDuration], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("limitDuration")
        @ExcludeMissing
        fun _limitDuration(): JsonField<LimitDuration> = limitDuration

        /**
         * Returns the raw JSON value of [nextMilestonePrefix].
         *
         * Unlike [nextMilestonePrefix], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("nextMilestonePrefix")
        @ExcludeMissing
        fun _nextMilestonePrefix(): JsonField<String> = nextMilestonePrefix

        /**
         * Returns the raw JSON value of [nextMilestoneSuffix].
         *
         * Unlike [nextMilestoneSuffix], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("nextMilestoneSuffix")
        @ExcludeMissing
        fun _nextMilestoneSuffix(): JsonField<String> = nextMilestoneSuffix

        /**
         * Returns the raw JSON value of [couponCode].
         *
         * Unlike [couponCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("couponCode")
        @ExcludeMissing
        fun _couponCode(): JsonField<String> = couponCode

        /**
         * Returns the raw JSON value of [referralCouponCode].
         *
         * Unlike [referralCouponCode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("referralCouponCode")
        @ExcludeMissing
        fun _referralCouponCode(): JsonField<String> = referralCouponCode

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [commissionStructure].
         *
         * Unlike [commissionStructure], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("commissionStructure")
        @ExcludeMissing
        fun _commissionStructure(): JsonField<CommissionStructure> = commissionStructure

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<RewardTaxValuation> = value

        /**
         * Returns the raw JSON value of [referredValue].
         *
         * Unlike [referredValue], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("referredValue")
        @ExcludeMissing
        fun _referredValue(): JsonField<RewardTaxValuation> = referredValue

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
             * Returns a mutable builder for constructing an instance of [Reward].
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Reward]. */
        class Builder internal constructor() {

            private var type: JsonField<Type>? = null
            private var title: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var referralDescription: JsonField<String> = JsonMissing.of()
            private var imageUrl: JsonField<String> = JsonMissing.of()
            private var isActive: JsonField<Boolean> = JsonMissing.of()
            private var isVisible: JsonField<Boolean> = JsonMissing.of()
            private var isUnlimited: JsonField<Boolean> = JsonMissing.of()
            private var referredRewardUpfront: JsonField<Boolean> = JsonMissing.of()
            private var limit: JsonField<Long> = JsonMissing.of()
            private var conversionsRequired: JsonField<Long> = JsonMissing.of()
            private var numberOfWinners: JsonField<Long> = JsonMissing.of()
            private var order: JsonField<Long> = JsonMissing.of()
            private var limitDuration: JsonField<LimitDuration> = JsonMissing.of()
            private var nextMilestonePrefix: JsonField<String> = JsonMissing.of()
            private var nextMilestoneSuffix: JsonField<String> = JsonMissing.of()
            private var couponCode: JsonField<String> = JsonMissing.of()
            private var referralCouponCode: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var commissionStructure: JsonField<CommissionStructure> = JsonMissing.of()
            private var value: JsonField<RewardTaxValuation> = JsonMissing.of()
            private var referredValue: JsonField<RewardTaxValuation> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(reward: Reward) = apply {
                type = reward.type
                title = reward.title
                description = reward.description
                referralDescription = reward.referralDescription
                imageUrl = reward.imageUrl
                isActive = reward.isActive
                isVisible = reward.isVisible
                isUnlimited = reward.isUnlimited
                referredRewardUpfront = reward.referredRewardUpfront
                limit = reward.limit
                conversionsRequired = reward.conversionsRequired
                numberOfWinners = reward.numberOfWinners
                order = reward.order
                limitDuration = reward.limitDuration
                nextMilestonePrefix = reward.nextMilestonePrefix
                nextMilestoneSuffix = reward.nextMilestoneSuffix
                couponCode = reward.couponCode
                referralCouponCode = reward.referralCouponCode
                metadata = reward.metadata
                commissionStructure = reward.commissionStructure
                value = reward.value
                referredValue = reward.referredValue
                additionalProperties = reward.additionalProperties.toMutableMap()
            }

            /** The reward type. Immutable after creation. */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** The reward title (internal label). */
            fun title(title: String) = title(JsonField.of(title))

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

            /** The reward description shown to the referrer. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** The reward description shown to the referred friend (double-sided rewards). */
            fun referralDescription(referralDescription: String?) =
                referralDescription(JsonField.ofNullable(referralDescription))

            /**
             * Alias for calling [Builder.referralDescription] with
             * `referralDescription.orElse(null)`.
             */
            fun referralDescription(referralDescription: Optional<String>) =
                referralDescription(referralDescription.getOrNull())

            /**
             * Sets [Builder.referralDescription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referralDescription] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun referralDescription(referralDescription: JsonField<String>) = apply {
                this.referralDescription = referralDescription
            }

            /** An image URL for the reward. */
            fun imageUrl(imageUrl: String?) = imageUrl(JsonField.ofNullable(imageUrl))

            /** Alias for calling [Builder.imageUrl] with `imageUrl.orElse(null)`. */
            fun imageUrl(imageUrl: Optional<String>) = imageUrl(imageUrl.getOrNull())

            /**
             * Sets [Builder.imageUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.imageUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun imageUrl(imageUrl: JsonField<String>) = apply { this.imageUrl = imageUrl }

            /** Whether the reward is active (awardable). */
            fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

            /**
             * Sets [Builder.isActive] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

            /** Whether the reward is visible. */
            fun isVisible(isVisible: Boolean) = isVisible(JsonField.of(isVisible))

            /**
             * Sets [Builder.isVisible] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isVisible] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isVisible(isVisible: JsonField<Boolean>) = apply { this.isVisible = isVisible }

            /** Whether the reward can be earned an unlimited number of times. */
            fun isUnlimited(isUnlimited: Boolean) = isUnlimited(JsonField.of(isUnlimited))

            /**
             * Sets [Builder.isUnlimited] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isUnlimited] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isUnlimited(isUnlimited: JsonField<Boolean>) = apply {
                this.isUnlimited = isUnlimited
            }

            /**
             * For double-sided rewards, deliver the referred friend's reward upfront as a discount.
             */
            fun referredRewardUpfront(referredRewardUpfront: Boolean) =
                referredRewardUpfront(JsonField.of(referredRewardUpfront))

            /**
             * Sets [Builder.referredRewardUpfront] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referredRewardUpfront] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun referredRewardUpfront(referredRewardUpfront: JsonField<Boolean>) = apply {
                this.referredRewardUpfront = referredRewardUpfront
            }

            /**
             * The number of times a participant can earn the reward (overridden by `isUnlimited`).
             */
            fun limit(limit: Long) = limit(JsonField.of(limit))

            /**
             * Sets [Builder.limit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

            /** The number of referrals required to earn the reward. */
            fun conversionsRequired(conversionsRequired: Long) =
                conversionsRequired(JsonField.of(conversionsRequired))

            /**
             * Sets [Builder.conversionsRequired] to an arbitrary JSON value.
             *
             * You should usually call [Builder.conversionsRequired] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun conversionsRequired(conversionsRequired: JsonField<Long>) = apply {
                this.conversionsRequired = conversionsRequired
            }

            /** The maximum number of winners (LEADERBOARD rewards). */
            fun numberOfWinners(numberOfWinners: Long) =
                numberOfWinners(JsonField.of(numberOfWinners))

            /**
             * Sets [Builder.numberOfWinners] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numberOfWinners] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numberOfWinners(numberOfWinners: JsonField<Long>) = apply {
                this.numberOfWinners = numberOfWinners
            }

            /** The display order of the reward. */
            fun order(order: Long) = order(JsonField.of(order))

            /**
             * Sets [Builder.order] to an arbitrary JSON value.
             *
             * You should usually call [Builder.order] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun order(order: JsonField<Long>) = apply { this.order = order }

            /** The window over which `limit` applies. */
            fun limitDuration(limitDuration: LimitDuration) =
                limitDuration(JsonField.of(limitDuration))

            /**
             * Sets [Builder.limitDuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limitDuration] with a well-typed [LimitDuration]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun limitDuration(limitDuration: JsonField<LimitDuration>) = apply {
                this.limitDuration = limitDuration
            }

            fun nextMilestonePrefix(nextMilestonePrefix: String?) =
                nextMilestonePrefix(JsonField.ofNullable(nextMilestonePrefix))

            /**
             * Alias for calling [Builder.nextMilestonePrefix] with
             * `nextMilestonePrefix.orElse(null)`.
             */
            fun nextMilestonePrefix(nextMilestonePrefix: Optional<String>) =
                nextMilestonePrefix(nextMilestonePrefix.getOrNull())

            /**
             * Sets [Builder.nextMilestonePrefix] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nextMilestonePrefix] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun nextMilestonePrefix(nextMilestonePrefix: JsonField<String>) = apply {
                this.nextMilestonePrefix = nextMilestonePrefix
            }

            fun nextMilestoneSuffix(nextMilestoneSuffix: String?) =
                nextMilestoneSuffix(JsonField.ofNullable(nextMilestoneSuffix))

            /**
             * Alias for calling [Builder.nextMilestoneSuffix] with
             * `nextMilestoneSuffix.orElse(null)`.
             */
            fun nextMilestoneSuffix(nextMilestoneSuffix: Optional<String>) =
                nextMilestoneSuffix(nextMilestoneSuffix.getOrNull())

            /**
             * Sets [Builder.nextMilestoneSuffix] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nextMilestoneSuffix] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun nextMilestoneSuffix(nextMilestoneSuffix: JsonField<String>) = apply {
                this.nextMilestoneSuffix = nextMilestoneSuffix
            }

            fun couponCode(couponCode: String?) = couponCode(JsonField.ofNullable(couponCode))

            /** Alias for calling [Builder.couponCode] with `couponCode.orElse(null)`. */
            fun couponCode(couponCode: Optional<String>) = couponCode(couponCode.getOrNull())

            /**
             * Sets [Builder.couponCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.couponCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun couponCode(couponCode: JsonField<String>) = apply { this.couponCode = couponCode }

            fun referralCouponCode(referralCouponCode: String?) =
                referralCouponCode(JsonField.ofNullable(referralCouponCode))

            /**
             * Alias for calling [Builder.referralCouponCode] with
             * `referralCouponCode.orElse(null)`.
             */
            fun referralCouponCode(referralCouponCode: Optional<String>) =
                referralCouponCode(referralCouponCode.getOrNull())

            /**
             * Sets [Builder.referralCouponCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referralCouponCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun referralCouponCode(referralCouponCode: JsonField<String>) = apply {
                this.referralCouponCode = referralCouponCode
            }

            /** Custom key/value metadata (single-level; values are stored as strings). */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** The affiliate commission structure (AFFILIATE rewards only). */
            fun commissionStructure(commissionStructure: CommissionStructure) =
                commissionStructure(JsonField.of(commissionStructure))

            /**
             * Sets [Builder.commissionStructure] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commissionStructure] with a well-typed
             * [CommissionStructure] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun commissionStructure(commissionStructure: JsonField<CommissionStructure>) = apply {
                this.commissionStructure = commissionStructure
            }

            /**
             * Tax valuation for the reward (the referrer's side of a double-sided reward). Used by
             * tax documentation / 1099 reporting.
             */
            fun value(value: RewardTaxValuation) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [RewardTaxValuation] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<RewardTaxValuation>) = apply { this.value = value }

            /**
             * Tax valuation for the referred friend's side of a double-sided reward. Defaults to
             * not tax-reportable (a purchase rebate).
             */
            fun referredValue(referredValue: RewardTaxValuation) =
                referredValue(JsonField.of(referredValue))

            /**
             * Sets [Builder.referredValue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referredValue] with a well-typed
             * [RewardTaxValuation] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun referredValue(referredValue: JsonField<RewardTaxValuation>) = apply {
                this.referredValue = referredValue
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
             * Returns an immutable instance of [Reward].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Reward =
                Reward(
                    checkRequired("type", type),
                    title,
                    description,
                    referralDescription,
                    imageUrl,
                    isActive,
                    isVisible,
                    isUnlimited,
                    referredRewardUpfront,
                    limit,
                    conversionsRequired,
                    numberOfWinners,
                    order,
                    limitDuration,
                    nextMilestonePrefix,
                    nextMilestoneSuffix,
                    couponCode,
                    referralCouponCode,
                    metadata,
                    commissionStructure,
                    value,
                    referredValue,
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
        fun validate(): Reward = apply {
            if (validated) {
                return@apply
            }

            type().validate()
            title()
            description()
            referralDescription()
            imageUrl()
            isActive()
            isVisible()
            isUnlimited()
            referredRewardUpfront()
            limit()
            conversionsRequired()
            numberOfWinners()
            order()
            limitDuration().ifPresent { it.validate() }
            nextMilestonePrefix()
            nextMilestoneSuffix()
            couponCode()
            referralCouponCode()
            metadata().ifPresent { it.validate() }
            commissionStructure().ifPresent { it.validate() }
            value().ifPresent { it.validate() }
            referredValue().ifPresent { it.validate() }
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
            (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (title.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (referralDescription.asKnown().isPresent) 1 else 0) +
                (if (imageUrl.asKnown().isPresent) 1 else 0) +
                (if (isActive.asKnown().isPresent) 1 else 0) +
                (if (isVisible.asKnown().isPresent) 1 else 0) +
                (if (isUnlimited.asKnown().isPresent) 1 else 0) +
                (if (referredRewardUpfront.asKnown().isPresent) 1 else 0) +
                (if (limit.asKnown().isPresent) 1 else 0) +
                (if (conversionsRequired.asKnown().isPresent) 1 else 0) +
                (if (numberOfWinners.asKnown().isPresent) 1 else 0) +
                (if (order.asKnown().isPresent) 1 else 0) +
                (limitDuration.asKnown().getOrNull()?.validity() ?: 0) +
                (if (nextMilestonePrefix.asKnown().isPresent) 1 else 0) +
                (if (nextMilestoneSuffix.asKnown().isPresent) 1 else 0) +
                (if (couponCode.asKnown().isPresent) 1 else 0) +
                (if (referralCouponCode.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (commissionStructure.asKnown().getOrNull()?.validity() ?: 0) +
                (value.asKnown().getOrNull()?.validity() ?: 0) +
                (referredValue.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Reward &&
                type == other.type &&
                title == other.title &&
                description == other.description &&
                referralDescription == other.referralDescription &&
                imageUrl == other.imageUrl &&
                isActive == other.isActive &&
                isVisible == other.isVisible &&
                isUnlimited == other.isUnlimited &&
                referredRewardUpfront == other.referredRewardUpfront &&
                limit == other.limit &&
                conversionsRequired == other.conversionsRequired &&
                numberOfWinners == other.numberOfWinners &&
                order == other.order &&
                limitDuration == other.limitDuration &&
                nextMilestonePrefix == other.nextMilestonePrefix &&
                nextMilestoneSuffix == other.nextMilestoneSuffix &&
                couponCode == other.couponCode &&
                referralCouponCode == other.referralCouponCode &&
                metadata == other.metadata &&
                commissionStructure == other.commissionStructure &&
                value == other.value &&
                referredValue == other.referredValue &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                type,
                title,
                description,
                referralDescription,
                imageUrl,
                isActive,
                isVisible,
                isUnlimited,
                referredRewardUpfront,
                limit,
                conversionsRequired,
                numberOfWinners,
                order,
                limitDuration,
                nextMilestonePrefix,
                nextMilestoneSuffix,
                couponCode,
                referralCouponCode,
                metadata,
                commissionStructure,
                value,
                referredValue,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Reward{type=$type, title=$title, description=$description, referralDescription=$referralDescription, imageUrl=$imageUrl, isActive=$isActive, isVisible=$isVisible, isUnlimited=$isUnlimited, referredRewardUpfront=$referredRewardUpfront, limit=$limit, conversionsRequired=$conversionsRequired, numberOfWinners=$numberOfWinners, order=$order, limitDuration=$limitDuration, nextMilestonePrefix=$nextMilestonePrefix, nextMilestoneSuffix=$nextMilestoneSuffix, couponCode=$couponCode, referralCouponCode=$referralCouponCode, metadata=$metadata, commissionStructure=$commissionStructure, value=$value, referredValue=$referredValue, additionalProperties=$additionalProperties}"

        /** The reward type. Immutable after creation. */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val SINGLE_SIDED = of("SINGLE_SIDED")

                @JvmField val DOUBLE_SIDED = of("DOUBLE_SIDED")

                @JvmField val MILESTONE = of("MILESTONE")

                @JvmField val LEADERBOARD = of("LEADERBOARD")

                @JvmField val AFFILIATE = of("AFFILIATE")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                SINGLE_SIDED,
                DOUBLE_SIDED,
                MILESTONE,
                LEADERBOARD,
                AFFILIATE,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SINGLE_SIDED,
                DOUBLE_SIDED,
                MILESTONE,
                LEADERBOARD,
                AFFILIATE,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    SINGLE_SIDED -> Value.SINGLE_SIDED
                    DOUBLE_SIDED -> Value.DOUBLE_SIDED
                    MILESTONE -> Value.MILESTONE
                    LEADERBOARD -> Value.LEADERBOARD
                    AFFILIATE -> Value.AFFILIATE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws GrowsurfInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    SINGLE_SIDED -> Known.SINGLE_SIDED
                    DOUBLE_SIDED -> Known.DOUBLE_SIDED
                    MILESTONE -> Known.MILESTONE
                    LEADERBOARD -> Known.LEADERBOARD
                    AFFILIATE -> Known.AFFILIATE
                    else -> throw GrowsurfInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws GrowsurfInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The window over which `limit` applies. */
        class LimitDuration @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val IN_TOTAL = of("IN_TOTAL")

                @JvmField val PER_MONTH = of("PER_MONTH")

                @JvmField val PER_YEAR = of("PER_YEAR")

                @JvmStatic fun of(value: String) = LimitDuration(JsonField.of(value))
            }

            /** An enum containing [LimitDuration]'s known values. */
            enum class Known {
                IN_TOTAL,
                PER_MONTH,
                PER_YEAR,
            }

            /**
             * An enum containing [LimitDuration]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [LimitDuration] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                IN_TOTAL,
                PER_MONTH,
                PER_YEAR,
                /**
                 * An enum member indicating that [LimitDuration] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    IN_TOTAL -> Value.IN_TOTAL
                    PER_MONTH -> Value.PER_MONTH
                    PER_YEAR -> Value.PER_YEAR
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws GrowsurfInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    IN_TOTAL -> Known.IN_TOTAL
                    PER_MONTH -> Known.PER_MONTH
                    PER_YEAR -> Known.PER_YEAR
                    else -> throw GrowsurfInvalidDataException("Unknown LimitDuration: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws GrowsurfInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): LimitDuration = apply {
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

                return other is LimitDuration && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Custom key/value metadata (single-level; values are stored as strings). */
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
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CampaignCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CampaignCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
