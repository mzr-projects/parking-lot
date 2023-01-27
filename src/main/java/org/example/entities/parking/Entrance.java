package org.example.entities.parking;

import lombok.Data;

@Data
public class Entrance {

    private int id;

    private ParkingTicket parkingTicket;

    public ParkingTicket getTicket() {
        return new ParkingTicket();
    }
}
