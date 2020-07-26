package com.oocl.cultivation.test;

import com.oocl.cultivation.SmartParkingBoy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmartParkingBoyTest {

    @Test
    void should_return_more_capacity_lot_when_parking_given_car() {
        //given
        String carId1 = "C001";
        String carId2 = "C002";
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy();

        //when
        String result = smartParkingBoy.parking(carId1).getParkLotId();
        result = smartParkingBoy.parking(carId2).getParkLotId();


        //then
        assertEquals("P2",result);
    }
}
