// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.billing.fluent.models.DepartmentProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A department. */
@Fluent
public final class Department extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Department.class);

    /*
     * A department.
     */
    @JsonProperty(value = "properties")
    private DepartmentProperties innerProperties;

    /**
     * Get the innerProperties property: A department.
     *
     * @return the innerProperties value.
     */
    private DepartmentProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the departmentName property: The name of the department.
     *
     * @return the departmentName value.
     */
    public String departmentName() {
        return this.innerProperties() == null ? null : this.innerProperties().departmentName();
    }

    /**
     * Set the departmentName property: The name of the department.
     *
     * @param departmentName the departmentName value to set.
     * @return the Department object itself.
     */
    public Department withDepartmentName(String departmentName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DepartmentProperties();
        }
        this.innerProperties().withDepartmentName(departmentName);
        return this;
    }

    /**
     * Get the costCenter property: The cost center associated with the department.
     *
     * @return the costCenter value.
     */
    public String costCenter() {
        return this.innerProperties() == null ? null : this.innerProperties().costCenter();
    }

    /**
     * Set the costCenter property: The cost center associated with the department.
     *
     * @param costCenter the costCenter value to set.
     * @return the Department object itself.
     */
    public Department withCostCenter(String costCenter) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DepartmentProperties();
        }
        this.innerProperties().withCostCenter(costCenter);
        return this;
    }

    /**
     * Get the status property: The status of the department.
     *
     * @return the status value.
     */
    public String status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Set the status property: The status of the department.
     *
     * @param status the status value to set.
     * @return the Department object itself.
     */
    public Department withStatus(String status) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DepartmentProperties();
        }
        this.innerProperties().withStatus(status);
        return this;
    }

    /**
     * Get the enrollmentAccounts property: Associated enrollment accounts. By default this is not populated, unless
     * it's specified in $expand.
     *
     * @return the enrollmentAccounts value.
     */
    public List<EnrollmentAccount> enrollmentAccounts() {
        return this.innerProperties() == null ? null : this.innerProperties().enrollmentAccounts();
    }

    /**
     * Set the enrollmentAccounts property: Associated enrollment accounts. By default this is not populated, unless
     * it's specified in $expand.
     *
     * @param enrollmentAccounts the enrollmentAccounts value to set.
     * @return the Department object itself.
     */
    public Department withEnrollmentAccounts(List<EnrollmentAccount> enrollmentAccounts) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DepartmentProperties();
        }
        this.innerProperties().withEnrollmentAccounts(enrollmentAccounts);
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
