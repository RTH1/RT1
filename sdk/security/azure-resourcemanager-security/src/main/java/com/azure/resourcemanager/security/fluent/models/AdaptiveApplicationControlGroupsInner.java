// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Represents a list of machine groups and set of rules that are recommended by Azure Security Center to be allowed. */
@Fluent
public final class AdaptiveApplicationControlGroupsInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AdaptiveApplicationControlGroupsInner.class);

    /*
     * The value property.
     */
    @JsonProperty(value = "value")
    private List<AdaptiveApplicationControlGroupInner> value;

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public List<AdaptiveApplicationControlGroupInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the AdaptiveApplicationControlGroupsInner object itself.
     */
    public AdaptiveApplicationControlGroupsInner withValue(List<AdaptiveApplicationControlGroupInner> value) {
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
