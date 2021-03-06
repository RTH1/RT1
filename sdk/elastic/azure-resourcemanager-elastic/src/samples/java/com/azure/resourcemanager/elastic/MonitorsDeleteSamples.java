// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic;

import com.azure.core.util.Context;

/** Samples for Monitors Delete. */
public final class MonitorsDeleteSamples {
    /**
     * Sample code: Monitors_Delete.
     *
     * @param elasticManager Entry point to ElasticManager.
     */
    public static void monitorsDelete(com.azure.resourcemanager.elastic.ElasticManager elasticManager) {
        elasticManager.monitors().delete("myResourceGroup", "myMonitor", Context.NONE);
    }
}
