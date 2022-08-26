package com.sparta.om.tests;

import com.sparta.om.framework.DTO.BaseDTO;
import com.sparta.om.framework.DTO.PeopleDTO;
import com.sparta.om.framework.connection.ConnectionManager;
import com.sparta.om.framework.injection.Injector;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PeopleDTOTests {
    private static PeopleDTO peopleDTO;
    private static int statusCode;

    @BeforeAll
    static void init() {
        peopleDTO = Injector.injectPeopleWithNDTO(ConnectionManager.getConnection());
        statusCode = ConnectionManager.getStatusCode();
    }
    @Nested
    @DisplayName("Name Tests")
    class NameTests {
        @Test
        @DisplayName("Name returns a string")
        void nameReturnsAString() {
            System.out.println(ConnectionManager.getConnection());
            System.out.println(peopleDTO);
            assertTrue(peopleDTO.NameReturnsAString());
        }
        @Test
        @DisplayName("Name is not null")
        void nameIsNotNull(){
            assertTrue(peopleDTO.NameIsNotNull());
        }

        @Test
        @DisplayName("Name is not empty")
        void nameIsNotEmpty(){
            assertTrue(peopleDTO.NameIsNotEmpty());
        }
    }

    @Nested
    @DisplayName("Height Tests")
    class HeightTests {
        @Test
        @DisplayName("Height returns an int")
        void heightReturnsAnInt(){
            assertTrue(peopleDTO.HeightReturnsInteger());
        }
        @Test
        @DisplayName("Height is not null")
        void heightIsNotNull(){
            assertTrue(peopleDTO.HeightIsNotNull());
        }

        @Test
        @DisplayName("Height is not empty")
        void heightIsNotEmpty(){
            assertTrue(peopleDTO.HeightIsNotEmpty());
        }
    }
    @Nested
    @DisplayName("Mass Tests")
    class MassTests {
        @Test
        @DisplayName("Mass returns an int")
        void massReturnsAnInt() {
            assertTrue(peopleDTO.MassReturnsInteger());
        }

        @Test
        @DisplayName("Mass is not null")
        void massIsNotNull() {
            assertTrue(peopleDTO.MassIsNotNull());
        }

        @Test
        @DisplayName("Mass is not empty")
        void massIsNotEmpty() {
            assertTrue(peopleDTO.MassIsNotEmpty());
        }
    }

    @Nested
    @DisplayName("Hair Colour Tests")
    class HairColourTests {
        @Test
        @DisplayName("Hair Colour returns a String")
        void hairColourReturnsAString() {
            assertTrue(peopleDTO.HairColourReturnsAString());
        }

        @Test
        @DisplayName("Hair Colour is not null")
        void hairColourIsNotNull() {
            assertTrue(peopleDTO.HairColourIsNotNull());
        }

        @Test
        @DisplayName("Hair Colour is not empty")
        void hairColourIsNotEmpty() {
            assertTrue(peopleDTO.HairColourIsNotEmpty());
        }
    }

    @Nested
    @DisplayName("Skin Colour Tests")
    class SkinColourTests {
        @Test
        @DisplayName("Skin Colour returns a String")
        void skinColourReturnsAString() {
            assertTrue(peopleDTO.SkinColourReturnsAString());
        }

        @Test
        @DisplayName("Skin Colour is not null")
        void skinColourIsNotNull() {
            assertTrue(peopleDTO.SkinColourIsNotNull());
        }

        @Test
        @DisplayName("Skin Colour is not empty")
        void skinColourIsNotEmpty() {
            assertTrue(peopleDTO.SkinColourIsNotEmpty());
        }
    }
    @Nested
    @DisplayName("Eye Colour Tests")
    class EyeColourTests {
        @Test
        @DisplayName("Eye Colour returns a String")
        void eyeColourReturnsAString() {
            assertTrue(peopleDTO.EyeColourReturnsAString());
        }

        @Test
        @DisplayName("Eye Colour is not null")
        void eyeColourIsNotNull() {
            assertTrue(peopleDTO.EyeColourIsNotNull());
        }

        @Test
        @DisplayName("Eye Colour is not empty")
        void eyeColourIsNotEmpty() {
            assertTrue(peopleDTO.EyeColourIsNotEmpty());
        }
    }
}

