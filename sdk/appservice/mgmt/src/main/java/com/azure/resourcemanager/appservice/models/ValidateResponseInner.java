// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.ValidateResponseError;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ValidateResponse model. */
@Fluent
public final class ValidateResponseInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ValidateResponseInner.class);

    /*
     * Result of validation.
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * Error details for the case when validation fails.
     */
    @JsonProperty(value = "error")
    private ValidateResponseError error;

    /**
     * Get the status property: Result of validation.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: Result of validation.
     *
     * @param status the status value to set.
     * @return the ValidateResponseInner object itself.
     */
    public ValidateResponseInner withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the error property: Error details for the case when validation fails.
     *
     * @return the error value.
     */
    public ValidateResponseError error() {
        return this.error;
    }

    /**
     * Set the error property: Error details for the case when validation fails.
     *
     * @param error the error value to set.
     * @return the ValidateResponseInner object itself.
     */
    public ValidateResponseInner withError(ValidateResponseError error) {
        this.error = error;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (error() != null) {
            error().validate();
        }
    }
}
