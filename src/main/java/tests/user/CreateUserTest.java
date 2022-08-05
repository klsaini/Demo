package tests.user;

import com.google.gson.Gson;
import dataproviders.customer.UserDataProvider;
import factories.user.UserFactory;
import helpers.user.CreateUserHelper;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojos.user.Users;
import utils.common.BaseTest;
import utils.logger.ILogger;
import validators.user.UserValidator;

public class CreateUserTest extends BaseTest implements ILogger {

    @Test(testName = "Create User",
            dataProvider = "userData",
            dataProviderClass = UserDataProvider.class)
    public void createUserTest(String name, String job) {
        Response response = new CreateUserHelper().createUser(new UserFactory().createUser(name,job));
       new UserValidator().ValidateResponse(response);
        Users createdUser = new Gson().fromJson(response.body().asString(), Users.class);
        LOG.info("create user data");
    }

}
