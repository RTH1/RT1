// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric;

import com.azure.core.util.Context;

/** Samples for Clusters Delete. */
public final class ClustersDeleteSamples {
    /*
     * operationId: Clusters_Delete
     * api-version: 2021-06-01
     * x-ms-examples: Delete a cluster
     */
    /**
     * Sample code: Delete a cluster.
     *
     * @param manager Entry point to ServiceFabricManager.
     */
    public static void deleteACluster(com.azure.resourcemanager.servicefabric.ServiceFabricManager manager) {
        manager.clusters().deleteWithResponse("resRg", "myCluster", Context.NONE);
    }
}
