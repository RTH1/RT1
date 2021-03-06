// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for User GetEntityTag. */
public final class UserGetEntityTagSamples {
    /*
     * operationId: User_GetEntityTag
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementHeadUser
     */
    /**
     * Sample code: ApiManagementHeadUser.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementHeadUser(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.users().getEntityTagWithResponse("rg1", "apimService1", "5931a75ae4bbd512a88c680b", Context.NONE);
    }
}
