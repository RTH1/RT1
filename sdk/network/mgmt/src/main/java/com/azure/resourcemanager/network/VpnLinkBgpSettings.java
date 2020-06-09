// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VpnLinkBgpSettings model. */
@Fluent
public final class VpnLinkBgpSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VpnLinkBgpSettings.class);

    /*
     * The BGP speaker's ASN.
     */
    @JsonProperty(value = "asn")
    private Long asn;

    /*
     * The BGP peering address and BGP identifier of this BGP speaker.
     */
    @JsonProperty(value = "bgpPeeringAddress")
    private String bgpPeeringAddress;

    /**
     * Get the asn property: The BGP speaker's ASN.
     *
     * @return the asn value.
     */
    public Long asn() {
        return this.asn;
    }

    /**
     * Set the asn property: The BGP speaker's ASN.
     *
     * @param asn the asn value to set.
     * @return the VpnLinkBgpSettings object itself.
     */
    public VpnLinkBgpSettings withAsn(Long asn) {
        this.asn = asn;
        return this;
    }

    /**
     * Get the bgpPeeringAddress property: The BGP peering address and BGP identifier of this BGP speaker.
     *
     * @return the bgpPeeringAddress value.
     */
    public String bgpPeeringAddress() {
        return this.bgpPeeringAddress;
    }

    /**
     * Set the bgpPeeringAddress property: The BGP peering address and BGP identifier of this BGP speaker.
     *
     * @param bgpPeeringAddress the bgpPeeringAddress value to set.
     * @return the VpnLinkBgpSettings object itself.
     */
    public VpnLinkBgpSettings withBgpPeeringAddress(String bgpPeeringAddress) {
        this.bgpPeeringAddress = bgpPeeringAddress;
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
