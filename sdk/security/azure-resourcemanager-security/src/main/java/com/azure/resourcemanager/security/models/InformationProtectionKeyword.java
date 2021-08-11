// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The information type keyword. */
@Fluent
public final class InformationProtectionKeyword {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(InformationProtectionKeyword.class);

    /*
     * The keyword pattern.
     */
    @JsonProperty(value = "pattern")
    private String pattern;

    /*
     * Indicates whether the keyword is custom or not.
     */
    @JsonProperty(value = "custom")
    private Boolean custom;

    /*
     * Indicates whether the keyword can be applied on numeric types or not.
     */
    @JsonProperty(value = "canBeNumeric")
    private Boolean canBeNumeric;

    /*
     * Indicates whether the keyword is excluded or not.
     */
    @JsonProperty(value = "excluded")
    private Boolean excluded;

    /**
     * Get the pattern property: The keyword pattern.
     *
     * @return the pattern value.
     */
    public String pattern() {
        return this.pattern;
    }

    /**
     * Set the pattern property: The keyword pattern.
     *
     * @param pattern the pattern value to set.
     * @return the InformationProtectionKeyword object itself.
     */
    public InformationProtectionKeyword withPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * Get the custom property: Indicates whether the keyword is custom or not.
     *
     * @return the custom value.
     */
    public Boolean custom() {
        return this.custom;
    }

    /**
     * Set the custom property: Indicates whether the keyword is custom or not.
     *
     * @param custom the custom value to set.
     * @return the InformationProtectionKeyword object itself.
     */
    public InformationProtectionKeyword withCustom(Boolean custom) {
        this.custom = custom;
        return this;
    }

    /**
     * Get the canBeNumeric property: Indicates whether the keyword can be applied on numeric types or not.
     *
     * @return the canBeNumeric value.
     */
    public Boolean canBeNumeric() {
        return this.canBeNumeric;
    }

    /**
     * Set the canBeNumeric property: Indicates whether the keyword can be applied on numeric types or not.
     *
     * @param canBeNumeric the canBeNumeric value to set.
     * @return the InformationProtectionKeyword object itself.
     */
    public InformationProtectionKeyword withCanBeNumeric(Boolean canBeNumeric) {
        this.canBeNumeric = canBeNumeric;
        return this;
    }

    /**
     * Get the excluded property: Indicates whether the keyword is excluded or not.
     *
     * @return the excluded value.
     */
    public Boolean excluded() {
        return this.excluded;
    }

    /**
     * Set the excluded property: Indicates whether the keyword is excluded or not.
     *
     * @param excluded the excluded value to set.
     * @return the InformationProtectionKeyword object itself.
     */
    public InformationProtectionKeyword withExcluded(Boolean excluded) {
        this.excluded = excluded;
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
