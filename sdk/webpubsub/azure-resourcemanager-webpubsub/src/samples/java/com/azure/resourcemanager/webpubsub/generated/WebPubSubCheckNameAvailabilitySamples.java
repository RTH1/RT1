// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.webpubsub.models.NameAvailabilityParameters;

/** Samples for WebPubSub CheckNameAvailability. */
public final class WebPubSubCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/webpubsub/resource-manager/Microsoft.SignalRService/stable/2021-10-01/examples/WebPubSub_CheckNameAvailability.json
     */
    /**
     * Sample code: WebPubSub_CheckNameAvailability.
     *
     * @param manager Entry point to WebPubSubManager.
     */
    public static void webPubSubCheckNameAvailability(com.azure.resourcemanager.webpubsub.WebPubSubManager manager) {
        manager
            .webPubSubs()
            .checkNameAvailabilityWithResponse(
                "eastus",
                new NameAvailabilityParameters()
                    .withType("Microsoft.SignalRService/WebPubSub")
                    .withName("myWebPubSubService"),
                Context.NONE);
    }
}
