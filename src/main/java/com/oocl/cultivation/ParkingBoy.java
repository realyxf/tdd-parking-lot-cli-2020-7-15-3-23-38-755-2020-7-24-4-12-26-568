package com.oocl.cultivation;

public class ParkingBoy {
    public Ticket parking(String carId) {
        int ticketIdNum = (int) (Math.random() * 900) + 100;
        Ticket ticket = new Ticket(String.format("T%s", ticketIdNum), carId, false);
        return ticket;
    }

    public String fetching(Ticket ticket) {
        if (ticket.isUsed() == true) {
            return null;
        }
        ticket.setUsed(true);
        return ticket.getCarId();
    }
}
