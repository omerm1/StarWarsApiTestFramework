package com.sparta.om.tests;

import com.sparta.om.framework.DTO.BaseDTO;
import com.sparta.om.framework.connection.ConnectionManager;
import com.sparta.om.framework.injection.Injector;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BaseDTOTest {
    private static BaseDTO dto;
    private static int statusCode;
    private static int page = 2;

    @BeforeAll
    static void init() {
        dto = Injector.injectBaseDTO(ConnectionManager.getConnection("starships", "page", page));
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
    @Nested
    @DisplayName("NextPreviousURLTests")
    class NextPreviousURLTests {
        @Test
        @DisabledIf("onLastPage")
        @DisplayName("Is next not empty")
        void isNextNotEmpty(){
            assertTrue(dto.isNextNotEmpty());
        }

        @Test
        @DisabledIf("onLastPage")
        @DisplayName("Is next not null")
        void isNextNotNull(){
            assertTrue(dto.isNextNotNull());
        }

        @Test
        @DisabledIf("onLastPage")
        @DisplayName("Does next return Url")
        void doesNextReturnUrl(){
            assertTrue(dto.DoesNextReturnUrl());
        }

        @Test
        @DisabledIf("onFirstPage")
        @DisplayName("Is previous not empty")
        void isPreviousNotEmpty(){
            assertTrue(dto.isPreviousNotEmpty());
        }

        @Test
        @DisabledIf("onFirstPage")
        @DisplayName("Is previous not null")
        void isPreviousNotNull(){
            assertTrue(dto.isPreviousNotNull());
        }

        @Test
        @DisabledIf("onFirstPage")
        @DisplayName("Does previous return Url")
        void doesPreviousReturnUrl(){
            assertTrue(dto.DoesPreviousReturnUrl());
        }

        private boolean onFirstPage() {
            return page == 0;
        }

        private boolean onLastPage() {
            return page == 9;
        }
    }

}
