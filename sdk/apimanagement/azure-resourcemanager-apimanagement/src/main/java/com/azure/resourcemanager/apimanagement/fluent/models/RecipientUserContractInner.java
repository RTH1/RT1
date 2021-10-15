// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Recipient User details. */
@Fluent
public final class RecipientUserContractInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RecipientUserContractInner.class);

    /*
     * Recipient User entity contract properties.
     */
    @JsonProperty(value = "properties")
    private RecipientUsersContractProperties innerProperties;

    /**
     * Get the innerProperties property: Recipient User entity contract properties.
     *
     * @return the innerProperties value.
     */
    private RecipientUsersContractProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the userId property: API Management UserId subscribed to notification.
     *
     * @return the userId value.
     */
    public String userId() {
        return this.innerProperties() == null ? null : this.innerProperties().userId();
    }

    /**
     * Set the userId property: API Management UserId subscribed to notification.
     *
     * @param userId the userId value to set.
     * @return the RecipientUserContractInner object itself.
     */
    public RecipientUserContractInner withUserId(String userId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecipientUsersContractProperties();
        }
        this.innerProperties().withUserId(userId);
        return this;
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
