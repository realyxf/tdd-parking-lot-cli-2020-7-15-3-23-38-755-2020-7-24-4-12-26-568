package com.oocl.cultivation.test;

import com.oocl.cultivation.SmartParkingBoy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmartParkingBoyTest {

    @Test
    void should_return_more_capacity_lot_when_parking_given_car() {
        //given
        String carId = "C001";
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy();

        //when
        String result = smartParkingBoy.parking(carId).getParkLotId();

        //then
        assertEquals("P2",result);
    }
}
