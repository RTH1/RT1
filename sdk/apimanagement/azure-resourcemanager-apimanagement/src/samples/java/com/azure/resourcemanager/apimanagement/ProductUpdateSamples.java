// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.models.ProductContract;

/** Samples for Product Update. */
public final class ProductUpdateSamples {
    /*
     * operationId: Product_Update
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementUpdateProduct
     */
    /**
     * Sample code: ApiManagementUpdateProduct.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementUpdateProduct(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        ProductContract resource =
            manager.products().getWithResponse("rg1", "apimService1", "testproduct", Context.NONE).getValue();
        resource.update().withDisplayName("Test Template ProductName 4").withIfMatch("*").apply();
    }
}
