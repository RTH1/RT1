// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Binary read settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("BinaryReadSettings")
@Fluent
public final class BinaryReadSettings extends FormatReadSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BinaryReadSettings.class);

    /*
     * Compression settings.
     */
    @JsonProperty(value = "compressionProperties")
    private CompressionReadSettings compressionProperties;

    /**
     * Get the compressionProperties property: Compression settings.
     *
     * @return the compressionProperties value.
     */
    public CompressionReadSettings compressionProperties() {
        return this.compressionProperties;
    }

    /**
     * Set the compressionProperties property: Compression settings.
     *
     * @param compressionProperties the compressionProperties value to set.
     * @return the BinaryReadSettings object itself.
     */
    public BinaryReadSettings withCompressionProperties(CompressionReadSettings compressionProperties) {
        this.compressionProperties = compressionProperties;
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
        if (compressionProperties() != null) {
            compressionProperties().validate();
        }
    }
}
