// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AssociationType. */
public final class AssociationType extends ExpandableStringEnum<AssociationType> {
    /** Static value Associated for AssociationType. */
    public static final AssociationType ASSOCIATED = fromString("Associated");

    /** Static value Contains for AssociationType. */
    public static final AssociationType CONTAINS = fromString("Contains");

    /**
     * Creates or finds a AssociationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AssociationType.
     */
    @JsonCreator
    public static AssociationType fromString(String name) {
        return fromString(name, AssociationType.class);
    }

    /** @return known AssociationType values. */
    public static Collection<AssociationType> values() {
        return values(AssociationType.class);
    }
}
