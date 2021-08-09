// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Access profile for managed cluster API server. */
@Fluent
public final class ManagedClusterApiServerAccessProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedClusterApiServerAccessProfile.class);

    /*
     * The IP ranges authorized to access the Kubernetes API server. IP ranges
     * are specified in CIDR format, e.g. 137.117.106.88/29. This feature is
     * not compatible with clusters that use Public IP Per Node, or clusters
     * that are using a Basic Load Balancer. For more information see [API
     * server authorized IP
     * ranges](https://docs.microsoft.com/azure/aks/api-server-authorized-ip-ranges).
     */
    @JsonProperty(value = "authorizedIPRanges")
    private List<String> authorizedIpRanges;

    /*
     * Whether to create the cluster as a private cluster or not. For more
     * details, see [Creating a private AKS
     * cluster](https://docs.microsoft.com/azure/aks/private-clusters).
     */
    @JsonProperty(value = "enablePrivateCluster")
    private Boolean enablePrivateCluster;

    /*
     * The private DNS zone mode for the cluster. The default is System. For
     * more details see [configure private DNS
     * zone](https://docs.microsoft.com/azure/aks/private-clusters#configure-private-dns-zone).
     * Allowed values are 'system' and 'none'.
     */
    @JsonProperty(value = "privateDNSZone")
    private String privateDnsZone;

    /*
     * Whether to create additional public FQDN for private cluster or not.
     */
    @JsonProperty(value = "enablePrivateClusterPublicFQDN")
    private Boolean enablePrivateClusterPublicFqdn;

    /**
     * Get the authorizedIpRanges property: The IP ranges authorized to access the Kubernetes API server. IP ranges are
     * specified in CIDR format, e.g. 137.117.106.88/29. This feature is not compatible with clusters that use Public IP
     * Per Node, or clusters that are using a Basic Load Balancer. For more information see [API server authorized IP
     * ranges](https://docs.microsoft.com/azure/aks/api-server-authorized-ip-ranges).
     *
     * @return the authorizedIpRanges value.
     */
    public List<String> authorizedIpRanges() {
        return this.authorizedIpRanges;
    }

    /**
     * Set the authorizedIpRanges property: The IP ranges authorized to access the Kubernetes API server. IP ranges are
     * specified in CIDR format, e.g. 137.117.106.88/29. This feature is not compatible with clusters that use Public IP
     * Per Node, or clusters that are using a Basic Load Balancer. For more information see [API server authorized IP
     * ranges](https://docs.microsoft.com/azure/aks/api-server-authorized-ip-ranges).
     *
     * @param authorizedIpRanges the authorizedIpRanges value to set.
     * @return the ManagedClusterApiServerAccessProfile object itself.
     */
    public ManagedClusterApiServerAccessProfile withAuthorizedIpRanges(List<String> authorizedIpRanges) {
        this.authorizedIpRanges = authorizedIpRanges;
        return this;
    }

    /**
     * Get the enablePrivateCluster property: Whether to create the cluster as a private cluster or not. For more
     * details, see [Creating a private AKS cluster](https://docs.microsoft.com/azure/aks/private-clusters).
     *
     * @return the enablePrivateCluster value.
     */
    public Boolean enablePrivateCluster() {
        return this.enablePrivateCluster;
    }

    /**
     * Set the enablePrivateCluster property: Whether to create the cluster as a private cluster or not. For more
     * details, see [Creating a private AKS cluster](https://docs.microsoft.com/azure/aks/private-clusters).
     *
     * @param enablePrivateCluster the enablePrivateCluster value to set.
     * @return the ManagedClusterApiServerAccessProfile object itself.
     */
    public ManagedClusterApiServerAccessProfile withEnablePrivateCluster(Boolean enablePrivateCluster) {
        this.enablePrivateCluster = enablePrivateCluster;
        return this;
    }

    /**
     * Get the privateDnsZone property: The private DNS zone mode for the cluster. The default is System. For more
     * details see [configure private DNS
     * zone](https://docs.microsoft.com/azure/aks/private-clusters#configure-private-dns-zone). Allowed values are
     * 'system' and 'none'.
     *
     * @return the privateDnsZone value.
     */
    public String privateDnsZone() {
        return this.privateDnsZone;
    }

    /**
     * Set the privateDnsZone property: The private DNS zone mode for the cluster. The default is System. For more
     * details see [configure private DNS
     * zone](https://docs.microsoft.com/azure/aks/private-clusters#configure-private-dns-zone). Allowed values are
     * 'system' and 'none'.
     *
     * @param privateDnsZone the privateDnsZone value to set.
     * @return the ManagedClusterApiServerAccessProfile object itself.
     */
    public ManagedClusterApiServerAccessProfile withPrivateDnsZone(String privateDnsZone) {
        this.privateDnsZone = privateDnsZone;
        return this;
    }

    /**
     * Get the enablePrivateClusterPublicFqdn property: Whether to create additional public FQDN for private cluster or
     * not.
     *
     * @return the enablePrivateClusterPublicFqdn value.
     */
    public Boolean enablePrivateClusterPublicFqdn() {
        return this.enablePrivateClusterPublicFqdn;
    }

    /**
     * Set the enablePrivateClusterPublicFqdn property: Whether to create additional public FQDN for private cluster or
     * not.
     *
     * @param enablePrivateClusterPublicFqdn the enablePrivateClusterPublicFqdn value to set.
     * @return the ManagedClusterApiServerAccessProfile object itself.
     */
    public ManagedClusterApiServerAccessProfile withEnablePrivateClusterPublicFqdn(
        Boolean enablePrivateClusterPublicFqdn) {
        this.enablePrivateClusterPublicFqdn = enablePrivateClusterPublicFqdn;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
