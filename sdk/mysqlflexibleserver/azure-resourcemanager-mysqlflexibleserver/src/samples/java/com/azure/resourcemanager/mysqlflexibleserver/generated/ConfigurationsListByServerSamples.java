// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.Context;

/** Samples for Configurations ListByServer. */
public final class ConfigurationsListByServerSamples {
    /*
     * x-ms-original-file: specification/mysql/resource-manager/Microsoft.DBforMySQL/stable/2021-05-01/examples/ConfigurationsListByServer.json
     */
    /**
     * Sample code: List all configurations for a server.
     *
     * @param manager Entry point to MySqlManager.
     */
    public static void listAllConfigurationsForAServer(
        com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager) {
        manager.configurations().listByServer("testrg", "mysqltestserver", Context.NONE);
    }
}
