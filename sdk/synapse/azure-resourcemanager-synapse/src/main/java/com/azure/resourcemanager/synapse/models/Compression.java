// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Compression. */
public final class Compression extends ExpandableStringEnum<Compression> {
    /** Static value None for Compression. */
    public static final Compression NONE = fromString("None");

    /** Static value GZip for Compression. */
    public static final Compression GZIP = fromString("GZip");

    /**
     * Creates or finds a Compression from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Compression.
     */
    @JsonCreator
    public static Compression fromString(String name) {
        return fromString(name, Compression.class);
    }

    /** @return known Compression values. */
    public static Collection<Compression> values() {
        return values(Compression.class);
    }
}
