package utils.common;

import com.aventstack.extentreports.Status;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.reporting.ExtentTestManager;

public class RestUtil {
    public static <T> Response execute(T content, String baseUrl, String methodType) {

        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();

        requestSpecBuilder.setBaseUri(baseUrl);
        requestSpecBuilder.setContentType(ContentType.JSON);
        requestSpecBuilder.setBody(new Gson().toJson(content));

        RequestSpecification requestSpecification = requestSpecBuilder.build();
        return baseRestImpl(requestSpecification, methodType);

    }

    private static Response baseRestImpl(RequestSpecification requestSpecification, String methodType) {
        Response response = null;

        switch (methodType) {
            case "POST":
                response = RestAssured.given().spec(requestSpecification).log().all().post();
                break;
            case "GET":
                response = RestAssured.given().spec(requestSpecification).log().all().get();
                break;

            default:
                throw new RuntimeException("Method type not supported.");
        }

        response.prettyPrint();
        ExtentTestManager.getTest().log(Status.INFO, response.getBody().asPrettyString());
        return response;

    }
}
