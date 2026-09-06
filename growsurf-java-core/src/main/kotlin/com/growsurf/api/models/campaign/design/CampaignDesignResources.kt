// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign.design

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonAutoDetect
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue as JsonValueAnnotation
import com.growsurf.api.core.ExcludeMissing
import com.growsurf.api.core.JsonField
import com.growsurf.api.core.JsonMissing
import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.toImmutable
import java.util.Optional

/** How the participant Resources destination icon is rendered. */
enum class CampaignDesignResourcesIconType(@get:JsonValueAnnotation val value: String) {
    DEFAULT("DEFAULT"),
    IMAGE("IMAGE"),
    NONE("NONE"),
}

/** Icon configuration for the participant Resources destination. */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class CampaignDesignResourcesIcon
constructor(
    @JsonProperty("type") private val type: CampaignDesignResourcesIconType? = null,
    @JsonProperty("imageUrl")
    @ExcludeMissing
    private val imageUrl: JsonField<String> = JsonMissing.of(),
    @field:JsonAnySetter
    private val additionalProperties: MutableMap<String, JsonValue> = mutableMapOf(),
) {
    // Validate known values without conflating an omitted field with an explicit clear.
    init {
        imageUrl.getOptional("imageUrl")
    }

    @JsonCreator
    constructor(
        @JsonProperty("type") type: CampaignDesignResourcesIconType? = null,
        @JsonProperty("imageUrl") @ExcludeMissing imageUrl: JsonField<String> = JsonMissing.of(),
    ) : this(type, imageUrl, mutableMapOf())

    /** Returns additional fields supplied by the API. */
    @JsonAnyGetter
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties.toImmutable()

    fun type(): Optional<CampaignDesignResourcesIconType> = Optional.ofNullable(type)

    /** LIST-mode icon image URL when [type] is `IMAGE`. Maximum 500 characters. */
    fun imageUrl(): Optional<String> = imageUrl.getOptional("imageUrl")
}

/**
 * Participant presentation settings for Resources. Resource items and their order use the Program
 * Resources service.
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class CampaignDesignResources
constructor(
    @JsonProperty("isPublicDisplayed") private val isPublicDisplayed: Boolean? = null,
    @JsonProperty("title") @ExcludeMissing private val title: JsonField<String> = JsonMissing.of(),
    @JsonProperty("viewResourcesLinkText")
    @ExcludeMissing
    private val viewResourcesLinkText: JsonField<String> = JsonMissing.of(),
    @JsonProperty("backLinkText")
    @ExcludeMissing
    private val backLinkText: JsonField<String> = JsonMissing.of(),
    @JsonProperty("copyButtonText")
    @ExcludeMissing
    private val copyButtonText: JsonField<String> = JsonMissing.of(),
    @JsonProperty("copiedText")
    @ExcludeMissing
    private val copiedText: JsonField<String> = JsonMissing.of(),
    @JsonProperty("emptyState")
    @ExcludeMissing
    private val emptyState: JsonField<String> = JsonMissing.of(),
    @JsonProperty("icon") private val icon: CampaignDesignResourcesIcon? = null,
    @field:JsonAnySetter
    private val additionalProperties: MutableMap<String, JsonValue> = mutableMapOf(),
) {
    // Validate known values without conflating an omitted field with an explicit clear.
    init {
        title.getOptional("title")
        viewResourcesLinkText.getOptional("viewResourcesLinkText")
        backLinkText.getOptional("backLinkText")
        copyButtonText.getOptional("copyButtonText")
        copiedText.getOptional("copiedText")
        emptyState.getOptional("emptyState")
    }

    @JsonCreator
    constructor(
        @JsonProperty("isPublicDisplayed") isPublicDisplayed: Boolean? = null,
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        @JsonProperty("viewResourcesLinkText")
        @ExcludeMissing
        viewResourcesLinkText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("backLinkText")
        @ExcludeMissing
        backLinkText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("copyButtonText")
        @ExcludeMissing
        copyButtonText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("copiedText")
        @ExcludeMissing
        copiedText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("emptyState")
        @ExcludeMissing
        emptyState: JsonField<String> = JsonMissing.of(),
        @JsonProperty("icon") icon: CampaignDesignResourcesIcon? = null,
    ) : this(
        isPublicDisplayed,
        title,
        viewResourcesLinkText,
        backLinkText,
        copyButtonText,
        copiedText,
        emptyState,
        icon,
        mutableMapOf(),
    )

    /** Returns additional fields supplied by the API. */
    @JsonAnyGetter
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties.toImmutable()

    /** Enables the destination. It stays hidden until one valid resource is published. */
    fun isPublicDisplayed(): Optional<Boolean> = Optional.ofNullable(isPublicDisplayed)

    /** Participant-visible section title. Maximum 100 characters. */
    fun title(): Optional<String> = title.getOptional("title")

    /** LIST-mode row text. Maximum 100 characters. */
    fun viewResourcesLinkText(): Optional<String> =
        viewResourcesLinkText.getOptional("viewResourcesLinkText")

    /** LIST-mode detail Back text. Maximum 100 characters. */
    fun backLinkText(): Optional<String> = backLinkText.getOptional("backLinkText")

    /** TEXT resource copy action. Maximum 100 characters. */
    fun copyButtonText(): Optional<String> = copyButtonText.getOptional("copyButtonText")

    /** TEXT resource copy confirmation. Maximum 100 characters. */
    fun copiedText(): Optional<String> = copiedText.getOptional("copiedText")

    /** Shown in place of the list when no resources are published. Maximum 500 characters. */
    fun emptyState(): Optional<String> = emptyState.getOptional("emptyState")

    fun icon(): Optional<CampaignDesignResourcesIcon> = Optional.ofNullable(icon)
}
