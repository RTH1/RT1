// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Issue Attachment Contract details. */
@JsonFlatten
@Fluent
public class IssueAttachmentContractInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IssueAttachmentContractInner.class);

    /*
     * Filename by which the binary data will be saved.
     */
    @JsonProperty(value = "properties.title")
    private String title;

    /*
     * Either 'link' if content is provided via an HTTP link or the MIME type
     * of the Base64-encoded binary data provided in the 'content' property.
     */
    @JsonProperty(value = "properties.contentFormat")
    private String contentFormat;

    /*
     * An HTTP link or Base64-encoded binary data.
     */
    @JsonProperty(value = "properties.content")
    private String content;

    /**
     * Get the title property: Filename by which the binary data will be saved.
     *
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title property: Filename by which the binary data will be saved.
     *
     * @param title the title value to set.
     * @return the IssueAttachmentContractInner object itself.
     */
    public IssueAttachmentContractInner withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the contentFormat property: Either 'link' if content is provided via an HTTP link or the MIME type of the
     * Base64-encoded binary data provided in the 'content' property.
     *
     * @return the contentFormat value.
     */
    public String contentFormat() {
        return this.contentFormat;
    }

    /**
     * Set the contentFormat property: Either 'link' if content is provided via an HTTP link or the MIME type of the
     * Base64-encoded binary data provided in the 'content' property.
     *
     * @param contentFormat the contentFormat value to set.
     * @return the IssueAttachmentContractInner object itself.
     */
    public IssueAttachmentContractInner withContentFormat(String contentFormat) {
        this.contentFormat = contentFormat;
        return this;
    }

    /**
     * Get the content property: An HTTP link or Base64-encoded binary data.
     *
     * @return the content value.
     */
    public String content() {
        return this.content;
    }

    /**
     * Set the content property: An HTTP link or Base64-encoded binary data.
     *
     * @param content the content value to set.
     * @return the IssueAttachmentContractInner object itself.
     */
    public IssueAttachmentContractInner withContent(String content) {
        this.content = content;
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