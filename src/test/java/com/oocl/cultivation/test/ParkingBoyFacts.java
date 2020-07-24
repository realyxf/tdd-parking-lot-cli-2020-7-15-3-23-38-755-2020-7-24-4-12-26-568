package com.oocl.cultivation.test;

import com.oocl.cultivation.ParkingBoy;
import com.oocl.cultivation.Ticket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ParkingBoyFacts {
    @Test
    void should_return_ticket_when_parking_given_car() {
        //given
        String carId = "C001";

        ParkingBoy parkingBoy = new ParkingBoy();

        //when
        Ticket result = parkingBoy.parking(carId);

        //then
        assertNotNull(result);
    }

    @Test
    void should_return_car_when_fetching_given_ticket() {
        //given
        String carId = "C001";
        ParkingBoy parkingBoy = new ParkingBoy();
        Ticket ticket = parkingBoy.parking(carId);

        //when
        String result = parkingBoy.fetching(ticket);

        //then
        assertEquals(carId,result);
    }

    @Test
    void should_return_correct_car_when_fetching_given_ticket() {
        //given
        String carId = "C001";
        ParkingBoy parkingBoy = new ParkingBoy();
        Ticket ticket = parkingBoy.parking(carId);

        //when
        String result = parkingBoy.fetching(ticket);

        //then
        assertEquals(carId,result);
    }

//    @Test
//    void should_return_null_when_fetching_given_wrong_ticket() {
//        //given
//        ParkingBoy parkingBoy = new ParkingBoy();
//        Ticket Ticket = new Ticket();
//
//        //when
//        String result = parkingBoy.fetching(wrongTicket);
//
//        //then
//        assertEquals(null,result);
//    }

    @Test
    void should_return_null_when_fetching_used_ticket() {
        //given
        String carId = "C001";
        ParkingBoy parkingBoy = new ParkingBoy();
        Ticket ticket = parkingBoy.parking(carId);

        //when
        String result = parkingBoy.fetching(ticket);
        result = parkingBoy.fetching(ticket);

        //then
        assertEquals(null,result);
    }
}
