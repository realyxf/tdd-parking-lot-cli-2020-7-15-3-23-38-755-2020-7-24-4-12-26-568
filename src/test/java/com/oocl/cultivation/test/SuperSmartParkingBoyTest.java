package com.oocl.cultivation.test;

import com.oocl.cultivation.SuperSmartParkingBoy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SuperSmartParkingBoyTest {

    @Test
    void should_return_larger_available_position_rate_when_parking_given_car() {
        //given
        String carId1 = "C001";
        String carId2 = "C002";
        String carId3 = "C003";
        SuperSmartParkingBoy superSmartParkingBoy = new SuperSmartParkingBoy();

        //when
        String result = superSmartParkingBoy.parking(carId1).getParkLotId();
        result = superSmartParkingBoy.parking(carId2).getParkLotId();
        result = superSmartParkingBoy.parking(carId3).getParkLotId();

        //then
        assertEquals("P3",result);
    }
}
