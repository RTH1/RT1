/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.eventgrid.v2020_06_01.implementation.DomainTopicInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.eventgrid.v2020_06_01.implementation.EventGridManager;

/**
 * Type representing DomainTopic.
 */
public interface DomainTopic extends HasInner<DomainTopicInner>, Indexable, Refreshable<DomainTopic>, Updatable<DomainTopic.Update>, HasManager<EventGridManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    DomainTopicProvisioningState provisioningState();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the DomainTopic definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithDomain, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of DomainTopic definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a DomainTopic definition.
         */
        interface Blank extends WithDomain {
        }

        /**
         * The stage of the domaintopic definition allowing to specify Domain.
         */
        interface WithDomain {
           /**
            * Specifies resourceGroupName, domainName.
            * @param resourceGroupName The name of the resource group within the user's subscription
            * @param domainName Name of the domain
            * @return the next definition stage
            */
            WithCreate withExistingDomain(String resourceGroupName, String domainName);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<DomainTopic> {
        }
    }
    /**
     * The template for a DomainTopic update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<DomainTopic> {
    }

    /**
     * Grouping of DomainTopic update stages.
     */
    interface UpdateStages {
    }
}
