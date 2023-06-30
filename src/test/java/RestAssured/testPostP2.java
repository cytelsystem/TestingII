package RestAssured;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;

public class testPostP2 {

    String URL = "https://parabank.parasoft.com/parabank/services_proxy/bank/createAccount?customerId=13655&newAccountType=0&fromAccountId=15342";


    Response response = given().auth()
                    .basic("hectorjm", "1234567")
                    .when()
                    .post(URL);

//********** Punto 2 Abrir una nueva cuenta URL: https://parabank.parasoft.com/parabank/services_proxy/bank/createAccount?customerId=12545&newAccountType=1&fromAccountId=xxxxx *************//
    @Test
    public void test01() {

        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader("content-type"));
        System.out.println(response.getTime());
    }

}

