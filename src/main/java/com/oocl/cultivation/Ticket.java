package com.oocl.cultivation;

public class Ticket {
    private String ticketId;
    private String carId;
    private boolean isUsed;

    public String getTicketId() {
        return ticketId;
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

    public Ticket() {
    }

    public Ticket(String ticketId, String carId, boolean isUsed) {
        this.ticketId = ticketId;
        this.carId = carId;
        this.isUsed = isUsed;
    }
}
