// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.BackupPolicyInner;
import com.azure.resourcemanager.netapp.models.BackupPoliciesList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class BackupPoliciesListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupPoliciesList model = BinaryData.fromString(
            "{\"value\":[{\"etag\":\"qlbjbsybbqwrvt\",\"properties\":{\"backupPolicyId\":\"gmfpgvmp\",\"provisioningState\":\"as\",\"dailyBackupsToKeep\":753407395,\"weeklyBackupsToKeep\":522033644,\"monthlyBackupsToKeep\":178976731,\"volumesAssigned\":1464941672,\"enabled\":true,\"volumeBackups\":[{\"volumeName\":\"bdsrez\",\"backupsCount\":187520251,\"policyEnabled\":false},{\"volumeName\":\"uyowqkdwy\",\"backupsCount\":174588693,\"policyEnabled\":false},{\"volumeName\":\"rcgp\",\"backupsCount\":1400964444,\"policyEnabled\":false},{\"volumeName\":\"ejzanlfz\",\"backupsCount\":386879497,\"policyEnabled\":false}]},\"location\":\"bzonok\",\"tags\":{\"irgzp\":\"jq\"},\"id\":\"rlazszrnw\",\"name\":\"iin\",\"type\":\"fpwpjylwbt\"},{\"etag\":\"flsjc\",\"properties\":{\"backupPolicyId\":\"szfjvfbgofelja\",\"provisioningState\":\"qmqhldvriii\",\"dailyBackupsToKeep\":1756672367,\"weeklyBackupsToKeep\":401482588,\"monthlyBackupsToKeep\":1672429293,\"volumesAssigned\":42140994,\"enabled\":true,\"volumeBackups\":[{\"volumeName\":\"xsowu\",\"backupsCount\":750613603,\"policyEnabled\":true},{\"volumeName\":\"ahhxvrh\",\"backupsCount\":2135501499,\"policyEnabled\":true}]},\"location\":\"g\",\"tags\":{\"xujxuknd\":\"pughftqsxh\",\"ihwhbotzingamvpp\":\"digrjguufzdmsyqt\",\"zqzudph\":\"o\"},\"id\":\"amvdkfwynwcvtbv\",\"name\":\"ayhmtnvyqiatkz\",\"type\":\"pcnp\"},{\"etag\":\"cjaesgvvs\",\"properties\":{\"backupPolicyId\":\"yajguqfhwygzlv\",\"provisioningState\":\"kfxu\",\"dailyBackupsToKeep\":2087511541,\"weeklyBackupsToKeep\":1547666647,\"monthlyBackupsToKeep\":252265287,\"volumesAssigned\":372421736,\"enabled\":true,\"volumeBackups\":[{\"volumeName\":\"qdpsqxqvpsvu\",\"backupsCount\":1326232205,\"policyEnabled\":false},{\"volumeName\":\"elvezrypq\",\"backupsCount\":643673289,\"policyEnabled\":true}]},\"location\":\"erqwkyhkobopg\",\"tags\":{\"wep\":\"k\"},\"id\":\"qpcrf\",\"name\":\"bwccsnjvcdwxlpqe\",\"type\":\"ftnkhtj\"},{\"etag\":\"i\",\"properties\":{\"backupPolicyId\":\"wfqatmtd\",\"provisioningState\":\"mdvy\",\"dailyBackupsToKeep\":932898449,\"weeklyBackupsToKeep\":1851759881,\"monthlyBackupsToKeep\":624157964,\"volumesAssigned\":2142197435,\"enabled\":false,\"volumeBackups\":[{\"volumeName\":\"ryuzh\",\"backupsCount\":524454595,\"policyEnabled\":true},{\"volumeName\":\"rvqqaatj\",\"backupsCount\":379667314,\"policyEnabled\":true},{\"volumeName\":\"upmfiibfg\",\"backupsCount\":2107533163,\"policyEnabled\":false}]},\"location\":\"vrwxkv\",\"tags\":{\"vjayvblmhvkzu\":\"gllqwjy\"},\"id\":\"bxvvyhg\",\"name\":\"opbyrqufegxu\",\"type\":\"wz\"}]}")
            .toObject(BackupPoliciesList.class);
        Assertions.assertEquals("bzonok", model.value().get(0).location());
        Assertions.assertEquals("jq", model.value().get(0).tags().get("irgzp"));
        Assertions.assertEquals(753407395, model.value().get(0).dailyBackupsToKeep());
        Assertions.assertEquals(522033644, model.value().get(0).weeklyBackupsToKeep());
        Assertions.assertEquals(178976731, model.value().get(0).monthlyBackupsToKeep());
        Assertions.assertEquals(true, model.value().get(0).enabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupPoliciesList model = new BackupPoliciesList().withValue(Arrays.asList(
            new BackupPolicyInner().withLocation("bzonok").withTags(mapOf("irgzp", "jq"))
                .withDailyBackupsToKeep(753407395).withWeeklyBackupsToKeep(522033644)
                .withMonthlyBackupsToKeep(178976731).withEnabled(true),
            new BackupPolicyInner().withLocation("g")
                .withTags(mapOf("xujxuknd", "pughftqsxh", "ihwhbotzingamvpp", "digrjguufzdmsyqt", "zqzudph", "o"))
                .withDailyBackupsToKeep(1756672367).withWeeklyBackupsToKeep(401482588)
                .withMonthlyBackupsToKeep(1672429293).withEnabled(true),
            new BackupPolicyInner().withLocation("erqwkyhkobopg").withTags(mapOf("wep", "k"))
                .withDailyBackupsToKeep(2087511541).withWeeklyBackupsToKeep(1547666647)
                .withMonthlyBackupsToKeep(252265287).withEnabled(true),
            new BackupPolicyInner().withLocation("vrwxkv").withTags(mapOf("vjayvblmhvkzu", "gllqwjy"))
                .withDailyBackupsToKeep(932898449).withWeeklyBackupsToKeep(1851759881)
                .withMonthlyBackupsToKeep(624157964).withEnabled(false)));
        model = BinaryData.fromObject(model).toObject(BackupPoliciesList.class);
        Assertions.assertEquals("bzonok", model.value().get(0).location());
        Assertions.assertEquals("jq", model.value().get(0).tags().get("irgzp"));
        Assertions.assertEquals(753407395, model.value().get(0).dailyBackupsToKeep());
        Assertions.assertEquals(522033644, model.value().get(0).weeklyBackupsToKeep());
        Assertions.assertEquals(178976731, model.value().get(0).monthlyBackupsToKeep());
        Assertions.assertEquals(true, model.value().get(0).enabled());
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
