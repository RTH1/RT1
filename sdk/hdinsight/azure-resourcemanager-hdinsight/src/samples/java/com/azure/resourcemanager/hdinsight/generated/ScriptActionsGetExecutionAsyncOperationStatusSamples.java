// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.util.Context;

/** Samples for ScriptActions GetExecutionAsyncOperationStatus. */
public final class ScriptActionsGetExecutionAsyncOperationStatusSamples {
    /*
     * x-ms-original-file: specification/hdinsight/resource-manager/Microsoft.HDInsight/stable/2021-06-01/examples/GetScriptExecutionAsyncOperationStatus.json
     */
    /**
     * Sample code: Gets the async execution operation status.
     *
     * @param manager Entry point to HDInsightManager.
     */
    public static void getsTheAsyncExecutionOperationStatus(
        com.azure.resourcemanager.hdinsight.HDInsightManager manager) {
        manager
            .scriptActions()
            .getExecutionAsyncOperationStatusWithResponse(
                "rg1", "cluster1", "CF938302-6B4D-44A0-A6D2-C0D67E847AEC", Context.NONE);
    }
}
