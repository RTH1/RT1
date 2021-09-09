// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.models.SaveConfigurationParameterProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Save Tenant Configuration Contract details. */
@Fluent
public final class SaveConfigurationParameter {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SaveConfigurationParameter.class);

    /*
     * Properties of the Save Configuration Parameters.
     */
    @JsonProperty(value = "properties")
    private SaveConfigurationParameterProperties innerProperties;

    /**
     * Get the innerProperties property: Properties of the Save Configuration Parameters.
     *
     * @return the innerProperties value.
     */
    private SaveConfigurationParameterProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the branch property: The name of the Git branch in which to commit the current configuration snapshot.
     *
     * @return the branch value.
     */
    public String branch() {
        return this.innerProperties() == null ? null : this.innerProperties().branch();
    }

    /**
     * Set the branch property: The name of the Git branch in which to commit the current configuration snapshot.
     *
     * @param branch the branch value to set.
     * @return the SaveConfigurationParameter object itself.
     */
    public SaveConfigurationParameter withBranch(String branch) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SaveConfigurationParameterProperties();
        }
        this.innerProperties().withBranch(branch);
        return this;
    }

    /**
     * Get the force property: The value if true, the current configuration database is committed to the Git repository,
     * even if the Git repository has newer changes that would be overwritten.
     *
     * @return the force value.
     */
    public Boolean force() {
        return this.innerProperties() == null ? null : this.innerProperties().force();
    }

    /**
     * Set the force property: The value if true, the current configuration database is committed to the Git repository,
     * even if the Git repository has newer changes that would be overwritten.
     *
     * @param force the force value to set.
     * @return the SaveConfigurationParameter object itself.
     */
    public SaveConfigurationParameter withForce(Boolean force) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SaveConfigurationParameterProperties();
        }
        this.innerProperties().withForce(force);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
