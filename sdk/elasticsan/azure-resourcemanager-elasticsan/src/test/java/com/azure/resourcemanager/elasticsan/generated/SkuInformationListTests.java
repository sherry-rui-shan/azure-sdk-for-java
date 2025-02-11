// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elasticsan.models.SkuInformationList;

public final class SkuInformationListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SkuInformationList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"Premium_LRS\",\"tier\":\"Premium\",\"resourceType\":\"xqhabi\",\"locations\":[\"kxwczbyscnpqxuhi\",\"y\"],\"locationInfo\":[{\"location\":\"b\",\"zones\":[\"k\",\"vd\"]},{\"location\":\"jgrtfwvukxga\",\"zones\":[\"cs\",\"h\"]},{\"location\":\"cnyejhkryhtnapcz\",\"zones\":[\"kjyemkk\",\"ni\"]},{\"location\":\"oxzjnchgejspod\",\"zones\":[\"lzydehojwyahux\",\"npmqnjaqwixjspro\"]}],\"capabilities\":[{\"name\":\"utegjvwmfdats\",\"value\":\"dvpjhulsuuvmk\"},{\"name\":\"zkrwfn\",\"value\":\"odjpslwejd\"},{\"name\":\"wryoqpsoacc\",\"value\":\"zakljlahbc\"},{\"name\":\"ffdfdosygexpa\",\"value\":\"akhmsbzjhcrz\"}]}],\"nextLink\":\"dphlxaolt\"}")
                .toObject(SkuInformationList.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SkuInformationList model = new SkuInformationList();
        model = BinaryData.fromObject(model).toObject(SkuInformationList.class);
    }
}
