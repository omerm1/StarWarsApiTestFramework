package com.sparta.om.framework.injection;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.om.framework.peopledto.PeopleDTO;
import com.sparta.om.framework.peopledto.PeopleWithNDTO;

import java.io.IOException;
import java.net.URL;

public class Injector {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static PeopleDTO injectPeopleDTO(String path) {
        PeopleDTO dto = new PeopleDTO();

        try {
            dto = mapper.readValue(new URL(path), PeopleDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dto;
    }

    public static PeopleWithNDTO injectPeopleWithNDTO(String path, int endpoint) {
        PeopleWithNDTO dto = new  PeopleWithNDTO();

        try {
            dto = mapper.readValue(new URL(path),  PeopleWithNDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dto;
    }
}
