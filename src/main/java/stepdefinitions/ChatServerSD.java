package stepdefinitions;

import Util.ChatServerResource;
import Util.POJO.chatServer.CreateUserPayLoadPOJO;
import Util.POJO.chatServer.CreateUserResponsePOJO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.Assert;

import java.io.IOException;
import java.util.Arrays;

import static Util.ChatSeverSpecBuilder.getRequestSpecBuilder;
import static Util.payload.chatServer.ChatServerPayLoad.getCreateUserObj;
import static io.restassured.RestAssured.given;

public class ChatServerSD {

    RequestSpecification request;
    Response response;
    String respStr ;

    CreateUserResponsePOJO respObj;

    @Given("create user payload is created for Chat server")
    public void create_user_payload_is_created_for_chat_server() throws IOException {

      /*  PreemptiveBasicAuthScheme auth = new PreemptiveBasicAuthScheme();
        auth.setUserName("admin");
        auth.setPassword("admin123");

        RequestSpecification reqSpec = new RequestSpecBuilder()
                .setBaseUri("http://localhost:80/chat/lhc_web/index.php/site_admin")
                .setAuth(auth)
                .setContentType("application/json")
                .build();*/

        /* request = given().log().all().spec(reqSpec).body("{\n" +
                "  \"username\": \"mayur4323\",\n" +
                "  \"password\": \"m1234\",\n" +
                "  \"email\": \"mayur@example.org\",\n" +
                "  \"name\": \"mayur\",\n" +
                "  \"surname\": \"avhad\",\n" +
                "  \"chat_nickname\": \"MA\",\n" +
                "  \"departments\": [\n" +
                "    1,\n" +
                "    2\n" +
                "  ],\n" +
                "  \"departments_read\": [\n" +
                "    2\n" +
                "  ],\n" +
                "  \"department_groups\": [\n" +
                "    1\n" +
                "  ],\n" +
                "  \"user_groups\": [\n" +
                "    1\n" +
                "  ]\n" +
                "}");*/

      /*  // Creating an instance of CreateUserPayLoadPOJO
        CreateUserPayLoadPOJO user = new CreateUserPayLoadPOJO();

        // Setting real-time data
        user.setUsername("john_doe");
        user.setPassword("SecurePassword123");
        user.setEmail("john.doe@example.com");
        user.setName("John");
        user.setSurname("Doe");
        user.setChat_nickname("Johnny");

        // Setting department IDs
        user.setDepartments(Arrays.asList(1,2));

        // Setting read-only department IDs
        user.setDepartments_read(Arrays.asList(2));

        // Setting department group IDs
        user.setDepartment_groups(Arrays.asList(1));

        // Setting user group IDs
        user.setUser_groups(Arrays.asList(1));

        request = given().log().all().spec(reqSpec).body(user);

        */


    //    request = given().log().all().spec(reqSpec).body(getCreateUserObj());

        request = given().log().all().spec(getRequestSpecBuilder())
                .body(getCreateUserObj("sjohn1234"
                        ,"john1234","john@gmail.com"
                        ,"john","xyz","j1234"));

    }
    @When("user calls createUser request with POST http call for Chat server")
    public void user_calls_create_user_request_with_post_http_call_for_chat_server() {

         response = request.when().post("/restapi/user");

    }
    @Then("for Chat server API call got success with status code {int}")
    public void for_chat_server_api_call_got_success_with_status_code(Integer statusCode) {

        ResponseSpecification respSpec = new ResponseSpecBuilder()
                .expectStatusCode(statusCode).build();

         respStr = response.then().log().all().spec(respSpec).extract().asString();
       //  respObj = response.then().log().all().spec(respSpec).extract().as(CreateUserResponsePOJO.class);

    }
    @Then("Chat server {string} should be {string}")
    public void chat_server_should_be(String nodePath, String expectedValue)
    {
        JsonPath jsonPath = new JsonPath(respStr);

        Object actualValue = jsonPath.get(nodePath);

        Assert.assertEquals(actualValue.toString(),expectedValue);



    }

    @Given("create user payload is created with {} ,{} , {} , {} ,{} ,{}")
    public void createUserPayloadIsCreatedWith(String username,String password,String email,String name,String surname,String nickName) throws IOException {

      /*  PreemptiveBasicAuthScheme auth = new PreemptiveBasicAuthScheme();
        auth.setUserName("admin");
        auth.setPassword("admin123");

        RequestSpecification reqSpec = new RequestSpecBuilder()
                .setBaseUri("http://localhost:80/chat/lhc_web/index.php/site_admin")
                .setAuth(auth)
                .setContentType("application/json")
                .build();*/

        request = given().log().all().spec(getRequestSpecBuilder())
                .body(getCreateUserObj(username,password,email,name,surname,nickName));


    }

    @Given("Update user payload is created for Chat server")
    public void updateUserPayloadIsCreatedForChatServer() throws IOException {

        request = given().log().all().spec(getRequestSpecBuilder())
                .body(getCreateUserObj("amolujagare1234"
                        ,"aaaa1234","amol@gmail.com"
                        ,"A2222","U3333","au1234"));
    }

    @When("user calls {string} request with {string} http call for Chat server")
    public void userCallsRequestWithHttpCallForChatServer(String requestType, String method) {

        ChatServerResource path = ChatServerResource.valueOf(requestType);


        switch (method)
        {
            case "GET" : response = request.when().get(path.getResource()); break;
            case "POST" : response = request.when().post(path.getResource()); break;
            case "PUT" : response = request.when().put(path.getResource()); break;
            case "DELETE" : response = request.when().delete(path.getResource()); break;
            default:
                System.out.println("Wrong method/ method not available");
                break;

        }
    }
}
