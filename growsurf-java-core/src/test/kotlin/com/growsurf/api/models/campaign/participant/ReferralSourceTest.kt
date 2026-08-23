package com.growsurf.api.models.campaign.participant

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReferralSourceTest {

    @Test
    fun includesEveryRuntimeValue() {
        assertThat(ReferralSource.Known.values())
            .containsExactly(
                ReferralSource.Known.DIRECT,
                ReferralSource.Known.PARTICIPANT,
                ReferralSource.Known.DELETED_PARTICIPANT,
                ReferralSource.Known.IMPORT,
                ReferralSource.Known.MANUAL,
            )
    }
}
