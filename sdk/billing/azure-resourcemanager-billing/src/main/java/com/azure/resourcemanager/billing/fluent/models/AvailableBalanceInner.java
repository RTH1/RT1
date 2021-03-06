// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.billing.models.Amount;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The latest Azure credit balance. This is the balance available for pay now. */
@Fluent
public final class AvailableBalanceInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AvailableBalanceInner.class);

    /*
     * The properties of available balance.
     */
    @JsonProperty(value = "properties")
    private AvailableBalanceProperties innerProperties;

    /**
     * Get the innerProperties property: The properties of available balance.
     *
     * @return the innerProperties value.
     */
    private AvailableBalanceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the amount property: Balance amount.
     *
     * @return the amount value.
     */
    public Amount amount() {
        return this.innerProperties() == null ? null : this.innerProperties().amount();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
