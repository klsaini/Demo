package helpers.user;

import com.aventstack.extentreports.Status;
import configs.endpoints.customer.CustomerEndPoint;
import io.restassured.response.Response;
import pojos.user.Users;
import utils.common.RestUtil;
import utils.config.Config;
import utils.logger.ILogger;
import utils.reporting.ExtentTestManager;

public class CreateUserHelper implements ILogger {

    public Response createUser(Users user) {
        String baseUrl = Config.getBaseUrl()+ CustomerEndPoint.CREATE_USER.getApiPath();

        ExtentTestManager.getTest().log(Status.INFO, "create user: " + baseUrl);
        LOG.info("");
        return RestUtil.execute(user, baseUrl, "POST");
    }
}
