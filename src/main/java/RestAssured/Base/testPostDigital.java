package RestAssured.Base;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class testPostDigital {
    @Test
    public void Test01() {
        JSONObject request = new JSONObject();


        request.put("nombre", "hector");
        request.put("apellido", "moreno");
        request.put("email", "hectorjaviermorenohr@gmail.com");
        request.put("contrasena", "1234567");


        System.out.println(request.toJSONString());

        given().
                log().all().contentType(ContentType.JSON).
                body(request.toJSONString()).
                when().
                post("http://testing.ctd.academy:8000/auth/nuevoUsuario").
                then().
                statusCode(200).log().all();
    }
}