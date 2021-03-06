// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr;

import com.azure.core.util.Context;

/** Samples for Usages List. */
public final class UsagesListSamples {
    /**
     * Sample code: Usages_List.
     *
     * @param signalRManager Entry point to SignalRManager. REST API for Azure SignalR Service.
     */
    public static void usagesList(com.azure.resourcemanager.signalr.SignalRManager signalRManager) {
        signalRManager.usages().list("eastus", Context.NONE);
    }
}
