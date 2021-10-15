// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * A token filter that only keeps tokens with text contained in a specified list of words. This token filter is
 * implemented using Apache Lucene.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "@odata.type",
        visible = true)
@JsonTypeName("#Microsoft.Azure.Search.KeepTokenFilter")
@Fluent
public final class KeepTokenFilter extends TokenFilter {
    /*
     * Identifies the concrete type of the token filter.
     */
    @JsonTypeId
    @JsonProperty(value = "@odata.type", required = true)
    private String odataType = "#Microsoft.Azure.Search.KeepTokenFilter";

    /*
     * The list of words to keep.
     */
    @JsonProperty(value = "keepWords", required = true)
    private List<String> keepWords;

    /*
     * A value indicating whether to lower case all words first. Default is
     * false.
     */
    @JsonProperty(value = "keepWordsCase")
    private Boolean lowerCaseKeepWords;

    /**
     * Creates an instance of KeepTokenFilter class.
     *
     * @param name the name value to set.
     * @param keepWords the keepWords value to set.
     */
    @JsonCreator
    public KeepTokenFilter(
            @JsonProperty(value = "name", required = true) String name,
            @JsonProperty(value = "keepWords", required = true) List<String> keepWords) {
        super(name);
        this.keepWords = keepWords;
    }

    /**
     * Get the odataType property: Identifies the concrete type of the token filter.
     *
     * @return the odataType value.
     */
    public String getOdataType() {
        return this.odataType;
    }

    /**
     * Get the keepWords property: The list of words to keep.
     *
     * @return the keepWords value.
     */
    public List<String> getKeepWords() {
        return this.keepWords;
    }

    /**
     * Get the lowerCaseKeepWords property: A value indicating whether to lower case all words first. Default is false.
     *
     * @return the lowerCaseKeepWords value.
     */
    public Boolean isLowerCaseKeepWords() {
        return this.lowerCaseKeepWords;
    }

    /**
     * Set the lowerCaseKeepWords property: A value indicating whether to lower case all words first. Default is false.
     *
     * @param lowerCaseKeepWords the lowerCaseKeepWords value to set.
     * @return the KeepTokenFilter object itself.
     */
    public KeepTokenFilter setLowerCaseKeepWords(Boolean lowerCaseKeepWords) {
        this.lowerCaseKeepWords = lowerCaseKeepWords;
        return this;
    }
}
