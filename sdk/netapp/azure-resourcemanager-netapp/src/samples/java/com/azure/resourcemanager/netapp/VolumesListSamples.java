// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp;

import com.azure.core.util.Context;

/** Samples for Volumes List. */
public final class VolumesListSamples {
    /*
     * operationId: Volumes_List
     * api-version: 2021-06-01
     * x-ms-examples: Volumes_List
     */
    /**
     * Sample code: Volumes_List.
     *
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void volumesList(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.volumes().list("myRG", "account1", "pool1", Context.NONE);
    }
}
