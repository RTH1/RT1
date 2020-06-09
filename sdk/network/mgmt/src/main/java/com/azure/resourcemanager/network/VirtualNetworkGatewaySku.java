// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VirtualNetworkGatewaySku model. */
@Fluent
public final class VirtualNetworkGatewaySku {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualNetworkGatewaySku.class);

    /*
     * Gateway SKU name.
     */
    @JsonProperty(value = "name")
    private VirtualNetworkGatewaySkuName name;

    /*
     * Gateway SKU tier.
     */
    @JsonProperty(value = "tier")
    private VirtualNetworkGatewaySkuTier tier;

    /*
     * The capacity.
     */
    @JsonProperty(value = "capacity")
    private Integer capacity;

    /**
     * Get the name property: Gateway SKU name.
     *
     * @return the name value.
     */
    public VirtualNetworkGatewaySkuName name() {
        return this.name;
    }

    /**
     * Set the name property: Gateway SKU name.
     *
     * @param name the name value to set.
     * @return the VirtualNetworkGatewaySku object itself.
     */
    public VirtualNetworkGatewaySku withName(VirtualNetworkGatewaySkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: Gateway SKU tier.
     *
     * @return the tier value.
     */
    public VirtualNetworkGatewaySkuTier tier() {
        return this.tier;
    }

    /**
     * Set the tier property: Gateway SKU tier.
     *
     * @param tier the tier value to set.
     * @return the VirtualNetworkGatewaySku object itself.
     */
    public VirtualNetworkGatewaySku withTier(VirtualNetworkGatewaySkuTier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the capacity property: The capacity.
     *
     * @return the capacity value.
     */
    public Integer capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: The capacity.
     *
     * @param capacity the capacity value to set.
     * @return the VirtualNetworkGatewaySku object itself.
     */
    public VirtualNetworkGatewaySku withCapacity(Integer capacity) {
        this.capacity = capacity;
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
