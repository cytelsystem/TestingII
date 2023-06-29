package RestAssured.Base;


import org.junit.Test;
import static io.restassured.RestAssured.*;

public class testDelete {
    @Test
    public void Test01() {

        when().
                delete("https://reqres.in/api/users/2").
                then().
                statusCode(204);

    }
}