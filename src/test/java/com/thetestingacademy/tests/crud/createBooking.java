package com.thetestingacademy.tests.crud;

import com.thetestingacademy.Modules.PayloadManager;
import com.thetestingacademy.asserts.AssertActions;
import com.thetestingacademy.base.BaseTest;
import com.thetestingacademy.endpoints.APIConstants;
import com.thetestingacademy.pojos.BookingResponse;
import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.when;
import static org.assertj.core.api.Assertions.assertThat;

public class createBooking extends BaseTest {

    @Description("Verify Booking")

    @Test
    public void Booking()
    {
                rs
                .basePath(APIConstants.Create_Update_Booking_URL);

        resp = RestAssured.given(rs)
                .when().body(PayloadManager.createBookingPL()).post();




        vr = resp.then().log().all();
        vr.statusCode(200);

        BookingResponse br = PayloadManager.bookingResponse(resp.asString());
        assertThat(br.getBooking()).isNotNull();
        assertThat(br.getBooking().getFirstname()).isNotNull().isNotBlank();
        assertThat(br.getBooking().getFirstname()).isEqualTo("Jim");


        AssertActions.verifyResponseCode(resp, 200);

    }
}
