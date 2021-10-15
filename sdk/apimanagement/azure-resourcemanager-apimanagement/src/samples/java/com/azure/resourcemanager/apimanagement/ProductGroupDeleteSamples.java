// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for ProductGroup Delete. */
public final class ProductGroupDeleteSamples {
    /*
     * operationId: ProductGroup_Delete
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementDeleteProductGroup
     */
    /**
     * Sample code: ApiManagementDeleteProductGroup.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementDeleteProductGroup(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.productGroups().deleteWithResponse("rg1", "apimService1", "testproduct", "templateGroup", Context.NONE);
    }
}
