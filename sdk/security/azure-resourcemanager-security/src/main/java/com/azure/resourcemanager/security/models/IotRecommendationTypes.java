// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of IotRecommendationTypes. */
public interface IotRecommendationTypes {
    /**
     * List IoT recommendation types.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of recommendation types.
     */
    IotRecommendationTypeList list();

    /**
     * List IoT recommendation types.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of recommendation types.
     */
    Response<IotRecommendationTypeList> listWithResponse(Context context);

    /**
     * Get IoT recommendation type.
     *
     * @param iotRecommendationTypeName Name of the recommendation type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ioT recommendation type.
     */
    IotRecommendationType get(String iotRecommendationTypeName);

    /**
     * Get IoT recommendation type.
     *
     * @param iotRecommendationTypeName Name of the recommendation type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ioT recommendation type.
     */
    Response<IotRecommendationType> getWithResponse(String iotRecommendationTypeName, Context context);
}
