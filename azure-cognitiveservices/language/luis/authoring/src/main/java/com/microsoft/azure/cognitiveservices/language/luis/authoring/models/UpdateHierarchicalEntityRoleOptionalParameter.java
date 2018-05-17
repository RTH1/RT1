/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring.models;


/**
 * The optional parameters class for "updateHierarchicalEntityRole" method.
 */
public class UpdateHierarchicalEntityRoleOptionalParameter {
    /**
    * The entity role name.
    */
    private String name;

    /**
    * Get the name value.
    *
    * @return the name value
    */
    public String name() {
        return this.name;
    }

    /**
    * Set the name value.
    * <p>
    * The entity role name.
    *
    * @param name the name value to set
    * @return the UpdateHierarchicalEntityRoleOptionalParameter object itself.
    */
    public UpdateHierarchicalEntityRoleOptionalParameter withName(String name) {
        this.name = name;
        return this;
    }

}
