package com.oocl.cultivation.test;

import com.oocl.cultivation.ParkingBoy;
import com.oocl.cultivation.Ticket;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ParkingBoyFacts {

    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

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

    @Test
    void should_return_null_when_fetching_given_wrong_ticket() {
        //given
        String carId = "C001";
        ParkingBoy parkingBoy = new ParkingBoy();
        Ticket ticket = parkingBoy.parking(carId);
        Ticket wrongTicket = new Ticket("T123","C123",false);
        //when
        String result = parkingBoy.fetching(wrongTicket);

        //then
        assertEquals(null,result);
    }

    @Test
    void should_return_null_when_fetching_given_used_ticket() {
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

    @Test
    void should_return_null_when_parking_given_ticket_with_more_than_capacity() {
        //given
        String carId1 = "C001";
        String carId2 = "C002";
        String carId3 = "C003";
        String carId4 = "C004";
        String carId5 = "C005";
        String carId6 = "C006";
        String carId7 = "C007";
        String carId8 = "C008";
        String carId9 = "C009";
        String carId10 = "C010";
        String carId11 = "C011";
        ParkingBoy parkingBoy = new ParkingBoy();

        //when
        Ticket result = parkingBoy.parking(carId1);
        result = parkingBoy.parking(carId2);
        result = parkingBoy.parking(carId3);
        result = parkingBoy.parking(carId4);
        result = parkingBoy.parking(carId5);
        result = parkingBoy.parking(carId6);
        result = parkingBoy.parking(carId7);
        result = parkingBoy.parking(carId8);
        result = parkingBoy.parking(carId9);
        result = parkingBoy.parking(carId10);
        result = parkingBoy.parking(carId11);

        //then
        assertEquals(null,result);
    }

    private String systemOut() {
        return outContent.toString();
    }

    @Test
    void should_return_unrecognized_parking_ticket_when_parking_given_wrong_ticket() {
        //given
        String carId = "C001";
        ParkingBoy parkingBoy = new ParkingBoy();
        Ticket ticket = parkingBoy.parking(carId);
        Ticket wrongTicket = new Ticket("T123","C123",false);
        //when
        String result = parkingBoy.fetching(wrongTicket);

        //then
        assertEquals("Unrecognized parking ticket.",systemOut());
    }

    @Test
    void should_return_please_provide_your_parking_ticket_when_fetching_given_null_ticket() {
        //given
        String carId = "C001";
        ParkingBoy parkingBoy = new ParkingBoy();
        //when
        parkingBoy.fetching();

        //then
        assertEquals("Please provide your parking ticket.",systemOut());
    }

}
