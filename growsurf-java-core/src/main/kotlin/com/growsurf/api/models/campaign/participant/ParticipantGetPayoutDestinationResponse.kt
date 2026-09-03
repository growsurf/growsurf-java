// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.growsurf.api.core.Enum
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

class ParticipantGetPayoutDestinationResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val activeProvider: JsonField<String>,
    private val destinations: JsonField<List<Destination>>,
    private val enabledProviders: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("activeProvider")
        @ExcludeMissing
        activeProvider: JsonField<String> = JsonMissing.of(),
        @JsonProperty("destinations")
        @ExcludeMissing
        destinations: JsonField<List<Destination>> = JsonMissing.of(),
        @JsonProperty("enabledProviders")
        @ExcludeMissing
        enabledProviders: JsonField<List<String>> = JsonMissing.of(),
    ) : this(activeProvider, destinations, enabledProviders, mutableMapOf())

    /**
     * The provider that currently gets paid, or null until the participant confirms one.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun activeProvider(): Optional<String> = activeProvider.getOptional("activeProvider")

    /**
     * One entry per enabled payout provider describing the participant's destination for it.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun destinations(): List<Destination> = destinations.getRequired("destinations")

    /**
     * The payout providers enabled for this program.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enabledProviders(): List<String> = enabledProviders.getRequired("enabledProviders")

    /**
     * Returns the raw JSON value of [activeProvider].
     *
     * Unlike [activeProvider], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("activeProvider")
    @ExcludeMissing
    fun _activeProvider(): JsonField<String> = activeProvider

    /**
     * Returns the raw JSON value of [destinations].
     *
     * Unlike [destinations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("destinations")
    @ExcludeMissing
    fun _destinations(): JsonField<List<Destination>> = destinations

    /**
     * Returns the raw JSON value of [enabledProviders].
     *
     * Unlike [enabledProviders], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("enabledProviders")
    @ExcludeMissing
    fun _enabledProviders(): JsonField<List<String>> = enabledProviders

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
         * [ParticipantGetPayoutDestinationResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ParticipantGetPayoutDestinationResponse]. */
    class Builder internal constructor() {

        private var activeProvider: JsonField<String>? = null
        private var destinations: JsonField<MutableList<Destination>>? = null
        private var enabledProviders: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            participantGetPayoutDestinationResponse: ParticipantGetPayoutDestinationResponse
        ) = apply {
            activeProvider = participantGetPayoutDestinationResponse.activeProvider
            destinations =
                participantGetPayoutDestinationResponse.destinations.map { it.toMutableList() }
            enabledProviders =
                participantGetPayoutDestinationResponse.enabledProviders.map { it.toMutableList() }
            additionalProperties =
                participantGetPayoutDestinationResponse.additionalProperties.toMutableMap()
        }

        /** The provider that currently gets paid, or null until the participant confirms one. */
        fun activeProvider(activeProvider: String?) =
            activeProvider(JsonField.ofNullable(activeProvider))

        /** Alias for calling [Builder.activeProvider] with `activeProvider.orElse(null)`. */
        fun activeProvider(activeProvider: Optional<String>) =
            activeProvider(activeProvider.getOrNull())

        /**
         * Sets [Builder.activeProvider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activeProvider] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun activeProvider(activeProvider: JsonField<String>) = apply {
            this.activeProvider = activeProvider
        }

        /**
         * One entry per enabled payout provider describing the participant's destination for it.
         */
        fun destinations(destinations: List<Destination>) = destinations(JsonField.of(destinations))

        /**
         * Sets [Builder.destinations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destinations] with a well-typed `List<Destination>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun destinations(destinations: JsonField<List<Destination>>) = apply {
            this.destinations = destinations.map { it.toMutableList() }
        }

        /**
         * Adds a single [Destination] to [destinations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDestination(destination: Destination) = apply {
            destinations =
                (destinations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("destinations", it).add(destination)
                }
        }

        /** The payout providers enabled for this program. */
        fun enabledProviders(enabledProviders: List<String>) =
            enabledProviders(JsonField.of(enabledProviders))

        /**
         * Sets [Builder.enabledProviders] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabledProviders] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun enabledProviders(enabledProviders: JsonField<List<String>>) = apply {
            this.enabledProviders = enabledProviders.map { it.toMutableList() }
        }

        /**
         * Adds a single provider to [enabledProviders].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEnabledProvider(enabledProvider: String) = apply {
            enabledProviders =
                (enabledProviders ?: JsonField.of(mutableListOf())).also {
                    checkKnown("enabledProviders", it).add(enabledProvider)
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
         * Returns an immutable instance of [ParticipantGetPayoutDestinationResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ParticipantGetPayoutDestinationResponse =
            ParticipantGetPayoutDestinationResponse(
                checkRequired("activeProvider", activeProvider),
                checkRequired("destinations", destinations).map { it.toImmutable() },
                checkRequired("enabledProviders", enabledProviders).map { it.toImmutable() },
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
    fun validate(): ParticipantGetPayoutDestinationResponse = apply {
        if (validated) {
            return@apply
        }

        activeProvider()
        destinations().forEach { it.validate() }
        enabledProviders()
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
        (if (activeProvider.asKnown().isPresent) 1 else 0) +
            (destinations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (enabledProviders.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParticipantGetPayoutDestinationResponse &&
            activeProvider == other.activeProvider &&
            destinations == other.destinations &&
            enabledProviders == other.enabledProviders &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(activeProvider, destinations, enabledProviders, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ParticipantGetPayoutDestinationResponse{activeProvider=$activeProvider, destinations=$destinations, enabledProviders=$enabledProviders, additionalProperties=$additionalProperties}"

    class Destination
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val claimEmail: JsonField<String>,
        private val confirmedAt: JsonField<Long>,
        private val legalEntityType: JsonField<LegalEntityType>,
        private val needsRepairReason: JsonField<String>,
        private val provider: JsonField<String>,
        private val providerDisplayName: JsonField<String>,
        private val status: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("claimEmail")
            @ExcludeMissing
            claimEmail: JsonField<String> = JsonMissing.of(),
            @JsonProperty("confirmedAt")
            @ExcludeMissing
            confirmedAt: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("legalEntityType")
            @ExcludeMissing
            legalEntityType: JsonField<LegalEntityType> = JsonMissing.of(),
            @JsonProperty("needsRepairReason")
            @ExcludeMissing
            needsRepairReason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provider")
            @ExcludeMissing
            provider: JsonField<String> = JsonMissing.of(),
            @JsonProperty("providerDisplayName")
            @ExcludeMissing
            providerDisplayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        ) : this(
            claimEmail,
            confirmedAt,
            legalEntityType,
            needsRepairReason,
            provider,
            providerDisplayName,
            status,
            mutableMapOf(),
        )

        /**
         * The confirmed payout email for this provider.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun claimEmail(): Optional<String> = claimEmail.getOptional("claimEmail")

        /**
         * When the destination was confirmed, as a Unix timestamp in milliseconds.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun confirmedAt(): Optional<Long> = confirmedAt.getOptional("confirmedAt")

        /**
         * The legal recipient type the participant confirmed, if any.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun legalEntityType(): Optional<LegalEntityType> =
            legalEntityType.getOptional("legalEntityType")

        /**
         * When status is `NEEDS_REPAIR`, why (e.g. a bounced delivery).
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun needsRepairReason(): Optional<String> =
            needsRepairReason.getOptional("needsRepairReason")

        /**
         * The payout provider this entry describes.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun provider(): String = provider.getRequired("provider")

        /**
         * The customer-facing provider name (e.g. "PayPal", "Wise").
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun providerDisplayName(): String = providerDisplayName.getRequired("providerDisplayName")

        /**
         * The destination's current status: `NONE` (not set up), `PENDING_CONFIRMATION`,
         * `CONFIRMED`, `ACTIVE`, `NEEDS_REPAIR`, or `EXPIRED`. Historical superseded or revoked
         * destinations are projected as `NONE`.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun status(): String = status.getRequired("status")

        /**
         * Returns the raw JSON value of [claimEmail].
         *
         * Unlike [claimEmail], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("claimEmail")
        @ExcludeMissing
        fun _claimEmail(): JsonField<String> = claimEmail

        /**
         * Returns the raw JSON value of [confirmedAt].
         *
         * Unlike [confirmedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("confirmedAt")
        @ExcludeMissing
        fun _confirmedAt(): JsonField<Long> = confirmedAt

        /**
         * Returns the raw JSON value of [legalEntityType].
         *
         * Unlike [legalEntityType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("legalEntityType")
        @ExcludeMissing
        fun _legalEntityType(): JsonField<LegalEntityType> = legalEntityType

        /**
         * Returns the raw JSON value of [needsRepairReason].
         *
         * Unlike [needsRepairReason], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("needsRepairReason")
        @ExcludeMissing
        fun _needsRepairReason(): JsonField<String> = needsRepairReason

        /**
         * Returns the raw JSON value of [provider].
         *
         * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

        /**
         * Returns the raw JSON value of [providerDisplayName].
         *
         * Unlike [providerDisplayName], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("providerDisplayName")
        @ExcludeMissing
        fun _providerDisplayName(): JsonField<String> = providerDisplayName

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

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

            /** Returns a mutable builder for constructing an instance of [Destination]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Destination]. */
        class Builder internal constructor() {

            private var claimEmail: JsonField<String>? = null
            private var confirmedAt: JsonField<Long>? = null
            private var legalEntityType: JsonField<LegalEntityType>? = null
            private var needsRepairReason: JsonField<String>? = null
            private var provider: JsonField<String>? = null
            private var providerDisplayName: JsonField<String>? = null
            private var status: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(destination: Destination) = apply {
                claimEmail = destination.claimEmail
                confirmedAt = destination.confirmedAt
                legalEntityType = destination.legalEntityType
                needsRepairReason = destination.needsRepairReason
                provider = destination.provider
                providerDisplayName = destination.providerDisplayName
                status = destination.status
                additionalProperties = destination.additionalProperties.toMutableMap()
            }

            /** The confirmed payout email for this provider. */
            fun claimEmail(claimEmail: String?) = claimEmail(JsonField.ofNullable(claimEmail))

            /** Alias for calling [Builder.claimEmail] with `claimEmail.orElse(null)`. */
            fun claimEmail(claimEmail: Optional<String>) = claimEmail(claimEmail.getOrNull())

            /**
             * Sets [Builder.claimEmail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.claimEmail] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun claimEmail(claimEmail: JsonField<String>) = apply { this.claimEmail = claimEmail }

            /** When the destination was confirmed, as a Unix timestamp in milliseconds. */
            fun confirmedAt(confirmedAt: Long?) = confirmedAt(JsonField.ofNullable(confirmedAt))

            /**
             * Alias for [Builder.confirmedAt].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun confirmedAt(confirmedAt: Long) = confirmedAt(confirmedAt as Long?)

            /** Alias for calling [Builder.confirmedAt] with `confirmedAt.orElse(null)`. */
            fun confirmedAt(confirmedAt: Optional<Long>) = confirmedAt(confirmedAt.getOrNull())

            /**
             * Sets [Builder.confirmedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.confirmedAt] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun confirmedAt(confirmedAt: JsonField<Long>) = apply { this.confirmedAt = confirmedAt }

            /** The legal recipient type the participant confirmed, if any. */
            fun legalEntityType(legalEntityType: LegalEntityType?) =
                legalEntityType(JsonField.ofNullable(legalEntityType))

            /** Alias for calling [Builder.legalEntityType] with `legalEntityType.orElse(null)`. */
            fun legalEntityType(legalEntityType: Optional<LegalEntityType>) =
                legalEntityType(legalEntityType.getOrNull())

            /**
             * Sets [Builder.legalEntityType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.legalEntityType] with a well-typed [LegalEntityType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun legalEntityType(legalEntityType: JsonField<LegalEntityType>) = apply {
                this.legalEntityType = legalEntityType
            }

            /** When status is `NEEDS_REPAIR`, why (e.g. a bounced delivery). */
            fun needsRepairReason(needsRepairReason: String?) =
                needsRepairReason(JsonField.ofNullable(needsRepairReason))

            /**
             * Alias for calling [Builder.needsRepairReason] with `needsRepairReason.orElse(null)`.
             */
            fun needsRepairReason(needsRepairReason: Optional<String>) =
                needsRepairReason(needsRepairReason.getOrNull())

            /**
             * Sets [Builder.needsRepairReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.needsRepairReason] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun needsRepairReason(needsRepairReason: JsonField<String>) = apply {
                this.needsRepairReason = needsRepairReason
            }

            /** The payout provider this entry describes. */
            fun provider(provider: String) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<String>) = apply { this.provider = provider }

            /** The customer-facing provider name (e.g. "PayPal", "Wise"). */
            fun providerDisplayName(providerDisplayName: String) =
                providerDisplayName(JsonField.of(providerDisplayName))

            /**
             * Sets [Builder.providerDisplayName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.providerDisplayName] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun providerDisplayName(providerDisplayName: JsonField<String>) = apply {
                this.providerDisplayName = providerDisplayName
            }

            /**
             * The destination's current status: `NONE` (not set up), `PENDING_CONFIRMATION`,
             * `CONFIRMED`, `ACTIVE`, `NEEDS_REPAIR`, or `EXPIRED`. Historical superseded or revoked
             * destinations are projected as `NONE`.
             */
            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

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
             * Returns an immutable instance of [Destination].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Destination =
                Destination(
                    checkRequired("claimEmail", claimEmail),
                    checkRequired("confirmedAt", confirmedAt),
                    checkRequired("legalEntityType", legalEntityType),
                    checkRequired("needsRepairReason", needsRepairReason),
                    checkRequired("provider", provider),
                    checkRequired("providerDisplayName", providerDisplayName),
                    checkRequired("status", status),
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
        fun validate(): Destination = apply {
            if (validated) {
                return@apply
            }

            claimEmail()
            confirmedAt()
            legalEntityType().ifPresent { it.validate() }
            needsRepairReason()
            provider()
            providerDisplayName()
            status()
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
            (if (claimEmail.asKnown().isPresent) 1 else 0) +
                (if (confirmedAt.asKnown().isPresent) 1 else 0) +
                (legalEntityType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (needsRepairReason.asKnown().isPresent) 1 else 0) +
                (if (provider.asKnown().isPresent) 1 else 0) +
                (if (providerDisplayName.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Destination &&
                claimEmail == other.claimEmail &&
                confirmedAt == other.confirmedAt &&
                legalEntityType == other.legalEntityType &&
                needsRepairReason == other.needsRepairReason &&
                provider == other.provider &&
                providerDisplayName == other.providerDisplayName &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                claimEmail,
                confirmedAt,
                legalEntityType,
                needsRepairReason,
                provider,
                providerDisplayName,
                status,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Destination{claimEmail=$claimEmail, confirmedAt=$confirmedAt, legalEntityType=$legalEntityType, needsRepairReason=$needsRepairReason, provider=$provider, providerDisplayName=$providerDisplayName, status=$status, additionalProperties=$additionalProperties}"

        /** The legal recipient type the participant confirmed, if any. */
        class LegalEntityType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val INDIVIDUAL = of("INDIVIDUAL")

                @JvmField val BUSINESS = of("BUSINESS")

                @JvmStatic fun of(value: String) = LegalEntityType(JsonField.of(value))
            }

            /** An enum containing [LegalEntityType]'s known values. */
            enum class Known {
                INDIVIDUAL,
                BUSINESS,
            }

            /**
             * An enum containing [LegalEntityType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [LegalEntityType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                INDIVIDUAL,
                BUSINESS,
                /**
                 * An enum member indicating that [LegalEntityType] was instantiated with an unknown
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
                    INDIVIDUAL -> Value.INDIVIDUAL
                    BUSINESS -> Value.BUSINESS
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
                    INDIVIDUAL -> Known.INDIVIDUAL
                    BUSINESS -> Known.BUSINESS
                    else -> throw GrowsurfInvalidDataException("Unknown LegalEntityType: $value")
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

            fun validate(): LegalEntityType = apply {
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

            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LegalEntityType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }
    }
}
