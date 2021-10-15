// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.webpubsub.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.webpubsub.models.PrivateEndpoint;
import com.azure.resourcemanager.webpubsub.models.PrivateEndpointConnection;
import com.azure.resourcemanager.webpubsub.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.webpubsub.models.ProvisioningState;
import java.util.Collections;
import java.util.List;

public final class PrivateEndpointConnectionImpl implements PrivateEndpointConnection {
    private PrivateEndpointConnectionInner innerObject;

    private final com.azure.resourcemanager.webpubsub.WebPubSubManager serviceManager;

    PrivateEndpointConnectionImpl(
        PrivateEndpointConnectionInner innerObject,
        com.azure.resourcemanager.webpubsub.WebPubSubManager serviceManager) {
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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public PrivateEndpoint privateEndpoint() {
        return this.innerModel().privateEndpoint();
    }

    public List<String> groupIds() {
        List<String> inner = this.innerModel().groupIds();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public PrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.innerModel().privateLinkServiceConnectionState();
    }

    public PrivateEndpointConnectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.webpubsub.WebPubSubManager manager() {
        return this.serviceManager;
    }
}
