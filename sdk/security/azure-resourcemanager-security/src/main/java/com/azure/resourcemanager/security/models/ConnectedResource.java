// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes properties of a connected resource. */
@Immutable
public final class ConnectedResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectedResource.class);

    /*
     * The Azure resource id of the connected resource
     */
    @JsonProperty(value = "connectedResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String connectedResourceId;

    /*
     * The allowed tcp ports
     */
    @JsonProperty(value = "tcpPorts", access = JsonProperty.Access.WRITE_ONLY)
    private String tcpPorts;

    /*
     * The allowed udp ports
     */
    @JsonProperty(value = "udpPorts", access = JsonProperty.Access.WRITE_ONLY)
    private String udpPorts;

    /**
     * Get the connectedResourceId property: The Azure resource id of the connected resource.
     *
     * @return the connectedResourceId value.
     */
    public String connectedResourceId() {
        return this.connectedResourceId;
    }

    /**
     * Get the tcpPorts property: The allowed tcp ports.
     *
     * @return the tcpPorts value.
     */
    public String tcpPorts() {
        return this.tcpPorts;
    }

    /**
     * Get the udpPorts property: The allowed udp ports.
     *
     * @return the udpPorts value.
     */
    public String udpPorts() {
        return this.udpPorts;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
