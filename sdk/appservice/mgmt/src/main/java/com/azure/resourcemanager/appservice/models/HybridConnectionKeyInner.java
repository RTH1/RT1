// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The HybridConnectionKey model. */
@JsonFlatten
@Immutable
public class HybridConnectionKeyInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HybridConnectionKeyInner.class);

    /*
     * The name of the send key.
     */
    @JsonProperty(value = "properties.sendKeyName", access = JsonProperty.Access.WRITE_ONLY)
    private String sendKeyName;

    /*
     * The value of the send key.
     */
    @JsonProperty(value = "properties.sendKeyValue", access = JsonProperty.Access.WRITE_ONLY)
    private String sendKeyValue;

    /**
     * Get the sendKeyName property: The name of the send key.
     *
     * @return the sendKeyName value.
     */
    public String sendKeyName() {
        return this.sendKeyName;
    }

    /**
     * Get the sendKeyValue property: The value of the send key.
     *
     * @return the sendKeyValue value.
     */
    public String sendKeyValue() {
        return this.sendKeyValue;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
