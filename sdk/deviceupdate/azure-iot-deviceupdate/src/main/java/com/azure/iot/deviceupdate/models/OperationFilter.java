// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Operation status filter. */
@Fluent
public final class OperationFilter {
    /*
     * Operation status filter.
     */
    @JsonProperty(value = "status")
    private OperationFilterStatus status;

    /**
     * Get the status property: Operation status filter.
     *
     * @return the status value.
     */
    public OperationFilterStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Operation status filter.
     *
     * @param status the status value to set.
     * @return the OperationFilter object itself.
     */
    public OperationFilter setStatus(OperationFilterStatus status) {
        this.status = status;
        return this;
    }
}