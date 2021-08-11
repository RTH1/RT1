// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch;

import com.azure.core.util.Context;

/** Samples for BatchAccount Delete. */
public final class BatchAccountDeleteSamples {
    /**
     * Sample code: BatchAccountDelete.
     *
     * @param batchManager Entry point to BatchManager.
     */
    public static void batchAccountDelete(com.azure.resourcemanager.batch.BatchManager batchManager) {
        batchManager.batchAccounts().delete("default-azurebatch-japaneast", "sampleacct", Context.NONE);
    }
}
