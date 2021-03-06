// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.Context;

/** Samples for BillingRoleAssignments ListByBillingAccount. */
public final class BillingRoleAssignmentsListByBillingAccountSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2020-05-01/examples/BillingAccountRoleAssignmentList.json
     */
    /**
     * Sample code: BillingAccountRoleAssignmentList.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingAccountRoleAssignmentList(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.billingRoleAssignments().listByBillingAccount("{billingAccountName}", Context.NONE);
    }
}
