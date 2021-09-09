// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory;

import com.azure.core.util.Context;

/** Samples for ManagedPrivateEndpoints Get. */
public final class ManagedPrivateEndpointsGetSamples {
    /*
     * operationId: ManagedPrivateEndpoints_Get
     * api-version: 2018-06-01
     * x-ms-examples: ManagedPrivateEndpoints_Get
     */
    /**
     * Sample code: ManagedPrivateEndpoints_Get.
     *
     * @param manager Entry point to DataFactoryManager.
     */
    public static void managedPrivateEndpointsGet(com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager
            .managedPrivateEndpoints()
            .getWithResponse(
                "exampleResourceGroup",
                "exampleFactoryName",
                "exampleManagedVirtualNetworkName",
                "exampleManagedPrivateEndpointName",
                null,
                Context.NONE);
    }
}
