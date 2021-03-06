// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Local storage content. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("local")
@Fluent
public final class LocalContentSource extends ContentSource {
    /*
     * Local path.
     */
    @JsonProperty(value = "path", required = true)
    private String path;

    /**
     * Get the path property: Local path.
     *
     * @return the path value.
     */
    public String getPath() {
        return this.path;
    }

    /**
     * Set the path property: Local path.
     *
     * @param path the path value to set.
     * @return the LocalContentSource object itself.
     */
    public LocalContentSource setPath(String path) {
        this.path = path;
        return this;
    }
}
