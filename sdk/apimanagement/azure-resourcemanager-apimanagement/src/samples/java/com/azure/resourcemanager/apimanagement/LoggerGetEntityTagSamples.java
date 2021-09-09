// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for Logger GetEntityTag. */
public final class LoggerGetEntityTagSamples {
    /*
     * operationId: Logger_GetEntityTag
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementHeadLogger
     */
    /**
     * Sample code: ApiManagementHeadLogger.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementHeadLogger(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.loggers().getEntityTagWithResponse("rg1", "apimService1", "templateLogger", Context.NONE);
    }
}
