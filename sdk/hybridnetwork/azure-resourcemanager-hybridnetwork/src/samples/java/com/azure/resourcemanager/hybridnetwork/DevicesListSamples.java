// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork;

import com.azure.core.util.Context;

/** Samples for Devices List. */
public final class DevicesListSamples {
    /**
     * Sample code: List all devices in a subscription.
     *
     * @param manager Entry point to HybridNetworkManager.
     */
    public static void listAllDevicesInASubscription(
        com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager) {
        manager.devices().list(Context.NONE);
    }
}
