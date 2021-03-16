// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.resourcemanager.apimanagement.fluent.models.ApiRevisionContractInner;
import com.azure.resourcemanager.apimanagement.models.ApiRevisionContract;
import java.time.OffsetDateTime;

public final class ApiRevisionContractImpl implements ApiRevisionContract {
    private ApiRevisionContractInner innerObject;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    ApiRevisionContractImpl(
        ApiRevisionContractInner innerObject,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String apiId() {
        return this.innerModel().apiId();
    }

    public String apiRevision() {
        return this.innerModel().apiRevision();
    }

    public OffsetDateTime createdDateTime() {
        return this.innerModel().createdDateTime();
    }

    public OffsetDateTime updatedDateTime() {
        return this.innerModel().updatedDateTime();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String privateUrl() {
        return this.innerModel().privateUrl();
    }

    public Boolean isOnline() {
        return this.innerModel().isOnline();
    }

    public Boolean isCurrent() {
        return this.innerModel().isCurrent();
    }

    public ApiRevisionContractInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}