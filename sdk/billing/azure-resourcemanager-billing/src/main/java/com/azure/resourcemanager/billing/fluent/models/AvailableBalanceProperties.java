// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.billing.models.Amount;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of available balance. */
@Immutable
public final class AvailableBalanceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AvailableBalanceProperties.class);

    /*
     * Balance amount.
     */
    @JsonProperty(value = "amount", access = JsonProperty.Access.WRITE_ONLY)
    private Amount amount;

    /**
     * Get the amount property: Balance amount.
     *
     * @return the amount value.
     */
    public Amount amount() {
        return this.amount;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (amount() != null) {
            amount().validate();
        }
    }
}
