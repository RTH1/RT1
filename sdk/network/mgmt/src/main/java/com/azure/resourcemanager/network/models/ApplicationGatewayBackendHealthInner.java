// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.ApplicationGatewayBackendHealthPool;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ApplicationGatewayBackendHealth model. */
@Fluent
public final class ApplicationGatewayBackendHealthInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewayBackendHealthInner.class);

    /*
     * A list of ApplicationGatewayBackendHealthPool resources.
     */
    @JsonProperty(value = "backendAddressPools")
    private List<ApplicationGatewayBackendHealthPool> backendAddressPools;

    /**
     * Get the backendAddressPools property: A list of ApplicationGatewayBackendHealthPool resources.
     *
     * @return the backendAddressPools value.
     */
    public List<ApplicationGatewayBackendHealthPool> backendAddressPools() {
        return this.backendAddressPools;
    }

    /**
     * Set the backendAddressPools property: A list of ApplicationGatewayBackendHealthPool resources.
     *
     * @param backendAddressPools the backendAddressPools value to set.
     * @return the ApplicationGatewayBackendHealthInner object itself.
     */
    public ApplicationGatewayBackendHealthInner withBackendAddressPools(
        List<ApplicationGatewayBackendHealthPool> backendAddressPools) {
        this.backendAddressPools = backendAddressPools;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (backendAddressPools() != null) {
            backendAddressPools().forEach(e -> e.validate());
        }
    }
}
