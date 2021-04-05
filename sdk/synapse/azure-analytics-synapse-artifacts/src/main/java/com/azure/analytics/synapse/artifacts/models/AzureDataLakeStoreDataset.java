// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Azure Data Lake Store dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureDataLakeStoreFile")
@JsonFlatten
@Fluent
public class AzureDataLakeStoreDataset extends Dataset {
    /*
     * Path to the folder in the Azure Data Lake Store. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.folderPath")
    private Object folderPath;

    /*
     * The name of the file in the Azure Data Lake Store. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.fileName")
    private Object fileName;

    /*
     * The format of the Data Lake Store.
     */
    @JsonProperty(value = "typeProperties.format")
    private DatasetStorageFormat format;

    /*
     * The data compression method used for the item(s) in the Azure Data Lake
     * Store.
     */
    @JsonProperty(value = "typeProperties.compression")
    private DatasetCompression compression;

    /**
     * Get the folderPath property: Path to the folder in the Azure Data Lake Store. Type: string (or Expression with
     * resultType string).
     *
     * @return the folderPath value.
     */
    public Object getFolderPath() {
        return this.folderPath;
    }

    /**
     * Set the folderPath property: Path to the folder in the Azure Data Lake Store. Type: string (or Expression with
     * resultType string).
     *
     * @param folderPath the folderPath value to set.
     * @return the AzureDataLakeStoreDataset object itself.
     */
    public AzureDataLakeStoreDataset setFolderPath(Object folderPath) {
        this.folderPath = folderPath;
        return this;
    }

    /**
     * Get the fileName property: The name of the file in the Azure Data Lake Store. Type: string (or Expression with
     * resultType string).
     *
     * @return the fileName value.
     */
    public Object getFileName() {
        return this.fileName;
    }

    /**
     * Set the fileName property: The name of the file in the Azure Data Lake Store. Type: string (or Expression with
     * resultType string).
     *
     * @param fileName the fileName value to set.
     * @return the AzureDataLakeStoreDataset object itself.
     */
    public AzureDataLakeStoreDataset setFileName(Object fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get the format property: The format of the Data Lake Store.
     *
     * @return the format value.
     */
    public DatasetStorageFormat getFormat() {
        return this.format;
    }

    /**
     * Set the format property: The format of the Data Lake Store.
     *
     * @param format the format value to set.
     * @return the AzureDataLakeStoreDataset object itself.
     */
    public AzureDataLakeStoreDataset setFormat(DatasetStorageFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Get the compression property: The data compression method used for the item(s) in the Azure Data Lake Store.
     *
     * @return the compression value.
     */
    public DatasetCompression getCompression() {
        return this.compression;
    }

    /**
     * Set the compression property: The data compression method used for the item(s) in the Azure Data Lake Store.
     *
     * @param compression the compression value to set.
     * @return the AzureDataLakeStoreDataset object itself.
     */
    public AzureDataLakeStoreDataset setCompression(DatasetCompression compression) {
        this.compression = compression;
        return this;
    }
}
