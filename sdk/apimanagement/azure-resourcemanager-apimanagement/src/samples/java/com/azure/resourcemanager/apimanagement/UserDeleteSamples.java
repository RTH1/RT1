// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for User Delete. */
public final class UserDeleteSamples {
    /*
     * operationId: User_Delete
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementDeleteUser
     */
    /**
     * Sample code: ApiManagementDeleteUser.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementDeleteUser(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .users()
            .deleteWithResponse("rg1", "apimService1", "5931a75ae4bbd512288c680b", "*", null, null, null, Context.NONE);
    }
}
