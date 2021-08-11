// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The definition of a query. */
@Fluent
public final class QueryDefinition {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(QueryDefinition.class);

    /*
     * The type of the query.
     */
    @JsonProperty(value = "type", required = true)
    private ExportType type;

    /*
     * The time frame for pulling data for the query. If custom, then a
     * specific time period must be provided.
     */
    @JsonProperty(value = "timeframe", required = true)
    private TimeframeType timeframe;

    /*
     * Has time period for pulling data for the query.
     */
    @JsonProperty(value = "timePeriod")
    private QueryTimePeriod timePeriod;

    /*
     * Has definition for data in this query.
     */
    @JsonProperty(value = "dataset", required = true)
    private QueryDataset dataset;

    /**
     * Get the type property: The type of the query.
     *
     * @return the type value.
     */
    public ExportType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of the query.
     *
     * @param type the type value to set.
     * @return the QueryDefinition object itself.
     */
    public QueryDefinition withType(ExportType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the timeframe property: The time frame for pulling data for the query. If custom, then a specific time period
     * must be provided.
     *
     * @return the timeframe value.
     */
    public TimeframeType timeframe() {
        return this.timeframe;
    }

    /**
     * Set the timeframe property: The time frame for pulling data for the query. If custom, then a specific time period
     * must be provided.
     *
     * @param timeframe the timeframe value to set.
     * @return the QueryDefinition object itself.
     */
    public QueryDefinition withTimeframe(TimeframeType timeframe) {
        this.timeframe = timeframe;
        return this;
    }

    /**
     * Get the timePeriod property: Has time period for pulling data for the query.
     *
     * @return the timePeriod value.
     */
    public QueryTimePeriod timePeriod() {
        return this.timePeriod;
    }

    /**
     * Set the timePeriod property: Has time period for pulling data for the query.
     *
     * @param timePeriod the timePeriod value to set.
     * @return the QueryDefinition object itself.
     */
    public QueryDefinition withTimePeriod(QueryTimePeriod timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }

    /**
     * Get the dataset property: Has definition for data in this query.
     *
     * @return the dataset value.
     */
    public QueryDataset dataset() {
        return this.dataset;
    }

    /**
     * Set the dataset property: Has definition for data in this query.
     *
     * @param dataset the dataset value to set.
     * @return the QueryDefinition object itself.
     */
    public QueryDefinition withDataset(QueryDataset dataset) {
        this.dataset = dataset;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property type in model QueryDefinition"));
        }
        if (timeframe() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property timeframe in model QueryDefinition"));
        }
        if (timePeriod() != null) {
            timePeriod().validate();
        }
        if (dataset() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property dataset in model QueryDefinition"));
        } else {
            dataset().validate();
        }
    }
}
