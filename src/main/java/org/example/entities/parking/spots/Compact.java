package org.example.entities.parking.spots;

import org.example.entities.parking.ParkingSpot;
import org.example.entities.vehicles.Vehicle;

public class Compact extends ParkingSpot {

    public boolean assignVehicle(Vehicle vehicle) {
        return false;
    }

    public boolean removeVehicle() {
        return false;
    }
}
