// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices;

import com.azure.core.util.Context;

/** Samples for Jobs Delete. */
public final class JobsDeleteSamples {
    /**
     * Sample code: Delete a Job.
     *
     * @param mediaServicesManager Entry point to MediaServicesManager. This Swagger was generated by the API Framework.
     */
    public static void deleteAJob(com.azure.resourcemanager.mediaservices.MediaServicesManager mediaServicesManager) {
        mediaServicesManager
            .jobs()
            .deleteWithResponse("contosoresources", "contosomedia", "exampleTransform", "jobToDelete", Context.NONE);
    }
}
