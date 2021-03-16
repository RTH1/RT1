// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.resourcemanager.apimanagement.fluent.models.ApiManagementServiceGetSsoTokenResultInner;
import com.azure.resourcemanager.apimanagement.models.ApiManagementServiceGetSsoTokenResult;

public final class ApiManagementServiceGetSsoTokenResultImpl implements ApiManagementServiceGetSsoTokenResult {
    private ApiManagementServiceGetSsoTokenResultInner innerObject;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    ApiManagementServiceGetSsoTokenResultImpl(
        ApiManagementServiceGetSsoTokenResultInner innerObject,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String redirectUri() {
        return this.innerModel().redirectUri();
    }

    public ApiManagementServiceGetSsoTokenResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}