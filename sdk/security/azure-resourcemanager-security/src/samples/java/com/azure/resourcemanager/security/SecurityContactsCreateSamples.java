// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.resourcemanager.security.models.AlertNotifications;
import com.azure.resourcemanager.security.models.AlertsToAdmins;

/** Samples for SecurityContacts Create. */
public final class SecurityContactsCreateSamples {
    /**
     * Sample code: Create security contact data minimal.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void createSecurityContactDataMinimal(
        com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager
            .securityContacts()
            .define("default2")
            .withEmail("chen@contoso.com")
            .withAlertNotifications(AlertNotifications.ON)
            .withAlertsToAdmins(AlertsToAdmins.ON)
            .create();
    }

    /**
     * Sample code: Create security contact data full.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void createSecurityContactDataFull(
        com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager
            .securityContacts()
            .define("default1")
            .withEmail("john@contoso.com")
            .withPhone("(214)275-4038")
            .withAlertNotifications(AlertNotifications.ON)
            .withAlertsToAdmins(AlertsToAdmins.ON)
            .create();
    }
}
