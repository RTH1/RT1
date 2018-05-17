/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;


/**
 * The optional parameters class for "describeImageInStream" method.
 */
public class DescribeImageInStreamOptionalParameter {
    /**
    * Maximum number of candidate descriptions to be returned.  The default is 1.
    */
    private String maxCandidates;

    /**
    * Get the maxCandidates value.
    *
    * @return the maxCandidates value
    */
    public String maxCandidates() {
        return this.maxCandidates;
    }

    /**
    * Set the maxCandidates value.
    * <p>
    * Maximum number of candidate descriptions to be returned.  The default is 1.
    *
    * @param maxCandidates the maxCandidates value to set
    * @return the DescribeImageInStreamOptionalParameter object itself.
    */
    public DescribeImageInStreamOptionalParameter withMaxCandidates(String maxCandidates) {
        this.maxCandidates = maxCandidates;
        return this;
    }

}
