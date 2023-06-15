package RestAssured;

import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

public class testGet2 {
    String URL = "https://reqres.in/api/users?page=2";
    Response response = get(URL);

    @Test
    public void Test01() {

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

        response.then().statusCode(200).assertThat()
                .body("data[0].id", equalTo(7),
                        "data[0].first_name",equalTo("Michael"));
    }
    @Test
    public void test04() {

        response.then().statusCode(200).assertThat()
                .body("data.first_name",hasItems("Michael","Lindsay"));
    }
}