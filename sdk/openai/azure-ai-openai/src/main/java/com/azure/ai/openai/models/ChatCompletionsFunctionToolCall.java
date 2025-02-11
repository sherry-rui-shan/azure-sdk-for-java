// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A tool call to a function tool, issued by the model in evaluation of a configured function tool, that represents
 * a function invocation needed for a subsequent chat completions request to resolve.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("function")
@Immutable
public final class ChatCompletionsFunctionToolCall extends ChatCompletionsToolCall {

    /*
     * The details of the function invocation requested by the tool call.
     */
    @Generated
    @JsonProperty(value = "function")
    private FunctionCall function;

    /**
     * Creates an instance of ChatCompletionsFunctionToolCall class.
     *
     * @param id the id value to set.
     * @param function the function value to set.
     */
    @JsonCreator
    public ChatCompletionsFunctionToolCall(@JsonProperty(value = "id") String id,
        @JsonProperty(value = "function") FunctionCall function) {
        super(id, "function");
        this.function = function;
    }

    /**
     * Get the function property: The details of the function invocation requested by the tool call.
     *
     * @return the function value.
     */
    @Generated
    public FunctionCall getFunction() {
        return this.function;
    }
}
