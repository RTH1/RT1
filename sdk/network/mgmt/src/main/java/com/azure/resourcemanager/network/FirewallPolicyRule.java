// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The FirewallPolicyRule model. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "ruleType",
    defaultImpl = FirewallPolicyRule.class)
@JsonTypeName("FirewallPolicyRule")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "FirewallPolicyNatRule", value = FirewallPolicyNatRule.class),
    @JsonSubTypes.Type(name = "FirewallPolicyFilterRule", value = FirewallPolicyFilterRule.class)
})
@Fluent
public class FirewallPolicyRule {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FirewallPolicyRule.class);

    /*
     * Name of the Rule
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Priority of the Firewall Policy Rule resource.
     */
    @JsonProperty(value = "priority")
    private Integer priority;

    /**
     * Get the name property: Name of the Rule.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the Rule.
     *
     * @param name the name value to set.
     * @return the FirewallPolicyRule object itself.
     */
    public FirewallPolicyRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the priority property: Priority of the Firewall Policy Rule resource.
     *
     * @return the priority value.
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority property: Priority of the Firewall Policy Rule resource.
     *
     * @param priority the priority value to set.
     * @return the FirewallPolicyRule object itself.
     */
    public FirewallPolicyRule withPriority(Integer priority) {
        this.priority = priority;
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
