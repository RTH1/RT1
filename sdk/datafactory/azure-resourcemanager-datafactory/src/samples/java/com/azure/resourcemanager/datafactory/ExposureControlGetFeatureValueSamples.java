// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory;

import com.azure.core.util.Context;
import com.azure.resourcemanager.datafactory.models.ExposureControlRequest;

/** Samples for ExposureControl GetFeatureValue. */
public final class ExposureControlGetFeatureValueSamples {
    /*
     * operationId: ExposureControl_GetFeatureValue
     * api-version: 2018-06-01
     * x-ms-examples: ExposureControl_GetFeatureValue
     */
    /**
     * Sample code: ExposureControl_GetFeatureValue.
     *
     * @param manager Entry point to DataFactoryManager.
     */
    public static void exposureControlGetFeatureValue(
        com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager
            .exposureControls()
            .getFeatureValueWithResponse(
                "WestEurope",
                new ExposureControlRequest()
                    .withFeatureName("ADFIntegrationRuntimeSharingRbac")
                    .withFeatureType("Feature"),
                Context.NONE);
    }
}
