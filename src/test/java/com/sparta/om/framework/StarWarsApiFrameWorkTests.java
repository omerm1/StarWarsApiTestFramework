package com.sparta.om.framework;

import com.sparta.om.framework.connection.ConnectionManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class StarWarsApiFrameWorkTests {
    @Nested
    @DisplayName("Connection Manager tests")
    class ConnectionManagerTests {
        @Test
        @DisplayName("Check that getStatusCode works")
        void checkThatGetStatusCodeWorks(){
            Assertions.assertEquals(200, ConnectionManager.getStatusCode());
        }

        @Test
        @DisplayName("Check that getConnection is not empty")
        void checkThatGetConnectionIsNotEmpty(){
            Assertions.assertNotEquals("", ConnectionManager.getConnection());
        }

        @Test
        @DisplayName("Check that getConnection is not null")
        void checkThatGetConnectionIsNotNull(){
            Assertions.assertNotNull(ConnectionManager.getConnection());
        }
    }

    @Nested
    @DisplayName("Injector Tests")
    class InjectorTests {
    }
}
