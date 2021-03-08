// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DatadogApiKey model. */
@Fluent
public final class DatadogApiKeyInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatadogApiKeyInner.class);

    /*
     * The user that created the API key.
     */
    @JsonProperty(value = "createdBy")
    private String createdBy;

    /*
     * The name of the API key.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The value of the API key.
     */
    @JsonProperty(value = "key", required = true)
    private String key;

    /*
     * The time of creation of the API key.
     */
    @JsonProperty(value = "created")
    private String created;

    /**
     * Get the createdBy property: The user that created the API key.
     *
     * @return the createdBy value.
     */
    public String createdBy() {
        return this.createdBy;
    }

    /**
     * Set the createdBy property: The user that created the API key.
     *
     * @param createdBy the createdBy value to set.
     * @return the DatadogApiKeyInner object itself.
     */
    public DatadogApiKeyInner withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Get the name property: The name of the API key.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the API key.
     *
     * @param name the name value to set.
     * @return the DatadogApiKeyInner object itself.
     */
    public DatadogApiKeyInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the key property: The value of the API key.
     *
     * @return the key value.
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key property: The value of the API key.
     *
     * @param key the key value to set.
     * @return the DatadogApiKeyInner object itself.
     */
    public DatadogApiKeyInner withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the created property: The time of creation of the API key.
     *
     * @return the created value.
     */
    public String created() {
        return this.created;
    }

    /**
     * Set the created property: The time of creation of the API key.
     *
     * @param created the created value to set.
     * @return the DatadogApiKeyInner object itself.
     */
    public DatadogApiKeyInner withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (key() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property key in model DatadogApiKeyInner"));
        }
    }
}