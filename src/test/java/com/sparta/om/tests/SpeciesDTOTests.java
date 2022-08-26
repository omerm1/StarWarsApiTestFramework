package com.sparta.om.tests;

import com.sparta.om.framework.DTO.SpeciesDTO;
import com.sparta.om.framework.connection.ConnectionManager;
import com.sparta.om.framework.injection.Injector;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class SpeciesDTOTests {
    private static SpeciesDTO dto;
    private static int statusCode;

    @BeforeAll
    static void init() {
        dto = Injector.injectSpeciesDTO(ConnectionManager.getConnection("species"));
        statusCode = ConnectionManager.getStatusCode();

    }
    
    @Test
    @DisplayName("name returns a string")
    void nameReturnsAString(){
            assertTrue(dto.NameIsNotNull());
    }

//    @Test
//    @DisplayName("Does Species return Url")
//    void doesNextReturnUrl(){
//        assertTrue(dto.DoesSpeciesGetURL());
//    }

}
