/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring.models;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object model for updating a pattern.
 */
public class PatternRuleUpdateObject {
    /**
     * The pattern ID.
     */
    @JsonProperty(value = "id")
    private UUID id;

    /**
     * The pattern text.
     */
    @JsonProperty(value = "pattern")
    private String pattern;

    /**
     * The intent's name which the pattern belongs to.
     */
    @JsonProperty(value = "intent")
    private String intent;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public UUID id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the PatternRuleUpdateObject object itself.
     */
    public PatternRuleUpdateObject withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Get the pattern value.
     *
     * @return the pattern value
     */
    public String pattern() {
        return this.pattern;
    }

    /**
     * Set the pattern value.
     *
     * @param pattern the pattern value to set
     * @return the PatternRuleUpdateObject object itself.
     */
    public PatternRuleUpdateObject withPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * Get the intent value.
     *
     * @return the intent value
     */
    public String intent() {
        return this.intent;
    }

    /**
     * Set the intent value.
     *
     * @param intent the intent value to set
     * @return the PatternRuleUpdateObject object itself.
     */
    public PatternRuleUpdateObject withIntent(String intent) {
        this.intent = intent;
        return this;
    }

}
