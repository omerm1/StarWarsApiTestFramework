package com.sparta.om.tests;

import com.sparta.om.framework.connection.ConnectionManager;
import com.sparta.om.framework.injection.Injector;
import com.sparta.om.framework.peopledto.PeopleWithNDTO;

public class PeopleWithNDTOTests {
    private static PeopleWithNDTO dto;
    private static int statusCode;

    public static void main(String[] args) {
        dto = Injector.injectPeopleWithNDTO(ConnectionManager.getConnection("people", "1"));
        statusCode = ConnectionManager.getStatusCode();
        System.out.println(dto);
    }
}

