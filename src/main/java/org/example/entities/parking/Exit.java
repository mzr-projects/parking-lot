package org.example.entities.parking;

import lombok.Data;

@Data
public class Exit extends ParkingTicket {

    private int id;

    private ParkingTicket parkingTicket;

    public void validateTicket(ParkingTicket parkingTicket) {

    }
}
