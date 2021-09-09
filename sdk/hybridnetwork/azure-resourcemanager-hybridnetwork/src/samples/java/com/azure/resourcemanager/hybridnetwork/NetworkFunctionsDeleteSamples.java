// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork;

import com.azure.core.util.Context;

/** Samples for NetworkFunctions Delete. */
public final class NetworkFunctionsDeleteSamples {
    /**
     * Sample code: Delete network function resource.
     *
     * @param manager Entry point to HybridNetworkManager.
     */
    public static void deleteNetworkFunctionResource(
        com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager) {
        manager.networkFunctions().delete("rg", "testNf", Context.NONE);
    }
}
