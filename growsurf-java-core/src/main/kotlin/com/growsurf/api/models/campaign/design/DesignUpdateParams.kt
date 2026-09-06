// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.design

import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.Params
import com.growsurf.api.core.http.Headers
import com.growsurf.api.core.http.QueryParams
import com.growsurf.api.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Updates a program's design configuration, including the payout-destination confirmation page copy
 * configured from payout integration cards. Only the fields you send are changed; anything you
 * leave out is untouched (arrays such as `signup.fields` replace wholesale). Documented fields have
 * typed setters where the REST contract defines their structure. Open design sections and future
 * fields can use [Builder.putAdditionalBodyProperty].
 */
class DesignUpdateParams
private constructor(
    private val id: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /** The partial Design configuration body properties to send with the request. */
    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): DesignUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [DesignUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DesignUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(designUpdateParams: DesignUpdateParams) = apply {
            id = designUpdateParams.id
            additionalHeaders = designUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = designUpdateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties = designUpdateParams.additionalBodyProperties.toMutableMap()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        fun participantAvatarStyle(value: CampaignDesignParticipantAvatarStyle) = apply {
            additionalBodyProperties["participantAvatarStyle"] = JsonValue.from(value)
        }

        fun window(value: Map<String, JsonValue>) = objectField("window", value)

        fun header(value: Map<String, JsonValue>) = objectField("header", value)

        fun stats(value: Map<String, JsonValue>) = objectField("stats", value)

        fun share(value: Map<String, JsonValue>) = objectField("share", value)

        fun signup(value: Map<String, JsonValue>) = objectField("signup", value)

        fun login(value: ParticipantLoginDesign) = apply {
            additionalBodyProperties["login"] = JsonValue.from(value)
        }

        fun payoutDestinationConfirmation(value: PayoutDestinationConfirmationDesign) = apply {
            additionalBodyProperties["payoutDestinationConfirmation"] = JsonValue.from(value)
        }

        fun countryLabels(value: Map<String, String?>) = apply {
            additionalBodyProperties["countryLabels"] = JsonValue.from(value)
        }

        fun referralStatus(value: Map<String, JsonValue>) = objectField("referralStatus", value)

        fun leaderboard(value: Map<String, JsonValue>) = objectField("leaderboard", value)

        fun referredExperience(value: CampaignDesignReferredExperience) = apply {
            additionalBodyProperties["referredExperience"] = JsonValue.from(value)
        }

        fun referralSummary(value: Map<String, JsonValue>) = objectField("referralSummary", value)

        fun affiliateSummary(value: Map<String, JsonValue>) = objectField("affiliateSummary", value)

        fun commissions(value: Map<String, JsonValue>) = objectField("commissions", value)

        fun payouts(value: Map<String, JsonValue>) = objectField("payouts", value)

        fun rewards(value: Map<String, JsonValue>) = objectField("rewards", value)

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        /** Sets the complete participant Resources presentation settings. */
        fun resources(resources: CampaignDesignResources) = apply {
            additionalBodyProperties["resources"] = JsonValue.from(resources)
        }

        fun participantSettings(value: Map<String, JsonValue>) =
            objectField("participantSettings", value)

        fun landingPages(value: Map<String, JsonValue>) = objectField("landingPages", value)

        fun theme(value: CampaignDesignTheme) = apply {
            additionalBodyProperties["theme"] = JsonValue.from(value)
        }

        private fun objectField(name: String, value: Map<String, JsonValue>) = apply {
            additionalBodyProperties[name] = JsonValue.from(value)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        /**
         * Returns an immutable instance of [DesignUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DesignUpdateParams =
            DesignUpdateParams(
                id,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    fun _body(): Map<String, JsonValue> = additionalBodyProperties

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DesignUpdateParams &&
            id == other.id &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int =
        Objects.hash(id, additionalHeaders, additionalQueryParams, additionalBodyProperties)

    override fun toString() =
        "DesignUpdateParams{id=$id, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
