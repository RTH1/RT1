// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption;

import com.azure.core.util.Context;

/** Samples for Forecasts List. */
public final class ForecastsListSamples {
    /**
     * Sample code: ForecastsList.
     *
     * @param consumptionManager Entry point to ConsumptionManager. Consumption management client provides access to
     *     consumption resources for Azure Enterprise Subscriptions.
     */
    public static void forecastsList(com.azure.resourcemanager.consumption.ConsumptionManager consumptionManager) {
        consumptionManager.forecasts().list(null, Context.NONE);
    }

    /**
     * Sample code: ForecastsListFilterByDates.
     *
     * @param consumptionManager Entry point to ConsumptionManager. Consumption management client provides access to
     *     consumption resources for Azure Enterprise Subscriptions.
     */
    public static void forecastsListFilterByDates(
        com.azure.resourcemanager.consumption.ConsumptionManager consumptionManager) {
        consumptionManager
            .forecasts()
            .list("properties/usagedate ge '2018-04-01' AND properties/usagedate le '2018-04-02'", Context.NONE);
    }

    /**
     * Sample code: ForecastsListFilterByGrain.
     *
     * @param consumptionManager Entry point to ConsumptionManager. Consumption management client provides access to
     *     consumption resources for Azure Enterprise Subscriptions.
     */
    public static void forecastsListFilterByGrain(
        com.azure.resourcemanager.consumption.ConsumptionManager consumptionManager) {
        consumptionManager.forecasts().list("properties/Grain eq 'Monthly'", Context.NONE);
    }
}
