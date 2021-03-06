// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.Context;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/postgresql/resource-manager/Microsoft.DBforPostgreSQL/stable/2021-06-01/examples/OperationList.json
     */
    /**
     * Sample code: OperationList.
     *
     * @param manager Entry point to PostgreSqlManager.
     */
    public static void operationList(com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager) {
        manager.operations().listWithResponse(Context.NONE);
    }
}
