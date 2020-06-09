// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.TroubleshootingDetails;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The TroubleshootingResult model. */
@Fluent
public final class TroubleshootingResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TroubleshootingResultInner.class);

    /*
     * The start time of the troubleshooting.
     */
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /*
     * The end time of the troubleshooting.
     */
    @JsonProperty(value = "endTime")
    private OffsetDateTime endTime;

    /*
     * The result code of the troubleshooting.
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * Information from troubleshooting.
     */
    @JsonProperty(value = "results")
    private List<TroubleshootingDetails> results;

    /**
     * Get the startTime property: The start time of the troubleshooting.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The start time of the troubleshooting.
     *
     * @param startTime the startTime value to set.
     * @return the TroubleshootingResultInner object itself.
     */
    public TroubleshootingResultInner withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: The end time of the troubleshooting.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: The end time of the troubleshooting.
     *
     * @param endTime the endTime value to set.
     * @return the TroubleshootingResultInner object itself.
     */
    public TroubleshootingResultInner withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the code property: The result code of the troubleshooting.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: The result code of the troubleshooting.
     *
     * @param code the code value to set.
     * @return the TroubleshootingResultInner object itself.
     */
    public TroubleshootingResultInner withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the results property: Information from troubleshooting.
     *
     * @return the results value.
     */
    public List<TroubleshootingDetails> results() {
        return this.results;
    }

    /**
     * Set the results property: Information from troubleshooting.
     *
     * @param results the results value to set.
     * @return the TroubleshootingResultInner object itself.
     */
    public TroubleshootingResultInner withResults(List<TroubleshootingDetails> results) {
        this.results = results;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (results() != null) {
            results().forEach(e -> e.validate());
        }
    }
}
