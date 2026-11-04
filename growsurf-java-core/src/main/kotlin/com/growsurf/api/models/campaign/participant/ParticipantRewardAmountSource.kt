// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.participant

import com.fasterxml.jackson.annotation.JsonValue as JsonValueAnnotation

/**
 * Where a participant reward's `amount` or `percentOff` comes from. `METADATA` means the amount
 * saved when the reward was earned.
 */
enum class ParticipantRewardAmountSource(@get:JsonValueAnnotation val value: String) {
    STRIPE("STRIPE"),
    CHARGEBEE("CHARGEBEE"),
    RECURLY("RECURLY"),
    CHARGIFY("CHARGIFY"),
    PAYPAL("PAYPAL"),
    VENMO("VENMO"),
    TANGO_CARD("TANGO_CARD"),
    TREMENDOUS("TREMENDOUS"),
    XTRM("XTRM"),
    METADATA("METADATA"),
}
