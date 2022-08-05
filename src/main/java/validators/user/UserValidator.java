package validators.user;

import io.restassured.response.Response;
import org.testng.Assert;

public class UserValidator {
    /**
     *
     * @param response
     */
    public void ValidateResponse(Response response) {
        Assert.assertEquals(response.getStatusCode(),
                201,
                "Expected status code is different");
    }
}
