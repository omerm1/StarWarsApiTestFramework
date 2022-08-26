package com.sparta.om.framework.injection;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.om.framework.DTO.BaseDTO;
import com.sparta.om.framework.DTO.PeopleDTO;
import com.sparta.om.framework.DTO.PlanetsDTO;
import com.sparta.om.framework.DTO.VehicleDTO;

import java.io.IOException;
import java.net.URL;

public class Injector {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static BaseDTO injectPeopleDTO(String path) {
        BaseDTO dto = new BaseDTO();

        try {
            dto = mapper.readValue(new URL(path), BaseDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dto;
    }


    public static PeopleDTO injectPeopleWithNDTO(String path) {
        PeopleDTO dto = new PeopleDTO();

        try {
            dto = mapper.readValue(new URL(path),  PeopleDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dto;
    }

    public static BaseDTO injectBaseDTO(String path) {
        BaseDTO dto = new BaseDTO();

        try {
            dto = mapper.readValue(new URL(path), BaseDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dto;
    }


    public static PlanetsDTO injectPlanetsDTO(String path) {
        PlanetsDTO dto = new PlanetsDTO();

        try {
            dto = mapper.readValue(new URL(path), PlanetsDTO.class);
            } catch (IOException e) {
            e.printStackTrace();
        }
        return dto;
    }

    public static VehicleDTO injectVehicleDTO(String path) {
        VehicleDTO dto = new VehicleDTO();

        try {
            dto = mapper.readValue(new URL(path), VehicleDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dto;
    }
}
