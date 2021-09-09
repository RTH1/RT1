// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.models.IdentityProviderType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Identity Provider details. */
@Fluent
public final class IdentityProviderContractInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IdentityProviderContractInner.class);

    /*
     * Identity Provider contract properties.
     */
    @JsonProperty(value = "properties")
    private IdentityProviderContractProperties innerProperties;

    /**
     * Get the innerProperties property: Identity Provider contract properties.
     *
     * @return the innerProperties value.
     */
    private IdentityProviderContractProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the clientId property: Client Id of the Application in the external Identity Provider. It is App ID for
     * Facebook login, Client ID for Google login, App ID for Microsoft.
     *
     * @return the clientId value.
     */
    public String clientId() {
        return this.innerProperties() == null ? null : this.innerProperties().clientId();
    }

    /**
     * Set the clientId property: Client Id of the Application in the external Identity Provider. It is App ID for
     * Facebook login, Client ID for Google login, App ID for Microsoft.
     *
     * @param clientId the clientId value to set.
     * @return the IdentityProviderContractInner object itself.
     */
    public IdentityProviderContractInner withClientId(String clientId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IdentityProviderContractProperties();
        }
        this.innerProperties().withClientId(clientId);
        return this;
    }

    /**
     * Get the clientSecret property: Client secret of the Application in external Identity Provider, used to
     * authenticate login request. For example, it is App Secret for Facebook login, API Key for Google login, Public
     * Key for Microsoft. This property will not be filled on 'GET' operations! Use '/listSecrets' POST request to get
     * the value.
     *
     * @return the clientSecret value.
     */
    public String clientSecret() {
        return this.innerProperties() == null ? null : this.innerProperties().clientSecret();
    }

    /**
     * Set the clientSecret property: Client secret of the Application in external Identity Provider, used to
     * authenticate login request. For example, it is App Secret for Facebook login, API Key for Google login, Public
     * Key for Microsoft. This property will not be filled on 'GET' operations! Use '/listSecrets' POST request to get
     * the value.
     *
     * @param clientSecret the clientSecret value to set.
     * @return the IdentityProviderContractInner object itself.
     */
    public IdentityProviderContractInner withClientSecret(String clientSecret) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IdentityProviderContractProperties();
        }
        this.innerProperties().withClientSecret(clientSecret);
        return this;
    }

    /**
     * Get the type property: Identity Provider Type identifier.
     *
     * @return the type value.
     */
    public IdentityProviderType typePropertiesType() {
        return this.innerProperties() == null ? null : this.innerProperties().type();
    }

    /**
     * Set the type property: Identity Provider Type identifier.
     *
     * @param type the type value to set.
     * @return the IdentityProviderContractInner object itself.
     */
    public IdentityProviderContractInner withTypePropertiesType(IdentityProviderType type) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IdentityProviderContractProperties();
        }
        this.innerProperties().withType(type);
        return this;
    }

    /**
     * Get the signinTenant property: The TenantId to use instead of Common when logging into Active Directory.
     *
     * @return the signinTenant value.
     */
    public String signinTenant() {
        return this.innerProperties() == null ? null : this.innerProperties().signinTenant();
    }

    /**
     * Set the signinTenant property: The TenantId to use instead of Common when logging into Active Directory.
     *
     * @param signinTenant the signinTenant value to set.
     * @return the IdentityProviderContractInner object itself.
     */
    public IdentityProviderContractInner withSigninTenant(String signinTenant) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IdentityProviderContractProperties();
        }
        this.innerProperties().withSigninTenant(signinTenant);
        return this;
    }

    /**
     * Get the allowedTenants property: List of Allowed Tenants when configuring Azure Active Directory login.
     *
     * @return the allowedTenants value.
     */
    public List<String> allowedTenants() {
        return this.innerProperties() == null ? null : this.innerProperties().allowedTenants();
    }

    /**
     * Set the allowedTenants property: List of Allowed Tenants when configuring Azure Active Directory login.
     *
     * @param allowedTenants the allowedTenants value to set.
     * @return the IdentityProviderContractInner object itself.
     */
    public IdentityProviderContractInner withAllowedTenants(List<String> allowedTenants) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IdentityProviderContractProperties();
        }
        this.innerProperties().withAllowedTenants(allowedTenants);
        return this;
    }

    /**
     * Get the authority property: OpenID Connect discovery endpoint hostname for AAD or AAD B2C.
     *
     * @return the authority value.
     */
    public String authority() {
        return this.innerProperties() == null ? null : this.innerProperties().authority();
    }

    /**
     * Set the authority property: OpenID Connect discovery endpoint hostname for AAD or AAD B2C.
     *
     * @param authority the authority value to set.
     * @return the IdentityProviderContractInner object itself.
     */
    public IdentityProviderContractInner withAuthority(String authority) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IdentityProviderContractProperties();
        }
        this.innerProperties().withAuthority(authority);
        return this;
    }

    /**
     * Get the signupPolicyName property: Signup Policy Name. Only applies to AAD B2C Identity Provider.
     *
     * @return the signupPolicyName value.
     */
    public String signupPolicyName() {
        return this.innerProperties() == null ? null : this.innerProperties().signupPolicyName();
    }

    /**
     * Set the signupPolicyName property: Signup Policy Name. Only applies to AAD B2C Identity Provider.
     *
     * @param signupPolicyName the signupPolicyName value to set.
     * @return the IdentityProviderContractInner object itself.
     */
    public IdentityProviderContractInner withSignupPolicyName(String signupPolicyName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IdentityProviderContractProperties();
        }
        this.innerProperties().withSignupPolicyName(signupPolicyName);
        return this;
    }

    /**
     * Get the signinPolicyName property: Signin Policy Name. Only applies to AAD B2C Identity Provider.
     *
     * @return the signinPolicyName value.
     */
    public String signinPolicyName() {
        return this.innerProperties() == null ? null : this.innerProperties().signinPolicyName();
    }

    /**
     * Set the signinPolicyName property: Signin Policy Name. Only applies to AAD B2C Identity Provider.
     *
     * @param signinPolicyName the signinPolicyName value to set.
     * @return the IdentityProviderContractInner object itself.
     */
    public IdentityProviderContractInner withSigninPolicyName(String signinPolicyName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IdentityProviderContractProperties();
        }
        this.innerProperties().withSigninPolicyName(signinPolicyName);
        return this;
    }

    /**
     * Get the profileEditingPolicyName property: Profile Editing Policy Name. Only applies to AAD B2C Identity
     * Provider.
     *
     * @return the profileEditingPolicyName value.
     */
    public String profileEditingPolicyName() {
        return this.innerProperties() == null ? null : this.innerProperties().profileEditingPolicyName();
    }

    /**
     * Set the profileEditingPolicyName property: Profile Editing Policy Name. Only applies to AAD B2C Identity
     * Provider.
     *
     * @param profileEditingPolicyName the profileEditingPolicyName value to set.
     * @return the IdentityProviderContractInner object itself.
     */
    public IdentityProviderContractInner withProfileEditingPolicyName(String profileEditingPolicyName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IdentityProviderContractProperties();
        }
        this.innerProperties().withProfileEditingPolicyName(profileEditingPolicyName);
        return this;
    }

    /**
     * Get the passwordResetPolicyName property: Password Reset Policy Name. Only applies to AAD B2C Identity Provider.
     *
     * @return the passwordResetPolicyName value.
     */
    public String passwordResetPolicyName() {
        return this.innerProperties() == null ? null : this.innerProperties().passwordResetPolicyName();
    }

    /**
     * Set the passwordResetPolicyName property: Password Reset Policy Name. Only applies to AAD B2C Identity Provider.
     *
     * @param passwordResetPolicyName the passwordResetPolicyName value to set.
     * @return the IdentityProviderContractInner object itself.
     */
    public IdentityProviderContractInner withPasswordResetPolicyName(String passwordResetPolicyName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IdentityProviderContractProperties();
        }
        this.innerProperties().withPasswordResetPolicyName(passwordResetPolicyName);
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
