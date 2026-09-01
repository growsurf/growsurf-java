// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.fasterxml.jackson.annotation.JsonValue

/** Whether an analytics value is complete, partial, or unavailable. */
enum class AnalyticsAvailability(@get:JsonValue val value: String) {
    AVAILABLE("AVAILABLE"),
    PARTIAL("PARTIAL"),
    UNAVAILABLE("UNAVAILABLE"),
}

/** Why an analytics value is partial or unavailable. */
enum class AnalyticsUnavailableReason(@get:JsonValue val value: String) {
    COVERAGE_UNAVAILABLE("COVERAGE_UNAVAILABLE"),
    PRE_COVERAGE("PRE_COVERAGE"),
    PARTIAL_COVERAGE("PARTIAL_COVERAGE"),
    INSUFFICIENT_COVERAGE("INSUFFICIENT_COVERAGE"),
    EMPTY_DENOMINATOR("EMPTY_DENOMINATOR"),
    QUERY_LIMIT_EXCEEDED("QUERY_LIMIT_EXCEEDED"),
    PARTICIPANT_NOT_ELIGIBLE("PARTICIPANT_NOT_ELIGIBLE"),
}
