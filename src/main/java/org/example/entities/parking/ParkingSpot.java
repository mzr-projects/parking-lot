package org.example.entities.parking;

import org.example.entities.vehicles.Vehicle;

public abstract class ParkingSpot {

    protected int id;
    protected boolean isFree;
    private Vehicle vehicle;

    public boolean isFree() {
        return isFree;
    }

    protected abstract boolean assignVehicle(Vehicle vehicle);

    protected abstract boolean removeVehicle();
}
