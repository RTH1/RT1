// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.AppServiceCertificateOrderPatchResourcePropertiesAppServiceCertificateNotRenewableReasonsItem;
import com.azure.resourcemanager.appservice.models.CertificateDetails;
import com.azure.resourcemanager.appservice.models.CertificateOrderContact;
import com.azure.resourcemanager.appservice.models.CertificateOrderStatus;
import com.azure.resourcemanager.appservice.models.CertificateProductType;
import com.azure.resourcemanager.appservice.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** AppServiceCertificateOrderPatchResource resource specific properties. */
@Fluent
public final class AppServiceCertificateOrderPatchResourceProperties {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(AppServiceCertificateOrderPatchResourceProperties.class);

    /*
     * State of the Key Vault secret.
     */
    @JsonProperty(value = "certificates")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, AppServiceCertificateInner> certificates;

    /*
     * Certificate distinguished name.
     */
    @JsonProperty(value = "distinguishedName")
    private String distinguishedName;

    /*
     * Domain verification token.
     */
    @JsonProperty(value = "domainVerificationToken", access = JsonProperty.Access.WRITE_ONLY)
    private String domainVerificationToken;

    /*
     * Duration in years (must be 1).
     */
    @JsonProperty(value = "validityInYears")
    private Integer validityInYears;

    /*
     * Certificate key size.
     */
    @JsonProperty(value = "keySize")
    private Integer keySize;

    /*
     * Certificate product type.
     */
    @JsonProperty(value = "productType", required = true)
    private CertificateProductType productType;

    /*
     * <code>true</code> if the certificate should be automatically renewed
     * when it expires; otherwise, <code>false</code>.
     */
    @JsonProperty(value = "autoRenew")
    private Boolean autoRenew;

    /*
     * Status of certificate order.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Current order status.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private CertificateOrderStatus status;

    /*
     * Signed certificate.
     */
    @JsonProperty(value = "signedCertificate", access = JsonProperty.Access.WRITE_ONLY)
    private CertificateDetails signedCertificate;

    /*
     * Last CSR that was created for this order.
     */
    @JsonProperty(value = "csr")
    private String csr;

    /*
     * Intermediate certificate.
     */
    @JsonProperty(value = "intermediate", access = JsonProperty.Access.WRITE_ONLY)
    private CertificateDetails intermediate;

    /*
     * Root certificate.
     */
    @JsonProperty(value = "root", access = JsonProperty.Access.WRITE_ONLY)
    private CertificateDetails root;

    /*
     * Current serial number of the certificate.
     */
    @JsonProperty(value = "serialNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String serialNumber;

    /*
     * Certificate last issuance time.
     */
    @JsonProperty(value = "lastCertificateIssuanceTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastCertificateIssuanceTime;

    /*
     * Certificate expiration time.
     */
    @JsonProperty(value = "expirationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime expirationTime;

    /*
     * <code>true</code> if private key is external; otherwise,
     * <code>false</code>.
     */
    @JsonProperty(value = "isPrivateKeyExternal", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isPrivateKeyExternal;

    /*
     * Reasons why App Service Certificate is not renewable at the current
     * moment.
     */
    @JsonProperty(value = "appServiceCertificateNotRenewableReasons", access = JsonProperty.Access.WRITE_ONLY)
    private List<AppServiceCertificateOrderPatchResourcePropertiesAppServiceCertificateNotRenewableReasonsItem>
        appServiceCertificateNotRenewableReasons;

    /*
     * Time stamp when the certificate would be auto renewed next
     */
    @JsonProperty(value = "nextAutoRenewalTimeStamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime nextAutoRenewalTimestamp;

    /*
     * Contact info
     */
    @JsonProperty(value = "contact", access = JsonProperty.Access.WRITE_ONLY)
    private CertificateOrderContact contact;

    /**
     * Get the certificates property: State of the Key Vault secret.
     *
     * @return the certificates value.
     */
    public Map<String, AppServiceCertificateInner> certificates() {
        return this.certificates;
    }

    /**
     * Set the certificates property: State of the Key Vault secret.
     *
     * @param certificates the certificates value to set.
     * @return the AppServiceCertificateOrderPatchResourceProperties object itself.
     */
    public AppServiceCertificateOrderPatchResourceProperties withCertificates(
        Map<String, AppServiceCertificateInner> certificates) {
        this.certificates = certificates;
        return this;
    }

    /**
     * Get the distinguishedName property: Certificate distinguished name.
     *
     * @return the distinguishedName value.
     */
    public String distinguishedName() {
        return this.distinguishedName;
    }

    /**
     * Set the distinguishedName property: Certificate distinguished name.
     *
     * @param distinguishedName the distinguishedName value to set.
     * @return the AppServiceCertificateOrderPatchResourceProperties object itself.
     */
    public AppServiceCertificateOrderPatchResourceProperties withDistinguishedName(String distinguishedName) {
        this.distinguishedName = distinguishedName;
        return this;
    }

    /**
     * Get the domainVerificationToken property: Domain verification token.
     *
     * @return the domainVerificationToken value.
     */
    public String domainVerificationToken() {
        return this.domainVerificationToken;
    }

    /**
     * Get the validityInYears property: Duration in years (must be 1).
     *
     * @return the validityInYears value.
     */
    public Integer validityInYears() {
        return this.validityInYears;
    }

    /**
     * Set the validityInYears property: Duration in years (must be 1).
     *
     * @param validityInYears the validityInYears value to set.
     * @return the AppServiceCertificateOrderPatchResourceProperties object itself.
     */
    public AppServiceCertificateOrderPatchResourceProperties withValidityInYears(Integer validityInYears) {
        this.validityInYears = validityInYears;
        return this;
    }

    /**
     * Get the keySize property: Certificate key size.
     *
     * @return the keySize value.
     */
    public Integer keySize() {
        return this.keySize;
    }

    /**
     * Set the keySize property: Certificate key size.
     *
     * @param keySize the keySize value to set.
     * @return the AppServiceCertificateOrderPatchResourceProperties object itself.
     */
    public AppServiceCertificateOrderPatchResourceProperties withKeySize(Integer keySize) {
        this.keySize = keySize;
        return this;
    }

    /**
     * Get the productType property: Certificate product type.
     *
     * @return the productType value.
     */
    public CertificateProductType productType() {
        return this.productType;
    }

    /**
     * Set the productType property: Certificate product type.
     *
     * @param productType the productType value to set.
     * @return the AppServiceCertificateOrderPatchResourceProperties object itself.
     */
    public AppServiceCertificateOrderPatchResourceProperties withProductType(CertificateProductType productType) {
        this.productType = productType;
        return this;
    }

    /**
     * Get the autoRenew property: &lt;code&gt;true&lt;/code&gt; if the certificate should be automatically renewed when
     * it expires; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the autoRenew value.
     */
    public Boolean autoRenew() {
        return this.autoRenew;
    }

    /**
     * Set the autoRenew property: &lt;code&gt;true&lt;/code&gt; if the certificate should be automatically renewed when
     * it expires; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param autoRenew the autoRenew value to set.
     * @return the AppServiceCertificateOrderPatchResourceProperties object itself.
     */
    public AppServiceCertificateOrderPatchResourceProperties withAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    /**
     * Get the provisioningState property: Status of certificate order.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the status property: Current order status.
     *
     * @return the status value.
     */
    public CertificateOrderStatus status() {
        return this.status;
    }

    /**
     * Get the signedCertificate property: Signed certificate.
     *
     * @return the signedCertificate value.
     */
    public CertificateDetails signedCertificate() {
        return this.signedCertificate;
    }

    /**
     * Get the csr property: Last CSR that was created for this order.
     *
     * @return the csr value.
     */
    public String csr() {
        return this.csr;
    }

    /**
     * Set the csr property: Last CSR that was created for this order.
     *
     * @param csr the csr value to set.
     * @return the AppServiceCertificateOrderPatchResourceProperties object itself.
     */
    public AppServiceCertificateOrderPatchResourceProperties withCsr(String csr) {
        this.csr = csr;
        return this;
    }

    /**
     * Get the intermediate property: Intermediate certificate.
     *
     * @return the intermediate value.
     */
    public CertificateDetails intermediate() {
        return this.intermediate;
    }

    /**
     * Get the root property: Root certificate.
     *
     * @return the root value.
     */
    public CertificateDetails root() {
        return this.root;
    }

    /**
     * Get the serialNumber property: Current serial number of the certificate.
     *
     * @return the serialNumber value.
     */
    public String serialNumber() {
        return this.serialNumber;
    }

    /**
     * Get the lastCertificateIssuanceTime property: Certificate last issuance time.
     *
     * @return the lastCertificateIssuanceTime value.
     */
    public OffsetDateTime lastCertificateIssuanceTime() {
        return this.lastCertificateIssuanceTime;
    }

    /**
     * Get the expirationTime property: Certificate expiration time.
     *
     * @return the expirationTime value.
     */
    public OffsetDateTime expirationTime() {
        return this.expirationTime;
    }

    /**
     * Get the isPrivateKeyExternal property: &lt;code&gt;true&lt;/code&gt; if private key is external; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the isPrivateKeyExternal value.
     */
    public Boolean isPrivateKeyExternal() {
        return this.isPrivateKeyExternal;
    }

    /**
     * Get the appServiceCertificateNotRenewableReasons property: Reasons why App Service Certificate is not renewable
     * at the current moment.
     *
     * @return the appServiceCertificateNotRenewableReasons value.
     */
    public List<AppServiceCertificateOrderPatchResourcePropertiesAppServiceCertificateNotRenewableReasonsItem>
        appServiceCertificateNotRenewableReasons() {
        return this.appServiceCertificateNotRenewableReasons;
    }

    /**
     * Get the nextAutoRenewalTimestamp property: Time stamp when the certificate would be auto renewed next.
     *
     * @return the nextAutoRenewalTimestamp value.
     */
    public OffsetDateTime nextAutoRenewalTimestamp() {
        return this.nextAutoRenewalTimestamp;
    }

    /**
     * Get the contact property: Contact info.
     *
     * @return the contact value.
     */
    public CertificateOrderContact contact() {
        return this.contact;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (certificates() != null) {
            certificates()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (productType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property productType in model"
                            + " AppServiceCertificateOrderPatchResourceProperties"));
        }
        if (signedCertificate() != null) {
            signedCertificate().validate();
        }
        if (intermediate() != null) {
            intermediate().validate();
        }
        if (root() != null) {
            root().validate();
        }
        if (contact() != null) {
            contact().validate();
        }
    }
}
