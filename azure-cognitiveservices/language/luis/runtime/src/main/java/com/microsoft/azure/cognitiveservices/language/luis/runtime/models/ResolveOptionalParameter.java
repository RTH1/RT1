/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.runtime.models;


/**
 * The ResolveOptionalParameter model.
 */
public class ResolveOptionalParameter {
    /**
     * The timezone offset for the location of the request.
     */
    private Double timezoneOffset;

    /**
     * If true, return all intents instead of just the top scoring intent.
     */
    private Boolean verbose;

    /**
     * Use the staging endpoint slot.
     */
    private Boolean staging;

    /**
     * Enable spell checking.
     */
    private Boolean spellCheck;

    /**
     * The subscription key to use when enabling bing spell check.
     */
    private String bingSpellCheckSubscriptionKey;

    /**
     * Log query (default is true).
     */
    private Boolean log;

    /**
     * Gets or sets the preferred language for the response.
     */
    private String acceptLanguage;

    /**
     * Get the timezoneOffset value.
     *
     * @return the timezoneOffset value
     */
    public Double timezoneOffset() {
        return this.timezoneOffset;
    }

    /**
     * Set the timezoneOffset value.
     *
     * @param timezoneOffset the timezoneOffset value to set
     * @return the ResolveOptionalParameter object itself.
     */
    public ResolveOptionalParameter withTimezoneOffset(Double timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
        return this;
    }

    /**
     * Get the verbose value.
     *
     * @return the verbose value
     */
    public Boolean verbose() {
        return this.verbose;
    }

    /**
     * Set the verbose value.
     *
     * @param verbose the verbose value to set
     * @return the ResolveOptionalParameter object itself.
     */
    public ResolveOptionalParameter withVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }

    /**
     * Get the staging value.
     *
     * @return the staging value
     */
    public Boolean staging() {
        return this.staging;
    }

    /**
     * Set the staging value.
     *
     * @param staging the staging value to set
     * @return the ResolveOptionalParameter object itself.
     */
    public ResolveOptionalParameter withStaging(Boolean staging) {
        this.staging = staging;
        return this;
    }

    /**
     * Get the spellCheck value.
     *
     * @return the spellCheck value
     */
    public Boolean spellCheck() {
        return this.spellCheck;
    }

    /**
     * Set the spellCheck value.
     *
     * @param spellCheck the spellCheck value to set
     * @return the ResolveOptionalParameter object itself.
     */
    public ResolveOptionalParameter withSpellCheck(Boolean spellCheck) {
        this.spellCheck = spellCheck;
        return this;
    }

    /**
     * Get the bingSpellCheckSubscriptionKey value.
     *
     * @return the bingSpellCheckSubscriptionKey value
     */
    public String bingSpellCheckSubscriptionKey() {
        return this.bingSpellCheckSubscriptionKey;
    }

    /**
     * Set the bingSpellCheckSubscriptionKey value.
     *
     * @param bingSpellCheckSubscriptionKey the bingSpellCheckSubscriptionKey value to set
     * @return the ResolveOptionalParameter object itself.
     */
    public ResolveOptionalParameter withBingSpellCheckSubscriptionKey(String bingSpellCheckSubscriptionKey) {
        this.bingSpellCheckSubscriptionKey = bingSpellCheckSubscriptionKey;
        return this;
    }

    /**
     * Get the log value.
     *
     * @return the log value
     */
    public Boolean log() {
        return this.log;
    }

    /**
     * Set the log value.
     *
     * @param log the log value to set
     * @return the ResolveOptionalParameter object itself.
     */
    public ResolveOptionalParameter withLog(Boolean log) {
        this.log = log;
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
     * @return the ResolveOptionalParameter object itself.
     */
    public ResolveOptionalParameter withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

}
