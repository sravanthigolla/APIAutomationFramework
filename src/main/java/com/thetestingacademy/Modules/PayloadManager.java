package com.thetestingacademy.Modules;

import com.github.javafaker.Faker;
import com.google.gson.Gson;
import com.thetestingacademy.pojos.Booking;
import com.thetestingacademy.pojos.BookingDates;
import com.thetestingacademy.pojos.BookingResponse;


public class PayloadManager {
//Serialization
    public static String createBookingPL(){
        Booking b = new Booking();



        b.setFirstname("Jim");
        b.setLastname("Brown");
        b.setTotalprice(111);
        b.setDepositpaid(true);


        BookingDates bd = new BookingDates();
        bd.setCheckin("2018-01-01");
        bd.setCheckout("2019-01-01");

        b.setBookingdates(bd);

        b.setAdditionalneeds("Breakfast");

        System.out.println(b);
        //java object to JSOn string- serialization

        Gson gson = new Gson();
        String payload_create = gson.toJson(b);
        System.out.println(payload_create);



        return payload_create;
    }

//faker used to generate dynamic input
    public String createBookingPLFaker(){
        Booking b = new Booking();
        Faker faker = new Faker();


        b.setFirstname(faker.name().firstName());
        b.setLastname(faker.name().lastName());
        b.setTotalprice(111);
        b.setDepositpaid(true);


        BookingDates bd = new BookingDates();
        bd.setCheckin("2018-01-01");
        bd.setCheckout("2019-01-01");

        b.setBookingdates(bd);

        b.setAdditionalneeds("Breakfast");

        System.out.println(b);
        //java object to JSOn string- serialization

        Gson gson = new Gson();
        String payload_create = gson.toJson(b);
        System.out.println(payload_create);



        return payload_create;
    }

//deserialize
public static BookingResponse bookingResponse(String respstring){
    Gson gson = new Gson();
    BookingResponse br = gson.fromJson(respstring, BookingResponse.class);
    return br;
}


}
