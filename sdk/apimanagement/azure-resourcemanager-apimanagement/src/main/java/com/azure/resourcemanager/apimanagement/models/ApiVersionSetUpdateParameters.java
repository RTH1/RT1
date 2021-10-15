// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.models.ApiVersionSetUpdateParametersProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters to update or create an Api Version Set Contract. */
@Fluent
public final class ApiVersionSetUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApiVersionSetUpdateParameters.class);

    /*
     * Parameters to update or create an Api Version Set Contract.
     */
    @JsonProperty(value = "properties")
    private ApiVersionSetUpdateParametersProperties innerProperties;

    /**
     * Get the innerProperties property: Parameters to update or create an Api Version Set Contract.
     *
     * @return the innerProperties value.
     */
    private ApiVersionSetUpdateParametersProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the displayName property: Name of API Version Set.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: Name of API Version Set.
     *
     * @param displayName the displayName value to set.
     * @return the ApiVersionSetUpdateParameters object itself.
     */
    public ApiVersionSetUpdateParameters withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiVersionSetUpdateParametersProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the versioningScheme property: An value that determines where the API Version identifier will be located in a
     * HTTP request.
     *
     * @return the versioningScheme value.
     */
    public VersioningScheme versioningScheme() {
        return this.innerProperties() == null ? null : this.innerProperties().versioningScheme();
    }

    /**
     * Set the versioningScheme property: An value that determines where the API Version identifier will be located in a
     * HTTP request.
     *
     * @param versioningScheme the versioningScheme value to set.
     * @return the ApiVersionSetUpdateParameters object itself.
     */
    public ApiVersionSetUpdateParameters withVersioningScheme(VersioningScheme versioningScheme) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiVersionSetUpdateParametersProperties();
        }
        this.innerProperties().withVersioningScheme(versioningScheme);
        return this;
    }

    /**
     * Get the description property: Description of API Version Set.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Description of API Version Set.
     *
     * @param description the description value to set.
     * @return the ApiVersionSetUpdateParameters object itself.
     */
    public ApiVersionSetUpdateParameters withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiVersionSetUpdateParametersProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the versionQueryName property: Name of query parameter that indicates the API Version if versioningScheme is
     * set to `query`.
     *
     * @return the versionQueryName value.
     */
    public String versionQueryName() {
        return this.innerProperties() == null ? null : this.innerProperties().versionQueryName();
    }

    /**
     * Set the versionQueryName property: Name of query parameter that indicates the API Version if versioningScheme is
     * set to `query`.
     *
     * @param versionQueryName the versionQueryName value to set.
     * @return the ApiVersionSetUpdateParameters object itself.
     */
    public ApiVersionSetUpdateParameters withVersionQueryName(String versionQueryName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiVersionSetUpdateParametersProperties();
        }
        this.innerProperties().withVersionQueryName(versionQueryName);
        return this;
    }

    /**
     * Get the versionHeaderName property: Name of HTTP header parameter that indicates the API Version if
     * versioningScheme is set to `header`.
     *
     * @return the versionHeaderName value.
     */
    public String versionHeaderName() {
        return this.innerProperties() == null ? null : this.innerProperties().versionHeaderName();
    }

    /**
     * Set the versionHeaderName property: Name of HTTP header parameter that indicates the API Version if
     * versioningScheme is set to `header`.
     *
     * @param versionHeaderName the versionHeaderName value to set.
     * @return the ApiVersionSetUpdateParameters object itself.
     */
    public ApiVersionSetUpdateParameters withVersionHeaderName(String versionHeaderName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiVersionSetUpdateParametersProperties();
        }
        this.innerProperties().withVersionHeaderName(versionHeaderName);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
