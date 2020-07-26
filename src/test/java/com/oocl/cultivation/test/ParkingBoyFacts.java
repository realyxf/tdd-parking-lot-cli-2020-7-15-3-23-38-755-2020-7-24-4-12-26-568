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
        Ticket wrongTicket = new Ticket("T123","C123", "P1",false);
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
        String carId12 = "C012";
        String carId13 = "C013";
        String carId14 = "C014";
        String carId15 = "C015";
        String carId16 = "C016";
        String carId17 = "C017";
        String carId18 = "C018";
        String carId19 = "C019";
        String carId20 = "C020";
        String carId21 = "C021";
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
        result = parkingBoy.parking(carId12);
        result = parkingBoy.parking(carId13);
        result = parkingBoy.parking(carId14);
        result = parkingBoy.parking(carId15);
        result = parkingBoy.parking(carId16);
        result = parkingBoy.parking(carId17);
        result = parkingBoy.parking(carId18);
        result = parkingBoy.parking(carId19);
        result = parkingBoy.parking(carId20);
        result = parkingBoy.parking(carId21);

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
        Ticket wrongTicket = new Ticket("T123","C123","P1",false);
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

    @Test
    void should_return_not_enough_position_when_parking_given_car() {
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
        parkingBoy.parking(carId1);
        parkingBoy.parking(carId2);
        parkingBoy.parking(carId3);
        parkingBoy.parking(carId4);
        parkingBoy.parking(carId5);
        parkingBoy.parking(carId6);
        parkingBoy.parking(carId7);
        parkingBoy.parking(carId8);
        parkingBoy.parking(carId9);
        parkingBoy.parking(carId10);
        parkingBoy.parking(carId11);

        //then
        assertEquals("Not enough position.",systemOut());
    }

    @Test
    void return_second_parklog_when_first_parkinglog_enough_given_more_than_capacity_car(){
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
        String result = parkingBoy.parking(carId1).getParkLotId();
        result = parkingBoy.parking(carId2).getParkLotId();
        result = parkingBoy.parking(carId3).getParkLotId();
        result = parkingBoy.parking(carId4).getParkLotId();
        result = parkingBoy.parking(carId5).getParkLotId();
        result = parkingBoy.parking(carId6).getParkLotId();
        result = parkingBoy.parking(carId7).getParkLotId();
        result = parkingBoy.parking(carId8).getParkLotId();
        result = parkingBoy.parking(carId9).getParkLotId();
        result = parkingBoy.parking(carId10).getParkLotId();
        result = parkingBoy.parking(carId11).getParkLotId();

        //then
        assertEquals("P2",result);
    }

}
