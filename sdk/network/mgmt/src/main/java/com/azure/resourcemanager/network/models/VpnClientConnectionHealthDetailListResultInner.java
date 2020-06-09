// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.VpnClientConnectionHealthDetail;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The VpnClientConnectionHealthDetailListResult model. */
@Fluent
public final class VpnClientConnectionHealthDetailListResultInner {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(VpnClientConnectionHealthDetailListResultInner.class);

    /*
     * List of vpn client connection health.
     */
    @JsonProperty(value = "value")
    private List<VpnClientConnectionHealthDetail> value;

    /**
     * Get the value property: List of vpn client connection health.
     *
     * @return the value value.
     */
    public List<VpnClientConnectionHealthDetail> value() {
        return this.value;
    }

    /**
     * Set the value property: List of vpn client connection health.
     *
     * @param value the value value to set.
     * @return the VpnClientConnectionHealthDetailListResultInner object itself.
     */
    public VpnClientConnectionHealthDetailListResultInner withValue(List<VpnClientConnectionHealthDetail> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
