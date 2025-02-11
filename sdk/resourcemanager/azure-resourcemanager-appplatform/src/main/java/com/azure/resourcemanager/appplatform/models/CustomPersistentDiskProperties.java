// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Custom persistent disk resource payload. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = CustomPersistentDiskProperties.class)
@JsonTypeName("CustomPersistentDiskProperties")
@JsonSubTypes({@JsonSubTypes.Type(name = "AzureFileVolume", value = AzureFileVolume.class)})
@Fluent
public class CustomPersistentDiskProperties {
    /*
     * The mount path of the persistent disk.
     */
    @JsonProperty(value = "mountPath", required = true)
    private String mountPath;

    /*
     * Indicates whether the persistent disk is a readOnly one.
     */
    @JsonProperty(value = "readOnly")
    private Boolean readOnly;

    /*
     * These are the mount options for a persistent disk.
     */
    @JsonProperty(value = "mountOptions")
    private List<String> mountOptions;

    /**
     * Get the mountPath property: The mount path of the persistent disk.
     *
     * @return the mountPath value.
     */
    public String mountPath() {
        return this.mountPath;
    }

    /**
     * Set the mountPath property: The mount path of the persistent disk.
     *
     * @param mountPath the mountPath value to set.
     * @return the CustomPersistentDiskProperties object itself.
     */
    public CustomPersistentDiskProperties withMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }

    /**
     * Get the readOnly property: Indicates whether the persistent disk is a readOnly one.
     *
     * @return the readOnly value.
     */
    public Boolean readOnly() {
        return this.readOnly;
    }

    /**
     * Set the readOnly property: Indicates whether the persistent disk is a readOnly one.
     *
     * @param readOnly the readOnly value to set.
     * @return the CustomPersistentDiskProperties object itself.
     */
    public CustomPersistentDiskProperties withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * Get the mountOptions property: These are the mount options for a persistent disk.
     *
     * @return the mountOptions value.
     */
    public List<String> mountOptions() {
        return this.mountOptions;
    }

    /**
     * Set the mountOptions property: These are the mount options for a persistent disk.
     *
     * @param mountOptions the mountOptions value to set.
     * @return the CustomPersistentDiskProperties object itself.
     */
    public CustomPersistentDiskProperties withMountOptions(List<String> mountOptions) {
        this.mountOptions = mountOptions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (mountPath() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property mountPath in model CustomPersistentDiskProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CustomPersistentDiskProperties.class);
}
