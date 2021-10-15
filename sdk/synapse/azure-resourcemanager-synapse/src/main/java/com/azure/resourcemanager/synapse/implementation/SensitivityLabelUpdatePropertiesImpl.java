// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.resourcemanager.synapse.fluent.models.SensitivityLabelInner;
import com.azure.resourcemanager.synapse.fluent.models.SensitivityLabelUpdatePropertiesInner;
import com.azure.resourcemanager.synapse.models.SensitivityLabel;
import com.azure.resourcemanager.synapse.models.SensitivityLabelUpdateKind;
import com.azure.resourcemanager.synapse.models.SensitivityLabelUpdateProperties;

public final class SensitivityLabelUpdatePropertiesImpl implements SensitivityLabelUpdateProperties {
    private SensitivityLabelUpdatePropertiesInner innerObject;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    SensitivityLabelUpdatePropertiesImpl(
        SensitivityLabelUpdatePropertiesInner innerObject,
        com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public SensitivityLabelUpdateKind op() {
        return this.innerModel().op();
    }

    public String schema() {
        return this.innerModel().schema();
    }

    public String table() {
        return this.innerModel().table();
    }

    public String column() {
        return this.innerModel().column();
    }

    public SensitivityLabel sensitivityLabel() {
        SensitivityLabelInner inner = this.innerModel().sensitivityLabel();
        if (inner != null) {
            return new SensitivityLabelImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public SensitivityLabelUpdatePropertiesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }
}
