// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory;

import com.azure.core.util.Context;
import com.azure.resourcemanager.datafactory.models.ExposureControlBatchRequest;
import com.azure.resourcemanager.datafactory.models.ExposureControlRequest;
import java.util.Arrays;

/** Samples for ExposureControl QueryFeatureValuesByFactory. */
public final class ExposureControlQueryFeatureValuesByFactorySamples {
    /*
     * operationId: ExposureControl_QueryFeatureValuesByFactory
     * api-version: 2018-06-01
     * x-ms-examples: ExposureControl_QueryFeatureValuesByFactory
     */
    /**
     * Sample code: ExposureControl_QueryFeatureValuesByFactory.
     *
     * @param manager Entry point to DataFactoryManager.
     */
    public static void exposureControlQueryFeatureValuesByFactory(
        com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager
            .exposureControls()
            .queryFeatureValuesByFactoryWithResponse(
                "exampleResourceGroup",
                "exampleFactoryName",
                new ExposureControlBatchRequest()
                    .withExposureControlRequests(
                        Arrays
                            .asList(
                                new ExposureControlRequest()
                                    .withFeatureName("ADFIntegrationRuntimeSharingRbac")
                                    .withFeatureType("Feature"),
                                new ExposureControlRequest()
                                    .withFeatureName("ADFSampleFeature")
                                    .withFeatureType("Feature"))),
                Context.NONE);
    }
}
