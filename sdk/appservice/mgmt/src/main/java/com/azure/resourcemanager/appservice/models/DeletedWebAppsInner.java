// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
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
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.DefaultErrorResponseErrorException;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DeletedWebApps. */
public final class DeletedWebAppsInner {
    private final ClientLogger logger = new ClientLogger(DeletedWebAppsInner.class);

    /** The proxy service used to perform REST calls. */
    private final DeletedWebAppsService service;

    /** The service client containing this operation class. */
    private final WebSiteManagementClientImpl client;

    /**
     * Initializes an instance of DeletedWebAppsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    DeletedWebAppsInner(WebSiteManagementClientImpl client) {
        this.service =
            RestProxy.create(DeletedWebAppsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for WebSiteManagementClientDeletedWebApps to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "WebSiteManagementCli")
    private interface DeletedWebAppsService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Web/deletedSites")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DefaultErrorResponseErrorException.class)
        Mono<SimpleResponse<DeletedWebAppCollectionInner>> list(
            @HostParam("$host") String host,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Web/locations/{location}/deletedSites")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DefaultErrorResponseErrorException.class)
        Mono<SimpleResponse<DeletedWebAppCollectionInner>> listByLocation(
            @HostParam("$host") String host,
            @PathParam("location") String location,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Web/locations/{location}/deletedSites"
                + "/{deletedSiteId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DefaultErrorResponseErrorException.class)
        Mono<SimpleResponse<DeletedSiteInner>> getDeletedWebAppByLocation(
            @HostParam("$host") String host,
            @PathParam("location") String location,
            @PathParam("deletedSiteId") String deletedSiteId,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DefaultErrorResponseErrorException.class)
        Mono<SimpleResponse<DeletedWebAppCollectionInner>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DefaultErrorResponseErrorException.class)
        Mono<SimpleResponse<DeletedWebAppCollectionInner>> listByLocationNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Description for Get all deleted apps for a subscription.
     *
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of deleted apps.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DeletedSiteInner>> listSinglePageAsync() {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getHost(),
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            context))
            .<PagedResponse<DeletedSiteInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Description for Get all deleted apps for a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of deleted apps.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DeletedSiteInner>> listSinglePageAsync(Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        return service
            .list(this.client.getHost(), this.client.getSubscriptionId(), this.client.getApiVersion(), context)
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
     * Description for Get all deleted apps for a subscription.
     *
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of deleted apps.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DeletedSiteInner> listAsync() {
        return new PagedFlux<>(() -> listSinglePageAsync(), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Description for Get all deleted apps for a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of deleted apps.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DeletedSiteInner> listAsync(Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(context), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Description for Get all deleted apps for a subscription.
     *
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of deleted apps.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DeletedSiteInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Description for Get all deleted apps for a subscription at location.
     *
     * @param location The location parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of deleted apps.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DeletedSiteInner>> listByLocationSinglePageAsync(String location) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByLocation(
                            this.client.getHost(),
                            location,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            context))
            .<PagedResponse<DeletedSiteInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Description for Get all deleted apps for a subscription at location.
     *
     * @param location The location parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of deleted apps.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DeletedSiteInner>> listByLocationSinglePageAsync(String location, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        return service
            .listByLocation(
                this.client.getHost(), location, this.client.getSubscriptionId(), this.client.getApiVersion(), context)
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
     * Description for Get all deleted apps for a subscription at location.
     *
     * @param location The location parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of deleted apps.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DeletedSiteInner> listByLocationAsync(String location) {
        return new PagedFlux<>(
            () -> listByLocationSinglePageAsync(location), nextLink -> listByLocationNextSinglePageAsync(nextLink));
    }

    /**
     * Description for Get all deleted apps for a subscription at location.
     *
     * @param location The location parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of deleted apps.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DeletedSiteInner> listByLocationAsync(String location, Context context) {
        return new PagedFlux<>(
            () -> listByLocationSinglePageAsync(location, context),
            nextLink -> listByLocationNextSinglePageAsync(nextLink));
    }

    /**
     * Description for Get all deleted apps for a subscription at location.
     *
     * @param location The location parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of deleted apps.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DeletedSiteInner> listByLocation(String location) {
        return new PagedIterable<>(listByLocationAsync(location));
    }

    /**
     * Description for Get deleted app for a subscription at location.
     *
     * @param location The location parameter.
     * @param deletedSiteId The numeric ID of the deleted app, e.g. 12345.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deleted app.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<DeletedSiteInner>> getDeletedWebAppByLocationWithResponseAsync(
        String location, String deletedSiteId) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (deletedSiteId == null) {
            return Mono.error(new IllegalArgumentException("Parameter deletedSiteId is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getDeletedWebAppByLocation(
                            this.client.getHost(),
                            location,
                            deletedSiteId,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Description for Get deleted app for a subscription at location.
     *
     * @param location The location parameter.
     * @param deletedSiteId The numeric ID of the deleted app, e.g. 12345.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deleted app.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<DeletedSiteInner>> getDeletedWebAppByLocationWithResponseAsync(
        String location, String deletedSiteId, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (deletedSiteId == null) {
            return Mono.error(new IllegalArgumentException("Parameter deletedSiteId is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        return service
            .getDeletedWebAppByLocation(
                this.client.getHost(),
                location,
                deletedSiteId,
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                context);
    }

    /**
     * Description for Get deleted app for a subscription at location.
     *
     * @param location The location parameter.
     * @param deletedSiteId The numeric ID of the deleted app, e.g. 12345.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deleted app.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DeletedSiteInner> getDeletedWebAppByLocationAsync(String location, String deletedSiteId) {
        return getDeletedWebAppByLocationWithResponseAsync(location, deletedSiteId)
            .flatMap(
                (SimpleResponse<DeletedSiteInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Description for Get deleted app for a subscription at location.
     *
     * @param location The location parameter.
     * @param deletedSiteId The numeric ID of the deleted app, e.g. 12345.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deleted app.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DeletedSiteInner getDeletedWebAppByLocation(String location, String deletedSiteId) {
        return getDeletedWebAppByLocationAsync(location, deletedSiteId).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of deleted apps.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DeletedSiteInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, context))
            .<PagedResponse<DeletedSiteInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of deleted apps.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DeletedSiteInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return service
            .listNext(nextLink, context)
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
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of deleted apps.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DeletedSiteInner>> listByLocationNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return FluxUtil
            .withContext(context -> service.listByLocationNext(nextLink, context))
            .<PagedResponse<DeletedSiteInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of deleted apps.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DeletedSiteInner>> listByLocationNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return service
            .listByLocationNext(nextLink, context)
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
