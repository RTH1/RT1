// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.resourcemanager.synapse.models.AzureSku;
import com.azure.resourcemanager.synapse.models.SkuName;
import com.azure.resourcemanager.synapse.models.SkuSize;

/** Samples for KustoPoolsOperation CreateOrUpdate. */
public final class KustoPoolsOperationCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/preview/2021-06-01-preview/examples/KustoPoolsCreateOrUpdate.json
     */
    /**
     * Sample code: kustoPoolsCreateOrUpdate.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void kustoPoolsCreateOrUpdate(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .kustoPoolsOperations()
            .define("kustoclusterrptest4")
            .withRegion("westus")
            .withExistingWorkspace("synapseWorkspaceName", "kustorptest")
            .withSku(new AzureSku().withName(SkuName.STORAGE_OPTIMIZED).withCapacity(2).withSize(SkuSize.MEDIUM))
            .withEnableStreamingIngest(true)
            .withEnablePurge(true)
            .withWorkspaceUid("11111111-2222-3333-444444444444")
            .create();
    }
}
