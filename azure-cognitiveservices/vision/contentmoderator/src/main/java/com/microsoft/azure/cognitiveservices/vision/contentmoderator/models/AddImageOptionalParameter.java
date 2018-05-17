/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.models;


/**
 * The AddImageOptionalParameter model.
 */
public class AddImageOptionalParameter {
    /**
     * Tag for the image.
     */
    private Integer tag;

    /**
     * The image label.
     */
    private String label;

    /**
     * Gets or sets the preferred language for the response.
     */
    private String acceptLanguage;

    /**
     * Get the tag value.
     *
     * @return the tag value
     */
    public Integer tag() {
        return this.tag;
    }

    /**
     * Set the tag value.
     *
     * @param tag the tag value to set
     * @return the AddImageOptionalParameter object itself.
     */
    public AddImageOptionalParameter withTag(Integer tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Get the label value.
     *
     * @return the label value
     */
    public String label() {
        return this.label;
    }

    /**
     * Set the label value.
     *
     * @param label the label value to set
     * @return the AddImageOptionalParameter object itself.
     */
    public AddImageOptionalParameter withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get the acceptLanguage value.
     *
     * @return the acceptLanguage value
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Set the acceptLanguage value.
     *
     * @param acceptLanguage the acceptLanguage value to set
     * @return the AddImageOptionalParameter object itself.
     */
    public AddImageOptionalParameter withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

}
