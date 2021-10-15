// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ReplicationRole. */
public final class ReplicationRole extends ExpandableStringEnum<ReplicationRole> {
    /** Static value None for ReplicationRole. */
    public static final ReplicationRole NONE = fromString("None");

    /** Static value Source for ReplicationRole. */
    public static final ReplicationRole SOURCE = fromString("Source");

    /** Static value Replica for ReplicationRole. */
    public static final ReplicationRole REPLICA = fromString("Replica");

    /**
     * Creates or finds a ReplicationRole from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ReplicationRole.
     */
    @JsonCreator
    public static ReplicationRole fromString(String name) {
        return fromString(name, ReplicationRole.class);
    }

    /** @return known ReplicationRole values. */
    public static Collection<ReplicationRole> values() {
        return values(ReplicationRole.class);
    }
}
