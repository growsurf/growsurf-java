// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.growsurf.api.core.jsonMapper
import com.growsurf.api.models.campaign.participant.ReferralStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReferralListTest {

    @Test
    fun create() {
        val referralList =
            ReferralList.builder()
                .limit(0L)
                .more(true)
                .addReferral(
                    ReferralList.Referral.builder()
                        .id("id")
                        .createdAt(0L)
                        .email("email")
                        .referralStatus(ReferralStatus.CREDIT_PENDING)
                        .referredBy("referredBy")
                        .updatedAt(0L)
                        .firstName("firstName")
                        .lastName("lastName")
                        .build()
                )
                .nextId("nextId")
                .nextOffset(0L)
                .build()

        assertThat(referralList.limit()).isEqualTo(0L)
        assertThat(referralList.more()).isEqualTo(true)
        assertThat(referralList.referrals())
            .containsExactly(
                ReferralList.Referral.builder()
                    .id("id")
                    .createdAt(0L)
                    .email("email")
                    .referralStatus(ReferralStatus.CREDIT_PENDING)
                    .referredBy("referredBy")
                    .updatedAt(0L)
                    .firstName("firstName")
                    .lastName("lastName")
                    .build()
            )
        assertThat(referralList.nextId()).contains("nextId")
        assertThat(referralList.nextOffset()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val referralList =
            ReferralList.builder()
                .limit(0L)
                .more(true)
                .addReferral(
                    ReferralList.Referral.builder()
                        .id("id")
                        .createdAt(0L)
                        .email("email")
                        .referralStatus(ReferralStatus.CREDIT_PENDING)
                        .referredBy("referredBy")
                        .updatedAt(0L)
                        .firstName("firstName")
                        .lastName("lastName")
                        .build()
                )
                .nextId("nextId")
                .nextOffset(0L)
                .build()

        val roundtrippedReferralList =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(referralList),
                jacksonTypeRef<ReferralList>(),
            )

        assertThat(roundtrippedReferralList).isEqualTo(referralList)
    }
}
