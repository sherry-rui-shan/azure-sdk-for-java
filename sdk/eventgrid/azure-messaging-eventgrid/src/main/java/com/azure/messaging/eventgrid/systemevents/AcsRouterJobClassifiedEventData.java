// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Schema of the Data property of an EventGridEvent for a Microsoft.Communication.RouterJobClassified event. */
@Fluent
public final class AcsRouterJobClassifiedEventData extends AcsRouterJobEventData {
    /*
     * Router Job Queue Info
     */
    @JsonProperty(value = "queueDetails")
    private AcsRouterQueueDetails queueDetails;

    /*
     * Router Job Classification Policy Id
     */
    @JsonProperty(value = "classificationPolicyId")
    private String classificationPolicyId;

    /*
     * Router Job Priority
     */
    @JsonProperty(value = "priority")
    private Integer priority;

    /*
     * Router Job Attached Worker Selector
     */
    @JsonProperty(value = "attachedWorkerSelectors")
    private List<AcsRouterWorkerSelector> attachedWorkerSelectors;

    /** Creates an instance of AcsRouterJobClassifiedEventData class. */
    public AcsRouterJobClassifiedEventData() {}

    /**
     * Get the queueDetails property: Router Job Queue Info.
     *
     * @return the queueDetails value.
     */
    public AcsRouterQueueDetails getQueueDetails() {
        return this.queueDetails;
    }

    /**
     * Set the queueDetails property: Router Job Queue Info.
     *
     * @param queueDetails the queueDetails value to set.
     * @return the AcsRouterJobClassifiedEventData object itself.
     */
    public AcsRouterJobClassifiedEventData setQueueDetails(AcsRouterQueueDetails queueDetails) {
        this.queueDetails = queueDetails;
        return this;
    }

    /**
     * Get the classificationPolicyId property: Router Job Classification Policy Id.
     *
     * @return the classificationPolicyId value.
     */
    public String getClassificationPolicyId() {
        return this.classificationPolicyId;
    }

    /**
     * Set the classificationPolicyId property: Router Job Classification Policy Id.
     *
     * @param classificationPolicyId the classificationPolicyId value to set.
     * @return the AcsRouterJobClassifiedEventData object itself.
     */
    public AcsRouterJobClassifiedEventData setClassificationPolicyId(String classificationPolicyId) {
        this.classificationPolicyId = classificationPolicyId;
        return this;
    }

    /**
     * Get the priority property: Router Job Priority.
     *
     * @return the priority value.
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * Set the priority property: Router Job Priority.
     *
     * @param priority the priority value to set.
     * @return the AcsRouterJobClassifiedEventData object itself.
     */
    public AcsRouterJobClassifiedEventData setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the attachedWorkerSelectors property: Router Job Attached Worker Selector.
     *
     * @return the attachedWorkerSelectors value.
     */
    public List<AcsRouterWorkerSelector> getAttachedWorkerSelectors() {
        return this.attachedWorkerSelectors;
    }

    /**
     * Set the attachedWorkerSelectors property: Router Job Attached Worker Selector.
     *
     * @param attachedWorkerSelectors the attachedWorkerSelectors value to set.
     * @return the AcsRouterJobClassifiedEventData object itself.
     */
    public AcsRouterJobClassifiedEventData setAttachedWorkerSelectors(
            List<AcsRouterWorkerSelector> attachedWorkerSelectors) {
        this.attachedWorkerSelectors = attachedWorkerSelectors;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsRouterJobClassifiedEventData setQueueId(String queueId) {
        super.setQueueId(queueId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsRouterJobClassifiedEventData setLabels(Map<String, String> labels) {
        super.setLabels(labels);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsRouterJobClassifiedEventData setTags(Map<String, String> tags) {
        super.setTags(tags);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsRouterJobClassifiedEventData setJobId(String jobId) {
        super.setJobId(jobId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsRouterJobClassifiedEventData setChannelReference(String channelReference) {
        super.setChannelReference(channelReference);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsRouterJobClassifiedEventData setChannelId(String channelId) {
        super.setChannelId(channelId);
        return this;
    }
}
