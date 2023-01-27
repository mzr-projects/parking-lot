package org.example.entities.parking;

import lombok.Getter;
import lombok.Setter;
import org.example.entities.payment.Payment;
import org.example.entities.vehicles.Vehicle;

import java.util.Date;

@Getter
@Setter
public class ParkingTicket extends Payment {

    private int ticketNo;

    private Date date;

    private Date exit;

    private Payment payment;

    private double amount;

    private Vehicle vehicle;

    private Entrance entrance;

    private Exit exitIns;

    @Override
    protected boolean initiateTransaction() {
        return false;
    }
}
