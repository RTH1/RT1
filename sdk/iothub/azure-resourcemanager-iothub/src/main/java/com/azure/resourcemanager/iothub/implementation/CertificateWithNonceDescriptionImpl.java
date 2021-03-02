// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.implementation;

import com.azure.resourcemanager.iothub.IotHubManager;
import com.azure.resourcemanager.iothub.fluent.models.CertificateWithNonceDescriptionInner;
import com.azure.resourcemanager.iothub.models.CertificatePropertiesWithNonce;
import com.azure.resourcemanager.iothub.models.CertificateWithNonceDescription;

public final class CertificateWithNonceDescriptionImpl implements CertificateWithNonceDescription {
    private CertificateWithNonceDescriptionInner innerObject;

    private final IotHubManager serviceManager;

    CertificateWithNonceDescriptionImpl(
        CertificateWithNonceDescriptionInner innerObject, IotHubManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public CertificatePropertiesWithNonce properties() {
        return this.innerModel().properties();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public CertificateWithNonceDescriptionInner innerModel() {
        return this.innerObject;
    }

    private IotHubManager manager() {
        return this.serviceManager;
    }
}