// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for ManagedIdentityType. */
public enum ManagedIdentityType {
    /** Enum value SystemAssigned. */
    SYSTEM_ASSIGNED("SystemAssigned"),

    /** Enum value UserAssigned. */
    USER_ASSIGNED("UserAssigned"),

    /** Enum value SystemAssigned, UserAssigned. */
    SYSTEM_ASSIGNED_USER_ASSIGNED("SystemAssigned, UserAssigned"),

    /** Enum value None. */
    NONE("None");

    /** The actual serialized value for a ManagedIdentityType instance. */
    private final String value;

    ManagedIdentityType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ManagedIdentityType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ManagedIdentityType object, or null if unable to parse.
     */
    @JsonCreator
    public static ManagedIdentityType fromString(String value) {
        ManagedIdentityType[] items = ManagedIdentityType.values();
        for (ManagedIdentityType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
