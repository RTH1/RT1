// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.fluent.ActivityLogsClient;
import com.azure.resourcemanager.monitor.fluent.models.EventDataInner;
import com.azure.resourcemanager.monitor.models.EventDataCollection;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ActivityLogsClient. */
public final class ActivityLogsClientImpl implements ActivityLogsClient {
    private final ClientLogger logger = new ClientLogger(ActivityLogsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ActivityLogsService service;

    /** The service client containing this operation class. */
    private final MonitorClientImpl client;

    /**
     * Initializes an instance of ActivityLogsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ActivityLogsClientImpl(MonitorClientImpl client) {
        this.service =
            RestProxy.create(ActivityLogsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MonitorClientActivityLogs to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MonitorClientActivit")
    private interface ActivityLogsService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Insights/eventtypes/management/values")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<EventDataCollection>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @QueryParam("$filter") String filter,
            @QueryParam("$select") String select,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<EventDataCollection>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Provides the list of records from the activity logs.
     *
     * @param filter Reduces the set of data collected.&lt;br&gt;This argument is required and it also requires at least
     *     the start date/time.&lt;br&gt;The **$filter** argument is very restricted and allows only the following
     *     patterns.&lt;br&gt;- *List events for a resource group*: $filter=eventTimestamp ge
     *     '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and resourceGroupName eq
     *     'resourceGroupName'.&lt;br&gt;- *List events for resource*: $filter=eventTimestamp ge
     *     '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and resourceUri eq
     *     'resourceURI'.&lt;br&gt;- *List events for a subscription in a time range*: $filter=eventTimestamp ge
     *     '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z'.&lt;br&gt;- *List events
     *     for a resource provider*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le
     *     '2014-07-20T04:36:37.6407898Z' and resourceProvider eq 'resourceProviderName'.&lt;br&gt;- *List events for a
     *     correlation Id*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le
     *     '2014-07-20T04:36:37.6407898Z' and correlationId eq 'correlationID'.&lt;br&gt;&lt;br&gt;**NOTE**: No other
     *     syntax is allowed.
     * @param select Used to fetch events with only the given properties.&lt;br&gt;The **$select** argument is a comma
     *     separated list of property names to be returned. Possible values are: *authorization*, *claims*,
     *     *correlationId*, *description*, *eventDataId*, *eventName*, *eventTimestamp*, *httpRequest*, *level*,
     *     *operationId*, *operationName*, *properties*, *resourceGroupName*, *resourceProviderName*, *resourceId*,
     *     *status*, *submissionTimestamp*, *subStatus*, *subscriptionId*.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents collection of events.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<EventDataInner>> listSinglePageAsync(String filter, String select) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (filter == null) {
            return Mono.error(new IllegalArgumentException("Parameter filter is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2015-04-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            apiVersion,
                            filter,
                            select,
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .<PagedResponse<EventDataInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Provides the list of records from the activity logs.
     *
     * @param filter Reduces the set of data collected.&lt;br&gt;This argument is required and it also requires at least
     *     the start date/time.&lt;br&gt;The **$filter** argument is very restricted and allows only the following
     *     patterns.&lt;br&gt;- *List events for a resource group*: $filter=eventTimestamp ge
     *     '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and resourceGroupName eq
     *     'resourceGroupName'.&lt;br&gt;- *List events for resource*: $filter=eventTimestamp ge
     *     '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and resourceUri eq
     *     'resourceURI'.&lt;br&gt;- *List events for a subscription in a time range*: $filter=eventTimestamp ge
     *     '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z'.&lt;br&gt;- *List events
     *     for a resource provider*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le
     *     '2014-07-20T04:36:37.6407898Z' and resourceProvider eq 'resourceProviderName'.&lt;br&gt;- *List events for a
     *     correlation Id*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le
     *     '2014-07-20T04:36:37.6407898Z' and correlationId eq 'correlationID'.&lt;br&gt;&lt;br&gt;**NOTE**: No other
     *     syntax is allowed.
     * @param select Used to fetch events with only the given properties.&lt;br&gt;The **$select** argument is a comma
     *     separated list of property names to be returned. Possible values are: *authorization*, *claims*,
     *     *correlationId*, *description*, *eventDataId*, *eventName*, *eventTimestamp*, *httpRequest*, *level*,
     *     *operationId*, *operationName*, *properties*, *resourceGroupName*, *resourceProviderName*, *resourceId*,
     *     *status*, *submissionTimestamp*, *subStatus*, *subscriptionId*.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents collection of events.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<EventDataInner>> listSinglePageAsync(String filter, String select, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (filter == null) {
            return Mono.error(new IllegalArgumentException("Parameter filter is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2015-04-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(), apiVersion, filter, select, this.client.getSubscriptionId(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Provides the list of records from the activity logs.
     *
     * @param filter Reduces the set of data collected.&lt;br&gt;This argument is required and it also requires at least
     *     the start date/time.&lt;br&gt;The **$filter** argument is very restricted and allows only the following
     *     patterns.&lt;br&gt;- *List events for a resource group*: $filter=eventTimestamp ge
     *     '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and resourceGroupName eq
     *     'resourceGroupName'.&lt;br&gt;- *List events for resource*: $filter=eventTimestamp ge
     *     '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and resourceUri eq
     *     'resourceURI'.&lt;br&gt;- *List events for a subscription in a time range*: $filter=eventTimestamp ge
     *     '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z'.&lt;br&gt;- *List events
     *     for a resource provider*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le
     *     '2014-07-20T04:36:37.6407898Z' and resourceProvider eq 'resourceProviderName'.&lt;br&gt;- *List events for a
     *     correlation Id*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le
     *     '2014-07-20T04:36:37.6407898Z' and correlationId eq 'correlationID'.&lt;br&gt;&lt;br&gt;**NOTE**: No other
     *     syntax is allowed.
     * @param select Used to fetch events with only the given properties.&lt;br&gt;The **$select** argument is a comma
     *     separated list of property names to be returned. Possible values are: *authorization*, *claims*,
     *     *correlationId*, *description*, *eventDataId*, *eventName*, *eventTimestamp*, *httpRequest*, *level*,
     *     *operationId*, *operationName*, *properties*, *resourceGroupName*, *resourceProviderName*, *resourceId*,
     *     *status*, *submissionTimestamp*, *subStatus*, *subscriptionId*.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents collection of events.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<EventDataInner> listAsync(String filter, String select) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(filter, select), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Provides the list of records from the activity logs.
     *
     * @param filter Reduces the set of data collected.&lt;br&gt;This argument is required and it also requires at least
     *     the start date/time.&lt;br&gt;The **$filter** argument is very restricted and allows only the following
     *     patterns.&lt;br&gt;- *List events for a resource group*: $filter=eventTimestamp ge
     *     '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and resourceGroupName eq
     *     'resourceGroupName'.&lt;br&gt;- *List events for resource*: $filter=eventTimestamp ge
     *     '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and resourceUri eq
     *     'resourceURI'.&lt;br&gt;- *List events for a subscription in a time range*: $filter=eventTimestamp ge
     *     '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z'.&lt;br&gt;- *List events
     *     for a resource provider*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le
     *     '2014-07-20T04:36:37.6407898Z' and resourceProvider eq 'resourceProviderName'.&lt;br&gt;- *List events for a
     *     correlation Id*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le
     *     '2014-07-20T04:36:37.6407898Z' and correlationId eq 'correlationID'.&lt;br&gt;&lt;br&gt;**NOTE**: No other
     *     syntax is allowed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents collection of events.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<EventDataInner> listAsync(String filter) {
        final String select = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(filter, select), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Provides the list of records from the activity logs.
     *
     * @param filter Reduces the set of data collected.&lt;br&gt;This argument is required and it also requires at least
     *     the start date/time.&lt;br&gt;The **$filter** argument is very restricted and allows only the following
     *     patterns.&lt;br&gt;- *List events for a resource group*: $filter=eventTimestamp ge
     *     '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and resourceGroupName eq
     *     'resourceGroupName'.&lt;br&gt;- *List events for resource*: $filter=eventTimestamp ge
     *     '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and resourceUri eq
     *     'resourceURI'.&lt;br&gt;- *List events for a subscription in a time range*: $filter=eventTimestamp ge
     *     '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z'.&lt;br&gt;- *List events
     *     for a resource provider*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le
     *     '2014-07-20T04:36:37.6407898Z' and resourceProvider eq 'resourceProviderName'.&lt;br&gt;- *List events for a
     *     correlation Id*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le
     *     '2014-07-20T04:36:37.6407898Z' and correlationId eq 'correlationID'.&lt;br&gt;&lt;br&gt;**NOTE**: No other
     *     syntax is allowed.
     * @param select Used to fetch events with only the given properties.&lt;br&gt;The **$select** argument is a comma
     *     separated list of property names to be returned. Possible values are: *authorization*, *claims*,
     *     *correlationId*, *description*, *eventDataId*, *eventName*, *eventTimestamp*, *httpRequest*, *level*,
     *     *operationId*, *operationName*, *properties*, *resourceGroupName*, *resourceProviderName*, *resourceId*,
     *     *status*, *submissionTimestamp*, *subStatus*, *subscriptionId*.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents collection of events.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<EventDataInner> listAsync(String filter, String select, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(filter, select, context), nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Provides the list of records from the activity logs.
     *
     * @param filter Reduces the set of data collected.&lt;br&gt;This argument is required and it also requires at least
     *     the start date/time.&lt;br&gt;The **$filter** argument is very restricted and allows only the following
     *     patterns.&lt;br&gt;- *List events for a resource group*: $filter=eventTimestamp ge
     *     '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and resourceGroupName eq
     *     'resourceGroupName'.&lt;br&gt;- *List events for resource*: $filter=eventTimestamp ge
     *     '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and resourceUri eq
     *     'resourceURI'.&lt;br&gt;- *List events for a subscription in a time range*: $filter=eventTimestamp ge
     *     '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z'.&lt;br&gt;- *List events
     *     for a resource provider*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le
     *     '2014-07-20T04:36:37.6407898Z' and resourceProvider eq 'resourceProviderName'.&lt;br&gt;- *List events for a
     *     correlation Id*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le
     *     '2014-07-20T04:36:37.6407898Z' and correlationId eq 'correlationID'.&lt;br&gt;&lt;br&gt;**NOTE**: No other
     *     syntax is allowed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents collection of events.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<EventDataInner> list(String filter) {
        final String select = null;
        return new PagedIterable<>(listAsync(filter, select));
    }

    /**
     * Provides the list of records from the activity logs.
     *
     * @param filter Reduces the set of data collected.&lt;br&gt;This argument is required and it also requires at least
     *     the start date/time.&lt;br&gt;The **$filter** argument is very restricted and allows only the following
     *     patterns.&lt;br&gt;- *List events for a resource group*: $filter=eventTimestamp ge
     *     '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and resourceGroupName eq
     *     'resourceGroupName'.&lt;br&gt;- *List events for resource*: $filter=eventTimestamp ge
     *     '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z' and resourceUri eq
     *     'resourceURI'.&lt;br&gt;- *List events for a subscription in a time range*: $filter=eventTimestamp ge
     *     '2014-07-16T04:36:37.6407898Z' and eventTimestamp le '2014-07-20T04:36:37.6407898Z'.&lt;br&gt;- *List events
     *     for a resource provider*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le
     *     '2014-07-20T04:36:37.6407898Z' and resourceProvider eq 'resourceProviderName'.&lt;br&gt;- *List events for a
     *     correlation Id*: $filter=eventTimestamp ge '2014-07-16T04:36:37.6407898Z' and eventTimestamp le
     *     '2014-07-20T04:36:37.6407898Z' and correlationId eq 'correlationID'.&lt;br&gt;&lt;br&gt;**NOTE**: No other
     *     syntax is allowed.
     * @param select Used to fetch events with only the given properties.&lt;br&gt;The **$select** argument is a comma
     *     separated list of property names to be returned. Possible values are: *authorization*, *claims*,
     *     *correlationId*, *description*, *eventDataId*, *eventName*, *eventTimestamp*, *httpRequest*, *level*,
     *     *operationId*, *operationName*, *properties*, *resourceGroupName*, *resourceProviderName*, *resourceId*,
     *     *status*, *submissionTimestamp*, *subStatus*, *subscriptionId*.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents collection of events.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<EventDataInner> list(String filter, String select, Context context) {
        return new PagedIterable<>(listAsync(filter, select, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents collection of events.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<EventDataInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<EventDataInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents collection of events.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<EventDataInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}
