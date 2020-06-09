// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The VpnClientParameters model. */
@Fluent
public final class VpnClientParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VpnClientParameters.class);

    /*
     * VPN client Processor Architecture.
     */
    @JsonProperty(value = "processorArchitecture")
    private ProcessorArchitecture processorArchitecture;

    /*
     * VPN client authentication method.
     */
    @JsonProperty(value = "authenticationMethod")
    private AuthenticationMethod authenticationMethod;

    /*
     * The public certificate data for the radius server authentication
     * certificate as a Base-64 encoded string. Required only if external
     * radius authentication has been configured with EAPTLS authentication.
     */
    @JsonProperty(value = "radiusServerAuthCertificate")
    private String radiusServerAuthCertificate;

    /*
     * A list of client root certificates public certificate data encoded as
     * Base-64 strings. Optional parameter for external radius based
     * authentication with EAPTLS.
     */
    @JsonProperty(value = "clientRootCertificates")
    private List<String> clientRootCertificates;

    /**
     * Get the processorArchitecture property: VPN client Processor Architecture.
     *
     * @return the processorArchitecture value.
     */
    public ProcessorArchitecture processorArchitecture() {
        return this.processorArchitecture;
    }

    /**
     * Set the processorArchitecture property: VPN client Processor Architecture.
     *
     * @param processorArchitecture the processorArchitecture value to set.
     * @return the VpnClientParameters object itself.
     */
    public VpnClientParameters withProcessorArchitecture(ProcessorArchitecture processorArchitecture) {
        this.processorArchitecture = processorArchitecture;
        return this;
    }

    /**
     * Get the authenticationMethod property: VPN client authentication method.
     *
     * @return the authenticationMethod value.
     */
    public AuthenticationMethod authenticationMethod() {
        return this.authenticationMethod;
    }

    /**
     * Set the authenticationMethod property: VPN client authentication method.
     *
     * @param authenticationMethod the authenticationMethod value to set.
     * @return the VpnClientParameters object itself.
     */
    public VpnClientParameters withAuthenticationMethod(AuthenticationMethod authenticationMethod) {
        this.authenticationMethod = authenticationMethod;
        return this;
    }

    /**
     * Get the radiusServerAuthCertificate property: The public certificate data for the radius server authentication
     * certificate as a Base-64 encoded string. Required only if external radius authentication has been configured with
     * EAPTLS authentication.
     *
     * @return the radiusServerAuthCertificate value.
     */
    public String radiusServerAuthCertificate() {
        return this.radiusServerAuthCertificate;
    }

    /**
     * Set the radiusServerAuthCertificate property: The public certificate data for the radius server authentication
     * certificate as a Base-64 encoded string. Required only if external radius authentication has been configured with
     * EAPTLS authentication.
     *
     * @param radiusServerAuthCertificate the radiusServerAuthCertificate value to set.
     * @return the VpnClientParameters object itself.
     */
    public VpnClientParameters withRadiusServerAuthCertificate(String radiusServerAuthCertificate) {
        this.radiusServerAuthCertificate = radiusServerAuthCertificate;
        return this;
    }

    /**
     * Get the clientRootCertificates property: A list of client root certificates public certificate data encoded as
     * Base-64 strings. Optional parameter for external radius based authentication with EAPTLS.
     *
     * @return the clientRootCertificates value.
     */
    public List<String> clientRootCertificates() {
        return this.clientRootCertificates;
    }

    /**
     * Set the clientRootCertificates property: A list of client root certificates public certificate data encoded as
     * Base-64 strings. Optional parameter for external radius based authentication with EAPTLS.
     *
     * @param clientRootCertificates the clientRootCertificates value to set.
     * @return the VpnClientParameters object itself.
     */
    public VpnClientParameters withClientRootCertificates(List<String> clientRootCertificates) {
        this.clientRootCertificates = clientRootCertificates;
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
