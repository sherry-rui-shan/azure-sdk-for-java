// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.appplatform.models.CertificateProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Certificate resource payload. */
@Fluent
public final class CertificateResourceInner extends ProxyResource {
    /*
     * Properties of the certificate resource payload.
     */
    @JsonProperty(value = "properties")
    private CertificateProperties properties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the properties property: Properties of the certificate resource payload.
     *
     * @return the properties value.
     */
    public CertificateProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the certificate resource payload.
     *
     * @param properties the properties value to set.
     * @return the CertificateResourceInner object itself.
     */
    public CertificateResourceInner withProperties(CertificateProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
