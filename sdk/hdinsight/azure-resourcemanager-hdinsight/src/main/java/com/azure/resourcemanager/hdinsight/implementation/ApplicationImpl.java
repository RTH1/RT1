// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hdinsight.fluent.models.ApplicationInner;
import com.azure.resourcemanager.hdinsight.models.Application;
import com.azure.resourcemanager.hdinsight.models.ApplicationProperties;
import java.util.Collections;
import java.util.Map;

public final class ApplicationImpl implements Application, Application.Definition {
    private ApplicationInner innerObject;

    private final com.azure.resourcemanager.hdinsight.HDInsightManager serviceManager;

    ApplicationImpl(ApplicationInner innerObject, com.azure.resourcemanager.hdinsight.HDInsightManager serviceManager) {
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

    public String etag() {
        return this.innerModel().etag();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ApplicationProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ApplicationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hdinsight.HDInsightManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String clusterName;

    private String applicationName;

    public ApplicationImpl withExistingCluster(String resourceGroupName, String clusterName) {
        this.resourceGroupName = resourceGroupName;
        this.clusterName = clusterName;
        return this;
    }

    public Application create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplications()
                .create(resourceGroupName, clusterName, applicationName, this.innerModel(), Context.NONE);
        return this;
    }

    public Application create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplications()
                .create(resourceGroupName, clusterName, applicationName, this.innerModel(), context);
        return this;
    }

    ApplicationImpl(String name, com.azure.resourcemanager.hdinsight.HDInsightManager serviceManager) {
        this.innerObject = new ApplicationInner();
        this.serviceManager = serviceManager;
        this.applicationName = name;
    }

    public Application refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplications()
                .getWithResponse(resourceGroupName, clusterName, applicationName, Context.NONE)
                .getValue();
        return this;
    }

    public Application refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplications()
                .getWithResponse(resourceGroupName, clusterName, applicationName, context)
                .getValue();
        return this;
    }

    public ApplicationImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public ApplicationImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }

    public ApplicationImpl withProperties(ApplicationProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
