// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.http.policy.ArmChallengeAuthenticationPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.iothub.fluent.IotHubClient;
import com.azure.resourcemanager.iothub.implementation.CertificatesImpl;
import com.azure.resourcemanager.iothub.implementation.IotHubClientBuilder;
import com.azure.resourcemanager.iothub.implementation.IotHubResourcesImpl;
import com.azure.resourcemanager.iothub.implementation.IotHubsImpl;
import com.azure.resourcemanager.iothub.implementation.OperationsImpl;
import com.azure.resourcemanager.iothub.implementation.PrivateEndpointConnectionsImpl;
import com.azure.resourcemanager.iothub.implementation.PrivateLinkResourcesOperationsImpl;
import com.azure.resourcemanager.iothub.implementation.ResourceProviderCommonsImpl;
import com.azure.resourcemanager.iothub.models.Certificates;
import com.azure.resourcemanager.iothub.models.IotHubResources;
import com.azure.resourcemanager.iothub.models.IotHubs;
import com.azure.resourcemanager.iothub.models.Operations;
import com.azure.resourcemanager.iothub.models.PrivateEndpointConnections;
import com.azure.resourcemanager.iothub.models.PrivateLinkResourcesOperations;
import com.azure.resourcemanager.iothub.models.ResourceProviderCommons;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Entry point to IotHubManager. Use this API to manage the IoT hubs in your Azure subscription. */
public final class IotHubManager {
    private Operations operations;

    private IotHubResources iotHubResources;

    private ResourceProviderCommons resourceProviderCommons;

    private Certificates certificates;

    private IotHubs iotHubs;

    private PrivateLinkResourcesOperations privateLinkResourcesOperations;

    private PrivateEndpointConnections privateEndpointConnections;

    private final IotHubClient clientObject;

    private IotHubManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new IotHubClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of IotHub service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the IotHub service API instance.
     */
    public static IotHubManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create IotHubManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new IotHubManager.Configurable();
    }

    /** The Configurable allowing configurations to be set. */
    public static final class Configurable {
        private final ClientLogger logger = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private final List<String> scopes = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private Duration defaultPollInterval;

        private Configurable() {
        }

        /**
         * Sets the http client.
         *
         * @param httpClient the HTTP client.
         * @return the configurable object itself.
         */
        public Configurable withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
            return this;
        }

        /**
         * Sets the logging options to the HTTP pipeline.
         *
         * @param httpLogOptions the HTTP log options.
         * @return the configurable object itself.
         */
        public Configurable withLogOptions(HttpLogOptions httpLogOptions) {
            this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'httpLogOptions' cannot be null.");
            return this;
        }

        /**
         * Adds the pipeline policy to the HTTP pipeline.
         *
         * @param policy the HTTP pipeline policy.
         * @return the configurable object itself.
         */
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            this.policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
            return this;
        }

        /**
         * Adds the scope to permission sets.
         *
         * @param scope the scope.
         * @return the configurable object itself.
         */
        public Configurable withScope(String scope) {
            this.scopes.add(Objects.requireNonNull(scope, "'scope' cannot be null."));
            return this;
        }

        /**
         * Sets the retry policy to the HTTP pipeline.
         *
         * @param retryPolicy the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide "Retry-After" header.
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval = Objects.requireNonNull(defaultPollInterval, "'retryPolicy' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw logger.logExceptionAsError(new IllegalArgumentException("'httpPipeline' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of IotHub service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the IotHub service API instance.
         */
        public IotHubManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.iothub")
                .append("/")
                .append("1.1.0");
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder
                    .append(" (")
                    .append(Configuration.getGlobalConfiguration().get("java.version"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.name"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.version"))
                    .append("; auto-generated)");
            } else {
                userAgentBuilder.append(" (auto-generated)");
            }

            if (scopes.isEmpty()) {
                scopes.add(profile.getEnvironment().getManagementEndpoint() + "/.default");
            }
            if (retryPolicy == null) {
                retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies.add(new UserAgentPolicy(userAgentBuilder.toString()));
            policies.add(new RequestIdPolicy());
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies.add(new ArmChallengeAuthenticationPolicy(credential, scopes.toArray(new String[0])));
            policies.addAll(this.policies);
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                    .httpClient(httpClient)
                    .policies(policies.toArray(new HttpPipelinePolicy[0]))
                    .build();
            return new IotHubManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of Operations. */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /** @return Resource collection API of IotHubResources. */
    public IotHubResources iotHubResources() {
        if (this.iotHubResources == null) {
            this.iotHubResources = new IotHubResourcesImpl(clientObject.getIotHubResources(), this);
        }
        return iotHubResources;
    }

    /** @return Resource collection API of ResourceProviderCommons. */
    public ResourceProviderCommons resourceProviderCommons() {
        if (this.resourceProviderCommons == null) {
            this.resourceProviderCommons =
                new ResourceProviderCommonsImpl(clientObject.getResourceProviderCommons(), this);
        }
        return resourceProviderCommons;
    }

    /** @return Resource collection API of Certificates. */
    public Certificates certificates() {
        if (this.certificates == null) {
            this.certificates = new CertificatesImpl(clientObject.getCertificates(), this);
        }
        return certificates;
    }

    /** @return Resource collection API of IotHubs. */
    public IotHubs iotHubs() {
        if (this.iotHubs == null) {
            this.iotHubs = new IotHubsImpl(clientObject.getIotHubs(), this);
        }
        return iotHubs;
    }

    /** @return Resource collection API of PrivateLinkResourcesOperations. */
    public PrivateLinkResourcesOperations privateLinkResourcesOperations() {
        if (this.privateLinkResourcesOperations == null) {
            this.privateLinkResourcesOperations =
                new PrivateLinkResourcesOperationsImpl(clientObject.getPrivateLinkResourcesOperations(), this);
        }
        return privateLinkResourcesOperations;
    }

    /** @return Resource collection API of PrivateEndpointConnections. */
    public PrivateEndpointConnections privateEndpointConnections() {
        if (this.privateEndpointConnections == null) {
            this.privateEndpointConnections =
                new PrivateEndpointConnectionsImpl(clientObject.getPrivateEndpointConnections(), this);
        }
        return privateEndpointConnections;
    }

    /**
     * @return Wrapped service client IotHubClient providing direct access to the underlying auto-generated API
     *     implementation, based on Azure REST API.
     */
    public IotHubClient serviceClient() {
        return this.clientObject;
    }
}
