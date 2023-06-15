package RestAssured;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class testPut {
    @Test
    public void Test01() {
        JSONObject request = new JSONObject();

        request.put("name", "morpheus");
        request.put("job", "zion resident");

        System.out.println(request.toJSONString());

        given().
                log().all().contentType(ContentType.JSON).
                body(request.toJSONString()).
                when().
                put("https://reqres.in/api/users/2").
                then().
                statusCode(200).log().all();
    }
}