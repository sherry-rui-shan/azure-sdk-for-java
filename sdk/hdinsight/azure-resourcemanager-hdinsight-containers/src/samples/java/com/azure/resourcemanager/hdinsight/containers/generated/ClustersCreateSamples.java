// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.resourcemanager.hdinsight.containers.models.AuthorizationProfile;
import com.azure.resourcemanager.hdinsight.containers.models.AutoscaleProfile;
import com.azure.resourcemanager.hdinsight.containers.models.AutoscaleType;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterConfigFile;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterProfile;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterServiceConfig;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterServiceConfigsProfile;
import com.azure.resourcemanager.hdinsight.containers.models.ComparisonOperator;
import com.azure.resourcemanager.hdinsight.containers.models.ComparisonRule;
import com.azure.resourcemanager.hdinsight.containers.models.ComputeProfile;
import com.azure.resourcemanager.hdinsight.containers.models.IdentityProfile;
import com.azure.resourcemanager.hdinsight.containers.models.LoadBasedConfig;
import com.azure.resourcemanager.hdinsight.containers.models.NodeProfile;
import com.azure.resourcemanager.hdinsight.containers.models.ScaleActionType;
import com.azure.resourcemanager.hdinsight.containers.models.ScalingRule;
import com.azure.resourcemanager.hdinsight.containers.models.Schedule;
import com.azure.resourcemanager.hdinsight.containers.models.ScheduleBasedConfig;
import com.azure.resourcemanager.hdinsight.containers.models.ScheduleDay;
import com.azure.resourcemanager.hdinsight.containers.models.SparkProfile;
import com.azure.resourcemanager.hdinsight.containers.models.SshProfile;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for Clusters Create. */
public final class ClustersCreateSamples {
    /*
     * x-ms-original-file: specification/hdinsight/resource-manager/Microsoft.HDInsight/HDInsightOnAks/preview/2023-06-01-preview/examples/CreateSparkCluster.json
     */
    /**
     * Sample code: HDInsightSparkClusterPut.
     *
     * @param manager Entry point to HDInsightContainersManager.
     */
    public static void hDInsightSparkClusterPut(
        com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager manager) {
        manager
            .clusters()
            .define("cluster1")
            .withRegion("West US 2")
            .withExistingClusterpool("hiloResourcegroup", "clusterpool1")
            .withClusterType("spark")
            .withComputeProfile(
                new ComputeProfile()
                    .withNodes(
                        Arrays.asList(new NodeProfile().withType("worker").withVmSize("Standard_D3_v2").withCount(4))))
            .withClusterProfile(
                new ClusterProfile()
                    .withClusterVersion("0.0.1")
                    .withOssVersion("2.2.3")
                    .withIdentityProfile(
                        new IdentityProfile()
                            .withMsiResourceId(
                                "/subscriptions/subid/resourceGroups/hiloResourcegroup/providers/Microsoft.ManagedIdentity/userAssignedIdentities/test-msi")
                            .withMsiClientId("de91f1d8-767f-460a-ac11-3cf103f74b34")
                            .withMsiObjectId("40491351-c240-4042-91e0-f644a1d2b441"))
                    .withAuthorizationProfile(
                        new AuthorizationProfile().withUserIds(Arrays.asList("testuser1", "testuser2")))
                    .withServiceConfigsProfiles(
                        Arrays
                            .asList(
                                new ClusterServiceConfigsProfile()
                                    .withServiceName("spark-service")
                                    .withConfigs(
                                        Arrays
                                            .asList(
                                                new ClusterServiceConfig()
                                                    .withComponent("spark-config")
                                                    .withFiles(
                                                        Arrays
                                                            .asList(
                                                                new ClusterConfigFile()
                                                                    .withFileName("spark-defaults.conf")
                                                                    .withValues(
                                                                        mapOf("spark.eventLog.enabled", "true")))))),
                                new ClusterServiceConfigsProfile()
                                    .withServiceName("yarn-service")
                                    .withConfigs(
                                        Arrays
                                            .asList(
                                                new ClusterServiceConfig()
                                                    .withComponent("yarn-config")
                                                    .withFiles(
                                                        Arrays
                                                            .asList(
                                                                new ClusterConfigFile()
                                                                    .withFileName("core-site.xml")
                                                                    .withValues(
                                                                        mapOf(
                                                                            "fs.defaultFS",
                                                                            "wasb://testcontainer@teststorage.dfs.core.windows.net/",
                                                                            "storage.container",
                                                                            "testcontainer",
                                                                            "storage.key",
                                                                            "fakeTokenPlaceholder",
                                                                            "storage.name",
                                                                            "teststorage",
                                                                            "storage.protocol",
                                                                            "wasb")),
                                                                new ClusterConfigFile()
                                                                    .withFileName("yarn-site.xml")
                                                                    .withValues(
                                                                        mapOf("yarn.webapp.ui2.enable", "false"))))))))
                    .withSshProfile(new SshProfile().withCount(2))
                    .withSparkProfile(new SparkProfile()))
            .create();
    }

    /*
     * x-ms-original-file: specification/hdinsight/resource-manager/Microsoft.HDInsight/HDInsightOnAks/preview/2023-06-01-preview/examples/CreateAutoscaleCluster.json
     */
    /**
     * Sample code: HDInsightClusterPut.
     *
     * @param manager Entry point to HDInsightContainersManager.
     */
    public static void hDInsightClusterPut(
        com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager manager) {
        manager
            .clusters()
            .define("cluster1")
            .withRegion("West US 2")
            .withExistingClusterpool("hiloResourcegroup", "clusterpool1")
            .withClusterType("kafka")
            .withComputeProfile(
                new ComputeProfile()
                    .withNodes(
                        Arrays.asList(new NodeProfile().withType("worker").withVmSize("Standard_D3_v2").withCount(4))))
            .withClusterProfile(
                new ClusterProfile()
                    .withClusterVersion("1.0.1")
                    .withOssVersion("2.4.1")
                    .withIdentityProfile(
                        new IdentityProfile()
                            .withMsiResourceId(
                                "/subscriptions/subid/resourceGroups/hiloResourcegroup/providers/Microsoft.ManagedIdentity/userAssignedIdentities/test-msi")
                            .withMsiClientId("de91f1d8-767f-460a-ac11-3cf103f74b34")
                            .withMsiObjectId("40491351-c240-4042-91e0-f644a1d2b441"))
                    .withAuthorizationProfile(
                        new AuthorizationProfile().withUserIds(Arrays.asList("testuser1", "testuser2")))
                    .withSshProfile(new SshProfile().withCount(2))
                    .withAutoscaleProfile(
                        new AutoscaleProfile()
                            .withEnabled(true)
                            .withGracefulDecommissionTimeout(3600)
                            .withAutoscaleType(AutoscaleType.SCHEDULE_BASED)
                            .withScheduleBasedConfig(
                                new ScheduleBasedConfig()
                                    .withTimeZone("Cen. Australia Standard Time")
                                    .withDefaultCount(10)
                                    .withSchedules(
                                        Arrays
                                            .asList(
                                                new Schedule()
                                                    .withStartTime("00:00")
                                                    .withEndTime("12:00")
                                                    .withCount(20)
                                                    .withDays(Arrays.asList(ScheduleDay.MONDAY)),
                                                new Schedule()
                                                    .withStartTime("00:00")
                                                    .withEndTime("12:00")
                                                    .withCount(25)
                                                    .withDays(Arrays.asList(ScheduleDay.SUNDAY)))))
                            .withLoadBasedConfig(
                                new LoadBasedConfig()
                                    .withMinNodes(10)
                                    .withMaxNodes(20)
                                    .withPollInterval(60)
                                    .withCooldownPeriod(300)
                                    .withScalingRules(
                                        Arrays
                                            .asList(
                                                new ScalingRule()
                                                    .withActionType(ScaleActionType.SCALEUP)
                                                    .withEvaluationCount(3)
                                                    .withScalingMetric("cpu")
                                                    .withComparisonRule(
                                                        new ComparisonRule()
                                                            .withOperator(ComparisonOperator.GREATER_THAN)
                                                            .withThreshold(90f)),
                                                new ScalingRule()
                                                    .withActionType(ScaleActionType.SCALEDOWN)
                                                    .withEvaluationCount(3)
                                                    .withScalingMetric("cpu")
                                                    .withComparisonRule(
                                                        new ComparisonRule()
                                                            .withOperator(ComparisonOperator.LESS_THAN)
                                                            .withThreshold(20f))))))
                    .withKafkaProfile(mapOf()))
            .create();
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
