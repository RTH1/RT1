// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.billing.models.MarketplacePurchasesPolicy;
import com.azure.resourcemanager.billing.models.ReservationPurchasesPolicy;
import com.azure.resourcemanager.billing.models.ViewChargesPolicy;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A policy. */
@Fluent
public final class PolicyInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PolicyInner.class);

    /*
     * The properties of a policy.
     */
    @JsonProperty(value = "properties")
    private PolicyProperties innerProperties;

    /**
     * Get the innerProperties property: The properties of a policy.
     *
     * @return the innerProperties value.
     */
    private PolicyProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the marketplacePurchases property: The policy that controls whether Azure marketplace purchases are allowed
     * for a billing profile.
     *
     * @return the marketplacePurchases value.
     */
    public MarketplacePurchasesPolicy marketplacePurchases() {
        return this.innerProperties() == null ? null : this.innerProperties().marketplacePurchases();
    }

    /**
     * Set the marketplacePurchases property: The policy that controls whether Azure marketplace purchases are allowed
     * for a billing profile.
     *
     * @param marketplacePurchases the marketplacePurchases value to set.
     * @return the PolicyInner object itself.
     */
    public PolicyInner withMarketplacePurchases(MarketplacePurchasesPolicy marketplacePurchases) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyProperties();
        }
        this.innerProperties().withMarketplacePurchases(marketplacePurchases);
        return this;
    }

    /**
     * Get the reservationPurchases property: The policy that controls whether Azure reservation purchases are allowed
     * for a billing profile.
     *
     * @return the reservationPurchases value.
     */
    public ReservationPurchasesPolicy reservationPurchases() {
        return this.innerProperties() == null ? null : this.innerProperties().reservationPurchases();
    }

    /**
     * Set the reservationPurchases property: The policy that controls whether Azure reservation purchases are allowed
     * for a billing profile.
     *
     * @param reservationPurchases the reservationPurchases value to set.
     * @return the PolicyInner object itself.
     */
    public PolicyInner withReservationPurchases(ReservationPurchasesPolicy reservationPurchases) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyProperties();
        }
        this.innerProperties().withReservationPurchases(reservationPurchases);
        return this;
    }

    /**
     * Get the viewCharges property: The policy that controls whether users with Azure RBAC access to a subscription can
     * view its charges.
     *
     * @return the viewCharges value.
     */
    public ViewChargesPolicy viewCharges() {
        return this.innerProperties() == null ? null : this.innerProperties().viewCharges();
    }

    /**
     * Set the viewCharges property: The policy that controls whether users with Azure RBAC access to a subscription can
     * view its charges.
     *
     * @param viewCharges the viewCharges value to set.
     * @return the PolicyInner object itself.
     */
    public PolicyInner withViewCharges(ViewChargesPolicy viewCharges) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyProperties();
        }
        this.innerProperties().withViewCharges(viewCharges);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
