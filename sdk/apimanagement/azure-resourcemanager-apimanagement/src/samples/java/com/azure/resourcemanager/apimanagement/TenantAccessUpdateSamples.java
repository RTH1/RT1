// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.models.AccessIdName;
import com.azure.resourcemanager.apimanagement.models.AccessInformationContract;

/** Samples for TenantAccess Update. */
public final class TenantAccessUpdateSamples {
    /*
     * operationId: TenantAccess_Update
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementUpdateTenantAccess
     */
    /**
     * Sample code: ApiManagementUpdateTenantAccess.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementUpdateTenantAccess(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        AccessInformationContract resource =
            manager.tenantAccess().getWithResponse("rg1", "apimService1", AccessIdName.ACCESS, Context.NONE).getValue();
        resource.update().withEnabled(true).withIfMatch("*").apply();
    }
}
