package org.example.entities.vehicles;

import org.example.entities.parking.ParkingTicket;

public abstract class Vehicle extends ParkingTicket {

    protected String licencePlate;

    public abstract void assignTicket(ParkingTicket parkingTicket);
}
