// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.DatabricksSparkPythonActivity;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DatabricksSparkPythonActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatabricksSparkPythonActivity model = BinaryData.fromString(
            "{\"type\":\"DatabricksSparkPython\",\"typeProperties\":{\"pythonFile\":\"datauzirhcghnclfahr\",\"parameters\":[\"datateuegrd\"],\"libraries\":[{\"miwoisqlsxzfycnp\":\"datatpqoajgg\"},{\"uaxfjuzgslqpzdx\":\"datanjzaaoxwcptoihoy\",\"zzscepoggzppufu\":\"datadanlgczvf\"},{\"uhjqdwlxabtlms\":\"dataaiecexy\",\"ipfqn\":\"dataqaud\"}]},\"linkedServiceName\":{\"referenceName\":\"kopivszejbptr\",\"parameters\":{\"vlo\":\"databzjem\",\"nbqsjzncg\":\"datauca\"}},\"policy\":{\"timeout\":\"dataqgivyxoj\",\"retry\":\"dataussvurslwdx\",\"retryIntervalInSeconds\":304981374,\"secureInput\":false,\"secureOutput\":true,\"\":{\"ksoqrhwl\":\"dataaq\"}},\"name\":\"nwhtwsxliwpzu\",\"description\":\"tzissrvt\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Succeeded\",\"dependsOn\":[{\"activity\":\"ubh\",\"dependencyConditions\":[\"Skipped\",\"Skipped\",\"Completed\"],\"\":{\"ehyvq\":\"datagpzyqivu\",\"jtuoy\":\"datajbqfclijec\",\"xn\":\"datadlzxuakbavpk\",\"vsgx\":\"datarbckfzb\"}},{\"activity\":\"ijnvsjgnbdhhqs\",\"dependencyConditions\":[\"Failed\",\"Failed\"],\"\":{\"fjmi\":\"dataaxdyxjicikzmvdd\"}},{\"activity\":\"b\",\"dependencyConditions\":[\"Skipped\",\"Failed\"],\"\":{\"ymrfpqyxlncwagia\":\"dataisvpfspfdf\"}},{\"activity\":\"hzotko\",\"dependencyConditions\":[\"Succeeded\"],\"\":{\"zyl\":\"datar\",\"emsl\":\"datawymrmuioepi\"}}],\"userProperties\":[{\"name\":\"vryszqzve\",\"value\":\"datawnewmpwj\"},{\"name\":\"gryolbqcftrywdg\",\"value\":\"dataskdl\"},{\"name\":\"cfzyijnxvmcx\",\"value\":\"datajlpyhdxvdj\"},{\"name\":\"cuewtnqbqgfqivm\",\"value\":\"dataxwevdjmxvvtuky\"}],\"\":{\"moidinbfbkwyvw\":\"dataj\"}}")
            .toObject(DatabricksSparkPythonActivity.class);
        Assertions.assertEquals("nwhtwsxliwpzu", model.name());
        Assertions.assertEquals("tzissrvt", model.description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SUCCEEDED, model.onInactiveMarkAs());
        Assertions.assertEquals("ubh", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SKIPPED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("vryszqzve", model.userProperties().get(0).name());
        Assertions.assertEquals("kopivszejbptr", model.linkedServiceName().referenceName());
        Assertions.assertEquals(304981374, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatabricksSparkPythonActivity model = new DatabricksSparkPythonActivity().withName("nwhtwsxliwpzu")
            .withDescription("tzissrvt").withState(ActivityState.ACTIVE)
            .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SUCCEEDED)
            .withDependsOn(Arrays.asList(
                new ActivityDependency().withActivity("ubh")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.SKIPPED, DependencyCondition.SKIPPED,
                        DependencyCondition.COMPLETED))
                    .withAdditionalProperties(mapOf()),
                new ActivityDependency().withActivity("ijnvsjgnbdhhqs")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.FAILED, DependencyCondition.FAILED))
                    .withAdditionalProperties(mapOf()),
                new ActivityDependency().withActivity("b")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.SKIPPED, DependencyCondition.FAILED))
                    .withAdditionalProperties(mapOf()),
                new ActivityDependency().withActivity("hzotko")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.SUCCEEDED))
                    .withAdditionalProperties(mapOf())))
            .withUserProperties(Arrays.asList(new UserProperty().withName("vryszqzve").withValue("datawnewmpwj"),
                new UserProperty().withName("gryolbqcftrywdg").withValue("dataskdl"),
                new UserProperty().withName("cfzyijnxvmcx").withValue("datajlpyhdxvdj"),
                new UserProperty().withName("cuewtnqbqgfqivm").withValue("dataxwevdjmxvvtuky")))
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("kopivszejbptr")
                .withParameters(mapOf("vlo", "databzjem", "nbqsjzncg", "datauca")))
            .withPolicy(new ActivityPolicy().withTimeout("dataqgivyxoj").withRetry("dataussvurslwdx")
                .withRetryIntervalInSeconds(304981374).withSecureInput(false).withSecureOutput(true)
                .withAdditionalProperties(mapOf()))
            .withPythonFile("datauzirhcghnclfahr").withParameters(Arrays.asList("datateuegrd"))
            .withLibraries(Arrays.asList(mapOf("miwoisqlsxzfycnp", "datatpqoajgg"),
                mapOf("uaxfjuzgslqpzdx", "datanjzaaoxwcptoihoy", "zzscepoggzppufu", "datadanlgczvf"),
                mapOf("uhjqdwlxabtlms", "dataaiecexy", "ipfqn", "dataqaud")));
        model = BinaryData.fromObject(model).toObject(DatabricksSparkPythonActivity.class);
        Assertions.assertEquals("nwhtwsxliwpzu", model.name());
        Assertions.assertEquals("tzissrvt", model.description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SUCCEEDED, model.onInactiveMarkAs());
        Assertions.assertEquals("ubh", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SKIPPED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("vryszqzve", model.userProperties().get(0).name());
        Assertions.assertEquals("kopivszejbptr", model.linkedServiceName().referenceName());
        Assertions.assertEquals(304981374, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
