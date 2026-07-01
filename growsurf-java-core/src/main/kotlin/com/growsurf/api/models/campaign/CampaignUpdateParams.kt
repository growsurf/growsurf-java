// File generated from our OpenAPI spec by Stainless.

package com.growsurf.api.models.campaign

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.growsurf.api.core.Enum
import com.growsurf.api.core.ExcludeMissing
import com.growsurf.api.core.JsonField
import com.growsurf.api.core.JsonMissing
import com.growsurf.api.core.JsonValue
import com.growsurf.api.core.Params
import com.growsurf.api.core.http.Headers
import com.growsurf.api.core.http.QueryParams
import com.growsurf.api.core.toImmutable
import com.growsurf.api.errors.GrowsurfInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Updates a program's configuration and/or status. Only the fields you send are changed. `type` and
 * `urlId` are immutable. Status changes are validated against the allowed transitions; the program
 * cannot be deleted via this endpoint.
 */
class CampaignUpdateParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyName(): Optional<String> = body.companyName()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyLogoImageUrl(): Optional<String> = body.companyLogoImageUrl()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currencyIso(): Optional<String> = body.currencyIso()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun goal(): Optional<String> = body.goal()

    /**
     * The program status. Transitions are validated; DELETED is not allowed.
     *
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = body.status()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun design(): Optional<Design> = body.design()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun emails(): Optional<Emails> = body.emails()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun options(): Optional<Options> = body.options()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun notifications(): Optional<Notifications> = body.notifications()

    /**
     * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun installation(): Optional<Installation> = body.installation()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [companyName].
     *
     * Unlike [companyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _companyName(): JsonField<String> = body._companyName()

    /**
     * Returns the raw JSON value of [companyLogoImageUrl].
     *
     * Unlike [companyLogoImageUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _companyLogoImageUrl(): JsonField<String> = body._companyLogoImageUrl()

    /**
     * Returns the raw JSON value of [currencyIso].
     *
     * Unlike [currencyIso], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currencyIso(): JsonField<String> = body._currencyIso()

    /**
     * Returns the raw JSON value of [goal].
     *
     * Unlike [goal], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _goal(): JsonField<String> = body._goal()

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _status(): JsonField<Status> = body._status()

    /**
     * Returns the raw JSON value of [design].
     *
     * Unlike [design], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _design(): JsonField<Design> = body._design()

    /**
     * Returns the raw JSON value of [emails].
     *
     * Unlike [emails], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _emails(): JsonField<Emails> = body._emails()

    /**
     * Returns the raw JSON value of [options].
     *
     * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _options(): JsonField<Options> = body._options()

    /**
     * Returns the raw JSON value of [notifications].
     *
     * Unlike [notifications], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _notifications(): JsonField<Notifications> = body._notifications()

    /**
     * Returns the raw JSON value of [installation].
     *
     * Unlike [installation], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _installation(): JsonField<Installation> = body._installation()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CampaignUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CampaignUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CampaignUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(campaignUpdateParams: CampaignUpdateParams) = apply {
            id = campaignUpdateParams.id
            body = campaignUpdateParams.body.toBuilder()
            additionalHeaders = campaignUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = campaignUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [name]
         * - [companyName]
         * - [companyLogoImageUrl]
         * - [currencyIso]
         * - [goal]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun companyName(companyName: String) = apply { body.companyName(companyName) }

        /**
         * Sets [Builder.companyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun companyName(companyName: JsonField<String>) = apply { body.companyName(companyName) }

        fun companyLogoImageUrl(companyLogoImageUrl: String) = apply {
            body.companyLogoImageUrl(companyLogoImageUrl)
        }

        /**
         * Sets [Builder.companyLogoImageUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyLogoImageUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun companyLogoImageUrl(companyLogoImageUrl: JsonField<String>) = apply {
            body.companyLogoImageUrl(companyLogoImageUrl)
        }

        fun currencyIso(currencyIso: String) = apply { body.currencyIso(currencyIso) }

        /**
         * Sets [Builder.currencyIso] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyIso] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currencyIso(currencyIso: JsonField<String>) = apply { body.currencyIso(currencyIso) }

        fun goal(goal: String) = apply { body.goal(goal) }

        /**
         * Sets [Builder.goal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.goal] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun goal(goal: JsonField<String>) = apply { body.goal(goal) }

        /** The program status. Transitions are validated; DELETED is not allowed. */
        fun status(status: Status) = apply { body.status(status) }

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { body.status(status) }

        fun design(design: Design) = apply { body.design(design) }

        /**
         * Sets [Builder.design] to an arbitrary JSON value.
         *
         * You should usually call [Builder.design] with a well-typed [Design] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun design(design: JsonField<Design>) = apply { body.design(design) }

        fun emails(emails: Emails) = apply { body.emails(emails) }

        /**
         * Sets [Builder.emails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emails] with a well-typed [Emails] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun emails(emails: JsonField<Emails>) = apply { body.emails(emails) }

        fun options(options: Options) = apply { body.options(options) }

        /**
         * Sets [Builder.options] to an arbitrary JSON value.
         *
         * You should usually call [Builder.options] with a well-typed [Options] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun options(options: JsonField<Options>) = apply { body.options(options) }

        fun notifications(notifications: Notifications) = apply {
            body.notifications(notifications)
        }

        /**
         * Sets [Builder.notifications] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notifications] with a well-typed [Notifications] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun notifications(notifications: JsonField<Notifications>) = apply {
            body.notifications(notifications)
        }

        fun installation(installation: Installation) = apply { body.installation(installation) }

        /**
         * Sets [Builder.installation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.installation] with a well-typed [Installation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun installation(installation: JsonField<Installation>) = apply {
            body.installation(installation)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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

        /**
         * Returns an immutable instance of [CampaignUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CampaignUpdateParams =
            CampaignUpdateParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Request body for updating a program. Only the fields you send are changed. `type` and `urlId`
     * are immutable.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val companyName: JsonField<String>,
        private val companyLogoImageUrl: JsonField<String>,
        private val currencyIso: JsonField<String>,
        private val goal: JsonField<String>,
        private val status: JsonField<Status>,
        private val design: JsonField<Design>,
        private val emails: JsonField<Emails>,
        private val options: JsonField<Options>,
        private val notifications: JsonField<Notifications>,
        private val installation: JsonField<Installation>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("companyName")
            @ExcludeMissing
            companyName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("companyLogoImageUrl")
            @ExcludeMissing
            companyLogoImageUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currencyISO")
            @ExcludeMissing
            currencyIso: JsonField<String> = JsonMissing.of(),
            @JsonProperty("goal") @ExcludeMissing goal: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("design") @ExcludeMissing design: JsonField<Design> = JsonMissing.of(),
            @JsonProperty("emails") @ExcludeMissing emails: JsonField<Emails> = JsonMissing.of(),
            @JsonProperty("options") @ExcludeMissing options: JsonField<Options> = JsonMissing.of(),
            @JsonProperty("notifications")
            @ExcludeMissing
            notifications: JsonField<Notifications> = JsonMissing.of(),
            @JsonProperty("installation")
            @ExcludeMissing
            installation: JsonField<Installation> = JsonMissing.of(),
        ) : this(
            name,
            companyName,
            companyLogoImageUrl,
            currencyIso,
            goal,
            status,
            design,
            emails,
            options,
            notifications,
            installation,
            mutableMapOf(),
        )

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun companyName(): Optional<String> = companyName.getOptional("companyName")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun companyLogoImageUrl(): Optional<String> =
            companyLogoImageUrl.getOptional("companyLogoImageUrl")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun currencyIso(): Optional<String> = currencyIso.getOptional("currencyISO")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun goal(): Optional<String> = goal.getOptional("goal")

        /**
         * The program status. Transitions are validated; DELETED is not allowed.
         *
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun design(): Optional<Design> = design.getOptional("design")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun emails(): Optional<Emails> = emails.getOptional("emails")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun options(): Optional<Options> = options.getOptional("options")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun notifications(): Optional<Notifications> = notifications.getOptional("notifications")

        /**
         * @throws GrowsurfInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun installation(): Optional<Installation> = installation.getOptional("installation")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [companyName].
         *
         * Unlike [companyName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("companyName")
        @ExcludeMissing
        fun _companyName(): JsonField<String> = companyName

        /**
         * Returns the raw JSON value of [companyLogoImageUrl].
         *
         * Unlike [companyLogoImageUrl], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("companyLogoImageUrl")
        @ExcludeMissing
        fun _companyLogoImageUrl(): JsonField<String> = companyLogoImageUrl

        /**
         * Returns the raw JSON value of [currencyIso].
         *
         * Unlike [currencyIso], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currencyISO")
        @ExcludeMissing
        fun _currencyIso(): JsonField<String> = currencyIso

        /**
         * Returns the raw JSON value of [goal].
         *
         * Unlike [goal], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("goal") @ExcludeMissing fun _goal(): JsonField<String> = goal

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [design].
         *
         * Unlike [design], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("design") @ExcludeMissing fun _design(): JsonField<Design> = design

        /**
         * Returns the raw JSON value of [emails].
         *
         * Unlike [emails], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("emails") @ExcludeMissing fun _emails(): JsonField<Emails> = emails

        /**
         * Returns the raw JSON value of [options].
         *
         * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("options") @ExcludeMissing fun _options(): JsonField<Options> = options

        /**
         * Returns the raw JSON value of [notifications].
         *
         * Unlike [notifications], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("notifications")
        @ExcludeMissing
        fun _notifications(): JsonField<Notifications> = notifications

        /**
         * Returns the raw JSON value of [installation].
         *
         * Unlike [installation], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("installation")
        @ExcludeMissing
        fun _installation(): JsonField<Installation> = installation

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String> = JsonMissing.of()
            private var companyName: JsonField<String> = JsonMissing.of()
            private var companyLogoImageUrl: JsonField<String> = JsonMissing.of()
            private var currencyIso: JsonField<String> = JsonMissing.of()
            private var goal: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var design: JsonField<Design> = JsonMissing.of()
            private var emails: JsonField<Emails> = JsonMissing.of()
            private var options: JsonField<Options> = JsonMissing.of()
            private var notifications: JsonField<Notifications> = JsonMissing.of()
            private var installation: JsonField<Installation> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                name = body.name
                companyName = body.companyName
                companyLogoImageUrl = body.companyLogoImageUrl
                currencyIso = body.currencyIso
                goal = body.goal
                status = body.status
                design = body.design
                emails = body.emails
                options = body.options
                notifications = body.notifications
                installation = body.installation
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun companyName(companyName: String) = companyName(JsonField.of(companyName))

            /**
             * Sets [Builder.companyName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.companyName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun companyName(companyName: JsonField<String>) = apply {
                this.companyName = companyName
            }

            fun companyLogoImageUrl(companyLogoImageUrl: String) =
                companyLogoImageUrl(JsonField.of(companyLogoImageUrl))

            /**
             * Sets [Builder.companyLogoImageUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.companyLogoImageUrl] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun companyLogoImageUrl(companyLogoImageUrl: JsonField<String>) = apply {
                this.companyLogoImageUrl = companyLogoImageUrl
            }

            fun currencyIso(currencyIso: String) = currencyIso(JsonField.of(currencyIso))

            /**
             * Sets [Builder.currencyIso] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currencyIso] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currencyIso(currencyIso: JsonField<String>) = apply {
                this.currencyIso = currencyIso
            }

            fun goal(goal: String) = goal(JsonField.of(goal))

            /**
             * Sets [Builder.goal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.goal] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun goal(goal: JsonField<String>) = apply { this.goal = goal }

            /** The program status. Transitions are validated; DELETED is not allowed. */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            fun design(design: Design) = design(JsonField.of(design))

            /**
             * Sets [Builder.design] to an arbitrary JSON value.
             *
             * You should usually call [Builder.design] with a well-typed [Design] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun design(design: JsonField<Design>) = apply { this.design = design }

            fun emails(emails: Emails) = emails(JsonField.of(emails))

            /**
             * Sets [Builder.emails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.emails] with a well-typed [Emails] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun emails(emails: JsonField<Emails>) = apply { this.emails = emails }

            fun options(options: Options) = options(JsonField.of(options))

            /**
             * Sets [Builder.options] to an arbitrary JSON value.
             *
             * You should usually call [Builder.options] with a well-typed [Options] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun options(options: JsonField<Options>) = apply { this.options = options }

            fun notifications(notifications: Notifications) =
                notifications(JsonField.of(notifications))

            /**
             * Sets [Builder.notifications] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notifications] with a well-typed [Notifications]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun notifications(notifications: JsonField<Notifications>) = apply {
                this.notifications = notifications
            }

            fun installation(installation: Installation) = installation(JsonField.of(installation))

            /**
             * Sets [Builder.installation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.installation] with a well-typed [Installation] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun installation(installation: JsonField<Installation>) = apply {
                this.installation = installation
            }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    name,
                    companyName,
                    companyLogoImageUrl,
                    currencyIso,
                    goal,
                    status,
                    design,
                    emails,
                    options,
                    notifications,
                    installation,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws GrowsurfInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            name()
            companyName()
            companyLogoImageUrl()
            currencyIso()
            goal()
            status().ifPresent { it.validate() }
            design().ifPresent { it.validate() }
            emails().ifPresent { it.validate() }
            options().ifPresent { it.validate() }
            notifications().ifPresent { it.validate() }
            installation().ifPresent { it.validate() }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (name.asKnown().isPresent) 1 else 0) +
                (if (companyName.asKnown().isPresent) 1 else 0) +
                (if (companyLogoImageUrl.asKnown().isPresent) 1 else 0) +
                (if (currencyIso.asKnown().isPresent) 1 else 0) +
                (if (goal.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (design.asKnown().getOrNull()?.validity() ?: 0) +
                (emails.asKnown().getOrNull()?.validity() ?: 0) +
                (options.asKnown().getOrNull()?.validity() ?: 0) +
                (notifications.asKnown().getOrNull()?.validity() ?: 0) +
                (installation.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                name == other.name &&
                companyName == other.companyName &&
                companyLogoImageUrl == other.companyLogoImageUrl &&
                currencyIso == other.currencyIso &&
                goal == other.goal &&
                status == other.status &&
                design == other.design &&
                emails == other.emails &&
                options == other.options &&
                notifications == other.notifications &&
                installation == other.installation &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                name,
                companyName,
                companyLogoImageUrl,
                currencyIso,
                goal,
                status,
                design,
                emails,
                options,
                notifications,
                installation,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, companyName=$companyName, companyLogoImageUrl=$companyLogoImageUrl, currencyIso=$currencyIso, goal=$goal, status=$status, design=$design, emails=$emails, options=$options, notifications=$notifications, installation=$installation, additionalProperties=$additionalProperties}"
    }

    /** The program status. Transitions are validated; DELETED is not allowed. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val DRAFT = of("DRAFT")

            @JvmField val PENDING = of("PENDING")

            @JvmField val IN_PROGRESS = of("IN_PROGRESS")

            @JvmField val COMPLETE = of("COMPLETE")

            @JvmField val CANCELLED = of("CANCELLED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            DRAFT,
            PENDING,
            IN_PROGRESS,
            COMPLETE,
            CANCELLED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DRAFT,
            PENDING,
            IN_PROGRESS,
            COMPLETE,
            CANCELLED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                DRAFT -> Value.DRAFT
                PENDING -> Value.PENDING
                IN_PROGRESS -> Value.IN_PROGRESS
                COMPLETE -> Value.COMPLETE
                CANCELLED -> Value.CANCELLED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws GrowsurfInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                DRAFT -> Known.DRAFT
                PENDING -> Known.PENDING
                IN_PROGRESS -> Known.IN_PROGRESS
                COMPLETE -> Known.COMPLETE
                CANCELLED -> Known.CANCELLED
                else -> throw GrowsurfInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws GrowsurfInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                GrowsurfInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws GrowsurfInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Status = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Design
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Design]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Design]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(design: Design) = apply {
                additionalProperties = design.additionalProperties.toMutableMap()
            }

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
             * Returns an immutable instance of [Design].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Design = Design(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws GrowsurfInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Design = apply {
            if (validated) {
                return@apply
            }

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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Design && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Design{additionalProperties=$additionalProperties}"
    }

    class Emails
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Emails]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Emails]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(emails: Emails) = apply {
                additionalProperties = emails.additionalProperties.toMutableMap()
            }

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
             * Returns an immutable instance of [Emails].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Emails = Emails(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws GrowsurfInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Emails = apply {
            if (validated) {
                return@apply
            }

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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Emails && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Emails{additionalProperties=$additionalProperties}"
    }

    class Options
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Options]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Options]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(options: Options) = apply {
                additionalProperties = options.additionalProperties.toMutableMap()
            }

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
             * Returns an immutable instance of [Options].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Options = Options(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws GrowsurfInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Options = apply {
            if (validated) {
                return@apply
            }

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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Options && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Options{additionalProperties=$additionalProperties}"
    }

    class Notifications
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Notifications]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Notifications]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(notifications: Notifications) = apply {
                additionalProperties = notifications.additionalProperties.toMutableMap()
            }

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
             * Returns an immutable instance of [Notifications].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Notifications = Notifications(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws GrowsurfInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Notifications = apply {
            if (validated) {
                return@apply
            }

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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Notifications && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Notifications{additionalProperties=$additionalProperties}"
    }

    class Installation
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Installation]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Installation]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(installation: Installation) = apply {
                additionalProperties = installation.additionalProperties.toMutableMap()
            }

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
             * Returns an immutable instance of [Installation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Installation = Installation(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws GrowsurfInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Installation = apply {
            if (validated) {
                return@apply
            }

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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Installation && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Installation{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CampaignUpdateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CampaignUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
