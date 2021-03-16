// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Terms of service contract properties. */
@Fluent
public final class TermsOfServiceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TermsOfServiceProperties.class);

    /*
     * A terms of service text.
     */
    @JsonProperty(value = "text")
    private String text;

    /*
     * Display terms of service during a sign-up process.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * Ask user for consent to the terms of service.
     */
    @JsonProperty(value = "consentRequired")
    private Boolean consentRequired;

    /**
     * Get the text property: A terms of service text.
     *
     * @return the text value.
     */
    public String text() {
        return this.text;
    }

    /**
     * Set the text property: A terms of service text.
     *
     * @param text the text value to set.
     * @return the TermsOfServiceProperties object itself.
     */
    public TermsOfServiceProperties withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the enabled property: Display terms of service during a sign-up process.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Display terms of service during a sign-up process.
     *
     * @param enabled the enabled value to set.
     * @return the TermsOfServiceProperties object itself.
     */
    public TermsOfServiceProperties withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the consentRequired property: Ask user for consent to the terms of service.
     *
     * @return the consentRequired value.
     */
    public Boolean consentRequired() {
        return this.consentRequired;
    }

    /**
     * Set the consentRequired property: Ask user for consent to the terms of service.
     *
     * @param consentRequired the consentRequired value to set.
     * @return the TermsOfServiceProperties object itself.
     */
    public TermsOfServiceProperties withConsentRequired(Boolean consentRequired) {
        this.consentRequired = consentRequired;
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