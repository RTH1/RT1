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

package com.microsoft.windowsazure.management.network.models;

public class IPsecParameters {
    private String encryptionType;
    
    /**
    * Optional. The encryption type that will be used on the connection.
    * @return The EncryptionType value.
    */
    public String getEncryptionType() {
        return this.encryptionType;
    }
    
    /**
    * Optional. The encryption type that will be used on the connection.
    * @param encryptionTypeValue The EncryptionType value.
    */
    public void setEncryptionType(final String encryptionTypeValue) {
        this.encryptionType = encryptionTypeValue;
    }
    
    private String pfsGroup;
    
    /**
    * Optional. The PfsGroup type that will be used on the connection.
    * @return The PfsGroup value.
    */
    public String getPfsGroup() {
        return this.pfsGroup;
    }
    
    /**
    * Optional. The PfsGroup type that will be used on the connection.
    * @param pfsGroupValue The PfsGroup value.
    */
    public void setPfsGroup(final String pfsGroupValue) {
        this.pfsGroup = pfsGroupValue;
    }
    
    private int sADataSizeKilobytes;
    
    /**
    * Optional.
    * @return The SADataSizeKilobytes value.
    */
    public int getSADataSizeKilobytes() {
        return this.sADataSizeKilobytes;
    }
    
    /**
    * Optional.
    * @param sADataSizeKilobytesValue The SADataSizeKilobytes value.
    */
    public void setSADataSizeKilobytes(final int sADataSizeKilobytesValue) {
        this.sADataSizeKilobytes = sADataSizeKilobytesValue;
    }
    
    private int sALifeTimeSeconds;
    
    /**
    * Optional.
    * @return The SALifeTimeSeconds value.
    */
    public int getSALifeTimeSeconds() {
        return this.sALifeTimeSeconds;
    }
    
    /**
    * Optional.
    * @param sALifeTimeSecondsValue The SALifeTimeSeconds value.
    */
    public void setSALifeTimeSeconds(final int sALifeTimeSecondsValue) {
        this.sALifeTimeSeconds = sALifeTimeSecondsValue;
    }
}
