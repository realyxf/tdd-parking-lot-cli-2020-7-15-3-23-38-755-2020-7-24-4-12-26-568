package com.oocl.cultivation.test;

import com.oocl.cultivation.ParkingBoy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParkingBoyFacts {
    @Test
    void should_return_ticket_when_parking_given_car() {
        //given
        String ticketId = "T001";
        String carId = "C001";
//        Ticket ticket = new Ticket(ticketId);
//        Car car = new Car(carId);
        ParkingBoy parkingBoy = new ParkingBoy();

        //when
        String result = parkingBoy.parking(carId);

        //then
        assertEquals(ticketId,result);
    }
}
