// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.ApiKVReference;
import com.azure.resourcemanager.appservice.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The KeyVaultReferenceCollection model. */
@JsonFlatten
@Fluent
public class KeyVaultReferenceCollectionInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KeyVaultReferenceCollectionInner.class);

    /*
     * Dictionary of <ApiKVReference>
     */
    @JsonProperty(value = "properties.keyToReferenceStatuses")
    private Map<String, ApiKVReference> keyToReferenceStatuses;

    /**
     * Get the keyToReferenceStatuses property: Dictionary of &lt;ApiKVReference&gt;.
     *
     * @return the keyToReferenceStatuses value.
     */
    public Map<String, ApiKVReference> keyToReferenceStatuses() {
        return this.keyToReferenceStatuses;
    }

    /**
     * Set the keyToReferenceStatuses property: Dictionary of &lt;ApiKVReference&gt;.
     *
     * @param keyToReferenceStatuses the keyToReferenceStatuses value to set.
     * @return the KeyVaultReferenceCollectionInner object itself.
     */
    public KeyVaultReferenceCollectionInner withKeyToReferenceStatuses(
        Map<String, ApiKVReference> keyToReferenceStatuses) {
        this.keyToReferenceStatuses = keyToReferenceStatuses;
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
        if (keyToReferenceStatuses() != null) {
            keyToReferenceStatuses().values().forEach(e -> e.validate());
        }
    }
}
