// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.batch.fluent.models.BatchAccountCreateProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Parameters supplied to the Create operation. */
@Fluent
public final class BatchAccountCreateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BatchAccountCreateParameters.class);

    /*
     * The region in which to create the account.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /*
     * The user-specified tags associated with the account.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * The properties of the Batch account.
     */
    @JsonProperty(value = "properties")
    private BatchAccountCreateProperties innerProperties;

    /*
     * The identity of the Batch account.
     */
    @JsonProperty(value = "identity")
    private BatchAccountIdentity identity;

    /**
     * Get the location property: The region in which to create the account.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The region in which to create the account.
     *
     * @param location the location value to set.
     * @return the BatchAccountCreateParameters object itself.
     */
    public BatchAccountCreateParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags property: The user-specified tags associated with the account.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The user-specified tags associated with the account.
     *
     * @param tags the tags value to set.
     * @return the BatchAccountCreateParameters object itself.
     */
    public BatchAccountCreateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the innerProperties property: The properties of the Batch account.
     *
     * @return the innerProperties value.
     */
    private BatchAccountCreateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the identity property: The identity of the Batch account.
     *
     * @return the identity value.
     */
    public BatchAccountIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the Batch account.
     *
     * @param identity the identity value to set.
     * @return the BatchAccountCreateParameters object itself.
     */
    public BatchAccountCreateParameters withIdentity(BatchAccountIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the autoStorage property: The properties related to the auto-storage account.
     *
     * @return the autoStorage value.
     */
    public AutoStorageBaseProperties autoStorage() {
        return this.innerProperties() == null ? null : this.innerProperties().autoStorage();
    }

    /**
     * Set the autoStorage property: The properties related to the auto-storage account.
     *
     * @param autoStorage the autoStorage value to set.
     * @return the BatchAccountCreateParameters object itself.
     */
    public BatchAccountCreateParameters withAutoStorage(AutoStorageBaseProperties autoStorage) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BatchAccountCreateProperties();
        }
        this.innerProperties().withAutoStorage(autoStorage);
        return this;
    }

    /**
     * Get the poolAllocationMode property: The pool allocation mode also affects how clients may authenticate to the
     * Batch Service API. If the mode is BatchService, clients may authenticate using access keys or Azure Active
     * Directory. If the mode is UserSubscription, clients must use Azure Active Directory. The default is BatchService.
     *
     * @return the poolAllocationMode value.
     */
    public PoolAllocationMode poolAllocationMode() {
        return this.innerProperties() == null ? null : this.innerProperties().poolAllocationMode();
    }

    /**
     * Set the poolAllocationMode property: The pool allocation mode also affects how clients may authenticate to the
     * Batch Service API. If the mode is BatchService, clients may authenticate using access keys or Azure Active
     * Directory. If the mode is UserSubscription, clients must use Azure Active Directory. The default is BatchService.
     *
     * @param poolAllocationMode the poolAllocationMode value to set.
     * @return the BatchAccountCreateParameters object itself.
     */
    public BatchAccountCreateParameters withPoolAllocationMode(PoolAllocationMode poolAllocationMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BatchAccountCreateProperties();
        }
        this.innerProperties().withPoolAllocationMode(poolAllocationMode);
        return this;
    }

    /**
     * Get the keyVaultReference property: A reference to the Azure key vault associated with the Batch account.
     *
     * @return the keyVaultReference value.
     */
    public KeyVaultReference keyVaultReference() {
        return this.innerProperties() == null ? null : this.innerProperties().keyVaultReference();
    }

    /**
     * Set the keyVaultReference property: A reference to the Azure key vault associated with the Batch account.
     *
     * @param keyVaultReference the keyVaultReference value to set.
     * @return the BatchAccountCreateParameters object itself.
     */
    public BatchAccountCreateParameters withKeyVaultReference(KeyVaultReference keyVaultReference) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BatchAccountCreateProperties();
        }
        this.innerProperties().withKeyVaultReference(keyVaultReference);
        return this;
    }

    /**
     * Get the publicNetworkAccess property: If not specified, the default value is 'enabled'.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccessType publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: If not specified, the default value is 'enabled'.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the BatchAccountCreateParameters object itself.
     */
    public BatchAccountCreateParameters withPublicNetworkAccess(PublicNetworkAccessType publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BatchAccountCreateProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Get the encryption property: Configures how customer data is encrypted inside the Batch account. By default,
     * accounts are encrypted using a Microsoft managed key. For additional control, a customer-managed key can be used
     * instead.
     *
     * @return the encryption value.
     */
    public EncryptionProperties encryption() {
        return this.innerProperties() == null ? null : this.innerProperties().encryption();
    }

    /**
     * Set the encryption property: Configures how customer data is encrypted inside the Batch account. By default,
     * accounts are encrypted using a Microsoft managed key. For additional control, a customer-managed key can be used
     * instead.
     *
     * @param encryption the encryption value to set.
     * @return the BatchAccountCreateParameters object itself.
     */
    public BatchAccountCreateParameters withEncryption(EncryptionProperties encryption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BatchAccountCreateProperties();
        }
        this.innerProperties().withEncryption(encryption);
        return this;
    }

    /**
     * Get the allowedAuthenticationModes property: List of allowed authentication modes for the Batch account that can
     * be used to authenticate with the data plane. This does not affect authentication with the control plane.
     *
     * @return the allowedAuthenticationModes value.
     */
    public List<AuthenticationMode> allowedAuthenticationModes() {
        return this.innerProperties() == null ? null : this.innerProperties().allowedAuthenticationModes();
    }

    /**
     * Set the allowedAuthenticationModes property: List of allowed authentication modes for the Batch account that can
     * be used to authenticate with the data plane. This does not affect authentication with the control plane.
     *
     * @param allowedAuthenticationModes the allowedAuthenticationModes value to set.
     * @return the BatchAccountCreateParameters object itself.
     */
    public BatchAccountCreateParameters withAllowedAuthenticationModes(
        List<AuthenticationMode> allowedAuthenticationModes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BatchAccountCreateProperties();
        }
        this.innerProperties().withAllowedAuthenticationModes(allowedAuthenticationModes);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (location() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property location in model BatchAccountCreateParameters"));
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }
}
