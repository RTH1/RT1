// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.AzureFirewallNetworkRule;
import com.azure.resourcemanager.network.models.AzureFirewallRCAction;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of the network rule collection. */
@Fluent
public final class AzureFirewallNetworkRuleCollectionPropertiesFormat {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(AzureFirewallNetworkRuleCollectionPropertiesFormat.class);

    /*
     * Priority of the network rule collection resource.
     */
    @JsonProperty(value = "priority")
    private Integer priority;

    /*
     * The action type of a rule collection.
     */
    @JsonProperty(value = "action")
    private AzureFirewallRCAction action;

    /*
     * Collection of rules used by a network rule collection.
     */
    @JsonProperty(value = "rules")
    private List<AzureFirewallNetworkRule> rules;

    /*
     * The provisioning state of the network rule collection resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the priority property: Priority of the network rule collection resource.
     *
     * @return the priority value.
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority property: Priority of the network rule collection resource.
     *
     * @param priority the priority value to set.
     * @return the AzureFirewallNetworkRuleCollectionPropertiesFormat object itself.
     */
    public AzureFirewallNetworkRuleCollectionPropertiesFormat withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the action property: The action type of a rule collection.
     *
     * @return the action value.
     */
    public AzureFirewallRCAction action() {
        return this.action;
    }

    /**
     * Set the action property: The action type of a rule collection.
     *
     * @param action the action value to set.
     * @return the AzureFirewallNetworkRuleCollectionPropertiesFormat object itself.
     */
    public AzureFirewallNetworkRuleCollectionPropertiesFormat withAction(AzureFirewallRCAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get the rules property: Collection of rules used by a network rule collection.
     *
     * @return the rules value.
     */
    public List<AzureFirewallNetworkRule> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: Collection of rules used by a network rule collection.
     *
     * @param rules the rules value to set.
     * @return the AzureFirewallNetworkRuleCollectionPropertiesFormat object itself.
     */
    public AzureFirewallNetworkRuleCollectionPropertiesFormat withRules(List<AzureFirewallNetworkRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the network rule collection resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (action() != null) {
            action().validate();
        }
        if (rules() != null) {
            rules().forEach(e -> e.validate());
        }
    }
}
