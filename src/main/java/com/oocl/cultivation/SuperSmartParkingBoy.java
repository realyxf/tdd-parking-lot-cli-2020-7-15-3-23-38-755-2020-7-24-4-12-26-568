package com.oocl.cultivation;

public class SuperSmartParkingBoy extends SmartParkingBoy {

    protected ParkLog parklot3;

    public SuperSmartParkingBoy() {
        super();
        parklot3 = new ParkLog("P3",5);
    }

    @Override
    public Ticket parking(String carId) {
        double parkLot1AvailablePositionRate = (parklot1.getCapacity() / parklot1.getMaxCapacity());
        double parkLot2AvailablePositionRate = (parklot2.getCapacity() / parklot2.getMaxCapacity());
        double parkLot3AvailablePositionRate = (parklot3.getCapacity() / parklot3.getMaxCapacity());

        if(parkLot1AvailablePositionRate >= parkLot2AvailablePositionRate && parkLot1AvailablePositionRate >= parkLot3AvailablePositionRate ){
            int ticketIdNum = (int) (Math.random() * 900) + 100;
            Ticket ticket = new Ticket(String.format("T%s", ticketIdNum), carId, "P1", false);
            parklot1.addCarIdToLot(carId);
            return ticket;
        }
        else if(parkLot2AvailablePositionRate >= parkLot3AvailablePositionRate){
            int ticketIdNum = (int) (Math.random() * 900) + 100;
            Ticket ticket = new Ticket(String.format("T%s", ticketIdNum), carId, "P2", false);
            parklot2.addCarIdToLot(carId);
            return ticket;
        }
        else{
            int ticketIdNum = (int) (Math.random() * 900) + 100;
            Ticket ticket = new Ticket(String.format("T%s", ticketIdNum), carId, "P3", false);
            parklot3.addCarIdToLot(carId);
            return ticket;
        }
    }
}
