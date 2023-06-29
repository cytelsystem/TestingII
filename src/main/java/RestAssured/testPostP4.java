package RestAssured;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class testPostP4 {

    String URL = "https://parabank.parasoft.com/parabank/services_proxy/bank/transfer?fromAccountId=17340&toAccountId=17673&amount=50000";


    Response response = given().auth()
                    .basic("hectorjm", "1234567")
                    .when()
                    .post(URL);

//********** Punto 4 Descarga de fondos URL: https://parabank.parasoft.com/parabank/services_proxy/bank/transfer?fromAccountId=13566&toAccountId=13677&amount=xxxxx *************//
    @Test
    public void test01() {

        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader("content-type"));
        System.out.println(response.getTime());
    }

}

