// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.models.DbMigrationStatus;
import com.azure.resourcemanager.postgresqlflexibleserver.models.MigrationDbState;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class DbMigrationStatusTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DbMigrationStatus model =
            BinaryData
                .fromString(
                    "{\"databaseName\":\"rmnjijpx\",\"migrationState\":\"Succeeded\",\"migrationOperation\":\"udfnbyxba\",\"startedOn\":\"2021-12-06T14:29:26Z\",\"endedOn\":\"2020-12-27T23:27:21Z\",\"fullLoadQueuedTables\":1515133247,\"fullLoadErroredTables\":2087674757,\"fullLoadLoadingTables\":662894219,\"fullLoadCompletedTables\":936751244,\"cdcUpdateCounter\":1942204263,\"cdcDeleteCounter\":1007625802,\"cdcInsertCounter\":641301519,\"appliedChanges\":1575788840,\"incomingChanges\":605445397,\"latency\":1754113707,\"message\":\"vfdnwnwmewzsyyce\"}")
                .toObject(DbMigrationStatus.class);
        Assertions.assertEquals("rmnjijpx", model.databaseName());
        Assertions.assertEquals(MigrationDbState.SUCCEEDED, model.migrationState());
        Assertions.assertEquals("udfnbyxba", model.migrationOperation());
        Assertions.assertEquals(OffsetDateTime.parse("2021-12-06T14:29:26Z"), model.startedOn());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-27T23:27:21Z"), model.endedOn());
        Assertions.assertEquals(1515133247, model.fullLoadQueuedTables());
        Assertions.assertEquals(2087674757, model.fullLoadErroredTables());
        Assertions.assertEquals(662894219, model.fullLoadLoadingTables());
        Assertions.assertEquals(936751244, model.fullLoadCompletedTables());
        Assertions.assertEquals(1942204263, model.cdcUpdateCounter());
        Assertions.assertEquals(1007625802, model.cdcDeleteCounter());
        Assertions.assertEquals(641301519, model.cdcInsertCounter());
        Assertions.assertEquals(1575788840, model.appliedChanges());
        Assertions.assertEquals(605445397, model.incomingChanges());
        Assertions.assertEquals(1754113707, model.latency());
        Assertions.assertEquals("vfdnwnwmewzsyyce", model.message());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DbMigrationStatus model =
            new DbMigrationStatus()
                .withDatabaseName("rmnjijpx")
                .withMigrationState(MigrationDbState.SUCCEEDED)
                .withMigrationOperation("udfnbyxba")
                .withStartedOn(OffsetDateTime.parse("2021-12-06T14:29:26Z"))
                .withEndedOn(OffsetDateTime.parse("2020-12-27T23:27:21Z"))
                .withFullLoadQueuedTables(1515133247)
                .withFullLoadErroredTables(2087674757)
                .withFullLoadLoadingTables(662894219)
                .withFullLoadCompletedTables(936751244)
                .withCdcUpdateCounter(1942204263)
                .withCdcDeleteCounter(1007625802)
                .withCdcInsertCounter(641301519)
                .withAppliedChanges(1575788840)
                .withIncomingChanges(605445397)
                .withLatency(1754113707)
                .withMessage("vfdnwnwmewzsyyce");
        model = BinaryData.fromObject(model).toObject(DbMigrationStatus.class);
        Assertions.assertEquals("rmnjijpx", model.databaseName());
        Assertions.assertEquals(MigrationDbState.SUCCEEDED, model.migrationState());
        Assertions.assertEquals("udfnbyxba", model.migrationOperation());
        Assertions.assertEquals(OffsetDateTime.parse("2021-12-06T14:29:26Z"), model.startedOn());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-27T23:27:21Z"), model.endedOn());
        Assertions.assertEquals(1515133247, model.fullLoadQueuedTables());
        Assertions.assertEquals(2087674757, model.fullLoadErroredTables());
        Assertions.assertEquals(662894219, model.fullLoadLoadingTables());
        Assertions.assertEquals(936751244, model.fullLoadCompletedTables());
        Assertions.assertEquals(1942204263, model.cdcUpdateCounter());
        Assertions.assertEquals(1007625802, model.cdcDeleteCounter());
        Assertions.assertEquals(641301519, model.cdcInsertCounter());
        Assertions.assertEquals(1575788840, model.appliedChanges());
        Assertions.assertEquals(605445397, model.incomingChanges());
        Assertions.assertEquals(1754113707, model.latency());
        Assertions.assertEquals("vfdnwnwmewzsyyce", model.message());
    }
}
