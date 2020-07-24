package com.oocl.cultivation.test;

import com.oocl.cultivation.ParkingBoy;
import com.oocl.cultivation.Ticket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParkingBoyFacts {
    @Test
    void should_return_ticket_when_parking_given_car() {
        //given
        String ticketId = "T001";
        String carId = "C001";
        ParkingBoy parkingBoy = new ParkingBoy();

        //when
        String result = parkingBoy.parking(carId);

        //then
        assertEquals(ticketId,result);
    }

    @Test
    void should_return_car_when_fetching_given_ticket() {
        //given
        String ticketId = "T001";
        String carId = "C001";
        ParkingBoy parkingBoy = new ParkingBoy();

        //when
        String result = parkingBoy.fetching(ticketId);

        //then
        assertEquals(carId,result);
    }

    @Test
    void should_return_correct_car_when_fetching_given_ticket() {
        //given
        String ticketId = "T001";
        String carId = "C001";
        ParkingBoy parkingBoy = new ParkingBoy();

        //when
        String result = parkingBoy.fetching(ticketId);

        //then
        assertEquals(carId,result);
    }

    @Test
    void should_return_null_when_fetching_given_wrong_ticket() {
        //given
        String ticketId = "T001";
        String carId = "C001";

        String wrongTicketId = "AS11";
        ParkingBoy parkingBoy = new ParkingBoy();

        //when
        String result = parkingBoy.fetching(wrongTicketId);

        //then
        assertEquals(null,result);
    }
}
