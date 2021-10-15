// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.HostingEnvironmentProfile;
import com.azure.resourcemanager.appservice.models.KubeEnvironmentProfile;
import com.azure.resourcemanager.appservice.models.ProvisioningState;
import com.azure.resourcemanager.appservice.models.StatusOptions;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** AppServicePlan resource specific properties. */
@Fluent
public final class AppServicePlanProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AppServicePlanProperties.class);

    /*
     * Target worker tier assigned to the App Service plan.
     */
    @JsonProperty(value = "workerTierName")
    private String workerTierName;

    /*
     * App Service plan status.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private StatusOptions status;

    /*
     * App Service plan subscription.
     */
    @JsonProperty(value = "subscription", access = JsonProperty.Access.WRITE_ONLY)
    private String subscription;

    /*
     * Specification for the App Service Environment to use for the App Service
     * plan.
     */
    @JsonProperty(value = "hostingEnvironmentProfile")
    private HostingEnvironmentProfile hostingEnvironmentProfile;

    /*
     * Maximum number of instances that can be assigned to this App Service
     * plan.
     */
    @JsonProperty(value = "maximumNumberOfWorkers", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maximumNumberOfWorkers;

    /*
     * Geographical location for the App Service plan.
     */
    @JsonProperty(value = "geoRegion", access = JsonProperty.Access.WRITE_ONLY)
    private String geoRegion;

    /*
     * If <code>true</code>, apps assigned to this App Service plan can be
     * scaled independently.
     * If <code>false</code>, apps assigned to this App Service plan will scale
     * to all instances of the plan.
     */
    @JsonProperty(value = "perSiteScaling")
    private Boolean perSiteScaling;

    /*
     * ServerFarm supports ElasticScale. Apps in this plan will scale as if the
     * ServerFarm was ElasticPremium sku
     */
    @JsonProperty(value = "elasticScaleEnabled")
    private Boolean elasticScaleEnabled;

    /*
     * Maximum number of total workers allowed for this ElasticScaleEnabled App
     * Service Plan
     */
    @JsonProperty(value = "maximumElasticWorkerCount")
    private Integer maximumElasticWorkerCount;

    /*
     * Number of apps assigned to this App Service plan.
     */
    @JsonProperty(value = "numberOfSites", access = JsonProperty.Access.WRITE_ONLY)
    private Integer numberOfSites;

    /*
     * If <code>true</code>, this App Service Plan owns spot instances.
     */
    @JsonProperty(value = "isSpot")
    private Boolean isSpot;

    /*
     * The time when the server farm expires. Valid only if it is a spot server
     * farm.
     */
    @JsonProperty(value = "spotExpirationTime")
    private OffsetDateTime spotExpirationTime;

    /*
     * The time when the server farm free offer expires.
     */
    @JsonProperty(value = "freeOfferExpirationTime")
    private OffsetDateTime freeOfferExpirationTime;

    /*
     * Resource group of the App Service plan.
     */
    @JsonProperty(value = "resourceGroup", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGroup;

    /*
     * If Linux app service plan <code>true</code>, <code>false</code>
     * otherwise.
     */
    @JsonProperty(value = "reserved")
    private Boolean reserved;

    /*
     * Obsolete: If Hyper-V container app service plan <code>true</code>,
     * <code>false</code> otherwise.
     */
    @JsonProperty(value = "isXenon")
    private Boolean isXenon;

    /*
     * If Hyper-V container app service plan <code>true</code>,
     * <code>false</code> otherwise.
     */
    @JsonProperty(value = "hyperV")
    private Boolean hyperV;

    /*
     * Scaling worker count.
     */
    @JsonProperty(value = "targetWorkerCount")
    private Integer targetWorkerCount;

    /*
     * Scaling worker size ID.
     */
    @JsonProperty(value = "targetWorkerSizeId")
    private Integer targetWorkerSizeId;

    /*
     * Provisioning state of the App Service Plan.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Specification for the Kubernetes Environment to use for the App Service
     * plan.
     */
    @JsonProperty(value = "kubeEnvironmentProfile")
    private KubeEnvironmentProfile kubeEnvironmentProfile;

    /*
     * If <code>true</code>, this App Service Plan will perform availability
     * zone balancing.
     * If <code>false</code>, this App Service Plan will not perform
     * availability zone balancing.
     */
    @JsonProperty(value = "zoneRedundant")
    private Boolean zoneRedundant;

    /**
     * Get the workerTierName property: Target worker tier assigned to the App Service plan.
     *
     * @return the workerTierName value.
     */
    public String workerTierName() {
        return this.workerTierName;
    }

    /**
     * Set the workerTierName property: Target worker tier assigned to the App Service plan.
     *
     * @param workerTierName the workerTierName value to set.
     * @return the AppServicePlanProperties object itself.
     */
    public AppServicePlanProperties withWorkerTierName(String workerTierName) {
        this.workerTierName = workerTierName;
        return this;
    }

    /**
     * Get the status property: App Service plan status.
     *
     * @return the status value.
     */
    public StatusOptions status() {
        return this.status;
    }

    /**
     * Get the subscription property: App Service plan subscription.
     *
     * @return the subscription value.
     */
    public String subscription() {
        return this.subscription;
    }

    /**
     * Get the hostingEnvironmentProfile property: Specification for the App Service Environment to use for the App
     * Service plan.
     *
     * @return the hostingEnvironmentProfile value.
     */
    public HostingEnvironmentProfile hostingEnvironmentProfile() {
        return this.hostingEnvironmentProfile;
    }

    /**
     * Set the hostingEnvironmentProfile property: Specification for the App Service Environment to use for the App
     * Service plan.
     *
     * @param hostingEnvironmentProfile the hostingEnvironmentProfile value to set.
     * @return the AppServicePlanProperties object itself.
     */
    public AppServicePlanProperties withHostingEnvironmentProfile(HostingEnvironmentProfile hostingEnvironmentProfile) {
        this.hostingEnvironmentProfile = hostingEnvironmentProfile;
        return this;
    }

    /**
     * Get the maximumNumberOfWorkers property: Maximum number of instances that can be assigned to this App Service
     * plan.
     *
     * @return the maximumNumberOfWorkers value.
     */
    public Integer maximumNumberOfWorkers() {
        return this.maximumNumberOfWorkers;
    }

    /**
     * Get the geoRegion property: Geographical location for the App Service plan.
     *
     * @return the geoRegion value.
     */
    public String geoRegion() {
        return this.geoRegion;
    }

    /**
     * Get the perSiteScaling property: If &lt;code&gt;true&lt;/code&gt;, apps assigned to this App Service plan can be
     * scaled independently. If &lt;code&gt;false&lt;/code&gt;, apps assigned to this App Service plan will scale to all
     * instances of the plan.
     *
     * @return the perSiteScaling value.
     */
    public Boolean perSiteScaling() {
        return this.perSiteScaling;
    }

    /**
     * Set the perSiteScaling property: If &lt;code&gt;true&lt;/code&gt;, apps assigned to this App Service plan can be
     * scaled independently. If &lt;code&gt;false&lt;/code&gt;, apps assigned to this App Service plan will scale to all
     * instances of the plan.
     *
     * @param perSiteScaling the perSiteScaling value to set.
     * @return the AppServicePlanProperties object itself.
     */
    public AppServicePlanProperties withPerSiteScaling(Boolean perSiteScaling) {
        this.perSiteScaling = perSiteScaling;
        return this;
    }

    /**
     * Get the elasticScaleEnabled property: ServerFarm supports ElasticScale. Apps in this plan will scale as if the
     * ServerFarm was ElasticPremium sku.
     *
     * @return the elasticScaleEnabled value.
     */
    public Boolean elasticScaleEnabled() {
        return this.elasticScaleEnabled;
    }

    /**
     * Set the elasticScaleEnabled property: ServerFarm supports ElasticScale. Apps in this plan will scale as if the
     * ServerFarm was ElasticPremium sku.
     *
     * @param elasticScaleEnabled the elasticScaleEnabled value to set.
     * @return the AppServicePlanProperties object itself.
     */
    public AppServicePlanProperties withElasticScaleEnabled(Boolean elasticScaleEnabled) {
        this.elasticScaleEnabled = elasticScaleEnabled;
        return this;
    }

    /**
     * Get the maximumElasticWorkerCount property: Maximum number of total workers allowed for this ElasticScaleEnabled
     * App Service Plan.
     *
     * @return the maximumElasticWorkerCount value.
     */
    public Integer maximumElasticWorkerCount() {
        return this.maximumElasticWorkerCount;
    }

    /**
     * Set the maximumElasticWorkerCount property: Maximum number of total workers allowed for this ElasticScaleEnabled
     * App Service Plan.
     *
     * @param maximumElasticWorkerCount the maximumElasticWorkerCount value to set.
     * @return the AppServicePlanProperties object itself.
     */
    public AppServicePlanProperties withMaximumElasticWorkerCount(Integer maximumElasticWorkerCount) {
        this.maximumElasticWorkerCount = maximumElasticWorkerCount;
        return this;
    }

    /**
     * Get the numberOfSites property: Number of apps assigned to this App Service plan.
     *
     * @return the numberOfSites value.
     */
    public Integer numberOfSites() {
        return this.numberOfSites;
    }

    /**
     * Get the isSpot property: If &lt;code&gt;true&lt;/code&gt;, this App Service Plan owns spot instances.
     *
     * @return the isSpot value.
     */
    public Boolean isSpot() {
        return this.isSpot;
    }

    /**
     * Set the isSpot property: If &lt;code&gt;true&lt;/code&gt;, this App Service Plan owns spot instances.
     *
     * @param isSpot the isSpot value to set.
     * @return the AppServicePlanProperties object itself.
     */
    public AppServicePlanProperties withIsSpot(Boolean isSpot) {
        this.isSpot = isSpot;
        return this;
    }

    /**
     * Get the spotExpirationTime property: The time when the server farm expires. Valid only if it is a spot server
     * farm.
     *
     * @return the spotExpirationTime value.
     */
    public OffsetDateTime spotExpirationTime() {
        return this.spotExpirationTime;
    }

    /**
     * Set the spotExpirationTime property: The time when the server farm expires. Valid only if it is a spot server
     * farm.
     *
     * @param spotExpirationTime the spotExpirationTime value to set.
     * @return the AppServicePlanProperties object itself.
     */
    public AppServicePlanProperties withSpotExpirationTime(OffsetDateTime spotExpirationTime) {
        this.spotExpirationTime = spotExpirationTime;
        return this;
    }

    /**
     * Get the freeOfferExpirationTime property: The time when the server farm free offer expires.
     *
     * @return the freeOfferExpirationTime value.
     */
    public OffsetDateTime freeOfferExpirationTime() {
        return this.freeOfferExpirationTime;
    }

    /**
     * Set the freeOfferExpirationTime property: The time when the server farm free offer expires.
     *
     * @param freeOfferExpirationTime the freeOfferExpirationTime value to set.
     * @return the AppServicePlanProperties object itself.
     */
    public AppServicePlanProperties withFreeOfferExpirationTime(OffsetDateTime freeOfferExpirationTime) {
        this.freeOfferExpirationTime = freeOfferExpirationTime;
        return this;
    }

    /**
     * Get the resourceGroup property: Resource group of the App Service plan.
     *
     * @return the resourceGroup value.
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Get the reserved property: If Linux app service plan &lt;code&gt;true&lt;/code&gt;,
     * &lt;code&gt;false&lt;/code&gt; otherwise.
     *
     * @return the reserved value.
     */
    public Boolean reserved() {
        return this.reserved;
    }

    /**
     * Set the reserved property: If Linux app service plan &lt;code&gt;true&lt;/code&gt;,
     * &lt;code&gt;false&lt;/code&gt; otherwise.
     *
     * @param reserved the reserved value to set.
     * @return the AppServicePlanProperties object itself.
     */
    public AppServicePlanProperties withReserved(Boolean reserved) {
        this.reserved = reserved;
        return this;
    }

    /**
     * Get the isXenon property: Obsolete: If Hyper-V container app service plan &lt;code&gt;true&lt;/code&gt;,
     * &lt;code&gt;false&lt;/code&gt; otherwise.
     *
     * @return the isXenon value.
     */
    public Boolean isXenon() {
        return this.isXenon;
    }

    /**
     * Set the isXenon property: Obsolete: If Hyper-V container app service plan &lt;code&gt;true&lt;/code&gt;,
     * &lt;code&gt;false&lt;/code&gt; otherwise.
     *
     * @param isXenon the isXenon value to set.
     * @return the AppServicePlanProperties object itself.
     */
    public AppServicePlanProperties withIsXenon(Boolean isXenon) {
        this.isXenon = isXenon;
        return this;
    }

    /**
     * Get the hyperV property: If Hyper-V container app service plan &lt;code&gt;true&lt;/code&gt;,
     * &lt;code&gt;false&lt;/code&gt; otherwise.
     *
     * @return the hyperV value.
     */
    public Boolean hyperV() {
        return this.hyperV;
    }

    /**
     * Set the hyperV property: If Hyper-V container app service plan &lt;code&gt;true&lt;/code&gt;,
     * &lt;code&gt;false&lt;/code&gt; otherwise.
     *
     * @param hyperV the hyperV value to set.
     * @return the AppServicePlanProperties object itself.
     */
    public AppServicePlanProperties withHyperV(Boolean hyperV) {
        this.hyperV = hyperV;
        return this;
    }

    /**
     * Get the targetWorkerCount property: Scaling worker count.
     *
     * @return the targetWorkerCount value.
     */
    public Integer targetWorkerCount() {
        return this.targetWorkerCount;
    }

    /**
     * Set the targetWorkerCount property: Scaling worker count.
     *
     * @param targetWorkerCount the targetWorkerCount value to set.
     * @return the AppServicePlanProperties object itself.
     */
    public AppServicePlanProperties withTargetWorkerCount(Integer targetWorkerCount) {
        this.targetWorkerCount = targetWorkerCount;
        return this;
    }

    /**
     * Get the targetWorkerSizeId property: Scaling worker size ID.
     *
     * @return the targetWorkerSizeId value.
     */
    public Integer targetWorkerSizeId() {
        return this.targetWorkerSizeId;
    }

    /**
     * Set the targetWorkerSizeId property: Scaling worker size ID.
     *
     * @param targetWorkerSizeId the targetWorkerSizeId value to set.
     * @return the AppServicePlanProperties object itself.
     */
    public AppServicePlanProperties withTargetWorkerSizeId(Integer targetWorkerSizeId) {
        this.targetWorkerSizeId = targetWorkerSizeId;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the App Service Plan.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the kubeEnvironmentProfile property: Specification for the Kubernetes Environment to use for the App Service
     * plan.
     *
     * @return the kubeEnvironmentProfile value.
     */
    public KubeEnvironmentProfile kubeEnvironmentProfile() {
        return this.kubeEnvironmentProfile;
    }

    /**
     * Set the kubeEnvironmentProfile property: Specification for the Kubernetes Environment to use for the App Service
     * plan.
     *
     * @param kubeEnvironmentProfile the kubeEnvironmentProfile value to set.
     * @return the AppServicePlanProperties object itself.
     */
    public AppServicePlanProperties withKubeEnvironmentProfile(KubeEnvironmentProfile kubeEnvironmentProfile) {
        this.kubeEnvironmentProfile = kubeEnvironmentProfile;
        return this;
    }

    /**
     * Get the zoneRedundant property: If &lt;code&gt;true&lt;/code&gt;, this App Service Plan will perform availability
     * zone balancing. If &lt;code&gt;false&lt;/code&gt;, this App Service Plan will not perform availability zone
     * balancing.
     *
     * @return the zoneRedundant value.
     */
    public Boolean zoneRedundant() {
        return this.zoneRedundant;
    }

    /**
     * Set the zoneRedundant property: If &lt;code&gt;true&lt;/code&gt;, this App Service Plan will perform availability
     * zone balancing. If &lt;code&gt;false&lt;/code&gt;, this App Service Plan will not perform availability zone
     * balancing.
     *
     * @param zoneRedundant the zoneRedundant value to set.
     * @return the AppServicePlanProperties object itself.
     */
    public AppServicePlanProperties withZoneRedundant(Boolean zoneRedundant) {
        this.zoneRedundant = zoneRedundant;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (hostingEnvironmentProfile() != null) {
            hostingEnvironmentProfile().validate();
        }
        if (kubeEnvironmentProfile() != null) {
            kubeEnvironmentProfile().validate();
        }
    }
}
