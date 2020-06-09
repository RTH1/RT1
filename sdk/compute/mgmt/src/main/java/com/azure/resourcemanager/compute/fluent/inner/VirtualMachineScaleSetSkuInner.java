// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.inner;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.Sku;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetSkuCapacity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VirtualMachineScaleSetSku model. */
@Immutable
public final class VirtualMachineScaleSetSkuInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetSkuInner.class);

    /*
     * The type of resource the sku applies to.
     */
    @JsonProperty(value = "resourceType", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceType;

    /*
     * The Sku.
     */
    @JsonProperty(value = "sku", access = JsonProperty.Access.WRITE_ONLY)
    private Sku sku;

    /*
     * Specifies the number of virtual machines in the scale set.
     */
    @JsonProperty(value = "capacity", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualMachineScaleSetSkuCapacity capacity;

    /**
     * Get the resourceType property: The type of resource the sku applies to.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Get the sku property: The Sku.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Get the capacity property: Specifies the number of virtual machines in the scale set.
     *
     * @return the capacity value.
     */
    public VirtualMachineScaleSetSkuCapacity capacity() {
        return this.capacity;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (capacity() != null) {
            capacity().validate();
        }
    }
}
