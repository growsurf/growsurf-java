// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.integrations

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.growsurf.api.core.ExcludeMissing
import com.growsurf.api.core.JsonField
import com.growsurf.api.core.JsonMissing
import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.checkRequired
import com.growsurf.api.errors.GrowsurfInvalidDataException
import java.util.Collections
import java.util.Objects

/** One integration a program can connect, with its current state. */
class Integration
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val autoDisabled: JsonField<Boolean>,
    private val connectUrl: JsonField<String>,
    private val connected: JsonField<Boolean>,
    private val enabled: JsonField<Boolean>,
    private val name: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("autoDisabled")
        @ExcludeMissing
        autoDisabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("connectUrl")
        @ExcludeMissing
        connectUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("connected") @ExcludeMissing connected: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
    ) : this(id, autoDisabled, connectUrl, connected, enabled, name, mutableMapOf())

    /**
     * Stable integration key, the same value the GrowSurf dashboard uses for this integration.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Whether GrowSurf switched the integration off after repeated delivery failures. Its
     * credentials are still stored, but it delivers nothing until it is reconnected in the GrowSurf
     * dashboard.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun autoDisabled(): Boolean = autoDisabled.getRequired("autoDisabled")

    /**
     * Dashboard link that opens this integration's connect panel in the GrowSurf Program Editor.
     * Give it to the person running the program: connecting an account is a step they complete in
     * the dashboard, and the API cannot do it for them.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun connectUrl(): String = connectUrl.getRequired("connectUrl")

    /**
     * Whether the program has stored credentials for this integration.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun connected(): Boolean = connected.getRequired("connected")

    /**
     * Whether the integration is switched on and currently working.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun enabled(): Boolean = enabled.getRequired("enabled")

    /**
     * Display name, matching what the GrowSurf dashboard calls this integration.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [autoDisabled].
     *
     * Unlike [autoDisabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("autoDisabled")
    @ExcludeMissing
    fun _autoDisabled(): JsonField<Boolean> = autoDisabled

    /**
     * Returns the raw JSON value of [connectUrl].
     *
     * Unlike [connectUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connectUrl") @ExcludeMissing fun _connectUrl(): JsonField<String> = connectUrl

    /**
     * Returns the raw JSON value of [connected].
     *
     * Unlike [connected], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connected") @ExcludeMissing fun _connected(): JsonField<Boolean> = connected

    /**
     * Returns the raw JSON value of [enabled].
     *
     * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Returns a mutable builder for constructing an instance of [Integration].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .autoDisabled()
         * .connectUrl()
         * .connected()
         * .enabled()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Integration]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var autoDisabled: JsonField<Boolean>? = null
        private var connectUrl: JsonField<String>? = null
        private var connected: JsonField<Boolean>? = null
        private var enabled: JsonField<Boolean>? = null
        private var name: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(integration: Integration) = apply {
            id = integration.id
            autoDisabled = integration.autoDisabled
            connectUrl = integration.connectUrl
            connected = integration.connected
            enabled = integration.enabled
            name = integration.name
            additionalProperties = integration.additionalProperties.toMutableMap()
        }

        /**
         * Stable integration key, the same value the GrowSurf dashboard uses for this integration.
         */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Whether GrowSurf switched the integration off after repeated delivery failures. Its
         * credentials are still stored, but it delivers nothing until it is reconnected in the
         * GrowSurf dashboard.
         */
        fun autoDisabled(autoDisabled: Boolean) = autoDisabled(JsonField.of(autoDisabled))

        /**
         * Sets [Builder.autoDisabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoDisabled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun autoDisabled(autoDisabled: JsonField<Boolean>) = apply {
            this.autoDisabled = autoDisabled
        }

        /**
         * Dashboard link that opens this integration's connect panel in the GrowSurf Program
         * Editor. Give it to the person running the program: connecting an account is a step they
         * complete in the dashboard, and the API cannot do it for them.
         */
        fun connectUrl(connectUrl: String) = connectUrl(JsonField.of(connectUrl))

        /**
         * Sets [Builder.connectUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun connectUrl(connectUrl: JsonField<String>) = apply { this.connectUrl = connectUrl }

        /** Whether the program has stored credentials for this integration. */
        fun connected(connected: Boolean) = connected(JsonField.of(connected))

        /**
         * Sets [Builder.connected] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connected] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun connected(connected: JsonField<Boolean>) = apply { this.connected = connected }

        /** Whether the integration is switched on and currently working. */
        fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

        /**
         * Sets [Builder.enabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

        /** Display name, matching what the GrowSurf dashboard calls this integration. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
         * Returns an immutable instance of [Integration].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .autoDisabled()
         * .connectUrl()
         * .connected()
         * .enabled()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Integration =
            Integration(
                checkRequired("id", id),
                checkRequired("autoDisabled", autoDisabled),
                checkRequired("connectUrl", connectUrl),
                checkRequired("connected", connected),
                checkRequired("enabled", enabled),
                checkRequired("name", name),
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
    fun validate(): Integration = apply {
        if (validated) {
            return@apply
        }

        id()
        autoDisabled()
        connectUrl()
        connected()
        enabled()
        name()
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
            (if (autoDisabled.asKnown().isPresent) 1 else 0) +
            (if (connectUrl.asKnown().isPresent) 1 else 0) +
            (if (connected.asKnown().isPresent) 1 else 0) +
            (if (enabled.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Integration &&
            id == other.id &&
            autoDisabled == other.autoDisabled &&
            connectUrl == other.connectUrl &&
            connected == other.connected &&
            enabled == other.enabled &&
            name == other.name &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, autoDisabled, connectUrl, connected, enabled, name, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Integration{id=$id, autoDisabled=$autoDisabled, connectUrl=$connectUrl, connected=$connected, enabled=$enabled, name=$name, additionalProperties=$additionalProperties}"
}
