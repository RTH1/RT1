// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies the operating system settings for the role instance. */
@Fluent
public final class OsProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OsProfile.class);

    /*
     * Specifies the name of the administrator account. <br><br> **Windows-only
     * restriction:** Cannot end in "." <br><br> **Disallowed values:**
     * "administrator", "admin", "user", "user1", "test", "user2", "test1",
     * "user3", "admin1", "1", "123", "a", "actuser", "adm", "admin2",
     * "aspnet", "backup", "console", "david", "guest", "john", "owner",
     * "root", "server", "sql", "support", "support_388945a0", "sys", "test2",
     * "test3", "user4", "user5". <br><br> **Minimum-length (Linux):** 1
     * character <br><br> **Max-length (Linux):** 64 characters <br><br>
     * **Max-length (Windows):** 20 characters  <br><br><li> For root access to
     * the Linux VM, see [Using root privileges on Linux virtual machines in
     * Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-use-root-privileges?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json)<br><li>
     * For a list of built-in system users on Linux that should not be used in
     * this field, see [Selecting User Names for Linux on
     * Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-usernames?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     */
    @JsonProperty(value = "adminUsername")
    private String adminUsername;

    /*
     * Specifies the Linux operating system settings on the virtual machine.
     * <br><br>For a list of supported Linux distributions, see [Linux on
     * Azure-Endorsed
     * Distributions](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-endorsed-distros?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json)
     * <br><br> For running non-endorsed distributions, see [Information for
     * Non-Endorsed
     * Distributions](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-create-upload-generic?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     */
    @JsonProperty(value = "linuxConfiguration")
    private LinuxConfiguration linuxConfiguration;

    /*
     * Specifies a base-64 encoded string of custom data. The base-64 encoded
     * string is decoded to a binary array that is saved as a file on the
     * virtual machine. The maximum length of the binary array is 65535 bytes.
     * <br><br> **Note: Do not pass any secrets or passwords in customData
     * property** <br><br> This property cannot be updated after the VM is
     * created. <br><br> customData is passed to the VM to be saved as a file.
     * For more information see [Custom Data on Azure
     * VMs](https://azure.microsoft.com/en-us/blog/custom-data-and-cloud-init-on-windows-azure/)
     * <br><br> For using cloud-init for your Linux VM, see [Using cloud-init
     * to customize a Linux VM during
     * creation](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-using-cloud-init?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json)
     */
    @JsonProperty(value = "customData")
    private String customData;

    /*
     * Indicates if custom data is required to deploy this role.
     */
    @JsonProperty(value = "customDataRequired")
    private Boolean customDataRequired;

    /**
     * Get the adminUsername property: Specifies the name of the administrator account. &lt;br&gt;&lt;br&gt;
     * **Windows-only restriction:** Cannot end in "." &lt;br&gt;&lt;br&gt; **Disallowed values:** "administrator",
     * "admin", "user", "user1", "test", "user2", "test1", "user3", "admin1", "1", "123", "a", "actuser", "adm",
     * "admin2", "aspnet", "backup", "console", "david", "guest", "john", "owner", "root", "server", "sql", "support",
     * "support_388945a0", "sys", "test2", "test3", "user4", "user5". &lt;br&gt;&lt;br&gt; **Minimum-length (Linux):** 1
     * character &lt;br&gt;&lt;br&gt; **Max-length (Linux):** 64 characters &lt;br&gt;&lt;br&gt; **Max-length
     * (Windows):** 20 characters &lt;br&gt;&lt;br&gt;&lt;li&gt; For root access to the Linux VM, see [Using root
     * privileges on Linux virtual machines in
     * Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-use-root-privileges?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json)&lt;br&gt;&lt;li&gt;
     * For a list of built-in system users on Linux that should not be used in this field, see [Selecting User Names for
     * Linux on
     * Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-usernames?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     *
     * @return the adminUsername value.
     */
    public String adminUsername() {
        return this.adminUsername;
    }

    /**
     * Set the adminUsername property: Specifies the name of the administrator account. &lt;br&gt;&lt;br&gt;
     * **Windows-only restriction:** Cannot end in "." &lt;br&gt;&lt;br&gt; **Disallowed values:** "administrator",
     * "admin", "user", "user1", "test", "user2", "test1", "user3", "admin1", "1", "123", "a", "actuser", "adm",
     * "admin2", "aspnet", "backup", "console", "david", "guest", "john", "owner", "root", "server", "sql", "support",
     * "support_388945a0", "sys", "test2", "test3", "user4", "user5". &lt;br&gt;&lt;br&gt; **Minimum-length (Linux):** 1
     * character &lt;br&gt;&lt;br&gt; **Max-length (Linux):** 64 characters &lt;br&gt;&lt;br&gt; **Max-length
     * (Windows):** 20 characters &lt;br&gt;&lt;br&gt;&lt;li&gt; For root access to the Linux VM, see [Using root
     * privileges on Linux virtual machines in
     * Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-use-root-privileges?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json)&lt;br&gt;&lt;li&gt;
     * For a list of built-in system users on Linux that should not be used in this field, see [Selecting User Names for
     * Linux on
     * Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-usernames?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     *
     * @param adminUsername the adminUsername value to set.
     * @return the OsProfile object itself.
     */
    public OsProfile withAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
        return this;
    }

    /**
     * Get the linuxConfiguration property: Specifies the Linux operating system settings on the virtual machine.
     * &lt;br&gt;&lt;br&gt;For a list of supported Linux distributions, see [Linux on Azure-Endorsed
     * Distributions](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-endorsed-distros?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json)
     * &lt;br&gt;&lt;br&gt; For running non-endorsed distributions, see [Information for Non-Endorsed
     * Distributions](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-create-upload-generic?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     *
     * @return the linuxConfiguration value.
     */
    public LinuxConfiguration linuxConfiguration() {
        return this.linuxConfiguration;
    }

    /**
     * Set the linuxConfiguration property: Specifies the Linux operating system settings on the virtual machine.
     * &lt;br&gt;&lt;br&gt;For a list of supported Linux distributions, see [Linux on Azure-Endorsed
     * Distributions](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-endorsed-distros?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json)
     * &lt;br&gt;&lt;br&gt; For running non-endorsed distributions, see [Information for Non-Endorsed
     * Distributions](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-create-upload-generic?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     *
     * @param linuxConfiguration the linuxConfiguration value to set.
     * @return the OsProfile object itself.
     */
    public OsProfile withLinuxConfiguration(LinuxConfiguration linuxConfiguration) {
        this.linuxConfiguration = linuxConfiguration;
        return this;
    }

    /**
     * Get the customData property: Specifies a base-64 encoded string of custom data. The base-64 encoded string is
     * decoded to a binary array that is saved as a file on the virtual machine. The maximum length of the binary array
     * is 65535 bytes. &lt;br&gt;&lt;br&gt; **Note: Do not pass any secrets or passwords in customData property**
     * &lt;br&gt;&lt;br&gt; This property cannot be updated after the VM is created. &lt;br&gt;&lt;br&gt; customData is
     * passed to the VM to be saved as a file. For more information see [Custom Data on Azure
     * VMs](https://azure.microsoft.com/en-us/blog/custom-data-and-cloud-init-on-windows-azure/) &lt;br&gt;&lt;br&gt;
     * For using cloud-init for your Linux VM, see [Using cloud-init to customize a Linux VM during
     * creation](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-using-cloud-init?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     *
     * @return the customData value.
     */
    public String customData() {
        return this.customData;
    }

    /**
     * Set the customData property: Specifies a base-64 encoded string of custom data. The base-64 encoded string is
     * decoded to a binary array that is saved as a file on the virtual machine. The maximum length of the binary array
     * is 65535 bytes. &lt;br&gt;&lt;br&gt; **Note: Do not pass any secrets or passwords in customData property**
     * &lt;br&gt;&lt;br&gt; This property cannot be updated after the VM is created. &lt;br&gt;&lt;br&gt; customData is
     * passed to the VM to be saved as a file. For more information see [Custom Data on Azure
     * VMs](https://azure.microsoft.com/en-us/blog/custom-data-and-cloud-init-on-windows-azure/) &lt;br&gt;&lt;br&gt;
     * For using cloud-init for your Linux VM, see [Using cloud-init to customize a Linux VM during
     * creation](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-using-cloud-init?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     *
     * @param customData the customData value to set.
     * @return the OsProfile object itself.
     */
    public OsProfile withCustomData(String customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Get the customDataRequired property: Indicates if custom data is required to deploy this role.
     *
     * @return the customDataRequired value.
     */
    public Boolean customDataRequired() {
        return this.customDataRequired;
    }

    /**
     * Set the customDataRequired property: Indicates if custom data is required to deploy this role.
     *
     * @param customDataRequired the customDataRequired value to set.
     * @return the OsProfile object itself.
     */
    public OsProfile withCustomDataRequired(Boolean customDataRequired) {
        this.customDataRequired = customDataRequired;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (linuxConfiguration() != null) {
            linuxConfiguration().validate();
        }
    }
}
