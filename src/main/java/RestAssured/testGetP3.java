package RestAssured;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class testGetP3 {

    String URL = "https://parabank.parasoft.com/parabank/services_proxy/bank/customers/14765/accounts";


    Response response = given().auth()
                    .basic("hectorjm", "1234567")
                    .when()
                    .get(URL);

//********** Punto 3 Resumen de las cuentas URL: https://parabank.parasoft.com/parabank/overview.htm *************//
    @Test
    public void test01() {

        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader("content-type"));
        System.out.println(response.getTime());
    }

}

