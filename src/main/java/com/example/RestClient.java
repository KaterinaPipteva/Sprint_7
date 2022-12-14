package com.example;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class RestClient {
    private static final String BASE_URL = "http://qa-scooter.praktikum-services.ru/";


    public RequestSpecification getBaseSpec(){
        return given()
                .baseUri(BASE_URL)
                .contentType(ContentType.JSON);
    }
}
