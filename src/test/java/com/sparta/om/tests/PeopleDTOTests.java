package com.sparta.om.tests;

import com.sparta.om.framework.connection.ConnectionManager;
import com.sparta.om.framework.injection.Injector;
import com.sparta.om.framework.peopledto.PeopleDTO;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PeopleDTOTests {
    private static PeopleDTO dto;
    private static int statusCode;

    @BeforeAll
    static void init() {
        dto = Injector.injectPeopleDTO(ConnectionManager.getConnection("people", ""));
        statusCode = ConnectionManager.getStatusCode();

    }

    @Nested
    @DisplayName("Count Tests")
    class CountTests {
        @Test
        @DisplayName("Is count a positive number")
        void isCountAPositiveNumber(){
            System.out.println(ConnectionManager.getConnection());
            System.out.println(dto);
            assertTrue(dto.isCountAPositiveNumber());
        }

        @Test
        @DisplayName("Is count an int")
        void isCountAnInt(){
            assertTrue(dto.isCountAnInt());
        }

        @Test
        @DisplayName("Is count not null")
        void isCountNotNull(){
            assertTrue(dto.isCountNotNull());
        }

        @Test
        @DisplayName("Is count not empty")
        void isCountNotEmpty(){
            assertTrue(dto.isCountNotEmpty());
        }
    }

}
