package com.thetestingacademy.asserts;

import io.restassured.response.Response;

import static org.testng.Assert.assertEquals;

public class AssertActions {

public void verifyResponseBody(String actual, String expected, String description)

{
    //testng asserts
    assertEquals(actual, expected, description);


}
//method overloading
    public void verifyResponseBody(int actual, int expected, String description)

    {
        //testng asserts
        assertEquals(actual, expected, description);


    }

    public static void verifyResponseCode(Response resp, Integer expected)
    {
        assertEquals(resp.getStatusCode(), expected);
    }


}
