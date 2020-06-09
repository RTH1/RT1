// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

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
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in NetworkInterfaceIpConfigurations. */
public final class NetworkInterfaceIpConfigurationsInner {
    private final ClientLogger logger = new ClientLogger(NetworkInterfaceIpConfigurationsInner.class);

    /** The proxy service used to perform REST calls. */
    private final NetworkInterfaceIpConfigurationsService service;

    /** The service client containing this operation class. */
    private final NetworkManagementClientImpl client;

    /**
     * Initializes an instance of NetworkInterfaceIpConfigurationsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    NetworkInterfaceIpConfigurationsInner(NetworkManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    NetworkInterfaceIpConfigurationsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for NetworkManagementClientNetworkInterfaceIpConfigurations to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementCli")
    private interface NetworkInterfaceIpConfigurationsService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network"
                + "/networkInterfaces/{networkInterfaceName}/ipConfigurations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<NetworkInterfaceIpConfigurationListResultInner>> list(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("networkInterfaceName") String networkInterfaceName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network"
                + "/networkInterfaces/{networkInterfaceName}/ipConfigurations/{ipConfigurationName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<NetworkInterfaceIpConfigurationInner>> get(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("networkInterfaceName") String networkInterfaceName,
            @PathParam("ipConfigurationName") String ipConfigurationName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<NetworkInterfaceIpConfigurationListResultInner>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Get all ip configurations in a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all ip configurations in a network interface.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<NetworkInterfaceIpConfigurationInner>> listSinglePageAsync(
        String resourceGroupName, String networkInterfaceName) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (networkInterfaceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter networkInterfaceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2019-06-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getHost(),
                            resourceGroupName,
                            networkInterfaceName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            context))
            .<PagedResponse<NetworkInterfaceIpConfigurationInner>>map(
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
     * Get all ip configurations in a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all ip configurations in a network interface.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<NetworkInterfaceIpConfigurationInner>> listSinglePageAsync(
        String resourceGroupName, String networkInterfaceName, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (networkInterfaceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter networkInterfaceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2019-06-01";
        return service
            .list(
                this.client.getHost(),
                resourceGroupName,
                networkInterfaceName,
                apiVersion,
                this.client.getSubscriptionId(),
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
     * Get all ip configurations in a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all ip configurations in a network interface.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<NetworkInterfaceIpConfigurationInner> listAsync(
        String resourceGroupName, String networkInterfaceName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, networkInterfaceName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Get all ip configurations in a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all ip configurations in a network interface.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<NetworkInterfaceIpConfigurationInner> listAsync(
        String resourceGroupName, String networkInterfaceName, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, networkInterfaceName, context),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Get all ip configurations in a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all ip configurations in a network interface.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<NetworkInterfaceIpConfigurationInner> list(
        String resourceGroupName, String networkInterfaceName) {
        return new PagedIterable<>(listAsync(resourceGroupName, networkInterfaceName));
    }

    /**
     * Gets the specified network interface ip configuration.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param ipConfigurationName The name of the ip configuration name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network interface ip configuration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<NetworkInterfaceIpConfigurationInner>> getWithResponseAsync(
        String resourceGroupName, String networkInterfaceName, String ipConfigurationName) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (networkInterfaceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter networkInterfaceName is required and cannot be null."));
        }
        if (ipConfigurationName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter ipConfigurationName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2019-06-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getHost(),
                            resourceGroupName,
                            networkInterfaceName,
                            ipConfigurationName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets the specified network interface ip configuration.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param ipConfigurationName The name of the ip configuration name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network interface ip configuration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<NetworkInterfaceIpConfigurationInner>> getWithResponseAsync(
        String resourceGroupName, String networkInterfaceName, String ipConfigurationName, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (networkInterfaceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter networkInterfaceName is required and cannot be null."));
        }
        if (ipConfigurationName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter ipConfigurationName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2019-06-01";
        return service
            .get(
                this.client.getHost(),
                resourceGroupName,
                networkInterfaceName,
                ipConfigurationName,
                apiVersion,
                this.client.getSubscriptionId(),
                context);
    }

    /**
     * Gets the specified network interface ip configuration.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param ipConfigurationName The name of the ip configuration name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network interface ip configuration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NetworkInterfaceIpConfigurationInner> getAsync(
        String resourceGroupName, String networkInterfaceName, String ipConfigurationName) {
        return getWithResponseAsync(resourceGroupName, networkInterfaceName, ipConfigurationName)
            .flatMap(
                (SimpleResponse<NetworkInterfaceIpConfigurationInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the specified network interface ip configuration.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param ipConfigurationName The name of the ip configuration name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network interface ip configuration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NetworkInterfaceIpConfigurationInner get(
        String resourceGroupName, String networkInterfaceName, String ipConfigurationName) {
        return getAsync(resourceGroupName, networkInterfaceName, ipConfigurationName).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for list ip configurations API service call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<NetworkInterfaceIpConfigurationInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, context))
            .<PagedResponse<NetworkInterfaceIpConfigurationInner>>map(
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
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for list ip configurations API service call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<NetworkInterfaceIpConfigurationInner>> listNextSinglePageAsync(
        String nextLink, Context context) {
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
}
