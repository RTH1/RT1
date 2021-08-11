// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.AutomationsClient;
import com.azure.resourcemanager.security.fluent.models.AutomationInner;
import com.azure.resourcemanager.security.fluent.models.AutomationValidationStatusInner;
import com.azure.resourcemanager.security.models.Automation;
import com.azure.resourcemanager.security.models.AutomationValidationStatus;
import com.azure.resourcemanager.security.models.Automations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class AutomationsImpl implements Automations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AutomationsImpl.class);

    private final AutomationsClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public AutomationsImpl(
        AutomationsClient innerClient, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Automation> list() {
        PagedIterable<AutomationInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new AutomationImpl(inner1, this.manager()));
    }

    public PagedIterable<Automation> list(Context context) {
        PagedIterable<AutomationInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new AutomationImpl(inner1, this.manager()));
    }

    public PagedIterable<Automation> listByResourceGroup(String resourceGroupName) {
        PagedIterable<AutomationInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new AutomationImpl(inner1, this.manager()));
    }

    public PagedIterable<Automation> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<AutomationInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new AutomationImpl(inner1, this.manager()));
    }

    public Automation getByResourceGroup(String resourceGroupName, String automationName) {
        AutomationInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, automationName);
        if (inner != null) {
            return new AutomationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Automation> getByResourceGroupWithResponse(
        String resourceGroupName, String automationName, Context context) {
        Response<AutomationInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, automationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AutomationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String automationName) {
        this.serviceClient().delete(resourceGroupName, automationName);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String automationName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, automationName, context);
    }

    public AutomationValidationStatus validate(
        String resourceGroupName, String automationName, AutomationInner automation) {
        AutomationValidationStatusInner inner =
            this.serviceClient().validate(resourceGroupName, automationName, automation);
        if (inner != null) {
            return new AutomationValidationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AutomationValidationStatus> validateWithResponse(
        String resourceGroupName, String automationName, AutomationInner automation, Context context) {
        Response<AutomationValidationStatusInner> inner =
            this.serviceClient().validateWithResponse(resourceGroupName, automationName, automation, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AutomationValidationStatusImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Automation getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationName = Utils.getValueFromIdByName(id, "automations");
        if (automationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'automations'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, automationName, Context.NONE).getValue();
    }

    public Response<Automation> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationName = Utils.getValueFromIdByName(id, "automations");
        if (automationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'automations'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, automationName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationName = Utils.getValueFromIdByName(id, "automations");
        if (automationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'automations'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, automationName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationName = Utils.getValueFromIdByName(id, "automations");
        if (automationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'automations'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, automationName, context);
    }

    private AutomationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }

    public AutomationImpl define(String name) {
        return new AutomationImpl(name, this.manager());
    }
}
