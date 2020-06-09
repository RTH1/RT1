// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ProxyOnlyResource model. */
@Fluent
public class ProxyOnlyResource extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProxyOnlyResource.class);

    /*
     * Kind of resource.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * Get the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Kind of resource.
     *
     * @param kind the kind value to set.
     * @return the ProxyOnlyResource object itself.
     */
    public ProxyOnlyResource withKind(String kind) {
        this.kind = kind;
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
