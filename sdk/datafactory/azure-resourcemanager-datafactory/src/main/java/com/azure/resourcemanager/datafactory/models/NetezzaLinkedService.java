// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.NetezzaLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Netezza linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Netezza")
@Fluent
public final class NetezzaLinkedService extends LinkedService {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetezzaLinkedService.class);

    /*
     * Netezza linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private NetezzaLinkedServiceTypeProperties innerTypeProperties = new NetezzaLinkedServiceTypeProperties();

    /**
     * Get the innerTypeProperties property: Netezza linked service properties.
     *
     * @return the innerTypeProperties value.
     */
    private NetezzaLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public NetezzaLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NetezzaLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NetezzaLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NetezzaLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the connectionString property: An ODBC connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     *
     * @return the connectionString value.
     */
    public Object connectionString() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().connectionString();
    }

    /**
     * Set the connectionString property: An ODBC connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     *
     * @param connectionString the connectionString value to set.
     * @return the NetezzaLinkedService object itself.
     */
    public NetezzaLinkedService withConnectionString(Object connectionString) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new NetezzaLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withConnectionString(connectionString);
        return this;
    }

    /**
     * Get the pwd property: The Azure key vault secret reference of password in connection string.
     *
     * @return the pwd value.
     */
    public AzureKeyVaultSecretReference pwd() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().pwd();
    }

    /**
     * Set the pwd property: The Azure key vault secret reference of password in connection string.
     *
     * @param pwd the pwd value to set.
     * @return the NetezzaLinkedService object itself.
     */
    public NetezzaLinkedService withPwd(AzureKeyVaultSecretReference pwd) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new NetezzaLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPwd(pwd);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the NetezzaLinkedService object itself.
     */
    public NetezzaLinkedService withEncryptedCredential(Object encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new NetezzaLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model NetezzaLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }
}
