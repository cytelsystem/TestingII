package RestAssured;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class testPost {
    @Test
    public void Test01() {
        JSONObject request = new JSONObject();

        request.put("email", "eve.holt@reqres.in");
        request.put("password", "pistol");

        System.out.println(request.toJSONString());

                given().
                log().all().contentType(ContentType.JSON).
                body(request.toJSONString()).
                when().
                post("https://reqres.in/api/register").
                then().
                statusCode(200).log().all();
    }
}