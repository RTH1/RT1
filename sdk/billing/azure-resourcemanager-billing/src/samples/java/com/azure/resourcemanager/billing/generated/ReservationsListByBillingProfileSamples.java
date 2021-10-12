// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.Context;

/** Samples for Reservations ListByBillingProfile. */
public final class ReservationsListByBillingProfileSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2020-05-01/examples/ReservationsListByBillingProfile.json
     */
    /**
     * Sample code: ReservationsListByBillingProfile.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void reservationsListByBillingProfile(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .reservations()
            .listByBillingProfile(
                "{billingAccountName}",
                "{billingProfileName}",
                "properties/reservedResourceType eq 'VirtualMachines'",
                "properties/userFriendlyAppliedScopeType asc",
                "true",
                "Succeeded",
                Context.NONE);
    }
}
