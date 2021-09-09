// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric;

import com.azure.core.util.Context;

/** Samples for ApplicationTypeVersions List. */
public final class ApplicationTypeVersionsListSamples {
    /*
     * operationId: ApplicationTypeVersions_List
     * api-version: 2021-06-01
     * x-ms-examples: Get a list of application type version resources
     */
    /**
     * Sample code: Get a list of application type version resources.
     *
     * @param manager Entry point to ServiceFabricManager.
     */
    public static void getAListOfApplicationTypeVersionResources(
        com.azure.resourcemanager.servicefabric.ServiceFabricManager manager) {
        manager.applicationTypeVersions().listWithResponse("resRg", "myCluster", "myAppType", Context.NONE);
    }
}
