// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignRevokeAffiliateInviteParamsTest {

    @Test
    fun create() {
        CampaignRevokeAffiliateInviteParams.builder().id("id").inviteId("inviteId").build()
    }

    @Test
    fun pathParams() {
        val params =
            CampaignRevokeAffiliateInviteParams.builder().id("id").inviteId("inviteId").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("inviteId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
