// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ResourceSet model. */
@Fluent
public class ResourceSet {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceSet.class);

    /*
     * The list of subscriptions.
     */
    @JsonProperty(value = "subscriptions")
    private List<String> subscriptions;

    /**
     * Get the subscriptions property: The list of subscriptions.
     *
     * @return the subscriptions value.
     */
    public List<String> subscriptions() {
        return this.subscriptions;
    }

    /**
     * Set the subscriptions property: The list of subscriptions.
     *
     * @param subscriptions the subscriptions value to set.
     * @return the ResourceSet object itself.
     */
    public ResourceSet withSubscriptions(List<String> subscriptions) {
        this.subscriptions = subscriptions;
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
