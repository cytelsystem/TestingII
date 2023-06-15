package com.juancazz.restassuredgoogle.restassure;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

public class UsersTest {

    String host = "https://fakestoreapi.com";

    @Test
    public void getAllShouldReturn10Users() {
        String users = String.format("%s/users", host);
        Response response = RestAssured.get(users);
        response.then().assertThat().body("size()", equalTo(10));
    }

    @Test
    public void createNewUserShouldReturn201() {
        ObjectMapper objectMapper = new ObjectMapper();
    }

    @RepeatedTest(4)
    public void createNewUserShouldReturn201Other() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Faker faker = new Faker();
        String name = faker.name().fullName();
        String job = faker.job().position();
        class User {
            public String name;
            public String job;

            public User(String name, String job) {
                this.name = name;
                this.job = job;
            }
        }
        String bodyObject = objectMapper.writeValueAsString(new User(name, job));
        System.out.println(bodyObject);
        /*
        {
    "name": "morpheus",
    "job": "leader",
    "id": "546",
    "createdAt": "2023-06-15T03:26:26.582Z"
}
         */
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "user");
        jsonObject.put("job", "leader");
        String body = jsonObject.toJSONString();
        String user = "https://reqres.in/api/users";

        RestAssured
                .given()
                .body(bodyObject)
                .when().put(user)
                .andReturn()
                .then()
                .assertThat()
                .statusCode(201);
    }

}
