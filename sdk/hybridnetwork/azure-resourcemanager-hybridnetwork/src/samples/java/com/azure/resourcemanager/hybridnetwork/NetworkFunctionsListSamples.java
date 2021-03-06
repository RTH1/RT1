// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork;

import com.azure.core.util.Context;

/** Samples for NetworkFunctions List. */
public final class NetworkFunctionsListSamples {
    /**
     * Sample code: List all network function resources in subscription.
     *
     * @param manager Entry point to HybridNetworkManager.
     */
    public static void listAllNetworkFunctionResourcesInSubscription(
        com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager) {
        manager.networkFunctions().list(Context.NONE);
    }
}
