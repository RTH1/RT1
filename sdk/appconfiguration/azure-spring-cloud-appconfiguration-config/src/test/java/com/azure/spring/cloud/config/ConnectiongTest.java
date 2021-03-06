// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.cloud.config;

import static com.azure.spring.cloud.config.TestConstants.TEST_CONN_STRING;
import static com.azure.spring.cloud.config.TestConstants.TEST_STORE_NAME;
import static com.azure.spring.cloud.config.resource.Connection.ENDPOINT_ERR_MSG;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.azure.spring.cloud.config.resource.Connection;
import com.azure.spring.cloud.config.resource.ConnectionPool;

public class ConnectiongTest {

    private static final String NO_ENDPOINT_CONN_STRING = "Id=fake-conn-id;Secret=ZmFrZS1jb25uLXNlY3JldA==";
    private static final String NO_ID_CONN_STRING =
        "Endpoint=https://fake.test.config.io;Secret=ZmFrZS1jb25uLXNlY3JldA==";
    private static final String NO_SECRET_CONN_STRING = "Endpoint=https://fake.test.config.io;Id=fake-conn-id;";

    @Test
    public void endpointMustExistInConnectionString() {
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> new Connection(NO_ENDPOINT_CONN_STRING));
        assertThat(e).hasMessage(ENDPOINT_ERR_MSG);
    }

    @Test
    public void idMustExistInConnectionString() {
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> new Connection(NO_ID_CONN_STRING));
        assertThat(e).hasMessage(ENDPOINT_ERR_MSG);
    }

    @Test
    public void secretMustExistInConnectionString() {
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> new Connection(NO_SECRET_CONN_STRING));
        assertThat(e).hasMessage(ENDPOINT_ERR_MSG);
    }

    @Test
    public void validConnectionStringCanBeExtracted() {
        Connection connString = new Connection(TEST_CONN_STRING);
        assertConnStringFieldsValid(connString);
    }

    @Test
    public void connectionPoolMapCanBePut() {
        ConnectionPool pool = new ConnectionPool();
        pool.put(TEST_STORE_NAME, TEST_CONN_STRING);
        Connection connString = pool.get(TEST_STORE_NAME);
        assertConnStringFieldsValid(connString);
    }

    @Test
    public void nullConnectionPoolShouldNotBePut() {
        ConnectionPool pool = new ConnectionPool();
        Connection nullConnString = null;
        
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> pool.put(TEST_STORE_NAME, nullConnString));
        assertThat(e).hasMessage("Connection string should not be null.");
    }

    private void assertConnStringFieldsValid(Connection connString) {
        assertThat(connString).isNotNull();
        assertThat(connString.getEndpoint()).isEqualTo("https://fake.test.config.io");
    }
}
