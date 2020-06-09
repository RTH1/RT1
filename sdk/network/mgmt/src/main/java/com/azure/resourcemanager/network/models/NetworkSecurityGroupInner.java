// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The NetworkSecurityGroup model. */
@JsonFlatten
@Fluent
public class NetworkSecurityGroupInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkSecurityGroupInner.class);

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * A collection of security rules of the network security group.
     */
    @JsonProperty(value = "properties.securityRules")
    private List<SecurityRuleInner> securityRules;

    /*
     * The default security rules of network security group.
     */
    @JsonProperty(value = "properties.defaultSecurityRules")
    private List<SecurityRuleInner> defaultSecurityRules;

    /*
     * A collection of references to network interfaces.
     */
    @JsonProperty(value = "properties.networkInterfaces", access = JsonProperty.Access.WRITE_ONLY)
    private List<NetworkInterfaceInner> networkInterfaces;

    /*
     * A collection of references to subnets.
     */
    @JsonProperty(value = "properties.subnets", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubnetInner> subnets;

    /*
     * The resource GUID property of the network security group resource.
     */
    @JsonProperty(value = "properties.resourceGuid")
    private String resourceGuid;

    /*
     * The provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set.
     * @return the NetworkSecurityGroupInner object itself.
     */
    public NetworkSecurityGroupInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the securityRules property: A collection of security rules of the network security group.
     *
     * @return the securityRules value.
     */
    public List<SecurityRuleInner> securityRules() {
        return this.securityRules;
    }

    /**
     * Set the securityRules property: A collection of security rules of the network security group.
     *
     * @param securityRules the securityRules value to set.
     * @return the NetworkSecurityGroupInner object itself.
     */
    public NetworkSecurityGroupInner withSecurityRules(List<SecurityRuleInner> securityRules) {
        this.securityRules = securityRules;
        return this;
    }

    /**
     * Get the defaultSecurityRules property: The default security rules of network security group.
     *
     * @return the defaultSecurityRules value.
     */
    public List<SecurityRuleInner> defaultSecurityRules() {
        return this.defaultSecurityRules;
    }

    /**
     * Set the defaultSecurityRules property: The default security rules of network security group.
     *
     * @param defaultSecurityRules the defaultSecurityRules value to set.
     * @return the NetworkSecurityGroupInner object itself.
     */
    public NetworkSecurityGroupInner withDefaultSecurityRules(List<SecurityRuleInner> defaultSecurityRules) {
        this.defaultSecurityRules = defaultSecurityRules;
        return this;
    }

    /**
     * Get the networkInterfaces property: A collection of references to network interfaces.
     *
     * @return the networkInterfaces value.
     */
    public List<NetworkInterfaceInner> networkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * Get the subnets property: A collection of references to subnets.
     *
     * @return the subnets value.
     */
    public List<SubnetInner> subnets() {
        return this.subnets;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the network security group resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Set the resourceGuid property: The resource GUID property of the network security group resource.
     *
     * @param resourceGuid the resourceGuid value to set.
     * @return the NetworkSecurityGroupInner object itself.
     */
    public NetworkSecurityGroupInner withResourceGuid(String resourceGuid) {
        this.resourceGuid = resourceGuid;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the NetworkSecurityGroupInner object itself.
     */
    public NetworkSecurityGroupInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the NetworkSecurityGroupInner object itself.
     */
    public NetworkSecurityGroupInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (securityRules() != null) {
            securityRules().forEach(e -> e.validate());
        }
        if (defaultSecurityRules() != null) {
            defaultSecurityRules().forEach(e -> e.validate());
        }
        if (networkInterfaces() != null) {
            networkInterfaces().forEach(e -> e.validate());
        }
        if (subnets() != null) {
            subnets().forEach(e -> e.validate());
        }
    }
}
