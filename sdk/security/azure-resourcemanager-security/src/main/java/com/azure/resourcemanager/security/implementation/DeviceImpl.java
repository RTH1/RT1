// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.resourcemanager.security.fluent.models.DeviceInner;
import com.azure.resourcemanager.security.models.AuthorizationState;
import com.azure.resourcemanager.security.models.Device;
import com.azure.resourcemanager.security.models.DeviceCriticality;
import com.azure.resourcemanager.security.models.DeviceStatus;
import com.azure.resourcemanager.security.models.Firmware;
import com.azure.resourcemanager.security.models.ManagementState;
import com.azure.resourcemanager.security.models.NetworkInterface;
import com.azure.resourcemanager.security.models.ProgrammingState;
import com.azure.resourcemanager.security.models.Protocol;
import com.azure.resourcemanager.security.models.PurdueLevel;
import com.azure.resourcemanager.security.models.ScanningFunctionality;
import com.azure.resourcemanager.security.models.Sensor;
import com.azure.resourcemanager.security.models.Site;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class DeviceImpl implements Device {
    private DeviceInner innerObject;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    DeviceImpl(DeviceInner innerObject, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String deviceType() {
        return this.innerModel().deviceType();
    }

    public String sourceName() {
        return this.innerModel().sourceName();
    }

    public List<NetworkInterface> networkInterfaces() {
        List<NetworkInterface> inner = this.innerModel().networkInterfaces();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String vendor() {
        return this.innerModel().vendor();
    }

    public String osName() {
        return this.innerModel().osName();
    }

    public List<Protocol> protocols() {
        List<Protocol> inner = this.innerModel().protocols();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public OffsetDateTime lastActiveTime() {
        return this.innerModel().lastActiveTime();
    }

    public OffsetDateTime lastUpdateTime() {
        return this.innerModel().lastUpdateTime();
    }

    public ManagementState managementState() {
        return this.innerModel().managementState();
    }

    public AuthorizationState authorizationState() {
        return this.innerModel().authorizationState();
    }

    public DeviceCriticality deviceCriticality() {
        return this.innerModel().deviceCriticality();
    }

    public PurdueLevel purdueLevel() {
        return this.innerModel().purdueLevel();
    }

    public String notes() {
        return this.innerModel().notes();
    }

    public List<Firmware> firmwares() {
        List<Firmware> inner = this.innerModel().firmwares();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public OffsetDateTime discoveryTime() {
        return this.innerModel().discoveryTime();
    }

    public ProgrammingState programmingState() {
        return this.innerModel().programmingState();
    }

    public OffsetDateTime lastProgrammingTime() {
        return this.innerModel().lastProgrammingTime();
    }

    public ScanningFunctionality scanningFunctionality() {
        return this.innerModel().scanningFunctionality();
    }

    public OffsetDateTime lastScanTime() {
        return this.innerModel().lastScanTime();
    }

    public Integer riskScore() {
        return this.innerModel().riskScore();
    }

    public List<Sensor> sensors() {
        List<Sensor> inner = this.innerModel().sensors();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Site site() {
        return this.innerModel().site();
    }

    public DeviceStatus deviceStatus() {
        return this.innerModel().deviceStatus();
    }

    public DeviceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
