/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_04_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for PartnerTopicReadinessState.
 */
public final class PartnerTopicReadinessState extends ExpandableStringEnum<PartnerTopicReadinessState> {
    /** Static value NotActivatedByUserYet for PartnerTopicReadinessState. */
    public static final PartnerTopicReadinessState NOT_ACTIVATED_BY_USER_YET = fromString("NotActivatedByUserYet");

    /** Static value ActivatedByUser for PartnerTopicReadinessState. */
    public static final PartnerTopicReadinessState ACTIVATED_BY_USER = fromString("ActivatedByUser");

    /** Static value DeactivatedByUser for PartnerTopicReadinessState. */
    public static final PartnerTopicReadinessState DEACTIVATED_BY_USER = fromString("DeactivatedByUser");

    /** Static value DeletedByUser for PartnerTopicReadinessState. */
    public static final PartnerTopicReadinessState DELETED_BY_USER = fromString("DeletedByUser");

    /**
     * Creates or finds a PartnerTopicReadinessState from its string representation.
     * @param name a name to look for
     * @return the corresponding PartnerTopicReadinessState
     */
    @JsonCreator
    public static PartnerTopicReadinessState fromString(String name) {
        return fromString(name, PartnerTopicReadinessState.class);
    }

    /**
     * @return known PartnerTopicReadinessState values
     */
    public static Collection<PartnerTopicReadinessState> values() {
        return values(PartnerTopicReadinessState.class);
    }
}
