// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.Contact;
import com.azure.resourcemanager.appservice.models.DnsType;
import com.azure.resourcemanager.appservice.models.DomainPatchResourcePropertiesDomainNotRenewableReasonsItem;
import com.azure.resourcemanager.appservice.models.DomainPurchaseConsent;
import com.azure.resourcemanager.appservice.models.DomainStatus;
import com.azure.resourcemanager.appservice.models.Hostname;
import com.azure.resourcemanager.appservice.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** DomainPatchResource resource specific properties. */
@Fluent
public final class DomainPatchResourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DomainPatchResourceProperties.class);

    /*
     * Administrative contact.
     */
    @JsonProperty(value = "contactAdmin", required = true)
    private Contact contactAdmin;

    /*
     * Billing contact.
     */
    @JsonProperty(value = "contactBilling", required = true)
    private Contact contactBilling;

    /*
     * Registrant contact.
     */
    @JsonProperty(value = "contactRegistrant", required = true)
    private Contact contactRegistrant;

    /*
     * Technical contact.
     */
    @JsonProperty(value = "contactTech", required = true)
    private Contact contactTech;

    /*
     * Domain registration status.
     */
    @JsonProperty(value = "registrationStatus", access = JsonProperty.Access.WRITE_ONLY)
    private DomainStatus registrationStatus;

    /*
     * Domain provisioning state.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Name servers.
     */
    @JsonProperty(value = "nameServers", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> nameServers;

    /*
     * <code>true</code> if domain privacy is enabled for this domain;
     * otherwise, <code>false</code>.
     */
    @JsonProperty(value = "privacy")
    private Boolean privacy;

    /*
     * Domain creation timestamp.
     */
    @JsonProperty(value = "createdTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdTime;

    /*
     * Domain expiration timestamp.
     */
    @JsonProperty(value = "expirationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime expirationTime;

    /*
     * Timestamp when the domain was renewed last time.
     */
    @JsonProperty(value = "lastRenewedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastRenewedTime;

    /*
     * <code>true</code> if the domain should be automatically renewed;
     * otherwise, <code>false</code>.
     */
    @JsonProperty(value = "autoRenew")
    private Boolean autoRenew;

    /*
     * <code>true</code> if Azure can assign this domain to App Service apps;
     * otherwise, <code>false</code>. This value will be <code>true</code> if
     * domain registration status is active and
     * it is hosted on name servers Azure has programmatic access to.
     */
    @JsonProperty(value = "readyForDnsRecordManagement", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean readyForDnsRecordManagement;

    /*
     * All hostnames derived from the domain and assigned to Azure resources.
     */
    @JsonProperty(value = "managedHostNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<Hostname> managedHostNames;

    /*
     * Legal agreement consent.
     */
    @JsonProperty(value = "consent", required = true)
    private DomainPurchaseConsent consent;

    /*
     * Reasons why domain is not renewable.
     */
    @JsonProperty(value = "domainNotRenewableReasons", access = JsonProperty.Access.WRITE_ONLY)
    private List<DomainPatchResourcePropertiesDomainNotRenewableReasonsItem> domainNotRenewableReasons;

    /*
     * Current DNS type
     */
    @JsonProperty(value = "dnsType")
    private DnsType dnsType;

    /*
     * Azure DNS Zone to use
     */
    @JsonProperty(value = "dnsZoneId")
    private String dnsZoneId;

    /*
     * Target DNS type (would be used for migration)
     */
    @JsonProperty(value = "targetDnsType")
    private DnsType targetDnsType;

    /*
     * The authCode property.
     */
    @JsonProperty(value = "authCode")
    private String authCode;

    /**
     * Get the contactAdmin property: Administrative contact.
     *
     * @return the contactAdmin value.
     */
    public Contact contactAdmin() {
        return this.contactAdmin;
    }

    /**
     * Set the contactAdmin property: Administrative contact.
     *
     * @param contactAdmin the contactAdmin value to set.
     * @return the DomainPatchResourceProperties object itself.
     */
    public DomainPatchResourceProperties withContactAdmin(Contact contactAdmin) {
        this.contactAdmin = contactAdmin;
        return this;
    }

    /**
     * Get the contactBilling property: Billing contact.
     *
     * @return the contactBilling value.
     */
    public Contact contactBilling() {
        return this.contactBilling;
    }

    /**
     * Set the contactBilling property: Billing contact.
     *
     * @param contactBilling the contactBilling value to set.
     * @return the DomainPatchResourceProperties object itself.
     */
    public DomainPatchResourceProperties withContactBilling(Contact contactBilling) {
        this.contactBilling = contactBilling;
        return this;
    }

    /**
     * Get the contactRegistrant property: Registrant contact.
     *
     * @return the contactRegistrant value.
     */
    public Contact contactRegistrant() {
        return this.contactRegistrant;
    }

    /**
     * Set the contactRegistrant property: Registrant contact.
     *
     * @param contactRegistrant the contactRegistrant value to set.
     * @return the DomainPatchResourceProperties object itself.
     */
    public DomainPatchResourceProperties withContactRegistrant(Contact contactRegistrant) {
        this.contactRegistrant = contactRegistrant;
        return this;
    }

    /**
     * Get the contactTech property: Technical contact.
     *
     * @return the contactTech value.
     */
    public Contact contactTech() {
        return this.contactTech;
    }

    /**
     * Set the contactTech property: Technical contact.
     *
     * @param contactTech the contactTech value to set.
     * @return the DomainPatchResourceProperties object itself.
     */
    public DomainPatchResourceProperties withContactTech(Contact contactTech) {
        this.contactTech = contactTech;
        return this;
    }

    /**
     * Get the registrationStatus property: Domain registration status.
     *
     * @return the registrationStatus value.
     */
    public DomainStatus registrationStatus() {
        return this.registrationStatus;
    }

    /**
     * Get the provisioningState property: Domain provisioning state.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the nameServers property: Name servers.
     *
     * @return the nameServers value.
     */
    public List<String> nameServers() {
        return this.nameServers;
    }

    /**
     * Get the privacy property: &lt;code&gt;true&lt;/code&gt; if domain privacy is enabled for this domain; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the privacy value.
     */
    public Boolean privacy() {
        return this.privacy;
    }

    /**
     * Set the privacy property: &lt;code&gt;true&lt;/code&gt; if domain privacy is enabled for this domain; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @param privacy the privacy value to set.
     * @return the DomainPatchResourceProperties object itself.
     */
    public DomainPatchResourceProperties withPrivacy(Boolean privacy) {
        this.privacy = privacy;
        return this;
    }

    /**
     * Get the createdTime property: Domain creation timestamp.
     *
     * @return the createdTime value.
     */
    public OffsetDateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Get the expirationTime property: Domain expiration timestamp.
     *
     * @return the expirationTime value.
     */
    public OffsetDateTime expirationTime() {
        return this.expirationTime;
    }

    /**
     * Get the lastRenewedTime property: Timestamp when the domain was renewed last time.
     *
     * @return the lastRenewedTime value.
     */
    public OffsetDateTime lastRenewedTime() {
        return this.lastRenewedTime;
    }

    /**
     * Get the autoRenew property: &lt;code&gt;true&lt;/code&gt; if the domain should be automatically renewed;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the autoRenew value.
     */
    public Boolean autoRenew() {
        return this.autoRenew;
    }

    /**
     * Set the autoRenew property: &lt;code&gt;true&lt;/code&gt; if the domain should be automatically renewed;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param autoRenew the autoRenew value to set.
     * @return the DomainPatchResourceProperties object itself.
     */
    public DomainPatchResourceProperties withAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    /**
     * Get the readyForDnsRecordManagement property: &lt;code&gt;true&lt;/code&gt; if Azure can assign this domain to
     * App Service apps; otherwise, &lt;code&gt;false&lt;/code&gt;. This value will be &lt;code&gt;true&lt;/code&gt; if
     * domain registration status is active and it is hosted on name servers Azure has programmatic access to.
     *
     * @return the readyForDnsRecordManagement value.
     */
    public Boolean readyForDnsRecordManagement() {
        return this.readyForDnsRecordManagement;
    }

    /**
     * Get the managedHostNames property: All hostnames derived from the domain and assigned to Azure resources.
     *
     * @return the managedHostNames value.
     */
    public List<Hostname> managedHostNames() {
        return this.managedHostNames;
    }

    /**
     * Get the consent property: Legal agreement consent.
     *
     * @return the consent value.
     */
    public DomainPurchaseConsent consent() {
        return this.consent;
    }

    /**
     * Set the consent property: Legal agreement consent.
     *
     * @param consent the consent value to set.
     * @return the DomainPatchResourceProperties object itself.
     */
    public DomainPatchResourceProperties withConsent(DomainPurchaseConsent consent) {
        this.consent = consent;
        return this;
    }

    /**
     * Get the domainNotRenewableReasons property: Reasons why domain is not renewable.
     *
     * @return the domainNotRenewableReasons value.
     */
    public List<DomainPatchResourcePropertiesDomainNotRenewableReasonsItem> domainNotRenewableReasons() {
        return this.domainNotRenewableReasons;
    }

    /**
     * Get the dnsType property: Current DNS type.
     *
     * @return the dnsType value.
     */
    public DnsType dnsType() {
        return this.dnsType;
    }

    /**
     * Set the dnsType property: Current DNS type.
     *
     * @param dnsType the dnsType value to set.
     * @return the DomainPatchResourceProperties object itself.
     */
    public DomainPatchResourceProperties withDnsType(DnsType dnsType) {
        this.dnsType = dnsType;
        return this;
    }

    /**
     * Get the dnsZoneId property: Azure DNS Zone to use.
     *
     * @return the dnsZoneId value.
     */
    public String dnsZoneId() {
        return this.dnsZoneId;
    }

    /**
     * Set the dnsZoneId property: Azure DNS Zone to use.
     *
     * @param dnsZoneId the dnsZoneId value to set.
     * @return the DomainPatchResourceProperties object itself.
     */
    public DomainPatchResourceProperties withDnsZoneId(String dnsZoneId) {
        this.dnsZoneId = dnsZoneId;
        return this;
    }

    /**
     * Get the targetDnsType property: Target DNS type (would be used for migration).
     *
     * @return the targetDnsType value.
     */
    public DnsType targetDnsType() {
        return this.targetDnsType;
    }

    /**
     * Set the targetDnsType property: Target DNS type (would be used for migration).
     *
     * @param targetDnsType the targetDnsType value to set.
     * @return the DomainPatchResourceProperties object itself.
     */
    public DomainPatchResourceProperties withTargetDnsType(DnsType targetDnsType) {
        this.targetDnsType = targetDnsType;
        return this;
    }

    /**
     * Get the authCode property: The authCode property.
     *
     * @return the authCode value.
     */
    public String authCode() {
        return this.authCode;
    }

    /**
     * Set the authCode property: The authCode property.
     *
     * @param authCode the authCode value to set.
     * @return the DomainPatchResourceProperties object itself.
     */
    public DomainPatchResourceProperties withAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (contactAdmin() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property contactAdmin in model DomainPatchResourceProperties"));
        } else {
            contactAdmin().validate();
        }
        if (contactBilling() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property contactBilling in model DomainPatchResourceProperties"));
        } else {
            contactBilling().validate();
        }
        if (contactRegistrant() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property contactRegistrant in model DomainPatchResourceProperties"));
        } else {
            contactRegistrant().validate();
        }
        if (contactTech() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property contactTech in model DomainPatchResourceProperties"));
        } else {
            contactTech().validate();
        }
        if (managedHostNames() != null) {
            managedHostNames().forEach(e -> e.validate());
        }
        if (consent() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property consent in model DomainPatchResourceProperties"));
        } else {
            consent().validate();
        }
    }
}
