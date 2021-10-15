// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.Context;

/** Samples for Invoices ListByBillingProfile. */
public final class InvoicesListByBillingProfileSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2020-05-01/examples/InvoicesListByBillingProfile.json
     */
    /**
     * Sample code: InvoicesListByBillingProfile.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void invoicesListByBillingProfile(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .invoices()
            .listByBillingProfile(
                "{billingAccountName}", "{billingProfileName}", "2018-01-01", "2018-06-30", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2020-05-01/examples/InvoicesListByBillingProfileWithRebillDetails.json
     */
    /**
     * Sample code: InvoicesListByBillingProfileWithRebillDetails.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void invoicesListByBillingProfileWithRebillDetails(
        com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .invoices()
            .listByBillingProfile(
                "{billingAccountName}", "{billingProfileName}", "2018-01-01", "2018-06-30", Context.NONE);
    }
}
