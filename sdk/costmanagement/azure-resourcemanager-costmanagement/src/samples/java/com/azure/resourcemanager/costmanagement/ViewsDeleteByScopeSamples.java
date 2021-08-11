// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement;

import com.azure.core.util.Context;

/** Samples for Views DeleteByScope. */
public final class ViewsDeleteByScopeSamples {
    /**
     * Sample code: ResourceGroupDeleteView.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void resourceGroupDeleteView(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .views()
            .deleteByScopeWithResponse(
                "subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/MYDEVTESTRG",
                "TestView",
                Context.NONE);
    }
}
