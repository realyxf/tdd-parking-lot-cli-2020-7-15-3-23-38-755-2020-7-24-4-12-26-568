package com.oocl.cultivation;

public class SmartParkingBoy extends ParkingBoy {

    public SmartParkingBoy() {
        super();
    }

    @Override
    public Ticket parking(String carId) {
        if (parklot1.getCapacity() >= parklot2.getCapacity()) {
            int ticketIdNum = (int) (Math.random() * 900) + 100;
            Ticket ticket = new Ticket(String.format("T%s", ticketIdNum), carId, "P1", false);
            parklot1.addCarIdToLot(carId);
            return ticket;
        }
        if (parklot1.getCapacity() < parklot2.getCapacity()) {
            int ticketIdNum = (int) (Math.random() * 900) + 100;
            Ticket ticket = new Ticket(String.format("T%s", ticketIdNum), carId, "P2", false);
            parklot2.addCarIdToLot(carId);
            return ticket;
        }
        return null;
    }


}
