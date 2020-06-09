// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ConnectivityDestination model. */
@Fluent
public final class ConnectivityDestination {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectivityDestination.class);

    /*
     * The ID of the resource to which a connection attempt will be made.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * The IP address or URI the resource to which a connection attempt will be
     * made.
     */
    @JsonProperty(value = "address")
    private String address;

    /*
     * Port on which check connectivity will be performed.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /**
     * Get the resourceId property: The ID of the resource to which a connection attempt will be made.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The ID of the resource to which a connection attempt will be made.
     *
     * @param resourceId the resourceId value to set.
     * @return the ConnectivityDestination object itself.
     */
    public ConnectivityDestination withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the address property: The IP address or URI the resource to which a connection attempt will be made.
     *
     * @return the address value.
     */
    public String address() {
        return this.address;
    }

    /**
     * Set the address property: The IP address or URI the resource to which a connection attempt will be made.
     *
     * @param address the address value to set.
     * @return the ConnectivityDestination object itself.
     */
    public ConnectivityDestination withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Get the port property: Port on which check connectivity will be performed.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: Port on which check connectivity will be performed.
     *
     * @param port the port value to set.
     * @return the ConnectivityDestination object itself.
     */
    public ConnectivityDestination withPort(Integer port) {
        this.port = port;
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
