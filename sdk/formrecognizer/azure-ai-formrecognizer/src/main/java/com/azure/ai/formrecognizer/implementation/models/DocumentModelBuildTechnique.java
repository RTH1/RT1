// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DocumentModelBuildTechnique. */
public final class DocumentModelBuildTechnique extends ExpandableStringEnum<DocumentModelBuildTechnique> {
    /** Static value fixedTemplate-2021-07-30 for DocumentModelBuildTechnique. */
    public static final DocumentModelBuildTechnique FIXED_TEMPLATE20210730 = fromString("fixedTemplate-2021-07-30");

    /**
     * Creates or finds a DocumentModelBuildTechnique from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DocumentModelBuildTechnique.
     */
    @JsonCreator
    public static DocumentModelBuildTechnique fromString(String name) {
        return fromString(name, DocumentModelBuildTechnique.class);
    }

    /** @return known DocumentModelBuildTechnique values. */
    public static Collection<DocumentModelBuildTechnique> values() {
        return values(DocumentModelBuildTechnique.class);
    }
}
