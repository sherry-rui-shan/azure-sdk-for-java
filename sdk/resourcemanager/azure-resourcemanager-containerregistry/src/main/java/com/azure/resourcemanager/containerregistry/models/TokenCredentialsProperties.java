// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties of the credentials that can be used for authenticating the token. */
@Fluent
public final class TokenCredentialsProperties {
    /*
     * The certificates property.
     */
    @JsonProperty(value = "certificates")
    private List<TokenCertificate> certificates;

    /*
     * The passwords property.
     */
    @JsonProperty(value = "passwords")
    private List<TokenPassword> passwords;

    /** Creates an instance of TokenCredentialsProperties class. */
    public TokenCredentialsProperties() {
    }

    /**
     * Get the certificates property: The certificates property.
     *
     * @return the certificates value.
     */
    public List<TokenCertificate> certificates() {
        return this.certificates;
    }

    /**
     * Set the certificates property: The certificates property.
     *
     * @param certificates the certificates value to set.
     * @return the TokenCredentialsProperties object itself.
     */
    public TokenCredentialsProperties withCertificates(List<TokenCertificate> certificates) {
        this.certificates = certificates;
        return this;
    }

    /**
     * Get the passwords property: The passwords property.
     *
     * @return the passwords value.
     */
    public List<TokenPassword> passwords() {
        return this.passwords;
    }

    /**
     * Set the passwords property: The passwords property.
     *
     * @param passwords the passwords value to set.
     * @return the TokenCredentialsProperties object itself.
     */
    public TokenCredentialsProperties withPasswords(List<TokenPassword> passwords) {
        this.passwords = passwords;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (certificates() != null) {
            certificates().forEach(e -> e.validate());
        }
        if (passwords() != null) {
            passwords().forEach(e -> e.validate());
        }
    }
}
