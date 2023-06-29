package RestAssured;

import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

public class testGetP1 {

    String URL = "https://parabank.parasoft.com/parabank/register.htm";
    Response response = get(URL);


//********** Punto 1 Registro URL: https://parabank.parasoft.com/parabank/register.htm *************//
    @Test
    public void test01() {

        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader("content-type"));
        System.out.println(response.getTime());
    }

}