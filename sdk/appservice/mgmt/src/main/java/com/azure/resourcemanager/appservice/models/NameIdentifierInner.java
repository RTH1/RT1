// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The NameIdentifier model. */
@Fluent
public final class NameIdentifierInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NameIdentifierInner.class);

    /*
     * Name of the object.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the name property: Name of the object.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the object.
     *
     * @param name the name value to set.
     * @return the NameIdentifierInner object itself.
     */
    public NameIdentifierInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
