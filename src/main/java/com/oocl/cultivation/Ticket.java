package com.oocl.cultivation;

public class Ticket {
    private String ticketId;
    private String carId;
    private String parkLotId;
    private boolean isUsed;

    public String getTicketId() {
        return ticketId;
    }

    public String getParkLotId() {
        return parkLotId;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public String getCarId() {
        return carId;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    public Ticket(String ticketId, String carId, String parkLotId, boolean isUsed) {
        this.ticketId = ticketId;
        this.carId = carId;
        this.parkLotId = parkLotId;
        this.isUsed = isUsed;
    }
}
