package com.sparta.om.tests;

import com.sparta.om.framework.DTO.BaseDTO;
import com.sparta.om.framework.DTO.PlanetsDTO;
import com.sparta.om.framework.connection.ConnectionManager;
import com.sparta.om.framework.injection.Injector;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlanetsDTOTests {

    private static PlanetsDTO dto;
    private static int statusCode;

    private static int page = 0;

    @BeforeAll
    static void init() {
        dto = Injector.injectPlanetsDTO(ConnectionManager.getConnection("planets" , 1));
        statusCode = ConnectionManager.getStatusCode();

    }

    @Test
    @DisplayName("ResidentsUrlCheck")
    void residentsUrlCheck(){
        dto.residentsUrlChecker();
    }
}
