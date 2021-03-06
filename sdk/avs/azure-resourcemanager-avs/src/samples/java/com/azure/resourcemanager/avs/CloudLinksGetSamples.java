// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs;

import com.azure.core.util.Context;

/** Samples for CloudLinks Get. */
public final class CloudLinksGetSamples {
    /**
     * Sample code: CloudLinks_Get.
     *
     * @param avsManager Entry point to AvsManager. Azure VMware Solution API.
     */
    public static void cloudLinksGet(com.azure.resourcemanager.avs.AvsManager avsManager) {
        avsManager.cloudLinks().getWithResponse("group1", "cloud1", "cloudLink1", Context.NONE);
    }
}
