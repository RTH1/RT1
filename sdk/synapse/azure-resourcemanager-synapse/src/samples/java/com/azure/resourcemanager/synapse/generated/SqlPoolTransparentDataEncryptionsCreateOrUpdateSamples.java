// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.resourcemanager.synapse.models.TransparentDataEncryptionName;
import com.azure.resourcemanager.synapse.models.TransparentDataEncryptionStatus;

/** Samples for SqlPoolTransparentDataEncryptions CreateOrUpdate. */
public final class SqlPoolTransparentDataEncryptionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/stable/2021-06-01/examples/CreateOrUpdateSqlPoolTransparentDataEncryption.json
     */
    /**
     * Sample code: Create or update a Sql pool's transparent data encryption configuration.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void createOrUpdateASqlPoolSTransparentDataEncryptionConfiguration(
        com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .sqlPoolTransparentDataEncryptions()
            .define(TransparentDataEncryptionName.CURRENT)
            .withExistingSqlPool("sqlcrudtest-6852", "sqlcrudtest-2080", "sqlcrudtest-9187")
            .withStatus(TransparentDataEncryptionStatus.ENABLED)
            .create();
    }
}
