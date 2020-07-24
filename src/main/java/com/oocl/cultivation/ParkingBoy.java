package com.oocl.cultivation;

import java.util.HashSet;
import java.util.Set;

public class ParkingBoy {
    Set<String> parkLotSet = new HashSet<>();

    public Ticket parking(String carId) {
        if (parkLotSet.size() < 10) {
            int ticketIdNum = (int) (Math.random() * 900) + 100;
            Ticket ticket = new Ticket(String.format("T%s", ticketIdNum), carId, false);
            parkLotSet.add(ticket.getCarId());
            return ticket;
        }
        return null;
    }

    public String fetching(Ticket ticket) {
        if(ticket == null){
            System.out.println("Please provide your parking ticket.");
            return null;
        }

        if (ticket.isUsed() == true) {
            System.out.print("Unrecognized parking ticket.");
            return null;
        }

        if(!parkLotSet.contains(ticket.getCarId())){
            System.out.print("Unrecognized parking ticket.");
            return null;
        }

        ticket.setUsed(true);
        return ticket.getCarId();
    }

    public String fetching() {
        System.out.print("Please provide your parking ticket.");
        return null;
    }
}
