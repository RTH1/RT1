// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.monitor.models;

import com.azure.resourcemanager.monitor.fluent.models.MetricInner;
import com.azure.resourcemanager.resources.fluentcore.model.HasInnerModel;
import java.util.List;

/** The Azure metric entries are of type Metric. */
public interface Metric extends HasInnerModel<MetricInner> {
    /**
     * Get the metric Id.
     *
     * @return the id value
     */
    String id();

    /**
     * Get the resource type of the metric resource.
     *
     * @return the type value
     */
    String type();

    /**
     * Get the name and the display name of the metric, i.e. it is localizable string.
     *
     * @return the name value
     */
    LocalizableString name();

    /**
     * Get the unit of the metric.
     *
     * @return the unit value
     */
    Unit unit();

    /**
     * Get the time series returned when a data query is performed.
     *
     * @return the timeseries value
     */
    List<TimeSeriesElement> timeseries();
}
