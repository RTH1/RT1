// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Details of the Backend WebProxy Server to use in the Request to Backend. */
@Fluent
public final class BackendProxyContract {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BackendProxyContract.class);

    /*
     * WebProxy Server AbsoluteUri property which includes the entire URI
     * stored in the Uri instance, including all fragments and query strings.
     */
    @JsonProperty(value = "url", required = true)
    private String url;

    /*
     * Username to connect to the WebProxy server
     */
    @JsonProperty(value = "username")
    private String username;

    /*
     * Password to connect to the WebProxy Server
     */
    @JsonProperty(value = "password")
    private String password;

    /**
     * Get the url property: WebProxy Server AbsoluteUri property which includes the entire URI stored in the Uri
     * instance, including all fragments and query strings.
     *
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url property: WebProxy Server AbsoluteUri property which includes the entire URI stored in the Uri
     * instance, including all fragments and query strings.
     *
     * @param url the url value to set.
     * @return the BackendProxyContract object itself.
     */
    public BackendProxyContract withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the username property: Username to connect to the WebProxy server.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: Username to connect to the WebProxy server.
     *
     * @param username the username value to set.
     * @return the BackendProxyContract object itself.
     */
    public BackendProxyContract withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Password to connect to the WebProxy Server.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: Password to connect to the WebProxy Server.
     *
     * @param password the password value to set.
     * @return the BackendProxyContract object itself.
     */
    public BackendProxyContract withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (url() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property url in model BackendProxyContract"));
        }
    }
}