// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.models.NotificationName;

/** Samples for NotificationRecipientUser Delete. */
public final class NotificationRecipientUserDeleteSamples {
    /*
     * operationId: NotificationRecipientUser_Delete
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementDeleteNotificationRecipientUser
     */
    /**
     * Sample code: ApiManagementDeleteNotificationRecipientUser.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementDeleteNotificationRecipientUser(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .notificationRecipientUsers()
            .deleteWithResponse(
                "rg1",
                "apimService1",
                NotificationName.REQUEST_PUBLISHER_NOTIFICATION_MESSAGE,
                "576823d0a40f7e74ec07d642",
                Context.NONE);
    }
}
