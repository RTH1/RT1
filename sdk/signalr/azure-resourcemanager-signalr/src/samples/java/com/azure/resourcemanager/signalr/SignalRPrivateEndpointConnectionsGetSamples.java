// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr;

import com.azure.core.util.Context;

/** Samples for SignalRPrivateEndpointConnections Get. */
public final class SignalRPrivateEndpointConnectionsGetSamples {
    /**
     * Sample code: SignalRPrivateEndpointConnections_Get.
     *
     * @param signalRManager Entry point to SignalRManager. REST API for Azure SignalR Service.
     */
    public static void signalRPrivateEndpointConnectionsGet(
        com.azure.resourcemanager.signalr.SignalRManager signalRManager) {
        signalRManager
            .signalRPrivateEndpointConnections()
            .getWithResponse(
                "mysignalrservice.1fa229cd-bf3f-47f0-8c49-afb36723997e",
                "myResourceGroup",
                "mySignalRService",
                Context.NONE);
    }
}
