// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ConnectivityHop model. */
@Immutable
public final class ConnectivityHop {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectivityHop.class);

    /*
     * The type of the hop.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The ID of the hop.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The IP address of the hop.
     */
    @JsonProperty(value = "address", access = JsonProperty.Access.WRITE_ONLY)
    private String address;

    /*
     * The ID of the resource corresponding to this hop.
     */
    @JsonProperty(value = "resourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceId;

    /*
     * List of next hop identifiers.
     */
    @JsonProperty(value = "nextHopIds", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> nextHopIds;

    /*
     * List of issues.
     */
    @JsonProperty(value = "issues", access = JsonProperty.Access.WRITE_ONLY)
    private List<ConnectivityIssue> issues;

    /**
     * Get the type property: The type of the hop.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the id property: The ID of the hop.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the address property: The IP address of the hop.
     *
     * @return the address value.
     */
    public String address() {
        return this.address;
    }

    /**
     * Get the resourceId property: The ID of the resource corresponding to this hop.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Get the nextHopIds property: List of next hop identifiers.
     *
     * @return the nextHopIds value.
     */
    public List<String> nextHopIds() {
        return this.nextHopIds;
    }

    /**
     * Get the issues property: List of issues.
     *
     * @return the issues value.
     */
    public List<ConnectivityIssue> issues() {
        return this.issues;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (issues() != null) {
            issues().forEach(e -> e.validate());
        }
    }
}
