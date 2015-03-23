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

public class AGHttpListener {
    private String frontendIP;
    
    /**
    * Optional. Name of the Frontend IP.
    * @return The FrontendIP value.
    */
    public String getFrontendIP() {
        return this.frontendIP;
    }
    
    /**
    * Optional. Name of the Frontend IP.
    * @param frontendIPValue The FrontendIP value.
    */
    public void setFrontendIP(final String frontendIPValue) {
        this.frontendIP = frontendIPValue;
    }
    
    private String frontendPort;
    
    /**
    * Optional.
    * @return The FrontendPort value.
    */
    public String getFrontendPort() {
        return this.frontendPort;
    }
    
    /**
    * Optional.
    * @param frontendPortValue The FrontendPort value.
    */
    public void setFrontendPort(final String frontendPortValue) {
        this.frontendPort = frontendPortValue;
    }
    
    private String name;
    
    /**
    * Optional. Name of the Front End Port.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Optional. Name of the Front End Port.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private Protocol protocol;
    
    /**
    * Optional. Protocol
    * @return The Protocol value.
    */
    public Protocol getProtocol() {
        return this.protocol;
    }
    
    /**
    * Optional. Protocol
    * @param protocolValue The Protocol value.
    */
    public void setProtocol(final Protocol protocolValue) {
        this.protocol = protocolValue;
    }
    
    private String sslCert;
    
    /**
    * Optional. Whether to do load balancing using cookie based affinity
    * @return The SslCert value.
    */
    public String getSslCert() {
        return this.sslCert;
    }
    
    /**
    * Optional. Whether to do load balancing using cookie based affinity
    * @param sslCertValue The SslCert value.
    */
    public void setSslCert(final String sslCertValue) {
        this.sslCert = sslCertValue;
    }
}
