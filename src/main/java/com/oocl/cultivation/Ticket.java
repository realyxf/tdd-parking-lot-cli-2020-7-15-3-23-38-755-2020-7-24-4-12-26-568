package com.oocl.cultivation;

public class Ticket {
    private String ticketId;
    private String carId;

    public String getTicketId() {
        return ticketId;
    }

    public Ticket(String ticketId, String carId) {
        this.ticketId = ticketId;
        this.carId = carId;
    }
}
