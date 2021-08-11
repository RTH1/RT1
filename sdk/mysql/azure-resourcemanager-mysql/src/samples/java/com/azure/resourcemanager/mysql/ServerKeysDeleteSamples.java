// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql;

import com.azure.core.util.Context;

/** Samples for ServerKeys Delete. */
public final class ServerKeysDeleteSamples {
    /**
     * Sample code: Delete the MySQL Server key.
     *
     * @param mySqlManager Entry point to MySqlManager. The Microsoft Azure management API provides create, read,
     *     update, and delete functionality for Azure MySQL resources including servers, databases, firewall rules, VNET
     *     rules, log files and configurations with new business model.
     */
    public static void deleteTheMySQLServerKey(com.azure.resourcemanager.mysql.MySqlManager mySqlManager) {
        mySqlManager
            .serverKeys()
            .delete("testserver", "someVault_someKey_01234567890123456789012345678901", "testrg", Context.NONE);
    }
}
