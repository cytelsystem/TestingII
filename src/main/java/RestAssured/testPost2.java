package RestAssured;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class testPost2 {
    @Test
    public void Test01() {
        JSONObject request = new JSONObject();

        request.put("name", "morpheus");
        request.put("job", "leader");

        System.out.println(request.toJSONString());

        given().
                log().all().contentType(ContentType.JSON).
                body(request.toJSONString()).
                when().
                post("https://reqres.in/api/users").
                then().
                statusCode(201).log().all();
    }
}