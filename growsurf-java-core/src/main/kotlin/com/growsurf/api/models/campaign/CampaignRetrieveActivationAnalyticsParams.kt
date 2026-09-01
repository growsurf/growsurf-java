// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.fasterxml.jackson.annotation.JsonValue
import com.growsurf.api.core.Params
import com.growsurf.api.core.http.Headers
import com.growsurf.api.core.http.QueryParams
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Parameters for retrieving activation cohorts for eligible program participants. */
class CampaignRetrieveActivationAnalyticsParams
private constructor(
    private val id: String?,
    private val cohortFrom: Long?,
    private val cohortTo: Long?,
    private val cohortInterval: CohortInterval?,
    private val observationWindowDays: ObservationWindowDays?,
    private val timezone: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {
    fun id(): Optional<String> = Optional.ofNullable(id)

    fun cohortFrom(): Optional<Long> = Optional.ofNullable(cohortFrom)

    fun cohortTo(): Optional<Long> = Optional.ofNullable(cohortTo)

    fun cohortInterval(): Optional<CohortInterval> = Optional.ofNullable(cohortInterval)

    fun observationWindowDays(): Optional<ObservationWindowDays> =
        Optional.ofNullable(observationWindowDays)

    fun timezone(): Optional<String> = Optional.ofNullable(timezone)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder(): Builder = Builder().from(this)

    fun _pathParam(index: Int): String = if (index == 0) id.orEmpty() else ""

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                cohortFrom?.let { put("cohortFrom", it.toString()) }
                cohortTo?.let { put("cohortTo", it.toString()) }
                cohortInterval?.let { put("cohortInterval", it.value) }
                observationWindowDays?.let { put("observationWindowDays", it.value.toString()) }
                timezone?.let { put("timezone", it) }
                putAll(additionalQueryParams)
            }
            .build()

    companion object {
        @JvmStatic fun none(): CampaignRetrieveActivationAnalyticsParams = builder().build()

        @JvmStatic fun builder(): Builder = Builder()
    }

    class Builder internal constructor() {
        private var id: String? = null
        private var cohortFrom: Long? = null
        private var cohortTo: Long? = null
        private var cohortInterval: CohortInterval? = null
        private var observationWindowDays: ObservationWindowDays? = null
        private var timezone: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(params: CampaignRetrieveActivationAnalyticsParams) = apply {
            id = params.id
            cohortFrom = params.cohortFrom
            cohortTo = params.cohortTo
            cohortInterval = params.cohortInterval
            observationWindowDays = params.observationWindowDays
            timezone = params.timezone
            additionalHeaders = params.additionalHeaders.toBuilder()
            additionalQueryParams = params.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        fun id(id: Optional<String>) = id(id.getOrNull())

        fun cohortFrom(cohortFrom: Long?) = apply { this.cohortFrom = cohortFrom }

        fun cohortFrom(cohortFrom: Long) = cohortFrom(cohortFrom as Long?)

        fun cohortTo(cohortTo: Long?) = apply { this.cohortTo = cohortTo }

        fun cohortTo(cohortTo: Long) = cohortTo(cohortTo as Long?)

        fun cohortInterval(cohortInterval: CohortInterval?) = apply {
            this.cohortInterval = cohortInterval
        }

        fun observationWindowDays(observationWindowDays: ObservationWindowDays?) = apply {
            this.observationWindowDays = observationWindowDays
        }

        fun timezone(timezone: String?) = apply { this.timezone = timezone }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun build(): CampaignRetrieveActivationAnalyticsParams =
            CampaignRetrieveActivationAnalyticsParams(
                id,
                cohortFrom,
                cohortTo,
                cohortInterval,
                observationWindowDays,
                timezone,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    enum class CohortInterval(@get:JsonValue val value: String) {
        DAY("day"),
        WEEK("week"),
        MONTH("month"),
    }

    enum class ObservationWindowDays(@get:JsonValue val value: Long) {
        SEVEN(7),
        THIRTY(30),
    }
}
