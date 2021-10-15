// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Schema of the Data property of an EventGridEvent for a Microsoft.KeyVault.VaultAccessPolicyChanged event. */
@Fluent
public final class KeyVaultAccessPolicyChangedEventData {
    /*
     * The id of the object that triggered this event.
     */
    @JsonProperty(value = "Id")
    private String id;

    /*
     * Key vault name of the object that triggered this event.
     */
    @JsonProperty(value = "VaultName")
    private String vaultName;

    /*
     * The type of the object that triggered this event
     */
    @JsonProperty(value = "ObjectType")
    private String objectType;

    /*
     * The name of the object that triggered this event
     */
    @JsonProperty(value = "ObjectName")
    private String objectName;

    /*
     * The version of the object that triggered this event
     */
    @JsonProperty(value = "Version")
    private String version;

    /*
     * Not before date of the object that triggered this event
     */
    @JsonProperty(value = "NBF")
    private Float nbf;

    /*
     * The expiration date of the object that triggered this event
     */
    @JsonProperty(value = "EXP")
    private Float exp;

    /**
     * Get the id property: The id of the object that triggered this event.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The id of the object that triggered this event.
     *
     * @param id the id value to set.
     * @return the KeyVaultAccessPolicyChangedEventData object itself.
     */
    public KeyVaultAccessPolicyChangedEventData setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the vaultName property: Key vault name of the object that triggered this event.
     *
     * @return the vaultName value.
     */
    public String getVaultName() {
        return this.vaultName;
    }

    /**
     * Set the vaultName property: Key vault name of the object that triggered this event.
     *
     * @param vaultName the vaultName value to set.
     * @return the KeyVaultAccessPolicyChangedEventData object itself.
     */
    public KeyVaultAccessPolicyChangedEventData setVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }

    /**
     * Get the objectType property: The type of the object that triggered this event.
     *
     * @return the objectType value.
     */
    public String getObjectType() {
        return this.objectType;
    }

    /**
     * Set the objectType property: The type of the object that triggered this event.
     *
     * @param objectType the objectType value to set.
     * @return the KeyVaultAccessPolicyChangedEventData object itself.
     */
    public KeyVaultAccessPolicyChangedEventData setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * Get the objectName property: The name of the object that triggered this event.
     *
     * @return the objectName value.
     */
    public String getObjectName() {
        return this.objectName;
    }

    /**
     * Set the objectName property: The name of the object that triggered this event.
     *
     * @param objectName the objectName value to set.
     * @return the KeyVaultAccessPolicyChangedEventData object itself.
     */
    public KeyVaultAccessPolicyChangedEventData setObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }

    /**
     * Get the version property: The version of the object that triggered this event.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version of the object that triggered this event.
     *
     * @param version the version value to set.
     * @return the KeyVaultAccessPolicyChangedEventData object itself.
     */
    public KeyVaultAccessPolicyChangedEventData setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the nbf property: Not before date of the object that triggered this event.
     *
     * @return the nbf value.
     */
    public Float getNbf() {
        return this.nbf;
    }

    /**
     * Set the nbf property: Not before date of the object that triggered this event.
     *
     * @param nbf the nbf value to set.
     * @return the KeyVaultAccessPolicyChangedEventData object itself.
     */
    public KeyVaultAccessPolicyChangedEventData setNbf(Float nbf) {
        this.nbf = nbf;
        return this;
    }

    /**
     * Get the exp property: The expiration date of the object that triggered this event.
     *
     * @return the exp value.
     */
    public Float getExp() {
        return this.exp;
    }

    /**
     * Set the exp property: The expiration date of the object that triggered this event.
     *
     * @param exp the exp value to set.
     * @return the KeyVaultAccessPolicyChangedEventData object itself.
     */
    public KeyVaultAccessPolicyChangedEventData setExp(Float exp) {
        this.exp = exp;
        return this;
    }
}
