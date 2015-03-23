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

package com.microsoft.azure.management.resources.models;

import com.microsoft.windowsazure.core.AzureOperationResponse;

/**
* Resource provider information.
*/
public class ProviderGetResult extends AzureOperationResponse {
    private Provider provider;
    
    /**
    * Optional. Gets or sets the resource provider.
    * @return The Provider value.
    */
    public Provider getProvider() {
        return this.provider;
    }
    
    /**
    * Optional. Gets or sets the resource provider.
    * @param providerValue The Provider value.
    */
    public void setProvider(final Provider providerValue) {
        this.provider = providerValue;
    }
}
