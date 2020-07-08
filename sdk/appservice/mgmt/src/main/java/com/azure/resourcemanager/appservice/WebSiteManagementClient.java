// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resources.fluentcore.AzureServiceClient;
import com.azure.resourcemanager.appservice.fluent.AppServiceCertificateOrdersClient;
import com.azure.resourcemanager.appservice.fluent.AppServiceEnvironmentsClient;
import com.azure.resourcemanager.appservice.fluent.AppServicePlansClient;
import com.azure.resourcemanager.appservice.fluent.CertificateRegistrationProvidersClient;
import com.azure.resourcemanager.appservice.fluent.CertificatesClient;
import com.azure.resourcemanager.appservice.fluent.DeletedWebAppsClient;
import com.azure.resourcemanager.appservice.fluent.DiagnosticsClient;
import com.azure.resourcemanager.appservice.fluent.DomainRegistrationProvidersClient;
import com.azure.resourcemanager.appservice.fluent.DomainsClient;
import com.azure.resourcemanager.appservice.fluent.ProvidersClient;
import com.azure.resourcemanager.appservice.fluent.RecommendationsClient;
import com.azure.resourcemanager.appservice.fluent.ResourceHealthMetadatasClient;
import com.azure.resourcemanager.appservice.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.appservice.fluent.StaticSitesClient;
import com.azure.resourcemanager.appservice.fluent.TopLevelDomainsClient;
import com.azure.resourcemanager.appservice.fluent.WebAppsClient;

/** Initializes a new instance of the WebSiteManagementClient type. */
@ServiceClient(builder = WebSiteManagementClientBuilder.class)
public final class WebSiteManagementClient extends AzureServiceClient {
    private final ClientLogger logger = new ClientLogger(WebSiteManagementClient.class);

    /** Your Azure subscription ID. This is a GUID-formatted string (e.g. 00000000-0000-0000-0000-000000000000). */
    private final String subscriptionId;

    /**
     * Gets Your Azure subscription ID. This is a GUID-formatted string (e.g. 00000000-0000-0000-0000-000000000000).
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** server parameter. */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The AppServiceCertificateOrdersClient object to access its operations. */
    private final AppServiceCertificateOrdersClient appServiceCertificateOrders;

    /**
     * Gets the AppServiceCertificateOrdersClient object to access its operations.
     *
     * @return the AppServiceCertificateOrdersClient object.
     */
    public AppServiceCertificateOrdersClient getAppServiceCertificateOrders() {
        return this.appServiceCertificateOrders;
    }

    /** The CertificateRegistrationProvidersClient object to access its operations. */
    private final CertificateRegistrationProvidersClient certificateRegistrationProviders;

    /**
     * Gets the CertificateRegistrationProvidersClient object to access its operations.
     *
     * @return the CertificateRegistrationProvidersClient object.
     */
    public CertificateRegistrationProvidersClient getCertificateRegistrationProviders() {
        return this.certificateRegistrationProviders;
    }

    /** The DomainsClient object to access its operations. */
    private final DomainsClient domains;

    /**
     * Gets the DomainsClient object to access its operations.
     *
     * @return the DomainsClient object.
     */
    public DomainsClient getDomains() {
        return this.domains;
    }

    /** The TopLevelDomainsClient object to access its operations. */
    private final TopLevelDomainsClient topLevelDomains;

    /**
     * Gets the TopLevelDomainsClient object to access its operations.
     *
     * @return the TopLevelDomainsClient object.
     */
    public TopLevelDomainsClient getTopLevelDomains() {
        return this.topLevelDomains;
    }

    /** The DomainRegistrationProvidersClient object to access its operations. */
    private final DomainRegistrationProvidersClient domainRegistrationProviders;

    /**
     * Gets the DomainRegistrationProvidersClient object to access its operations.
     *
     * @return the DomainRegistrationProvidersClient object.
     */
    public DomainRegistrationProvidersClient getDomainRegistrationProviders() {
        return this.domainRegistrationProviders;
    }

    /** The CertificatesClient object to access its operations. */
    private final CertificatesClient certificates;

    /**
     * Gets the CertificatesClient object to access its operations.
     *
     * @return the CertificatesClient object.
     */
    public CertificatesClient getCertificates() {
        return this.certificates;
    }

    /** The DeletedWebAppsClient object to access its operations. */
    private final DeletedWebAppsClient deletedWebApps;

    /**
     * Gets the DeletedWebAppsClient object to access its operations.
     *
     * @return the DeletedWebAppsClient object.
     */
    public DeletedWebAppsClient getDeletedWebApps() {
        return this.deletedWebApps;
    }

    /** The DiagnosticsClient object to access its operations. */
    private final DiagnosticsClient diagnostics;

    /**
     * Gets the DiagnosticsClient object to access its operations.
     *
     * @return the DiagnosticsClient object.
     */
    public DiagnosticsClient getDiagnostics() {
        return this.diagnostics;
    }

    /** The ProvidersClient object to access its operations. */
    private final ProvidersClient providers;

    /**
     * Gets the ProvidersClient object to access its operations.
     *
     * @return the ProvidersClient object.
     */
    public ProvidersClient getProviders() {
        return this.providers;
    }

    /** The RecommendationsClient object to access its operations. */
    private final RecommendationsClient recommendations;

    /**
     * Gets the RecommendationsClient object to access its operations.
     *
     * @return the RecommendationsClient object.
     */
    public RecommendationsClient getRecommendations() {
        return this.recommendations;
    }

    /** The ResourceProvidersClient object to access its operations. */
    private final ResourceProvidersClient resourceProviders;

    /**
     * Gets the ResourceProvidersClient object to access its operations.
     *
     * @return the ResourceProvidersClient object.
     */
    public ResourceProvidersClient getResourceProviders() {
        return this.resourceProviders;
    }

    /** The WebAppsClient object to access its operations. */
    private final WebAppsClient webApps;

    /**
     * Gets the WebAppsClient object to access its operations.
     *
     * @return the WebAppsClient object.
     */
    public WebAppsClient getWebApps() {
        return this.webApps;
    }

    /** The StaticSitesClient object to access its operations. */
    private final StaticSitesClient staticSites;

    /**
     * Gets the StaticSitesClient object to access its operations.
     *
     * @return the StaticSitesClient object.
     */
    public StaticSitesClient getStaticSites() {
        return this.staticSites;
    }

    /** The AppServiceEnvironmentsClient object to access its operations. */
    private final AppServiceEnvironmentsClient appServiceEnvironments;

    /**
     * Gets the AppServiceEnvironmentsClient object to access its operations.
     *
     * @return the AppServiceEnvironmentsClient object.
     */
    public AppServiceEnvironmentsClient getAppServiceEnvironments() {
        return this.appServiceEnvironments;
    }

    /** The AppServicePlansClient object to access its operations. */
    private final AppServicePlansClient appServicePlans;

    /**
     * Gets the AppServicePlansClient object to access its operations.
     *
     * @return the AppServicePlansClient object.
     */
    public AppServicePlansClient getAppServicePlans() {
        return this.appServicePlans;
    }

    /** The ResourceHealthMetadatasClient object to access its operations. */
    private final ResourceHealthMetadatasClient resourceHealthMetadatas;

    /**
     * Gets the ResourceHealthMetadatasClient object to access its operations.
     *
     * @return the ResourceHealthMetadatasClient object.
     */
    public ResourceHealthMetadatasClient getResourceHealthMetadatas() {
        return this.resourceHealthMetadatas;
    }

    /**
     * Initializes an instance of WebSiteManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param environment The Azure environment.
     */
    WebSiteManagementClient(
        HttpPipeline httpPipeline, AzureEnvironment environment, String subscriptionId, String endpoint) {
        super(httpPipeline, environment);
        this.httpPipeline = httpPipeline;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2019-08-01";
        this.appServiceCertificateOrders = new AppServiceCertificateOrdersClient(this);
        this.certificateRegistrationProviders = new CertificateRegistrationProvidersClient(this);
        this.domains = new DomainsClient(this);
        this.topLevelDomains = new TopLevelDomainsClient(this);
        this.domainRegistrationProviders = new DomainRegistrationProvidersClient(this);
        this.certificates = new CertificatesClient(this);
        this.deletedWebApps = new DeletedWebAppsClient(this);
        this.diagnostics = new DiagnosticsClient(this);
        this.providers = new ProvidersClient(this);
        this.recommendations = new RecommendationsClient(this);
        this.resourceProviders = new ResourceProvidersClient(this);
        this.webApps = new WebAppsClient(this);
        this.staticSites = new StaticSitesClient(this);
        this.appServiceEnvironments = new AppServiceEnvironmentsClient(this);
        this.appServicePlans = new AppServicePlansClient(this);
        this.resourceHealthMetadatas = new ResourceHealthMetadatasClient(this);
    }
}
