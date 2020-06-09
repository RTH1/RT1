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
import com.azure.resourcemanager.appservice.ProviderOsTypeSelected;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Providers. */
public final class ProvidersInner {
    private final ClientLogger logger = new ClientLogger(ProvidersInner.class);

    /** The proxy service used to perform REST calls. */
    private final ProvidersService service;

    /** The service client containing this operation class. */
    private final WebSiteManagementClientImpl client;

    /**
     * Initializes an instance of ProvidersInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ProvidersInner(WebSiteManagementClientImpl client) {
        this.service =
            RestProxy.create(ProvidersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for WebSiteManagementClientProviders to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "WebSiteManagementCli")
    private interface ProvidersService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/providers/Microsoft.Web/availableStacks")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DefaultErrorResponseErrorException.class)
        Mono<SimpleResponse<ApplicationStackCollectionInner>> getAvailableStacks(
            @HostParam("$host") String host,
            @QueryParam("osTypeSelected") ProviderOsTypeSelected osTypeSelected,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/providers/Microsoft.Web/operations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DefaultErrorResponseErrorException.class)
        Mono<SimpleResponse<CsmOperationCollectionInner>> listOperations(
            @HostParam("$host") String host, @QueryParam("api-version") String apiVersion, Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Web/availableStacks")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DefaultErrorResponseErrorException.class)
        Mono<SimpleResponse<ApplicationStackCollectionInner>> list(
            @HostParam("$host") String host,
            @QueryParam("osTypeSelected") ProviderOsTypeSelected osTypeSelected,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DefaultErrorResponseErrorException.class)
        Mono<SimpleResponse<ApplicationStackCollectionInner>> getAvailableStacksNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DefaultErrorResponseErrorException.class)
        Mono<SimpleResponse<CsmOperationCollectionInner>> listOperationsNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DefaultErrorResponseErrorException.class)
        Mono<SimpleResponse<ApplicationStackCollectionInner>> getAvailableStacksOnPremNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Description for Get available application frameworks and their versions.
     *
     * @param osTypeSelected The osTypeSelected parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Application Stacks.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ApplicationStackResourceInner>> getAvailableStacksSinglePageAsync(
        ProviderOsTypeSelected osTypeSelected) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getAvailableStacks(
                            this.client.getHost(), osTypeSelected, this.client.getApiVersion(), context))
            .<PagedResponse<ApplicationStackResourceInner>>map(
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
     * Description for Get available application frameworks and their versions.
     *
     * @param osTypeSelected The osTypeSelected parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Application Stacks.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ApplicationStackResourceInner>> getAvailableStacksSinglePageAsync(
        ProviderOsTypeSelected osTypeSelected, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        return service
            .getAvailableStacks(this.client.getHost(), osTypeSelected, this.client.getApiVersion(), context)
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
     * Description for Get available application frameworks and their versions.
     *
     * @param osTypeSelected The osTypeSelected parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Application Stacks.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ApplicationStackResourceInner> getAvailableStacksAsync(ProviderOsTypeSelected osTypeSelected) {
        return new PagedFlux<>(
            () -> getAvailableStacksSinglePageAsync(osTypeSelected),
            nextLink -> getAvailableStacksNextSinglePageAsync(nextLink));
    }

    /**
     * Description for Get available application frameworks and their versions.
     *
     * @param osTypeSelected The osTypeSelected parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Application Stacks.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ApplicationStackResourceInner> getAvailableStacksAsync(
        ProviderOsTypeSelected osTypeSelected, Context context) {
        return new PagedFlux<>(
            () -> getAvailableStacksSinglePageAsync(osTypeSelected, context),
            nextLink -> getAvailableStacksNextSinglePageAsync(nextLink));
    }

    /**
     * Description for Get available application frameworks and their versions.
     *
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Application Stacks.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ApplicationStackResourceInner> getAvailableStacksAsync() {
        final ProviderOsTypeSelected osTypeSelected = null;
        final Context context = null;
        return new PagedFlux<>(
            () -> getAvailableStacksSinglePageAsync(osTypeSelected),
            nextLink -> getAvailableStacksNextSinglePageAsync(nextLink));
    }

    /**
     * Description for Get available application frameworks and their versions.
     *
     * @param osTypeSelected The osTypeSelected parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Application Stacks.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ApplicationStackResourceInner> getAvailableStacks(ProviderOsTypeSelected osTypeSelected) {
        return new PagedIterable<>(getAvailableStacksAsync(osTypeSelected));
    }

    /**
     * Description for Get available application frameworks and their versions.
     *
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Application Stacks.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ApplicationStackResourceInner> getAvailableStacks() {
        final ProviderOsTypeSelected osTypeSelected = null;
        final Context context = null;
        return new PagedIterable<>(getAvailableStacksAsync(osTypeSelected));
    }

    /**
     * Description for Gets all available operations for the Microsoft.Web resource provider. Also exposes resource
     * metric definitions.
     *
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Azure resource manager operation metadata.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<CsmOperationDescriptionInner>> listOperationsSinglePageAsync() {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        return FluxUtil
            .withContext(context -> service.listOperations(this.client.getHost(), this.client.getApiVersion(), context))
            .<PagedResponse<CsmOperationDescriptionInner>>map(
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
     * Description for Gets all available operations for the Microsoft.Web resource provider. Also exposes resource
     * metric definitions.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Azure resource manager operation metadata.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<CsmOperationDescriptionInner>> listOperationsSinglePageAsync(Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        return service
            .listOperations(this.client.getHost(), this.client.getApiVersion(), context)
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
     * Description for Gets all available operations for the Microsoft.Web resource provider. Also exposes resource
     * metric definitions.
     *
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Azure resource manager operation metadata.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<CsmOperationDescriptionInner> listOperationsAsync() {
        return new PagedFlux<>(
            () -> listOperationsSinglePageAsync(), nextLink -> listOperationsNextSinglePageAsync(nextLink));
    }

    /**
     * Description for Gets all available operations for the Microsoft.Web resource provider. Also exposes resource
     * metric definitions.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Azure resource manager operation metadata.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<CsmOperationDescriptionInner> listOperationsAsync(Context context) {
        return new PagedFlux<>(
            () -> listOperationsSinglePageAsync(context), nextLink -> listOperationsNextSinglePageAsync(nextLink));
    }

    /**
     * Description for Gets all available operations for the Microsoft.Web resource provider. Also exposes resource
     * metric definitions.
     *
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Azure resource manager operation metadata.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<CsmOperationDescriptionInner> listOperations() {
        return new PagedIterable<>(listOperationsAsync());
    }

    /**
     * Description for Get available application frameworks and their versions.
     *
     * @param osTypeSelected The osTypeSelected parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Application Stacks.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ApplicationStackResourceInner>> listSinglePageAsync(
        ProviderOsTypeSelected osTypeSelected) {
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
                            osTypeSelected,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            context))
            .<PagedResponse<ApplicationStackResourceInner>>map(
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
     * Description for Get available application frameworks and their versions.
     *
     * @param osTypeSelected The osTypeSelected parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Application Stacks.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ApplicationStackResourceInner>> listSinglePageAsync(
        ProviderOsTypeSelected osTypeSelected, Context context) {
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
            .list(
                this.client.getHost(),
                osTypeSelected,
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                context)
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
     * Description for Get available application frameworks and their versions.
     *
     * @param osTypeSelected The osTypeSelected parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Application Stacks.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ApplicationStackResourceInner> listAsync(ProviderOsTypeSelected osTypeSelected) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(osTypeSelected),
            nextLink -> getAvailableStacksOnPremNextSinglePageAsync(nextLink));
    }

    /**
     * Description for Get available application frameworks and their versions.
     *
     * @param osTypeSelected The osTypeSelected parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Application Stacks.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ApplicationStackResourceInner> listAsync(ProviderOsTypeSelected osTypeSelected, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(osTypeSelected, context),
            nextLink -> getAvailableStacksOnPremNextSinglePageAsync(nextLink));
    }

    /**
     * Description for Get available application frameworks and their versions.
     *
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Application Stacks.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ApplicationStackResourceInner> listAsync() {
        final ProviderOsTypeSelected osTypeSelected = null;
        final Context context = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(osTypeSelected),
            nextLink -> getAvailableStacksOnPremNextSinglePageAsync(nextLink));
    }

    /**
     * Description for Get available application frameworks and their versions.
     *
     * @param osTypeSelected The osTypeSelected parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Application Stacks.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ApplicationStackResourceInner> list(ProviderOsTypeSelected osTypeSelected) {
        return new PagedIterable<>(listAsync(osTypeSelected));
    }

    /**
     * Description for Get available application frameworks and their versions.
     *
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Application Stacks.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ApplicationStackResourceInner> list() {
        final ProviderOsTypeSelected osTypeSelected = null;
        final Context context = null;
        return new PagedIterable<>(listAsync(osTypeSelected));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Application Stacks.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ApplicationStackResourceInner>> getAvailableStacksNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return FluxUtil
            .withContext(context -> service.getAvailableStacksNext(nextLink, context))
            .<PagedResponse<ApplicationStackResourceInner>>map(
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
     * @return collection of Application Stacks.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ApplicationStackResourceInner>> getAvailableStacksNextSinglePageAsync(
        String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return service
            .getAvailableStacksNext(nextLink, context)
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
     * @return collection of Azure resource manager operation metadata.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<CsmOperationDescriptionInner>> listOperationsNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return FluxUtil
            .withContext(context -> service.listOperationsNext(nextLink, context))
            .<PagedResponse<CsmOperationDescriptionInner>>map(
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
     * @return collection of Azure resource manager operation metadata.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<CsmOperationDescriptionInner>> listOperationsNextSinglePageAsync(
        String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return service
            .listOperationsNext(nextLink, context)
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
     * @return collection of Application Stacks.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ApplicationStackResourceInner>> getAvailableStacksOnPremNextSinglePageAsync(
        String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return FluxUtil
            .withContext(context -> service.getAvailableStacksOnPremNext(nextLink, context))
            .<PagedResponse<ApplicationStackResourceInner>>map(
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
     * @return collection of Application Stacks.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ApplicationStackResourceInner>> getAvailableStacksOnPremNextSinglePageAsync(
        String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return service
            .getAvailableStacksOnPremNext(nextLink, context)
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
