// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.accesscontrol.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Check access response details. */
@Fluent
public final class CheckPrincipalAccessResponse {
    /*
     * To check if the current user, group, or service principal has permission
     * to read artifacts in the specified workspace.
     */
    @JsonProperty(value = "accessDecisions")
    private List<CheckAccessDecision> accessDecisions;

    /**
     * Get the accessDecisions property: To check if the current user, group, or service principal has permission to
     * read artifacts in the specified workspace.
     *
     * @return the accessDecisions value.
     */
    public List<CheckAccessDecision> getAccessDecisions() {
        return this.accessDecisions;
    }

    /**
     * Set the accessDecisions property: To check if the current user, group, or service principal has permission to
     * read artifacts in the specified workspace.
     *
     * @param accessDecisions the accessDecisions value to set.
     * @return the CheckPrincipalAccessResponse object itself.
     */
    public CheckPrincipalAccessResponse setAccessDecisions(List<CheckAccessDecision> accessDecisions) {
        this.accessDecisions = accessDecisions;
        return this;
    }
}
