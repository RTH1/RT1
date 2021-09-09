// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for UserGroup List. */
public final class UserGroupListSamples {
    /*
     * operationId: UserGroup_List
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementListUserGroups
     */
    /**
     * Sample code: ApiManagementListUserGroups.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementListUserGroups(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.userGroups().list("rg1", "apimService1", "57681833a40f7eb6c49f6acf", null, null, null, Context.NONE);
    }
}
