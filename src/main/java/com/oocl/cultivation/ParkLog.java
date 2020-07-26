package com.oocl.cultivation;

import java.util.HashSet;
import java.util.Set;

public class ParkLog {
    Set<String> carIdSet = new HashSet<>();
    private String parkLotId;
    private int capacity;
    private int maxCapacity;

    public ParkLog(String parkLotId, int maxCapacity) {
        this.parkLotId = parkLotId;
        this.capacity = maxCapacity;
        this.maxCapacity = maxCapacity;
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

    public int getMaxCapacity() {
        return maxCapacity;
    }
}
