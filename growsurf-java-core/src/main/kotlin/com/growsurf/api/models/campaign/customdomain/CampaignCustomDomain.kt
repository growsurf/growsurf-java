// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.customdomain

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.growsurf.api.core.Enum
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

/** The custom domain that serves a program's landing pages. */
class CampaignCustomDomain
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val domain: JsonField<String>,
    private val isVerified: JsonField<Boolean>,
    private val verifiedAt: JsonField<Long>,
    private val dnsRecord: JsonField<DnsRecord>,
    private val createdAt: JsonField<Long>,
    private val updatedAt: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("domain") @ExcludeMissing domain: JsonField<String> = JsonMissing.of(),
        @JsonProperty("isVerified")
        @ExcludeMissing
        isVerified: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("verifiedAt") @ExcludeMissing verifiedAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("dnsRecord")
        @ExcludeMissing
        dnsRecord: JsonField<DnsRecord> = JsonMissing.of(),
        @JsonProperty("createdAt") @ExcludeMissing createdAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("updatedAt") @ExcludeMissing updatedAt: JsonField<Long> = JsonMissing.of(),
    ) : this(domain, isVerified, verifiedAt, dnsRecord, createdAt, updatedAt, mutableMapOf())

    /**
     * The custom domain, or `null` when none is set.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun domain(): Optional<String> = domain.getOptional("domain")

    /**
     * Whether the domain's `CNAME` record pointed to `dnsRecord.value` at the last check. Landing
     * pages load on the domain only when this is `true`.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isVerified(): Boolean = isVerified.getRequired("isVerified")

    /**
     * When the DNS check passed, in epoch milliseconds. `null` while unverified.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun verifiedAt(): Optional<Long> = verifiedAt.getOptional("verifiedAt")

    /**
     * The DNS record to add at your DNS provider. `null` when no domain is set.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dnsRecord(): Optional<DnsRecord> = dnsRecord.getOptional("dnsRecord")

    /**
     * When the domain was set, in epoch milliseconds. `null` when no domain is set.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<Long> = createdAt.getOptional("createdAt")

    /**
     * When the domain record last changed, in epoch milliseconds. `null` when no domain is set.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<Long> = updatedAt.getOptional("updatedAt")

    /**
     * Returns the raw JSON value of [domain].
     *
     * Unlike [domain], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("domain") @ExcludeMissing fun _domain(): JsonField<String> = domain

    /**
     * Returns the raw JSON value of [isVerified].
     *
     * Unlike [isVerified], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isVerified") @ExcludeMissing fun _isVerified(): JsonField<Boolean> = isVerified

    /**
     * Returns the raw JSON value of [verifiedAt].
     *
     * Unlike [verifiedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("verifiedAt") @ExcludeMissing fun _verifiedAt(): JsonField<Long> = verifiedAt

    /**
     * Returns the raw JSON value of [dnsRecord].
     *
     * Unlike [dnsRecord], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dnsRecord") @ExcludeMissing fun _dnsRecord(): JsonField<DnsRecord> = dnsRecord

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt") @ExcludeMissing fun _createdAt(): JsonField<Long> = createdAt

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt") @ExcludeMissing fun _updatedAt(): JsonField<Long> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [CampaignCustomDomain].
         *
         * The following fields are required:
         * ```java
         * .domain()
         * .isVerified()
         * .verifiedAt()
         * .dnsRecord()
         * .createdAt()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CampaignCustomDomain]. */
    class Builder internal constructor() {

        private var domain: JsonField<String>? = null
        private var isVerified: JsonField<Boolean>? = null
        private var verifiedAt: JsonField<Long>? = null
        private var dnsRecord: JsonField<DnsRecord>? = null
        private var createdAt: JsonField<Long>? = null
        private var updatedAt: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(campaignCustomDomain: CampaignCustomDomain) = apply {
            domain = campaignCustomDomain.domain
            isVerified = campaignCustomDomain.isVerified
            verifiedAt = campaignCustomDomain.verifiedAt
            dnsRecord = campaignCustomDomain.dnsRecord
            createdAt = campaignCustomDomain.createdAt
            updatedAt = campaignCustomDomain.updatedAt
            additionalProperties = campaignCustomDomain.additionalProperties.toMutableMap()
        }

        /** The custom domain, or `null` when none is set. */
        fun domain(domain: String?) = domain(JsonField.ofNullable(domain))

        /** Alias for calling [Builder.domain] with `domain.orElse(null)`. */
        fun domain(domain: Optional<String>) = domain(domain.getOrNull())

        /**
         * Sets [Builder.domain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.domain] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun domain(domain: JsonField<String>) = apply { this.domain = domain }

        /**
         * Whether the domain's `CNAME` record pointed to `dnsRecord.value` at the last check.
         * Landing pages load on the domain only when this is `true`.
         */
        fun isVerified(isVerified: Boolean) = isVerified(JsonField.of(isVerified))

        /**
         * Sets [Builder.isVerified] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isVerified] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isVerified(isVerified: JsonField<Boolean>) = apply { this.isVerified = isVerified }

        /** When the DNS check passed, in epoch milliseconds. `null` while unverified. */
        fun verifiedAt(verifiedAt: Long?) = verifiedAt(JsonField.ofNullable(verifiedAt))

        /**
         * Alias for [Builder.verifiedAt].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun verifiedAt(verifiedAt: Long) = verifiedAt(verifiedAt as Long?)

        /** Alias for calling [Builder.verifiedAt] with `verifiedAt.orElse(null)`. */
        fun verifiedAt(verifiedAt: Optional<Long>) = verifiedAt(verifiedAt.getOrNull())

        /**
         * Sets [Builder.verifiedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verifiedAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun verifiedAt(verifiedAt: JsonField<Long>) = apply { this.verifiedAt = verifiedAt }

        /** The DNS record to add at your DNS provider. `null` when no domain is set. */
        fun dnsRecord(dnsRecord: DnsRecord?) = dnsRecord(JsonField.ofNullable(dnsRecord))

        /** Alias for calling [Builder.dnsRecord] with `dnsRecord.orElse(null)`. */
        fun dnsRecord(dnsRecord: Optional<DnsRecord>) = dnsRecord(dnsRecord.getOrNull())

        /**
         * Sets [Builder.dnsRecord] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dnsRecord] with a well-typed [DnsRecord] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dnsRecord(dnsRecord: JsonField<DnsRecord>) = apply { this.dnsRecord = dnsRecord }

        /** When the domain was set, in epoch milliseconds. `null` when no domain is set. */
        fun createdAt(createdAt: Long?) = createdAt(JsonField.ofNullable(createdAt))

        /**
         * Alias for [Builder.createdAt].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun createdAt(createdAt: Long) = createdAt(createdAt as Long?)

        /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
        fun createdAt(createdAt: Optional<Long>) = createdAt(createdAt.getOrNull())

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

        /**
         * When the domain record last changed, in epoch milliseconds. `null` when no domain is set.
         */
        fun updatedAt(updatedAt: Long?) = updatedAt(JsonField.ofNullable(updatedAt))

        /**
         * Alias for [Builder.updatedAt].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun updatedAt(updatedAt: Long) = updatedAt(updatedAt as Long?)

        /** Alias for calling [Builder.updatedAt] with `updatedAt.orElse(null)`. */
        fun updatedAt(updatedAt: Optional<Long>) = updatedAt(updatedAt.getOrNull())

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun updatedAt(updatedAt: JsonField<Long>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [CampaignCustomDomain].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .domain()
         * .isVerified()
         * .verifiedAt()
         * .dnsRecord()
         * .createdAt()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CampaignCustomDomain =
            CampaignCustomDomain(
                checkRequired("domain", domain),
                checkRequired("isVerified", isVerified),
                checkRequired("verifiedAt", verifiedAt),
                checkRequired("dnsRecord", dnsRecord),
                checkRequired("createdAt", createdAt),
                checkRequired("updatedAt", updatedAt),
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
    fun validate(): CampaignCustomDomain = apply {
        if (validated) {
            return@apply
        }

        domain()
        isVerified()
        verifiedAt()
        dnsRecord().ifPresent { it.validate() }
        createdAt()
        updatedAt()
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
        (if (domain.asKnown().isPresent) 1 else 0) +
            (if (isVerified.asKnown().isPresent) 1 else 0) +
            (if (verifiedAt.asKnown().isPresent) 1 else 0) +
            (dnsRecord.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /** The DNS record to add at your DNS provider. `null` when no domain is set. */
    class DnsRecord
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val type: JsonField<Type>,
        private val name: JsonField<String>,
        private val value: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        ) : this(type, name, value, mutableMapOf())

        /**
         * The record type. Always `CNAME`.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * The hostname the record is for.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The record's target.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): String = value.getRequired("value")

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
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
             * Returns a mutable builder for constructing an instance of [DnsRecord].
             *
             * The following fields are required:
             * ```java
             * .type()
             * .name()
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DnsRecord]. */
        class Builder internal constructor() {

            private var type: JsonField<Type>? = null
            private var name: JsonField<String>? = null
            private var value: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dnsRecord: DnsRecord) = apply {
                type = dnsRecord.type
                name = dnsRecord.name
                value = dnsRecord.value
                additionalProperties = dnsRecord.additionalProperties.toMutableMap()
            }

            /** The record type. Always `CNAME`. */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** The hostname the record is for. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The record's target. */
            fun value(value: String) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<String>) = apply { this.value = value }

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
             * Returns an immutable instance of [DnsRecord].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .type()
             * .name()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DnsRecord =
                DnsRecord(
                    checkRequired("type", type),
                    checkRequired("name", name),
                    checkRequired("value", value),
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
        fun validate(): DnsRecord = apply {
            if (validated) {
                return@apply
            }

            type().validate()
            name()
            value()
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
                (if (value.asKnown().isPresent) 1 else 0)

        /** The record type. Always `CNAME`. */
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

                @JvmField val CNAME = of("CNAME")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                CNAME
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
                CNAME,
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
                    CNAME -> Value.CNAME
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
                    CNAME -> Known.CNAME
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DnsRecord &&
                type == other.type &&
                name == other.name &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(type, name, value, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DnsRecord{type=$type, name=$name, value=$value, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CampaignCustomDomain &&
            domain == other.domain &&
            isVerified == other.isVerified &&
            verifiedAt == other.verifiedAt &&
            dnsRecord == other.dnsRecord &&
            createdAt == other.createdAt &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            domain,
            isVerified,
            verifiedAt,
            dnsRecord,
            createdAt,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CampaignCustomDomain{domain=$domain, isVerified=$isVerified, verifiedAt=$verifiedAt, dnsRecord=$dnsRecord, createdAt=$createdAt, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
