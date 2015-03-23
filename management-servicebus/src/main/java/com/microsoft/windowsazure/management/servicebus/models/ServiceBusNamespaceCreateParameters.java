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

package com.microsoft.windowsazure.management.servicebus.models;

import System.Nullable;

public class ServiceBusNamespaceCreateParameters {
    private boolean createACSNamespace;
    
    /**
    * Optional. Whether or not ACS authentication is needed for ServiceBus.
    * @return The CreateACSNamespace value.
    */
    public boolean isCreateACSNamespace() {
        return this.createACSNamespace;
    }
    
    /**
    * Optional. Whether or not ACS authentication is needed for ServiceBus.
    * @param createACSNamespaceValue The CreateACSNamespace value.
    */
    public void setCreateACSNamespace(final boolean createACSNamespaceValue) {
        this.createACSNamespace = createACSNamespaceValue;
    }
    
    private NamespaceType namespaceType;
    
    /**
    * Required. Gets or sets the namespace type.
    * @return The NamespaceType value.
    */
    public NamespaceType getNamespaceType() {
        return this.namespaceType;
    }
    
    /**
    * Required. Gets or sets the namespace type.
    * @param namespaceTypeValue The NamespaceType value.
    */
    public void setNamespaceType(final NamespaceType namespaceTypeValue) {
        this.namespaceType = namespaceTypeValue;
    }
    
    private String region;
    
    /**
    * Required. The namespace region.
    * @return The Region value.
    */
    public String getRegion() {
        return this.region;
    }
    
    /**
    * Required. The namespace region.
    * @param regionValue The Region value.
    */
    public void setRegion(final String regionValue) {
        this.region = regionValue;
    }
    
    /**
    * Initializes a new instance of the ServiceBusNamespaceCreateParameters
    * class.
    *
    */
    public ServiceBusNamespaceCreateParameters() {
    }
    
    /**
    * Initializes a new instance of the ServiceBusNamespaceCreateParameters
    * class with required arguments.
    *
    * @param region The namespace region.
    * @param namespaceType Gets or sets the namespace type.
    */
    public ServiceBusNamespaceCreateParameters(String region, Nullable<NamespaceType> namespaceType) {
        if (region == null) {
            throw new NullPointerException("region");
        }
        if (namespaceType == null) {
            throw new NullPointerException("namespaceType");
        }
        this.setRegion(region);
        this.setNamespaceType(namespaceType);
    }
}
