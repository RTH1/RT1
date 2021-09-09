// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Mount target properties. */
@Fluent
public final class MountTargetProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MountTargetProperties.class);

    /*
     * mountTargetId UUID v4 used to identify the MountTarget
     */
    @JsonProperty(value = "mountTargetId", access = JsonProperty.Access.WRITE_ONLY)
    private String mountTargetId;

    /*
     * fileSystemId UUID v4 used to identify the MountTarget
     */
    @JsonProperty(value = "fileSystemId", required = true)
    private String fileSystemId;

    /*
     * ipAddress The mount target's IPv4 address
     */
    @JsonProperty(value = "ipAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String ipAddress;

    /*
     * smbServerFQDN The SMB server's Fully Qualified Domain Name, FQDN
     */
    @JsonProperty(value = "smbServerFqdn")
    private String smbServerFqdn;

    /**
     * Get the mountTargetId property: mountTargetId UUID v4 used to identify the MountTarget.
     *
     * @return the mountTargetId value.
     */
    public String mountTargetId() {
        return this.mountTargetId;
    }

    /**
     * Get the fileSystemId property: fileSystemId UUID v4 used to identify the MountTarget.
     *
     * @return the fileSystemId value.
     */
    public String fileSystemId() {
        return this.fileSystemId;
    }

    /**
     * Set the fileSystemId property: fileSystemId UUID v4 used to identify the MountTarget.
     *
     * @param fileSystemId the fileSystemId value to set.
     * @return the MountTargetProperties object itself.
     */
    public MountTargetProperties withFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }

    /**
     * Get the ipAddress property: ipAddress The mount target's IPv4 address.
     *
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Get the smbServerFqdn property: smbServerFQDN The SMB server's Fully Qualified Domain Name, FQDN.
     *
     * @return the smbServerFqdn value.
     */
    public String smbServerFqdn() {
        return this.smbServerFqdn;
    }

    /**
     * Set the smbServerFqdn property: smbServerFQDN The SMB server's Fully Qualified Domain Name, FQDN.
     *
     * @param smbServerFqdn the smbServerFqdn value to set.
     * @return the MountTargetProperties object itself.
     */
    public MountTargetProperties withSmbServerFqdn(String smbServerFqdn) {
        this.smbServerFqdn = smbServerFqdn;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (fileSystemId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property fileSystemId in model MountTargetProperties"));
        }
    }
}
