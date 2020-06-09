// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The MetricSpecification model. */
@Fluent
public final class MetricSpecification {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MetricSpecification.class);

    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The displayName property.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The displayDescription property.
     */
    @JsonProperty(value = "displayDescription")
    private String displayDescription;

    /*
     * The unit property.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /*
     * The aggregationType property.
     */
    @JsonProperty(value = "aggregationType")
    private String aggregationType;

    /*
     * The supportsInstanceLevelAggregation property.
     */
    @JsonProperty(value = "supportsInstanceLevelAggregation")
    private Boolean supportsInstanceLevelAggregation;

    /*
     * The enableRegionalMdmAccount property.
     */
    @JsonProperty(value = "enableRegionalMdmAccount")
    private Boolean enableRegionalMdmAccount;

    /*
     * The sourceMdmAccount property.
     */
    @JsonProperty(value = "sourceMdmAccount")
    private String sourceMdmAccount;

    /*
     * The sourceMdmNamespace property.
     */
    @JsonProperty(value = "sourceMdmNamespace")
    private String sourceMdmNamespace;

    /*
     * The metricFilterPattern property.
     */
    @JsonProperty(value = "metricFilterPattern")
    private String metricFilterPattern;

    /*
     * The fillGapWithZero property.
     */
    @JsonProperty(value = "fillGapWithZero")
    private Boolean fillGapWithZero;

    /*
     * The isInternal property.
     */
    @JsonProperty(value = "isInternal")
    private Boolean isInternal;

    /*
     * The dimensions property.
     */
    @JsonProperty(value = "dimensions")
    private List<Dimension> dimensions;

    /*
     * The category property.
     */
    @JsonProperty(value = "category")
    private String category;

    /*
     * The availabilities property.
     */
    @JsonProperty(value = "availabilities")
    private List<MetricAvailability> availabilities;

    /*
     * The supportedTimeGrainTypes property.
     */
    @JsonProperty(value = "supportedTimeGrainTypes")
    private List<String> supportedTimeGrainTypes;

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: The displayName property.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The displayName property.
     *
     * @param displayName the displayName value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the displayDescription property: The displayDescription property.
     *
     * @return the displayDescription value.
     */
    public String displayDescription() {
        return this.displayDescription;
    }

    /**
     * Set the displayDescription property: The displayDescription property.
     *
     * @param displayDescription the displayDescription value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
        return this;
    }

    /**
     * Get the unit property: The unit property.
     *
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit property: The unit property.
     *
     * @param unit the unit value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the aggregationType property: The aggregationType property.
     *
     * @return the aggregationType value.
     */
    public String aggregationType() {
        return this.aggregationType;
    }

    /**
     * Set the aggregationType property: The aggregationType property.
     *
     * @param aggregationType the aggregationType value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withAggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * Get the supportsInstanceLevelAggregation property: The supportsInstanceLevelAggregation property.
     *
     * @return the supportsInstanceLevelAggregation value.
     */
    public Boolean supportsInstanceLevelAggregation() {
        return this.supportsInstanceLevelAggregation;
    }

    /**
     * Set the supportsInstanceLevelAggregation property: The supportsInstanceLevelAggregation property.
     *
     * @param supportsInstanceLevelAggregation the supportsInstanceLevelAggregation value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withSupportsInstanceLevelAggregation(Boolean supportsInstanceLevelAggregation) {
        this.supportsInstanceLevelAggregation = supportsInstanceLevelAggregation;
        return this;
    }

    /**
     * Get the enableRegionalMdmAccount property: The enableRegionalMdmAccount property.
     *
     * @return the enableRegionalMdmAccount value.
     */
    public Boolean enableRegionalMdmAccount() {
        return this.enableRegionalMdmAccount;
    }

    /**
     * Set the enableRegionalMdmAccount property: The enableRegionalMdmAccount property.
     *
     * @param enableRegionalMdmAccount the enableRegionalMdmAccount value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withEnableRegionalMdmAccount(Boolean enableRegionalMdmAccount) {
        this.enableRegionalMdmAccount = enableRegionalMdmAccount;
        return this;
    }

    /**
     * Get the sourceMdmAccount property: The sourceMdmAccount property.
     *
     * @return the sourceMdmAccount value.
     */
    public String sourceMdmAccount() {
        return this.sourceMdmAccount;
    }

    /**
     * Set the sourceMdmAccount property: The sourceMdmAccount property.
     *
     * @param sourceMdmAccount the sourceMdmAccount value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withSourceMdmAccount(String sourceMdmAccount) {
        this.sourceMdmAccount = sourceMdmAccount;
        return this;
    }

    /**
     * Get the sourceMdmNamespace property: The sourceMdmNamespace property.
     *
     * @return the sourceMdmNamespace value.
     */
    public String sourceMdmNamespace() {
        return this.sourceMdmNamespace;
    }

    /**
     * Set the sourceMdmNamespace property: The sourceMdmNamespace property.
     *
     * @param sourceMdmNamespace the sourceMdmNamespace value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withSourceMdmNamespace(String sourceMdmNamespace) {
        this.sourceMdmNamespace = sourceMdmNamespace;
        return this;
    }

    /**
     * Get the metricFilterPattern property: The metricFilterPattern property.
     *
     * @return the metricFilterPattern value.
     */
    public String metricFilterPattern() {
        return this.metricFilterPattern;
    }

    /**
     * Set the metricFilterPattern property: The metricFilterPattern property.
     *
     * @param metricFilterPattern the metricFilterPattern value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withMetricFilterPattern(String metricFilterPattern) {
        this.metricFilterPattern = metricFilterPattern;
        return this;
    }

    /**
     * Get the fillGapWithZero property: The fillGapWithZero property.
     *
     * @return the fillGapWithZero value.
     */
    public Boolean fillGapWithZero() {
        return this.fillGapWithZero;
    }

    /**
     * Set the fillGapWithZero property: The fillGapWithZero property.
     *
     * @param fillGapWithZero the fillGapWithZero value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withFillGapWithZero(Boolean fillGapWithZero) {
        this.fillGapWithZero = fillGapWithZero;
        return this;
    }

    /**
     * Get the isInternal property: The isInternal property.
     *
     * @return the isInternal value.
     */
    public Boolean isInternal() {
        return this.isInternal;
    }

    /**
     * Set the isInternal property: The isInternal property.
     *
     * @param isInternal the isInternal value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withIsInternal(Boolean isInternal) {
        this.isInternal = isInternal;
        return this;
    }

    /**
     * Get the dimensions property: The dimensions property.
     *
     * @return the dimensions value.
     */
    public List<Dimension> dimensions() {
        return this.dimensions;
    }

    /**
     * Set the dimensions property: The dimensions property.
     *
     * @param dimensions the dimensions value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get the category property: The category property.
     *
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category property: The category property.
     *
     * @param category the category value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the availabilities property: The availabilities property.
     *
     * @return the availabilities value.
     */
    public List<MetricAvailability> availabilities() {
        return this.availabilities;
    }

    /**
     * Set the availabilities property: The availabilities property.
     *
     * @param availabilities the availabilities value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withAvailabilities(List<MetricAvailability> availabilities) {
        this.availabilities = availabilities;
        return this;
    }

    /**
     * Get the supportedTimeGrainTypes property: The supportedTimeGrainTypes property.
     *
     * @return the supportedTimeGrainTypes value.
     */
    public List<String> supportedTimeGrainTypes() {
        return this.supportedTimeGrainTypes;
    }

    /**
     * Set the supportedTimeGrainTypes property: The supportedTimeGrainTypes property.
     *
     * @param supportedTimeGrainTypes the supportedTimeGrainTypes value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withSupportedTimeGrainTypes(List<String> supportedTimeGrainTypes) {
        this.supportedTimeGrainTypes = supportedTimeGrainTypes;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dimensions() != null) {
            dimensions().forEach(e -> e.validate());
        }
        if (availabilities() != null) {
            availabilities().forEach(e -> e.validate());
        }
    }
}
