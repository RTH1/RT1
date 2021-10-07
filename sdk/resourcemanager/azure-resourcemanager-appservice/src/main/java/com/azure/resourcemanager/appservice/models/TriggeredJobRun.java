// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.fluent.models.TriggeredJobRunProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Triggered Web Job Run Information. */
@Fluent
public final class TriggeredJobRun extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TriggeredJobRun.class);

    /*
     * TriggeredJobRun resource specific properties
     */
    @JsonProperty(value = "properties")
    private TriggeredJobRunProperties innerProperties;

    /**
     * Get the innerProperties property: TriggeredJobRun resource specific properties.
     *
     * @return the innerProperties value.
     */
    private TriggeredJobRunProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public TriggeredJobRun withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the webJobId property: Job ID.
     *
     * @return the webJobId value.
     */
    public String webJobId() {
        return this.innerProperties() == null ? null : this.innerProperties().webJobId();
    }

    /**
     * Set the webJobId property: Job ID.
     *
     * @param webJobId the webJobId value to set.
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withWebJobId(String webJobId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TriggeredJobRunProperties();
        }
        this.innerProperties().withWebJobId(webJobId);
        return this;
    }

    /**
     * Get the webJobName property: Job name.
     *
     * @return the webJobName value.
     */
    public String webJobName() {
        return this.innerProperties() == null ? null : this.innerProperties().webJobName();
    }

    /**
     * Set the webJobName property: Job name.
     *
     * @param webJobName the webJobName value to set.
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withWebJobName(String webJobName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TriggeredJobRunProperties();
        }
        this.innerProperties().withWebJobName(webJobName);
        return this;
    }

    /**
     * Get the status property: Job status.
     *
     * @return the status value.
     */
    public TriggeredWebJobStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Set the status property: Job status.
     *
     * @param status the status value to set.
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withStatus(TriggeredWebJobStatus status) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TriggeredJobRunProperties();
        }
        this.innerProperties().withStatus(status);
        return this;
    }

    /**
     * Get the startTime property: Start time.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.innerProperties() == null ? null : this.innerProperties().startTime();
    }

    /**
     * Set the startTime property: Start time.
     *
     * @param startTime the startTime value to set.
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withStartTime(OffsetDateTime startTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TriggeredJobRunProperties();
        }
        this.innerProperties().withStartTime(startTime);
        return this;
    }

    /**
     * Get the endTime property: End time.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.innerProperties() == null ? null : this.innerProperties().endTime();
    }

    /**
     * Set the endTime property: End time.
     *
     * @param endTime the endTime value to set.
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withEndTime(OffsetDateTime endTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TriggeredJobRunProperties();
        }
        this.innerProperties().withEndTime(endTime);
        return this;
    }

    /**
     * Get the duration property: Job duration.
     *
     * @return the duration value.
     */
    public String duration() {
        return this.innerProperties() == null ? null : this.innerProperties().duration();
    }

    /**
     * Set the duration property: Job duration.
     *
     * @param duration the duration value to set.
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withDuration(String duration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TriggeredJobRunProperties();
        }
        this.innerProperties().withDuration(duration);
        return this;
    }

    /**
     * Get the outputUrl property: Output URL.
     *
     * @return the outputUrl value.
     */
    public String outputUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().outputUrl();
    }

    /**
     * Set the outputUrl property: Output URL.
     *
     * @param outputUrl the outputUrl value to set.
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withOutputUrl(String outputUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TriggeredJobRunProperties();
        }
        this.innerProperties().withOutputUrl(outputUrl);
        return this;
    }

    /**
     * Get the errorUrl property: Error URL.
     *
     * @return the errorUrl value.
     */
    public String errorUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().errorUrl();
    }

    /**
     * Set the errorUrl property: Error URL.
     *
     * @param errorUrl the errorUrl value to set.
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withErrorUrl(String errorUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TriggeredJobRunProperties();
        }
        this.innerProperties().withErrorUrl(errorUrl);
        return this;
    }

    /**
     * Get the url property: Job URL.
     *
     * @return the url value.
     */
    public String url() {
        return this.innerProperties() == null ? null : this.innerProperties().url();
    }

    /**
     * Set the url property: Job URL.
     *
     * @param url the url value to set.
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withUrl(String url) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TriggeredJobRunProperties();
        }
        this.innerProperties().withUrl(url);
        return this;
    }

    /**
     * Get the jobName property: Job name.
     *
     * @return the jobName value.
     */
    public String jobName() {
        return this.innerProperties() == null ? null : this.innerProperties().jobName();
    }

    /**
     * Set the jobName property: Job name.
     *
     * @param jobName the jobName value to set.
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withJobName(String jobName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TriggeredJobRunProperties();
        }
        this.innerProperties().withJobName(jobName);
        return this;
    }

    /**
     * Get the trigger property: Job trigger.
     *
     * @return the trigger value.
     */
    public String trigger() {
        return this.innerProperties() == null ? null : this.innerProperties().trigger();
    }

    /**
     * Set the trigger property: Job trigger.
     *
     * @param trigger the trigger value to set.
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withTrigger(String trigger) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TriggeredJobRunProperties();
        }
        this.innerProperties().withTrigger(trigger);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
