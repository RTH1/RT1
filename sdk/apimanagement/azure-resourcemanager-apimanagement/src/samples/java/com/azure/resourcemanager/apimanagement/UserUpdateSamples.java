// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.models.UserContract;

/** Samples for User Update. */
public final class UserUpdateSamples {
    /*
     * operationId: User_Update
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementUpdateUser
     */
    /**
     * Sample code: ApiManagementUpdateUser.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementUpdateUser(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        UserContract resource =
            manager.users().getWithResponse("rg1", "apimService1", "5931a75ae4bbd512a88c680b", Context.NONE).getValue();
        resource
            .update()
            .withEmail("foobar@outlook.com")
            .withFirstName("foo")
            .withLastName("bar")
            .withIfMatch("*")
            .apply();
    }
}
