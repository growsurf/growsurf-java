// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class EmailAnalyticsCounts
@JsonCreator
constructor(
    @JsonProperty("sent") val sent: Long,
    @JsonProperty("delivered") val delivered: Long,
    @JsonProperty("opened") val opened: Long,
    @JsonProperty("clicked") val clicked: Long,
    @JsonProperty("bounced") val bounced: Long,
    @JsonProperty("spamComplaints") val spamComplaints: Long,
) {
    fun validate(): EmailAnalyticsCounts = this

    internal fun validity(): Int = 6
}

@JsonIgnoreProperties(ignoreUnknown = true)
data class EmailAnalyticsByType
@JsonCreator
constructor(
    @JsonProperty("emailType") val emailType: String,
    @JsonProperty("sent") val sent: Long,
    @JsonProperty("delivered") val delivered: Long,
    @JsonProperty("opened") val opened: Long,
    @JsonProperty("clicked") val clicked: Long,
    @JsonProperty("bounced") val bounced: Long,
    @JsonProperty("spamComplaints") val spamComplaints: Long,
    @JsonProperty("deliveryRate") val deliveryRate: Double,
    @JsonProperty("openRate") val openRate: Double,
    @JsonProperty("clickRate") val clickRate: Double,
    @JsonProperty("bounceRate") val bounceRate: Double,
) {
    fun validate(): EmailAnalyticsByType = this

    internal fun validity(): Int = 11
}

/** Accepted-send and lifecycle metrics for program emails in a requested window. */
@JsonIgnoreProperties(ignoreUnknown = true)
data class EmailAnalytics
@JsonCreator
constructor(
    @JsonProperty("sent") val sent: Long,
    @JsonProperty("delivered") val delivered: Long,
    @JsonProperty("opened") val opened: Long,
    @JsonProperty("clicked") val clicked: Long,
    @JsonProperty("bounced") val bounced: Long,
    @JsonProperty("spamComplaints") val spamComplaints: Long,
    @JsonProperty("deliveryRate") val deliveryRate: Double,
    @JsonProperty("openRate") val openRate: Double,
    @JsonProperty("clickRate") val clickRate: Double,
    @JsonProperty("bounceRate") val bounceRate: Double,
    @JsonProperty("byType") val byType: List<EmailAnalyticsByType>,
    @JsonProperty("coverageStartDate") val coverageStartDate: Long?,
    @JsonProperty("isPartial") val isPartial: Boolean,
) {
    fun validate(): EmailAnalytics = apply { byType.forEach { it.validate() } }

    internal fun validity(): Int = 13 + byType.sumOf { it.validity() }
}
