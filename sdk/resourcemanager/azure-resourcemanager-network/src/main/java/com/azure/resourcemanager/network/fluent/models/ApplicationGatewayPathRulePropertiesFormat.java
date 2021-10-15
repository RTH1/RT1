// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of path rule of an application gateway. */
@Fluent
public final class ApplicationGatewayPathRulePropertiesFormat {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewayPathRulePropertiesFormat.class);

    /*
     * Path rules of URL path map.
     */
    @JsonProperty(value = "paths")
    private List<String> paths;

    /*
     * Backend address pool resource of URL path map path rule.
     */
    @JsonProperty(value = "backendAddressPool")
    private SubResource backendAddressPool;

    /*
     * Backend http settings resource of URL path map path rule.
     */
    @JsonProperty(value = "backendHttpSettings")
    private SubResource backendHttpSettings;

    /*
     * Redirect configuration resource of URL path map path rule.
     */
    @JsonProperty(value = "redirectConfiguration")
    private SubResource redirectConfiguration;

    /*
     * Rewrite rule set resource of URL path map path rule.
     */
    @JsonProperty(value = "rewriteRuleSet")
    private SubResource rewriteRuleSet;

    /*
     * Load Distribution Policy resource of URL path map path rule.
     */
    @JsonProperty(value = "loadDistributionPolicy")
    private SubResource loadDistributionPolicy;

    /*
     * The provisioning state of the path rule resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Reference to the FirewallPolicy resource.
     */
    @JsonProperty(value = "firewallPolicy")
    private SubResource firewallPolicy;

    /**
     * Get the paths property: Path rules of URL path map.
     *
     * @return the paths value.
     */
    public List<String> paths() {
        return this.paths;
    }

    /**
     * Set the paths property: Path rules of URL path map.
     *
     * @param paths the paths value to set.
     * @return the ApplicationGatewayPathRulePropertiesFormat object itself.
     */
    public ApplicationGatewayPathRulePropertiesFormat withPaths(List<String> paths) {
        this.paths = paths;
        return this;
    }

    /**
     * Get the backendAddressPool property: Backend address pool resource of URL path map path rule.
     *
     * @return the backendAddressPool value.
     */
    public SubResource backendAddressPool() {
        return this.backendAddressPool;
    }

    /**
     * Set the backendAddressPool property: Backend address pool resource of URL path map path rule.
     *
     * @param backendAddressPool the backendAddressPool value to set.
     * @return the ApplicationGatewayPathRulePropertiesFormat object itself.
     */
    public ApplicationGatewayPathRulePropertiesFormat withBackendAddressPool(SubResource backendAddressPool) {
        this.backendAddressPool = backendAddressPool;
        return this;
    }

    /**
     * Get the backendHttpSettings property: Backend http settings resource of URL path map path rule.
     *
     * @return the backendHttpSettings value.
     */
    public SubResource backendHttpSettings() {
        return this.backendHttpSettings;
    }

    /**
     * Set the backendHttpSettings property: Backend http settings resource of URL path map path rule.
     *
     * @param backendHttpSettings the backendHttpSettings value to set.
     * @return the ApplicationGatewayPathRulePropertiesFormat object itself.
     */
    public ApplicationGatewayPathRulePropertiesFormat withBackendHttpSettings(SubResource backendHttpSettings) {
        this.backendHttpSettings = backendHttpSettings;
        return this;
    }

    /**
     * Get the redirectConfiguration property: Redirect configuration resource of URL path map path rule.
     *
     * @return the redirectConfiguration value.
     */
    public SubResource redirectConfiguration() {
        return this.redirectConfiguration;
    }

    /**
     * Set the redirectConfiguration property: Redirect configuration resource of URL path map path rule.
     *
     * @param redirectConfiguration the redirectConfiguration value to set.
     * @return the ApplicationGatewayPathRulePropertiesFormat object itself.
     */
    public ApplicationGatewayPathRulePropertiesFormat withRedirectConfiguration(SubResource redirectConfiguration) {
        this.redirectConfiguration = redirectConfiguration;
        return this;
    }

    /**
     * Get the rewriteRuleSet property: Rewrite rule set resource of URL path map path rule.
     *
     * @return the rewriteRuleSet value.
     */
    public SubResource rewriteRuleSet() {
        return this.rewriteRuleSet;
    }

    /**
     * Set the rewriteRuleSet property: Rewrite rule set resource of URL path map path rule.
     *
     * @param rewriteRuleSet the rewriteRuleSet value to set.
     * @return the ApplicationGatewayPathRulePropertiesFormat object itself.
     */
    public ApplicationGatewayPathRulePropertiesFormat withRewriteRuleSet(SubResource rewriteRuleSet) {
        this.rewriteRuleSet = rewriteRuleSet;
        return this;
    }

    /**
     * Get the loadDistributionPolicy property: Load Distribution Policy resource of URL path map path rule.
     *
     * @return the loadDistributionPolicy value.
     */
    public SubResource loadDistributionPolicy() {
        return this.loadDistributionPolicy;
    }

    /**
     * Set the loadDistributionPolicy property: Load Distribution Policy resource of URL path map path rule.
     *
     * @param loadDistributionPolicy the loadDistributionPolicy value to set.
     * @return the ApplicationGatewayPathRulePropertiesFormat object itself.
     */
    public ApplicationGatewayPathRulePropertiesFormat withLoadDistributionPolicy(SubResource loadDistributionPolicy) {
        this.loadDistributionPolicy = loadDistributionPolicy;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the path rule resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the firewallPolicy property: Reference to the FirewallPolicy resource.
     *
     * @return the firewallPolicy value.
     */
    public SubResource firewallPolicy() {
        return this.firewallPolicy;
    }

    /**
     * Set the firewallPolicy property: Reference to the FirewallPolicy resource.
     *
     * @param firewallPolicy the firewallPolicy value to set.
     * @return the ApplicationGatewayPathRulePropertiesFormat object itself.
     */
    public ApplicationGatewayPathRulePropertiesFormat withFirewallPolicy(SubResource firewallPolicy) {
        this.firewallPolicy = firewallPolicy;
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
