// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.networktraversal.implementation;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/** A builder for creating a new instance of the CommunicationNetworkingClient type. */
@ServiceClientBuilder(serviceClients = {CommunicationNetworkingClientImpl.class})
public final class CommunicationNetworkingClientImplBuilder {
    /*
     * The communication resource, for example
     * https://my-resource.communication.azure.com
     */
    private String endpoint;

    /**
     * Sets The communication resource, for example https://my-resource.communication.azure.com.
     *
     * @param endpoint the endpoint value.
     * @return the CommunicationNetworkingClientImplBuilder.
     */
    public CommunicationNetworkingClientImplBuilder endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     *
     * @param pipeline the pipeline value.
     * @return the CommunicationNetworkingClientImplBuilder.
     */
    public CommunicationNetworkingClientImplBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /*
     * The serializer to serialize an object into a string
     */
    private SerializerAdapter serializerAdapter;

    /**
     * Sets The serializer to serialize an object into a string.
     *
     * @param serializerAdapter the serializerAdapter value.
     * @return the CommunicationNetworkingClientImplBuilder.
     */
    public CommunicationNetworkingClientImplBuilder serializerAdapter(SerializerAdapter serializerAdapter) {
        this.serializerAdapter = serializerAdapter;
        return this;
    }

    /**
     * Builds an instance of CommunicationNetworkingClientImpl with the provided parameters.
     *
     * @return an instance of CommunicationNetworkingClientImpl.
     */
    public CommunicationNetworkingClientImpl buildClient() {
        if (pipeline == null) {
            this.pipeline =
                    new HttpPipelineBuilder()
                            .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                            .build();
        }
        if (serializerAdapter == null) {
            this.serializerAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        }
        CommunicationNetworkingClientImpl client =
                new CommunicationNetworkingClientImpl(pipeline, serializerAdapter, endpoint);
        return client;
    }
}
