package stepdefinitions;

import Util.SampleUserResources;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class SampleRestSD {
    RequestSpecification sampleRequest;
    RequestSpecification request;
    Response response;
    ResponseSpecification sampleResponse;

    String respStr;
    @Given("List user payload is created")
    public void list_user_payload_is_created() {

         sampleRequest = new RequestSpecBuilder()
                .setBaseUri("https://reqres.in/")
                .setContentType("application/json")
                .build();

        request = given().log().all()
                .spec(sampleRequest)
                .queryParam("page", "2");

    }
    @When("user calls ListUser request with GET http call")
    public void user_calls_list_user_request_with_get_http_call() {
         response = request.when().get("/api/users");
    }
    @Then("API call got success with status code {int}")
    public void api_call_got_success_with_status_code(Integer statusCode) {

         sampleResponse = new ResponseSpecBuilder()
                 .expectStatusCode(statusCode).build();


        respStr = response.then().log().all().spec(sampleResponse).extract().asString();

    //    System.out.println(respStr);


    }

    @Given("create user payload is created")
    public void createUserPayloadIsCreated() {

        sampleRequest = new RequestSpecBuilder()
                .setBaseUri("https://reqres.in/")
                .setContentType("application/json")
                .build();

        request = given().log().all()
                .spec(sampleRequest)
                .body("{\n" +
                        "    \"name\": \"Amol\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}");


    }

    @When("user calls createUser request with POST http call")
    public void userCallsCreateUserRequestWithPOSTHttpCall() {

       response =  request.when().post("/api/users");
    }

    @Given("update user payload is created")
    public void updateUserPayloadIsCreated() {
        sampleRequest = new RequestSpecBuilder()
                .setBaseUri("https://reqres.in/")
                .setContentType("application/json")
                .build();

        request = given().log().all()
                .spec(sampleRequest)
                .body("{\n" +
                        "    \"name\": \"Amol\",\n" +
                        "    \"job\": \"Test Lead\"\n" +
                        "}");
    }

    @When("user calls updateUser request with PUT http call")
    public void userCallsUpdateUserRequestWithPUTHttpCall() {

        response =  request.when().put("/api/users/2");
    }

    @Given("delete user payload is created")
    public void deleteUserPayloadIsCreated() {
        sampleRequest = new RequestSpecBuilder()
                .setBaseUri("https://reqres.in/")
                .setContentType("application/json")
                .build();

        request = given().log().all()
                .spec(sampleRequest);
    }

    @When("user calls deleteUser request with delete http call")
    public void userCallsDeleteUserRequestWithDeleteHttpCall() {

        response =  request.when().delete("/api/users/2");
    }

    @Then("{string} should be {string}")
    public void shouldBe(String nodePath, String expectedValue) {

        JsonPath jsonPath = new JsonPath(respStr);
        Object actualValue = jsonPath.get(nodePath);

        Assert.assertEquals(actualValue.toString(),expectedValue);
    }

    @When("user calls {string} request with {string} http call")
    public void userCallsRequestWithHttpCall(String requestType, String method) {

        SampleUserResources path = SampleUserResources.valueOf(requestType);
        String resoursePath = path.getResource();

        switch (method)
        {
            case "GET" : response = request.when().get(resoursePath); break;
            case "POST" : response = request.when().post(resoursePath); break;
            case "PUT" : response = request.when().put(resoursePath); break;
            case "DELETE" : response = request.when().delete(resoursePath); break;
            default:
                System.out.println("Wrong method/ method not available");
                break;

        }

      /*  switch (method)
        {
            case "GET" : response = request.when().get("/api/users"); break;
            case "POST" : response = request.when().post("/api/users"); break;
            case "PUT" : response = request.when().put("/api/users/2"); break;
            case "DELETE" : response = request.when().delete("/api/2"); break;
            default:
                System.out.println("Wrong method/ method not available");
                break;

        }*/



    }

    @Given("Get Single user payload is created")
    public void getSingleUserPayloadIsCreated() {


        sampleRequest = new RequestSpecBuilder()
                .setBaseUri("https://reqres.in/")
                .setContentType("application/json")
                .build();

        request = given().log().all()
                .spec(sampleRequest);

    }
}
