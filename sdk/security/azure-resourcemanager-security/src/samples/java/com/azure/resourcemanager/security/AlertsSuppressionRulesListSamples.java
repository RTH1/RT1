// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for AlertsSuppressionRules List. */
public final class AlertsSuppressionRulesListSamples {
    /**
     * Sample code: Get suppression rules for subscription.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void getSuppressionRulesForSubscription(
        com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager.alertsSuppressionRules().list(null, Context.NONE);
    }

    /**
     * Sample code: Get suppression alert rule for subscription, filtered by AlertType.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void getSuppressionAlertRuleForSubscriptionFilteredByAlertType(
        com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager.alertsSuppressionRules().list("IpAnomaly", Context.NONE);
    }
}
