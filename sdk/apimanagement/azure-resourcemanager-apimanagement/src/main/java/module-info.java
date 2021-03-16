// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.apimanagement {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.apimanagement;
    exports com.azure.resourcemanager.apimanagement.fluent;
    exports com.azure.resourcemanager.apimanagement.fluent.models;
    exports com.azure.resourcemanager.apimanagement.models;

    opens com.azure.resourcemanager.apimanagement.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.apimanagement.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}