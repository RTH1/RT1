// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DdosSettings model. */
@Fluent
public final class DdosSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DdosSettings.class);

    /*
     * The DDoS custom policy associated with the public IP.
     */
    @JsonProperty(value = "ddosCustomPolicy")
    private SubResource ddosCustomPolicy;

    /*
     * The DDoS protection policy customizability of the public IP. Only
     * standard coverage will have the ability to be customized.
     */
    @JsonProperty(value = "protectionCoverage")
    private DdosSettingsProtectionCoverage protectionCoverage;

    /**
     * Get the ddosCustomPolicy property: The DDoS custom policy associated with the public IP.
     *
     * @return the ddosCustomPolicy value.
     */
    public SubResource ddosCustomPolicy() {
        return this.ddosCustomPolicy;
    }

    /**
     * Set the ddosCustomPolicy property: The DDoS custom policy associated with the public IP.
     *
     * @param ddosCustomPolicy the ddosCustomPolicy value to set.
     * @return the DdosSettings object itself.
     */
    public DdosSettings withDdosCustomPolicy(SubResource ddosCustomPolicy) {
        this.ddosCustomPolicy = ddosCustomPolicy;
        return this;
    }

    /**
     * Get the protectionCoverage property: The DDoS protection policy customizability of the public IP. Only standard
     * coverage will have the ability to be customized.
     *
     * @return the protectionCoverage value.
     */
    public DdosSettingsProtectionCoverage protectionCoverage() {
        return this.protectionCoverage;
    }

    /**
     * Set the protectionCoverage property: The DDoS protection policy customizability of the public IP. Only standard
     * coverage will have the ability to be customized.
     *
     * @param protectionCoverage the protectionCoverage value to set.
     * @return the DdosSettings object itself.
     */
    public DdosSettings withProtectionCoverage(DdosSettingsProtectionCoverage protectionCoverage) {
        this.protectionCoverage = protectionCoverage;
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
