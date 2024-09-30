package com.thetestingacademy.base;

import com.thetestingacademy.Modules.PayloadManager;
import com.thetestingacademy.asserts.AssertActions;
import com.thetestingacademy.endpoints.APIConstants;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.apache.http.client.methods.RequestBuilder;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    public RequestSpecification rs;

    public AssertActions aa;
    public PayloadManager pm;
    public JsonPath jp;
    public Response resp;
    public ValidatableResponse vr;

    //Header

    @BeforeTest
    public void setUp()
    {


        aa = new AssertActions();
        pm = new PayloadManager();
        rs = new RequestSpecBuilder()
                .setBaseUri(APIConstants.BASE_URL)
                .addHeader("Content-Type", "application/json")
                .build().log().all();






    }
}
