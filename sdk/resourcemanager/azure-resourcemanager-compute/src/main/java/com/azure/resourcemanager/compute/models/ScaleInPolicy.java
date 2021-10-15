// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes a scale-in policy for a virtual machine scale set. */
@Fluent
public final class ScaleInPolicy {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ScaleInPolicy.class);

    /*
     * The rules to be followed when scaling-in a virtual machine scale set.
     * <br><br> Possible values are: <br><br> **Default** When a virtual
     * machine scale set is scaled in, the scale set will first be balanced
     * across zones if it is a zonal scale set. Then, it will be balanced
     * across Fault Domains as far as possible. Within each Fault Domain, the
     * virtual machines chosen for removal will be the newest ones that are not
     * protected from scale-in. <br><br> **OldestVM** When a virtual machine
     * scale set is being scaled-in, the oldest virtual machines that are not
     * protected from scale-in will be chosen for removal. For zonal virtual
     * machine scale sets, the scale set will first be balanced across zones.
     * Within each zone, the oldest virtual machines that are not protected
     * will be chosen for removal. <br><br> **NewestVM** When a virtual machine
     * scale set is being scaled-in, the newest virtual machines that are not
     * protected from scale-in will be chosen for removal. For zonal virtual
     * machine scale sets, the scale set will first be balanced across zones.
     * Within each zone, the newest virtual machines that are not protected
     * will be chosen for removal. <br><br>
     */
    @JsonProperty(value = "rules")
    private List<VirtualMachineScaleSetScaleInRules> rules;

    /*
     * This property allows you to specify if virtual machines chosen for
     * removal have to be force deleted when a virtual machine scale set is
     * being scaled-in.(Feature in Preview)
     */
    @JsonProperty(value = "forceDeletion")
    private Boolean forceDeletion;

    /**
     * Get the rules property: The rules to be followed when scaling-in a virtual machine scale set.
     * &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Default** When a virtual machine scale set is
     * scaled in, the scale set will first be balanced across zones if it is a zonal scale set. Then, it will be
     * balanced across Fault Domains as far as possible. Within each Fault Domain, the virtual machines chosen for
     * removal will be the newest ones that are not protected from scale-in. &lt;br&gt;&lt;br&gt; **OldestVM** When a
     * virtual machine scale set is being scaled-in, the oldest virtual machines that are not protected from scale-in
     * will be chosen for removal. For zonal virtual machine scale sets, the scale set will first be balanced across
     * zones. Within each zone, the oldest virtual machines that are not protected will be chosen for removal.
     * &lt;br&gt;&lt;br&gt; **NewestVM** When a virtual machine scale set is being scaled-in, the newest virtual
     * machines that are not protected from scale-in will be chosen for removal. For zonal virtual machine scale sets,
     * the scale set will first be balanced across zones. Within each zone, the newest virtual machines that are not
     * protected will be chosen for removal. &lt;br&gt;&lt;br&gt;.
     *
     * @return the rules value.
     */
    public List<VirtualMachineScaleSetScaleInRules> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: The rules to be followed when scaling-in a virtual machine scale set.
     * &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Default** When a virtual machine scale set is
     * scaled in, the scale set will first be balanced across zones if it is a zonal scale set. Then, it will be
     * balanced across Fault Domains as far as possible. Within each Fault Domain, the virtual machines chosen for
     * removal will be the newest ones that are not protected from scale-in. &lt;br&gt;&lt;br&gt; **OldestVM** When a
     * virtual machine scale set is being scaled-in, the oldest virtual machines that are not protected from scale-in
     * will be chosen for removal. For zonal virtual machine scale sets, the scale set will first be balanced across
     * zones. Within each zone, the oldest virtual machines that are not protected will be chosen for removal.
     * &lt;br&gt;&lt;br&gt; **NewestVM** When a virtual machine scale set is being scaled-in, the newest virtual
     * machines that are not protected from scale-in will be chosen for removal. For zonal virtual machine scale sets,
     * the scale set will first be balanced across zones. Within each zone, the newest virtual machines that are not
     * protected will be chosen for removal. &lt;br&gt;&lt;br&gt;.
     *
     * @param rules the rules value to set.
     * @return the ScaleInPolicy object itself.
     */
    public ScaleInPolicy withRules(List<VirtualMachineScaleSetScaleInRules> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Get the forceDeletion property: This property allows you to specify if virtual machines chosen for removal have
     * to be force deleted when a virtual machine scale set is being scaled-in.(Feature in Preview).
     *
     * @return the forceDeletion value.
     */
    public Boolean forceDeletion() {
        return this.forceDeletion;
    }

    /**
     * Set the forceDeletion property: This property allows you to specify if virtual machines chosen for removal have
     * to be force deleted when a virtual machine scale set is being scaled-in.(Feature in Preview).
     *
     * @param forceDeletion the forceDeletion value to set.
     * @return the ScaleInPolicy object itself.
     */
    public ScaleInPolicy withForceDeletion(Boolean forceDeletion) {
        this.forceDeletion = forceDeletion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
