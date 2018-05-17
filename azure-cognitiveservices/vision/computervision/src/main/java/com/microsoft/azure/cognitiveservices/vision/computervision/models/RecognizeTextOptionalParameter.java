/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;


/**
 * The optional parameters class for "recognizeText" method.
 */
public class RecognizeTextOptionalParameter {
    /**
    * If “true” is specified, handwriting recognition is performed. If this parameter is set to “false” or is not specified,
    *  printed text recognition is performed.
    */
    private Boolean detectHandwriting;

    /**
    * Get the detectHandwriting value.
    *
    * @return the detectHandwriting value
    */
    public Boolean detectHandwriting() {
        return this.detectHandwriting;
    }

    /**
    * Set the detectHandwriting value.
    * <p>
    * If “true” is specified, handwriting recognition is performed. If this parameter is set to “false” or is not specified,
    *  printed text recognition is performed.
    *
    * @param detectHandwriting the detectHandwriting value to set
    * @return the RecognizeTextOptionalParameter object itself.
    */
    public RecognizeTextOptionalParameter withDetectHandwriting(Boolean detectHandwriting) {
        this.detectHandwriting = detectHandwriting;
        return this;
    }

}
