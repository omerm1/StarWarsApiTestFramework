package com.sparta.om.tests;

import com.sparta.om.framework.DTO.BaseDTO;
import com.sparta.om.framework.DTO.VehicleDTO;
import com.sparta.om.framework.connection.ConnectionManager;
import com.sparta.om.framework.injection.Injector;
import org.junit.jupiter.api.*;

public class VehicleDTOTests {

    private static VehicleDTO dto;
    private static int statusCode;

    @BeforeAll
    static void initAll(){
        dto = Injector.injectVehicleDTO(ConnectionManager.getConnection("vehicles"));
        statusCode = ConnectionManager.getStatusCode();
    }

}
