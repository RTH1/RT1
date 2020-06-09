// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The MetricNamespaceName model. */
@Fluent
public final class MetricNamespaceName {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MetricNamespaceName.class);

    /*
     * The metric namespace name.
     */
    @JsonProperty(value = "metricNamespaceName")
    private String metricNamespaceName;

    /**
     * Get the metricNamespaceName property: The metric namespace name.
     *
     * @return the metricNamespaceName value.
     */
    public String metricNamespaceName() {
        return this.metricNamespaceName;
    }

    /**
     * Set the metricNamespaceName property: The metric namespace name.
     *
     * @param metricNamespaceName the metricNamespaceName value to set.
     * @return the MetricNamespaceName object itself.
     */
    public MetricNamespaceName withMetricNamespaceName(String metricNamespaceName) {
        this.metricNamespaceName = metricNamespaceName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
