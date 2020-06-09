// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * A single bucket of a facet query result. Reports the number of documents
 * with a field value falling within a particular range or having a particular
 * value or interval.
 */
@Fluent
public final class FacetResult {
    /*
     * Unmatched properties from the message are deserialized this collection
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /*
     * The approximate count of documents falling within the bucket described
     * by this facet.
     */
    @JsonProperty(value = "count", access = JsonProperty.Access.WRITE_ONLY)
    private Long count;

    /**
     * Get the additionalProperties property: Unmatched properties from the
     * message are deserialized this collection.
     *
     * @return the additionalProperties value.
     */
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Unmatched properties from the
     * message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the FacetResult object itself.
     */
    FacetResult setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get the count property: The approximate count of documents falling
     * within the bucket described by this facet.
     *
     * @return the count value.
     */
    public Long getCount() {
        return this.count;
    }
}
