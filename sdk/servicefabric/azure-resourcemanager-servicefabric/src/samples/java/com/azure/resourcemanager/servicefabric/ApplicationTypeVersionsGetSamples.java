// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric;

import com.azure.core.util.Context;

/** Samples for ApplicationTypeVersions Get. */
public final class ApplicationTypeVersionsGetSamples {
    /*
     * operationId: ApplicationTypeVersions_Get
     * api-version: 2021-06-01
     * x-ms-examples: Get an application type version
     */
    /**
     * Sample code: Get an application type version.
     *
     * @param manager Entry point to ServiceFabricManager.
     */
    public static void getAnApplicationTypeVersion(
        com.azure.resourcemanager.servicefabric.ServiceFabricManager manager) {
        manager.applicationTypeVersions().getWithResponse("resRg", "myCluster", "myAppType", "1.0", Context.NONE);
    }
}
