package com.oocl.cultivation;

public class ParkingBoy {

    public String parking(String carId) {
        return "T001";
    }

    public String fetching(String ticketId) {
        if(ticketId == "C001"){
            return "C001";
        }
        return null;
    }
}
