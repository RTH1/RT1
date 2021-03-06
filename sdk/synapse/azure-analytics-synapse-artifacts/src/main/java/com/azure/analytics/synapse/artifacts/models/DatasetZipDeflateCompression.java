// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The ZipDeflate compression method used on a dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ZipDeflate")
@Fluent
public final class DatasetZipDeflateCompression extends DatasetCompression {
    /*
     * The ZipDeflate compression level. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "level")
    private Object level;

    /**
     * Get the level property: The ZipDeflate compression level. Type: string (or Expression with resultType string).
     *
     * @return the level value.
     */
    public Object getLevel() {
        return this.level;
    }

    /**
     * Set the level property: The ZipDeflate compression level. Type: string (or Expression with resultType string).
     *
     * @param level the level value to set.
     * @return the DatasetZipDeflateCompression object itself.
     */
    public DatasetZipDeflateCompression setLevel(Object level) {
        this.level = level;
        return this;
    }
}
