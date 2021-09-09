// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Recipient Email Contract Properties. */
@Fluent
public final class RecipientEmailContractProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RecipientEmailContractProperties.class);

    /*
     * User Email subscribed to notification.
     */
    @JsonProperty(value = "email")
    private String email;

    /**
     * Get the email property: User Email subscribed to notification.
     *
     * @return the email value.
     */
    public String email() {
        return this.email;
    }

    /**
     * Set the email property: User Email subscribed to notification.
     *
     * @param email the email value to set.
     * @return the RecipientEmailContractProperties object itself.
     */
    public RecipientEmailContractProperties withEmail(String email) {
        this.email = email;
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
