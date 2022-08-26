package com.sparta.om.framework.connection;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

//Responsible for creating a connection to the endpoint
public class ConnectionManager {
    private static final String BASEURL = "https://swapi.dev/api/";

    public static String getConnection() {
        return BASEURL;
    } //For the base URL

    public static String getConnection(String key) {
        return BASEURL + key + "/?format=json";
    } //For resource

    public static String getConnection(String key, String value, int pageValue) {
        return BASEURL + key + "/?" + value + "=" + pageValue + "&format=json";
    } //For resource with pagination

    public static String getConnection(String key, int value) {
        return BASEURL + key + "/" + value + "/?format=json";
    } //For resource with N (endpoint)

    private static HttpResponse<String> getResponse() {
        var client  = HttpClient.newHttpClient();
        var request = HttpRequest
                .newBuilder()
                .uri(URI.create(BASEURL))
                .build();

        HttpResponse<String> response = null;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return response;
    }

    private static HttpResponse<String> getResponse(String url) {
        var client  = HttpClient.newHttpClient();
        var request = HttpRequest
                .newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = null;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return response;
    }

    public static int getStatusCode() {
        return getResponse().statusCode();
    }

    public static String getHeader(String key) {
        return getResponse()
                .headers()
                .firstValue(key)
                .orElse("Key not found");
    }

    public static boolean UrlChecker(String url) {
        return getResponse(url).statusCode() == 200;
    }
}
