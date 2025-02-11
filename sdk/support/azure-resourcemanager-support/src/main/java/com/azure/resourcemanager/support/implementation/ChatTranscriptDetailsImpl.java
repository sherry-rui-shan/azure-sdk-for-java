// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.support.fluent.models.ChatTranscriptDetailsInner;
import com.azure.resourcemanager.support.models.ChatTranscriptDetails;
import com.azure.resourcemanager.support.models.MessageProperties;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class ChatTranscriptDetailsImpl implements ChatTranscriptDetails {
    private ChatTranscriptDetailsInner innerObject;

    private final com.azure.resourcemanager.support.SupportManager serviceManager;

    ChatTranscriptDetailsImpl(
        ChatTranscriptDetailsInner innerObject, com.azure.resourcemanager.support.SupportManager serviceManager) {
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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public List<MessageProperties> messages() {
        List<MessageProperties> inner = this.innerModel().messages();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public ChatTranscriptDetailsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.support.SupportManager manager() {
        return this.serviceManager;
    }
}
