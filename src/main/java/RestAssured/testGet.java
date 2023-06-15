package RestAssured;

import org.junit.Assert;
import org.junit.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.*;

public class testGet {

    String URL = "http://testing.ctd.academy:8000/api/productos/?categoria=Casa";
    Response response = get(URL);

    @Test
    public void test01() {

        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader("content-type"));
        System.out.println(response.getTime());
    }
    @Test
    public void test02() {

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }
    @Test
    public void test03() {

        response.then().statusCode(200).assertThat().
                body("ciudad[0].pais", equalTo("Argentina"));
    }
    @Test
    public void test04() {

        response.then().statusCode(200).assertThat()
                .body("politicas[0].idPolitica[0]", equalTo(26),
                        "politicas[0].titulo[0]",equalTo("Normas de la casa"));
    }
    @Test
    public void test05(){
        response.then().statusCode(200).assertThat()
                .body("nombre",hasItems("IncreÃ-ble Casa c/ Piscina, WiFi, Bosque y Playa en Carilo"));
    }
}