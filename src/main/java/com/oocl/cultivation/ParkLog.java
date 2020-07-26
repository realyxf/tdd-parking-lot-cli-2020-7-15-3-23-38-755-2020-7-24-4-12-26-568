package com.oocl.cultivation;

import java.util.HashSet;
import java.util.Set;

public class ParkLog {
    Set<String> carIdSet = new HashSet<>();
    private String parkLotId;
    private int capacity = 10;

    public ParkLog(String getParkLotId) {
        this.parkLotId = getParkLotId;
    }

    public void addCarIdToLot(String carId) {
        carIdSet.add(carId);
        this.capacity--;
    }

    public String getParkLotId() {
        return parkLotId;
    }

    public int getCapacity() {
        return capacity;
    }
}
