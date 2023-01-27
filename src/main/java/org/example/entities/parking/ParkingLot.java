package org.example.entities.parking;

import org.example.entities.vehicles.Vehicle;

import java.util.HashMap;
import java.util.Map;

/*
 * This must be a singleton because there is only a single Parking-Lot System
 * */
public class ParkingLot {

    private ParkingLot() {

    }

    private static final class ParkingLotHolder {
        private static final ParkingLot INSTANCE = new ParkingLot();
    }

    public static ParkingLot getInstance() {
        return ParkingLotHolder.INSTANCE;
    }

    private int id;

    private String name;

    private Address address;

    private final Map<String, Entrance> entrance = new HashMap<>();

    private final Map<String, Exit> exit = new HashMap<>();

    private final Map<String, ParkingTicket> ticket = new HashMap<>();

    public boolean addEntrance(Entrance entrance) {
        this.entrance.put(" ", entrance);
        return true;
    }

    public boolean addExit(Exit exit) {
        this.exit.put(" ", exit);
        return true;
    }

    public ParkingTicket getParkingTicket(Vehicle vehicle) {
        return new ParkingTicket();
    }

    public boolean isFull(ParkingSpot parkingSpot) {
        return true;
    }
}
