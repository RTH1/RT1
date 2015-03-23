/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.compute.models;

import com.microsoft.windowsazure.core.AzureOperationResponse;
import com.microsoft.windowsazure.core.LazyArrayList;
import java.util.ArrayList;

/**
* The Get Virtual Machine operation response.
*/
public class VirtualMachineGetResponse extends AzureOperationResponse {
    private String availabilitySetName;
    
    /**
    * Optional. The name of the availability set the virtual machine belongs
    * to. This value controls the virtual machine allocation in the Windows
    * Azure environment. Virtual machines specified in the same availability
    * set are allocated to different nodes to maximize availability.
    * @return The AvailabilitySetName value.
    */
    public String getAvailabilitySetName() {
        return this.availabilitySetName;
    }
    
    /**
    * Optional. The name of the availability set the virtual machine belongs
    * to. This value controls the virtual machine allocation in the Windows
    * Azure environment. Virtual machines specified in the same availability
    * set are allocated to different nodes to maximize availability.
    * @param availabilitySetNameValue The AvailabilitySetName value.
    */
    public void setAvailabilitySetName(final String availabilitySetNameValue) {
        this.availabilitySetName = availabilitySetNameValue;
    }
    
    private ArrayList<ConfigurationSet> configurationSets;
    
    /**
    * Optional. Contains the collection of configuration sets that contain
    * system and application configuration settings.
    * @return The ConfigurationSets value.
    */
    public ArrayList<ConfigurationSet> getConfigurationSets() {
        return this.configurationSets;
    }
    
    /**
    * Optional. Contains the collection of configuration sets that contain
    * system and application configuration settings.
    * @param configurationSetsValue The ConfigurationSets value.
    */
    public void setConfigurationSets(final ArrayList<ConfigurationSet> configurationSetsValue) {
        this.configurationSets = configurationSetsValue;
    }
    
    private ArrayList<DataVirtualHardDisk> dataVirtualHardDisks;
    
    /**
    * Optional. Contains the parameters Azure used to create the data disk for
    * the virtual machine.
    * @return The DataVirtualHardDisks value.
    */
    public ArrayList<DataVirtualHardDisk> getDataVirtualHardDisks() {
        return this.dataVirtualHardDisks;
    }
    
    /**
    * Optional. Contains the parameters Azure used to create the data disk for
    * the virtual machine.
    * @param dataVirtualHardDisksValue The DataVirtualHardDisks value.
    */
    public void setDataVirtualHardDisks(final ArrayList<DataVirtualHardDisk> dataVirtualHardDisksValue) {
        this.dataVirtualHardDisks = dataVirtualHardDisksValue;
    }
    
    private String defaultWinRmCertificateThumbprint;
    
    /**
    * Optional. The read-only thumbprint of the certificate that is used with
    * the HTTPS listener for WinRM.
    * @return The DefaultWinRmCertificateThumbprint value.
    */
    public String getDefaultWinRmCertificateThumbprint() {
        return this.defaultWinRmCertificateThumbprint;
    }
    
    /**
    * Optional. The read-only thumbprint of the certificate that is used with
    * the HTTPS listener for WinRM.
    * @param defaultWinRmCertificateThumbprintValue The
    * DefaultWinRmCertificateThumbprint value.
    */
    public void setDefaultWinRmCertificateThumbprint(final String defaultWinRmCertificateThumbprintValue) {
        this.defaultWinRmCertificateThumbprint = defaultWinRmCertificateThumbprintValue;
    }
    
    private String osVersion;
    
    /**
    * Optional. The version of the operating system on which the role instances
    * are running.
    * @return The OsVersion value.
    */
    public String getOsVersion() {
        return this.osVersion;
    }
    
    /**
    * Optional. The version of the operating system on which the role instances
    * are running.
    * @param osVersionValue The OsVersion value.
    */
    public void setOsVersion(final String osVersionValue) {
        this.osVersion = osVersionValue;
    }
    
    private OSVirtualHardDisk oSVirtualHardDisk;
    
    /**
    * Optional. Contains the parameters Azure used to create the operating
    * system disk for the virtual machine.
    * @return The OSVirtualHardDisk value.
    */
    public OSVirtualHardDisk getOSVirtualHardDisk() {
        return this.oSVirtualHardDisk;
    }
    
    /**
    * Optional. Contains the parameters Azure used to create the operating
    * system disk for the virtual machine.
    * @param oSVirtualHardDiskValue The OSVirtualHardDisk value.
    */
    public void setOSVirtualHardDisk(final OSVirtualHardDisk oSVirtualHardDiskValue) {
        this.oSVirtualHardDisk = oSVirtualHardDiskValue;
    }
    
    private String roleName;
    
    /**
    * Optional. The name for the virtual machine. The name is unique within
    * Azure.
    * @return The RoleName value.
    */
    public String getRoleName() {
        return this.roleName;
    }
    
    /**
    * Optional. The name for the virtual machine. The name is unique within
    * Azure.
    * @param roleNameValue The RoleName value.
    */
    public void setRoleName(final String roleNameValue) {
        this.roleName = roleNameValue;
    }
    
    private String roleSize;
    
    /**
    * Optional. The size of the virtual machine.
    * @return The RoleSize value.
    */
    public String getRoleSize() {
        return this.roleSize;
    }
    
    /**
    * Optional. The size of the virtual machine.
    * @param roleSizeValue The RoleSize value.
    */
    public void setRoleSize(final String roleSizeValue) {
        this.roleSize = roleSizeValue;
    }
    
    private VirtualMachineRoleType roleType;
    
    /**
    * Optional. The type of the role for the virtual machine. The only
    * supported value is PersistentVMRole.
    * @return The RoleType value.
    */
    public VirtualMachineRoleType getRoleType() {
        return this.roleType;
    }
    
    /**
    * Optional. The type of the role for the virtual machine. The only
    * supported value is PersistentVMRole.
    * @param roleTypeValue The RoleType value.
    */
    public void setRoleType(final VirtualMachineRoleType roleTypeValue) {
        this.roleType = roleTypeValue;
    }
    
    /**
    * Initializes a new instance of the VirtualMachineGetResponse class.
    *
    */
    public VirtualMachineGetResponse() {
        super();
        this.setConfigurationSets(new LazyArrayList<ConfigurationSet>());
        this.setDataVirtualHardDisks(new LazyArrayList<DataVirtualHardDisk>());
    }
}
