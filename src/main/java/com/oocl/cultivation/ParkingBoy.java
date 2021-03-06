package com.oocl.cultivation;

public class ParkingBoy {
    protected ParkLog parklot1;
    protected ParkLog parklot2;

    public ParkingBoy() {
        parklot1 = new ParkLog("P1", 10);
        parklot2 = new ParkLog("P2", 10);
    }

    public Ticket parking(String carId) {

        if (parklot1.getCapacity() > 0) {
            int ticketIdNum = (int) (Math.random() * 900) + 100;
            Ticket ticket = new Ticket(String.format("T%s", ticketIdNum), carId, "P1", false);
            parklot1.addCarIdToLot(carId);
            return ticket;
        }

        if (parklot1.getCapacity() == 0) {
            System.out.print("Not enough position.");

            if (parklot2.getCapacity() > 0) {
                int ticketIdNum = (int) (Math.random() * 900) + 100;
                Ticket ticket = new Ticket(String.format("T%s", ticketIdNum), carId, "P2", false);
                parklot2.addCarIdToLot(carId);
                return ticket;
            }

            return null;
        }
        return null;
    }

    public String fetching(Ticket ticket) {

        if (ticket == null) {
            System.out.println("Please provide your parking ticket.");
            return null;
        }

        if (ticket.isUsed() == true) {
            System.out.print("Unrecognized parking ticket.");
            return null;
        }

        if (!parklot1.carIdSet.contains(ticket.getCarId())) {
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
