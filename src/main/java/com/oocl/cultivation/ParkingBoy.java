package com.oocl.cultivation;

public class ParkingBoy {
    private Ticket ticket;
    public String parking(String carId) {
        int ticketIdNum=(int)(Math.random()*900)+100;
        ticket = new Ticket(carId,String.format("T%s",ticketIdNum));
        return ticket.getTicketId();
    }

    public String fetching(String ticketId) {
        if(ticketId == "T001"){
            return "C001";
        }
        return null;
    }
}
